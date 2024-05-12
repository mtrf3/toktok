package com.ss.android.ugc.aweme.task.fb;

import X.AnonymousClass030;
import X.C2NU;
import X.C77266UUc;
import X.EF7;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.InterfaceC64592gB;
import X.RBX;
import X.T16;
import Y.AfS18S1000000_1;
import android.content.Context;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FacebookUploadRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FacebookUploadRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.BOOT_FINISH;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(uid, "uid");
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        long LJIIIZ = c77266UUc.LJIIJ().LJIIIZ(uid);
        long LJIIL = c77266UUc.LJIIL();
        boolean LIZJ = c77266UUc.LJIIJ().LIZJ();
        if (((RBX) HG3.LJIILL()).isLogin() && LIZJ && LJIIL > 0) {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    if (LJIIIZ == -1 || LJIIIZ + LJIIL <= System.currentTimeMillis()) {
                        C77266UUc c77266UUc2 = C77266UUc.LIZIZ;
                        c77266UUc2.LJIIJ().LJIIIIZZ(System.currentTimeMillis(), uid);
                        c77266UUc2.LIZ.LJIILJJIL(uid).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.2nf
                            @Override // X.InterfaceC64592gB
                            public final void accept(Object obj) {
                                Integer num;
                                List friends;
                                FriendList friendList = (FriendList) obj;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("upload facebook token success and social users count is ");
                                if (friendList != null && (friends = friendList.getFriends()) != null) {
                                    num = Integer.valueOf(friends.size());
                                } else {
                                    num = null;
                                }
                                LIZ.append(num);
                                X1D.LIZIZ(LIZ);
                            }
                        }, new AfS18S1000000_1(uid, 0));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
