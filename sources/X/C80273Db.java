package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet$onViewCreated$3$1", f = "IMReactionListSheet.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80273Db extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IMReactionListSheet LJLIL;
    public final /* synthetic */ List<C80353Dj> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80273Db(IMReactionListSheet iMReactionListSheet, List<C80353Dj> list, InterfaceC67352kd<? super C80273Db> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iMReactionListSheet;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80273Db(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C85453Wz c85453Wz = (C85453Wz) this.LJLIL.LJLJI.getValue();
        List<C80353Dj> newActionList = this.LJLILLLLZI;
        c85453Wz.getClass();
        o.LJIIIZ(newActionList, "newActionList");
        ((ArrayList) c85453Wz.LJLILLLLZI).clear();
        ((ArrayList) c85453Wz.LJLILLLLZI).addAll(newActionList);
        c85453Wz.notifyDataSetChanged();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
