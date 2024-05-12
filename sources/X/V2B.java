package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DiscountBackInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HighLightPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionDiscountBrief;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionTagStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2B implements InterfaceC48038ItG {
    public static ExecutorService LJLIL = null;
    public static int LJLILLLLZI = 4;
    public static final V2B LJLJI = new V2B();
    public static final char[] LJLJJI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] LJLJJL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static long LIZIZ(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static final void LJIIJJI(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
    }

    public static final boolean LJ() {
        if (Build.VERSION.SDK_INT < 33) {
            return LIZJ(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        return LIZJ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
    }

    public static boolean LJFF() {
        if (LJLILLLLZI <= 3) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(String[] strArr) {
        Context LIZ = C5L7.LIZ();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C04330Ez.LIZ(LIZ, str)));
        }
        for (int i : ORZ.LLJ(arrayList)) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static void LJII(String str) {
        C1JX.LJIIIIZZ("VESDK-", str);
    }

    public static final int LJIIIZ(View view) {
        o.LJIIIZ(view, "<this>");
        if (C68E.LIZ(view.getContext())) {
            return view.getPaddingLeft();
        }
        return view.getPaddingRight();
    }

    public static final int LJIIJ(View view) {
        o.LJIIIZ(view, "<this>");
        if (C68E.LIZ(view.getContext())) {
            return view.getPaddingRight();
        }
        return view.getPaddingLeft();
    }

    public static final boolean LJIIL(CharSequence charSequence) {
        if (((String) charSequence).length() == 0) {
            return false;
        }
        int i = 0;
        while (true) {
            String str = (String) charSequence;
            if (i >= str.length()) {
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt == 0 || charAt == '\t' || charAt == '\n' || charAt == '\r' || (' ' <= charAt && (charAt < 55296 || (57344 <= charAt && (charAt < 65534 || (0 <= charAt && charAt < 0)))))) {
                i++;
            }
        }
        return true;
    }

    public static void LJIILIIL(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException unused) {
                C70657RoD.LJIILL();
            }
        }
    }

    public static final PreviewHintComponent LJIIZILJ(V4L v4l) {
        QuotePreviewTypeComponent quotePreviewTypeComponent;
        QuotePicturePreviewComponent quotePicturePreviewComponent;
        ImageComponent LIZ;
        IconTypeComponent iconTypeComponent;
        TTLComponent tTLComponent;
        RUF sender_preview_text = v4l.sender_preview_text;
        o.LJIIIIZZ(sender_preview_text, "sender_preview_text");
        TextComponent LJJL = C17N.LJJL(sender_preview_text);
        if (LJJL == null) {
            LJJL = new TextComponent("Sender");
        }
        RUF receiver_preview_text = v4l.receiver_preview_text;
        o.LJIIIIZZ(receiver_preview_text, "receiver_preview_text");
        TextComponent LJJL2 = C17N.LJJL(receiver_preview_text);
        if (LJJL2 == null) {
            LJJL2 = new TextComponent("Receiver");
        }
        RUF quote_preview_text = v4l.quote_preview_text;
        o.LJIIIIZZ(quote_preview_text, "quote_preview_text");
        TextComponent LJJL3 = C17N.LJJL(quote_preview_text);
        if (LJJL3 == null) {
            LJJL3 = new TextComponent("Quote");
        }
        V2T v2t = v4l.quote_preview_type;
        int i = 0;
        if (v2t == null) {
            quotePreviewTypeComponent = QuotePreviewTypeComponent.TEXT;
        } else {
            QuotePreviewTypeComponent[] values = QuotePreviewTypeComponent.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    quotePreviewTypeComponent = values[i2];
                    if (quotePreviewTypeComponent.getValue() == v2t.getValue()) {
                        break;
                    }
                    i2++;
                } else {
                    quotePreviewTypeComponent = QuotePreviewTypeComponent.TEXT;
                    break;
                }
            }
        }
        V40 v40 = v4l.quote_picture_preview;
        if (v40 == null) {
            QuotePicturePreviewComponent.Companion.getClass();
            quotePicturePreviewComponent = QuotePicturePreviewComponent.EMPTY_PICTURE_PREVIEW$delegate.getValue();
        } else {
            String str = v40.resource_id;
            Long l = v40.sender_uid;
            C79135V3z c79135V3z = v40.preview_image;
            if (c79135V3z != null) {
                LIZ = C79081V1x.LJJIZ(c79135V3z);
            } else {
                ImageComponent.Companion.getClass();
                LIZ = C79095V2l.LIZ();
            }
            EnumC79091V2h enumC79091V2h = v40.fallback_icon;
            if (enumC79091V2h == null || (iconTypeComponent = C79081V1x.LJJIL(enumC79091V2h)) == null) {
                iconTypeComponent = IconTypeComponent.DEFAULT;
            }
            PreviewIconTypeComponent previewIconTypeComponent = null;
            RU9 ru9 = v40.ttl;
            if (ru9 != null) {
                Long l2 = ru9.expired_at;
                if (l2 == null) {
                    l2 = RU9.DEFAULT_EXPIRED_AT;
                }
                o.LJIIIIZZ(l2, "expired_at ?: TTL.DEFAULT_EXPIRED_AT");
                tTLComponent = new TTLComponent(l2.longValue());
            } else {
                tTLComponent = new TTLComponent(i);
            }
            quotePicturePreviewComponent = new QuotePicturePreviewComponent(str, l, LIZ, iconTypeComponent, previewIconTypeComponent, tTLComponent, 48);
        }
        return new PreviewHintComponent(LJJL, LJJL2, LJJL3, quotePreviewTypeComponent, quotePicturePreviewComponent);
    }

    public static void LJIJ(java.util.Map map) {
        if (C64390POw.LIZIZ.LIZ()) {
            LJIJI(C64386POs.LIZIZ.LIZIZ(null), map);
        }
    }

    public static final C27724AuO LJIJJ(BillInfoData billInfoData) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        PromotionTagStyle promotionTagStyle;
        HighLightPromotionInfo highLightPromotionInfo;
        List<PromotionDiscountBrief> list;
        BonusInfo bonusInfo;
        String str7;
        List<VoucherInfoNew> list2;
        DiscountBackInfo discountBackInfo;
        List<VoucherInfoNew> list3;
        o.LJIIIZ(billInfoData, "<this>");
        ArrayList arrayList = new ArrayList();
        PlatformPromotion platformPromotion = billInfoData.getPlatformPromotion();
        if (platformPromotion != null && (list3 = platformPromotion.voucherSelectedInfo) != null) {
            for (VoucherInfoNew voucherInfoNew : list3) {
                voucherInfoNew.getClass();
                arrayList.add(new C69645RUz(voucherInfoNew.selected, voucherInfoNew.discountText, voucherInfoNew.thresholdText, voucherInfoNew.validTimeText, voucherInfoNew.buttonText, voucherInfoNew.promotionReductionType, voucherInfoNew.daInfo));
            }
        }
        PlatformPromotion platformPromotion2 = billInfoData.getPlatformPromotion();
        if (platformPromotion2 != null && (discountBackInfo = platformPromotion2.discountBack) != null) {
            arrayList.add(new C69645RUz(Boolean.TRUE, discountBackInfo.discountBackTitle, "", discountBackInfo.discountBackDescText, discountBackInfo.buttonText, discountBackInfo.reductionType, discountBackInfo.daInfo));
        }
        PlatformPromotion platformPromotion3 = billInfoData.getPlatformPromotion();
        PromotionBanner promotionBanner = null;
        if (platformPromotion3 != null) {
            str = platformPromotion3.platformDiscount;
        } else {
            str = null;
        }
        PlatformPromotion platformPromotion4 = billInfoData.getPlatformPromotion();
        if (platformPromotion4 != null) {
            str2 = platformPromotion4.orderPromotionCacheKey;
        } else {
            str2 = null;
        }
        PlatformPromotion platformPromotion5 = billInfoData.getPlatformPromotion();
        if (platformPromotion5 != null && (list2 = platformPromotion5.voucherSelectedInfo) != null) {
            Iterator<VoucherInfoNew> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VoucherInfoNew next = it.next();
                Integer num2 = next.costType;
                if (num2 != null && num2.intValue() == 2) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        PlatformPromotion platformPromotion6 = billInfoData.getPlatformPromotion();
        if (platformPromotion6 != null) {
            str3 = platformPromotion6.couponSchema;
        } else {
            str3 = null;
        }
        PlatformPromotion platformPromotion7 = billInfoData.getPlatformPromotion();
        if (platformPromotion7 != null) {
            str4 = platformPromotion7.couponStatus;
        } else {
            str4 = null;
        }
        PlatformPromotion platformPromotion8 = billInfoData.getPlatformPromotion();
        if (platformPromotion8 != null) {
            str5 = platformPromotion8.title;
        } else {
            str5 = null;
        }
        PlatformPromotion platformPromotion9 = billInfoData.getPlatformPromotion();
        if (platformPromotion9 != null) {
            num = platformPromotion9.unusedCouponCount;
        } else {
            num = null;
        }
        PlatformPromotion platformPromotion10 = billInfoData.getPlatformPromotion();
        if (platformPromotion10 != null) {
            str6 = platformPromotion10.promotionTagText;
        } else {
            str6 = null;
        }
        PlatformPromotion platformPromotion11 = billInfoData.getPlatformPromotion();
        if (platformPromotion11 != null) {
            promotionTagStyle = platformPromotion11.promotionTagStyle;
        } else {
            promotionTagStyle = null;
        }
        PlatformPromotion platformPromotion12 = billInfoData.getPlatformPromotion();
        if (platformPromotion12 != null) {
            highLightPromotionInfo = platformPromotion12.highlightPromotion;
        } else {
            highLightPromotionInfo = null;
        }
        PlatformPromotion platformPromotion13 = billInfoData.getPlatformPromotion();
        if (platformPromotion13 != null) {
            list = platformPromotion13.discountBrief;
        } else {
            list = null;
        }
        PlatformPromotion platformPromotion14 = billInfoData.getPlatformPromotion();
        if (platformPromotion14 != null) {
            bonusInfo = platformPromotion14.bonusInfo;
        } else {
            bonusInfo = null;
        }
        PlatformPromotion platformPromotion15 = billInfoData.getPlatformPromotion();
        if (platformPromotion15 != null) {
            str7 = platformPromotion15.daInfo;
        } else {
            str7 = null;
        }
        PlatformPromotion platformPromotion16 = billInfoData.getPlatformPromotion();
        if (platformPromotion16 != null) {
            promotionBanner = platformPromotion16.promotionBanner;
        }
        return new C27724AuO(str, str2, z, str3, arrayList, str4, str5, num, str6, promotionTagStyle, highLightPromotionInfo, list, bonusInfo, str7, promotionBanner);
    }

    public static final boolean[] LJIJJLI(InfoStickerModel infoStickerModel) {
        boolean[] zArr = {false, false};
        if (C78886Uxe.LJJIJ(infoStickerModel.stickers)) {
            return zArr;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel.isImageSticker()) {
                zArr[0] = true;
                if (stickerItemModel.cutout) {
                    zArr[1] = true;
                }
            }
        }
        return zArr;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String response = (String) obj;
        o.LJIIIZ(response, "response");
        return new C73890SzG(response);
    }

    public static void LIZ(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, LIZIZ(j2, j)));
    }

    public static float LJI(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static File LJIIIIZZ(Context context, String str) {
        boolean z;
        if (context != null) {
            String LLLLLLLZIL = C16880lQ.LLLLLLLZIL();
            boolean z2 = false;
            if ("mounted".equals(LLLLLLLZIL) || "mounted_ro".equals(LLLLLLLZIL)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    z2 = "mounted".equals(C16880lQ.LLLLLLLZIL());
                } catch (Exception unused) {
                }
                if (!z2) {
                    return null;
                }
                File LLIIJI = C16880lQ.LLIIJI(context, str);
                if (LLIIJI != null && !LLIIJI.exists()) {
                    LLIIJI.mkdirs();
                }
                return LLIIJI;
            }
            return null;
        }
        return null;
    }

    public static void LJIILJJIL(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C73548Stk.LIZIZ(new IllegalStateException(C61845OOz.LIZ("More produced than requested: ", j3)));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static final String LJIILLIIL(int i, InterfaceC24520xk interfaceC24520xk) {
        String string = C70657RoD.LJJ(interfaceC24520xk).getString(i);
        o.LJIIIIZZ(string, "resources.getString(id)");
        return string;
    }

    public static final void LJIJI(String spanId, java.util.Map map) {
        o.LJIIIZ(spanId, "spanId");
        if (C64390POw.LIZIZ.LIZ() && C65777Prh.LJII(map)) {
            ((HashMap) map).put(PP2.LIZIZ.LIZLLL(), spanId);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (0 != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LJIL(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<X.V2B> r4 = X.V2B.class
            monitor-enter(r4)
            if (r5 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            if (r0 != 0) goto L16
            LJIILIIL(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
        L16:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            r0 = 1
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            r2.write(r6)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2d
            r2.flush()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2d
            r2.close()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L41
            goto L3f
        L26:
            r1 = move-exception
            r2.close()     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L41
            goto L34
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r1 = r2
            goto L37
        L2f:
            r1 = move-exception
            goto L34
        L31:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L41
        L34:
            throw r1     // Catch: java.lang.Throwable -> L41
        L35:
            if (r1 == 0) goto L3f
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L41
            goto L3f
        L3b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r4)
            return
        L41:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V2B.LJIL(java.lang.String, java.lang.String):void");
    }

    public static final void LJIILL(View view, int i, int i2, int i3, int i4) {
        o.LJIIIZ(view, "<this>");
        if (C68E.LIZ(view.getContext())) {
            view.setPadding(i3, i2, i, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }
}
