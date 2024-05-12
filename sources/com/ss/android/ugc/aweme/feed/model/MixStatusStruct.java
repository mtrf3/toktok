package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class MixStatusStruct extends F9E implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("is_collected")
    public int isCollected;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("viewed_in_mix")
    public int viewedInMix;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MixStatusStruct() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.MixStatusStruct.<init>():void");
    }

    public static /* synthetic */ MixStatusStruct copy$default(MixStatusStruct mixStatusStruct, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mixStatusStruct.status;
        }
        if ((i4 & 2) != 0) {
            i2 = mixStatusStruct.isCollected;
        }
        if ((i4 & 4) != 0) {
            i3 = mixStatusStruct.viewedInMix;
        }
        return mixStatusStruct.copy(i, i2, i3);
    }

    public final MixStatusStruct copy(int i, int i2, int i3) {
        return new MixStatusStruct(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), Integer.valueOf(this.isCollected), Integer.valueOf(this.viewedInMix)};
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getViewedInMix() {
        return this.viewedInMix;
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final void setCollected(int i) {
        this.isCollected = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setViewedInMix(int i) {
        this.viewedInMix = i;
    }

    public MixStatusStruct(int i, int i2, int i3) {
        this.status = i;
        this.isCollected = i2;
        this.viewedInMix = i3;
    }

    public /* synthetic */ MixStatusStruct(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
