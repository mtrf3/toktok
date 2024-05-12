package com.bytedance.android.livesdk.livesetting.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessagePlatformBubbleConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("lifetime")
    public final int lifetime;

    @InterfaceC65349Pkn("position")
    public final String position;

    @InterfaceC65349Pkn("priority")
    public final int priority;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessagePlatformBubbleConfig() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig.<init>():void");
    }

    public static /* synthetic */ LiveMessagePlatformBubbleConfig copy$default(LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = liveMessagePlatformBubbleConfig.priority;
        }
        if ((i3 & 2) != 0) {
            i2 = liveMessagePlatformBubbleConfig.lifetime;
        }
        if ((i3 & 4) != 0) {
            str = liveMessagePlatformBubbleConfig.position;
        }
        return liveMessagePlatformBubbleConfig.copy(i, i2, str);
    }

    public final LiveMessagePlatformBubbleConfig copy(int i, int i2, String position) {
        o.LJIIIZ(position, "position");
        return new LiveMessagePlatformBubbleConfig(i, i2, position);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.priority), Integer.valueOf(this.lifetime), this.position};
    }

    public final int getLifetime() {
        return this.lifetime;
    }

    public final String getPosition() {
        return this.position;
    }

    public final int getPriority() {
        return this.priority;
    }

    public LiveMessagePlatformBubbleConfig(int i, int i2, String position) {
        o.LJIIIZ(position, "position");
        this.priority = i;
        this.lifetime = i2;
        this.position = position;
    }

    public /* synthetic */ LiveMessagePlatformBubbleConfig(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
