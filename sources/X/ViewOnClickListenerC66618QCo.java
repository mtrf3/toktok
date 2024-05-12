package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.QCo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnClickListenerC66618QCo implements View.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;

    public ViewOnClickListenerC66618QCo(Context context, Intent intent) {
        this.LJLIL = context;
        this.LJLILLLLZI = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            C16880lQ.LIZJ(this.LJLIL, this.LJLILLLLZI);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
