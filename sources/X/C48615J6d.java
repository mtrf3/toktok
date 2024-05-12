package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureAdPlayTypeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.J6d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48615J6d extends J6W {
    public static final /* synthetic */ int LIZJ = 0;
    public final FR6<C48618J6g> LIZIZ = new FR6<>("f_ad_play", 48);

    public final void LIZ(java.util.Map map, FeatureAdPlayTypeConfig featureAdPlayTypeConfig, C47322Ihi c47322Ihi, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        Aweme LJIL;
        if (!featureAdPlayTypeConfig.getEnable() || featureAdPlayTypeConfig.getRange() <= 0) {
            return;
        }
        String str2 = null;
        if (c47322Ihi != null && (LJIL = C78880UxY.LJIL(c47322Ihi)) != null) {
            str2 = LJIL.getAid();
        }
        try {
            ArrayList<C48618J6g> LIZIZ = this.LIZIZ.LIZIZ(featureAdPlayTypeConfig.getRange(), str2, featureAdPlayTypeConfig.getRangeExcludeThis());
            if (LIZIZ == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int range = featureAdPlayTypeConfig.getRange();
            Iterator<C48618J6g> it = LIZIZ.iterator();
            int i13 = Integer.MAX_VALUE;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (it.hasNext()) {
                C48618J6g next = it.next();
                range--;
                if (next != null) {
                    i29 += next.LIZIZ.get();
                    i14 += next.LIZLLL.get();
                    i27 += next.LJI.get();
                    i26 += next.LJFF.get();
                    i25 += next.LJII.get();
                    i24 += next.LJIIIZ.get();
                    i23 += next.LJIIJ.get();
                    i22 += next.LJIIJJI.get();
                    i21 += next.LJIIL.get();
                    i20 += next.LJIILIIL.get();
                    i2 = next.LJ.get();
                    i15 += i2;
                    i5 = next.LIZJ.get();
                    i28 += i5;
                    i4 = (int) next.LJIIIIZZ.get();
                    i18 += i4;
                    i13 = Math.min(i13, i4);
                    i16 = Math.max(i16, i4);
                    arrayList.add(Integer.valueOf(i4));
                    i17++;
                    if (i4 < 2000) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    i19 += i12;
                    i6 = next.LJIIZILJ;
                    i7 = next.LJIJ;
                    i8 = next.LJIJI;
                    i9 = next.LJIJJ;
                    i10 = next.LJIJJLI;
                    i11 = next.LJIL;
                    i3 = next.LJJ;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                }
                Integer valueOf = Integer.valueOf(i4);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("a_play_time_");
                LIZ.append(range);
                map.put(X1D.LIZIZ(LIZ), valueOf);
                Integer valueOf2 = Integer.valueOf(i12);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("a_skip_");
                LIZ2.append(range);
                map.put(X1D.LIZIZ(LIZ2), valueOf2);
                Integer valueOf3 = Integer.valueOf(i2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("a_head_");
                LIZ3.append(range);
                map.put(X1D.LIZIZ(LIZ3), valueOf3);
                Integer valueOf4 = Integer.valueOf(i5);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("a_comment_");
                LIZ4.append(range);
                map.put(X1D.LIZIZ(LIZ4), valueOf4);
                Integer valueOf5 = Integer.valueOf(i7);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("a_p_comment_");
                LIZ5.append(range);
                map.put(X1D.LIZIZ(LIZ5), valueOf5);
                Integer valueOf6 = Integer.valueOf(i6);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("a_p_duration_");
                LIZ6.append(range);
                map.put(X1D.LIZIZ(LIZ6), valueOf6);
                Integer valueOf7 = Integer.valueOf(i8);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("a_p_like_");
                LIZ7.append(range);
                map.put(X1D.LIZIZ(LIZ7), valueOf7);
                Integer valueOf8 = Integer.valueOf(i9);
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("a_p_share_");
                LIZ8.append(range);
                map.put(X1D.LIZIZ(LIZ8), valueOf8);
                Integer valueOf9 = Integer.valueOf(i10);
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("a_p_play_");
                LIZ9.append(range);
                map.put(X1D.LIZIZ(LIZ9), valueOf9);
                Integer valueOf10 = Integer.valueOf(i11);
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("a_p_download_");
                LIZ10.append(range);
                map.put(X1D.LIZIZ(LIZ10), valueOf10);
                Integer valueOf11 = Integer.valueOf(i3);
                StringBuilder LIZ11 = X1D.LIZ();
                LIZ11.append("a_p_forward_");
                LIZ11.append(range);
                map.put(X1D.LIZIZ(LIZ11), valueOf11);
                if (z) {
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("a_aid_");
                    LIZ12.append(range);
                    String LIZIZ2 = X1D.LIZIZ(LIZ12);
                    if (next == null || (str = next.LIZ) == null) {
                        str = "";
                    }
                    map.put(LIZIZ2, str);
                }
            }
            map.put("a_finish_cnt", Integer.valueOf(i14));
            map.put("a_head_cnt", Integer.valueOf(i15));
            map.put("a_comment_cnt", Integer.valueOf(i28));
            map.put("a_like_cnt", Integer.valueOf(i29));
            map.put("a_dislike_cnt", Integer.valueOf(i24));
            map.put("a_follow_cnt", Integer.valueOf(i26));
            map.put("a_music_cnt", Integer.valueOf(i27));
            map.put("a_share_cnt", Integer.valueOf(i25));
            map.put("a_skip_cnt", Integer.valueOf(i19));
            map.put("a_click_pause_cnt", Integer.valueOf(i23));
            map.put("a_favourite_cnt", Integer.valueOf(i22));
            map.put("a_enter_tag_cnt", Integer.valueOf(i21));
            map.put("a_clk_poi_cnt", Integer.valueOf(i20));
            if (i17 > 0) {
                i = i18 / i17;
            } else {
                i = 0;
            }
            map.put("a_play_time_avg", Integer.valueOf(i));
            map.put("a_play_time_max", Integer.valueOf(i16));
            map.put("a_play_time_min", Integer.valueOf(Math.min(i16, i13)));
            map.put("a_play_time_total", Integer.valueOf(i18));
            map.put("a_play_time_mid", Integer.valueOf(C48617J6f.LIZ(arrayList)));
        } catch (Throwable unused) {
        }
    }
}
