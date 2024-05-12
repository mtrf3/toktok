package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71305Ryf implements InterfaceC73206SoE {
    public final View LJLIL;
    public final C8ID LJLILLLLZI;
    public final TuxTextView LJLJI;

    @Override // X.InterfaceC73206SoE
    public final View getView() {
        return this.LJLIL;
    }

    public C71305Ryf(View view) {
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.status_view)");
        this.LJLILLLLZI = (C8ID) findViewById;
        View findViewById2 = view.findViewById(R.id.h24);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.no_more_item_label)");
        this.LJLJI = (TuxTextView) findViewById2;
    }

    @Override // X.InterfaceC73206SoE
    public final void LIZIZ(int i) {
        switch (i) {
            case 241:
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJI.setVisibility(8);
                return;
            case 242:
                this.LJLILLLLZI.setVisibility(0);
                this.LJLJI.setVisibility(8);
                return;
            case 243:
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJI.setVisibility(0);
                return;
            case 244:
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJI.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
