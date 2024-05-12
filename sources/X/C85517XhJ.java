package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XhJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85517XhJ extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final RelativeLayout LJLJI;

    public C85517XhJ(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.s3);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ad_inference_tag)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.s1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ad_inference_label)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.s2);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.ad_inference_label_item)");
        this.LJLJI = (RelativeLayout) findViewById3;
    }
}
