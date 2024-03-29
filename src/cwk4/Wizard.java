package cwk4;

public class Wizard extends Champion {
    private String type;
    private boolean isNecromancer;
    private String spellSpeciality;

    public Wizard (String name, int skillLevel, int entryFee, String type, boolean isNecromancer, String spellSpeciality) {
        super(name, skillLevel, entryFee);
        this.isNecromancer = isNecromancer;
        this.spellSpeciality = spellSpeciality;
    }

    /**
     * Returns the type of the Wizard.
     *
     * @return Type of the Wizard.
     */
    public String geType() {
        return type;
    }

    /**
     * Sets the type of the Wizard.
     *
     * @return Sets the type of the Wizard.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Returns whether the Wizard is a Necromancer or not.
     *
     * @return true if the Wizard is a Necromancer, false otherwise.
     */
    public boolean isNecromancer() {
        return isNecromancer;
    }

    /**
     * Sets whether the Wizard is a Necromancer or not.
     *
     * @param necromancer true if the Wizard is a Necromancer, false otherwise.
     */
    public void setNecromancer(boolean necromancer) {
        this.isNecromancer = necromancer;
    }

    /**
     * Returns the spell speciality of the Wizard.
     *
     * @return The spell speciality of the Wizard.
     */
    public String getSpellSpeciality() {
        return spellSpeciality;
    }

    /**
     * Sets the spell speciality of the Wizard.
     *
     * @param spellSpeciality The spell speciality of the Wizard.
     */
    public void setSpellSpeciality(String spellSpeciality) {
        this.spellSpeciality = spellSpeciality;
    }

    /**
     * Returns a string representation of the Wizard object.
     *
     * @return A string containing the name, Skill Level, Entry Fee, Type, Is Necromancer, Spell Speciality of the Wizard.
     */
    @Override
    public String toString() {
        return "Wizard:" +
                ", Name: " + getName() +
                ", Skill Level:" + getSkillLevel() +
                ", Entry fee: " + getEntryFee() +
                ", Type: " + geType() +
                ", Is Necromancer: " + isNecromancer +
                ", Spell Speciality: " + spellSpeciality +
                '}';
    }
}