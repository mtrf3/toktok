package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.1EU, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1EU implements InterfaceC67373QcL {
    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C67352Qc0 LIZ = AbstractC67354Qc2.LIZ();
            LIZ.LIZIZ(cursor.getString(1));
            LIZ.LIZJ(C67356Qc4.LIZIZ(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                decode = null;
            } else {
                decode = Base64.decode(string, 0);
            }
            LIZ.LIZIZ = decode;
            arrayList.add(LIZ.LIZ());
        }
        return arrayList;
    }

    public static int LIZ(View view, String str, int i) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return AnonymousClass636.LJIIIIZZ(i, context);
    }

    public static Uri.Builder LIZIZ(String str, String str2, String str3) {
        return UriProtector.parse(str).buildUpon().appendQueryParameter(str2, str3);
    }

    public static void LIZJ(StringBuilder sb, String str, int i, String str2, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }
}
