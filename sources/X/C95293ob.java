package X;

import android.util.Pair;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.3ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95293ob implements C33Q {
    public final C95833pT LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<Boolean> LJLJJLL;
    public final C43I<String> LJLJL;
    public final C43I<Boolean> LJLJLJ;
    public final C43I<Boolean> LJLJLLL;
    public final C43I<Boolean> LJLL;
    public final C43I<C81243Gu> LJLLI;
    public final C43I<C81243Gu> LJLLILLLL;
    public final C43I<C81243Gu> LJLLJ;
    public final C43I<Boolean> LJLLL;
    public final C43I<Boolean> LJLLLL;
    public final C43I<Pair<Integer, String>> LJLLLLLL;
    public final C43I<Boolean> LJLZ;
    public final C43I<Boolean> LJZ;
    public final C43I<Boolean> LJZI;
    public final C43I<C81243Gu> LJZL;
    public final C43I<C63120Opw> LL;

    public C95293ob() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C95293ob)) {
            return false;
        }
        C95293ob c95293ob = (C95293ob) obj;
        return o.LJ(this.LJLIL, c95293ob.LJLIL) && this.LJLILLLLZI == c95293ob.LJLILLLLZI && this.LJLJI == c95293ob.LJLJI && this.LJLJJI == c95293ob.LJLJJI && o.LJ(this.LJLJJL, c95293ob.LJLJJL) && o.LJ(this.LJLJJLL, c95293ob.LJLJJLL) && o.LJ(this.LJLJL, c95293ob.LJLJL) && o.LJ(this.LJLJLJ, c95293ob.LJLJLJ) && o.LJ(this.LJLJLLL, c95293ob.LJLJLLL) && o.LJ(this.LJLL, c95293ob.LJLL) && o.LJ(this.LJLLI, c95293ob.LJLLI) && o.LJ(this.LJLLILLLL, c95293ob.LJLLILLLL) && o.LJ(this.LJLLJ, c95293ob.LJLLJ) && o.LJ(this.LJLLL, c95293ob.LJLLL) && o.LJ(this.LJLLLL, c95293ob.LJLLLL) && o.LJ(this.LJLLLLLL, c95293ob.LJLLLLLL) && o.LJ(this.LJLZ, c95293ob.LJLZ) && o.LJ(this.LJZ, c95293ob.LJZ) && o.LJ(this.LJZI, c95293ob.LJZI) && o.LJ(this.LJZL, c95293ob.LJZL) && o.LJ(this.LL, c95293ob.LL);
    }

    public final String toString() {
        return "GroupDetailState(groupNameInfo=" + this.LJLIL + ", muted=" + this.LJLILLLLZI + ", pined=" + this.LJLJI + ", requireApprovalToJoin=" + this.LJLJJI + ", leaveGroup=" + this.LJLJJL + ", jumpToRequestInfo=" + this.LJLJJLL + ", toast=" + this.LJLJL + ", chooseAdminDialog=" + this.LJLJLJ + ", dissolveGroup=" + this.LJLJLLL + ", finishSignal=" + this.LJLL + ", userToBeOperated=" + this.LJLLI + ", userToBeAppointed=" + this.LJLLILLLL + ", userToBeRemoved=" + this.LJLLJ + ", addGroupMember=" + this.LJLLL + ", showSuicideNoticeDialog=" + this.LJLLLL + ", iconToast=" + this.LJLLLLLL + ", requestListUpdated=" + this.LJLZ + ", invalidSignal=" + this.LJZ + ", conversationUpdated=" + this.LJZI + ", memberBlockUpdated=" + this.LJZL + ", conversationObtained=" + this.LL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode8 + i2) * 31;
        boolean z2 = this.LJLJI;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        if (!this.LJLJJI) {
            i = 0;
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLL, C40328FsC.LIZIZ(this.LJLJLLL, C40328FsC.LIZIZ(this.LJLJLJ, C40328FsC.LIZIZ(this.LJLJL, C40328FsC.LIZIZ(this.LJLJJLL, C40328FsC.LIZIZ(this.LJLJJL, (i5 + i) * 31, 31), 31), 31), 31), 31), 31);
        C43I<C81243Gu> c43i = this.LJLLI;
        int i6 = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i7 = (LIZIZ + hashCode) * 31;
        C43I<C81243Gu> c43i2 = this.LJLLILLLL;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        C43I<C81243Gu> c43i3 = this.LJLLJ;
        if (c43i3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i3.hashCode();
        }
        int LIZIZ2 = C40328FsC.LIZIZ(this.LJLLLL, C40328FsC.LIZIZ(this.LJLLL, (i8 + hashCode3) * 31, 31), 31);
        C43I<Pair<Integer, String>> c43i4 = this.LJLLLLLL;
        if (c43i4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i4.hashCode();
        }
        int i9 = (LIZIZ2 + hashCode4) * 31;
        C43I<Boolean> c43i5 = this.LJLZ;
        if (c43i5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i5.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        C43I<Boolean> c43i6 = this.LJZ;
        if (c43i6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i6.hashCode();
        }
        int LIZIZ3 = C40328FsC.LIZIZ(this.LJZI, (i10 + hashCode6) * 31, 31);
        C43I<C81243Gu> c43i7 = this.LJZL;
        if (c43i7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c43i7.hashCode();
        }
        int i11 = (LIZIZ3 + hashCode7) * 31;
        C43I<C63120Opw> c43i8 = this.LL;
        if (c43i8 != null) {
            i6 = c43i8.hashCode();
        }
        return i11 + i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C95293ob(int r28) {
        /*
            r27 = this;
            X.3pT r6 = new X.3pT
            r2 = 0
            r1 = 15
            r0 = 0
            r6.<init>(r1, r0, r2)
            r7 = 0
            r9 = 1
            X.43I r10 = new X.43I
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r10.<init>(r5)
            X.43I r11 = new X.43I
            r11.<init>(r5)
            X.43I r12 = new X.43I
            java.lang.String r0 = ""
            r12.<init>(r0)
            X.43I r13 = new X.43I
            r13.<init>(r5)
            X.43I r14 = new X.43I
            r14.<init>(r5)
            X.43I r15 = new X.43I
            r15.<init>(r5)
            r16 = 0
            X.43I r4 = new X.43I
            r4.<init>(r5)
            X.43I r3 = new X.43I
            r3.<init>(r5)
            X.43I r2 = new X.43I
            r2.<init>(r5)
            X.43I r1 = new X.43I
            r1.<init>(r5)
            X.43I r0 = new X.43I
            r0.<init>(r5)
            r5 = r27
            r8 = r7
            r17 = r16
            r18 = r16
            r19 = r4
            r20 = r3
            r21 = r16
            r22 = r2
            r23 = r1
            r24 = r0
            r25 = r16
            r26 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95293ob.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C95293ob(C95833pT groupNameInfo, boolean z, boolean z2, boolean z3, C43I<Boolean> leaveGroup, C43I<Boolean> jumpToRequestInfo, C43I<String> toast, C43I<Boolean> chooseAdminDialog, C43I<Boolean> dissolveGroup, C43I<Boolean> finishSignal, C43I<C81243Gu> c43i, C43I<C81243Gu> c43i2, C43I<C81243Gu> c43i3, C43I<Boolean> addGroupMember, C43I<Boolean> showSuicideNoticeDialog, C43I<? extends Pair<Integer, String>> c43i4, C43I<Boolean> c43i5, C43I<Boolean> c43i6, C43I<Boolean> conversationUpdated, C43I<C81243Gu> c43i7, C43I<? extends C63120Opw> c43i8) {
        o.LJIIIZ(groupNameInfo, "groupNameInfo");
        o.LJIIIZ(leaveGroup, "leaveGroup");
        o.LJIIIZ(jumpToRequestInfo, "jumpToRequestInfo");
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(chooseAdminDialog, "chooseAdminDialog");
        o.LJIIIZ(dissolveGroup, "dissolveGroup");
        o.LJIIIZ(finishSignal, "finishSignal");
        o.LJIIIZ(addGroupMember, "addGroupMember");
        o.LJIIIZ(showSuicideNoticeDialog, "showSuicideNoticeDialog");
        o.LJIIIZ(conversationUpdated, "conversationUpdated");
        this.LJLIL = groupNameInfo;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = leaveGroup;
        this.LJLJJLL = jumpToRequestInfo;
        this.LJLJL = toast;
        this.LJLJLJ = chooseAdminDialog;
        this.LJLJLLL = dissolveGroup;
        this.LJLL = finishSignal;
        this.LJLLI = c43i;
        this.LJLLILLLL = c43i2;
        this.LJLLJ = c43i3;
        this.LJLLL = addGroupMember;
        this.LJLLLL = showSuicideNoticeDialog;
        this.LJLLLLLL = c43i4;
        this.LJLZ = c43i5;
        this.LJZ = c43i6;
        this.LJZI = conversationUpdated;
        this.LJZL = c43i7;
        this.LL = c43i8;
    }

    public static C95293ob LIZ(C95293ob c95293ob, C95833pT c95833pT, boolean z, boolean z2, boolean z3, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, C43I c43i8, C43I c43i9, C43I c43i10, C43I c43i11, C43I c43i12, C43I c43i13, C43I c43i14, C43I c43i15, C43I c43i16, C43I c43i17, int i) {
        C43I c43i18 = c43i17;
        C43I conversationUpdated = c43i15;
        C43I c43i19 = c43i14;
        C43I c43i20 = c43i13;
        C43I jumpToRequestInfo = c43i2;
        C43I c43i21 = c43i16;
        C43I c43i22 = c43i12;
        C43I leaveGroup = c43i;
        boolean z4 = z3;
        boolean z5 = z2;
        C95833pT groupNameInfo = c95833pT;
        boolean z6 = z;
        C43I chooseAdminDialog = c43i4;
        C43I finishSignal = c43i6;
        C43I toast = c43i3;
        C43I c43i23 = c43i7;
        C43I dissolveGroup = c43i5;
        C43I c43i24 = c43i8;
        C43I c43i25 = c43i9;
        C43I addGroupMember = c43i10;
        C43I showSuicideNoticeDialog = c43i11;
        if ((i & 1) != 0) {
            groupNameInfo = c95293ob.LJLIL;
        }
        if ((i & 2) != 0) {
            z6 = c95293ob.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z5 = c95293ob.LJLJI;
        }
        if ((i & 8) != 0) {
            z4 = c95293ob.LJLJJI;
        }
        if ((i & 16) != 0) {
            leaveGroup = c95293ob.LJLJJL;
        }
        if ((i & 32) != 0) {
            jumpToRequestInfo = c95293ob.LJLJJLL;
        }
        if ((i & 64) != 0) {
            toast = c95293ob.LJLJL;
        }
        if ((i & 128) != 0) {
            chooseAdminDialog = c95293ob.LJLJLJ;
        }
        if ((i & 256) != 0) {
            dissolveGroup = c95293ob.LJLJLLL;
        }
        if ((i & 512) != 0) {
            finishSignal = c95293ob.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i23 = c95293ob.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i24 = c95293ob.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i25 = c95293ob.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            addGroupMember = c95293ob.LJLLL;
        }
        if ((i & 16384) != 0) {
            showSuicideNoticeDialog = c95293ob.LJLLLL;
        }
        if ((32768 & i) != 0) {
            c43i22 = c95293ob.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            c43i20 = c95293ob.LJLZ;
        }
        if ((131072 & i) != 0) {
            c43i19 = c95293ob.LJZ;
        }
        if ((262144 & i) != 0) {
            conversationUpdated = c95293ob.LJZI;
        }
        if ((524288 & i) != 0) {
            c43i21 = c95293ob.LJZL;
        }
        if ((i & 1048576) != 0) {
            c43i18 = c95293ob.LL;
        }
        c95293ob.getClass();
        o.LJIIIZ(groupNameInfo, "groupNameInfo");
        o.LJIIIZ(leaveGroup, "leaveGroup");
        o.LJIIIZ(jumpToRequestInfo, "jumpToRequestInfo");
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(chooseAdminDialog, "chooseAdminDialog");
        o.LJIIIZ(dissolveGroup, "dissolveGroup");
        o.LJIIIZ(finishSignal, "finishSignal");
        o.LJIIIZ(addGroupMember, "addGroupMember");
        o.LJIIIZ(showSuicideNoticeDialog, "showSuicideNoticeDialog");
        o.LJIIIZ(conversationUpdated, "conversationUpdated");
        C43I c43i26 = c43i21;
        C43I c43i27 = c43i18;
        C43I c43i28 = c43i23;
        C43I c43i29 = c43i24;
        C43I c43i30 = c43i25;
        return new C95293ob(groupNameInfo, z6, z5, z4, leaveGroup, jumpToRequestInfo, toast, chooseAdminDialog, dissolveGroup, finishSignal, c43i28, c43i29, c43i30, addGroupMember, showSuicideNoticeDialog, c43i22, c43i20, c43i19, conversationUpdated, c43i26, c43i27);
    }
}
