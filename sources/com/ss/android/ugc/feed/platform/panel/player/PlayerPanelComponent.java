package com.ss.android.ugc.feed.platform.panel.player;

import X.AbstractC48820JEa;
import X.AbstractC55082Lja;
import X.C00F;
import X.C012403c;
import X.C221108m2;
import X.C221138m5;
import X.C222688oa;
import X.C2II;
import X.C2K0;
import X.C2M9;
import X.C2MA;
import X.C2MH;
import X.C2MY;
import X.C2NF;
import X.C2Q4;
import X.C2QR;
import X.C2QU;
import X.C2RJ;
import X.C2YJ;
import X.C36922EeM;
import X.C38450F7e;
import X.C38995FSd;
import X.C46319IFv;
import X.C47242IgQ;
import X.C51781KTx;
import X.C54838Lfe;
import X.C55312LnI;
import X.C56462Jm;
import X.C56509MFt;
import X.C56692Kj;
import X.C57142Mc;
import X.C57922Pc;
import X.C57932Pd;
import X.C57942Pe;
import X.C57952Pf;
import X.C58022Pm;
import X.C59572Vl;
import X.C5H3;
import X.C5S1;
import X.C62822Ol8;
import X.C72083SQt;
import X.C78540Us4;
import X.C80S;
import X.C8MM;
import X.EnumC221088m0;
import X.IDP;
import X.IW7;
import X.IWF;
import X.InterfaceC46330IGg;
import X.InterfaceC55102Lju;
import X.InterfaceC57982Pi;
import X.J8K;
import X.J8V;
import X.JAK;
import X.KR6;
import X.KU4;
import X.M59;
import X.M89;
import X.X1D;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlayerPanelComponent extends BasePanelComponent implements KR6, IPlayerComponentAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C57142Mc.LJLIL);
    public final C5H3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public IDP LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC46330IGg LJLL;
    public C2RJ LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public float LJZL;
    public boolean LL;
    public float LLD;
    public final C62822Ol8 LLF;
    public Aweme LLFF;
    public Boolean LLFFF;

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void Cm0() {
        this.LJLLLLLL = true;
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
    }

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
        this.LJLJLJ = true;
        IFeedPanelPlatformAbility x3 = x3();
        if (x3 != null) {
            x3.getPanelId();
        } else {
            System.currentTimeMillis();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getPlayerManager().LJJIJIL().hashCode());
        LIZ.append("");
        C59572Vl.LIZJ(this, X1D.LIZIZ(LIZ));
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LJLILLLLZI();
            idp.LL(false);
        }
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -733131012) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    public final IPipAbility A3() {
        return (IPipAbility) this.LJLJJL.getValue();
    }

    public final String C3() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-playSceneID>(...)");
        return (String) value;
    }

    public final IViewPagerComponentAbility E3() {
        return (IViewPagerComponentAbility) this.LJLJI.getValue();
    }

    public final void H3() {
        IDP idp = this.LJLJJLL;
        OnUIPlayListener onUIPlayListener = null;
        if (idp != null) {
            onUIPlayListener = idp.LJJJJ();
        }
        getPlayerManager().LJJIII(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void LJJJLIIL() {
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LLIIIL(idp.LJJIIZI());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final long getCurrentPlayDuration() {
        IDP idp = this.LJLJJLL;
        Aweme aweme = null;
        if (idp != null) {
            IFeedPanelPlatformAbility x3 = x3();
            if (x3 != null) {
                aweme = x3.getCurrentAweme();
            }
            Long second = idp.LJJIJIIJIL(aweme).getSecond();
            if (second != null) {
                return second.longValue();
            }
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final C46319IFv getDynamicOnUIPlayDelegate() {
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            if (idp.LLLJ == null) {
                idp.LLLJ = new C46319IFv(idp);
            }
            return idp.LLLJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final InterfaceC46330IGg getPlayerManager() {
        InterfaceC46330IGg manager = this.LJLL;
        if (manager == null) {
            manager = IWF.LJJLIIIIJ();
        }
        this.LJLL = manager;
        o.LJIIIIZZ(manager, "manager");
        return manager;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final int gu() {
        return ((C56462Jm) this.LJLJL.getValue()).LIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void playAdStoryVideo() {
        IDP idp;
        if (this.LJLJLJ && (idp = this.LJLJJLL) != null) {
            idp.LJLJJL();
        }
    }

    public final AbstractC48820JEa v3() {
        return (AbstractC48820JEa) this.LJLIL.getValue();
    }

    public final IFeedPanelPlatformAbility x3() {
        return (IFeedPanelPlatformAbility) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerPanelComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 752), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 5));
        }
        this.LJLILLLLZI = c62822Ol8;
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 754));
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 753), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 6));
        }
        this.LJLJJI = c62822Ol82;
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 750));
        this.LJLJL = C221108m2.LIZIZ(C57922Pc.LJLIL);
        this.LJLJLJ = true;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 751));
        this.LJLLLL = -1;
        this.LJZI = true;
        this.LLF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 749));
    }

    public final void F3() {
        if (!TextUtils.isEmpty(IW7.LIZJ())) {
            C47242IgQ.LIZ().createScene(C3(), IW7.LIZJ());
        } else {
            C47242IgQ.LIZ().createScene(C3(), null);
        }
        makeCurrentPlayScene();
        IW7.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (X.C73994T2g.LJIIJJI(r0) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0110, code lost:
    
        if (r4 != null) goto L57;
     */
    @Override // X.KR6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLLL() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.player.PlayerPanelComponent.LLJLLL():void");
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
    public final long getCurrentPosition() {
        return getPlayerManager().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String getSimKitSceneID() {
        return C3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handleMobShowEvent() {
        Aweme aweme;
        M89 m89;
        IFeedPanelPlatformAbility x3 = x3();
        if (x3 == null || !this.LJLJLJ) {
            return;
        }
        IViewPagerComponentAbility E3 = E3();
        C2MA c2ma = null;
        if (E3 != null) {
            c2ma = E3.getCurViewHolder();
        }
        if (!C72083SQt.LJLILLLLZI(c2ma) || c2ma == null || (aweme = c2ma.getAweme()) == null || aweme == this.LLFF || (m89 = getPanelContext().LIZJ) == null) {
            return;
        }
        this.LLFF = aweme;
        J8K.LIZJ(getContext(), aweme, x3.getMobBaseJsonObject(), m89, C78540Us4.LJFF(getPanelContext()));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void makeCurrentPlayScene() {
        C47242IgQ.LIZ().makeCurrentScene(C3());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        v3().LJIIJ(C57932Pd.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        OnUIPlayListener onUIPlayListener;
        super.onDestroy();
        this.LJZL = 0.0f;
        C59572Vl.LIZ().remove(String.valueOf(hashCode()));
        if (J8V.LJIILIIL()) {
            C47242IgQ.LIZ().destroyScene(C3());
            if (TextUtils.equals(C3(), J8V.LJLJL)) {
                J8V.LJLJL = null;
            }
        }
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            C222688oa.LJJIII(idp, idp.LLJLLIL);
            idp.onDestroyView();
        }
        InterfaceC46330IGg playerManager = getPlayerManager();
        IDP idp2 = this.LJLJJLL;
        if (idp2 != null) {
            onUIPlayListener = idp2.LJJJJ();
        } else {
            onUIPlayListener = null;
        }
        if (playerManager.LJJLIIIJLJLI(onUIPlayListener)) {
            getPlayerManager().LJJJLL(null);
        }
        C56692Kj.LIZ().getClass();
        C2NF LIZ = C2NF.LIZ();
        LIZ.LIZLLL = null;
        LIZ.LIZIZ = null;
        LIZ.LIZ.removeCallbacks(LIZ.LJ);
        C2MY.LIZ().LIZIZ();
        this.LJLJJLL = null;
        C2RJ c2rj = this.LJLLI;
        if (c2rj != null) {
            M59 m59 = (M59) BusinessComponentServiceUtils.getAppStateReporter();
            m59.getClass();
            synchronized (M59.class) {
                ((CopyOnWriteArrayList) m59.LJLILLLLZI).remove(c2rj);
            }
            c2rj.LJLJI.dispose();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onParentSet() {
        IDP idp;
        super.onParentSet();
        IFeedPanelPlatformAbility x3 = x3();
        if (x3 != null) {
            idp = x3.getPlayerController();
        } else {
            idp = null;
        }
        this.LJLJJLL = idp;
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LJLJLLL = true;
        try {
            Integer backgroundPausePlayerSetting = C2YJ.LIZIZ.LIZ.getBackgroundPausePlayerSetting();
            o.LJIIIIZZ(backgroundPausePlayerSetting, "get().getBackgroundPausePlayerSetting()");
            int intValue = backgroundPausePlayerSetting.intValue();
            if (intValue != 0) {
                this.LJLLI = new C2RJ(this, intValue);
            }
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
        if (J8V.LJLJJL && J8V.LJIILIIL() && J8V.LJIIIZ() == 3) {
            if (C00F.LIZ(31744, 0, "player_vc_strategy_delay_fix", true) == 1) {
                J8V.LJLJJL = false;
                J8V.LJLJJLL = true;
            }
            J8V.LJLJL = C3();
        } else if (C00F.LIZ(31744, 0, "player_vc_strategy_async_opt", true) == 1 && J8V.LJIILIIL()) {
            J8V.LJLJJL = false;
            C38995FSd.LJ().schedule(new ARunnableS37S0100000_1(this, 56), C012403c.LIZIZ(31744, 0L, "player_vc_strategy_async_time"), TimeUnit.MILLISECONDS);
        } else if (J8V.LJIILIIL()) {
            J8V.LJLJJL = false;
            F3();
        }
        IViewPagerComponentAbility E3 = E3();
        if (E3 != null) {
            E3.De0((C58022Pm) this.LLF.getValue());
        }
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LLILLIZIL = (C56462Jm) this.LJLJL.getValue();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void pauseCurrentPlayerWithListener() {
        H3();
        C56692Kj.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void pausePlayer() {
        getPlayerManager().LJIILJJIL();
        v3().LJIIJ(C57942Pe.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void stopPlayer() {
        getPlayerManager().LLLLLL();
        C56692Kj.LIZ().LIZIZ();
        v3().LJIIJ(C57952Pf.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryPlay() {
        int i;
        Aweme aweme;
        IFeedPanelPlatformAbility x3 = x3();
        if (x3 == null) {
            return;
        }
        IViewPagerComponentAbility E3 = E3();
        if (E3 != null) {
            i = E3.LLILL();
        } else {
            i = 0;
        }
        AbstractC55082Lja abstractFeedAdapter = x3.getAbstractFeedAdapter();
        if (abstractFeedAdapter != null) {
            aweme = abstractFeedAdapter.getItem(i);
        } else {
            aweme = null;
        }
        I3(null, aweme, true);
        v3().LJII(aweme, "[tryPlay]");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay() {
        Aweme aweme;
        IViewPagerComponentAbility E3 = E3();
        if (E3 != null) {
            aweme = E3.getCurrentPlayAweme();
            if (aweme != null) {
                tryResumePlay(aweme);
            }
        } else {
            aweme = null;
        }
        v3().LJII(aweme, "[tryResumePlay]");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final float B80() {
        return this.LJZL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final IDP getPlayerController() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final boolean isUseSurfaceView() {
        return C38450F7e.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ft0(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            r9 = this;
            boolean r0 = X.C80S.LJ(r10)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = X.KR8.LJIIIZ(r9)
            if (r0 == 0) goto Le
            return
        Le:
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r9.E3()
            r1 = 0
            if (r0 == 0) goto L19
            X.2MA r1 = r0.getCurViewHolder()
        L19:
            boolean r0 = X.C38450F7e.LIZIZ
            r5 = 1
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            r1.LJJIJIIJIL(r5)
        L23:
            android.content.Context r1 = r9.getContext()
            boolean r0 = r1 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L38
            X.1qj r1 = (X.ActivityC45651qj) r1
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.LNH.LIZIZ(r1)
            if (r0 == r10) goto L38
            X.LNH.LIZLLL(r1, r10)
        L38:
            X.IDP r4 = r9.LJLJJLL
            if (r4 != 0) goto L3d
        L3c:
            return
        L3d:
            android.content.Context r0 = r9.getContext()
            boolean r0 = r0 instanceof X.ActivityC45651qj
            r3 = 0
            if (r0 == 0) goto L71
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "quick_chat_sheet"
            androidx.fragment.app.Fragment r0 = r1.LJJJIL(r0)
            if (r0 == 0) goto L71
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L71
            r2 = 1
        L64:
            boolean r0 = X.C78540Us4.LJIILIIL(r10)
            if (r0 == 0) goto L73
            r4.LJLLILLLL(r10)
            r4.LJLLLLLL(r3, r10, r2)
            goto L3c
        L71:
            r2 = 0
            goto L64
        L73:
            boolean r0 = X.C54838Lfe.LJIILLIIL(r10)
            if (r0 == 0) goto L9b
            X.Ltv r0 = X.C55723Ltv.LIZIZ
            X.GZP r6 = r0.LJII()
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r0 = r9.x3()
            r7 = 0
            if (r0 == 0) goto L98
            long r0 = r0.getPanelId()
        L8b:
            long r0 = r6.LJIIIZ(r0)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L9b
            int r3 = (int) r0
            r4.LJLLLLLL(r3, r10, r2)
            goto L3c
        L98:
            r0 = 0
            goto L8b
        L9b:
            X.JEa r1 = r9.v3()
            java.lang.String r0 = "[resumePlayInternal]"
            r1.LJII(r10, r0)
            X.Ol8 r0 = X.C48747JBf.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto Lc4
            X.5H3 r0 = r9.LJLJJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent r0 = (com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent) r0
            if (r0 == 0) goto Lc4
            boolean r0 = r0.Na(r10)
            if (r0 != r5) goto Lc4
            goto L3c
        Lc4:
            com.ss.android.ugc.feed.platform.panel.pip.IPipAbility r0 = r9.A3()
            if (r0 == 0) goto Ld7
            r0.Va()
            com.ss.android.ugc.feed.platform.panel.pip.IPipAbility r0 = r9.A3()
            if (r0 == 0) goto Ld7
            int r3 = r0.Dh(r10)
        Ld7:
            r4.LJLLLLLL(r3, r10, r2)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.player.PlayerPanelComponent.Ft0(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_play_progress_change", new AqS167S0100000_1(this, 204));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePause(boolean z) {
        IFeedPanelPlatformAbility x3;
        if (z && (x3 = x3()) != null) {
            x3.showIvPlay();
        }
        H3();
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
        this.LJLL = interfaceC46330IGg;
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LLLLLLLLLL = interfaceC46330IGg;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void setUserVisibleHint(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void setVideoAppLogDuration(long j) {
        this.LJLLL = j;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void stopCalPlayTime(String str) {
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LLIIIZ(System.currentTimeMillis(), str, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String tryPlay(Aweme aweme) {
        String I3 = I3(null, aweme, true);
        AbstractC48820JEa v3 = v3();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[tryPlay] ");
        LIZ.append(I3);
        v3.LJII(aweme, X1D.LIZIZ(LIZ));
        return I3;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay(boolean z) {
        Aweme aweme;
        IViewPagerComponentAbility E3 = E3();
        if (E3 != null) {
            aweme = E3.getCurrentPlayAweme();
        } else {
            aweme = null;
        }
        if (z) {
            handleMobShowEvent();
        }
        Ft0(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlayByOnResume(boolean z) {
        tryResumePlay(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay(Aweme aweme) {
        Ft0(aweme);
        handleMobShowEvent();
    }

    public final void K3(Aweme aweme, C2MA c2ma) {
        VideoBaseCell videoBaseCell;
        if (((Number) C2QR.LIZ.getValue()).intValue() != 0) {
            IViewPagerComponentAbility E3 = E3();
            C2MA c2ma2 = null;
            if (E3 != null) {
                c2ma2 = E3.getCurViewHolder();
            }
            if ((c2ma2 instanceof VideoBaseCell) && (videoBaseCell = (VideoBaseCell) c2ma2) != null && videoBaseCell.LJLJJLL() == 2) {
                C2QU.LIZIZ(new ARunnableS12S0300000_1(this, aweme, c2ma, 9));
                return;
            }
        }
        String I3 = I3(c2ma, aweme, false);
        AbstractC48820JEa v3 = v3();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[tryPlayWhenOnPageSelected] ");
        LIZ.append(I3);
        v3.LJII(aweme, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void TH(String str, boolean z) {
        IDP idp = this.LJLJJLL;
        if (idp != null) {
            idp.LJIILIIL(str, z, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePlay(Aweme aweme, boolean z) {
        handlePlay(aweme, true, z);
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }

    public final String I3(C2MA c2ma, Aweme aweme, boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        C2II storyFeedListHelper;
        AbstractC48820JEa v3 = v3();
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(aweme, 929);
        v3.getClass();
        String str4 = null;
        if (v3.LIZLLL) {
            v3.LJIIIZ("LFeedPlayer", null, (String) aqS151S0100000_1.invoke());
        }
        IPipAbility A3 = A3();
        if (A3 != null) {
            i = A3.Dh(aweme);
        } else {
            i = 0;
        }
        if (C54838Lfe.LJJ(aweme)) {
            IFeedPanelPlatformAbility x3 = x3();
            if (x3 == null || (storyFeedListHelper = x3.getStoryFeedListHelper()) == null) {
                return "";
            }
            return storyFeedListHelper.LIZ();
        }
        IDP idp = this.LJLJJLL;
        if (idp == null) {
            return "";
        }
        if (C56509MFt.LJII(getPanelContext()) && aweme != null) {
            M89 m89 = getPanelContext().LIZJ;
            if (m89 != null) {
                str = m89.getAid();
            } else {
                str = null;
            }
            M89 m892 = getPanelContext().LIZJ;
            if (m892 != null) {
                str2 = m892.getFrom();
            } else {
                str2 = null;
            }
            M89 m893 = getPanelContext().LIZJ;
            if (m893 != null) {
                str3 = m893.getHotEnterMethod();
            } else {
                str3 = null;
            }
            if (!TextUtils.equals(aweme.getAid(), str)) {
                C78540Us4.LJIJJ(getPanelContext().LIZJ, "switched");
            } else {
                C55312LnI.LIZJ(str2, str3, str, aweme.getAid());
                if (C78540Us4.LJIILJJIL(str2, str3, str, aweme.getAid())) {
                    SearchServiceImpl.LLLZI().LLLIIL(str2, str3, str, aweme.getAid());
                }
            }
        }
        AbstractC48820JEa v32 = v3();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get initialStartTime from ");
        LIZ.append(A3());
        LIZ.append(" : ");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (aweme != null) {
            str4 = aweme.getAid();
        }
        v32.LJIIIZ("PipAbility", str4, LIZIZ);
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

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void handlePlay(Aweme aweme, boolean z, boolean z2, boolean z3) {
        C56462Jm c56462Jm;
        InterfaceC57982Pi interfaceC57982Pi;
        IDP idp = this.LJLJJLL;
        if (idp != null && (c56462Jm = idp.LLILLIZIL) != null && c56462Jm.LIZ == 2 && z2) {
            IFeedPanelPlatformAbility x3 = x3();
            if ((x3 instanceof InterfaceC57982Pi) && (interfaceC57982Pi = (InterfaceC57982Pi) x3) != null) {
                interfaceC57982Pi.LJIIIIZZ("pause");
            }
            IPipAbility A3 = A3();
            if (A3 != null) {
                A3.C90(z2);
            }
        }
        if (C80S.LJ(aweme)) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.txs);
            c5s1.LJ();
            return;
        }
        if ((((!C2Q4.LIZ || !z2) && !this.LJLJLJ) || !this.LJLJLLL) && !C2M9.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try to handlePlay,but can't meet the conditions,pageResume:");
            LIZ.append(this.LJLJLJ);
            LIZ.append(",isViewValid:");
            LIZ.append(this.LJLJLLL);
            LIZ.append("BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():");
            LIZ.append(C2M9.LIZ());
            C36922EeM.LIZLLL(4, "PlayerPanelComponent", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("the stacktrace:");
            LIZ2.append(Log.getStackTraceString(new Throwable()));
            C36922EeM.LIZLLL(4, "PlayerPanelComponent", X1D.LIZIZ(LIZ2));
            return;
        }
        IDP idp2 = this.LJLJJLL;
        if (idp2 != null) {
            idp2.LJJJJZI(aweme, z, z2, z3);
        }
    }
}
