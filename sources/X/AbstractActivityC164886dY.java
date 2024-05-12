package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6dY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC164886dY extends AbstractActivityC162676Zz {
    public final java.util.Map<Integer, View> LJLL = new LinkedHashMap();
    public final ArrayList<InterfaceC164896dZ> LJLJLLL = new ArrayList<>();

    public Bundle LLILIL(Intent intent) {
        return null;
    }

    public abstract Class<? extends WM7> LLILLIZIL();

    public abstract void LLILLJJLI();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        Iterator<InterfaceC164896dZ> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIJI();
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        Iterator<InterfaceC164896dZ> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(z);
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        Iterator<InterfaceC164896dZ> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(z);
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        Bundle LLILIL = LLILIL(getIntent());
        HEP hep = new HEP(this, LLILLIZIL());
        hep.LIZJ = LLILIL;
        LLILLJJLI();
        hep.LJI = false;
        hep.LIZ();
    }
}
