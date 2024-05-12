package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes14.dex */
public abstract class U2M extends AbstractDialogC29234Bde {
    public final int LJLJI;
    public View LJLJJI;

    public abstract void LJJIIJZLJL();

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        LJJIIJZLJL();
        if (this.LJLJI == 5) {
            return;
        }
        View view = this.LJLJJI;
        if (view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (C15380j0.LJIIJJI() * 0.6d);
            }
        } else {
            layoutParams = null;
        }
        View view2 = this.LJLJJI;
        if (view2 == null) {
            return;
        }
        view2.setLayoutParams(layoutParams);
    }

    public U2M(Context context, int i) {
        super(context);
        this.LJLJI = i;
    }
}
