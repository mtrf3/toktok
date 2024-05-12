package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQK {
    public static AwemeRawAd LIZ;
    public static final java.util.Map<String, java.util.Map<InterfaceC58572Mym, Boolean>> LIZIZ = new LinkedHashMap();
    public static final java.util.Set<InterfaceC58572Mym> LIZJ = C77275UUl.LJIIIIZZ(NQZ.PROGRESS_15S, NQZ.PROGRESS_6S, NQZ.PROGRESS_2S, NQX.PROGRESS_25P, NQX.PROGRESS_50P, NQX.PROGRESS_75P);
    public static final java.util.Map<String, Long> LIZLLL = new LinkedHashMap();
    public static C59334NQk LJ;
    public static NSY LJFF;

    public static void LJ(String creativeId) {
        String str;
        o.LJIIIZ(creativeId, "creativeId");
        LIZIZ.remove(creativeId);
        LIZLLL.remove(creativeId);
        AwemeRawAd awemeRawAd = LIZ;
        if (awemeRawAd != null) {
            str = awemeRawAd.getCreativeIdStr();
        } else {
            str = null;
        }
        if (o.LJ(creativeId, str)) {
            LIZ = null;
        }
    }

    public static void LIZJ(NQX progress, String str) {
        o.LJIIIZ(progress, "progress");
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        LJFF(progress, str);
    }

    public static void LIZLLL(NQZ progress, String str) {
        o.LJIIIZ(progress, "progress");
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        LJFF(progress, str);
    }

    public static void LJFF(InterfaceC58572Mym interfaceC58572Mym, String str) {
        Object obj;
        java.util.Map<String, java.util.Map<InterfaceC58572Mym, Boolean>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        java.util.Map map2 = (java.util.Map) linkedHashMap.get(str);
        if (map2 != null) {
            obj = map2.get(interfaceC58572Mym);
        } else {
            obj = null;
        }
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(obj, bool)) {
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new LinkedHashMap();
                linkedHashMap.put(str, obj2);
            }
            java.util.Map<InterfaceC58572Mym, Boolean> map3 = (java.util.Map) obj2;
            map3.put(interfaceC58572Mym, bool);
            map.put(str, map3);
        }
    }

    public static void LIZ(String str, long j, long j2, EnumC53653L3x enumC53653L3x) {
        long percent;
        boolean z;
        boolean z2;
        C59753Ncj LJIIJ;
        C59753Ncj LJIIJ2;
        C59753Ncj LJIIJ3;
        LIZIZ(str, j, j2, enumC53653L3x);
        java.util.Map map = (java.util.Map) ((LinkedHashMap) LIZIZ).get(str);
        for (InterfaceC58572Mym interfaceC58572Mym : LIZJ) {
            if (map == null || !o.LJ(map.get(interfaceC58572Mym), Boolean.TRUE)) {
                if (interfaceC58572Mym.valid(j, j2) && (interfaceC58572Mym instanceof NQX)) {
                    if (enumC53653L3x == EnumC53653L3x.VIDEO_OVER || enumC53653L3x == EnumC53653L3x.VIDEO_BREAK) {
                        percent = ((NQX) interfaceC58572Mym).getPercent() * ((float) j2);
                    } else {
                        percent = j;
                    }
                    C59334NQk c59334NQk = LJ;
                    if (c59334NQk != null) {
                        NQX nqx = (NQX) interfaceC58572Mym;
                        NQL nql = c59334NQk.LIZ;
                        Aweme aweme = c59334NQk.LIZIZ;
                        Context context = c59334NQk.LIZJ;
                        View view = c59334NQk.LIZLLL;
                        nql.getClass();
                        if (!O5Y.LJJJIL(aweme) && !C63081OpJ.LJZL(aweme)) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("simple player listener is null ");
                            if (nql.LJIJI == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            LIZ2.append(z2);
                            X1D.LIZIZ(LIZ2);
                            int i = NQV.LIZ[nqx.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        if (nql.LJIIIZ == 0 && (LJIIJ3 = nql.LJIIJ(context, view, aweme)) != null) {
                                            C38891fp.LJIIIIZZ(LJIIJ3.LIZ);
                                            LJIIJ3.LIZ.LJ.LIZIZ("thirdQuartile");
                                        }
                                        nql.LJJ(percent, context, aweme);
                                    }
                                } else {
                                    C36922EeM.LJ("trackSecondQuartile");
                                    if (nql.LJIIIZ == 0 && (LJIIJ2 = nql.LJIIJ(context, view, aweme)) != null) {
                                        C38891fp.LJIIIIZZ(LJIIJ2.LIZ);
                                        LJIIJ2.LIZ.LJ.LIZIZ("midpoint");
                                    }
                                    nql.LJIL(percent, context, aweme);
                                }
                            } else {
                                if (nql.LJIIIZ == 0 && (LJIIJ = nql.LJIIJ(context, view, aweme)) != null) {
                                    C38891fp.LJIIIIZZ(LJIIJ.LIZ);
                                    LJIIJ.LIZ.LJ.LIZIZ("firstQuartile");
                                }
                                nql.LJIJJLI(percent, context, aweme);
                            }
                        }
                    }
                    LJFF(interfaceC58572Mym, str);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("quartile depend is null ");
                    if (LJ == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ3.append(z);
                    LIZ3.append(", reach ");
                    LIZ3.append(interfaceC58572Mym);
                    X1D.LIZIZ(LIZ3);
                }
            }
        }
    }

    public static void LIZIZ(String str, long j, long j2, EnumC53653L3x enumC53653L3x) {
        long length;
        java.util.Map map = (java.util.Map) ((LinkedHashMap) LIZIZ).get(str);
        for (InterfaceC58572Mym interfaceC58572Mym : LIZJ) {
            boolean z = false;
            if (map == null || !o.LJ(map.get(interfaceC58572Mym), Boolean.TRUE)) {
                if (interfaceC58572Mym.valid(j, j2) && (interfaceC58572Mym instanceof NQZ)) {
                    if (enumC53653L3x == EnumC53653L3x.VIDEO_OVER || enumC53653L3x == EnumC53653L3x.VIDEO_BREAK) {
                        length = ((NQZ) interfaceC58572Mym).getLength();
                    } else {
                        length = j;
                    }
                    NSY nsy = LJFF;
                    if (nsy != null) {
                        nsy.LIZ((NQZ) interfaceC58572Mym, length);
                    }
                    LJFF(interfaceC58572Mym, str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("stage depend is null ");
                    if (LJFF == null) {
                        z = true;
                    }
                    LIZ2.append(z);
                    LIZ2.append(", reach ");
                    LIZ2.append(interfaceC58572Mym);
                    X1D.LIZIZ(LIZ2);
                }
            }
        }
    }
}
