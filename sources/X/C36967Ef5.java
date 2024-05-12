package X;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

/* renamed from: X.Ef5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36967Ef5 {
    public static final String LIZ(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        AnonymousClass636.LJFF(bufferedReader, null);
                        AnonymousClass636.LJFF(inputStreamReader, null);
                        String sb2 = sb.toString();
                        o.LJIIIIZZ(sb2, "content.toString()");
                        return sb2;
                    }
                } finally {
                }
            }
        } finally {
        }
    }
}
