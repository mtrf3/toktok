package X;

import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1fE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38521fE implements InterfaceC268913t {
    public final /* synthetic */ int LJLIL;
    public Object LJLILLLLZI;

    public abstract Object LJ(JSONObject jSONObject);

    public abstract String LJI();

    public abstract boolean LJIIIZ();

    public final void LJII() {
        int size = ((SparseArray) this.LJLILLLLZI).size();
        for (int i = 0; i < size; i++) {
            Object valueAt = ((SparseArray) this.LJLILLLLZI).valueAt(i);
            o.LJFF(valueAt, "itemViewMap.valueAt(i)");
            ((View) valueAt).setVisibility(8);
        }
    }

    public final String toString() {
        switch (this.LJLIL) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (!((List) this.LJLILLLLZI).isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(((List) this.LJLILLLLZI).toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void LJIIJ() {
        try {
            IEventCenter LIZ = C26059AKp.LIZ();
            String LJI = LJI();
            String LIZIZ = C237429Tm.LIZIZ((java.util.Map) this.LJLILLLLZI);
            if (LIZIZ == null) {
                LIZIZ = "{}";
            }
            LIZ.LIZ(LJI, LIZIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("pdp_container: eventName: ");
            LIZ2.append(LJI());
            LIZ2.append(", data: ");
            LIZ2.append((java.util.Map) this.LJLILLLLZI);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC38521fE(int r4) {
        /*
            r3 = this;
            r3.LJLIL = r4
            r2 = 3
            if (r4 == r2) goto L18
            r0 = 8
            if (r4 == r0) goto L14
            r3.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.LJLILLLLZI = r0
            return
        L14:
            r3.<init>()
            return
        L18:
            X.Qt4 r1 = new X.Qt4
            r0 = 2
            r1.<init>(r0)
            r3.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38521fE.<init>(int):void");
    }

    public final Object LIZLLL(InputStream inputStream) {
        try {
            C68410Qt4 c68410Qt4 = (C68410Qt4) this.LJLILLLLZI;
            c68410Qt4.getClass();
            try {
                return LJ(new JSONObject(((FY6) c68410Qt4.LJLIL).LIZ(inputStream)));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public final void LJIIJJI(int i) {
        int i2;
        int size = ((SparseArray) this.LJLILLLLZI).size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = ((SparseArray) this.LJLILLLLZI).keyAt(i3);
            View child = (View) ((SparseArray) this.LJLILLLLZI).valueAt(i3);
            o.LJFF(child, "child");
            if (keyAt == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            child.setVisibility(i2);
        }
    }

    public AbstractC38521fE(String productId) {
        this.LJLIL = 6;
        o.LJIIIZ(productId, "productId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJLILLLLZI = linkedHashMap;
        linkedHashMap.put("product_id", productId);
    }

    public AbstractC38521fE(C3R9 parameters) {
        this.LJLIL = 7;
        o.LJIIIZ(parameters, "parameters");
        this.LJLILLLLZI = parameters;
    }

    public AbstractC38521fE(AbstractC37134Ehm abstractC37134Ehm) {
        this.LJLIL = 5;
        this.LJLILLLLZI = abstractC37134Ehm;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC38521fE(int i, Object dependencies) {
        this(Collections.singletonList(new C06780Ok(dependencies)), 0);
        this.LJLIL = i;
        if (i != 4) {
        } else {
            o.LJIIIZ(dependencies, "dependencies");
            this.LJLILLLLZI = dependencies;
        }
    }

    public final View LJFF(int i, View view) {
        Object obj = ((SparseArray) this.LJLILLLLZI).get(i);
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view2 = (View) obj;
        if (view2 != null) {
            return view2;
        }
        View findViewById = view.findViewById(i);
        ((SparseArray) this.LJLILLLLZI).put(i, findViewById);
        o.LJFF(findViewById, "content.findViewById<T>(…itemViewMap.put(id, it) }");
        return findViewById;
    }

    public final void LJIIIIZZ(View view, int... iArr) {
        for (int i : iArr) {
            LJFF(i, view);
        }
    }

    public /* synthetic */ AbstractC38521fE(Object obj, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
