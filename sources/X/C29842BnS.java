package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCoHostMatchCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BnS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29842BnS implements InterfaceC29848BnY {
    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        String value;
        int i;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        CQQ LJLIIL = capsuleModel.LJLIIL();
        EnumC75636TmK LIZJ = B5G.LIZIZ().LIZJ();
        B5G.LIZIZ().LJJLJ = "pk_guide";
        if (LIZJ == EnumC75636TmK.CONNECTION_SUCCEED) {
            String str = ((CapsuleMessage) capsuleModel.LJIJJLI).scene;
            int hashCode = str.hashCode();
            if (hashCode != -1992036877) {
                if (hashCode != -1222220224) {
                    if (hashCode == 1328763988 && str.equals("match-multi-invite-guide")) {
                        i = 5;
                        C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
                    }
                    i = -1;
                    C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
                } else {
                    if (str.equals("match-invite-guide")) {
                        i = 0;
                        C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
                    }
                    i = -1;
                    C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
                }
            } else {
                if (str.equals("match-rule-guide")) {
                    i = 4;
                    C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
                }
                i = -1;
                C73943T0h.LIZ().LIZIZ(new C29843BnT(i));
            }
        } else if (RandomLinkMicManager.LJIIIIZZ() || RandomLinkMicManager.LJII() || C75650TmY.LIZJ() || C75650TmY.LIZIZ()) {
            C30868C9o.LIZJ(R.string.kh8);
        } else {
            if (o.LJ(((CapsuleMessage) capsuleModel.LJIJJLI).scene, "match-multi-invite-guide")) {
                value = EnumC76319TxL.MULTI_PK_GUIDE.getValue();
            } else {
                value = EnumC76319TxL.PK_GUIDE.getValue();
            }
            DataChannel dataChannel = LJLIIL.LJIIIIZZ;
            if (dataChannel != null) {
                dataChannel.qv0(OpenCoHostEvent.class, value);
            }
            C30868C9o.LIZJ(R.string.mhh);
            C75832TpU.LIZ.LJJIIZ(value, false, true);
        }
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        int i;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        if (capsuleModel.LJLJJL()) {
            String str = ((CapsuleMessage) capsuleModel.LJIJJLI).scene;
            int hashCode = str.hashCode();
            if (hashCode != -1992036877) {
                if (hashCode != -1222220224) {
                    if (hashCode == 1328763988 && str.equals("match-multi-invite-guide")) {
                        i = 5;
                        C75832TpU.LIZ.LJJIIZI(i);
                    }
                    i = -1;
                    C75832TpU.LIZ.LJJIIZI(i);
                } else {
                    if (str.equals("match-invite-guide")) {
                        i = 0;
                        C75832TpU.LIZ.LJJIIZI(i);
                    }
                    i = -1;
                    C75832TpU.LIZ.LJJIIZI(i);
                }
            } else {
                if (str.equals("match-rule-guide")) {
                    i = 4;
                    C75832TpU.LIZ.LJJIIZI(i);
                }
                i = -1;
                C75832TpU.LIZ.LJJIIZI(i);
            }
        }
        J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_host_notice"), capsuleModel.LJLIIL().LJIIIIZZ, "show", "event_type");
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ publicScreenContext, CapsuleMessage message) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        if (o.LJ(message.scene, "match-rule-guide")) {
            LiveCoHostMatchCapsuleGovernanceSetting liveCoHostMatchCapsuleGovernanceSetting = LiveCoHostMatchCapsuleGovernanceSetting.INSTANCE;
            if (liveCoHostMatchCapsuleGovernanceSetting.coHostMatchCapsuleRollOff() || liveCoHostMatchCapsuleGovernanceSetting.coHostMatchCapsuleDefault()) {
                return true;
            }
        }
        if ((o.LJ(message.scene, "match-invite-guide") || o.LJ(message.scene, "match-multi-invite-guide")) && LiveCoHostMatchCapsuleGovernanceSetting.INSTANCE.coHostMatchCapsuleDefault()) {
            return true;
        }
        if (!o.LJ(message.scene, "match-invite-guide") && !o.LJ(message.scene, "match-multi-invite-guide")) {
            if (o.LJ(message.scene, "match-rule-guide")) {
                try {
                    if (message.desc != null) {
                        if (message.buttonText != null) {
                            if (message.schema != null) {
                                Boolean LIZJ = InterfaceC30442Bx8.LLJJIJIL.LIZJ();
                                o.LJIIIIZZ(LIZJ, "LIVE_SHOULD_SHOW_BATTLE_RULE_GUIDE_MESSAGE.value");
                                if (LIZJ.booleanValue()) {
                                    return false;
                                }
                                "Check failed.".toString();
                                throw new IllegalStateException("Check failed.");
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    return true;
                }
            }
            C29837BnN.LIZ(publicScreenContext, message);
            return false;
        }
        try {
            if (message.desc != null) {
                if (message.buttonText != null) {
                    if (message.icon != null) {
                        return false;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (IllegalArgumentException unused2) {
            return true;
        }
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
