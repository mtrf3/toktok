package X;

import android.text.TextUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ExY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38112ExY implements InterfaceC38070Ews {
    public final C38126Exm LIZ;
    public final C38073Ewv LIZIZ;
    public final java.util.Map<String, AbstractC38082Ex4> LIZJ = new HashMap();
    public final java.util.Map<String, InterfaceC31920Cfs> LIZLLL = new HashMap();
    public final List<C38117Exd> LJ = new ArrayList();
    public final java.util.Set<AbstractC38123Exj> LJFF = new HashSet();
    public final java.util.Set<InterfaceC38140Ey0> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final AbstractC38114Exa LJIIIZ;

    @Override // X.InterfaceC38070Ews
    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList(this.LJ);
        ((ArrayList) this.LJ).clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C38117Exd c38117Exd = (C38117Exd) it.next();
            this.LJIIIZ.LJII(c38117Exd);
            arrayList.add(c38117Exd.toString());
        }
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(arrayList, "list");
        c38185Eyj.LIZ("label_pending_call_list", C38113ExZ.LJIIIZ);
    }

    public final void LJFF() {
        Iterator it = ((HashSet) this.LJFF).iterator();
        while (it.hasNext()) {
            ((AbstractC38123Exj) it.next()).terminateActual();
        }
        ((HashSet) this.LJFF).clear();
        ((HashMap) this.LIZJ).clear();
        ((HashMap) this.LIZLLL).clear();
        C38065Ewn c38065Ewn = this.LIZIZ.LIZJ;
        if (c38065Ewn != null) {
            ((CopyOnWriteArraySet) c38065Ewn.LIZLLL).remove(this);
        }
    }

    public final Object LIZLLL(String str, AbstractC38082Ex4 abstractC38082Ex4) {
        C38126Exm c38126Exm = this.LIZ;
        Type genericSuperclass = abstractC38082Ex4.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            c38126Exm.getClass();
            C38126Exm.LIZ(str);
            if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
                return new JSONObject(str);
            }
            return c38126Exm.LIZ.LJIIIZ(str, type);
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    public final C38135Exv LJ(C38117Exd c38117Exd, C38131Exr c38131Exr) {
        String str;
        String str2;
        AbstractC38082Ex4 abstractC38082Ex4 = (AbstractC38082Ex4) ((HashMap) this.LIZJ).get(c38117Exd.LIZLLL);
        C37960Ev6 c37960Ev6 = c38117Exd.LJIIJJI;
        c37960Ev6.LJIJ = c38131Exr.LJ;
        c37960Ev6.LJII = c38117Exd.LIZLLL;
        c37960Ev6.LJIIIZ = c38131Exr.LIZIZ;
        c37960Ev6.LJIILL = "JSBridge2";
        c37960Ev6.LJIIJ = c38117Exd.LJIIIZ;
        c37960Ev6.LJIIJJI = Integer.valueOf(c38117Exd.LJIIJ);
        C37960Ev6 c37960Ev62 = c38117Exd.LJIIJJI;
        c37960Ev62.LJIIIIZZ = c38131Exr.LIZJ;
        c37960Ev62.LJIJJ = c38117Exd.LJII;
        c37960Ev62.LIZ();
        try {
            String str3 = c38131Exr.LIZIZ;
            if (TextUtils.isEmpty(str3) || "about:blank".equals(str3)) {
                String LJI = this.LJIIIZ.LJI();
                if (!TextUtils.isEmpty(LJI)) {
                    c38131Exr.LIZIZ = LJI;
                    C38185Eyj c38185Eyj = new C38185Eyj();
                    c38185Eyj.LIZJ(LJI, "url");
                    c38185Eyj.LIZ("label_call_new_url", c38117Exd.LJIIL);
                }
            }
            JSONObject jSONObject = null;
            if (abstractC38082Ex4 != null) {
                EnumC38078Ex0 LIZJ = LIZJ(abstractC38082Ex4, c38117Exd.LJIIJJI, c38131Exr.LIZIZ, c38117Exd.LJIIL);
                if (LIZJ == null) {
                    if (!TextUtils.isEmpty(c38131Exr.LIZIZ) && !"about:blank".equals(c38131Exr.LIZIZ)) {
                        str2 = "permission_empty_1";
                    } else {
                        str2 = "about_blank_1";
                    }
                    C38185Eyj c38185Eyj2 = new C38185Eyj();
                    c38185Eyj2.LIZJ("permission_empty_1", "reason");
                    c38185Eyj2.LIZ("label_call_handler_reject", c38117Exd.LJIIL);
                    LIZIZ(1, c38131Exr.LIZIZ, c38117Exd.LIZLLL, str2, c38117Exd.LJIIL);
                    Iterator<InterfaceC38140Ey0> it = this.LJI.iterator();
                    while (it.hasNext()) {
                        it.next().LIZJ(c38117Exd, 1);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Permission denied, call: ");
                    LIZ.append(c38117Exd);
                    X1D.LIZIZ(LIZ);
                    c38117Exd.LJIIJJI.LIZIZ(0, "jsb_auth_error_event", null);
                    throw new C38138Exy(-1);
                }
                new C38185Eyj().LIZ("label_pre_handle_origin_url", c38117Exd.LJIIL);
                if (abstractC38082Ex4 instanceof AbstractC38127Exn) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Processing stateless call: ");
                    LIZ2.append(c38117Exd);
                    X1D.LIZIZ(LIZ2);
                    AbstractC38127Exn abstractC38127Exn = (AbstractC38127Exn) abstractC38082Ex4;
                    Object invoke = abstractC38127Exn.invoke(LIZLLL(c38117Exd.LJ, abstractC38127Exn), c38131Exr);
                    if (invoke instanceof JSONObject) {
                        try {
                            ((JSONObject) invoke).put("code", 1);
                            jSONObject = (JSONObject) invoke;
                        } catch (JSONException unused) {
                        }
                        if (jSONObject != null) {
                            return new C38135Exv(jSONObject);
                        }
                    }
                    return new C38135Exv(true, C79081V1x.LJIILL(this.LIZ, invoke));
                }
                if (abstractC38082Ex4 instanceof AbstractC38134Exu) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Processing raw call: ");
                    LIZ3.append(c38117Exd);
                    X1D.LIZIZ(LIZ3);
                    ((AbstractC38134Exu) abstractC38082Ex4).LJJI(c38117Exd, new C38132Exs(c38117Exd.LIZLLL, LIZJ, new C38139Exz(this, c38117Exd)));
                    return new C38135Exv(false, "");
                }
            }
            InterfaceC31920Cfs interfaceC31920Cfs = (InterfaceC31920Cfs) ((HashMap) this.LIZLLL).get(c38117Exd.LIZLLL);
            if (interfaceC31920Cfs != null) {
                AbstractC38123Exj LIZ4 = interfaceC31920Cfs.LIZ();
                LIZ4.name = c38117Exd.LIZLLL;
                if (LIZJ(LIZ4, c38117Exd.LJIIJJI, c38131Exr.LIZIZ, c38117Exd.LJIIL) == null) {
                    if (!TextUtils.isEmpty(c38131Exr.LIZIZ) && !"about:blank".equals(c38131Exr.LIZIZ)) {
                        str = "permission_empty_2";
                    } else {
                        str = "about_blank_2";
                    }
                    C38185Eyj c38185Eyj3 = new C38185Eyj();
                    c38185Eyj3.LIZJ("permission_empty_2", "reason");
                    c38185Eyj3.LIZ("label_call_handler_reject", c38117Exd.LJIIL);
                    LIZIZ(1, c38131Exr.LIZIZ, c38117Exd.LIZLLL, str, c38117Exd.LJIIL);
                    Iterator<InterfaceC38140Ey0> it2 = this.LJI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZJ(c38117Exd, 1);
                    }
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Permission denied, call: ");
                    LIZ5.append(c38117Exd);
                    X1D.LIZIZ(LIZ5);
                    LIZ4.onDestroy();
                    c38117Exd.LJIIJJI.LIZIZ(0, "jsb_auth_error_event", null);
                    throw new C38138Exy(-1);
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("Processing stateful call: ");
                LIZ6.append(c38117Exd);
                X1D.LIZIZ(LIZ6);
                new C38185Eyj().LIZ("label_pre_handle_origin_url", c38117Exd.LJIIL);
                ((HashSet) this.LJFF).add(LIZ4);
                LIZ4.invokeActual(LIZLLL(c38117Exd.LJ, LIZ4), c38131Exr, new C38125Exl(this, c38117Exd, LIZ4));
                return new C38135Exv(false, "");
            }
            C38185Eyj c38185Eyj4 = new C38185Eyj();
            c38185Eyj4.LIZJ("not_registered_2", "reason");
            c38185Eyj4.LIZ("label_call_handler_reject", c38117Exd.LJIIL);
            LIZIZ(2, c38131Exr.LIZIZ, c38117Exd.LIZLLL, "not_registered_2", c38117Exd.LJIIL);
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("Received call: ");
            LIZ7.append(c38117Exd);
            LIZ7.append(", but not registered.");
            X1D.LIZIZ(LIZ7);
            return null;
        } catch (C38077Ewz e) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("No remote permission config fetched, call pending: ");
            LIZ8.append(c38117Exd);
            X1D.LIZIZ(LIZ8);
            C38185Eyj c38185Eyj5 = new C38185Eyj();
            c38185Eyj5.LIZJ(C16880lQ.LJLLJ(C38077Ewz.class), "exception_name");
            c38185Eyj5.LIZJ(e.getMessage(), "exception_message");
            c38185Eyj5.LIZ("label_call_pending", c38117Exd.LJIIL);
            ((ArrayList) this.LJ).add(c38117Exd);
            return new C38135Exv(false, "");
        }
    }

    public C38112ExY(C38116Exc c38116Exc, AbstractC38114Exa abstractC38114Exa, C38072Ewu c38072Ewu) {
        boolean z;
        this.LJIIIZ = abstractC38114Exa;
        this.LIZ = c38116Exc.LJ;
        C38073Ewv c38073Ewv = new C38073Ewv(c38072Ewu, c38116Exc.LJIIL, c38116Exc.LJIILIIL);
        this.LIZIZ = c38073Ewv;
        C38065Ewn c38065Ewn = c38073Ewv.LIZJ;
        if (c38065Ewn != null) {
            ((CopyOnWriteArraySet) c38065Ewn.LIZLLL).add(this);
        }
        this.LJI = c38116Exc.LJIIIZ;
        this.LJII = c38116Exc.LJIIIIZZ;
        this.LJIIIIZZ = c38116Exc.LJIILL;
        C38185Eyj c38185Eyj = new C38185Eyj();
        if (c38072Ewu != null) {
            z = true;
        } else {
            z = false;
        }
        c38185Eyj.LIZJ(Boolean.valueOf(z), "config");
        c38185Eyj.LIZ("label_create_call_handler", c38116Exc.LJIILLIIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0182, code lost:
    
        if (r8 != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC38078Ex0 LIZJ(X.AbstractC38082Ex4 r11, X.C37960Ev6 r12, java.lang.String r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38112ExY.LIZJ(X.Ex4, X.Ev6, java.lang.String, java.util.List):X.Ex0");
    }

    public final void LIZIZ(int i, String str, String str2, String str3, List list) {
        Iterator<InterfaceC38140Ey0> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(str, str2, i, str3, new C17230lz(C38113ExZ.LJIIIZ, this.LJIIIZ.LJIIIZ, list));
        }
    }
}
