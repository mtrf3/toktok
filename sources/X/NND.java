package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NND extends C8IM {
    public final C62822Ol8 LJLJJL;
    public Aweme LJLJJLL;
    public AnchorCommonStruct LJLJL;

    private final NNO getAnchorViewImpl() {
        return (NNO) this.LJLJJL.getValue();
    }

    @Override // X.C8IG
    public final void LIZIZ() {
        C42625Go9.LIZJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NND(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(context, 501));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Override // X.C8IM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(X.C188727au r14) {
        /*
            r13 = this;
            X.NNO r1 = r13.getAnchorViewImpl()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r13.LJLJL
            r5 = 0
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.getKeyword()
            java.lang.String r9 = ""
            if (r0 != 0) goto L12
            r0 = r9
        L12:
            r1.setAnchorTitle(r0)
            X.C42625Go9.LIZIZ(r13)
            com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService r6 = com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl.LIZ()
            int r7 = r6.e1()
            java.lang.String r11 = r6.getEnterMethod()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.LJLJJLL
            java.lang.String r4 = "aweme"
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r0.getPhotoModeImageInfo()
            if (r0 == 0) goto L8b
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L8b
            int r8 = r0.size()
        L3a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.LJLJJLL
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
            r2 = 1
            if (r3 == 0) goto L89
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct r0 = r3.getPhotoCarouselInfo()
            if (r0 == 0) goto L66
            java.util.List r1 = r0.getProductList()
            if (r1 == 0) goto L66
            int r0 = r1.size()
            if (r0 <= r7) goto L66
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r7)
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct r0 = (com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct) r0
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.getProductId()
            if (r0 == 0) goto L66
            r9 = r0
        L66:
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct r0 = r3.getPhotoCarouselInfo()
            if (r0 == 0) goto L89
            int r10 = r0.getProductCount()
        L70:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.LJLJJLL
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r0.getAwemeRawAd()
            r6.o1(r7, r8, r9, r10, r11, r12)
            int r7 = r7 + 1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.LJLJJLL
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r0.getAwemeRawAd()
            r6.s1(r7, r8, r9, r10, r11, r12)
            return r2
        L89:
            r10 = 0
            goto L70
        L8b:
            r8 = 0
            goto L3a
        L8d:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L91:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L95:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L99:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L9d:
            java.lang.String r0 = "anchor"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NND.LJII(X.7au):boolean");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAnchorTitleChangeEvent(C2046781n event) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        int i;
        int i2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        Aweme aweme = this.LJLJJLL;
        if (aweme != null) {
            if (!o.LJ(str, aweme.getAid())) {
                return;
            }
            IAdPhotoModeService LIZ = AdPhotoModeServiceImpl.LIZ();
            int e1 = LIZ.e1();
            String enterMethod = LIZ.getEnterMethod();
            Aweme aweme2 = this.LJLJJLL;
            if (aweme2 != null) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && productList.size() > e1 && (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList, e1)) != null) {
                    String anchorTitle = photoCarouselProductStruct.getAnchorTitle();
                    if ((!TextUtils.isEmpty(anchorTitle)) && anchorTitle != null) {
                        getAnchorViewImpl().setAnchorTitle(anchorTitle);
                    }
                    Aweme aweme3 = this.LJLJJLL;
                    if (aweme3 != null) {
                        PhotoModeImageInfo photoModeImageInfo = aweme3.getPhotoModeImageInfo();
                        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                            i = imageList.size();
                        } else {
                            i = 0;
                        }
                        String productId = photoCarouselProductStruct.getProductId();
                        Aweme aweme4 = this.LJLJJLL;
                        if (aweme4 != null) {
                            AwemeRawAd awemeRawAd2 = aweme4.getAwemeRawAd();
                            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null) {
                                i2 = photoCarouselInfo2.getProductCount();
                            } else {
                                i2 = 0;
                            }
                            int i3 = e1 + 1;
                            Aweme aweme5 = this.LJLJJLL;
                            if (aweme5 != null) {
                                LIZ.s1(i3, i, productId, i2, enterMethod, aweme5.getAwemeRawAd());
                                return;
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                        o.LJIJI("aweme");
                        throw null;
                    }
                    o.LJIJI("aweme");
                    throw null;
                }
                return;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        String str;
        int i;
        Long l;
        long longValue;
        String str2;
        int i2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoModeImageUrlModel> imageList;
        Long groupId;
        o.LJIIIZ(useCustomAction, "useCustomAction");
        IAdPhotoModeService LIZ = AdPhotoModeServiceImpl.LIZ();
        int e1 = LIZ.e1();
        String enterMethod = LIZ.getEnterMethod();
        Aweme aweme = this.LJLJJLL;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
                int i3 = 0;
                if (productList.size() > e1 && (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList, e1)) != null) {
                    Aweme aweme2 = this.LJLJJLL;
                    if (aweme2 != null) {
                        AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                        NNS nns = new NNS();
                        nns.LJIIL(photoCarouselProductStruct.getWebUrl());
                        if (awemeRawAd2 != null) {
                            str = awemeRawAd2.getWebTitle();
                        } else {
                            str = null;
                        }
                        nns.LJIIJJI(str);
                        if (awemeRawAd2 != null) {
                            i = awemeRawAd2.getWebviewType();
                        } else {
                            i = 0;
                        }
                        nns.LIZ.LIZIZ.LJIJ = i;
                        if (awemeRawAd2 != null) {
                            l = awemeRawAd2.getCreativeId();
                        } else {
                            l = null;
                        }
                        long j = 0;
                        if (l == null) {
                            longValue = 0;
                        } else {
                            longValue = l.longValue();
                        }
                        nns.LIZJ(longValue);
                        nns.LIZIZ(awemeRawAd2);
                        nns.LJIIJ("draw_ad");
                        if (awemeRawAd2 != null) {
                            str2 = awemeRawAd2.getLogExtra();
                        } else {
                            str2 = null;
                        }
                        nns.LJFF(str2);
                        if (awemeRawAd2 != null && (groupId = awemeRawAd2.getGroupId()) != null) {
                            j = groupId.longValue();
                        }
                        nns.LJ(j);
                        NNR nnr = nns.LIZ;
                        Context context = getContext();
                        o.LJIIIIZZ(context, "context");
                        NNC.LIZ(context, nnr).LIZ();
                        Aweme aweme3 = this.LJLJJLL;
                        if (aweme3 != null) {
                            PhotoModeImageInfo photoModeImageInfo = aweme3.getPhotoModeImageInfo();
                            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                                i2 = imageList.size();
                            } else {
                                i2 = 0;
                            }
                            String productId = photoCarouselProductStruct.getProductId();
                            Aweme aweme4 = this.LJLJJLL;
                            if (aweme4 != null) {
                                AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                                if (awemeRawAd3 != null && (photoCarouselInfo2 = awemeRawAd3.getPhotoCarouselInfo()) != null) {
                                    i3 = photoCarouselInfo2.getProductCount();
                                }
                                Aweme aweme5 = this.LJLJJLL;
                                if (aweme5 != null) {
                                    LIZ.j1(e1, i2, productId, i3, enterMethod, aweme5.getAwemeRawAd());
                                    return;
                                } else {
                                    o.LJIJI("aweme");
                                    throw null;
                                }
                            }
                            o.LJIJI("aweme");
                            throw null;
                        }
                        o.LJIJI("aweme");
                        throw null;
                    }
                    o.LJIJI("aweme");
                    throw null;
                }
                return;
            }
            return;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        NNO anchorViewImpl = getAnchorViewImpl();
        anchorViewImpl.LIZ(this);
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        anchorViewImpl.setAnchorTitle(keyword);
        anchorViewImpl.setAnchorImg(anchorCommonStruct.getIcon());
        this.LJLJJLL = interfaceC44105HSr.LJJLL();
        this.LJLJL = anchorCommonStruct;
    }
}
