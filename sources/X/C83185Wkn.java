package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wkn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83185Wkn implements InterfaceC83115Wjf {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ = true;
    public boolean LJLJLLL = true;
    public boolean LJLL;
    public int LJLLI;
    public final InterfaceC83727WtX LJLLILLLL;

    @Override // X.InterfaceC83115Wjf
    public final void Z6(boolean z) {
    }

    @Override // X.InterfaceC83115Wjf
    public final void n5() {
    }

    @Override // X.InterfaceC83115Wjf
    public final int B1() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC83115Wjf
    public final int K6() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC83115Wjf
    public final int X() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC83115Wjf
    public final boolean X4() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC83115Wjf
    public final boolean a4() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC83115Wjf
    public final boolean b7() {
        return this.LJLL;
    }

    @Override // X.InterfaceC83115Wjf
    public final int d3() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC83115Wjf
    public final int e5() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC83115Wjf
    public final boolean f9() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC83115Wjf
    public final int v1() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC83115Wjf
    public final int x2() {
        return this.LJLJJI;
    }

    public C83185Wkn(InterfaceC83727WtX interfaceC83727WtX) {
        this.LJLLILLLL = interfaceC83727WtX;
    }

    @Override // X.InterfaceC83115Wjf
    public final void D4(int i) {
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void E1(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void G3(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // X.InterfaceC83115Wjf
    public final void L0(int i) {
        this.LJLLI = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void N2(boolean z) {
        this.LJLJLJ = z;
        this.LJLJLLL = z;
    }

    @Override // X.InterfaceC83115Wjf
    public final void Y4(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.InterfaceC83115Wjf
    public final void c5(int i) {
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void m7(boolean z) {
        this.LJLJL = z;
    }

    @Override // X.InterfaceC83115Wjf
    public final void o8(boolean z) {
        this.LJLL = z;
    }

    @Override // X.InterfaceC83115Wjf
    public final void q6(int i) {
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void x0(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final void y1(int i) {
        this.LJLJI = i;
    }

    @Override // X.InterfaceC83115Wjf
    public final int[] LLII(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        return this.LJLLILLLL.LLII(nodePath, nodeKey);
    }

    @Override // X.InterfaceC83115Wjf
    public final void LLILLL(List<BeautyComposerInfo> newNodes, int i) {
        o.LJIIIZ(newNodes, "newNodes");
        this.LJLLILLLL.LLILLL(C82939Wgp.LIZ(newNodes), i);
    }

    @Override // X.InterfaceC83115Wjf
    public final void LLLLIIL(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        this.LJLLILLLL.LLLLIIL(C82939Wgp.LIZ(nodes), i);
    }

    @Override // X.InterfaceC83115Wjf
    public final void a(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        this.LJLLILLLL.a(C82939Wgp.LIZ(nodes), i);
    }

    @Override // X.InterfaceC83115Wjf
    public final void i(List<BeautyComposerInfo> nodes, int i) {
        o.LJIIIZ(nodes, "nodes");
        this.LJLLILLLL.i(C82939Wgp.LIZ(nodes), i);
    }

    @Override // X.InterfaceC83115Wjf
    public final void LLIIJI(List<BeautyComposerInfo> oldNodes, List<BeautyComposerInfo> newNodes, int i) {
        o.LJIIIZ(oldNodes, "oldNodes");
        o.LJIIIZ(newNodes, "newNodes");
        this.LJLLILLLL.LLIIJI(C82939Wgp.LIZ(oldNodes), C82939Wgp.LIZ(newNodes), i);
    }

    @Override // X.InterfaceC83115Wjf
    public final void LLLFF(String path, String nodeTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(nodeTag, "nodeTag");
        InterfaceC45910I0c l = this.LJLLILLLL.l();
        l.LIZ(f, path, 10000, nodeTag);
        l.commit();
    }
}
