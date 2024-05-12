package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5q7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147195q7 extends AbstractC143185je {
    public final int LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC147355qN
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC147355qN
    public final int LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC147355qN
    public final int LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC147355qN
    public final int LJI() {
        return this.LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C147195q7(VideoPublishEditModel editModel) {
        super(editModel);
        int i;
        o.LJIIIZ(editModel, "editModel");
        int[] LJIIIZ = C44739Hh9.LJIIIZ(H7R.LJJJJI(editModel));
        if (LJIIIZ != null && LJIIIZ.length == 2) {
            i = LJIIIZ[0];
        } else {
            i = 720;
        }
        this.LIZLLL = i;
        this.LJ = (int) (i / 0.75f);
    }

    @Override // X.AbstractC143185je, X.InterfaceC147355qN
    public final int LIZ(boolean z) {
        return this.LJ;
    }

    @Override // X.AbstractC143185je, X.InterfaceC147355qN
    public final int LJFF(boolean z) {
        return this.LIZLLL;
    }
}
