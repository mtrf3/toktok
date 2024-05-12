package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4TA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TA implements InterfaceC88472Yns<List<? extends C97383ry>, C76800UCe> {
    public final /* synthetic */ List<C97383ry> LJLIL;
    public final /* synthetic */ MessageRequestViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public final void LIZ(List<C97383ry> sessionList) {
        o.LJIIIZ(sessionList, "sessionList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMore invoke: ");
        LIZ.append(this.LJLIL.size());
        LIZ.append(", ");
        LIZ.append(sessionList.size());
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.kv0(this.LJLJI);
        MessageRequestViewModel messageRequestViewModel = this.LJLILLLLZI;
        messageRequestViewModel.getClass();
        messageRequestViewModel.withState(new AqS132S0200000_1(messageRequestViewModel, (MessageRequestViewModel) sessionList, (List<C97383ry>) 93));
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(List<? extends C97383ry> list) {
        LIZ(list);
        return C76800UCe.LIZ;
    }

    public C4TA(MessageRequestViewModel messageRequestViewModel, List list, boolean z) {
        this.LJLIL = list;
        this.LJLILLLLZI = messageRequestViewModel;
        this.LJLJI = z;
    }
}
