package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C221108m2;
import X.C38995FSd;
import X.C47135Ieh;
import X.C58096Mr6;
import X.C5H3;
import X.C84763XOl;
import X.FMX;
import X.InterfaceC64592gB;
import X.JBR;
import X.ORZ;
import X.WM7;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.network.ITrafficStatistics;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TrafficStatisticsServiceImpl implements ITrafficStatistics {
    public volatile boolean backgroundObStart;
    public long lastUploadData;
    public final String EVENT_KEY = "prf_data_load";
    public final int TIME_GAP = 1800000;
    public final int CACHE_MAX_SIZE = 200;
    public String scene = "";
    public String netWorkStatus = "";
    public final C5H3 cacheQueue$delegate = C221108m2.LIZIZ(TrafficStatisticsServiceImpl$cacheQueue$2.INSTANCE);
    public final HashSet<String> duplicationKeys = new HashSet<>();

    /* loaded from: classes9.dex */
    public static final class TrafficData {
        public final String dataType;
        public long dur;
        public long load;
        public final boolean multiChannel;
        public final String networkType;
        public final String scene;

        public static /* synthetic */ TrafficData copy$default(TrafficData trafficData, String str, String str2, String str3, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trafficData.dataType;
            }
            if ((i & 2) != 0) {
                str2 = trafficData.scene;
            }
            if ((i & 4) != 0) {
                str3 = trafficData.networkType;
            }
            if ((i & 8) != 0) {
                z = trafficData.multiChannel;
            }
            if ((i & 16) != 0) {
                j = trafficData.dur;
            }
            if ((i & 32) != 0) {
                j2 = trafficData.load;
            }
            return trafficData.copy(str, str2, str3, z, j, j2);
        }

        public final TrafficData copy(String str, String str2, String str3, boolean z, long j, long j2) {
            return new TrafficData(str, str2, str3, z, j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrafficData)) {
                return false;
            }
            TrafficData trafficData = (TrafficData) obj;
            return o.LJ(this.dataType, trafficData.dataType) && o.LJ(this.scene, trafficData.scene) && o.LJ(this.networkType, trafficData.networkType) && this.multiChannel == trafficData.multiChannel && this.dur == trafficData.dur && this.load == trafficData.load;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.dataType;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.scene;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.networkType;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i4 = (i3 + i) * 31;
            boolean z = this.multiChannel;
            int i5 = z;
            if (z != 0) {
                i5 = 1;
            }
            return C16880lQ.LLJIJIL(this.load) + JBR.LIZJ(this.dur, (i4 + i5) * 31, 31);
        }

        public final Map<String, String> toMap() {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data_load", String.valueOf(this.load));
            String str2 = this.dataType;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("data_type", str2);
            String str4 = this.scene;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put(WM7.SCENE_SERVICE, str4);
            String str5 = this.networkType;
            if (str5 != null) {
                str3 = str5;
            }
            linkedHashMap.put("network_type", str3);
            if (this.multiChannel) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_weak_wifi_to_cellular", str);
            linkedHashMap.put("dur", String.valueOf(this.dur));
            return linkedHashMap;
        }

        public final String key() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.dataType);
            LIZ.append('#');
            LIZ.append(this.scene);
            LIZ.append('#');
            LIZ.append(this.networkType);
            LIZ.append('#');
            LIZ.append(this.multiChannel);
            return X1D.LIZIZ(LIZ);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TrafficData(dataType=");
            LIZ.append(this.dataType);
            LIZ.append(", scene=");
            LIZ.append(this.scene);
            LIZ.append(", networkType=");
            LIZ.append(this.networkType);
            LIZ.append(", multiChannel=");
            LIZ.append(this.multiChannel);
            LIZ.append(", dur=");
            LIZ.append(this.dur);
            LIZ.append(", load=");
            return C47135Ieh.LIZIZ(LIZ, this.load, ')', LIZ);
        }

        public final String getDataType() {
            return this.dataType;
        }

        public final long getDur() {
            return this.dur;
        }

        public final long getLoad() {
            return this.load;
        }

        public final boolean getMultiChannel() {
            return this.multiChannel;
        }

        public final String getNetworkType() {
            return this.networkType;
        }

        public final String getScene() {
            return this.scene;
        }

        public final void setDur(long j) {
            this.dur = j;
        }

        public final void setLoad(long j) {
            this.load = j;
        }

        public TrafficData(String str, String str2, String str3, boolean z, long j, long j2) {
            this.dataType = str;
            this.scene = str2;
            this.networkType = str3;
            this.multiChannel = z;
            this.dur = j;
            this.load = j2;
        }
    }

    private final void registerBackground() {
        if (this.backgroundObStart) {
            return;
        }
        this.backgroundObStart = true;
        C84763XOl.LJI().LJJJJZI(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl$registerBackground$1
            @Override // X.InterfaceC64592gB
            public final void accept(Boolean it) {
                TrafficStatisticsServiceImpl trafficStatisticsServiceImpl = TrafficStatisticsServiceImpl.this;
                o.LJIIIIZZ(it, "it");
                trafficStatisticsServiceImpl.triggerUpload(it.booleanValue(), null, null);
            }
        });
    }

    public final ConcurrentLinkedQueue<TrafficData> getCacheQueue() {
        return (ConcurrentLinkedQueue) this.cacheQueue$delegate.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int convertNetworkType() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl.convertNetworkType():int");
    }

    public static ITrafficStatistics createITrafficStatisticsbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ITrafficStatistics.class, z);
        if (LIZ != null) {
            return (ITrafficStatistics) LIZ;
        }
        if (C58096Mr6.e6 == null) {
            synchronized (ITrafficStatistics.class) {
                if (C58096Mr6.e6 == null) {
                    C58096Mr6.e6 = new TrafficStatisticsServiceImpl();
                }
            }
        }
        return C58096Mr6.e6;
    }

    public void triggerUpload(boolean z, String str, String str2) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!o.LJ(str, this.netWorkStatus) || !o.LJ(str2, this.scene)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() - this.lastUploadData >= this.TIME_GAP) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCacheQueue().size() > this.CACHE_MAX_SIZE) {
            z4 = true;
        }
        if (z || z2 || z3 || z4) {
            if (str != null) {
                this.netWorkStatus = str;
            }
            if (str2 != null) {
                this.scene = str2;
            }
            C38995FSd.LIZIZ().submit(new Runnable() { // from class: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl$triggerUpload$3
                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3__run$___twin___() {
                    TrafficStatisticsServiceImpl.this.lastUploadData = System.currentTimeMillis();
                    List<TrafficStatisticsServiceImpl.TrafficData> LLJI = ORZ.LLJI(TrafficStatisticsServiceImpl.this.getCacheQueue());
                    TrafficStatisticsServiceImpl.this.getCacheQueue().clear();
                    if (TrafficStatisticsServiceImpl.this.duplicationKeys.size() > 10000) {
                        TrafficStatisticsServiceImpl.this.duplicationKeys.clear();
                    }
                    if (FMX.LIZJ(TrafficStatisticsServiceImpl.this.EVENT_KEY)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (TrafficStatisticsServiceImpl.TrafficData trafficData : LLJI) {
                            TrafficStatisticsServiceImpl.TrafficData trafficData2 = (TrafficStatisticsServiceImpl.TrafficData) linkedHashMap.get(trafficData.key());
                            if (trafficData2 == null) {
                                linkedHashMap.put(trafficData.key(), trafficData);
                            } else {
                                trafficData2.setDur(trafficData.getDur() + trafficData2.getDur());
                                trafficData2.setLoad(trafficData.getLoad() + trafficData2.getLoad());
                            }
                        }
                        Collection values = linkedHashMap.values();
                        TrafficStatisticsServiceImpl trafficStatisticsServiceImpl = TrafficStatisticsServiceImpl.this;
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            FMX.LJIIL(trafficStatisticsServiceImpl.EVENT_KEY, ((TrafficStatisticsServiceImpl.TrafficData) it.next()).toMap());
                        }
                    }
                }

                public static void com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TrafficStatisticsServiceImpl$triggerUpload$3 trafficStatisticsServiceImpl$triggerUpload$3) {
                    boolean LIZ;
                    try {
                        trafficStatisticsServiceImpl$triggerUpload$3.com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.network.ITrafficStatistics
    public void addRecord(long j, String str, String str2, long j2) {
        addRecord(j, str, str2, j2, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // com.ss.android.ugc.aweme.network.ITrafficStatistics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addRecord(long r13, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19) {
        /*
            r12 = this;
            r1 = 0
            r10 = r13
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L8
            return
        L8:
            com.ss.android.ugc.aweme.network.channel.ISpeedModeService r0 = com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl.LJII()
            boolean r7 = r0.LIZJ()
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L23
            X.Ol8 r0 = X.C47973IsD.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L20:
            if (r0 != 0) goto L27
            return
        L23:
            boolean r0 = X.E8Q.LIZJ
            if (r0 == 0) goto L3c
        L27:
            r3 = r19
            if (r3 == 0) goto L5b
            boolean r0 = ujb.o.LJJJJJL(r3)
            r0 = r0 ^ 1
            if (r0 != r1) goto L5b
            java.util.HashSet<java.lang.String> r0 = r12.duplicationKeys
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L4e
            return
        L3c:
            boolean r0 = X.E8Q.LIZIZ
            if (r0 == 0) goto L43
            boolean r0 = X.E8Q.LIZ
            goto L20
        L43:
            java.lang.String r0 = "enable_traffic_statistics"
            boolean r0 = X.C19N.LJ(r0, r2)
            X.E8Q.LIZ = r0
            X.E8Q.LIZIZ = r1
            goto L20
        L4e:
            java.util.HashSet<java.lang.String> r1 = r12.duplicationKeys
            monitor-enter(r1)
            java.util.HashSet<java.lang.String> r0 = r12.duplicationKeys     // Catch: java.lang.Throwable -> L57
            r0.add(r3)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L5a:
            monitor-exit(r1)
        L5b:
            int r0 = r12.convertNetworkType()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl$TrafficData r3 = new com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl$TrafficData
            java.lang.String r5 = X.J1R.LIZ(r15)
            r4 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r10)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r12.getCacheQueue()
            r0.offer(r3)
            r12.registerBackground()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            r0 = 43
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = r3.getScene()
            r12.triggerUpload(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl.addRecord(long, java.lang.String, java.lang.String, long, java.lang.String):void");
    }
}
