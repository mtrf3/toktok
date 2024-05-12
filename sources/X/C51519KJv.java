package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.KJv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51519KJv {
    public static InterfaceC55235Lm3 LIZ(LifecycleOwner lifecycleOwner, EnumC51518KJu contextScope) {
        o.LJIIIZ(contextScope, "contextScope");
        if (lifecycleOwner instanceof ActivityC45651qj) {
            C85855Xml.LIZ(lifecycleOwner);
            return C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null);
        }
        if (!(lifecycleOwner instanceof Fragment)) {
            return null;
        }
        Fragment fragment = (Fragment) lifecycleOwner;
        if (fragment.getContext() == null) {
            return null;
        }
        if (C51522KJy.LIZ[contextScope.ordinal()] == 1) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity == null) {
                return null;
            }
            return C55230Lly.LIZLLL(mo49getActivity, null);
        }
        return C55230Lly.LIZJ(fragment, null);
    }
}
