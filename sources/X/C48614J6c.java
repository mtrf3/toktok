package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.feature.SequenceComposeInfo;
import com.ss.android.ugc.aweme.ml.feature.SequencePlayInfo;
import com.ss.android.ugc.aweme.ml.infra.FeatureSequenceTypeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.J6c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48614J6c extends J6W {
    public static final int LJFF = 16;
    public static final int LJI = 10;
    public final FR6<SequencePlayInfo> LIZIZ = new FR6<>("f_sequence", LJFF);
    public final SequenceComposeInfo LIZJ = new SequenceComposeInfo();
    public boolean LIZLLL = true;
    public boolean LJ;

    public final SequencePlayInfo LIZIZ(String str) {
        SequencePlayInfo LIZ;
        if (!this.LIZ || str == null || (LIZ = this.LIZIZ.LIZ(str)) == null) {
            return null;
        }
        return LIZ;
    }

    public final void LIZ(java.util.Map map, FeatureSequenceTypeConfig featureSequenceTypeConfig, C47322Ihi c47322Ihi, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str3;
        String str4;
        Aweme LJIL;
        if (!featureSequenceTypeConfig.getEnable() || featureSequenceTypeConfig.getRange() <= 0) {
            return;
        }
        String str5 = null;
        if (c47322Ihi != null && (LJIL = C78880UxY.LJIL(c47322Ihi)) != null) {
            str = LJIL.getAid();
        } else {
            str = null;
        }
        try {
            o.LJI(str);
            if (c47322Ihi == null) {
                str2 = null;
            } else {
                str2 = c47322Ihi.LIZIZ;
            }
            o.LJI(str2);
            C7D6 LIZLLL = C48617J6f.LIZLLL(str, str2);
            if (LIZLLL != null) {
                str5 = LIZLLL.LIZ;
            }
            ArrayList<SequencePlayInfo> LIZIZ = this.LIZIZ.LIZIZ(featureSequenceTypeConfig.getRange(), str5, featureSequenceTypeConfig.getRangeExcludeThis());
            if (LIZIZ == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int range = featureSequenceTypeConfig.getRange();
            Iterator<SequencePlayInfo> it = LIZIZ.iterator();
            int i8 = Integer.MAX_VALUE;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (it.hasNext()) {
                SequencePlayInfo next = it.next();
                range--;
                if (next != null) {
                    i6 = (int) next.playTime;
                    i5 = next.skipCount;
                    i3 = next.headCount;
                    i7 = next.commentCount;
                    i2 = next.playFinishCount;
                    i4 = next.likeCount;
                    i11 += i6;
                    i13 += i5;
                    i14 += i3;
                    i15 += i7;
                    i16 += i2;
                    i9 += i4;
                    i8 = Math.min(i8, i6);
                    i12 = Math.max(i12, i6);
                    arrayList.add(Integer.valueOf(i6));
                    i10++;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                }
                Integer valueOf = Integer.valueOf(i6);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("seq_play_time_");
                LIZ.append(range);
                map.put(X1D.LIZIZ(LIZ), valueOf);
                Integer valueOf2 = Integer.valueOf(i5);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("seq_skip_");
                LIZ2.append(range);
                map.put(X1D.LIZIZ(LIZ2), valueOf2);
                Integer valueOf3 = Integer.valueOf(i3);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("seq_head_");
                LIZ3.append(range);
                map.put(X1D.LIZIZ(LIZ3), valueOf3);
                Integer valueOf4 = Integer.valueOf(i7);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("seq_comment_");
                LIZ4.append(range);
                map.put(X1D.LIZIZ(LIZ4), valueOf4);
                Integer valueOf5 = Integer.valueOf(i2);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("seq_finish_");
                LIZ5.append(range);
                map.put(X1D.LIZIZ(LIZ5), valueOf5);
                Integer valueOf6 = Integer.valueOf(i4);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("seq_like_");
                LIZ6.append(range);
                map.put(X1D.LIZIZ(LIZ6), valueOf6);
                if (z) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("seq_id_");
                    LIZ7.append(range);
                    String LIZIZ2 = X1D.LIZIZ(LIZ7);
                    Object obj = "";
                    if (next == null || (str3 = next.sequenceId) == null) {
                        str3 = "";
                    }
                    map.put(LIZIZ2, str3);
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("seq_session_id_");
                    LIZ8.append(range);
                    String LIZIZ3 = X1D.LIZIZ(LIZ8);
                    if (next == null || (str4 = next.sessionId) == null) {
                        str4 = "";
                    }
                    map.put(LIZIZ3, str4);
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("seq_begin_time_");
                    LIZ9.append(range);
                    String LIZIZ4 = X1D.LIZIZ(LIZ9);
                    if (next != null) {
                        obj = Long.valueOf(next.beginTime);
                    }
                    map.put(LIZIZ4, obj);
                }
            }
            if (i10 > 0) {
                i = i11 / i10;
            } else {
                i = 0;
            }
            map.put("seq_play_time_avg", Integer.valueOf(i));
            map.put("seq_play_time_max", Integer.valueOf(i12));
            map.put("seq_play_time_min", Integer.valueOf(Math.min(i12, i8)));
            map.put("seq_play_time_total", Integer.valueOf(i11));
            map.put("seq_play_time_mid", Integer.valueOf(C48617J6f.LIZ(arrayList)));
            map.put("seq_skip_cnt", Integer.valueOf(i13));
            map.put("seq_head_cnt", Integer.valueOf(i14));
            map.put("seq_comment_cnt", Integer.valueOf(i15));
            map.put("seq_finish_cnt", Integer.valueOf(i16));
            map.put("seq_like_cnt", Integer.valueOf(i9));
            map.put("sequence_rank", Integer.valueOf(this.LIZJ.sequenceRank));
            map.put("seq_feed_rank", Integer.valueOf(this.LIZJ.feedRank));
        } catch (Throwable unused) {
        }
    }
}
