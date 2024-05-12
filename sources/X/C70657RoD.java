package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.benchmark.inject.InjectABMockConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLiveLogOpt;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.ies.abmock.debugtool.mock.MockComponentRegister;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECImageService;
import com.ss.android.ugc.aweme.ecommerce.image.IECImageService;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.RoD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70657RoD {
    public static C40627Fx1 LIZ;
    public static InjectABMockConfig LIZIZ;

    public void LIZLLL(C37904EuC c37904EuC, C37955Ev1 c37955Ev1) {
        throw null;
    }

    public static void LJIILL() {
        HybridMonitor.getInstance().getExceptionHandler();
    }

    public static final Q2J LJFF(int i) {
        if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 0:
                    return Q2J.NULL;
                case 1:
                    return Q2J.BOOL;
                case 2:
                    return Q2J.INT;
                case 3:
                    return Q2J.LONG;
                case 4:
                    return Q2J.FLOAT;
                case 5:
                    return Q2J.DOUBLE;
                case 6:
                    return Q2J.CHAR;
                case 7:
                    return Q2J.STRING;
                case 8:
                    return Q2J.COLLECTION;
                default:
                    return Q2J.UNSUPPORTED;
            }
        }
        return Q2J.UNSUPPORTED;
    }

    public static Object LJIIJ(String str) {
        if (LIZ == null) {
            return null;
        }
        try {
            FI3 configMock = MockComponentRegister.getConfigMock(LIZIZ.getHostId());
            if (configMock == null) {
                return null;
            }
            return configMock.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Fragment LJIILIIL(Activity activity) {
        KMV kmv;
        Fragment rootFragment;
        o.LJIIIZ(activity, "<this>");
        if (!(activity instanceof KMV) || (kmv = (KMV) activity) == null || (rootFragment = kmv.getRootFragment()) == null) {
            return null;
        }
        return rootFragment;
    }

    public static final Resources LJJ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJIILLIIL(C04Q.LIZ);
        Resources resources = ((Context) interfaceC24520xk.LJIILLIIL(C04Q.LIZJ)).getResources();
        o.LJIIIIZZ(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final C112974c1 LJJII(PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent) {
        o.LJIIIZ(pictureCardFallbackInfoComponent, "<this>");
        PictureCardFallbackInfoComponent.Companion.getClass();
        if (o.LJ(pictureCardFallbackInfoComponent, PictureCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            return null;
        }
        return new C112974c1(pictureCardFallbackInfoComponent.linkInfo, pictureCardFallbackInfoComponent.image, pictureCardFallbackInfoComponent.text);
    }

    public static String LJJIIJ(String str) {
        if (str.indexOf("/") == 0) {
            str = str.substring(1);
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

    public static final float LIZIZ(InterfaceC09420Yo interfaceC09420Yo, EnumC23500w6 layoutDirection) {
        o.LJIIIZ(interfaceC09420Yo, "<this>");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC23500w6.Ltr) {
            return interfaceC09420Yo.LIZ(layoutDirection);
        }
        return interfaceC09420Yo.LIZJ(layoutDirection);
    }

    public static final float LIZJ(InterfaceC09420Yo interfaceC09420Yo, EnumC23500w6 layoutDirection) {
        o.LJIIIZ(interfaceC09420Yo, "<this>");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC23500w6.Ltr) {
            return interfaceC09420Yo.LIZJ(layoutDirection);
        }
        return interfaceC09420Yo.LIZ(layoutDirection);
    }

    public static boolean LJ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        OD6.LJIIIZ(str, str2, "ResLoadUtils.checkExist");
        if (LJIILLIIL(str, str2) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r2.originPrice.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r2.discount.length() != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return X.EnumC70499Rlf.WAISTPDP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r2 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC70499Rlf LJI(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r2 = r3.baseInfo
            r1 = 0
            if (r2 == 0) goto L1a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder r0 = r2.voucherReminder
            if (r0 == 0) goto L6d
            java.lang.String r1 = r0.spuDeductionText
        L10:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r2 = r2.priceInfo
        L12:
            if (r1 == 0) goto L1a
            int r0 = r1.length()
            if (r0 != 0) goto L1d
        L1a:
            X.Rlf r0 = X.EnumC70499Rlf.NONE
        L1c:
            return r0
        L1d:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig r0 = r3.marketingConfig
            if (r0 == 0) goto L6a
            java.lang.Boolean r1 = r0.showDeductionText
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig r0 = r3.marketingConfig
            java.lang.Boolean r1 = r0.removePriceStr
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L39
            if (r4 == 0) goto L3c
        L39:
            X.Rlf r0 = X.EnumC70499Rlf.PDP
            goto L1c
        L3c:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r0 = r3.flashSale
            if (r0 != 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner r0 = r3.waistBanner
            if (r0 != 0) goto L47
            X.Rlf r0 = X.EnumC70499Rlf.PDP
            goto L1c
        L47:
            if (r2 == 0) goto L61
            java.lang.String r0 = r2.originPrice
            if (r0 == 0) goto L64
            java.lang.String r0 = r2.originPrice
            int r0 = r0.length()
            if (r0 != 0) goto L67
        L55:
            java.lang.String r0 = r2.discount
            if (r0 == 0) goto L61
            java.lang.String r0 = r2.discount
            int r0 = r0.length()
            if (r0 != 0) goto L67
        L61:
            X.Rlf r0 = X.EnumC70499Rlf.WAIST
            goto L1c
        L64:
            if (r2 == 0) goto L61
            goto L55
        L67:
            X.Rlf r0 = X.EnumC70499Rlf.WAISTPDP
            goto L1c
        L6a:
            X.Rlf r0 = X.EnumC70499Rlf.PDP
            goto L1c
        L6d:
            if (r2 == 0) goto L70
            goto L10
        L70:
            r2 = r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70657RoD.LJI(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean):X.Rlf");
    }

    public static boolean LJII(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String LJIIIZ(String str, String str2) {
        Long LIZJ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            File rootDirectory = c61532OCy.LJ.getRootDirectory();
            if (rootDirectory != null && rootDirectory.exists() && rootDirectory.isDirectory()) {
                OD6.LJIIIZ(str, str2, "ResLoadUtils.getChannelPath");
                String LJJIIJ = LJJIIJ(str2);
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    String str3 = File.separator;
                    LIZ2.append(str3);
                    LIZ2.append(str);
                    File file = new File(rootDirectory, X1D.LIZIZ(LIZ2));
                    if (!file.exists()) {
                        return null;
                    }
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath, LJJIIJ);
                    if (!file2.exists() || (LIZJ = OAS.LIZJ(file2)) == null) {
                        C61511OCd.LJIIJ(System.currentTimeMillis(), str, LJJIIJ, "null", "3", "false");
                        return null;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(absolutePath);
                    LIZ3.append(str3);
                    LIZ3.append(LJJIIJ);
                    LIZ3.append(str3);
                    LIZ3.append(LIZJ);
                    LIZ3.append(str3);
                    LIZ3.append("res");
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    C61511OCd.LJIIJ(System.currentTimeMillis(), str, LJJIIJ, String.valueOf(LIZJ), "3", "true");
                    return LIZIZ2;
                } catch (Throwable th) {
                    OC6.LJ("gecko-debug-tag", "getChannelPath:error:", th);
                }
            }
        }
        return null;
    }

    public static final String LJIIJJI(String imageUrl, EnumC70569Rmn imageScene) {
        boolean z;
        IECImageService iECImageService;
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(imageScene, "imageScene");
        if (imageUrl.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return imageUrl;
        }
        Object LIZ2 = C58096Mr6.LIZ(IECImageService.class, false);
        if (LIZ2 != null) {
            iECImageService = (IECImageService) LIZ2;
        } else {
            if (C58096Mr6.Q == null) {
                synchronized (IECImageService.class) {
                    if (C58096Mr6.Q == null) {
                        C58096Mr6.Q = new ECImageService();
                    }
                }
            }
            iECImageService = C58096Mr6.Q;
        }
        if (!iECImageService.LIZ()) {
            return imageUrl;
        }
        try {
            android.net.Uri imageUri = UriProtector.parse(imageUrl);
            o.LJIIIIZZ(imageUri, "imageUri");
            if (LJIIZILJ(imageUri, imageUrl)) {
                return imageUrl;
            }
            Uri.Builder buildUpon = imageUri.buildUpon();
            buildUpon.appendQueryParameter("ec_biz_scene", imageScene.getValue());
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            return uri;
        } catch (Exception unused) {
            return imageUrl;
        }
    }

    public static Long LJIIL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            OD6.LJIIIZ(str, str2, "ResLoadUtils.getLatestChannelVersion");
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            File rootDirectory = c61532OCy.LJ.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(File.separator);
                    LIZ2.append(str);
                    File file = new File(rootDirectory, X1D.LIZIZ(LIZ2));
                    if (!file.exists()) {
                        return null;
                    }
                    File file2 = new File(file.getAbsolutePath(), str2);
                    if (!file2.exists()) {
                        C61511OCd.LJIIJ(System.currentTimeMillis(), str, str2, "null", "3", "false");
                        return null;
                    }
                    return OAS.LIZJ(file2);
                } catch (Throwable th) {
                    OC6.LJ("gecko-debug-tag", "getLatestChannelVersion:error:", th);
                }
            }
        }
        return null;
    }

    public static final AbstractC70489RlV LJIILJJIL(ProductPackStruct productPackStruct, boolean z) {
        EnumC70491RlX enumC70491RlX;
        boolean z2;
        String str;
        Integer num;
        Integer num2;
        o.LJIIIZ(productPackStruct, "<this>");
        EnumC70499Rlf LJI = LJI(productPackStruct, z);
        MarketingConfig marketingConfig = productPackStruct.marketingConfig;
        if ((marketingConfig != null && o.LJ(marketingConfig.removePriceStr, Boolean.TRUE)) || z) {
            enumC70491RlX = EnumC70491RlX.US;
        } else if (LJI == EnumC70499Rlf.WAIST || LJI == EnumC70499Rlf.WAISTPDP) {
            enumC70491RlX = EnumC70491RlX.UK;
        } else {
            enumC70491RlX = EnumC70491RlX.ROW;
        }
        FlashSale flashSale = productPackStruct.flashSale;
        if (flashSale == null || (num2 = flashSale.status) == null || num2.intValue() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            Integer num3 = productPackStruct.flashSale.flashSaleStyle;
            if (num3 == null || num3.intValue() != 2) {
                return new C70496Rlc(enumC70491RlX, LA8.SELLER, 1);
            }
            return new C70496Rlc(enumC70491RlX, LA8.MALL, 1);
        }
        FlashSale flashSale2 = productPackStruct.flashSale;
        if (flashSale2 == null || (num = flashSale2.status) == null || num.intValue() != 2) {
            WaistBanner waistBanner = productPackStruct.waistBanner;
            if (waistBanner != null) {
                String str2 = waistBanner.activityName;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() > 0 || waistBanner.background != null) {
                    WaistBanner waistBanner2 = productPackStruct.waistBanner;
                    if (waistBanner2 != null && (str = waistBanner2.activityName) != null) {
                        str.length();
                    }
                    return new C70497Rld(enumC70491RlX);
                }
            }
            return new C70498Rle();
        }
        Integer num4 = productPackStruct.flashSale.flashSaleStyle;
        if (num4 == null || num4.intValue() != 2) {
            return new C70496Rlc(enumC70491RlX, LA8.SELLER, 2);
        }
        return new C70496Rlc(enumC70491RlX, LA8.MALL, 2);
    }

    public static Long LJIILLIIL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            File rootDirectory = c61532OCy.LJ.getRootDirectory();
            if (rootDirectory != null && rootDirectory.exists() && rootDirectory.isDirectory()) {
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(File.separator);
                    LIZ2.append(str);
                    File file = new File(rootDirectory, X1D.LIZIZ(LIZ2));
                    if (!file.exists()) {
                        return null;
                    }
                    File file2 = new File(file.getAbsolutePath(), str2);
                    if (!file2.exists()) {
                        return null;
                    }
                    return OAS.LIZJ(file2);
                } catch (Throwable th) {
                    OC6.LJ("gecko-debug-tag", "innerGetLatestChannelVersion:error:", th);
                }
            }
        }
        return null;
    }

    public static final boolean LJIIZILJ(android.net.Uri uri, String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        try {
            java.util.Set<String> queryParams = UriProtector.getQueryParameterNames(uri);
            o.LJIIIIZZ(queryParams, "queryParams");
            for (String str : queryParams) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2136082433) {
                        if (hashCode != -65387101) {
                            if (hashCode == 1073584312 && str.equals("signature")) {
                                return true;
                            }
                        } else if (str.equals("x-signature")) {
                            return true;
                        }
                    } else if (str.equals("ec_biz_scene")) {
                        return true;
                    }
                }
            }
            if (!s.LJJJLZIJ(imageUrl, "x-signature", false)) {
                if (!s.LJJJLZIJ(imageUrl, "signature", false)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final InterfaceC07790Sh LJIJ(InterfaceC07790Sh padding, float f) {
        o.LJIIIZ(padding, "$this$padding");
        return padding.LLLIIIL(new C50961zI(f, f, f, f));
    }

    public static final void LJJI(double d, InterfaceC65784Pro log) {
        o.LJIIIZ(log, "log");
        if (LiveBroadcastLiveLogOpt.INSTANCE.canReport(d)) {
            log.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r0 = r1.priceInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r0 = r0.discount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if ((r9 instanceof X.C70496Rlc) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r9.LIZIZ != X.LA8.MALL) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        r12 = r36.productId;
        r0 = r36.flashSale;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r11 = r0.startTime;
        r5 = r0.countdown;
        r4 = r0.endTime;
        r3 = r0.remindButton;
        r2 = r0.image;
        r1 = r0.price;
        r0 = r0.tagImg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r24 = new X.RV8(r12, r11, r5, r4, r3, r2, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r2 = r36.activityInfo;
        r0 = r36.baseInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r1 = r0.voucherReminder;
        r0 = r0.priceInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        r6 = r0.panelSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        return new X.C69689RWr(r15, r14, r13, r20, r8, r7, r23, r24, r2, r9, r1, r28, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        r11 = null;
        r5 = null;
        r4 = null;
        r3 = null;
        r2 = null;
        r1 = null;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0043, code lost:
    
        if (r1 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69689RWr LJJIII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70657RoD.LJJIII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean):X.RWr");
    }

    public static C1P9 LIZ(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new C1P9(f, f2, f, f2);
    }

    public static String LJIIIIZZ(long j, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && j != 0) {
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            File rootDirectory = c61532OCy.LJ.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                String LJJIIJ = LJJIIJ(str2);
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    String str3 = File.separator;
                    LIZ2.append(str3);
                    LIZ2.append(str);
                    File file = new File(rootDirectory, X1D.LIZIZ(LIZ2));
                    if (!file.exists()) {
                        return null;
                    }
                    String absolutePath = file.getAbsolutePath();
                    if (!new File(absolutePath, LJJIIJ).exists()) {
                        return null;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(absolutePath);
                    LIZ3.append(str3);
                    LIZ3.append(LJJIIJ);
                    LIZ3.append(str3);
                    LIZ3.append(j);
                    LIZ3.append(str3);
                    LIZ3.append("res");
                    return X1D.LIZIZ(LIZ3);
                } catch (Throwable th) {
                    OC6.LJ("gecko-debug-tag", "getChannelPath:error:", th);
                }
            }
        }
        return null;
    }

    public static final InterfaceC07790Sh LJIJI(InterfaceC07790Sh padding, float f, float f2) {
        o.LJIIIZ(padding, "$this$padding");
        return padding.LLLIIIL(new C50961zI(f, f2, f, f2));
    }

    public static InterfaceC07790Sh LJIJJ(InterfaceC07790Sh interfaceC07790Sh, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return LJIJI(interfaceC07790Sh, f, f2);
    }

    public static final InterfaceC07790Sh LJIJJLI(InterfaceC07790Sh padding, float f, float f2, float f3, float f4) {
        o.LJIIIZ(padding, "$this$padding");
        return padding.LLLIIIL(new C50961zI(f, f2, f3, f4));
    }

    public static InterfaceC07790Sh LJIL(InterfaceC07790Sh interfaceC07790Sh, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return LJIJJLI(interfaceC07790Sh, f, f2, f3, f4);
    }
}
