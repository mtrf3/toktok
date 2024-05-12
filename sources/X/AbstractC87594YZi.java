package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZi, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87594YZi extends AbstractC87600YZo {
    public AbstractC87594YZi(InterfaceC87606YZu interfaceC87606YZu) {
        super(interfaceC87606YZu);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        LIZLLL("setFailed");
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        LIZLLL("setSuccess");
    }
}
