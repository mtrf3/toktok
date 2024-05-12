package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BXm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28942BXm extends RecyclerView.ViewHolder {
    public final String LJLIL;
    public final TextView LJLILLLLZI;

    public C28942BXm(View view) {
        super(view);
        String str;
        if (C28949BXt.LIZ()) {
            str = "PERCENT";
        } else {
            str = "TILTIFY";
        }
        this.LJLIL = str;
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.kh7);
    }
}
