package X;

import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import kotlin.jvm.internal.o;

/* renamed from: X.adq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94242adq implements InterfaceC1555668q {
    public final /* synthetic */ C93566aSw LIZ;

    public C94242adq(C93566aSw c93566aSw) {
        this.LIZ = c93566aSw;
    }

    @Override // X.InterfaceC1555668q
    public final void LIZ(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        this.LIZ.LIZJ(textFontStyleData);
        C68M.LJIIJ().LJIJJLI(this.LIZ.getScene(), textFontStyleData.fileName);
        C94441ah3 c94441ah3 = this.LIZ.LJLILLLLZI;
        if (c94441ah3 != null) {
            c94441ah3.setFontType(C68M.LJIIJ().LJ(this.LIZ.getScene()));
            C93566aSw c93566aSw = this.LIZ;
            C94441ah3 c94441ah32 = c93566aSw.LJLILLLLZI;
            if (c94441ah32 != null) {
                c94441ah32.LJI(c93566aSw.LJLJJLL, c93566aSw.LJLJLLL);
                if (this.LIZ.getScene() == 0) {
                    int i = textFontStyleData.fontSize;
                    if (i > 0) {
                        C94441ah3 c94441ah33 = this.LIZ.LJLILLLLZI;
                        if (c94441ah33 != null) {
                            c94441ah33.setFontSize(i);
                        } else {
                            o.LJIJI("simpleEditText");
                            throw null;
                        }
                    } else {
                        C94441ah3 c94441ah34 = this.LIZ.LJLILLLLZI;
                        if (c94441ah34 != null) {
                            c94441ah34.setFontSize(28);
                        } else {
                            o.LJIJI("simpleEditText");
                            throw null;
                        }
                    }
                }
                InterfaceC139695e1 interfaceC139695e1 = this.LIZ.LL;
                if (interfaceC139695e1 != null) {
                    C139685e0.LIZIZ(interfaceC139695e1, textFontStyleData, 0, "text", null, false, 24);
                    return;
                }
                return;
            }
            o.LJIJI("simpleEditText");
            throw null;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }
}
