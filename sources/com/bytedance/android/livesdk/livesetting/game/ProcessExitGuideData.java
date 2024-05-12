package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ProcessExitGuideData {

    @InterfaceC65349Pkn("brand")
    public String brand;

    @InterfaceC65349Pkn("exit_description")
    public List<String> exitDescriptionList;

    @InterfaceC65349Pkn("exit_reason")
    public List<Integer> exitReasonList;

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessExitGuideData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public ProcessExitGuideData(String str, List<Integer> list, List<String> list2) {
        this.brand = str;
        this.exitReasonList = list;
        this.exitDescriptionList = list2;
    }

    public /* synthetic */ ProcessExitGuideData(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
