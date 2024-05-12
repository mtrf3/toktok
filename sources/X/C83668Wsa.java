package X;

import Y.ARunnableS5S0102000_14;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.vesdk.VEFocusSettings;

/* renamed from: X.Wsa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83668Wsa implements InterfaceC87371YQt {
    public final /* synthetic */ VEFocusSettings LIZ;

    public C83668Wsa(VEFocusSettings vEFocusSettings) {
        this.LIZ = vEFocusSettings;
    }

    @Override // X.InterfaceC87371YQt
    public final void LIZ(int i, int i2, String str) {
        C83667WsZ c83667WsZ = (C83667WsZ) this.LIZ.getFocusCallback();
        SafeHandler safeHandler = c83667WsZ.LIZ.get();
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS5S0102000_14(c83667WsZ, i, i2, 1));
        }
    }
}
