package X;

import Y.IDCSpanS0S1100000_1;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.compliance.api.model.UnifiedModeTextData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GIr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41297GIr {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZJ(Activity context, CopyWritingInfo copyWritingInfo, UnifiedModeTextData unifiedModeTextData) {
        List<String> itemList;
        List<String> itemLinkList;
        String str;
        boolean z;
        o.LJIIIZ(context, "context");
        String str2 = null;
        if (copyWritingInfo != null) {
            str2 = copyWritingInfo.getSubtext();
        } else if (unifiedModeTextData != null) {
            str2 = unifiedModeTextData.getDescription();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (copyWritingInfo != null) {
            itemList = copyWritingInfo.getPolicyList();
            itemLinkList = copyWritingInfo.getPolicyLinkList();
        } else {
            if (unifiedModeTextData != null) {
                itemList = unifiedModeTextData.getItemList();
                itemLinkList = unifiedModeTextData.getItemLinkList();
            }
            return spannableStringBuilder;
        }
        if (itemList != null && !itemList.isEmpty()) {
            int i = 0;
            for (String str3 : itemList) {
                int i2 = i + 1;
                if (itemLinkList == null || (str = (String) ListProtector.get(itemLinkList, i)) == null) {
                    str = "";
                }
                if (unifiedModeTextData != null) {
                    z = true;
                } else {
                    z = false;
                }
                spannableStringBuilder = LIZIZ(spannableStringBuilder, str3, str, context, z, i);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence LJ(int i, String text, String str) {
        o.LJIIIZ(text, "text");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        return ujb.o.LJJJJZ(text, str, new BDDateFormat("LL").LIZIZ(i * 1000, locale), false);
    }

    public static SpannableStringBuilder LIZ(Activity activity, String str, List list, List list2) {
        String str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                String str3 = (String) it.next();
                if (list2 == null || (str2 = (String) ListProtector.get(list2, i)) == null) {
                    str2 = "";
                }
                spannableStringBuilder = LIZIZ(spannableStringBuilder, str3, str2, activity, false, i);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZIZ(SpannableStringBuilder spannableStringBuilder, String str, final String str2, final Activity activity, final boolean z, final int i) {
        boolean z2 = false;
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, "%s", 0, false, 6);
        if (LJJLIIIJL == -1) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder replace = spannableStringBuilder.replace(LJJLIIIJL, LJJLIIIJL + 2, (CharSequence) str);
        if (ujb.o.LJJJJJL(str2)) {
            z2 = true;
        }
        if (z2) {
            replace.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
            return replace;
        }
        replace.setSpan(new ClickableSpan() { // from class: X.7Ek
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//webview");
                buildRoute.withParam("url", str2);
                buildRoute.open();
                if (z) {
                    C188727au c188727au = new C188727au();
                    c188727au.LIZLLL(i, "pa_hyperlink_click_position");
                    FMX.LJIIL("click_pa_setting_hyper_link", c188727au.LIZ);
                } else {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LIZLLL(i, "hyperlink_val");
                    FMX.LJIIL("click_pa_prompt_hyperlink", c188727au2.LIZ);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setUnderlineText(false);
            }
        }, LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        replace.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.go, activity)), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        replace.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        return replace;
    }

    public static SpannableStringBuilder LIZLLL(Context context, String str, List list, List list2, Integer num, Boolean bool) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (list2 == null || list2.isEmpty()) {
            return spannableStringBuilder;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                String str2 = (String) it.next();
                String str3 = (String) ListProtector.get(list2, i);
                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, "{%s}", 0, false, 6);
                if (LJJLIIIJL != -1) {
                    spannableStringBuilder = spannableStringBuilder.replace(LJJLIIIJL, 4 + LJJLIIIJL, (CharSequence) str2);
                    if (str3 == null || ujb.o.LJJJJJL(str3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
                    } else {
                        spannableStringBuilder.setSpan(new IDCSpanS0S1100000_1(context, str3, 1), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
                        if (num != null) {
                            num.intValue();
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(num.intValue(), context)), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
                        }
                    }
                }
                i = i2;
            }
        }
        return spannableStringBuilder;
    }
}
