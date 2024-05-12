package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AjD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27031AjD extends AbstractViewOnClickListenerC27027Aj9 {
    public final TextView LJLILLLLZI;

    public C27031AjD(View view) {
        super(view);
        View findViewById = this.itemView.findViewById(R.id.m1j);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_cand_text)");
        this.LJLILLLLZI = (TextView) findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC27027Aj9
    public final void L(CandInputData candInputData, int i, ViewStyle viewStyle, String str) {
        List<ViewItem> list;
        Integer num;
        List<ViewItem> list2;
        ViewItem viewItem;
        List<ViewItem> list3;
        ViewItem viewItem2;
        String str2;
        List<ViewItem> list4;
        ViewItem viewItem3;
        List<ViewItem> list5;
        ViewItem viewItem4;
        List<ViewItem> list6;
        ViewItem viewItem5;
        String str3;
        List<ViewItem> list7;
        ViewItem viewItem6;
        List<ViewItem> list8;
        ViewItem viewItem7;
        List<ViewItem> list9;
        ViewItem viewItem8;
        String str4;
        String str5 = null;
        if (candInputData == null || (list = candInputData.viewItems) == null || list.isEmpty()) {
            return;
        }
        if (viewStyle != null) {
            num = viewStyle.viewItemHighlightMode;
        } else {
            num = null;
        }
        String str6 = "";
        if (num != null) {
            Integer num2 = viewStyle.viewItemHighlightMode;
            int ordinal = EnumC27032AjE.DEFAULTMODE.ordinal();
            if (num2 == null || num2.intValue() != ordinal) {
                int ordinal2 = EnumC27032AjE.KEYWORDMODE.ordinal();
                if (num2 == null || num2.intValue() != ordinal2) {
                    int ordinal3 = EnumC27032AjE.DISABLEMODE.ordinal();
                    if (num2 == null || num2.intValue() != ordinal3) {
                        TextView textView = this.LJLILLLLZI;
                        if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) ORZ.LJLLLLLL(0, list9)) != null && (str4 = viewItem8.text) != null) {
                            str6 = str4;
                        }
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        CharSequence LIZ = C92153jX.LIZ(str, null, null, str6, context);
                        if (LIZ == null) {
                            if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) ORZ.LJLLLLLL(0, list8)) != null) {
                                str5 = viewItem7.text;
                            }
                            LIZ = str5;
                        }
                        textView.setText(LIZ);
                        return;
                    }
                    this.LJLILLLLZI.setTextColor(R.attr.gv);
                    TextView textView2 = this.LJLILLLLZI;
                    if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) ORZ.LJLLLLLL(0, list7)) != null) {
                        str5 = viewItem6.text;
                    }
                    textView2.setText(str5);
                    return;
                }
                TextView textView3 = this.LJLILLLLZI;
                if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) ORZ.LJLLLLLL(0, list6)) != null && (str3 = viewItem5.text) != null) {
                    str6 = str3;
                }
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                CharSequence LIZ2 = C92153jX.LIZ(str, null, null, str6, context2);
                if (LIZ2 == null) {
                    if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) ORZ.LJLLLLLL(0, list5)) != null) {
                        str5 = viewItem4.text;
                    }
                    LIZ2 = str5;
                }
                textView3.setText(LIZ2);
                return;
            }
            TextView textView4 = this.LJLILLLLZI;
            if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) ORZ.LJLLLLLL(0, list4)) != null) {
                str5 = viewItem3.text;
            }
            textView4.setText(str5);
            return;
        }
        TextView textView5 = this.LJLILLLLZI;
        if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) ORZ.LJLLLLLL(0, list3)) != null && (str2 = viewItem2.text) != null) {
            str6 = str2;
        }
        Context context3 = this.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        CharSequence LIZ3 = C92153jX.LIZ(str, null, null, str6, context3);
        if (LIZ3 == null) {
            if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) ORZ.LJLLLLLL(0, list2)) != null) {
                str5 = viewItem.text;
            }
            LIZ3 = str5;
        }
        textView5.setText(LIZ3);
    }
}
