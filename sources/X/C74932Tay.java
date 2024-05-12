package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tay, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74932Tay implements C0WD {
    public final /* synthetic */ GuestMediaManageFragment LJLIL;

    public C74932Tay(GuestMediaManageFragment guestMediaManageFragment) {
        this.LJLIL = guestMediaManageFragment;
    }

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        if (z) {
            this.LJLIL.LLILIL = liveEffect;
        } else {
            this.LJLIL.LLILIL = new LiveEffect();
        }
    }
}
