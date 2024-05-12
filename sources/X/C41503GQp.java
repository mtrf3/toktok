package X;

import android.text.Spannable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import defpackage.i0;
import defpackage.q;
import java.util.Map;
import ujb.o;

/* renamed from: X.GQp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41503GQp extends AbstractC41508GQu {
    public String LJIIIZ;
    public final C62822Ol8 LJIIJ;

    @Override // X.AbstractC41507GQt
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final String LJIILL() {
        String str = this.LJIIIZ;
        for (Map.Entry entry : ((java.util.Map) this.LJIIJ.getValue()).entrySet()) {
            str = o.LJJJJZ(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    @Override // X.AbstractC41507GQt
    public final String LJFF() {
        return "";
    }

    @Override // X.AbstractC41507GQt
    public final boolean LIZJ(AbstractC41507GQt<AVTextExtraStruct> block) {
        kotlin.jvm.internal.o.LJIIIZ(block, "block");
        if (block instanceof C41503GQp) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJIIIZ);
            LIZ.append(((C41503GQp) block).LJIIIZ);
            this.LJIIIZ = X1D.LIZIZ(LIZ);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC41508GQu, X.AbstractC41507GQt
    public final Spannable LJIILIIL(GRT renderContext) {
        kotlin.jvm.internal.o.LJIIIZ(renderContext, "renderContext");
        return renderContext.LIZ(this).LIZ(renderContext, this);
    }

    @Override // X.AbstractC41507GQt
    public final String LJIILLIIL(CharSequence editorText) {
        kotlin.jvm.internal.o.LJIIIZ(editorText, "editorText");
        int length = this.LJIIIZ.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            char charAt = this.LJIIIZ.charAt(i);
            if (charAt == '<') {
                str = i0.LJFF(str, "&lt;");
            } else if (charAt == '>') {
                str = i0.LJFF(str, "&gt;");
            } else if (charAt == '&') {
                str = i0.LJFF(str, "&amp;");
            } else if (charAt == '\n') {
                StringBuilder LJFF = C72972SkS.LJFF(str, '<');
                str = q.LIZIZ(LJFF, "br", '>', LJFF);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(this.LJIIIZ.charAt(i));
                str = X1D.LIZIZ(LIZ);
            }
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41503GQp(int i, int i2, CharSequence initialCharacters) {
        super(i, i2, i2 - i);
        kotlin.jvm.internal.o.LJIIIZ(initialCharacters, "initialCharacters");
        this.LJIIIZ = initialCharacters.toString();
        this.LJIIJ = C221108m2.LIZIZ(C41502GQo.LJLIL);
    }
}
