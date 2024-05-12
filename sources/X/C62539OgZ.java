package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.OgZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62539OgZ implements InterfaceC113814dN {
    public final /* synthetic */ C62594OhS LJLIL;

    public C62539OgZ(C62594OhS c62594OhS) {
        this.LJLIL = c62594OhS;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        this.LJLIL.LJLILLLLZI.LJIIJ.extras.putString("enter_from", "guide_personal_videos_share_panel");
        String string = this.LJLIL.LJLILLLLZI.LJIIJ.extras.getString("share_aweme_id");
        if (string == null) {
            string = "";
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C62537OgX(this.LJLIL, channel, view, string, null), 3);
    }
}
