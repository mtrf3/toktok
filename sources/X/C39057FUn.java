package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.nita.Nita$beginDynamicInflate$1;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FUn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39057FUn {
    public static Context LIZ;
    public static FOQ LIZIZ;
    public static final C39057FUn LIZJ = new C39057FUn();

    public static final void LIZ(InterfaceC39061FUr interfaceC39061FUr) {
        synchronized (C39056FUm.LIZIZ) {
            C39056FUm.LIZ.put(interfaceC39061FUr.LJII(), interfaceC39061FUr);
        }
    }

    public static boolean LJ(String str) {
        boolean z;
        synchronized (C39056FUm.LIZIZ) {
            if (C39056FUm.LIZ.get(str) == null) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static int LIZIZ(Context context, String str) {
        List<View> list;
        HandlerC39055FUl handlerC39055FUl = HandlerC39055FUl.LJIIIIZZ;
        handlerC39055FUl.getClass();
        HashMap<Integer, SparseArray<List<View>>> hashMap = HandlerC39055FUl.LIZIZ.get(str);
        int i = 0;
        if (hashMap != null) {
            synchronized (hashMap) {
                SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(handlerC39055FUl.LJ(context, str, false)));
                if (sparseArray != null && (list = sparseArray.get(R.layout.ako)) != null) {
                    i = list.size();
                }
            }
        }
        return i;
    }

    public static View LIZJ(Activity activity, String str, InterfaceC65784Pro interfaceC65784Pro) {
        AbstractC39064FUu abstractC39064FUu;
        synchronized (C39056FUm.LIZIZ) {
            if (!LJ(str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fallbackInflate ");
                LIZ2.append(str);
                LIZ2.append(" nitaview is not find");
                X1D.LIZIZ(LIZ2);
                abstractC39064FUu = null;
            } else {
                InterfaceC39061FUr interfaceC39061FUr = C39056FUm.LIZ.get(str);
                if (interfaceC39061FUr != null) {
                    abstractC39064FUu = (AbstractC39064FUu) interfaceC39061FUr;
                } else {
                    throw new C2PR(str);
                }
            }
        }
        if (abstractC39064FUu != null) {
            return (View) C39056FUm.LIZ(((Nita$beginDynamicInflate$1) abstractC39064FUu).LJLJJL, R.layout.ako, activity);
        }
        return (View) interfaceC65784Pro.invoke();
    }

    public static boolean LIZLLL(Context context, int i, String viewTag) {
        List<View> list;
        o.LJIIJ(viewTag, "viewTag");
        HandlerC39055FUl handlerC39055FUl = HandlerC39055FUl.LJIIIIZZ;
        handlerC39055FUl.getClass();
        HashMap<Integer, SparseArray<List<View>>> hashMap = HandlerC39055FUl.LIZIZ.get(viewTag);
        boolean z = false;
        if (hashMap != null) {
            synchronized (hashMap) {
                SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(handlerC39055FUl.LJ(context, viewTag, false)));
                if (sparseArray != null && (list = sparseArray.get(i)) != null) {
                    if (list.size() != 0) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public final void LJFF(Context context, int i, String viewTag) {
        o.LJIIJ(viewTag, "viewTag");
        InterfaceC39061FUr interfaceC39061FUr = C39056FUm.LIZ.get(viewTag);
        if (interfaceC39061FUr != null) {
            if (context == null) {
                if (interfaceC39061FUr.LIZIZ() != 0) {
                    Context context2 = LIZ;
                    if (context2 != null) {
                        context = new C39058FUo(context2, interfaceC39061FUr.LIZIZ());
                    } else {
                        o.LJIJI("context");
                        throw null;
                    }
                } else {
                    Context context3 = LIZ;
                    if (context3 != null) {
                        context = new C39058FUo(context3);
                    } else {
                        o.LJIJI("context");
                        throw null;
                    }
                }
            }
            InterfaceC38906FOs interfaceC38906FOs = C38908FOu.LIZ.get(interfaceC39061FUr.LIZ());
            if (interfaceC38906FOs != null) {
                interfaceC38906FOs.LIZ(i, context, interfaceC39061FUr);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        throw new C2PR(viewTag);
    }
}
