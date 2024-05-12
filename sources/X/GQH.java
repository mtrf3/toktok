package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQH implements GRT {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(GQK.LJLIL);
    public final /* synthetic */ GQI LIZIZ;
    public final /* synthetic */ GB1<AVTextExtraStruct> LIZJ;

    @Override // X.GRT
    public final GRQ LIZIZ() {
        GRQ grq = (GRQ) this.LIZ.getValue();
        o.LJII(grq, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lexical.core.renderer.ILexicalSpanFactory<S of com.ss.android.ugc.aweme.shortvideo.component.caption.textblock.renderer.CaptionRenderingManager.createRenderContext.<no name provided>.getSpanFactory, T of com.ss.android.ugc.aweme.shortvideo.component.caption.textblock.renderer.CaptionRenderingManager.createRenderContext.<no name provided>.getSpanFactory>");
        return grq;
    }

    @Override // X.GRT
    public final InterfaceC41524GRk LIZJ() {
        return new GQG(this.LIZJ);
    }

    @Override // X.GRT
    public final Activity LIZLLL() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.GRT
    public final int getMaxWidth() {
        return this.LIZJ.LIZ.getWidthLimit();
    }

    @Override // X.GRT
    public final <T> GQ2<AbstractC41507GQt<T>> LIZ(AbstractC41507GQt<T> block) {
        o.LJIIIZ(block, "block");
        Object obj = ((java.util.Map) this.LIZIZ.LIZIZ.getValue()).get(C65352Pkq.LIZ(block.getClass()));
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lexical.core.renderer.ITextBlockRenderer<com.ss.android.ugc.aweme.lexical.core.textblock.LexicalTextBlock<T of com.ss.android.ugc.aweme.shortvideo.component.caption.textblock.renderer.CaptionRenderingManager.createRenderContext.<no name provided>.findRenderer>>");
        return (GQ2) obj;
    }

    public GQH(GQI gqi, GB1<AVTextExtraStruct> gb1) {
        this.LIZIZ = gqi;
        this.LIZJ = gb1;
    }
}
