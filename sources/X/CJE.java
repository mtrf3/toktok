package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJE extends CJM<CJ8> {
    public final CJP LJLIL;
    public final String LJLILLLLZI;
    public final C2A7 LJLJI;
    public final C47121t6 LJLJJI;

    @Override // X.CJM
    public final void L(int i, Object obj) {
        CJ8 data = (CJ8) obj;
        o.LJIIIZ(data, "data");
        this.LJLJI.setVisibility(0);
        this.LJLJJI.setVisibility(8);
        if (data.LJLIL) {
            this.LJLJI.setEnabled(true);
            this.LJLJJI.setVisibility(8);
        }
        if (data.LJLILLLLZI) {
            this.LJLJI.setVisibility(8);
            this.LJLJJI.setVisibility(8);
        } else {
            BPV.LIZLLL("emote_preview", this.LJLILLLLZI);
        }
        C16880lQ.LJJIII(this.LJLJI, new ACListenerS25S0100000_5(this, 379));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJE(View view, CJP subBtnClickListener, String str) {
        super(view);
        o.LJIIIZ(subBtnClickListener, "subBtnClickListener");
        this.LJLIL = subBtnClickListener;
        this.LJLILLLLZI = str;
        View findViewById = view.findViewById(R.id.azj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_subscribe)");
        this.LJLJI = (C2A7) findViewById;
        View findViewById2 = view.findViewById(R.id.m72);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_follow_desc)");
        this.LJLJJI = (C47121t6) findViewById2;
    }
}
