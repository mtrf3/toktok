package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J75 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(long j) {
        StringBuilder sb = new StringBuilder();
        if (0 <= j && j < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
            sb.append(j);
        } else {
            sb.append(j);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "retStr.toString()");
        return sb2;
    }

    public static float LIZ(Context context, float f) {
        return context.getResources().getDisplayMetrics().density * f;
    }
}
