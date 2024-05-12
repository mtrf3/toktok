package X;

import Y.IDComparatorS28S0000000;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.livesetting.game.BannerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25260yw {
    public final int LIZ;
    public final LinkedList<BannerInfo> LIZIZ;
    public LinkedHashSet<C25240yu> LIZJ;
    public LinkedHashSet<C25240yu> LIZLLL;
    public final C30554Byw<String> LJ;
    public final C30554Byw<String> LJFF;
    public boolean LJI;
    public final String LJII;

    public final void LIZIZ() {
        Iterator<C25240yu> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            LIZJ(it.next().LIZIZ);
        }
        this.LIZJ.clear();
        this.LIZLLL.clear();
    }

    public final C25240yu LIZ(BannerWidget bannerWidget) {
        Iterator<BannerInfo> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            BannerInfo next = it.next();
            if (o.LJ(bannerWidget.LL(), next.name)) {
                return new C25240yu(next, bannerWidget);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bannerWidget not found");
        LIZ.append(bannerWidget.LL());
        C0NB.LIZ(X1D.LIZIZ(LIZ));
        return null;
    }

    public final void LIZJ(BannerWidget bannerWidget) {
        if (!o.LJ(this.LJII, bannerWidget.LJLJJI) || o.LJ(this.LJII, "else")) {
            return;
        }
        bannerWidget.LLFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII);
        LIZ.append(bannerWidget.LL());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (bannerWidget.LJLJJLL) {
            this.LJFF.LIZLLL(String.valueOf(System.currentTimeMillis()), LIZIZ);
        }
        if (bannerWidget.LJLJJL == Integer.MAX_VALUE) {
            return;
        }
        String LIZIZ2 = this.LJ.LIZIZ(LIZIZ);
        if (LIZIZ2 == null) {
            LIZIZ2 = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJ.LIZLLL(String.valueOf(CastIntegerProtector.parseInt(LIZIZ2) + 1), LIZIZ);
    }

    public final void LIZLLL(boolean z) {
        List LLILII = ORZ.LLILII(new IDComparatorS28S0000000(17), this.LIZJ);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : LLILII) {
            int i2 = i + 1;
            if (i >= 0) {
                if (i < this.LIZ) {
                    arrayList.add(obj);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LinkedHashSet<C25240yu> linkedHashSet = new LinkedHashSet<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C25240yu c25240yu = (C25240yu) it.next();
            linkedHashSet.add(c25240yu);
            if (!c25240yu.LIZ.compatible) {
                break;
            }
        }
        if (z) {
            Iterator<C25240yu> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                C25240yu next = it2.next();
                if (!linkedHashSet.contains(next)) {
                    next.LIZIZ.LLF(false);
                }
            }
        }
        this.LIZLLL = linkedHashSet;
    }

    public C25260yw(LiveMode liveMode, int i, LinkedList<BannerInfo> linkedList) {
        String str;
        o.LJIIIZ(liveMode, "liveMode");
        this.LIZ = i;
        this.LIZIZ = linkedList;
        this.LIZJ = new LinkedHashSet<>();
        this.LIZLLL = new LinkedHashSet<>();
        this.LJ = InterfaceC30442Bx8.S0;
        this.LJFF = InterfaceC30442Bx8.R0;
        int i2 = C25250yv.LIZ[liveMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "else";
                } else {
                    str = LiveMode.LIVE_STUDIO.logStreamingType;
                }
            } else {
                str = LiveMode.THIRD_PARTY.logStreamingType;
            }
        } else {
            str = LiveMode.SCREEN_RECORD.logStreamingType;
        }
        this.LJII = str;
    }
}
