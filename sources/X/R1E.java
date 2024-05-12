package X;

import android.app.Fragment;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class R1E extends Fragment {
    public InterfaceC61118Nyk LJLIL;

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getArguments().getStringArray(OHQ.LIZIZ);
        if (new C03880Dg(2).LIZJ(102601, "com/ss/android/ugc/aweme/permission/PermissionFragment", "requestPermissions", this, new Object[]{stringArray, 1}, "void", new C65300Pk0(false, "([Ljava/lang/String;I)V", "1490970052315612504")).LIZ) {
            return;
        }
        requestPermissions(stringArray, 1);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        InterfaceC61118Nyk interfaceC61118Nyk = this.LJLIL;
        if (interfaceC61118Nyk != null) {
            interfaceC61118Nyk.LIZ(iArr, strArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
