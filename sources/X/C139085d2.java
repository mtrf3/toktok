package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.5d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139085d2 {
    public final Keva LIZ = KevaImpl.getRepo("block_editing_sticker_list", 1);

    public final String[] LIZ(String str) {
        String[] stringArray = this.LIZ.getStringArray(i0.LJFF("block_editing_sticker_list_", str), new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(KEY_…FFIX + uid, emptyArray())");
        return stringArray;
    }
}
