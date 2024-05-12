package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217738gb {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C217718gZ.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C217728ga.LJLIL);
    public static EnumC217758gd LIZJ = EnumC217758gd.UNDEFINED;

    public static HashMap LIZLLL() {
        return (HashMap) LIZ.getValue();
    }

    public static HashMap LJ() {
        return (HashMap) LIZIZ.getValue();
    }

    public static void LIZ(EnumC217778gf enumC217778gf) {
        int i = C217768ge.LIZ[enumC217778gf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJ().clear();
            return;
        }
        LIZLLL().clear();
    }

    public static C217808gi LIZIZ(String str) {
        EnumC217778gf enumC217778gf = EnumC217778gf.RECOMMEND;
        if (C217748gc.LIZ(enumC217778gf)) {
            LIZ(enumC217778gf);
            return null;
        }
        return (C217808gi) LIZLLL().get(str);
    }

    public static C217808gi LIZJ(String str, String keyword) {
        o.LJIIIZ(keyword, "keyword");
        EnumC217778gf enumC217778gf = EnumC217778gf.SEARCH;
        if (C217748gc.LIZ(enumC217778gf)) {
            LIZ(enumC217778gf);
        } else {
            HashMap hashMap = (HashMap) LJ().get(str);
            if (hashMap != null) {
                return (C217808gi) hashMap.get(keyword);
            }
        }
        return null;
    }

    public static void LJFF(String str, C217808gi packedData, EnumC217758gd enterFrom, boolean z) {
        o.LJIIIZ(packedData, "packedData");
        o.LJIIIZ(enterFrom, "enterFrom");
        int i = C217768ge.LIZ[packedData.LJLIL.LJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String str2 = packedData.LJLIL.LIZLLL;
                HashMap hashMap = (HashMap) LJ().get(str);
                if (hashMap == null) {
                    LJ().put(str, C113554cx.LJJJLZIJ(new OSZ(str2, packedData)));
                } else {
                    C217808gi c217808gi = (C217808gi) hashMap.get(str2);
                    if (c217808gi == null) {
                        hashMap.put(str2, packedData);
                    } else {
                        c217808gi.LJLILLLLZI.addAll(packedData.LJLILLLLZI);
                        List<Y9G> list = c217808gi.LJLILLLLZI;
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Y9G y9g : list) {
                            if (hashSet.add(y9g.LIZ)) {
                                arrayList.add(y9g);
                            }
                        }
                        c217808gi.LJLILLLLZI.clear();
                        c217808gi.LJLILLLLZI.addAll(arrayList);
                        hashMap.put(str2, c217808gi);
                    }
                    LJ().put(str, hashMap);
                }
            }
        } else {
            EnumC217758gd enumC217758gd = LIZJ;
            EnumC217758gd enumC217758gd2 = EnumC217758gd.VIDEO_POST_PAGE;
            if ((enumC217758gd != enumC217758gd2 && enterFrom == enumC217758gd2) || z) {
                LIZ(EnumC217778gf.RECOMMEND);
            }
            C217808gi c217808gi2 = (C217808gi) LIZLLL().get(str);
            if (c217808gi2 == null || c217808gi2.LJLILLLLZI.isEmpty()) {
                LIZLLL().put(str, packedData);
            } else {
                c217808gi2.LJLILLLLZI.addAll(packedData.LJLILLLLZI);
                C217798gh c217798gh = packedData.LJLIL;
                o.LJIIIZ(c217798gh, "<set-?>");
                c217808gi2.LJLIL = c217798gh;
                LIZLLL().put(str, c217808gi2);
            }
            LIZJ = enterFrom;
        }
        EnumC217778gf type = packedData.LJLIL.LJ;
        o.LJIIIZ(type, "type");
        if (type == EnumC217778gf.SEARCH) {
            ((Keva) C217748gc.LIZ.getValue()).storeLong("key_latest_update_search_time", System.currentTimeMillis());
        } else {
            ((Keva) C217748gc.LIZ.getValue()).storeLong("key_latest_update_recommend_time", System.currentTimeMillis());
        }
    }
}
