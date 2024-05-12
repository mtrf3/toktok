package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.EYj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36609EYj implements InterfaceC36613EYn {
    public InterfaceC36612EYm LIZ;
    public java.util.Map<String, List<String>> LIZIZ;

    public final void LIZ(C36608EYi c36608EYi) {
        if (c36608EYi.LIZIZ != null && TextUtils.equals("200", c36608EYi.LIZ)) {
            InterfaceC36612EYm interfaceC36612EYm = this.LIZ;
            if (interfaceC36612EYm != null) {
                c36608EYi.LIZJ = this.LIZIZ;
                interfaceC36612EYm.LIZ(c36608EYi);
                return;
            }
            return;
        }
        InterfaceC36612EYm interfaceC36612EYm2 = this.LIZ;
        if (interfaceC36612EYm2 == null) {
            return;
        }
        interfaceC36612EYm2.LIZIZ(c36608EYi);
    }
}
