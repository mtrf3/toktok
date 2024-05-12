package X;

import Y.ARunnableS16S1100000_15;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XXK extends XYS {
    public final Context LJLILLLLZI;
    public final List<C85022XYk> LJLJI;
    public final LinearLayout LJLJJI;
    public final TextView LJLJJL;
    public final LinearLayout LJLJJLL;
    public final View LJLJL;
    public final int LJLJLJ;
    public final XTE LJLJLLL;

    public final void L(String str) {
        String LLLZ;
        SpannableString spannableString;
        int measuredWidth = this.LJLJJL.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.LJLJJL.post(new ARunnableS16S1100000_15(this, str, 4));
            return;
        }
        String LJFF = i0.LJFF("#", str);
        TextPaint paint = this.LJLJJL.getPaint();
        String string = this.LJLILLLLZI.getString(R.string.pum);
        float measureText = measuredWidth - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(LJFF) > measureText) {
            LLLZ = C16880lQ.LLLZ(string, new Object[]{TextUtils.ellipsize(LJFF, paint, measureText, TextUtils.TruncateAt.END)});
            spannableString = new SpannableString(LLLZ);
        } else {
            LLLZ = C16880lQ.LLLZ(string, new Object[]{LJFF});
            spannableString = new SpannableString(LLLZ);
        }
        spannableString.setSpan(new StyleSpan(1), string.indexOf("%s"), (LLLZ.length() + (string.indexOf("%s") + 2)) - string.length(), 17);
        this.LJLJJL.setText(spannableString);
    }

    public XXK(View view, int i) {
        super(view);
        this.LJLILLLLZI = view.getContext();
        this.LJLJJI = (LinearLayout) view.findViewById(R.id.g27);
        this.LJLJJL = (TextView) view.findViewById(R.id.mqu);
        this.LJLJJLL = (LinearLayout) view.findViewById(R.id.g28);
        this.LJLJL = view.findViewById(R.id.ngi);
        this.LJLJI = new ArrayList();
        this.LJLJLJ = i;
        float LIZJ = KL2.LIZJ(this.LJLILLLLZI, 16.0f);
        this.LJLJJI.setPadding(0, 0, 0, 0);
        this.LJLJJI.setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.LJLJJI.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = this.LJLJJL.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = (int) LIZJ;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i2;
        ViewGroup.LayoutParams layoutParams3 = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i2;
        this.LJLJL.setVisibility(0);
        this.LJLJLLL = new XTE("change_music_page", "attached_song", "", SFS.LJLJJI);
    }
}
