package X;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;

/* renamed from: X.Tae, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74912Tae implements InterfaceC75014TcI {
    public final /* synthetic */ DialogInterface LIZ;
    public final /* synthetic */ GuestMediaManageFragment LIZIZ;

    @Override // X.InterfaceC75014TcI
    public final void LIZIZ(String str) {
        C74913Taf.LIZJ("Zoom/GuestMediaManageFragment");
        this.LIZ.dismiss();
        C2A7 c2a7 = this.LIZIZ.LLD;
        if (c2a7 != null) {
            c2a7.performClick();
        }
    }

    public C74912Tae(GuestMediaManageFragment guestMediaManageFragment, LiveDialog liveDialog) {
        this.LIZIZ = guestMediaManageFragment;
        this.LIZ = liveDialog;
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZ(int i, String str, String str2, Throwable th) {
        C74913Taf.LIZIZ(i, "Zoom/GuestMediaManageFragment", str2, th);
        this.LIZ.dismiss();
        if (th != null) {
            C74947TbD.LJIILJJIL(this.LIZIZ.getContext(), th);
        } else {
            C30868C9o.LJI(str2);
        }
    }
}
