package X;

import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.OZn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62119OZn implements InterfaceC74184T9o {
    public final /* synthetic */ HTD LIZ;

    public C62119OZn(C1YZ c1yz) {
        this.LIZ = c1yz;
    }

    @Override // X.InterfaceC74184T9o
    public final void LIZ(int i, Effect effect) {
        boolean z;
        HTD htd = this.LIZ;
        if (i == 2006) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C62114OZi c62114OZi = (C62114OZi) ((C1YZ) htd).LIZ;
        if (c62114OZi.LIZIZ != null) {
            if (valueOf.booleanValue()) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLFZ();
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIJI();
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LJZL.clearAnimation();
                return;
            }
            ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIJI();
            if (i == 0) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(200);
            } else if (i == -1) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(0);
            } else {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            }
        }
    }
}
