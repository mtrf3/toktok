package com.ss.android.ugc.aweme.notification.frequency;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class Config extends F9E {

    @InterfaceC65349Pkn("userAction")
    public final int actionName;

    @InterfaceC65349Pkn("maxRecordCount")
    public final int saveMaxCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Config() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.frequency.Config.<init>():void");
    }

    public static /* synthetic */ Config copy$default(Config config, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = config.actionName;
        }
        if ((i3 & 2) != 0) {
            i2 = config.saveMaxCount;
        }
        return config.copy(i, i2);
    }

    public final Config copy(int i, int i2) {
        return new Config(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.actionName), Integer.valueOf(this.saveMaxCount)};
    }

    public Config(int i, int i2) {
        this.actionName = i;
        this.saveMaxCount = i2;
    }

    public /* synthetic */ Config(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 100 : i2);
    }
}
