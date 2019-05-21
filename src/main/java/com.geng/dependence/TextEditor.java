package com.geng.dependence;

public class TextEditor {
    private SpellChecker spellchecker;
    public TextEditor(SpellChecker spellChecker)
    {
        this.spellchecker = spellChecker;
    }
    public void setSpellcheck()
    {
        spellchecker.checkSpelling();
    }
}
