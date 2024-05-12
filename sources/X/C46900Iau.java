package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Iau, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46900Iau {
    public static final ConcurrentHashMap<String, InterfaceC46911Ib5> LIZ = new ConcurrentHashMap<>();
    public static AbstractC65781Prl LIZIZ = C46903Iax.LJLIL;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Ynr, X.Prl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Ynr, X.Prl] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.Ynr, X.Prl] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.Ynr, X.Prl] */
    public static InterfaceC46904Iay LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        C46909Ib3 c46909Ib3;
        if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoModelStr())) {
            InterfaceC46904Iay LIZ2 = LIZ(simVideoUrlModel, EnumC46870IaQ.FromMemory);
            if (!o.LJ(LIZ2, C46905Iaz.LIZ)) {
                LIZIZ.invoke(LIZ2.key(), Long.valueOf(LIZ2.LIZLLL()));
            } else {
                List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
                if (bitRate != null) {
                    for (SimBitRate simBitRate : bitRate) {
                        if (simBitRate.getUrlKey() != null) {
                            ?? r3 = LIZIZ;
                            String urlKey = simBitRate.getUrlKey();
                            o.LJI(urlKey);
                            if (((InterfaceC46904Iay) r3.invoke(urlKey, Long.valueOf(simBitRate.getSize()))).LIZIZ() > 0) {
                                break;
                            }
                        }
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC46911Ib5> concurrentHashMap = LIZ;
            String LJ = LJ(simVideoUrlModel);
            if (concurrentHashMap.get(LJ) == null) {
                concurrentHashMap.putIfAbsent(LJ, new C46908Ib2(LJ(simVideoUrlModel)));
            }
        } else {
            InterfaceC46904Iay LIZ3 = LIZ(simVideoUrlModel, EnumC46870IaQ.FromMemory);
            if (!o.LJ(LIZ3, C46905Iaz.LIZ)) {
                Iterator<InterfaceC46904Iay> it = LIZ3.LIZJ().iterator();
                while (it.hasNext()) {
                    LIZIZ.invoke(it.next().key(), Long.valueOf(LIZ3.LIZLLL()));
                }
            } else {
                String originUri = simVideoUrlModel.getOriginUri();
                if (originUri != null && (c46909Ib3 = C46901Iav.LIZIZ.get(originUri)) != null) {
                    Collection<C46902Iaw> values = c46909Ib3.LIZ.values();
                    o.LJIIIIZZ(values, "streamMap.values");
                    List<C46902Iaw> LLJI = ORZ.LLJI(values);
                    if (LLJI != null) {
                        for (C46902Iaw c46902Iaw : LLJI) {
                            LIZIZ.invoke(c46902Iaw.LJLIL, Long.valueOf(c46902Iaw.LJLJI));
                        }
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC46911Ib5> concurrentHashMap2 = LIZ;
            String LJ2 = LJ(simVideoUrlModel);
            if (concurrentHashMap2.get(LJ2) == null) {
                concurrentHashMap2.putIfAbsent(LJ2, new C46906Ib0(LJ(simVideoUrlModel)));
            }
        }
        return LIZJ(simVideoUrlModel);
    }

    public static InterfaceC46904Iay LIZJ(SimVideoUrlModel simVideoUrlModel) {
        InterfaceC46911Ib5 interfaceC46911Ib5 = LIZ.get(LJ(simVideoUrlModel));
        if (interfaceC46911Ib5 == null) {
            return C46905Iaz.LIZ;
        }
        return interfaceC46911Ib5;
    }

    public static String LIZLLL(String str) {
        Object[] array = s.LJLJJL(str, new String[]{"_"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            if (strArr.length > 1) {
                return strArr[0];
            }
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static String LJ(SimVideoUrlModel simVideoUrlModel) {
        String originUri = simVideoUrlModel.getOriginUri();
        if (originUri == null) {
            String dashVideoId = simVideoUrlModel.getDashVideoId();
            if (dashVideoId == null) {
                String urlKey = simVideoUrlModel.getUrlKey();
                if (urlKey == null) {
                    urlKey = "";
                }
                return LIZLLL(urlKey);
            }
            return dashVideoId;
        }
        return originUri;
    }

    public static InterfaceC46904Iay LIZ(SimVideoUrlModel simVideoUrlModel, EnumC46870IaQ cacheMode) {
        o.LJIIIZ(cacheMode, "cacheMode");
        if (simVideoUrlModel == null) {
            return C46905Iaz.LIZ;
        }
        int i = C46873IaT.LIZ[cacheMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    InterfaceC46904Iay LIZJ = LIZJ(simVideoUrlModel);
                    if (o.LJ(LIZJ, C46905Iaz.LIZ)) {
                        return LIZIZ(simVideoUrlModel);
                    }
                    return LIZJ;
                }
                throw new C162476Zf();
            }
            return LIZIZ(simVideoUrlModel);
        }
        return LIZJ(simVideoUrlModel);
    }

    public static void LJFF(long j, long j2, String str) {
        InterfaceC46911Ib5 putIfAbsent;
        InterfaceC46911Ib5 interfaceC46911Ib5;
        InterfaceC46911Ib5 putIfAbsent2;
        if (j2 <= 0 || j <= 0 || str == null) {
            return;
        }
        String str2 = C46901Iav.LIZ.get(str);
        if (str2 != null) {
            ConcurrentHashMap<String, InterfaceC46911Ib5> concurrentHashMap = LIZ;
            InterfaceC46911Ib5 interfaceC46911Ib52 = concurrentHashMap.get(str2);
            if (interfaceC46911Ib52 == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(str2, (interfaceC46911Ib52 = new C46906Ib0(str2)))) != null) {
                interfaceC46911Ib52 = putIfAbsent2;
            }
            interfaceC46911Ib5 = interfaceC46911Ib52;
        } else {
            String LIZLLL = LIZLLL(str);
            ConcurrentHashMap<String, InterfaceC46911Ib5> concurrentHashMap2 = LIZ;
            InterfaceC46911Ib5 interfaceC46911Ib53 = concurrentHashMap2.get(LIZLLL);
            if (interfaceC46911Ib53 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(LIZLLL, (interfaceC46911Ib53 = new C46908Ib2(LIZLLL)))) != null) {
                interfaceC46911Ib53 = putIfAbsent;
            }
            interfaceC46911Ib5 = interfaceC46911Ib53;
        }
        interfaceC46911Ib5.LIZ(j, j2, str);
    }
}
