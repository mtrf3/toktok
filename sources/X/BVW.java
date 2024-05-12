package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.qa.QuestionEx;

/* loaded from: classes6.dex */
public final class BVW implements C0K7 {
    public final /* synthetic */ C28877BUz LJLIL;
    public final /* synthetic */ QuestionEx LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public BVW(C28877BUz c28877BUz, QuestionEx questionEx, int i) {
        this.LJLIL = c28877BUz;
        this.LJLILLLLZI = questionEx;
        this.LJLJI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        this.LJLIL.L(this.LJLJI, this.LJLILLLLZI);
        liveDialog.dismiss();
    }
}
