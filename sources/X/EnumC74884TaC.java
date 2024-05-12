package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TaC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74884TaC {
    GUEST_USER_INFO,
    GUEST_PREVIEW;

    public boolean LJLIL = true;
    public String LJLILLLLZI = "";

    public static EnumC74884TaC valueOf(String str) {
        return (EnumC74884TaC) V0N.LJJJ(EnumC74884TaC.class, str);
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

    EnumC74884TaC() {
    }
}
