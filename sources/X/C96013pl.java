package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.3pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C96013pl extends TBS implements InterfaceC88471Ynr<Integer, Boolean, Pair<Integer, Integer>> {
    public static final C96013pl LJLIL = new C96013pl();

    public C96013pl() {
        super(2, C63133Oq9.class, "getNonStrangerConversationCount", "getNonStrangerConversationCount(IZ)Landroid/util/Pair;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final Pair<Integer, Integer> invoke(Integer num, Boolean bool) {
        Iterator<C63120Opw> it = C63133Oq9.LJIILJJIL(num.intValue(), null, bool.booleanValue()).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i++;
            if (it.next().getLastShowMessage() == null) {
                i2++;
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
