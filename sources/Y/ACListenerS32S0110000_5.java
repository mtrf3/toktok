package Y;

import X.BJM;
import X.C15380j0;
import X.C1A;
import X.C1EW;
import X.C28342BAk;
import X.C28388BCe;
import X.C28555BIp;
import X.C28835BTj;
import X.C28837BTl;
import X.CN1;
import X.InterfaceC28320B9o;
import android.view.View;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QADialog;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ACListenerS32S0110000_5 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS32S0110000_5 aCListenerS32S0110000_5, View view) {
        ReportQuestionDialog reportQuestionDialog;
        Question question;
        Room room;
        ReportQuestionDialog reportQuestionDialog2 = (ReportQuestionDialog) aCListenerS32S0110000_5.l0;
        DataChannel dataChannel = reportQuestionDialog2.dataChannel;
        String str = null;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            String LJFF = BJM.LJFF();
            String LJIIIIZZ = BJM.LJIIIIZZ();
            Question question2 = reportQuestionDialog2.LJLIL;
            if (question2 != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                long id2 = question2.user.getId();
                String secUid = question2.user.getSecUid();
                String str2 = reportQuestionDialog2.LJLILLLLZI;
                long j = question2.questionId;
                String str3 = question2.content;
                String LJIILIIL = BJM.LJIILIIL();
                C28837BTl LIZIZ = C28835BTj.LIZIZ(null, reportQuestionDialog2.dataChannel, "user_live_duration");
                DataChannel dataChannel2 = reportQuestionDialog2.dataChannel;
                if (dataChannel2 != null) {
                    str = (String) dataChannel2.kv0(C28388BCe.class);
                }
                C28555BIp c28555BIp = new C28555BIp(id, ownerUserId, id2, secUid, str2, j, 0L, str3, LJIILIIL, LJFF, LJIIIIZZ, "report_question", "3", LIZIZ, str);
                c28555BIp.LJJI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
                if (o.LJ(str2, "qa_board")) {
                    c28555BIp.LJ = (int) (C15380j0.LJIIJJI() * 0.73d);
                }
                ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qp0(reportQuestionDialog2.getContext(), c28555BIp);
            }
        }
        if (aCListenerS32S0110000_5.z1 && (question = (reportQuestionDialog = (ReportQuestionDialog) aCListenerS32S0110000_5.l0).LJLIL) != null) {
            C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).deleteQuestion(question.questionId)).LJJJLIIL(new AfS57S0100000_5(reportQuestionDialog, 244), C28342BAk.LJLIL);
        }
        ((ReportQuestionDialog) aCListenerS32S0110000_5.l0).dismiss();
    }

    public static final void onClick$1(ACListenerS32S0110000_5 aCListenerS32S0110000_5, View view) {
        DataChannel dataChannel;
        ((QADialog) aCListenerS32S0110000_5.l0).dismiss();
        if (aCListenerS32S0110000_5.z1 && (dataChannel = ((QADialog) aCListenerS32S0110000_5.l0).dataChannel) != null) {
            dataChannel.pv0(ShowInteractionFeatureDialogEvent.class);
        }
    }

    public static final void onClick$2(ACListenerS32S0110000_5 aCListenerS32S0110000_5, View view) {
        if (aCListenerS32S0110000_5.z1) {
            ((InterfaceC28320B9o) aCListenerS32S0110000_5.l0).f7();
        }
    }

    public ACListenerS32S0110000_5(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
