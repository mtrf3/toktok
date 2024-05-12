package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.5v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150265v4 extends AbstractC65781Prl implements InterfaceC88472Yns<AwemeDraft, C76800UCe> {
    public static final C150265v4 LJLIL = new C150265v4();

    public C150265v4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AwemeDraft awemeDraft) {
        AwemeDraft it = awemeDraft;
        o.LJIIIZ(it, "it");
        if (!it.LJIIIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("photo mode image auto save fail ");
            LIZ.append(it.LJJJJI.imageAlbumData);
            LIZ.append(' ');
            LIZ.append(it.LJJJJI.creationMode);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            H78.LIZJ("ImageEditAutoSaveDraftComponent errorMsg");
        }
        return C76800UCe.LIZ;
    }
}
