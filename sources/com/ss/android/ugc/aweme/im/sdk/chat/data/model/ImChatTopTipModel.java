package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public final class ImChatTopTipModel extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public IMNoticeMsgStruct noticeMsgStruct;

    @InterfaceC65349Pkn("data_arr")
    public List<IMNoticeMsgStruct> noticeMsgStructArr;

    public final IMNoticeMsgStruct getNoticeMsgStruct() {
        return this.noticeMsgStruct;
    }

    public final List<IMNoticeMsgStruct> getNoticeMsgStructArr() {
        return this.noticeMsgStructArr;
    }

    public final void setNoticeMsgStruct(IMNoticeMsgStruct iMNoticeMsgStruct) {
        this.noticeMsgStruct = iMNoticeMsgStruct;
    }

    public final void setNoticeMsgStructArr(List<IMNoticeMsgStruct> list) {
        this.noticeMsgStructArr = list;
    }
}
