package X;

import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Dmx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34907Dmx implements InterfaceC64897PdV {
    public static final C34907Dmx LIZ = new C34907Dmx();
    public static int LIZIZ = 2;

    @Override // X.InterfaceC64897PdV
    public final HashSet<String> LIZ() {
        HashSet<String> hashSet;
        try {
            String str = C34584Dhk.LIZ;
            if (str == null) {
                hashSet = C34584Dhk.LIZIZ;
            } else {
                if (C34584Dhk.LIZIZ == null) {
                    C34584Dhk.LIZIZ = new HashSet<>();
                    C34584Dhk.LIZIZ.addAll((ArrayList) GsonHolder.LIZLLL().LIZ().LJI(str, ArrayList.class));
                }
                hashSet = C34584Dhk.LIZIZ;
            }
        } catch (Exception unused) {
            hashSet = C34584Dhk.LIZIZ;
        }
        if (hashSet != null) {
            return hashSet;
        }
        return new HashSet<>();
    }

    @Override // X.InterfaceC64897PdV
    public final HashSet<String> LIZLLL() {
        return new HashSet<>();
    }

    @Override // X.InterfaceC64897PdV
    public final int LIZIZ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC64897PdV
    public final int LIZJ() {
        return 2;
    }
}
