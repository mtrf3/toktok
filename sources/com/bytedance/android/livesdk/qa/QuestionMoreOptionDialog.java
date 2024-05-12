package com.bytedance.android.livesdk.qa;

import X.C1A;
import X.C1EW;
import X.C28446BEk;
import X.C28465BFd;
import X.C28507BGt;
import X.C28863BUl;
import X.C28865BUn;
import X.C28868BUq;
import X.InterfaceC28458BEw;
import X.InterfaceC28558BIs;
import Y.AfS25S0110000_5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuestionMoreOptionDialog extends LiveDialogFragment implements InterfaceC28458BEw, InterfaceC28558BIs {
    public static final /* synthetic */ int LJLJLJ = 0;
    public QuestionEx LJLIL;
    public User LJLILLLLZI;
    public Question LJLJI;
    public Room LJLJJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public String LJLJJL = "";
    public String LJLJJLL = "";

    @Override // X.InterfaceC28458BEw
    public final void Hh() {
    }

    @Override // X.InterfaceC28558BIs
    public final void U3(Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC28558BIs
    public final void ck(boolean z) {
    }

    @Override // X.InterfaceC28458BEw
    public final void k1(C28465BFd c28465BFd, Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvq);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        String str;
        Question question;
        Question question2;
        QuestionEx questionEx;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        User user = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (str = (String) dataChannel2.kv0(C28863BUl.class)) == null) {
            str = "";
        }
        this.LJLJJL = str;
        if (o.LJ("qa_board", str)) {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                questionEx = (QuestionEx) dataChannel3.kv0(C28865BUn.class);
            } else {
                questionEx = null;
            }
            this.LJLIL = questionEx;
        }
        QuestionEx questionEx2 = this.LJLIL;
        if (questionEx2 != null) {
            question = questionEx2.question;
        } else {
            question = null;
        }
        this.LJLJI = question;
        if (question == null) {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                question2 = (Question) dataChannel4.kv0(C28868BUq.class);
            } else {
                question2 = null;
            }
            this.LJLJI = question2;
        }
        Question question3 = this.LJLJI;
        if (question3 != null) {
            user = question3.user;
        }
        this.LJLILLLLZI = user;
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 477));
        }
    }

    public final void vl(boolean z) {
        Question question = this.LJLJI;
        if (question != null) {
            C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).deleteQuestion(question.questionId)).LJJJLIIL(new AfS25S0110000_5(this, z, 6), C28446BEk.LJLIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
