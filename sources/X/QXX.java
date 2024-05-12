package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.services.apm.api.IHttpService;
import com.lynx.tasm.LynxError;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class QXX implements InterfaceC78733UvB, InterfaceC47814Ipe, InterfaceC42728Gpo, IZY, K04 {
    public int LIZ() {
        return R.string.dn2;
    }

    @Override // X.IZY
    public /* synthetic */ List LJIILL() {
        return null;
    }

    public /* synthetic */ void LJJIJIL(java.util.Map map) {
    }

    public abstract C73316Sq0 LJJIJL(InterfaceC68914R2w interfaceC68914R2w, InterfaceC68914R2w interfaceC68914R2w2, AbstractC73922Szm abstractC73922Szm);

    public /* synthetic */ void LJJJJLI(C46882Iac c46882Iac) {
    }

    public int LJJLIIIJ(int i, int i2, int i3, float[] fArr, int i4, float f, float f2, float f3, int i5) {
        return -1;
    }

    public int LJJLIIIJILLIZJL(int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3) {
        return -1;
    }

    public int LJJLIIIJJI(int i, int i2, int i3) {
        return -1;
    }

    public int LJJLIIIJJIZ(int i, int i2, int i3, int i4, float f, float f2, float f3, int i5) {
        return -1;
    }

    public abstract int LJJLIIIJL();

    public abstract int LJJLIIIJLJLI();

    public abstract int LJJLIIIJLLLLLLLZ(int i, int i2, int i3, int i4, String str, float f, float f2, float f3, boolean z, float f4, float f5);

    public abstract boolean LJJLIIJ(boolean z, int i, int i2, int i3);

    public abstract boolean LJJLIL(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z);

    public abstract boolean LJJLJ(String str, int i, boolean z, boolean z2, int i2, int i3, String str2, int i4, int i5, int i6, String str3, String str4);

    public abstract void LJJLJLI();

    public abstract void LJJLL();

    public abstract int LJJZ(int i, int i2, int i3, float[] fArr, int i4, int i5, int i6, int i7, int i8, long j, int i9);

    public abstract int LJJZZI(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9);

    public abstract void LJJZZIII(Throwable th, Throwable th2);

    public abstract String LJL(Aweme aweme, String str, JQA jqa);

    public abstract boolean LJLI(int i, int i2, Object obj, Object obj2);

    public abstract boolean LJLIIIL(int i, int i2, Object obj, Object obj2);

    public abstract void LJLJI();

    public abstract void LJLJJI(C03860De c03860De);

    public abstract void LJLJJL();

    public abstract void LJLJJLL(String str, String str2);

    public abstract ApmAgentServiceImpl LJLJL();

    public abstract InterfaceC64052PBw LJLJLJ();

    public abstract PGS LJLJLLL();

    public abstract C64035PBf LJLL();

    public abstract InterfaceC64045PBp LJLLI();

    public abstract IHttpService LJLLJ();

    public abstract C64213PIb LJLLL();

    public abstract PG5 LJLLLL();

    public abstract PD4 LJLZ();

    public void LJZ(String str) {
    }

    public abstract String LJZI();

    public void LJZL(String str) {
    }

    public abstract void LLF(C65365Pl3 c65365Pl3);

    public abstract void LLFFF(JSONObject jSONObject);

    public abstract String LLFII();

    public abstract int LLFZ();

    public abstract String LLIFFJFJJ();

    public abstract String LLII();

    public abstract String LLIIII();

    public abstract String LLIIIILZ();

    public abstract Object LLIIIL(int i, int i2, Object obj, Object obj2);

    public abstract String LLIIIZ();

    public abstract String LLIIJI();

    public void LLIIJLIL() {
    }

    public abstract JSONObject LLIIL();

    public abstract String LLIILII();

    public abstract View LLIIZ(ViewGroup viewGroup);

    public HashMap LLIL() {
        return null;
    }

    public abstract String LLILII();

    public abstract int LLILIL();

    public abstract String LLILL();

    public abstract String LLILLIZIL();

    public abstract String LLILLJJLI();

    public abstract java.util.Map LLILLL();

    public abstract Path LLILZ(float f, float f2, float f3, float f4);

    public abstract String LLILZIL();

    public abstract void LLILZLL();

    public abstract String LLIZ();

    public abstract String LLIZLLLIL();

    public abstract int LLJ(int i);

    public abstract JSONObject LLJI();

    public abstract long LLJIJIL(ViewGroup viewGroup, AbstractC03490Bt abstractC03490Bt, C03860De c03860De, C03860De c03860De2);

    public abstract void LLJILJIL(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6);

    public abstract long LLJILJILJ();

    public abstract String LLJILLL();

    public abstract int LLJJI();

    public abstract String LLJJIII();

    public abstract float LLJJIJI(Object obj);

    public abstract int LLJJIJIIJIL();

    public abstract String LLJJIJIL();

    public void LLJJJIL(String str) {
    }

    public abstract String LLJJJJ();

    public abstract void LLJJJJJIL(long j, long j2, boolean z, String str, String str2);

    public abstract boolean LLJJJJLIIL(QXX qxx);

    public abstract boolean LLJJL();

    public abstract boolean LLJJLIIIJLLLLLLLZ();

    public abstract String LLJL();

    public abstract void LLJLL(PXI pxi, int i, String str);

    public void LLJLLIL() {
    }

    public abstract void LLJZIJLIL(PXW pxw, Throwable th, C64598PWw c64598PWw);

    public abstract void LLL();

    public abstract void LLLF(int i);

    public abstract void LLLFF(Typeface typeface, boolean z);

    public abstract void LLLFFI();

    public abstract void LLLFZ(String str);

    public abstract void LLLI(C64537PUn c64537PUn);

    public abstract QXX LLLII(C8X3 c8x3);

    public abstract void LLLIIII(PXI pxi, C64598PWw c64598PWw);

    public abstract void LLLIIIIL();

    public abstract void LLLIIIL(List list);

    public abstract void LLLIIL(PXI pxi);

    public void LLLIILIL(float f) {
    }

    public abstract void LLLIL(boolean z);

    public abstract void LLLILZ(LynxError lynxError);

    public void LLLILZJ(VEH veh) {
    }

    public abstract void LLLILZLLLI(Exception exc);

    public abstract void LLLIZZ();

    public abstract void LLLJ();

    public abstract void LLLJIL(C1VT c1vt);

    public abstract void LLLL(String str, String str2);

    public abstract void LLLLII();

    public abstract void LLLLIIIILLL(String str);

    public abstract void LLLLIIL(Runnable runnable);

    public abstract void LLLLIILLL(Object obj);

    public abstract void LLLLIL(long j);

    public abstract void LLLLILI();

    public abstract void LLLLJI(int i);

    public abstract void LLLLL(float f, Object obj);

    public abstract void LLLLLIL(C87753YcH c87753YcH);

    public abstract ShareModel LLLLLILLIL();

    public abstract Bundle LLLLLJIL();

    public abstract void LLLLLJLJLL(String str);

    public abstract void LLLLLL();

    public abstract void LLLLLLIL(String str);

    public boolean LLLLLLJ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        return false;
    }

    public abstract int[] LLLLLLL();

    public abstract void LLLLLLLLL(C65367Pl5 c65367Pl5);

    public abstract String LLLLLLLLLL();

    public abstract String LLLLLLZZ();

    public void LLLLLZ(String str) {
    }

    public abstract int LLLLLZIL(int i, byte[] bArr, int i2);

    public abstract int LLLLLZL(CharSequence charSequence, byte[] bArr, int i, int i2);

    @Override // X.InterfaceC47814Ipe
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onCompletion(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // X.InterfaceC47814Ipe
    public void onVideoStatusException(int i) {
    }

    public C62374Odu LJLLLLLL() {
        C62374Odu c62374Odu = new C62374Odu();
        String type = LLJL();
        o.LJIIIZ(type, "type");
        c62374Odu.LIZ = type;
        c62374Odu.LIZJ(LLJJJJ());
        c62374Odu.LJ(LLLLLLLLLL());
        String desc = LJZI();
        o.LJIIIZ(desc, "desc");
        c62374Odu.LJ = desc;
        String url = LLLLLLZZ();
        o.LJIIIZ(url, "url");
        c62374Odu.LJFF = url;
        c62374Odu.LIZJ = new ShareContentType[]{ShareContentType.LINK};
        c62374Odu.LJI = LLLLLILLIL();
        Bundle bundle = LLLLLJIL();
        o.LJIIIZ(bundle, "bundle");
        c62374Odu.LJII = bundle;
        return c62374Odu;
    }

    public JSONObject LLLLLLLZIL() {
        JSONObject jSONObject = new JSONObject();
        LLFFF(jSONObject);
        return jSONObject;
    }

    public long LLJJ() {
        Long LJJIZ = C38350F3i.LJJIZ(LLJILLL());
        if (LJJIZ != null) {
            return LJJIZ.longValue();
        }
        return -1L;
    }

    public /* synthetic */ QXX() {
    }

    public /* synthetic */ QXX(int i) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:5|(1:7)(1:111)|8|9|10|(1:12)(1:108)|14|15|16|(2:102|103)(1:18)|(13:23|24|25|(1:(2:28|(2:30|31)(5:48|(1:50)(1:54)|51|52|53))(4:55|(2:56|(2:58|(1:72)(2:62|73))(2:74|75))|63|(4:65|(2:68|66)|69|70)(1:71)))(1:(4:77|(1:79)(1:82)|80|81)(4:83|(4:86|(3:88|89|90)(2:92|93)|91|84)|94|95))|32|33|34|35|36|37|(1:39)(1:42)|40|41)|101|24|25|(0)(0)|32|33|34|35|36|37|(0)(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x028b, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x028e, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x028d, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022e, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLLLLZ(com.bytedance.hybrid.spark.SparkContext r23) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QXX.LLLLLLZ(com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.K04
    public boolean LJIJI(String str) {
        String str2;
        if (TextUtils.equals(str, "search_result") || TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_ecommerce")) {
            return true;
        }
        if (TextUtils.equals(str, "trending_page") || TextUtils.equals(str, "compilation_detail") || TextUtils.equals(str, "from_city_card")) {
            C50652JuK.Companion.getClass();
            C50321Joz LIZIZ = C50651JuJ.LIZIZ();
            if (LIZIZ != null) {
                str2 = LIZIZ.getSearchId();
            } else {
                str2 = null;
            }
            return !TextUtils.isEmpty(str2);
        }
        return false;
    }

    public void LJLIL(View view) {
        if (LLJJL()) {
            C35601Dy9.LIZIZ(view);
        } else {
            C35601Dy9.LIZ(new AqS159S0100000_9(view, 999));
        }
    }

    public void LL(Runnable runnable) {
        if (LLJJLIIIJLLLLLLLZ()) {
            runnable.run();
        } else {
            LLLLIIL(runnable);
        }
    }

    public /* synthetic */ QXX(Object obj) {
    }

    public static void LLLLJ(C46882Iac c46882Iac, IXO ixo) {
        c46882Iac.LJLLLL(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, ixo.LJIILL);
        c46882Iac.LJLLLL(501, ixo.LJIILLIIL);
        c46882Iac.LJLLLL(502, ixo.LJIJJ);
        c46882Iac.LJLLLL(504, ixo.LJIIZILJ);
        c46882Iac.LJLLLL(505, ixo.LJIJ);
        c46882Iac.LJLLLL(506, ixo.LJIJI);
        c46882Iac.LJLLILLLL(ixo.LJIJJLI, 529);
        c46882Iac.LJLLILLLL(ixo.LJIL, 527);
        c46882Iac.LJLLILLLL(ixo.LJJ, 528);
    }

    public void LLJJJ(SparkContext sparkContext, String str) {
        o.LJIIJ(sparkContext, "sparkContext");
        if (LLLLLLJ(sparkContext)) {
            String str2 = sparkContext.url;
            android.net.Uri uri = UriProtector.parse(str2);
            o.LJFF(uri, "uri");
            String LJJJJI = C78926UyI.LJJJJI(uri, "target_handler");
            String str3 = sparkContext.containerId;
            C79605VMb c79605VMb = new C79605VMb("pluginStrictGlobal");
            c79605VMb.LIZIZ = "sparkTrace";
            c79605VMb.LIZ = str2;
            c79605VMb.LIZLLL = C47135Ieh.LJ("businessFrom", str, "targetHandler", LJJJJI);
            FD5.LJ(str3, c79605VMb.LIZ());
            LLLLLLZ(sparkContext);
            return;
        }
        LLLLLLZ(sparkContext);
    }

    public void LLJZ(QIF qif, String str) {
        JSONObject LLIIL = LLIIL();
        InterfaceC66833QKv interfaceC66833QKv = qif.LJJIII;
        if (interfaceC66833QKv != null) {
            ((QJD) interfaceC66833QKv).LIZ.getClass();
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZJ = b1.LIZJ("EventTracking  ", str);
                LIZJ.append(qif.LIZ);
                LIZJ.append(", ");
                LIZJ.append(LLIIL);
                X1D.LIZIZ(LIZJ);
            }
            LLLLILI();
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZJ2 = b1.LIZJ("EventTracking  ", str);
                LIZJ2.append(qif.LIZ);
                LIZJ2.append(" reset.");
                X1D.LIZIZ(LIZJ2);
            }
        }
    }

    public static void LLFF(int i, int i2, Bitmap bitmap) {
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = i2 + 1;
        int i5 = i4 + i2;
        int[] iArr2 = new int[i5 * 256];
        int i6 = 1;
        do {
            for (int i7 = 0; i7 < i5; i7++) {
                iArr2[i4] = i6;
                i4++;
            }
            i6++;
        } while (i6 <= 255);
        int[] iArr3 = new int[Math.max(width, height)];
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = 0;
            while (i9 < height) {
                int i10 = width * i9;
                i9++;
                int i11 = (i9 * width) - 1;
                int i12 = i5 >> 1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = -i12; i17 < width + i12; i17++) {
                    int i18 = i10 + i17;
                    if (i18 < i10) {
                        i18 = i10;
                    } else if (i18 > i11) {
                        i18 = i11;
                    }
                    int i19 = iArr[i18];
                    i13 += (i19 >> 16) & 255;
                    i14 += (i19 >> 8) & 255;
                    i15 += i19 & 255;
                    i16 += i19 >>> 24;
                    if (i17 >= i12) {
                        iArr3[i17 - i12] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                        int i20 = (i17 - (i5 - 1)) + i10;
                        if (i20 < i10) {
                            i20 = i10;
                        } else if (i20 > i11) {
                            i20 = i11;
                        }
                        int i21 = iArr[i20];
                        i13 -= (i21 >> 16) & 255;
                        i14 -= (i21 >> 8) & 255;
                        i15 -= i21 & 255;
                        i16 -= i21 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i10, width);
            }
            for (int i22 = 0; i22 < width; i22++) {
                int LIZ = C0EH.LIZ(height, -1, width, i22);
                int i23 = (i5 >> 1) * width;
                int i24 = (i5 - 1) * width;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                for (int i30 = i22 - i23; i30 <= LIZ + i23; i30 += width) {
                    if (i30 < i22) {
                        i3 = i22;
                    } else if (i30 > LIZ) {
                        i3 = LIZ;
                    } else {
                        i3 = i30;
                    }
                    int i31 = iArr[i3];
                    i25 += (i31 >> 16) & 255;
                    i26 += (i31 >> 8) & 255;
                    i27 += i31 & 255;
                    i28 += i31 >>> 24;
                    if (i30 - i23 >= i22) {
                        iArr3[i29] = (iArr2[i28] << 24) | (iArr2[i25] << 16) | (iArr2[i26] << 8) | iArr2[i27];
                        i29++;
                        int i32 = i30 - i24;
                        if (i32 < i22) {
                            i32 = i22;
                        } else if (i32 > LIZ) {
                            i32 = LIZ;
                        }
                        int i33 = iArr[i32];
                        i25 -= (i33 >> 16) & 255;
                        i26 -= (i33 >> 8) & 255;
                        i27 -= i33 & 255;
                        i28 -= i33 >>> 24;
                    }
                }
                int i34 = i22;
                for (int i35 = 0; i35 < height; i35++) {
                    iArr[i34] = iArr3[i35];
                    i34 += width;
                }
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static void LLJLILLLLZIIL(QXX qxx, R30 r30, AbstractC68899R2h abstractC68899R2h) {
        QXY block = QXY.LJLIL;
        qxx.getClass();
        o.LJIIJ(block, "block");
        InterfaceC68914R2w LJI = UC0.LJI(r30);
        InterfaceC68914R2w LJ = UC0.LJ(abstractC68899R2h);
        C73918Szi c73918Szi = new C73918Szi(0);
        block.invoke(c73918Szi);
        qxx.LJJIJL(LJI, LJ, c73918Szi);
    }

    public void LJLILLLLZI(InterfaceC68904R2m to, C68897R2f c68897R2f, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIJ(to, "to");
        InterfaceC68914R2w LJFF = UC0.LJFF(c68897R2f);
        InterfaceC68914R2w LJ = UC0.LJ(to);
        C73920Szk c73920Szk = new C73920Szk(null);
        interfaceC88472Yns.invoke(c73920Szk);
        LJJIJL(LJFF, LJ, c73920Szk);
    }

    public void LLJLIL(R30 r30, AbstractC68898R2g abstractC68898R2g, InterfaceC88472Yns interfaceC88472Yns) {
        InterfaceC68914R2w LJI = UC0.LJI(r30);
        InterfaceC68914R2w LJFF = UC0.LJFF(abstractC68898R2g);
        C73918Szi c73918Szi = new C73918Szi(0);
        interfaceC88472Yns.invoke(c73918Szi);
        LJJIJL(LJI, LJFF, c73918Szi);
    }

    public void LLJLLL(String str, String str2, String str3) {
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        C152275yJ c152275yJ = C152275yJ.LIZ;
        File file = new File(str2);
        c152275yJ.getClass();
        C152275yJ.LJIIIIZZ(file);
    }

    public void LLLLIILL(InterfaceC68904R2m predicatedSyncTo, C68897R2f c68897R2f, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIJ(predicatedSyncTo, "$this$predicatedSyncTo");
        InterfaceC68914R2w LJ = UC0.LJ(predicatedSyncTo);
        InterfaceC68914R2w LJFF = UC0.LJFF(c68897R2f);
        C73921Szl c73921Szl = new C73921Szl(null);
        interfaceC88472Yns.invoke(c73921Szl);
        LJJIJL(LJ, LJFF, c73921Szl);
    }

    public static void LLD(AbstractC40151FpL abstractC40151FpL, boolean z, SparkContext sparkContext, String str) {
        if (abstractC40151FpL instanceof AbstractC40122Fos) {
            if (z) {
                AbstractC40122Fos abstractC40122Fos = (AbstractC40122Fos) abstractC40151FpL;
                if (str == null) {
                    str = "";
                }
                abstractC40122Fos.LJFF(sparkContext, str);
                return;
            }
            AbstractC40122Fos abstractC40122Fos2 = (AbstractC40122Fos) abstractC40151FpL;
            if (str == null) {
                str = "";
            }
            abstractC40122Fos2.LJ(sparkContext, str);
            return;
        }
        if (!(abstractC40151FpL instanceof AbstractC40151FpL)) {
            return;
        }
        if (z) {
            abstractC40151FpL.LIZIZ(sparkContext);
        } else {
            abstractC40151FpL.LIZ(sparkContext);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r7 == null) goto L8;
     */
    @Override // X.K04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, int r6, X.JHA r7) {
        /*
            r3 = this;
            r0 = 0
            if (r7 == 0) goto L54
            boolean r1 = r7 instanceof X.JQA
            if (r1 == 0) goto L54
            X.JQA r7 = (X.JQA) r7
            if (r7 != 0) goto L4f
        Lb:
            X.JmL r1 = X.K0M.LIZ()
            if (r1 == 0) goto L38
            java.util.Map r2 = r1.LIZLLL()
            if (r2 == 0) goto L38
            java.lang.Class<X.JQE> r1 = X.JQE.class
            java.lang.String r1 = X.C16880lQ.LJLLJ(r1)
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L38
            boolean r1 = r2 instanceof java.lang.ref.WeakReference
            if (r1 == 0) goto L38
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L38
            boolean r1 = r2 instanceof X.JQA
            if (r1 == 0) goto L38
            r7 = r2
            X.JQA r7 = (X.JQA) r7
            if (r7 != 0) goto L4f
        L38:
            if (r4 == 0) goto L4f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.JQA>> r2 = X.C49621Jdh.LJIJ
            java.lang.String r1 = r4.getAid()
            java.lang.Object r1 = r2.get(r1)
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            if (r1 == 0) goto L4e
            java.lang.Object r0 = r1.get()
            X.JQA r0 = (X.JQA) r0
        L4e:
            r7 = r0
        L4f:
            java.lang.String r0 = r3.LJL(r4, r5, r7)
            return r0
        L54:
            r7 = r0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QXX.LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int, X.JHA):java.lang.String");
    }

    @Override // X.InterfaceC78716Uuu
    public Matrix LJJJJI(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        LLJILJIL(matrix, rect.width(), rect.height(), i, i2, rect.left, rect.top);
        return matrix;
    }
}
