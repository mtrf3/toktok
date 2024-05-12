package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.GQv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41509GQv extends AbstractC41508GQu {
    public final String LJIIIZ;
    public final C41506GQs LJIIJ;
    public String LJIIJJI;

    @Override // X.AbstractC41507GQt
    public final GRF<AVTextExtraStruct> LJII() {
        return new C41510GQw(this);
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final String LJIILL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        String str = this.LJIIJJI;
        if (str != null) {
            LIZ.append(str);
            return X1D.LIZIZ(LIZ);
        }
        o.LJIJI("displayName");
        throw null;
    }

    @Override // X.AbstractC41507GQt
    public final String LJFF() {
        return "v";
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final CharSequence LJIIIZ(CharSequence editorText) {
        o.LJIIIZ(editorText, "editorText");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        String str = this.LJIIJJI;
        if (str != null) {
            LIZ.append(str);
            return AbstractC41508GQu.LJIL(X1D.LIZIZ(LIZ));
        }
        o.LJIJI("displayName");
        throw null;
    }

    public C41509GQv(int i, int i2, String str, C41506GQs c41506GQs) {
        super(i, i2, i2 - i);
        this.LJIIIZ = str;
        this.LJIIJ = c41506GQs;
    }
}
