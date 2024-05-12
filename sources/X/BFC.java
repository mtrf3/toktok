package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.UserHonor;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BFC {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;
    public final UserHonor LJFF;
    public boolean LJI;
    public java.util.Map<Integer, Integer> LJII;
    public String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BFC)) {
            return false;
        }
        BFC bfc = (BFC) obj;
        return this.LIZ == bfc.LIZ && o.LJ(this.LIZIZ, bfc.LIZIZ) && o.LJ(this.LIZJ, bfc.LIZJ) && o.LJ(this.LIZLLL, bfc.LIZLLL) && o.LJ(this.LJ, bfc.LJ) && o.LJ(this.LJFF, bfc.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdminUser(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", displayId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatar=");
        LIZ.append(this.LJ);
        LIZ.append(", userHonor=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BFC() {
        this(0L, "", null, null, null, null);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ImageModel imageModel = this.LJ;
        if (imageModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageModel.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        UserHonor userHonor = this.LJFF;
        if (userHonor != null) {
            i = userHonor.hashCode();
        }
        return i4 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Integer r13, X.InterfaceC67352kd<? super java.lang.Integer> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.BFD
            if (r0 == 0) goto L1e
            r11 = r14
            X.BFD r11 = (X.BFD) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r11.LJLJI = r2
        L12:
            java.lang.Object r3 = r11.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L65
        L1e:
            X.BFD r11 = new X.BFD
            r11.<init>(r12, r14)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            X.PsI r3 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L76
            java.lang.Class<com.bytedance.android.live.usermanage.model.CommerceApi> r0 = com.bytedance.android.live.usermanage.model.CommerceApi.class
            r3.getClass()     // Catch: java.lang.Exception -> L76
            java.lang.Object r3 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L76
            com.bytedance.android.live.usermanage.model.CommerceApi r3 = (com.bytedance.android.live.usermanage.model.CommerceApi) r3     // Catch: java.lang.Exception -> L76
            X.B83 r0 = X.B83.LIZ()     // Catch: java.lang.Exception -> L76
            X.BgP r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L76
            long r4 = r12.LIZ     // Catch: java.lang.Exception -> L76
            X.Bfu r0 = (X.C29374Bfu) r0     // Catch: java.lang.Exception -> L76
            long r6 = r0.getCurrentUserId()     // Catch: java.lang.Exception -> L76
            X.0Ih r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L76
            java.lang.String r8 = r0.getSecUid()     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = "user.currentUser.secUid"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)     // Catch: java.lang.Exception -> L76
            java.lang.String r9 = r12.LIZIZ     // Catch: java.lang.Exception -> L76
            r11.LJLJI = r1     // Catch: java.lang.Exception -> L76
            r10 = r13
            java.lang.Object r3 = r3.checkAdminECommercePermission(r4, r6, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L76
            if (r3 != r2) goto L68
            return r2
        L65:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L76
        L68:
            X.BFf r3 = (X.C28467BFf) r3     // Catch: java.lang.Exception -> L76
            T r0 = r3.data     // Catch: java.lang.Exception -> L76
            com.bytedance.android.live.usermanage.model.CheckAdminECommercePermissionData r0 = (com.bytedance.android.live.usermanage.model.CheckAdminECommercePermissionData) r0     // Catch: java.lang.Exception -> L76
            int r0 = r0.status     // Catch: java.lang.Exception -> L76
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L76
            r1.<init>(r0)     // Catch: java.lang.Exception -> L76
            goto L89
        L76:
            r2 = move-exception
            boolean r0 = r2 instanceof X.C276516r
            r1 = 0
            if (r0 == 0) goto L8a
            X.16r r2 = (X.C276516r) r2
        L7e:
            if (r2 == 0) goto L89
            int r0 = r2.getErrorCode()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
        L89:
            return r1
        L8a:
            r2 = r1
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFC.LIZ(java.lang.Integer, X.2kd):java.lang.Object");
    }

    public BFC(long j, String secUid, String str, String str2, ImageModel imageModel, UserHonor userHonor) {
        o.LJIIIZ(secUid, "secUid");
        this.LIZ = j;
        this.LIZIZ = secUid;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = imageModel;
        this.LJFF = userHonor;
    }
}
