package X;

import Y.IDCListenerS208S0100000_12;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S44 extends RecyclerView.ViewHolder {
    public S45 LJLIL;
    public SmartImageView LJLILLLLZI;
    public C63044Ooi LJLJI;

    public S44(View view) {
        super(view);
    }

    public final void L(boolean z) {
        View findViewById = this.itemView.findViewById(R.id.iln);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.radio)");
        C63044Ooi c63044Ooi = (C63044Ooi) findViewById;
        this.LJLJI = c63044Ooi;
        c63044Ooi.setOnCheckedChangeListener(null);
        C63044Ooi c63044Ooi2 = this.LJLJI;
        if (c63044Ooi2 != null) {
            c63044Ooi2.setChecked(z);
            C63044Ooi c63044Ooi3 = this.LJLJI;
            if (c63044Ooi3 != null) {
                c63044Ooi3.setOnCheckedChangeListener(new IDCListenerS208S0100000_12(this, 2));
                return;
            } else {
                o.LJIJI("radioButton");
                throw null;
            }
        }
        o.LJIJI("radioButton");
        throw null;
    }
}
