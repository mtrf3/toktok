package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.A9a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC25758A9a implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<View, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC25758A9a(int i, long j, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        Object tag = view.getTag(this.LJLIL);
        if (tag == null) {
            tag = 0;
        }
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        view.setTag(this.LJLIL, Long.valueOf(uptimeMillis));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (uptimeMillis - j > this.LJLILLLLZI) {
            this.LJLJI.invoke(view);
        }
    }
}
