package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import q03.IDaS482S0100000_2;

/* renamed from: X.6Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161356Ux {
    public static final /* synthetic */ int LIZ = 0;

    public static C6SN LIZIZ(Context context, C161366Uy c161366Uy) {
        String str;
        int i;
        Resources resources;
        C6SN c6sn = new C6SN(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C7MY.LIZIZ(144), -2);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        layoutParams.gravity = 17;
        c6sn.setLayoutParams(layoutParams);
        c6sn.setId(R.id.ab5);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || (resources = LJIJJ.getResources()) == null || (str = resources.getString(c161366Uy.LJIIIIZZ)) == null) {
            str = "";
        }
        c6sn.setHint(str);
        c6sn.setGravity(17);
        int i2 = 0;
        c6sn.setFocusable(false);
        c6sn.setFocusableInTouchMode(false);
        String str2 = c161366Uy.LJIIIZ;
        if (str2 != null) {
            c6sn.setText(str2);
        }
        c6sn.setTuxFont(52);
        Integer LJI = C79045V0n.LJI(c161366Uy.LJIILLIIL, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c6sn.setTextColor(i);
        Integer LJI2 = C79045V0n.LJI(c161366Uy.LJIILJJIL, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        }
        c6sn.setHintTextColor(i2);
        if (c161366Uy.LJIJ) {
            c6sn.LJLJLJ = true;
        }
        return c6sn;
    }

    public static void LIZJ(C161096Tx c161096Tx, C161366Uy config) {
        View LJ;
        CharSequence charSequence;
        Resources resources;
        o.LJIIIZ(c161096Tx, "<this>");
        o.LJIIIZ(config, "config");
        c161096Tx.setLayoutParams(new FrameLayout.LayoutParams(config.LIZ, config.LIZIZ));
        c161096Tx.setAlpha(config.LJIIZILJ);
        c161096Tx.setElevation(C32151Nz.LJIIZILJ(16));
        InterfaceC65784Pro<Drawable> interfaceC65784Pro = config.LIZJ;
        if (interfaceC65784Pro != null) {
            c161096Tx.setBackground(interfaceC65784Pro.invoke());
        }
        LinearLayout linearLayout = new LinearLayout(c161096Tx.getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        linearLayout.setLayoutDirection(C26338AVi.LIZJ(context) ? 1 : 0);
        c161096Tx.addView(linearLayout);
        if (config.LJIJI) {
            Context context2 = c161096Tx.getContext();
            o.LJIIIIZZ(context2, "context");
            LJ = LIZIZ(context2, config);
        } else {
            Context context3 = c161096Tx.getContext();
            o.LJIIIIZZ(context3, "context");
            LJ = LJ(context3, config);
        }
        linearLayout.addView(LJ);
        Context context4 = c161096Tx.getContext();
        o.LJIIIIZZ(context4, "context");
        OPW opw = new OPW(context4, null, 6);
        List<? extends UrlModel> LJIIZILJ = C62819Ol5.LJIIZILJ(config.LJIIJ);
        opw.LIZJ(LJIIZILJ);
        ArrayList arrayList = (ArrayList) LJIIZILJ;
        if (config.LJIIJJI - arrayList.size() > 0) {
            opw.LJ(config.LJIIJJI - arrayList.size());
        }
        opw.getTextView().setTextColorRes(config.LJIILL);
        ViewGroup.LayoutParams layoutParams = opw.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = C7MY.LIZIZ(10);
        linearLayout.addView(opw);
        View view = new View(c161096Tx.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(1));
        layoutParams2.topMargin = C7MY.LIZIZ(10);
        view.setLayoutParams(layoutParams2);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(config.LJI);
        Context context5 = view.getContext();
        o.LJIIIIZZ(context5, "context");
        view.setBackground(c110614Vt.LIZ(context5));
        linearLayout.addView(view);
        LinearLayout linearLayout2 = new LinearLayout(c161096Tx.getContext());
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout2.setPadding(C7MY.LIZIZ(20), C7MY.LIZIZ(10), C7MY.LIZIZ(20), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        Context context6 = linearLayout2.getContext();
        o.LJIIIIZZ(context6, "context");
        linearLayout2.setLayoutDirection(C26338AVi.LIZJ(context6) ? 1 : 0);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = config.LJIIL;
        if (interfaceC65784Pro2 != null) {
            C16880lQ.LJIIJ(new IDaS482S0100000_2(interfaceC65784Pro2, 0), linearLayout2);
        }
        linearLayout.addView(linearLayout2);
        Context context7 = c161096Tx.getContext();
        o.LJIIIIZZ(context7, "context");
        TuxIconView tuxIconView = new TuxIconView(context7, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams4.gravity = 17;
        tuxIconView.setLayoutParams(layoutParams4);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = config.LJ;
        c2068389v.LJ = Integer.valueOf(config.LJFF);
        tuxIconView.setTuxIcon(c2068389v);
        linearLayout2.addView(tuxIconView);
        Context context8 = c161096Tx.getContext();
        o.LJIIIIZZ(context8, "context");
        TuxTextView tuxTextView = new TuxTextView(context8, null, 6, 0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, C7MY.LIZIZ(18));
        layoutParams5.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)));
        layoutParams5.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams5);
        Context context9 = tuxTextView.getContext();
        o.LJIIIIZZ(context9, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context9);
        if (LJIJJ == null || (resources = LJIJJ.getResources()) == null || (charSequence = resources.getString(config.LJII)) == null) {
            charSequence = "";
        }
        tuxTextView.setText(charSequence);
        tuxTextView.setTextColorRes(config.LJIILIIL);
        tuxTextView.setTuxFont(52);
        linearLayout2.addView(tuxTextView);
    }

    public static void LIZLLL(C161096Tx c161096Tx, C161366Uy config) {
        TextView textView;
        int i;
        Drawable drawable;
        o.LJIIIZ(c161096Tx, "<this>");
        o.LJIIIZ(config, "config");
        c161096Tx.setLayoutParams(new FrameLayout.LayoutParams(config.LIZ, config.LIZIZ));
        c161096Tx.setAlpha(config.LJIIZILJ);
        c161096Tx.setElevation(C32151Nz.LJIIZILJ(16));
        InterfaceC65784Pro<Drawable> interfaceC65784Pro = config.LIZJ;
        if (interfaceC65784Pro != null) {
            c161096Tx.setBackground(interfaceC65784Pro.invoke());
        }
        LinearLayout linearLayout = new LinearLayout(c161096Tx.getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        linearLayout.setLayoutDirection(C26338AVi.LIZJ(context) ? 1 : 0);
        c161096Tx.addView(linearLayout);
        if (config.LJIJI) {
            Context context2 = c161096Tx.getContext();
            o.LJIIIIZZ(context2, "context");
            textView = LIZIZ(context2, config);
        } else {
            Context context3 = c161096Tx.getContext();
            o.LJIIIIZZ(context3, "context");
            textView = LJ(context3, config);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT), -2);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        Context context4 = c161096Tx.getContext();
        o.LJIIIIZZ(context4, "context");
        int i2 = 3;
        if (C26338AVi.LIZJ(context4)) {
            i = 5;
        } else {
            i = 3;
        }
        layoutParams.gravity = i;
        textView.setLayoutParams(layoutParams);
        Context context5 = c161096Tx.getContext();
        o.LJIIIIZZ(context5, "context");
        if (C26338AVi.LIZJ(context5)) {
            i2 = 5;
        }
        textView.setGravity(i2);
        linearLayout.addView(textView);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c161096Tx.getContext()), R.layout.gb, linearLayout, false);
        Context context6 = c161096Tx.getContext();
        o.LJIIIIZZ(context6, "context");
        LLLLIILL.setLayoutDirection(C26338AVi.LIZJ(context6) ? 1 : 0);
        linearLayout.addView(LLLLIILL);
        OPW opw = (OPW) LLLLIILL.findViewById(R.id.ab2);
        List<? extends UrlModel> LJIIZILJ = C62819Ol5.LJIIZILJ(config.LJIIJ);
        opw.LIZJ(LJIIZILJ);
        ArrayList arrayList = (ArrayList) LJIIZILJ;
        if (config.LJIIJJI - arrayList.size() > 0) {
            opw.LJ(config.LJIIJJI - arrayList.size());
        }
        opw.getTextView().setTextColorRes(config.LJIILL);
        ViewGroup viewGroup = (ViewGroup) LLLLIILL.findViewById(R.id.ab4);
        InterfaceC65784Pro<Drawable> interfaceC65784Pro2 = config.LIZLLL;
        if (interfaceC65784Pro2 != null) {
            drawable = interfaceC65784Pro2.invoke();
        } else {
            drawable = null;
        }
        viewGroup.setBackground(drawable);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = config.LJIIL;
        if (interfaceC65784Pro3 != null) {
            C16880lQ.LJIIJ(new IDaS482S0100000_2(interfaceC65784Pro3, 1), viewGroup);
        }
        Context context7 = c161096Tx.getContext();
        o.LJIIIIZZ(context7, "context");
        TuxIconView tuxIconView = new TuxIconView(context7, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams2.gravity = 17;
        tuxIconView.setLayoutParams(layoutParams2);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = config.LJ;
        c2068389v.LJ = Integer.valueOf(config.LJFF);
        tuxIconView.setTuxIcon(c2068389v);
        viewGroup.addView(tuxIconView);
    }

    public static TuxTextView LJ(Context context, C161366Uy c161366Uy) {
        String str;
        int i;
        Resources resources;
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C7MY.LIZIZ(144), -2);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setId(R.id.ab5);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || (resources = LJIJJ.getResources()) == null || (str = resources.getString(c161366Uy.LJIIIIZZ)) == null) {
            str = "";
        }
        tuxTextView.setHint(str);
        tuxTextView.setGravity(17);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(3);
        tuxTextView.setFocusable(false);
        tuxTextView.setFocusableInTouchMode(false);
        String str2 = c161366Uy.LJIIIZ;
        if (str2 != null) {
            tuxTextView.setText(str2);
        }
        tuxTextView.setTuxFont(52);
        Integer LJI = C79045V0n.LJI(c161366Uy.LJIILLIIL, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        tuxTextView.setTextColor(i);
        Integer LJI2 = C79045V0n.LJI(c161366Uy.LJIILJJIL, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        }
        tuxTextView.setHintTextColor(i2);
        if (C26338AVi.LIZJ(context)) {
            tuxTextView.setTextDirection(1);
            tuxTextView.setLayoutDirection(1);
        }
        return tuxTextView;
    }

    public static C161096Tx LIZ(Context context, C161366Uy c161366Uy, InterfaceC88471Ynr method, C161096Tx c161096Tx) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(method, "method");
        if (c161096Tx != null) {
            method.invoke(c161096Tx, c161366Uy);
            return c161096Tx;
        }
        C161096Tx c161096Tx2 = new C161096Tx(context, (C6UA) null, 14);
        method.invoke(c161096Tx2, c161366Uy);
        return c161096Tx2;
    }
}
