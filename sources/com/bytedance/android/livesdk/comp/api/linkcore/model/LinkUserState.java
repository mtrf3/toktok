package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.V0N;

/* loaded from: classes14.dex */
public enum LinkUserState {
    LINKED,
    INVITEE,
    APPLICANT;

    public static LinkUserState valueOf(String str) {
        return (LinkUserState) V0N.LJJJ(LinkUserState.class, str);
    }
}
