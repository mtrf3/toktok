package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes14.dex */
public final class AutoMatchResp extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("avatars")
        public List<ImageModel> avatars;

        @InterfaceC65349Pkn("settings")
        public String settings;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.settings;
            List<ImageModel> list = this.avatars;
            return new Object[]{str, str, list, list, list};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
