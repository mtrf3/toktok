package X;

import Y.ACListenerS30S0100000_10;
import Y.ACallableS37S1100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6D extends LinearLayout {
    public View LJLIL;
    public C96W LJLILLLLZI;
    public C96W LJLJI;
    public C238649Ye LJLJJI;
    public C96W LJLJJL;
    public C96W LJLJJLL;
    public String LJLJL;
    public LinearLayout LJLJLJ;
    public O6C LJLJLLL;
    public final HashMap<String, C96X> LJLL;
    public final HashMap<String, String> LJLLI;

    private final void setUpDivider(LinearLayout linearLayout) {
        View view = new View(getContext());
        this.LJLIL = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        linearLayout.addView(this.LJLIL);
    }

    private final void setUpTabContainer(LinearLayout linearLayout) {
        this.LJLJLJ = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        LinearLayout linearLayout2 = this.LJLJLJ;
        o.LJI(linearLayout2);
        linearLayout2.setLayoutParams(layoutParams);
        LinearLayout linearLayout3 = this.LJLJLJ;
        o.LJI(linearLayout3);
        linearLayout3.setOrientation(0);
        linearLayout.addView(this.LJLJLJ);
    }

    public final void LIZ(String str) {
        boolean z;
        boolean z2 = true;
        if (TextUtils.equals(str, "homepage_hot") || TextUtils.equals(str, "tab_draft")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.d4, context);
            o.LJI(LJI);
            setBackgroundColor(LJI.intValue());
            View view = this.LJLIL;
            o.LJI(view);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dw, context2);
            o.LJI(LJI2);
            view.setBackgroundColor(LJI2.intValue());
        } else {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI3 = C79045V0n.LJI(R.attr.cl, context3);
            o.LJI(LJI3);
            setBackgroundColor(LJI3.intValue());
            View view2 = this.LJLIL;
            o.LJI(view2);
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            Integer LJI4 = C79045V0n.LJI(R.attr.dv, context4);
            o.LJI(LJI4);
            view2.setBackgroundColor(LJI4.intValue());
        }
        C96W c96w = this.LJLILLLLZI;
        o.LJI(c96w);
        c96w.setSelected(TextUtils.equals(str, "homepage_hot"));
        C96W c96w2 = this.LJLJI;
        o.LJI(c96w2);
        c96w2.setSelected(TextUtils.equals(str, "discovery"));
        C96W c96w3 = this.LJLJJL;
        o.LJI(c96w3);
        c96w3.setSelected(TextUtils.equals(str, "liked"));
        C96W c96w4 = this.LJLJJLL;
        o.LJI(c96w4);
        if (!TextUtils.equals(str, "personal_homepage") && !TextUtils.equals(str, "tab_draft")) {
            z2 = false;
        }
        c96w4.setSelected(z2);
        C96W c96w5 = this.LJLILLLLZI;
        o.LJI(c96w5);
        c96w5.LIZ(z);
        C96W c96w6 = this.LJLJI;
        o.LJI(c96w6);
        c96w6.LIZ(z);
        C238649Ye c238649Ye = this.LJLJJI;
        o.LJI(c238649Ye);
        c238649Ye.LIZ(z);
        C96W c96w7 = this.LJLJJL;
        o.LJI(c96w7);
        c96w7.LIZ(z);
        C96W c96w8 = this.LJLJJLL;
        o.LJI(c96w8);
        c96w8.LIZ(z);
    }

    public final void setCurrentTab(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        String str = this.LJLJL;
        if (str == null) {
            str = "homepage_hot";
        }
        O6C o6c = this.LJLJLLL;
        if (o6c != null) {
            o6c.LIZ(this.LJLJL, tabName);
        }
        if (!TextUtils.equals(tabName, str) && !TextUtils.equals(tabName, "tab_publish")) {
            LIZ(tabName);
            this.LJLJL = tabName;
        }
        C10K.LIZJ(new ACallableS37S1100000_10(this, tabName, 1));
    }

    public final void setTabSelectListener(O6C o6c) {
        this.LJLJLLL = o6c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O6D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = "homepage_hot";
        HashMap<String, C96X> hashMap = new HashMap<>();
        this.LJLL = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.LJLLI = hashMap2;
        setOrientation(1);
        setUpDivider(this);
        setUpTabContainer(this);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        String string = getContext().getString(R.string.hn7);
        o.LJIIIIZZ(string, "context.getString(R.string.kids_mode_tab_1)");
        this.LJLILLLLZI = new C96W(context2, R.raw.icon_tab_home, R.raw.icon_tab_home_fill, string);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        String string2 = getContext().getString(R.string.hn8);
        o.LJIIIIZZ(string2, "context.getString(R.string.kids_mode_tab_2)");
        this.LJLJI = new C96W(context3, R.raw.icon_tab_feed, R.raw.icon_tab_feed_fill, string2);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        this.LJLJJI = new C238649Ye(context4);
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        String string3 = getContext().getString(R.string.hn9);
        o.LJIIIIZZ(string3, "context.getString(R.string.kids_mode_tab_3)");
        this.LJLJJL = new C96W(context5, R.raw.icon_tab_heart, R.raw.icon_tab_heart_fill, string3);
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        String string4 = getContext().getString(R.string.hnb);
        o.LJIIIIZZ(string4, "context.getString(R.string.kids_mode_tab_4)");
        this.LJLJJLL = new C96W(context6, R.raw.icon_tab_account, R.raw.icon_tab_account_fill, string4);
        LinearLayout linearLayout = this.LJLJLJ;
        o.LJI(linearLayout);
        if (linearLayout.getChildCount() > 0) {
            LinearLayout linearLayout2 = this.LJLJLJ;
            o.LJI(linearLayout2);
            linearLayout2.removeAllViews();
        }
        C96W c96w = this.LJLILLLLZI;
        if (c96w != null) {
            c96w.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 69)));
        }
        C96W c96w2 = this.LJLJI;
        if (c96w2 != null) {
            c96w2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 70)));
        }
        C238649Ye c238649Ye = this.LJLJJI;
        if (c238649Ye != null) {
            c238649Ye.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 71)));
        }
        C96W c96w3 = this.LJLJJL;
        if (c96w3 != null) {
            c96w3.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 72)));
        }
        C96W c96w4 = this.LJLJJLL;
        if (c96w4 != null) {
            c96w4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 73)));
        }
        LinearLayout linearLayout3 = this.LJLJLJ;
        o.LJI(linearLayout3);
        linearLayout3.addView(this.LJLILLLLZI);
        LinearLayout linearLayout4 = this.LJLJLJ;
        o.LJI(linearLayout4);
        linearLayout4.addView(this.LJLJI);
        LinearLayout linearLayout5 = this.LJLJLJ;
        o.LJI(linearLayout5);
        linearLayout5.addView(this.LJLJJI);
        LinearLayout linearLayout6 = this.LJLJLJ;
        o.LJI(linearLayout6);
        linearLayout6.addView(this.LJLJJL);
        LinearLayout linearLayout7 = this.LJLJLJ;
        o.LJI(linearLayout7);
        linearLayout7.addView(this.LJLJJLL);
        int LJIIIZ = C60996Nwm.LJIIIZ(getContext());
        C96W c96w5 = this.LJLILLLLZI;
        o.LJI(c96w5);
        int i = (int) (LJIIIZ / 5.0f);
        c96w5.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        C96W c96w6 = this.LJLJI;
        o.LJI(c96w6);
        c96w6.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        C238649Ye c238649Ye2 = this.LJLJJI;
        o.LJI(c238649Ye2);
        c238649Ye2.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        C96W c96w7 = this.LJLJJL;
        o.LJI(c96w7);
        c96w7.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        C96W c96w8 = this.LJLJJLL;
        o.LJI(c96w8);
        c96w8.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        C96W c96w9 = this.LJLILLLLZI;
        o.LJI(c96w9);
        hashMap.put("homepage_hot", c96w9);
        C96W c96w10 = this.LJLJI;
        o.LJI(c96w10);
        hashMap.put("discovery", c96w10);
        C238649Ye c238649Ye3 = this.LJLJJI;
        o.LJI(c238649Ye3);
        hashMap.put("tab_publish", c238649Ye3);
        C96W c96w11 = this.LJLJJL;
        o.LJI(c96w11);
        hashMap.put("liked", c96w11);
        C96W c96w12 = this.LJLJJLL;
        o.LJI(c96w12);
        hashMap.put("personal_homepage", c96w12);
        hashMap2.put("homepage_hot", "enter_home_hot_page");
        hashMap2.put("discovery", "enter_discovery_page");
        hashMap2.put("liked", "enter_liked_page");
        hashMap2.put("personal_homepage", "enter_personal_homepage");
        LIZ(this.LJLJL);
    }
}
