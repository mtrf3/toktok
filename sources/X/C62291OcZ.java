package X;

import Y.IDComparatorS38S0000000_10;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OcZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62291OcZ {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62290OcY.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C62289OcX.LJLIL);
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("feed", "aweme/detail", "detail", "challenge/detail", "collection/detail");

    public static List LIZ(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        if (aweme != null && (textExtra = aweme.getTextExtra()) != null) {
            ArrayList arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 1) {
                    arrayList.add(textExtraStruct);
                }
            }
            List LLILII = ORZ.LLILII(new IDComparatorS38S0000000_10(8), arrayList);
            if (LLILII != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLILII, 10));
                Iterator it = LLILII.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TextExtraStruct) it.next()).getHashTagName());
                }
                return arrayList2;
            }
        }
        return null;
    }

    public static Drawable LIZJ(Activity activity) {
        if (!O3U.LIZ(OI6.LIZ, "ug_resource")) {
            OI6.LIZIZ(null);
            if (activity == null) {
                return null;
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZJ = (int) C74275TDb.LIZ(20.0f);
            c2068389v.LIZIZ = (int) C74275TDb.LIZ(20.0f);
            c2068389v.LIZ = R.raw.icon_arrow_turn_up_right_fill;
            c2068389v.LIZLLL = C79045V0n.LJI(R.attr.dj, activity);
            SY9 LIZ2 = c2068389v.LIZ(activity);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LJI = (int) C74275TDb.LIZ(36.0f);
            c110614Vt.LJII = (int) C74275TDb.LIZ(36.0f);
            c110614Vt.LIZ = C79045V0n.LJI(R.attr.do, activity);
            c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
            LayerDrawable LJIIJ = C26338AVi.LJIIJ(LIZ2, c110614Vt.LIZ(activity));
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZJ = (int) C74275TDb.LIZ(14.0f);
            c2068389v2.LIZIZ = (int) C74275TDb.LIZ(14.0f);
            c2068389v2.LIZ = R.raw.icon_story_star;
            c2068389v2.LIZLLL = C79045V0n.LJI(R.attr.eb, activity);
            SY9 LIZ3 = c2068389v2.LIZ(activity);
            Bitmap createBitmap = Bitmap.createBitmap((int) C74275TDb.LIZ(36.0f), (int) C74275TDb.LIZ(36.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            LJIIJ.setBounds(0, 0, (int) C74275TDb.LIZ(36.0f), (int) C74275TDb.LIZ(36.0f));
            LJIIJ.draw(canvas);
            LIZ3.setBounds((int) C74275TDb.LIZ(22.0f), 0, (int) C74275TDb.LIZ(36.0f), ((int) C74275TDb.LIZ(36.0f)) - ((int) C74275TDb.LIZ(22.0f)));
            LIZ3.draw(canvas);
            return new BitmapDrawable(createBitmap);
        }
        return new BitmapDrawable(BitmapFactory.decodeFile(OI6.LIZ((String) LIZ.getValue(), (String) LIZIZ.getValue())));
    }

    public static OSZ LIZLLL(Aweme aweme) {
        boolean z;
        String aid;
        List LIZ2 = LIZ(aweme);
        String str = null;
        if (aweme != null) {
            str = aweme.getDesc();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        SharingOperationConfig LIZ3 = C62285OcT.LIZ();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        String LIZIZ2 = LIZIZ(LIZ2, str, LIZ3, str2, C4LD.LIZIZ.LJJJJ(aweme));
        if (LIZIZ2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return new OSZ(Boolean.valueOf(z), LIZIZ2);
    }

    public static boolean LJ(String str, String str2) {
        if (str.length() == 0) {
            return false;
        }
        try {
            return PatternProtector.compile(str, 2).matcher(str2).find();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0061, code lost:
    
        if (r18 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.util.List r16, java.lang.String r17, com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62291OcZ.LIZIZ(java.util.List, java.lang.String, com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig, java.lang.String, boolean):java.lang.String");
    }
}
