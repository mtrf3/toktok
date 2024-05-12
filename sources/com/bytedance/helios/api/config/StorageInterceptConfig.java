package com.bytedance.helios.api.config;

import X.InterfaceC65349Pkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StorageInterceptConfig {

    @InterfaceC65349Pkn("downgrade")
    public List<StorageInterceptItem> downgradeList;

    @InterfaceC65349Pkn("enable_exception_path")
    public boolean enableExceptionPath;

    @InterfaceC65349Pkn("enabled")
    public boolean enabled;

    @InterfaceC65349Pkn("watch")
    public List<StorageInterceptItem> watchList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StorageInterceptConfig() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.StorageInterceptConfig.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageInterceptConfig)) {
            return false;
        }
        StorageInterceptConfig storageInterceptConfig = (StorageInterceptConfig) obj;
        return this.enabled == storageInterceptConfig.enabled && this.enableExceptionPath == storageInterceptConfig.enableExceptionPath && o.LJ(this.watchList, storageInterceptConfig.watchList) && o.LJ(this.downgradeList, storageInterceptConfig.downgradeList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.enableExceptionPath ? 1 : 0)) * 31;
        List<StorageInterceptItem> list = this.watchList;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<StorageInterceptItem> list2 = this.downgradeList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<StorageInterceptItem> list;
        List<StorageInterceptItem> list2;
        StringBuilder sb = new StringBuilder("enabled=");
        sb.append(this.enabled);
        List<StorageInterceptItem> list3 = this.watchList;
        if (list3 != null) {
            o.LJI(list3);
            if (list3.size() > 0 && (list2 = this.watchList) != null) {
                Iterator<StorageInterceptItem> it = list2.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().toString());
                }
            }
        }
        List<StorageInterceptItem> list4 = this.downgradeList;
        if (list4 != null) {
            o.LJI(list4);
            if (list4.size() > 0 && (list = this.downgradeList) != null) {
                Iterator<StorageInterceptItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().toString());
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public StorageInterceptConfig(boolean z, boolean z2, List<StorageInterceptItem> list, List<StorageInterceptItem> list2) {
        this.enabled = z;
        this.enableExceptionPath = z2;
        this.watchList = list;
        this.downgradeList = list2;
    }

    public /* synthetic */ StorageInterceptConfig(boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
