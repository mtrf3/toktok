package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.XbG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85142XbG extends AbstractC65781Prl implements InterfaceC88472Yns<C85167Xbf, C85167Xbf> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85142XbG(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel) {
        super(1);
        this.LJLIL = twoStepVerificationActivityViewModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C85167Xbf invoke(C85167Xbf c85167Xbf) {
        boolean z;
        C85167Xbf setState = c85167Xbf;
        o.LJIIIZ(setState, "$this$setState");
        java.util.Map<EnumC85151XbP, C85136XbA> map = this.LJLIL.LJLJJL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((C85136XbA) entry.getValue()).LJ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        return C85167Xbf.LIZ(setState, null, null, null, z, null, 23);
    }
}
