package X;

import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195417lh extends AbstractC65781Prl implements InterfaceC88471Ynr<NowOtherCollectionListAssem, C82B, C76800UCe> {
    public static final C195417lh LJLIL = new C195417lh();

    public C195417lh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, C82B it) {
        NowOtherCollectionListAssem subscribe = nowOtherCollectionListAssem;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        Object value = subscribe.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-holderSubject>(...)");
        ((C73849Syb) value).onNext(it);
        return C76800UCe.LIZ;
    }
}
