package com.ss.android.ugc.aweme.commercialize.data.utils;

import X.C25620zW;
import X.C40675Fxn;
import X.C55499LqJ;
import X.InterfaceC65349Pkn;
import X.LA4;
import X.NN3;
import X.NN4;
import X.ORZ;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdSessionPositionHelper {
    public static int LJIILL;
    public static int LJIILLIIL;
    public static int LJIJI;
    public static int LJIJJ;
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static int LIZLLL = -1;
    public static int LJ = -1;
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static int LJIIIIZZ = -1;
    public static int LJIIIZ = -1;
    public static int LJIIJ = -1;
    public static int LJIIJJI = -1;
    public static int LJIIL = -1;
    public static int LJIILIIL = -1;
    public static int LJIILJJIL = -1;
    public static int LJIIZILJ = -1;
    public static int LJIJ = -1;
    public static HashSet<String> LJIJJLI = new HashSet<>();
    public static HashSet<String> LJIL = new HashSet<>();
    public static HashMap<String, NN4> LJJ = new HashMap<>();
    public static HashMap<String, NN4> LJJI = new HashMap<>();
    public static ConcurrentHashMap<String, NN3> LJJIFFI = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, NN3> LJJII = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, NN3> LJJIII = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, NN3> LJJIIJ = new ConcurrentHashMap<>();
    public static final HashSet<String> LJJIIJZLJL = new HashSet<>();
    public static final HashSet<String> LJJIIZ = new HashSet<>();
    public static String LJJIIZI = "";
    public static String LJJIJ = "";
    public static String LJJIJIIJI = "";
    public static String LJJIJIIJIL = "";

    /* loaded from: classes11.dex */
    public static final class SessionReportModel implements Serializable {

        @InterfaceC65349Pkn("absolute_session_position")
        public List<Integer> absolutePos;

        @InterfaceC65349Pkn("absolute_session_position_with_cross_tab")
        public List<Integer> absolutePosCrossTab;

        @InterfaceC65349Pkn("all_relative_position_of_last_request")
        public List<Integer> allRelativePositionLastReq;

        @InterfaceC65349Pkn("timestamp_of_first_ad_with_click")
        public long firstAdClickTime;

        @InterfaceC65349Pkn("timestamp_of_first_ad_with_show")
        public long firstAdShowTime;

        @InterfaceC65349Pkn("first_timestamp_of_enter_session")
        public long firstEnterSessionTime;

        @InterfaceC65349Pkn("last_relative_position_of_ad_with_click")
        public int lastAdClickPosition;

        @InterfaceC65349Pkn("last_timestamp_of_ad_with_click")
        public long lastAdClickTime;

        @InterfaceC65349Pkn("last_relative_position_of_ad_with_show")
        public int lastAdShowPosition;

        @InterfaceC65349Pkn("last_timestamp_of_ad_with_show")
        public long lastAdShowTime;

        @InterfaceC65349Pkn("relative_session_position")
        public List<Integer> relativePos;

        @InterfaceC65349Pkn("request_index_within_session")
        public int requestIndex;

        @InterfaceC65349Pkn("session_id")
        public String sessionId;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SessionReportModel() {
            /*
                r21 = this;
                r1 = 0
                r5 = 0
                r15 = 0
                r19 = 8191(0x1fff, float:1.1478E-41)
                r0 = r21
                r2 = r1
                r3 = r1
                r4 = r1
                r7 = r5
                r9 = r5
                r11 = r5
                r13 = r5
                r16 = r15
                r17 = r1
                r18 = r15
                r20 = r1
                r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.SessionReportModel.<init>():void");
        }

        public final List<Integer> getAbsolutePos() {
            return this.absolutePos;
        }

        public final List<Integer> getAbsolutePosCrossTab() {
            return this.absolutePosCrossTab;
        }

        public final List<Integer> getAllRelativePositionLastReq() {
            return this.allRelativePositionLastReq;
        }

        public final long getFirstAdClickTime() {
            return this.firstAdClickTime;
        }

        public final long getFirstAdShowTime() {
            return this.firstAdShowTime;
        }

        public final long getFirstEnterSessionTime() {
            return this.firstEnterSessionTime;
        }

        public final int getLastAdClickPosition() {
            return this.lastAdClickPosition;
        }

        public final long getLastAdClickTime() {
            return this.lastAdClickTime;
        }

        public final int getLastAdShowPosition() {
            return this.lastAdShowPosition;
        }

        public final long getLastAdShowTime() {
            return this.lastAdShowTime;
        }

        public final List<Integer> getRelativePos() {
            return this.relativePos;
        }

        public final int getRequestIndex() {
            return this.requestIndex;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final void setAbsolutePos(List<Integer> list) {
            this.absolutePos = list;
        }

        public final void setAbsolutePosCrossTab(List<Integer> list) {
            this.absolutePosCrossTab = list;
        }

        public final void setAllRelativePositionLastReq(List<Integer> list) {
            this.allRelativePositionLastReq = list;
        }

        public final void setFirstAdClickTime(long j) {
            this.firstAdClickTime = j;
        }

        public final void setFirstAdShowTime(long j) {
            this.firstAdShowTime = j;
        }

        public final void setFirstEnterSessionTime(long j) {
            this.firstEnterSessionTime = j;
        }

        public final void setLastAdClickPosition(int i) {
            this.lastAdClickPosition = i;
        }

        public final void setLastAdClickTime(long j) {
            this.lastAdClickTime = j;
        }

        public final void setLastAdShowPosition(int i) {
            this.lastAdShowPosition = i;
        }

        public final void setLastAdShowTime(long j) {
            this.lastAdShowTime = j;
        }

        public final void setRelativePos(List<Integer> list) {
            this.relativePos = list;
        }

        public final void setRequestIndex(int i) {
            this.requestIndex = i;
        }

        public final void setSessionId(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.sessionId = str;
        }

        public SessionReportModel(String sessionId, List<Integer> list, List<Integer> list2, List<Integer> list3, long j, long j2, long j3, long j4, long j5, int i, int i2, List<Integer> list4, int i3) {
            o.LJIIIZ(sessionId, "sessionId");
            this.sessionId = sessionId;
            this.absolutePos = list;
            this.relativePos = list2;
            this.absolutePosCrossTab = list3;
            this.firstEnterSessionTime = j;
            this.firstAdShowTime = j2;
            this.firstAdClickTime = j3;
            this.lastAdShowTime = j4;
            this.lastAdClickTime = j5;
            this.lastAdShowPosition = i;
            this.lastAdClickPosition = i2;
            this.allRelativePositionLastReq = list4;
            this.requestIndex = i3;
        }

        public /* synthetic */ SessionReportModel(String str, List list, List list2, List list3, long j, long j2, long j3, long j4, long j5, int i, int i2, List list4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : list, (i4 & 4) != 0 ? null : list2, (i4 & 8) != 0 ? null : list3, (i4 & 16) != 0 ? -1L : j, (i4 & 32) != 0 ? -1L : j2, (i4 & 64) != 0 ? -1L : j3, (i4 & 128) != 0 ? -1L : j4, (i4 & 256) == 0 ? j5 : -1L, (i4 & 512) != 0 ? -1 : i, (i4 & 1024) != 0 ? -1 : i2, (i4 & 2048) != 0 ? null : list4, (i4 & 4096) == 0 ? i3 : -1);
        }
    }

    public static int LIZ(String str) {
        NN4 nn4;
        Integer valueOf;
        if (str == null) {
            return -1;
        }
        if (LJJ.containsKey(str)) {
            NN4 nn42 = LJJ.get(str);
            if (nn42 != null) {
                valueOf = Integer.valueOf(nn42.LIZIZ);
            }
            valueOf = null;
        } else {
            if (LJJI.containsKey(str) && (nn4 = LJJI.get(str)) != null) {
                valueOf = Integer.valueOf(nn4.LIZIZ);
            }
            valueOf = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAbsolutePos, cid is ");
        LIZ2.append(str);
        LIZ2.append(", result is ");
        LIZ2.append(valueOf);
        X1D.LIZIZ(LIZ2);
        if (valueOf == null) {
            return -1;
        }
        return valueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r4) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L60
            int r0 = r0.LIZLLL
            if (r0 != r3) goto L60
        L1a:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L30
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L4f
            int r0 = r0.LIZLLL
            if (r0 != r3) goto L4f
        L30:
            r2 = 0
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getAbsolutePosCrossTab, cid is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", result is "
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            if (r2 == 0) goto L4e
            int r3 = r2.intValue()
        L4e:
            return r3
        L4f:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L30
            int r0 = r0.LIZLLL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L31
        L60:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L30
            int r0 = r0.LIZLLL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LIZIZ(java.lang.String):int");
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return null;
        }
        if (LJIJJLI.contains(str)) {
            return "fyp";
        }
        if (!LJIL.contains(str)) {
            return null;
        }
        return "following";
    }

    public static int LIZLLL(String str) {
        NN4 nn4;
        if (str == null || (nn4 = LJJ.get(str)) == null) {
            return -1;
        }
        int i = nn4.LJFF;
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("getLastClickRelativePos, cid is ", str, ", feedType is fyp, result is ");
        LIZIZ2.append(LJIIJ - i);
        X1D.LIZIZ(LIZIZ2);
        return i;
    }

    public static int LJ(String str) {
        if (str == null) {
            return -1;
        }
        NN4 nn4 = LJJ.get(str);
        if (nn4 != null) {
            int i = nn4.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getLastShownRelativePos, cid is ");
            LIZ2.append(str);
            LIZ2.append(", feedType is fyp, result is ");
            LIZ2.append(i);
            X1D.LIZIZ(LIZ2);
            return i;
        }
        NN4 nn42 = LJJI.get(str);
        if (nn42 == null) {
            return -1;
        }
        int i2 = nn42.LJ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getLastShownRelativePos, cid is ");
        LIZ3.append(str);
        LIZ3.append(", feedType is following, result is ");
        LIZ3.append(i2);
        X1D.LIZIZ(LIZ3);
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJFF(java.lang.String r4) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L60
            int r0 = r0.LIZJ
            if (r0 != r3) goto L60
        L1a:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L30
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L4f
            int r0 = r0.LIZJ
            if (r0 != r3) goto L4f
        L30:
            r2 = 0
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getRelativePos, cid is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", result is "
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            if (r2 == 0) goto L4e
            int r3 = r2.intValue()
        L4e:
            return r3
        L4f:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L30
            int r0 = r0.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L31
        L60:
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            java.lang.Object r0 = r0.get(r4)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L30
            int r0 = r0.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJFF(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(java.lang.String r2) {
        /*
            java.lang.String r1 = LIZJ(r2)
            java.lang.String r0 = "fyp"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L23
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJ
            java.lang.Object r0 = r0.get(r2)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L20
            java.util.List<java.lang.Integer> r0 = r0.LJI
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.toString()
        L1e:
            if (r0 != 0) goto L22
        L20:
            java.lang.String r0 = "[]"
        L22:
            return r0
        L23:
            java.lang.String r0 = "following"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L20
            java.util.HashMap<java.lang.String, X.NN4> r0 = com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJJI
            java.lang.Object r0 = r0.get(r2)
            X.NN4 r0 = (X.NN4) r0
            if (r0 == 0) goto L20
            java.util.List<java.lang.Integer> r0 = r0.LJI
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.toString()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJI(java.lang.String):java.lang.String");
    }

    public static int LJII(String str) {
        NN4 nn4;
        String LIZJ2 = LIZJ(str);
        if (o.LJ(LIZJ2, "fyp")) {
            NN4 nn42 = LJJ.get(str);
            if (nn42 != null) {
                return nn42.LJII;
            }
        } else if (o.LJ(LIZJ2, "following") && (nn4 = LJJI.get(str)) != null) {
            return nn4.LJII;
        }
        return -1;
    }

    public static String LJIIIIZZ(String str) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.equals(str, "fyp")) {
            for (Map.Entry<String, NN3> entry : LJJIFFI.entrySet()) {
                arrayList.add(Integer.valueOf(entry.getValue().LIZLLL));
                arrayList2.add(Integer.valueOf(entry.getValue().LJ));
                arrayList3.add(Integer.valueOf(entry.getValue().LIZLLL + LJIILLIIL));
            }
            C40675Fxn.LJJLIIIIJ(arrayList);
            C40675Fxn.LJJLIIIIJ(arrayList2);
            C40675Fxn.LJJLIIIIJ(arrayList3);
            Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
            String str2 = LJJIJIIJIL;
            long j = LIZ;
            long j2 = LIZIZ;
            long j3 = LIZJ;
            long j4 = LJI;
            long j5 = LJII;
            int i3 = LJIIIIZZ;
            if (i3 == -1) {
                i = -1;
            } else {
                i = (LJIILL - i3) - 2;
                if (i == -1) {
                    i = 0;
                }
            }
            int i4 = LJIIJ;
            if (i4 == -1) {
                i2 = -1;
            } else {
                i2 = (LJIILL - i4) - 2;
                if (i2 == -1) {
                    i2 = 0;
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry<String, NN3> entry2 : LJJIFFI.entrySet()) {
                arrayList4.add(Integer.valueOf(entry2.getValue().LJFF - entry2.getValue().LJI));
            }
            C40675Fxn.LJJLIIIIJ(arrayList4);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getRelativePosLastReqForRequestReport, result is ");
            LIZ3.append(arrayList4);
            X1D.LIZIZ(LIZ3);
            String json = GsonProtectorUtils.toJson(LIZ2, new SessionReportModel(str2, arrayList, arrayList2, arrayList3, j, j2, j3, j4, j5, i, i2, arrayList4, LJIILIIL + 1));
            o.LJIIIIZZ(json, "{\n            for (model…uestIndex + 1))\n        }");
            return json;
        }
        if (TextUtils.equals(str, "following")) {
            for (Map.Entry<String, NN3> entry3 : LJJII.entrySet()) {
                arrayList.add(Integer.valueOf(entry3.getValue().LIZLLL));
                arrayList2.add(Integer.valueOf(entry3.getValue().LJ));
                arrayList3.add(Integer.valueOf(entry3.getValue().LIZLLL + LJIILL));
            }
            C40675Fxn.LJJLIIIIJ(arrayList);
            C40675Fxn.LJJLIIIIJ(arrayList2);
            C40675Fxn.LJJLIIIIJ(arrayList3);
            String json2 = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new SessionReportModel(LJJIJIIJIL, arrayList, arrayList2, arrayList3, -1L, -1L, -1L, -1L, -1L, -1, -1, null, LJIILJJIL + 1));
            o.LJIIIIZZ(json2, "{\n            for (model…uestIndex + 1))\n        }");
            return json2;
        }
        return "";
    }

    public static String LJIIIZ(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (LJJ.containsKey(str)) {
            NN4 nn4 = LJJ.get(str);
            if (nn4 != null) {
                str2 = nn4.LIZ;
            }
        } else if (LJJI.containsKey(str)) {
            NN4 nn42 = LJJI.get(str);
            if (nn42 != null) {
                str2 = nn42.LIZ;
            }
        } else {
            str2 = LJJIJIIJIL;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getSessionId, cid is ");
        LIZ2.append(str);
        LIZ2.append(", result is ");
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        return str2;
    }

    public static NN3 LJIIJ(String str) {
        String LIZJ2 = LIZJ(str);
        if (o.LJ(LIZJ2, "fyp")) {
            NN3 nn3 = LJJIFFI.get(str);
            if (nn3 == null) {
                return LJJIII.get(str);
            }
            return nn3;
        }
        if (o.LJ(LIZJ2, "following")) {
            NN3 nn32 = LJJII.get(str);
            if (nn32 != null) {
                return nn32;
            }
            return LJJIIJ.get(str);
        }
        return null;
    }

    public static void LJIIL(long j) {
        LIZ = j;
        if (!TextUtils.isEmpty(LJJIJIIJI) && !TextUtils.equals(LJJIJIIJI, LA4.LIZ())) {
            LJIJJLI = new HashSet<>();
            LJIL = new HashSet<>();
            LJJ = new HashMap<>();
            LJJI = new HashMap<>();
            LJJIFFI = new ConcurrentHashMap<>();
            LJJII = new ConcurrentHashMap<>();
            LJJIII = new ConcurrentHashMap<>();
            LJJIIJ = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(LJJIJIIJIL)) {
            LJIILIIL = 0;
            LJIILJJIL = 0;
        }
        LJJIJIIJI = LA4.LIZ();
        String uid = LJJIJIIJI;
        o.LJIIIZ(uid, "uid");
        if (!o.LJ(C55499LqJ.LIZLLL, uid)) {
            C55499LqJ.LIZLLL = uid;
            C55499LqJ.LIZJ();
        }
        String str = C55499LqJ.LIZIZ;
        o.LJII(str, "null cannot be cast to non-null type kotlin.String");
        LJJIJIIJIL = str;
        LJI = -1L;
        LJFF = -1L;
        LIZIZ = -1L;
        LJIIIIZZ = -1;
        LJIIIZ = -1;
        LIZJ = -1L;
        LJII = -1L;
        LJIIJ = -1;
        LJIIJJI = -1;
        LJIIL = -1;
        LIZLLL = -1;
        LJ = -1;
        LJIILL = 0;
        LJIILLIIL = 0;
        LJIJI = 0;
        LJIJJ = 0;
        LJIILJJIL(LJJIFFI, LJJIII, LJJIIJZLJL, LJJIIZI, "fyp");
        LJIILJJIL(LJJII, LJJIIJ, LJJIIZ, LJJIJ, "following");
    }

    public static void LJIIZILJ(String str) {
        NN4 nn4;
        if (LJJ.containsKey(str)) {
            NN4 nn42 = LJJ.get(str);
            if ((nn42 != null && nn42.LIZIZ == -1) || (nn4 = LJJ.get(str)) == null) {
                return;
            }
            LJIIJ = nn4.LIZIZ;
        }
    }

    public static void LJIIJJI(String str, List awemeList) {
        ArrayList arrayList;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        String creativeIdStr2;
        o.LJIIIZ(awemeList, "awemeList");
        int size = awemeList.size();
        System.currentTimeMillis();
        if (o.LJ(str, "fyp")) {
            LJIILIIL++;
            LJJIII = LJJIFFI;
            LJJIFFI = new ConcurrentHashMap<>();
        } else if (o.LJ(str, "following")) {
            LJIILJJIL++;
            LJJIIJ = LJJII;
            LJJII = new ConcurrentHashMap<>();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = awemeList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Aweme) it.next()).getAid());
        }
        Iterator it2 = awemeList.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (aweme.isAd()) {
                if (o.LJ(str, "fyp")) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null && (creativeIdStr2 = awemeRawAd2.getCreativeIdStr()) != null) {
                        String str2 = LJJIJIIJIL;
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "aweme.aid");
                        int i = LJIILIIL;
                        int indexOf = awemeList.indexOf(aweme) + LJIJI;
                        int i2 = LJIIJJI + 1;
                        int indexOf2 = awemeList.indexOf(aweme);
                        Collection<NN3> values = LJJIII.values();
                        o.LJIIIIZZ(values, "adPosLastReqInFyp.values");
                        arrayList = arrayList2;
                        NN3 nn3 = new NN3(str2, aid, i, indexOf, i2, indexOf2, size, arrayList2, ORZ.LLJI(values));
                        LJIJJLI.add(creativeIdStr2);
                        LJJIFFI.put(creativeIdStr2, nn3);
                        LJIIJJI++;
                    } else {
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList = arrayList2;
                    if (o.LJ(str, "following") && (awemeRawAd = aweme.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                        String str3 = LJJIJIIJIL;
                        String aid2 = aweme.getAid();
                        o.LJIIIIZZ(aid2, "aweme.aid");
                        int i3 = LJIILJJIL;
                        int indexOf3 = awemeList.indexOf(aweme) + LJIJJ;
                        int i4 = LJIIL + 1;
                        int indexOf4 = awemeList.indexOf(aweme);
                        Collection<NN3> values2 = LJJIIJ.values();
                        o.LJIIIIZZ(values2, "adPosLastReqInFollow.values");
                        NN3 nn32 = new NN3(str3, aid2, i3, indexOf3, i4, indexOf4, size, arrayList, ORZ.LLJI(values2));
                        LJIL.add(creativeIdStr);
                        LJJII.put(creativeIdStr, nn32);
                        LJIIL++;
                    }
                }
                arrayList2 = arrayList;
            }
        }
        if (o.LJ(str, "fyp")) {
            LJIJI += size;
        } else {
            if (!o.LJ(str, "following")) {
                return;
            }
            LJIJJ += size;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r21, X.C58655N0h r22) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper.LJIILL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, X.N0h):void");
    }

    public static void LJIILLIIL(long j, String str) {
        String str2;
        if (o.LJ(LIZJ(str), "fyp")) {
            NN4 nn4 = LJJ.get(str);
            if (nn4 != null) {
                str2 = nn4.LIZ;
            } else {
                str2 = null;
            }
            if (o.LJ(str2, LJJIJIIJIL) && LIZJ == -1) {
                LIZJ = j;
            }
        }
    }

    public static void LJIILIIL(int i, String aid, String str) {
        int i2;
        int i3;
        o.LJIIIZ(aid, "aid");
        if (o.LJ(str, "fyp")) {
            HashSet<String> hashSet = LJJIIJZLJL;
            if (!hashSet.contains(aid) && (((i3 = LJIIZILJ) != i && Math.abs(i3 - i) == 1) || i == 0 || LJIIZILJ == -1)) {
                hashSet.add(aid);
                LJIILL++;
                LJIIZILJ = i;
            }
            LJJIIZI = aid;
        } else if (o.LJ(str, "following")) {
            HashSet<String> hashSet2 = LJJIIZ;
            if (!hashSet2.contains(aid) && (((i2 = LJIJ) != i && Math.abs(i2 - i) == 1) || i == 0 || LJIJ == -1)) {
                hashSet2.add(aid);
                LJIILLIIL++;
                LJIJ = i;
            }
            LJJIJ = aid;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onViewHolderSelected, fypSessionShowNum is ");
        LIZ2.append(LJIILL);
        LIZ2.append(", followSessionShowNum is ");
        LIZ2.append(LJIILLIIL);
        LIZ2.append(", position is ");
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
    }

    public static void LJIILJJIL(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, HashSet hashSet, String str, String str2) {
        int i;
        Iterator it = concurrentHashMap.entrySet().iterator();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        boolean z = false;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (i3 == i2 && i4 == i2) {
                i3 = ((NN3) entry.getValue()).LJII.indexOf(str) + 1;
                i4 = ((NN3) entry.getValue()).LJI - i3;
                i5 = ((NN3) entry.getValue()).LJI;
                if (i3 == 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("resetWhenSessionChanged, thisReqMapFailed, thisReqAidList is ");
                    LIZ2.append(((NN3) entry.getValue()).LJII);
                    LIZ2.append(", aid is ");
                    LIZ2.append(str);
                    X1D.LIZIZ(LIZ2);
                    i3 = -1;
                    i4 = -1;
                    break;
                }
                concurrentHashMap2.clear();
            }
            if (hashSet.contains(((NN3) entry.getValue()).LIZIZ)) {
                concurrentHashMap.remove(entry.getKey());
                ((NN3) entry.getValue()).LJI = i3;
                concurrentHashMap2.put(entry.getKey(), entry.getValue());
                i2 = -1;
            } else {
                NN3 nn3 = (NN3) entry.getValue();
                if (i3 > 0 && nn3.LJI <= nn3.LJII.size() && i3 <= (i = nn3.LJI)) {
                    List<String> subList = nn3.LJII.subList(i3, i);
                    o.LJIIIZ(subList, "<set-?>");
                    nn3.LJII = subList;
                }
                nn3.LJI = i4;
                nn3.LIZJ = 0;
                if (TextUtils.equals(str2, "following")) {
                    int i6 = LJIIL + 1;
                    LJIIL = i6;
                    nn3.LJ = i6;
                } else {
                    int i7 = LJIIJJI + 1;
                    LJIIJJI = i7;
                    nn3.LJ = i7;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("resetWhenSessionChanged, thisReqMap, lastFypAdRelativePos is ");
                    LIZ3.append(LJIIJJI);
                    X1D.LIZIZ(LIZ3);
                }
                String str3 = LJJIJIIJIL;
                o.LJIIIZ(str3, "<set-?>");
                nn3.LIZ = str3;
                nn3.LJFF -= i3;
                nn3.LJIIIIZZ = new ArrayList();
                i2 = -1;
                z = true;
            }
        }
        if (z || concurrentHashMap2.size() == 0) {
            return;
        }
        Collection values = concurrentHashMap2.values();
        o.LJIIIIZZ(values, "lastReqMap.values");
        Object LJLLILLLL = ORZ.LJLLILLLL(values);
        o.LJIIIIZZ(LJLLILLLL, "lastReqMap.values.first()");
        NN3 nn32 = (NN3) LJLLILLLL;
        if (i3 == -1 && i4 == -1) {
            i3 = nn32.LJII.indexOf(str) + 1;
            i4 = (nn32.LJI - i3) + i5;
            if (i3 == 0) {
                return;
            }
        }
        Iterator it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            NN3 nn33 = (NN3) ((Map.Entry) it2.next()).getValue();
            nn33.LIZJ = 0;
            if (TextUtils.equals(str2, "following")) {
                int i8 = LJIIL + 1;
                LJIIL = i8;
                nn33.LJ = i8;
            } else {
                int i9 = LJIIJJI + 1;
                LJIIJJI = i9;
                nn33.LJ = i9;
            }
            nn33.LJFF -= i3;
            nn33.LJI = i4;
            String str4 = LJJIJIIJIL;
            o.LJIIIZ(str4, "<set-?>");
            nn33.LIZ = str4;
            nn33.LJIIIIZZ = new ArrayList();
        }
        for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
            if (hashSet.contains(((NN3) entry2.getValue()).LIZIZ)) {
                ((NN3) entry2.getValue()).LJI = i3;
            } else {
                concurrentHashMap2.remove(entry2.getKey());
                NN3 nn34 = (NN3) entry2.getValue();
                nn34.LJI = i4;
                nn34.LIZJ = 0;
                if (TextUtils.equals(str2, "following")) {
                    int i10 = LJIIL + 1;
                    LJIIL = i10;
                    nn34.LJ = i10;
                } else {
                    int i11 = LJIIJJI + 1;
                    LJIIJJI = i11;
                    nn34.LJ = i11;
                }
                nn34.LJFF -= i3;
                String str5 = LJJIJIIJIL;
                o.LJIIIZ(str5, "<set-?>");
                nn34.LIZ = str5;
                nn34.LJIIIIZZ = new ArrayList();
                concurrentHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
    }
}
