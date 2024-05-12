package com.ss.android.ugc.feed.platform.fragment;

import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2MA;
import X.C39082FVm;
import X.C51031K1b;
import X.C51781KTx;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5H3;
import X.C62822Ol8;
import X.C8VV;
import X.C8W0;
import X.EnumC221088m0;
import X.InterfaceC55235Lm3;
import X.JAK;
import X.KR8;
import X.KU4;
import X.KUD;
import X.L2H;
import X.ORZ;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;

/* loaded from: classes10.dex */
public abstract class HomeFeedComponent extends FragmentComponent implements IHomeFeedFragmentAbility, IFeedFetchDataAbility {
    public BaseFeedListFragment LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C5H3 LJLJL;
    public IPageStateAbility LJLJLJ;
    public LoadMorePanelComponentTempHelper LJLJLLL;
    public IRefreshAbility LJLL;

    public /* synthetic */ void Lf() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFeedComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 721));
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 722), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 0));
        }
        this.LJLJL = c62822Ol8;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.getViewPagerComponentAbility();
        }
        return null;
    }

    public final Fragment v3() {
        return (Fragment) this.LJLJJLL.getValue();
    }

    public boolean LJIILJJIL() {
        boolean z;
        C51031K1b<?> Qv = Qv();
        if (Qv != null) {
            z = Qv.LJJIFFI();
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean isLoading() {
        C51031K1b<?> Qv = Qv();
        if (Qv != null) {
            return Qv.LJJIFFI();
        }
        return false;
    }

    public C2MA m30() {
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.getCurViewHolder();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy():");
        LIZ.append(this);
        KUD.LIZJ(X1D.LIZIZ(LIZ), null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        if (L2H.LIZ()) {
            x3(v3());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final ILoadMoreAbility PZ() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IPageStateAbility RP() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IRefreshAbility YE() {
        return this.LJLL;
    }

    public final void x3(Fragment fragment) {
        AssemSupervisor LIZIZ;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        if (fragment == null) {
            return;
        }
        if (!L2H.LIZ() && (LIZIZ = C212428Vi.LIZIZ(fragment)) != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof RootPanelComponent) {
                    arrayList.add(next);
                }
            }
            RootPanelComponent rootPanelComponent = (RootPanelComponent) ORZ.LJLLJ(arrayList);
            if (rootPanelComponent != null) {
                C8VV.LIZJ(rootPanelComponent, new AqS140S0200000_9(rootPanelComponent, this, 39));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttach():");
        LIZ.append(this);
        KUD.LIZJ(X1D.LIZIZ(LIZ), null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(fragment, null), this, IFeedFetchDataAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(fragment, null), this, IFeedFragmentAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.FragmentComponent, X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        boolean z;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewCreated():");
        LIZ.append(this);
        IPageStateAbility iPageStateAbility = null;
        KUD.LIZJ(X1D.LIZIZ(LIZ), null);
        if (view != null) {
            Fragment v3 = v3();
            if (v3 != null) {
                this.LJLL = (IRefreshAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IRefreshAbility.class, null);
                LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = new LoadMorePanelComponentTempHelper(v3);
                this.LJLJLLL = loadMorePanelComponentTempHelper;
                loadMorePanelComponentTempHelper.onViewCreated(view, bundle);
                InterfaceC55235Lm3 LJFF = KR8.LJFF(v3);
                if (LJFF != null) {
                    iPageStateAbility = (IPageStateAbility) C55096Ljo.LIZ(LJFF, IPageStateAbility.class, null);
                }
                this.LJLJLJ = iPageStateAbility;
            }
            if (C39082FVm.LIZ()) {
                HashMap hashMap = new HashMap();
                Integer num = 1;
                if (num != null && num.equals(C39082FVm.LIZLLL.LIZ.get("is_preload_main"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    hashMap.put("monitor_scene", "scene_nuj");
                    hashMap.put("vv_code", 2140);
                } else {
                    hashMap.put("monitor_scene", "scene_feed_ui");
                    hashMap.put("vv_code", 3300);
                }
                int i = getPanelContext().LIZLLL;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 9) {
                                    if (i != 31) {
                                        if (i != 32) {
                                            str = "other";
                                        } else {
                                            str = "music_video_feeds";
                                        }
                                    } else {
                                        str = "friends";
                                    }
                                } else {
                                    str = "search";
                                }
                            } else {
                                str = "music";
                            }
                        } else {
                            str = "challenge";
                        }
                    } else {
                        str = "follow";
                    }
                } else {
                    str = "fyp";
                }
                hashMap.put("ui_page", str);
                C39082FVm.LIZJ(hashMap);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
