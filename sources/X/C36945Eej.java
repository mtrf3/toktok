package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Eej, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36945Eej {
    public static MajorComponentsAllowList LIZ;

    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        InputStream open = context.getAssets().open("kids_mode_allowlist.json");
        o.LJIIIIZZ(open, "context.assets.open(\"kids_mode_allowlist.json\")");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        try {
            InterfaceC1039145z LJIIJJI = C77321UWf.LJIIJJI(bufferedReader);
            StringBuilder sb = new StringBuilder();
            Iterator it = LJIIJJI.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String sb2 = sb.toString();
            AnonymousClass636.LJFF(bufferedReader, null);
            o.LJIIIIZZ(sb2, "BufferedReader(InputStre…ults.toString()\n        }");
            LIZ = (MajorComponentsAllowList) GsonProtectorUtils.fromJson(new Gson(), sb2, MajorComponentsAllowList.class);
        } finally {
        }
    }
}
