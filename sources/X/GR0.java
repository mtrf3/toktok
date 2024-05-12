package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GR0 extends AbstractC41508GQu {
    public GR9 LJIIIZ;
    public C41512GQy LJIIJ;

    public GR0() {
        super(0, 0, 0);
    }

    @Override // X.AbstractC41507GQt
    public final String LIZLLL(String str, AbstractC41507GQt<AVTextExtraStruct> textBlock) {
        o.LJIIIZ(textBlock, "textBlock");
        return "";
    }

    @Override // X.AbstractC41507GQt
    public final GRF<AVTextExtraStruct> LJII() {
        return new GR6(this);
    }

    @Override // X.AbstractC41507GQt
    public final boolean LJIIJJI() {
        if (this.LJIIIZ != null && this.LJIIJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC41507GQt
    public final String LJFF() {
        return "rs";
    }

    public GR0(int i) {
        super(0, 0, 0);
    }

    @Override // X.AbstractC41507GQt
    public final boolean LIZJ(AbstractC41507GQt<AVTextExtraStruct> block) {
        o.LJIIIZ(block, "block");
        if (LJIJ(block)) {
            return true;
        }
        if (this.LJIIIZ == null && (block instanceof GR9)) {
            AbstractC41508GQu abstractC41508GQu = (AbstractC41508GQu) block;
            LJIIZILJ(abstractC41508GQu);
            this.LJIIIZ = (GR9) abstractC41508GQu;
            return true;
        }
        if (this.LJIIJ == null && (block instanceof C41512GQy)) {
            AbstractC41508GQu abstractC41508GQu2 = (AbstractC41508GQu) block;
            LJIIZILJ(abstractC41508GQu2);
            C41512GQy c41512GQy = (C41512GQy) abstractC41508GQu2;
            GRD grd = GRD.QA;
            o.LJIIIZ(grd, "<set-?>");
            c41512GQy.LJIIJ = grd;
            this.LJIIJ = c41512GQy;
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unexpected text block, type: ");
        LIZ.append(C16880lQ.LJLLJ(block.getClass()));
        LIZ.append(", reference=");
        LIZ.append(block);
        AbstractC41508GQu.LJJIIZ("AnswerStickerChainTextBlock", X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final void LJIILJJIL(String blockId) {
        o.LJIIIZ(blockId, "blockId");
        super.LJIILJJIL(blockId);
        GR9 gr9 = this.LJIIIZ;
        if (gr9 != null) {
            LJJII(gr9);
            C41512GQy c41512GQy = this.LJIIJ;
            if (c41512GQy != null) {
                LJJII(c41512GQy);
                return;
            } else {
                o.LJIJI("mentionUserBlock");
                throw null;
            }
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }

    @Override // X.AbstractC41508GQu
    public final AVTextExtraStruct LJIJI(AqS157S0100000_7 aqS157S0100000_7) {
        return AVTextExtraStructHelper.createQAStickerChainBoundaryStruct((String) aqS157S0100000_7.invoke(), 7);
    }

    @Override // X.AbstractC41508GQu
    public final void LJIJJ(CharSequence[] charSequenceArr) {
        super.LJIJJ(charSequenceArr);
        GR9 gr9 = this.LJIIIZ;
        if (gr9 != null) {
            AbstractC41508GQu.LJJIII(charSequenceArr, gr9);
            C41512GQy c41512GQy = this.LJIIJ;
            if (c41512GQy != null) {
                AbstractC41508GQu.LJJIII(charSequenceArr, c41512GQy);
                return;
            } else {
                o.LJIJI("mentionUserBlock");
                throw null;
            }
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }

    @Override // X.AbstractC41508GQu
    public final void LJIJJLI(CharSequence[] charSequenceArr) {
        super.LJIJJLI(charSequenceArr);
        GR9 gr9 = this.LJIIIZ;
        if (gr9 != null) {
            AbstractC41508GQu.LJJIIJZLJL(charSequenceArr, gr9);
            C41512GQy c41512GQy = this.LJIIJ;
            if (c41512GQy != null) {
                AbstractC41508GQu.LJJIIJZLJL(charSequenceArr, c41512GQy);
                return;
            } else {
                o.LJIJI("mentionUserBlock");
                throw null;
            }
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }

    @Override // X.AbstractC41508GQu
    public final void LJJIFFI(GRT renderContext, CharSequence[] charSequenceArr) {
        o.LJIIIZ(renderContext, "renderContext");
        super.LJJIFFI(renderContext, charSequenceArr);
        GR9 gr9 = this.LJIIIZ;
        if (gr9 != null) {
            AbstractC41508GQu.LJJI(charSequenceArr, renderContext, gr9);
            C41512GQy c41512GQy = this.LJIIJ;
            if (c41512GQy != null) {
                AbstractC41508GQu.LJJI(charSequenceArr, renderContext, c41512GQy);
                return;
            } else {
                o.LJIJI("mentionUserBlock");
                throw null;
            }
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }
}
