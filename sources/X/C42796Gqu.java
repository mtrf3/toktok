package X;

import Y.AObjectS42S0101000_5;
import Y.AObjectS47S0101000_2;
import Y.AObjectS50S0101000_5;
import Y.AObserverS47S0201000_3;
import Y.ARunnableS15S0300000_4;
import Y.IDObjectS121S0200000_7;
import Y.IDRunnableS6S0101000;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.editpost.SceneWrapperFragment;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.TitleHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42796Gqu implements InterfaceC42803Gr1<AVChallenge>, InterfaceC42825GrN, InterfaceC42808Gr6, Observer<C207668Da>, InterfaceC42309Gj3 {
    public final RecyclerView LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final ViewGroup LJLJJI;
    public final C73305Spp LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public final FrameLayout LJLJLJ;
    public final GQ5 LJLJLLL;
    public String LJLL;
    public final C42819GrH LJLLI;
    public C42805Gr3 LJLLILLLL;
    public GS5 LJLLJ;
    public C161566Vs LJLLL;
    public C42806Gr4 LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public C42809Gr7 LJZ;
    public GHY LJZL;
    public BaseTitleHelper LL;
    public HashTagMobHelper LLD;
    public final String LLF;
    public int LLFII;
    public final KeyboardStateViewModel LLFZ;
    public final WM7 LLI;
    public final ArrayList<C42802Gr0> LJZI = new ArrayList<>();
    public boolean LLFF = false;
    public T3D LLFFF = null;
    public boolean LLIFFJFJJ = false;

    public final void LIZ() {
        LIZLLL(false);
        this.LJLJI.setVisibility(0);
        this.LJZI.clear();
        C42809Gr7 c42809Gr7 = this.LJZ;
        if (c42809Gr7 != null) {
            c42809Gr7.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC42825GrN
    public final void LLIIZ() {
        LJ(0);
        this.LJLIL.setVisibility(8);
        this.LJLJJL.LJFF();
    }

    public final C76800UCe LJII() {
        if (!TextUtils.isEmpty(this.LJLL)) {
            LJI(this.LJLL.substring(this.LJLL.lastIndexOf(35) + 1));
        }
        return C76800UCe.LIZ;
    }

    public final void LIZIZ(boolean z) {
        OSZ<String, String> LIZ = T35.LIZ(this.LJLJJL.getContext());
        if (this.LLFFF == null) {
            this.LLFFF = new T3D(new AObjectS47S0101000_2(1, this, 6), new AObjectS50S0101000_5(2, this, 0), true);
        }
        this.LLFFF.LIZ();
        if (z) {
            LJ(8);
            T35.LIZIZ(this.LJLJJL.getContext());
            return;
        }
        LJ(0);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_refresh;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        C73305Spp c73305Spp = this.LJLJJL;
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        int LJI = SFS.LJI(72.0d);
        int LJI2 = SFS.LJI(72.0d);
        c73306Spq.LIZLLL = LJI;
        c73306Spq.LJ = LJI2;
        c73306Spq.LIZJ(LIZ.getFirst());
        c73306Spq.LIZIZ(LIZ.getSecond());
        c73306Spq.LJIIIIZZ = new AObjectS42S0101000_5(3, this, 28);
        c73305Spp.setStatus(c73306Spq);
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            C42819GrH c42819GrH = this.LJLLI;
            if (c42819GrH != null) {
                c42819GrH.LIZLLL(false);
            }
            this.LJLILLLLZI.setVisibility(0);
        } else {
            C42819GrH c42819GrH2 = this.LJLLI;
            if (c42819GrH2 != null) {
                c42819GrH2.LIZLLL(true);
            }
            this.LJLILLLLZI.setVisibility(8);
        }
        GS5 gs5 = this.LJLLJ;
        if (gs5 != null) {
            gs5.LIZLLL(z);
        }
    }

    public final void LJ(int i) {
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(i);
        }
    }

    public final void LJI(String str) {
        String str2;
        this.LLFF = false;
        if (C44172HVg.LJIJ.isChildrenMode() || SearchServiceImpl.LLLZI().LJLIL().disableHashtagSearch) {
            return;
        }
        this.LJLJJI.setVisibility(8);
        LIZLLL(true);
        if (TextUtils.isEmpty(str)) {
            this.LJLZ = true;
            this.LJLLLL.LIZ.LJIILL(1);
            return;
        }
        this.LJLZ = false;
        C161566Vs c161566Vs = this.LJLLL;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Fragment fragment = this.LJLJLLL.LIZ.getFragment();
        if (fragment != null && (fragment instanceof SceneWrapperFragment)) {
            str2 = "edit_post";
        } else {
            str2 = "challenge_create";
        }
        objArr[1] = str2;
        ((C8BR) c161566Vs.LIZ).LJIILL(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42796Gqu.LJIIIIZZ(java.util.List):void");
    }

    @Override // X.InterfaceC42825GrN
    public final void LLJJI(Exception exc) {
        boolean z;
        LJ(0);
        if (C42555Gn1.LIZ() && !C48203Ivv.LJ(this.LJLJJL.getContext())) {
            if (this.LJLIL.getAdapter() != null && this.LJLIL.getAdapter().getItemCount() > 0) {
                z = true;
                this.LJLIL.setVisibility(0);
            } else {
                z = false;
                this.LJLIL.setVisibility(8);
            }
            this.LLFF = true;
            LIZIZ(z);
            return;
        }
        this.LJLIL.setVisibility(8);
        C73305Spp c73305Spp = this.LJLJJL;
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LIZIZ(this.LJLJJL.getContext().getString(R.string.im9));
        c73306Spq.LJIIIIZZ = new AObjectS42S0101000_5(2, this, 29);
        c73305Spp.setStatus(c73306Spq);
    }

    @Override // X.InterfaceC42825GrN
    public final void LLJJIII(AVSearchChallengeList aVSearchChallengeList) {
        List<AVSearchChallenge> list;
        String imprId;
        if (this.LJLZ) {
            return;
        }
        if (aVSearchChallengeList != null) {
            LIZJ(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
        }
        String str = null;
        if (aVSearchChallengeList == null) {
            list = null;
        } else {
            list = aVSearchChallengeList.items;
        }
        this.LJZI.clear();
        if (!this.LJLLLLLL || C32151Nz.LJJIIJZLJL(list)) {
            LJ(0);
            this.LJLIL.setVisibility(8);
            C73305Spp c73305Spp = this.LJLJJL;
            C73306Spq c73306Spq = new C73306Spq();
            this.LJLJJL.getContext();
            c73306Spq.LJI = "  ";
            c73305Spp.setStatus(c73306Spq);
            LIZLLL(false);
            this.LJLJI.setVisibility(0);
        } else {
            HashTagMobHelper hashTagMobHelper = this.LLD;
            if (hashTagMobHelper != null) {
                hashTagMobHelper.LJLILLLLZI = aVSearchChallengeList.logPb;
                hashTagMobHelper.LJLJJI = aVSearchChallengeList.keyword;
                hashTagMobHelper.LJLJI = aVSearchChallengeList.recommendWordMob;
            }
            this.LJZ.LJLJJLL = aVSearchChallengeList.keyword;
            for (int i = 0; i < list.size(); i++) {
                this.LJZI.add(C42802Gr0.LIZ((AVSearchChallenge) ListProtector.get(list, i)));
            }
            HashTagMobHelper hashTagMobHelper2 = this.LLD;
            Integer valueOf = Integer.valueOf(this.LJZI.size());
            hashTagMobHelper2.getClass();
            if (valueOf != null) {
                valueOf.intValue();
                C76W c76w = new C76W();
                c76w.LIZ("words_num", valueOf.toString());
                c76w.LIZ("words_source", "sug");
                c76w.LIZ("search_position", "challenge_create");
                c76w.LIZ("raw_query", hashTagMobHelper2.LJLJJI);
                c76w.LIZ("rank", "-1");
                RecommendWordMob recommendWordMob = hashTagMobHelper2.LJLJI;
                if (recommendWordMob != null) {
                    str = recommendWordMob.getQueryId();
                }
                c76w.LIZ("query_id", str);
                LogPbBean logPbBean = hashTagMobHelper2.LJLILLLLZI;
                if (logPbBean == null) {
                    imprId = "";
                } else {
                    imprId = logPbBean.getImprId();
                }
                c76w.LIZ("impr_id", imprId);
                FMX.LJIILJJIL("trending_show", c76w.LIZIZ());
            }
            LJ(8);
            this.LJLIL.setVisibility(0);
            LIZLLL(true);
            this.LJLJI.setVisibility(4);
        }
        C42809Gr7 c42809Gr7 = this.LJZ;
        if (c42809Gr7 != null) {
            c42809Gr7.notifyDataSetChanged();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 != null && TextUtils.equals(c207668Da2.LIZ, InterfaceC42801Gqz.LIZ) && (str = this.LJLL) != null && str.endsWith("#")) {
            LJI("");
        }
    }

    public static void LIZJ(String str, LogPbBean logPbBean) {
        C76W c76w = new C76W();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c76w.LIZ("search_keyword", str);
        if (logPbBean != null) {
            str2 = GsonProtectorUtils.toJson(C44172HVg.LIZIZ, logPbBean);
        }
        c76w.LIZ("log_pb", str2);
        FMX.LJIILLIIL("search_tag", c76w.LIZIZ());
    }

    public C42796Gqu(String str, GQ5 gq5, View view, WM7 wm7) {
        KeyboardStateViewModel keyboardStateViewModel;
        GSR gsr;
        ArrayList arrayList = null;
        this.LLFZ = null;
        this.LLFZ = (KeyboardStateViewModel) new ViewModelProvider(wm7).get(KeyboardStateViewModel.class);
        this.LLI = wm7;
        this.LLF = str;
        this.LJLJLLL = gq5;
        gq5.LJIIJJI = C44172HVg.LJIJ.getCurrentUserID();
        this.LJLIL = (RecyclerView) view.findViewById(R.id.e2m);
        this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.e2r);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.ap_);
        this.LJLJJI = (ViewGroup) view.findViewById(R.id.vl);
        this.LJLJJL = (C73305Spp) view.findViewById(R.id.kf_);
        this.LJLJJLL = view.findViewById(R.id.le7);
        if (((Number) C42887GsN.LIZ.getValue()).intValue() != 0 && !(gq5.LJIILL instanceof EditPostedVideoPublishActivity)) {
            VideoPublishEditModel videoPublishEditModel = gq5.LJIIL;
            if (videoPublishEditModel != null && videoPublishEditModel.getStructList() != null && gq5.LJIIL.getStructList().size() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                for (AVTextExtraStruct aVTextExtraStruct : gq5.LJIIL.getStructList()) {
                    String str2 = aVTextExtraStruct.hashTagName;
                    if (str2 != null && !str2.isEmpty()) {
                        arrayList2.add(aVTextExtraStruct.hashTagName);
                    }
                }
                if (arrayList2.size() > 0) {
                    arrayList = arrayList2;
                }
            }
            this.LJLLI = new C42819GrH(new C42800Gqy(view, this, str, arrayList, wm7));
        }
        this.LJLJLJ = (FrameLayout) view.findViewById(R.id.kfq);
        this.LJLJL = view.findViewById(R.id.jbo);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
        layoutParams.topMargin = (int) (C74275TDb.LIZIZ(this.LJLILLLLZI.getContext(), 8.0f) + layoutParams.topMargin);
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        view.post(new IDRunnableS6S0101000(5, this, 17));
        GQ5 gq52 = this.LJLJLLL;
        if (gq52 == null || (keyboardStateViewModel = this.LLFZ) == null || (gsr = gq52.LIZIZ) == null) {
            return;
        }
        ViewTreeObserverOnWindowFocusChangeListenerC45682HwM viewTreeObserverOnWindowFocusChangeListenerC45682HwM = new ViewTreeObserverOnWindowFocusChangeListenerC45682HwM(gsr);
        WM7 owner = this.LLI;
        AObserverS47S0201000_3 aObserverS47S0201000_3 = new AObserverS47S0201000_3(1, gsr, viewTreeObserverOnWindowFocusChangeListenerC45682HwM, 1);
        o.LJIIIZ(owner, "owner");
        keyboardStateViewModel.runOnUiThread(new ARunnableS15S0300000_4(keyboardStateViewModel, owner, aObserverS47S0201000_3, 17));
    }

    public final void LJFF(Fragment fragment, boolean z, GHY ghy, int i) {
        this.LJZL = ghy;
        this.LLFII = i;
        if (C45804HyK.LJJIFFI(fragment.getContext()) != null) {
            HashTagMobHelper hashTagMobHelper = (HashTagMobHelper) C165706es.LJFF(this.LLI).get(HashTagMobHelper.class);
            this.LLD = hashTagMobHelper;
            hashTagMobHelper.LJLIL = this.LLF;
            hashTagMobHelper.LJLJJLL = this.LJZI;
            WM7 scene = this.LLI;
            o.LJIIIZ(scene, "scene");
            BaseTitleHelper baseTitleHelper = (BaseTitleHelper) C165706es.LJIIIIZZ(scene, null, null, 6).get(TitleHelper.class);
            this.LL = baseTitleHelper;
            baseTitleHelper.getClass();
            this.LLD.LJLJJL = this.LL;
        }
        if (this.LJLIL != null) {
            this.LJZ = new C42809Gr7(this.LLI, this.LJZI, this);
            this.LJLIL.setLayoutManager(new LinearLayoutManager());
            this.LJLIL.setAdapter(this.LJZ);
        }
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.Gr2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C44172HVg.LIZLLL.getClass();
        C51031K1b c51031K1b = new C51031K1b();
        c51031K1b.LJJ(new HMC());
        c51031K1b.LJLILLLLZI = new C42799Gqx(this);
        this.LJLLLL = new C42806Gr4(c51031K1b);
        C44172HVg.LIZLLL.getClass();
        C42827GrP c42827GrP = new C42827GrP();
        c42827GrP.LJJ(new C43226Gxq());
        c42827GrP.LJLILLLLZI = new C42824GrM(this);
        this.LJLLL = new C161566Vs(c42827GrP);
        this.LJLJLLL.LJIIJJI(z);
        GSR gsr = this.LJLJLLL.LIZIZ;
        gsr.addTextChangedListener(new IDObjectS121S0200000_7(gsr, this, 1));
        this.LLFF = false;
        C44172HVg.LIZLLL.getClass();
        RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) ViewModelProviders.of(fragment).get(RecommendHashTagViewModel.class);
        this.LJLLILLLL = new C42805Gr3(recommendHashTagViewModel);
        recommendHashTagViewModel.gv0(this.LJZL);
    }
}
