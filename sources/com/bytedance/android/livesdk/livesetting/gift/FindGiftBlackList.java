package com.bytedance.android.livesdk.livesetting.gift;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FindGiftBlackList {

    @InterfaceC65349Pkn("black_list")
    public List<Long> blackList;

    /* JADX WARN: Multi-variable type inference failed */
    public FindGiftBlackList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new FindGiftBlackList(null, 1, 0 == true ? 1 : 0);
    }

    public FindGiftBlackList(List<Long> blackList) {
        o.LJIIIZ(blackList, "blackList");
        this.blackList = blackList;
    }

    public /* synthetic */ FindGiftBlackList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47261Igj.LJJIJIIJI(8275L, 7775L, 7099L) : list);
    }
}
