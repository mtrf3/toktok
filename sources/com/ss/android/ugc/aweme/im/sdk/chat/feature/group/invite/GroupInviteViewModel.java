package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import X.C16880lQ;
import X.C221108m2;
import X.C246099lF;
import X.C254879zP;
import X.C254899zR;
import X.C254929zU;
import X.C254939zV;
import X.C254969zY;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78613UtF;
import X.EnumC254909zS;
import X.EnumC58928NAu;
import X.InterfaceC67352kd;
import X.PO8;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS9S2000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GroupInviteViewModel extends AssemViewModel<C254969zY> {
    public static final /* synthetic */ int LJLJJL = 0;
    public final String LJLIL;
    public final GroupInfo LJLILLLLZI;
    public final PO8 LJLJI = new PO8("ChatGroupInvite::GroupInviteViewModel");
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C254929zU.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C254969zY defaultState() {
        return new C254969zY(0);
    }

    public final C254939zV jv0() {
        return (C254939zV) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C254939zV jv0 = jv0();
        jv0.getClass();
        jv0.LJI = CardStruct.IStatusCode.DEFAULT;
        XKX.LIZLLL(getAssemVMScope(), null, null, new C246099lF(this, null), 3);
    }

    public final void hv0(Context context) {
        o.LJIIIZ(context, "context");
        withState(new AqS132S0200000_1(context, this, 8));
    }

    public final Object iv0(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        jv0().LIZ(EnumC254909zS.NETWORK_START, SystemClock.elapsedRealtime());
        PO8 po8 = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch in ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        po8.d(X1D.LIZIZ(LIZ));
        setState(C254879zP.LJLIL);
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new C254899zR(this, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public GroupInviteViewModel(String str, GroupInfo groupInfo) {
        this.LJLIL = str;
        this.LJLILLLLZI = groupInfo;
    }

    public final void gv0(String str, String str2) {
        withState(new AqS9S2000000_4(str, str2, 2));
    }
}
