package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GR9 extends AbstractC41508GQu {
    public String LJIIIZ;

    @Override // X.AbstractC41507GQt
    public final GRF<AVTextExtraStruct> LJII() {
        return new GRA(this);
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final String LJIILL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('#');
        String str = this.LJIIIZ;
        if (str != null) {
            LIZ.append(str);
            return X1D.LIZIZ(LIZ);
        }
        o.LJIJI("hashtagName");
        throw null;
    }

    @Override // X.AbstractC41507GQt
    public final String LJFF() {
        return "h";
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final CharSequence LJIIIZ(CharSequence editorText) {
        o.LJIIIZ(editorText, "editorText");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('#');
        String str = this.LJIIIZ;
        if (str != null) {
            LIZ.append(str);
            return X1D.LIZIZ(LIZ);
        }
        o.LJIJI("hashtagName");
        throw null;
    }

    public GR9(int i, int i2) {
        super(i, i2, i2 - i);
    }
}
