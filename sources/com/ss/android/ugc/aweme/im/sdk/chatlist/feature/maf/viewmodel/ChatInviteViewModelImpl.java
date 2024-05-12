package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel;

import X.C30U;
import X.C65392hT;
import X.C65922iK;
import X.C78613UtF;
import X.XIA;
import X.XKW;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.service.session.ChatInviteViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatInviteViewModelImpl extends ChatInviteViewModel {
    public static final C65922iK LJLJL = new Object() { // from class: X.2iK
    };
    public final XKW LJLJI;
    public final TikTokImApi LJLJJI;
    public final MutableLiveData<ChatInviteShareResponse> LJLJJL;
    public final MutableLiveData LJLJJLL;

    public ChatInviteViewModelImpl() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInviteViewModelImpl(int i) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        TikTokImApi tikTokImApi = C30U.LIZ();
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(tikTokImApi, "tikTokImApi");
        this.LJLJI = ioDispatcher;
        this.LJLJJI = tikTokImApi;
        MutableLiveData<ChatInviteShareResponse> mutableLiveData = new MutableLiveData<>(new ChatInviteShareResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0));
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
    }

    @Override // com.ss.android.ugc.aweme.im.service.session.ChatInviteViewModel
    public final void gv0(String str) {
        if (str == null) {
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C65392hT(this, str, null), 3);
    }
}
