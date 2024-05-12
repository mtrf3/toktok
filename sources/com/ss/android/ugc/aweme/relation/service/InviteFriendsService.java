package com.ss.android.ugc.aweme.relation.service;

import X.ActivityC45651qj;
import X.C221018lt;
import X.C25706A7a;
import X.C25710A7e;
import X.C25715A7j;
import X.C40669Fxh;
import X.C52780KnY;
import X.C55783Lut;
import X.C57131MbX;
import X.C57134Mba;
import X.C63804P2i;
import X.C73542Ste;
import X.HG3;
import X.InterfaceC108804Ou;
import X.InterfaceC55759LuV;
import X.InterfaceC55760LuW;
import X.InterfaceC57133MbZ;
import X.InterfaceC57137Mbd;
import X.InterfaceC57138Mbe;
import X.InterfaceC62585OhJ;
import X.RBX;
import X.T16;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InviteFriendsService implements IInviteFriendsService {
    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJ() {
        boolean z;
        String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUid, "curUid");
        if (((Number) C52780KnY.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C221018lt.LJFF("LinkStatusFixer", "not enable fix!");
            return;
        }
        if (((Keva) C25715A7j.LIZ.getValue()).getBoolean(curUid, false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(curUid);
            LIZ.append(" has fixed!");
            C221018lt.LJFF("LinkStatusFixer", X1D.LIZIZ(LIZ));
            return;
        }
        if (!((Keva) C25715A7j.LIZIZ.getValue()).getBoolean(curUid, false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(curUid);
            LIZ2.append(" not shown!");
            C221018lt.LJFF("LinkStatusFixer", X1D.LIZIZ(LIZ2));
            return;
        }
        C73542Ste.LJII(C25715A7j.LIZJ.updateLinkPrivacyPopupStatus(true).LJJIIJ(T16.LIZ()), null, new AqS29S1000000_4(curUid, 6), 1);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57138Mbe LIZIZ() {
        return (InterfaceC57138Mbe) C40669Fxh.LIZ.LIZ().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC55759LuV LJFF() {
        return new C55783Lut();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC55760LuW LJI() {
        return (InterfaceC55760LuW) C40669Fxh.LIZ.LIZ().LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57137Mbd LIZLLL() {
        return C57131MbX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57133MbZ LIZJ(ActivityC45651qj context, boolean z) {
        o.LJIIIZ(context, "context");
        if (C25706A7a.LIZ()) {
            return new C25710A7e(context, z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC108804Ou LJII(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        return new C57134Mba(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC62585OhJ LIZ(Context context, Bundle bundle, String str, String str2, AqS157S0200000_10 aqS157S0200000_10, AqS157S0200000_10 aqS157S0200000_102) {
        o.LJIIIZ(context, "context");
        return new C63804P2i(context, bundle, str, str2, aqS157S0200000_10, aqS157S0200000_102);
    }
}
