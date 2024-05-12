package X;

import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.GRs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41532GRs {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, InterfaceC45930I0w interfaceC45930I0w) {
        String str;
        String string = context.getResources().getString(R.string.jdk);
        String str2 = null;
        if (interfaceC45930I0w != null) {
            str = interfaceC45930I0w.getShortId();
            str2 = interfaceC45930I0w.getUniqueId();
            interfaceC45930I0w.getNickname();
        } else {
            str = null;
        }
        String charSequence = context.getResources().getText(R.string.bri).toString();
        StringBuilder LIZJ = b1.LIZJ(string, " - @");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            charSequence = str;
        }
        LIZJ.append(charSequence);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "fakeMusicText(context.re…ing.app_name).toString())");
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.InterfaceC45930I0w r2, android.content.res.Resources r3) {
        /*
            com.ss.android.ugc.aweme.friends.service.IFriendsService r0 = com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl.LJJJJ()
            boolean r0 = r0.LJIJJ()
            r1 = 0
            if (r0 == 0) goto L25
            if (r2 == 0) goto L19
            java.lang.String r1 = r2.getNickname()
        L11:
            if (r1 == 0) goto L19
        L13:
            int r0 = r1.length()
            if (r0 != 0) goto L24
        L19:
            r0 = 2131823951(0x7f110d4f, float:1.9280716E38)
            java.lang.CharSequence r0 = r3.getText(r0)
            java.lang.String r1 = r0.toString()
        L24:
            return r1
        L25:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            r0.getRegionService()
            java.lang.Boolean r0 = X.C44296Ha0.LIZIZ()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L59
            if (r2 == 0) goto L3c
            java.lang.String r1 = r2.getUniqueId()
        L3c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L52
            if (r2 == 0) goto L4a
            java.lang.String r0 = r2.getShortId()
            if (r0 != 0) goto L4d
        L4a:
            java.lang.String r1 = ""
            goto L13
        L4d:
            java.lang.String r1 = r2.getShortId()
            goto L11
        L52:
            if (r2 == 0) goto L19
            java.lang.String r1 = r2.getUniqueId()
            goto L11
        L59:
            if (r2 == 0) goto L19
            java.lang.String r1 = r2.getNickname()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41532GRs.LIZIZ(X.I0w, android.content.res.Resources):java.lang.String");
    }
}
