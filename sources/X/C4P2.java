package X;

import com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.4P2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4P2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        return !C4P3.LIZ().getUseNewPanelStyle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC62492Ofo LIZ(java.lang.String r2) {
        /*
            if (r2 == 0) goto L53
            int r1 = r2.hashCode()
            r0 = -326696768(0xffffffffec8700c0, float:-1.3056682E27)
            if (r1 == r0) goto L24
            r0 = 403708324(0x181019a4, float:1.8624509E-24)
            if (r1 == r0) goto L3b
        L10:
            com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig r0 = X.C4P1.LIZ()
            int r1 = r0.getOrientation()
            X.Ofo r2 = X.EnumC62492Ofo.VERTICAL
            int r0 = r2.ordinal()
            if (r1 != r0) goto L21
        L20:
            return r2
        L21:
            X.Ofo r2 = X.EnumC62492Ofo.HORIZONTAL
            goto L51
        L24:
            java.lang.String r0 = "long_press"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            X.Ofo[] r1 = X.EnumC62492Ofo.values()
            com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig r0 = X.C4P1.LIZ()
            int r0 = r0.getOrientationInLongPress()
            r2 = r1[r0]
            goto L51
        L3b:
            java.lang.String r0 = "share_panel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            X.Ofo[] r1 = X.EnumC62492Ofo.values()
            com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig r0 = X.C4P1.LIZ()
            int r0 = r0.getOrientationInShare()
            r2 = r1[r0]
        L51:
            if (r2 != 0) goto L20
        L53:
            com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig r0 = X.C4P1.LIZ()
            int r1 = r0.getOrientation()
            X.Ofo r2 = X.EnumC62492Ofo.VERTICAL
            int r0 = r2.ordinal()
            if (r1 != r0) goto L64
            goto L20
        L64:
            X.Ofo r2 = X.EnumC62492Ofo.HORIZONTAL
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4P2.LIZ(java.lang.String):X.Ofo");
    }

    public static final int LIZIZ(String str) {
        IMUIConfig LIZ2 = C4P1.LIZ();
        if (o.LJ(str, "long_press")) {
            return LIZ2.getUndoStyleInLongPress();
        }
        return LIZ2.getUndoStyleInShare();
    }
}
