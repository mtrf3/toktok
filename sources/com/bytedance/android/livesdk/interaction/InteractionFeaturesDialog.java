package com.bytedance.android.livesdk.interaction;

import X.BAO;
import X.BV1;
import X.BWP;
import X.BZI;
import X.C0GA;
import X.C16880lQ;
import X.C1DH;
import X.C1I;
import X.C1M;
import X.C1XY;
import X.C28507BGt;
import X.C28787BRn;
import X.C28900BVw;
import X.C29306Beo;
import X.C29494Bhq;
import X.C30627C0h;
import X.C41081jM;
import Y.ACListenerS23S0201000_5;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.QAQuickEntranceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class InteractionFeaturesDialog extends LiveDialogFragment implements C1M {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final BWP LJLIL = new BWP(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxz);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            C30627C0h.LJIJ(room.getId(), this.LJLIL);
        }
        super.onDestroy();
    }

    public final void wl() {
        if (BV1.LJ(this.dataChannel) || C1DH.LJJIIJ(this.dataChannel)) {
            if (BV1.LJ(this.dataChannel) && !BV1.LIZLLL(this.dataChannel)) {
                return;
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.igy);
            ((C41081jM) _$_findCachedViewById.findViewById(R.id.e_q)).setImageResource(R.drawable.d4v);
            ((TextView) _$_findCachedViewById.findViewById(R.id.title)).setText(R.string.ng3);
            ((TextView) _$_findCachedViewById.findViewById(R.id.desc)).setText(R.string.ms8);
            int i = BV1.LIZ;
            if (i != 0) {
                C29306Beo.LJJLJLI(_$_findCachedViewById.findViewById(R.id.isz));
                ((TextView) _$_findCachedViewById.findViewById(R.id.isz)).setText(String.valueOf(i));
            } else {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && o.LJ(dataChannel.kv0(C28900BVw.class), Boolean.TRUE)) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById.findViewById(R.id.isy));
                }
            }
            C29306Beo.LJJLJLI(_$_findCachedViewById);
            Dl(i);
            C16880lQ.LJIIJ(new ACListenerS23S0201000_5(i, _$_findCachedViewById, this, 3), _$_findCachedViewById);
        }
    }

    public final void xl() {
        if (BV1.LJ(this.dataChannel) || !QAQuickEntranceSetting.INSTANCE.enable() || !BV1.LJIIIZ(this.dataChannel)) {
            if (BV1.LJ(this.dataChannel)) {
                if (!BV1.LIZLLL(this.dataChannel) && !BV1.LJIIIIZZ(this.dataChannel) && !BV1.LJII(this.dataChannel)) {
                    return;
                }
            } else {
                return;
            }
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.il3);
        ((C41081jM) _$_findCachedViewById.findViewById(R.id.e_q)).setImageResource(R.drawable.d4y);
        ((TextView) _$_findCachedViewById.findViewById(R.id.title)).setText(R.string.msr);
        ((TextView) _$_findCachedViewById.findViewById(R.id.desc)).setText(R.string.msn);
        C29306Beo.LJJLJLI(_$_findCachedViewById);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_quick_mode_entrance_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ("interaction_panel", "enter_from");
        LIZ.LJJIIJZLJL();
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(_$_findCachedViewById, this, 20), _$_findCachedViewById);
    }

    public final void Gl() {
        LiveDialogFragment drawGuessStartDialog;
        FragmentManager fragmentManager;
        dismiss();
        if (C0GA.LIZ(this.dataChannel)) {
            drawGuessStartDialog = BAO.LIZ(false, false);
        } else {
            drawGuessStartDialog = new DrawGuessStartDialog();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) == null) {
            return;
        }
        C1XY.LJJIIJZLJL(drawGuessStartDialog, fragmentManager, "InteractionFeaturesDialog");
    }

    @Override // X.C1M
    public final void LIZ() {
        C29306Beo.LJI(_$_findCachedViewById(R.id.hw7).findViewById(R.id.c0x));
        C1I.LIZIZ(this);
    }

    public final void vl() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.lid);
        ((C41081jM) _$_findCachedViewById.findViewById(R.id.e_q)).setImageResource(R.drawable.d4v);
        ((TextView) _$_findCachedViewById.findViewById(R.id.title)).setText(R.string.msp);
        ((TextView) _$_findCachedViewById.findViewById(R.id.desc)).setText(R.string.mso);
        C29306Beo.LJJLJLI(_$_findCachedViewById);
        Dl(0);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 186), _$_findCachedViewById);
    }

    public final void Al(int i) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(Integer.valueOf(Math.min(i, 1)), "has_red_dot");
        LIZ.LJIJJ(Integer.valueOf(i), "show_question_number");
        LIZ.LJIJJ("interaction_entrance", "request_page");
        LIZ.LJJIIJZLJL();
    }

    public final void Dl(int i) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(Integer.valueOf(Math.min(i, 1)), "has_red_dot");
        LIZ.LJIJJ(Integer.valueOf(i), "show_question_number");
        LIZ.LJIJJ("interaction_entrance", "request_page");
        LIZ.LJJIIJZLJL();
        if (i > 0) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_qa_red_dot_show");
            LIZ2.LJIILLIIL(this.dataChannel);
            LIZ2.LJIJJ(Integer.valueOf(i), "show_question_number");
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // X.C1M
    public final void LJIILIIL(long j) {
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.hw7).findViewById(R.id.c0x));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        C1I.LIZIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041d  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
