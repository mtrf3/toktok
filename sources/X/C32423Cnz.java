package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32423Cnz implements InterfaceC64518PTu {
    public final java.util.Map<String, Long> LIZ = new LinkedHashMap();
    public final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r9 = r1.getResourceFormat(r16.getResourceRequest().LJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r9 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r13 = r1.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        X.C15610jN.LIZ().postDelayed(new X.RunnableC32422Cny(r16, r15, r6, r7, r9, r10, r11, r12, r13), 100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r9 = "unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r10 != null) goto L45;
     */
    @Override // X.InterfaceC64518PTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C32425Co1 r16) {
        /*
            r15 = this;
            java.lang.String r0 = "t"
            r4 = r16
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.2zl r6 = new X.2zl     // Catch: org.json.JSONException -> La9
            r6.<init>()     // Catch: org.json.JSONException -> La9
            r0 = -1
            r6.element = r0     // Catch: org.json.JSONException -> La9
            boolean r0 = r4 instanceof X.C32428Co4     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L2e
            r0 = 1
            r6.element = r0     // Catch: org.json.JSONException -> La9
        L16:
            X.Cnw r0 = r4.getResourceRequest()     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L2b
            long r7 = r0.LIZLLL     // Catch: org.json.JSONException -> La9
        L1e:
            long r0 = r4.getResourceId()     // Catch: org.json.JSONException -> La9
            com.bytedance.android.livesdk.gift.assets.AssetsModel r1 = X.C32341Cmf.LIZIZ(r0)     // Catch: org.json.JSONException -> La9
            if (r1 == 0) goto L54
            int r12 = r1.resourceType     // Catch: org.json.JSONException -> La9
            goto L55
        L2b:
            r7 = -1
            goto L1e
        L2e:
            boolean r0 = r4 instanceof X.C32430Co6     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L36
            r0 = 2
            r6.element = r0     // Catch: org.json.JSONException -> La9
            goto L16
        L36:
            boolean r0 = r4 instanceof X.C32426Co2     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L3e
            r0 = 3
            r6.element = r0     // Catch: org.json.JSONException -> La9
            goto L16
        L3e:
            boolean r0 = r4 instanceof X.C32427Co3     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L46
            r0 = 4
            r6.element = r0     // Catch: org.json.JSONException -> La9
            goto L16
        L46:
            boolean r0 = r4 instanceof X.C32429Co5     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L16
            r0 = r4
            X.Co5 r0 = (X.C32429Co5) r0     // Catch: org.json.JSONException -> La9
            int r0 = r0.getErrorCode()     // Catch: org.json.JSONException -> La9
            r6.element = r0     // Catch: org.json.JSONException -> La9
            goto L16
        L54:
            r12 = -1
        L55:
            java.lang.String r3 = ""
            if (r1 == 0) goto L5a
            goto L5e
        L5a:
            r11 = r3
            if (r1 == 0) goto L80
            goto L78
        L5e:
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r1.resourceModel     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L5a
            java.util.List<java.lang.String> r2 = r0.urlList     // Catch: org.json.JSONException -> La9
            if (r2 == 0) goto L5a
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: org.json.JSONException -> La9
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L5a
            java.lang.String r11 = java.util.Arrays.toString(r0)     // Catch: org.json.JSONException -> La9
            java.lang.String r0 = "toString(this)"
            kotlin.jvm.internal.o.LJIIIIZZ(r11, r0)     // Catch: org.json.JSONException -> La9
        L78:
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r1.resourceByteVC1Model     // Catch: org.json.JSONException -> La9
            if (r0 == 0) goto L80
            java.lang.String r10 = r0.uri     // Catch: org.json.JSONException -> La9
            if (r10 != 0) goto L83
        L80:
            r10 = r3
            if (r1 == 0) goto L8f
        L83:
            X.Cnw r0 = r4.getResourceRequest()     // Catch: org.json.JSONException -> La9
            java.lang.String r0 = r0.LJ     // Catch: org.json.JSONException -> La9
            java.lang.String r9 = r1.getResourceFormat(r0)     // Catch: org.json.JSONException -> La9
            if (r9 != 0) goto L91
        L8f:
            java.lang.String r9 = "unknown"
        L91:
            if (r1 == 0) goto L94
            goto L97
        L94:
            r13 = 0
            goto L99
        L97:
            long r13 = r1.size     // Catch: org.json.JSONException -> La9
        L99:
            android.os.Handler r2 = X.C15610jN.LIZ()     // Catch: org.json.JSONException -> La9
            X.Cny r3 = new X.Cny     // Catch: org.json.JSONException -> La9
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13)     // Catch: org.json.JSONException -> La9
            r0 = 100
            r2.postDelayed(r3, r0)     // Catch: org.json.JSONException -> La9
            goto Lb1
        La9:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            X.C0NB.LIZLLL(r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32423Cnz.LIZIZ(X.Co1):void");
    }

    @Override // X.InterfaceC64518PTu
    public final void LIZJ(long j, C32420Cnw request) {
        o.LJIIIZ(request, "request");
        java.util.Map<String, Long> map = this.LIZ;
        String str = request.LIZ;
        o.LJIIIIZZ(str, "request.id");
        map.put(str, Long.valueOf(j));
    }

    @Override // X.InterfaceC64518PTu
    public final void LIZLLL(long j, C32420Cnw request) {
        o.LJIIIZ(request, "request");
        java.util.Map<String, Long> map = this.LIZIZ;
        String str = request.LIZ;
        o.LJIIIIZZ(str, "request.id");
        map.put(str, Long.valueOf(j));
    }

    @Override // X.InterfaceC64518PTu
    public final void LJ(long j, C32420Cnw c32420Cnw) {
        AssetsModel LIZIZ = C32341Cmf.LIZIZ(j);
        if (LIZIZ != null) {
            C73943T0h.LIZ().LIZIZ(new C30684C2m());
            C15610jN.LIZ().postDelayed(new RunnableC32421Cnx(c32420Cnw, this, LIZIZ, j, c32420Cnw.LIZLLL, LIZIZ.resourceType), 100L);
        }
    }

    @Override // X.InterfaceC64518PTu
    public final void LJFF(long j, C32420Cnw request) {
        long j2;
        o.LJIIIZ(request, "request");
        Long l = (Long) ((LinkedHashMap) this.LIZIZ).get(request.LIZ);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        java.util.Map<String, Long> map = this.LIZIZ;
        String str = request.LIZ;
        o.LJIIIIZZ(str, "request.id");
        map.put(str, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j - j2)));
    }

    @Override // X.InterfaceC64518PTu
    public final void LJI(long j, C32420Cnw request) {
        long j2;
        o.LJIIIZ(request, "request");
        Long l = (Long) ((LinkedHashMap) this.LIZ).get(request.LIZ);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        java.util.Map<String, Long> map = this.LIZ;
        String str = request.LIZ;
        o.LJIIIIZZ(str, "request.id");
        map.put(str, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j - j2)));
    }
}
