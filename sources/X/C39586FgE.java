package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FgE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39586FgE implements Cloneable {
    public static final AtomicInteger LJLJJL = new AtomicInteger(0);
    public static final List<C39586FgE>[] LJLJJLL = new List[10];
    public static final WeakHashMap<Object, java.util.Map<Integer, WeakReference<C39586FgE>>> LJLJL = new WeakHashMap<>();
    public final int LJLIL;
    public int LJLILLLLZI;
    public Object LJLJI;
    public WebView LJLJJI;

    public C39586FgE() {
        this.LJLILLLLZI = LJLJJL.getAndIncrement();
        this.LJLIL = -1;
    }

    public final boolean LIZIZ() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            return LJI.LIZIZ();
        }
        return ((Boolean) EnumC39588FgG.CAN_GO_BACK.LIZLLL(this.LJLJI, new Object[0])).booleanValue();
    }

    public final boolean LIZJ() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            return LJI.LIZJ();
        }
        return ((Boolean) EnumC39588FgG.CAN_GO_FORWARD.LIZLLL(this.LJLJI, new Object[0])).booleanValue();
    }

    public void LIZLLL() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LIZLLL();
        } else {
            EnumC39588FgG.DESTROY.LIZLLL(this.LJLJI, new Object[0]);
        }
    }

    public final void LJII() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJII();
        } else {
            EnumC39588FgG.GO_BACK.LIZLLL(this.LJLJI, new Object[0]);
        }
    }

    public final void LJIIIIZZ() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJIIIIZZ();
        } else {
            EnumC39588FgG.GO_FORWARD.LIZLLL(this.LJLJI, new Object[0]);
        }
    }

    public final void LJIIL() {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJIIL();
        } else {
            EnumC39588FgG.RELOAD.LIZLLL(this.LJLJI, new Object[0]);
        }
    }

    public final Object clone() {
        try {
            C39586FgE c39586FgE = (C39586FgE) super.clone();
            c39586FgE.LJLILLLLZI = this.LJLILLLLZI;
            return c39586FgE;
        } catch (Exception unused) {
            throw new RuntimeException("WebViewClientExt clone error");
        }
    }

    public C39586FgE(int i) {
        this.LJLILLLLZI = LJLJJL.getAndIncrement();
        this.LJLIL = i;
        if (i > 2 && i <= 9) {
        } else {
            throw new RuntimeException("WebViewClientExt priorityRegion out of bounds!");
        }
    }

    public static C39586FgE LJI(C39586FgE c39586FgE) {
        boolean z;
        int i = c39586FgE.LJLIL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C39586FgE>[] listArr = LJLJJLL;
            if (i < listArr.length) {
                List<C39586FgE> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C39586FgE c39586FgE2 = (C39586FgE) ListProtector.get(list, i2);
                        if (c39586FgE2 != null) {
                            if (z) {
                                return LJFF(c39586FgE2, c39586FgE);
                            }
                            if (c39586FgE2.LJLILLLLZI != c39586FgE.LJLILLLLZI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C39586FgE c39586FgE3 = (C39586FgE) ListProtector.get(list, i3);
                                    if (c39586FgE3 != null) {
                                        return LJFF(c39586FgE3, c39586FgE);
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public void LJIIJ(String str) {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJIIJ(str);
        } else {
            EnumC39588FgG.LOAD_URL_1.LIZLLL(this.LJLJI, str);
        }
    }

    public static C39586FgE LJFF(C39586FgE c39586FgE, C39586FgE c39586FgE2) {
        C39586FgE c39586FgE3;
        WeakHashMap<Object, java.util.Map<Integer, WeakReference<C39586FgE>>> weakHashMap = LJLJL;
        java.util.Map<Integer, WeakReference<C39586FgE>> map = weakHashMap.get(c39586FgE2.LJLJI);
        if (map == null) {
            map = new HashMap<>();
            weakHashMap.put(c39586FgE2.LJLJI, map);
        }
        WeakReference<C39586FgE> weakReference = map.get(Integer.valueOf(c39586FgE.LJLILLLLZI));
        if (weakReference == null || (c39586FgE3 = weakReference.get()) == null) {
            try {
                c39586FgE3 = (C39586FgE) super.clone();
                c39586FgE3.LJLILLLLZI = c39586FgE.LJLILLLLZI;
                c39586FgE3.LJLJI = c39586FgE2.LJLJI;
                c39586FgE3.LJLJJI = c39586FgE2.LJLJJI;
                map.put(Integer.valueOf(c39586FgE.LJLILLLLZI), new WeakReference<>(c39586FgE3));
            } catch (Exception unused) {
                throw new RuntimeException("WebViewClientExt clone error");
            }
        }
        return c39586FgE3;
    }

    public void LIZ(Object obj, String str) {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LIZ(obj, str);
        } else {
            EnumC39588FgG.ADD_JAVASCRIPT_INTERFACE.LIZLLL(this.LJLJI, obj, str);
        }
    }

    public void LJ(ValueCallback valueCallback, String str) {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJ(valueCallback, str);
        } else {
            EnumC39588FgG.EVALUATE_JAVASCRIPT.LIZLLL(this.LJLJI, str, valueCallback);
        }
    }

    public void LJIIIZ(java.util.Map<String, Object> map, boolean z) {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJIIIZ(map, z);
        } else {
            EnumC39588FgG.INIT.LIZLLL(this.LJLJI, map, Boolean.valueOf(z));
        }
    }

    public void LJIIJJI(String str, java.util.Map<String, String> map) {
        C39586FgE LJI = LJI(this);
        if (LJI != null) {
            LJI.LJIIJJI(str, map);
        } else {
            EnumC39588FgG.LOAD_URL_2.LIZLLL(this.LJLJI, str, map);
        }
    }
}
