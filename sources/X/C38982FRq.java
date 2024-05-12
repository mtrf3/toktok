package X;

import android.app.Activity;
import android.app.Application;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.FRq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38982FRq<T> implements InterfaceC64592gB {
    public static final C38982FRq<T> LJLIL = new C38982FRq<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Activity activity = ((BPL) obj).LIZ;
        if (activity != null) {
            InterfaceC40375Fsx LJIILL = UgCommonServiceImpl.LJIJ().LJIILL();
            Application application = activity.getApplication();
            o.LJIIIIZZ(application, "activity.application");
            String LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass());
            if (LJLLILLLL == null) {
                LJLLILLLL = "";
            }
            LJIILL.LJFF(LJLLILLLL, application);
        }
    }
}
