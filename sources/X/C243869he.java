package X;

import Y.ARunnableS15S0300000_4;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import kotlin.jvm.internal.AqS154S0100000_4;

/* renamed from: X.9he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243869he implements InterfaceC85767XlL {
    public DialogC25756A8y LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ PasskeyPopUpHelper LJLJI;
    public final /* synthetic */ InterfaceC243879hf LJLJJI;

    @Override // X.InterfaceC85767XlL
    public final void LJII() {
        Activity activity = this.LJLILLLLZI;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS23S0200000_4(this, activity, 38));
        }
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJJJZI(Parcelable parcelable) {
        Activity activity = this.LJLILLLLZI;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS15S0300000_4(this, this.LJLJI, activity, 14));
        }
    }

    public C243869he(ActivityC45651qj activityC45651qj, PasskeyPopUpHelper passkeyPopUpHelper, InterfaceC243879hf interfaceC243879hf) {
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = passkeyPopUpHelper;
        this.LJLJJI = interfaceC243879hf;
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJZ(Throwable th, boolean z, Boolean bool, boolean z2) {
        Activity activity = this.LJLILLLLZI;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS40S0100000_4(this, 147));
        }
        if (th != null) {
            C85760XlE.LIZLLL(this.LJLILLLLZI, th, true, z, bool, new AqS154S0100000_4(this.LJLJJI, 1209));
        }
    }
}
