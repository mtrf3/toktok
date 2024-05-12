package X;

import android.os.Build;
import android.os.Environment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS91S0300000_2;

/* renamed from: X.6bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163426bC {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6aA] */
    public final void LIZ(final C162996aV c162996aV, final C162756a7 c162756a7) {
        ?? r2 = new InterfaceC162796aB() { // from class: X.6aA
            @Override // X.InterfaceC162796aB
            public final void LIZIZ() {
                c162996aV.LIZIZ();
            }

            @Override // X.InterfaceC162796aB
            public final void LIZ(float f) {
                c162996aV.LIZ(f);
            }

            @Override // X.InterfaceC162796aB
            public final void onFinish(boolean z) {
                int i;
                c162996aV.onFinish(z);
                C162756a7 c162756a72 = c162756a7;
                if (c162756a72.LJ) {
                    if (z) {
                        C26045AKb c26045AKb = new C26045AKb(c162756a72.LIZ);
                        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                        c26045AKb.LJII(R.attr.e8);
                        if (c162756a7.LIZJ.hasMusic() && e1.LIZ(31744, "enable_new_now_download_muted_music", true, false)) {
                            i = R.string.e0b;
                        } else {
                            i = R.string.j4r;
                        }
                        c26045AKb.LJIIIIZZ(i);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    C26045AKb c26045AKb2 = new C26045AKb(c162756a72.LIZ);
                    c26045AKb2.LJIIIIZZ(R.string.j45);
                    c26045AKb2.LJIIJ();
                }
            }
        };
        C68322mC c68322mC = new C68322mC();
        C162776a9 c162776a9 = new C162776a9(r2, c162756a7, System.currentTimeMillis(), c68322mC);
        ActivityC45651qj activityC45651qj = c162756a7.LIZ;
        final AqS91S0300000_2 aqS91S0300000_2 = new AqS91S0300000_2(c162776a9, (C162776a9) c162756a7, (C162756a7) c68322mC, (C68322mC<C6ZI>) 12);
        if (C61184Nzo.LIZ.LJFF(activityC45651qj) == 0) {
            aqS91S0300000_2.invoke();
            return;
        }
        int i = activityC45651qj.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || (i != 29 ? i <= 29 : Environment.isExternalStorageLegacy())) {
            HVR.LJII(activityC45651qj, new HPI() { // from class: X.6bD
                @Override // X.HPI
                public final void LIZ(int[] iArr, String[] strArr) {
                    aqS91S0300000_2.invoke();
                }
            }, null, TokenCert.Companion.with("bpea-tools_request_storage_permission_nows_save_local"), 28);
        } else {
            aqS91S0300000_2.invoke();
        }
    }
}
