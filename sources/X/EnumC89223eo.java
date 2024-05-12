package X;

/* renamed from: X.3eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC89223eo {
    WELCOME("welcome_message"),
    SUGGESTED_QN_LIST("suggested_question_list"),
    SUGGESTED_QN_ASK("suggested_question_ask"),
    SUGGESTED_QN_ANS("suggested_question_answer"),
    DEFAULT("");

    public final String LJLIL;

    public static EnumC89223eo valueOf(String str) {
        return (EnumC89223eo) V0N.LJJJ(EnumC89223eo.class, str);
    }

    public final String getLogValue() {
        return this.LJLIL;
    }

    EnumC89223eo(String str) {
        this.LJLIL = str;
    }
}
