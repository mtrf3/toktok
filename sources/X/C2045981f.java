package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MultiBitrateAdapterErrorCode;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoSourceFromScene;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.81f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045981f extends AbstractC65781Prl implements InterfaceC88472Yns<C203127y8, C76800UCe> {
    public final /* synthetic */ PhotoViewModelV2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045981f(PhotoViewModelV2 photoViewModelV2) {
        super(1);
        this.LJLIL = photoViewModelV2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C203127y8 c203127y8) {
        String str;
        int i;
        String desc;
        int i2;
        int i3;
        int i4;
        String str2;
        Object next;
        String str3;
        Object next2;
        String str4;
        int i5;
        float f;
        java.util.Map<Integer, SlidesImageLoadParams> map;
        SlidesImageLoadParams slidesImageLoadParams;
        SlidesImageLoadParams slidesImageLoadParams2;
        String str5;
        String str6;
        int code;
        Integer num;
        String str7;
        Integer num2;
        java.util.Map<Integer, SlidesImageLoadParams> map2;
        Integer num3;
        PhotoModeImageInfo photoModeImageInfo;
        C203127y8 state = c203127y8;
        o.LJIIIZ(state, "state");
        PhotoViewModelV2 photoViewModelV2 = this.LJLIL;
        C2045581b c2045581b = photoViewModelV2.LJLL;
        int i6 = state.LJLIL;
        int mv0 = photoViewModelV2.mv0();
        boolean z = state.LJLJL;
        Aweme aweme = this.LJLIL.LL;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (str = photoModeImageInfo.getQualityMap()) == null) {
            str = "";
        }
        c2045581b.getClass();
        if (!c2045581b.LJIIJ) {
            c2045581b.LIZ(i6);
            c2045581b.LJIIIZ = null;
            ((LinkedHashMap) c2045581b.LJII).values().size();
            C2045881e c2045881e = c2045581b.LJIIJJI;
            if (c2045881e != null && (num3 = c2045881e.LIZLLL) != null) {
                i = num3.intValue();
            } else {
                i = 0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = 1;
                if (i7 >= mv0) {
                    break;
                }
                C2045881e c2045881e2 = c2045581b.LJIIJJI;
                if (c2045881e2 != null && (map2 = c2045881e2.LIZIZ) != null) {
                    slidesImageLoadParams2 = (SlidesImageLoadParams) ((LinkedHashMap) map2).get(Integer.valueOf(i7));
                } else {
                    slidesImageLoadParams2 = null;
                }
                String str8 = "-1";
                if (slidesImageLoadParams2 == null || (str5 = slidesImageLoadParams2.resolution) == null) {
                    str5 = "-1";
                }
                arrayList.add(str5);
                if (slidesImageLoadParams2 == null || (num2 = slidesImageLoadParams2.imageSize) == null || (str6 = num2.toString()) == null) {
                    str6 = "-1";
                }
                arrayList2.add(str6);
                if (slidesImageLoadParams2 != null && (str7 = slidesImageLoadParams2.playLadderGear) != null) {
                    str8 = str7;
                }
                arrayList3.add(str8);
                if (slidesImageLoadParams2 == null || !slidesImageLoadParams2.useMultiBitRate) {
                    i9 = 0;
                }
                i8 += i9;
                if (slidesImageLoadParams2 != null && (num = slidesImageLoadParams2.playLadderErrCode) != null) {
                    code = num.intValue();
                } else {
                    code = MultiBitrateAdapterErrorCode.DEFAULT_CODE.getCode();
                }
                arrayList4.add(String.valueOf(code));
                i7++;
            }
            C2045881e c2045881e3 = c2045581b.LJIIJJI;
            if (c2045881e3 == null || (map = c2045881e3.LIZIZ) == null || (slidesImageLoadParams = (SlidesImageLoadParams) ((LinkedHashMap) map).get(0)) == null || (desc = slidesImageLoadParams.sourceFromScene) == null) {
                desc = PhotoSourceFromScene.DEFAULT.getDesc();
            }
            String abstractCollection = arrayList.toString();
            String abstractCollection2 = arrayList2.toString();
            String abstractCollection3 = arrayList4.toString();
            C2045881e c2045881e4 = c2045581b.LJIIJJI;
            if (c2045881e4 != null) {
                i2 = c2045881e4.LIZJ;
            } else {
                i2 = 0;
            }
            String abstractCollection4 = arrayList3.toString();
            C2045881e c2045881e5 = c2045581b.LJIIJJI;
            if (c2045881e5 != null) {
                i3 = c2045881e5.LJ;
                i4 = c2045881e5.LJFF;
            } else {
                i3 = -1;
                i4 = 0;
            }
            C2046081g c2046081g = new C2046081g(i8, i2, i3, i4, abstractCollection, abstractCollection2, abstractCollection3, abstractCollection4, desc);
            c2045581b.LJIIJJI = new C2045881e();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("play_sess", c2045581b.LIZ);
            Aweme aweme2 = c2045581b.LIZJ;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("group_id", str2);
            c188727au.LIZLLL(mv0, "image_cnt");
            c188727au.LIZLLL(((LinkedHashMap) c2045581b.LJII).values().size(), "loaded_image_cnt");
            c188727au.LIZLLL(z ? 1 : 0, "image_loaded");
            Iterator it = ((LinkedHashMap) c2045581b.LJII).values().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    C2047581v c2047581v = (C2047581v) next;
                    int i10 = c2047581v.LIZIZ + c2047581v.LIZ;
                    do {
                        Object next3 = it.next();
                        C2047581v c2047581v2 = (C2047581v) next3;
                        int i11 = c2047581v2.LIZIZ + c2047581v2.LIZ;
                        if (i10 < i11) {
                            next = next3;
                            i10 = i11;
                        }
                    } while (it.hasNext());
                }
            }
            C2047581v c2047581v3 = (C2047581v) next;
            if (c2047581v3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(c2047581v3.LIZ);
                sb.append('x');
                sb.append(c2047581v3.LIZIZ);
                str3 = sb.toString();
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("largest_resolution", str3);
            Iterator it2 = ((LinkedHashMap) c2045581b.LJII).values().iterator();
            if (!it2.hasNext()) {
                next2 = null;
            } else {
                next2 = it2.next();
                if (it2.hasNext()) {
                    C2047581v c2047581v4 = (C2047581v) next2;
                    int i12 = c2047581v4.LIZIZ + c2047581v4.LIZ;
                    do {
                        Object next4 = it2.next();
                        C2047581v c2047581v5 = (C2047581v) next4;
                        int i13 = c2047581v5.LIZIZ + c2047581v5.LIZ;
                        if (i12 > i13) {
                            next2 = next4;
                            i12 = i13;
                        }
                    } while (it2.hasNext());
                }
            }
            C2047581v c2047581v6 = (C2047581v) next2;
            if (c2047581v6 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2047581v6.LIZ);
                sb2.append('x');
                sb2.append(c2047581v6.LIZIZ);
                str4 = sb2.toString();
            } else {
                str4 = null;
            }
            c188727au.LJIIIZ("smallest_resolution", str4);
            boolean z2 = false;
            c188727au.LIZLLL(0, "first_image_preload");
            java.util.Map<Integer, Boolean> map3 = c2045581b.LJIIIIZZ;
            if (map3.isEmpty()) {
                i5 = 0;
            } else {
                Iterator it3 = ((LinkedHashMap) map3).entrySet().iterator();
                i5 = 0;
                while (it3.hasNext()) {
                    if (((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                        i5++;
                    }
                }
            }
            c188727au.LIZLLL(i5, "preload_image_cnt");
            c188727au.LJIIIZ("enter_from", c2045581b.LIZLLL);
            Object obj = ((LinkedHashMap) c2045581b.LJFF).get(Integer.valueOf(i));
            Object obj2 = obj;
            if (obj == null) {
                obj2 = -1L;
            }
            c188727au.LJ(((Number) obj2).longValue(), "first_image_duration");
            c188727au.LJFF(ORZ.LLFZ(((LinkedHashMap) c2045581b.LJFF).values()), "largest_image_duration");
            Collection values = ((LinkedHashMap) c2045581b.LJFF).values();
            float f2 = 0.0f;
            if (!values.isEmpty()) {
                f = (float) ORZ.LJLIL(values);
            } else {
                f = 0.0f;
            }
            c188727au.LIZIZ(Float.valueOf(f).floatValue(), "average_image_duration");
            c188727au.LJIIIZ("resolution_list", c2046081g.LIZ);
            c188727au.LJIIIZ("image_size_list", c2046081g.LIZIZ);
            c188727au.LIZLLL(c2046081g.LIZJ, "play_ladder_cnt");
            c188727au.LJIIIZ("play_ladder_gear", c2046081g.LJFF);
            c188727au.LJIIIZ("play_ladder_errcodec", c2046081g.LIZLLL);
            c188727au.LIZLLL(c2046081g.LJ, "skipped_cnt");
            c188727au.LIZLLL(c2046081g.LJI, "first_frame_duration");
            c188727au.LIZLLL(c2046081g.LJII, "first_frame_renderered");
            Object obj3 = ((LinkedHashMap) c2045581b.LJI).get(Integer.valueOf(i));
            Object obj4 = obj3;
            if (obj3 == null) {
                obj4 = -1L;
            }
            c188727au.LJ(((Number) obj4).longValue(), "first_image_load_duration");
            c188727au.LJFF(ORZ.LLFZ(((LinkedHashMap) c2045581b.LJI).values()), "largest_image_load_duration");
            Collection values2 = ((LinkedHashMap) c2045581b.LJI).values();
            if (!values2.isEmpty()) {
                f2 = (float) ORZ.LJLIL(values2);
            }
            c188727au.LIZIZ(f2, "average_image_load_duration");
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, c2046081g.LJIIIIZZ);
            if (c2045581b.LIZIZ > 0) {
                z2 = true;
            }
            c188727au.LJFF(Boolean.valueOf(z2), "has_black_screen");
            c188727au.LIZLLL(c2045581b.LIZIZ, "black_screen_cnt");
            c188727au.LIZLLL(c2045581b.LJ + 1, "slides_cnt");
            c188727au.LJIIIZ("photomode_image_quality_info", str);
            java.util.Map<String, String> handleImagePlayEndIfNeeded$lambda$8 = c188727au.LIZ;
            o.LJIIIIZZ(handleImagePlayEndIfNeeded$lambda$8, "handleImagePlayEndIfNeeded$lambda$8");
            V2B.LJIJ(handleImagePlayEndIfNeeded$lambda$8);
            FMX.LJIIL("image_play_end", handleImagePlayEndIfNeeded$lambda$8);
            c2045581b.LJIIJ = true;
        }
        return C76800UCe.LIZ;
    }
}
