package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195407lg extends AbstractC65781Prl implements InterfaceC88471Ynr<NowOtherCollectionListAssem, AbstractC72932td<? extends C223208pQ>, C76800UCe> {
    public static final C195407lg LJLIL = new C195407lg();

    public C195407lg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, AbstractC72932td<? extends C223208pQ> it) {
        NowOtherCollectionListAssem selectSubscribe = nowOtherCollectionListAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it instanceof C72912tb) {
            SYL syl = selectSubscribe.LJZL;
            if (syl != null) {
                syl.post(new ARunnableS39S0100000_3(selectSubscribe, 83));
            } else {
                o.LJIJI("list");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
