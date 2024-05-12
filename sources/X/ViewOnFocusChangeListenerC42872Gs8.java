package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Gs8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnFocusChangeListenerC42872Gs8 implements View.OnFocusChangeListener {
    public final /* synthetic */ ViewOnClickListenerC42873Gs9 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public ViewOnFocusChangeListenerC42872Gs8(ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9, boolean z) {
        this.LJLIL = viewOnClickListenerC42873Gs9;
        this.LJLILLLLZI = z;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i;
        View LIZ = this.LJLIL.LIZ(R.id.b3r);
        if (this.LJLILLLLZI && z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
        if (!z) {
            this.LJLIL.LIZIZ();
        }
        ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = this.LJLIL;
        InterfaceC42874GsA interfaceC42874GsA = viewOnClickListenerC42873Gs9.LJLIL;
        if (interfaceC42874GsA != null) {
            interfaceC42874GsA.LJIIIZ(String.valueOf(((C19K) viewOnClickListenerC42873Gs9.LIZ(R.id.czx)).getText()), z);
        }
    }
}
