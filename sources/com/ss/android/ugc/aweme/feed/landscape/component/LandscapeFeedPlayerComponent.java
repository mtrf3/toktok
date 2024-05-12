package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C188727au;
import X.C218678i7;
import X.C221108m2;
import X.C222688oa;
import X.C2K0;
import X.C2MA;
import X.C2TT;
import X.C38450F7e;
import X.C46416IJo;
import X.C56509MFt;
import X.C58272Ql;
import X.C62819Ol5;
import X.C62822Ol8;
import X.FMX;
import X.IDP;
import X.InterfaceC222708oc;
import X.InterfaceC46330IGg;
import X.InterfaceC55102Lju;
import X.M89;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LandscapeFeedPlayerComponent extends BasePanelComponent implements LandscapeFeedPlayerAbility, InterfaceC55102Lju {
    public boolean LJLJJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 64));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 61));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 62));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C58272Ql.LJLIL);
    public final long LJLJJL = System.currentTimeMillis();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 63));

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2020384924) {
            return null;
        }
        return this;
    }

    public final IDP getPlayerController() {
        return (IDP) this.LJLJL.getValue();
    }

    public final InterfaceC46330IGg getPlayerManager() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-playerManager>(...)");
        return (InterfaceC46330IGg) value;
    }

    public final M89 qT() {
        return (M89) this.LJLJI.getValue();
    }

    public final LandscapeFeedViewPagerAbility v3() {
        return (LandscapeFeedViewPagerAbility) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final long Qp() {
        return getPlayerManager().getDuration();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final boolean isPaused() {
        return getPlayerManager().isPaused();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final boolean isPlaying() {
        return getPlayerManager().isPlaying();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        Aweme aweme;
        String str;
        String str2;
        User author;
        super.onDestroy();
        getPlayerController().LJIJ(false);
        IDP playerController = getPlayerController();
        C222688oa.LJJIII(playerController, playerController.LLJLLIL);
        getPlayerController().onDestroyView();
        getPlayerController().LJIIIZ();
        InterfaceC46330IGg playerManager = getPlayerManager();
        String str3 = null;
        if (playerManager.LJJLIIIJLJLI(getPlayerController().LJJJJ())) {
            playerManager.LJJJLL(null);
        }
        LandscapeFeedViewPagerAbility v3 = v3();
        if (v3 != null) {
            aweme = v3.nx();
        } else {
            aweme = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C56509MFt.LIZLLL(getPanelContext()));
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str3 = author.getUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJ(System.currentTimeMillis() - this.LJLJJL, "duration");
        if (aweme != null && aweme.isPaidContent) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_collection_item", str2);
        FMX.LJIIL("landscape_screen_stay_time", c188727au.LIZ);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        getPlayerController().LJIIIIZZ(getPanelContext().LIZ(), getPanelContext().LJ);
        LandscapeFeedViewPagerAbility v3 = v3();
        if (v3 != null) {
            v3.Zn(this, new AqS167S0100000_1(this, 44));
        }
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) this.LJLILLLLZI.getValue();
        if (landscapeFeedVideoEventDispatcherAbility != null) {
            landscapeFeedVideoEventDispatcherAbility.nt0(this, new AqS167S0100000_1(this, 45));
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJJLL = !getPlayerManager().isPlaying();
        getPlayerController().LL(true);
        if (!C46416IJo.LIZIZ()) {
            getPlayerController().LJL();
        }
        getPlayerManager().LJJIII(getPlayerController().LJJJJ());
        getPlayerController().LLIIIZ(System.currentTimeMillis(), null, true);
        C218678i7.LIZ();
    }

    @Override // X.C8W0
    public final void onResume() {
        C2MA curViewHolder;
        C2MA curViewHolder2;
        Aweme aweme;
        super.onResume();
        getPlayerController().LJLILLLLZI();
        getPlayerController().LL(false);
        boolean LJJLIIIJLJLI = getPlayerManager().LJJLIIIJLJLI(getPlayerController());
        getPlayerManager().LJJJLL(getPlayerController());
        Aweme aweme2 = null;
        if (LJJLIIIJLJLI) {
            if (this.LJLJJLL) {
                getPlayerManager().LJJIII(getPlayerController().LJJJJ());
            } else {
                IDP playerController = getPlayerController();
                LandscapeFeedViewPagerAbility v3 = v3();
                if (v3 != null) {
                    aweme = v3.nx();
                } else {
                    aweme = null;
                }
                playerController.LJLLLL(0, aweme);
            }
        } else {
            LandscapeFeedViewPagerAbility v32 = v3();
            if (v32 == null || (curViewHolder = v32.getCurViewHolder()) == null) {
                return;
            }
            InterfaceC222708oc LLLJ = curViewHolder.LLLJ();
            if ((LLLJ != null && LLLJ.d4()) || C38450F7e.LIZIZ) {
                getPlayerController().LLIIJLIL(null, curViewHolder.getAweme(), true);
            }
        }
        LandscapeFeedViewPagerAbility v33 = v3();
        if (v33 == null || (curViewHolder2 = v33.getCurViewHolder()) == null) {
            return;
        }
        if (C38450F7e.LIZIZ) {
            curViewHolder2.onResume();
        }
        LandscapeFeedViewPagerAbility v34 = v3();
        if (v34 != null) {
            aweme2 = v34.nx();
        }
        C218678i7.LIZIZ(1, C56509MFt.LIZLLL(getPanelContext()), aweme2);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final long ss0() {
        return getPlayerController().LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void Cd0(float f) {
        Aweme aweme;
        getPlayerController().LJJJJIZL().LJFF(f);
        if (getPlayerManager().isPlaying()) {
            LandscapeFeedViewPagerAbility v3 = v3();
            if (v3 != null) {
                aweme = v3.nx();
            } else {
                aweme = null;
            }
            C2TT.LIZ(aweme, C62819Ol5.LJIILIIL(qT().getPageType(), qT().getEventType(), false), f, System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void Ft0(Aweme aweme) {
        getPlayerController().LJLLLL(0, aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void LJJIIJ(float f) {
        getPlayerManager().LJI(f);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void handlePlay(Aweme aweme, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        getPlayerController().LJJJJZI(aweme, z, false, false);
    }
}
