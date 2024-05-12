package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76095Ttj implements InterfaceC025208a {
    public final /* synthetic */ LinkDialog LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public C76095Ttj(LinkDialog linkDialog, View view) {
        this.LJLIL = linkDialog;
        this.LJLILLLLZI = view;
    }

    @Override // X.InterfaceC025208a
    public final void onBackStackChanged() {
        InteractDialogFragmentBaseContract$AbsView<?> LIZJ = this.LJLIL.xl().LIZJ();
        if (LIZJ != null) {
            LinkDialog linkDialog = this.LJLIL;
            View view = this.LJLILLLLZI;
            if (!LIZJ.isViewValid() || linkDialog.getDialog() == null) {
                return;
            }
            C76029Tsf vl = LIZJ.vl();
            o.LJIIIIZZ(vl, "it.createDialogParams()");
            linkDialog.LJLJJI.LIZIZ(LinkDialog.LJLJLJ[0], linkDialog, vl);
            if (linkDialog.wl().LJIIIIZZ) {
                View findViewById = view.findViewById(R.id.ft2);
                if (findViewById == null) {
                    return;
                }
                findViewById.setVisibility(0);
                return;
            }
            View findViewById2 = view.findViewById(R.id.ft2);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            View findViewById3 = view.findViewById(R.id.dm7);
            if (findViewById3 == null) {
                return;
            }
            findViewById3.setBackgroundResource(R.drawable.cfi);
        }
    }
}
