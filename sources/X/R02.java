package X;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes12.dex */
public interface R02 extends IInterface {
    InterfaceC68163Qp5 LJJLIIIJILLIZJL(BinderC68153Qov binderC68153Qov, BinderC68153Qov binderC68153Qov2, Bundle bundle);

    void a0(BinderC68820Qzg binderC68820Qzg);

    void l0(BinderC68153Qov binderC68153Qov, GoogleMapOptions googleMapOptions, Bundle bundle);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
