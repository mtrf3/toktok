package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked.MultiGuestLinkedPreviewViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TbQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74960TbQ implements InterfaceC75014TcI {
    public final /* synthetic */ MultiGuestLinkedPreviewViewModel LIZ;

    public C74960TbQ(MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel) {
        this.LIZ = multiGuestLinkedPreviewViewModel;
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C74913Taf.LIZJ("Zoom/MultiGuestLinkedPreviewFragment");
        LiveData liveData = (LiveData) this.LIZ.LJLLL.getValue();
        C76800UCe c76800UCe = C76800UCe.LIZ;
        liveData.setValue(c76800UCe);
        ((LiveData) this.LIZ.LJLLLL.getValue()).setValue(c76800UCe);
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZ(int i, String linkMicId, String message, Throwable th) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
        C74913Taf.LIZIZ(i, "Zoom/MultiGuestLinkedPreviewFragment", message, th);
        ((LiveData) this.LIZ.LJLLL.getValue()).setValue(C76800UCe.LIZ);
        if (th != null) {
            C74947TbD.LJIILJJIL(C15380j0.LIZLLL(), th);
        } else {
            C30868C9o.LJI(message);
        }
    }
}
