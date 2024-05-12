package X;

import android.view.View;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* renamed from: X.Bcy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29192Bcy implements AttachUserData {
    public static String LIZ = "";

    public static void LIZ(View view) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DraweeView onDraw crash: \n");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" context: ");
            LIZ2.append(view.getContext());
            stringBuffer.append(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" view: ");
            LIZ3.append(view);
            stringBuffer.append(X1D.LIZIZ(LIZ3));
            stringBuffer.append("\n");
            int i = 50;
            while (true) {
                Object parent = view.getParent();
                if (!(parent instanceof View) || i <= 0) {
                    break;
                }
                view = (View) parent;
                i--;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("count:");
                LIZ4.append(i);
                stringBuffer.append(X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(" parent:");
                LIZ5.append(view);
                stringBuffer.append(X1D.LIZIZ(LIZ5));
                stringBuffer.append("\n");
            }
            LIZ = stringBuffer.toString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("BaseCanvasRecycleCrashDataImpl", LIZ);
        return hashMap;
    }
}
