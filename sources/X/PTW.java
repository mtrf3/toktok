package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PTW {
    public static Application LIZ;
    public static PQ7 LIZIZ;
    public static String LIZJ;

    public static PQ7 LIZ() {
        PQ7 pq7 = LIZIZ;
        if (pq7 != null) {
            return pq7;
        }
        o.LJIJI("log");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C5WL r31) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PTW.LIZJ(X.5WL):void");
    }

    public static void LIZIZ(Context context, KS3 params) {
        o.LJIIIZ(params, "params");
        Intent intent = new Intent("android.intent.action.VIEW");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("capcut://main/tabbar?index=");
        LIZ2.append(params.LJLIL);
        LIZ2.append("&enter_from=");
        LIZ2.append(params.LJLILLLLZI);
        LIZ2.append("&is_project_edit=1&allow_deep_link_flag=1&intent_flag_id=335544320&anchor_key=");
        LIZ2.append(params.LJLJI);
        LIZ2.append("&vid=");
        LIZ2.append(params.LJLJJI);
        intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ2)));
        C16880lQ.LIZJ(context, intent);
    }
}
