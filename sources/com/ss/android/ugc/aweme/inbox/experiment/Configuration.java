package com.ss.android.ugc.aweme.inbox.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class Configuration extends F9E {

    @InterfaceC65349Pkn("maxDisplayCount")
    public final int exposedCount;

    @InterfaceC65349Pkn("maxFansDivide")
    public final int maxFansDivide;

    @InterfaceC65349Pkn("maxRecordCount")
    public final int saveMaxCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Configuration() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.experiment.Configuration.<init>():void");
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = configuration.exposedCount;
        }
        if ((i4 & 2) != 0) {
            i2 = configuration.saveMaxCount;
        }
        if ((i4 & 4) != 0) {
            i3 = configuration.maxFansDivide;
        }
        return configuration.copy(i, i2, i3);
    }

    public final Configuration copy(int i, int i2, int i3) {
        return new Configuration(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.exposedCount), Integer.valueOf(this.saveMaxCount), Integer.valueOf(this.maxFansDivide)};
    }

    public final int getExposedCount() {
        return this.exposedCount;
    }

    public final int getMaxFansDivide() {
        return this.maxFansDivide;
    }

    public final int getSaveMaxCount() {
        return this.saveMaxCount;
    }

    public Configuration(int i, int i2, int i3) {
        this.exposedCount = i;
        this.saveMaxCount = i2;
        this.maxFansDivide = i3;
    }

    public /* synthetic */ Configuration(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? 100 : i2, (i4 & 4) != 0 ? 1000 : i3);
    }
}
