package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public final class ZY5 {
    public static C90605ZhB LIZJ;
    public final Context LIZ;
    public final ArrayList<C90103ZXv> LIZIZ = new ArrayList<>();

    public static MediaSessionCompat.Token LIZLLL() {
        C90605ZhB c90605ZhB = LIZJ;
        C90106ZXy c90106ZXy = c90605ZhB.LJJII;
        if (c90106ZXy != null) {
            MediaSessionCompat mediaSessionCompat = c90106ZXy.LIZ;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.LIZ.LIZIZ;
            }
        } else {
            MediaSessionCompat mediaSessionCompat2 = c90605ZhB.LJJIII;
            if (mediaSessionCompat2 != null) {
                return mediaSessionCompat2.LIZ.LIZIZ;
            }
        }
        return null;
    }

    public static void LIZIZ() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
        } else {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static ZY4 LJ() {
        LIZIZ();
        return LIZJ.LJFF();
    }

    public ZY5(Context context) {
        this.LIZ = context;
    }

    public static ZY5 LIZJ(Context context) {
        if (context != null) {
            LIZIZ();
            if (LIZJ == null) {
                C90605ZhB c90605ZhB = new C90605ZhB(C16880lQ.LLLLL(context));
                LIZJ = c90605ZhB;
                c90605ZhB.LIZ(c90605ZhB.LJIIJJI);
                C90597Zh3 c90597Zh3 = c90605ZhB.LIZJ;
                if (c90597Zh3 != null) {
                    c90605ZhB.LIZ(c90597Zh3);
                }
                ZYD zyd = new ZYD(c90605ZhB.LIZ, c90605ZhB);
                if (!zyd.LJFF) {
                    zyd.LJFF = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    C16880lQ.LJJLIIIJJI(zyd.LIZ, zyd.LJI, intentFilter, zyd.LIZJ);
                    zyd.LIZJ.post(zyd.LJII);
                }
            }
            C90605ZhB c90605ZhB2 = LIZJ;
            int size = c90605ZhB2.LIZLLL.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ZY5 zy5 = (ZY5) ((Reference) ListProtector.get(c90605ZhB2.LIZLLL, size)).get();
                    if (zy5 == null) {
                        ListProtector.remove(c90605ZhB2.LIZLLL, size);
                    } else if (zy5.LIZ == context) {
                        return zy5;
                    }
                } else {
                    ZY5 zy52 = new ZY5(context);
                    c90605ZhB2.LIZLLL.add(new WeakReference<>(zy52));
                    return zy52;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static void LJII(int i) {
        if (i >= 0 && i <= 3) {
            LIZIZ();
            ZY4 LIZJ2 = LIZJ.LIZJ();
            if (LIZJ.LJFF() != LIZJ2) {
                LIZJ.LJIIIIZZ(LIZJ2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void LJI(AbstractC90102ZXu abstractC90102ZXu) {
        if (abstractC90102ZXu != null) {
            LIZIZ();
            int size = this.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                if (((C90103ZXv) ListProtector.get(this.LIZIZ, i)).LIZIZ == abstractC90102ZXu) {
                    if (i >= 0) {
                        ListProtector.remove(this.LIZIZ, i);
                        LIZJ.LJIIJ();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public static boolean LJFF(C90101ZXt c90101ZXt, int i) {
        if (c90101ZXt != null) {
            LIZIZ();
            C90605ZhB c90605ZhB = LIZJ;
            c90605ZhB.getClass();
            if (c90101ZXt.LIZJ()) {
                return false;
            }
            if ((i & 2) != 0 || !c90605ZhB.LJIIL) {
                int size = c90605ZhB.LJ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ZY4 zy4 = (ZY4) ListProtector.get(c90605ZhB.LJ, i2);
                    if (((i & 1) != 0 && zy4.LIZLLL()) || !zy4.LJII(c90101ZXt)) {
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void LIZ(C90101ZXt c90101ZXt, AbstractC90102ZXu abstractC90102ZXu, int i) {
        C90103ZXv c90103ZXv;
        if (c90101ZXt != null) {
            if (abstractC90102ZXu != null) {
                LIZIZ();
                int size = this.LIZIZ.size();
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (((C90103ZXv) ListProtector.get(this.LIZIZ, i2)).LIZIZ == abstractC90102ZXu) {
                        if (i2 >= 0) {
                            c90103ZXv = (C90103ZXv) ListProtector.get(this.LIZIZ, i2);
                        }
                    } else {
                        i2++;
                    }
                }
                c90103ZXv = new C90103ZXv(this, abstractC90102ZXu);
                this.LIZIZ.add(c90103ZXv);
                if (i != c90103ZXv.LIZLLL) {
                    c90103ZXv.LIZLLL = i;
                    z = true;
                }
                C90101ZXt c90101ZXt2 = c90103ZXv.LIZJ;
                c90101ZXt2.LIZ();
                c90101ZXt.LIZ();
                if (!c90101ZXt2.LIZIZ.containsAll(c90101ZXt.LIZIZ)) {
                    C90100ZXs c90100ZXs = new C90100ZXs(c90103ZXv.LIZJ);
                    c90100ZXs.LIZIZ(c90101ZXt);
                    c90103ZXv.LIZJ = c90100ZXs.LIZJ();
                } else if (!z) {
                    return;
                }
                LIZJ.LJIIJ();
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
