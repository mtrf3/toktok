package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ImDeleteMessage extends CR6 {

    @InterfaceC65349Pkn("delete_msg_ids")
    public List<Long> deleteMsgIds;

    @InterfaceC65349Pkn("delete_user_ids")
    public List<Long> deleteUserIds;

    public ImDeleteMessage() {
        this.type = EnumC31509CYf.IM_DELETE;
        List<Long> emptyList = Collections.emptyList();
        o.LJIIIIZZ(emptyList, "Collections.emptyList()");
        this.deleteMsgIds = emptyList;
        List<Long> emptyList2 = Collections.emptyList();
        o.LJIIIIZZ(emptyList2, "Collections.emptyList()");
        this.deleteUserIds = emptyList2;
    }
}
