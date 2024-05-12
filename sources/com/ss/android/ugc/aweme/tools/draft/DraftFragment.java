package com.ss.android.ugc.aweme.tools.draft;

import X.A21;
import X.AKH;
import X.AbstractC030309z;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass025;
import X.C008901t;
import X.C00F;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C168136in;
import X.C16880lQ;
import X.C169106kM;
import X.C169536l3;
import X.C2068389v;
import X.C221108m2;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C244009hs;
import X.C252709vu;
import X.C26223AQx;
import X.C26227ARb;
import X.C28862BUk;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C41028G8i;
import X.C41413GNd;
import X.C41421GNl;
import X.C41425GNp;
import X.C41426GNq;
import X.C41428GNs;
import X.C42034Gec;
import X.C42278GiY;
import X.C42279GiZ;
import X.C42303Gix;
import X.C45804HyK;
import X.C48841JEv;
import X.C53235Kut;
import X.C5HC;
import X.C60903NvH;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C64962gm;
import X.C68322mC;
import X.C68M;
import X.C71897SJp;
import X.C73305Spp;
import X.C76800UCe;
import X.C78613UtF;
import X.C78948Uye;
import X.C78983UzD;
import X.C83309Wmn;
import X.C90903hW;
import X.C9KF;
import X.EDD;
import X.EXV;
import X.EnumC252729vw;
import X.EnumC42282Gic;
import X.EnumC42283Gid;
import X.EnumC42288Gii;
import X.EnumC58928NAu;
import X.FMX;
import X.GGO;
import X.GLM;
import X.GM7;
import X.GM9;
import X.GMB;
import X.GN4;
import X.GN7;
import X.GNA;
import X.GNB;
import X.GNE;
import X.GNF;
import X.GNH;
import X.GNJ;
import X.GNK;
import X.GNO;
import X.GNP;
import X.GNQ;
import X.GO2;
import X.GOK;
import X.GOU;
import X.GP9;
import X.GPR;
import X.H78;
import X.H7B;
import X.InterfaceC169146kQ;
import X.InterfaceC36571c5;
import X.InterfaceC45540Hu4;
import X.InterfaceC67352kd;
import X.KL2;
import X.LFH;
import X.O6R;
import X.UC0;
import X.V1M;
import X.X1D;
import X.XKX;
import Y.ACListenerS27S0100000_7;
import Y.ALAdapterS5S0200000_7;
import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.tools.draft.music.DraftOnlineMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.IDqS184S0200000_7;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes8.dex */
public class DraftFragment extends AmeBaseLegacyFragment implements GOK, C5HC {
    public ObjectAnimator LJLJI;
    public ObjectAnimator LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public View LJLJL;
    public C252709vu LJLJLJ;
    public C73305Spp LJLJLLL;
    public RecyclerView LJLL;
    public TextView LJLLI;
    public TextView LJLLILLLL;
    public FrameLayout LJLLJ;
    public C83309Wmn LJLLL;
    public C41428GNs LJLLLLLL;
    public boolean LJZ;
    public int LJZI;
    public long LJZL;
    public boolean LL;
    public AKH LLFZ;
    public WrapGridLayoutManager LLIFFJFJJ;
    public boolean LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final String LJLLLL = "draft_page";
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 323));
    public String LLD = "";
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 322));
    public final C64962gm LLFF = C48841JEv.LIZ(C78613UtF.LIZJ);
    public final C64962gm LLFFF = C48841JEv.LIZ(EXV.LIZ);
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 321));
    public boolean LLI = true;
    public Long LLII = 0L;

    public final void Il() {
        this.LLIIII = false;
        C73305Spp c73305Spp = this.LJLJLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        } else {
            o.LJIJI("mLoadingLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    public DraftViewModel Dl() {
        return (DraftViewModel) this.LJLZ.getValue();
    }

    public final void Ml() {
        String str = this.LLD;
        if (str == null || str.length() == 0) {
            H78.LIZ("DraftFragment -> updateDraft: operatedDraftCreationId is null or empty");
        } else {
            XKX.LIZLLL(this.LLFFF, null, null, new GNQ(this, null), 3);
        }
    }

    @Override // X.GOK
    public final void d4() {
        XKX.LIZLLL(this.LLFF, null, null, new GLM(this, null), 3);
    }

    public String getEnterFrom() {
        if (this.LJLJJL) {
            return "storage_management";
        }
        return "personal_homepage";
    }

    public final void vl() {
        this.LJLJJLL = !this.LJLJJLL;
        Xg0();
        DraftViewModel Dl = Dl();
        Dl.LJZL = false;
        Dl.LJLLLLLL.setValue(Boolean.TRUE);
        Dl.LLF.setValue(0L);
        Dl.LJZ.setValue(0);
        ((HashSet) Dl.LJLJI).clear();
        ((HashSet) Dl.LJLILLLLZI).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jl() {
        int i;
        long j;
        DraftViewModel Dl = Dl();
        String enterFrom = getEnterFrom();
        String pageType = Al();
        Dl.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(pageType, "pageType");
        Boolean bool = (Boolean) Dl.LJLZ.getValue();
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C244009hs.LIZ(enterFrom, pageType, linkedHashMap);
            FMX.LJIIL("select_all_draft", linkedHashMap);
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C244009hs.LIZ(enterFrom, pageType, linkedHashMap2);
            FMX.LJIIL("deselect_all_draft", linkedHashMap2);
        }
        ((HashSet) Dl.LJLILLLLZI).clear();
        ((HashSet) Dl.LJLJI).clear();
        Iterator it = ((ArrayList) Dl.LJLJJI).iterator();
        while (it.hasNext()) {
            C41426GNq c41426GNq = (C41426GNq) it.next();
            if (c41426GNq instanceof C41425GNp) {
                ((C41425GNp) c41426GNq).LJIIIZ = booleanValue;
            }
        }
        Dl.LJZL = booleanValue;
        Dl.LL.LJII(C76800UCe.LIZ);
        Dl.LJLLLLLL.setValue(Boolean.valueOf(!booleanValue));
        MutableLiveData<Integer> mutableLiveData = Dl.LJZ;
        if (booleanValue) {
            i = Dl.LJLLJ;
        } else {
            i = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
        if (Dl.LJLLL) {
            MutableLiveData<Long> mutableLiveData2 = Dl.LLF;
            if (booleanValue) {
                j = Dl.LJLLLL;
            } else {
                j = 0;
            }
            mutableLiveData2.setValue(Long.valueOf(j));
        }
    }

    public final void Kl() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C26227ARb LIZ = C3AW.LIZ(requireContext);
        LIZ.LJFF(null);
        LIZ.LIZIZ(requireContext().getResources().getQuantityString(R.plurals.dj, 1));
        UC0.LIZJ(LIZ, new AqS173S0100000_7(this, 178));
        LIZ.LJI().LIZLLL();
    }

    public final void Ll() {
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && mo49getActivity.isFinishing()) {
                return;
            }
            String enterFrom = getEnterFrom();
            o.LJIIIZ(enterFrom, "enterFrom");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", enterFrom);
            FMX.LJIIL("show_posted_draft_offline_notice", linkedHashMap);
            AKH akh = new AKH(this);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_exclamation_mark_circle;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
            akh.LIZ.LJ = getString(R.string.q8q);
            int LIZJ = (int) KL2.LIZJ(requireContext(), 24.0f);
            A21 a21 = akh.LIZ;
            a21.LJIIIIZZ = LIZJ;
            a21.LIZJ = false;
            a21.LJIIIZ = 0;
            this.LLFZ = akh;
            akh.LIZIZ();
            GO2.LIZ.getClass();
            GO2.LIZJ.storeBoolean("posted_draft_remind_feature_offline", false);
        }
    }

    public final void Xg0() {
        String string;
        if (getContext() == null) {
            return;
        }
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIJ("back", new AqS173S0100000_7(this, 174));
            C252709vu c252709vu2 = this.LJLJLJ;
            if (c252709vu2 != null) {
                c252709vu2.LJIJ("select", new AqS173S0100000_7(this, 175));
                C252709vu c252709vu3 = this.LJLJLJ;
                if (c252709vu3 != null) {
                    c252709vu3.LJIJ("select_all", new AqS173S0100000_7(this, 176));
                    if (!C26223AQx.LIZ()) {
                        C252709vu c252709vu4 = this.LJLJLJ;
                        if (c252709vu4 != null) {
                            C9KF c9kf = new C9KF();
                            if (this.LJLJJLL) {
                                string = "";
                            } else {
                                string = getString(R.string.eyq);
                                o.LJIIIIZZ(string, "getString(R.string.draft_box_new)");
                            }
                            c9kf.LIZJ = string;
                            c252709vu4.LJIILLIIL(c9kf);
                        } else {
                            o.LJIJI("mTitleBar");
                            throw null;
                        }
                    } else {
                        C252709vu c252709vu5 = this.LJLJLJ;
                        if (c252709vu5 != null) {
                            c252709vu5.LJIJ("settings", new AqS173S0100000_7(this, 177));
                        } else {
                            o.LJIJI("mTitleBar");
                            throw null;
                        }
                    }
                    if (!this.LJLJJLL) {
                        Gl(null);
                    } else {
                        AKH akh = this.LLFZ;
                        if (akh != null) {
                            akh.LIZ();
                        }
                        this.LLFZ = null;
                    }
                    C41428GNs c41428GNs = this.LJLLLLLL;
                    if (c41428GNs != null) {
                        c41428GNs.LJLJJLL = this.LJLJJLL;
                        c41428GNs.notifyDataSetChanged();
                        return;
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
                o.LJIJI("mTitleBar");
                throw null;
            }
            o.LJIJI("mTitleBar");
            throw null;
        }
        o.LJIJI("mTitleBar");
        throw null;
    }

    public final void initData() {
        boolean z;
        V1M.LJLIL = System.currentTimeMillis();
        C73305Spp c73305Spp = this.LJLJLLL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLJLLL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                this.LJZI = 0;
                DraftViewModel Dl = Dl();
                ((ArrayList) Dl.LJLJJI).clear();
                ((Map) Dl.LJLJLLL.LIZ).clear();
                DraftViewModel Dl2 = Dl();
                if (((ArrayList) Dl2.LJLJJI).isEmpty()) {
                    if (Dl2.jv0() == GP9.POSTED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((ArrayList) Dl2.LJLJJI).add(new GNK(z));
                    ((ArrayList) Dl2.LJLJJI).add(new GN7(0));
                    ((ArrayList) Dl2.LJLJJI).add(new GNJ());
                }
                Dl2.LLFII.LJII(Dl2.LJLJJI);
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new GN4(this, null), 3);
                IDraftListener iDraftListener = (IDraftListener) this.LLF.getValue();
                if (iDraftListener != null) {
                    C60903NvH.LJIIJJI().LJJJI().LIZ().registerListener(iDraftListener);
                    return;
                }
                return;
            }
            o.LJIJI("mLoadingLayout");
            throw null;
        }
        o.LJIJI("mLoadingLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC36571c5 requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
        ((InterfaceC45540Hu4) requireActivity).unRegisterActivityOnKeyDownListener(this);
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment, com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LJLJI;
        if (objectAnimator != null) {
            C16880lQ.LJLJJLL(objectAnimator);
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LJLJJI;
        if (objectAnimator2 != null) {
            C16880lQ.LJLJJLL(objectAnimator2);
            objectAnimator2.cancel();
        }
        this.LLD = "";
        AKH akh = this.LLFZ;
        if (akh != null) {
            akh.LIZ();
        }
        this.LLFZ = null;
        IDraftListener iDraftListener = (IDraftListener) this.LLF.getValue();
        if (iDraftListener != null) {
            C60903NvH.LJIIJJI().LJJJI().LIZ().unregisterListener(iDraftListener);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" refreshDraft : ");
        LIZ.append(C60903NvH.LJIIJJI().LJJJI().LJIILIIL());
        LIZ.append(", firstSaveTime : ");
        LIZ.append(GNP.LIZ());
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        if (GNH.LIZ()) {
            return;
        }
        if (!C60903NvH.LJIIJJI().LJJJI().LJIILIIL() || this.LLD.length() == 0) {
            C60903NvH.LJIIJJI().LJJJI().LJIIIZ(false);
            return;
        }
        C60903NvH.LJIIJJI().LJJJI().LJIIIZ(false);
        if (!GNP.LIZ() || C26223AQx.LIZ()) {
            ((Map) Dl().LJLJLLL.LIZ).clear();
            C41428GNs c41428GNs = this.LJLLLLLL;
            if (c41428GNs != null) {
                ((ArrayList) c41428GNs.LJLJJL).clear();
                c41428GNs.notifyDataSetChanged();
                initData();
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        Ml();
    }

    public void wl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public String Al() {
        return this.LJLLLL;
    }

    public final void Gl(View view) {
        FrameLayout frameLayout = this.LJLLJ;
        if (frameLayout != null) {
            if (frameLayout.getVisibility() == 8) {
                if (view == null) {
                    return;
                }
                view.setEnabled(true);
                return;
            }
            FrameLayout frameLayout2 = this.LJLLJ;
            if (frameLayout2 != null) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout2, "translationY", frameLayout2.getMeasuredHeight()).setDuration(200L);
                duration.addListener(new ALAdapterS5S0200000_7(this, view, 0));
                duration.start();
                this.LJLJI = duration;
                return;
            }
            o.LJIJI("mLayoutDelete");
            throw null;
        }
        o.LJIJI("mLayoutDelete");
        throw null;
    }

    public final void Hl(List<? extends C41426GNq> list) {
        if (Dl().LJLLJ == 0) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C41413GNd) {
                    if (next != null) {
                        C252709vu c252709vu = this.LJLJLJ;
                        if (c252709vu != null) {
                            c252709vu.LJIJ("select", GNE.LJLIL);
                            return;
                        } else {
                            o.LJIJI("mTitleBar");
                            throw null;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C68M.LJIIJ().LJIJ(mo49getActivity());
        initData();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity");
        ((DraftBoxActivity) mo49getActivity).LJLJJLL.LIZLLL(this, new AObjectS86S0100000_7(this, 255));
        Dl().LJLJJL.observe(this, new AObserverS75S0100000_7(this, 113));
        Dl().LJLJJLL.observe(this, new AObserverS75S0100000_7(this, 114));
        Dl().LJLJL.observe(this, new AObserverS75S0100000_7(this, 115));
        Dl().LJLL.observe(this, new AObserverS75S0100000_7(this, 116));
        Dl().LJLJLJ.observe(this, new AObserverS75S0100000_7(this, 117));
        Dl().LJLZ.observe(this, new AObserverS75S0100000_7(this, 118));
        Dl().LJZI.observe(this, new AObserverS75S0100000_7(this, 119));
        Dl().LLD.LIZLLL(this, new AObjectS86S0100000_7(this, 256));
        Dl().LLFF.observe(this, new AObserverS75S0100000_7(this, 112));
        Dl().LLFFF.LIZLLL(this, new AObjectS86S0100000_7(this, 252));
        Dl().LLFZ.LIZLLL(this, new AObjectS86S0100000_7(this, 253));
        GO2.LIZ.getClass();
        GO2.LIZIZ.LIZLLL(this, new AObjectS86S0100000_7(this, 254));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        WrapGridLayoutManager wrapGridLayoutManager = this.LLIFFJFJJ;
        if (wrapGridLayoutManager != null) {
            wrapGridLayoutManager.LLJLIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                recyclerView.LJJJJZI();
                return;
            } else {
                o.LJIJI("mListView");
                throw null;
            }
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLJJL = arguments.getBoolean("is_disk_manage_mode", false);
            DraftViewModel Dl = Dl();
            boolean z = this.LJLJJL;
            Dl.LJLLL = z;
            if (z) {
                XKX.LIZLLL(Dl.LLI, null, null, new EDD(Dl, null), 3);
            }
        }
        this.LJLLL = new C83309Wmn(this);
        V1M.LJLJJI = true;
        this.LJZL = System.currentTimeMillis();
        InterfaceC36571c5 requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
        ((InterfaceC45540Hu4) requireActivity).registerActivityOnKeyDownListenerHead(this);
    }

    @Override // X.GOK
    public final void Ma(int i, C41425GNp c41425GNp) {
        Lifecycle.State state;
        Lifecycle lifecycle;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (lifecycle = mo49getActivity.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED && mo49getActivity != null) {
            this.LLII = Long.valueOf(System.currentTimeMillis());
            this.LLIIII = true;
            C73305Spp c73305Spp = this.LJLJLLL;
            if (c73305Spp != null) {
                c73305Spp.LJFF();
                C73305Spp c73305Spp2 = this.LJLJLLL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DraftFragment -> onClick: position ");
                    LIZ.append(i);
                    LIZ.append(", draftId ");
                    LIZ.append(c41425GNp.LJ);
                    H78.LIZ(X1D.LIZIZ(LIZ));
                    XKX.LIZLLL(this.LLFFF, null, null, new GM7(this, c41425GNp, null), 3);
                    return;
                }
                o.LJIJI("mLoadingLayout");
                throw null;
            }
            o.LJIJI("mLoadingLayout");
            throw null;
        }
    }

    public final Object Nl(Context context, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object mv0 = Dl().mv0(new C41421GNl(this.LJZI, Dl().LJLLILLLL), context, interfaceC67352kd);
        if (mv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return mv0;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Il();
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            Gl(null);
            Xg0();
            return true;
        }
        wl();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View LJIIZILJ = h0.LJIIZILJ(R.id.l_2, view);
        o.LJIIIIZZ(LJIIZILJ, "requireViewById(rootView, R.id.title_bar)");
        this.LJLJLJ = (C252709vu) LJIIZILJ;
        View LJIIZILJ2 = h0.LJIIZILJ(R.id.kej, view);
        o.LJIIIIZZ(LJIIZILJ2, "requireViewById(rootView, R.id.status_bar)");
        this.LJLJL = LJIIZILJ2;
        View LJIIZILJ3 = h0.LJIIZILJ(R.id.cgd, view);
        o.LJIIIIZZ(LJIIZILJ3, "requireViewById(rootView…draft_box_loading_layout)");
        this.LJLJLLL = (C73305Spp) LJIIZILJ3;
        View LJIIZILJ4 = h0.LJIIZILJ(R.id.isn, view);
        o.LJIIIIZZ(LJIIZILJ4, "requireViewById(rootView, R.id.recycler_view)");
        this.LJLL = (RecyclerView) LJIIZILJ4;
        View LJIIZILJ5 = h0.LJIIZILJ(R.id.m4f, view);
        o.LJIIIIZZ(LJIIZILJ5, "requireViewById(rootView, R.id.tv_delete)");
        this.LJLLI = (TextView) LJIIZILJ5;
        if (this.LJLJJL) {
            View LJIIZILJ6 = h0.LJIIZILJ(R.id.m79, view);
            o.LJIIIIZZ(LJIIZILJ6, "requireViewById(rootView, R.id.tv_freeup_size)");
            TextView textView = (TextView) LJIIZILJ6;
            this.LJLLILLLL = textView;
            textView.setVisibility(0);
            TextView textView2 = this.LJLLILLLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                o.LJIJI("mFreeupSize");
                throw null;
            }
        }
        View LJIIZILJ7 = h0.LJIIZILJ(R.id.fhs, view);
        o.LJIIIIZZ(LJIIZILJ7, "requireViewById(rootView, R.id.layout_delete)");
        FrameLayout frameLayout = (FrameLayout) LJIIZILJ7;
        this.LJLLJ = frameLayout;
        if (this.LJLJJL) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS27S0100000_7(this, 168));
        }
        if (this.LJLJJL) {
            FrameLayout frameLayout2 = this.LJLLJ;
            if (frameLayout2 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.height = O6R.LJJIIZ(KL2.LIZJ(getContext(), 60.0f));
                FrameLayout frameLayout3 = this.LJLLJ;
                if (frameLayout3 != null) {
                    frameLayout3.setLayoutParams(layoutParams2);
                } else {
                    o.LJIJI("mLayoutDelete");
                    throw null;
                }
            } else {
                o.LJIJI("mLayoutDelete");
                throw null;
            }
        } else {
            TextView textView3 = this.LJLLI;
            if (textView3 != null) {
                ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 17;
                layoutParams4.topMargin = 0;
                TextView textView4 = this.LJLLI;
                if (textView4 != null) {
                    textView4.setLayoutParams(layoutParams4);
                } else {
                    o.LJIJI("mDeleteTv");
                    throw null;
                }
            } else {
                o.LJIJI("mDeleteTv");
                throw null;
            }
        }
        if (C26223AQx.LIZ()) {
            C252709vu c252709vu = this.LJLJLJ;
            if (c252709vu != null) {
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
                LIZJ.LIZIZ = "back";
                LIZJ.LIZIZ(new AqS157S0100000_7(this, 637));
                c235119Kp.LIZLLL(LIZJ);
                C234509Ig c234509Ig = new C234509Ig();
                String string = getString(R.string.q90);
                o.LJIIIIZZ(string, "getString(R.string.save_draft_postdraft_select)");
                c234509Ig.LIZJ = string;
                EnumC252729vw enumC252729vw = EnumC252729vw.SECONDARY;
                c234509Ig.LIZ(enumC252729vw);
                c234509Ig.LIZIZ = "select_all";
                c234509Ig.LJFF = false;
                c234509Ig.LIZ = new C109824Ss(new AqS157S0100000_7(this, 638));
                c235119Kp.LIZLLL(c234509Ig);
                C234509Ig c234509Ig2 = new C234509Ig();
                String string2 = getString(R.string.byo);
                o.LJIIIIZZ(string2, "getString(string.av_draft_box_select)");
                c234509Ig2.LIZJ = string2;
                c234509Ig2.LIZLLL = enumC252729vw;
                c234509Ig2.LIZIZ = "select";
                c234509Ig2.LIZ = new C109824Ss(new AqS157S0100000_7(this, 639));
                c235119Kp.LIZIZ(c234509Ig2);
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_gear;
                LIZJ2.LIZIZ = "settings";
                LIZJ2.LIZIZ(new AqS157S0100000_7(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
                c235119Kp.LIZIZ(LIZJ2);
                c252709vu.setNavActions(c235119Kp);
            } else {
                o.LJIJI("mTitleBar");
                throw null;
            }
        } else {
            C252709vu c252709vu2 = this.LJLJLJ;
            if (c252709vu2 != null) {
                C235119Kp c235119Kp2 = new C235119Kp();
                C234529Ii LIZJ3 = s1.LIZJ();
                LIZJ3.LIZJ = R.raw.icon_arrow_left_ltr;
                LIZJ3.LIZIZ = "back";
                LIZJ3.LIZIZ(new AqS157S0100000_7(this, 634));
                c235119Kp2.LIZLLL(LIZJ3);
                C234509Ig c234509Ig3 = new C234509Ig();
                String string3 = getString(R.string.q90);
                o.LJIIIIZZ(string3, "getString(R.string.save_draft_postdraft_select)");
                c234509Ig3.LIZJ = string3;
                EnumC252729vw enumC252729vw2 = EnumC252729vw.SECONDARY;
                c234509Ig3.LIZ(enumC252729vw2);
                c234509Ig3.LIZIZ = "select_all";
                c234509Ig3.LJFF = false;
                c234509Ig3.LIZ = new C109824Ss(new AqS157S0100000_7(this, 635));
                C9KF LIZLLL = t1.LIZLLL(c235119Kp2, new AbstractC234519Ih[]{c234509Ig3});
                CharSequence text = getText(R.string.eyq);
                o.LJIIIIZZ(text, "getText(string.draft_box_new)");
                LIZLLL.LIZJ = text;
                c235119Kp2.LIZJ = LIZLLL;
                C234509Ig c234509Ig4 = new C234509Ig();
                String string4 = getString(R.string.byo);
                o.LJIIIIZZ(string4, "getString(string.av_draft_box_select)");
                c234509Ig4.LIZJ = string4;
                c234509Ig4.LIZLLL = enumC252729vw2;
                c234509Ig4.LIZIZ = "select";
                c234509Ig4.LIZ = new C109824Ss(new AqS157S0100000_7(this, 636));
                c235119Kp2.LIZIZ(c234509Ig4);
                c235119Kp2.LIZLLL = true;
                c252709vu2.setNavActions(c235119Kp2);
            } else {
                o.LJIJI("mTitleBar");
                throw null;
            }
        }
        TextView textView5 = this.LJLLI;
        if (textView5 != null) {
            C16880lQ.LJIJI(textView5, new ACListenerS27S0100000_7(this, 167));
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                View view2 = this.LJLJL;
                if (view2 != null) {
                    view2.getLayoutParams().height = C63081OpJ.LJJJJLI(mo49getActivity);
                } else {
                    o.LJIJI("mStatusBar");
                    throw null;
                }
            }
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
                mo49getActivity();
                WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0), 0);
                this.LLIFFJFJJ = wrapGridLayoutManager;
                RecyclerView recyclerView2 = this.LJLL;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(wrapGridLayoutManager);
                    RecyclerView recyclerView3 = this.LJLL;
                    if (recyclerView3 != null) {
                        final int LIZJ4 = (int) KL2.LIZJ(getContext(), 1.0f);
                        recyclerView3.LJII(new AbstractC030309z(LIZJ4) { // from class: X.4Dj
                            public final int LJLIL;

                            {
                                this.LJLIL = LIZJ4;
                            }

                            @Override // X.AbstractC030309z
                            public final void LJ(Rect outRect, View view3, RecyclerView parent, C0AC state) {
                                GridLayoutManager gridLayoutManager;
                                C1BU c1bu;
                                o.LJIIIZ(outRect, "outRect");
                                o.LJIIIZ(view3, "view");
                                o.LJIIIZ(parent, "parent");
                                o.LJIIIZ(state, "state");
                                C0A2 layoutManager = parent.getLayoutManager();
                                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                                    return;
                                }
                                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                                if (!(layoutParams5 instanceof C1BU) || (c1bu = (C1BU) layoutParams5) == null) {
                                    return;
                                }
                                int i = gridLayoutManager.LLIIIL;
                                if (1 == c1bu.LJLILLLLZI) {
                                    int i2 = c1bu.LJLIL;
                                    int i3 = this.LJLIL;
                                    outRect.left = (i2 * i3) / i;
                                    outRect.right = i3 - (((i2 + 1) * i3) / i);
                                    outRect.top = i3;
                                }
                            }
                        }, -1);
                        WrapGridLayoutManager wrapGridLayoutManager2 = this.LLIFFJFJJ;
                        if (wrapGridLayoutManager2 != null) {
                            V1M.LJLJI = wrapGridLayoutManager2.LJJJI();
                            C41428GNs c41428GNs = new C41428GNs(this, Dl().LJLJLLL, new GNB(this), new AqS157S0100000_7(this, 641));
                            this.LJLLLLLL = c41428GNs;
                            c41428GNs.LJLJL = this.LJLJJL;
                            RecyclerView recyclerView4 = this.LJLL;
                            if (recyclerView4 != null) {
                                recyclerView4.setAdapter(c41428GNs);
                                RecyclerView recyclerView5 = this.LJLL;
                                if (recyclerView5 != null) {
                                    WrapGridLayoutManager wrapGridLayoutManager3 = this.LLIFFJFJJ;
                                    if (wrapGridLayoutManager3 != null) {
                                        recyclerView5.LJIIJJI(new GNA(this, wrapGridLayoutManager3));
                                        if (e1.LIZ(31744, "enable_debug_draft_copy", true, false)) {
                                            C60903NvH.LJIIJJI().LJJIIJ();
                                        }
                                        View view3 = getView();
                                        if (view3 != null) {
                                            view3.post(new ARunnableS43S0100000_7(this, UserLevelGeckoUpdateSetting.DEFAULT));
                                            return;
                                        }
                                        return;
                                    }
                                    o.LJIJI("layoutManager");
                                    throw null;
                                }
                                o.LJIJI("mListView");
                                throw null;
                            }
                            o.LJIJI("mListView");
                            throw null;
                        }
                        o.LJIJI("layoutManager");
                        throw null;
                    }
                    o.LJIJI("mListView");
                    throw null;
                }
                o.LJIJI("mListView");
                throw null;
            }
            o.LJIJI("mListView");
            throw null;
        }
        o.LJIJI("mDeleteTv");
        throw null;
    }

    @Override // X.GOK
    public final void sl(View view, C41425GNp c41425GNp) {
        String str;
        o.LJIIIZ(view, "view");
        if (C00F.LIZ(31744, 0, "studio_long_press_to_select_draft", true) == 1) {
            vl();
            str = "select";
        } else {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "v.context");
            GNF gnf = new GNF(context);
            CharSequence[] charSequenceArr = {view.getContext().getResources().getString(R.string.bym)};
            GM9 gm9 = new GM9(this, view, c41425GNp);
            AnonymousClass025 anonymousClass025 = gnf.LIZ;
            GNO gno = new GNO(context, charSequenceArr);
            C008901t c008901t = anonymousClass025.LIZ;
            c008901t.LJIILLIIL = gno;
            c008901t.LJIIZILJ = gm9;
            gnf.LIZ.LJ();
            str = "delete";
        }
        XKX.LIZLLL(this.LLFF, null, null, new GMB(this, c41425GNp, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xl(X.C41425GNp r15, X.InterfaceC67352kd<? super java.lang.String> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.GMC
            if (r0 == 0) goto L8f
            r7 = r3
            X.GMC r7 = (X.GMC) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L14:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L95
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r8 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJI
            java.lang.String r0 = r0.newDraftId
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.GNg r0 = r0.LJJJI()
            X.GNh r1 = r0.LIZJ()
            X.GLf r0 = new X.GLf
            com.ss.android.ugc.aweme.creative.CreativeInfo r8 = new com.ss.android.ugc.aweme.creative.CreativeInfo
            java.lang.String r9 = r15.LJ
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            r0.<init>(r8, r10)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r8 = r1.LJ(r0)
            if (r8 != 0) goto L51
            java.lang.String r0 = ""
            return r0
        L51:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJI
            java.lang.String r0 = r0.newDraftId
            int r0 = r0.length()
            if (r0 != 0) goto L24
            java.lang.String r1 = X.C43081GvV.LIZ()
            java.lang.String r0 = "newDraftId"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJI
            r0.getClass()
            r0.newDraftId = r1
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.GNg r0 = r0.LJJJI()
            X.GMi r4 = r0.LJFF()
            X.NDG r3 = new X.NDG
            X.GLI r2 = new X.GLI
            java.lang.String r1 = "DraftEditHelper"
            r0 = 7
            r2.<init>(r1, r0)
            r3.<init>(r8, r2)
            r7.LJLIL = r8
            r7.LJLJJI = r5
            java.lang.Object r0 = r4.LIZLLL(r3, r7)
            if (r0 != r6) goto L24
            return r6
        L8f:
            X.GMC r7 = new X.GMC
            r7.<init>(r14, r3)
            goto L14
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFragment.xl(X.GNp, X.2kd):java.lang.Object");
    }

    @Override // X.GOK
    public final void M0(C71897SJp c71897SJp, C41425GNp c41425GNp, boolean z) {
        boolean z2;
        int intValue;
        long longValue;
        DraftViewModel Dl = Dl();
        Dl.getClass();
        c41425GNp.LJIIIZ = z;
        if (Dl.LJZL) {
            if (z) {
                ((HashSet) Dl.LJLJI).remove(c41425GNp);
            } else {
                ((HashSet) Dl.LJLJI).add(c41425GNp);
            }
            Dl.nv0(!((HashSet) Dl.LJLJI).isEmpty());
        } else {
            if (z) {
                ((HashSet) Dl.LJLILLLLZI).add(c41425GNp);
            } else {
                ((HashSet) Dl.LJLILLLLZI).remove(c41425GNp);
            }
            if (((HashSet) Dl.LJLILLLLZI).size() != Dl.LJLLJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            Dl.nv0(z2);
        }
        MutableLiveData<Integer> mutableLiveData = Dl.LJZ;
        Integer value = mutableLiveData.getValue();
        if (value == null) {
            value = 0;
        }
        if (z) {
            intValue = value.intValue() + 1;
        } else {
            intValue = value.intValue() - 1;
        }
        mutableLiveData.setValue(Integer.valueOf(intValue));
        if (Dl.LJLLL) {
            MutableLiveData<Long> mutableLiveData2 = Dl.LLF;
            Long value2 = mutableLiveData2.getValue();
            if (value2 == null) {
                value2 = 0L;
            }
            if (z) {
                longValue = value2.longValue() + c41425GNp.LJI;
            } else {
                longValue = value2.longValue() - c41425GNp.LJI;
            }
            mutableLiveData2.setValue(Long.valueOf(longValue));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awd, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(getReso…yout(), container, false)");
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.Gy3] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog, T] */
    @Override // X.GOK
    public final void x7(View view, Context context, String creationId) {
        InterfaceC169146kQ interfaceC169146kQ;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creationId, "creationId");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        DraftViewModel Dl = Dl();
        Dl.getClass();
        AwemeDraft LIZ = Dl.LJLJLLL.LIZ(creationId);
        if (LIZ == null) {
            H78.LIZ("createNewVideo -> draft is null");
            C78983UzD.LJIILL("queryNull -> createNewVideo");
            return;
        }
        AVMusic aVMusic = LIZ.LIZLLL;
        if (aVMusic != null) {
            aVMusic.ignoreReuseAudio = false;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(mo49getActivity);
        o.LJI(LJJIFFI);
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        if (C41028G8i.LIZ()) {
            C42279GiZ c42279GiZ = C42279GiZ.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            String string = LJJIFFI.getString(R.string.rjz);
            o.LJIIIIZZ(string, "activity.getString(R.string.ss_loading)");
            creativeLoadingDialogBuilder.loadingMessage(string);
            creativeLoadingDialogBuilder.clickCancelListener(C169536l3.LJLIL);
            ?? createLoadingDialog = c42279GiZ.createLoadingDialog(LJJIFFI, 1016, creativeLoadingDialogBuilder);
            c68322mC.element = createLoadingDialog;
            ((C42278GiY) createLoadingDialog).delayShow(C42279GiZ.LIZ());
        } else {
            GOU cancel = GOU.LJLIL;
            o.LJIIIZ(cancel, "cancel");
            c68322mC2.element = C42034Gec.LIZJ(LJJIFFI, EnumC42288Gii.VISIBLE_AFTER_5S, new C28862BUk(cancel));
            C42303Gix.LIZ(1016, GGO.SHOW, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_VISIBLE_5S, null);
        }
        AqS170S0200000_7 aqS170S0200000_7 = new AqS170S0200000_7(LIZ, Dl, 4);
        AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(c68322mC, (C68322mC<CreativeLoadingDialog>) c68322mC2, (C68322mC<ProgressDialog>) Dl, (DraftViewModel) 23);
        AVMusic aVMusic2 = LIZ.LIZLLL;
        if (aVMusic2 == null) {
            interfaceC169146kQ = new C78948Uye();
        } else if (aVMusic2.isLocalMusic()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("draft_music_process, to shoot local music processor path - ");
            LIZ2.append(aVMusic2.path);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            interfaceC169146kQ = new C168136in(LIZ, new IDqS184S0200000_7(aqS96S0300000_7, aqS170S0200000_7, 0));
        } else if (C53235Kut.LIZ() && C169106kM.LIZ(aVMusic2.path)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("draft_music_process, to shoot stream music processor path - ");
            LIZ3.append(aVMusic2.path);
            H7B.LIZ(X1D.LIZIZ(LIZ3));
            DraftStreamMusicProcessor draftStreamMusicProcessor = new DraftStreamMusicProcessor(LIZ, new IDqS184S0200000_7(aqS96S0300000_7, aqS170S0200000_7, 2));
            Lifecycle lifecycle = LJJIFFI.getLifecycle();
            interfaceC169146kQ = draftStreamMusicProcessor;
            if (lifecycle != null) {
                lifecycle.addObserver(draftStreamMusicProcessor);
                interfaceC169146kQ = draftStreamMusicProcessor;
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("draft_music_process, to shoot online music processor path - ");
            LIZ4.append(aVMusic2.path);
            H7B.LIZ(X1D.LIZIZ(LIZ4));
            DraftOnlineMusicProcessor draftOnlineMusicProcessor = new DraftOnlineMusicProcessor(LIZ, new IDqS184S0200000_7(aqS96S0300000_7, aqS170S0200000_7, 1));
            Lifecycle lifecycle2 = LJJIFFI.getLifecycle();
            interfaceC169146kQ = draftOnlineMusicProcessor;
            if (lifecycle2 != null) {
                lifecycle2.addObserver(draftOnlineMusicProcessor);
                interfaceC169146kQ = draftOnlineMusicProcessor;
            }
        }
        interfaceC169146kQ.LIZ();
    }
}
