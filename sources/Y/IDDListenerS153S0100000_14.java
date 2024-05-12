package Y;

import X.AbstractC79941VYz;
import X.VZ3;
import X.VZ6;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;

/* loaded from: classes15.dex */
public class IDDListenerS153S0100000_14 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS153S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS153S0100000_14 iDDListenerS153S0100000_14, DialogInterface dialogInterface) {
        ((UploadPicStickerARPresenter) iDDListenerS153S0100000_14.l0).LJJIIZI();
    }

    public static final void onDismiss$1(IDDListenerS153S0100000_14 iDDListenerS153S0100000_14, DialogInterface dialogInterface) {
        VZ6 vz6 = ((AbstractC79941VYz) iDDListenerS153S0100000_14.l0).LJLJJI;
        if (vz6 != null) {
            VZ3 vz3 = (VZ3) vz6;
            AbstractC79941VYz abstractC79941VYz = vz3.LIZ;
            if (!abstractC79941VYz.LJLJL && abstractC79941VYz.LJFF().LIZ != null) {
                vz3.LIZ.LJFF().LIZ.onCancel();
            }
        }
    }
}
