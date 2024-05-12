package X;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.o;

/* renamed from: X.MqO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58052MqO implements InterfaceC29937Boz {
    public final /* synthetic */ C58049MqL LIZ;
    public final /* synthetic */ C58055MqR LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C57749MlV LIZLLL;

    public C58052MqO(C58049MqL c58049MqL, C58055MqR c58055MqR, String str, C57749MlV c57749MlV) {
        this.LIZ = c58049MqL;
        this.LIZIZ = c58055MqR;
        this.LIZJ = str;
        this.LIZLLL = c57749MlV;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        C58049MqL c58049MqL;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.hashCode());
        LIZ.append(" complete");
        C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ));
        if (this.LIZIZ.LJII && (spannableStringBuilder = (c58049MqL = this.LIZ).LJLZ) != null) {
            String signature = this.LIZJ;
            C57749MlV c57749MlV = this.LIZLLL;
            synchronized (C58062MqY.LIZ) {
                o.LJIIIZ(signature, "signature");
                C58062MqY.LIZIZ.LIZJ(signature, spannableStringBuilder);
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("CACHE STORE [", signature, "] [");
            C57742MlO c57742MlO = c57749MlV.LIZ;
            if (c57742MlO != null) {
                str = c57742MlO.LJLIL;
            } else {
                str = null;
            }
            LIZIZ.append(str);
            LIZIZ.append("] [");
            LIZIZ.append(c58049MqL.hashCode());
            LIZIZ.append(']');
            C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZIZ));
        }
    }
}
