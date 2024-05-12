package com.ss.android.ugc.aweme.emoji.sysemoji;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SystemEmojiVersionId extends F9E {

    @InterfaceC65349Pkn("mt_enable_big_text_emoji")
    public final int bigTextEmojiEnable;

    @InterfaceC65349Pkn("enable_business")
    public final int bussinessCode;

    @InterfaceC65349Pkn("res_version")
    public final String versionId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bussinessCode), this.versionId, Integer.valueOf(this.bigTextEmojiEnable)};
    }

    public SystemEmojiVersionId(int i, String versionId, int i2) {
        o.LJIIIZ(versionId, "versionId");
        this.bussinessCode = i;
        this.versionId = versionId;
        this.bigTextEmojiEnable = i2;
    }
}
