package X;

import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.62M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62M implements C6E9 {
    public final AbstractC42651GoZ LJLIL;
    public final VideoPublishEditModel LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.C6E9
    public final void LIZIZ() {
    }

    @Override // X.C6E9
    public final void LIZJ() {
    }

    @Override // X.C6E9
    public final void LJ() {
    }

    @Override // X.C6E9
    public final void LIZ() {
        if (C44384HbQ.LJJII(this.LJLILLLLZI)) {
            ((FTCEditToolbarViewModel) this.LJLJI.getValue()).rO(6, true);
        }
    }

    @Override // X.C6E9
    public final void LIZLLL() {
        ((FTCEditToolbarViewModel) this.LJLJI.getValue()).rO(1, true);
    }

    @Override // X.C6E9
    public final void LJFF() {
        ((FTCEditToolbarViewModel) this.LJLJI.getValue()).rO(2, true);
    }

    @Override // X.C6E9
    public final void LJI() {
        ((FTCEditToolbarViewModel) this.LJLJI.getValue()).rO(3, true);
    }

    public C62M(AbstractC42651GoZ rootScene, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(rootScene, "rootScene");
        this.LJLIL = rootScene;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 810));
    }
}
