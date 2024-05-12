package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS68S0201000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BVU implements View.OnClickListener {
    public final /* synthetic */ BV8 LJLIL;
    public final /* synthetic */ C28877BUz LJLILLLLZI;
    public final /* synthetic */ QuestionEx LJLJI;
    public final /* synthetic */ int LJLJJI;

    public BVU(BV8 bv8, C28877BUz c28877BUz, QuestionEx questionEx, int i) {
        this.LJLIL = bv8;
        this.LJLILLLLZI = c28877BUz;
        this.LJLJI = questionEx;
        this.LJLJJI = i;
    }

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-4893863405263284206")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C1DH.LJJIIJZLJL(this.LJLIL.LJZ)) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJJI;
            Boolean LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "ANCHOR_FIRST_SWITCH_QUESTION.value");
            if (LIZJ.booleanValue() && this.LJLIL.LJZ.kv0(CurrentQuestionChannel.class) != null) {
                Object kv0 = this.LJLIL.LJZ.kv0(CurrentQuestionChannel.class);
                o.LJII(kv0, "null cannot be cast to non-null type com.bytedance.android.livesdk.qa.QuestionEx");
                if (((QuestionEx) kv0).question.questionId != 0) {
                    Boolean bool = Boolean.FALSE;
                    c48459J0d.LIZ(bool);
                    InterfaceC30442Bx8.LLJJ.LIZ(bool);
                    C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI.LJLIL);
                    c47071t1.LJIILL = true;
                    c47071t1.LJIILLIIL(R.string.mt5);
                    c47071t1.LJFF(R.string.mt4);
                    c47071t1.LJIIL(R.string.mt3, new BVW(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
                    c47071t1.LJIIIZ(R.string.kg7, BVX.LJLIL);
                    LIZ(c47071t1.LIZ());
                    return;
                }
            }
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.LLJJ;
            Boolean LIZJ2 = c48459J0d2.LIZJ();
            o.LJIIIIZZ(LIZJ2, "ANCHOR_FIRST_ANSWER.value");
            if (LIZJ2.booleanValue()) {
                c48459J0d2.LIZ(Boolean.FALSE);
                C47071t1 c47071t12 = new C47071t1(this.LJLILLLLZI.LJLIL);
                c47071t12.LJIILL = true;
                c47071t12.LJIILLIIL(R.string.ms0);
                c47071t12.LJFF(R.string.mrz);
                c47071t12.LJIIL(R.string.mry, new BVV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
                c47071t12.LJIIIZ(R.string.kg7, BVY.LJLIL);
                LIZ(c47071t12.LIZ());
                return;
            }
            C28877BUz c28877BUz = this.LJLILLLLZI;
            BV8.LLIIIZ(c28877BUz.LJLIL, new AqS68S0201000_5(c28877BUz, this.LJLJI, this.LJLJJI, 0));
            return;
        }
        C30868C9o.LIZJ(R.string.ofj);
    }
}
