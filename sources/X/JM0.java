package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JM0 extends AbstractC65781Prl implements InterfaceC88472Yns<C49013JLl, java.util.Map<String, ? extends String>> {
    public static final JM0 LJLIL = new JM0();

    public JM0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final java.util.Map<String, ? extends String> invoke(C49013JLl c49013JLl) {
        Object obj;
        C49013JLl it = c49013JLl;
        o.LJIIIZ(it, "it");
        OSZ[] oszArr = new OSZ[2];
        String str = "1";
        if (it.LJLILLLLZI.isAd()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_ad", obj);
        if (!it.LJLILLLLZI.getIsLiveHasProduct()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_ecom", str);
        return C113554cx.LJJL(oszArr);
    }
}
