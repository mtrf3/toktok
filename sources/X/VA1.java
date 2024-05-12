package X;

import android.content.Context;
import android.text.TextUtils;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import defpackage.i0;

/* loaded from: classes14.dex */
public final class VA1 {
    public static String LIZ(Context context, String str, boolean z) {
        InterfaceC79290V9y interfaceC79290V9y;
        int lastIndexOf;
        if ((context instanceof VNU) && !TextUtils.isEmpty(str)) {
            VNU LJJJJI = C78996UzQ.LJJJJI(context);
            if (LJJJJI == null) {
                LLog.LIZLLL(4, "ImageUrlRedirectUtils", "redirecting url failed due to no context available");
                return str;
            }
            if (z) {
                interfaceC79290V9y = LJJJJI.LJLILLLLZI;
            } else {
                interfaceC79290V9y = LJJJJI.LJLIL;
            }
            if (interfaceC79290V9y != null) {
                String str2 = LJJJJI.LJLLJ;
                TraceEvent.LIZIZ("Interceptor.shouldRedirectImageUrl");
                String LIZIZ = interfaceC79290V9y.LIZIZ(str);
                TraceEvent.LJ("Interceptor.shouldRedirectImageUrl");
                if (LIZIZ == null) {
                    if (TextUtils.isEmpty(str) || !str.startsWith("./") || TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf("/")) <= 0) {
                        return str;
                    }
                    String substring = str2.substring(0, lastIndexOf);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(substring);
                    LIZ.append(str.substring(1));
                    LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("shouldRedirectImageUrl use local image url:");
                    LIZ2.append(LIZIZ);
                    LLog.LIZLLL(1, "ImageUrlRedirectUtils", X1D.LIZIZ(LIZ2));
                    if (!LIZIZ.startsWith("http") && !LIZIZ.startsWith("file://") && !LIZIZ.startsWith("content://") && !LIZIZ.startsWith("res://") && !LIZIZ.startsWith("data:")) {
                        if (LIZIZ.startsWith("assets:///")) {
                            LIZIZ = LIZIZ.replace("assets:///", "asset:///");
                        } else if (LIZIZ.startsWith("assets://")) {
                            LIZIZ = LIZIZ.replace("assets://", "asset:///");
                        } else if (!LIZIZ.startsWith("asset:///")) {
                            LIZIZ = i0.LJFF("file://", LIZIZ);
                        }
                        if (LIZIZ == null) {
                            return str;
                        }
                    }
                }
                if (LIZIZ.startsWith("res:///")) {
                    for (int i = 7; i < LIZIZ.length(); i++) {
                        char charAt = LIZIZ.charAt(i);
                        if (charAt < '0' || charAt > '9') {
                            int indexOf = LIZIZ.indexOf(46);
                            if (indexOf < 0) {
                                indexOf = LIZIZ.length();
                            }
                            return KMP.LJ("res:///", LJJJJI.getResources().getIdentifier(LIZIZ.substring(7, indexOf), "drawable", LJJJJI.getPackageName()));
                        }
                    }
                }
                return LIZIZ;
            }
            return str;
        }
        return str;
    }
}
