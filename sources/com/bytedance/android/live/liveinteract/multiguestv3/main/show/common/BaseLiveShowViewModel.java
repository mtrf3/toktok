package com.bytedance.android.live.liveinteract.multiguestv3.main.show.common;

import X.C0NB;
import X.C15610jN;
import X.C221108m2;
import X.C29044Baa;
import X.C29108Bbc;
import X.C29306Beo;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C75271TgR;
import X.C8E;
import X.InterfaceC75441TjB;
import X.TQA;
import X.U30;
import X.U33;
import X.U35;
import X.U3H;
import X.U3X;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public abstract class BaseLiveShowViewModel extends ViewModel {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>(0);
    public final MutableLiveData<C75271TgR> LJLILLLLZI = new MutableLiveData<>(null);
    public final MutableLiveData<U33> LJLJI = new MutableLiveData<>(null);
    public final MutableLiveData<ShowConfig> LJLJJI;
    public final U3H LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final long LJLJL;
    public DataChannel LJLJLJ;
    public LifecycleOwner LJLJLLL;

    public void gv0() {
    }

    public void hv0(int i) {
    }

    public void iv0(int i) {
    }

    public final C73318Sq2 nv0() {
        return (C73318Sq2) this.LJLJJLL.getValue();
    }

    public BaseLiveShowViewModel() {
        long id;
        ShowConfig showConfig = new ShowConfig();
        showConfig.durationPerGuest = 300L;
        showConfig.allowOpenMicFreely = MultiGuestLiveShowConfigSetting.INSTANCE.isAllowOpenMic();
        this.LJLJJI = new MutableLiveData<>(showConfig);
        this.LJLJJL = new U3H(this);
        this.LJLJJLL = C221108m2.LIZIZ(U3X.LJLIL);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LJLJL = id;
    }

    public static long ov0() {
        Long LJIIJ;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && (LJIIJ = LIZ.LJIIJ()) != null) {
            return LJIIJ.longValue();
        }
        return 0L;
    }

    public final long LJJLI() {
        String LLLLLLIL;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLLLLLIL = R6.LLLLLLIL()) != null) {
            return CastLongProtector.parseLong(LLLLLLIL);
        }
        return 0L;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIIZZ(this.LJLJJL);
        }
        nv0().LIZLLL();
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null) {
            LIZ2.destroy();
        }
    }

    public void onInit() {
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            LIZ.LJFF(this.LJLJJL);
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLJLLL, LiveShowNextGuestEvent.class, new AqS179S0100000_13(this, 179));
            dataChannel.lv0(this.LJLJLLL, LiveShowContentChangedEvent.class, new AqS179S0100000_13(this, 180));
        }
    }

    public void jv0(String str) {
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            LIZ.clearCache();
        }
    }

    public final void lv0(ShowConfig showConfig) {
        if (!U30.LIZLLL(showConfig, this.LJLJJI.getValue())) {
            this.LJLJJI.setValue(showConfig);
        }
    }

    public final void mv0(U33 showingUser) {
        o.LJIIIZ(showingUser, "showingUser");
        C29306Beo.LJJJIL(new AqS160S0200000_13(this, showingUser, 12));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update showingUser: ");
        LIZ.append(showingUser);
        C0NB.LIZIZ("remain time test", X1D.LIZIZ(LIZ));
    }

    public final void kv0(List<ShowListUser> list, List<ShowListUser> list2, boolean z) {
        ShowListUser showListUser;
        List<ShowListUser> list3;
        C75271TgR LIZ = U30.LIZ(list, list2, z);
        C75271TgR value = this.LJLILLLLZI.getValue();
        List<ShowListUser> list4 = null;
        if (value != null) {
            showListUser = value.LIZ;
        } else {
            showListUser = null;
        }
        if (U30.LIZIZ(showListUser, LIZ.LIZ)) {
            if (value != null) {
                list3 = value.LIZIZ;
            } else {
                list3 = null;
            }
            if (U30.LIZJ(list3, LIZ.LIZIZ)) {
                if (value != null) {
                    list4 = value.LIZJ;
                }
                if (U30.LIZJ(list4, LIZ.LIZJ)) {
                    return;
                }
            }
        }
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(new AqS160S0200000_13(this, LIZ, 11), 256));
    }
}
