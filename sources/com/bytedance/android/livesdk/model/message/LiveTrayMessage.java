package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes14.dex */
public class LiveTrayMessage extends CR6 {

    @InterfaceC65349Pkn("combo_count")
    public int comboCount;

    @InterfaceC65349Pkn("describe")
    public Text describe;

    @InterfaceC65349Pkn("group_count")
    public int groupCount;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("title")
    public Text title;

    @InterfaceC65349Pkn("user")
    public User user;

    public LiveTrayMessage() {
        this.type = EnumC31509CYf.TRAY_MESSAGE;
    }
}
