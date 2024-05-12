package com.bytedance.android.livesdk.effect;

import X.AbstractC73638SvC;
import X.AbstractC73745Swv;
import X.C28467BFf;
import X.C30483Bxn;
import X.C30517ByL;
import X.C31819CeF;
import X.C31823CeJ;
import X.C73495Sst;
import X.C73666Sve;
import X.C73969T1h;
import X.E8M;
import X.EnumC31874Cf8;
import X.EnumC73681Svt;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.T16;
import X.X1D;
import Y.AfS54S0200000_5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class StickerImageUploader {
    public C73495Sst LIZ;
    public C73666Sve LIZIZ;
    public boolean LIZJ;
    public final C30483Bxn<C30517ByL> LIZLLL = new C30483Bxn<>();

    /* loaded from: classes6.dex */
    public interface UploadStickerImageApi {
        @E8M("/webcast/review/upload_green_screen/")
        AbstractC73638SvC<C28467BFf<UploadResponse>> upload(@InterfaceC195727mC TypedOutput typedOutput, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2);
    }

    public final void LIZIZ() {
        Object remove;
        AbstractC73745Swv LJJLIIJ;
        if (this.LIZJ) {
            return;
        }
        int i = 1;
        this.LIZJ = true;
        C30483Bxn<C30517ByL> c30483Bxn = this.LIZLLL;
        Bitmap bitmap = null;
        if (c30483Bxn.LIZ.size() == 0) {
            remove = null;
        } else {
            remove = ListProtector.remove(c30483Bxn.LIZ, 0);
        }
        C30517ByL c30517ByL = (C30517ByL) remove;
        if (c30517ByL == null) {
            this.LIZJ = false;
            return;
        }
        if (!new File(c30517ByL.LIZ).exists()) {
            this.LIZJ = false;
            return;
        }
        String str = c30517ByL.LIZ;
        File file = new File(str);
        if (file.length() / 1024 < 300) {
            LJJLIIJ = AbstractC73745Swv.LJFF(file);
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 > i3 && i2 > 600) {
                i = i2 / 600;
            } else if (i2 < i3 && i3 > 800) {
                i = i3 / 800;
            }
            options.inSampleSize = i;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                int i4 = 90;
                while (byteArrayOutputStream.toByteArray().length / 1024 > 300) {
                    byteArrayOutputStream.reset();
                    decodeFile.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                    i4 -= 10;
                }
                bitmap = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(UUID.randomUUID().toString());
            LIZ.append(".jpg");
            LJJLIIJ = C31819CeF.LIZ.LIZ(new C31823CeJ(X1D.LIZIZ(LIZ), EnumC31874Cf8.STICKER, "image", "jpg", bitmap, true, Bitmap.CompressFormat.JPEG, 100, "")).LJJLIIJ(EnumC73681Svt.LATEST);
        }
        this.LIZIZ = (C73666Sve) LJJLIIJ.LJII(C73969T1h.LIZIZ()).LJIILJJIL(T16.LIZ()).LJIIJ(new AfS54S0200000_5(this, c30517ByL, 15), new AfS54S0200000_5(this, c30517ByL, 16));
    }

    /* loaded from: classes6.dex */
    public class UploadResponse {

        @InterfaceC65349Pkn("url")
        public String url;

        public UploadResponse(StickerImageUploader stickerImageUploader) {
        }
    }

    public final void LIZ(C30517ByL c30517ByL) {
        C30483Bxn<C30517ByL> c30483Bxn = this.LIZLLL;
        if (c30483Bxn.LIZ.indexOf(c30517ByL) != -1) {
            c30483Bxn.LIZ.remove(c30517ByL);
        }
        if (c30483Bxn.LIZIZ <= c30483Bxn.LIZ.size()) {
            ListProtector.remove(c30483Bxn.LIZ, c30483Bxn.LIZIZ - 1);
        }
        ListProtector.add(c30483Bxn.LIZ, 0, c30517ByL);
        if (this.LIZLLL.LIZ.size() == 0) {
            return;
        }
        LIZIZ();
    }
}
