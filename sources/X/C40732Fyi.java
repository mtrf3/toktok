package X;

import Y.ARunnableS42S0100000_6;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import kotlin.jvm.internal.o;

/* renamed from: X.Fyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40732Fyi {
    public static InterfaceC40731Fyh LIZ;
    public static final MutableLiveData<Boolean> LIZIZ = new MutableLiveData<>(Boolean.FALSE);

    public static boolean LIZ(NewUserJourneyStep newUserJourneyStep) {
        o.LJIIIZ(newUserJourneyStep, "newUserJourneyStep");
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        int i = newUserJourneyStep.id;
        c40765FzF.getClass();
        EnumC40761FzB LIZ2 = C40765FzF.LIZ(i);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("inspectHandleWithNewFramework componentType:");
        LIZ3.append(LIZ2);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ3));
        if (ORZ.LJLJJI(LIZ2, C61878OQg.INSTANCE)) {
            return false;
        }
        C35878E6g.LIZ();
        InterfaceC40731Fyh interfaceC40731Fyh = LIZ;
        if (interfaceC40731Fyh == null) {
            return false;
        }
        C35604DyC.LIZ.post(new ARunnableS42S0100000_6(interfaceC40731Fyh, 1));
        return true;
    }
}
