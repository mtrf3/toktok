package com.ss.android.ugc.aweme.innerpush.model;

import X.InterfaceC65243Pj5;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.SettingMessage;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class GetMessageListResponse extends BaseResponse implements InterfaceC65243Pj5 {
    public String LJLIL;

    @InterfaceC65349Pkn("messages")
    public final List<InnerPushMessage> messages;

    @InterfaceC65349Pkn("setting_messages")
    public final List<SettingMessage> settingMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public GetMessageListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC65243Pj5
    public final void setJsonData(String str) {
        this.LJLIL = str;
    }

    public GetMessageListResponse(List<InnerPushMessage> list, List<SettingMessage> list2) {
        this.messages = list;
        this.settingMessages = list2;
    }

    public /* synthetic */ GetMessageListResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
