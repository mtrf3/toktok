package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel;

import X.AbstractC90763hI;
import X.AnonymousClass325;
import X.C110594Vr;
import X.C32F;
import X.C3EU;
import X.C76800UCe;
import X.C772831o;
import X.C80313Df;
import X.C80533Eb;
import X.C80723Eu;
import X.C84643Tw;
import X.C85323Wm;
import X.C91423iM;
import X.C98523to;
import X.InterfaceC75532xp;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.SingleQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleQuickChatRoomViewModel extends BaseQuickChatRoomViewModel {
    public final C98523to LJLL;
    public final InterfaceC75532xp LJLLI;
    public final InterfaceC88474Ynu<String, String, Boolean, C3EU, C76800UCe> LJLLILLLL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLLJ;
    public final MutableLiveData<String> LJLLL;
    public final MutableLiveData LJLLLL;
    public final MutableLiveData<UrlModel> LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final MutableLiveData<IMUser> LJZ;
    public final MutableLiveData LJZI;
    public final MutableLiveData<IMUser> LJZL;
    public final MutableLiveData LL;

    public SingleQuickChatRoomViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void iv0() {
        String singleChatFromUserId = this.LJLL.getSingleChatFromUserId();
        if (IMUser.isInvalidUser(singleChatFromUserId)) {
            return;
        }
        C84643Tw.LIZJ(singleChatFromUserId, "chat", "click_name", null, this.LJLLI);
        this.LJLLJ.invoke(singleChatFromUserId);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void jv0() {
        String singleChatFromUserId = this.LJLL.getSingleChatFromUserId();
        if (IMUser.isInvalidUser(singleChatFromUserId)) {
            return;
        }
        C84643Tw.LIZJ(singleChatFromUserId, "chat", "click_name", null, this.LJLLI);
        this.LJLLJ.invoke(singleChatFromUserId);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final LiveData<UrlModel> gv0() {
        return this.LJLZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final LiveData<String> hv0() {
        return this.LJLLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void lv0(int i) {
        if (o.LJ(this.LJLJI.getValue(), Boolean.TRUE)) {
            if (i == R.raw.icon_flag) {
                C91423iM c91423iM = new C91423iM(this.LJLL);
                if (c91423iM.LIZ() == null) {
                    return;
                }
                this.LJLJLJ.setValue(c91423iM);
                C80723Eu.LIZ(this.LJLL.getFromUser(), this.LJLLI);
                return;
            }
            if (this.LJLL.getFromUser() == null) {
                return;
            }
            String conversationId = this.LJLL.getConversationId();
            String singleChatFromUserId = this.LJLL.getSingleChatFromUserId();
            if (singleChatFromUserId == null) {
                singleChatFromUserId = "";
            }
            C84643Tw.LIZIZ(conversationId, singleChatFromUserId, this.LJLLI);
            this.LJZ.setValue(this.LJLL.getFromUser());
            return;
        }
        this.LJLJJLL.postValue(C76800UCe.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleQuickChatRoomViewModel(AbstractC90763hI conversationModel, C98523to sessionInfo) {
        super(conversationModel);
        UrlModel urlModel;
        IMUser fromUser;
        String displayName;
        C85323Wm eventSender = C772831o.LIZ();
        C80313Df c80313Df = new C80313Df(C80533Eb.LIZ);
        C32F c32f = new C32F(AnonymousClass325.LIZ);
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(eventSender, "eventSender");
        this.LJLL = sessionInfo;
        this.LJLLI = eventSender;
        this.LJLLILLLL = c80313Df;
        this.LJLLJ = c32f;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLLL = mutableLiveData;
        this.LJLLLL = mutableLiveData;
        MutableLiveData<UrlModel> mutableLiveData2 = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData2;
        this.LJLZ = mutableLiveData2;
        MutableLiveData<IMUser> mutableLiveData3 = new MutableLiveData<>();
        this.LJZ = mutableLiveData3;
        this.LJZI = mutableLiveData3;
        MutableLiveData<IMUser> mutableLiveData4 = new MutableLiveData<>();
        this.LJZL = mutableLiveData4;
        this.LL = mutableLiveData4;
        IMUser fromUser2 = sessionInfo.getFromUser();
        mutableLiveData.setValue((fromUser2 == null || (displayName = fromUser2.getDisplayName()) == null) ? "" : displayName);
        IMUser fromUser3 = sessionInfo.getFromUser();
        if (fromUser3 != null) {
            urlModel = fromUser3.getDisplayAvatar();
        } else {
            urlModel = null;
        }
        mutableLiveData2.setValue(urlModel);
        if (C110594Vr.LIZ() || (fromUser = sessionInfo.getFromUser()) == null || IMUser.isInvalidUser(fromUser.getUid())) {
            return;
        }
        c80313Df.invoke(fromUser.getUid(), fromUser.getSecUid(), Boolean.TRUE, new C3EU() { // from class: X.3iK
            @Override // X.C3EU
            public final void LIZ(IMUser result) {
                String displayName2;
                o.LJIIIZ(result, "result");
                SingleQuickChatRoomViewModel.this.LJLL.setFromUser(result);
                IMUser fromUser4 = SingleQuickChatRoomViewModel.this.LJLL.getFromUser();
                if (fromUser4 != null && (displayName2 = fromUser4.getDisplayName()) != null) {
                    SingleQuickChatRoomViewModel.this.LJLLL.setValue(displayName2);
                }
                SingleQuickChatRoomViewModel.this.LJZL.setValue(result);
                SingleQuickChatRoomViewModel.this.LJLLLLLL.setValue(result.getDisplayAvatar());
                C85163Vw.LIZ(SingleQuickChatRoomViewModel.this.LJLL.getFromUser(), SingleQuickChatRoomViewModel.this.LJLL.getConversationId(), Integer.valueOf(SingleQuickChatRoomViewModel.this.LJLL.getEnterFrom()), "SingleChatPanel");
            }

            @Override // X.C3EU
            public final void LIZIZ(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
            }
        });
    }
}
