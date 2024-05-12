package X;

import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3FW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FW {
    public static List<MAFIMUser> LIZ = new ArrayList();
    public static boolean LIZIZ = true;
    public static final C5H3<C3FW> LIZJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C3FX.LJLIL);

    public final List<MAFIMUser> LIZ() {
        ArrayList arrayList;
        boolean z;
        if (LIZIZ) {
            ArrayList arrayList2 = new ArrayList();
            try {
                List<YW5> LJI = C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJ().LJI();
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJI, 10));
                Iterator<YW5> it = LJI.iterator();
                while (it.hasNext()) {
                    arrayList3.add(YW3.LIZIZ(it.next()));
                }
                arrayList2.addAll(arrayList3);
                return arrayList2;
            } catch (Exception e) {
                C34B.LIZLLL("MAFListManager", "getUsers", e);
                return arrayList2;
            }
        }
        synchronized (this) {
            List<MAFIMUser> list = LIZ;
            arrayList = new ArrayList();
            for (MAFIMUser mAFIMUser : list) {
                if (mAFIMUser.getFollowStatus() == 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(mAFIMUser);
                }
            }
        }
        return arrayList;
    }

    public static MAFIMUser LIZIZ(String str) {
        MAFIMUser mAFIMUser;
        if (str == null) {
            return null;
        }
        if (!LIZ.isEmpty()) {
            for (MAFIMUser mAFIMUser2 : LIZ) {
                if (o.LJ(str, mAFIMUser2.getUid())) {
                    return mAFIMUser2;
                }
            }
        }
        if (!LIZIZ) {
            return null;
        }
        try {
            YW5 LIZJ2 = C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJ().LIZJ(str);
            if (LIZJ2 != null) {
                mAFIMUser = YW3.LIZIZ(LIZJ2);
                if (mAFIMUser != null) {
                    return mAFIMUser;
                }
            } else {
                mAFIMUser = null;
            }
            if (C3QM.LIZ()) {
                return C3GN.LIZIZ.LJFF(str);
            }
            return mAFIMUser;
        } catch (Exception e) {
            C34B.LIZLLL("MAFListManager", "getUsers", e);
            return null;
        }
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        if (!LIZ.isEmpty()) {
            Iterator<MAFIMUser> it = LIZ.iterator();
            while (it.hasNext()) {
                if (o.LJ(str, it.next().getUid())) {
                    return true;
                }
            }
        }
        if (!LIZIZ) {
            return false;
        }
        try {
        } catch (Exception e) {
            C34B.LIZLLL("MAFListManager", "getUsers", e);
        }
        if (C3QM.LIZ()) {
            if (C3GN.LIZIZ.LJIIIIZZ(str) == null) {
                return false;
            }
            return true;
        }
        if (!C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJ().LIZLLL().contains(str)) {
            return false;
        }
        return true;
    }
}
