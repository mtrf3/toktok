package X;

import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30230Bti {
    public static DataChannel LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static ViewGroup LJII;
    public static ViewGroup LJIIIIZZ;
    public static EnumC30204BtI LJIIIZ;
    public static EnumC30204BtI LJIIJ;
    public static List<EnumC30204BtI> LIZ = new ArrayList();
    public static final List<EnumC30204BtI> LIZIZ = new ArrayList();
    public static EnumC30231Btj LJI = EnumC30231Btj.CAN_HOLD_MORE;

    public static int LIZ(ViewGroup viewGroup) {
        int i = 0;
        if (viewGroup != null) {
            Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                if (C29306Beo.LJJIIJ((View) iDObjectS0S0101000.next()) && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        return i;
    }
}
