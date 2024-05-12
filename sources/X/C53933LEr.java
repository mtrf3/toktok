package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.container.DMDefaultGuideFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LEr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53933LEr implements InterfaceC98133tB {
    public static final C53933LEr LIZ = new C53933LEr();

    @Override // X.InterfaceC98133tB
    public final InterfaceC97983sw LIZ() {
        WeakReference<InterfaceC97983sw> weakReference = C46321IFx.LIZ.get("bookmode_dm");
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC98133tB
    public final boolean LIZJ() {
        WeakReference<InterfaceC97983sw> weakReference;
        if (LIZLLL("bookmode_dm") && (weakReference = C46321IFx.LIZ.get("bookmode_dm")) != null && weakReference.get() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC98133tB
    public final boolean LIZLLL(String tag) {
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, "bookmode_dm") && LEN.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC98133tB
    public final InterfaceC97983sw LIZIZ(Fragment fragment, View view, Y96 y96) {
        InterfaceC97983sw interfaceC97983sw;
        o.LJIIIZ(fragment, "fragment");
        if (LIZLLL(y96.LIZ)) {
            String str = y96.LIZ;
            HashMap<String, WeakReference<InterfaceC97983sw>> hashMap = C46321IFx.LIZ;
            WeakReference<InterfaceC97983sw> weakReference = hashMap.get(str);
            DMDefaultGuideFragment dMDefaultGuideFragment = null;
            if (weakReference != null && (interfaceC97983sw = weakReference.get()) != null) {
                return interfaceC97983sw;
            }
            if (o.LJ(str, "bookmode_dm")) {
                dMDefaultGuideFragment = new DMDefaultGuideFragment();
            }
            Y91 y91 = new Y91(fragment, view, y96, dMDefaultGuideFragment);
            hashMap.put(str, new WeakReference<>(y91));
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC47899Ir1(str));
            return y91;
        }
        return new C53934LEs(view);
    }
}
