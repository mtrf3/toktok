package X;

import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class GPF {
    public static final List<String> LJ() {
        ArrayList arrayList = new ArrayList();
        List<String> LJIIIZ = C60903NvH.LJIIJJI().getPublishService().LJIIIZ();
        ArrayList arrayList2 = new ArrayList();
        for (String str : LJIIIZ) {
            if (str.length() > 0) {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        C60903NvH.LJIIJJI().getPublishService().LJIIIIZZ().getClass();
        java.util.Set<String> set = GOV.LJII;
        ArrayList arrayList3 = new ArrayList();
        for (String str2 : set) {
            if (str2.length() > 0) {
                arrayList3.add(str2);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(arrayList3);
        }
        String str3 = C41658GWo.LIZLLL().LJI;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            arrayList.add(str3);
        }
        arrayList.add("CHECK_POINT");
        arrayList.add("SaveLocalDraftID");
        return arrayList;
    }

    public static final String LIZ(GPG gpg) {
        String str;
        if (gpg.LJ == GP9.POSTED) {
            List<String> LIZJ = LIZJ(gpg);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select * from local_draft");
            LIZ.append(LIZLLL(gpg, LIZJ));
            LIZ.append(" order by published_time desc ");
            LIZ.append(LIZIZ(gpg));
            return X1D.LIZIZ(LIZ);
        }
        EnumC41422GNm enumC41422GNm = gpg.LIZ;
        int[] iArr = GP8.LIZ;
        int i = iArr[enumC41422GNm.ordinal()];
        if (i == 1 || i == 2) {
            List<String> LIZJ2 = LIZJ(gpg);
            int i2 = iArr[gpg.LIZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "time";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "save_time";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("select * from local_draft");
            LIZ2.append(LIZLLL(gpg, LIZJ2));
            LIZ2.append(" order by ");
            LIZ2.append(str);
            LIZ2.append(" desc ");
            LIZ2.append(LIZIZ(gpg));
            return X1D.LIZIZ(LIZ2);
        }
        throw new C162476Zf();
    }

    public static final String LIZIZ(GPG gpg) {
        C41421GNl c41421GNl = gpg.LIZIZ;
        if (c41421GNl != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" limit ");
            LIZ.append(c41421GNl.LJLILLLLZI);
            LIZ.append(" offset ");
            LIZ.append(c41421GNl.LJLIL * c41421GNl.LJLILLLLZI);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        return "";
    }

    public static final List<String> LIZJ(GPG gpg) {
        String LIZIZ;
        int i = GP8.LIZIZ[gpg.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LIZIZ = "visible_to_user = 0";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("is_published = 1 and published_time > ");
                    LIZ.append(System.currentTimeMillis() - 259200000);
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
            } else {
                LIZIZ = "((is_published = 0 or is_published is null)and visible_to_user = 1)";
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis() - 259200000;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("((is_published is null or is_published = 0 or (is_published = 1 and published_time > ");
            LIZ2.append(currentTimeMillis);
            LIZ2.append("))and visible_to_user = 1)");
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        GPH gph = gpg.LJFF;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(GPI.DEFAULT.getValue()), Integer.valueOf(GPI.STORY_LIGHTENING.getValue()), Integer.valueOf(GPI.PHOTO_MODE.getValue()), Integer.valueOf(GPI.TTN.getValue()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJIIJI) {
            if ((((Number) obj).intValue() & gph.getValue()) != 0) {
                arrayList.add(obj);
            }
        }
        return C47261Igj.LJJIJIIJI(LIZIZ, C0F0.LIZLLL("format_type IN (", ORZ.LLD(arrayList, ",", null, null, null, 62), ')'));
    }

    public static final String LIZLLL(GPG gpg, List<String> list) {
        String str;
        String LJFF;
        String str2 = "";
        if (!(!list.isEmpty())) {
            str = "";
        } else {
            str = ORZ.LLD(list, " and ", null, null, null, 62);
        }
        if (str.length() == 0) {
            LJFF = "";
        } else {
            LJFF = i0.LJFF(" and ", str);
        }
        if (str.length() != 0) {
            str2 = i0.LJFF(" where ", str);
        }
        String str3 = "(";
        boolean z = true;
        for (String str4 : gpg.LIZJ) {
            if (z) {
                z = false;
            } else {
                str3 = C42398GkU.LIZIZ(str3, ',');
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str3);
            LIZ.append('\'');
            LIZ.append(str4);
            LIZ.append('\'');
            str3 = X1D.LIZIZ(LIZ);
        }
        String LIZIZ = C42398GkU.LIZIZ(str3, ')');
        if (gpg.LIZJ.isEmpty() && gpg.LIZLLL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" where user_id = '");
            LIZ2.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            LIZ2.append('\'');
            LIZ2.append(LJFF);
            return X1D.LIZIZ(LIZ2);
        }
        if ((!gpg.LIZJ.isEmpty()) && !gpg.LIZLLL) {
            return a1.LJ(" where video_path not in ", LIZIZ, LJFF);
        }
        if ((true ^ gpg.LIZJ.isEmpty()) && gpg.LIZLLL) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" where user_id = '");
            LIZ3.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            LIZ3.append("' and video_path not in ");
            LIZ3.append(LIZIZ);
            LIZ3.append(LJFF);
            return X1D.LIZIZ(LIZ3);
        }
        gpg.LIZJ.isEmpty();
        return str2;
    }
}
