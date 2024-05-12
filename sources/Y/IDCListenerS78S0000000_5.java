package Y;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* loaded from: classes6.dex */
public class IDCListenerS78S0000000_5 implements DialogInterface.OnClickListener {
    public final int $t;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                AbsAudienceInteractionFragment.lambda$showPipGuideDialog$28(dialogInterface, i);
                return;
            case 1:
                dialogInterface.dismiss();
                return;
            case 2:
                dialogInterface.dismiss();
                return;
            case 3:
                dialogInterface.dismiss();
                return;
            case 4:
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }

    public IDCListenerS78S0000000_5(int i) {
        this.$t = i;
    }
}
