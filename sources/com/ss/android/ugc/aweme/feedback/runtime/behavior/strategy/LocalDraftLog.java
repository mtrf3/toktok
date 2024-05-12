package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LocalDraftLog extends F9E {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("created_at")
    public final String createdAt;

    @InterfaceC65349Pkn("current_count")
    public final int currentCount;

    @InterfaceC65349Pkn("available_size")
    public final String internalAvailable;

    @InterfaceC65349Pkn("last_modified")
    public final String lastModified;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("other_count_list")
    public final List<Integer> otherCountList;

    @InterfaceC65349Pkn("total_count")
    public final int totalCount;

    public LocalDraftLog() {
        this(null, null, null, 0, 0, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalDraftLog copy$default(LocalDraftLog localDraftLog, String str, String str2, String str3, int i, int i2, List list, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = localDraftLog.name;
        }
        if ((i3 & 2) != 0) {
            str2 = localDraftLog.createdAt;
        }
        if ((i3 & 4) != 0) {
            str3 = localDraftLog.lastModified;
        }
        if ((i3 & 8) != 0) {
            i = localDraftLog.currentCount;
        }
        if ((i3 & 16) != 0) {
            i2 = localDraftLog.totalCount;
        }
        if ((i3 & 32) != 0) {
            list = localDraftLog.otherCountList;
        }
        if ((i3 & 64) != 0) {
            str4 = localDraftLog.internalAvailable;
        }
        return localDraftLog.copy(str, str2, str3, i, i2, list, str4);
    }

    public final LocalDraftLog copy(String name, String createdAt, String lastModified, int i, int i2, List<Integer> otherCountList, String internalAvailable) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createdAt, "createdAt");
        o.LJIIIZ(lastModified, "lastModified");
        o.LJIIIZ(otherCountList, "otherCountList");
        o.LJIIIZ(internalAvailable, "internalAvailable");
        return new LocalDraftLog(name, createdAt, lastModified, i, i2, otherCountList, internalAvailable);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.createdAt, this.lastModified, Integer.valueOf(this.currentCount), Integer.valueOf(this.totalCount), this.otherCountList, this.internalAvailable};
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getCurrentCount() {
        return this.currentCount;
    }

    public final String getInternalAvailable() {
        return this.internalAvailable;
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Integer> getOtherCountList() {
        return this.otherCountList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public LocalDraftLog(String name, String createdAt, String lastModified, int i, int i2, List<Integer> otherCountList, String internalAvailable) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(createdAt, "createdAt");
        o.LJIIIZ(lastModified, "lastModified");
        o.LJIIIZ(otherCountList, "otherCountList");
        o.LJIIIZ(internalAvailable, "internalAvailable");
        this.name = name;
        this.createdAt = createdAt;
        this.lastModified = lastModified;
        this.currentCount = i;
        this.totalCount = i2;
        this.otherCountList = otherCountList;
        this.internalAvailable = internalAvailable;
    }

    public LocalDraftLog(String str, String str2, String str3, int i, int i2, List list, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? C61878OQg.INSTANCE : list, (i3 & 64) != 0 ? "Unknown" : str4);
    }
}
