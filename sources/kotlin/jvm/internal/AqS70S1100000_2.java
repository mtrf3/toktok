package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C121594pv;
import X.C135085Rw;
import X.C135105Ry;
import X.C138075bP;
import X.C153065za;
import X.C153075zb;
import X.C1548165t;
import X.C1548265u;
import X.C16880lQ;
import X.C16970lZ;
import X.C17N;
import X.C58B;
import X.C5OG;
import X.C60903NvH;
import X.C66Y;
import X.C6IA;
import X.C74275TDb;
import X.C76800UCe;
import X.C81184Vtc;
import X.H7I;
import X.InterfaceC65784Pro;
import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS70S1100000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        View findViewById;
        if (((Activity) this.l1).isFinishing() || ((Activity) this.l1).isDestroyed()) {
            return;
        }
        C5OG.LIZJ(C135085Rw.LJLIL);
        View LIZLLL = C16970lZ.LIZLLL((Activity) this.l1, R.layout.at5);
        o.LJIIIIZZ(LIZLLL, "inflate(activity, R.layo…o_undo_redo_toast_layout)");
        if (C58B.LIZ() && (findViewById = LIZLLL.findViewById(R.id.lbl)) != null) {
            findViewById.setBackgroundResource(R.drawable.arn);
        }
        ((TextView) LIZLLL.findViewById(R.id.lbn)).setText(this.s0);
        Toast toast = new Toast((Activity) this.l1);
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.setView(LIZLLL);
        C16880lQ.LLZILL(toast);
        C135105Ry.LIZ = toast;
    }

    public static final Object invoke$0(AqS70S1100000_2 aqS70S1100000_2) {
        String string;
        Bundle arguments = ((Fragment) aqS70S1100000_2.l1).getArguments();
        if (arguments == null || (string = arguments.getString(aqS70S1100000_2.s0)) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$1(AqS70S1100000_2 aqS70S1100000_2) {
        C66Y LLJJJJ;
        C1548265u c1548265u;
        C153065za c153065za;
        if (((NowsEditRootScene) aqS70S1100000_2.l1).getSceneContext() != null) {
            float LJ = C81184Vtc.LJ(((NowsEditRootScene) aqS70S1100000_2.l1).requireSceneContext());
            float f = LJ / 0.75f;
            float LIZ = C74275TDb.LIZ(16.0f) / LJ;
            o.LJIIIIZZ(C60903NvH.LJ, "getApplication()");
            float LIZJ = C6IA.LIZJ(r1) / f;
            float f2 = H7I.LIZ;
            Context requireSceneContext = ((NowsEditRootScene) aqS70S1100000_2.l1).requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            float LIZIZ = (C74275TDb.LIZIZ(requireSceneContext, 4.0f) / LJ) + f2;
            Context requireSceneContext2 = ((NowsEditRootScene) aqS70S1100000_2.l1).requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            float LIZIZ2 = (C74275TDb.LIZIZ(requireSceneContext2, 4.0f) / f) + f2;
            C1548165t c1548165t = (C1548165t) ((NowsEditRootScene) aqS70S1100000_2.l1).LLIILZL.getValue();
            if (c1548165t != null && (LLJJJJ = c1548165t.LLJJJJ()) != null && (c1548265u = LLJJJJ.LJLJI) != null && (c153065za = c1548265u.LJLJLJ) != null) {
                String str = aqS70S1100000_2.s0;
                C121594pv c121594pv = new C121594pv();
                c121594pv.LJIIL = str;
                c121594pv.LJIILIIL = LIZIZ;
                c121594pv.LJIILJJIL = LIZIZ2;
                c121594pv.LJ = (LIZIZ / 2.0f) + LIZ;
                c121594pv.LJFF = (LIZIZ2 / 2.0f) + LIZJ;
                c121594pv.LIZLLL = c153065za.LJ.getDuration();
                C17N.LJJI(c153065za.LJ).LJIIIIZZ().LJJJJIZL(c121594pv);
                C153075zb LJ2 = c153065za.LJ("now_mix_front", str, null, 25, 1, c121594pv.LIZ, LIZ, LIZJ, LIZIZ, LIZIZ2, false);
                if (LJ2 != null) {
                    LJ2.LJLLJ = true;
                }
            }
            NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) aqS70S1100000_2.l1;
            SceneExtensionsKt.LIZJ(nowsEditRootScene, new ARunnableS38S0100000_2(nowsEditRootScene, 41), 300L);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ff, code lost:
    
        if (r2 != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS70S1100000_2 r6) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS70S1100000_2.invoke$2(kotlin.jvm.internal.AqS70S1100000_2):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS70S1100000_2 aqS70S1100000_2) {
        aqS70S1100000_2.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S1100000_2(C138075bP c138075bP, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c138075bP;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S1100000_2(Activity activity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S1100000_2(Fragment fragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S1100000_2(NowsEditRootScene nowsEditRootScene, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = nowsEditRootScene;
        this.s0 = str;
    }
}
