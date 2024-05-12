package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3G3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G3 implements InterfaceC224288rA, G27 {
    public static final C3G3 LJLIL = new C3G3();
    public static final java.util.Map<Integer, WeakReference<C3G4>> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC224288rA
    public final boolean LIZ(C3G7 c3g7) {
        return false;
    }

    @Override // X.InterfaceC224288rA
    public final void LIZJ(ImageView coverView) {
        o.LJIIIZ(coverView, "coverView");
    }

    @Override // X.InterfaceC224288rA
    public final C3G7 LIZLLL(C3G7 c3g7) {
        return c3g7;
    }

    @Override // X.InterfaceC224288rA
    public final void LJ(String str, C3G7 c3g7) {
    }

    @Override // X.InterfaceC224288rA
    public final void LIZIZ(ViewGroup viewGroup, C3G4 listener) {
        o.LJIIIZ(listener, "listener");
        int hashCode = viewGroup.getContext().hashCode();
        LJLILLLLZI.put(Integer.valueOf(hashCode), new WeakReference<>(listener));
        C9XU.LIZ(hashCode, this);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (activity != null) {
            java.util.Map<Integer, WeakReference<C3G4>> map = LJLILLLLZI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getKey()).intValue() == activity.hashCode()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                C3G4 c3g4 = (C3G4) ((Reference) it.next()).get();
                if (c3g4 != null) {
                    c3g4.LJIIIZ();
                }
            }
        }
    }
}
