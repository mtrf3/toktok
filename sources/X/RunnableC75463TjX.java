package X;

import java.util.HashMap;

/* renamed from: X.TjX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC75463TjX implements Runnable {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public int LJLJI;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event_page=");
        LIZ.append(this.LJLIL);
        LIZ.append(", eventScene=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", beautyLevel=");
        LIZ.append(this.LJLJI);
        C75460TjU.LIZJ("ReportBeautyEffectUseRunnable.run", X1D.LIZIZ(LIZ));
        HashMap hashMap = new HashMap();
        C75460TjU.LIZ(this.LJLJI, hashMap);
        hashMap.put("event_page", this.LJLIL);
        hashMap.put("event_scene", this.LJLILLLLZI);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_effective_use");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJII(C75471Tjf.LJLIL);
        LIZ2.LJJIIZI();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
