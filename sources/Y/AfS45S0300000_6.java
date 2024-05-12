package Y;

import X.C33798DOg;
import X.C36676EaO;
import X.C68322mC;
import X.C76732zl;
import X.E27;
import X.E3F;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import com.google.gson.m;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public class AfS45S0300000_6 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS45S0300000_6 afS45S0300000_6, Object obj) {
        ARunnableS10S0400000_6 aRunnableS10S0400000_6 = new ARunnableS10S0400000_6((E27) obj, (FetchABTestCommonRequest) afS45S0300000_6.l0, (String[]) afS45S0300000_6.l1, (C68322mC) afS45S0300000_6.l2, 4);
        E3F.LIZJ("FetchABScheduleTask", new AqS156S0100000_6(aRunnableS10S0400000_6, 71), new AqS153S0200000_6(aRunnableS10S0400000_6, (String[]) afS45S0300000_6.l1, 9), ((Boolean) C33798DOg.LIZJ.getValue()).booleanValue());
    }

    public static final void accept$1(AfS45S0300000_6 afS45S0300000_6, Object obj) {
        if (((C36676EaO) afS45S0300000_6.l0).LIZ) {
            return;
        }
        ((InterfaceC88472Yns) afS45S0300000_6.l1).invoke(Integer.valueOf(((C76732zl) afS45S0300000_6.l2).element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS45S0300000_6(Object obj, FetchABTestCommonRequest fetchABTestCommonRequest, String[] strArr, C68322mC<m> c68322mC) {
        this.$t = c68322mC;
        this.l0 = obj;
        this.l1 = fetchABTestCommonRequest;
        this.l2 = strArr;
    }
}
