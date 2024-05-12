package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.contact.model.SharePermission;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YW7 implements C3ZA {
    public final YWD LIZ;

    public YW7(YWD roomDao) {
        o.LJIIIZ(roomDao, "roomDao");
        this.LIZ = roomDao;
    }

    @Override // X.C3ZA
    public final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C34B.LJI("SharePermissionDaoBase", "clear table");
        this.LIZ.LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.C3ZA
    public final MAFIMUser LIZLLL(long j) {
        Object obj;
        int i;
        YWA LIZLLL = this.LIZ.LIZLLL(j);
        Object obj2 = null;
        if (LIZLLL == null) {
            return null;
        }
        try {
            Object LIZ = C75792yF.LIZ(LIZLLL.LIZIZ, UrlModel.class);
            try {
                obj2 = C75792yF.LIZ(LIZLLL.LIZJ, UrlModel.class);
            } catch (Exception unused) {
            }
            obj = obj2;
            obj2 = LIZ;
        } catch (Exception unused2) {
            obj = null;
        }
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(String.valueOf(LIZLLL.LIZ));
        mAFIMUser.setNickName(LIZLLL.LIZLLL);
        mAFIMUser.setUniqueId(LIZLLL.LJ);
        mAFIMUser.setAvatarThumb((UrlModel) obj2);
        mAFIMUser.setAvatarMedium((UrlModel) obj);
        Integer num = LIZLLL.LJFF;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        mAFIMUser.setFollowStatus(i);
        mAFIMUser.setRecType(LIZLLL.LJII);
        mAFIMUser.setSortWeight(LIZLLL.LJIIIZ);
        mAFIMUser.setInitialLetter(LIZLLL.LJIIJ);
        Integer num2 = LIZLLL.LJIIL;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        mAFIMUser.setShareStatus(i2);
        return mAFIMUser;
    }

    @Override // X.C3ZA
    public final IMUser LJI(Long l) {
        Object obj;
        int i;
        Object obj2 = null;
        if (l == null) {
            return null;
        }
        YWA LJFF = this.LIZ.LJFF(l.longValue());
        if (LJFF == null) {
            return null;
        }
        try {
            obj = C75792yF.LIZ(LJFF.LIZIZ, UrlModel.class);
            try {
                obj2 = C75792yF.LIZ(LJFF.LIZJ, UrlModel.class);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            obj = null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(String.valueOf(LJFF.LIZ));
        iMUser.setNickName(LJFF.LIZLLL);
        iMUser.setUniqueId(LJFF.LJ);
        iMUser.setAvatarThumb((UrlModel) obj);
        iMUser.setAvatarMedium((UrlModel) obj2);
        Integer num = LJFF.LJFF;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        iMUser.setFollowStatus(i);
        iMUser.setRecType(LJFF.LJII);
        iMUser.setSortWeight(LJFF.LJIIIZ);
        iMUser.setInitialLetter(LJFF.LJIIJ);
        Integer num2 = LJFF.LJIIL;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        iMUser.setShareStatus(i2);
        return iMUser;
    }

    @Override // X.C3ZA
    public final Object LIZJ(List<SharePermission> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insertOrReplaceIMUser list size ");
        Integer num = null;
        if (list != null) {
            num = new Integer(list.size());
        }
        LIZ.append(num);
        C34B.LJI("SharePermissionDaoBase", X1D.LIZIZ(LIZ));
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SharePermission sharePermission : list) {
                if (sharePermission.getUserId() > 0) {
                    arrayList.add(sharePermission);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(YWG.LIZ((SharePermission) it.next()));
            }
            this.LIZ.LIZJ(arrayList2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C3ZA
    public final Object LJ(SharePermission sharePermission, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (sharePermission != null) {
            this.LIZ.LJ(YWG.LIZ(sharePermission));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C3ZA
    public final Object LJFF(Long l, InterfaceC67352kd<? super SharePermission> interfaceC67352kd) {
        if (l == null) {
            return null;
        }
        YNU LJI = this.LIZ.LJI(l.longValue());
        if (LJI == null) {
            return null;
        }
        SharePermission sharePermission = new SharePermission();
        sharePermission.setUserId(LJI.LIZ);
        sharePermission.setUserShareStatus(LJI.LIZIZ);
        sharePermission.setTtnShareStatus(LJI.LIZJ);
        sharePermission.setUpdateTime(LJI.LIZLLL);
        sharePermission.setExtra(LJI.LJ);
        return sharePermission;
    }

    @Override // X.C3ZA
    public final Object LJII(SharePermission sharePermission, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (sharePermission.getUserId() != 0) {
            this.LIZ.LIZ(YWG.LIZ(sharePermission));
        }
        return C76800UCe.LIZ;
    }
}
