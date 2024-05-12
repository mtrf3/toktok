package X;

import android.view.View;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.TFj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC74335TFj implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC74332TFg LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public ViewOnClickListenerC74335TFj(ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg, String str, String str2, boolean z) {
        this.LJLIL = viewOnClickListenerC74332TFg;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = this.LJLIL;
        if (viewOnClickListenerC74332TFg.LJZ == 0) {
            i = 1;
            viewOnClickListenerC74332TFg.LLIL.LIZLLL(true);
        } else {
            i = 0;
            viewOnClickListenerC74332TFg.LLIL.LIZLLL(false);
        }
        this.LJLIL.LLIL.LIZJ(i, this.LJLILLLLZI, this.LJLJI, new AqS178S0100000_12(this, 384));
    }
}
