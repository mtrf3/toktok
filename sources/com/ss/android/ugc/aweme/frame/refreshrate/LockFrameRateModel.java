package com.ss.android.ugc.aweme.frame.refreshrate;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LockFrameRateModel extends F9E {

    @InterfaceC65349Pkn("black_devices")
    public final List<String> blackDevices;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("white_devices")
    public final List<String> whiteDevices;

    /* JADX WARN: Multi-variable type inference failed */
    public LockFrameRateModel() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LockFrameRateModel copy$default(LockFrameRateModel lockFrameRateModel, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = lockFrameRateModel.enable;
        }
        if ((i & 2) != 0) {
            list = lockFrameRateModel.blackDevices;
        }
        if ((i & 4) != 0) {
            list2 = lockFrameRateModel.whiteDevices;
        }
        return lockFrameRateModel.copy(z, list, list2);
    }

    public final LockFrameRateModel copy(boolean z, List<String> blackDevices, List<String> whiteDevices) {
        o.LJIIIZ(blackDevices, "blackDevices");
        o.LJIIIZ(whiteDevices, "whiteDevices");
        return new LockFrameRateModel(z, blackDevices, whiteDevices);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.blackDevices, this.whiteDevices};
    }

    public final List<String> getBlackDevices() {
        return this.blackDevices;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<String> getWhiteDevices() {
        return this.whiteDevices;
    }

    public LockFrameRateModel(boolean z, List<String> blackDevices, List<String> whiteDevices) {
        o.LJIIIZ(blackDevices, "blackDevices");
        o.LJIIIZ(whiteDevices, "whiteDevices");
        this.enable = z;
        this.blackDevices = blackDevices;
        this.whiteDevices = whiteDevices;
    }

    public /* synthetic */ LockFrameRateModel(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
