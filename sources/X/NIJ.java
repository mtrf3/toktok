package X;

import Y.IDDListenerS149S0100000_10;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, OpenBAPolicyWebViewEvent params) {
        boolean z;
        boolean z2;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(params, "params");
        if (!(context instanceof ActivityC45651qj)) {
            C78983UzD.LJIILL("slotGate's context is not FragmentActivity");
            return;
        }
        String url = params.schema;
        String title = params.title;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        String host = UriProtector.parse(url).getHost();
        if (title.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C59075NGl c59075NGl = new C59075NGl(context, url, z);
        C235119Kp c235119Kp = new C235119Kp();
        if (title.length() > 0 && host != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = title;
            c9kf.LIZLLL = host;
            c235119Kp.LIZJ = c9kf;
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS160S0100000_10(c59075NGl, 474));
        c235119Kp.LIZIZ(LIZJ);
        if (title.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c235119Kp.LIZLLL = z2;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = c59075NGl;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (C60996Nwm.LIZJ(context) * 0.73d);
        tuxSheet2.LJLLJ = false;
        tuxSheet2.LJZL = true;
        tuxSheet2.LLD = false;
        tuxSheet2.LJLILLLLZI = new IDDListenerS149S0100000_10(c59075NGl, 3);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "demo");
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59075NGl.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r3 = 1
            java.lang.String r2 = "during_live"
            java.lang.String r1 = "before_live"
            switch(r0) {
                case -1884023019: goto Ld;
                case -1095106132: goto L16;
                case -522623958: goto L2b;
                case 387613079: goto L1d;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            java.lang.String r0 = "during_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L32
            goto Lc
        L16:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L25
            goto Lc
        L1d:
            java.lang.String r0 = "before_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lc
        L25:
            if (r4 >= r3) goto Lc
            X.NIL.LIZIZ(r5, r6, r7, r1)
            goto Lc
        L2b:
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L32
            goto Lc
        L32:
            if (r4 >= r3) goto Lc
            X.NIL.LIZIZ(r5, r6, r7, r2)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIJ.LIZJ(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            java.lang.String r2 = "during_live"
            java.lang.String r1 = "before_live"
            switch(r0) {
                case -1884023019: goto Lc;
                case -1095106132: goto L15;
                case -522623958: goto L2b;
                case 387613079: goto L1c;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            java.lang.String r0 = "during_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L32
            goto Lb
        L15:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L24
            goto Lb
        L1c:
            java.lang.String r0 = "before_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
        L24:
            r0 = 1
            if (r3 >= r0) goto Lb
            X.NIL.LIZ(r4, r5, r6, r7, r1)
            goto Lb
        L2b:
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L32
            goto Lb
        L32:
            X.NIL.LIZ(r4, r5, r6, r7, r2)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIJ.LIZIZ(int, int, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
