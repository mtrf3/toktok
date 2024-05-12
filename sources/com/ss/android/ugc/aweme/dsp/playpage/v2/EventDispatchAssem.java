package com.ss.android.ugc.aweme.dsp.playpage.v2;

import X.C213358Yx;
import X.C214298b3;
import X.C2IZ;
import X.C2JO;
import X.C2K0;
import X.C42625Go9;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C91411ZuB;
import X.C91565Zwf;
import X.C9BD;
import X.InterfaceC55102Lju;
import X.QD3;
import X.X1D;
import X.YBK;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class EventDispatchAssem extends C8W0 implements IEventDispatchAbility, InterfaceC55102Lju {
    public final MutableLiveData<C213358Yx> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<FollowStatus> LJLJI;
    public final MutableLiveData<C2JO> LJLJJI;
    public final MutableLiveData<C91411ZuB> LJLJJL;
    public final C214298b3 LJLJJLL;

    public EventDispatchAssem() {
        MutableLiveData<C213358Yx> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LandingPageVm.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 48), C91565Zwf.INSTANCE, null);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1534287719) {
            return null;
        }
        return this;
    }

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility
    public final MutableLiveData Qf0() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility
    public final MutableLiveData RA() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility
    public final MutableLiveData V50() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility
    public final MutableLiveData XS() {
        return this.LJLJJI;
    }

    @QD3
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1) {
            this.LJLIL.postValue(event);
        }
    }

    @QD3
    public final void onDspNodeVisibleChangeEvent(C91411ZuB event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDspNodeVisibleChangeEvent:");
        LIZ.append(event);
        X1D.LIZIZ(LIZ);
        this.LJLJJL.postValue(event);
    }

    @QD3
    public final void onExpiredPlayableEvent(C2IZ event) {
        o.LJIIIZ(event, "event");
        if (!event.LJLIL) {
            int expiredPlayableCount = ExpiredPlayableManager.INSTANCE.getExpiredPlayableCount();
            YBK.LIZ.getClass();
            if (expiredPlayableCount >= YBK.LIZIZ()) {
                ((LandingPageVm) this.LJLJJLL.getValue()).gv0();
            }
        }
    }

    @QD3
    public final void onFollowEvent(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        this.LJLJI.postValue(event.status);
    }

    @QD3
    public final void onMusicDspTabChangeEvent(C2JO event) {
        o.LJIIIZ(event, "event");
        this.LJLJJI.postValue(event);
    }
}
