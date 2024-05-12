package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.BeautifyInfo;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HXk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44228HXk {
    public static int LIZIZ;
    public static ComposerBeautyBuriedInfo LIZJ;
    public static MBeautyStateInfo LIZLLL;
    public static String LIZ = "";
    public static String LJ = "";
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(HY5.LJLIL);
    public static final CopyOnWriteArrayList<ComposerBeautyBuriedInfo> LJI = new CopyOnWriteArrayList<>();

    public static final void LJIIJ() {
        LIZJ = null;
        LJ = "";
        LIZ = "";
        LJI.clear();
    }

    public static final int LIZJ() {
        if (((Boolean) LJFF.getValue()).booleanValue()) {
            MBeautyStateInfo mBeautyStateInfo = LIZLLL;
            if (mBeautyStateInfo == null) {
                return 0;
            }
            return mBeautyStateInfo.getBeautyStatus();
        }
        Iterator<ComposerBeautyBuriedInfo> it = LJI.iterator();
        int i = 2;
        while (it.hasNext()) {
            ComposerBeautyBuriedInfo next = it.next();
            if (next.getBeautifyUsed() == 1) {
                i = 1;
            } else if (next.getBeautifyUsed() == 0) {
                i = 0;
            }
        }
        return i;
    }

    public static final int LJFF() {
        return LIZIZ;
    }

    public static final String LJI() {
        return LIZ;
    }

    public static final String LJII(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        List<BeautifyInfo> list;
        String json;
        if (o.LJ(composerBeautyBuriedInfo, LIZJ)) {
            json = LJ;
        } else {
            if (composerBeautyBuriedInfo != null) {
                LJI.add(composerBeautyBuriedInfo);
            }
            Gson LIZ2 = C60903NvH.LJIIJJI().LIZ();
            if (composerBeautyBuriedInfo != null) {
                list = composerBeautyBuriedInfo.getBeautifyInfo();
            } else {
                list = null;
            }
            json = GsonProtectorUtils.toJson(LIZ2, list);
        }
        o.LJIIIIZZ(json, "this");
        LJ = json;
        if (composerBeautyBuriedInfo != null) {
            LIZJ = ComposerBeautyBuriedInfo.copy$default(composerBeautyBuriedInfo, 0, 0, 0, null, 15, null);
        }
        return json;
    }

    public static final int LJIIIIZZ(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo != null) {
            return composerBeautyBuriedInfo.getModeChosen();
        }
        return 0;
    }

    public static boolean LJIIIZ(ComposerBeauty composerBeauty) {
        float f;
        float f2;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        List<ComposerBeautyExtraBeautify.ItemsBean> items2;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean2;
        List<ComposerBeautyExtraBeautify.ItemsBean> items3;
        ComposerBeautyExtraBeautify beautifyExtra = composerBeauty.getBeautifyExtra();
        if (beautifyExtra != null && (items3 = beautifyExtra.getItems()) != null && items3.isEmpty()) {
            return false;
        }
        ComposerBeautyExtraBeautify beautifyExtra2 = composerBeauty.getBeautifyExtra();
        if (beautifyExtra2 != null && (items2 = beautifyExtra2.getItems()) != null && (itemsBean2 = (ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items2, 0)) != null) {
            f = itemsBean2.getMax();
        } else {
            f = 100.0f;
        }
        ComposerBeautyExtraBeautify beautifyExtra3 = composerBeauty.getBeautifyExtra();
        if (beautifyExtra3 != null && (items = beautifyExtra3.getItems()) != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)) != null) {
            f2 = itemsBean.getValue();
        } else {
            f2 = 0.0f;
        }
        if (((int) ((100 / f) * f2)) != composerBeauty.getDefaultProgress()) {
            return true;
        }
        return false;
    }

    public static void LIZ(ComposerBeautyBuriedInfo info, MBeautyStateInfo beautyInfo) {
        o.LJIIIZ(info, "info");
        o.LJIIIZ(beautyInfo, "beautyInfo");
        String LJII = LJII(info);
        C145995oB LIZIZ2 = GFJ.LIZIZ(LIZJ(), "beautify_used");
        LIZIZ2.LIZ(info.getModeChosen(), "is_composer");
        LIZIZ2.LJI("beautify_info", LJII);
        GXR.LIZ("perf_record_video", LIZIZ2.LIZ);
        if (LIZ.length() == 0) {
            LIZ = LJII;
        }
        LIZLLL = beautyInfo;
    }

    public static final int LIZIZ(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo) {
        if (composerBeautyBuriedInfo != null && composerBeautyBuriedInfo.getBeautyStatus() == 1) {
            return 1;
        }
        if (mBeautyStateInfo != null && mBeautyStateInfo.getBeautyStatus() == 1) {
            return 1;
        }
        return 0;
    }
}
