package X;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.Wbw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82636Wbw {
    public static Context LIZ;
    public static C82635Wbv LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static final ArrayList<InterfaceC82637Wbx> LJI = new ArrayList<>();

    public static boolean LIZ() {
        if (LIZJ && (2 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1) || 1 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1))) {
            return true;
        }
        return false;
    }
}
