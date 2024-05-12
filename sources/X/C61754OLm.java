package X;

import android.view.View;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OLm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61754OLm implements InterfaceC31687Cc7 {
    public final /* synthetic */ C61752OLk LIZ;

    public C61754OLm(C61752OLk c61752OLk) {
        this.LIZ = c61752OLk;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        C61752OLk c61752OLk = this.LIZ;
        if (c61752OLk.LJLJJLL == null) {
            c61752OLk.LJLJJLL = C40334FsI.LIZ(EnumC40336FsK.DuringLive, new AqS176S0100000_10(c61752OLk, 245));
        }
        C61752OLk c61752OLk2 = this.LIZ;
        A72 a72 = c61752OLk2.LJLJL;
        if (a72 != null) {
            AbstractC40333FsH abstractC40333FsH = c61752OLk2.LJLJJLL;
            if (abstractC40333FsH != null) {
                ActivityC45651qj context = a72.getContext();
                o.LJIIIIZZ(context, "it.context");
                abstractC40333FsH.LIZIZ(context);
            }
            java.util.Map<String, String> map = null;
            if (o.LJ(str, "during_live")) {
                C188727au c188727au = c61752OLk2.LJLLL;
                if (c188727au != null) {
                    c188727au.LJIIIZ("type", "toolbar");
                    map = c188727au.LIZ;
                }
                FMX.LJIIL("livesdk_add_links_click", map);
                return;
            }
            if (!o.LJ(str, "during_live_dialog_item")) {
                return;
            }
            C188727au c188727au2 = c61752OLk2.LJLLL;
            if (c188727au2 != null) {
                c188727au2.LJIIIZ("type", "subpage");
                map = c188727au2.LIZ;
            }
            FMX.LJIIL("livesdk_add_links_click", map);
        }
    }
}
