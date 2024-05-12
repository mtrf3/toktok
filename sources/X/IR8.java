package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IR8 {
    public static IR7 LIZ;

    public static void LIZ() {
        IR9 block = IR9.LJLIL;
        o.LJIIIZ(block, "block");
        if (INB.LIZIZ() || INB.LIZJ()) {
            block.invoke(LIZIZ());
        }
    }

    public static IR7 LIZIZ() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        String str2 = null;
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        IR7 ir7 = LIZ;
        if (ir7 != null) {
            str2 = ir7.LIZ;
        }
        if (!o.LJ(str2, str)) {
            LIZ = new IR7(str);
        }
        IR7 ir72 = LIZ;
        o.LJI(ir72);
        return ir72;
    }
}
