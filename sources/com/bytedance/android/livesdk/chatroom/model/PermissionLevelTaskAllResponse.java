package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class PermissionLevelTaskAllResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public PermissionLevelTaskAllExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("stages")
        public List<PermissionLevelStage> stages;
    }
}
