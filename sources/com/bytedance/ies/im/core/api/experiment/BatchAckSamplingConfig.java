package com.bytedance.ies.im.core.api.experiment;

import X.C00F;
import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class BatchAckSamplingConfig extends F9E {

    @InterfaceC65349Pkn("imsdk_e2e_latency_event_cmd_message_type")
    public final List<Integer> cmdMessageTypes;

    @InterfaceC65349Pkn("imsdk_e2e_latency_event_common_cmd_type")
    public final List<Integer> commonCmdTypes;

    @InterfaceC65349Pkn("imsdk_e2e_latency_event_divisor")
    public final int divisor;

    @InterfaceC65349Pkn("imsdk_e2e_latency_event_normal_message_type")
    public final List<Integer> normalMessageTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchAckSamplingConfig() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.divisor), this.normalMessageTypes, this.cmdMessageTypes, this.commonCmdTypes};
    }

    public BatchAckSamplingConfig(int i, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        C00F.LJ(list, "normalMessageTypes", list2, "cmdMessageTypes", list3, "commonCmdTypes");
        this.divisor = i;
        this.normalMessageTypes = list;
        this.cmdMessageTypes = list2;
        this.commonCmdTypes = list3;
    }

    public /* synthetic */ BatchAckSamplingConfig(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? C47261Igj.LJJIJIIJI(5, 7, 8, 15, 1021) : list, (i2 & 4) != 0 ? C47261Igj.LJJIJIIJI(50001, 50005) : list2, (i2 & 8) != 0 ? C47261Igj.LJJIJ(7) : list3);
    }
}
