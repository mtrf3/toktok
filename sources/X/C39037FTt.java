package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;

/* renamed from: X.FTt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39037FTt implements QJ8 {
    public final /* synthetic */ C39033FTp LJLIL;

    @Override // X.QJ8
    public final void LIZ(boolean z) {
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
    }

    public C39037FTt(Context context, C39033FTp c39033FTp) {
        this.LJLIL = c39033FTp;
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        if (AppLog.getHeaderCopy() != null) {
            FUA.LIZ(this.LJLIL);
        }
    }
}
