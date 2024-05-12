package com.ss.android.ugc.aweme.feed.landscape.component;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C2K0;
import X.C2MA;
import X.C51685KQf;
import X.C55083Ljb;
import X.C55096Ljo;
import X.C56509MFt;
import X.C58492Rh;
import X.C62822Ol8;
import X.C76800UCe;
import X.C80796VnM;
import X.InterfaceC55102Lju;
import X.InterfaceC88472Yns;
import X.M89;
import X.ViewOnTouchListenerC51695KQp;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LandscapeFeedViewPagerComponent extends BasePanelUIComponent implements LandscapeFeedViewPagerAbility, InterfaceC55102Lju {
    public C80796VnM LJLJJI;
    public int LJLJJL;
    public final List<InterfaceC88472Yns<Integer, C76800UCe>> LJLJJLL;
    public C55083Ljb LJLJL;
    public C2MA LJLJLJ;
    public Aweme LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 802344177) {
            return null;
        }
        return this;
    }

    public LandscapeFeedViewPagerComponent() {
        new LinkedHashMap();
        this.LJLJJLL = new ArrayList();
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 338));
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int getCurIndex() {
        C80796VnM c80796VnM = this.LJLJJI;
        if (c80796VnM != null) {
            return c80796VnM.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C2MA getCurViewHolder() {
        int i;
        Object obj;
        int i2;
        View childAt;
        C80796VnM c80796VnM = this.LJLJJI;
        if (c80796VnM != null) {
            i = c80796VnM.getChildCount();
        } else {
            i = 0;
        }
        int i3 = i - 1;
        while (true) {
            C2MA c2ma = null;
            if (-1 >= i3) {
                return null;
            }
            C80796VnM c80796VnM2 = this.LJLJJI;
            if (c80796VnM2 != null && (childAt = c80796VnM2.getChildAt(i3)) != null) {
                obj = childAt.getTag(R.id.d87);
            } else {
                obj = null;
            }
            if (obj instanceof C2MA) {
                c2ma = (C2MA) obj;
            }
            C80796VnM c80796VnM3 = this.LJLJJI;
            if (c80796VnM3 != null) {
                i2 = c80796VnM3.getCurrentItem();
            } else {
                i2 = 0;
            }
            if (v3(i2, c2ma)) {
                return c2ma;
            }
            i3--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int getItemCount() {
        C55083Ljb c55083Ljb = this.LJLJL;
        if (c55083Ljb != null) {
            return c55083Ljb.getCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C2MA getNextViewHolder() {
        int i;
        int i2;
        View childAt;
        C80796VnM c80796VnM = this.LJLJJI;
        if (c80796VnM != null) {
            i = c80796VnM.getChildCount();
        } else {
            i = 0;
        }
        int i3 = i - 1;
        while (true) {
            Object obj = null;
            if (-1 >= i3) {
                return null;
            }
            C80796VnM c80796VnM2 = this.LJLJJI;
            if (c80796VnM2 != null && (childAt = c80796VnM2.getChildAt(i3)) != null) {
                obj = childAt.getTag(R.id.d87);
            }
            if (obj instanceof C2MA) {
                C80796VnM c80796VnM3 = this.LJLJJI;
                if (c80796VnM3 != null) {
                    i2 = c80796VnM3.getCurrentItem();
                } else {
                    i2 = 0;
                }
                C2MA c2ma = (C2MA) obj;
                if (v3(i2 + 1, c2ma)) {
                    return c2ma;
                }
            }
            i3--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C2MA getPreViewHolder() {
        int i;
        C80796VnM c80796VnM;
        Object obj;
        int i2;
        View childAt;
        C80796VnM c80796VnM2 = this.LJLJJI;
        if (c80796VnM2 != null) {
            i = c80796VnM2.getCurrentItem();
        } else {
            i = 0;
        }
        if (i >= 1 && (c80796VnM = this.LJLJJI) != null) {
            for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
                C80796VnM c80796VnM3 = this.LJLJJI;
                if (c80796VnM3 != null && (childAt = c80796VnM3.getChildAt(childCount)) != null) {
                    obj = childAt.getTag(R.id.d87);
                } else {
                    obj = null;
                }
                if (obj instanceof C2MA) {
                    C80796VnM c80796VnM4 = this.LJLJJI;
                    if (c80796VnM4 != null) {
                        i2 = c80796VnM4.getCurrentItem();
                    } else {
                        i2 = 0;
                    }
                    C2MA c2ma = (C2MA) obj;
                    if (v3(i2 - 1, c2ma)) {
                        return c2ma;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final Aweme nx() {
        PagerAdapter pagerAdapter;
        AbstractC55082Lja abstractC55082Lja;
        C80796VnM c80796VnM = this.LJLJJI;
        if (c80796VnM != null) {
            pagerAdapter = c80796VnM.getAdapter();
        } else {
            pagerAdapter = null;
        }
        if (!(pagerAdapter instanceof FullFeedPagerAdapter) || (abstractC55082Lja = (AbstractC55082Lja) pagerAdapter) == null) {
            return null;
        }
        return abstractC55082Lja.getItem(this.LJLJJL);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final Aweme getCurrentPlayAweme() {
        return getAwemeByIndex(getCurIndex());
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C80796VnM lH() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final Aweme getAwemeByIndex(int i) {
        C55083Ljb c55083Ljb = this.LJLJL;
        if (c55083Ljb != null) {
            return c55083Ljb.getItem(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int getIndexByAweme(Aweme aweme) {
        List<Aweme> Q8;
        C55083Ljb c55083Ljb = this.LJLJL;
        if (c55083Ljb != null && (Q8 = c55083Ljb.Q8()) != null) {
            int size = Q8.size();
            for (int i = 0; i < size; i++) {
                if (aweme != null && TextUtils.equals(((Aweme) ListProtector.get(Q8, i)).getAid(), aweme.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C2MA getViewHolderByAwemeId(String str) {
        int i;
        Object obj;
        C2MA c2ma;
        Aweme aweme;
        View childAt;
        C80796VnM c80796VnM = this.LJLJJI;
        int i2 = 0;
        if (c80796VnM != null) {
            i = c80796VnM.getChildCount();
        } else {
            i = 0;
        }
        while (true) {
            String str2 = null;
            if (i2 >= i) {
                return null;
            }
            C80796VnM c80796VnM2 = this.LJLJJI;
            if (c80796VnM2 != null && (childAt = c80796VnM2.getChildAt(i2)) != null) {
                obj = childAt.getTag(R.id.d87);
            } else {
                obj = null;
            }
            if (obj instanceof C2MA) {
                c2ma = (C2MA) obj;
                if (c2ma != null && (aweme = c2ma.getAweme()) != null) {
                    str2 = aweme.getAid();
                }
            } else {
                c2ma = null;
            }
            if (o.LJ(str2, str)) {
                return c2ma;
            }
            i2++;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C80796VnM c80796VnM;
        LandscapeFragmentPanel landscapeFragmentPanel;
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility;
        C58492Rh zl0;
        String str;
        Intent intent;
        String challengeId;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.ncx);
        C55083Ljb c55083Ljb = null;
        if (findViewById instanceof C80796VnM) {
            c80796VnM = (C80796VnM) findViewById;
        } else {
            c80796VnM = null;
        }
        this.LJLJJI = c80796VnM;
        Context context = getContext();
        if (context != null) {
            Fragment fragment = getPanelContext().LJ;
            if (fragment != null && (landscapeFragmentPanel = (LandscapeFragmentPanel) this.LJLL.getValue()) != null && (landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), LandscapeFeedVideoEventDispatcherAbility.class, null)) != null && (zl0 = landscapeFeedVideoEventDispatcherAbility.zl0()) != null) {
                LayoutInflater LLZIL = C16880lQ.LLZIL(getPanelContext().LIZ());
                ViewOnTouchListenerC51695KQp viewOnTouchListenerC51695KQp = new ViewOnTouchListenerC51695KQp();
                BaseFeedPageParams newBuilder = BaseFeedPageParams.Companion.newBuilder();
                boolean z = true;
                newBuilder.setAwemeFromPage(1);
                newBuilder.setEventType(C56509MFt.LJ(getPanelContext()));
                M89 m89 = getPanelContext().LIZJ;
                if (m89 == null) {
                    m89 = new M89();
                }
                newBuilder.setParam(m89);
                newBuilder.setMyProfile(false);
                newBuilder.setFromPostList(false);
                newBuilder.setPageType(C56509MFt.LJFF(getPanelContext()));
                newBuilder.setShowVote(false);
                M89 m892 = getPanelContext().LIZJ;
                String str2 = "";
                if (m892 == null || (str = m892.getCid()) == null) {
                    str = "";
                }
                newBuilder.setCid(str);
                M89 m893 = getPanelContext().LIZJ;
                if (m893 != null && (challengeId = m893.getChallengeId()) != null) {
                    str2 = challengeId;
                }
                newBuilder.setChallengeId(str2);
                ActivityC45651qj LIZ = getPanelContext().LIZ();
                if (LIZ != null && (intent = LIZ.getIntent()) != null) {
                    z = intent.getBooleanExtra("is_original_caption", true);
                }
                newBuilder.setIsOriginalCaption(z);
                c55083Ljb = new C55083Ljb(context, LLZIL, zl0, fragment, viewOnTouchListenerC51695KQp, newBuilder, landscapeFragmentPanel);
            }
            this.LJLJL = c55083Ljb;
        }
        C55083Ljb c55083Ljb2 = this.LJLJL;
        if (c55083Ljb2 != null) {
            c55083Ljb2.LJLLJ = (LandscapeFragmentPanel) this.LJLL.getValue();
        }
        C80796VnM c80796VnM2 = this.LJLJJI;
        if (c80796VnM2 != null) {
            c80796VnM2.setAdapter(this.LJLJL);
        }
        C80796VnM c80796VnM3 = this.LJLJJI;
        if (c80796VnM3 != null) {
            c80796VnM3.LJI(new C51685KQf(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final void Zn(LifecycleOwner lifecycleOwner, final InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        Lifecycle lifecycle;
        ((ArrayList) this.LJLJJLL).add(interfaceC88472Yns);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent$registerOnPageSelectedListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ((ArrayList) LandscapeFeedViewPagerComponent.this.LJLJJLL).remove(interfaceC88472Yns);
                    }
                }
            });
        }
    }

    public final boolean v3(int i, C2MA c2ma) {
        C55083Ljb c55083Ljb;
        if (c2ma == null || (c55083Ljb = this.LJLJL) == null || c55083Ljb.getItem(i) != c2ma.O1()) {
            return false;
        }
        return true;
    }
}
