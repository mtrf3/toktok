package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C47261Igj;
import X.C75792yF;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MultiNotice extends F9E implements Serializable {

    @InterfaceC65349Pkn("ab_settings")
    public final Map<String, Integer> abSettingExtra;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("first_read_time_in_session")
    public long firstReadTime;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("is_mark_read")
    public final int markRead;

    @InterfaceC65349Pkn("max_time")
    public final long maxTime;

    @InterfaceC65349Pkn("min_time")
    public final long minTime;

    public static /* synthetic */ MultiNotice copy$default(MultiNotice multiNotice, int i, long j, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = multiNotice.group;
        }
        if ((i4 & 2) != 0) {
            j = multiNotice.maxTime;
        }
        if ((i4 & 4) != 0) {
            j2 = multiNotice.minTime;
        }
        if ((i4 & 8) != 0) {
            i2 = multiNotice.count;
        }
        if ((i4 & 16) != 0) {
            i3 = multiNotice.markRead;
        }
        return multiNotice.copy(i, j, j2, i2, i3);
    }

    public final MultiNotice copy(int i, long j, long j2, int i2, int i3) {
        return new MultiNotice(i, j, j2, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Long.valueOf(this.maxTime), Long.valueOf(this.minTime), Integer.valueOf(this.count), Integer.valueOf(this.markRead)};
    }

    public final String toReqStr() {
        String LIZJ = C75792yF.LIZJ(C47261Igj.LJJIJ(this));
        o.LJIIIIZZ(LIZJ, "toJson(listOf(this))");
        return LIZJ;
    }

    public final Map<String, Integer> getAbSettingExtra() {
        return this.abSettingExtra;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getFirstReadTime() {
        return this.firstReadTime;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getMarkRead() {
        return this.markRead;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final MultiNotice mayWithMergedTTShopArg(boolean z) {
        if (z) {
            this.abSettingExtra.put("ec_merged_tiktok_shop", 1);
        }
        return this;
    }

    public final void setFirstReadTime(long j) {
        this.firstReadTime = j;
    }

    public MultiNotice(int i, long j, long j2, int i2, int i3) {
        this.group = i;
        this.maxTime = j;
        this.minTime = j2;
        this.count = i2;
        this.markRead = i3;
        this.abSettingExtra = new LinkedHashMap();
    }

    public /* synthetic */ MultiNotice(int i, long j, long j2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 0L : j, (i4 & 4) == 0 ? j2 : 0L, (i4 & 8) != 0 ? 20 : i2, (i4 & 16) != 0 ? 1 : i3);
    }
}
