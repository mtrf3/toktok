package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CommentComboTrayConfig {

    @InterfaceC65349Pkn("comment_tray_dismiss_duration")
    public long commentComboTrayDuration;

    @InterfaceC65349Pkn("comment_tray_group")
    public int commentComboTrayGroup;

    public CommentComboTrayConfig() {
        this(0, 0L, 3, null);
    }

    public CommentComboTrayConfig(int i, long j) {
        this.commentComboTrayGroup = i;
        this.commentComboTrayDuration = j;
    }

    public /* synthetic */ CommentComboTrayConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? 2000L : j);
    }
}
