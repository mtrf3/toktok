package X;

import android.content.Context;
import java.util.LinkedHashSet;

/* renamed from: X.Nql, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60623Nql implements InterfaceC60638Nr0, InterfaceC60410NnK, InterfaceC37737ErV {
    public C60625Nqn LJLIL;
    public final V8Q LJLILLLLZI = new V8Q();

    @Override // X.InterfaceC60638Nr0
    public final C60624Nqm getExtendableContext() {
        V8Q v8q = this.LJLILLLLZI;
        if (v8q == null) {
            return null;
        }
        return (C60624Nqm) v8q.LJLIL;
    }

    public final void LIZIZ(OM1 om1) {
        if (om1.getExtendableContext() != null) {
            return;
        }
        om1.LIZLLL(this.LJLIL);
        C60422NnW c60422NnW = new C60422NnW();
        C60401NnB c60401NnB = new C60401NnB();
        c60422NnW.LIZLLL(this.LJLIL);
        om1.setExtendableWebViewClient(c60422NnW);
        c60401NnB.LIZLLL(this.LJLIL);
        om1.setExtendableWebViewClient(c60401NnB);
        LinkedHashSet<Class<? extends AbstractC60629Nqr>> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(C60775NtD.class);
        linkedHashSet.addAll(this.LJLIL.LIZJ);
        om1.getExtendableContext().LIZ(linkedHashSet);
        om1.getExtendableContext().getClass();
    }

    @Override // X.InterfaceC60638Nr0
    public final void LIZLLL(C60625Nqn c60625Nqn) {
        this.LJLIL = c60625Nqn;
        this.LJLILLLLZI.LJLIL = new C60624Nqm(this.LJLIL, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.OM1 LIZ(android.content.Context r7, X.C60630Nqs r8) {
        /*
            r6 = this;
            r4 = 0
            if (r8 == 0) goto L54
            X.NnJ r5 = r8.LIZJ
            boolean r0 = r5 instanceof X.OM1
            if (r0 == 0) goto L52
            X.OM1 r5 = (X.OM1) r5
        Lb:
            java.util.HashMap<java.lang.Class<? extends X.Nqr>, X.Nr1> r2 = r8.LIZIZ
            java.util.Set<java.lang.Class<? extends X.Nqr>> r1 = r8.LIZ
            if (r5 != 0) goto L4e
        L11:
            X.NnJ r5 = r6.LIZJ(r7, r4)
            X.OM1 r5 = (X.OM1) r5
        L17:
            X.Nqm r0 = r5.getExtendableContext()
            r0.LJ = r2
            X.Nqm r3 = r5.getExtendableContext()
            r3.getClass()
            if (r1 == 0) goto L6d
            java.util.Iterator r2 = r1.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.HashMap<java.lang.Class, java.lang.ref.WeakReference<X.ErV>> r0 = r3.LIZLLL
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3f
            goto L2a
        L3f:
            java.lang.Object r0 = X.C60626Nqo.LIZIZ(r1)
            X.Nqr r0 = (X.AbstractC60629Nqr) r0
            if (r0 == 0) goto L57
            r3.LIZIZ(r1, r0)
            X.C60637Nqz.LIZ(r0)
            goto L2a
        L4e:
            r6.LIZIZ(r5)
            goto L17
        L52:
            r5 = r4
            goto Lb
        L54:
            r1 = r4
            r2 = r4
            goto L11
        L57:
            java.lang.String r0 = "extension init fail: "
            java.lang.String r1 = X.C09K.LIZIZ(r0, r1)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            java.lang.String r0 = "ExtendableContext"
            X.C78949Uyf.LJIJJ(r0)
            X.Fkh r0 = X.C60625Nqn.LJII
            r0.getClass()
            throw r4
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60623Nql.LIZ(android.content.Context, X.Nqs):X.OM1");
    }

    public <T extends InterfaceC60409NnJ> T LIZJ(Context context, Class<T> cls) {
        OM1 om1;
        if (cls == null) {
            om1 = new OM1(context);
        } else {
            try {
                om1 = (OM1) cls.getConstructor(Context.class).newInstance(context);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        LIZIZ(om1);
        return om1;
    }
}
