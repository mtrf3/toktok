package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GQz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41513GQz extends AbstractC41508GQu {
    public C41512GQy LJIIIZ;

    public C41513GQz() {
        super(0, 0, 0);
    }

    @Override // X.AbstractC41507GQt
    public final String LIZLLL(String str, AbstractC41507GQt<AVTextExtraStruct> textBlock) {
        o.LJIIIZ(textBlock, "textBlock");
        return "";
    }

    @Override // X.AbstractC41507GQt
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC41507GQt
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.AbstractC41508GQu
    public final boolean LJJ() {
        return true;
    }

    @Override // X.AbstractC41507GQt
    public final GRF<AVTextExtraStruct> LJII() {
        return new GR8(this);
    }

    @Override // X.AbstractC41507GQt
    public final boolean LJIIJJI() {
        if (this.LJIIIZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC41507GQt
    public final String LJFF() {
        return "rc";
    }

    public C41513GQz(int i) {
        super(0, 0, 0);
    }

    @Override // X.AbstractC41507GQt
    public final boolean LIZJ(AbstractC41507GQt<AVTextExtraStruct> block) {
        o.LJIIIZ(block, "block");
        if (LJIJ(block)) {
            return true;
        }
        if (this.LJIIIZ == null && (block instanceof C41512GQy)) {
            AbstractC41508GQu abstractC41508GQu = (AbstractC41508GQu) block;
            LJIIZILJ(abstractC41508GQu);
            C41512GQy c41512GQy = (C41512GQy) abstractC41508GQu;
            GRD grd = GRD.COMMENT;
            o.LJIIIZ(grd, "<set-?>");
            c41512GQy.LJIIJ = grd;
            this.LJIIIZ = c41512GQy;
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unexpected text block, type: ");
        LIZ.append(C16880lQ.LJLLJ(block.getClass()));
        LIZ.append(", reference=");
        LIZ.append(block);
        AbstractC41508GQu.LJJIIZ("ReplyCommentChainTextBlock", X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final void LJIILJJIL(String blockId) {
        o.LJIIIZ(blockId, "blockId");
        super.LJIILJJIL(blockId);
        C41512GQy c41512GQy = this.LJIIIZ;
        if (c41512GQy != null) {
            LJJII(c41512GQy);
        } else {
            o.LJIJI("mentionUserTextBlock");
            throw null;
        }
    }

    @Override // X.AbstractC41508GQu
    public final AVTextExtraStruct LJIJI(AqS157S0100000_7 aqS157S0100000_7) {
        return AVTextExtraStructHelper.createCommentChainBoundaryStruct((String) aqS157S0100000_7.invoke());
    }

    @Override // X.AbstractC41508GQu
    public final void LJIJJ(CharSequence[] charSequenceArr) {
        super.LJIJJ(charSequenceArr);
        C41512GQy c41512GQy = this.LJIIIZ;
        if (c41512GQy != null) {
            AbstractC41508GQu.LJJIII(charSequenceArr, c41512GQy);
        } else {
            o.LJIJI("mentionUserTextBlock");
            throw null;
        }
    }

    @Override // X.AbstractC41508GQu
    public final void LJIJJLI(CharSequence[] charSequenceArr) {
        super.LJIJJLI(charSequenceArr);
        C41512GQy c41512GQy = this.LJIIIZ;
        if (c41512GQy != null) {
            AbstractC41508GQu.LJJIIJZLJL(charSequenceArr, c41512GQy);
        } else {
            o.LJIJI("mentionUserTextBlock");
            throw null;
        }
    }

    @Override // X.AbstractC41508GQu
    public final void LJJIFFI(GRT renderContext, CharSequence[] charSequenceArr) {
        o.LJIIIZ(renderContext, "renderContext");
        super.LJJIFFI(renderContext, charSequenceArr);
        C41512GQy c41512GQy = this.LJIIIZ;
        if (c41512GQy != null) {
            AbstractC41508GQu.LJJI(charSequenceArr, renderContext, c41512GQy);
        } else {
            o.LJIJI("mentionUserTextBlock");
            throw null;
        }
    }
}
