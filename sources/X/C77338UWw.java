package X;

import android.app.Application;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import kotlin.jvm.internal.AqS129S0300000_13;

/* renamed from: X.UWw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77338UWw implements InterfaceC37283EkB {
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, Long, C76800UCe> LIZ;

    public C77338UWw(AqS129S0300000_13 aqS129S0300000_13) {
        this.LIZ = aqS129S0300000_13;
    }

    @Override // X.InterfaceC37283EkB
    public final void LIZ(long j, boolean z) {
        CropActivity.LLILLIZIL = true;
        long LJ = C39687Fhr.LJ(C39849FkT.LIZ());
        if (z) {
            Application LIZ = C39849FkT.LIZ();
            Long valueOf = Long.valueOf(j);
            Boolean bool = Boolean.TRUE;
            C244309iM.LIZLLL(LIZ, "handleCleanCache success", valueOf, bool, LJ, null, 32);
            this.LIZ.invoke(bool, Long.valueOf(j));
            return;
        }
        InterfaceC88471Ynr<Boolean, Long, C76800UCe> interfaceC88471Ynr = this.LIZ;
        Boolean bool2 = Boolean.FALSE;
        interfaceC88471Ynr.invoke(bool2, Long.valueOf(j));
        C244309iM.LIZLLL(C39849FkT.LIZ(), "handleCleanCache failed", -1L, bool2, LJ, null, 32);
    }
}
