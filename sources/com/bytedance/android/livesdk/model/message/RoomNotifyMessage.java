package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;

/* loaded from: classes6.dex */
public class RoomNotifyMessage extends CR6 {
    public ImageModel LJLIL;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("extra")
    public RoomNotifyMessageExtra extra;

    @InterfaceC65349Pkn("flex_setting")
    public List<Long> flexSetting;

    @InterfaceC65349Pkn("from_user_id")
    public long from_user_id;

    @InterfaceC65349Pkn("privilege_log_extra")
    public PrivilegeLogExtra logExtra;

    @InterfaceC65349Pkn("notify_class")
    public int notifyClass;

    @InterfaceC65349Pkn("notify_type")
    public long notifyType;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("to_anchor_id")
    public long to_anchor_id;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public RoomNotifyMessage() {
        this.type = EnumC31509CYf.ROOM_NOTIFY;
    }
}
