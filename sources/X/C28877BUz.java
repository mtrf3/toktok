package X;

import Y.AfS54S0200000_5;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import kotlin.jvm.internal.o;

/* renamed from: X.BUz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28877BUz extends RecyclerView.ViewHolder {
    public final Context LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public Question LJLJI;
    public final /* synthetic */ BV8 LJLJJI;

    public final void L(int i, QuestionEx questionEx) {
        this.LJLJJI.LJZL = i;
        questionEx.LJLILLLLZI = true;
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        long id = this.LJLJJI.LJZI.getId();
        Question question = this.LJLJI;
        if (question != null) {
            this.LJLILLLLZI.LIZ(C1EW.LIZ(qAApi.startAnswer(id, question.questionId, 2)).LJJJLIIL(new AfS54S0200000_5(this.LJLJJI, questionEx, 53), B5Q.LJLIL));
        } else {
            o.LJIJI("question");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28877BUz(BV8 bv8, View view, Context context) {
        super(view);
        this.LJLJJI = bv8;
        this.LJLIL = context;
        this.LJLILLLLZI = new C73318Sq2();
    }
}
