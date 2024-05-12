package X;

/* renamed from: X.Vp0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80898Vp0 implements C00P {
    public final /* synthetic */ C80896Voy LIZ;

    public C80898Vp0(C80896Voy c80896Voy) {
        this.LIZ = c80896Voy;
    }

    @Override // X.C00P
    public final void LIZ() {
        InterfaceC80914VpG nestedHeader;
        InterfaceC80914VpG nestedHeader2;
        C80896Voy c80896Voy = this.LIZ;
        c80896Voy.LJLJL = c80896Voy.LL.LIZIZ(c80896Voy.getNestedScrollY());
        InterfaceC80914VpG nestedHeader3 = this.LIZ.getNestedHeader();
        boolean z = true;
        if (nestedHeader3 != null) {
            nestedHeader3.LIZIZ(this.LIZ.getNestedScrollY(), true);
        }
        C80896Voy c80896Voy2 = this.LIZ;
        InterfaceC80923VpP interfaceC80923VpP = c80896Voy2.LJLZ;
        if (interfaceC80923VpP != null) {
            interfaceC80923VpP.LIZ(c80896Voy2.getNestedScrollY(), this.LIZ.LJLJL, true);
        }
        C80896Voy c80896Voy3 = this.LIZ;
        if (c80896Voy3.getNestedScrollY() >= 0) {
            C80896Voy c80896Voy4 = this.LIZ;
            if (c80896Voy4.LJLJJLL && (nestedHeader2 = c80896Voy4.getNestedHeader()) != null) {
                nestedHeader2.LJJJJJL(true);
            }
            z = false;
        } else {
            C80896Voy c80896Voy5 = this.LIZ;
            if (!c80896Voy5.LJLJJLL && (nestedHeader = c80896Voy5.getNestedHeader()) != null) {
                nestedHeader.LJJJJJL(false);
            }
        }
        c80896Voy3.LJLJJLL = z;
        if (this.LIZ.getNestedScrollY() >= (-this.LIZ.getHeaderHeight())) {
            this.LIZ.LJLJJI = false;
        }
    }
}
