package X;

import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import org.json.JSONObject;

/* renamed from: X.LpX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55451LpX implements InterfaceC55496LqG {
    public final /* synthetic */ C29S LIZ;
    public final /* synthetic */ C55448LpU LIZIZ;

    @Override // X.InterfaceC55496LqG
    public final void LJJIIJZLJL() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            return;
        }
        EU3.LJFF();
    }

    @Override // X.InterfaceC55496LqG
    public final void LJJJJJL() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC55496LqG
    public final Fragment getCurFragment() {
        C55448LpU c55448LpU = this.LIZIZ;
        if (C116694i1.LIZ(c55448LpU.LIZ) == null) {
            return null;
        }
        return C116694i1.LIZ(c55448LpU.LIZ).mv0();
    }

    @Override // X.InterfaceC55496LqG
    public final boolean isNewUser() {
        return C45337Hqn.LIZ(this.LIZ);
    }

    @Override // X.InterfaceC55496LqG
    public final long LJI() {
        return NQL.LJIILL().LJIILLIIL;
    }

    @Override // X.InterfaceC55496LqG
    public final int LJIIIIZZ() {
        return NQL.LJIILL().LJIIIZ + 1;
    }

    @Override // X.InterfaceC55496LqG
    public final void LJJJJJ() {
        ISplashAdService LJJI = SplashAdServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJIIJ(new NW4());
        } else {
            C09900aA.LJIIJJI("splash_depend_init_question", 3, null);
        }
    }

    @Override // X.InterfaceC55496LqG
    public final long getCurrentPosition() {
        return NQL.LJIILL().LJI();
    }

    @Override // X.InterfaceC55496LqG
    public final void LJIJJ(boolean z) {
        long j;
        if (z) {
            C56662Kg.LIZ().LJI = 1;
        }
        FAK LIZ = C56672Kh.LIZ();
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        LIZ.LIZ(j, "is_show_splash");
    }

    public C55451LpX(C55448LpU c55448LpU, C29S c29s) {
        this.LIZIZ = c55448LpU;
        this.LIZ = c29s;
    }

    @Override // X.InterfaceC55496LqG
    public final void LJII(String str, boolean z) {
        if (z) {
            FAJ.LIZ(str, false);
        } else {
            FAJ.LJFF(str, false);
        }
    }

    @Override // X.InterfaceC55496LqG
    public final void LJJIJIL(String str, String str2) {
        if (TextUtils.equals("click", str)) {
            C58740N3o.LJFF(str2);
        }
    }

    @Override // X.InterfaceC55496LqG
    public final void LJJIJLIJ(String str, String str2, JSONObject jSONObject) {
        NN1.LJJJ(str, str2, jSONObject);
    }

    @Override // X.InterfaceC55496LqG
    public final void LJJJJ(C29S c29s, String str, String str2) {
        FFL.LJIIIZ().getClass();
        if (!TextUtils.equals(FFL.LJIILJJIL(31744, "enable_send_staging_adlog", "v3", true), "v1")) {
            NN1.LJJJI(c29s, str, str2);
        }
    }
}
