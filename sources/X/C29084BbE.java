package X;

import Y.AfS3S1100100_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS281S0100000_5;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BbE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29084BbE {
    public final Room LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;
    public final Fragment LIZLLL;
    public final C10W LJ;
    public String LJFF;
    public boolean LJI;

    public final boolean LIZ() {
        if (LiveMode.SCREEN_RECORD == this.LIZJ.kv0(BCX.class)) {
            return true;
        }
        return false;
    }

    public final void LIZJ(Cert cert) {
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_confirm");
        LIZ.LJIILLIIL(this.LIZJ);
        LiveMode streamType = this.LIZ.getStreamType();
        o.LJIIIIZZ(streamType, "mRoom.streamType");
        LIZ.LJIJJ(C28509BGv.LIZ(streamType), "live_type");
        LIZ.LJJIIJZLJL();
        InterfaceC30442Bx8.LJJIJ.LIZ(Boolean.TRUE);
        this.LJ.Lc(10001);
        this.LJ.Ta(1, cert);
        C29689Bkz.LIZ.LJIIL(C29091BbL.LJLIL);
        C74740TUy.LIZLLL().LJI(0);
    }

    public final void onEvent(C28268B7o c28268B7o) {
        String LJIILJJIL;
        int intValue;
        String str;
        int i = c28268B7o.LIZ;
        boolean z = false;
        int i2 = 1;
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 17) {
                        switch (i) {
                            case 45:
                                if (!LIZ()) {
                                    return;
                                }
                                this.LJ.Ta(64, C78857UxB.LJJIIJ(1476788483, "bpea-stoplive_click_tips"));
                                if (C29306Beo.LJIJJLI(this.LJFF)) {
                                    C7N.LJFF().Lu();
                                    Context context = this.LIZIZ;
                                    C28871BUt c28871BUt = new C28871BUt(this.LJFF);
                                    c28871BUt.LIZJ = true;
                                    c28871BUt.LIZIZ = C15380j0.LJIILJJIL(R.string.snt);
                                    C30882CAc.LJII(context, c28871BUt);
                                    return;
                                }
                                Context context2 = this.LIZIZ;
                                if (context2 == null) {
                                    return;
                                }
                                C16880lQ.LIZJ(context2, new Intent(this.LIZIZ, (Class<?>) ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(6)));
                                return;
                            case 46:
                                if (!LIZ()) {
                                    return;
                                }
                                this.LJI = true;
                                return;
                            case 47:
                                if (!LIZ()) {
                                    return;
                                }
                                this.LJI = false;
                                return;
                            default:
                                return;
                        }
                    }
                    this.LJ.Lc(10001);
                    C29689Bkz.LIZ.LJIIL(C29090BbK.LJLIL);
                    this.LJ.Ta(1, C78857UxB.LJJIIJ(1476788483, "bpea-802"));
                    return;
                }
            } else {
                ControlMessage controlMessage = c28268B7o.LIZJ;
                if ((controlMessage instanceof ControlMessage) && controlMessage.action == 4) {
                    Text text = controlMessage.floatText;
                    if (text != null) {
                        str = text.defaultPattern;
                    } else {
                        str = null;
                    }
                    this.LJ.Q3(CXJ.LJFF(text, str).toString(), controlMessage.punishInfo, controlMessage.floatStyle);
                    ControlMessage.Extra extra = controlMessage.extraInfo;
                    if (extra != null) {
                        this.LJFF = extra.banInfoUrl;
                        CXJ.LJFF(extra.title, "");
                        CXJ.LJFF(extra.violationReason, "");
                        CXJ.LJFF(extra.illegalText, "");
                    }
                    if (LIZ() && this.LJI) {
                        z = true;
                    }
                    if (C29306Beo.LJIJJLI(this.LJFF) && !z) {
                        C7N.LJFF().Lu();
                        Context context3 = this.LIZIZ;
                        C28871BUt c28871BUt2 = new C28871BUt(this.LJFF);
                        c28871BUt2.LIZJ = true;
                        c28871BUt2.LIZIZ = C15380j0.LJIILJJIL(R.string.snt);
                        C30882CAc.LJII(context3, c28871BUt2);
                    }
                    PerceptionDialogInfo perceptionDialogInfo = controlMessage.perceptionDialogInfo;
                    if (perceptionDialogInfo != null) {
                        DataChannelGlobal.LJLJJI.tv0(PerceptionDialogChannel.class, perceptionDialogInfo);
                    }
                    PunishEventInfo punishEventInfo = controlMessage.punishInfo;
                    if (punishEventInfo != null) {
                        DataChannelGlobal.LJLJJI.tv0(PunishInfoChannel.class, punishEventInfo);
                    }
                    this.LJ.Lc(10003);
                    C29689Bkz.LIZ.LJIIL(C29089BbJ.LJLIL);
                    i2 = 32;
                } else {
                    this.LJ.Lc(c28268B7o.LIZIZ);
                    C29689Bkz.LIZ.LJIIL(new AqS171S0100000_5(c28268B7o, 600));
                }
                this.LJ.Ta(i2, C78857UxB.LJJIIJ(1476788483, "bpea-579"));
                return;
            }
        }
        Context context4 = this.LIZIZ;
        if (context4 == null || BH7.LIZLLL(context4, this.LIZJ, new C29088BbI(this), new C29086BbG(this), new C83280WmK(this))) {
            return;
        }
        Integer num = (Integer) this.LIZJ.kv0(C28401BCr.class);
        if (num == null || (intValue = num.intValue()) <= 0) {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.ka0);
        } else {
            LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.kf, intValue, Integer.valueOf(intValue));
        }
        long currentTimeMillis = System.currentTimeMillis();
        LiveMode liveMode = (LiveMode) this.LIZJ.kv0(BCX.class);
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        C1EW.LIZ(C28718BOw.LIZ().LIZ().getAnchorPreFinish(this.LIZ.getId()).LJII(BTJ.LIZIZ(this.LIZLLL))).LJJJLIIL(new AfS3S1100100_5(currentTimeMillis, this, liveMode, LJIILJJIL, 3), new AfS3S1100100_5(currentTimeMillis, this, liveMode, LJIILJJIL, 4));
    }

    public final void LIZIZ(int i, boolean z) {
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_cancel");
        LIZ.LJIILLIIL(this.LIZJ);
        LiveMode streamType = this.LIZ.getStreamType();
        o.LJIIIIZZ(streamType, "mRoom.streamType");
        LIZ.LJIJJ(C28509BGv.LIZ(streamType), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    LIZ.LJIJJ("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                LIZ.LJIJJ("high_acu", "sub_only_live_strategy");
            }
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        LIZ.LJJIIJZLJL();
        InterfaceC30442Bx8.LJJIJ.LIZ(Boolean.FALSE);
    }

    public final void LIZLLL(int i, boolean z) {
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_popup");
        LIZ.LJIILLIIL(this.LIZJ);
        LiveMode streamType = this.LIZ.getStreamType();
        o.LJIIIIZZ(streamType, "mRoom.streamType");
        LIZ.LJIJJ(C28509BGv.LIZ(streamType), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    LIZ.LJIJJ("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                LIZ.LJIJJ("high_acu", "sub_only_live_strategy");
            }
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        LIZ.LJJIIJZLJL();
    }

    public C29084BbE(Room mRoom, Context context, DataChannel dataChannel, Fragment fragment, C10W stopliveListener) {
        o.LJIIIZ(mRoom, "mRoom");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(stopliveListener, "stopliveListener");
        this.LIZ = mRoom;
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
        this.LIZLLL = fragment;
        this.LJ = stopliveListener;
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C28268B7o.class).LJII(BTJ.LIZIZ(fragment)).LIZJ(C73933Szx.LIZLLL(fragment))).LIZIZ(new AfS57S0100000_5(this, 213));
    }

    public final void LJ(String str, long j, boolean z, Integer num, long j2) {
        int i;
        int i2;
        if (this.LIZIZ == null) {
            return;
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((ISubscribeService) LIZ).Rv();
        int i3 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        boolean LIZJ = C28959BYd.LIZJ(i);
        C47071t1 c47071t1 = new C47071t1(this.LIZIZ);
        c47071t1.LJII(str);
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIIL(R.string.ka2, new C29085BbF(this, num, LIZJ));
        c47071t1.LJIIIZ(R.string.ka1, new C29087BbH(this, num, LIZJ));
        c47071t1.LJIJ = new IDCListenerS281S0100000_5(num, 2);
        if (LIZJ) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((ISubscribeService) LIZ2).Rv();
            int i4 = (int) j2;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            C28959BYd.LIZLLL(c47071t1, i4, i2, this.LIZJ);
        }
        LiveDialog LIZ3 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "1592117652209223112")).LIZ) {
            LIZ3.show();
        }
        CB0.LIZIZ();
        CB0.LIZJ();
        if (num != null) {
            i3 = num.intValue();
        }
        LIZLLL(i3, LIZJ);
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_close_live_duration")) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - j);
            BZI LIZ4 = C28787BRn.LIZ("livesdk_close_live_duration");
            LIZ4.LJIILLIIL(this.LIZJ);
            LIZ4.LJIJJ(Integer.valueOf(currentTimeMillis), "duration");
            LIZ4.LJIJJ(Integer.valueOf(z ? 1 : 0), "request_succeed");
            LIZ4.LJJIIJZLJL();
        }
    }
}
