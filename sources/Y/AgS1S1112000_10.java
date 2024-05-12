package Y;

import X.ActivityC86117Xqz;
import X.C10I;
import X.C10K;
import X.C62114OZi;
import X.C78598Ut0;
import X.FCD;
import X.FMX;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.CQrcodeService;

/* loaded from: classes11.dex */
public class AgS1S1112000_10 implements C10I {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C10I
    public final Object then(C10K<String> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS1S1112000_10 agS1S1112000_10, C10K c10k) {
        String str = (String) c10k.LJIIJJI();
        if (!TextUtils.isEmpty(str) && str.startsWith("tt_deeplink:")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(str.replace("tt_deeplink:", "")));
            if (FCD.LJ(((C62114OZi) agS1S1112000_10.l1).LIZ, intent)) {
                ActivityC86117Xqz activityC86117Xqz = ((C62114OZi) agS1S1112000_10.l1).LIZ;
                C78598Ut0.LJIJJ(intent, activityC86117Xqz);
                activityC86117Xqz.startActivity(intent);
                FMX.onEventV3("deeplink_preview_success");
            } else {
                FMX.onEventV3("deeplink_preview_error_toast_show");
                CQrcodeService.LIZLLL().LIZ(((C62114OZi) agS1S1112000_10.l1).LIZ);
                ((C62114OZi) agS1S1112000_10.l1).LIZ.finish();
            }
            return null;
        }
        C62114OZi c62114OZi = (C62114OZi) agS1S1112000_10.l1;
        boolean z = agS1S1112000_10.z2;
        c62114OZi.LIZ(agS1S1112000_10.i3, agS1S1112000_10.i4, agS1S1112000_10.s0, str, z);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$1(Y.AgS1S1112000_10 r12, X.C10K r13) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS1S1112000_10.then$1(Y.AgS1S1112000_10, X.10K):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AgS1S1112000_10(int r2, int r3, X.C62114OZi r4, java.lang.String r5, boolean r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r4
            r0.i3 = r2
            r0.i4 = r3
            r0.s0 = r5
            r0.z2 = r6
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l1 = r4
            r0.z2 = r6
            r0.i3 = r2
            r0.s0 = r5
            r0.i4 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS1S1112000_10.<init>(int, int, X.OZi, java.lang.String, boolean, int):void");
    }
}
