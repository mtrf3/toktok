package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CD8 extends CDI {
    public final /* synthetic */ CDG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CD8(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh1, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = cdg;
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        int i2;
        o.LJIIIZ(holder, "holder");
        View findViewById = this.itemView.findViewById(R.id.a2f);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<Te…R.id.anchor_info_message)");
        if (this.LJLIL.LJLIL.LJLJL) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }
}
