package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.UkZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78075UkZ {
    public final InterfaceC65784Pro<List<C78072UkW>> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public List<C69608RTo> LJIIJJI;
    public List<C69608RTo> LJIIL;
    public final SimpleDateFormat LJIILIIL;
    public final C73318Sq2 LJIILJJIL;
    public final C73318Sq2 LJIILL;

    public C78075UkZ(AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZ = aqS163S0100000_13;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJIIJJI = c61878OQg;
        this.LJIIL = c61878OQg;
        this.LJIILJJIL = new C73318Sq2();
        this.LJIILL = new C73318Sq2();
        C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "initMonitor");
        try {
            this.LJIILIIL = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
        } catch (Exception unused) {
            C0NB.LJ("LiveGiftTrayBlockMonitor", "SimpleDateFormat init error");
        }
        this.LIZLLL = System.currentTimeMillis();
        this.LJIILL.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new C78085Ukj(this)));
    }

    public static boolean LIZ(List list) {
        boolean z = false;
        try {
            if (!((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C69608RTo) it.next()).LJFF) {
                        z = true;
                        break;
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (z) {
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onDetect big gift might in downloading state, skip");
        }
        return z;
    }

    public final String LIZJ(Long l) {
        String format;
        if (l != null && l.longValue() > 0) {
            SimpleDateFormat simpleDateFormat = this.LJIILIIL;
            if (simpleDateFormat == null || (format = simpleDateFormat.format(new Date(l.longValue()))) == null) {
                return l.toString();
            }
            return format;
        }
        return "";
    }

    public static List LIZIZ(int i, List list) {
        int i2;
        int i3;
        Gift gift;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C78072UkW c78072UkW = (C78072UkW) it.next();
            if (c78072UkW != null && (i2 = c78072UkW.LJJIIZ) == i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c78072UkW.LJJJJIZL);
                LIZ.append('-');
                LIZ.append(c78072UkW.LJJJJZI);
                String LIZIZ = X1D.LIZIZ(LIZ);
                GiftMessage giftMessage = c78072UkW.LIZ;
                if (giftMessage != null && (gift = giftMessage.mGift) != null) {
                    i3 = gift.type;
                } else {
                    i3 = 0;
                }
                arrayList.add(new C69608RTo(c78072UkW.LJJJJIZL, LIZIZ, i2, i3, c78072UkW.LJIIIZ, c78072UkW.hashCode(), c78072UkW.LJJLIIIJ));
            }
        }
        return arrayList;
    }
}
