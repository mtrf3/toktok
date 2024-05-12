package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import java.lang.ref.Reference;

/* renamed from: X.Bnx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC29873Bnx implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.LJLIL) {
            case 0:
                ((C29867Bnr) this.LJLILLLLZI).LJLLI.rv0(ToolBarShareVisibleChannel.class, Boolean.FALSE);
                return;
            default:
                Activity activity = (Activity) ((Reference) this.LJLILLLLZI).get();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ DialogInterfaceOnDismissListenerC29873Bnx(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
