package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BUp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC28867BUp implements View.OnLongClickListener {
    public final /* synthetic */ Question LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ BWG LJLJI;

    public ViewOnLongClickListenerC28867BUp(Question question, DataChannel dataChannel, BWG bwg) {
        this.LJLIL = question;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = bwg;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.livesdk.model.message.Question, O] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        DialogFragment questionMoreOptionDialog;
        if (this.LJLIL.user.getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && (dataChannel = this.LJLILLLLZI) != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            DataChannel dataChannel2 = this.LJLILLLLZI;
            ?? r2 = this.LJLIL;
            BWG bwg = this.LJLJI;
            if (dataChannel2.kv0(RoomChannel.class) != null) {
                ((C32537Cpp) dataChannel2.gv0(C28868BUq.class)).LIZ = r2;
                ((C32537Cpp) dataChannel2.gv0(C28863BUl.class)).LIZ = "qa_comment";
                if (bwg.LJLL || bwg.LJLLI) {
                    ((C32537Cpp) dataChannel2.gv0(C28866BUo.class)).LIZ = Boolean.FALSE;
                    questionMoreOptionDialog = new QuestionMoreOptionDialog();
                } else {
                    questionMoreOptionDialog = new ReportQuestionDialog();
                }
                questionMoreOptionDialog.show(fragmentManager, "qa_comment");
            }
        }
        return true;
    }
}
