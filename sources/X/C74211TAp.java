package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TAp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74211TAp extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJI = 0;
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;

    static {
        new C74214TAs();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74211TAp(View view, boolean z, EnumC74213TAr headerType, String str, String str2) {
        super(view);
        int i;
        int i2;
        int i3;
        int i4;
        CharSequence charSequence = str;
        o.LJIIIZ(headerType, "headerType");
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "item.findViewById(R.id.title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LJLILLLLZI = tuxTextView;
        View findViewById2 = view.findViewById(R.id.jjg);
        o.LJIIIIZZ(findViewById2, "item.findViewById(R.id.second_title)");
        TextView textView = (TextView) findViewById2;
        if (headerType == EnumC74213TAr.DYNAMIC_HEIGHT) {
            if (z) {
                if (str2 != null) {
                    charSequence = str2;
                } else {
                    charSequence = view.getContext().getText(R.string.pc5);
                }
            } else if (charSequence == null) {
                charSequence = view.getContext().getText(R.string.pc5);
            }
            tuxTextView.setText(charSequence);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(15.0f)));
            tuxTextView.setPadding(LJJIIZ, 0, LJJIIZ, 0);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            if (i > C278817o.LIZ(15.0f)) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    i2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams2);
                } else {
                    i2 = 0;
                }
                Integer valueOf = Integer.valueOf(i2);
                Integer LIZIZ = C65429Pm5.LIZIZ(15.0f);
                ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    i3 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
                } else {
                    i3 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i3);
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? layoutParams4 : null);
                if (marginLayoutParams2 != null) {
                    i4 = marginLayoutParams2.bottomMargin;
                } else {
                    i4 = 0;
                }
                C26338AVi.LJI(tuxTextView, valueOf, LIZIZ, valueOf2, Integer.valueOf(i4), false, 16);
            }
            tuxTextView.setMaxLines(2);
            C023107f.LIZIZ(tuxTextView, 12, 63, 1, 1);
            textView.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(20.0f))));
            C26338AVi.LJI(textView, 0, 0, 0, 0, false, 16);
            textView.setText("");
        } else if (z) {
            if (headerType == EnumC74213TAr.TRIAL_EXPIRES) {
                tuxTextView.setText(view.getContext().getText(R.string.a21));
                textView.setText(view.getContext().getText(R.string.a22));
            } else if (headerType == EnumC74213TAr.INCREASE_LOGIN_NOTIFY) {
                tuxTextView.setText(view.getContext().getText(R.string.j8_));
                textView.setText(view.getContext().getText(R.string.j89));
            } else {
                tuxTextView.setText(view.getContext().getText(R.string.dq9));
            }
        } else {
            tuxTextView.setText(view.getContext().getText(R.string.dok));
            if (headerType == EnumC74213TAr.ONE_CLICK_LOGIN) {
                textView.setText(view.getContext().getText(R.string.j_9));
            } else {
                textView.setText(view.getContext().getText(R.string.doh));
            }
        }
        tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC74212TAq(this));
    }
}
