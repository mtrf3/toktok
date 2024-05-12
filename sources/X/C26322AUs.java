package X;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AUs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26322AUs implements InterfaceC26319AUp {
    @Override // X.InterfaceC26319AUp
    public final void LIZ() {
        C26335AVf.LJIILL(1, "photo", null);
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC26319AUp
    public final void LJ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC26319AUp
    public final void LJII(EnumC26325AUv choiceType) {
        o.LJIIIZ(choiceType, "choiceType");
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZJ(Throwable e) {
        String str;
        o.LJIIIZ(e, "e");
        if (e instanceof C38333F2r) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C38306F1q) e).getErrorCode());
            LIZ.append("");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "-1";
        }
        C26335AVf.LJIILL(0, "photo", str);
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZIZ(EnumC26324AUu actionType, Object any) {
        Context context;
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(any, "any");
        if (C26323AUt.LIZ[actionType.ordinal()] != 1) {
            return;
        }
        if (any instanceof Context) {
            context = (Context) any;
        } else {
            context = null;
        }
        C73040SlY.LJII(context, "click_profile_avatar", "cancel");
    }

    @Override // X.InterfaceC26319AUp
    public final void LJFF(EnumC26325AUv choiceType, HashMap<String, String> hashMap) {
        o.LJIIIZ(choiceType, "choiceType");
        int i = C26323AUt.LIZIZ[choiceType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            C244309iM.LJIIIIZZ("click_upload_entrance", "click_edit_profile", hashMap);
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        C244309iM.LJIIIIZZ("shoot", "click_icon", hashMap);
    }

    @Override // X.InterfaceC26319AUp
    public final void LJI(EnumC26325AUv choiceType, boolean z) {
        o.LJIIIZ(choiceType, "choiceType");
        if (z) {
            return;
        }
        int i = C26323AUt.LIZIZ[choiceType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C26335AVf.LJJIIJZLJL("bpea-profile_avatar_start_gallery");
            return;
        }
        C26335AVf.LJJIIJZLJL("bpea-profile_avatar_take_photo");
    }
}
