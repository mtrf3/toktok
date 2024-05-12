package com.ss.android.ugc.aweme.relation.viewmodel;

import X.AV1;
import X.ActivityC45651qj;
import X.C243529h6;
import X.C45804HyK;
import X.C52926Kpu;
import X.C57126MbS;
import X.C73411SrX;
import X.C73969T1h;
import X.C77171UQl;
import X.C84763XOl;
import X.EnumC77147UPn;
import X.T16;
import X.T3Q;
import X.UPG;
import X.UPZ;
import X.UQ4;
import X.UQ7;
import X.XKX;
import Y.AfS26S1100000_13;
import Y.AfS65S0100000_13;
import Y.IDhS106S0100000_13;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SocialRecRequestViewModel extends JediViewModel<SocialRecRequestState> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C73411SrX LJLJJLL;
    public boolean LJLJL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final SocialRecRequestState kv0() {
        return new SocialRecRequestState(false, false, false, false, false, false, null, 0, 0, false, 1023, null);
    }

    public final void Hv0(int i, String str) {
        ActivityC45651qj LJJIFFI;
        if (i == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) == null) {
                return;
            }
            if (C52926Kpu.LIZ()) {
                EnumC77147UPn platform = EnumC77147UPn.FACEBOOK;
                o.LJIIIZ(platform, "platform");
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LJJIFFI), null, null, new C77171UQl(LJJIFFI, platform, this, null), 3);
                return;
            }
            this.LJLJJLL = (C73411SrX) T3Q.LIZLLL(LJJIFFI, UPG.class, AV1.LIZIZ().getUid(), "version_update", "auto").LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS26S1100000_13(this, str, 4));
            return;
        }
        UQ4.LIZLLL("version_update", "user", "contact", "auto", "uid", "process", null, null, 448);
        UPZ.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        disposeOnClear(C57126MbS.LIZ().syncSocialRelationStatusInRx(1, Boolean.TRUE, Boolean.FALSE, false).LJJIII(new IDhS106S0100000_13(this, 0), false).LJJLIIIJJI(5L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(this, 114), new AfS65S0100000_13(this, 109)));
    }

    public static void Iv0(String str, boolean z, boolean z2) {
        new C243529h6("version_update", "auto", z, z2, str);
    }
}
