package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common;

import X.C101543yg;
import X.C101703yw;
import X.C17N;
import X.C3EU;
import X.C3Y4;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C80533Eb;
import X.C85163Vw;
import X.C89333ez;
import X.C98523to;
import X.C99033ud;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatCommonViewModel extends AssemViewModel<C101703yw> {
    public final C85163Vw LJLIL;
    public final C3Y4 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;

    public ChatCommonViewModel() {
        C80533Eb userRepository = C80533Eb.LIZ;
        C85163Vw c85163Vw = C85163Vw.LIZ;
        C3Y4 c3y4 = C3Y4.LIZ;
        o.LJIIIZ(userRepository, "userRepository");
        this.LJLIL = c85163Vw;
        this.LJLILLLLZI = c3y4;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 925));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C101703yw defaultState() {
        return new C101703yw(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C101543yg.LIZ.getClass();
        C101543yg.LIZIZ = -1;
        this.LJLILLLLZI.getClass();
        C3Y4.LIZLLL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        final C98523to c98523to;
        IMUser fromUser;
        super.onPrepared();
        C99033ud c99033ud = (C99033ud) this.LJLJJI.getValue();
        if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && (fromUser = c98523to.getFromUser()) != null && !IMUser.isInvalidUser(fromUser.getUid())) {
            C80533Eb.LJIIJJI(fromUser.getUid(), fromUser.getSecUid(), true, new C3EU() { // from class: X.3yv
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    IMUser fromUser2;
                    String recType;
                    String recType2;
                    o.LJIIIZ(result, "result");
                    ChatCommonViewModel chatCommonViewModel = ChatCommonViewModel.this;
                    C98523to c98523to2 = c98523to;
                    chatCommonViewModel.getClass();
                    if (C3UE.LIZIZ() && (fromUser2 = c98523to2.getFromUser()) != null && (recType = fromUser2.getRecType()) != null && ((recType2 = result.getRecType()) == null || recType2.length() == 0)) {
                        result.setRecType(recType);
                    }
                    c98523to.setFromUser(result);
                    C101543yg c101543yg = C101543yg.LIZ;
                    int followerStatus = result.getFollowerStatus();
                    c101543yg.getClass();
                    C101543yg.LIZIZ = followerStatus;
                    C85163Vw.LIZ(c98523to.getFromUser(), c98523to.getConversationId(), Integer.valueOf(c98523to.getEnterFrom()), "SingleChatViewModel");
                    ChatCommonViewModel.this.setState(new AqS167S0100000_1(result, 355));
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
        C3Y4 c3y4 = this.LJLILLLLZI;
        C99033ud c99033ud2 = (C99033ud) this.LJLJJI.getValue();
        c3y4.getClass();
        C3Y4.LIZLLL = c99033ud2;
    }
}
