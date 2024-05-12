package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GQu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41508GQu extends AbstractC41507GQt<AVTextExtraStruct> {
    public int LJI;
    public EnumC35470Dw2 LJII;
    public final List<C41503GQp> LJIIIIZZ;

    public boolean LJJ() {
        return this instanceof GR0;
    }

    @Override // X.AbstractC41507GQt
    public String LJIILL() {
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = "";
        }
        LJIJJ(charSequenceArr);
        if (this.LJII == EnumC35470Dw2.LTR) {
            return ORY.LJJJJLL(charSequenceArr, "", null, null, null, 62);
        }
        return ORY.LJJJJLL(ORY.LJJLIIIIJ(charSequenceArr), "", null, null, null, 62);
    }

    public static String LJIL(CharSequence unescaped) {
        o.LJIIIZ(unescaped, "unescaped");
        String str = (String) unescaped;
        int length = str.length();
        String str2 = "";
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '<') {
                str2 = i0.LJFF(str2, "&lt;");
            } else if (charAt == '>') {
                str2 = i0.LJFF(str2, "&gt;");
            } else if (charAt == '&') {
                str2 = i0.LJFF(str2, "&amp;");
            } else if (charAt == '\n') {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append('<');
                LIZ.append("br");
                LIZ.append('>');
                str2 = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(str.charAt(i));
                str2 = X1D.LIZIZ(LIZ2);
            }
        }
        return str2;
    }

    @Override // X.AbstractC41507GQt
    public CharSequence LJIIIZ(CharSequence editorText) {
        o.LJIIIZ(editorText, "editorText");
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = "";
        }
        LJIJJLI(charSequenceArr);
        if (this.LJII == EnumC35470Dw2.LTR) {
            return ORY.LJJJJLL(charSequenceArr, "", null, null, null, 62);
        }
        return ORY.LJJJJLL(ORY.LJJLIIIIJ(charSequenceArr), "", null, null, null, 62);
    }

    @Override // X.AbstractC41507GQt
    public Spannable LJIILIIL(GRT renderContext) {
        o.LJIIIZ(renderContext, "renderContext");
        if (!LJIIJ()) {
            return super.LJIILIIL(renderContext);
        }
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            charSequenceArr[i3] = "";
        }
        LJJIFFI(renderContext, charSequenceArr);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
        if (this.LJII == EnumC35470Dw2.LTR) {
            while (i2 < i) {
                valueOf.append(charSequenceArr[i2]);
                i2++;
            }
        } else {
            Object[] LJJLIIIIJ = ORY.LJJLIIIIJ(charSequenceArr);
            int length = LJJLIIIIJ.length;
            while (i2 < length) {
                valueOf.append((CharSequence) LJJLIIIIJ[i2]);
                i2++;
            }
        }
        SpannableString valueOf2 = SpannableString.valueOf(valueOf);
        o.LJIIIIZZ(valueOf2, "valueOf(rendered)");
        return valueOf2;
    }

    @Override // X.AbstractC41507GQt
    public void LJIILJJIL(String blockId) {
        o.LJIIIZ(blockId, "blockId");
        this.LIZLLL = blockId;
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            LJJII((AbstractC41508GQu) it.next());
        }
    }

    public final void LJIIZILJ(AbstractC41508GQu textBlock) {
        o.LJIIIZ(textBlock, "textBlock");
        int i = this.LJI;
        this.LJI = i + 1;
        textBlock.LJ = i;
        textBlock.LIZIZ(this);
    }

    public final boolean LJIJ(AbstractC41507GQt<AVTextExtraStruct> block) {
        o.LJIIIZ(block, "block");
        if (block instanceof C41503GQp) {
            List<C41503GQp> list = this.LJIIIIZZ;
            int i = this.LJI;
            this.LJI = i + 1;
            block.LJ = i;
            ((ArrayList) list).add(block);
            block.LIZIZ(this);
            return true;
        }
        return false;
    }

    public AVTextExtraStruct LJIJI(AqS157S0100000_7 aqS157S0100000_7) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("plz implement boundary metadata generate logic for block type: ");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }

    public void LJIJJ(CharSequence[] charSequenceArr) {
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            LJJIII(charSequenceArr, (AbstractC41508GQu) it.next());
        }
    }

    public void LJIJJLI(CharSequence[] charSequenceArr) {
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            LJJIIJZLJL(charSequenceArr, (AbstractC41508GQu) it.next());
        }
    }

    public final void LJJII(AbstractC41508GQu block) {
        o.LJIIIZ(block, "block");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append('#');
        LIZ.append(block.LJ);
        block.LJIILJJIL(X1D.LIZIZ(LIZ));
    }

    public final void LJJIIJ(EnumC35470Dw2 direction) {
        o.LJIIIZ(direction, "direction");
        this.LJII = direction;
    }

    public static void LJJIII(CharSequence[] charSequenceArr, AbstractC41508GQu block) {
        o.LJIIIZ(block, "block");
        charSequenceArr[block.LJ] = block.LJIILL();
    }

    public static void LJJIIJZLJL(CharSequence[] charSequenceArr, AbstractC41508GQu block) {
        o.LJIIIZ(block, "block");
        charSequenceArr[block.LJ] = block.LJIILLIIL("");
    }

    public static void LJJIIZ(String str, String message) {
        o.LJIIIZ(message, "message");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ(str, message);
    }

    public void LJJIFFI(GRT renderContext, CharSequence[] charSequenceArr) {
        o.LJIIIZ(renderContext, "renderContext");
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            LJJI(charSequenceArr, renderContext, (AbstractC41508GQu) it.next());
        }
    }

    public AbstractC41508GQu(int i, int i2, int i3) {
        super(i, i2, i3);
        this.LJII = EnumC35470Dw2.LTR;
        this.LJIIIIZZ = new ArrayList();
    }

    public static void LJJI(CharSequence[] charSequenceArr, GRT renderContext, AbstractC41508GQu block) {
        o.LJIIIZ(renderContext, "renderContext");
        o.LJIIIZ(block, "block");
        charSequenceArr[block.LJ] = block.LJIILIIL(renderContext);
    }
}
