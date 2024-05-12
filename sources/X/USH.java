package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class USH {
    public EnumC77147UPn LIZ;
    public boolean LIZIZ;
    public URJ LIZJ;
    public boolean LIZLLL;

    public USH() {
        this(0);
    }

    public USH(int i) {
        EnumC77147UPn authPlatform = EnumC77147UPn.CONTACT;
        URJ needAuthExplain = URJ.DIALOG_ACTUAL_AND_USER;
        o.LJIIIZ(authPlatform, "authPlatform");
        o.LJIIIZ(needAuthExplain, "needAuthExplain");
        this.LIZ = authPlatform;
        this.LIZIZ = true;
        this.LIZJ = needAuthExplain;
        this.LIZLLL = true;
    }

    public final void LIZ(EnumC77147UPn enumC77147UPn) {
        o.LJIIIZ(enumC77147UPn, "<set-?>");
        this.LIZ = enumC77147UPn;
    }

    public final void LIZIZ(URJ urj) {
        o.LJIIIZ(urj, "<set-?>");
        this.LIZJ = urj;
    }
}
