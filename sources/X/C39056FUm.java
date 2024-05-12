package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FUm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39056FUm {
    public static final C39056FUm LIZIZ = new C39056FUm();
    public static final ConcurrentHashMap<String, InterfaceC39061FUr> LIZ = new ConcurrentHashMap<>();

    public static Object LIZ(String viewTag, int i, Context context) {
        o.LJIIJ(viewTag, "viewTag");
        o.LJIIJ(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        HandlerC39055FUl handlerC39055FUl = HandlerC39055FUl.LJIIIIZZ;
        View LIZ2 = handlerC39055FUl.LIZ(context, i, viewTag);
        InterfaceC39061FUr interfaceC39061FUr = LIZ.get(viewTag);
        if (interfaceC39061FUr != null) {
            boolean z = true;
            if (LIZ2 != null) {
                LIZIZ(interfaceC39061FUr, i, LIZ2, context, true);
                FOQ foq = C39057FUn.LIZIZ;
                if (foq != null) {
                    ((FOP) foq).LIZIZ(System.currentTimeMillis() - currentTimeMillis, interfaceC39061FUr, true);
                }
            } else {
                LIZ2 = handlerC39055FUl.LIZ(context, i, viewTag);
                if (LIZ2 == null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    LIZ2 = interfaceC39061FUr.LIZLLL().LIZ(context, i, interfaceC39061FUr.LJ(context));
                    FOQ foq2 = C39057FUn.LIZIZ;
                    if (foq2 != null) {
                        ((FOP) foq2).LIZJ(System.currentTimeMillis() - currentTimeMillis2, interfaceC39061FUr);
                    }
                    z = false;
                } else {
                    LIZIZ(interfaceC39061FUr, i, LIZ2, context, true);
                }
                FOQ foq3 = C39057FUn.LIZIZ;
                if (foq3 != null) {
                    ((FOP) foq3).LIZIZ(System.currentTimeMillis() - currentTimeMillis, interfaceC39061FUr, z);
                }
                if (LIZ2 == null) {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return LIZ2;
        }
        throw new C2PR(viewTag);
    }

    public static void LIZIZ(InterfaceC39061FUr interfaceC39061FUr, int i, View view, Context context, boolean z) {
        if (!(context instanceof Activity)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("nitaView currentContext is ApplicationContext,view type is ");
            LIZ2.append(C16880lQ.LJLLJ(view.getClass()));
            X1D.LIZIZ(LIZ2);
            return;
        }
        if (view.getContext() instanceof C39058FUo) {
            Context context2 = view.getContext();
            if (context2 != null) {
                o.LJIIJ(context, "context");
                ((C39058FUo) context2).LIZ = new WeakReference<>(context);
                if (z) {
                    Activity activity = (Activity) context;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("replace start ");
                    LIZ3.append(System.currentTimeMillis());
                    X1D.LIZIZ(LIZ3);
                    AMI.LIZIZ(activity, view);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("replace end ");
                    LIZ4.append(System.currentTimeMillis());
                    X1D.LIZIZ(LIZ4);
                    interfaceC39061FUr.LJI(view, activity);
                    return;
                }
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.nita.context.NitaContext");
        }
    }
}
