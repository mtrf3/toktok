package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BB8 extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BB8(Object obj) {
        super(1, obj, ModeratorHostIModerateDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP p0) {
        o.LJIIIZ(p0, "p0");
        DialogFragment dialogFragment = (DialogFragment) this.receiver;
        dialogFragment.getClass();
        if (p0 == BBP.DISMISS) {
            dialogFragment.dismiss();
        }
        return C76800UCe.LIZ;
    }
}
