package com.ss.android.ugc.aweme.fe.base;

import X.C16880lQ;
import X.C27740Aue;
import X.C38048EwW;
import X.C38049EwX;
import X.C38052Ewa;
import X.F0E;
import X.InterfaceC36488ETs;
import X.InterfaceC38012Evw;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class BaseCommonJavaMethod implements GenericLifecycleObserver, InterfaceC38012Evw {
    public WeakReference<F0E> LJLIL;
    public final C38049EwX LJLILLLLZI;
    public WeakReference<Context> mContextRef;

    public abstract void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public Context getActContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            return null;
        }
        Activity LIZ = C27740Aue.LIZ(weakReference.get());
        if (LIZ == null) {
            return this.mContextRef.get();
        }
        return LIZ;
    }

    public BaseCommonJavaMethod() {
    }

    public BaseCommonJavaMethod(C38049EwX c38049EwX) {
        this.LJLILLLLZI = c38049EwX;
    }

    public BaseCommonJavaMethod attach(F0E f0e) {
        if (f0e != null) {
            this.LJLIL = new WeakReference<>(f0e);
        }
        return this;
    }

    public Context getActContext(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        Activity LIZ = C27740Aue.LIZ(weakReference.get());
        if (LIZ == null) {
            return weakReference.get();
        }
        return LIZ;
    }

    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
        return this;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = c38048EwW.LIZLLL;
            if (jSONObject2 != null) {
                jSONObject2.put("func", c38048EwW.LIZJ);
                jSONObject2.put("permissionGroup", c38048EwW.LJIIIZ);
            }
            String str = c38048EwW.LIZIZ;
            c38048EwW.LJIIJ = false;
            handle(jSONObject2, new C38052Ewa(this, c38048EwW.LJI, str));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void sendEvent(String str, JSONObject jSONObject, int i) {
        C38049EwX c38049EwX;
        if ((i == 1 || i == 3) && (c38049EwX = this.LJLILLLLZI) != null) {
            c38049EwX.LJIIIIZZ(str, jSONObject);
        }
    }
}
