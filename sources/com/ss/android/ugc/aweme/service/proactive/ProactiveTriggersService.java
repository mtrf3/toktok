package com.ss.android.ugc.aweme.service.proactive;

import X.ActivityC45651qj;
import X.C188727au;
import X.C38987FRv;
import X.C38995FSd;
import X.C46451IKx;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C78449Uqb;
import X.FMX;
import X.HG3;
import X.ORV;
import X.RBX;
import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ProactiveTriggersService implements IProactiveTriggersService {
    public final ORV<Long> LIZ;
    public final ORV<Long> LIZIZ;
    public final Boolean LIZJ;
    public ProactiveLoginConfig LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public Boolean LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public final C62822Ol8 LJIIJJI;

    public static IProactiveTriggersService LJI() {
        Object LIZ = C58096Mr6.LIZ(IProactiveTriggersService.class, false);
        if (LIZ != null) {
            return (IProactiveTriggersService) LIZ;
        }
        if (C58096Mr6.u5 == null) {
            synchronized (IProactiveTriggersService.class) {
                if (C58096Mr6.u5 == null) {
                    C58096Mr6.u5 = new ProactiveTriggersService();
                }
            }
        }
        return C58096Mr6.u5;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZIZ() {
        int i;
        ORV<Long> orv = this.LIZIZ;
        if (orv != null) {
            int i2 = this.LIZLLL.vv;
            Integer num = this.LJIIIIZZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            int max = Math.max(i2, i) + 1;
            orv.addFirst(Long.valueOf(System.currentTimeMillis()));
            if (orv.size() > max) {
                orv.removeLast();
            }
            if (orv.size() == this.LIZLLL.vv) {
                FMX.onEventV3("proactive_login_pass_vv_check");
            }
            LJIIIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJ() {
        PopupManager.LIZJ(C78449Uqb.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProactiveTriggersService() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService.<init>():void");
    }

    public final void LJIIIZ() {
        C38995FSd.LIZIZ().submit(new ARunnableS46S0100000_10(this, 55));
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LJFF(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ProactiveLoginConfig proactiveLoginConfig = (ProactiveLoginConfig) GsonHolder.LIZLLL().LIZ().LJI(str, ProactiveLoginConfig.class);
            if (proactiveLoginConfig != null) {
                LJIIIIZZ(proactiveLoginConfig);
                String str2 = proactiveLoginConfig.decision;
                int i2 = proactiveLoginConfig.design;
                int i3 = proactiveLoginConfig.vv;
                if (i3 <= 0) {
                    i3 = 8;
                }
                Integer num = proactiveLoginConfig.minHoursIntervalLoginPanel;
                int i4 = -1;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                Integer valueOf = Integer.valueOf(i);
                Integer num2 = proactiveLoginConfig.dayLimitLoginPanel;
                if (num2 != null) {
                    i4 = num2.intValue();
                }
                this.LIZLLL = new ProactiveLoginConfig(str2, i2, i3, valueOf, Integer.valueOf(i4));
            }
            LJIIIZ();
        } catch (Exception unused) {
        }
    }

    public final void LJIIIIZZ(ProactiveLoginConfig proactiveLoginConfig) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("decision", proactiveLoginConfig.decision);
        c188727au.LIZLLL(proactiveLoginConfig.design, "design");
        if (o.LJ(this.LIZJ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_first_time", str);
        c188727au.LJFF(proactiveLoginConfig.minHoursIntervalLoginPanel, "min_hours_interval_login_panel");
        c188727au.LJFF(proactiveLoginConfig.dayLimitLoginPanel, "day_limit_login_panel");
        FMX.LJIIL("proactive_config", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZJ(ActivityC45651qj activityC45651qj, String str) {
        long j;
        ORV<Long> orv;
        Integer num;
        boolean z;
        String str2;
        Integer num2;
        int i;
        if ((!C46451IKx.LIZIZ) || ((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        ORV<Long> orv2 = this.LIZ;
        long j2 = 86400000;
        if (orv2 == null) {
            return;
        }
        int i2 = 3;
        if (!LJII(orv2, 1, 3)) {
            return;
        }
        ProactiveLoginConfig proactiveLoginConfig = this.LIZLLL;
        Integer num3 = proactiveLoginConfig.minHoursIntervalLoginPanel;
        if (num3 != null && num3.intValue() != -1 && (num2 = proactiveLoginConfig.dayLimitLoginPanel) != null && num2.intValue() != -1) {
            Integer num4 = this.LIZLLL.minHoursIntervalLoginPanel;
            if (num4 != null) {
                i = num4.intValue();
            } else {
                i = 1;
            }
            Integer num5 = this.LIZLLL.dayLimitLoginPanel;
            if (num5 != null) {
                i2 = num5.intValue();
            }
            if (!LJII(orv2, i, i2)) {
                return;
            }
        } else {
            int size = orv2.size();
            long currentTimeMillis = System.currentTimeMillis();
            if (size >= 1) {
                if ((1 * 86400000) + orv2.get(0).longValue() >= currentTimeMillis) {
                    return;
                }
                if (size >= 2) {
                    if ((7 * 86400000) + orv2.get(1).longValue() >= currentTimeMillis) {
                        return;
                    }
                    if (size >= 5) {
                        if ((30 * 86400000) + orv2.get(4).longValue() >= currentTimeMillis) {
                            return;
                        }
                    }
                }
            }
        }
        if (o.LJ(this.LJII, Boolean.TRUE)) {
            this.LJ = true;
            this.LJII = Boolean.FALSE;
            LJIIIZ();
        } else {
            long LIZ = C38987FRv.LIZ();
            Long l = this.LJIIIZ;
            if (l != null) {
                j2 = l.longValue();
            }
            Long l2 = this.LJIIJ;
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 604800000;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (j2 + LIZ < currentTimeMillis2 && LIZ + j > currentTimeMillis2 && (num = this.LJIIIIZZ) != null) {
                int intValue = num.intValue();
                ORV<Long> orv3 = this.LIZIZ;
                if (orv3 != null && orv3.size() >= intValue) {
                    this.LJ = true;
                }
            }
            if (!o.LJ(this.LIZLLL.decision, "1") || (orv = this.LIZIZ) == null || orv.size() < this.LIZLLL.vv) {
                return;
            }
        }
        if (!(activityC45651qj instanceof ActivityC45651qj)) {
            return;
        }
        if (this.LIZLLL.design == 2) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (!this.LJ) {
            str2 = "";
        } else {
            str3 = this.LJFF;
            str2 = this.LJI;
        }
        PopupManager.LJIIL(new C78449Uqb(activityC45651qj, z, str3, str2, str, new AqS160S0100000_10(this, 335)));
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZLLL(String str, String str2) {
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = Boolean.TRUE;
    }

    public static boolean LJII(ORV orv, int i, int i2) {
        if (i2 == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int max = Math.max(i, 1);
        if (orv.size() < 1) {
            return true;
        }
        if ((max * 3600000) + ((Number) orv.get(0)).longValue() >= currentTimeMillis) {
            return false;
        }
        int min = Math.min(Math.max(i2, 1), 3);
        if (orv.size() < min) {
            return true;
        }
        if ((1 * 86400000) + ((Number) orv.get(min - 1)).longValue() >= currentTimeMillis) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService
    public final void LIZ(String str, String str2, int i, Long l, Long l2) {
        this.LJFF = str;
        this.LJI = str2;
        this.LJIIIIZZ = Integer.valueOf(i);
        this.LJIIIZ = l;
        this.LJIIJ = l2;
    }
}
