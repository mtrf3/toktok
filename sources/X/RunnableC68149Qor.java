package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: X.Qor, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68149Qor implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ C68148Qoq LJLJI;

    public RunnableC68149Qor(C68148Qoq c68148Qoq, String str, Bundle bundle) {
        this.LJLJI = c68148Qoq;
        this.LJLIL = str;
        this.LJLILLLLZI = bundle;
    }

    public final void LIZ() {
        C68083Qnn LJJJI = ((C68241QqL) this.LJLJI.LJLIL).LJJJI();
        String str = this.LJLIL;
        Bundle bundle = this.LJLILLLLZI;
        ((C68241QqL) this.LJLJI.LJLIL).LIZLLL().getClass();
        zzaw LJJLIIIJL = LJJJI.LJJLIIIJL(str, "_err", bundle, "auto", System.currentTimeMillis(), false);
        C68241QqL c68241QqL = (C68241QqL) this.LJLJI.LJLIL;
        QH7.LJIIIIZZ(LJJLIIIJL);
        c68241QqL.LJIIIZ(LJJLIIIJL, this.LJLIL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
