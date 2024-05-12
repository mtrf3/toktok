package X;

import com.ss.android.ugc.aweme.image.progressbar.ImagesProgressState;
import kotlin.jvm.internal.o;

/* renamed from: X.W2y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81656W2y extends AbstractC65781Prl implements InterfaceC88472Yns<ImagesProgressState, ImagesProgressState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81656W2y(int i, float f) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC88472Yns
    public final ImagesProgressState invoke(ImagesProgressState imagesProgressState) {
        ImagesProgressState setState = imagesProgressState;
        o.LJIIIZ(setState, "$this$setState");
        return ImagesProgressState.copy$default(setState, null, new OSZ(Integer.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI)), null, null, null, 29, null);
    }
}
