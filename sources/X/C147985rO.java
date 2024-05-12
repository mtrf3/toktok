package X;

import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147985rO extends AbstractC163776bl<EditToolbarViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C148025rS LJLLI;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        this.LJLJLLL.add(this.LJLL, new C143565kG(this.LJLJLJ), "EditSideToolbarComponent");
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditToolbarViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C147985rO(C82622Wbi diContainer, C147295qH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.cq1;
        this.LJLLI = C148025rS.LJLIL;
    }
}
