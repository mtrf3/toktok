package com.ss.android.ugc.aweme.challenge.ui;

import X.ATO;
import X.AbstractC030309z;
import X.AbstractC208618Gr;
import X.AbstractC208678Gx;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C020506f;
import X.C03660Ck;
import X.C03880Dg;
import X.C04330Ez;
import X.C0A2;
import X.C0A5;
import X.C1041847a;
import X.C10A;
import X.C116484hg;
import X.C141335gf;
import X.C16880lQ;
import X.C175046tw;
import X.C17N;
import X.C188727au;
import X.C191487fM;
import X.C208568Gm;
import X.C220568lA;
import X.C224868s6;
import X.C227498wL;
import X.C227768wm;
import X.C26045AKb;
import X.C29S;
import X.C2KF;
import X.C2NU;
import X.C36922EeM;
import X.C38816FLg;
import X.C38836FMa;
import X.C3C5;
import X.C40443Fu3;
import X.C48027It5;
import X.C50420Jqa;
import X.C50918Jyc;
import X.C51031K1b;
import X.C55457Lpd;
import X.C56492MFc;
import X.C56516MGa;
import X.C56518MGc;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C6ZT;
import X.C73305Spp;
import X.C76800UCe;
import X.C77125UOr;
import X.C79004UzY;
import X.C90903hW;
import X.FFL;
import X.FMX;
import X.InterfaceC191547fS;
import X.InterfaceC51033K1d;
import X.InterfaceC56517MGb;
import X.InterfaceC56521MGf;
import X.InterfaceC56522MGg;
import X.InterfaceC56526MGk;
import X.InterfaceC65316PkG;
import X.JWG;
import X.KL2;
import X.KUR;
import X.KUY;
import X.LFH;
import X.MFQ;
import X.MFR;
import X.MGU;
import X.MGV;
import X.MGW;
import X.MGX;
import X.MGY;
import X.MGZ;
import X.MH9;
import X.OGG;
import X.QD3;
import X.QX2;
import X.T6F;
import X.T9K;
import X.V18;
import X.ViewOnApplyWindowInsetsListenerC51182K6w;
import Y.ACListenerS30S0101000_13;
import Y.AObjectS138S0100000_9;
import Y.ARunnableS15S0110000_9;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class DetailAwemeListFragment extends AbsDetailAwemeListFragment implements MH9, InterfaceC191547fS, OGG, InterfaceC56526MGk, JWG<AbstractC208618Gr>, InterfaceC51033K1d, T6F {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public int LJLILLLLZI;
    public String LJLJI;
    public C51031K1b<AbstractC51036K1g> LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public C56518MGc LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public float LJLLL;
    public DetailViewModel LJLLLL;
    public int LJLLLLLL;
    public T9K LJLZ;
    public RecyclerView LJZ;
    public KUR LJZI;
    public FrameLayout LJZL;
    public C73305Spp LL;
    public C56492MFc LLD;
    public MFQ LLF;
    public C220568lA LLFF;
    public int LLFFF;
    public InterfaceC56522MGg LLFII;
    public V18 LLFZ;
    public String LLIFFJFJJ;
    public List<NewFaceStickerBean> LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public Challenge LLIIIL;
    public long LLIIIZ;
    public InterfaceC56521MGf LLILII;
    public String LLILIL;
    public WrapGridLayoutManager LLILL;
    public MGV LLILLIZIL;
    public String LJLJJI = "";
    public final List<InterfaceC56517MGb> LLI = new ArrayList();
    public boolean LLII = false;
    public boolean LLIIJI = false;
    public boolean LLIIJLIL = false;
    public final SparseArray<C51031K1b> LLIIL = new SparseArray<>();
    public final SparseArray<C56492MFc> LLIILII = new SparseArray<>();
    public final SparseBooleanArray LLIILZL = new SparseBooleanArray();
    public final SparseBooleanArray LLIIZ = new SparseBooleanArray();
    public final SparseArray<KUR> LLIL = new SparseArray<>();

    public boolean Al() {
        return false;
    }

    public List<Aweme> Ml(List<Aweme> list) {
        return list;
    }

    public void Pl(C0A2 c0a2) {
    }

    @Override // X.MH9
    public /* synthetic */ void Q7(TuxTextView tuxTextView, Aweme aweme) {
    }

    public void Ql() {
        boolean z;
        MFQ mfq;
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LLIIL.get(this.LJLILLLLZI);
        this.LJLJJL = c51031K1b;
        if (c51031K1b == null) {
            C51031K1b<AbstractC51036K1g> presenter = this.LLILLIZIL.getPresenter(this.LJLILLLLZI, mo49getActivity());
            this.LJLJJL = presenter;
            if (presenter != null) {
                presenter.LJJI(new MGU(this));
                this.LJLJJL.LJJIII(this);
                this.LLIIL.put(this.LJLILLLLZI, this.LJLJJL);
            }
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLILLLLZI;
        if (i == 41) {
            this.LLD = this.LLIILII.get(i);
        } else {
            this.LLD = this.LLIILII.get(i);
        }
        if (this.LLD == null) {
            C56492MFc c56492MFc = new C56492MFc(this.LJLJI, this, this, this.LLILLIZIL, getArguments());
            this.LLD = c56492MFc;
            c56492MFc.setLoadMoreListener(this);
            C56492MFc c56492MFc2 = this.LLD;
            c56492MFc2.mmLabel = "detail_list";
            c56492MFc2.LJLJL = this.LLIIJI;
            this.LLIILII.put(this.LJLILLLLZI, c56492MFc2);
            z = true;
        }
        this.LJZ.setAdapter(this.LLD);
        this.LLD.LJLJL = this.LLIIJI;
        mo49getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            if (!this.LLIIJLIL && z) {
                J4(true, false);
                return;
            }
            if (getUserVisibleHint() && lh()) {
                J4(true, false);
                return;
            } else {
                if (getUserVisibleHint() && (mfq = this.LLF) != null) {
                    C38816FLg.LIZLLL(new ARunnableS15S0110000_9(mfq, false, 7), 0);
                    return;
                }
                return;
            }
        }
        C26045AKb c26045AKb = new C26045AKb(mo49getActivity());
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    @Override // X.MH9
    public final /* synthetic */ void bl(int i, View view, Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.MH9
    public /* synthetic */ void l2(Boolean bool) {
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemInserted(List list, int i) {
    }

    @Override // X.InterfaceC51033K1d
    public final /* synthetic */ boolean onItemInsertedNew(C2KF c2kf) {
        return false;
    }

    @Override // X.JWG
    public /* synthetic */ void p(AbstractC208618Gr abstractC208618Gr) {
    }

    @Override // X.MH9
    public /* synthetic */ void p4(Boolean bool) {
    }

    @Override // X.T6F
    public void refresh() {
        J4(false, false);
    }

    public void vl(SmartRoute smartRoute, Aweme aweme) {
    }

    @Override // X.MH9
    public /* synthetic */ void yb(View view, Aweme aweme, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Dl() {
        RecyclerView.ViewHolder LJJJJJL;
        if (this.LJZ != null && isViewValid()) {
            int childCount = this.LJZ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.LJZ.getChildAt(i);
                if (childAt != null && (LJJJJJL = this.LJZ.LJJJJJL(childAt)) != 0 && LJJJJJL.getItemViewType() == 0) {
                    ((MFR) LJJJJJL).LLLILZ();
                }
            }
        }
    }

    public final JSONObject Il() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = "";
            T t = this.LJLJJL.LJLIL;
            if (t instanceof InterfaceC65316PkG) {
                str = ((InterfaceC65316PkG) t).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final String Jl() {
        int i = this.LJLILLLLZI;
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                if (i != 15) {
                    if (i != 20) {
                        switch (i) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return "question";
                            case 32:
                                return "mv_page";
                            case 33:
                                return "library_detail_page";
                            default:
                                return null;
                        }
                    }
                    return "mv_page";
                }
                return "prop_page";
            }
            return "challenge";
        }
        return "single_song";
    }

    public int Kl() {
        return LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0);
    }

    @Override // X.InterfaceC191547fS
    public void LJIIJJI() {
        this.LLFFF = this.LJLILLLLZI;
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            if (this.LJLZ == null) {
                this.LJLZ = new T9K(new AObjectS138S0100000_9(this, 0), new AObjectS138S0100000_9(this, 1), mo49getActivity(), null, new Handler(C16880lQ.LLJJJJ()), "detail_page_load_more", 1);
            }
            T9K t9k = this.LJLZ;
            t9k.getClass();
            t9k.LJIIIZ = System.currentTimeMillis();
        }
        if (this.LJLJJL != null && !TextUtils.isEmpty(this.LJLJJI)) {
            MGV mgv = this.LLILLIZIL;
            if (mgv != null && mgv.sendCustomRequest(this.LJLJJL, 4)) {
                return;
            }
            if (this.LJLLILLLL && !TextUtils.isEmpty(this.LLIFFJFJJ)) {
                this.LJLJJL.LJIILL(4, this.LLIFFJFJJ, Integer.valueOf(this.LLFFF), Boolean.TRUE);
            } else {
                this.LJLJJL.LJIILL(4, this.LJLJJI, Integer.valueOf(this.LLFFF), Boolean.FALSE, Integer.valueOf(this.LJLJLLL));
            }
        }
        if (this.LLFZ != null) {
            C48027It5.LJII(0, "music", "list");
        }
    }

    public final void Ol() {
        View findViewById;
        C73305Spp c73305Spp = this.LL;
        if (c73305Spp != null && (findViewById = c73305Spp.findViewById(R.id.lv5)) != null && findViewById.getVisibility() == 0) {
            this.LL.setVisibility(8);
        }
        InterfaceC56521MGf interfaceC56521MGf = this.LLILII;
        if (interfaceC56521MGf != null) {
            interfaceC56521MGf.I8();
        }
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        return this.LLIIZ.get(this.LJLILLLLZI, true);
    }

    @Override // X.T6F
    public final boolean lh() {
        return this.LLIILZL.get(this.LJLILLLLZI, true);
    }

    @Override // X.T6F
    public final void LL() {
        if (isViewValid() && this.LJZ.getChildCount() > 0) {
            this.LJZ.LJLIL(0);
        }
    }

    public void Ll() {
        TuxTextView xl = xl(R.string.hvg);
        C16880lQ.LJJJJI(xl, new ACListenerS30S0101000_13(1, this, 1));
        KUR kur = this.LJZI;
        KUY LIZ = KUY.LIZ(getContext());
        LIZ.LIZIZ(xl(R.string.g3a));
        LIZ.LIZJ(xl);
        kur.setBuilder(LIZ);
    }

    @Override // X.T6F
    public final void Oi() {
        if (!isViewValid()) {
            return;
        }
        if (getUserVisibleHint()) {
            getContext();
            if (C208568Gm.LIZ()) {
                mo49getActivity();
                try {
                    if (C2NU.LIZ.LIZIZ()) {
                        MFQ mfq = this.LLF;
                        if (mfq != null) {
                            C38816FLg.LIZLLL(new ARunnableS15S0110000_9(mfq, false, 7), 0);
                            return;
                        }
                        return;
                    }
                } catch (Exception unused) {
                }
            }
        }
        MFQ mfq2 = this.LLF;
        if (mfq2 != null) {
            mfq2.LIZ();
        }
    }

    public void initData() {
        C56516MGa c56516MGa;
        Ll();
        int Kl = Kl();
        mo49getActivity();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(Kl, 1, false);
        this.LLILL = wrapGridLayoutManager;
        this.LJZ.setLayoutManager(wrapGridLayoutManager);
        this.LJZ.setOverScrollMode(2);
        this.LJZ.LJII(Gl(Kl), -1);
        this.LJZ.LJIIJ(new C0A5() { // from class: X.8wu
            @Override // X.C0A5
            public final void LIZ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.C0A5
            public final void LIZIZ(boolean z) {
            }

            @Override // X.C0A5
            public final boolean LIZJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                String str;
                String str2;
                String str3;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        return false;
                    }
                    DetailAwemeListFragment detailAwemeListFragment = DetailAwemeListFragment.this;
                    float y = motionEvent.getY();
                    DetailAwemeListFragment detailAwemeListFragment2 = DetailAwemeListFragment.this;
                    detailAwemeListFragment.LJLLL = y - detailAwemeListFragment2.LJLLL;
                    if (!C227768wm.LJJI(detailAwemeListFragment2.Jl()) && !TextUtils.equals("single_song", DetailAwemeListFragment.this.Jl())) {
                        return false;
                    }
                    if (TextUtils.equals("single_song", DetailAwemeListFragment.this.Jl())) {
                        str = "music_id";
                        str2 = "music_detail_slide_up";
                        str3 = "music_detail_slide_down";
                    } else {
                        str = "";
                        str2 = "";
                        str3 = "";
                    }
                    if (C227768wm.LJJI(DetailAwemeListFragment.this.Jl())) {
                        str = "tag_id";
                        str2 = "tag_detail_slide_up";
                        str3 = "tag_detail_slide_down";
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    float f = DetailAwemeListFragment.this.LJLLL;
                    if (f > 10.0f) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("process_id", DetailAwemeListFragment.this.LJLLI);
                        c188727au.LJIIIZ(str, DetailAwemeListFragment.this.LJLJJI);
                        FMX.LJIIL(str3, c188727au.LIZ);
                        return false;
                    }
                    if (f >= -10.0f) {
                        return false;
                    }
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("process_id", DetailAwemeListFragment.this.LJLLI);
                    c188727au2.LJIIIZ(str, DetailAwemeListFragment.this.LJLJJI);
                    FMX.LJIIL(str2, c188727au2.LIZ);
                    return false;
                }
                DetailAwemeListFragment.this.LJLLL = motionEvent.getY();
                return false;
            }
        });
        if (!C16880lQ.LLLZLL()) {
            c56516MGa = new C56516MGa();
            this.LJZ.LJIIJJI(c56516MGa);
        } else {
            c56516MGa = null;
        }
        RecyclerView recyclerView = this.LJZ;
        this.LLF = new MFQ(recyclerView, c56516MGa);
        MGW.LIZ(recyclerView, this, 2, false);
        this.LJZ = recyclerView;
        if (this.LJLL.LJLIL) {
            int LJIILL = C17N.LJIILL(16.0d);
            RecyclerView recyclerView2 = this.LJZ;
            recyclerView2.setPadding(LJIILL, recyclerView2.getPaddingTop(), LJIILL, this.LJZ.getPaddingBottom());
        }
        RecyclerView recyclerView3 = this.LJZ;
        if (recyclerView3 instanceof C191487fM) {
            ((C191487fM) recyclerView3).setLabel("detail_list");
        }
        C40443Fu3.LIZ(this.LJLJI).LJIIIIZZ(this.LJZ);
        if (this.LJZL != null) {
            if (this.LLIL.size() == 0) {
                this.LLIL.put(this.LJLILLLLZI, this.LJZI);
            } else {
                KUR kur = this.LJZI;
                if (kur != null) {
                    kur.setAlpha(0.0f);
                }
                KUR kur2 = this.LLIL.get(this.LJLILLLLZI);
                this.LJZI = kur2;
                if (kur2 == null) {
                    this.LJZI = new KUR(this.LJZL.getContext(), null);
                    Ll();
                    this.LJZL.addView(this.LJZI, new FrameLayout.LayoutParams(-1, -1));
                    this.LLIL.put(this.LJLILLLLZI, this.LJZI);
                } else {
                    kur2.setAlpha(1.0f);
                }
            }
        }
        Ql();
        Pl(this.LLILL);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LIZIZ();
        }
        if (this.LL != null) {
            this.LL = null;
        }
        MFQ mfq = this.LLF;
        if (mfq != null) {
            mfq.LIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        MFQ mfq;
        super.onPause();
        if (getUserVisibleHint() && (mfq = this.LLF) != null) {
            mfq.LIZ();
        }
        try {
            Dl();
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        MFQ mfq;
        super.onResume();
        if (getUserVisibleHint() && (mfq = this.LLF) != null) {
            C38816FLg.LIZLLL(new ARunnableS15S0110000_9(mfq, false, 7), 100);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        MFQ mfq;
        try {
            Dl();
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        super.onStop();
        if (getUserVisibleHint() && (mfq = this.LLF) != null) {
            mfq.LIZ();
        }
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        LJIIJJI();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        return this.LJZ;
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        C56492MFc c56492MFc = this.LLD;
        if (!z) {
            c56492MFc.setLoadMoreListener((InterfaceC191547fS) null);
            c56492MFc.setShowFooter(false);
        }
    }

    public AbstractC030309z Gl(int i) {
        final int LIZJ = (int) KL2.LIZJ(getContext(), 1.0f);
        return new AbstractC030309z(LIZJ) { // from class: X.4lM
            public final int LJLIL;

            {
                this.LJLIL = LIZJ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                GridLayoutManager gridLayoutManager;
                AbstractC028509h abstractC028509h;
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                C0A2 layoutManager = parent.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null || (abstractC028509h = gridLayoutManager.LLIILII) == null) {
                    return;
                }
                int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                int i2 = gridLayoutManager.LLIIIL;
                if (abstractC028509h.LJFF(LJJJJIZL) == 1) {
                    int LJ = abstractC028509h.LJ(LJJJJIZL, i2);
                    int i3 = this.LJLIL;
                    outRect.left = (LJ * i3) / i2;
                    outRect.right = i3 - (((LJ + 1) * i3) / i2);
                    if (abstractC028509h.LIZLLL(LJJJJIZL, i2) > 0) {
                        outRect.top = this.LJLIL;
                    }
                }
            }
        };
    }

    public final List<Aweme> Hl(List<Aweme> list) {
        CCTemplateInfo ccTemplateInfo;
        ArrayList arrayList = new ArrayList();
        if (C79004UzY.LJJIFFI(list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null) {
                if (C224868s6.LIZLLL(aweme) && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
                    ccTemplateInfo.setTemplate_music_id(this.LJLJJI);
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // X.T6F
    public final void N1(String str) {
        this.LJLJJI = str;
        this.LJLLILLLL = false;
    }

    @Override // X.JWG
    /* renamed from: Nl, reason: merged with bridge method [inline-methods] */
    public void vk(AbstractC208618Gr abstractC208618Gr) {
        Aweme aweme;
        C56492MFc c56492MFc;
        List<T> list;
        int indexOf;
        String Jl = Jl();
        if (abstractC208618Gr == null || abstractC208618Gr.LJLIL == null || !C227768wm.LJJI(Jl) || (aweme = abstractC208618Gr.LJLIL) == null || (c56492MFc = this.LLD) == null || (list = c56492MFc.mmItems) == 0 || (indexOf = list.indexOf(aweme)) < 0) {
            return;
        }
        if (!C1041847a.LIZ()) {
            C50918Jyc c50918Jyc = new C50918Jyc();
            if (Jl == null) {
                Jl = "";
            }
            c50918Jyc.LIZLLL = Jl;
            c50918Jyc.LJJI = String.valueOf(indexOf);
            c50918Jyc.LJJ = this.LJLLI;
            c50918Jyc.LJJIFFI = this.LJLJJI;
            c50918Jyc.LJJII = this.LJLL.LJLILLLLZI;
            c50918Jyc.LJIILL(this.LJLILLLLZI, abstractC208618Gr.LJLIL);
            c50918Jyc.LJIILIIL();
        }
        HashMap LIZJ = C03660Ck.LIZJ("enter_from", "challenge");
        LIZJ.put("tag_id", this.LJLJJI);
        C116484hg.LIZIZ(LIZJ, "process_id", this.LJLLI, indexOf, "order");
        LIZJ.put("group_id", abstractC208618Gr.LJLIL.getAid());
        LIZJ.put("parent_tag_id", this.LJLL.LJLILLLLZI);
        C38836FMa.LIZLLL("tag_show_video", LIZJ);
    }

    @Override // X.T6F
    public final void ai(boolean z) {
        this.LLIILZL.put(this.LJLILLLLZI, z);
    }

    public void initArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.LLILIL = bundle.getString("creation_id", "");
        this.LJLILLLLZI = bundle.getInt("detail_aweme_list_type", 0);
        this.LJLJI = bundle.getString("event_label", "");
        this.LJLJJI = bundle.getString("detail_id", "");
        bundle.getString("detail_id", "");
        this.LJLJLLL = bundle.getInt("detail_source_id", 1);
        C56518MGc c56518MGc = (C56518MGc) bundle.getSerializable("detail_config");
        this.LJLL = c56518MGc;
        if (c56518MGc == null) {
            this.LJLL = new C56518MGc(null);
        }
        this.LJLJJLL = bundle.getString("detail_aweme_from", "");
        this.LJLLLLLL = bundle.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LJLJL = bundle.getString("detail_aweme_from_aid", "");
        this.LJLJLJ = bundle.getString("detail_aweme_previous_page_position", "");
        this.LJLLI = bundle.getString("process_id", "");
        bundle.getString("group_id", "");
        this.LJLLILLLL = bundle.getBoolean("extra_challenge_is_hashtag", false);
        this.LLIFFJFJJ = bundle.getString("extra_challenge_hashtag_name", "");
        this.LJLLJ = bundle.getString("top_aweme_ids", "");
        bundle.getString("extra_sticker_from", "");
    }

    @QD3
    public void onAntiCrawlerEvent(QX2 qx2) {
        String str = qx2.LJLIL;
        if (str != null) {
            if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
                EventBus.LIZJ().LIZIZ(qx2);
                refresh();
            }
        }
    }

    @QD3
    public void onBlockUserEvent(C175046tw c175046tw) {
        refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.LLILL != null) {
            int Kl = Kl();
            WrapGridLayoutManager wrapGridLayoutManager = this.LLILL;
            if (wrapGridLayoutManager instanceof WrapGridLayoutManager) {
                wrapGridLayoutManager.LLJLIL(Kl);
                Pl(this.LLILL);
            } else if (wrapGridLayoutManager instanceof SpannedGridLayoutManager) {
                SpannedGridLayoutManager spannedGridLayoutManager = (SpannedGridLayoutManager) wrapGridLayoutManager;
                if (spannedGridLayoutManager.LJZ != Kl && Kl >= 0) {
                    spannedGridLayoutManager.LJZ = Kl;
                    spannedGridLayoutManager.LJZ();
                }
                Pl(this.LLILL);
            }
            this.LJZ.LJJJJZI();
        }
    }

    @QD3
    public void onDynamicEvent(C227498wL c227498wL) {
        if (c227498wL.LJLIL == 0) {
            MFQ mfq = this.LLF;
            if (mfq != null) {
                C38816FLg.LIZLLL(new ARunnableS15S0110000_9(mfq, true, 7), 0);
                return;
            }
            return;
        }
        MFQ mfq2 = this.LLF;
        if (mfq2 == null) {
            return;
        }
        mfq2.LIZ();
    }

    @QD3
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C56492MFc c56492MFc;
        FollowStatus followStatus = followStatusEvent.status;
        if (!isViewValid() || (c56492MFc = this.LLD) == null) {
            return;
        }
        c56492MFc.LJZL(followStatus);
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemDeleted(int i) {
        if (!isViewValid()) {
            return;
        }
        this.LLD.notifyItemRemoved(i);
        if (this.LLD.getBasicItemCount() == 0) {
            this.LJZI.setVisibility(0);
            this.LJZI.LJII();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (((r1 * 1.0f) / r7.getHeight()) > 0.4f) goto L11;
     */
    @X.QD3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceiveVideoEvent(X.C50420Jqa r9) {
        /*
            r8 = this;
            int r0 = r9.LJLIL
            r4 = 21
            if (r0 != r4) goto L39
            java.lang.Object r1 = r9.LJLILLLLZI
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L39
            X.MFc r0 = r8.LLD
            java.util.List<T> r0 = r0.mmItems
            int r5 = r0.indexOf(r1)
            r0 = -1
            if (r5 <= r0) goto L39
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJZ
            X.0A2 r0 = r0.getLayoutManager()
            android.view.View r7 = r0.LJJIJIL(r5)
            r3 = 0
            r6 = 1
            if (r7 != 0) goto L74
        L25:
            com.ss.android.ugc.aweme.detail.DetailViewModel r0 = r8.LJLLLL
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LJLILLLLZI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJZ
            X.0A2 r0 = r0.getLayoutManager()
            X.7Rf r0 = (X.InterfaceC185877Rf) r0
            r0.LJFF(r5, r3)
        L39:
            java.util.List<X.MGb> r0 = r8.LLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldd
            java.lang.Object r3 = r9.LJLILLLLZI
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            r5 = 0
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            if (r3 == 0) goto L5a
            X.MFc r0 = r8.LLD
            java.util.List<T> r0 = r0.mmItems
            int r0 = r0.indexOf(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L5a:
            java.util.List<X.MGb> r0 = r8.LLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r1.next()
            X.MGb r0 = (X.InterfaceC56517MGb) r0
            r0.LIZ(r9)
            goto L62
        L72:
            r3 = r5
            goto L5a
        L74:
            r0 = 2
            int[] r2 = new int[r0]
            r7.getLocationOnScreen(r2)
            android.content.Context r0 = X.EF7.LIZIZ()
            int r1 = X.KL2.LJIIIZ(r0)
            r0 = r2[r6]
            int r1 = r1 - r0
            int r0 = r7.getHeight()
            if (r0 <= 0) goto L25
            float r1 = (float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L25
            goto L39
        L9d:
            int r0 = r9.LJLIL
            if (r0 != r4) goto Lbf
            if (r3 == 0) goto Lbf
            java.util.List<X.MGb> r0 = r8.LLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        Lab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r1 = r2.next()
            X.MGb r1 = (X.InterfaceC56517MGb) r1
            int r0 = r5.intValue()
            r1.LIZJ(r0, r9, r3)
            goto Lab
        Lbf:
            int r1 = r9.LJLIL
            r0 = 66
            if (r1 != r0) goto Ldd
            java.util.List<X.MGb> r0 = r8.LLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        Lcd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r0 = r1.next()
            X.MGb r0 = (X.InterfaceC56517MGb) r0
            r0.LIZIZ(r9)
            goto Lcd
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment.onReceiveVideoEvent(X.Jqa):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable("provider", this.LLILLIZIL);
        }
    }

    @QD3
    public void onVideoEvent(C50420Jqa c50420Jqa) {
        if (c50420Jqa.LJLIL == 2) {
            this.LJLJJL.LJJIIJ(AwemeService.LIZ().i6((String) c50420Jqa.LJLILLLLZI));
            T t = this.LJLJJL.LJLIL;
            if (t instanceof AbstractC51036K1g) {
                this.LLD.setData(((AbstractC51036K1g) t).getItems());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8381057995369194460");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/challenge/ui/DetailAwemeListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/challenge/ui/DetailAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            C56492MFc c56492MFc = this.LLD;
            if (isViewValid() && (recyclerView = this.LJZ) != null && this.LLD != null && !c56492MFc.LJLJL) {
                c56492MFc.LJLJL = true;
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder LJJIZ = this.LJZ.LJJIZ(i);
                    if (LJJIZ instanceof AbstractC208678Gx) {
                        AbstractC208678Gx abstractC208678Gx = (AbstractC208678Gx) LJJIZ;
                        abstractC208678Gx.Y();
                        vk(abstractC208678Gx);
                    }
                }
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/challenge/ui/DetailAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final TuxTextView xl(int i) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.gv);
        tuxTextView.setText(i);
        tuxTextView.setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.acm));
        return tuxTextView;
    }

    @Override // X.T6F
    public final void J4(boolean z, boolean z2) {
        boolean z3;
        KUR kur;
        KUR kur2;
        if (!isViewValid()) {
            return;
        }
        if (this.LLFZ != null) {
            C48027It5.LJII(1, "music", "list");
        }
        if (this.LJZI.getVisibility() == 0 || lh()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!isViewValid()) {
            return;
        }
        if (!z) {
            ai(false);
        }
        this.LLFFF = this.LJLILLLLZI;
        if (this.LJLJJL != null && !TextUtils.isEmpty(this.LJLJJI)) {
            MGV mgv = this.LLILLIZIL;
            if (mgv == null || !mgv.sendCustomRequest(this.LJLJJL, 1)) {
                this.LJLJJL.LJIILL(1, this.LJLJJI, Integer.valueOf(this.LLFFF), Boolean.valueOf(this.LJLLILLLL), this.LJLLJ, Boolean.valueOf(z2), Integer.valueOf(this.LJLJLLL));
            }
            if (!z3 || C227768wm.LJJI(Jl()) || TextUtils.equals("question", Jl()) || TextUtils.equals("library_detail_page", Jl()) || (kur2 = this.LJZI) == null) {
                return;
            }
            kur2.LJIIIZ();
            return;
        }
        if (this.LJLJJL == null || !TextUtils.equals(this.LJLJJLL, "from_duet_mode")) {
            return;
        }
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LJIILL(1);
        }
        if (!z3 || (kur = this.LJZI) == null) {
            return;
        }
        kur.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "Create Grid View Fragment");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.d7o);
        this.LJZ = recyclerView;
        if (ATO.LIZ() && recyclerView != null) {
            recyclerView.setClipToPadding(false);
            recyclerView.setOnApplyWindowInsetsListener(ViewOnApplyWindowInsetsListenerC51182K6w.LIZ);
        }
        RecyclerView recyclerView2 = this.LJZ;
        if (ATO.LIZ() && recyclerView2 != null) {
            recyclerView2.requestApplyInsets();
        }
        this.LJZI = (KUR) view.findViewById(R.id.kf_);
        this.LJZL = (FrameLayout) view.findViewById(R.id.kfc);
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJZI.getLayoutParams();
        layoutParams.topMargin = C63081OpJ.LJIJJLI(getContext(), 80.0f);
        this.LJZI.setLayoutParams(layoutParams);
        if (this.LLILLIZIL == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable instanceof MGV) {
                this.LLILLIZIL = (MGV) serializable;
            }
        }
        this.LJZ.setItemAnimator(null);
        initData();
    }

    public SmartRoute wl(MGX mgx, Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        if (MSAdaptionService.LJIIL().LIZIZ(getContext())) {
            str = "//duo";
        } else {
            str = "aweme://aweme/detail/";
        }
        Bundle arguments = getArguments();
        String str5 = "";
        if (arguments == null) {
            str2 = "";
        } else {
            str2 = arguments.getString("qa_origin_detail_key", "");
        }
        if (arguments == null) {
            str3 = "";
        } else {
            str3 = arguments.getString("shoot_enter_from", "");
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), str);
        buildRoute.withParam("id", aweme.getAid());
        buildRoute.withParam("refer", mgx.LIZJ);
        buildRoute.withParam("previous_page", this.LJLJJLL);
        buildRoute.withParam("shoot_enter_from", str3);
        buildRoute.withParam("extra_previous_page_position", this.LJLJLJ);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
        buildRoute.withParam("video_from", mgx.LIZ);
        int i = this.LJLILLLLZI;
        if (i != 3 && i != 2) {
            str4 = "";
        } else {
            str4 = this.LJLJJLL;
        }
        buildRoute.withParam("video_challenge_profile_from", str4);
        buildRoute.withParam("video_type", this.LJLILLLLZI);
        buildRoute.withParam("profile_enterprise_type", aweme.getEnterpriseType());
        String str6 = this.LJLLI;
        if (str6 != null) {
            str5 = str6;
        }
        buildRoute.withParam("process_id", str5);
        buildRoute.withParam("duo_type", "duo_detail");
        buildRoute.withParam("extra_parent_tag_id", this.LJLL.LJLILLLLZI);
        buildRoute.withParam(mgx.LIZIZ, this.LJLJJI);
        buildRoute.withParam("from_group_id", this.LJLJL);
        buildRoute.withParam("creation_id", this.LLILIL);
        buildRoute.withParam("qa_origin_detail_key", str2);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LJLLLLLL);
        buildRoute.withParam("extra_sticker_from", getArguments().getString("extra_sticker_from"));
        return buildRoute;
    }

    @Override // X.MH9
    public void LLLILZ(View view, Aweme aweme, String str) {
        CCTemplateInfo ccTemplateInfo;
        String str2;
        Integer num;
        String template_music_id;
        String idStr;
        List<T> list;
        int indexOf;
        C56492MFc c56492MFc;
        List<T> list2;
        if (!C6ZT.LIZ(view) && aweme != null && mo49getActivity() != null) {
            MGX mgx = new MGX();
            if ("share_from_resso".equals(this.LJLJJLL)) {
                mgx.LIZJ = "share_from_resso";
            } else {
                mgx.LIZJ = str;
            }
            if (C227768wm.LJJI(Jl()) && (c56492MFc = this.LLD) != null && (list2 = c56492MFc.mmItems) != 0) {
                int indexOf2 = list2.indexOf(aweme);
                if (indexOf2 >= 0) {
                    mgx.LJFF = indexOf2;
                }
                mgx.LJ = this.LJLLI;
                mgx.LIZLLL = this.LJLJJI;
            }
            if (TextUtils.equals("single_song", Jl())) {
                mgx.LJ = this.LJLLI;
                C56492MFc c56492MFc2 = this.LLD;
                if (c56492MFc2 != null && (list = c56492MFc2.mmItems) != 0 && (indexOf = list.indexOf(aweme)) >= 0) {
                    mgx.LJFF = indexOf + 1;
                }
            }
            MGX jumpToVideoParam = this.LLILLIZIL.getJumpToVideoParam(mgx, aweme);
            if (str.equalsIgnoreCase("editing_effect_page")) {
                jumpToVideoParam.LIZJ = "editing_effect_page";
            } else if (str.equalsIgnoreCase("editing_prop_page")) {
                jumpToVideoParam.LIZJ = "editing_prop_page";
            }
            T t = this.LJLJJL.LJLIL;
            if (t != 0) {
                List<Aweme> items = ((AbstractC51036K1g) t).getItems();
                if (items != null) {
                    for (Aweme aweme2 : items) {
                        if (aweme2 != null) {
                            aweme2.setFromRawChallenge(this.LLIIIL);
                        }
                    }
                    ((AbstractC51036K1g) this.LJLJJL.LJLIL).setItems(items);
                }
                C55457Lpd.LJLJJLL = (AbstractC51036K1g) this.LJLJJL.LJLIL;
            }
            SmartRoute wl = wl(jumpToVideoParam, aweme);
            vl(wl, aweme);
            FFL.LJIIIZ().getClass();
            boolean LJ = FFL.LJ(31744, "enable_reuse_external_image", true, false);
            if (view != null && LJ) {
                wl.withBundleAnimation(C020506f.LIZ(view, view.getWidth(), view.getHeight()).LIZLLL());
                wl.withParam("activity_has_activity_options", true);
            }
            this.LLILLIZIL.onJumpToDetail(aweme.getAid());
            String str3 = null;
            if (MSAdaptionService.LJIIL().LIZIZ(getContext())) {
                wl.open(0, new MGY(this));
            } else if (TextUtils.equals(jumpToVideoParam.LIZ, "from_effect_discover_panel")) {
                wl.open(10087, null);
            } else {
                wl.open(10086, new MGZ(this));
            }
            C77125UOr.LJIJ(aweme);
            if ((C224868s6.LIZLLL(aweme) || C224868s6.LIZJ(aweme)) && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
                int indexOf3 = this.LLD.mmItems.indexOf(aweme);
                if (indexOf3 >= 0) {
                    ccTemplateInfo.setTemplateOrder(indexOf3 + 1);
                }
                String str4 = this.LJLJL;
                String str5 = this.LJLJJLL;
                Context context = getContext();
                if (context == null) {
                    return;
                }
                C188727au c188727au = new C188727au();
                String str6 = "";
                if (str4 == null) {
                    str4 = "";
                }
                c188727au.LJIIIZ("group_id", str4);
                CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
                if (ccTemplateInfo2 == null || (str2 = ccTemplateInfo2.getTemplate_id()) == null) {
                    str2 = "";
                }
                c188727au.LJIIIZ("template_id", str2);
                c188727au.LIZLLL(C224868s6.LIZIZ(context) ? 1 : 0, "is_install_lv");
                c188727au.LJIIIZ("enter_from", str5);
                CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
                if (ccTemplateInfo3 != null) {
                    num = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
                } else {
                    num = null;
                }
                c188727au.LJFF(num, "order");
                CCTemplateInfo ccTemplateInfo4 = aweme.getCcTemplateInfo();
                if (ccTemplateInfo4 != null) {
                    str3 = ccTemplateInfo4.getMatch_type();
                }
                c188727au.LJIIIZ("match_type", str3);
                if (C224868s6.LIZJ(aweme)) {
                    Music music = aweme.getMusic();
                    if (music != null && (idStr = music.getIdStr()) != null) {
                        str6 = idStr;
                    }
                    c188727au.LJI("music_id", str6);
                } else {
                    CCTemplateInfo ccTemplateInfo5 = aweme.getCcTemplateInfo();
                    if (ccTemplateInfo5 != null && (template_music_id = ccTemplateInfo5.getTemplate_music_id()) != null) {
                        str6 = template_music_id;
                    }
                    c188727au.LJI("music_id", str6);
                }
                FMX.LJIIL("cc_music_template_click", c188727au.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.akn, viewGroup, false);
        initArguments(getArguments());
        this.LJLLLL = (DetailViewModel) ViewModelProviders.of(mo49getActivity()).get(DetailViewModel.class);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
