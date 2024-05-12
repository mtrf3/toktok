package X;

import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SgD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72709SgD implements MessageCenter.Listener {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    public C72709SgD(AqS178S0100000_12 aqS178S0100000_12) {
        this.LJLIL = aqS178S0100000_12;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("messageTpe=", i, ", arg1=", i2, ", arg2=");
        LIZJ.append(i3);
        LIZJ.append(", arg3=");
        LIZJ.append(str);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZJ));
        if ((o.LJ(str, "entry_point") || o.LJ(str, "head")) && i2 == 3) {
            C6QQ.LIZ(new AqS162S0100000_12(this, 1229));
        }
    }
}
