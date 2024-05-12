package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EyX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38173EyX implements InterfaceC38178Eyc {
    public final /* synthetic */ C38170EyU LIZ;
    public final /* synthetic */ InterfaceC38177Eyb LIZIZ;

    public C38173EyX(C38170EyU c38170EyU, C37863EtX c37863EtX) {
        this.LIZ = c38170EyU;
        this.LIZIZ = c37863EtX;
    }

    @Override // X.InterfaceC38178Eyc
    public final void LIZ(C38117Exd c38117Exd, int i) {
        if (c38117Exd != null) {
            String str = c38117Exd.LJFF;
            o.LJFF(str, "call.callbackId");
            this.LIZ.getClass();
            if (ujb.o.LJJJLIIL(str, "bridgesdk", false)) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    this.LIZIZ.LIZIZ(EnumC37868Etc.NOT_FOUND);
                    return;
                }
                this.LIZIZ.LIZIZ(EnumC37868Etc.NO_PERMISSION);
            }
        }
    }
}
