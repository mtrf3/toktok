package X;

import com.ss.android.ugc.aweme.ml.feature.SessionComposeInfo;
import com.ss.android.ugc.aweme.ml.feature.SessionPlayInfo;
import com.ss.android.ugc.aweme.ml.infra.FeatureSessionTypeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.J6e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48616J6e extends J6W {
    public static final int LJFF = 16;
    public static final int LJI = 10;
    public final FR6<SessionPlayInfo> LIZIZ = new FR6<>("f_session", LJFF);
    public final SessionComposeInfo LIZJ = new SessionComposeInfo();
    public boolean LIZLLL = true;
    public boolean LJ;

    public final void LIZ(java.util.Map map, FeatureSessionTypeConfig featureSessionTypeConfig, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        if (!featureSessionTypeConfig.getEnable() || featureSessionTypeConfig.getRange() <= 0) {
            return;
        }
        try {
            ArrayList<SessionPlayInfo> LIZIZ = this.LIZIZ.LIZIZ(featureSessionTypeConfig.getRange(), FVP.LIZIZ, featureSessionTypeConfig.getRangeExcludeThis());
            if (LIZIZ == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int range = featureSessionTypeConfig.getRange();
            Iterator<SessionPlayInfo> it = LIZIZ.iterator();
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                SessionPlayInfo next = it.next();
                range--;
                if (next != null) {
                    i4 = (int) next.playTime;
                    i3 = next.seqCnt;
                    i8 += i4;
                    i10 += i3;
                    i5 = Math.min(i5, i4);
                    i9 = Math.max(i9, i4);
                    arrayList.add(Integer.valueOf(i4));
                    i7++;
                    i6 = Math.min(i6, i3);
                    i11 = Math.max(i11, i3);
                    arrayList2.add(Integer.valueOf(i3));
                    i12++;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                Integer valueOf = Integer.valueOf(i4);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("session_play_time_");
                LIZ.append(range);
                map.put(X1D.LIZIZ(LIZ), valueOf);
                Integer valueOf2 = Integer.valueOf(i3);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("session_seq_cnt_");
                LIZ2.append(range);
                map.put(X1D.LIZIZ(LIZ2), valueOf2);
                if (z) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("session_date_");
                    LIZ3.append(range);
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    Object obj = "";
                    if (next == null || (str = next.date) == null) {
                        str = "";
                    }
                    map.put(LIZIZ2, str);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("session_id_");
                    LIZ4.append(range);
                    String LIZIZ3 = X1D.LIZIZ(LIZ4);
                    if (next == null || (str2 = next.sessionId) == null) {
                        str2 = "";
                    }
                    map.put(LIZIZ3, str2);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("session_begin_time_");
                    LIZ5.append(range);
                    String LIZIZ4 = X1D.LIZIZ(LIZ5);
                    if (next != null) {
                        obj = Long.valueOf(next.beginTime);
                    }
                    map.put(LIZIZ4, obj);
                }
            }
            if (i7 > 0) {
                i = i8 / i7;
            } else {
                i = 0;
            }
            map.put("session_play_time_avg", Integer.valueOf(i));
            map.put("session_play_time_max", Integer.valueOf(i9));
            map.put("session_play_time_min", Integer.valueOf(Math.min(i9, i5)));
            map.put("session_play_time_total", Integer.valueOf(i8));
            map.put("session_play_time_mid", Integer.valueOf(C48617J6f.LIZ(arrayList)));
            if (i12 > 0) {
                i2 = i10 / i12;
            } else {
                i2 = 0;
            }
            map.put("session_seq_cnt_avg", Integer.valueOf(i2));
            map.put("session_seq_cnt_max", Integer.valueOf(i11));
            map.put("session_seq_cnt_min", Integer.valueOf(Math.min(i11, i6)));
            map.put("session_seq_cnt_total", Integer.valueOf(i10));
            map.put("session_seq_cnt_mid", Integer.valueOf(C48617J6f.LIZ(arrayList2)));
            map.put("session_rank", Integer.valueOf(this.LIZJ.sessionRank));
        } catch (Throwable unused) {
        }
    }
}
