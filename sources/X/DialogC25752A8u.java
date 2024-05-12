package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.A8u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25752A8u extends Dialog {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public View LJLJI;
    public LinearLayout LJLJJI;
    public TuxTextView LJLJJL;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mb);
        setCanceledOnTouchOutside(true);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            C61713OJx LIZLLL = C61712OJw.LIZLLL((ActivityC45651qj) LJIIIIZZ, this);
            LIZLLL.LIZIZ.LJIIL();
            LIZLLL.LIZIZ.LJIIJJI();
            LIZLLL.LIZJ();
        }
        Window window = getWindow();
        window.setLayout(-1, -1);
        window.setBackgroundDrawableResource(R.color.cz);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        this.LJLJI = findViewById(R.id.k5w);
        this.LJLJJI = (LinearLayout) findViewById(R.id.k5x);
        this.LJLJJL = (TuxTextView) findViewById(R.id.k5y);
        this.LJLJI.setVisibility(0);
        this.LJLJJI.setLayoutParams(this.LJLJJI.getLayoutParams());
        this.LJLJJI.setPadding(C32151Nz.LJIILLIIL(Float.valueOf(32.0f)), (int) ((this.LJLIL.getResources().getDisplayMetrics().heightPixels * 0.06d) + C63081OpJ.LJJJJLI(this.LJLIL)), C32151Nz.LJIILLIIL(Float.valueOf(32.0f)), C61410O8g.LIZIZ(this.LJLIL));
        this.LJLJJL.setText(C16880lQ.LLLZ(this.LJLIL.getResources().getString(R.string.q_2), new Object[]{this.LJLILLLLZI}));
    }

    public DialogC25752A8u(Context context, String str) {
        super(context, R.style.a_t);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
    }
}
