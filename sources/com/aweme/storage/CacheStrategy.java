package com.aweme.storage;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CacheStrategy {

    @InterfaceC65349Pkn("dir_limit")
    public int dirLimit;

    @InterfaceC65349Pkn("file_limit")
    public int fileLimit;

    @InterfaceC65349Pkn("force")
    public String[] forceList;

    @InterfaceC65349Pkn("interval")
    public int interval;

    @InterfaceC65349Pkn("non_active_count")
    public int nonActiveCount;

    @InterfaceC65349Pkn("non_active_duration")
    public int nonActiveDuration;

    @InterfaceC65349Pkn("non_active_limit")
    public int nonActiveLimit;

    @InterfaceC65349Pkn("non_active_times")
    public int nonActiveTimes;

    @InterfaceC65349Pkn("too_large_limit")
    public int tooLargeLimit;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheStrategy{interval=");
        LIZ.append(this.interval);
        LIZ.append(", forceList=");
        LIZ.append(Arrays.toString(this.forceList));
        LIZ.append(", fileLimit=");
        LIZ.append(this.fileLimit);
        LIZ.append(", dirLimit=");
        LIZ.append(this.dirLimit);
        LIZ.append(", nonActiveDuration=");
        LIZ.append(this.nonActiveDuration);
        LIZ.append(", nonActiveLimit=");
        return b0.LIZJ(LIZ, this.nonActiveLimit, '}', LIZ);
    }
}
