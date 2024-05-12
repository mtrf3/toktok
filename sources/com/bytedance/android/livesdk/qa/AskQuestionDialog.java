package com.bytedance.android.livesdk.qa;

import X.B83;
import X.BV1;
import X.BZI;
import X.C03880Dg;
import X.C05170If;
import X.C05200Ii;
import X.C06540Nm;
import X.C16880lQ;
import X.C19K;
import X.C1A;
import X.C1EW;
import X.C259910h;
import X.C279117r;
import X.C28289B8j;
import X.C28507BGt;
import X.C28787BRn;
import X.C28852BUa;
import X.C28854BUc;
import X.C28856BUe;
import X.C28858BUg;
import X.C28860BUi;
import X.C28874BUw;
import X.C28876BUy;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A7;
import X.C30868C9o;
import X.C31665Cbl;
import X.C47071t1;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.DialogC77438UaI;
import X.InterfaceC05190Ih;
import X.InterfaceC65784Pro;
import X.OJD;
import X.QZP;
import X.ViewOnKeyListenerC28855BUd;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS20S1100000_5;
import Y.AfS57S0100000_5;
import Y.IDObjectS178S0100000_5;
import Y.IDcS170S0100000_5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.qa.QuestionDialogVisibilityChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCheckQuestionTooShortSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AskQuestionDialog extends LiveDialogFragment {
    public InputFilter LJLJJI;
    public C28856BUe LJLJJLL;
    public DialogC77438UaI LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public Room LJLJLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final int LJLIL = 50;
    public boolean LJLILLLLZI = true;
    public String LJLJI = "";
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public int LJLL = -1;
    public boolean LJLLI = true;
    public final ArrayList<QuestionEx> LJLLILLLL = new ArrayList<>();
    public final IDObjectS178S0100000_5 LJLLLL = new IDObjectS178S0100000_5(this, 6);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvs);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    public final Map<String, String> vl() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C28856BUe c28856BUe = this.LJLJJLL;
        if (c28856BUe != null) {
            if (BV1.LJFF(this.dataChannel)) {
                linkedHashMap.put("ask_enter_from", c28856BUe.LIZLLL);
            } else {
                linkedHashMap.put("show_question_cnt", String.valueOf(c28856BUe.LIZIZ + c28856BUe.LIZ));
                linkedHashMap.put("show_answered_question_cnt", String.valueOf(c28856BUe.LIZIZ));
                linkedHashMap.put("show_not_answered_question_cnt", String.valueOf(c28856BUe.LIZ));
                if (c28856BUe.LIZJ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_qa_list_end", str);
                linkedHashMap.put("ask_enter_from", "qa_list");
                linkedHashMap.put("qa_list_enter_from", c28856BUe.LIZLLL);
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DialogC77438UaI dialogC77438UaI = this.LJLJL;
        if (dialogC77438UaI != null) {
            dialogC77438UaI.dismiss();
        }
        _$_clearFindViewByIdCache();
    }

    public final String wl() {
        String str;
        Editable text;
        C19K c19k = (C19K) _$_findCachedViewById(R.id.ijh);
        if (c19k == null || (text = c19k.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        return QZP.LIZIZ("\t|\r|\n", str, " ");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C28856BUe c28856BUe;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 469));
            dataChannel.lv0(this, AudienceSuggestedQuestionSelected.class, new AqS171S0100000_5(this, 470));
        }
        DataChannel dataChannel2 = this.dataChannel;
        Room room = null;
        if (dataChannel2 != null) {
            c28856BUe = (C28856BUe) dataChannel2.kv0(C28858BUg.class);
        } else {
            c28856BUe = null;
        }
        this.LJLJJLL = c28856BUe;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            room = (Room) dataChannel3.kv0(RoomChannel.class);
        }
        this.LJLJLLL = room;
        this.LJLLL = BV1.LJIIIZ(this.dataChannel);
        this.LJLJJL.LIZ(C73943T0h.LIZ().LJ(C28860BUi.class).LJJJJZI(new AfS57S0100000_5(this, 159)));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLJJL.LIZLLL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(QuestionDialogVisibilityChannel.class, Boolean.FALSE);
        }
    }

    public final void xl(boolean z) {
        String str;
        int i;
        Room room;
        C28854BUc c28854BUc;
        Boolean bool;
        long j;
        CharSequence charSequence;
        C28856BUe c28856BUe = this.LJLJJLL;
        if (c28856BUe == null || (str = c28856BUe.LIZLLL) == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -782860283) {
            if (hashCode != 76509151) {
                if (hashCode == 950398559 && str.equals("comment")) {
                    i = 0;
                }
                i = -1;
            } else {
                if (str.equals("qa_card")) {
                    i = 2;
                }
                i = -1;
            }
        } else {
            if (str.equals("qa_entrance")) {
                i = 1;
            }
            i = -1;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && o.LJ(dataChannel2.kv0(UserIsAnchorChannel.class), Boolean.FALSE) && C29232Bdc.LJIIIZ(this.dataChannel)) {
            C30868C9o.LIZJ(R.string.ofl);
            BZI LIZ = C28787BRn.LIZ("livesdk_qa_sub_only_toast");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
            dismiss();
            return;
        }
        if (this.LJLJJLL != null) {
            Map<String, String> vl = vl();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_ask_publish");
            LIZ2.LJIIZILJ();
            LIZ2.LJJIFFI(vl);
            LIZ2.LJJIIJZLJL();
        }
        _$_findCachedViewById(R.id.iji).setEnabled(false);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (c28854BUc = (C28854BUc) dataChannel3.kv0(C28876BUy.class)) == null) {
            c28854BUc = new C28854BUc(false, true);
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            bool = Boolean.valueOf(roomAuthStatus.isEnableQuestion());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            C30868C9o.LIZJ(R.string.ofh);
            return;
        }
        if (c28854BUc.LJLIL) {
            if (c28854BUc.LJLILLLLZI) {
                C30868C9o.LIZLLL(R.string.ovy, getContext());
                return;
            } else {
                C30868C9o.LIZLLL(R.string.ovx, getContext());
                return;
            }
        }
        if (LiveCheckQuestionTooShortSetting.INSTANCE.enable()) {
            C19K c19k = (C19K) _$_findCachedViewById(R.id.ijh);
            if (c19k == null || (charSequence = c19k.getText()) == null) {
                charSequence = "";
            }
            if (new OJD("\\s").replace(charSequence, "").length() <= 5) {
                C47071t1 c47071t1 = new C47071t1(getContext());
                c47071t1.LJIILLIIL(R.string.nrh);
                c47071t1.LJFF(R.string.nrg);
                c47071t1.LJIIIZ(R.string.nrb, new IDcS170S0100000_5(this, 26));
                c47071t1.LJIIL(R.string.nra, new IDcS170S0100000_5(this, 27));
                c47071t1.LJIILJJIL = false;
                LiveDialog LIZ3 = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "-1293138593799170373")).LIZ) {
                    LIZ3.show();
                }
                BZI LIZ4 = C28787BRn.LIZ("livesdk_qa_deny_popup_show");
                LIZ4.LJIILLIIL(this.dataChannel);
                LIZ4.LJJIFFI(vl());
                LIZ4.LJJIIJZLJL();
                return;
            }
        }
        String wl = wl();
        DataChannel dataChannel4 = this.dataChannel;
        String str2 = C28852BUa.LIZJ;
        if (str2 != null) {
            BZI LIZ5 = C28787BRn.LIZ("livesdk_qa_rethink_send_after_edit_ck");
            C06540Nm.LJFF((C29374Bfu) C279117r.LIZJ(LIZ5, dataChannel4), LIZ5, "user_id", str2, "comment_hit_model");
            LIZ5.LJIJJ(wl, "comment_resend");
            C28289B8j.LIZJ(SystemClock.uptimeMillis(), C28852BUa.LIZIZ, LIZ5, "edit_duration");
            C28852BUa.LIZJ = null;
        }
        int i2 = this.LJLL;
        if (i2 >= 0) {
            j = ((QuestionEx) ListProtector.get(this.LJLLILLLL, i2)).question.questionId;
        } else {
            j = 0;
        }
        int i3 = this.LJLL;
        if (i3 >= 0) {
            o.LJIIIIZZ(((QuestionEx) ListProtector.get(this.LJLLILLLL, i3)).question.content, "recommendQuestionList[re…edIndex].question.content");
            this.LJLLI = !o.LJ(wl, new OJD("\t|\r|\n").replace(r4, " "));
        }
        C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).submitQuestion(room.getId(), wl, i, z ? 1 : 0, j)).LJJJLIIL(new AfS20S1100000_5(this, wl, 2), new AfS20S1100000_5(this, wl, 3));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJLL != null) {
            Map<String, String> vl = vl();
            BZI LIZ = C28787BRn.LIZ("livesdk_qa_ask_click");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIFFI(vl);
            LIZ.LJJIIJZLJL();
        }
        Room room = this.LJLJLLL;
        if (room != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_keyboard_show");
            LIZ2.LJIJJ(Integer.valueOf(this.LJLLJ ? 1 : 0), "is_direct");
            LIZ2.LJFF(String.valueOf(room.getOwnerUserId()));
            LIZ2.LJJIIJ(room.getIdStr());
            LIZ2.LJJIIJZLJL();
        }
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.a8j), new ACListenerS25S0100000_5(this, 299));
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJIIIIZZ(interfaceC05190Ih, "getInstance().user().currentUser");
        C29306Beo.LJIIIZ(_$_findCachedViewById(R.id.ngu));
        _$_findCachedViewById(R.id.iji).setEnabled(false);
        ((TextView) _$_findCachedViewById(R.id.h1d)).setText(C05170If.LIZ(C05200Ii.LIZIZ()));
        C31665Cbl.LJIIJ((ImageView) _$_findCachedViewById(R.id.a9o), interfaceC05190Ih.getAvatarThumb(), _$_findCachedViewById(R.id.a9o).getWidth(), _$_findCachedViewById(R.id.a9o).getHeight(), C259910h.LJ(R.attr.asx, getContext()));
        if (LiveCheckQuestionTooShortSetting.INSTANCE.enable()) {
            ((TextView) _$_findCachedViewById(R.id.ijh)).setHint(R.string.nrf);
        } else {
            ((TextView) _$_findCachedViewById(R.id.ijh)).setHint(R.string.nrf);
        }
        ((TextView) _$_findCachedViewById(R.id.ijh)).addTextChangedListener(this.LJLLLL);
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.iji), new ACListenerS25S0100000_5(this, 300));
        _$_findCachedViewById(R.id.ijh).setOnKeyListener(new ViewOnKeyListenerC28855BUd(this));
        _$_findCachedViewById(R.id.ijh).postDelayed(new ARunnableS41S0100000_5(this, 258), 200L);
        if (this.LJLLL) {
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.k0a), new ACListenerS25S0100000_5(this, 302));
            C28874BUw.LIZIZ(2, 2, new AqS171S0100000_5(this, 688));
        }
    }
}
