package com.ss.android.ugc.feed.platform.panel.player;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C00F;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C34176DbA;
import X.C38995FSd;
import X.C48714J9y;
import X.C51029K0z;
import X.C51781KTx;
import X.C55096Ljo;
import X.C56509MFt;
import X.C5H3;
import X.C62822Ol8;
import X.C86918Y9i;
import X.C8MM;
import X.C8RO;
import X.C8SG;
import X.DZJ;
import X.EnumC221088m0;
import X.HG3;
import X.IDP;
import X.IDR;
import X.IUA;
import X.IVO;
import X.IVS;
import X.IXN;
import X.InterfaceC47101Ie9;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.JA0;
import X.JA2;
import X.JA4;
import X.JAK;
import X.JCM;
import X.KR8;
import X.KU4;
import X.RBX;
import X.X1D;
import Y.ARunnableS27S0200000_8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PlayerPreloadDataComponent extends BasePanelComponent implements JA0, InterfaceC47101Ie9, IPlayerPreloadDataAbility, InterfaceC55102Lju {
    public static boolean LJLJJLL = true;
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public IVO LJLJJL;

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void G1() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void N2() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void S1() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void j1() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final PlayerPreloadDataComponent jr0() {
        return this;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1996443098) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerPreloadDataComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 406), new AqS151S0100000_1((KU4) this, 979));
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(true, (KU4) this, 10));
        }
        this.LJLIL = c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 407), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 11));
        }
        this.LJLILLLLZI = c62822Ol82;
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 405));
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 408));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig) X.FFL.LJIILLIIL(com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig.class, "preload_strategy_hp", true)) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig A3() {
        /*
            r3 = this;
            X.KRA r0 = r3.getPanelContext()
            boolean r0 = X.C56509MFt.LJII(r0)
            if (r0 == 0) goto L21
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "preload_strategy_hp"
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig> r1 = com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig.class
            r0.getClass()     // Catch: java.lang.Throwable -> L1e
            r0 = 1
            java.lang.Object r0 = X.FFL.LJIILLIIL(r1, r2, r0)     // Catch: java.lang.Throwable -> L1e
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r0 = (com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig) r0     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L21
        L1e:
            X.IW7.LIZIZ()
        L21:
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r0 = X.IW7.LIZIZ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.player.PlayerPreloadDataComponent.A3():com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig");
    }

    public final boolean C3() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        Aweme currentAweme;
        if (!C56509MFt.LJII(getPanelContext()) || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJI.getValue()) == null || (currentAweme = iViewPagerComponentAbility.getCurrentAweme()) == null || !((RBX) HG3.LJIILL()).isLogin() || currentAweme.getAuthor() == null || !TextUtils.equals(currentAweme.getAuthor().getUid(), ((RBX) HG3.LJIILL()).getCurUserId()) || C00F.LIZ(31744, 1, "enable_preload_hp_personal", true) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (C56509MFt.LJIIJ(getPanelContext())) {
            C48714J9y.LIZJ = new WeakReference<>(this);
        }
    }

    @Override // X.JA0
    public final void x2() {
        IFeedPanelPlatformAbility v3;
        AbstractC55082Lja abstractFeedAdapter;
        IVO ivo;
        Aweme currentAweme;
        VideoUrlModel properPlayAddr;
        if (KR8.LJIIIZ(this) || (v3 = v3()) == null || !C56509MFt.LJIIJ(getPanelContext()) || v3.getCurrentAwemeId() == null || !IVS.LIZ(v3.getCurrentAwemeId())) {
            return;
        }
        String str = null;
        if (this.LJLJJL == null) {
            this.LJLJJL = new IVO(null, A3());
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJI.getValue();
        if (iViewPagerComponentAbility != null && (currentAweme = iViewPagerComponentAbility.getCurrentAweme()) != null) {
            Video video = currentAweme.getVideo();
            if (video != null) {
                if (e1.LIZ(31744, "bytevc1_play_addr_policy_unify", true, true)) {
                    properPlayAddr = C51029K0z.LJJJJZ(IUA.LIZ.LIZ().getVideoPlayAddr(C51029K0z.LJJJJ(video), IXN.LIZJ.getPlayerType()));
                } else {
                    properPlayAddr = video.getProperPlayAddr();
                }
                if (properPlayAddr != null) {
                    str = properPlayAddr.getBitRatedRatioUri();
                }
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || (abstractFeedAdapter = v3.getAbstractFeedAdapter()) == null || (ivo = this.LJLJJL) == null) {
            return;
        }
        ivo.LIZIZ(false, str, 0L, 0L, abstractFeedAdapter, v3.getCurIndex(), true);
    }

    public static final IPlayerPreloadDataAbility x3(WeakReference<IDR> weakReference) {
        IDR idr;
        IFeedPanelPlatformAbility feedPanelPlatformAbility;
        InterfaceC55235Lm3 vScope;
        if (weakReference == null || (idr = weakReference.get()) == null || (feedPanelPlatformAbility = idr.getFeedPanelPlatformAbility()) == null || (vScope = feedPanelPlatformAbility.getVScope()) == null) {
            return null;
        }
        return (IPlayerPreloadDataAbility) C55096Ljo.LIZ(vScope, IPlayerPreloadDataAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_render_first_frame", new AqS174S0100000_8(this, 152));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final void xo(Aweme aweme) {
        if (DZJ.LIZ) {
            if (!LJLJJLL) {
                if (aweme == null || !C34176DbA.LIZ) {
                    return;
                }
                C38995FSd.LIZLLL().execute(new ARunnableS27S0200000_8(this, aweme, 74));
                return;
            }
            LJLJJLL = false;
            return;
        }
        if (aweme == null || !C34176DbA.LIZ) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS27S0200000_8(this, aweme, 74));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility
    public final void It(String sourceid, boolean z) {
        AbstractC55082Lja abstractFeedAdapter;
        String aid;
        o.LJIIIZ(sourceid, "sourceid");
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 == null || (abstractFeedAdapter = v3.getAbstractFeedAdapter()) == null) {
            return;
        }
        Aweme item = abstractFeedAdapter.getItem(v3.getCurIndex());
        IDP idp = null;
        if (JA4.LIZIZ && C56509MFt.LJIIJ(getPanelContext()) && item != null && (aid = item.getAid()) != null) {
            synchronized (JCM.LIZ) {
                C8RO c8ro = C86918Y9i.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("recordFromPreload: awemeid ");
                LIZ.append(aid);
                c8ro.LIZIZ("ConsumeManager", null, X1D.LIZIZ(LIZ));
                ArrayList<String> arrayList = JCM.LJFF;
                if (!arrayList.contains(aid)) {
                    arrayList.add(aid);
                }
                while (true) {
                    ArrayList<String> arrayList2 = JCM.LJFF;
                    if (arrayList2.size() <= 16) {
                        break;
                    } else {
                        ListProtector.remove(arrayList2, 0);
                    }
                }
            }
        }
        if (!z || !C3()) {
            return;
        }
        if (this.LJLJJL == null) {
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LJLJI.getValue();
            if (iPlayerComponentAbility != null) {
                idp = iPlayerComponentAbility.getPlayerController();
            }
            this.LJLJJL = new IVO(idp, A3());
        }
        IVO ivo = this.LJLJJL;
        if (ivo == null) {
            return;
        }
        ivo.LIZIZ(z, sourceid, 0L, 0L, abstractFeedAdapter, v3.getCurIndex(), v3.isPageChangeDown());
    }

    @Override // X.InterfaceC47101Ie9
    public final void p3(long j, long j2, String str) {
        IFeedPanelPlatformAbility v3;
        List<Aweme> list;
        int i;
        AbstractC55082Lja abstractFeedAdapter;
        AbstractC55082Lja abstractFeedAdapter2;
        List<Aweme> list2;
        int i2;
        AbstractC55082Lja abstractFeedAdapter3;
        AbstractC55082Lja abstractFeedAdapter4;
        IVO ivo;
        if (KR8.LJIIIZ(this) || (v3 = v3()) == null) {
            return;
        }
        if (JA2.LIZ()) {
            int i3 = 0;
            List<Aweme> list3 = null;
            if (C56509MFt.LJIIJ(getPanelContext())) {
                C8SG c8sg = C8SG.LIZIZ;
                ActivityC45651qj LIZ = getPanelContext().LIZ();
                IFeedPanelPlatformAbility v32 = v3();
                if (v32 != null && (abstractFeedAdapter3 = v32.getAbstractFeedAdapter()) != null) {
                    list2 = abstractFeedAdapter3.LJJIL();
                } else {
                    list2 = null;
                }
                IFeedPanelPlatformAbility v33 = v3();
                if (v33 != null) {
                    i2 = v33.getCurIndex();
                } else {
                    i2 = 0;
                }
                c8sg.LJII(i2, 1, LIZ, list2);
            }
            if (C56509MFt.LJII(getPanelContext())) {
                C8SG c8sg2 = C8SG.LIZIZ;
                ActivityC45651qj LIZ2 = getPanelContext().LIZ();
                IFeedPanelPlatformAbility v34 = v3();
                if (v34 != null && (abstractFeedAdapter2 = v34.getAbstractFeedAdapter()) != null) {
                    list = abstractFeedAdapter2.LJJIL();
                } else {
                    list = null;
                }
                IFeedPanelPlatformAbility v35 = v3();
                if (v35 != null) {
                    i = v35.getCurIndex();
                } else {
                    i = 0;
                }
                c8sg2.LJIJ(i, LIZ2, list);
                ActivityC45651qj LIZ3 = getPanelContext().LIZ();
                IFeedPanelPlatformAbility v36 = v3();
                if (v36 != null && (abstractFeedAdapter = v36.getAbstractFeedAdapter()) != null) {
                    list3 = abstractFeedAdapter.LJJIL();
                }
                IFeedPanelPlatformAbility v37 = v3();
                if (v37 != null) {
                    i3 = v37.getCurIndex();
                }
                c8sg2.LJII(i3, 2, LIZ3, list3);
            }
        }
        if (!C3()) {
            return;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new IVO(v3.getPlayerController(), A3());
        }
        if ((!IVS.LIZ(v3.getCurrentAwemeId()) || v3.getItemCount() > 1) && (abstractFeedAdapter4 = v3.getAbstractFeedAdapter()) != null && (ivo = this.LJLJJL) != null) {
            ivo.LIZIZ(false, str, j, j2, abstractFeedAdapter4, v3.getCurIndex(), v3.isPageChangeDown());
        }
    }
}
