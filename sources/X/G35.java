package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G35 extends G37 {
    public static final /* synthetic */ int LJLIL = 0;

    public G35(View view, String str, String str2) {
        super(view, str);
        if (TextUtils.isEmpty(str)) {
            view.findViewById(R.id.e4n).setVisibility(8);
        } else {
            ((TextView) view.findViewById(R.id.e4n)).setText(str);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.e4n);
            o.LJIIIIZZ(tuxTextView, "view.header_title");
            C78248UnM.LJIIIIZZ(tuxTextView);
        }
        if (TextUtils.isEmpty(str2)) {
            view.findViewById(R.id.jjg).setVisibility(8);
            return;
        }
        ((TextView) view.findViewById(R.id.jjg)).setText(str2);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.jjg);
        o.LJIIIIZZ(tuxTextView2, "view.second_title");
        C78248UnM.LJIIIIZZ(tuxTextView2);
    }
}
