package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LiveReplayCover extends F9E {
    public final String liveCoverUrl;
    public final String liveId;

    public static /* synthetic */ LiveReplayCover copy$default(LiveReplayCover liveReplayCover, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveReplayCover.liveId;
        }
        if ((i & 2) != 0) {
            str2 = liveReplayCover.liveCoverUrl;
        }
        return liveReplayCover.copy(str, str2);
    }

    public final LiveReplayCover copy(String liveId, String liveCoverUrl) {
        o.LJIIIZ(liveId, "liveId");
        o.LJIIIZ(liveCoverUrl, "liveCoverUrl");
        return new LiveReplayCover(liveId, liveCoverUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.liveId, this.liveCoverUrl};
    }

    public LiveReplayCover(String liveId, String liveCoverUrl) {
        o.LJIIIZ(liveId, "liveId");
        o.LJIIIZ(liveCoverUrl, "liveCoverUrl");
        this.liveId = liveId;
        this.liveCoverUrl = liveCoverUrl;
    }
}
