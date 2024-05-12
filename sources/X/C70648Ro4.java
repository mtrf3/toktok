package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS3S0002000_2;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70648Ro4 {
    public static View LIZJ(Context context, PromotionItem promotionItem, EnumC70206Rgw pos, int i) {
        o.LJIIIZ(promotionItem, "promotionItem");
        o.LJIIIZ(pos, "pos");
        Integer style = promotionItem.getStyle();
        if (style == null || style.intValue() != 8) {
            C70649Ro5 c70649Ro5 = new C70649Ro5(context, null, 6);
            c70649Ro5.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            new AqS143S0200000_12(promotionItem, pos, 42).invoke(c70649Ro5);
            c70649Ro5.setTagUi(RUQ.LIZ(promotionItem, pos));
            return c70649Ro5;
        }
        C5GH c5gh = new C5GH(context);
        c5gh.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        new AqS27S0001000_2(i, 1).invoke(c5gh);
        String name = promotionItem.getName();
        if (name == null) {
            return c5gh;
        }
        c5gh.setTagText(name);
        return c5gh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.4mz, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.AqS3S0002000_2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.AqS143S0200000_12] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, java.lang.Object, X.5GH] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.5GG, android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, java.lang.Object, X.Ro5] */
    public static void LIZ(C119774mz c119774mz, List promotionItems, EnumC70206Rgw pos, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3;
        int i4;
        ?? c5gh;
        ViewGroup.MarginLayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams layoutParams2;
        if ((i2 & 4) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            marginLayoutParams = null;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        o.LJIIIZ(c119774mz, "<this>");
        o.LJIIIZ(promotionItems, "promotionItems");
        o.LJIIIZ(pos, "pos");
        boolean z = !promotionItems.isEmpty();
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        c119774mz.setVisibility(i4);
        if (!z) {
            return;
        }
        c119774mz.removeAllViews();
        Iterator it = promotionItems.iterator();
        while (it.hasNext()) {
            PromotionItem promotionItem = (PromotionItem) it.next();
            Integer style = promotionItem.getStyle();
            if (style != null) {
                if (style.intValue() == 33) {
                    Context context = c119774mz.getContext();
                    o.LJIIIIZZ(context, "context");
                    c5gh = new C5GG(context);
                    if (marginLayoutParams != null) {
                        marginLayoutParams2 = marginLayoutParams;
                    } else {
                        marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    }
                    c5gh.setLayoutParams(marginLayoutParams2);
                    String name = promotionItem.getName();
                    if (name != null) {
                        c5gh.setText(name);
                    }
                } else if (style.intValue() == 8) {
                    Context context2 = c119774mz.getContext();
                    o.LJIIIIZZ(context2, "context");
                    c5gh = new C5GH(context2);
                    if (marginLayoutParams != null) {
                        layoutParams = marginLayoutParams;
                    } else {
                        layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    }
                    c5gh.setLayoutParams(layoutParams);
                    new AqS3S0002000_2(0, i, 0).invoke(c5gh);
                    String name2 = promotionItem.getName();
                    if (name2 != null) {
                        c5gh.setTagText(name2);
                    }
                }
                c119774mz.addView(c5gh);
            }
            Context context3 = c119774mz.getContext();
            o.LJIIIIZZ(context3, "context");
            c5gh = new C70649Ro5(context3, null, 6);
            if (marginLayoutParams != null) {
                layoutParams2 = marginLayoutParams;
            } else {
                layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            }
            c5gh.setLayoutParams(layoutParams2);
            new AqS143S0200000_12(promotionItem, pos, 41).invoke(c5gh);
            c5gh.setTagUi(RUQ.LIZ(promotionItem, pos));
            Integer type = promotionItem.getType();
            if (type != null && type.intValue() == 3) {
                c119774mz.setMaxTagLines(i3);
            }
            c119774mz.addView(c5gh);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.AqS61S0201000_12] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5GG, android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, java.lang.Object, X.Ro5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, java.lang.Object, android.view.ViewGroup] */
    public static final void LIZIZ(ViewGroup viewGroup, List<PromotionItem> promotionItems, EnumC70206Rgw pos, ViewGroup.MarginLayoutParams marginLayoutParams, int i, java.util.Map<Integer, Integer> map) {
        int i2;
        ?? c5gg;
        o.LJIIIZ(viewGroup, "<this>");
        o.LJIIIZ(promotionItems, "promotionItems");
        o.LJIIIZ(pos, "pos");
        ArrayList arrayList = (ArrayList) promotionItems;
        boolean z = !arrayList.isEmpty();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        if (!z) {
            return;
        }
        viewGroup.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PromotionItem promotionItem = (PromotionItem) it.next();
            Integer style = promotionItem.getStyle();
            if (style == null || style.intValue() != 33) {
                Context context = viewGroup.getContext();
                o.LJIIIIZZ(context, "context");
                c5gg = new C70649Ro5(context, null, 6);
                c5gg.setLayoutParams(marginLayoutParams);
                new AqS61S0201000_12((java.util.Map) map, (java.util.Map<Integer, Integer>) promotionItem, (PromotionItem) i, 5).invoke(c5gg);
                c5gg.setTagUiV1(RUQ.LIZIZ(promotionItem, pos));
            } else {
                Context context2 = viewGroup.getContext();
                o.LJIIIIZZ(context2, "context");
                c5gg = new C5GG(context2);
                c5gg.setLayoutParams(marginLayoutParams);
                String name = promotionItem.getName();
                if (name != null) {
                    c5gg.setText(name);
                }
            }
            viewGroup.addView(c5gg);
        }
    }

    public static final C70649Ro5 LIZLLL(Context context, PromotionItem promotionItem, EnumC70206Rgw pos, ViewGroup.MarginLayoutParams marginLayoutParams, Integer num, int i, java.util.Map map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(pos, "pos");
        C70649Ro5 c70649Ro5 = new C70649Ro5(context, null, 6);
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        if (num != null) {
            marginLayoutParams.setMarginEnd(num.intValue());
        }
        c70649Ro5.setLayoutParams(marginLayoutParams);
        new AqS61S0201000_12(map, (java.util.Map<Integer, Integer>) promotionItem, (PromotionItem) i, 6).invoke(c70649Ro5);
        c70649Ro5.setTagUiV1(RUQ.LIZIZ(promotionItem, pos));
        return c70649Ro5;
    }
}
