package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HN9 implements HOW {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final java.util.Map<String, String[]> LJ;

    @Override // X.HOW
    public final HNB LIZLLL() {
        int i = (int) (24 * (this.LIZJ / 1080.0f));
        HNB hnb = new HNB();
        hnb.xOffset = i;
        hnb.yOffset = i;
        hnb.position = VEWaterMarkPosition.TL_BR;
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
        LJFF(z, user);
    }

    @Override // X.HOW
    public final String[] LIZJ(String text, InterfaceC45930I0w user) {
        boolean z;
        int i;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(user, "user");
        if (TextUtils.equals(C44172HVg.LJIJ.getCurrentUserID(), user.getUid()) && !TextUtils.isEmpty(text)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(text);
            LIZ.append(this.LIZJ);
            LIZ.append(this.LIZLLL);
            LIZ.append(SettingServiceImpl.LIZ().getAppLanguage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            String[] strArr = (String[]) ((HashMap) this.LJ).get(LIZIZ);
            if (strArr != null && strArr.length > 0) {
                return strArr;
            }
            String filePrefix = C38352F3k.LIZJ(LIZIZ);
            File file = new File(C41326GJu.LIZ(this.LIZ));
            if (file.exists() || file.mkdirs()) {
                z = true;
            } else {
                z = false;
            }
            int i2 = this.LIZJ;
            if (i2 != 0 && (i = this.LIZLLL) != 0) {
                if (!z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("provide error ");
                    LIZ2.append(z);
                    LIZ2.append(' ');
                    LIZ2.append(this.LIZJ);
                    LIZ2.append(' ');
                    LIZ2.append(this.LIZLLL);
                    C170666ms.LIZJ(new IllegalStateException(X1D.LIZIZ(LIZ2)));
                    return null;
                }
                CreativeInfo creativeInfo = this.LIZ;
                o.LJIIIIZZ(filePrefix, "filePrefix");
                String[] LJJJJLL = C76917UGr.LJJJJLL(creativeInfo, i2, i, text, filePrefix);
                ((HashMap) this.LJ).put(LIZIZ, LJJJJLL);
                return LJJJJLL;
            }
        }
        return null;
    }

    @Override // X.HOW
    public final void LJ(String text, InterfaceC45930I0w user) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(user, "user");
        LIZJ(text, user);
    }

    @Override // X.HOW
    public final String[] LJFF(boolean z, InterfaceC45930I0w user) {
        String uniqueId;
        boolean z2;
        int i;
        int i2;
        int width;
        int i3;
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
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String filePrefix = C38352F3k.LIZJ(this.LIZIZ);
        if (TextUtils.isEmpty(uniqueId)) {
            C170666ms.LIZJ(new IllegalArgumentException("userId is empty"));
            return null;
        }
        File file = new File(C5YW.LIZIZ().LJJIIZ(this.LIZ));
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.LIZJ;
        if (i4 == 0 || (i = this.LIZLLL) == 0) {
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
            C170666ms.LIZJ(new IllegalStateException(X1D.LIZIZ(LIZ)));
            return null;
        }
        CreativeInfo creativeInfo = this.LIZ;
        o.LJIIIIZZ(filePrefix, "filePrefix");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        new HN5();
        o.LJIIIIZZ(FestivalService.LIZIZ().LIZ(), "get().getService(IFestiv…::class.java).waterPicDir");
        String text = C76917UGr.LJJII(user);
        boolean LIZIZ = C41326GJu.LIZIZ(user);
        o.LJIIIZ(text, "text");
        int[] iArr = new int[1];
        ArrayList arrayList = new ArrayList();
        String LIZIZ2 = QZZ.LIZIZ('@', text);
        H72 h72 = new H72();
        if (z) {
            iArr[0] = R.drawable.c5e;
        } else {
            iArr[0] = R.drawable.c5f;
        }
        int i5 = iArr[0];
        Resources resources = C44172HVg.LIZ.getResources();
        o.LJIIIIZZ(resources, "application.getResources()");
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i5, null);
        o.LJIIIIZZ(decodeResource, "decodeResource(resources, resId, null)");
        float min = Math.min(i4 / 750.0f, i / 750.0f);
        Resources resources2 = C44172HVg.LIZ.getResources();
        o.LJIIIIZZ(resources2, "application.getResources()");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, (int) (176 * min), (int) (72 * min), true);
        o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(logo, w, h, true)");
        if (TextUtils.isEmpty(LIZIZ2)) {
            h72.LIZ = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            textPaint.setColor(resources2.getColor(R.color.s9));
            float f = 20 * min;
            textPaint.setTextSize(f);
            float LIZJ2 = KL2.LIZJ(C44172HVg.LIZ, 1.0f);
            float f2 = 4;
            float f3 = f2 * LIZJ2;
            textPaint.setShadowLayer(0.0f, LIZJ2, f3, resources2.getColor(R.color.gi));
            int i6 = (int) f;
            int measureText = (int) ((5.0f * min) + textPaint.measureText(LIZIZ2));
            int width2 = createScaledBitmap.getWidth();
            if (LIZIZ) {
                i2 = i6 + ((int) Math.ceil(f2 * min));
            } else {
                i2 = 0;
            }
            int max = Math.max(width2, i2 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) ((28 * min) + createScaledBitmap.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint LIZIZ3 = C6D8.LIZIZ(true);
            LIZIZ3.setShadowLayer(0.0f, LIZJ2, f3, resources2.getColor(R.color.gi));
            if (z) {
                width = 0;
            } else {
                width = (max - createScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, LIZIZ3);
            o.LJI(LIZIZ2);
            if (z) {
                i3 = 0;
            } else {
                i3 = max - measureText;
            }
            canvas.drawText(LIZIZ2, i3, (min * f2) + (createScaledBitmap.getHeight() - textPaint.ascent()), textPaint);
            h72.LIZ = createBitmap;
        }
        arrayList.add(h72);
        H72[] h72Arr = (H72[]) arrayList.toArray(new H72[0]);
        String LJJIIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZ(creativeInfo);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(filePrefix);
        if (z) {
            str = "_leftalign";
        } else {
            str = "_rightalign";
        }
        LIZ2.append(str);
        String[] LIZIZ4 = HN0.LIZIZ(h72Arr, LJJIIZ, X1D.LIZIZ(LIZ2));
        ((HashMap) this.LJ).put(LIZJ, LIZIZ4);
        return LIZIZ4;
    }

    public HN9(CreativeInfo creativeInfo, String str, int i, int i2, int i3) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = new HashMap();
    }
}
