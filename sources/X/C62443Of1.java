package X;

import Y.ACallableS37S1100000_10;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Of1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62443Of1 {
    public static String LIZ = "share_panel";
    public static String LIZIZ = "";

    public static final void LIZJ(Aweme aweme, String str) {
        if (aweme == null || C44938HkM.LIZIZ()) {
            return;
        }
        C10K.LIZJ(new ACallableS37S1100000_10(aweme, str, 2));
    }

    public static final void LIZ(Aweme aweme, String str, boolean z) {
        AwemeACLStruct.ACLCommonStruct aclCommonStruct = AwemeACLStruct.LIZ();
        o.LJIIIZ(aclCommonStruct, "aclCommonStruct");
        aclCommonStruct.setCode(0);
        aclCommonStruct.setShowType(2);
        aclCommonStruct.setToastMsg("");
        aclCommonStruct.setExtra("");
        if (z) {
            return;
        }
        AwemeACLStruct.LIZ().setShowType(0);
        AwemeACLStruct.LIZ().setCode(1);
        LIZ = "long_press_download";
        LIZJ(aweme, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C62394OeE r6, java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r1 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            java.lang.String r0 = "aclCommonStruct"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r5 = 0
            r1.setCode(r5)
            r3 = 2
            r1.setShowType(r3)
            java.lang.String r0 = ""
            r1.setToastMsg(r0)
            r1.setExtra(r0)
            java.lang.String r0 = "share_panel"
            X.C62443Of1.LIZ = r0
            java.util.List<X.Ofi> r0 = r6.LIZJ
            java.util.Iterator r6 = r0.iterator()
        L23:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r4 = r6.next()
            X.Ofi r4 = (X.InterfaceC62486Ofi) r4
            java.lang.String r1 = r4.key()
            java.lang.String r0 = "download"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r2 = 1
            if (r0 != 0) goto L48
            java.lang.String r1 = r4.key()
            java.lang.String r0 = "save"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L6b
        L48:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setCode(r5)
            boolean r0 = r4.enable()
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setShowType(r3)
        L5d:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            int r0 = r0.getShowType()
            if (r0 != 0) goto L6a
            LIZJ(r8, r7)
        L6a:
            return
        L6b:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setShowType(r5)
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setCode(r2)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62443Of1.LIZIZ(X.OeE, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
