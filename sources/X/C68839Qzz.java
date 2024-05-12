package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.Qzz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68839Qzz implements R0Y {
    public final Fragment LIZ;
    public final R03 LIZIZ;

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

    public final void LIZIZ(InterfaceC68834Qzu interfaceC68834Qzu) {
        try {
            this.LIZIZ.w0(new BinderC68829Qzp(interfaceC68834Qzu));
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
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                R00.LIZJ(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
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

    public C68839Qzz(Fragment fragment, R03 r03) {
        QH7.LJIIIIZZ(r03);
        this.LIZIZ = r03;
        QH7.LJIIIIZZ(fragment);
        this.LIZ = fragment;
    }

    @Override // X.R0Y
    public final void LIZ(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            R00.LIZIZ(bundle2, bundle3);
            this.LIZIZ.LLLIIIL(new BinderC68153Qov(activity), bundle3);
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
            InterfaceC68163Qp5 LJJLIIIJILLIZJL = this.LIZIZ.LJJLIIIJILLIZJL(new BinderC68153Qov(layoutInflater), new BinderC68153Qov(viewGroup), bundle2);
            R00.LIZIZ(bundle2, bundle);
            return (View) BinderC68153Qov.LLJJIII(LJJLIIIJILLIZJL);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
