package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.5v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150255v3 extends AbstractC65781Prl implements InterfaceC88472Yns<AwemeDraft, C76800UCe> {
    public static final C150255v3 LJLIL = new C150255v3();

    public C150255v3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AwemeDraft awemeDraft) {
        AwemeDraft draft = awemeDraft;
        o.LJIIIZ(draft, "draft");
        if (!draft.LJIIIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("photo mode image recover fail ");
            LIZ.append(draft.LJJJJI.imageAlbumData);
            LIZ.append(' ');
            LIZ.append(draft.LJJJJI.creationMode);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            H78.LIZJ("ImageEditAutoSaveDraftComponent errorMsg");
        }
        return C76800UCe.LIZ;
    }
}
