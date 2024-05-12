package X;

import android.text.Spannable;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GQt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41507GQt<METADATA> {
    public final int LIZ;
    public final int LIZIZ;
    public AbstractC41507GQt<METADATA> LIZJ;
    public String LIZLLL;
    public int LJ;
    public final GRE LJFF;

    public boolean LIZJ(AbstractC41507GQt<METADATA> block) {
        o.LJIIIZ(block, "block");
        return false;
    }

    public String LIZLLL(String str, AbstractC41507GQt<METADATA> textBlock) {
        o.LJIIIZ(textBlock, "textBlock");
        return str;
    }

    public String LJFF() {
        return "";
    }

    public boolean LJIIJ() {
        return this instanceof GR0;
    }

    public boolean LJIIJJI() {
        return true;
    }

    public boolean LJIIL() {
        return !(this instanceof GR0);
    }

    public abstract String LJIILL();

    public final CharSequence LJ() {
        if (this.LIZLLL != null) {
            return LJIIIIZZ();
        }
        return null;
    }

    public final String LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("myBlockId");
        throw null;
    }

    public final List<METADATA> LJI() {
        return LJII().LIZ();
    }

    public GRF<METADATA> LJII() {
        return this.LJFF;
    }

    public final boolean LIZ(AbstractC41507GQt<METADATA> block) {
        o.LJIIIZ(block, "block");
        if (!LJIIJ()) {
            return false;
        }
        return LIZJ(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(AbstractC41507GQt<METADATA> parent) {
        o.LJIIIZ(parent, "parent");
        if (this.LIZJ == null) {
            this.LIZJ = parent;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("this text block already has a parent, it's ");
        LIZ.append(this.LIZJ);
        LIZ.append(", but trying to reset its parent to ");
        LIZ.append(parent);
        throw new GB5(X1D.LIZIZ(LIZ), null, 2, 0 == true ? 1 : 0);
    }

    public CharSequence LJIIIZ(CharSequence editorText) {
        o.LJIIIZ(editorText, "editorText");
        return editorText.subSequence(this.LIZ, this.LIZIZ);
    }

    public Spannable LJIILIIL(GRT renderContext) {
        o.LJIIIZ(renderContext, "renderContext");
        return renderContext.LIZ(this).LIZ(renderContext, this);
    }

    public void LJIILJJIL(String blockId) {
        o.LJIIIZ(blockId, "blockId");
        this.LIZLLL = blockId;
    }

    public String LJIILLIIL(CharSequence editorText) {
        String str;
        o.LJIIIZ(editorText, "editorText");
        String LJFF = LJFF();
        CharSequence LJIIIZ = LJIIIZ(editorText);
        CharSequence LJ = LJ();
        if (LJ == null || (str = LJ.toString()) == null) {
            str = "";
        }
        String LIZLLL = LIZLLL(str, this);
        boolean z = false;
        if (LJFF.length() == 0) {
            return LJIIIZ.toString();
        }
        if (LIZLLL.length() > 0) {
            z = true;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('<');
            LIZ.append(LJFF);
            LIZ.append(" id=\"");
            LIZ.append(LIZLLL);
            LIZ.append("\">");
            LIZ.append((Object) LJIIIZ);
            LIZ.append("</");
            LIZ.append(LJFF);
            LIZ.append('>');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('<');
        LIZ2.append(LJFF);
        LIZ2.append('>');
        LIZ2.append((Object) LJIIIZ);
        LIZ2.append("</");
        return q.LIZIZ(LIZ2, LJFF, '>', LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC41507GQt(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i3 >= 0) {
            this.LJFF = new GRE();
        } else {
            throw new GB5(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
