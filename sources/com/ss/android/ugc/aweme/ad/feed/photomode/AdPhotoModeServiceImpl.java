package com.ss.android.ugc.aweme.ad.feed.photomode;

import X.C188727au;
import X.C1DJ;
import X.C55096Ljo;
import X.C58096Mr6;
import X.C58655N0h;
import X.C58704N2e;
import X.C59250NNe;
import X.C63081OpJ;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.N5N;
import X.NNB;
import X.NNE;
import X.NNF;
import X.NNG;
import X.NNI;
import X.NNK;
import X.NNR;
import X.NNS;
import X.NOM;
import X.O8Y;
import X.ORZ;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdPhotoModeServiceImpl implements IAdPhotoModeService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void reset() {
        NNB.LIZIZ = null;
        NNB.LIZJ = null;
        NNB.LIZLLL = null;
        NNB.LJ = 0;
        NNB.LJFF = 0;
        NNB.LJI = "auto";
        NNB.LJII = 0L;
        NNB.LJIIIIZZ = 0L;
        NNB.LJIIIZ = 0L;
    }

    public static IAdPhotoModeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAdPhotoModeService.class, false);
        if (LIZ != null) {
            return (IAdPhotoModeService) LIZ;
        }
        if (C58096Mr6.LJZ == null) {
            synchronized (IAdPhotoModeService.class) {
                if (C58096Mr6.LJZ == null) {
                    C58096Mr6.LJZ = new AdPhotoModeServiceImpl();
                }
            }
        }
        return C58096Mr6.LJZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean d1() {
        return NNB.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final int e1() {
        return NNB.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final String getEnterMethod() {
        return NNB.LJI;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final long k1() {
        return NNB.LJII;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void Z0(String str) {
        NNB.LJI = str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void a1(int i) {
        NNB.LJFF = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
        L2:
            return
        L3:
            boolean r0 = r8.isAd()
            if (r0 != 0) goto La
            goto L2
        La:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            r3 = 0
            if (r0 == 0) goto Lc5
            java.lang.Long r0 = r0.getCreativeId()
        L15:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            if (r0 == 0) goto Lc2
            java.lang.String r2 = r0.getLogExtra()
        L23:
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "otherclick"
            X.N0h r2 = X.C58704N2e.LJ(r1, r0, r4, r2, r3)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "sponsored"
            r2.LIZJ(r0, r1)
            boolean r0 = X.C63081OpJ.LJZL(r8)
            if (r0 == 0) goto Lb9
            int r6 = X.NNB.LJFF
            int r0 = r6 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "image_location"
            r2.LIZIZ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r8.getPhotoModeImageInfo()
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r8.getPhotoModeImageInfo()
            if (r0 == 0) goto Lc0
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r8.getPhotoModeImageInfo()
            if (r0 == 0) goto Lbe
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto Lbe
            int r0 = r0.size()
        L67:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L6b:
            java.lang.String r0 = "image_cnt"
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = X.NNB.LJI
            r2.LIZIZ(r0, r1)
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = X.NNB.LJII
            long r4 = r4 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "first_slide_duration"
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "image_show_count"
            java.lang.Integer r0 = X.NNB.LIZIZ(r6)
            r2.LIZIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r8.getPhotoModeImageInfo()
            if (r0 == 0) goto Lb9
            java.util.List r1 = r0.getImageList()
            if (r1 == 0) goto Lb9
            if (r6 < 0) goto Lb9
            int r0 = r1.size()
            if (r6 >= r0) goto Lb9
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDisplayImageNoWatermark()
            if (r0 == 0) goto Lb4
            java.lang.String r3 = r0.getUri()
        Lb4:
            java.lang.String r0 = "image_id"
            r2.LIZIZ(r3, r0)
        Lb9:
            r2.LJI()
            goto L2
        Lbe:
            r1 = r3
            goto L6b
        Lc0:
            r0 = 0
            goto L67
        Lc2:
            r2 = r3
            goto L23
        Lc5:
            r0 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl.c1(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final Integer i1(int i) {
        return NNB.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void m1(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        NNB.LIZ = vScope;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void n1(long j) {
        List<Long> list;
        int i;
        NNB.LJIIIIZZ = (j - NNB.LJIIIZ) + NNB.LJIIIIZZ;
        List<Long> list2 = NNB.LIZLLL;
        if (list2 == null || (list = NNB.LIZJ) == null || (i = NNB.LJFF) < 0 || i >= list2.size() || i >= list.size()) {
            return;
        }
        ListProtector.set(list2, i, Long.valueOf((j - ((Number) ListProtector.get(list, i)).longValue()) + ((Number) ListProtector.get(list2, i)).longValue()));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void t1(Aweme aweme) {
        Long l;
        String str;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel displayImageNoWatermark;
        List<PhotoModeImageUrlModel> imageList2;
        if (aweme == null || !aweme.isAd()) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str2 = null;
        if (awemeRawAd != null) {
            l = awemeRawAd.getCreativeId();
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getLogExtra();
        } else {
            str = null;
        }
        C58655N0h LJ = C58704N2e.LJ("draw_ad", "otherclick", valueOf, str, null);
        LJ.LIZJ("sponsored", "refer");
        if (C63081OpJ.LJZL(aweme)) {
            int i2 = NNB.LJFF;
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                i = imageList2.size();
            } else {
                i = 0;
            }
            LJ.LIZIZ(Integer.valueOf(i2 + 1), "image_location");
            LJ.LIZIZ(Integer.valueOf(i), "image_cnt");
            LJ.LIZIZ(NNB.LJI, "enter_method");
            LJ.LIZIZ(NNB.LIZIZ(i2), "image_show_count");
            LJ.LIZIZ(Long.valueOf(System.currentTimeMillis() - NNB.LJII), "first_slide_duration");
            if (aweme.getPhotoModeImageInfo() != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.getImageList() != null && i2 >= 0 && i2 < i) {
                PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo3 != null && (imageList = photoModeImageInfo3.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, i2)) != null && (displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark()) != null) {
                    str2 = displayImageNoWatermark.getUri();
                }
                LJ.LIZIZ(str2, "image_id");
            }
        }
        LJ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void w1(Aweme aweme) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && photoCarouselInfo.getDynamicCarouselFirstIndex() != null) {
            photoCarouselInfo.setDynamicCarouselLastIndex(Integer.valueOf(NNB.LJFF));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final int y1(Aweme aweme) {
        int i;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer dynamicCarouselLastIndex;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        Integer dynamicCarouselFirstIndex;
        C188727au c188727au = new C188727au();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo2 = awemeRawAd.getPhotoCarouselInfo()) != null && (dynamicCarouselFirstIndex = photoCarouselInfo2.getDynamicCarouselFirstIndex()) != null) {
            i = dynamicCarouselFirstIndex.intValue();
        } else {
            i = -1;
        }
        c188727au.LIZLLL(i, "first_index");
        FMX.LJIIL("dynamic_carousel_state", c188727au.LIZ);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 == null || (photoCarouselInfo = awemeRawAd2.getPhotoCarouselInfo()) == null || photoCarouselInfo.getDynamicCarouselFirstIndex() == null) {
            return 0;
        }
        if (photoCarouselInfo.getDynamicCarouselLastIndex() == null) {
            dynamicCarouselLastIndex = photoCarouselInfo.getDynamicCarouselFirstIndex();
        } else {
            dynamicCarouselLastIndex = photoCarouselInfo.getDynamicCarouselLastIndex();
        }
        if (dynamicCarouselLastIndex == null) {
            return 0;
        }
        return dynamicCarouselLastIndex.intValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void u1(int i, Aweme aweme) {
        g1(y1(aweme) + 1, i, aweme, "auto");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void f1(boolean z, long j, Integer num) {
        int i;
        if (z) {
            NNB.LJII = j;
        }
        NNB.LJIIIZ = j;
        if (num != null) {
            int intValue = num.intValue();
            NNB.LJ = intValue;
            ArrayList arrayList = new ArrayList(intValue);
            for (int i2 = 0; i2 < intValue; i2++) {
                arrayList.add(0);
            }
            NNB.LIZIZ = arrayList;
            ArrayList arrayList2 = new ArrayList(intValue);
            for (int i3 = 0; i3 < intValue; i3++) {
                arrayList2.add(0L);
            }
            NNB.LIZJ = arrayList2;
            ArrayList arrayList3 = new ArrayList(intValue);
            for (int i4 = 0; i4 < intValue; i4++) {
                arrayList3.add(0L);
            }
            NNB.LIZLLL = arrayList3;
            List<Long> list = NNB.LIZJ;
            if (list != null) {
                ListProtector.set(list, 0, Long.valueOf(j));
            }
        }
        List<Long> list2 = NNB.LIZJ;
        if (list2 == null || (i = NNB.LJFF) < 0 || i >= list2.size()) {
            return;
        }
        ListProtector.set(list2, i, Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void h1(int i, long j, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "stay_duration", awemeRawAd);
        LIZLLL.LIZJ("image", "refer");
        LIZLLL.LIZIZ(Long.valueOf((NNB.LJIIIIZZ + j) - NNB.LJIIIZ), "duration");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_cnt");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean l1(int i, Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        boolean z;
        String str;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        NativeSiteConfig nativeSiteConfig;
        Long l;
        long longValue;
        long j;
        String str2;
        int i2;
        String str3;
        Long groupId;
        Long creativeId;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) ORZ.LJLLLLLL(i, productList)) == null) {
            return false;
        }
        String nativeSiteCustomData = photoCarouselProductStruct.getNativeSiteCustomData();
        if (nativeSiteCustomData == null || nativeSiteCustomData.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = photoCarouselProductStruct.getWebUrl();
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (nativeSiteConfig = photoCarouselInfo2.getNativeSiteConfig()) != null) {
                str = nativeSiteConfig.getLynxScheme();
            } else {
                str = null;
            }
        }
        NNS nns = new NNS();
        nns.LJIIL(str);
        nns.LIZIZ(aweme.getAwemeRawAd());
        nns.LIZ.LIZ.LJIIIIZZ = aweme.getAid();
        nns.LJIIJ("draw_ad");
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            l = awemeRawAd3.getAdId();
        } else {
            l = null;
        }
        long j2 = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        nns.LIZ.LIZ.LIZIZ = longValue;
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 == null || (creativeId = awemeRawAd4.getCreativeId()) == null) {
            j = 0;
        } else {
            j = creativeId.longValue();
        }
        nns.LIZJ(j);
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            str2 = awemeRawAd5.getLogExtra();
        } else {
            str2 = null;
        }
        nns.LJFF(str2);
        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
        if (awemeRawAd6 != null && (groupId = awemeRawAd6.getGroupId()) != null) {
            j2 = groupId.longValue();
        }
        nns.LJ(j2);
        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
        if (awemeRawAd7 != null) {
            i2 = awemeRawAd7.getWebviewType();
        } else {
            i2 = 0;
        }
        NOM nom = nns.LIZ.LIZIZ;
        nom.LJIJ = i2;
        nom.LJJIIZI = false;
        nns.LJIIJJI(photoCarouselProductStruct.getAnchorTitle());
        AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
        if (awemeRawAd8 != null) {
            str3 = awemeRawAd8.getNativeSiteAdInfo();
        } else {
            str3 = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        nns.LJI(str3);
        String nativeSiteCustomData2 = photoCarouselProductStruct.getNativeSiteCustomData();
        if (nativeSiteCustomData2 != null) {
            str4 = nativeSiteCustomData2;
        }
        nns.LJII(str4);
        NNR params = nns.LIZ;
        o.LJIIIZ(params, "params");
        NNE nne = new NNE();
        nne.LIZIZ(params);
        NNF nnf = nne.LIZ;
        nnf.getClass();
        nnf.LIZ = context;
        nne.LIZ(new NNI());
        nne.LIZ(new NNK());
        nne.LIZ(new C59250NNe());
        nne.LIZ(NNG.LIZIZ.LJFF(null));
        return nne.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean p1(int i, Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        Long l;
        long longValue;
        long j;
        Long groupId;
        Long creativeId;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) ORZ.LJLLLLLL(i, productList)) == null) {
            return false;
        }
        String openUrl = photoCarouselProductStruct.getOpenUrl();
        if (openUrl.length() > 0) {
            String str = null;
            if (1 != 0) {
                NNS nns = new NNS();
                nns.LJIIIIZZ(openUrl);
                nns.LIZIZ(aweme.getAwemeRawAd());
                nns.LIZ.LIZ.LJIIIIZZ = aweme.getAid();
                nns.LJIIJ("draw_ad");
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l = awemeRawAd2.getAdId();
                } else {
                    l = null;
                }
                long j2 = 0;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                nns.LIZ.LIZ.LIZIZ = longValue;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 == null || (creativeId = awemeRawAd3.getCreativeId()) == null) {
                    j = 0;
                } else {
                    j = creativeId.longValue();
                }
                nns.LIZJ(j);
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null) {
                    str = awemeRawAd4.getLogExtra();
                }
                nns.LJFF(str);
                AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                if (awemeRawAd5 != null && (groupId = awemeRawAd5.getGroupId()) != null) {
                    j2 = groupId.longValue();
                }
                nns.LJ(j2);
                NNR params = nns.LIZ;
                o.LJIIIZ(params, "params");
                NNE nne = new NNE();
                nne.LIZIZ(params);
                NNF nnf = nne.LIZ;
                nnf.getClass();
                nnf.LIZ = context;
                nne.LIZ(new NNI());
                nne.LIZ(new N5N(context));
                nne.LIZ(new C59250NNe());
                nne.LIZ(NNG.LIZIZ.LJFF(new AqS176S0100000_10(params, 238)));
                return nne.LIZ.LIZ();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void r1(int i, int i2, Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        String str;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
        LIZLLL.LIZJ("image", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i >= 0 && i < imageList.size()) {
            UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i)).getDisplayImageNoWatermark();
            if (displayImageNoWatermark != null) {
                str = displayImageNoWatermark.getUri();
            } else {
                str = null;
            }
            LIZLLL.LIZIZ(str, "image_id");
        }
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void g1(int i, int i2, Aweme aweme, String str) {
        List<PhotoModeImageUrlModel> imageList;
        String str2;
        int i3 = i - 1;
        List<Integer> list = NNB.LIZIZ;
        if (list != null && i3 >= 0 && i3 < list.size()) {
            ListProtector.set(list, i3, Integer.valueOf(((Number) ListProtector.get(list, i3)).intValue() + 1));
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
        LIZLLL.LIZJ("image", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(str, "enter_method");
        LIZLLL.LIZIZ(NNB.LIZIZ(i3), "image_show_count");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i3 >= 0 && i3 < imageList.size()) {
            UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i3)).getDisplayImageNoWatermark();
            if (displayImageNoWatermark != null) {
                str2 = displayImageNoWatermark.getUri();
            } else {
                str2 = null;
            }
            LIZLLL.LIZIZ(str2, "image_id");
        }
        LIZLLL.LJI();
        long currentTimeMillis = System.currentTimeMillis();
        List<Long> list2 = NNB.LIZJ;
        if (list2 == null || i3 < 0 || i3 >= list2.size()) {
            return;
        }
        ListProtector.set(list2, i3, Long.valueOf(currentTimeMillis));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void q1(int i, int i2, Aweme aweme, String str, String str2) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        IMidAdCellAbility iMidAdCellAbility;
        Integer LIZ;
        int intValue;
        List<Long> list;
        List<Long> list2;
        Long valueOf;
        List<PhotoModeImageUrlModel> imageList;
        String str3;
        List<PhotoModeImageUrlModel> imageList2;
        String str4;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        LIZLLL.LIZJ("slide_image", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(str, "enter_method");
        LIZLLL.LIZIZ(str2, "action_type");
        LIZLLL.LIZIZ(NNB.LIZIZ(i), "image_show_count");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null && i >= 0 && i < imageList2.size()) {
            UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList2, i)).getDisplayImageNoWatermark();
            if (displayImageNoWatermark != null) {
                str4 = displayImageNoWatermark.getUri();
            } else {
                str4 = null;
            }
            LIZLLL.LIZIZ(str4, "image_id");
        }
        LIZLLL.LJI();
        if (i >= 0 && i < NNB.LJ && (LIZ = NNB.LIZ(i, str2)) != null && (intValue = LIZ.intValue()) >= 0 && intValue < NNB.LJ && (list = NNB.LIZLLL) != null && (list2 = NNB.LIZJ) != null) {
            if (((Number) ListProtector.get(list2, intValue)).longValue() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(((Number) ListProtector.get(list, intValue)).longValue() + (System.currentTimeMillis() - ((Number) ListProtector.get(list2, intValue)).longValue()));
            }
            ListProtector.set(list, intValue, 0L);
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "stay_duration", aweme.getAwemeRawAd());
                LIZLLL2.LIZJ("single_image", "refer");
                LIZLLL2.LIZIZ(Long.valueOf(longValue), "duration");
                Integer LIZ2 = NNB.LIZ(i, str2);
                if (LIZ2 != null) {
                    LIZLLL2.LIZIZ(Integer.valueOf(LIZ2.intValue() + 1), "image_location");
                }
                LIZLLL2.LIZIZ(str, "enter_method");
                LIZLLL2.LIZIZ(NNB.LIZIZ(i), "image_show_count");
                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && i >= 0 && i < imageList.size()) {
                    UrlModel displayImageNoWatermark2 = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i)).getDisplayImageNoWatermark();
                    if (displayImageNoWatermark2 != null) {
                        str3 = displayImageNoWatermark2.getUri();
                    } else {
                        str3 = null;
                    }
                    LIZLLL2.LIZIZ(str3, "image_id");
                }
                LIZLLL2.LJI();
            }
        }
        if (C1DJ.LJJ(aweme) && i == 0 && TextUtils.equals(str, "auto") && (interfaceC55235Lm3 = NNB.LIZ) != null && (iMidAdCellAbility = (IMidAdCellAbility) C55096Ljo.LIZ(interfaceC55235Lm3, IMidAdCellAbility.class, null)) != null) {
            iMidAdCellAbility.LJJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void v1(int i, int i2, String str, long j, Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        String str2;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "pinch", aweme.getAwemeRawAd());
        LIZLLL.LIZJ("image", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(NNB.LJI, "enter_method");
        LIZLLL.LIZIZ(Long.valueOf(j), "pinch_duration");
        LIZLLL.LIZIZ(NNB.LIZIZ(i), "image_show_count");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i >= 0 && i < imageList.size()) {
            UrlModel displayImageNoWatermark = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i)).getDisplayImageNoWatermark();
            if (displayImageNoWatermark != null) {
                str2 = displayImageNoWatermark.getUri();
            } else {
                str2 = null;
            }
            LIZLLL.LIZIZ(str2, "image_id");
        }
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void b1(int i, int i2, String str, int i3, String enterMethod, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("carousel_label_product", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(enterMethod, "enter_method");
        LIZLLL.LIZIZ(str, "product_id");
        LIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void j1(int i, int i2, String productId, int i3, String enterMethod, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(enterMethod, "enterMethod");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "click", awemeRawAd);
        LIZLLL.LIZJ("anchor", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(enterMethod, "enter_method");
        LIZLLL.LIZIZ(productId, "product_id");
        LIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        LIZLLL.LJI();
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AqS192S0100000_10(awemeRawAd, 6);
            O8Y.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void o1(int i, int i2, String str, int i3, String enterMethod, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("anchor", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(enterMethod, "enter_method");
        LIZLLL.LIZIZ(str, "product_id");
        LIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void s1(int i, int i2, String productId, int i3, String enterMethod, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(enterMethod, "enterMethod");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("anchor_product", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(enterMethod, "enter_method");
        LIZLLL.LIZIZ(productId, "product_id");
        LIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void x1(int i, int i2, String str, int i3, String enterMethod, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        LIZLLL.LIZJ("carousel_label_product", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        LIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        LIZLLL.LIZIZ(enterMethod, "enter_method");
        LIZLLL.LIZIZ(str, "product_id");
        LIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        LIZLLL.LJI();
    }
}
