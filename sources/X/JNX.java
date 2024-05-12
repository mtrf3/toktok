package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;

/* loaded from: classes9.dex */
public final class JNX implements InterfaceC49137JQf {
    public final /* synthetic */ JNY LJLIL;

    @Override // X.InterfaceC49137JQf
    public final boolean C() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLIL.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null && searchServiceCenter$AutoPlayAbility.m8() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49137JQf
    public final double LJJJJ() {
        View m8;
        Context LIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLIL.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility == null || (m8 = searchServiceCenter$AutoPlayAbility.m8()) == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        m8.getLocationOnScreen(new int[2]);
        int height = m8.getHeight();
        View view = this.LJLIL.LJLIL;
        if (view == null || (LIZIZ = view.getContext()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        double LJIIIZ = (KL2.LJIIIZ(LIZIZ) - r3[1]) / height;
        if (LJIIIZ > 1.0d) {
            return 1.0d;
        }
        return LJIIIZ;
    }

    public JNX(JNY jny) {
        this.LJLIL = jny;
    }
}
