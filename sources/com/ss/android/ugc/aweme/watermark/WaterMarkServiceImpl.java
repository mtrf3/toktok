package com.ss.android.ugc.aweme.watermark;

import X.AnonymousClass036;
import X.C150985wE;
import X.C1B6;
import X.C44172HVg;
import X.C44467Hcl;
import X.C44468Hcm;
import X.C44469Hcn;
import X.C44471Hcp;
import X.C44487Hd5;
import X.C44488Hd6;
import X.C44496HdE;
import X.C48841JEv;
import X.C58096Mr6;
import X.C60903NvH;
import X.C8HI;
import X.H4I;
import X.H4P;
import X.InterfaceC44470Hco;
import X.InterfaceC45930I0w;
import X.XKX;
import Y.IDLCallbackS106S0200000_7;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.TextPaint;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.watermark.IExternalWatermarkAbility;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import djb.IDaS68S0100000_7;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class WaterMarkServiceImpl implements IWaterMarkService {
    public static InterfaceC44470Hco LIZIZ() {
        if (C60903NvH.LJIIJJI().LIZJ().LIZLLL()) {
            return (C44488Hd6) C44471Hcp.LIZIZ.getValue();
        }
        return (C44487Hd5) C44471Hcp.LIZ.getValue();
    }

    public static IWaterMarkService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IWaterMarkService.class, false);
        if (LIZ != null) {
            return (IWaterMarkService) LIZ;
        }
        if (C58096Mr6.b8 == null) {
            synchronized (IWaterMarkService.class) {
                if (C58096Mr6.b8 == null) {
                    C58096Mr6.b8 = new WaterMarkServiceImpl();
                }
            }
        }
        return C58096Mr6.b8;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void cancelWaterMark() {
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("WaterMark", new C44468Hcm(this));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final IExternalWatermarkAbility addEffectWatermark(WaterMarkBuilder waterMarkBuilder) {
        o.LJIIIZ(waterMarkBuilder, "waterMarkBuilder");
        H4P h4p = new H4P(waterMarkBuilder);
        System.currentTimeMillis();
        C60903NvH.LJIIJJI().LIZJ().LIZLLL();
        WaterMarkBuilder waterMarkBuilder2 = h4p.LIZ;
        if (waterMarkBuilder2.isInstagram || waterMarkBuilder2.addEndMark) {
            C44172HVg.LJII.getClass();
            C44496HdE.LIZ();
        }
        if (VEUtils.getVideoFileInfo(h4p.LIZ.inputPath) == null) {
            WaterMarkListener waterMarkListener = h4p.LIZ.listener;
            if (waterMarkListener != null) {
                waterMarkListener.onError(-1);
            }
            AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(h4p, 498);
            h4p.LJFF = XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZIZ.plus(new IDaS68S0100000_7(CoroutineExceptionHandler.LJJJJIZL, h4p, 1))), null, null, new H4I(h4p, aqS168S0100000_2, null), 3);
            return new C44469Hcn(h4p);
        }
        h4p.LIZJ = false;
        AqS168S0100000_2 aqS168S0100000_22 = new AqS168S0100000_2(h4p, 498);
        h4p.LJFF = XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZIZ.plus(new IDaS68S0100000_7(CoroutineExceptionHandler.LJJJJIZL, h4p, 1))), null, null, new H4I(h4p, aqS168S0100000_22, null), 3);
        return new C44469Hcn(h4p);
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void prepareDataForI18n(WaterMarkBuilder waterMarkBuilder) {
        o.LJIIIZ(waterMarkBuilder, "waterMarkBuilder");
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("WaterMark", new IDLCallbackS106S0200000_7(this, waterMarkBuilder, 5));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void waterMark(WaterMarkBuilder waterMarkBuilder) {
        o.LJIIIZ(waterMarkBuilder, "waterMarkBuilder");
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("WaterMark", new IDLCallbackS106S0200000_7(this, waterMarkBuilder, 6));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void watermarkForTikTokNow(WaterMarkBuilder waterMarkBuilder) {
        o.LJIIIZ(waterMarkBuilder, "waterMarkBuilder");
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("WaterMark", new C44467Hcl(waterMarkBuilder));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void addWaterMarkToImage(InterfaceC45930I0w user, String path, String targetPath) {
        float f;
        String uniqueId;
        int i;
        float f2;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(targetPath, "targetPath");
        if (C1B6.LIZIZ(path)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(path);
            int width = decodeFile.getWidth();
            int height = decodeFile.getHeight();
            float f3 = width;
            float f4 = height;
            float f5 = f3 / f4;
            if (f5 < 0.8f) {
                height = ((int) ((height - width) / 2)) + width;
            } else if (f5 > 1.0f || f5 <= 0.8f) {
                if (f5 > 1.0f) {
                    width = ((int) ((width - height) / 2)) + height;
                } else {
                    width = 0;
                    height = 0;
                }
            }
            Point point = new Point(width, height);
            float f6 = f3 / 750.0f;
            float f7 = f4 / 750.0f;
            if (f6 > f7) {
                f = f7;
            } else {
                f = f6;
            }
            float f8 = 10 * f;
            point.set((int) (point.x - f8), (int) (point.y - f8));
            if (TextUtils.isEmpty(user.getUniqueId())) {
                uniqueId = user.getShortId();
            } else {
                uniqueId = user.getUniqueId();
            }
            String valueOf = String.valueOf(uniqueId);
            int i2 = point.x;
            int i3 = point.y;
            boolean equals = TextUtils.equals(C44172HVg.LJIJ.getCurrentUserID(), user.getUid());
            Bitmap canvasBitmap = decodeFile.copy(Bitmap.Config.ARGB_8888, true);
            decodeFile.recycle();
            Canvas canvas = new Canvas(canvasBitmap);
            if (f6 > f7) {
                f6 = f7;
            }
            Resources resources = C44172HVg.LIZ.getResources();
            o.LJIIIIZZ(resources, "application.resources");
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
            textPaint.setColor(resources.getColor(R.color.bc));
            float f9 = 28 * f6;
            textPaint.setTextSize(f9);
            float f10 = 4 * f6;
            textPaint.setShadowLayer(f10, 0.0f, f6, resources.getColor(R.color.gi));
            int i4 = (int) f9;
            int measureText = (int) textPaint.measureText(valueOf);
            if (equals) {
                i = i4;
            } else {
                i = 0;
            }
            float LIZIZ = AnonymousClass036.LIZIZ(i, i4, i4, measureText) + f10;
            float f11 = (int) (32 * f6);
            canvas.translate(i2 - LIZIZ, i3 - f11);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.to, null);
            o.LJI(decodeResource);
            float f12 = 2;
            canvas.drawBitmap(Bitmap.createScaledBitmap(decodeResource, i4, i4, true), 0.0f, (r12 - i4) / f12, paint);
            if (equals) {
                Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, R.drawable.tw, null);
                o.LJI(decodeResource2);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource2, i4, i4, true);
                float f13 = i4;
                canvas.drawBitmap(createScaledBitmap, f13, (f11 - f13) / f12, paint);
            }
            Bitmap decodeResource3 = BitmapFactory.decodeResource(resources, R.drawable.t7, null);
            o.LJI(decodeResource3);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeResource3, i4, i4, true);
            float f14 = i4;
            if (equals) {
                f2 = f14;
            } else {
                f2 = (f6 * f12) + 0.0f;
            }
            canvas.drawBitmap(createScaledBitmap2, f2 + f14, (f11 - f14) / f12, paint);
            canvas.drawText(valueOf, LIZIZ - measureText, (r12 / 2) - ((textPaint.ascent() + textPaint.descent()) / f12), textPaint);
            o.LJIIIIZZ(canvasBitmap, "canvasBitmap");
            canvasBitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(targetPath)));
            canvasBitmap.recycle();
            return;
        }
        throw new IllegalArgumentException("path must not be exists");
    }
}
