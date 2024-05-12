package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZE implements OZI {
    public final /* synthetic */ UserQRCodeActivity LIZ;

    public OZE(UserQRCodeActivity userQRCodeActivity) {
        this.LIZ = userQRCodeActivity;
    }

    @Override // X.OZI
    public final void LIZ(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        if (channel instanceof C62108OZc) {
            this.LIZ.saveToDevice(null);
            return;
        }
        if (channel instanceof CopyLinkChannel) {
            UserQRCodeActivity userQRCodeActivity = this.LIZ;
            OZO ozo = new OZO(channel);
            Context baseContext = this.LIZ.getBaseContext();
            o.LJIIIIZZ(baseContext, "baseContext");
            userQRCodeActivity.LLFII(baseContext, ozo);
            return;
        }
        UserQRCodeActivity userQRCodeActivity2 = this.LIZ;
        userQRCodeActivity2.getClass();
        C62397OeH.LIZJ().LIZ(0, channel.key());
        userQRCodeActivity2.LLII(new OZ8(userQRCodeActivity2, userQRCodeActivity2, channel));
        C188727au c188727au = new C188727au();
        String str = userQRCodeActivity2.LJLLI;
        if (str == null) {
            str = "general";
        }
        c188727au.LJIIIZ("qr_code_type", str);
        String str2 = userQRCodeActivity2.LJLLILLLL;
        if (str2 == null) {
            str2 = "personal_homepage";
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("platform", channel.key());
        FMX.LJIIL("share_personal_qr_code", c188727au.LIZ);
    }
}
