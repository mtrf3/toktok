package X;

import Y.ACListenerS32S0100000_12;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6P {
    public final Activity LIZ;
    public final View LIZIZ;
    public final C90183gM LIZJ;
    public final QuestionDetailParam LIZLLL;
    public final MIM LJ;
    public ForumStruct LJFF;
    public T5I LJI;
    public final IQAInvitationService LJII;
    public boolean LJIIIIZZ;

    public T6P(Activity activity, View view, C90183gM c90183gM, QuestionDetailParam questionDetailParam, MIM questionDetailTime) {
        o.LJIIIZ(questionDetailTime, "questionDetailTime");
        this.LIZ = activity;
        this.LIZIZ = view;
        this.LIZJ = c90183gM;
        this.LIZLLL = questionDetailParam;
        this.LJ = questionDetailTime;
        IQAInvitationService LJI = QAInvitationService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
        this.LJII = LJI;
        c90183gM.LIZJ(AnonymousClass391.LIZ(24.0d), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(13.5d))));
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 121), view);
    }
}
