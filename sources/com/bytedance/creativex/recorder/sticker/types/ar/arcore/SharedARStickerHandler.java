package com.bytedance.creativex.recorder.sticker.types.ar.arcore;

import X.C29S;
import X.C43119Gw7;
import X.C43465H4b;
import X.C44172HVg;
import X.C44269HYz;
import X.C44302Ha6;
import X.C44329HaX;
import X.C44423Hc3;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C82622Wbi;
import X.C82632Wbs;
import X.ERS;
import X.ESP;
import X.EnumC44267HYx;
import X.EnumC82528WaC;
import X.HB3;
import X.HXK;
import X.HZ2;
import X.I27;
import X.I37;
import X.I3K;
import X.I3X;
import X.InterfaceC135635Tz;
import X.InterfaceC45891Hzj;
import X.InterfaceC45979I2t;
import X.InterfaceC74236TBo;
import X.InterfaceC81397Vx3;
import X.InterfaceC82086WJm;
import X.T4Q;
import X.TBT;
import X.UCI;
import X.V16;
import X.WIF;
import X.WLB;
import X.WRP;
import X.WRQ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SharedARStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLILLLLZI;
    public final HXK LJLJI;
    public final InterfaceC82086WJm LJLJJI;
    public final I3X LJLJJL;
    public final WRP LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;

    static {
        TBT tbt = new TBT(SharedARStickerHandler.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(SharedARStickerHandler.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp)};
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final WLB LJIILIIL() {
        return (WLB) this.LJLJL.LIZ(this, LJLJLLL[0]);
    }

    public final ShortVideoContext LJIILJJIL() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ((ViewModelProvider) this.LJLILLLLZI.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "diContainer.get(ViewMode…s.java).shortVideoContext");
        return shortVideoContext;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        I3K LJIILL;
        LJIILJJIL().LJJIZ(false);
        if (C43465H4b.LIZIZ() && (LJIILL = LJIILL()) != null) {
            LJIILL.va(true);
        }
    }

    public final I3K LJIILL() {
        return LJIILIIL().bZ().LIZ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return C44329HaX.LIZ(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        boolean z;
        Mission mission;
        String str;
        String str2;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        if (session.LIZJ == EnumC44267HYx.RECOVER) {
            return;
        }
        this.LJLJI.LIZLLL(session.LIZ);
        LJIILJJIL().LJJIZ(true);
        if (session.LIZJ == EnumC44267HYx.MANUAL_SET) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SharedARModel sharedARModel = LJIILJJIL().sharedARModel;
            if (sharedARModel != null) {
                str = sharedARModel.getSharedARSessionId();
            } else {
                str = null;
            }
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser != null) {
                str2 = currentUser.LJ();
            } else {
                str2 = null;
            }
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                this.LJLJI.LIZIZ(str, str2);
            }
        } else {
            SharedARModel sharedARModel2 = LJIILJJIL().sharedARModel;
            if (sharedARModel2 != null) {
                sharedARModel2.setCurrentUserHost(true);
            }
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (C43119Gw7.LIZ()) {
            InterfaceC45979I2t LIZ = LJIILIIL().pb0().LIZ();
            if (LIZ != null) {
                LIZ.setCurrentTab(C44269HYz.LIZJ, false, 0);
            }
            InterfaceC45891Hzj LIZ2 = LJIILIIL().Sv().LIZ();
            if (LIZ2 != null) {
                LIZ2.MD(false);
            }
        }
        if (C43465H4b.LIZIZ()) {
            I3K LJIILL = LJIILL();
            if (LJIILL != null) {
                LJIILL.hd(C44269HYz.LIZIZ, z);
            }
            if (z) {
                I3K LJIILL2 = LJIILL();
                if (LJIILL2 != null) {
                    LJIILL2.gd0(false);
                }
            } else {
                I3K LJIILL3 = LJIILL();
                if (LJIILL3 != null) {
                    LJIILL3.va(false);
                }
            }
        } else {
            InterfaceC45979I2t LIZ3 = LJIILIIL().pb0().LIZ();
            if (LIZ3 != null) {
                LIZ3.setCurrentTab(C44269HYz.LIZIZ, z, 0);
            }
        }
        HZ2.LIZ(this.LJLJJL, false, 3);
        WIF LIZ4 = LJIILIIL().ig0().LIZ();
        if (LIZ4 != null) {
            LIZ4.h1(false);
        }
        this.LJLJJI.y90(EnumC82528WaC.NORMAL);
        ShortVideoContext LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL.LJJIJIL() && ((mission = LJIILJJIL.creativeModel.commerceModel.getMission()) == null || mission.getMusicId() == null)) {
            HB3.LIZ(LJIILJJIL);
            V16.LJ(LJIILJJIL);
            this.LJLJJL.vK(new C44302Ha6(LJIILJJIL.cameraComponentModel.mMaxDuration));
            I27 LIZ5 = LJIILIIL().cE().LIZ();
            if (LIZ5 != null) {
                LIZ5.handleCancelMusicResultEvent();
            }
            I27 LIZ6 = LJIILIIL().cE().LIZ();
            if (LIZ6 != null) {
                LIZ6.changeHasMusic(null);
            }
        }
        WRP wrp = this.LJLJJLL;
        if (wrp != null) {
            wrp.setFilterDisable(true, "build_in");
        }
        ((I37) this.LJLJLJ.LIZ(this, LJLJLLL[1])).Ku(false);
        this.LJLJJI.T6();
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LJLJI.onMessageReceived(i, i2, i3, str);
    }

    public SharedARStickerHandler(C82622Wbi diContainer, C29S activity, HXK sharedAREffectManager, WRQ cameraApiComponent, I3X recordControlApi, WRP wrp) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sharedAREffectManager, "sharedAREffectManager");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = sharedAREffectManager;
        this.LJLJJI = cameraApiComponent;
        this.LJLJJL = recordControlApi;
        this.LJLJJLL = wrp;
        this.LJLJL = UCI.LJI(diContainer, WLB.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, I37.class, null);
    }
}
