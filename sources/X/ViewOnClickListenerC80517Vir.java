package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vir, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80517Vir implements View.OnClickListener {
    public final /* synthetic */ C80506Vig LJLIL;

    public ViewOnClickListenerC80517Vir(C80506Vig c80506Vig) {
        this.LJLIL = c80506Vig;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.LIZ(((Integer) view.getTag(R.id.jmw)).intValue());
    }
}
