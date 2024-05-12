package X;

import Y.IDCListenerS296S0100000_3;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.72l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1794372l extends RecyclerView.ViewHolder {
    public final View LJLIL;

    public C1794372l(View view, String str, String str2, boolean z, boolean z2) {
        super(view);
        Integer num;
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.e43);
        o.LJIIIIZZ(findViewById, "item.findViewById(R.id.header_icon)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.e4k);
        o.LJIIIIZZ(findViewById2, "item.findViewById(R.id.header_text)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jiz);
        o.LJIIIIZZ(findViewById3, "item.findViewById(R.id.second_header_text)");
        TextView textView2 = (TextView) findViewById3;
        textView.setText(str);
        if (str2 == null || str2.length() == 0) {
            textView2.setVisibility(8);
            num = null;
            C26338AVi.LJI(textView, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), false, 23);
        } else {
            textView2.setText(str2);
            num = null;
            C26338AVi.LJI(textView, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), false, 23);
        }
        textView.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 13));
        if (!z) {
            imageView.setVisibility(4);
        }
        if (z2) {
            C26338AVi.LJI(imageView, num, 0, num, num, false, 29);
        }
    }
}
