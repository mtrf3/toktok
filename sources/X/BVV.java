package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.qa.QuestionEx;
import kotlin.jvm.internal.AqS68S0201000_5;

/* loaded from: classes6.dex */
public final class BVV implements C0K7 {
    public final /* synthetic */ BV8 LJLIL;
    public final /* synthetic */ C28877BUz LJLILLLLZI;
    public final /* synthetic */ QuestionEx LJLJI;
    public final /* synthetic */ int LJLJJI;

    public BVV(BV8 bv8, C28877BUz c28877BUz, QuestionEx questionEx, int i) {
        this.LJLIL = bv8;
        this.LJLILLLLZI = c28877BUz;
        this.LJLJI = questionEx;
        this.LJLJJI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C28877BUz c28877BUz = this.LJLILLLLZI;
        BV8.LLIIIZ(c28877BUz.LJLIL, new AqS68S0201000_5(c28877BUz, this.LJLJI, this.LJLJJI, 1));
        liveDialog.dismiss();
    }
}
