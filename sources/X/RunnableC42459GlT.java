package X;

import Y.ARunnableS43S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GlT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42459GlT implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ReplaceMusicRequest LJLJJI;
    public final /* synthetic */ LifecycleOwner LJLJJL;

    public RunnableC42459GlT(ActivityC45651qj activityC45651qj, boolean z, String str, ReplaceMusicRequest replaceMusicRequest, LifecycleOwner lifecycleOwner) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = replaceMusicRequest;
        this.LJLJJL = lifecycleOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.GlS] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.GlS] */
    public final void LIZ() {
        if (this.LJLIL.isFinishing()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showWindow: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(' ');
        H78.LIZIZ("ReplaceMusicToolbarScene", X1D.LIZIZ(LIZ));
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new C42458GlS(this.LJLIL, true, this.LJLJI, null);
        if (!this.LJLILLLLZI) {
            if (this.LJLJJI == null) {
                return;
            } else {
                c68322mC.element = new C42458GlS(this.LJLIL, false, this.LJLJI, this.LJLJJI);
            }
        }
        if (this.LJLILLLLZI) {
            new SafeHandler(this.LJLJJL).postDelayed(new ARunnableS43S0100000_7(c68322mC, 58), 4000L);
        }
        C42458GlS c42458GlS = (C42458GlS) c68322mC.element;
        if (c42458GlS.LJLIL.isFinishing()) {
            return;
        }
        PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
        if (C42622Go6.LJIIIZ) {
            return;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LJFF()) {
            if (c42458GlS.LJLILLLLZI) {
                ActivityC45651qj activityC45651qj = c42458GlS.LJLIL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.e06);
                creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
                creativeToastBuilder.iconColorRes(R.attr.e8);
                C78915Uy7.LJJIIZI(activityC45651qj, 3035, creativeToastBuilder);
                return;
            }
            AKH akh = c42458GlS.LJLLILLLL;
            if (akh != null) {
                akh.LIZJ();
            }
            c42458GlS.LJLLJ = true;
            return;
        }
        C81303VvX c81303VvX = c42458GlS.LJLJL;
        if (c81303VvX != null) {
            c81303VvX.LIZIZ();
        }
        try {
            C16880lQ.LLLI(c42458GlS, c42458GlS.LJLIL.getWindow().getDecorView(), -C63081OpJ.LJJJJLI(C5L7.LIZ()));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
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
