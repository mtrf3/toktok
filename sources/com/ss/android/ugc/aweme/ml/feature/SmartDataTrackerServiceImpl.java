package com.ss.android.ugc.aweme.ml.feature;

import X.C126394xf;
import X.C25620zW;
import X.C46434IKg;
import X.C47322Ihi;
import X.C48568J4i;
import X.C48573J4n;
import X.C48578J4s;
import X.C48581J4v;
import X.C48582J4w;
import X.FMX;
import X.InterfaceC48513J2f;
import X.InterfaceC65349Pkn;
import X.J3U;
import X.J4A;
import X.J4G;
import X.RunnableC48579J4t;
import X.V0Q;
import X.WM7;
import X.X1D;
import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartDataTrackerServiceImpl extends SmartDataTrackerService implements J4G {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final Map<String, C48578J4s> LIZ = new ConcurrentHashMap();
    public String LJII = "";

    /* loaded from: classes9.dex */
    public static final class SaveContent {

        @InterfaceC65349Pkn("list")
        public List<SaveContentItem> list;
    }

    /* loaded from: classes9.dex */
    public static final class SaveContentItem {

        @InterfaceC65349Pkn("data")
        public TrackerMonitorData data;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public String scene;
    }

    /* loaded from: classes9.dex */
    public static final class TrackerMonitorData {
        public boolean LIZ;

        @InterfaceC65349Pkn("jsonData")
        public JSONObject jsonData;

        @InterfaceC65349Pkn("key")
        public String key;

        @InterfaceC65349Pkn("waitNextRealCnt")
        public int waitNextRealCnt;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("(key:");
            LIZ.append(this.key);
            LIZ.append(", waitNextRealCnt=");
            LIZ.append(this.waitNextRealCnt);
            LIZ.append(", jsonData=");
            LIZ.append(this.jsonData);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
        List<OneSmartDataTrackConfig> configList;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        SmartDataTrackerService.Companion.getClass();
        if (SmartDataTrackerService.debug) {
            System.currentTimeMillis();
        }
        if (!C48581J4v.LIZ) {
            C48581J4v.LIZIZ = (SmartDataTrackConfig) i0.LJ(true, "smart_data_track_config_v2", 31744, SmartDataTrackConfig.class, null);
            C48581J4v.LIZ = true;
        }
        SmartDataTrackConfig smartDataTrackConfig = C48581J4v.LIZIZ;
        if (smartDataTrackConfig != null && (configList = smartDataTrackConfig.getConfigList()) != null) {
            Iterator<OneSmartDataTrackConfig> it = configList.iterator();
            while (it.hasNext()) {
                configOneNewTrack(it.next());
            }
        }
        J3U.LIZIZ(new ARunnableS44S0100000_8(this, 102));
        SmartDataTrackerService.Companion.getClass();
        if (SmartDataTrackerService.debug) {
            System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void collectDataWhenTriggerTargetEvent(String event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!this.LIZIZ || (str = this.LJII) == null || str.length() == 0 || !o.LJ(event, this.LJII)) {
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            OneSmartDataTrackConfig oneSmartDataTrackConfig = ((C48578J4s) entry.getValue()).LIZIZ;
            String str2 = (String) entry.getKey();
            if (oneSmartDataTrackConfig.getTrackType() == 200) {
                onScenePredictCheckOrRun(str2, new C47322Ihi(0), null);
            }
            if (oneSmartDataTrackConfig.getRealTriggerType() == 200) {
                onSceneRealCheckAndReport(str2, new C47322Ihi(0));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        String scene;
        C48582J4w c48582J4w = SmartDataTrackerService.Companion;
        c48582J4w.getClass();
        if (oneSmartDataTrackConfig != null && (scene = oneSmartDataTrackConfig.getScene()) != null) {
            if (((ConcurrentHashMap) this.LIZ).containsKey(scene)) {
                c48582J4w.getClass();
                return;
            }
            ((ConcurrentHashMap) this.LIZ).put(scene, new C48578J4s(scene, oneSmartDataTrackConfig));
            C48573J4n c48573J4n = SmartDataCenterApiService.Companion;
            c48573J4n.getClass();
            ISmartDataCenterApiService iSmartDataCenterApiService = C48568J4i.LIZ;
            iSmartDataCenterApiService.addSceneModelConfig(oneSmartDataTrackConfig.getPredict());
            c48573J4n.getClass();
            iSmartDataCenterApiService.addSceneModelConfig(oneSmartDataTrackConfig.getReal());
            String targetEvent = oneSmartDataTrackConfig.getTargetEvent();
            if (targetEvent != null && targetEvent.length() != 0 && (oneSmartDataTrackConfig.getTrackType() == 200 || oneSmartDataTrackConfig.getRealTriggerType() == 200)) {
                this.LJII = oneSmartDataTrackConfig.getTargetEvent();
            }
            if (!this.LIZJ && (oneSmartDataTrackConfig.getTrackType() == 100 || oneSmartDataTrackConfig.getRealTriggerType() == 100)) {
                this.LIZJ = true;
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_prepare", this);
            }
            if (!this.LIZLLL && (oneSmartDataTrackConfig.getTrackType() == 102 || oneSmartDataTrackConfig.getRealTriggerType() == 102)) {
                this.LIZLLL = true;
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_first_frame", this);
            }
            if (!this.LJ && (oneSmartDataTrackConfig.getTrackType() == 101 || oneSmartDataTrackConfig.getRealTriggerType() == 101)) {
                this.LJ = true;
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_call_playtime", this);
            }
            if (!this.LJFF && (oneSmartDataTrackConfig.getTrackType() == 103 || oneSmartDataTrackConfig.getRealTriggerType() == 103)) {
                this.LJFF = true;
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_stop", this);
            }
            if (!this.LJI) {
                if (oneSmartDataTrackConfig.getTrackType() == 105 || oneSmartDataTrackConfig.getRealTriggerType() == 105) {
                    this.LJI = true;
                    MLCommonService.Companion.getClass();
                    C46434IKg.LIZ.addCommonEventListener("before_recommend_load_more", this);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        if (str != null && ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(C47322Ihi c47322Ihi, C48578J4s c48578J4s) {
        InputFeaturesConfig inputFeaturesConfig;
        int i;
        OneSmartDataTrackConfig oneSmartDataTrackConfig = c48578J4s.LIZIZ;
        Map<String, Object> map = null;
        if (oneSmartDataTrackConfig != null) {
            inputFeaturesConfig = oneSmartDataTrackConfig.getReal();
        } else {
            inputFeaturesConfig = null;
        }
        LinkedList<TrackerMonitorData> linkedList = c48578J4s.LIZLLL;
        if (linkedList == null || linkedList.isEmpty() || inputFeaturesConfig == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<TrackerMonitorData> it = c48578J4s.LIZLLL.iterator();
            while (it.hasNext()) {
                TrackerMonitorData next = it.next();
                int i2 = next.waitNextRealCnt - 1;
                next.waitNextRealCnt = i2;
                if (i2 <= 0) {
                    arrayList.add(next);
                }
            }
            if (!(!arrayList.isEmpty())) {
                return;
            }
            HashMap hashMap = new HashMap(128);
            SmartDataCenterApiService.Companion.getClass();
            C48568J4i.LIZ.fillInputFeatures(inputFeaturesConfig, c47322Ihi, true);
            if (c47322Ihi != null) {
                map = c47322Ihi.LIZJ;
            }
            C126394xf.LIZ(hashMap, map);
            JSONObject jSONObject = new JSONObject(hashMap);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TrackerMonitorData trackerMonitorData = (TrackerMonitorData) it2.next();
                JSONObject jSONObject2 = trackerMonitorData.jsonData;
                if (jSONObject2 != null) {
                    if (trackerMonitorData.LIZ) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("seq_tail", i);
                    jSONObject2.put("real", jSONObject.toString());
                    FMX.LJIILJJIL("ml_track_data_rpt", jSONObject2);
                }
            }
            c48578J4s.LIZLLL.removeAll(arrayList);
            SmartDataTrackerService.Companion.getClass();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:34:0x000e, B:36:0x0014, B:12:0x0021, B:15:0x0025, B:17:0x003c, B:18:0x003e, B:20:0x0049, B:21:0x004c, B:23:0x008c, B:24:0x0096, B:26:0x00bb), top: B:33:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:34:0x000e, B:36:0x0014, B:12:0x0021, B:15:0x0025, B:17:0x003c, B:18:0x003e, B:20:0x0049, B:21:0x004c, B:23:0x008c, B:24:0x0096, B:26:0x00bb), top: B:33:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:34:0x000e, B:36:0x0014, B:12:0x0021, B:15:0x0025, B:17:0x003c, B:18:0x003e, B:20:0x0049, B:21:0x004c, B:23:0x008c, B:24:0x0096, B:26:0x00bb), top: B:33:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #0 {all -> 0x000a, blocks: (B:34:0x000e, B:36:0x0014, B:12:0x0021, B:15:0x0025, B:17:0x003c, B:18:0x003e, B:20:0x0049, B:21:0x004c, B:23:0x008c, B:24:0x0096, B:26:0x00bb), top: B:33:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C47322Ihi r8, X.C48578J4s r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig r4 = r0.getPredict()
            if (r4 != 0) goto Lb
        La:
            return
        Lb:
            r3 = 0
            if (r8 == 0) goto L19
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C78880UxY.LJIL(r8)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L19
            java.lang.String r2 = r0.getAid()     // Catch: java.lang.Throwable -> La
            goto L1a
        L19:
            r2 = r3
        L1a:
            java.lang.String r5 = ""
            if (r2 != 0) goto L1f
            r2 = r5
        L1f:
            if (r8 == 0) goto L25
            java.lang.String r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L38
        L25:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> La
            r0 = 128(0x80, float:1.8E-43)
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La
            X.J4n r0 = com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService.Companion     // Catch: java.lang.Throwable -> La
            r0.getClass()     // Catch: java.lang.Throwable -> La
            com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService r1 = X.C48568J4i.LIZ     // Catch: java.lang.Throwable -> La
            r0 = 1
            r1.fillInputFeatures(r4, r8, r0)     // Catch: java.lang.Throwable -> La
            goto L3a
        L38:
            r5 = r0
            goto L25
        L3a:
            if (r8 == 0) goto L3e
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.LIZJ     // Catch: java.lang.Throwable -> La
        L3e:
            X.C126394xf.LIZ(r6, r3)     // Catch: java.lang.Throwable -> La
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.getZipZero()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L4c
            X.C126394xf.LIZIZ(r6)     // Catch: java.lang.Throwable -> La
        L4c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La
            r3.<init>()     // Catch: java.lang.Throwable -> La
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La
            r4.<init>(r6)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "scene"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> La
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "track_type"
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> La
            int r0 = r0.getTrackType()     // Catch: java.lang.Throwable -> La
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "enter_type"
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "run_key"
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "predict"
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> La
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "run_count"
            int r0 = r9.LIZJ     // Catch: java.lang.Throwable -> La
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> La
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> La
            int r1 = r0.size()     // Catch: java.lang.Throwable -> La
            int r0 = r9.LJ     // Catch: java.lang.Throwable -> La
            if (r1 <= r0) goto L96
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> La
            r0.removeFirst()     // Catch: java.lang.Throwable -> La
            X.J4w r0 = com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService.Companion     // Catch: java.lang.Throwable -> La
            r0.getClass()     // Catch: java.lang.Throwable -> La
        L96:
            com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData r1 = new com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData     // Catch: java.lang.Throwable -> La
            r1.<init>()     // Catch: java.lang.Throwable -> La
            r1.key = r2     // Catch: java.lang.Throwable -> La
            r1.jsonData = r3     // Catch: java.lang.Throwable -> La
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> La
            int r0 = r0.getNextRealCnt()     // Catch: java.lang.Throwable -> La
            r1.waitNextRealCnt = r0     // Catch: java.lang.Throwable -> La
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> La
            r0.addLast(r1)     // Catch: java.lang.Throwable -> La
            X.J4w r0 = com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService.Companion     // Catch: java.lang.Throwable -> La
            r0.getClass()     // Catch: java.lang.Throwable -> La
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> La
            int r1 = r0.getTrackType()     // Catch: java.lang.Throwable -> La
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto La
            Y.ARunnableS44S0100000_8 r1 = new Y.ARunnableS44S0100000_8     // Catch: java.lang.Throwable -> La
            r0 = 103(0x67, float:1.44E-43)
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> La
            X.J3U.LIZIZ(r1)     // Catch: java.lang.Throwable -> La
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl.LIZ(X.Ihi, X.J4s):void");
    }

    @Override // X.J4G
    public final void LIZIZ(String type, J4A j4a) {
        String str;
        String str2;
        Aweme aweme;
        User author;
        Aweme aweme2;
        o.LJIIIZ(type, "type");
        SmartDataTrackerService.Companion.getClass();
        if (SmartDataTrackerService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onEvent type:", type, " aweme:");
            if (j4a != null && (aweme2 = j4a.LIZ) != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            LIZIZ.append(str);
            LIZIZ.append('-');
            if (j4a != null && (aweme = j4a.LIZ) != null && (author = aweme.getAuthor()) != null) {
                str2 = author.getNickname();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            X1D.LIZIZ(LIZIZ);
        }
        if (j4a == null) {
            return;
        }
        switch (type.hashCode()) {
            case -1877535187:
                if (!type.equals("play_stop")) {
                    return;
                }
                for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig = ((C48578J4s) entry.getValue()).LIZIZ;
                    String str3 = (String) entry.getKey();
                    if (oneSmartDataTrackConfig.getRealTriggerType() == 103) {
                        C47322Ihi c47322Ihi = new C47322Ihi(0);
                        c47322Ihi.LJI = j4a.LIZ;
                        c47322Ihi.LIZIZ = j4a.LIZIZ;
                        onSceneRealCheckAndReport(str3, c47322Ihi);
                    }
                    if (oneSmartDataTrackConfig.getTrackType() == 103) {
                        C47322Ihi c47322Ihi2 = new C47322Ihi(0);
                        c47322Ihi2.LJI = j4a.LIZ;
                        c47322Ihi2.LIZIZ = j4a.LIZIZ;
                        onScenePredictCheckOrRun(str3, c47322Ihi2, null);
                    }
                }
                return;
            case -1704536429:
                if (!type.equals("play_first_frame")) {
                    return;
                }
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig2 = ((C48578J4s) entry2.getValue()).LIZIZ;
                    String str4 = (String) entry2.getKey();
                    if (oneSmartDataTrackConfig2.getRealTriggerType() == 102) {
                        C47322Ihi c47322Ihi3 = new C47322Ihi(0);
                        c47322Ihi3.LJI = j4a.LIZ;
                        c47322Ihi3.LIZIZ = j4a.LIZIZ;
                        onSceneRealCheckAndReport(str4, c47322Ihi3);
                    }
                    if (oneSmartDataTrackConfig2.getTrackType() == 102) {
                        C47322Ihi c47322Ihi4 = new C47322Ihi(0);
                        c47322Ihi4.LJI = j4a.LIZ;
                        c47322Ihi4.LIZIZ = j4a.LIZIZ;
                        onScenePredictCheckOrRun(str4, c47322Ihi4, null);
                    }
                }
                return;
            case 1168529143:
                if (!type.equals("play_call_playtime")) {
                    return;
                }
                for (Map.Entry entry3 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig3 = ((C48578J4s) entry3.getValue()).LIZIZ;
                    String str5 = (String) entry3.getKey();
                    if (oneSmartDataTrackConfig3.getRealTriggerType() == 101) {
                        C47322Ihi c47322Ihi5 = new C47322Ihi(0);
                        c47322Ihi5.LJI = j4a.LIZ;
                        c47322Ihi5.LIZIZ = j4a.LIZIZ;
                        onSceneRealCheckAndReport(str5, c47322Ihi5);
                    }
                    if (oneSmartDataTrackConfig3.getTrackType() == 101) {
                        C47322Ihi c47322Ihi6 = new C47322Ihi(0);
                        c47322Ihi6.LJI = j4a.LIZ;
                        c47322Ihi6.LIZIZ = j4a.LIZIZ;
                        onScenePredictCheckOrRun(str5, c47322Ihi6, null);
                    }
                }
                return;
            case 1274399484:
                if (!type.equals("play_prepare")) {
                    return;
                }
                for (Map.Entry entry4 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig4 = ((C48578J4s) entry4.getValue()).LIZIZ;
                    String str6 = (String) entry4.getKey();
                    if (oneSmartDataTrackConfig4.getRealTriggerType() == 100) {
                        C47322Ihi c47322Ihi7 = new C47322Ihi(0);
                        c47322Ihi7.LJI = j4a.LIZ;
                        c47322Ihi7.LIZIZ = j4a.LIZIZ;
                        onSceneRealCheckAndReport(str6, c47322Ihi7);
                    }
                    if (oneSmartDataTrackConfig4.getTrackType() == 100) {
                        C47322Ihi c47322Ihi8 = new C47322Ihi(0);
                        c47322Ihi8.LJI = j4a.LIZ;
                        c47322Ihi8.LIZIZ = j4a.LIZIZ;
                        onScenePredictCheckOrRun(str6, c47322Ihi8, null);
                    }
                }
                return;
            case 1643886219:
                if (!type.equals("before_recommend_load_more")) {
                    return;
                }
                for (Map.Entry entry5 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig5 = ((C48578J4s) entry5.getValue()).LIZIZ;
                    String str7 = (String) entry5.getKey();
                    if (oneSmartDataTrackConfig5.getRealTriggerType() == 105) {
                        C47322Ihi c47322Ihi9 = new C47322Ihi(0);
                        c47322Ihi9.LIZIZ = j4a.LIZIZ;
                        onSceneRealCheckAndReport(str7, c47322Ihi9);
                    }
                    if (oneSmartDataTrackConfig5.getTrackType() == 105) {
                        C47322Ihi c47322Ihi10 = new C47322Ihi(0);
                        c47322Ihi10.LIZIZ = j4a.LIZIZ;
                        onScenePredictCheckOrRun(str7, c47322Ihi10, null);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService
    public final void onSceneRealCheckAndReport(String str, C47322Ihi c47322Ihi) {
        if (c47322Ihi == null || str == null) {
            return;
        }
        try {
            C48578J4s c48578J4s = (C48578J4s) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c48578J4s != null) {
                SmartDataTrackerService.Companion.getClass();
                LIZJ(c47322Ihi, c48578J4s);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, C47322Ihi c47322Ihi, InterfaceC48513J2f interfaceC48513J2f) {
        if (c47322Ihi == null || str == null) {
            return;
        }
        try {
            C48578J4s c48578J4s = (C48578J4s) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c48578J4s != null) {
                c48578J4s.LIZJ++;
                SmartDataTrackerService.Companion.getClass();
                if (V0Q.Default.nextFloat() < c48578J4s.LIZIZ.getReportRate()) {
                    LIZ(c47322Ihi, c48578J4s);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService
    public final void putExtData(String str, String str2, String key, Object value) {
        C48578J4s c48578J4s;
        LinkedList<TrackerMonitorData> linkedList;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        if (str == null || (c48578J4s = (C48578J4s) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (linkedList = c48578J4s.LIZLLL) == null || linkedList.isEmpty()) {
            return;
        }
        J3U.LIZIZ(new RunnableC48579J4t(c48578J4s, str2, key, value));
    }
}
