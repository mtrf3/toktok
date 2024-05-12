package Y;

import X.BIK;
import X.BZA;
import X.C15380j0;
import X.C1YG;
import X.C28553BIn;
import X.C28555BIp;
import X.C30168Bsi;
import X.C30185Bsz;
import X.C34K;
import X.C39849FkT;
import X.C40210FqI;
import X.C47121t6;
import X.C72972SkS;
import X.C8HI;
import X.CN1;
import X.InterfaceC30237Btp;
import X.InterfaceC64592gB;
import X.X1D;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public class AfS20S0400000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS20S0400000_5 afS20S0400000_5, Object obj) {
        PerceptionDialogInfo perceptionDialogInfo;
        ViolationStatusResponse.ResponseData responseData = ((ViolationStatusResponse) obj).data;
        if (responseData != null) {
            if (responseData.status == 0) {
                ((UserManageService) afS20S0400000_5.l0).Qp0((Context) afS20S0400000_5.l1, (C28555BIp) afS20S0400000_5.l2);
                return;
            }
            if (responseData.status != 1) {
                return;
            }
            UserManageService userManageService = (UserManageService) afS20S0400000_5.l0;
            Context context = (Context) afS20S0400000_5.l1;
            DataChannel dataChannel = (DataChannel) afS20S0400000_5.l3;
            C28555BIp c28555BIp = (C28555BIp) afS20S0400000_5.l2;
            userManageService.getClass();
            if (context == null) {
                return;
            }
            PerceptionMessage perceptionMessage = new PerceptionMessage();
            PunishEventInfo punishEventInfo = null;
            if (responseData != null) {
                perceptionDialogInfo = responseData.perceptionDialog;
            } else {
                perceptionDialogInfo = null;
            }
            perceptionMessage.dialog = perceptionDialogInfo;
            if (responseData != null) {
                punishEventInfo = responseData.punishEvent;
            }
            perceptionMessage.publicEventInfo = punishEventInfo;
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showDialog(context, perceptionMessage, dataChannel, new C28553BIn(userManageService, c28555BIp, responseData));
        }
    }

    public static final void accept$1(AfS20S0400000_5 afS20S0400000_5, Object obj) {
        String string;
        StringBuilder LIZ;
        C30185Bsz c30185Bsz = (C30185Bsz) obj;
        C47121t6 c47121t6 = (C47121t6) afS20S0400000_5.l0;
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        if (!C15380j0.LJIIZILJ()) {
            string = C39849FkT.LIZ().getResources().getString(R.string.nbh, String.valueOf(c30185Bsz.LIZ));
        } else {
            string = C39849FkT.LIZ().getResources().getString(R.string.nbi, String.valueOf(c30185Bsz.LIZ));
        }
        o.LJIIIIZZ(string, "if (!ResUtil.isRTL()) co…tl, it.amount.toString())");
        C47121t6 c47121t62 = (C47121t6) afS20S0400000_5.l0;
        if (c47121t62 != null) {
            if (!C15380j0.LJIIZILJ()) {
                LIZ = C72972SkS.LJFF(string, ' ');
            } else {
                LIZ = X1D.LIZ();
                LIZ.append(' ');
                LIZ.append(string);
            }
            c47121t62.setText(X1D.LIZIZ(LIZ));
        }
        ((C30168Bsi) afS20S0400000_5.l1).getClass();
        new C1YG(((InterfaceC30237Btp) afS20S0400000_5.l2).LJFF());
        throw new UnsupportedOperationException();
    }

    public static final void accept$2(AfS20S0400000_5 afS20S0400000_5, Object obj) {
        LiveDialogFragment liveDialogFragment;
        if (obj == Lifecycle.Event.ON_RESUME) {
            boolean LJ = C40210FqI.LJ(((BIK) afS20S0400000_5.l0).LIZ);
            if (LJ && (liveDialogFragment = (LiveDialogFragment) afS20S0400000_5.l1) != null && liveDialogFragment.isShowing()) {
                ((LiveDialogFragment) afS20S0400000_5.l1).dismiss();
            }
            if (!((C34K) afS20S0400000_5.l2).element && !LJ) {
                BZA bza = (BZA) afS20S0400000_5.l3;
                bza.LIZ = "back_from_overlay";
                bza.LIZJ();
            }
            ((C34K) afS20S0400000_5.l2).element = false;
        }
    }

    public AfS20S0400000_5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
