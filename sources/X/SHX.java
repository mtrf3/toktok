package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHX extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final String LJLILLLLZI;
    public final SmartImageView LJLJI;

    public SHX(View view, String str) {
        super(view);
        int i;
        this.LJLIL = view;
        this.LJLILLLLZI = str;
        if (C99W.LIZ) {
            i = R.id.a6g;
        } else {
            i = R.id.a6f;
        }
        View findViewById = view.findViewById(i);
        o.LJIIIIZZ(findViewById, "v.findViewById(\n        …ion_avatar_rv_cell,\n    )");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.LJLJI = smartImageView;
        smartImageView.setVisibility(0);
    }
}
