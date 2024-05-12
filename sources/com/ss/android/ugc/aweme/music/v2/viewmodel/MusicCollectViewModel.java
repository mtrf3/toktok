package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C177336xd;
import X.C199097rd;
import X.C72818Shy;
import X.C72912tb;
import X.C76800UCe;
import X.C8SO;
import X.EnumC78522Urm;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC88472Yns;
import X.TBT;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicCollectViewModel extends AssemViewModel<C8SO> implements FavoriteAbility, InterfaceC72822Si2 {
    public String LJLIL;

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void Tk0() {
        withState(new AqS169S0100000_3(this, 281));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C8SO defaultState() {
        return new C8SO(new C72912tb(0), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C72818Shy.LJII("music_chart_collect_sync_event", this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C72818Shy.LIZLLL("music_chart_collect_sync_event", this);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void ld(InterfaceC88472Yns<? super Boolean, C76800UCe> subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.8SN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8SO) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3(subscriber, (InterfaceC88472Yns<? super C177336xd, C76800UCe>) 280), 14, null);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        if (o.LJ(c199097rd.LJLIL, "music_chart_collect_sync_event") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && interfaceC78280Uns.getType("music_id") == EnumC78522Urm.String && interfaceC78280Uns.getType("collect_status") == EnumC78522Urm.Int) {
            int i = interfaceC78280Uns.getInt("collect_status");
            if (o.LJ(interfaceC78280Uns.getString("music_id"), this.LJLIL)) {
                setState(new AqS28S0001000_3(i, 27));
            }
        }
    }
}
