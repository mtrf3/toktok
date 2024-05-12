package X;

import kotlin.jvm.internal.o;

/* renamed from: X.54j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1289754j {
    GENERAL("GENERAL", "general"),
    EDIT("EDIT", "edit"),
    SOUND("SOUND", "sound"),
    SOUND_EFFECT("SOUND_EFFECT", "soundeffect"),
    TEXT("TEXT", "text"),
    EFFECT("EFFECT", "effect"),
    VOICE_OVER("VOICE_OVER", "voiceover"),
    TRANSITION("TRANSITION", "transition"),
    PIP("PIP", "pip"),
    CAPTION("CAPTION", "caption");

    public String LJLIL;
    public int LJLILLLLZI;

    public static EnumC1289754j valueOf(String str) {
        return (EnumC1289754j) V0N.LJJJ(EnumC1289754j.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    public final int getValue() {
        return this.LJLILLLLZI;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setValue(int i) {
        this.LJLILLLLZI = i;
    }

    EnumC1289754j(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
