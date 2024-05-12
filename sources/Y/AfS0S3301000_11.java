package Y;

import X.C68972R5c;
import X.C69084R9k;
import X.C69093R9t;
import X.C69099R9z;
import X.C85649XjR;
import X.EnumC69113RAn;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.RC2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS0S3301000_11 implements InterfaceC64592gB {
    public final int $t;
    public int i6;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S3301000_11 afS0S3301000_11, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C69099R9z.LIZIZ(1, afS0S3301000_11.i6, c69084R9k.getErrorCode(), c69084R9k.getMessage(), afS0S3301000_11.s0);
        EnumC69113RAn enumC69113RAn = (EnumC69113RAn) afS0S3301000_11.l3;
        if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_SIGN_UP) {
            RC2.LIZ(Integer.valueOf(c69084R9k.getErrorCode()), ((InterfaceC69056R8i) afS0S3301000_11.l4).q9().LJJLIIIJLLLLLLLZ(), "phone");
        } else if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_LOGIN) {
            C85649XjR.LIZ(false, ((InterfaceC69056R8i) afS0S3301000_11.l4).q9().LJJLIIIJLLLLLLLZ(), null, 0, null, 28);
        }
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS0S3301000_11.l4).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS0S3301000_11.l4).q9().LJJLIIIJLLLLLLLZ();
        String LLZZ = ((InterfaceC69056R8i) afS0S3301000_11.l4).q9().LLZZ();
        int errorCode = c69084R9k.getErrorCode();
        String str2 = afS0S3301000_11.s1;
        int i = afS0S3301000_11.i6;
        String errorMsg = c69084R9k.getErrorMsg();
        String str3 = afS0S3301000_11.s2;
        Bundle arguments = ((Fragment) afS0S3301000_11.l5).getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        C68972R5c.LJIIJ(LJJLIIIJJI, LJJLIIIJLLLLLLLZ, LLZZ, errorCode, str2, i, "text", errorMsg, str3, null, null, null, str, C69093R9t.LJIJ((EnumC69113RAn) afS0S3301000_11.l3), 11776);
    }

    public static final void accept$1(AfS0S3301000_11 afS0S3301000_11, Object obj) {
        String str;
        C69099R9z.LIZIZ(0, afS0S3301000_11.i6, 0, "", afS0S3301000_11.s0);
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS0S3301000_11.l3).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS0S3301000_11.l3).q9().LJJLIIIJLLLLLLLZ();
        String LLZZ = ((InterfaceC69056R8i) afS0S3301000_11.l3).q9().LLZZ();
        String str2 = afS0S3301000_11.s1;
        int i = afS0S3301000_11.i6;
        String str3 = afS0S3301000_11.s2;
        Bundle arguments = ((Fragment) afS0S3301000_11.l4).getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        C68972R5c.LJIIJ(LJJLIIIJJI, LJJLIIIJLLLLLLLZ, LLZZ, 0, str2, i, "text", null, str3, null, null, "phone", str, C69093R9t.LJIJ((EnumC69113RAn) afS0S3301000_11.l5), 9728);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S3301000_11(int r2, androidx.fragment.app.Fragment r3, X.EnumC69113RAn r4, X.InterfaceC69056R8i r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i6 = r2
            r0.s0 = r6
            r0.l3 = r5
            r0.s1 = r7
            r0.s2 = r8
            r0.l4 = r3
            r0.l5 = r4
        L14:
            r0.<init>()
            return
        L18:
            r0 = r1
            r0.i6 = r2
            r0.s0 = r6
            r0.l3 = r4
            r0.l4 = r5
            r0.s1 = r7
            r0.s2 = r8
            r0.l5 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S3301000_11.<init>(int, androidx.fragment.app.Fragment, X.RAn, X.R8i, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
