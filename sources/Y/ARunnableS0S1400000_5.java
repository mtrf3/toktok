package Y;

import X.C0NB;
import X.C28467BFf;
import X.C31847Ceh;
import X.C39579Fg7;
import X.C48458J0c;
import X.C48459J0d;
import X.C64797Pbt;
import X.C65814PsI;
import X.EnumC31856Ceq;
import X.InterfaceC73573Su9;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.sub.ImageConvertResponse;

/* loaded from: classes6.dex */
public class ARunnableS0S1400000_5 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        Bitmap bitmap;
        UploadResult uploadResult;
        String str;
        UploadResult uploadResult2;
        String str2;
        ImageConvertResponse.Images images;
        List<String> list;
        Map map;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sub_share_link_upload_photo_");
        LIZ.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ);
        Object obj = null;
        try {
            bitmap = C31847Ceh.LIZLLL((Context) this.l2, (View) this.l1);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SubLinkShareImgLoadListener getViewBitmap error: ");
            LIZ2.append(e);
            C0NB.LIZ(X1D.LIZIZ(LIZ2));
            bitmap = null;
        }
        View view = (View) this.l1;
        view.post(new ARunnableS41S0100000_5(view, 313));
        if (bitmap == null) {
            C39579Fg7 c39579Fg7 = (C39579Fg7) this.l3;
            if (c39579Fg7 != null) {
                c39579Fg7.LJIILLIIL((View) this.l1);
                return;
            }
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o.LJIIIIZZ(byteArray, "byteArray");
        C28467BFf LJIILIIL = C31847Ceh.LJIILIIL(LIZIZ, byteArray);
        if (LJIILIIL == null || (uploadResult = (UploadResult) LJIILIIL.data) == null || (str = uploadResult.uri) == null || str.length() == 0) {
            C39579Fg7 c39579Fg72 = (C39579Fg7) this.l3;
            if (c39579Fg72 != null) {
                c39579Fg72.LJIILLIIL((View) this.l1);
                return;
            }
            return;
        }
        if (LJIILIIL != null && (uploadResult2 = (UploadResult) LJIILIIL.data) != null && (str2 = uploadResult2.uri) != null && str2.length() != 0) {
            try {
                C65814PsI.LIZ().getClass();
                C64797Pbt<C28467BFf<ImageConvertResponse.Data>> execute = ((SubscribeApi) C65814PsI.LIZJ(SubscribeApi.class)).subImageConvert(str2).execute();
                if (execute.LIZIZ() && (images = (ImageConvertResponse.Images) ORZ.LJLLLLLL(0, execute.LIZIZ.data.images)) != null && (list = images.url) != null) {
                    String str3 = (String) ORZ.LJLLLLLL(0, list);
                    if (str3 != null && str3.length() != 0) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) C31847Ceh.LIZ;
                        C48459J0d c48459J0d = (C48459J0d) linkedHashMap.get((EnumC31856Ceq) this.l4);
                        if (c48459J0d != null && (map = (Map) c48459J0d.LIZJ()) != null) {
                            map.put(this.s0, str3);
                        }
                        C48458J0c c48458J0c = (C48458J0c) linkedHashMap.get((EnumC31856Ceq) this.l4);
                        if (c48458J0c != null) {
                            C48459J0d c48459J0d2 = (C48459J0d) linkedHashMap.get((EnumC31856Ceq) this.l4);
                            if (c48459J0d2 != null) {
                                obj = c48459J0d2.LIZJ();
                            }
                            c48458J0c.LIZ(obj);
                        }
                        C39579Fg7 c39579Fg73 = (C39579Fg7) this.l3;
                        if (c39579Fg73 == null) {
                            return;
                        }
                        c39579Fg73.LJIIZILJ((View) this.l1, str3);
                        return;
                    }
                }
            } catch (Exception e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("SubLinkShareImgLoadListener convertUriToUrl error: ");
                LIZ3.append(e2);
                C0NB.LIZ(X1D.LIZIZ(LIZ3));
            }
        }
        C39579Fg7 c39579Fg74 = (C39579Fg7) this.l3;
        if (c39579Fg74 == null) {
            return;
        }
        c39579Fg74.LJIILLIIL((View) this.l1);
    }

    public static final void run$0(ARunnableS0S1400000_5 aRunnableS0S1400000_5) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) aRunnableS0S1400000_5.l1;
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) aRunnableS0S1400000_5.l2;
        byte[] bArr = (byte[]) aRunnableS0S1400000_5.l3;
        String str = aRunnableS0S1400000_5.s0;
        UploadImageMethod.Result.ImageResult imageResult = (UploadImageMethod.Result.ImageResult) aRunnableS0S1400000_5.l4;
        uploadImageMethod.getClass();
        try {
            interfaceC73573Su9.onNext(uploadImageMethod.LJJI(uploadImageMethod.LJLJI, bArr, str, imageResult));
        } catch (Exception e) {
            interfaceC73573Su9.onError(e);
        }
    }

    public static final void run$1(ARunnableS0S1400000_5 aRunnableS0S1400000_5) {
        boolean LIZ;
        try {
            aRunnableS0S1400000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1400000_5(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.s0 = str;
    }
}
