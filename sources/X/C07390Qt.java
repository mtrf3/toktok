package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07390Qt {
    public Typeface LIZ(Context context, C1IU c1iu, Resources resources, int i) {
        throw null;
    }

    public Typeface LIZIZ(Context context, C12180dq[] c12180dqArr, int i) {
        throw null;
    }

    public C07390Qt() {
        new ConcurrentHashMap();
    }

    public Typeface LIZJ(Context context, InputStream inputStream) {
        File LIZLLL = C07410Qv.LIZLLL(context);
        if (LIZLLL == null) {
            return null;
        }
        try {
            if (!C07410Qv.LIZJ(LIZLLL, inputStream)) {
                return null;
            }
            return C16880lQ.LJJLIIIJLLLLLLLZ(LIZLLL.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            C16880lQ.LLLZZIL(LIZLLL);
        }
    }

    public C12180dq LJFF(int i, C12180dq[] c12180dqArr) {
        return (C12180dq) LJ(c12180dqArr, i, new InterfaceC07380Qs<C12180dq>() { // from class: X.1Jc
            @Override // X.InterfaceC07380Qs
            public final int LIZ(C12180dq c12180dq) {
                return c12180dq.LIZJ;
            }

            @Override // X.InterfaceC07380Qs
            public final boolean LIZIZ(C12180dq c12180dq) {
                return c12180dq.LIZLLL;
            }
        });
    }

    public static <T> T LJ(T[] tArr, int i, InterfaceC07380Qs<T> interfaceC07380Qs) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(interfaceC07380Qs.LIZ(t2) - i2) * 2;
            if (interfaceC07380Qs.LIZIZ(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    public Typeface LIZLLL(Context context, Resources resources, int i, String str, int i2) {
        File LIZLLL = C07410Qv.LIZLLL(context);
        if (LIZLLL == null) {
            return null;
        }
        try {
            if (!C07410Qv.LIZIZ(LIZLLL, resources, i)) {
                return null;
            }
            return C16880lQ.LJJLIIIJLLLLLLLZ(LIZLLL.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            C16880lQ.LLLZZIL(LIZLLL);
        }
    }
}
