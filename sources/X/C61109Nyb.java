package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61109Nyb extends AbstractC61106NyY {
    public final /* synthetic */ Activity LIZIZ;

    public C61109Nyb(Activity activity) {
        this.LIZIZ = activity;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (C61184Nzo.LIZ.LJFF(this.LIZIZ) == 0) {
            if (c61101NyT != null) {
                c61101NyT.LIZ();
            }
        } else {
            if (c61101NyT == null) {
                return;
            }
            c61101NyT.LIZIZ();
        }
    }
}
