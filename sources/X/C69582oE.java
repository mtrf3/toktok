package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.2oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69582oE implements LEA {
    public static final C69582oE LJLIL = new C69582oE();
    public static final XLM LJLILLLLZI;
    public static final C79863Bm LJLJI;

    static {
        XLM LIZ = V8H.LIZ("");
        LJLILLLLZI = LIZ;
        LJLJI = V1M.LIZLLL(LIZ);
    }

    public static String LIZ() {
        XLM xlm = LJLILLLLZI;
        String str = (String) xlm.getValue();
        if (str.length() == 0 || o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
            if (str == null) {
                str = "";
            }
            xlm.setValue(str);
        }
        return str;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        XKX.LIZLLL(AnonymousClass311.LIZ(), null, null, new C69572oD(user, null), 3);
    }
}
