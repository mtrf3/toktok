package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TeL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogC75141TeL extends AbstractDialogC29234Bde {
    public final int LJLJI;
    public C47121t6 LJLJJI;
    public ImageView LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz1;
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJI = (C47121t6) findViewById(R.id.iya);
        this.LJLJJL = (ImageView) findViewById(R.id.iy7);
        this.LJLJJLL = (C47121t6) findViewById(R.id.iy9);
        this.LJLJL = (C47121t6) findViewById(R.id.iy_);
        ImageView imageView = this.LJLJJL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS33S0100000_13(this, 173));
        }
        int i = this.LJLJI;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.kj9));
            }
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.kik));
            }
            C47121t6 c47121t63 = this.LJLJL;
            if (c47121t63 == null) {
                return;
            }
            C87277YNd.LJJIIZ(c47121t63);
            return;
        }
        C47121t6 c47121t64 = this.LJLJJI;
        if (c47121t64 != null) {
            c47121t64.setText(C15380j0.LJIILJJIL(R.string.kil));
        }
        C47121t6 c47121t65 = this.LJLJJLL;
        if (c47121t65 != null) {
            c47121t65.setText(C15380j0.LJIILJJIL(R.string.kii));
        }
        C47121t6 c47121t66 = this.LJLJL;
        if (c47121t66 != null) {
            c47121t66.setText(C15380j0.LJIILJJIL(R.string.kij));
        }
        C47121t6 c47121t67 = this.LJLJL;
        if (c47121t67 == null) {
            return;
        }
        C87277YNd.LJJIJ(c47121t67);
    }

    public DialogC75141TeL(Context context, int i) {
        super(context);
        this.LJLJI = i;
    }
}
