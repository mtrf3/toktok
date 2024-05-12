package X;

import Y.ARunnableS0S2101000_6;
import Y.ARunnableS12S0301000_12;
import Y.IDRunnableS6S0101000;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.EnJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37477EnJ implements InterfaceC37489EnV {
    public final String LIZ;
    public final java.util.Set<InterfaceC37474EnG> LIZIZ = new HashSet();
    public boolean LIZJ = false;
    public final java.util.Map<String, Object> LIZLLL = new HashMap();
    public WeakReference<WebView> LJ = null;

    @Override // X.InterfaceC37489EnV
    public final void release() {
        C37613EpV.LIZJ(new IDRunnableS6S0101000(2, this, 39));
    }

    public C37477EnJ(String str) {
        this.LIZ = str;
    }

    public final void LIZ(int i, String str) {
        LIZIZ(str, i, "");
    }

    public final void LIZJ(EnumC37419EmN enumC37419EmN, Object obj) {
        C37613EpV.LIZJ(new ARunnableS12S0301000_12(0, this, enumC37419EmN, obj, 4));
    }

    public final void LIZIZ(String str, int i, String str2) {
        C37613EpV.LIZJ(new ARunnableS0S2101000_6(this, str, i, str2, 1));
    }
}
