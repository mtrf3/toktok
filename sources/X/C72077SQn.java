package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.SQn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72077SQn implements InterfaceC72081SQr<String> {
    @Override // X.InterfaceC72081SQr
    public final void clear() {
        C72080SQq.LIZ.clear();
    }

    @Override // X.InterfaceC72081SQr
    public final Collection<Aweme> values() {
        Collection<Aweme> values = C72080SQq.LIZ.values();
        if (values != null) {
            return ORZ.LLJILJILJ(values);
        }
        return null;
    }

    @Override // X.InterfaceC72081SQr
    public final boolean containsKey(String str) {
        return C72080SQq.LIZ.containsKey(str);
    }

    @Override // X.InterfaceC72081SQr
    public final Aweme get(String str) {
        Aweme aweme = C72080SQq.LIZ.get(str);
        o.LJI(aweme);
        return aweme;
    }

    @Override // X.InterfaceC72081SQr
    public final void LIZ(Aweme aweme, Object obj) {
        C72082SQs c72082SQs = C72082SQs.LJLILLLLZI;
        Aweme m114clone = aweme.m114clone();
        o.LJIIIIZZ(m114clone, "aweme.clone()");
        c72082SQs.getClass();
        C71858SIc c71858SIc = C72082SQs.LJLJI;
        String aid = m114clone.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        c71858SIc.put(aid, m114clone);
        C72080SQq.LIZ.LIZ(aweme, obj);
    }
}
