package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tag, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74914Tag {
    GUEST_USER_INFO,
    GUEST_PREVIEW,
    GUEST_STATUS_SETTING;

    public boolean LJLIL = true;
    public String LJLILLLLZI = "";

    public static EnumC74914Tag valueOf(String str) {
        return (EnumC74914Tag) V0N.LJJJ(EnumC74914Tag.class, str);
    }

    public final boolean getGoNextPage() {
        return this.LJLIL;
    }

    public final String getSource() {
        return this.LJLILLLLZI;
    }

    public final void setGoNextPage(boolean z) {
        this.LJLIL = z;
    }

    public final void setSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    EnumC74914Tag() {
    }
}
