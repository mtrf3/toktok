package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.65x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548565x implements AnonymousClass666 {
    public final /* synthetic */ C1548165t LIZ;

    @Override // X.AnonymousClass666
    public final int LIZLLL(C153075zb item, boolean z, boolean z2) {
        o.LJIIIZ(item, "item");
        return 0;
    }

    public C1548565x(C1548165t c1548165t) {
        this.LIZ = c1548165t;
    }

    @Override // X.AnonymousClass666
    public final Float LIZ(float f) {
        return Float.valueOf(f);
    }

    @Override // X.AnonymousClass666
    public final PointF LIZJ(C153075zb item, float f, float f2) {
        o.LJIIIZ(item, "item");
        return new PointF();
    }

    @Override // X.AnonymousClass666
    public final void LIZIZ(C153075zb item, int i, int i2, boolean z) {
        o.LJIIIZ(item, "item");
        Boolean value = this.LIZ.LLJJIJIL().N4().getValue();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(value, bool) || o.LJ(this.LIZ.LLJJIJIL().hP().getValue(), bool) || item.LJLJI.isNowSmallWindowSticker()) {
            if (this.LIZ.LLJJJJ().LLIL != null) {
                C66Y LLJJJJ = this.LIZ.LLJJJJ();
                if (LLJJJJ.LLFZ) {
                    LLJJJJ.LJIJ();
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            this.LIZ.getEditPreviewApi().U2(true, true, true);
            return;
        }
        this.LIZ.getEditPreviewApi().U2(false, true, false);
        this.LIZ.LLJJJJ().LIZLLL();
        WM7 wm7 = this.LIZ.mParentScene;
        o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
        if (c63r != null) {
            c63r.LIZLLL();
        }
        WM7 wm72 = this.LIZ.mParentScene;
        o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63L c63l = (C63L) C44384HbQ.LJJJI((WMH) wm72).LJ(C63L.class);
        if (c63l != null) {
            c63l.LIZLLL();
        }
        this.LIZ.LLJJL().LIZLLL();
        C1548165t c1548165t = this.LIZ;
        InterfaceC139535dl interfaceC139535dl = (InterfaceC139535dl) c1548165t.LJLLL.LIZ(c1548165t, C1548165t.LLFII[13]);
        if (interfaceC139535dl != null) {
            interfaceC139535dl.Xi();
        }
        EditCommentStickerViewModel editCommentStickerViewModel = this.LIZ.LJLLILLLL;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(AnonymousClass669.LJLIL);
            EditDonationStickerViewModel editDonationStickerViewModel = this.LIZ.LJLLLL;
            if (editDonationStickerViewModel != null) {
                editDonationStickerViewModel.setState(C1546765f.LJLIL);
                EditNatureStickerViewModel editNatureStickerViewModel = this.LIZ.LJLLLLLL;
                if (editNatureStickerViewModel != null) {
                    editNatureStickerViewModel.setState(C1546665e.LJLIL);
                    this.LIZ.LLJJIII().LIZLLL();
                    this.LIZ.LLJJIJIIJIL().LIZLLL();
                    return;
                }
                o.LJIJI("natureStickerViewModel");
                throw null;
            }
            o.LJIJI("donationStickerViewModel");
            throw null;
        }
        o.LJIJI("commentStickerViewModel");
        throw null;
    }
}
