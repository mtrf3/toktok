package com.ss.android.ugc.feed.platform.panel.midad;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C1DJ;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2MA;
import X.C48052ItU;
import X.C51781KTx;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C73340SqO;
import X.C86793Y4n;
import X.EnumC221088m0;
import X.IDP;
import X.ILE;
import X.IWH;
import X.InterfaceC46645ISj;
import X.InterfaceC48722JAg;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import X.JAK;
import X.JAR;
import X.JAS;
import X.JAT;
import X.JAY;
import X.KU4;
import X.LNH;
import X.LRD;
import X.NN1;
import X.NT2;
import X.OJY;
import X.OSZ;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MidAdComponent extends BasePanelComponent implements IMidAdAbility, InterfaceC55102Lju {
    public final C5H3 LJLIL;
    public final JAR LJLILLLLZI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -998920429) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MidAdComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 399), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 8));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = new JAR(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final IMidAdCellAbility FT() {
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        RootCellComponent LJJIII;
        InterfaceC55235Lm3 LJIIZILJ;
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 == null || (viewPagerComponentAbility = v3.getViewPagerComponentAbility()) == null || (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) == null || (LJJIII = C86793Y4n.LJJIII(curViewHolder)) == null || (LJIIZILJ = C55096Ljo.LJIIZILJ(LJJIII)) == null) {
            return null;
        }
        return (IMidAdCellAbility) C55096Ljo.LIZ(LJIIZILJ, IMidAdCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void LJJIIZ() {
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && (viewPagerComponentAbility = v3.getViewPagerComponentAbility()) != null && (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) != null) {
            curViewHolder.t7(true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final ViewGroup getRootView() {
        View view;
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        InterfaceC57312Mt LJIIIIZZ;
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && (viewPagerComponentAbility = v3.getViewPagerComponentAbility()) != null && (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) != null && (LJIIIIZZ = curViewHolder.LJIIIIZZ()) != null) {
            view = LJIIIIZZ.getRootView();
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) view;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final List<Aweme> im() {
        AbstractC55082Lja abstractFeedAdapter;
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && (abstractFeedAdapter = v3.getAbstractFeedAdapter()) != null) {
            return abstractFeedAdapter.LJJIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        LRD.LIZ(LIZ).LJIIIIZZ("long_press_layer", new JAS(this));
        IPipFeedService LJJII = PipServiceImpl.LJJII();
        if (LJJII != null) {
            LJJII.LJ(this.LJLILLLLZI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        IPipFeedService LJJII;
        super.onDestroy();
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("mid_roll_memory_leak_fix", true);
        } catch (Exception unused) {
        }
        if (z && (LJJII = PipServiceImpl.LJJII()) != null) {
            LJJII.LJIILLIIL(this.LJLILLLLZI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void mC(Aweme aweme) {
        int i;
        InterfaceC48722JAg LIZIZ;
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        Aweme aweme2;
        IFeedPanelPlatformAbility v3 = v3();
        String str = null;
        if (v3 != null && (viewPagerComponentAbility = v3.getViewPagerComponentAbility()) != null && (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) != null && (aweme2 = curViewHolder.getAweme()) != null) {
            str = aweme2.getAid();
        }
        if (!TextUtils.equals(str, aweme.getAid())) {
            return;
        }
        IFeedPanelPlatformAbility v32 = v3();
        if (v32 != null) {
            i = v32.getCurIndex();
        } else {
            i = 0;
        }
        IAdReRankServiceManagerService LIZJ = AdReRankServiceManager.LIZJ();
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(ILE.FEED)) != null) {
            LIZIZ.LJIIZILJ(i, aweme);
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        AdSessionPositionHelper.LJIILIIL(i, aid, "fyp");
        OJY LJIL = C73340SqO.LJIL();
        Context context = getContext();
        LJIL.getClass();
        NN1.LJJIJ(context, aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void bF(Aweme aweme, Aweme aweme2, IWH iwh, JAT jat) {
        AbstractC55082Lja abstractC55082Lja;
        IViewPagerComponentAbility viewPagerComponentAbility;
        int i;
        long j;
        IPlayerComponentAbility playerComponentAbility;
        IDP playerController;
        InterfaceC46645ISj LIZJ;
        if (aweme2 == null || aweme == null) {
            return;
        }
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null) {
            abstractC55082Lja = v3.getAbstractFeedAdapter();
        } else {
            abstractC55082Lja = null;
        }
        if (C1DJ.LJJ(aweme)) {
            JAY.LJI = true;
            IAdSceneService LJII = AdSceneServiceImpl.LJII();
            if (LJII != null && LJII.LIZJ() != null) {
                Context context = getContext();
                String aid = aweme.getAid();
                int i2 = 0;
                if (iwh != null && (LIZJ = iwh.LIZJ()) != null) {
                    j = LIZJ.getCurrentPosition();
                } else {
                    j = 0;
                }
                OSZ osz = new OSZ(0, Long.valueOf(j));
                IFeedPanelPlatformAbility v32 = v3();
                if (v32 != null && (playerComponentAbility = v32.getPlayerComponentAbility()) != null && (playerController = playerComponentAbility.getPlayerController()) != null) {
                    i2 = playerController.LLILLJJLI;
                }
                NT2.LJJIIZI(aweme2, context, aweme, aid, osz, i2 + 1, C48052ItU.LIZIZ());
            }
            long j2 = AdSessionPositionHelper.LJFF;
            if (j2 != -1) {
                AdSessionPositionHelper.LJI = j2;
                AdSessionPositionHelper.LJFF = -1L;
            }
            if (jat != null) {
                jat.LJIIIIZZ();
            }
        }
        if (abstractC55082Lja != null) {
            Iterator<Aweme> it = abstractC55082Lja.LJJIL().iterator();
            while (true) {
                if (it.hasNext()) {
                    Aweme next = it.next();
                    if (TextUtils.equals(aweme.getAid(), next.getAid())) {
                        i = abstractC55082Lja.LJJIL().indexOf(next);
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            abstractC55082Lja.LJJJJJ(i, aweme2);
        }
        IFeedPanelPlatformAbility v33 = v3();
        if (v33 != null && (viewPagerComponentAbility = v33.getViewPagerComponentAbility()) != null) {
            viewPagerComponentAbility.u20();
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LNH.LIZLLL(LIZ, aweme2);
        }
    }
}
