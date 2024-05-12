package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IZV extends C36071bH {
    public final /* synthetic */ IZU LIZ;

    public IZV(IZU izu) {
        this.LIZ = izu;
    }

    @Override // X.C36071bH
    public final void LJIIL(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enter onSubLoadFinished: success=");
        LIZ.append(i);
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    @Override // X.C36071bH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r23, java.lang.String r24) {
        /*
            r22 = this;
            java.lang.String r2 = "TTPlayer"
            java.lang.String r0 = "Enter onSubInfoCallback"
            X.IXB.LIZIZ(r2, r0)
            r4 = r22
            X.IZU r0 = r4.LIZ
            X.IZi r0 = r0.LJLJI
            if (r0 == 0) goto L99
            boolean r0 = X.IXB.LIZ
            r9 = r23
            r3 = r24
            if (r0 == 0) goto L32
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onSubInfoCallback: code="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " info="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.IXB.LIZIZ(r2, r0)
        L32:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r14 = 0
            java.lang.String r13 = ""
            if (r0 != 0) goto L59
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L53
            r1.<init>(r3)     // Catch: org.json.JSONException -> L53
            java.lang.String r0 = "duration"
            int r11 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r1, r0)     // Catch: org.json.JSONException -> L53
            java.lang.String r0 = "pts"
            int r12 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r1, r0)     // Catch: org.json.JSONException -> L56
            java.lang.String r0 = "info"
            java.lang.String r13 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> L5c
            goto L60
        L53:
            r0 = move-exception
            r11 = 0
            goto L57
        L56:
            r0 = move-exception
        L57:
            r12 = 0
            goto L5d
        L59:
            r11 = 0
            r12 = 0
            goto L60
        L5c:
            r0 = move-exception
        L5d:
            X.C16880lQ.LLLLIIL(r0)
        L60:
            X.IZU r1 = r4.LIZ
            boolean r0 = r1.LJLJJLL
            r5 = 0
            if (r0 != 0) goto L6c
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto La4
        L6c:
            long r16 = android.os.SystemClock.elapsedRealtime()
            X.IZU r7 = r4.LIZ
            long r0 = r7.LJLJLJ
            long r16 = r16 - r0
            long r2 = r7.LJLJLLL
            long r2 = r2 - r0
            boolean r0 = r7.LJLJJLL
            r15 = 1
            if (r0 == 0) goto L9a
            r7.LJLJJLL = r14
            long r5 = r7.LJLL
        L82:
            r14 = r15
            r15 = 0
        L84:
            X.IZU r0 = r4.LIZ
            X.IZi r7 = r0.LJLJI
            X.IYm r0 = r0.LJLILLLLZI
            java.lang.String r8 = r0.getSourceId()
            X.IZU r0 = r4.LIZ
            int r10 = r0.LJLLI
            r20 = r5
            r18 = r2
            r7.LIZLLL(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
        L99:
            return
        L9a:
            boolean r0 = r7.LJLJL
            if (r0 == 0) goto La2
            r7.LJLJL = r14
            long r5 = (long) r12
            goto L84
        La2:
            r15 = 0
            goto L82
        La4:
            r16 = 0
            r2 = 0
            r5 = 0
            r15 = 0
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZV.LJIIJ(int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    @Override // X.C36071bH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIJJI(int r23, java.lang.String r24) {
        /*
            r22 = this;
            java.lang.String r2 = "TTPlayer"
            java.lang.String r0 = "Enter onSubInfoCallbackWithRet"
            X.IXB.LIZIZ(r2, r0)
            r4 = r22
            X.IZU r0 = r4.LIZ
            X.IZi r0 = r0.LJLJI
            if (r0 == 0) goto Lad
            boolean r0 = X.IXB.LIZ
            r9 = r23
            r3 = r24
            if (r0 == 0) goto L32
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onSubInfoCallback: code="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " info="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.IXB.LIZIZ(r2, r0)
        L32:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r14 = 0
            java.lang.String r13 = ""
            if (r0 != 0) goto L57
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5a
            r1.<init>(r3)     // Catch: org.json.JSONException -> L5a
            java.lang.String r0 = "duration"
            int r11 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r1, r0)     // Catch: org.json.JSONException -> L5a
            java.lang.String r0 = "pts"
            int r12 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r1, r0)     // Catch: org.json.JSONException -> L55
            java.lang.String r0 = "info"
            java.lang.String r13 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> L53
            goto L60
        L53:
            r0 = move-exception
            goto L5d
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r11 = 0
            r12 = 0
            goto L60
        L5a:
            r0 = move-exception
            r11 = 0
        L5c:
            r12 = 0
        L5d:
            X.C16880lQ.LLLLIIL(r0)
        L60:
            X.IZU r1 = r4.LIZ
            boolean r0 = r1.LJLJJLL
            r5 = 0
            if (r0 != 0) goto L6c
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto La5
        L6c:
            long r16 = android.os.SystemClock.elapsedRealtime()
            X.IZU r7 = r4.LIZ
            long r0 = r7.LJLJLJ
            long r16 = r16 - r0
            long r2 = r7.LJLJLLL
            long r2 = r2 - r0
            boolean r0 = r7.LJLJJLL
            r15 = 1
            if (r0 == 0) goto L9b
            r7.LJLJJLL = r14
            long r5 = r7.LJLL
        L82:
            r14 = r15
            r15 = 0
        L84:
            X.IZU r0 = r4.LIZ
            X.IZi r7 = r0.LJLJI
            X.IYm r0 = r0.LJLILLLLZI
            java.lang.String r8 = r0.getSourceId()
            X.IZU r0 = r4.LIZ
            int r10 = r0.LJLLI
            r20 = r5
            r18 = r2
            int r0 = r7.LIZJ(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            return r0
        L9b:
            boolean r0 = r7.LJLJL
            if (r0 == 0) goto La3
            r7.LJLJL = r14
            long r5 = (long) r12
            goto L84
        La3:
            r15 = 0
            goto L82
        La5:
            r16 = 0
            r2 = 0
            r5 = 0
            r15 = 0
            goto L84
        Lad:
            r0 = -9927(0xffffffffffffd939, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZV.LJIIJJI(int, java.lang.String):int");
    }

    @Override // X.C36071bH
    public final void LJIILIIL(int i, String str) {
        this.LIZ.LJLJLLL = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enter onSubLoadFinished2: success=");
        LIZ.append(i);
        LIZ.append(", info=");
        LIZ.append(str);
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        if (this.LIZ.LJLJI != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSubLoadFinished2: success=");
                LIZ2.append(i);
                LIZ2.append(", info=");
                LIZ2.append(str);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.LIZ.LJLL = JSONObjectProtectorUtils.getInt(jSONObject, "first_pts");
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            IZU izu = this.LIZ;
            izu.LJLJI.LJFF(i, izu.LJLILLLLZI.getSourceId(), str);
        }
    }

    @Override // X.C36071bH
    public final void LJIILJJIL(C47789IpF c47789IpF, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enter onSubPathInfo: error = [");
        LIZ.append(c47789IpF);
        LIZ.append("]");
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        if (this.LIZ.LJLJI != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSubPathInfo: error = [");
                LIZ2.append(c47789IpF);
                LIZ2.append("]");
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
            }
            IZU izu = this.LIZ;
            izu.LJLJI.LJ(izu.LJLILLLLZI.getSourceId(), str, c47789IpF);
        }
    }

    @Override // X.C36071bH
    public final void LJIILL(int i, int i2) {
        IZU izu = this.LIZ;
        izu.LJLJL = true;
        izu.LJLJLLL = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enter onSubSwitchCompleted: success=");
        LIZ.append(i);
        LIZ.append(" subId=");
        LIZ.append(i2);
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        if (this.LIZ.LJLJI != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSubSwitchCompleted: success=");
                LIZ2.append(i);
                LIZ2.append(" subId=");
                LIZ2.append(i2);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
            }
            IZU izu2 = this.LIZ;
            izu2.LJLJI.LIZIZ(i, i2, izu2.LJLILLLLZI.getSourceId());
        }
    }

    @Override // X.C36071bH
    public final void LJIILLIIL(int i, String str) {
        IZU izu = this.LIZ;
        izu.LJLJL = true;
        izu.LJLJLLL = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enter onSubSwitchCompleted: success=");
        LIZ.append(i);
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        if (this.LIZ.LJLJI != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSubSwitchCompleted: success=");
                LIZ2.append(i);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
            }
            IZU izu2 = this.LIZ;
            izu2.LJLJI.LIZ(i, izu2.LJLILLLLZI.getSourceId(), str);
        }
    }
}
