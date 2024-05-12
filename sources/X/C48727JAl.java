package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JAl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48727JAl extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends String>, C76800UCe> {
    public static final C48727JAl LJLIL = new C48727JAl();

    public C48727JAl() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends String> c43i) {
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Long valueOf;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        Long valueOf2;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            MidAdVM A4 = selectSubscribe.A4();
            if (C1DJ.LJIJJLI(A4.LJLJLLL) && (aweme = A4.LJLJLLL) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && (valueOf = Long.valueOf(commerceVideoAuthInfo.getInsertAdTime())) != null) {
                long longValue = valueOf.longValue() - 5000;
                Aweme aweme2 = A4.LJLJLLL;
                if (aweme2 != null && (commerceVideoAuthInfo2 = aweme2.getCommerceVideoAuthInfo()) != null && (valueOf2 = Long.valueOf(commerceVideoAuthInfo2.getRequestMidAdTime())) != null) {
                    long longValue2 = valueOf2.longValue();
                    long currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
                    if (longValue2 <= currentPosition && currentPosition < longValue) {
                        A4.LJLLLLLL = false;
                    } else if (currentPosition < longValue2) {
                        A4.LJLLLL = false;
                        A4.LJLLLLLL = false;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
