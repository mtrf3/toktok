package Y;

import X.C94302aeo;
import X.InterfaceC93473aRR;
import X.InterfaceC93654aUM;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* loaded from: classes34.dex */
public class IDCListenerS290S0100000_42 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS290S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS290S0100000_42 iDCListenerS290S0100000_42, DialogInterface dialogInterface) {
        InterfaceC93654aUM interfaceC93654aUM = (InterfaceC93654aUM) iDCListenerS290S0100000_42.l0;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.onCancel();
        }
    }

    public static final void onCancel$1(IDCListenerS290S0100000_42 iDCListenerS290S0100000_42, DialogInterface dialogInterface) {
        ((InterfaceC93473aRR) iDCListenerS290S0100000_42.l0).onCancel();
    }

    public static final void onCancel$2(IDCListenerS290S0100000_42 iDCListenerS290S0100000_42, DialogInterface dialogInterface) {
        C94302aeo.LJJIII(C94302aeo.LJLIL, CardStruct.IStatusCode.DEFAULT, "cancel", (DspPlatform) iDCListenerS290S0100000_42.l0, null, null, false, "unlink", "music_setting", "null");
    }
}
