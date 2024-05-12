package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Arrays;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a63, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92147a63 implements InterfaceC61465OAj {
    public static final C92147a63 LIZ = new C92147a63();

    public static final C92145a61 LIZIZ(AbstractC91695Zyl[] abstractC91695ZylArr, InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(-640267335);
        interfaceC24520xk.LJJIIJ(-3687241);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = new C92316a8m();
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        QSQ qsq = new QSQ(2);
        qsq.LIZ(LJIILL);
        qsq.LJ(abstractC91695ZylArr);
        AbstractC91695Zyl[] navigators = (AbstractC91695Zyl[]) qsq.LJIIIZ(new AbstractC91695Zyl[qsq.LJFF()]);
        o.LJIIIZ(navigators, "navigators");
        interfaceC24520xk.LJJIIJ(760684129);
        Context context = (Context) interfaceC24520xk.LJIILLIIL(C04Q.LIZJ);
        C92145a61 c92145a61 = (C92145a61) C73975T1n.LJIIIIZZ(Arrays.copyOf(navigators, navigators.length), C0MJ.LIZ(new C92936aIm(context), C92935aIl.LJLIL), new IDqS422S0100000_31(context, 106), interfaceC24520xk, 4);
        int length = navigators.length;
        int i = 0;
        while (i < length) {
            AbstractC91695Zyl abstractC91695Zyl = navigators[i];
            i++;
            c92145a61.LJIJJ.LIZ(abstractC91695Zyl);
        }
        interfaceC24520xk.LJJIJIIJIL();
        interfaceC24520xk.LJJIJIIJIL();
        return c92145a61;
    }

    @Override // X.InterfaceC61465OAj
    public void LIZ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            AppLogNewUtils.onEventV3(str, jSONObject);
        }
    }
}
