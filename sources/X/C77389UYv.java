package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.rank.impl.list.RankListDialog;

/* renamed from: X.UYv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C77389UYv extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C77389UYv(Object obj) {
        super(0, obj, RankListDialog.class, "dismiss", "dismiss()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ((DialogFragment) this.receiver).dismiss();
        return C76800UCe.LIZ;
    }
}
