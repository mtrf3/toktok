package X;

import Y.ARunnableS11S0400000_7;
import Y.AfS36S0101000_5;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hvx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45657Hvx extends AbstractC45656Hvw implements IVideoChoose {
    public static final /* synthetic */ int LJZI = 0;
    public final C73849Syb<C31484CXg> LJLILLLLZI = C73849Syb.LJJZZI(new C31484CXg());
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public TextView LJLJJI;
    public C8ID LJLJJL;
    public RecyclerView LJLJJLL;
    public C45658Hvy LJLJL;
    public C45685HwP LJLJLJ;
    public ViewOnClickListenerC81018Vqw LJLJLLL;
    public boolean LJLL;
    public C73214SoM LJLLI;
    public QBF LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public volatile boolean LJLLLLLL;
    public final C45660Hw0 LJLZ;
    public IVideoChoose.Callback LJZ;

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        if (this.LJLLLLLL) {
            return;
        }
        LLJILJILJ();
    }

    public C45657Hvx() {
        C44529Hdl.LIZIZ();
        this.LJLLLLLL = false;
        this.LJLZ = new C45660Hw0(this);
    }

    public final void LLJILJILJ() {
        boolean z;
        ArrayList arrayList;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refreshData,dataLoaded:");
        LIZ.append(this.LJLLLLLL);
        LIZ.append(",manager valid:");
        if (this.LJLJLJ != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LLJILJIL(X1D.LIZIZ(LIZ));
        ArrayList arrayList2 = new ArrayList();
        if (this.LJLJLJ != null) {
            this.LJLLLLLL = true;
            List<MediaModel> list = this.LJLJLJ.LIZJ.get(4);
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                if (mediaModel.duration > 3000) {
                    arrayList3.add(mediaModel);
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("filterVideosMoreThan3Seconds,originSize:");
            LIZ2.append(arrayList.size());
            LIZ2.append("resultSize:");
            LIZ2.append(arrayList3.size());
            LLJILJIL(X1D.LIZIZ(LIZ2));
            if (!arrayList3.isEmpty()) {
                C73849Syb<C31484CXg> c73849Syb = this.LJLILLLLZI;
                C31484CXg LJJZZIII = c73849Syb.LJJZZIII();
                LJJZZIII.getClass();
                C31484CXg c31484CXg = new C31484CXg();
                c31484CXg.LIZ = LJJZZIII.LIZ;
                c31484CXg.LIZIZ = true;
                c73849Syb.onNext(c31484CXg);
            }
            C45685HwP c45685HwP = this.LJLJLJ;
            c45685HwP.getClass();
            ArrayList arrayList4 = new ArrayList(c45685HwP.LIZLLL);
            arrayList2.addAll(arrayList3);
            HRJ.LIZ.execute(new ARunnableS11S0400000_7(this, arrayList2, new ArrayList(), arrayList4, 0));
        }
    }

    @Override // X.AbstractC45656Hvw, X.WM7
    public final void onDestroy() {
        super.onDestroy();
        C45685HwP c45685HwP = this.LJLJLJ;
        if (c45685HwP != null) {
            ((HashSet) c45685HwP.LJ).remove(this.LJLZ);
        }
        this.LJLJI.LIZLLL();
    }

    public static final void LLJILJIL(String str) {
        FP1.LJ("MusVideoChooseFragment:", str);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        ArrayList arrayList;
        Activity activity;
        super.onActivityCreated(bundle);
        if (this.LJLJLJ == null && (activity = this.mActivity) != null) {
            C45685HwP.LIZIZ(C16880lQ.LLLLJ(activity));
            C45685HwP c45685HwP = C45685HwP.LJFF;
            this.LJLJLJ = c45685HwP;
            ((HashSet) c45685HwP.LJ).add(this.LJLZ);
        }
        List<MediaModel> list = this.LJLJLJ.LIZJ.get(4);
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        boolean LJJIIJZLJL = C32151Nz.LJJIIJZLJL(arrayList);
        StringBuilder LJI = JBR.LJI("initData,hasNoMedia:", LJJIIJZLJL, ",dataLoaded:");
        LJI.append(this.LJLLLLLL);
        LLJILJIL(X1D.LIZIZ(LJI));
        if (LJJIIJZLJL) {
            C73849Syb<C31484CXg> c73849Syb = this.LJLILLLLZI;
            C31484CXg LJJZZIII = c73849Syb.LJJZZIII();
            LJJZZIII.getClass();
            C31484CXg c31484CXg = new C31484CXg();
            c31484CXg.LIZ = true;
            c31484CXg.LIZIZ = LJJZZIII.LIZIZ;
            c73849Syb.onNext(c31484CXg);
            this.LJLJLJ.LIZJ(4, -1, -1, null);
        }
        if (this.LJLJL == null) {
            C45658Hvy c45658Hvy = new C45658Hvy(this.mActivity, this, this.LJLLJ);
            this.LJLJL = c45658Hvy;
            C73214SoM c73214SoM = new C73214SoM(c45658Hvy);
            this.LJLLI = c73214SoM;
            Activity context = this.mActivity;
            o.LJIIIZ(context, "context");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) KL2.LIZJ(context, 96));
            View view = new View(context);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(0);
            C0MB<View> c0mb = c73214SoM.LJLILLLLZI;
            c0mb.LJI(c0mb.LJIIIIZZ() + 200000, view);
            c73214SoM.notifyItemRangeChanged(c73214SoM.getItemCount() - c73214SoM.LJLILLLLZI.LJIIIIZZ(), c73214SoM.LJLILLLLZI.LJIIIIZZ());
        }
        C45658Hvy c45658Hvy2 = this.LJLJL;
        c45658Hvy2.LJLLI = this.LJLLLL;
        c45658Hvy2.LJLL = this.LJLLL;
        this.LJLJLLL.setOnModeChangeListener(new InterfaceC45885Hzd() { // from class: X.Hw1
            @Override // X.InterfaceC45885Hzd
            public final void LIZ(boolean z) {
                C45657Hvx c45657Hvx = C45657Hvx.this;
                C45658Hvy c45658Hvy3 = c45657Hvx.LJLJL;
                if (c45658Hvy3 != null) {
                    c45658Hvy3.LJLJJLL = z;
                    c45658Hvy3.LJLLLLLL(((ArrayList) c45658Hvy3.LJLJI).size());
                    C73214SoM c73214SoM2 = c45658Hvy3.LJLLJ.LJLLI;
                    if (c73214SoM2 != null) {
                        c73214SoM2.notifyDataSetChanged();
                    }
                    List<MediaModel> list2 = c45658Hvy3.LJLLILLLL;
                    if (list2 != null && !C32151Nz.LJJIIJZLJL(list2)) {
                        ((ArrayList) c45658Hvy3.LJLLILLLL).clear();
                    }
                }
                c45657Hvx.LJLLI.notifyDataSetChanged();
            }
        });
        loadData();
        this.LJLJLLL.setVisibility(8);
        this.LJLJJLL.setPadding(0, 0, 0, 0);
    }

    @Override // X.AbstractC45656Hvw, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLLJ = this.mArguments.getInt("ARG_NUM_COLUMNS", 4);
        this.LJLLL = this.mArguments.getInt("ARG_TEXT_COLOR", C04330Ez.LIZIZ(this.mActivity, R.color.bd));
        this.LJLLLL = this.mArguments.getInt("ARG_SHADOW_COLOR", C04330Ez.LIZIZ(this.mActivity, R.color.b6));
        this.LJLL = this.mArguments.getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
        this.LJLLILLLL = new QBF(this);
    }

    @Override // X.AbstractC45656Hvw, X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C16880lQ.LLLZIIL(R.layout.dro, layoutInflater, null);
        ((ViewStub) viewGroup2.findViewById(R.id.nc9)).inflate();
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.dyi);
        this.LJLJJLL = recyclerView;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(this.LJLLJ));
        int i = 0;
        this.LJLJJLL.LJII(new C45663Hw3(this.LJLLJ, (int) KL2.LIZJ(this.mActivity, 1.0f), false), -1);
        this.LJLJJI = (TextView) viewGroup2.findViewById(R.id.m8i);
        this.LJLJJL = (C8ID) viewGroup2.findViewById(R.id.n6o);
        ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw = (ViewOnClickListenerC81018Vqw) viewGroup2.findViewById(R.id.gpg);
        this.LJLJLLL = viewOnClickListenerC81018Vqw;
        if (!this.LJLL) {
            i = 8;
        }
        viewOnClickListenerC81018Vqw.setVisibility(i);
        this.LJLJI.LIZ(this.LJLILLLLZI.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(6, this, 47)));
        return viewGroup2;
    }
}
