package X;

import android.view.FrameMetrics;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.PRi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64454PRi extends AbstractC06100Lu {
    public static final C64454PRi LJLILLLLZI = new C64454PRi();
    public static final java.util.Set<InterfaceC64455PRj> LJLJI = new LinkedHashSet();
    public static volatile boolean LJLJJI;

    @Override // X.AbstractC06100Lu
    public final void LJIIJ(long j, long j2, String str) {
        Iterator<InterfaceC64455PRj> it = LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIL(String str, FrameMetrics frameMetrics, int i) {
        Iterator<InterfaceC64455PRj> it = LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(frameMetrics);
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        this.LJLIL = false;
        Iterator<InterfaceC64455PRj> it = LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(j, j3, z);
        }
    }
}
