package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZU implements InterfaceC113814dN {
    public final /* synthetic */ OZS LJLIL;

    public OZU(OZS ozs) {
        this.LJLIL = ozs;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        if (channel instanceof C62108OZc) {
            OZS ozs = this.LJLIL;
            Context context = ozs.getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null) {
                C44927HkB.LIZ(LJJLIIIJ, TokenCert.Companion.with("bpea-check_user_dialog_qrcode_download_storage"), new AqS160S0100000_10(ozs, 613));
            }
        } else {
            C62397OeH.LIZJ().LIZ(0, channel.key());
            Context context2 = this.LJLIL.getContext();
            o.LJIIIIZZ(context2, "context");
            OZS ozs2 = this.LJLIL;
            OZ4.LIZ(context2, ozs2.LJLJL, ozs2.LJLJJLL, false, true, new OZT(ozs2, channel));
        }
        OZS ozs3 = this.LJLIL;
        C62180Oam c62180Oam = ozs3.LJLJJLL;
        if (c62180Oam != null && c62180Oam.LJLILLLLZI) {
            ozs3.dismiss();
        }
    }
}
