package X;

import Y.ACallableS107S0100000_4;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.9T5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9T5 extends AbstractC72439Sbr {
    public final WeakReference<InterfaceC55219Lln> LJLIL;
    public final C173216qz LJLILLLLZI;

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
        this.LJLIL.clear();
    }

    public C9T5(InterfaceC55219Lln interfaceC55219Lln, C173216qz c173216qz) {
        this.LJLIL = new WeakReference<>(interfaceC55219Lln);
        interfaceC55219Lln.getAweme();
        this.LJLILLLLZI = c173216qz;
    }

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        System.currentTimeMillis();
        C10K.LIZIZ(new ACallableS107S0100000_4(this, 14), FMX.LIZIZ(), null);
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.get();
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C56662Kg.LIZ().LJFF("feed_cover_total", false);
        if (this.LJLILLLLZI != null) {
            SystemClock.elapsedRealtime();
        }
        this.LJLIL.get();
    }
}
