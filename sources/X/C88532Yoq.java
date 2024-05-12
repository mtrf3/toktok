package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Yoq, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88532Yoq implements InterfaceC223218pR<Aweme> {
    public final /* synthetic */ C56538MGw LJLIL;

    @Override // X.InterfaceC223218pR
    public final void Iw() {
        this.LJLIL.LJLJJL.setValue(C88538Yow.LIZ);
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        this.LJLIL.LJLJJL.setValue(C88540Yoy.LIZ);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        this.LJLIL.LJLJJL.setValue(C88537Yov.LIZ);
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        this.LJLIL.LJLJJL.setValue(C88539Yox.LIZ);
    }

    public C88532Yoq(C56538MGw c56538MGw) {
        this.LJLIL = c56538MGw;
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJLJJL.setValue(new C88535Yot(e));
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJLJJL.setValue(new C88534Yos(e));
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJLJJL.setValue(new C88536You(e));
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL.LJLJJL.setValue(new C88530Yoo(list, z));
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL.LJLJJL.setValue(new C88529Yon(list, z));
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL.LJLJJL.setValue(new C88528Yom(list, z));
    }
}
