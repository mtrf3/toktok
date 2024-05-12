package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29822Bn8 {
    public static void LIZIZ(String str, HashMap hashMap) {
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    public static String LIZ(Context context, int i, String str) {
        String string = context.getResources().getString(i);
        o.LJIIIIZZ(string, str);
        return string;
    }

    public static void LIZJ(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }
}
