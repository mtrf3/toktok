package X;

import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;

/* renamed from: X.VoM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80858VoM extends AbstractC80859VoN {
    public final /* synthetic */ BottomSheetBehavior LIZ;

    @Override // X.AbstractC80859VoN
    public final int LIZ() {
        int i;
        int i2;
        BottomSheetBehavior bottomSheetBehavior = this.LIZ;
        if (bottomSheetBehavior.LJ) {
            i = bottomSheetBehavior.LJIIJ;
            i2 = bottomSheetBehavior.LIZJ;
        } else {
            i = bottomSheetBehavior.LIZLLL;
            i2 = bottomSheetBehavior.LIZJ;
        }
        return i - i2;
    }

    public C80858VoM(BottomSheetBehavior bottomSheetBehavior) {
        this.LIZ = bottomSheetBehavior;
    }
}
