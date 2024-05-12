package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import java.util.List;

/* renamed from: X.aB7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92461aB7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92461aB7(boolean z, InterfaceC70422pa interfaceC70422pa, View view, List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = view;
        this.LJLJJI = list;
        this.LJLJJL = interfaceC24760y8;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!this.LJLIL) {
            InterfaceC70422pa interfaceC70422pa = this.LJLILLLLZI;
            View view = this.LJLJI;
            List<String> list = this.LJLJJI;
            InterfaceC24760y8<Integer> interfaceC24760y8 = this.LJLJJL;
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJLJ;
            if (list != null && !list.isEmpty() && list.size() != 1) {
                XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C93046aKY(view, interfaceC65784Pro2, interfaceC65784Pro, new C1ZD(EnumC21450sn.Hidden, C1JI.LJJIJIIJIL(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 0, null, 6), C92482aBS.LJLIL), list, interfaceC24760y8, interfaceC88472Yns, interfaceC70422pa, null), 2);
            }
        }
        return C76800UCe.LIZ;
    }
}
