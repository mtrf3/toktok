package X;

import com.bytedance.android.livesdk.livesetting.gift.HideGiftIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.CKm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31152CKm {
    public final EnumC31157CKr LIZ;
    public final EnumC31157CKr LIZIZ;
    public final EnumC31157CKr LIZJ;
    public final EnumC31157CKr LIZLLL;
    public final EnumC31157CKr LJ;

    public final boolean LIZ(C31152CKm c31152CKm) {
        EnumC31157CKr enumC31157CKr;
        boolean z = !HideGiftIconForUserSetting.INSTANCE.getValue();
        boolean value = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
        EnumC31157CKr enumC31157CKr2 = this.LIZ;
        EnumC31157CKr enumC31157CKr3 = EnumC31157CKr.YES;
        if ((enumC31157CKr2 == enumC31157CKr3 && c31152CKm.LIZ == EnumC31157CKr.NO) || (enumC31157CKr2 == (enumC31157CKr = EnumC31157CKr.NO) && c31152CKm.LIZ == enumC31157CKr3)) {
            return false;
        }
        EnumC31157CKr enumC31157CKr4 = this.LIZIZ;
        if ((enumC31157CKr4 == enumC31157CKr3 && c31152CKm.LIZIZ == enumC31157CKr) || (enumC31157CKr4 == enumC31157CKr && c31152CKm.LIZIZ == enumC31157CKr3)) {
            return false;
        }
        if (!z ? this.LIZJ == enumC31157CKr3 : this.LIZJ == enumC31157CKr) {
            return false;
        }
        EnumC31157CKr enumC31157CKr5 = this.LIZLLL;
        if ((enumC31157CKr5 != enumC31157CKr3 || c31152CKm.LIZLLL != enumC31157CKr) && (enumC31157CKr5 != enumC31157CKr || c31152CKm.LIZLLL != enumC31157CKr3)) {
            if (value) {
                if (this.LJ != enumC31157CKr) {
                    return true;
                }
            } else if (this.LJ != enumC31157CKr3) {
                return true;
            }
        }
        return false;
    }

    public C31152CKm(EnumC31157CKr isAnchor, EnumC31157CKr hasCoin, EnumC31157CKr isAnchorCountrySupport, EnumC31157CKr isGiftFeatureSupport, EnumC31157CKr isLowAge) {
        o.LJIIIZ(isAnchor, "isAnchor");
        o.LJIIIZ(hasCoin, "hasCoin");
        o.LJIIIZ(isAnchorCountrySupport, "isAnchorCountrySupport");
        o.LJIIIZ(isGiftFeatureSupport, "isGiftFeatureSupport");
        o.LJIIIZ(isLowAge, "isLowAge");
        this.LIZ = isAnchor;
        this.LIZIZ = hasCoin;
        this.LIZJ = isAnchorCountrySupport;
        this.LIZLLL = isGiftFeatureSupport;
        this.LJ = isLowAge;
    }
}
