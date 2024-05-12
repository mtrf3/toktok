package X;

import Y.AfS2S0300100_13;
import Y.AfS3S0200100_13;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchBeInvitedFragmentV2;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tvv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76231Tvv extends AbstractC76222Tvm {
    public final MatchBaseWidget LJLJJI;
    public InterfaceC92693kP LJLJJL;
    public InterfaceC92693kP LJLJJLL;

    @Override // X.AbstractC76222Tvm
    public final void LIZLLL() {
    }

    @Override // X.AbstractC76222Tvm
    public final void LJ() {
        if (C76230Tvu.LIZ) {
            InterfaceC92693kP interfaceC92693kP = this.LJLJJLL;
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            InterfaceC92693kP interfaceC92693kP2 = this.LJLJJL;
            if (interfaceC92693kP2 != null) {
                interfaceC92693kP2.dispose();
            }
        }
    }

    @Override // X.AbstractC76222Tvm
    public final C76244Tw8 LJFF() {
        return (C76244Tw8) this.LJLJJI.LJZI(C76244Tw8.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // X.AbstractC76222Tvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(kotlin.jvm.internal.AqS179S0100000_13 r21) {
        /*
            r20 = this;
            r1 = 1
            X.C76261TwP.LIZ = r1
            r4 = r20
            V extends com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView r0 = r4.LJLILLLLZI
            com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView r0 = (com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView) r0
            r3 = 0
            if (r0 == 0) goto L72
            int r8 = r0.wl()
            if (r8 != r1) goto L73
            X.Twi r0 = X.C76265TwT.LIZIZ
            long r5 = r0.LIZIZ()
        L18:
            if (r1 == 0) goto L1b
            r3 = 2
        L1b:
            X.Tw8 r0 = r4.LJFF()
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L2f
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L2f:
            long r14 = r0.longValue()
            X.TwZ r7 = X.C76271TwZ.LIZ
            java.lang.String r13 = "active"
            r11 = 0
            r9 = r5
            r7.LJJJLZIJ(r8, r9, r11, r13)
            java.lang.Class<com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi> r0 = com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi.class
            java.lang.Object r13 = X.Q7L.LIZIZ(r0)
            com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi r13 = (com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi) r13
            r19 = 0
            r16 = r5
            r18 = r8
            X.Svk r1 = r13.reject(r14, r16, r18, r19)
            X.Svw r0 = r4.LIZ()
            java.lang.Object r1 = r1.LIZJ(r0)
            X.Bng r1 = (X.InterfaceC29856Bng) r1
            Y.AfS0S0201100_13 r2 = new Y.AfS0S0201100_13
            r8 = 0
            r7 = r21
            r2.<init>(r3, r4, r5, r7, r8)
            Y.AfS3S0200100_13 r0 = new Y.AfS3S0200100_13
            r13 = 1
            r8 = r0
            r9 = r5
            r11 = r7
            r12 = r4
            r8.<init>(r9, r11, r12, r13)
            X.SrX r0 = r1.LIZJ(r2, r0)
            r4.LJLJJLL = r0
            return
        L72:
            r8 = 0
        L73:
            X.Twi r0 = X.C76265TwT.LIZ
            long r5 = r0.LIZIZ()
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76231Tvv.LJI(kotlin.jvm.internal.AqS179S0100000_13):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76231Tvv(MultiMatchBeInvitedFragmentV2 multiMatchBeInvitedFragmentV2, MatchBaseWidget widget) {
        super(multiMatchBeInvitedFragmentV2);
        o.LJIIIZ(widget, "widget");
        this.LJLJJI = widget;
    }

    @Override // X.AbstractC76222Tvm
    public final void LIZJ(int i, AqS179S0100000_13 aqS179S0100000_13) {
        long LIZIZ;
        String str;
        C34K c34k = new C34K();
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView = (MultiMatchBeInvitedContract$AbsView) this.LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView != null && multiMatchBeInvitedContract$AbsView.wl() == 1) {
            c34k.element = true;
            LIZIZ = C76265TwT.LIZIZ.LIZIZ();
        } else {
            LIZIZ = C76265TwT.LIZ.LIZIZ();
        }
        Long value = LJFF().LIZ.getValue();
        if (value == null) {
            value = 0L;
        }
        long longValue = value.longValue();
        long value2 = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        long value3 = LiveTimeIncrementForBattleSetting.INSTANCE.getValue() + value2;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        boolean z = c34k.element;
        C76271TwZ.LJI = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", LIZIZ);
        C76271TwZ.LJJ(jSONObject, z);
        JSONObject LIZLLL = FT5.LIZLLL("role_type", "invitee");
        if (i == 0) {
            str = "normal";
        } else {
            str = "invite_each_other";
        }
        C05630Jz.LJI(LIZLLL, WM7.SCENE_SERVICE, str);
        c76271TwZ.LJL("reply_request", jSONObject, LIZLLL, new JSONObject(), false);
        C65814PsI.LIZ().getClass();
        this.LJLJJL = ((InterfaceC29856Bng) ((MultiMatchApi) C65814PsI.LIZIZ(MultiMatchApi.class)).acceptInvitePb(LIZIZ, longValue, value2, value3, i).LIZJ(LIZ())).LIZJ(new AfS2S0300100_13(LIZIZ, c34k, aqS179S0100000_13, this, 0), new AfS3S0200100_13(LIZIZ, c34k, aqS179S0100000_13, 0));
    }
}
