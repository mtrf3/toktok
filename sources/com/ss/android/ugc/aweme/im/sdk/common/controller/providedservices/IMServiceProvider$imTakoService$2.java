package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C84603Ts;
import X.C8SE;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$imTakoService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C84603Ts> {
    public static final IMServiceProvider$imTakoService$2 INSTANCE = new IMServiceProvider$imTakoService$2();

    public IMServiceProvider$imTakoService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Ts] */
    @Override // X.InterfaceC65784Pro
    public final C84603Ts invoke() {
        return new C8SE() { // from class: X.3Ts
            @Override // X.C8SE
            public final NextLiveData<Boolean> LIZ() {
                NextLiveData<Boolean> LIZIZ = C57082Lw.LIZ.LIZIZ("#ENTER_CHAT_SUCCESS_EVENT");
                o.LJIIIIZZ(LIZIZ, "get().with(ENTER_CHAT_SU…ENT, Boolean::class.java)");
                return LIZIZ;
            }

            @Override // X.C8SE
            public final NextLiveData<Boolean> LIZJ() {
                NextLiveData<Boolean> LIZIZ = C57082Lw.LIZ.LIZIZ("#AUTO_SEND_MSG_SUCCESS_EVENT");
                o.LJIIIIZZ(LIZIZ, "get().with(AUTO_SEND_MSG…ENT, Boolean::class.java)");
                return LIZIZ;
            }

            @Override // X.C8SE
            public final boolean LIZLLL() {
                if (((Number) C84623Tu.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.C8SE
            public final void LIZIZ(String str, Long l) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C65602ho(1, l, str, null), 3);
            }

            @Override // X.C8SE
            public final void LJ(Context context, C99003ua c99003ua) {
                o.LJIIIZ(context, "context");
                String LJIIIIZZ = C96413qP.LIZ.LJIIIIZZ(2, c99003ua.getTakoId());
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = "";
                }
                c99003ua.setSessionId(LJIIIIZZ);
                IMUser iMUser = new IMUser();
                iMUser.setUid(c99003ua.getTakoId());
                C96963rI.LJII().getClass();
                iMUser.setNickName(C97353rv.LIZJ());
                iMUser.setAvatarThumb(new UrlModel());
                c99003ua.setImUser(iMUser);
                if (c99003ua.getSessionId().length() == 0) {
                    return;
                }
                BaseChatRoomFragment.Companion.getClass();
                C98743uA.LIZIZ(context, c99003ua);
            }
        };
    }
}
