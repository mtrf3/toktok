package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84283Sm {
    public static final C84283Sm LIZ = new C84283Sm();

    public static final boolean LIZ(List<C81243Gu> list) {
        C81243Gu c81243Gu;
        C63089OpR member;
        String uid = C80763Ey.LIZ(false);
        uid.toString();
        o.LJIIIZ(uid, "uid");
        if (list == null) {
            return false;
        }
        Iterator<C81243Gu> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                c81243Gu = it.next();
                if (o.LJ(c81243Gu.getUid(), uid)) {
                    break;
                }
            } else {
                c81243Gu = null;
                break;
            }
        }
        C81243Gu c81243Gu2 = c81243Gu;
        if (c81243Gu2 == null || (member = c81243Gu2.getMember()) == null || member.getRole() != EnumC96113pv.OWNER.getValue()) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(int i) {
        String string = EF7.LIZIZ().getString(R.string.gvs, Integer.valueOf(i));
        o.LJIIIIZZ(string, "getApplicationContext().…fc_group_member, maxSize)");
        return string;
    }

    public static InterfaceC84293Sn LIZJ(C63120Opw c63120Opw) {
        Long LJJIZ;
        if (c63120Opw == null || !c63120Opw.isGroupChat() || c63120Opw.getCoreInfo() == null || c63120Opw.getCoreInfo().getExt() == null) {
            return C84323Sq.LIZ;
        }
        if (!LJFF(c63120Opw)) {
            return C84313Sp.LIZ;
        }
        String str = c63120Opw.getCoreInfo().getExt().get("ban_expiry");
        if (str == null || (LJJIZ = C38350F3i.LJJIZ(str)) == null) {
            return C84323Sq.LIZ;
        }
        if (LJJIZ.longValue() == 0) {
            return C84303So.LIZ;
        }
        if (LJJIZ.longValue() == -1) {
            return C3NB.LIZ;
        }
        if (LJJIZ.longValue() > 0) {
            final long longValue = LJJIZ.longValue();
            return new InterfaceC84293Sn(longValue) { // from class: X.3O4
                public final long LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3O4) && this.LIZ == ((C3O4) obj).LIZ;
                }

                public final int hashCode() {
                    return C16880lQ.LLJIJIL(this.LIZ);
                }

                public final String toString() {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BanTemporarily(banExpirySeconds=");
                    return C47135Ieh.LIZIZ(LIZ2, this.LIZ, ')', LIZ2);
                }

                {
                    this.LIZ = longValue;
                }
            };
        }
        return C84323Sq.LIZ;
    }

    public static final String LIZLLL(C63120Opw c63120Opw) {
        C63088OpQ coreInfo;
        if (c63120Opw != null && (coreInfo = c63120Opw.getCoreInfo()) != null) {
            String name = coreInfo.getName();
            if (name == null) {
                return "";
            }
            return name;
        }
        return C1DD.LIZLLL(R.string.dhq, "getApplicationContext().…g(R.string.com_mig_group)");
    }

    public static final boolean LJ(C63120Opw c63120Opw) {
        if (c63120Opw == null || !c63120Opw.isGroupChat() || c63120Opw.getCoreInfo() == null || c63120Opw.getCoreInfo().getExt() == null || !o.LJ(c63120Opw.getCoreInfo().getExt().get("a:s_banned"), "1")) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(C63120Opw c63120Opw) {
        String str;
        java.util.Map<String, String> ext;
        java.util.Map<String, String> ext2;
        if (c63120Opw != null && c63120Opw.isGroupChat()) {
            C63088OpQ coreInfo = c63120Opw.getCoreInfo();
            String str2 = null;
            if (coreInfo != null && (ext2 = coreInfo.getExt()) != null) {
                str = ext2.get("ban_status");
            } else {
                str = null;
            }
            if (!o.LJ(str, "1")) {
                C63088OpQ coreInfo2 = c63120Opw.getCoreInfo();
                if (coreInfo2 != null && (ext = coreInfo2.getExt()) != null) {
                    str2 = ext.get("ban_status_v2");
                }
                if (o.LJ(str2, "1")) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LJI(String str) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        InterfaceC84293Sn LIZJ = LIZJ(C4WC.LIZIZ.LIZ(str));
        if (o.LJ(LIZJ, C3NB.LIZ) || (LIZJ instanceof C3O4)) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(C63120Opw c63120Opw) {
        if (c63120Opw == null || !c63120Opw.isMember() || c63120Opw == null || c63120Opw.isDissolved()) {
            return false;
        }
        String str = null;
        if (c63120Opw == null || c63120Opw.getCoreInfo() == null) {
            return false;
        }
        LIZ.getClass();
        if (LJFF(c63120Opw)) {
            if (!LJFF(c63120Opw)) {
                return false;
            }
            java.util.Map<String, String> ext = c63120Opw.getCoreInfo().getExt();
            if (ext != null) {
                str = ext.get("ban_expiry");
            }
            if (!o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIIIIZZ(C63120Opw c63120Opw) {
        C63088OpQ coreInfo;
        if (c63120Opw == null || (coreInfo = c63120Opw.getCoreInfo()) == null || coreInfo.getOwner() != C36L.LIZIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        C63120Opw LIZLLL = C81273Gx.LIZ(conversationId).LIZLLL();
        if (LIZLLL == null || !LIZLLL.isGroupChat() || LIZLLL.getCoreInfo() == null || LIZLLL.getCoreInfo().getExt() == null || !o.LJ(LIZLLL.getCoreInfo().getExt().get("a:group_name_modified"), "1")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(SharePackage sharePackage) {
        String str;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        return o.LJ(str, "group");
    }
}
