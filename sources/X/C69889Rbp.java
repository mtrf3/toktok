package X;

import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rbp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69889Rbp {
    public static final C62562cu LIZJ(GImage gImage) {
        o.LJIIIZ(gImage, "<this>");
        return new C62562cu(gImage.getUrls());
    }

    public static final C62562cu LIZLLL(GImage gImage) {
        List<String> thumbUrls = gImage.getThumbUrls();
        if (thumbUrls == null || thumbUrls.isEmpty()) {
            return LIZJ(gImage);
        }
        return new C62562cu(gImage.getThumbUrls());
    }

    public static /* synthetic */ String LIZIZ(PromotionView promotionView, String str) {
        int i;
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return LIZ(promotionView, str, i);
    }

    public static final String LJ(PromotionView promotionView, int i) {
        List<PromotionItem> LLILLL;
        o.LJIIIZ(promotionView, "<this>");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null && (LLILLL = ORZ.LLILLL(list, i)) != null) {
            for (PromotionItem promotionItem : LLILLL) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                String voucherId = promotionItem.getVoucherId();
                if (voucherId == null) {
                    voucherId = "-1";
                }
                sb.append(voucherId);
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LJFF(PromotionView promotionView, int i) {
        List<PromotionItem> LLILLL;
        o.LJIIIZ(promotionView, "<this>");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null && (LLILLL = ORZ.LLILLL(list, i)) != null) {
            for (PromotionItem promotionItem : LLILLL) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getName());
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LJI(PromotionView promotionView, int i) {
        List<PromotionItem> LLILLL;
        o.LJIIIZ(promotionView, "<this>");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null && (LLILLL = ORZ.LLILLL(list, i)) != null) {
            for (PromotionItem promotionItem : LLILLL) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getId());
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LJII(PromotionView promotionView, int i) {
        List<PromotionItem> LLILLL;
        o.LJIIIZ(promotionView, "<this>");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null && (LLILLL = ORZ.LLILLL(list, i)) != null) {
            for (PromotionItem promotionItem : LLILLL) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getType());
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LIZ(PromotionView promotionView, String str, int i) {
        List LLILLL;
        Object obj;
        List<PromotionItem> list = promotionView.promotion_items;
        if (list != null && (LLILLL = ORZ.LLILLL(list, i)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = LLILLL.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII = C27739Aud.LJII(((PromotionItem) it.next()).getLog_extra());
                if (LJII != null && (obj = LJII.get(str)) != null) {
                    arrayList.add(obj);
                }
            }
            return ORZ.LLD(arrayList, ",", null, null, C69890Rbq.LJLIL, 30);
        }
        return "";
    }
}
