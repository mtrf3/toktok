package X;

import android.app.Activity;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GRf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41519GRf implements GRT {
    public final /* synthetic */ C41531GRr LIZ;

    @Override // X.GRT
    public final GRQ LIZIZ() {
        return new GRQ(false);
    }

    @Override // X.GRT
    public final InterfaceC41524GRk LIZJ() {
        return new C41520GRg();
    }

    @Override // X.GRT
    public final Activity LIZLLL() {
        Activity LIZ = C105574Cj.LIZ(this.LIZ.getContext());
        if (LIZ != null) {
            return LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.GRT
    public final int getMaxWidth() {
        return this.LIZ.getTvDescription().getHookAtMaxWidth();
    }

    public C41519GRf(C41531GRr c41531GRr) {
        this.LIZ = c41531GRr;
    }

    @Override // X.GRT
    public final <T> GQ2<AbstractC41507GQt<T>> LIZ(AbstractC41507GQt<T> block) {
        o.LJIIIZ(block, "block");
        Object obj = ((LinkedHashMap) GRV.LIZ(false)).get(C65352Pkq.LIZ(block.getClass()));
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lexical.core.renderer.ITextBlockRenderer<com.ss.android.ugc.aweme.lexical.core.textblock.LexicalTextBlock<T of com.ss.android.ugc.aweme.shortvideo.ui.preview.PreviewFakeFeedView.createRenderContext.<no name provided>.findRenderer>>");
        return (GQ2) obj;
    }
}
