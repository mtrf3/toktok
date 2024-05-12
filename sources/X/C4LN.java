package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.fragment.RecommendGroupCreationPanelFragment;
import java.util.List;
import kotlin.jvm.internal.AqS52S0201000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4LN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LN extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ RecommendGroupCreationPanelFragment LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Integer LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4LN(RecommendGroupCreationPanelFragment recommendGroupCreationPanelFragment, List<String> list, int i, Integer num) {
        super(1);
        this.LJLIL = recommendGroupCreationPanelFragment;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = num;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0(this.LJLIL, new AqS52S0201000_1((List) this.LJLILLLLZI, (List<String>) this.LJLJI, (int) this.LJLJJI, (Integer) 0));
        assemble.wv0(this.LJLIL, C7WR.LJLIL);
        assemble.wv0(this.LJLIL, C7L6.LJLIL);
        return C76800UCe.LIZ;
    }
}
