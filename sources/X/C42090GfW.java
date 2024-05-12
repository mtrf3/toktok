package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GfW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42090GfW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(Object obj) {
        String str;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).LJI();
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((BaseShortVideoContext) obj).getCreationId();
        }
        if (!(obj instanceof LinkedHashMap)) {
            return null;
        }
        Object obj2 = ((java.util.Map) obj).get("creation_id");
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            return str;
        }
        return "";
    }

    public static String LIZLLL(Object obj) {
        String str;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).enterFrom;
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((VideoPublishEditModel) obj).enterFrom;
        }
        if (!(obj instanceof LinkedHashMap)) {
            return null;
        }
        Object obj2 = ((java.util.Map) obj).get("enter_from");
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            return str;
        }
        return "";
    }

    public static String LJ(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            return LJFF(videoPublishEditModel.newDraftId, videoPublishEditModel.isFromCrash(), videoPublishEditModel.isFromRestoreRecover, videoPublishEditModel.mIsFromDraft);
        }
        if (obj instanceof LinkedHashMap) {
            java.util.Map map = (java.util.Map) obj;
            Object obj2 = map.get("is_from_crash");
            String str = null;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            boolean LJ = o.LJ(obj2, "true");
            Object obj3 = map.get("is_from_restore_recover");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            boolean LJ2 = o.LJ(obj3, "true");
            Object obj4 = map.get("is_from_draft");
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            boolean LJ3 = o.LJ(obj4, "true");
            Object obj5 = map.get("new_draft_id");
            if (obj5 instanceof String) {
                str = (String) obj5;
            }
            return LJFF(str, LJ, LJ2, LJ3);
        }
        return "other";
    }

    public static String LJI(Object obj, String str) {
        String str2;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).shootWay;
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((BaseShortVideoContext) obj).mShootWay;
        }
        if (!(obj instanceof LinkedHashMap)) {
            return str;
        }
        Object obj2 = ((java.util.Map) obj).get("shoot_way");
        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
            return str2;
        }
        return "";
    }

    public static String LIZ(String lastData, String newData, boolean z) {
        o.LJIIIZ(lastData, "lastData");
        o.LJIIIZ(newData, "newData");
        if (z && lastData.length() > 0 && !o.LJ(newData, lastData)) {
            return C00F.LIZIZ(lastData, '-', newData);
        }
        return null;
    }

    public static String LIZIZ(List lastData, List newData, boolean z) {
        o.LJIIIZ(lastData, "lastData");
        o.LJIIIZ(newData, "newData");
        if (z && !newData.containsAll(lastData)) {
            String LLD = ORZ.LLD(ORZ.LLIIIILZ(lastData, newData), ",", null, null, null, 62);
            if (LLD.length() > 0) {
                return LLD;
            }
        }
        return null;
    }

    public static String LJFF(String str, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (!z2) {
                return "crash_return_record";
            }
            return "crash_return_edit";
        }
        if (z3 || (C78685UuP.LJJJZ(str) && !z)) {
            return "draft";
        }
        return "other";
    }
}
