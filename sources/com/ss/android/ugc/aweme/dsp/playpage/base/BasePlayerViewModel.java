package com.ss.android.ugc.aweme.dsp.playpage.base;

import X.AbstractC91187ZqZ;
import X.AbstractC91380Ztg;
import X.AbstractC91590Zx4;
import X.C16880lQ;
import X.C2IZ;
import X.C2U8;
import X.C42625Go9;
import X.C56082Ia;
import X.C76800UCe;
import X.C91101ZpB;
import X.C91203Zqp;
import X.C91249ZrZ;
import X.C91250Zra;
import X.C91252Zrc;
import X.C91299ZsN;
import X.C91302ZsQ;
import X.C91304ZsS;
import X.C91450Zuo;
import X.C91453Zur;
import X.C91533Zw9;
import X.EnumC91282Zs6;
import X.EnumC91305ZsT;
import X.EnumC91307ZsV;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.InterfaceC91281Zs5;
import X.InterfaceC91289ZsD;
import X.InterfaceC91291ZsF;
import X.InterfaceC91296ZsK;
import X.InterfaceC91297ZsL;
import X.L41;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.SVF;
import X.SVI;
import X.TBU;
import X.X1D;
import X.YBM;
import Y.IDfS293S0100000_29;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspViewModel;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes22.dex */
public abstract class BasePlayerViewModel extends BaseMusicDspViewModel implements InterfaceC91289ZsD, InterfaceC91291ZsF {
    public OSZ<String, Long> LJLL;
    public InterfaceC91281Zs5 LJLLI;
    public boolean LJLILLLLZI = true;
    public final MutableLiveData<Boolean> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<C91453Zur> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJLJ = new MutableLiveData<>();
    public String LJLJLLL = "";
    public boolean LJLLILLLL = true;
    public final MutableLiveData<InterfaceC91296ZsK> LJLLJ = new MutableLiveData<>();

    public abstract AbstractC91590Zx4 gv0();

    public abstract void hv0(long j, String str);

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public final void iv0() {
        AbstractC91187ZqZ LJ;
        AbstractC91590Zx4 gv0 = gv0();
        AbstractC91380Ztg LJIIZILJ = gv0.LJIIZILJ();
        if (LJIIZILJ == null || (LJ = LJIIZILJ.LJ()) == null || LJ.LIZ()) {
            return;
        }
        this.LJLIL.LIZ(LJ.LIZIZ(ORZ.LLD(gv0.LJ(null), ",", null, null, C91533Zw9.LJLIL, 30)).LJJJLIIL(new IDfS293S0100000_29(this, 0), new IDfS293S0100000_29(this, 1)));
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        gv0().LJLILLLLZI.LJLJI.LJLIL.LJIIL(this);
        gv0().bK(this);
        C42625Go9.LIZJ(this);
        super.onCleared();
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        jv0(false);
    }

    public final void jv0(boolean z) {
        this.LJLJJL.postValue(new C91453Zur(z, null, 6));
    }

