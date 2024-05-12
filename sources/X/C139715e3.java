package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.5e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139715e3 {
    public final Keva LIZ = KevaImpl.getRepo("block_sticker_list", 1);

    public final void LIZ(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        String currentUserID = C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
        java.util.Set LJLIIL = ORY.LJLIIL(LIZIZ(currentUserID));
        LJLIIL.add(effectId);
        this.LIZ.storeStringArray(i0.LJFF("block_sticker_list_", currentUserID), (String[]) LJLIIL.toArray(new String[0]));
    }

    public final String[] LIZIZ(String str) {
        String[] stringArray = this.LIZ.getStringArray(i0.LJFF("block_sticker_list_", str), new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(KEY_…FFIX + uid, emptyArray())");
        return stringArray;
    }
}
