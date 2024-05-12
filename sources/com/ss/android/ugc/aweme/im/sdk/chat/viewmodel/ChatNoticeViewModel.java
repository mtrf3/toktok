package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.C30U;
import X.C48841JEv;
import X.C64962gm;
import X.C78613UtF;
import X.C80733Ev;
import X.C98523to;
import X.C99033ud;
import X.EXV;
import X.XIA;
import X.XIF;
import X.XKW;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import djb.IDaS20S0000000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class ChatNoticeViewModel extends ViewModel {
    public static final /* synthetic */ int LJLL = 0;
    public final C99033ud LJLIL;
    public final int LJLILLLLZI;
    public final XKW LJLJI;
    public final XKW LJLJJI;
    public final TikTokImApi LJLJJL;
    public final C64962gm LJLJJLL;
    public final IDaS20S0000000_1 LJLJL;
    public final MutableLiveData<ImChatTopTipModel> LJLJLJ;
    public MAFIMUser LJLJLLL;

    public final void gv0() {
        XKX.LIZLLL(this.LJLJJLL, this.LJLJL, null, new C80733Ev(this, null), 2);
    }

    public final String hv0() {
        IMUser fromUser;
        String uid;
        C99033ud c99033ud = this.LJLIL;
        if (!(c99033ud instanceof C98523to) || (fromUser = ((C98523to) c99033ud).getFromUser()) == null || (uid = fromUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public ChatNoticeViewModel(C99033ud sessionInfo, int i) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        XIF mainDispatcher = EXV.LIZ;
        TikTokImApi tikTokImApi = C30U.LIZ();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        o.LJIIIZ(tikTokImApi, "tikTokImApi");
        this.LJLIL = sessionInfo;
        this.LJLILLLLZI = i;
        this.LJLJI = ioDispatcher;
        this.LJLJJI = mainDispatcher;
        this.LJLJJL = tikTokImApi;
        this.LJLJJLL = C48841JEv.LIZ(ioDispatcher);
        this.LJLJL = new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 28);
        this.LJLJLJ = new MutableLiveData<>();
    }
}
