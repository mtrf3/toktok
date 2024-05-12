package X;

import X.C38338F2w;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Iterator;

/* renamed from: X.VGl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC79459VGl<P extends C38338F2w> extends ActivityC86117Xqz {
    public final C79458VGk<P> LJLIL;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C79458VGk<P> c79458VGk = this.LJLIL;
        P p = c79458VGk.LIZIZ;
        if (p != null && c79458VGk.LIZLLL) {
            p.LIZ = null;
            c79458VGk.LIZLLL = false;
        }
        super.onDestroy();
        C79458VGk<P> c79458VGk2 = this.LJLIL;
        boolean z = !isChangingConfigurations();
        P p2 = c79458VGk2.LIZIZ;
        if (p2 != null && z) {
            Iterator<InterfaceC38339F2x> it = p2.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
            c79458VGk2.LIZIZ = null;
        }
    }

    public AbstractActivityC79459VGl() {
        Class<? extends C38338F2w> value;
        InterfaceC79460VGm interfaceC79460VGm = (InterfaceC79460VGm) getClass().getAnnotation(InterfaceC79460VGm.class);
        C0TS c0ts = null;
        if (interfaceC79460VGm != null && (value = interfaceC79460VGm.value()) != null) {
            c0ts = new C0TS(value);
        }
        this.LJLIL = new C79458VGk<>(c0ts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        C79458VGk<P> c79458VGk = this.LJLIL;
        c79458VGk.LIZ();
        P p = c79458VGk.LIZIZ;
        if (p != null && !c79458VGk.LIZLLL) {
            p.LIZ = this;
            c79458VGk.LIZLLL = true;
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C79458VGk<P> c79458VGk = this.LJLIL;
            Bundle bundle2 = bundle.getBundle("presenter_state");
            if (c79458VGk.LIZIZ == null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeValue(bundle2);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                Parcel obtain2 = Parcel.obtain();
                obtain2.unmarshall(marshall, 0, marshall.length);
                obtain2.setDataPosition(0);
                Object readValue = obtain2.readValue(C79461VGn.LIZ);
                obtain2.recycle();
                c79458VGk.LIZJ = (Bundle) readValue;
                return;
            }
            throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C79458VGk<P> c79458VGk = this.LJLIL;
        c79458VGk.getClass();
        Bundle bundle2 = new Bundle();
        c79458VGk.LIZ();
        if (c79458VGk.LIZIZ != null) {
            Bundle bundle3 = new Bundle();
            c79458VGk.LIZIZ.getClass();
            bundle2.putBundle("presenter", bundle3);
            bundle2.putString("presenter_id", EnumC79456VGi.INSTANCE.getId(c79458VGk.LIZIZ));
        }
        bundle.putBundle("presenter_state", bundle2);
    }
}
