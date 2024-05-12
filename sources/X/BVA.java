package X;

import Y.AObjectS122S0200000_5;
import Y.AfS37S0000000_5;
import Y.AfS54S0200000_5;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BVA extends RecyclerView.ViewHolder {
    public Question LJLIL;
    public final Context LJLILLLLZI;
    public final View LJLJI;
    public Boolean LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final /* synthetic */ BV9 LJLJLJ;

    public static void N(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-8363152899521081139")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final void L(QuestionEx questionEx) {
        long j;
        this.LJLJLJ.getClass();
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        Room room = this.LJLJLJ.LJZL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLJL.LIZ(C1EW.LIZ(qAApi.startAnswer(j, this.LJLIL.questionId, questionEx.LJLJI ? 1 : 0)).LJJJLIIL(new AfS54S0200000_5(this, questionEx, 54), new AfS37S0000000_5(11)));
    }

    public final void P(final int i, final QuestionEx questionEx) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJJ;
        if (c48459J0d.LIZJ().booleanValue()) {
            c48459J0d.LIZ(Boolean.FALSE);
            C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
            c47071t1.LJIILL = true;
            c47071t1.LJIILLIIL(R.string.ms0);
            c47071t1.LJFF(R.string.mrz);
            c47071t1.LJIIL(R.string.mry, new C0K7() { // from class: X.BVQ
                @Override // X.C0K7
                public final void LJIILLIIL(LiveDialog liveDialog) {
                    BVA.this.Q(i, questionEx);
                    liveDialog.dismiss();
                }
            });
            c47071t1.LJIIIZ(R.string.kg7, new CK3());
            N(c47071t1.LIZ());
            return;
        }
        Q(i, questionEx);
    }

    public final void Q(final int i, final QuestionEx questionEx) {
        if (C1I.LIZJ) {
            C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
            c47071t1.LJIILL = true;
            c47071t1.LJIILLIIL(R.string.msd);
            c47071t1.LJFF(R.string.msc);
            c47071t1.LJIIIZ(R.string.msa, new C0K7() { // from class: X.BVJ
                @Override // X.C0K7
                public final void LJIILLIIL(LiveDialog liveDialog) {
                    BVA bva = BVA.this;
                    QuestionEx questionEx2 = questionEx;
                    int i2 = i;
                    bva.getClass();
                    C1I.LIZ.LIZ(1, new AObjectS122S0200000_5(bva, questionEx2, i2, 3));
                    liveDialog.dismiss();
                }
            });
            c47071t1.LJIIJJI(R.string.msb);
            N(c47071t1.LIZ());
            return;
        }
        L(questionEx);
    }

    public final void T(User user, String str) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(user);
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.chatType = "3";
        Question question = this.LJLIL;
        userProfileEvent.msgId = question.questionId;
        userProfileEvent.content = question.content;
        userProfileEvent.setClickUserPosition("qa_board");
        userProfileEvent.setClickModule(str);
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVA(BV9 bv9, Context context, View view) {
        super(view);
        this.LJLJLJ = bv9;
        this.LJLJJI = Boolean.FALSE;
        this.LJLJL = new C73318Sq2();
        this.LJLILLLLZI = context;
        this.LJLJI = view;
    }

    public static void M(ImageView imageView, TextView textView, int i, int i2, long j) {
        int i3;
        imageView.setBackgroundResource(i);
        textView.setText(b.LJIIL(j));
        textView.setTextColor(C259910h.LIZIZ(i2, textView.getContext()));
        if (j <= 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        textView.setVisibility(i3);
    }
}