    public final void kv0(AbstractC91380Ztg playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        final C91250Zra c91250Zra = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zy3
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJIILL);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJIILL = ((Number) obj).longValue();
            }
        });
        ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
        if (expiredPlayableManager.isLandingPageShow() && expiredPlayableManager.isTodayPlayableLimited()) {
            YBM.LIZ.getClass();
            if (YBM.LIZJ()) {
                expiredPlayableManager.clearPlayRecordViaUpsellChanged();
                C2U8.LIZ(new C91450Zuo());
            }
        }
        gv0().LIZIZ(playableQueue);
        if (ActivityStack.isAppBackGround()) {
            L41.LIZ.getClass();
            if (L41.LIZ()) {
                gv0().LJJI(true);
            }
        }
        final C91250Zra c91250Zra2 = C91252Zrc.LIZ;
        if (C91252Zrc.LIZ(new TBU(c91250Zra2) { // from class: X.Zy1
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJIIL);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJIIL = ((Number) obj).longValue();
            }
        })) {
            final C91250Zra c91250Zra3 = C91252Zrc.LIZ;
            C91252Zrc.LIZJ(new TBU(c91250Zra3) { // from class: X.Zy2
                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
                public final Object get() {
                    return Long.valueOf(((C91250Zra) this.receiver).LJIIL);
                }

                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
                public final void set(Object obj) {
                    ((C91250Zra) this.receiver).LJIIL = ((Number) obj).longValue();
                }
            });
        }
        C91302ZsQ LJJII = gv0().LJJII(null);
        final C91250Zra c91250Zra4 = C91252Zrc.LIZ;
        if (C91252Zrc.LIZ(new TBU(c91250Zra4) { // from class: X.Zxz
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJIILIIL);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJIILIIL = ((Number) obj).longValue();
            }
        })) {
            final C91250Zra c91250Zra5 = C91252Zrc.LIZ;
            C91252Zrc.LIZJ(new TBU(c91250Zra5) { // from class: X.Zy0
                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
                public final Object get() {
                    return Long.valueOf(((C91250Zra) this.receiver).LJIILIIL);
                }

                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
                public final void set(Object obj) {
                    ((C91250Zra) this.receiver).LJIILIIL = ((Number) obj).longValue();
                }
            });
        }
        int i = C91101ZpB.LIZ[LJJII.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (!this.LJLILLLLZI) {
                this.LJLJJI.setValue(Boolean.TRUE);
                return;
            } else {
                this.LJLILLLLZI = false;
                this.LJLJLJ.postValue(null);
                return;
            }
        }
        InterfaceC91296ZsK interfaceC91296ZsK = LJJII.LIZIZ;
        if (interfaceC91296ZsK == null) {
            return;
        }
        gv0().LJLILLLLZI.LJIIJJI(null, interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onExpiredPlayableEvent$music_dsp_release(C2IZ event) {
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList;
        String str;
        long j;
        o.LJIIIZ(event, "event");
        InterfaceC91281Zs5 interfaceC91281Zs5 = this.LJLLI;
        if (interfaceC91281Zs5 != null && interfaceC91281Zs5.a7()) {
            return;
        }
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited() || event.LJLIL) {
            jv0(event.LJLIL);
        }
        AbstractC91380Ztg LJIIZILJ = gv0().LJIIZILJ();
        if (LJIIZILJ != null) {
            copyOnWriteArrayList = LJIIZILJ.LJLIL;
        } else {
            copyOnWriteArrayList = null;
        }
        if (event.LJLIL) {
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                OSZ<String, Long> osz = this.LJLL;
                if (osz == null || (str = osz.getFirst()) == null) {
                    str = "";
                }
                OSZ<String, Long> osz2 = this.LJLL;
                if (osz2 != null) {
                    j = osz2.getSecond().longValue();
                } else {
                    j = 0;
                }
                this.LJLJI.setValue(Boolean.TRUE);
                this.LJLL = new OSZ<>(str, Long.valueOf(j));
                hv0(j, str);
            }
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTodayPlayableLimitedChangeEvent$music_dsp_release(C56082Ia event) {
        InterfaceC91296ZsK LIZ;
        o.LJIIIZ(event, "event");
        if (!event.LJLIL || (LIZ = gv0().LIZ()) == null) {
            return;
        }
        SVF.LJIILIIL(SVI.DSP_YDM.getNumber(), LIZ.LIZIZ());
        C91249ZrZ.LJIIIIZZ(LIZ.getEventData());
    }

    @Override // X.InterfaceC91291ZsF
    public void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        IXTabPanelAbility iXTabPanelAbility;
        String str;
        EnumC91282Zs6 enumC91282Zs6;
        o.LJIIIZ(playable, "playable");
        InterfaceC91281Zs5 interfaceC91281Zs5 = this.LJLLI;
        String str2 = null;
        if (interfaceC91281Zs5 != null) {
            iXTabPanelAbility = interfaceC91281Zs5.th();
        } else {
            iXTabPanelAbility = null;
        }
        if (!this.LJLLILLLL) {
            C91203Zqp.LIZJ(new IDqS421S0100000_29(iXTabPanelAbility, 72));
        }
        this.LJLLILLLL = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCurrentPlayableChanged: operation: ");
        if (c91299ZsN != null) {
            str = c91299ZsN.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (c91299ZsN != null) {
            str2 = c91299ZsN.LIZ;
        }
        if (o.LJ(str2, "PLAY_FROM_AUTO_PLAY_NEXT")) {
            enumC91282Zs6 = EnumC91282Zs6.UNKNOWN;
        } else {
            enumC91282Zs6 = EnumC91282Zs6.UNKNOWN;
        }
        if (o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread())) {
            this.LJLJJL.setValue(new C91453Zur(false, enumC91282Zs6, 5));
        } else {
            this.LJLJJL.postValue(new C91453Zur(false, enumC91282Zs6, 5));
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
