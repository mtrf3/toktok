package X;

import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195387le extends AbstractC65781Prl implements InterfaceC88471Ynr<NowOtherCollectionListAssem, Integer, C76800UCe> {
    public static final C195387le LJLIL = new C195387le();

    public C195387le() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, Integer num) {
        NowOtherCollectionListAssem selectSubscribe = nowOtherCollectionListAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C195807mK c195807mK = selectSubscribe.LL;
        if (c195807mK != null) {
            c195807mK.setSelectedIndex(intValue);
            Object value = selectSubscribe.LLIIIILZ.getValue();
            o.LJIIIIZZ(value, "<get-pageIndexSubject>(...)");
            ((C73849Syb) value).onNext(Integer.valueOf(intValue));
            return C76800UCe.LIZ;
        }
        o.LJIJI("dotIndicator");
        throw null;
    }
}
