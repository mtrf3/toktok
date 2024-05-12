package com.ss.android.ugc.aweme.friendstab.ui;

import X.C16880lQ;
import X.C48841JEv;
import X.C52926Kpu;
import X.C54404LWu;
import X.C57150Mbq;
import X.C57154Mbu;
import X.C57158Mby;
import X.C57159Mbz;
import X.C57778Mly;
import X.C73318Sq2;
import X.C78999UzT;
import X.EnumC54550Lb0;
import X.EnumC58046MqI;
import X.EnumC77147UPn;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.MBE;
import X.QD3;
import X.T2R;
import X.UTK;
import X.XI8;
import X.XKX;
import Y.AfS58S0200000_9;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class FriendsEmptyPageRootVM extends ViewModel {
    public FriendsEmptyPageMainSectionVM LJLILLLLZI;
    public final MutableLiveData<C57159Mbz> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public C57778Mly LJLJL;
    public final List<EnumC58046MqI> LJLJLJ;
    public EnumC58046MqI LJLJLLL;
    public final InterfaceC70422pa LJLIL = C48841JEv.LIZ(MBE.LIZ(T2R.LJIIJJI(), new XI8(C16880lQ.LLLLZLLIL())));
    public EnumC54550Lb0 LJLJI = EnumC54550Lb0.EMPTY_STATE;
    public final C73318Sq2 LJLJJI = new C73318Sq2();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLJJI.LIZLLL();
        EventBus.LIZJ().LJIJ(this);
    }

    public FriendsEmptyPageRootVM() {
        MutableLiveData<C57159Mbz> mutableLiveData = new MutableLiveData<>(new C57159Mbz(0));
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = new C57778Mly(0);
        this.LJLJLJ = new ArrayList();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final void gv0() {
        int i = 0;
        if (C52926Kpu.LIZ()) {
            EnumC77147UPn[] values = EnumC77147UPn.values();
            int length = values.length;
            while (i < length) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C57150Mbq(values[i], this, null), 3);
                i++;
            }
            return;
        }
        this.LJLJJI.LIZLLL();
        EnumC58046MqI[] values2 = EnumC58046MqI.values();
        int length2 = values2.length;
        while (i < length2) {
            EnumC58046MqI enumC58046MqI = values2[i];
            C78999UzT.LJFF(UTK.LIZIZ.LJFF(enumC58046MqI).LIZIZ().LJJJJZI(new AfS58S0200000_9(this, enumC58046MqI, 4)), this.LJLJJI);
            i++;
        }
    }

    public final void hv0(EnumC58046MqI enumC58046MqI) {
        if (this.LJLJL.LIZIZ()) {
            if (!((ArrayList) this.LJLJLJ).contains(enumC58046MqI)) {
                ((ArrayList) this.LJLJLJ).add(enumC58046MqI);
            }
            this.LJLJLLL = enumC58046MqI;
            iv0(new AqS175S0100000_9(this, 89));
        }
    }

    public final void iv0(InterfaceC88472Yns interfaceC88472Yns) {
        XKX.LIZLLL(this.LJLIL, null, null, new C57154Mbu(this, interfaceC88472Yns, null), 3);
    }

    @QD3(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onRefreshEvent(C54404LWu event) {
        o.LJIIIZ(event, "event");
        iv0(C57158Mby.LJLIL);
    }
}
