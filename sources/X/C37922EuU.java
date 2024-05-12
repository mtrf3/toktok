package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.EuU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37922EuU implements InterfaceC38263Ezz {
    public final java.util.Map<Class<?>, InterfaceC37926EuY<?>> LIZ = new LinkedHashMap();
    public WeakReference<View> LIZIZ;
    public WeakReference<Activity> LIZJ;
    public String LIZLLL;
    public InterfaceC37920EuS LJ;
    public WeakReference<C37905EuD> LJFF;

    @Override // X.InterfaceC38263Ezz
    public final C37905EuD LIZJ() {
        WeakReference<C37905EuD> weakReference = this.LJFF;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC38263Ezz
    public final Activity LIZLLL() {
        return (Activity) new WeakReference(C37925EuX.LIZ(getContext())).get();
    }

    @Override // X.InterfaceC38263Ezz
    public final Context getContext() {
        View view;
        Context context;
        WeakReference<View> weakReference = this.LIZIZ;
        if (weakReference != null && (view = weakReference.get()) != null && (context = view.getContext()) != null) {
            return context;
        }
        return (Context) LJ(Context.class);
    }

    @Override // X.InterfaceC38263Ezz
    public final View getView() {
        View view;
        WeakReference<View> weakReference = this.LIZIZ;
        if (weakReference != null && (view = weakReference.get()) != null) {
            return view;
        }
        return (View) LJ(View.class);
    }

    @Override // X.InterfaceC38263Ezz
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC38263Ezz
    public final <T> T LJ(Class<T> cls) {
        InterfaceC37926EuY interfaceC37926EuY = (InterfaceC37926EuY) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC37926EuY != null) {
            return (T) interfaceC37926EuY.LIZIZ();
        }
        return null;
    }

    public final void LJII(Activity activity) {
        WeakReference<Activity> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(activity);
        }
    }

    @Override // X.InterfaceC38263Ezz
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC37920EuS interfaceC37920EuS = this.LJ;
        if (interfaceC37920EuS != null) {
            interfaceC37920EuS.LIZ(str, jSONObject);
        }
    }

    public final <T> void LJFF(Class<T> cls, T t) {
        this.LIZ.put(cls, new C37924EuW(t));
    }

    public final <T> void LJI(Class<T> cls, T t) {
        this.LIZ.put(cls, new C37923EuV(t));
    }
}
