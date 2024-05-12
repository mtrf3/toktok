package X;

import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25220ys {
    public final /* synthetic */ int LIZ = 0;
    public Object LIZIZ;
    public Object LIZJ;
    public final Object LIZLLL;
    public Object LJ;

    public AbstractC25220ys() {
    }

    public abstract boolean LIZ(HashMap hashMap);

    public abstract JSONObject LIZJ();

    public final List LIZIZ() {
        ArrayList arrayList = new ArrayList();
        String jSONObject = LIZJ().toString();
        int indexOf = jSONObject.indexOf("nonce");
        if (indexOf > 0) {
            String LJFF = i0.LJFF(jSONObject.substring(0, indexOf), "nonce\":\"");
            String substring = jSONObject.substring(indexOf + 8);
            int indexOf2 = substring.indexOf("\"");
            String substring2 = substring.substring(0, indexOf2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJFF);
            LIZ.append(substring2.replace("\\/", "/"));
            LIZ.append(substring.substring(indexOf2));
            jSONObject = X1D.LIZIZ(LIZ);
        }
        arrayList.add(new Pair("biz_content", jSONObject));
        Object obj = this.LIZIZ;
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        arrayList.add(new Pair("merchant_id", obj));
        Object obj3 = this.LIZJ;
        if (obj3 == null) {
            obj3 = "";
        }
        arrayList.add(new Pair("request_time", obj3));
        Object obj4 = this.LIZLLL;
        if (obj4 != null) {
            obj2 = obj4;
        }
        arrayList.add(new Pair("sign", obj2));
        return arrayList;
    }

    public String toString() {
        switch (this.LIZ) {
            case 0:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BaseRequest{, mMerchantId='");
                Q89.LIZIZ(LIZ, (String) this.LIZIZ, '\'', ", mRequestTime='");
                Q89.LIZIZ(LIZ, (String) this.LIZJ, '\'', ", mSign='");
                return C77800Ug8.LIZJ(LIZ, (String) this.LIZLLL, '\'', '}', LIZ);
            default:
                return super.toString();
        }
    }

    public final void LIZLLL(HashMap hashMap, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.LJ;
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (LIZ(hashMap)) {
            interfaceC65784Pro.invoke();
        } else {
            interfaceC65784Pro2.invoke();
        }
    }

    public AbstractC25220ys(WeakReference weakReference, CQW emoteType, List emoteWithIndex, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteWithIndex, "emoteWithIndex");
        this.LIZIZ = weakReference;
        this.LIZJ = emoteType;
        this.LIZLLL = emoteWithIndex;
        this.LJ = lifecycleOwner;
    }
}
