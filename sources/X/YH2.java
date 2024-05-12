package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YH2 implements YHC {
    public final String LIZ;
    public final Context LIZIZ;
    public final YH7 LIZJ;
    public final View LIZLLL;
    public final HashSet<String> LJ;
    public long LJFF;
    public long LJI;
    public final YH9 LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final java.util.Map<String, Float> LJIIL;
    public final long LJIILIIL;
    public long LJIILJJIL;
    public final AtomicLong LJIILL;
    public final AtomicLong LJIILLIIL;
    public final long LJIIZILJ;

    @Override // X.YHC
    public final void LIZ() {
        if (!o.LJ(this.LIZ, this.LIZJ.LJI.LIZ())) {
            this.LJIILLIIL.incrementAndGet();
        } else if (!this.LIZJ.LJI.isPlaying()) {
            this.LJIILLIIL.incrementAndGet();
            LIZLLL();
        } else {
            EnumC58698N1y enumC58698N1y = EnumC58698N1y.USE_HALF;
            YH7 yh7 = this.LIZJ;
            C59989NgX.LIZLLL.LIZJ(this.LIZIZ, this.LIZLLL, this.LJ, new NBY(enumC58698N1y, yh7.LIZLLL, yh7.LIZJ, 4), new InterfaceC59990NgY() { // from class: X.YH5
                @Override // X.InterfaceC59990NgY
                public final void LIZ(C60002Ngk c60002Ngk) {
                    YH2 this$0 = YH2.this;
                    o.LJIIIZ(this$0, "this$0");
                    this$0.LIZIZ(c60002Ngk);
                    if (c60002Ngk.LIZ) {
                        if (this$0.LJIIIZ) {
                            this$0.LJFF = SystemClock.elapsedRealtime() - this$0.LJI;
                        } else {
                            this$0.LJI = SystemClock.elapsedRealtime();
                            this$0.LJIIIZ = true;
                        }
                        this$0.LIZJ(this$0.LJFF, "polling");
                        return;
                    }
                    this$0.LIZLLL();
                }
            });
        }
        if (this.LJFF >= this.LJIIZILJ) {
            this.LJII.LIZ();
        }
    }

    public final void LIZLLL() {
        this.LJFF = 0L;
        this.LJI = SystemClock.elapsedRealtime();
        this.LJIIIZ = false;
    }

    @Override // X.YHC
    public final void end() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIL).entrySet()) {
            String str = (String) entry.getKey();
            float floatValue = ((Number) entry.getValue()).floatValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(',');
            LIZ.append(floatValue);
            LIZ.append(';');
            sb.append(X1D.LIZIZ(LIZ));
        }
        this.LJIILJJIL = SystemClock.elapsedRealtime() - this.LJIILIIL;
        YHB yhb = this.LIZJ.LJI;
        String str2 = this.LIZ;
        float f = this.LJIIJ;
        float f2 = this.LJIIJJI;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sv.toString()");
        yhb.LIZJ(str2, f, f2, sb2, this.LJIILJJIL, this.LJIILL.get(), this.LJIILLIIL.get());
    }

    public final void LIZIZ(C60002Ngk c60002Ngk) {
        this.LJIIJ = Math.max(this.LJIIJ, c60002Ngk.LJIIIIZZ);
        this.LJIILL.incrementAndGet();
        List<C60001Ngj> list = c60002Ngk.LJIIIZ;
        if (list != null) {
            float f = 0.0f;
            for (C60001Ngj c60001Ngj : list) {
                if (o.LJ("desc", c60001Ngj.LJLILLLLZI) || o.LJ("title", c60001Ngj.LJLILLLLZI)) {
                    f += c60001Ngj.LJLJI;
                }
                if (this.LJIIL.size() <= 20) {
                    if (c60001Ngj.LJLJI >= 0.005f) {
                        this.LJIIL.put(c60001Ngj.LJLILLLLZI, Float.valueOf(((float) Math.rint(r1 * r3)) / 100));
                    }
                }
            }
            this.LJIIJJI = Math.max(f, this.LJIIJJI);
        }
    }

    public final void LIZJ(long j, String str) {
        for (YH3 yh3 : this.LIZJ.LIZ) {
            if (j >= yh3.getDuration() && (this.LJIIIIZZ & yh3.getValue()) == 0) {
                this.LJIIIIZZ |= yh3.getValue();
                this.LIZJ.LJI.LIZIZ(this.LIZ, str, yh3);
            }
        }
    }

    public YH2(String id, Context context, YH7 yh7, View adView, HashSet<String> hashSet) {
        long longValue;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(adView, "adView");
        this.LIZ = id;
        this.LIZIZ = context;
        this.LIZJ = yh7;
        this.LIZLLL = adView;
        this.LJ = hashSet;
        this.LJII = new YH9(yh7, this);
        this.LJIIJ = -1.0f;
        this.LJIIL = new LinkedHashMap();
        this.LJIILIIL = SystemClock.elapsedRealtime();
        this.LJIILL = new AtomicLong();
        this.LJIILLIIL = new AtomicLong();
        List<YH3> list = yh7.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<YH3> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getDuration()));
        }
        if (arrayList.isEmpty()) {
            longValue = -1;
        } else {
            longValue = ((Number) ListProtector.get(arrayList, 0)).longValue();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                if (longValue < longValue2) {
                    longValue = longValue2;
                }
            }
        }
        this.LJIIZILJ = longValue;
    }
}
