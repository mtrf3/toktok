package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jp3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50325Jp3 extends AbstractC65781Prl implements InterfaceC88471Ynr<C50322Jp0, C50323Jp1, C50322Jp0> {
    public static final C50325Jp3 LJLIL = new C50325Jp3();

    public C50325Jp3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50322Jp0 invoke(C50322Jp0 c50322Jp0, C50323Jp1 c50323Jp1) {
        C50322Jp0 lastState = c50322Jp0;
        C50323Jp1 action = c50323Jp1;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        String str = action.LJLIL;
        String str2 = action.LJLILLLLZI;
        String str3 = action.LJLJI;
        String str4 = action.LJLJJI;
        List<FeedbackContents> list = action.LJLJJL;
        HashMap<String, Object> hashMap = action.LJLJJLL;
        int i = action.LJLJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"impr_id\":\"");
        return C50322Jp0.LIZ(lastState, 0, null, str2, str, str3, i, 0, str4, list, null, hashMap, false, false, null, null, false, null, JBR.LJFF(LIZ, action.LJLILLLLZI, "\"}", LIZ), 784963);
    }
}
