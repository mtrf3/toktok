package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81574Vzu extends AbstractC56012Ht<C81578Vzy, C53594L1q> {
    public C72787ShT LJLIL;
    public ViewGroup LJLILLLLZI;
    public View LJLJI;
    public C81484VyS LJLJJI;
    public CountDownTimerC81485VyT LJLJJL;
    public float LJLJJLL = -1.0f;
    public boolean LJLJL;
    public final boolean LJLJLJ;

    public final void LLJILJIL() {
        Activity activity;
        if (this.LJLJL && (activity = this.mActivity) != null) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.LJLJJLL;
            window.setAttributes(attributes);
            this.LJLJL = false;
        }
    }

    public final void LLJJ() {
        if (this.mActivity == null) {
            return;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(SceneExtensionsKt.LIZLLL(this));
        LIZJ.LIZ(false);
        LIZJ.LJIIIIZZ(0);
        LIZJ.LIZIZ.LJIIJ(false);
        LIZJ.LIZIZ.LJII(false);
        LIZJ.LJ(R.attr.d4);
        LIZJ.LIZJ();
    }

    public C81574Vzu() {
        boolean z = true;
        if (L2F.LIZIZ() != 3 && L2F.LIZIZ() != 2) {
            z = false;
        }
        this.LJLJLJ = z;
    }

    public final void LLJILJILJ(int i) {
        if (this.mActivity == null) {
            return;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(SceneExtensionsKt.LIZLLL(this));
        LIZJ.LIZ(false);
        LIZJ.LJIIIIZZ(0);
        LIZJ.LIZIZ.LJIIJ(true);
        LIZJ.LJFF(i);
        LIZJ.LIZIZ.LJII(true);
        LIZJ.LIZJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ka, viewGroup, false, "view");
        if (this.LJLJLJ) {
            View findViewById = LIZ.findViewById(R.id.cn4);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.edge_light)");
            this.LJLILLLLZI = (ViewGroup) findViewById;
        } else {
            this.LJLJI = LIZ.findViewById(R.id.d3c);
        }
        if (L2F.LIZIZ() == 3) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            C81484VyS c81484VyS = new C81484VyS(requireSceneContext);
            this.LJLJJI = c81484VyS;
            this.LJLJJL = c81484VyS.LIZJ;
            C81488VyW c81488VyW = new C81488VyW(this);
            c81484VyS.LIZLLL = c81488VyW;
            c81484VyS.LJFF.setOnSeekBarChangeListener(c81488VyW);
            c81484VyS.LJ.setOnCheckedChangeListener(c81488VyW);
        }
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W01
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LIZJ;
            }
        }, null, new AqS180S0100000_14(this, 233), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.W02
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LJ;
            }
        }, null, new AqS180S0100000_14(this, 234), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W00
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LJFF;
            }
        }, null, new AqS180S0100000_14(this, 235), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W03
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LIZLLL;
            }
        }, null, new AqS180S0100000_14(this, 227), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vzx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LJII;
            }
        }, null, new AqS180S0100000_14(this, 230), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Vzv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C81578Vzy) obj).LIZIZ);
            }
        }, null, new AqS180S0100000_14(this, 231), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Vzz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C81578Vzy) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 232), 2, null);
        return (ViewGroup) LIZ;
    }
}
