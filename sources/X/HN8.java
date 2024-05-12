package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HN8 implements HOW {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final java.util.Map<String, String[]> LJ;

    @Override // X.HOW
    public final String[] LIZJ(String str, InterfaceC45930I0w interfaceC45930I0w) {
        return new String[0];
    }

    @Override // X.HOW
    public final /* synthetic */ void LJ(String str, InterfaceC45930I0w interfaceC45930I0w) {
    }

    @Override // X.HOW
    public final HNB LIZLLL() {
        int i = (int) (24 * (this.LIZJ / 1080.0f));
        HNB hnb = new HNB();
        hnb.xOffset = i;
        hnb.yOffset = i;
        hnb.position = VEWaterMarkPosition.BR;
        StringBuilder LIZJ = C06460Ne.LIZJ("WaterMarkPositionConfig xOffset:", i, " yOffset:", i, " videoWidth:");
        LIZJ.append(this.LIZJ);
        H7B.LIZ(X1D.LIZIZ(LIZJ));
        return hnb;
    }

    @Override // X.HOW
    public final void reset() {
        ((HashMap) this.LJ).clear();
    }

    @Override // X.HOW
    public final CreativeInfo LIZIZ() {
        return this.LIZ;
    }

    @Override // X.HOW
    public final void LIZ(boolean z, InterfaceC45930I0w user) {
        o.LJIIIZ(user, "user");
        LJFF(false, user);
    }

    @Override // X.HOW
    public final String[] LJFF(boolean z, InterfaceC45930I0w user) {
        String uniqueId;
        boolean z2;
        int i;
        String str;
        o.LJIIIZ(user, "user");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        if (uniqueId == null) {
            uniqueId = "";
        }
        String LIZJ = Q7L.LIZJ(uniqueId, z);
        String[] strArr = (String[]) ((HashMap) this.LJ).get(LIZJ);
        int i2 = 0;
        if (strArr == null || strArr.length == 0) {
            String filePrefix = C38352F3k.LIZJ(this.LIZIZ);
            if (TextUtils.isEmpty(uniqueId)) {
                H7B.LIZLLL(new IllegalArgumentException("userId is empty"));
                return null;
            }
            File file = new File(C5YW.LIZIZ().LJJIIZ(this.LIZ));
            if (file.exists() || file.mkdirs()) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = this.LIZJ;
            if (i3 == 0 || (i = this.LIZLLL) == 0) {
                return null;
            }
            if (!z2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("provide error ");
                LIZ.append(z2);
                LIZ.append(' ');
                LIZ.append(this.LIZJ);
                LIZ.append(' ');
                LIZ.append(this.LIZLLL);
                H7B.LIZLLL(new IllegalStateException(X1D.LIZIZ(LIZ)));
                return null;
            }
            CreativeInfo creativeInfo = this.LIZ;
            o.LJIIIIZZ(filePrefix, "filePrefix");
            o.LJIIIZ(creativeInfo, "creativeInfo");
            new HN5();
            o.LJIIIIZZ(FestivalService.LIZIZ().LIZ(), "get().getService(IFestiv…::class.java).waterPicDir");
            String text = C76917UGr.LJJII(user);
            o.LJIIIZ(text, "text");
            TypedArray obtainTypedArray = C60903NvH.LJ.getResources().obtainTypedArray(R.array.b5);
            o.LJIIIIZZ(obtainTypedArray, "getApplication().getReso…builtin_watermark_images)");
            int length = obtainTypedArray.length();
            ArrayList arrayList = new ArrayList();
            String LIZIZ = QZZ.LIZIZ('@', text);
            int i4 = 0;
            while (i4 < length) {
                H72 h72 = new H72();
                int resourceId = obtainTypedArray.getResourceId(i4, i2);
                Resources resources = C60903NvH.LJ.getResources();
                o.LJIIIIZZ(resources, "getApplication().getResources()");
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, resourceId, null);
                o.LJIIIIZZ(decodeResource, "decodeResource(resources, resId, null)");
                float min = Math.min(i3 / 1440.0f, i / 1440.0f);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, (int) (455 * min), (int) (94 * min), true);
                o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(logo, w, h, true)");
                if (TextUtils.isEmpty(LIZIZ)) {
                    h72.LIZ = createScaledBitmap;
                } else {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setAntiAlias(true);
                    textPaint.setTypeface(C8HI.LIZJ().LIZLLL("bold"));
                    textPaint.setColor(resources.getColor(R.color.bc));
                    textPaint.setTextSize(56 * min);
                    textPaint.setTextAlign(Paint.Align.LEFT);
                    float f = 10 * min;
                    textPaint.setShadowLayer(f, 0.0f, 0.0f, resources.getColor(R.color.gi));
                    int max = Math.max(createScaledBitmap.getWidth(), ((int) (20 * min)) + ((int) Math.ceil(4 * min)) + ((int) ((5.0f * min) + textPaint.measureText(LIZIZ))));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    o.LJIIIIZZ(fontMetrics, "paint.getFontMetrics()");
                    Bitmap createBitmap = Bitmap.createBitmap(max, (int) (createScaledBitmap.getHeight() + (1 * min) + (fontMetrics.bottom - fontMetrics.top)), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint LIZIZ2 = C6D8.LIZIZ(true);
                    LIZIZ2.setShadowLayer(f, 0.0f, 0.0f, resources.getColor(R.color.gi));
                    canvas.drawBitmap(createScaledBitmap, (max - createScaledBitmap.getWidth()) + 3, 0.0f, LIZIZ2);
                    float LIZJ2 = KL2.LIZJ(C60903NvH.LJ, 4.0f) * min;
                    o.LJI(LIZIZ);
                    canvas.drawText(LIZIZ, max - r11, (createScaledBitmap.getHeight() - fontMetrics.top) - LIZJ2, textPaint);
                    h72.LIZ = createBitmap;
                }
                arrayList.add(h72);
                i4++;
                i2 = 0;
            }
            obtainTypedArray.recycle();
            H72[] h72Arr = (H72[]) arrayList.toArray(new H72[i2]);
            String LJJIIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZ(creativeInfo);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(filePrefix);
            if (z) {
                str = "_leftalign";
            } else {
                str = "_rightalign";
            }
            LIZ2.append(str);
            String[] LIZIZ3 = HN0.LIZIZ(h72Arr, LJJIIZ, X1D.LIZIZ(LIZ2));
            ((HashMap) this.LJ).put(LIZJ, LIZIZ3);
            return LIZIZ3;
        }
        return strArr;
    }

    public HN8(CreativeInfo creativeInfo, String str, int i, int i2) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = new HashMap();
    }
}
