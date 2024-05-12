package com.ss.android.ugc.aweme.commercialize.measurement.mrc;

import X.AbstractC73672Svk;
import X.C19N;
import X.C47261Igj;
import X.C59989NgX;
import X.C73411SrX;
import X.C73428Sro;
import X.C73454SsE;
import X.C73969T1h;
import X.C77275UUl;
import X.EnumC58698N1y;
import X.IL1;
import X.InterfaceC59990NgY;
import X.NBY;
import X.NT4;
import X.NT5;
import X.OSZ;
import X.T16;
import X.X1D;
import X.YH0;
import X.YH2;
import X.YH3;
import X.YH7;
import X.YH8;
import X.YH9;
import Y.AfS36S0101000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MRCManager implements IMRCManager {
    public final Map<String, YH2> LIZ = new LinkedHashMap();
    public final Map<String, OSZ<Aweme, NT4>> LIZIZ = new LinkedHashMap();
    public final Set<NT4> LIZJ = C77275UUl.LJIIIIZZ(NT4.RECOMMEND_FEED, NT4.FOLLOWING_FEED, NT4.POPULAR_FEED);

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZIZ(String sourceId) {
        OSZ osz;
        o.LJIIIZ(sourceId, "sourceId");
        if (!ujb.o.LJJJJJL(sourceId) && (osz = (OSZ) ((LinkedHashMap) this.LIZIZ).get(sourceId)) != null) {
            Aweme aweme = (Aweme) osz.getFirst();
            Object second = osz.getSecond();
            if (YH8.LIZ().enableMRC && aweme.isAd() && this.LIZJ.contains(second)) {
                if (((LinkedHashMap) this.LIZ).get(LIZLLL((Aweme) osz.getFirst(), (NT4) osz.getSecond())) != null) {
                    LIZJ("break", (Aweme) osz.getFirst(), (NT4) osz.getSecond());
                }
            }
        }
    }

    public static String LIZLLL(Aweme aweme, NT4 nt4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getAid());
        LIZ.append('_');
        LIZ.append(aweme.getAwemeRawAdIdStr());
        LIZ.append('_');
        LIZ.append(nt4.getValue());
        String LJIIIIZZ = h.LJIIIIZZ(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(\"${aweme.aid}_…AdIdStr}_${scene.value}\")");
        return LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZJ(final String str, Aweme aweme, NT4 scene) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(scene, "scene");
        if (YH8.LIZ().enableMRC && aweme.isAd() && this.LIZJ.contains(scene)) {
            final YH2 yh2 = (YH2) ((LinkedHashMap) this.LIZ).get(LIZLLL(aweme, scene));
            if (yh2 != null) {
                final AqS68S1100000_15 aqS68S1100000_15 = new AqS68S1100000_15(str, yh2, 3);
                final long j = yh2.LJI;
                final boolean z = yh2.LJIIIZ;
                C59989NgX.LIZLLL.LIZJ(yh2.LIZIZ, yh2.LIZLLL, yh2.LJ, new NBY(EnumC58698N1y.USE_HALF, false, yh2.LIZJ.LIZJ, 12), new InterfaceC59990NgY() { // from class: X.YH4
                    @Override // X.InterfaceC59990NgY
                    public final void LIZ(C60002Ngk c60002Ngk) {
                        boolean z2;
                        YH2 this$0 = YH2.this;
                        boolean z3 = z;
                        String triggerFrom = str;
                        long j2 = j;
                        InterfaceC88472Yns interfaceC88472Yns = aqS68S1100000_15;
                        o.LJIIIZ(this$0, "this$0");
                        o.LJIIIZ(triggerFrom, "$triggerFrom");
                        this$0.LIZIZ(c60002Ngk);
                        if (this$0.LIZJ.LJFF && this$0.LJIIJ >= c60002Ngk.LJII) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((c60002Ngk.LIZ || z2) && z3) {
                            this$0.LIZJ(SystemClock.elapsedRealtime() - j2, triggerFrom);
                        }
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(Boolean.TRUE);
                        }
                    }
                });
                if (yh2.LJFF >= yh2.LJIIZILJ) {
                    yh2.LJII.LIZ();
                }
                yh2.LIZLLL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZ(Aweme aweme, Context context, NT4 scene, View adView, String sourceId, NT5 nt5) {
        C73454SsE LJJJ;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(sourceId, "sourceId");
        if (!ujb.o.LJJJJJL(sourceId) && YH8.LIZ().enableMRC && aweme.isAd() && this.LIZJ.contains(scene)) {
            this.LIZIZ.put(sourceId, new OSZ<>(aweme, scene));
            YH7 yh7 = new YH7(C47261Igj.LJJIJIIJI(YH3.VIEWABLE_1S, YH3.VIEWABLE_2S, YH3.VIEWABLE_6S, YH3.VIEWABLE_15S), YH8.LIZ().loopInterval, YH8.LIZ().enableCacheViewId, C19N.LJ("mrc_enable_polling_on_main", true), IL1.LIZIZ, new YH0(nt5, this));
            String LIZLLL = LIZLLL(aweme, scene);
            HashSet hashSet = new HashSet();
            hashSet.addAll(YH8.LIZ().viewIdWhiteList);
            YH2 yh2 = new YH2(sourceId, context, yh7, adView, hashSet);
            yh2.LIZLLL();
            YH9 yh9 = yh2.LJII;
            C73428Sro LJJL = AbstractC73672Svk.LJJIJIIJI(yh9.LIZ.LIZIZ, TimeUnit.MILLISECONDS).LJJL(C73969T1h.LIZIZ());
            if (yh9.LIZ.LJ) {
                LJJJ = LJJL.LJJJ(C73969T1h.LIZIZ());
            } else {
                LJJJ = LJJL.LJJJ(T16.LIZ());
            }
            yh9.LIZJ = (C73411SrX) LJJJ.LJJJLIIL(new AfS36S0101000_5(3, new AqS181S0100000_15(yh9, 218), 29), new AfS36S0101000_5(2, new AqS181S0100000_15(yh9, 219), 34));
            yh9.LIZIZ.LIZ();
            this.LIZ.put(LIZLLL, yh2);
        }
    }
}
