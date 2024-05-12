package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.M8w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56330M8w {
    public final Object LIZ;

    public /* synthetic */ C56330M8w(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r0 = X.F9J.LIZIZ(r1, 0, "google_ads_flags");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x001d, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x001f, code lost:
    
        r1 = X.EY9.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0023, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56330M8w(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r4 = 3
            if (r7 == r4) goto L4a
            r5.<init>()
            r3 = 0
            boolean r0 = X.C52313Kg1.LIZ     // Catch: java.lang.Throwable -> L47
            r2 = 0
            if (r0 == 0) goto L26
            android.content.Context r1 = X.C16880lQ.LLLLL(r6)     // Catch: java.lang.Throwable -> L26
        L10:
            boolean r0 = r1 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1d
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch: java.lang.Throwable -> L26
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L10
            goto L26
        L1d:
            if (r1 == 0) goto L26
            android.content.Context r1 = X.EY9.LIZ(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L26
            goto L3e
        L26:
            boolean r0 = X.C52921Kpp.LIZ     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "com.google.android.gms"
            if (r0 == 0) goto L35
            android.content.Context r1 = r6.createPackageContext(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L47
            goto L3a
        L31:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L47
        L35:
            android.content.Context r1 = r6.createPackageContext(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3c java.lang.Throwable -> L47
        L3a:
            if (r1 != 0) goto L3e
        L3c:
            r0 = r3
            goto L44
        L3e:
            java.lang.String r0 = "google_ads_flags"
            android.content.SharedPreferences r0 = X.F9J.LIZIZ(r1, r2, r0)     // Catch: java.lang.Throwable -> L47
        L44:
            r5.LIZ = r0     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5.LIZ = r3
        L49:
            return
        L4a:
            r5.<init>()
            if (r6 == 0) goto L52
            r5.LIZ = r6
            return
        L52:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context must not be null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56330M8w.<init>(android.content.Context, int):void");
    }

    public /* synthetic */ C56330M8w(ViewStub viewStub, boolean z, boolean z2) {
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.uc);
            viewStub.setInflatedId(R.id.ahu);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.tools.tcm.publish.view.BCInPublishBannerLayout");
            this.LIZ = inflate;
        } else {
            this.LIZ = viewStub.findViewById(R.id.ahu);
        }
        GTE gte = (GTE) this.LIZ;
        if (gte != null) {
            gte.setCommerceMusic(z);
        }
        GTE gte2 = (GTE) this.LIZ;
        if (gte2 != null) {
            gte2.setMusicUsageOrigin(z2);
        }
        View view = (View) this.LIZ;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }
}
