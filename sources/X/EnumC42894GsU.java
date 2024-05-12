package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GsU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42894GsU {
    UNKNOWN("Unknown"),
    VIDEO_CLIP("VideoClip"),
    GIF("Gif");

    public static final C42895GsV Companion = new C42895GsV();
    public String LJLIL;

    public static EnumC42894GsU valueOf(String str) {
        return (EnumC42894GsU) V0N.LJJJ(EnumC42894GsU.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    EnumC42894GsU(String str) {
        this.LJLIL = str;
    }
}
