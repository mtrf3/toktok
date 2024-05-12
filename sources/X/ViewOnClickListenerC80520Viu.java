package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Viu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC80520Viu implements View.OnClickListener {
    public final /* synthetic */ C80509Vij LJLIL;

    public ViewOnClickListenerC80520Viu(C80509Vij c80509Vij) {
        this.LJLIL = c80509Vij;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC80524Viy interfaceC80524Viy = this.LJLIL.LJLJL;
        if (interfaceC80524Viy != null) {
            interfaceC80524Viy.LIZ(((Integer) view.getTag(R.id.jmw)).intValue());
        }
    }
}
