package com.ss.android.ugc.aweme.services.external.ui;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMAlbumParams extends F9E {
    public final int chatType;
    public final int chooseMediaTnSNoticeRes;
    public final int hintTextRes;
    public final int maxSelectCount;
    public final int maxSelectableVideoDuration;
    public final String sessionId;
    public final boolean shouldDisplayTnsNotice;

    public static /* synthetic */ DMAlbumParams copy$default(DMAlbumParams dMAlbumParams, String str, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = dMAlbumParams.sessionId;
        }
        if ((i6 & 2) != 0) {
            i = dMAlbumParams.chatType;
        }
        if ((i6 & 4) != 0) {
            i2 = dMAlbumParams.maxSelectCount;
        }
        if ((i6 & 8) != 0) {
            i3 = dMAlbumParams.maxSelectableVideoDuration;
        }
        if ((i6 & 16) != 0) {
            i4 = dMAlbumParams.hintTextRes;
        }
        if ((i6 & 32) != 0) {
            i5 = dMAlbumParams.chooseMediaTnSNoticeRes;
        }
        if ((i6 & 64) != 0) {
            z = dMAlbumParams.shouldDisplayTnsNotice;
        }
        return dMAlbumParams.copy(str, i, i2, i3, i4, i5, z);
    }

    public final DMAlbumParams copy(String sessionId, int i, int i2, int i3, int i4, int i5, boolean z) {
        o.LJIIIZ(sessionId, "sessionId");
        return new DMAlbumParams(sessionId, i, i2, i3, i4, i5, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.sessionId, Integer.valueOf(this.chatType), Integer.valueOf(this.maxSelectCount), Integer.valueOf(this.maxSelectableVideoDuration), Integer.valueOf(this.hintTextRes), Integer.valueOf(this.chooseMediaTnSNoticeRes), Boolean.valueOf(this.shouldDisplayTnsNotice)};
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final int getChooseMediaTnSNoticeRes() {
        return this.chooseMediaTnSNoticeRes;
    }

    public final int getHintTextRes() {
        return this.hintTextRes;
    }

    public final int getMaxSelectCount() {
        return this.maxSelectCount;
    }

    public final int getMaxSelectableVideoDuration() {
        return this.maxSelectableVideoDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShouldDisplayTnsNotice() {
        return this.shouldDisplayTnsNotice;
    }

    public DMAlbumParams(String sessionId, int i, int i2, int i3, int i4, int i5, boolean z) {
        o.LJIIIZ(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.chatType = i;
        this.maxSelectCount = i2;
        this.maxSelectableVideoDuration = i3;
        this.hintTextRes = i4;
        this.chooseMediaTnSNoticeRes = i5;
        this.shouldDisplayTnsNotice = z;
    }

    public /* synthetic */ DMAlbumParams(String str, int i, int i2, int i3, int i4, int i5, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i6 & 4) != 0 ? 9 : i2, (i6 & 8) != 0 ? 15000 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? false : z);
    }
}
