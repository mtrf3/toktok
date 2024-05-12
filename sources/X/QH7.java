package X;

import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class QH7 {
    public static void LIZIZ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LIZJ(HandlerC67272Qai handlerC67272Qai) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handlerC67272Qai.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handlerC67272Qai.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length());
            YE1.LIZLLL(sb, "Must be called on ", name, " thread, but got ", str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void LJ(String str) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void LJI(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void LJII(String str) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void LJIIIIZZ(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void LJIIJJI(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void LIZ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LIZLLL(HandlerC67272Qai handlerC67272Qai, String str) {
        if (Looper.myLooper() == handlerC67272Qai.getLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void LJFF(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJIIIZ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LJIIJ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
