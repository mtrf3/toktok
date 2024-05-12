package com.ss.android.ugc.aweme.awemeservice;

import X.C10K;
import X.C51630KOc;
import X.C51645KOr;
import X.C58096Mr6;
import X.C72075SQl;
import X.C72076SQm;
import X.C76K;
import X.InterfaceC72081SQr;
import Y.ACallableS115S0100000_12;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import defpackage.i0;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AwemeService implements IAwemeService {
    public static IAwemeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAwemeService.class, false);
        if (LIZ != null) {
            return (IAwemeService) LIZ;
        }
        if (C58096Mr6.LLJILJIL == null) {
            synchronized (IAwemeService.class) {
                if (C58096Mr6.LLJILJIL == null) {
                    C58096Mr6.LLJILJIL = new AwemeService();
                }
            }
        }
        return C58096Mr6.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void clearCache() {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            C10K.LIZJ(new ACallableS115S0100000_12(LIZ, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void h6() {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            Collection<Aweme> values = LIZ.LIZ.values();
            o.LJI(values);
            for (Aweme aweme : values) {
                o.LJI(aweme);
                aweme.setFeedCount(0L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme R1(Aweme aweme) {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            return LIZ.LJ(aweme);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void e6(String str) {
        AwemeStatistics LIZIZ;
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            C72075SQl LIZ2 = C76K.LIZ();
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ(str)) != null) {
                LIZIZ.setCommentCount(LIZIZ.getCommentCount() + 1);
            }
            Aweme LIZIZ2 = LIZ.LIZIZ(str);
            AwemeStatistics LIZLLL = C72076SQm.LIZLLL(LIZIZ2);
            if (LIZLLL != null) {
                LIZLLL.setCommentCount(LIZLLL.getCommentCount() + 1);
                InterfaceC72081SQr<String> interfaceC72081SQr = LIZ.LIZ;
                o.LJI(LIZIZ2);
                interfaceC72081SQr.LIZ(LIZIZ2, LIZIZ2.getAid());
            }
        }
        if (str != null) {
            C51645KOr.LIZIZ.e6(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme i6(String str) {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            return LIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme k6(String str) {
        C72075SQl LIZ = C76K.LIZ();
        if (LIZ != null) {
            return LIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme m6(String str) {
        C72075SQl LIZ = C76K.LIZ();
        if (LIZ != null) {
            for (Aweme aweme : ((ConcurrentHashMap) LIZ.LIZ).values()) {
                o.LJI(aweme);
                if (TextUtils.equals(aweme.getAwemeRawAdIdStr(), str)) {
                    return aweme;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme n6(String str) {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            String LJFF = i0.LJFF(str, "type0");
            String LJFF2 = i0.LJFF(str, "type1");
            if (LIZ.LIZ.containsKey(LJFF)) {
                return LIZ.LIZ.get(LJFF);
            }
            if (LIZ.LIZ.containsKey(LJFF2)) {
                return LIZ.LIZ.get(LJFF2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme o6(String str) {
        C72075SQl LIZ = C76K.LIZ();
        if (LIZ != null) {
            return LIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void d6(long j, String str) {
        AwemeStatistics LIZIZ;
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            C72075SQl LIZ2 = C76K.LIZ();
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ(str)) != null) {
                LIZIZ.setCommentCount(j);
            }
            Aweme LIZIZ2 = LIZ.LIZIZ(str);
            AwemeStatistics LIZLLL = C72076SQm.LIZLLL(LIZIZ2);
            if (LIZLLL != null) {
                LIZLLL.setCommentCount(j);
                InterfaceC72081SQr<String> interfaceC72081SQr = LIZ.LIZ;
                o.LJI(LIZIZ2);
                interfaceC72081SQr.LIZ(LIZIZ2, LIZIZ2.getAid());
            }
        }
        if (str != null) {
            C51645KOr.LIZIZ.LIZJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme f6(int i, String str) {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            return LIZ.LIZJ(i, str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void g6(int i, String str) {
        Aweme LIZ;
        C72076SQm LIZ2 = C51630KOc.LIZ();
        if (LIZ2 != null) {
            C72075SQl LIZ3 = C76K.LIZ();
            if (LIZ3 != null && !TextUtils.isEmpty(str) && (LIZ = LIZ3.LIZ(str)) != null) {
                LIZ.setCollectStatus(i);
                AwemeStatistics statistics = LIZ.getStatistics();
                if (statistics != null) {
                    if (i != 0) {
                        if (i == 1) {
                            if (statistics.getCollectCount() < 0) {
                                statistics.setCollectCount(0L);
                            }
                            statistics.setCollectCount(statistics.getCollectCount() + 1);
                        }
                    } else if (statistics.getCollectCount() > 0) {
                        statistics.setCollectCount(statistics.getCollectCount() - 1);
                    }
                    LIZ.setStatistics(statistics);
                }
            }
            Aweme LIZIZ = LIZ2.LIZIZ(str);
            if (LIZIZ != null) {
                LIZIZ.setCollectStatus(i);
                AwemeStatistics statistics2 = LIZIZ.getStatistics();
                if (statistics2 != null) {
                    if (i != 0) {
                        if (i == 1) {
                            statistics2.setCollectCount(statistics2.getCollectCount() + 1);
                        }
                    } else if (statistics2.getCollectCount() > 0) {
                        statistics2.setCollectCount(statistics2.getCollectCount() - 1);
                    }
                    LIZIZ.setStatistics(statistics2);
                }
                if (LIZIZ.getAid() != null) {
                    LIZ2.LIZ.LIZ(LIZIZ, LIZIZ.getAid());
                }
            }
            if (i == 1) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("collect_video", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void j6(long j, String str) {
        AwemeStatistics LIZIZ;
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            C72075SQl LIZ2 = C76K.LIZ();
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ(str)) != null) {
                LIZIZ.setDiggCount(j);
            }
            Aweme LIZIZ2 = LIZ.LIZIZ(str);
            AwemeStatistics LIZLLL = C72076SQm.LIZLLL(LIZIZ2);
            if (LIZLLL == null) {
                return;
            }
            LIZLLL.setDiggCount(j);
            InterfaceC72081SQr<String> interfaceC72081SQr = LIZ.LIZ;
            o.LJI(LIZIZ2);
            interfaceC72081SQr.LIZ(LIZIZ2, LIZIZ2.getAid());
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void l6(int i, String str) {
        Aweme LIZ;
        C72076SQm LIZ2 = C51630KOc.LIZ();
        if (LIZ2 == null || TextUtils.isEmpty(str)) {
            return;
        }
        C72075SQl LIZ3 = C76K.LIZ();
        if (LIZ3 != null && !TextUtils.isEmpty(str) && (LIZ = LIZ3.LIZ(str)) != null) {
            LIZ.setUserDigg(i);
            if (i == 0) {
                AwemeStatistics LIZIZ = LIZ3.LIZIZ(str);
                if (LIZIZ != null) {
                    LIZIZ.setDiggCount(LIZIZ.getDiggCount() - 1);
                }
            } else {
                AwemeStatistics LIZIZ2 = LIZ3.LIZIZ(str);
                if (LIZIZ2 != null) {
                    LIZIZ2.setDiggCount(LIZIZ2.getDiggCount() + 1);
                }
            }
        }
        Aweme LIZIZ3 = LIZ2.LIZIZ(str);
        if (LIZIZ3 == null) {
            Aweme LIZJ = LIZ2.LIZJ(0, str);
            if (LIZJ != null) {
                LIZ2.LJIIIIZZ(i, LIZJ);
            }
            Aweme LIZJ2 = LIZ2.LIZJ(1, str);
            if (LIZJ2 == null) {
                return;
            }
            LIZ2.LJIIIIZZ(i, LIZJ2);
            return;
        }
        LIZ2.LJIIIIZZ(i, LIZIZ3);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme p6(int i, Aweme aweme) {
        C72076SQm LIZ = C51630KOc.LIZ();
        if (LIZ != null) {
            return LIZ.LJII(i, aweme);
        }
        return null;
    }
}
