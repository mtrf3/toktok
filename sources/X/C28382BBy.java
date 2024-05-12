package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BBy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28382BBy extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final RadioButton LJLILLLLZI;
    public final View LJLJI;

    public C28382BBy(C28381BBx c28381BBx, View view) {
        super(view);
        View findViewById = view.findViewById(R.id.guo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.mute_duration)");
        TextView textView = (TextView) findViewById;
        this.LJLIL = textView;
        View findViewById2 = view.findViewById(R.id.gup);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…mute_duration_select_btn)");
        RadioButton radioButton = (RadioButton) findViewById2;
        this.LJLILLLLZI = radioButton;
        View findViewById3 = view.findViewById(R.id.frt);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.line)");
        this.LJLJI = findViewById3;
        ACListenerS40S0200000_5 aCListenerS40S0200000_5 = new ACListenerS40S0200000_5(this, c28381BBx, 35);
        radioButton.setOnClickListener(new ViewOnClickListenerC13880ga(aCListenerS40S0200000_5));
        C16880lQ.LJIIJ(aCListenerS40S0200000_5, view);
        if (!c28381BBx.LJLILLLLZI) {
            textView.setTextColor(-1);
            findViewById3.setBackgroundColor(ColorProtector.parseColor("#80FFFFFF"));
        }
    }
}
