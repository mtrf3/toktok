package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class ProjectDModifyH5Message extends CR6 {

    @InterfaceC65349Pkn("buttom_right")
    public String mBottomRightUrl;

    @InterfaceC65349Pkn("top_left")
    public String mTopLeftUrl;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public ProjectDModifyH5Message() {
        this.type = EnumC31509CYf.D_H5_MESSAGE;
    }
}
