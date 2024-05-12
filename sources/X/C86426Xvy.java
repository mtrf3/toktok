package X;

import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* renamed from: X.Xvy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86426Xvy implements InterfaceC223888qW {
    public final /* synthetic */ C86425Xvx LIZ;

    public C86426Xvy(C86425Xvx c86425Xvx) {
        this.LIZ = c86425Xvx;
    }

    @Override // X.InterfaceC223888qW
    public final void LIZ(Long l) {
        LinearLayout stickerView;
        C86425Xvx c86425Xvx = this.LIZ;
        c86425Xvx.getClass();
        if (l != null) {
            l.longValue();
            InteractStickerStruct interactStickerStruct = c86425Xvx.LJLJLLL;
            if (interactStickerStruct != null) {
                List<NormalTrackTimeStamp> LIZJ = C223998qh.LIZJ(l.longValue(), interactStickerStruct);
                if (LIZJ == null || LIZJ.isEmpty()) {
                    C86003Xp9 c86003Xp9 = c86425Xvx.LJLLJ;
                    if (c86003Xp9 == null) {
                        return;
                    }
                    c86003Xp9.setVisibility(8);
                    return;
                }
                C86003Xp9 c86003Xp92 = c86425Xvx.LJLLJ;
                if (c86003Xp92 != null && c86003Xp92.getVisibility() == 0) {
                    return;
                }
                C86003Xp9 c86003Xp93 = c86425Xvx.LJLLJ;
                if (c86003Xp93 != null && (stickerView = c86003Xp93.getStickerView()) != null) {
                    c86425Xvx.LJLLL.LJIIIIZZ(stickerView);
                }
                C86003Xp9 c86003Xp94 = c86425Xvx.LJLLJ;
                if (c86003Xp94 == null) {
                    return;
                }
                c86003Xp94.setVisibility(0);
            }
        }
    }
}
