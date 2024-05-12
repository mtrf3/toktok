package com.ss.android.ugc.aweme.services.story;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class StoryCoverExtractConfig extends F9E {
    public final int height;
    public final int timestamp;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryCoverExtractConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig.<init>():void");
    }

    public static /* synthetic */ StoryCoverExtractConfig copy$default(StoryCoverExtractConfig storyCoverExtractConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = storyCoverExtractConfig.width;
        }
        if ((i4 & 2) != 0) {
            i2 = storyCoverExtractConfig.height;
        }
        if ((i4 & 4) != 0) {
            i3 = storyCoverExtractConfig.timestamp;
        }
        return storyCoverExtractConfig.copy(i, i2, i3);
    }

    public final StoryCoverExtractConfig copy(int i, int i2, int i3) {
        return new StoryCoverExtractConfig(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.timestamp)};
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final int getWidth() {
        return this.width;
    }

    public StoryCoverExtractConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.timestamp = i3;
    }

    public /* synthetic */ StoryCoverExtractConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
