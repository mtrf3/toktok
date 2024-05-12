package X;

import android.app.Activity;
import com.bytedance.touchpoint.core.model.IncentiveCommon;
import com.bytedance.touchpoint.data.request.INetworkApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245159jj extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, EnumC245149ji, C76800UCe> {
    public static final C245159jj LJLIL = new C245159jj();

    public C245159jj() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 receiver, EnumC245149ji type) {
        boolean z;
        String str;
        Activity LJII;
        InterfaceC245219jp interfaceC245219jp;
        String str2;
        String str3;
        Boolean bool;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(type, "type");
        if (type == EnumC245149ji.TYPE_UPDATE) {
            C245089jc.LJLILLLLZI = true;
            IncentiveCommon incentiveCommon = (IncentiveCommon) C2MW.LIZ().LIZLLL(23);
            if (incentiveCommon != null && (bool = incentiveCommon.nowFeedRetry) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            String str4 = "";
            if (incentiveCommon == null || (str = incentiveCommon.nowInviterCode) == null) {
                str = "";
            }
            if (z && str.length() > 0 && ((str3 = C245089jc.LJLJI) == null || str3.length() == 0)) {
                C245089jc.LJLJI = str;
            }
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null && (LJII = abstractC247499nV.LJII()) != null && C245089jc.LJLILLLLZI && (interfaceC245219jp = C95J.LIZIZ.get(23)) != null && interfaceC245219jp.LIZ() && (str2 = C245089jc.LJLJI) != null && str2.length() != 0 && !C245089jc.LJLIL) {
                C10K.LIZJ(new Callable() { // from class: X.9jk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        INetworkApi LJFF;
                        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                        if (interfaceC247459nR == null || (LJFF = interfaceC247459nR.LJFF()) == null) {
                            return null;
                        }
                        String str5 = C245089jc.LJLJI;
                        if (str5 == null) {
                            str5 = "";
                        }
                        C10K<String> updateInviterCode = LJFF.updateInviterCode(str5);
                        if (updateInviterCode == null) {
                            return null;
                        }
                        return updateInviterCode.LJ(new C10I() { // from class: X.9jn
                            @Override // X.C10I
                            public final Object then(C10K c10k) {
                                return c10k;
                            }
                        }, C10K.LJI, null);
                    }
                });
                if (!C247249n6.LIZIZ) {
                    C247249n6.LIZ(LJII, new AqS154S0100000_4(LJII, 1282), C245229jq.LJLIL);
                } else {
                    String str5 = C245089jc.LJLJI;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    C245089jc.LIZ(LJII, str4);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
