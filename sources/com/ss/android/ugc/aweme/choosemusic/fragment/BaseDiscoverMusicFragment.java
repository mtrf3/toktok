package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C165706es;
import X.C16880lQ;
import X.C17N;
import X.C2068389v;
import X.C207668Da;
import X.C29S;
import X.C3C5;
import X.C43985HOb;
import X.C44428Hc8;
import X.C52206KeI;
import X.C52908Kpc;
import X.C59859NeR;
import X.C63057Oov;
import X.C65300Pk0;
import X.C72H;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73812v3;
import X.C76800UCe;
import X.C78596Usy;
import X.C84889XTh;
import X.C84935XVb;
import X.C84969XWj;
import X.C84972XWm;
import X.C90903hW;
import X.InterfaceC191547fS;
import X.InterfaceC85024XYm;
import X.KL2;
import X.OGG;
import X.OSZ;
import X.X1D;
import X.XVW;
import X.XX6;
import X.XY4;
import X.XYM;
import X.XZ0;
import Y.AObjectS47S0101000_2;
import Y.AgS115S0200000_15;
import Y.AgS24S1000000_15;
import Y.IDCListenerS10S0101000;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseDiscoverMusicFragment extends AmeBaseFragment implements Observer<C207668Da>, OGG, InterfaceC191547fS {
    public static final /* synthetic */ int LJLLLL = 0;
    public RecyclerView LJLIL;
    public C73305Spp LJLILLLLZI;
    public DataCenter LJLJI;
    public WidgetManager LJLJJI;
    public XX6 LJLJJL;
    public int LJLJJLL;
    public XY4 LJLJL;
    public XZ0 LJLJLJ;
    public C72H<XYM> LJLJLLL;
    public int LJLL;
    public XVW LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public int LJLLL;

    public abstract void showLoadMoreEmpty();

    public abstract void vl(C207668Da c207668Da);

    public abstract void xl();

    public final void LJII() {
        if (this.LJLILLLLZI != null) {
            if (C52908Kpc.LIZ()) {
                this.LJLILLLLZI.setTranslationY(KL2.LIZJ(getContext(), 20.0f));
            }
            this.LJLILLLLZI.setVisibility(0);
            this.LJLILLLLZI.LJFF();
        }
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        XX6 xx6;
        C10K<MusicCollectionFeedResponse> LIZLLL;
        int i = this.LJLL - 2;
        if (i < 0) {
            i = 0;
        }
        XVW xvw = this.LJLLI;
        if (xvw != null) {
            int i2 = this.LJLLL;
            if (!xvw.LJFF) {
                xvw.LJFF = true;
                C44428Hc8 LIZ = C44428Hc8.LIZ();
                if (e1.LIZ(31744, "studio_enable_cache_music_select_page_data", true, false) && !ChooseMusicApi.LIZJ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("collection/feed ");
                    LIZ2.append(i);
                    LIZ2.append(' ');
                    LIZ2.append(10);
                    LIZ2.append(' ');
                    LIZ2.append(i2);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    if (i == 0) {
                        Object LIZ3 = C84889XTh.LIZ(C52206KeI.LIZ(), LIZIZ);
                        if (LIZ3 instanceof MusicCollectionFeedResponse) {
                            C73812v3.LIZ(1, "collection_feed");
                            LIZLLL = C10K.LJIIIZ(LIZ3);
                            o.LJIIIIZZ(LIZLLL, "forResult(response)");
                        } else {
                            C73812v3.LIZ(0, "collection_feed");
                        }
                    }
                    LIZLLL = ChooseMusicApi.LIZLLL(Integer.valueOf(i), 10, i2).LJFF(new AgS24S1000000_15(LIZIZ, 0));
                    o.LJIIIIZZ(LIZLLL, "key = \"collection/feed $…\n            it\n        }");
                } else {
                    LIZLLL = ChooseMusicApi.LIZLLL(Integer.valueOf(i), 10, i2);
                }
                LIZLLL.LJ(new AgS115S0200000_15(xvw, LIZ, 3), C10K.LJIIIIZZ, null);
            }
        }
        if (!isViewValid() || (xx6 = this.LJLJJL) == null) {
            return;
        }
        xx6.showLoadMoreLoading();
    }

    public final C76800UCe wl() {
        C73305Spp c73305Spp;
        if (C52908Kpc.LIZ() && (c73305Spp = this.LJLILLLLZI) != null) {
            c73305Spp.setClickable(false);
            C16880lQ.LJIIJJI(null, this.LJLILLLLZI);
        }
        LJII();
        XVW xvw = this.LJLLI;
        if (xvw != null) {
            xvw.LJIIJJI(this.LJLLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        XX6 xx6 = new XX6(this, this.LJLJJI, this.LJLJI, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLJJLL, this.LJLLL);
        this.LJLJJL = xx6;
        xx6.setLoadMoreListener(this);
        XX6 xx62 = this.LJLJJL;
        xx62.LJLLILLLL = this.LJLLILLLL;
        xx62.LJLLJ = this.LJLLJ;
        int i = 0;
        if (C59859NeR.LIZ()) {
            this.LJLJJL.LJLZ = true;
        } else {
            this.LJLJJL.LJLZ = false;
        }
        this.LJLIL.setOverScrollMode(2);
        RecyclerView recyclerView = this.LJLIL;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.LJLIL.setRecycledViewPool(MusicRecyclerViewPoolViewModel.gv0(getContext()));
        this.LJLIL.setAdapter(this.LJLJJL);
        if (!C59859NeR.LIZ()) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C165706es.LJ(this).get(ChooseMusicWithSceneViewModel.class);
            if (chooseMusicWithSceneViewModel.LJLIL) {
                chooseMusicWithSceneViewModel.iv0().observe(getViewLifecycleOwner(), new C84969XWj(i, this));
            } else {
                new C84972XWm(new InterfaceC85024XYm() { // from class: X.XYX
                    @Override // X.InterfaceC85024XYm
                    public final void LIZ() {
                        BaseDiscoverMusicFragment.this.LJIIJJI();
                    }
                }, 5).LIZ(this.LJLIL);
            }
        } else {
            XVW xvw = this.LJLLI;
            if (xvw != null) {
                xvw.LJIIJJI(this.LJLLL);
            }
        }
        DataCenter dataCenter = this.LJLJI;
        if (dataCenter != null) {
            dataCenter.iv0("list", this, C43985HOb.LIZ());
            dataCenter.iv0("should_load_more_pick", this, false);
            dataCenter.iv0("music_collect_status", this, false);
            dataCenter.iv0("collection_feed_status", this, false);
            dataCenter.iv0("more_tab_refresh_status", this, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Integer num;
        C73306Spq c73306Spq;
        XVW xvw;
        List list;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        str.getClass();
        switch (str.hashCode()) {
            case -1635157503:
                if (!str.equals("music_collect_status")) {
                    return;
                }
                vl(c207668Da2);
                return;
            case 3322014:
                if (!str.equals("list") || (list = (List) this.LJLJI.get("list")) == null || list.size() < 1) {
                    return;
                }
                AVExternalServiceImpl.LIZ().provideAVPerformance().end(OpenMusicPanelPerformanceMonitor.INSTANCE, "set_music_data");
                int itemCount = this.LJLJJL.getItemCount();
                this.LJLL = list.size();
                boolean booleanValue = ((Boolean) this.LJLJI.get("is_busi_sticker", Boolean.FALSE)).booleanValue();
                if ("challenge".equals(this.LJLJI.get("shoot_way", null))) {
                    if (this.LJLJI.get("data_challenge") != null) {
                        XX6 xx6 = this.LJLJJL;
                        xx6.LJLLI = true;
                        xx6.LJLLL = 5;
                    } else {
                        List list2 = (List) this.LJLJI.get("data_sticker", null);
                        if (list2 != null && list2.size() > 0) {
                            XX6 xx62 = this.LJLJJL;
                            xx62.LJLLI = true;
                            xx62.LJLLL = 4;
                        }
                    }
                } else if (booleanValue) {
                    xl();
                } else {
                    List list3 = (List) this.LJLJI.get("data_sticker", null);
                    if (list3 != null && list3.size() > 0) {
                        XX6 xx63 = this.LJLJJL;
                        xx63.LJLLI = true;
                        xx63.LJLLL = 4;
                    } else if (this.LJLJI.get("data_challenge") != null) {
                        XX6 xx64 = this.LJLJJL;
                        xx64.LJLLI = true;
                        xx64.LJLLL = 5;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof C84935XVb) {
                        this.LJLJJL.LJLLLLLL = true;
                    }
                }
                XX6 xx65 = this.LJLJJL;
                ((Boolean) this.LJLJI.get("show_music_radio", Boolean.FALSE)).booleanValue();
                xx65.getClass();
                XX6 xx66 = this.LJLJJL;
                xx66.LJLJL = this.LJLL;
                int itemCount2 = xx66.getItemCount() - itemCount;
                if (itemCount2 > 0) {
                    String str2 = Build.MODEL;
                    if (TextUtils.equals(str2, "Redmi 6A") || TextUtils.equals(str2, "Redmi 6")) {
                        this.LJLJJL.notifyDataSetChanged();
                    } else {
                        this.LJLJJL.notifyItemRangeInserted(itemCount, itemCount2);
                    }
                } else {
                    this.LJLJJL.notifyDataSetChanged();
                }
                if (this.LJLJI.get("collection_feed_has_more") == null) {
                    return;
                }
                if (((Integer) this.LJLJI.get("collection_feed_has_more")).intValue() == 1) {
                    this.LJLJJL.resetLoadMoreState();
                    return;
                } else {
                    showLoadMoreEmpty();
                    return;
                }
            case 510590654:
                if (!str.equals("should_load_more_pick") || (xvw = this.LJLLI) == null) {
                    return;
                }
                xvw.LIZJ(true, null, null, false, this.LJLLL);
                return;
            case 965388522:
                if (!str.equals("more_tab_refresh_status")) {
                    return;
                }
                Integer num2 = (Integer) this.LJLJI.get("more_tab_refresh_status");
                if (num2.intValue() == 0) {
                    if (this.LJLILLLLZI == null) {
                        return;
                    }
                    if (C52908Kpc.LIZ()) {
                        this.LJLILLLLZI.setTranslationY(0.0f);
                    }
                    this.LJLILLLLZI.setVisibility(8);
                    return;
                }
                if (num2.intValue() == 2) {
                    LJII();
                    return;
                }
                C73305Spp c73305Spp = this.LJLILLLLZI;
                if (c73305Spp == null) {
                    return;
                }
                c73305Spp.setVisibility(0);
                if (C52908Kpc.LIZ()) {
                    OSZ LJJI = C78596Usy.LJJI(this.LJLILLLLZI.getContext());
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_large_refresh;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    c73306Spq = new C73306Spq();
                    c73306Spq.LIZJ = 0;
                    c73306Spq.LIZIZ = c2068389v;
                    int LJIILL = C17N.LJIILL(72.0d);
                    int LJIILL2 = C17N.LJIILL(72.0d);
                    c73306Spq.LIZLLL = LJIILL;
                    c73306Spq.LJ = LJIILL2;
                    c73306Spq.LIZJ((String) LJJI.getFirst());
                    c73306Spq.LIZIZ((CharSequence) LJJI.getSecond());
                    C16880lQ.LJIIJJI(new IDCListenerS10S0101000(3, this, 7), this.LJLILLLLZI);
                } else {
                    c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new AObjectS47S0101000_2(0, this, 4));
                }
                this.LJLILLLLZI.setStatus(c73306Spq);
                return;
            case 1110903186:
                if (!str.equals("collection_feed_status") || (num = (Integer) this.LJLJI.get("collection_feed_status")) == null || num.intValue() != 1) {
                    return;
                }
                showLoadMoreEmpty();
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.LJLJJLL = i;
        if (getArguments() != null) {
            i2 = getArguments().getInt("sound_page_scene");
        } else {
            i2 = 0;
        }
        this.LJLLL = i2;
        if (getArguments() == null) {
            this.LJLLILLLL = 0L;
            this.LJLLJ = 0L;
        } else {
            this.LJLLILLLL = getArguments().getLong("max_video_duration", 0L);
            this.LJLLJ = getArguments().getLong("shoot_video_length", 0L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3286435860359164260");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LJLIL == null || !z) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        XX6 xx6 = this.LJLJJL;
        if (xx6 != null) {
            xx6.LJLZ(true);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (C63057Oov.LIZ()) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(requireActivity(), R.style.uw));
        }
        if (C43985HOb.LIZ()) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awc, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awu, viewGroup, false);
        }
        this.LJLIL = (RecyclerView) LLLLIILL.findViewById(R.id.ftt);
        this.LJLILLLLZI = (C73305Spp) LLLLIILL.findViewById(R.id.kf_);
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
}
