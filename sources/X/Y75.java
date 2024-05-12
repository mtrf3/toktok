package X;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class Y75 {
    public static Context LIZ;
    public static Y74 LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static final ArrayList<Y77> LJI = new ArrayList<>();

    public static boolean LIZ() {
        if (LIZJ && (2 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1) || 1 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1))) {
            return true;
        }
        return false;
    }
}
