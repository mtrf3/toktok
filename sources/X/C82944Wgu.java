package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Wgu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82944Wgu {
    public static final Keva LIZ;
    public static final List<BeautySyncData> LIZIZ;

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        o.LJIIIIZZ(repo, "Keva.getRepo(DefaultBeau…eManager.KEVA_ULIKE_REPO)");
        LIZ = repo;
        LIZIZ = new ArrayList();
    }

    public static void LIZ(List allData) {
        List<ComposerBeauty> childList;
        Object[] objArr;
        Object[] objArr2;
        o.LJIIIZ(allData, "allData");
        ArrayList arrayList = (ArrayList) ORZ.LLJILJILJ(allData);
        if (arrayList.isEmpty()) {
            ((ArrayList) LIZIZ).clear();
        } else if (!((ArrayList) LIZIZ).isEmpty()) {
            C83175Wkd.LIZIZ("data had parse");
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<ComposerBeauty> beautyList = ((BeautyCategory) it.next()).getBeautyList();
                if (beautyList != null && !beautyList.isEmpty()) {
                    for (ComposerBeauty composerBeauty : beautyList) {
                        if (composerBeauty.isCollectionType() && (childList = composerBeauty.getChildList()) != null && (!childList.isEmpty())) {
                            Iterator<ComposerBeauty> it2 = childList.iterator();
                            while (it2.hasNext()) {
                                C82945Wgv.LJLIL.LIZ(it2.next());
                            }
                        }
                        C82945Wgv.LJLIL.LIZ(composerBeauty);
                    }
                }
            }
        }
        Keva keva = LIZ;
        if (keva.getBoolean("key_had_converted_keys", false)) {
            C83175Wkd.LIZIZ("nothing to convert");
            return;
        }
        C83175Wkd.LIZIZ("prepare to convert data");
        java.util.Set<String> keySet = keva.getAll().keySet();
        ArrayList arrayList2 = new ArrayList();
        for (String str : keySet) {
            if (s.LJJJLZIJ(str, "composer_beauty_manual", false)) {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (true) {
            char c = '_';
            if (!it3.hasNext()) {
                break;
            }
            String str2 = (String) it3.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("convert data key:");
            LIZ2.append(str2);
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ2));
            List LJLJJL = s.LJLJJL(str2, new String[]{"_"}, 0, 6);
            if (LJLJJL.size() < 8) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("bad key:");
                LIZ3.append(str2);
                C83175Wkd.LIZJ(X1D.LIZIZ(LIZ3));
            } else {
                Object obj = ListProtector.get(LJLJJL, 0);
                if (o.LJ("live", obj)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("not record tag value key:");
                    LIZ4.append(str2);
                    C83175Wkd.LIZJ(X1D.LIZIZ(LIZ4));
                } else {
                    Object obj2 = ListProtector.get(LJLJJL, 6);
                    String str3 = (String) ListProtector.get(LJLJJL, 7);
                    int size = LJLJJL.size();
                    int i = 8;
                    while (i < size) {
                        StringBuilder LJFF = C72972SkS.LJFF(str3, c);
                        LJFF.append((String) ListProtector.get(LJLJJL, i));
                        str3 = X1D.LIZIZ(LJFF);
                        i++;
                        c = '_';
                    }
                    objArr2 = new String[]{str2, obj, "composer_beauty_manual", obj2, str3};
                    arrayList3.add(objArr2);
                }
            }
            objArr2 = null;
            arrayList3.add(objArr2);
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            String[] strArr = (String[]) it4.next();
            if (strArr != null && strArr.length != 0 && strArr.length == 5) {
                String str4 = strArr[0];
                BeautySyncData LIZIZ2 = LIZIZ(strArr[3]);
                if (LIZIZ2 != null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(strArr[1]);
                    LIZ5.append('_');
                    LIZ5.append(strArr[2]);
                    LIZ5.append('_');
                    LIZ5.append(LIZIZ2.getResourceId());
                    LIZ5.append('_');
                    LIZ5.append(strArr[4]);
                    String LIZIZ3 = X1D.LIZIZ(LIZ5);
                    Keva keva2 = LIZ;
                    int i2 = keva2.getInt(str4, LiveLayoutPreloadThreadPriority.DEFAULT);
                    if (i2 != Integer.MIN_VALUE && !keva2.contains(LIZIZ3)) {
                        keva2.storeFloat(LIZIZ3, i2);
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("convert key:");
                        LIZ6.append(LIZIZ3);
                        LIZ6.append(" val:");
                        LIZ6.append(i2);
                        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ6));
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (String str5 : keySet) {
            if (s.LJJJLZIJ(str5, "key_selected_album", false)) {
                arrayList4.add(str5);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            String str6 = (String) it5.next();
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("convert selected key:");
            LIZ7.append(str6);
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ7));
            List LJLJJL2 = s.LJLJJL(str6, new String[]{"_"}, 0, 6);
            if (LJLJJL2.size() < 6) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("bad selected key:");
                LIZ8.append(str6);
                C83175Wkd.LIZJ(X1D.LIZIZ(LIZ8));
            } else {
                Object obj3 = ListProtector.get(LJLJJL2, 0);
                if (o.LJ("live", obj3)) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("not record selected key:");
                    LIZ9.append(str6);
                    C83175Wkd.LIZJ(X1D.LIZIZ(LIZ9));
                } else {
                    objArr = new String[]{str6, obj3, "key_selected_album", ListProtector.get(LJLJJL2, 5)};
                    arrayList5.add(objArr);
                }
            }
            objArr = null;
            arrayList5.add(objArr);
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            String[] strArr2 = (String[]) it6.next();
            if (strArr2 != null && strArr2.length != 0 && strArr2.length == 4) {
                String str7 = strArr2[0];
                BeautySyncData LIZIZ4 = LIZIZ(strArr2[3]);
                if (LIZIZ4 != null) {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append(strArr2[1]);
                    LIZ10.append('_');
                    LIZ10.append(strArr2[2]);
                    LIZ10.append('_');
                    LIZ10.append(LIZIZ4.getResourceId());
                    String LIZIZ5 = X1D.LIZIZ(LIZ10);
                    Keva keva3 = LIZ;
                    if (!keva3.contains(LIZIZ5)) {
                        String value = keva3.getString(str7, "");
                        o.LJIIIIZZ(value, "value");
                        BeautySyncData LIZIZ6 = LIZIZ(value);
                        if (LIZIZ6 != null) {
                            keva3.storeString(LIZIZ5, LIZIZ6.getResourceId());
                            StringBuilder LIZIZ7 = C25620zW.LIZIZ("convert selected key:", LIZIZ5, " val:");
                            LIZIZ7.append(LIZIZ6.getResourceId());
                            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZIZ7));
                        }
                    }
                }
            }
        }
        LIZ.storeBoolean("key_had_converted_keys", true);
    }

    public static BeautySyncData LIZIZ(String str) {
        List<BeautySyncData> list;
        BeautySyncData beautySyncData;
        if (!TextUtils.isEmpty(str) && (list = LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            Iterator<BeautySyncData> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    beautySyncData = it.next();
                    if (o.LJ(beautySyncData.getEffectId(), str)) {
                        break;
                    }
                } else {
                    beautySyncData = null;
                    break;
                }
            }
            BeautySyncData beautySyncData2 = beautySyncData;
            if (beautySyncData2 != null) {
                return beautySyncData2;
            }
        }
        return null;
    }
}
