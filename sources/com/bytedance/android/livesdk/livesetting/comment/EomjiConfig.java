package com.bytedance.android.livesdk.livesetting.comment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class EomjiConfig {

    @InterfaceC65349Pkn("quick_comment_forbidden")
    public boolean isForbidQuickComment;

    @InterfaceC65349Pkn("emoji_enable")
    public boolean isShowEmojiConvenient;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EomjiConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.comment.EomjiConfig.<init>():void");
    }

    public EomjiConfig(boolean z, boolean z2) {
        this.isShowEmojiConvenient = z;
        this.isForbidQuickComment = z2;
    }

    public /* synthetic */ EomjiConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
