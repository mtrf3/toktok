package X;

import Y.IDcS9S0200000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HtP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45499HtP extends AbstractC45488HtE implements InterfaceC45648Hvo {
    public TextView LLIIIZ;
    public String LLIIJI;
    public boolean LLIIJLIL;
    public ViewGroup LLIIL;
    public ViewGroup LLIILII;
    public ImageView LLIILZL;
    public TextView LLIIZ;
    public TextView LLIL;
    public V8E LLILII;
    public View LLILIL;
    public View.OnClickListener LLILL;
    public C45528Hts LLILLIZIL;
    public boolean LLILLJJLI = true;

    @Override // X.AbstractC45488HtE
    public final void LLJJJIL() {
        this.LJZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C45598Hv0.LIZ);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (C78605Ut7.LIZLLL()) {
            LLJJLIIIJLLLLLLLZ(true);
            C45528Hts c45528Hts = this.LLILLIZIL;
            if (c45528Hts != null) {
                c45528Hts.invoke();
                return;
            }
            return;
        }
        LLJJLIIIJLLLLLLLZ(false);
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        if (z) {
            this.LLIIL.setVisibility(8);
            this.LLIILII.setVisibility(0);
            this.LLIFFJFJJ.LIZ(true);
        } else {
            this.LLIIL.setVisibility(0);
            this.LLIILII.setVisibility(8);
            this.LLIFFJFJJ.LIZ(false);
            if (C45871HzP.LIZ() && this.LLILLJJLI) {
                this.LLILLJJLI = false;
                this.LLIILZL.setImageDrawable(this.LLILII);
            }
        }
        this.LJLJJLL.requestLayout();
    }

    public final void LLJLIL(boolean z) {
        this.LLIIJLIL = z;
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LLIIJI(z);
        }
    }

    @Override // X.AbstractC45488HtE, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        double d;
        super.onActivityCreated(bundle);
        if (HOC.LIZJ() || this.LL.LJI.LIZ() == EnumC45531Htv.THREE_TO_FOUR) {
            d = 1.3333333333333333d;
        } else if (HOC.LIZLLL() || this.LL.LJI.LIZ() == EnumC45531Htv.NINE_TO_SIXTEEN) {
            d = 1.7777777777777777d;
        } else {
            d = 1.0d;
        }
        C45498HtO c45498HtO = new C45498HtO(this.mActivity, this.LJLILLLLZI, d, 2, this.LJZI);
        this.LJLJI = c45498HtO;
        c45498HtO.LJZL = this.LLIIII;
        c45498HtO.LLF = this.LL;
        c45498HtO.LJLLI = this.LJLJJL;
        c45498HtO.LLIIJI(this.LLIIJLIL);
        C45498HtO c45498HtO2 = this.LJLJI;
        List<InterfaceC45547HuB> list = this.LLFII;
        if (list == null) {
            c45498HtO2.getClass();
        } else {
            c45498HtO2.LLIIIILZ = list;
            c45498HtO2.LLIIIL = ((ArrayList) list).size();
        }
        this.LJLJI.LJLL = new C45514Hte(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJLILLLLZI);
        wrapGridLayoutManager.LLIILII = new IDcS9S0200000_7(this, wrapGridLayoutManager, 3);
        wrapGridLayoutManager.LLIIII = this.LJLILLLLZI;
        this.LJLJJI.setHasFixedSize(true);
        if (C45695HwZ.LIZ()) {
            this.LJLJJI.setItemAnimator(null);
        }
        this.LJLJJI.setLayoutManager(wrapGridLayoutManager);
        this.LJLJJI.LJII(new C45663Hw3(this.LJLILLLLZI, this.LLII, true), -1);
        C45498HtO c45498HtO3 = this.LJLJI;
        RecyclerView recyclerView = this.LJLJJI;
        c45498HtO3.LJZ = recyclerView;
        recyclerView.setAdapter(c45498HtO3);
        if (this.LJLLILLLL) {
            C45498HtO c45498HtO4 = this.LJLJI;
            c45498HtO4.LJLLLLLL.addAll(this.LJLLL);
        }
        C45498HtO c45498HtO5 = this.LJLJI;
        if (c45498HtO5 != null) {
            c45498HtO5.LJLIL = this.LJLL;
            c45498HtO5.LJLJJI = LLJILJILJ();
            C45498HtO c45498HtO6 = this.LJLJI;
            int i = this.LLFZ;
            int i2 = this.LLI;
            c45498HtO6.LJLILLLLZI = i;
            c45498HtO6.LJLJI = i2;
        }
        if (!TextUtils.isEmpty(this.LLIIJI)) {
            this.LJLJL.setVisibility(0);
            this.LJLJL.setText(this.LLIIJI);
        } else {
            this.LJLJL.setVisibility(8);
        }
        LLJJIJIL(1009);
    }

    @Override // X.AbstractC45488HtE, X.AbstractC45656Hvw, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.AbstractC45488HtE, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            LLJJLIIIJLLLLLLLZ(C78605Ut7.LIZLLL());
        }
    }

    @Override // X.AbstractC45488HtE
    public final void LLJJIII(List<MyMediaModel> list, boolean z) {
        if (list == null) {
            return;
        }
        LLJILJIL(1009);
        if (list.isEmpty()) {
            this.LLIIIZ.setVisibility(0);
            this.LLIIIZ.setText(R.string.h7n);
            if (this.LJZI) {
                G8G.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LJZI = false;
            }
        } else {
            this.LLIIIZ.setVisibility(8);
        }
        if (z) {
            this.LJLJI.setData(list);
        } else {
            this.LJLJI.LLIIJLIL(list);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(System.currentTimeMillis() - this.LJLLLL.longValue(), "duration");
        c145995oB.LIZ(2, "type");
        c145995oB.LJI("shoot_way", this.LLD);
        c145995oB.LIZ(list.size(), "count");
        GXR.LIZ("tool_performance_fetch_album_assets", c145995oB.LIZ);
    }

    public final void LLJLILLLLZIIL(View view, MediaModel mediaModel, boolean z) {
        if (this.mActivity == null) {
            return;
        }
        if (!z) {
            C5S1 c5s1 = new C5S1(this.mActivity);
            c5s1.LIZLLL(this.mActivity.getString(R.string.jl9));
            c5s1.LJ();
        } else {
            if (!this.LJLJJL.LJIILIIL()) {
                return;
            }
            if (this.LJLJI.LJLLILLLL) {
                C45462Hso c45462Hso = this.LJLJJL;
                if (c45462Hso == null || !(mediaModel instanceof MyMediaModel)) {
                    return;
                }
                c45462Hso.LIZLLL((MyMediaModel) mediaModel, view);
                return;
            }
            C45462Hso c45462Hso2 = this.LJLJJL;
            if (c45462Hso2 == null) {
                return;
            }
            c45462Hso2.LJIIL(mediaModel);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity;
        InterfaceC36571c5 currentScene = C60903NvH.LJIIJJI().LJIL().getCurrentScene(requireActivity());
        if ((currentScene instanceof InterfaceC45601Hv3) && C42617Go1.LIZ()) {
            this.LJLJJLL = (ViewGroup) C45526Htq.LIZ((InterfaceC45601Hv3) currentScene, R.layout.b_q, this);
        } else {
            this.LJLJJLL = (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.b_q, viewGroup, false);
        }
        RecyclerView recyclerView = (RecyclerView) this.LJLJJLL.findViewById(R.id.eh5);
        this.LJLJJI = recyclerView;
        recyclerView.setRecycledViewPool(C45513Htd.LIZ(this));
        this.LJLJL = (TextView) this.LJLJJLL.findViewById(R.id.e5y);
        this.LLIIIZ = (TextView) this.LJLJJLL.findViewById(R.id.h1s);
        this.LJLJLJ = (C8ID) this.LJLJJLL.findViewById(R.id.ehm);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 instanceof C45719Hwx) {
            ((C45719Hwx) recyclerView2).setFastScrollEnabled(true);
            ((C45719Hwx) this.LJLJJI).setFastScrollListener(this.LLIIIL);
        }
        this.LLIIL = (ViewGroup) this.LJLJJLL.findViewById(R.id.h1r);
        this.LLIILII = (ViewGroup) this.LJLJJLL.findViewById(R.id.e2i);
        this.LLIILZL = (ImageView) this.LJLJJLL.findViewById(R.id.hp6);
        this.LLIIZ = (TextView) this.LJLJJLL.findViewById(R.id.lv8);
        this.LLIL = (TextView) this.LJLJJLL.findViewById(R.id.lv9);
        if (LLJJ() && (activity = this.mActivity) != null) {
            this.LLIIZ.setTextColor(C79045V0n.LJ(R.attr.cl, activity).intValue());
            this.LLIL.setTextColor(C79045V0n.LJ(R.attr.dk, this.mActivity).intValue());
        }
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bb2;
        if (this.mActivity != null) {
            if (LLJJ()) {
                this.LLILII = c33381Ss.LIZ(new ContextThemeWrapper(this.mActivity, R.style.ux));
            } else {
                this.LLILII = c33381Ss.LIZ(this.mActivity);
            }
        }
        if (!C45871HzP.LIZ()) {
            this.LLIILZL.setImageDrawable(this.LLILII);
        }
        View findViewById = this.LJLJJLL.findViewById(R.id.ixq);
        this.LLILIL = findViewById;
        C16880lQ.LJIIJ(this.LLILL, findViewById);
        LLJJLIIIJLLLLLLLZ(C78605Ut7.LIZLLL());
        return this.LJLJJLL;
    }
}
