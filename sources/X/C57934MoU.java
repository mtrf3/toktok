package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MoU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57934MoU extends AbstractC58014Mpm implements InterfaceC57932MoS {
    public final C57935MoV LJLJJLL;
    public String LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.K8(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJIJJLI(RecyclerView recyclerView) {
        this.LJLJJLL.LJIJJLI(recyclerView);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        this.LJLJJLL.LJJIJ(str, str2, list);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIIIJJIZ(InterfaceC88472Yns<? super C57819Mmd, C57819Mmd> interfaceC88472Yns) {
        this.LJLJJLL.LJJLIIIJJIZ(interfaceC88472Yns);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        this.LJLJJLL.LJJLIL(interfaceC57917MoD);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        this.LJLJJLL.LJLJLJ(z);
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.W7(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final void destroy() {
        this.LJLJJLL.destroy();
    }

    @Override // X.InterfaceC25773A9p
    public final C57778Mly getCurrentState() {
        return this.LJLJJLL.getCurrentState();
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        this.LJLJJLL.reset();
    }

    @Override // X.SIT
    public final AbstractC72278SYg<?> LJII() {
        return (AbstractC72278SYg) this.LJLJJLL.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC57932MoS
    public final C57859MnH getConfig() {
        return this.LJLJJLL.LJLIL;
    }

    @Override // X.InterfaceC25773A9p
    public final AbstractC030109x getItemAnimator() {
        return (AbstractC030109x) this.LJLJJLL.LJLLI.getValue();
    }

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC57932MoS
    public final boolean LJJJJZ() {
        return LJI();
    }

    @Override // X.InterfaceC57932MoS
    public final String LJJIFFI() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC57932MoS
    public final C72808Sho<InterfaceC57784Mm4> LJJJI() {
        return this.LJLJJL;
    }

    public C57934MoU(C57935MoV c57935MoV) {
        this.LJLJJLL = c57935MoV;
    }

    @Override // X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
        PowerPageLoader powerPageLoader = (PowerPageLoader) this.LJLILLLLZI.getValue();
        if (powerPageLoader != null && powerPageLoader.LJLJJL.LIZIZ && !powerPageLoader.LJLLI) {
            powerPageLoader.LJLLI = true;
            powerPageLoader.LJII();
        }
        this.LJLJJLL.LJJJIL(this);
        this.LJLJJLL.LJIILL(abstractC57774Mlu);
    }

    @Override // X.InterfaceC57932MoS
    public final void LJJJJZI(String str) {
        this.LJLJL = str;
    }

    @Override // X.InterfaceC57932MoS
    public final void LJJLIIIIJ(Class<? extends PowerCell<?>>... clazzList) {
        o.LJIIIZ(clazzList, "clazzList");
        LJIIIIZZ((Class[]) Arrays.copyOf(clazzList, clazzList.length));
    }

    @Override // X.InterfaceC57932MoS
    public final void LJJLIIIJLJLI(AqS156S0200000_9 aqS156S0200000_9) {
        this.LJLJLJ = aqS156S0200000_9;
    }
}
