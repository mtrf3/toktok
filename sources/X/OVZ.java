package X;

import Y.ACListenerS30S0100000_10;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OVZ extends AbstractDialogC62002OVa {
    public static final /* synthetic */ int LJLLL = 0;
    public final Activity LJLJLLL;
    public final C62387Oe7 LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final UrlModel LJLLJ;

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C62387Oe7 c62387Oe7 = this.LJLL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LJ(this.LJLJLLL, c62387Oe7.LJIIJ);
        }
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        List<InterfaceC62225ObV> list;
        super.onCreate(bundle);
        setContentView(R.layout.am7);
        C61820OOa c61820OOa = C61822OOc.LIZ;
        PNP share_panel_root_layout = (PNP) findViewById(R.id.juh);
        o.LJIIIIZZ(share_panel_root_layout, "share_panel_root_layout");
        c61820OOa.getClass();
        boolean z = true;
        C61820OOa.LIZ(this, share_panel_root_layout, true, false, null);
        C62387Oe7 c62387Oe7 = this.LJLL;
        if (c62387Oe7.LJFF) {
            ORS.LJJLIL(new AqS173S0100000_7(this, 312), c62387Oe7.LIZ);
        }
        C62387Oe7 c62387Oe72 = this.LJLL;
        if (c62387Oe72.LJ || (list = c62387Oe72.LIZ) == null || list.isEmpty()) {
            findViewById(R.id.jub).setVisibility(8);
        } else {
            C113914dX share_panel_share_bar = (C113914dX) findViewById(R.id.jui);
            o.LJIIIIZZ(share_panel_share_bar, "share_panel_share_bar");
            share_panel_share_bar.LJIIJ(this.LJLL.LIZ, false);
            C113914dX c113914dX = (C113914dX) findViewById(R.id.jui);
            OYI oyi = new OYI(this, this.LJLJLLL, this.LJLL.LJIIJ);
            c113914dX.getClass();
            c113914dX.LJLJJL = oyi;
        }
        C16880lQ.LJJJ((TuxIconView) findViewById(R.id.bfz), new ACListenerS30S0100000_10(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        String str = this.LJLLI;
        if (str == null || str.length() == 0) {
            String str2 = this.LJLLILLLL;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (!z) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LJLLILLLL);
                LJIIIIZZ.LJJIIJZLJL = (ImageView) findViewById(R.id.fcj);
                C16880lQ.LLJJJ(LJIIIIZZ);
                return;
            } else if (this.LJLLJ != null) {
                C78764Uvg.LJI((W5G) findViewById(R.id.fcj), this.LJLLJ, -1, -1);
                return;
            } else {
                ((ImageView) findViewById(R.id.fcj)).setVisibility(8);
                return;
            }
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new GTQ(this, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OVZ(Activity ctx, C62387Oe7 c62387Oe7, UrlModel urlModel) {
        super(ctx, R.style.a6u);
        o.LJIIIZ(ctx, "ctx");
        this.LJLJLLL = ctx;
        this.LJLL = c62387Oe7;
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = urlModel;
    }
}
