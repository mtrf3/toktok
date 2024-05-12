package X;

import Y.IDCListenerS241S0100000;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.19j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283519j implements C04W {
    public static final C283519j LIZIZ = new C283519j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.19i, java.lang.Object] */
    @Override // X.C04W
    public final InterfaceC65784Pro<C76800UCe> LIZ(C04D view) {
        o.LJIIIZ(view, "view");
        IDCListenerS241S0100000 iDCListenerS241S0100000 = new IDCListenerS241S0100000(view, 2);
        view.addOnAttachStateChangeListener(iDCListenerS241S0100000);
        ?? r2 = new InterfaceC267813i() { // from class: X.19i
        };
        C267913j c267913j = (C267913j) view.getTag(R.id.hwm);
        if (c267913j == null) {
            c267913j = new C267913j();
            view.setTag(R.id.hwm, c267913j);
        }
        c267913j.LIZ.add(r2);
        return new IDqS32S0300000(view, iDCListenerS241S0100000, (C283419i) r2, 0);
    }
}
