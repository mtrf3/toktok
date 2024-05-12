package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.4h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116144h8 implements InterfaceC57784Mm4 {
    public static final boolean LJLJJL = IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().enableSkylightAvatarOpt();
    public final IMUser LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJLILLLLZI) + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMUserPowerItem(contact=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isActive=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", priority=");
        LIZ.append(this.LJLJI);
        LIZ.append(", subPriority=");
        return b0.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC57784Mm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(X.InterfaceC57784Mm4 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C116144h8
            if (r0 == 0) goto L53
            boolean r0 = X.C116144h8.LJLJJL
            if (r0 == 0) goto L48
            boolean r1 = r2.LJLILLLLZI
            X.4h8 r3 = (X.C116144h8) r3
            boolean r0 = r3.LJLILLLLZI
            if (r1 != r0) goto L51
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r2.LJLIL
            java.lang.String r1 = r0.getNickName()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r3.LJLIL
            java.lang.String r0 = r0.getNickName()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r2.LJLIL
            java.lang.String r1 = r0.getUniqueId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r3.LJLIL
            java.lang.String r0 = r0.getUniqueId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r2.LJLIL
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getDisplayAvatar()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r3.LJLIL
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDisplayAvatar()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
        L46:
            r0 = 1
        L47:
            return r0
        L48:
            boolean r1 = r2.LJLILLLLZI
            X.4h8 r3 = (X.C116144h8) r3
            boolean r0 = r3.LJLILLLLZI
            if (r1 != r0) goto L51
            goto L46
        L51:
            r0 = 0
            goto L47
        L53:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r2)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116144h8.areContentsTheSame(X.Mm4):boolean");
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (other instanceof C116144h8) {
            return o.LJ(this.LJLIL, ((C116144h8) other).LJLIL);
        }
        return o.LJ(other, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C116144h8)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C116144h8(com.ss.android.ugc.aweme.im.service.model.IMUser r4, boolean r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = 0
        L6:
            r0 = r6 & 4
            if (r0 == 0) goto L18
            r1 = 2147483647(0x7fffffff, float:NaN)
        Ld:
            r0 = r6 & 8
            if (r0 == 0) goto L14
            r2 = 2147483647(0x7fffffff, float:NaN)
        L14:
            r3.<init>(r4, r5, r1, r2)
            return
        L18:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116144h8.<init>(com.ss.android.ugc.aweme.im.service.model.IMUser, boolean, int):void");
    }

    public C116144h8(IMUser contact, boolean z, int i, int i2) {
        o.LJIIIZ(contact, "contact");
        this.LJLIL = contact;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
