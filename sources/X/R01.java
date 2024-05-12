package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes12.dex */
public final class R01 implements R0Y {
    public final Fragment LIZ;
    public final R02 LIZIZ;

    @Override // X.R0Y
    public final void onDestroy() {
        try {
            this.LIZIZ.onDestroy();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onDestroyView() {
        try {
            this.LIZIZ.onDestroyView();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onLowMemory() {
        try {
            this.LIZIZ.onLowMemory();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onPause() {
        try {
            this.LIZIZ.onPause();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onResume() {
        try {
            this.LIZIZ.onResume();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onStart() {
        try {
            this.LIZIZ.onStart();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onStop() {
        try {
            this.LIZIZ.onStop();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            R00.LIZIZ(bundle, bundle2);
            Bundle arguments = this.LIZ.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                R00.LIZJ(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.LIZIZ.onCreate(bundle2);
            R00.LIZIZ(bundle2, bundle);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            R00.LIZIZ(bundle, bundle2);
            this.LIZIZ.onSaveInstanceState(bundle2);
            R00.LIZIZ(bundle2, bundle);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public R01(Fragment fragment, R02 r02) {
        this.LIZIZ = r02;
        QH7.LJIIIIZZ(fragment);
        this.LIZ = fragment;
    }

    @Override // X.R0Y
    public final void LIZ(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            R00.LIZIZ(bundle2, bundle3);
            this.LIZIZ.l0(new BinderC68153Qov(activity), googleMapOptions, bundle3);
            R00.LIZIZ(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.R0Y
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            R00.LIZIZ(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                InterfaceC68163Qp5 LJJLIIIJILLIZJL = this.LIZIZ.LJJLIIIJILLIZJL(new BinderC68153Qov(layoutInflater), new BinderC68153Qov(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                R00.LIZIZ(bundle2, bundle);
                return (View) BinderC68153Qov.LLJJIII(LJJLIIIJILLIZJL);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
