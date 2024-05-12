package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.AnonymousClass391;
import X.C12400eC;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SparkLynxBridgeThreadDispatcherSettings {
    public static final SparkLynxBridgeThreadDispatcherModel LIZ;

    /* loaded from: classes7.dex */
    public static final class SparkLynxBridgeThreadDispatcherModel {

        @InterfaceC65349Pkn("allowChannelList")
        public final List<String> allowChannelList;

        @InterfaceC65349Pkn("allowList")
        public final Map<String, List<String>> allowList;

        @InterfaceC65349Pkn("backgroundThreadList")
        public final Map<String, List<String>> backgroundThreadList;

        @InterfaceC65349Pkn("cpuThreadList")
        public final Map<String, List<String>> cpuThreadList;

        @InterfaceC65349Pkn("denyChannelList")
        public final List<String> denyChannelList;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("ioThreadList")
        public final Map<String, List<String>> ioThreadList;

        @InterfaceC65349Pkn("lynxThreadList")
        public final Map<String, List<String>> lynxThreadList;

        @InterfaceC65349Pkn("normalThreadList")
        public final Map<String, List<String>> normalThreadList;

        @InterfaceC65349Pkn("oldEnable")
        public final boolean oldEnable;

        @InterfaceC65349Pkn("serialThreadList")
        public final Map<String, List<String>> serialThreadList;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SparkLynxBridgeThreadDispatcherModel() {
            /*
                r14 = this;
                r1 = 0
                r9 = 0
                r12 = 2047(0x7ff, float:2.868E-42)
                r0 = r14
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r10 = r9
                r11 = r1
                r13 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.experiment.SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SparkLynxBridgeThreadDispatcherModel)) {
                return false;
            }
            SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel = (SparkLynxBridgeThreadDispatcherModel) obj;
            return o.LJ(this.allowChannelList, sparkLynxBridgeThreadDispatcherModel.allowChannelList) && o.LJ(this.denyChannelList, sparkLynxBridgeThreadDispatcherModel.denyChannelList) && o.LJ(this.lynxThreadList, sparkLynxBridgeThreadDispatcherModel.lynxThreadList) && o.LJ(this.normalThreadList, sparkLynxBridgeThreadDispatcherModel.normalThreadList) && o.LJ(this.cpuThreadList, sparkLynxBridgeThreadDispatcherModel.cpuThreadList) && o.LJ(this.ioThreadList, sparkLynxBridgeThreadDispatcherModel.ioThreadList) && o.LJ(this.serialThreadList, sparkLynxBridgeThreadDispatcherModel.serialThreadList) && o.LJ(this.backgroundThreadList, sparkLynxBridgeThreadDispatcherModel.backgroundThreadList) && this.enable == sparkLynxBridgeThreadDispatcherModel.enable && this.oldEnable == sparkLynxBridgeThreadDispatcherModel.oldEnable && o.LJ(this.allowList, sparkLynxBridgeThreadDispatcherModel.allowList);
        }

        public final String toString() {
            return "SparkLynxBridgeThreadDispatcherModel(allowChannelList=" + this.allowChannelList + ", denyChannelList=" + this.denyChannelList + ", lynxThreadList=" + this.lynxThreadList + ", normalThreadList=" + this.normalThreadList + ", cpuThreadList=" + this.cpuThreadList + ", ioThreadList=" + this.ioThreadList + ", serialThreadList=" + this.serialThreadList + ", backgroundThreadList=" + this.backgroundThreadList + ", enable=" + this.enable + ", oldEnable=" + this.oldEnable + ", allowList=" + this.allowList + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int LIZ = C12400eC.LIZ(this.backgroundThreadList, C12400eC.LIZ(this.serialThreadList, C12400eC.LIZ(this.ioThreadList, C12400eC.LIZ(this.cpuThreadList, C12400eC.LIZ(this.normalThreadList, C12400eC.LIZ(this.lynxThreadList, AnonymousClass391.LIZIZ(this.denyChannelList, this.allowChannelList.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
            boolean z = this.enable;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (LIZ + i2) * 31;
            if (!this.oldEnable) {
                i = 0;
            }
            return this.allowList.hashCode() + ((i3 + i) * 31);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparkLynxBridgeThreadDispatcherModel(List<String> allowChannelList, List<String> denyChannelList, Map<String, ? extends List<String>> lynxThreadList, Map<String, ? extends List<String>> normalThreadList, Map<String, ? extends List<String>> cpuThreadList, Map<String, ? extends List<String>> ioThreadList, Map<String, ? extends List<String>> serialThreadList, Map<String, ? extends List<String>> backgroundThreadList, boolean z, boolean z2, Map<String, ? extends List<String>> allowList) {
            o.LJIIIZ(allowChannelList, "allowChannelList");
            o.LJIIIZ(denyChannelList, "denyChannelList");
            o.LJIIIZ(lynxThreadList, "lynxThreadList");
            o.LJIIIZ(normalThreadList, "normalThreadList");
            o.LJIIIZ(cpuThreadList, "cpuThreadList");
            o.LJIIIZ(ioThreadList, "ioThreadList");
            o.LJIIIZ(serialThreadList, "serialThreadList");
            o.LJIIIZ(backgroundThreadList, "backgroundThreadList");
            o.LJIIIZ(allowList, "allowList");
            this.allowChannelList = allowChannelList;
            this.denyChannelList = denyChannelList;
            this.lynxThreadList = lynxThreadList;
            this.normalThreadList = normalThreadList;
            this.cpuThreadList = cpuThreadList;
            this.ioThreadList = ioThreadList;
            this.serialThreadList = serialThreadList;
            this.backgroundThreadList = backgroundThreadList;
            this.enable = z;
            this.oldEnable = z2;
            this.allowList = allowList;
        }

        public /* synthetic */ SparkLynxBridgeThreadDispatcherModel(List list, List list2, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, boolean z, boolean z2, Map map7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new HashMap() : map, (i & 8) != 0 ? new HashMap() : map2, (i & 16) != 0 ? new HashMap() : map3, (i & 32) != 0 ? new HashMap() : map4, (i & 64) != 0 ? new HashMap() : map5, (i & 128) != 0 ? new HashMap() : map6, (i & 256) != 0 ? false : z, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? new HashMap() : map7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZ = new SparkLynxBridgeThreadDispatcherModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }
}
