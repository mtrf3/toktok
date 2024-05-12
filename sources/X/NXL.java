package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXL extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedCommerceAssem, C43I<? extends NOJ>, C76800UCe> {
    public static final NXL LJLIL = new NXL();

    public NXL() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedCommerceAssem feedCommerceAssem, C43I<? extends NOJ> c43i) {
        String str;
        NLW nlw;
        NOJ noj;
        NOJ noj2;
        FeedCommerceAssem selectSubscribe = feedCommerceAssem;
        C43I<? extends NOJ> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = selectSubscribe.LLFF;
        if (aweme != null && C63081OpJ.LJJLIIIJJIZ(aweme)) {
            String str2 = null;
            if (c43i2 != null && (noj2 = (NOJ) c43i2.LIZ) != null) {
                str = noj2.LJII;
            } else {
                str = null;
            }
            Aweme aweme2 = selectSubscribe.LLFF;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            if (TextUtils.equals(str, str2)) {
                if (!C52471KiZ.LIZ() || selectSubscribe.getContext() == null || (c43i2 != null && (noj = (NOJ) c43i2.LIZ) != null && noj.LIZLLL == 69)) {
                    C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(AdPopUpWebPageAssem.class));
                } else {
                    Context context = selectSubscribe.getContext();
                    if (context != null && (nlw = (NLW) selectSubscribe.LJZL.getValue()) != null) {
                        nlw.LJIJJLI(context);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
