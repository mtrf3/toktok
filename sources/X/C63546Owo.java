package X;

import defpackage.i0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Owo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63546Owo implements InterfaceC63557Owz {
    public final C63540Owi LIZ;
    public final C63607Oxn LIZIZ;
    public final ConcurrentHashMap<Integer, C63621Oy1> LIZLLL = new ConcurrentHashMap<>();
    public final boolean LIZJ = C63308Osy.LJI().LIZLLL().LJJJJLI.enableCrash;

    public C63546Owo(C63540Owi c63540Owi) {
        this.LIZ = c63540Owi;
        this.LIZIZ = c63540Owi.LJJIII;
    }

    public final void LIZ(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i0.LJFF("throwOrLogStateError:", str));
        if (!this.LIZJ) {
            C63322OtC.LJ("SendMsgNetworkIntercept", illegalArgumentException);
            return;
        }
        throw illegalArgumentException;
    }
}
