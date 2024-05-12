package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class ShareToStoryStruct extends F9E implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("is_visible")
    public int isVisible;

    @InterfaceC65349Pkn("share_story_post_type")
    public int shareStoryPostType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShareToStoryStruct() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct.<init>():void");
    }

    public static /* synthetic */ ShareToStoryStruct copy$default(ShareToStoryStruct shareToStoryStruct, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = shareToStoryStruct.isVisible;
        }
        if ((i3 & 2) != 0) {
            i2 = shareToStoryStruct.shareStoryPostType;
        }
        return shareToStoryStruct.copy(i, i2);
    }

    public final ShareToStoryStruct copy(int i, int i2) {
        return new ShareToStoryStruct(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isVisible), Integer.valueOf(this.shareStoryPostType)};
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getShareStoryPostType() {
        return this.shareStoryPostType;
    }

    public final int isVisible() {
        return this.isVisible;
    }

    public ShareToStoryStruct(int i, int i2) {
        this.isVisible = i;
        this.shareStoryPostType = i2;
    }

    public /* synthetic */ ShareToStoryStruct(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
