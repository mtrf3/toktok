package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N3R extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final N3R LJLIL = new N3R();

    public N3R() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        return ujb.o.LJJJJZ(it, "[ERRORCODE]", CardStruct.IStatusCode.DEFAULT, false);
    }
}
