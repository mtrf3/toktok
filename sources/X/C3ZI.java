package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.contact.model.Avatars;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3ZI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZI implements C3Z2 {
    public final C3ZL LIZ;

    public C3ZI(C3ZL roomDao) {
        o.LJIIIZ(roomDao, "roomDao");
        this.LIZ = roomDao;
    }

    @Override // X.C3Z2
    public final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C34B.LJI("IMUserBaseInfoDaoBase", "clear table");
        this.LIZ.LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.C3Z2
    public final Object LIZIZ(InterfaceC67352kd<? super List<Long>> interfaceC67352kd) {
        return this.LIZ.LJFF();
    }

    @Override // X.C3Z2
    public final MAFIMUser LJ(long j) {
        Object obj;
        int i;
        C3ZN LJ = this.LIZ.LJ(j);
        Object obj2 = null;
        if (LJ == null) {
            return null;
        }
        try {
            Object LIZ = C75792yF.LIZ(LJ.LIZIZ, UrlModel.class);
            try {
                obj2 = C75792yF.LIZ(LJ.LIZJ, UrlModel.class);
            } catch (Exception unused) {
            }
            obj = obj2;
            obj2 = LIZ;
        } catch (Exception unused2) {
            obj = null;
        }
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(String.valueOf(LJ.LIZ));
        mAFIMUser.setAvatarThumb((UrlModel) obj2);
        mAFIMUser.setAvatarMedium((UrlModel) obj);
        mAFIMUser.setNickName(LJ.LIZLLL);
        mAFIMUser.setUniqueId(LJ.LJ);
        Integer num = LJ.LJFF;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        mAFIMUser.setFollowStatus(i);
        mAFIMUser.setRecType(LJ.LJII);
        mAFIMUser.setSortWeight(LJ.LJIIIZ);
        mAFIMUser.setInitialLetter(LJ.LJIIJ);
        return mAFIMUser;
    }

    @Override // X.C3Z2
    public final Object LJFF(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return new Integer(this.LIZ.LIZLLL());
    }

    @Override // X.C3Z2
    public final Object LJII(InterfaceC67352kd<? super List<IMUserBaseInfo>> interfaceC67352kd) {
        List<C3ZN> LJIIJ = this.LIZ.LJIIJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
        Iterator<C3ZN> it = LJIIJ.iterator();
        while (it.hasNext()) {
            arrayList.add(C85933Yv.LIZIZ(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0057 -> B:10:0x0030). Please report as a decompilation issue!!! */
    @Override // X.C3Z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo> r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C3ZJ
            if (r0 == 0) goto Lb4
            r8 = r13
            X.3ZJ r8 = (X.C3ZJ) r8
            int r2 = r8.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r8.LJLJLJ = r2
        L12:
            java.lang.Object r6 = r8.LJLJJLL
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJLJ
            r7 = 1
            if (r0 == 0) goto L59
            if (r0 != r7) goto Lbb
            java.lang.Object r5 = r8.LJLJJL
            java.util.Collection r5 = (java.util.Collection) r5
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r1 = r8.LJLJJI
            java.lang.Object r4 = r8.LJLJI
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r8.LJLILLLLZI
            java.util.Collection r3 = (java.util.Collection) r3
            X.3ZI r2 = r8.LJLIL
            X.C141335gf.LIZJ(r6)
        L30:
            X.3ZN r0 = X.C85933Yv.LIZ(r1)
            r5.add(r0)
            r5 = r3
        L38:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r1 = r4.next()
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r1 = (com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo) r1
            r8.LJLIL = r2
            r8.LJLILLLLZI = r5
            r8.LJLJI = r4
            r8.LJLJJI = r1
            r8.LJLJJL = r5
            r8.LJLJLJ = r7
            java.lang.Object r0 = r2.LIZLLL(r1, r8)
            if (r0 != r9) goto L57
            return r9
        L57:
            r3 = r5
            goto L30
        L59:
            java.lang.String r0 = "insertOrReplaceIMUser list size1 "
            java.lang.StringBuilder r2 = X.C43881HKb.LIZIZ(r6, r0)
            r1 = 0
            if (r12 == 0) goto L6b
            int r0 = r12.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
        L6b:
            r2.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "IMUserBaseInfoDaoBase"
            X.C34B.LJI(r0, r1)
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lcc
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r12.iterator()
        L88:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r5 = r10.next()
            r0 = r5
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r0 = (com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo) r0
            long r3 = r0.getUserId()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L88
            r6.add(r5)
            goto L88
        La3:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r6.iterator()
            r2 = r11
            goto L38
        Lb4:
            X.3ZJ r8 = new X.3ZJ
            r8.<init>(r11, r13)
            goto L12
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc3:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Lcc
            X.3ZL r0 = r2.LIZ
            r0.LIZJ(r5)
        Lcc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ZI.LIZJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C3ZK
            if (r0 == 0) goto L54
            r4 = r7
            X.3ZK r4 = (X.C3ZK) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L5a
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r6 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r6.setSortWeight(r0)
            java.lang.Object r0 = r1.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r6.setInitialLetter(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L39:
            X.C141335gf.LIZJ(r1)
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            X.3GF r1 = r0.getImUserService()
            java.lang.String r0 = r6.getDisplayName()
            r4.LJLIL = r6
            r4.LJLJJI = r2
            X.OSZ r1 = r1.LJFF(r0)
            if (r1 != r3) goto L22
            return r3
        L54:
            X.3ZK r4 = new X.3ZK
            r4.<init>(r5, r7)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ZI.LIZLLL(com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo, X.2kd):java.lang.Object");
    }

    @Override // X.C3Z2
    public final Object LJI(IMUserBaseInfo imUserBaseInfo, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        String str;
        String str2;
        Avatars avatars;
        C3ZL c3zl = this.LIZ;
        o.LJIIIZ(imUserBaseInfo, "imUserBaseInfo");
        String str3 = "";
        try {
            avatars = imUserBaseInfo.getAvatars();
        } catch (Exception unused) {
            str = "";
        }
        if (avatars == null) {
            str2 = "";
            c3zl.LJI(new C3ZS(imUserBaseInfo.getUserId(), str3, str2, imUserBaseInfo.getContactNickName(), imUserBaseInfo.getUniqueId(), imUserBaseInfo.getFollowStatus(), imUserBaseInfo.getMafStatus(), imUserBaseInfo.getRecType(), imUserBaseInfo.getUpdateTime()));
            return C76800UCe.LIZ;
        }
        UrlModel urlModel = avatars.avatarThumb;
        if (urlModel == null) {
            str = "";
        } else {
            str = C75792yF.LIZJ(urlModel);
            o.LJIIIIZZ(str, "toJson(it)");
        }
        try {
            UrlModel urlModel2 = avatars.avatarMedium;
            if (urlModel2 != null) {
                String LIZJ = C75792yF.LIZJ(urlModel2);
                o.LJIIIIZZ(LIZJ, "toJson(it)");
                str3 = LIZJ;
            }
        } catch (Exception unused2) {
        }
        str2 = str3;
        str3 = str;
        c3zl.LJI(new C3ZS(imUserBaseInfo.getUserId(), str3, str2, imUserBaseInfo.getContactNickName(), imUserBaseInfo.getUniqueId(), imUserBaseInfo.getFollowStatus(), imUserBaseInfo.getMafStatus(), imUserBaseInfo.getRecType(), imUserBaseInfo.getUpdateTime()));
        return C76800UCe.LIZ;
    }

    @Override // X.C3Z2
    public final Object LJIIIZ(Long l, InterfaceC67352kd<? super IMUserBaseInfo> interfaceC67352kd) {
        IMUserBaseInfo LIZIZ;
        if (l == null) {
            return null;
        }
        C3ZN LJIIIZ = this.LIZ.LJIIIZ(l.longValue());
        if (LJIIIZ == null || (LIZIZ = C85933Yv.LIZIZ(LJIIIZ)) == null) {
            return null;
        }
        return LIZIZ;
    }

    @Override // X.C3Z2
    public final Object LJIIJ(IMUserBaseInfo iMUserBaseInfo, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (iMUserBaseInfo.getUserId() != 0) {
            this.LIZ.LJIIIIZZ(C85933Yv.LIZ(iMUserBaseInfo));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C3Z2
    public final Object LJIIIIZZ(long j, int i, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        this.LIZ.LJII(i, j);
        return C76800UCe.LIZ;
    }
}
