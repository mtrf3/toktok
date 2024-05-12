package X;

/* renamed from: X.Vp1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80899Vp1 implements C00P {
    public final /* synthetic */ C80895Vox LIZ;

    public C80899Vp1(C80895Vox c80895Vox) {
        this.LIZ = c80895Vox;
    }

    @Override // X.C00P
    public final void LIZ() {
        InterfaceC80914VpG nestedHeader;
        InterfaceC80914VpG nestedHeader2;
        C80895Vox c80895Vox = this.LIZ;
        c80895Vox.LJLJLJ = c80895Vox.LLF.LIZIZ(c80895Vox.getNestedScrollY());
        InterfaceC80914VpG nestedHeader3 = this.LIZ.getNestedHeader();
        boolean z = true;
        if (nestedHeader3 != null) {
            nestedHeader3.LIZIZ(this.LIZ.getNestedScrollY(), true);
        }
        C80895Vox c80895Vox2 = this.LIZ;
        InterfaceC80921VpN interfaceC80921VpN = c80895Vox2.LJZ;
        if (interfaceC80921VpN != null) {
            interfaceC80921VpN.LIZ(c80895Vox2.getNestedScrollY(), this.LIZ.LJLJLJ, true);
        }
        C80895Vox c80895Vox3 = this.LIZ;
        if (c80895Vox3.getNestedScrollY() >= 0) {
            C80895Vox c80895Vox4 = this.LIZ;
            if (c80895Vox4.LJLJL && (nestedHeader2 = c80895Vox4.getNestedHeader()) != null) {
                nestedHeader2.LJJJJJL(true);
            }
            z = false;
        } else {
            C80895Vox c80895Vox5 = this.LIZ;
            if (!c80895Vox5.LJLJL && (nestedHeader = c80895Vox5.getNestedHeader()) != null) {
                nestedHeader.LJJJJJL(false);
            }
        }
        c80895Vox3.LJLJL = z;
        if (this.LIZ.getNestedScrollY() >= (-this.LIZ.getHeaderHeight())) {
            this.LIZ.LJLJJL = false;
        }
    }
}
