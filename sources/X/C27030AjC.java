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

/* renamed from: X.AjC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27030AjC extends AbstractViewOnClickListenerC27027Aj9 {
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;

    public C27030AjC(View view) {
        super(view);
        View findViewById = this.itemView.findViewById(R.id.m1k);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_cand_text_first)");
        this.LJLILLLLZI = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.m1l);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_cand_text_second)");
        this.LJLJI = (TextView) findViewById2;
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
        String str3;
        List<ViewItem> list5;
        ViewItem viewItem4;
        List<ViewItem> list6;
        ViewItem viewItem5;
        List<ViewItem> list7;
        ViewItem viewItem6;
        String str4;
        String str5;
        List<ViewItem> list8;
        ViewItem viewItem7;
        List<ViewItem> list9;
        ViewItem viewItem8;
        List<ViewItem> list10;
        ViewItem viewItem9;
        String str6;
        boolean z = false;
        if (candInputData != null && (list = candInputData.viewItems) != null && list.size() > 1) {
            String str7 = null;
            if (viewStyle != null) {
                num = viewStyle.viewItemHighlightMode;
            } else {
                num = null;
            }
            String str8 = "";
            if (num != null) {
                Integer num2 = viewStyle.viewItemHighlightMode;
                int ordinal = EnumC27032AjE.DEFAULTMODE.ordinal();
                if (num2 == null || num2.intValue() != ordinal) {
                    int ordinal2 = EnumC27032AjE.KEYWORDMODE.ordinal();
                    if (num2 == null || num2.intValue() != ordinal2) {
                        int ordinal3 = EnumC27032AjE.DISABLEMODE.ordinal();
                        if (num2 == null || num2.intValue() != ordinal3) {
                            TextView textView = this.LJLILLLLZI;
                            if (candInputData != null && (list10 = candInputData.viewItems) != null && (viewItem9 = (ViewItem) ORZ.LJLLLLLL(0, list10)) != null && (str6 = viewItem9.text) != null) {
                                str8 = str6;
                            }
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            CharSequence LIZ = C92153jX.LIZ(str, null, null, str8, context);
                            if (LIZ == null) {
                                if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) ORZ.LJLLLLLL(0, list9)) != null) {
                                    LIZ = viewItem8.text;
                                } else {
                                    LIZ = null;
                                }
                            }
                            textView.setText(LIZ);
                        } else {
                            this.LJLILLLLZI.setTextColor(R.attr.gv);
                            TextView textView2 = this.LJLILLLLZI;
                            if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) ORZ.LJLLLLLL(0, list8)) != null) {
                                str5 = viewItem7.text;
                            } else {
                                str5 = null;
                            }
                            textView2.setText(str5);
                        }
                    } else {
                        TextView textView3 = this.LJLILLLLZI;
                        if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) ORZ.LJLLLLLL(0, list7)) != null && (str4 = viewItem6.text) != null) {
                            str8 = str4;
                        }
                        Context context2 = this.itemView.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        CharSequence LIZ2 = C92153jX.LIZ(str, null, null, str8, context2);
                        if (LIZ2 == null) {
                            if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) ORZ.LJLLLLLL(0, list6)) != null) {
                                LIZ2 = viewItem5.text;
                            } else {
                                LIZ2 = null;
                            }
                        }
                        textView3.setText(LIZ2);
                    }
                } else {
                    TextView textView4 = this.LJLILLLLZI;
                    if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) ORZ.LJLLLLLL(0, list5)) != null) {
                        str3 = viewItem4.text;
                    } else {
                        str3 = null;
                    }
                    textView4.setText(str3);
                }
            } else {
                TextView textView5 = this.LJLILLLLZI;
                if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) ORZ.LJLLLLLL(0, list3)) != null && (str2 = viewItem2.text) != null) {
                    str8 = str2;
                }
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                CharSequence LIZ3 = C92153jX.LIZ(str, null, null, str8, context3);
                if (LIZ3 == null) {
                    if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) ORZ.LJLLLLLL(0, list2)) != null) {
                        LIZ3 = viewItem.text;
                    } else {
                        LIZ3 = null;
                    }
                }
                textView5.setText(LIZ3);
            }
            TextView textView6 = this.LJLJI;
            if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) ORZ.LJLLLLLL(1, list4)) != null) {
                str7 = viewItem3.text;
            }
            textView6.setText(str7);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (getLayoutPosition() != i - 1) {
            z = true;
        }
        C26508Aam.LIZ(itemView, z);
    }
}
