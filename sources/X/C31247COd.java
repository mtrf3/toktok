package X;

import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.COd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31247COd<T> implements InterfaceC31253COj {
    public static final C31247COd<T> LIZ = new C31247COd<>();

    @Override // X.InterfaceC31253COj
    public final Object LIZ(android.net.Uri uri, String key, String str) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(key, "key");
        HColor hColor = new HColor();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('#');
        LIZ2.append(str);
        hColor.setColor(ColorProtector.parseColor(C40691Fy3.LIZIZ(X1D.LIZIZ(LIZ2))));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(key);
        LIZ3.append("_light");
        String queryParameter = UriProtector.getQueryParameter(uri, X1D.LIZIZ(LIZ3));
        if (queryParameter != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append('#');
            LIZ4.append(queryParameter);
            hColor.setColorLight(ColorProtector.parseColor(C40691Fy3.LIZIZ(X1D.LIZIZ(LIZ4))));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(key);
        LIZ5.append("_dark");
        String queryParameter2 = UriProtector.getQueryParameter(uri, X1D.LIZIZ(LIZ5));
        if (queryParameter2 != null) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append('#');
            LIZ6.append(queryParameter2);
            hColor.setColorDark(ColorProtector.parseColor(C40691Fy3.LIZIZ(X1D.LIZIZ(LIZ6))));
        }
        return hColor;
    }
}
