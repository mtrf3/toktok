package X;

import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ae7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26715Ae7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(LinearLayout linearLayout, List list, IDescriptionBlockStyle style) {
        String str;
        String str2;
        o.LJIIIZ(style, "style");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserRightDescBlock userRightDescBlock = (UserRightDescBlock) it.next();
            Integer num = userRightDescBlock.type;
            if (num != null) {
                if (num.intValue() == 1) {
                    String str3 = userRightDescBlock.plainDescription;
                    if (str3 != null) {
                        int descFont = style.getDescFont();
                        int descTextColor = style.getDescTextColor();
                        Context context = linearLayout.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tuxTextView.setText(str3);
                        tuxTextView.setTuxFont(descFont);
                        tuxTextView.setTextColorRes(descTextColor);
                        C26338AVi.LJI(tuxTextView, 0, 0, 0, AnonymousClass391.LIZJ(8), false, 16);
                        linearLayout.addView(tuxTextView);
                    }
                } else if (num.intValue() == 2) {
                    List<Icon> list2 = userRightDescBlock.logos;
                    if (list2 != null) {
                        Context context2 = linearLayout.getContext();
                        o.LJIIIIZZ(context2, "view.context");
                        C119774mz c119774mz = new C119774mz(context2, null, 6);
                        c119774mz.setGravity(-1);
                        if (list2.isEmpty()) {
                            c119774mz.setVisibility(8);
                        } else {
                            c119774mz.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            c119774mz.setVisibility(0);
                            AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(c119774mz, (C119774mz) list2, (List<Icon>) 43);
                            if (c119774mz.getWidth() == 0) {
                                c119774mz.post(new ARunnableS40S0100000_4((Object) aqS151S0200000_4, 130));
                            } else {
                                aqS151S0200000_4.invoke();
                            }
                            linearLayout.addView(c119774mz);
                        }
                    }
                } else if (num.intValue() == 3) {
                    LinkRichText linkRichText = userRightDescBlock.mixLinkDescription;
                    if (linkRichText != null) {
                        int descFont2 = style.getDescFont();
                        int descTextColor2 = style.getDescTextColor();
                        Context context3 = linearLayout.getContext();
                        o.LJIIIIZZ(context3, "view.context");
                        TuxTextView tuxTextView2 = new TuxTextView(context3, null, 6, 0);
                        ArrayList arrayList = new ArrayList();
                        HashMap<String, LinkText> hashMap = linkRichText.arguments;
                        if (hashMap != null) {
                            Iterator<String> it2 = hashMap.keySet().iterator();
                            while (it2.hasNext()) {
                                LinkText linkText = linkRichText.arguments.get(it2.next());
                                if (linkText != null && (str = linkText.name) != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                        tuxTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        Context context4 = tuxTextView2.getContext();
                        o.LJIIIIZZ(context4, "context");
                        tuxTextView2.setText(RichTextUtil.LIZJ(richTextUtil, context4, linkRichText, null, 0, true, null, new AqS170S0100000_4(tuxTextView2, 1138), 40));
                        tuxTextView2.setTuxFont(descFont2);
                        tuxTextView2.setTextColorRes(descTextColor2);
                        C26338AVi.LJI(tuxTextView2, 0, 0, 0, AnonymousClass391.LIZJ(8), false, 16);
                        tuxTextView2.setClickable(true);
                        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                        linearLayout.addView(tuxTextView2);
                        if (!arrayList.isEmpty()) {
                            C78946Uyc.LJJIIJZLJL(tuxTextView2, new C70918RsQ(0), new AqS151S0100000_1(arrayList, (ArrayList<String>) 966), new AqS170S0100000_4(arrayList, (ArrayList<String>) 1139));
                        }
                    }
                } else if (num != null) {
                    if (num.intValue() == 4) {
                        LinkText linkText2 = userRightDescBlock.linkText;
                        if (linkText2 != null) {
                            int linkFont = style.getLinkFont();
                            int chevron = style.getChevron();
                            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(linearLayout.getContext()), R.layout.zt, linearLayout, false);
                            ((TextView) LLLLIILL.findViewById(R.id.ftj)).setText(linkText2.text);
                            ((TuxTextView) LLLLIILL.findViewById(R.id.ftj)).setTuxFont(linkFont);
                            TextView textView = (TextView) LLLLIILL.findViewById(R.id.ftj);
                            Context context5 = linearLayout.getContext();
                            o.LJIIIIZZ(context5, "view.context");
                            textView.setTextColor(C78915Uy7.LJIL(context5, linkText2.textColor));
                            ((TuxIconView) LLLLIILL.findViewById(R.id.ba4)).setIconRes(chevron);
                            TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.ba4);
                            Context context6 = linearLayout.getContext();
                            o.LJIIIIZZ(context6, "view.context");
                            tuxIconView.setTintColor(C78915Uy7.LJIL(context6, linkText2.textColor));
                            if (o.LJ(linkText2.showArrow, Boolean.TRUE)) {
                                ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.ba4);
                                o.LJIIIIZZ(imageView, "linkTextView.chevron");
                                imageView.setVisibility(0);
                            }
                            if (linkText2.link != null) {
                                C16880lQ.LJIIJ(new Au2S10S0300000_4(linearLayout, linkText2, LLLLIILL, 12), LLLLIILL);
                            }
                            linearLayout.addView(LLLLIILL);
                            C78946Uyc.LJJIIJZLJL(LLLLIILL, new C70918RsQ(0), new AqS154S0100000_4(linkText2, 1178), new AqS170S0100000_4(linkText2, 1141));
                        }
                    } else if (num.intValue() == 5 && (str2 = userRightDescBlock.plainDescription) != null) {
                        int descFont3 = style.getDescFont();
                        int descTextColor3 = style.getDescTextColor();
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        Context context7 = linearLayout.getContext();
                        o.LJIIIIZZ(context7, "view.context");
                        TuxIconView tuxIconView2 = new TuxIconView(context7, null, 0, 6, null);
                        tuxIconView2.setLayoutParams(layoutParams);
                        tuxIconView2.setIconRes(R.drawable.adw);
                        tuxIconView2.setTintColorRes(R.attr.c3);
                        tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                        tuxIconView2.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                        Context context8 = linearLayout.getContext();
                        o.LJIIIIZZ(context8, "view.context");
                        TuxTextView tuxTextView3 = new TuxTextView(context8, null, 6, 0);
                        tuxTextView3.setLayoutParams(layoutParams);
                        tuxTextView3.setText(str2);
                        tuxTextView3.setTuxFont(descFont3);
                        tuxTextView3.setTextColorRes(descTextColor3);
                        C26338AVi.LJI(tuxTextView3, C1FJ.LIZIZ(4), 0, 0, 0, false, 16);
                        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        C26338AVi.LJI(linearLayout2, 0, 0, 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), false, 16);
                        linearLayout2.addView(tuxIconView2);
                        linearLayout2.addView(tuxTextView3);
                        linearLayout.addView(linearLayout2);
                    }
                }
            }
        }
    }

    public static void LIZ(LinearLayout linearLayout, String str, Integer num, Integer num2, InterfaceC65784Pro interfaceC65784Pro) {
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "container.context");
        View LIZ2 = C27531ArH.LIZ(R.layout.xt, context, linearLayout, false);
        TuxTextView tuxTextView = (TuxTextView) LIZ2.findViewById(R.id.ftj);
        if (tuxTextView != null) {
            if (str != null) {
                tuxTextView.setText(str);
            }
            if (num2 != null) {
                tuxTextView.setTextColorRes(num2.intValue());
            }
            if (num != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
        }
        linearLayout.addView(LIZ2);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(interfaceC65784Pro, 271), LIZ2);
    }
}
