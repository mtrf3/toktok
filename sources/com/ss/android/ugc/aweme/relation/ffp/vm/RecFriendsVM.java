package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C221018lt;
import X.C33X;
import X.C57571Mid;
import X.C57778Mly;
import X.C58080Mqq;
import X.C78613UtF;
import X.C84661XKn;
import X.EnumC58046MqI;
import X.InterfaceC68342mE;
import X.P28;
import X.TBT;
import X.X1D;
import X.XIA;
import X.XKW;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS59S0201000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecFriendsVM extends AssemViewModel<C58080Mqq> {
    public final FindFriendsPageVM LJLIL;
    public final FFPMainFragmentVM LJLILLLLZI;
    public final XKW LJLJI;
    public final C57571Mid LJLJJI;
    public C57778Mly LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C58080Mqq defaultState() {
        return new C58080Mqq(0);
    }

    public final void iv0() {
        Set<EnumC58046MqI> jv0 = this.LJLIL.jv0();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh with: ");
        LIZ.append(jv0);
        C221018lt.LJFF("[ffp]_RecFriends", X1D.LIZIZ(LIZ));
        setState(new AqS175S0100000_9(jv0, (Set<? extends EnumC58046MqI>) 247));
    }

    public final void jv0() {
        XKX.LIZLLL(getAssemVMScope(), this.LJLJI, null, new P28(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        jv0();
        setState(new AqS176S0100000_10(this, 102));
        AssemViewModel.asyncSubscribe$default(this.LJLIL, new TBT() { // from class: X.P1Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLILLLLZI;
            }
        }, null, new AqS176S0100000_10(this, 103), null, new AqS176S0100000_10(this, 104), 10, null);
        AssemViewModel.asyncSubscribe$default(this.LJLIL, new TBT() { // from class: X.P1x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLJI;
            }
        }, null, new AqS176S0100000_10(this, 105), null, new AqS176S0100000_10(this, 106), 10, null);
    }

    public RecFriendsVM(FindFriendsPageVM findFriendsPageVM) {
        FFPMainFragmentVM iv0 = findFriendsPageVM.iv0();
        XIA ioDispatcher = C78613UtF.LIZJ;
        C57571Mid trackInfo = findFriendsPageVM.getState().LJLJJL;
        o.LJIIIZ(findFriendsPageVM, "findFriendsPageVM");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL = findFriendsPageVM;
        this.LJLILLLLZI = iv0;
        this.LJLJI = ioDispatcher;
        this.LJLJJI = trackInfo;
        this.LJLJJL = new C57778Mly(0);
    }

    public final List<InterfaceC68342mE<?>> gv0(FindFriendsPageVM findFriendsPageVM) {
        ArrayList arrayList = new ArrayList();
        C84661XKn c84661XKn = findFriendsPageVM.LJLL;
        if (c84661XKn != null) {
            arrayList.add(c84661XKn);
        } else {
            EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
            if (enumC58046MqI.isGrant() && (findFriendsPageVM.getState().LJLILLLLZI instanceof C33X)) {
                this.LJLIL.uh0(enumC58046MqI, "");
            }
        }
        C84661XKn c84661XKn2 = findFriendsPageVM.LJLJLLL;
        if (c84661XKn2 != null) {
            arrayList.add(c84661XKn2);
        } else {
            EnumC58046MqI enumC58046MqI2 = EnumC58046MqI.FACEBOOK;
            if (enumC58046MqI2.isGrant() && (findFriendsPageVM.getState().LJLJI instanceof C33X)) {
                this.LJLIL.uh0(enumC58046MqI2, "");
            }
        }
        return arrayList;
    }

    public final void hv0(EnumC58046MqI platform, int i) {
        o.LJIIIZ(platform, "platform");
        withState(new AqS59S0201000_10(platform, this, i, 2));
    }
}
