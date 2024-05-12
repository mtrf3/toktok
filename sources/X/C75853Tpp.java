package X;

import Y.IDDListenerS152S0100000_13;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.Tpp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75853Tpp implements InterfaceC75855Tpr {
    public static final /* synthetic */ int LIZLLL = 0;
    public final DataChannel LIZ;
    public final InterfaceC75854Tpq LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC75855Tpr
    public final void dismiss() {
        this.LIZIZ.dismiss();
    }

    @Override // X.InterfaceC75855Tpr
    public final boolean isVisible() {
        return this.LIZIZ.isVisible();
    }

    @Override // X.InterfaceC75855Tpr
    public final void show() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            this.LIZIZ.show(fragmentManager, tag());
        }
    }

    @Override // X.InterfaceC75855Tpr
    public final String tag() {
        String str = this.LIZJ;
        if (str == null) {
            return "LinkDialog";
        }
        return str;
    }

    @Override // X.InterfaceC75855Tpr
    public final void LIZ(AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZIZ.setOnDismissListener(new IDDListenerS152S0100000_13(aqS163S0100000_13, 12));
    }

    public C75853Tpp(DataChannel dataChannel, LinkDialog linkDialog, String str) {
        this.LIZ = dataChannel;
        this.LIZIZ = linkDialog;
        this.LIZJ = str;
    }
}
