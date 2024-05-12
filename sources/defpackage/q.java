package defpackage;

import X.C0K7;
import X.C198517qh;
import X.C39398FdC;
import X.X1D;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final /* synthetic */ class q implements C0K7 {
    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static LinearLayout LIZ(Context context, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static String LIZIZ(StringBuilder sb, String str, char c, StringBuilder sb2) {
        sb.append(str);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static JSONObject LIZJ(HashMap hashMap, String str, String str2, C198517qh c198517qh, C39398FdC c39398FdC) {
        hashMap.put(str, str2);
        JSONObject LJ = c198517qh.LJ();
        c39398FdC.getClass();
        return LJ;
    }
}
