package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS154S0100000_4;

/* renamed from: X.9wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253259wn extends LinearLayout {
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public TuxSingleSelectionSheet LJLJI;
    public final MMB LJLJJI;
    public final int[] LJLJJL;
    public final int[] LJLJJLL;
    public EnumC253269wo LJLJL;

    public final void LIZ() {
        boolean z;
        int i;
        int i2;
        int i3;
        if (this.LJLJL != EnumC253269wo.ALL) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = this.LJLILLLLZI;
        int[] iArr = this.LJLJJL;
        if (z) {
            i = iArr[1];
        } else {
            i = iArr[0];
        }
        tuxIconView.setTintColor(i);
        TuxTextView tuxTextView = this.LJLIL;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C7MY.LIZIZ(8));
        gradientDrawable.setShape(0);
        if (z) {
            i3 = this.LJLJJLL[1];
        } else {
            i3 = this.LJLJJLL[0];
        }
        gradientDrawable.setColor(i3);
        setBackground(gradientDrawable);
    }

    public final void setFilterType(EnumC253269wo enumC253269wo) {
        String str;
        this.LJLJL = enumC253269wo;
        LIZ();
        MMB mmb = this.LJLJJI;
        if (mmb != null) {
            mmb.LJL(this.LJLJL);
        }
        int index = this.LJLJL.getIndex();
        HashMap LIZJ = C03660Ck.LIZJ("enter_from", "notification_page");
        if (index != 0) {
            if (index != 1) {
                if (index != 2) {
                    if (index != 3) {
                        str = "";
                    } else {
                        str = "following";
                    }
                } else {
                    str = "not_replied";
                }
            } else {
                str = "unread";
            }
        } else {
            str = "clear";
        }
        LIZJ.put("option_name", str);
        FMX.LJIIL("im_filter_option_click", LIZJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C253259wn(Context context, MMB mmb) {
        super(context);
        a1.LJFF(context, "context");
        int[] iArr = {C56204M4a.LIZ(R.attr.go), C56204M4a.LIZ(R.attr.c8)};
        this.LJLJJL = iArr;
        this.LJLJJLL = new int[]{C56204M4a.LIZ(R.attr.cf), C56204M4a.LIZ(R.attr.c7)};
        this.LJLJL = EnumC253269wo.ALL;
        this.LJLJJI = mmb;
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(C7MY.LIZIZ(44), C7MY.LIZIZ(32)));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_filter;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        tuxIconView.setTuxIcon(c2068389v);
        this.LJLILLLLZI = tuxIconView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText("1");
        tuxTextView.setVisibility(8);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColor(iArr[1]);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        tuxTextView.setLayoutParams(layoutParams);
        this.LJLIL = tuxTextView;
        addView(tuxIconView);
        addView(tuxTextView);
        LIZ();
        C56204M4a.LJFF(this, new AqS154S0100000_4(this, 1217));
    }
}
