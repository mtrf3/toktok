package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel;

import X.AbstractC90763hI;
import X.C14Q;
import X.C63120Opw;
import X.C76800UCe;
import X.C78948Uye;
import X.C80723Eu;
import X.C84283Sm;
import X.C84333Sr;
import X.C91423iM;
import X.C98563ts;
import X.InterfaceC88472Yns;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.GroupQuickChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupQuickChatRoomViewModel extends BaseQuickChatRoomViewModel {
    public final C98563ts LJLL;
    public final InterfaceC88472Yns<C63120Opw, String> LJLLI;
    public final MutableLiveData<String> LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final LiveData<String> LJLLL;
    public final LiveData<Integer> LJLLLL;
    public final LiveData<UrlModel> LJLLLLLL;

    public GroupQuickChatRoomViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void iv0() {
        this.LJLLILLLL.postValue("name");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void jv0() {
        this.LJLLILLLL.postValue("name");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final LiveData<UrlModel> gv0() {
        return this.LJLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final LiveData<String> hv0() {
        return this.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel
    public final void lv0(int i) {
        if (o.LJ(this.LJLJI.getValue(), Boolean.TRUE)) {
            if (i == R.raw.icon_flag) {
                this.LJLJLJ.setValue(new C91423iM(this.LJLL));
                C80723Eu.LIZIZ(null);
                return;
            }
            this.LJLLILLLL.postValue("button");
            return;
        }
        this.LJLJJLL.postValue(C76800UCe.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQuickChatRoomViewModel(GroupChatViewModel groupChatViewModel, AbstractC90763hI conversationModel, C98563ts sessionInfo) {
        super(conversationModel);
        C84333Sr c84333Sr = new C84333Sr(C84283Sm.LIZ);
        o.LJIIIZ(groupChatViewModel, "groupChatViewModel");
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LJLL = sessionInfo;
        this.LJLLI = c84333Sr;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData;
        this.LJLLJ = mutableLiveData;
        LiveData<String> map = Transformations.map(groupChatViewModel.LJLJJL, new C14Q() { // from class: X.3v7
            @Override // X.C14Q
            public final Object apply(Object obj) {
                GroupQuickChatRoomViewModel groupQuickChatRoomViewModel = GroupQuickChatRoomViewModel.this;
                if (obj == null) {
                    groupQuickChatRoomViewModel.getClass();
                    return "";
                }
                return groupQuickChatRoomViewModel.LJLLI.invoke(obj);
            }
        });
        o.LJIIIIZZ(map, "map(groupChatViewModel.c…etGroupChatName(it)\n    }");
        this.LJLLL = map;
        LiveData<Integer> map2 = Transformations.map(groupChatViewModel.LJLJJL, new C14Q() { // from class: X.3v8
            @Override // X.C14Q
            public final Object apply(Object obj) {
                int i;
                C63120Opw c63120Opw = (C63120Opw) obj;
                GroupQuickChatRoomViewModel.this.getClass();
                if (c63120Opw != null) {
                    i = c63120Opw.getMemberCount();
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
        });
        o.LJIIIIZZ(map2, "map(groupChatViewModel.c… getMemberCount(it)\n    }");
        this.LJLLLL = map2;
        LiveData<UrlModel> map3 = Transformations.map(groupChatViewModel.LJLJJL, C78948Uye.LJLIL);
        o.LJIIIIZZ(map3, "map(groupChatViewModel.c….icon?.toUrlModel()\n    }");
        this.LJLLLLLL = map3;
    }
}
