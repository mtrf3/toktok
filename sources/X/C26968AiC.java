package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AiC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26968AiC {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2RS, android.view.View] */
    public static final C2RS LIZLLL(Context context, LogisticDTO item) {
        String str;
        Integer num;
        String str2;
        List<LogisticLinkRichText> list;
        int LJJI;
        LogisticLinkRichText logisticLinkRichText;
        o.LJIIIZ(item, "item");
        ?? r3 = new ConstraintLayout(context, null, 0) { // from class: X.2RS
            public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

            public final View _$_findCachedViewById(int i) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                View view = (View) linkedHashMap.get(Integer.valueOf(i));
                if (view != null) {
                    return view;
                }
                View findViewById = findViewById(i);
                if (findViewById == null) {
                    return null;
                }
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }

            {
                super(context, r5, r6);
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a91, this, true);
            }
        };
        ((TextView) r3._$_findCachedViewById(R.id.mwq)).setText(item.deliveryName);
        TuxTextView tuxTextView = (TuxTextView) r3._$_findCachedViewById(R.id.mwn);
        Price price = item.shippingFee;
        if (price != null) {
            str = price.getPriceStr();
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        Price price2 = item.shippingFee;
        if (price2 != null) {
            num = price2.getPriceTextColor();
        } else {
            num = null;
        }
        tuxTextView.setTextColorRes(C78685UuP.LJLI(num, null));
        C27117Akb c27117Akb = (C27117Akb) r3._$_findCachedViewById(R.id.mwp);
        LogisticsDescription logisticsDescription = item.logisticsDescription;
        if (logisticsDescription != null && (logisticLinkRichText = logisticsDescription.logisticsRichText) != null) {
            o.LJIIIIZZ(c27117Akb, "this");
            Context context2 = c27117Akb.getContext();
            o.LJIIIIZZ(context2, "context");
            c27117Akb.LJJJIL(context2, logisticLinkRichText, 7, 3, null, null);
        }
        TextView textView = (TextView) r3._$_findCachedViewById(R.id.mwm);
        LogisticsDescription logisticsDescription2 = item.logisticsDescription;
        if (logisticsDescription2 != null) {
            str2 = logisticsDescription2.descriptionTitle;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        ViewGroup viewGroup = (ViewGroup) r3._$_findCachedViewById(R.id.mwl);
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        LogisticsDescription logisticsDescription3 = item.logisticsDescription;
        if (logisticsDescription3 != null && (list = logisticsDescription3.descriptions) != null) {
            int i = 0;
            for (LogisticLinkRichText logisticLinkRichText2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    LogisticLinkRichText logisticLinkRichText3 = logisticLinkRichText2;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    if (i == 0) {
                        LJJI = C45804HyK.LJJI(0);
                    } else {
                        LJJI = C45804HyK.LJJI(16);
                    }
                    layoutParams.topMargin = LJJI;
                    ViewGroup viewGroup2 = (ViewGroup) r3._$_findCachedViewById(R.id.mwl);
                    Context context3 = r3.getContext();
                    o.LJIIIIZZ(context3, "context");
                    C27117Akb c27117Akb2 = new C27117Akb(context3, null, 6);
                    c27117Akb2.setTuxFont(51);
                    c27117Akb2.setTextColorRes(R.attr.go);
                    Context context4 = c27117Akb2.getContext();
                    o.LJIIIIZZ(context4, "context");
                    c27117Akb2.LJJJIL(context4, logisticLinkRichText3, 1, 1, null, null);
                    viewGroup2.addView(c27117Akb2, layoutParams);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.2RR, android.view.View] */
    public static final C2RR LJ(final Context context, C27051AjX item) {
        String str;
        Integer num;
        o.LJIIIZ(item, "item");
        final AttributeSet attributeSet = null;
        final int i = 0;
        ?? r7 = new ConstraintLayout(context, attributeSet, i) { // from class: X.2RR
            public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

            public final View _$_findCachedViewById(int i2) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                View view = (View) linkedHashMap.get(Integer.valueOf(i2));
                if (view != null) {
                    return view;
                }
                View findViewById = findViewById(i2);
                if (findViewById == null) {
                    return null;
                }
                linkedHashMap.put(Integer.valueOf(i2), findViewById);
                return findViewById;
            }

            {
                super(context, attributeSet, i);
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a9g, this, true);
            }
        };
        TextView us_osp_shipping_sheet_explain_text = (TextView) r7._$_findCachedViewById(R.id.mxp);
        o.LJIIIIZZ(us_osp_shipping_sheet_explain_text, "us_osp_shipping_sheet_explain_text");
        OUP.LJJLIIIJILLIZJL(us_osp_shipping_sheet_explain_text, item.LJIIJ);
        TuxTextView tuxTextView = (TuxTextView) r7._$_findCachedViewById(R.id.mxn);
        tuxTextView.setText(item.LIZIZ);
        tuxTextView.setTextColorRes(C78685UuP.LJLI(item.LJI, null));
        ArrayList<BillItem> arrayList = item.LJIIIZ;
        if (arrayList != null) {
            Iterator<BillItem> it = arrayList.iterator();
            while (it.hasNext()) {
                BillItem next = it.next();
                ViewGroup viewGroup = (ViewGroup) r7._$_findCachedViewById(R.id.mxk);
                Context context2 = r7.getContext();
                o.LJIIIIZZ(context2, "context");
                C26970AiE c26970AiE = new C26970AiE(context2, null, 0);
                c26970AiE.setTitle(next.getItemName());
                Price itemPrice = next.getItemPrice();
                if (itemPrice != null) {
                    str = itemPrice.getPriceStr();
                } else {
                    str = null;
                }
                Integer itemTextFont = next.getItemTextFont();
                Price itemPrice2 = next.getItemPrice();
                if (itemPrice2 != null) {
                    num = itemPrice2.getPriceTextColor();
                } else {
                    num = null;
                }
                c26970AiE.LJJLJLI(itemTextFont, num, str);
                viewGroup.addView(c26970AiE);
            }
        }
        return r7;
    }

    public static final TuxSheet LIZ(View view, String navTitle, InterfaceC88473Ynt<? super Boolean, ? super Long, ? super String, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(navTitle, "navTitle");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ASL asl = new ASL();
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = navTitle;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(view, 1176));
        c235119Kp.LIZIZ(LIZJ);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = view;
        asl.LJI(0);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJLILLLLZI = new DialogInterfaceOnDismissListenerC26967AiB(interfaceC88473Ynt, elapsedRealtime);
        return tuxSheet2;
    }

    public static final TuxTextView LIZJ(Context context, int i, String str) {
        o.LJIIIZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        tuxTextView.setTextColorRes(i);
        tuxTextView.setTuxFont(51);
        return tuxTextView;
    }

    public static final TuxSheet LIZIZ(View view, String str, float f, InterfaceC88473Ynt<? super Boolean, ? super Long, ? super String, C76800UCe> interfaceC88473Ynt) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ASL asl = new ASL();
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(view, 1177));
        c235119Kp.LIZIZ(LIZJ);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = view;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(EF7.LIZIZ()) * f);
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJLILLLLZI = new DialogInterfaceOnDismissListenerC26966AiA(interfaceC88473Ynt, elapsedRealtime);
        return tuxSheet2;
    }

    public static void LJFF(TuxSheet sheet, FragmentManager fragmentManager, String str, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            interfaceC65784Pro = null;
        }
        o.LJIIIZ(sheet, "sheet");
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        sheet.show(fragmentManager, str);
    }
}
