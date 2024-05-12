package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Olr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62867Olr implements InterfaceC65753PrJ<DonateResponse> {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ DialogC111054Xl LIZJ;
    public final /* synthetic */ Bundle LIZLLL;
    public final /* synthetic */ Fragment LJ;
    public final /* synthetic */ int LJFF;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        V1B.LJLILLLLZI(this.LIZJ);
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIZ(this.LIZ.getString(R.string.pei));
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (android.text.TextUtils.equals(r1, "PERCENT") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r14 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r14 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    @Override // X.InterfaceC65753PrJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.aweme.donation.DonateResponse r14) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.donation.DonateResponse r14 = (com.ss.android.ugc.aweme.donation.DonateResponse) r14
            r1 = 0
            if (r14 == 0) goto L5c
            com.ss.android.ugc.aweme.donation.NgoStruct r0 = r14.ngo
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.donationLink
            if (r0 == 0) goto L53
            if (r14 == 0) goto L5c
            com.ss.android.ugc.aweme.donation.NgoStruct r0 = r14.ngo
            if (r0 == 0) goto L5c
            java.lang.String r3 = r0.donationLink
        L15:
            com.ss.android.ugc.aweme.donation.NgoStruct r0 = r14.ngo
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.orgType
            if (r0 == 0) goto L60
            if (r14 == 0) goto L25
            com.ss.android.ugc.aweme.donation.NgoStruct r0 = r14.ngo
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.orgType
        L25:
            java.lang.String r4 = "PERCENT"
            boolean r0 = android.text.TextUtils.equals(r1, r4)
            if (r0 == 0) goto L60
        L2d:
            boolean r0 = X.C78685UuP.LJJJZ(r3)
            if (r0 == 0) goto L4d
        L34:
            android.app.Activity r0 = r13.LIZ
            java.lang.String r1 = r13.LIZIZ
            r2 = 3
            java.lang.String r5 = "{}"
            X.4Xl r6 = r13.LIZJ
            X.GsM r7 = new X.GsM
            android.os.Bundle r10 = r13.LIZLLL
            androidx.fragment.app.Fragment r11 = r13.LJ
            int r8 = r13.LJFF
            r9 = r0
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            X.C3AP.LIZ(r0, r1, r2, r3, r4, r5, r6, r7)
        L4d:
            X.4Xl r0 = r13.LIZJ
            X.V1B.LJLILLLLZI(r0)
            return
        L53:
            if (r14 == 0) goto L5c
        L55:
            com.ss.android.ugc.aweme.donation.NgoStruct r0 = r14.ngo
            if (r0 == 0) goto L5c
            java.lang.String r3 = r0.orgId
            goto L15
        L5c:
            r3 = r1
            if (r14 == 0) goto L60
            goto L15
        L60:
            java.lang.String r4 = "TILTIFY"
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62867Olr.onSuccess(java.lang.Object):void");
    }

    public C62867Olr(ActivityC45651qj activityC45651qj, String str, DialogC111054Xl dialogC111054Xl, Bundle bundle, Fragment fragment, int i) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZJ = dialogC111054Xl;
        this.LIZLLL = bundle;
        this.LJ = fragment;
        this.LJFF = i;
    }
}
