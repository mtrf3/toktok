package X;

import Y.IDuS324S0100000_14;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.WQd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82259WQd implements C5SU {
    public final /* synthetic */ IDuS324S0100000_14 LIZ;
    public final /* synthetic */ InterfaceC73573Su9 LIZIZ;
    public final /* synthetic */ AtomicInteger LIZJ;

    public C82259WQd(IDuS324S0100000_14 iDuS324S0100000_14, C73433Srt c73433Srt, AtomicInteger atomicInteger) {
        this.LIZ = iDuS324S0100000_14;
        this.LIZIZ = c73433Srt;
        this.LIZJ = atomicInteger;
    }

    @Override // X.C5SU
    public final void LIZ(int i, Bitmap bitmap) {
        this.LIZIZ.onNext(new OSZ(Integer.valueOf(i), bitmap));
        if (this.LIZJ.incrementAndGet() == ((C82258WQc) this.LIZ.l0).LJLJJI) {
            this.LIZIZ.onComplete();
        }
    }
}
