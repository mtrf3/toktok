package com.ss.android.ugc.feed.platform.panel.player;

import X.C221108m2;
import X.C2II;
import X.C2M3;
import X.C2M9;
import X.C2MA;
import X.C2MX;
import X.C2Q2;
import X.C2Q4;
import X.C2QR;
import X.C2QU;
import X.C2RJ;
import X.C35168DrA;
import X.C36922EeM;
import X.C38450F7e;
import X.C46319IFv;
import X.C47242IgQ;
import X.C54838Lfe;
import X.C55312LnI;
import X.C56462Jm;
import X.C56692Kj;
import X.C56742Ko;
import X.C58152Pz;
import X.C5S1;
import X.C60392Yp;
import X.C62822Ol8;
import X.C72083SQt;
import X.C78540Us4;
import X.C78996UzQ;
import X.C80S;
import X.C86951YAp;
import X.C9K4;
import X.IDP;
import X.IW7;
import X.IWF;
import X.InterfaceC46330IGg;
import X.InterfaceC55062LjG;
import X.InterfaceC57982Pi;
import X.J8K;
import X.M89;
import X.WM7;
import X.X1D;
import Y.ARunnableS12S0300000_1;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlayerComponentTemp implements IPlayerComponentAbility {
    public BaseListFragmentPanel LJLIL;
    public InterfaceC46330IGg LJLJJLL;
    public IDP LJLJL;
    public C56462Jm LJLJLJ;
    public C2RJ LJLJLLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public float LJLZ;
    public boolean LJZ;
    public float LJZI;
    public Boolean LJZL;
    public Aweme LL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 746));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 747));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 748));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 744));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 745));
    public int LJLLJ = -1;

    public final IPipAbility LIZ() {
        return (IPipAbility) this.LJLJJL.getValue();
    }

    public final String LIZIZ() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-playSceneID>(...)");
        return (String) value;
    }

    public final boolean LIZLLL() {
        if (C2Q2.LIZ) {
            IRootAbility iRootAbility = (IRootAbility) this.LJLJJI.getValue();
            if (iRootAbility != null && iRootAbility.getUserVisibleHint()) {
                return true;
            }
        } else {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel != null && baseListFragmentPanel.mPageResumed) {
                return true;
            }
        }
        return false;
    }

    public final void LJ() {
        IDP idp = this.LJLJL;
        OnUIPlayListener onUIPlayListener = null;
        if (idp != null) {
            onUIPlayListener = idp.LJJJJ();
        }
        getPlayerManager().LJJIII(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void LJJJLIIL() {
        IDP idp = this.LJLJL;
        if (idp != null) {
            idp.LLIIIL(idp.LJJIIZI());
        }
    }

    public final IPlayerComponentAbility getPlayerComponentAbility() {
        return (IPlayerComponentAbility) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final float B80() {
        if (!C2M3.LIZIZ()) {
            return this.LJLZ;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            return playerComponentAbility.B80();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void Cm0() {
        if (!C2M3.LIZIZ()) {
            this.LJLLL = true;
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.Cm0();
    }

    public final void LIZJ() {
        if (!TextUtils.isEmpty(IW7.LIZJ())) {
            C47242IgQ.LIZ().createScene(LIZIZ(), IW7.LIZJ());
        } else {
            C47242IgQ.LIZ().createScene(LIZIZ(), null);
        }
        makeCurrentPlayScene();
        IW7.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final int d0() {
        IDP playerController = getPlayerController();
        if (playerController != null) {
            return playerController.LLILLJJLI;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final long getCurrentPlayDuration() {
        if (!C2M3.LIZIZ()) {
            IDP idp = this.LJLJL;
            Aweme aweme = null;
            if (idp == null) {
                return 0L;
            }
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel != null) {
                aweme = baseListFragmentPanel.getCurrentAweme();
            }
            Long second = idp.LJJIJIIJIL(aweme).getSecond();
            if (second == null) {
                return 0L;
            }
            return second.longValue();
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return 0L;
        }
        return playerComponentAbility.getCurrentPlayDuration();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final long getCurrentPosition() {
        if (!C2M3.LIZIZ()) {
            return getPlayerManager().getCurrentPosition();
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            return playerComponentAbility.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final C46319IFv getDynamicOnUIPlayDelegate() {
        if (!C2M3.LIZIZ()) {
            IDP idp = this.LJLJL;
            if (idp == null) {
                return null;
            }
            if (idp.LLLJ == null) {
                idp.LLLJ = new C46319IFv(idp);
            }
            return idp.LLLJ;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return null;
        }
        return playerComponentAbility.getDynamicOnUIPlayDelegate();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final InterfaceC46330IGg getPlayerManager() {
        InterfaceC46330IGg playerManager;
        if (!C2M3.LIZIZ()) {
            InterfaceC46330IGg manager = this.LJLJJLL;
            if (manager == null) {
                manager = IWF.LJJLIIIIJ();
            }
            this.LJLJJLL = manager;
            o.LJIIIIZZ(manager, "manager");
            return manager;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null || (playerManager = playerComponentAbility.getPlayerManager()) == null) {
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            o.LJIIIIZZ(LJJLIIIIJ, "inst()");
            return LJJLIIIIJ;
        }
        return playerManager;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String getSimKitSceneID() {
        String simKitSceneID;
        if (!C2M3.LIZIZ()) {
            return LIZIZ();
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null || (simKitSceneID = playerComponentAbility.getSimKitSceneID()) == null) {
            return "";
        }
        return simKitSceneID;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final int gu() {
        if (!C2M3.LIZIZ()) {
            C56462Jm c56462Jm = this.LJLJLJ;
            if (c56462Jm == null) {
                return 0;
            }
            return c56462Jm.LIZ;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return 0;
        }
        return playerComponentAbility.gu();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handleMobShowEvent() {
        Aweme aweme;
        if (!C2M3.LIZIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel == null || !baseListFragmentPanel.getUserVisibleHint()) {
                return;
            }
            C2MA curViewHolder = baseListFragmentPanel.getCurViewHolder();
            if (!C72083SQt.LJLILLLLZI(curViewHolder) || curViewHolder == null || (aweme = curViewHolder.getAweme()) == null || aweme == this.LL) {
                return;
            }
            this.LL = aweme;
            J8K.LIZJ(baseListFragmentPanel.getContext(), aweme, baseListFragmentPanel.getMobBaseJsonObject(), baseListFragmentPanel.getParam(), baseListFragmentPanel.getEnterFrom(true));
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            playerComponentAbility.handleMobShowEvent();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final boolean isUseSurfaceView() {
        if (!C2M3.LIZIZ()) {
            return C38450F7e.LIZIZ;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            return playerComponentAbility.isUseSurfaceView();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void makeCurrentPlayScene() {
        if (!C2M3.LIZIZ()) {
            C47242IgQ.LIZ().makeCurrentScene(LIZIZ());
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.makeCurrentPlayScene();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void pauseCurrentPlayerWithListener() {
        if (!C2M3.LIZIZ()) {
            LJ();
            C56692Kj.LIZ().LIZIZ();
        } else {
            IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
            if (playerComponentAbility == null) {
                return;
            }
            playerComponentAbility.pauseCurrentPlayerWithListener();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void pausePlayer() {
        if (!C2M3.LIZIZ()) {
            getPlayerManager().LJIILJJIL();
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.pausePlayer();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void playAdStoryVideo() {
        IDP idp;
        if (!C2M3.LIZIZ()) {
            if (LIZLLL() && (idp = this.LJLJL) != null) {
                idp.LJLJJL();
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.playAdStoryVideo();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void stopPlayer() {
        if (!C2M3.LIZIZ()) {
            getPlayerManager().LLLLLL();
            C56692Kj.LIZ().LIZIZ();
        } else {
            IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
            if (playerComponentAbility == null) {
                return;
            }
            playerComponentAbility.stopPlayer();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryPlay() {
        Aweme aweme;
        if (!C2M3.LIZIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel == null) {
                return;
            }
            InterfaceC55062LjG adapter = baseListFragmentPanel.getAdapter();
            if (adapter != null) {
                aweme = adapter.getItem(baseListFragmentPanel.getViewPager().getCurrentItem());
            } else {
                aweme = null;
            }
            LJII(null, aweme, true);
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            playerComponentAbility.tryPlay();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay() {
        Aweme currentPlayAweme;
        if (!C2M3.LIZIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel != null && (currentPlayAweme = baseListFragmentPanel.getCurrentPlayAweme()) != null) {
                tryResumePlay(currentPlayAweme);
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.tryResumePlay();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final IDP getPlayerController() {
        return this.LJLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ft0(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r3 = r9.LJLIL
            if (r3 != 0) goto L5
            return
        L5:
            boolean r0 = X.C80S.LJ(r10)
            if (r0 == 0) goto Lc
            return
        Lc:
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L13
            return
        L13:
            X.2MA r1 = r3.getCurViewHolder()
            boolean r0 = r9.isUseSurfaceView()
            r5 = 1
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            r1.LJJIJIIJIL(r5)
        L23:
            android.app.Activity r0 = r3.activity
            java.lang.String r2 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.1qj r0 = (X.ActivityC45651qj) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.LNH.LIZIZ(r0)
            if (r0 == r10) goto L3c
            android.app.Activity r0 = r3.activity
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.1qj r0 = (X.ActivityC45651qj) r0
            X.LNH.LIZLLL(r0, r10)
        L3c:
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r7 = r9.LJLIL
            if (r7 != 0) goto L41
        L40:
            return
        L41:
            X.IDP r4 = r9.LJLJL
            if (r4 != 0) goto L46
            goto L40
        L46:
            android.app.Activity r1 = r7.activity
            boolean r0 = r1 instanceof X.ActivityC45651qj
            r3 = 0
            if (r0 == 0) goto L72
            kotlin.jvm.internal.o.LJII(r1, r2)
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "quick_chat_sheet"
            androidx.fragment.app.Fragment r0 = r1.LJJJIL(r0)
            if (r0 == 0) goto L72
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L72
            r2 = 1
        L65:
            boolean r0 = X.C78540Us4.LJIILIIL(r10)
            if (r0 == 0) goto L74
            r4.LJLLILLLL(r10)
            r4.LJLLLLLL(r3, r10, r2)
            goto L40
        L72:
            r2 = 0
            goto L65
        L74:
            boolean r0 = X.C54838Lfe.LJIILLIIL(r10)
            if (r0 == 0) goto L93
            X.Ltv r0 = X.C55723Ltv.LIZIZ
            X.GZP r6 = r0.LJII()
            long r0 = r7.getPanelId()
            long r0 = r6.LJIIIZ(r0)
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L93
            int r3 = (int) r0
            r4.LJLLLLLL(r3, r10, r2)
            goto L40
        L93:
            X.Ol8 r0 = X.C48747JBf.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto Lb2
            X.Ol8 r0 = r9.LJLJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent r0 = (com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent) r0
            if (r0 == 0) goto Lb2
            boolean r0 = r0.Na(r10)
            if (r0 != r5) goto Lb2
            goto L40
        Lb2:
            com.ss.android.ugc.feed.platform.panel.pip.IPipAbility r0 = r9.LIZ()
            if (r0 == 0) goto Lc5
            r0.Va()
            com.ss.android.ugc.feed.platform.panel.pip.IPipAbility r0 = r9.LIZ()
            if (r0 == 0) goto Lc5
            int r3 = r0.Dh(r10)
        Lc5:
            r4.LJLLLLLL(r3, r10, r2)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp.Ft0(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePause(boolean z) {
        BaseListFragmentPanel baseListFragmentPanel;
        if (!C2M3.LIZIZ()) {
            if (z && (baseListFragmentPanel = this.LJLIL) != null) {
                baseListFragmentPanel.showIvPlay();
            }
            LJ();
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.handlePause(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void seekProgress(float f) {
        if (f < 0.0f || f > 100.0f) {
            return;
        }
        getPlayerManager().LJI(f);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void setPlayerManager(InterfaceC46330IGg interfaceC46330IGg) {
        if (!C2M3.LIZIZ()) {
            this.LJLJJLL = interfaceC46330IGg;
            IDP idp = this.LJLJL;
            if (idp != null) {
                idp.LLLLLLLLLL = interfaceC46330IGg;
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.setPlayerManager(interfaceC46330IGg);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void setVideoAppLogDuration(long j) {
        if (!C2M3.LIZIZ()) {
            this.LJLLILLLL = j;
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.setVideoAppLogDuration(j);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void stopCalPlayTime(String str) {
        if (!C2M3.LIZIZ()) {
            IDP idp = this.LJLJL;
            if (idp != null) {
                idp.LLIIIZ(System.currentTimeMillis(), str, true);
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.stopCalPlayTime(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String tryPlay(Aweme aweme) {
        if (!C2M3.LIZIZ()) {
            return LJII(null, aweme, true);
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return null;
        }
        return playerComponentAbility.tryPlay(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay(boolean z) {
        Aweme aweme;
        if (!C2M3.LIZIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel != null) {
                aweme = baseListFragmentPanel.getCurrentPlayAweme();
            } else {
                aweme = null;
            }
            if (z) {
                handleMobShowEvent();
            }
            Ft0(aweme);
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.tryResumePlay(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlayByOnResume(boolean z) {
        if (!C2M3.LIZIZ()) {
            tryResumePlay(z);
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.tryResumePlayByOnResume(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay(Aweme aweme) {
        if (!C2M3.LIZIZ()) {
            Ft0(aweme);
            handleMobShowEvent();
        } else {
            IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
            if (playerComponentAbility == null) {
                return;
            }
            playerComponentAbility.tryResumePlay(aweme);
        }
    }

    public final void LJIIIIZZ(Aweme aweme, C2MA c2ma) {
        boolean z;
        String str;
        C2MA c2ma2;
        VideoBaseCell videoBaseCell;
        if (((Number) C2QR.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel != null) {
                c2ma2 = baseListFragmentPanel.getCurViewHolder();
            } else {
                c2ma2 = null;
            }
            if ((c2ma2 instanceof VideoBaseCell) && (videoBaseCell = (VideoBaseCell) c2ma2) != null && videoBaseCell.LJLJJLL() == 2) {
                C2QU.LIZIZ(new ARunnableS12S0300000_1(this, aweme, c2ma, 7));
                return;
            }
        }
        String LJII = LJII(c2ma, aweme, false);
        C58152Pz.LIZJ("tryPlay", LJII);
        if (!C35168DrA.LIZ()) {
            return;
        }
        C9K4 c9k4 = C9K4.LIZ;
        C56742Ko c56742Ko = new C56742Ko();
        c56742Ko.LIZ(C78996UzQ.LJIIL(aweme), "aid");
        c56742Ko.LIZ("PlayerController", "caller");
        c56742Ko.LIZ(LJII, "result");
        BaseListFragmentPanel baseListFragmentPanel2 = this.LJLIL;
        if (baseListFragmentPanel2 == null || (str = baseListFragmentPanel2.getEventType()) == null) {
            str = "";
        }
        c56742Ko.LIZ(str, WM7.SCENE_SERVICE);
        c56742Ko.LIZ("tryPlay", "source");
        C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(aweme), null, 28);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void TH(String str, boolean z) {
        if (!C2M3.LIZIZ()) {
            IDP idp = this.LJLJL;
            if (idp != null) {
                idp.LJIILIIL(str, z, null);
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility == null) {
            return;
        }
        playerComponentAbility.TH(str, z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePlay(Aweme aweme, boolean z) {
        handlePlay(aweme, true, z);
    }

    public final String LJII(C2MA c2ma, Aweme aweme, boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        M89 param;
        M89 param2;
        M89 param3;
        C2II storyFeedListHelper;
        String str5;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryPlay,aid:");
        if (aweme == null) {
            str = "";
        } else {
            str = aweme.getAid();
        }
        LIZ.append(str);
        C60392Yp.LIZIZ("LFeedPlayer", X1D.LIZIZ(LIZ));
        IPipAbility LIZ2 = LIZ();
        if (LIZ2 != null) {
            i = LIZ2.Dh(aweme);
        } else {
            i = 0;
        }
        M89 m89 = null;
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ(C78996UzQ.LJIIL(aweme), "aid");
            c56742Ko.LIZ("BaseListFragmentPanel", "caller");
            c56742Ko.LIZ(Integer.valueOf(!z ? 1 : 0), "isRenderReady");
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            if (baseListFragmentPanel == null || (str5 = baseListFragmentPanel.getEventType()) == null) {
                str5 = "";
            }
            c56742Ko.LIZ(str5, WM7.SCENE_SERVICE);
            c56742Ko.LIZ("tryPlay", "source");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(aweme), null, 28);
        }
        if (C54838Lfe.LJJ(aweme)) {
            BaseListFragmentPanel baseListFragmentPanel2 = this.LJLIL;
            if (baseListFragmentPanel2 == null || (storyFeedListHelper = baseListFragmentPanel2.getStoryFeedListHelper()) == null) {
                return "";
            }
            return storyFeedListHelper.LIZ();
        }
        IDP idp = this.LJLJL;
        if (idp == null) {
            return "";
        }
        if (aweme != null) {
            BaseListFragmentPanel baseListFragmentPanel3 = this.LJLIL;
            if (baseListFragmentPanel3 != null && (param3 = baseListFragmentPanel3.getParam()) != null) {
                str2 = param3.getAid();
            } else {
                str2 = null;
            }
            BaseListFragmentPanel baseListFragmentPanel4 = this.LJLIL;
            if (baseListFragmentPanel4 != null && (param2 = baseListFragmentPanel4.getParam()) != null) {
                str3 = param2.getFrom();
            } else {
                str3 = null;
            }
            BaseListFragmentPanel baseListFragmentPanel5 = this.LJLIL;
            if (baseListFragmentPanel5 != null && (param = baseListFragmentPanel5.getParam()) != null) {
                str4 = param.getHotEnterMethod();
            } else {
                str4 = null;
            }
            if (!TextUtils.equals(aweme.getAid(), str2)) {
                BaseListFragmentPanel baseListFragmentPanel6 = this.LJLIL;
                if (baseListFragmentPanel6 != null) {
                    m89 = baseListFragmentPanel6.getParam();
                }
                C78540Us4.LJIJJ(m89, "switched");
            } else {
                C55312LnI.LIZJ(str3, str4, str2, aweme.getAid());
                if (C78540Us4.LJIILJJIL(str3, str4, str2, aweme.getAid())) {
                    SearchServiceImpl.LLLZI().LLLIIL(str3, str4, str2, aweme.getAid());
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("get pip initialStartTime from ");
        LIZ3.append(LIZ());
        LIZ3.append(" : ");
        LIZ3.append(i);
        X1D.LIZIZ(LIZ3);
        if (aweme != null) {
            aweme.getAid();
        }
        return idp.LLIIJI(aweme, z, c2ma, i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePlay(Aweme aweme, boolean z, boolean z2) {
        handlePlay(aweme, z, z2, false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String ji(Aweme aweme, int i, boolean z) {
        IDP playerController = getPlayerController();
        if (playerController != null) {
            return playerController.LJLLLLLL(i, aweme, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePlay(Aweme aweme, boolean z, boolean z2, boolean z3) {
        boolean LIZLLL;
        C56462Jm c56462Jm;
        String str;
        C86951YAp c86951YAp = C86951YAp.LIZIZ;
        if (c86951YAp.LJ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLIL;
            Activity activity = null;
            if (baseListFragmentPanel != null) {
                str = baseListFragmentPanel.getEventType();
            } else {
                str = null;
            }
            if (o.LJ(str, "offline_mode_page") && C2MX.LIZ().LIZIZ) {
                BaseListFragmentPanel baseListFragmentPanel2 = this.LJLIL;
                if (baseListFragmentPanel2 != null) {
                    activity = baseListFragmentPanel2.activity;
                }
                c86951YAp.LIZJ(activity);
                return;
            }
        }
        if (!C2M3.LIZIZ()) {
            BaseListFragmentPanel baseListFragmentPanel3 = this.LJLIL;
            if (baseListFragmentPanel3 == 0) {
                return;
            }
            IDP idp = baseListFragmentPanel3.mPlayerController;
            boolean z4 = false;
            if (idp != null && (c56462Jm = idp.LLILLIZIL) != null && c56462Jm.LIZ == 2 && z2) {
                if (baseListFragmentPanel3 instanceof InterfaceC57982Pi) {
                    ((InterfaceC57982Pi) baseListFragmentPanel3).LJIIIIZZ("pause");
                }
                IPipAbility LIZ = LIZ();
                if (LIZ != null) {
                    LIZ.C90(z2);
                }
            }
            if (C80S.LJ(aweme)) {
                C5S1 c5s1 = new C5S1(baseListFragmentPanel3.getContext());
                c5s1.LIZJ(R.string.txs);
                c5s1.LJ();
                return;
            }
            boolean z5 = C2Q4.LIZ;
            if ((((!z5 || !z2) && !LIZLLL()) || !baseListFragmentPanel3.isViewValid()) && !C2M9.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("try to handlePlay,but can't meet the conditions,pageResume:");
                LIZ2.append(LIZLLL());
                LIZ2.append(", pageVisibilityHandleFromUser: ");
                if (z5 && z2) {
                    LIZLLL = true;
                } else {
                    LIZLLL = LIZLLL();
                }
                LIZ2.append(LIZLLL);
                LIZ2.append(", rootVisibility: ");
                IRootAbility iRootAbility = (IRootAbility) this.LJLJJI.getValue();
                if (iRootAbility != null && iRootAbility.getUserVisibleHint()) {
                    z4 = true;
                }
                LIZ2.append(z4);
                LIZ2.append(", fragment: ");
                LIZ2.append(baseListFragmentPanel3.getFragment());
                LIZ2.append(", panel: ");
                LIZ2.append(baseListFragmentPanel3);
                LIZ2.append(",isViewValid:");
                LIZ2.append(baseListFragmentPanel3.isViewValid());
                LIZ2.append("BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():");
                LIZ2.append(C2M9.LIZ());
                C36922EeM.LIZLLL(4, "PlayerPanelComponent", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("the stacktrace:");
                LIZ3.append(Log.getStackTraceString(new Throwable()));
                C36922EeM.LIZLLL(4, "PlayerPanelComponent", X1D.LIZIZ(LIZ3));
                return;
            }
            IDP idp2 = this.LJLJL;
            if (idp2 != null) {
                idp2.LJJJJZI(aweme, z, z2, z3);
                return;
            }
            return;
        }
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null) {
            playerComponentAbility.handlePlay(aweme, z, z2, z3);
        }
    }
}
