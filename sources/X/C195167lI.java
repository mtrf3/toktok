package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowPostBaseCellAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [ASSEM, T] */
/* renamed from: X.7lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195167lI<ASSEM, T> extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostBaseCellAssem<ASSEM, T>, AbstractC194637kR, C76800UCe> {
    public static final C195167lI LJLIL = new C195167lI();

    public C195167lI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Object obj, AbstractC194637kR abstractC194637kR) {
        NowPostBaseCellAssem subscribePostState = (NowPostBaseCellAssem) obj;
        AbstractC194637kR nowPostState = abstractC194637kR;
        o.LJIIIZ(subscribePostState, "$this$subscribePostState");
        o.LJIIIZ(nowPostState, "nowPostState");
        NowPostCellViewModel n4 = subscribePostState.n4();
        n4.getClass();
        n4.setStateImmediate(new AqS169S0100000_3(nowPostState, 36));
        n4.setState(new AqS134S0200000_3(n4, nowPostState, 9));
        return C76800UCe.LIZ;
    }
}
