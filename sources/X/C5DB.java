package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* renamed from: X.5DB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DB {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(AwemeDraft awemeDraft, C5DA c5da) {
        if (awemeDraft == null) {
            c5da.onFinish(awemeDraft);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C5D9(awemeDraft, c5da, null), 3);
        }
    }

    public static C165436eR LIZ(AwemeDraft awemeDraft, int i, String str, C41656GWm c41656GWm, boolean z, int i2) {
        boolean z2 = z;
        String str2 = str;
        C41656GWm c41656GWm2 = c41656GWm;
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            c41656GWm2 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return new C165436eR(i, awemeDraft, c41656GWm2, str2, z2);
    }
}
