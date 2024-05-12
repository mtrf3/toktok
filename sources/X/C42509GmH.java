package X;

import Y.ACListenerS27S0100000_7;
import Y.IDCListenerS207S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GmH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42509GmH extends AbstractC242999gF {
    public final C62822Ol8 LJ;
    public final MutableLiveData<Boolean> LJFF;

    @Override // X.ARS
    public final View LIZIZ() {
        LinearLayout linearLayout = new LinearLayout((Context) this.LIZIZ);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        C71897SJp c71897SJp = new C71897SJp(context, null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(4, 0, 4, 0);
        c71897SJp.setLayoutParams(layoutParams);
        c71897SJp.setSize(0);
        c71897SJp.setOnCheckedChangeListener(new IDCListenerS207S0100000_7(this, 12));
        linearLayout.addView(c71897SJp);
        Context context2 = linearLayout.getContext();
        o.LJIIIIZZ(context2, "context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS27S0100000_7(this, 200));
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.gv);
        tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tuxTextView.setText(tuxTextView.getContext().getString(R.string.i59));
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    public C42509GmH(Context context) {
        super(context);
        this.LJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 768));
        this.LJFF = new MutableLiveData<>(Boolean.FALSE);
    }
}
