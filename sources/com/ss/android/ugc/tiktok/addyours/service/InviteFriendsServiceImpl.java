package com.ss.android.ugc.tiktok.addyours.service;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C169576l7;
import X.C198647qu;
import X.C218978ib;
import X.C218998id;
import X.C221018lt;
import X.C3C5;
import X.C45804HyK;
import X.C76800UCe;
import X.C78253UnR;
import X.InterfaceC218828iM;
import X.InterfaceC88472Yns;
import android.content.Context;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InviteFriendsServiceImpl implements IInviteFriendsService {
    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC218828iM> LIZ() {
        return C218978ib.class;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC218828iM> LIZIZ() {
        return C198647qu.class;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final void LIZJ(Context context, Class<? extends InterfaceC218828iM> behaviorClass, InterfaceC88472Yns<? super C169576l7, C76800UCe> interfaceC88472Yns) {
        ActivityC45651qj LJJIFFI;
        InterfaceC218828iM LIZ;
        o.LJIIIZ(behaviorClass, "behaviorClass");
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            if (!C218998id.LIZ()) {
                return;
            } else {
                throw new IllegalArgumentException("the [context] needs to be an instance of FragmentActivity");
            }
        }
        C169576l7 c169576l7 = new C169576l7(null, 0, null, null, 15, null);
        interfaceC88472Yns.invoke(c169576l7);
        try {
            LIZ = behaviorClass.newInstance();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LJ(m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        C78253UnR.LIZIZ(LJJIFFI, new AqS92S0300000_3(LJJIFFI, (InterfaceC218828iM) LIZ, c169576l7, 6));
    }
}
