package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class MJH extends FrameLayout implements View.OnClickListener {
    public TextView LJLIL;
    public TuxIconView LJLILLLLZI;
    public MJP LJLJI;

    public MJH() {
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLJI == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.mip) {
            this.LJLJI.LIZ(view);
        } else {
            if (id != R.id.jb6) {
                return;
            }
            this.LJLJI.LIZIZ(view);
        }
    }

    public void setOnInternalClickListener(MJP mjp) {
        this.LJLJI = mjp;
    }

    public MJH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cih, this, true);
        this.LJLIL = (TextView) LLLLIILL.findViewById(R.id.mip);
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.jb6);
        this.LJLILLLLZI = tuxIconView;
        C7FA.LIZIZ(tuxIconView);
        C16880lQ.LJJJ(this.LJLILLLLZI, this);
        C16880lQ.LJIJI(this.LJLIL, this);
    }
}
