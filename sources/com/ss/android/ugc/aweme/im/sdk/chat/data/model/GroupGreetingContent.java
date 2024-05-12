package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C3IY;
import X.C81093Gf;
import X.InterfaceC65349Pkn;
import X.ORZ;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

/* loaded from: classes2.dex */
public final class GroupGreetingContent extends BaseContent {

    @InterfaceC65349Pkn("members")
    public List<? extends IMUser> userList;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        return "";
    }

    public final List<IMUser> getUserList() {
        return this.userList;
    }

    public final void setUserList(List<? extends IMUser> list) {
        List list2;
        C3IY LIZ = C81093Gf.LIZ();
        if (list != null) {
            list2 = ORZ.LLJI(list);
        } else {
            list2 = null;
        }
        LIZ.getClass();
        this.userList = C3IY.LJ(list2);
    }
}
