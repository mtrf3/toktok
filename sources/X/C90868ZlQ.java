package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.ZlQ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90868ZlQ extends AbstractC90611ZhH implements InterfaceC90528Zfw, InterfaceC90530Zfy {
    public static final ArrayList<IntentFilter> LJZI;
    public static final ArrayList<IntentFilter> LJZL;
    public final ZYH LJLJLLL;
    public final Object LJLL;
    public final Object LJLLI;
    public final Object LJLLILLLL;
    public final Object LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final ArrayList<ZYF> LJLZ;
    public final ArrayList<ZYG> LJZ;

    @Override // X.InterfaceC90528Zfw
    public final void LIZ() {
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJFF() {
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJI() {
    }

    public Object LJIJJLI() {
        throw null;
    }

    public void LJJIIJ(Object obj) {
        throw null;
    }

    public void LJJIIJZLJL() {
        throw null;
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList<IntentFilter> arrayList = new ArrayList<>();
        LJZI = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
        LJZL = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public final void LJJIII() {
        C90098ZXq c90098ZXq = new C90098ZXq();
        int size = this.LJLZ.size();
        for (int i = 0; i < size; i++) {
            c90098ZXq.LIZ(((ZYF) ListProtector.get(this.LJLZ, i)).LIZJ);
        }
        LJIILL(new C90099ZXr(c90098ZXq.LIZ, c90098ZXq.LIZIZ));
    }

    public final void LJJIIZ() {
        LJJIIJZLJL();
        MediaRouter mediaRouter = (MediaRouter) this.LJLL;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= LJIIZILJ(it.next());
        }
        if (z) {
            LJJIII();
        }
    }

    public static ZYG LJIL(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof ZYG) {
            return (ZYG) tag;
        }
        return null;
    }

    @Override // X.InterfaceC90528Zfw
    public final void LIZJ(Object obj) {
        ZY4 LIZ;
        if (obj != ((MediaRouter) this.LJLL).getSelectedRoute(8388611)) {
            return;
        }
        ZYG LJIL = LJIL(obj);
        if (LJIL != null) {
            LJIL.LIZ.LJIIJJI();
            return;
        }
        int LJIJ = LJIJ(obj);
        if (LJIJ < 0) {
            return;
        }
        ZYF zyf = (ZYF) ListProtector.get(this.LJLZ, LJIJ);
        ZYH zyh = this.LJLJLLL;
        String str = zyf.LIZIZ;
        C90605ZhB c90605ZhB = (C90605ZhB) zyh;
        c90605ZhB.LJIIJ.removeMessages(262);
        ZY2 LIZLLL = c90605ZhB.LIZLLL(c90605ZhB.LJIIJJI);
        if (LIZLLL == null || (LIZ = LIZLLL.LIZ(str)) == null) {
            return;
        }
        LIZ.LJIIJJI();
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJ(Object obj) {
        int LJIJ;
        if (LJIL(obj) == null && (LJIJ = LJIJ(obj)) >= 0) {
            ListProtector.remove(this.LJLZ, LJIJ);
            LJJIII();
        }
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJII(Object obj) {
        int LJIJ;
        String str;
        if (LJIL(obj) == null && (LJIJ = LJIJ(obj)) >= 0) {
            ZYF zyf = (ZYF) ListProtector.get(this.LJLZ, LJIJ);
            String str2 = zyf.LIZIZ;
            CharSequence name = ((MediaRouter.RouteInfo) zyf.LIZ).getName(this.LJLIL);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            C90088ZXg c90088ZXg = new C90088ZXg(str2, str);
            LJJ(zyf, c90088ZXg);
            zyf.LIZJ = c90088ZXg.LIZIZ();
            LJJIII();
        }
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJIIIZ(Object obj) {
        if (LJIIZILJ(obj)) {
            LJJIII();
        }
    }

    @Override // X.InterfaceC90528Zfw
    public final void LJIIJ(Object obj) {
        int LJIJ;
        if (LJIL(obj) == null && (LJIJ = LJIJ(obj)) >= 0) {
            ZYF zyf = (ZYF) ListProtector.get(this.LJLZ, LJIJ);
            int volume = ((MediaRouter.RouteInfo) obj).getVolume();
            if (volume != zyf.LIZJ.LJFF()) {
                C90088ZXg c90088ZXg = new C90088ZXg(zyf.LIZJ);
                c90088ZXg.LIZ.putInt("volume", volume);
                zyf.LIZJ = c90088ZXg.LIZIZ();
                LJJIII();
            }
        }
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90096ZXo LJIIL(String str) {
        int LJIJI = LJIJI(str);
        if (LJIJI >= 0) {
            return new C90610ZhG(((ZYF) ListProtector.get(this.LJLZ, LJIJI)).LIZ);
        }
        return null;
    }

    @Override // X.AbstractC90097ZXp
    public final void LJIILJJIL(C90524Zfs c90524Zfs) {
        boolean z;
        int i = 0;
        if (c90524Zfs != null) {
            c90524Zfs.LIZ();
            C90101ZXt c90101ZXt = c90524Zfs.LIZIZ;
            c90101ZXt.LIZ();
            List<String> list = c90101ZXt.LIZIZ;
            int size = list.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) ListProtector.get(list, i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i2 |= 2;
                } else {
                    i2 |= 8388608;
                }
                i++;
            }
            z = c90524Zfs.LIZIZ();
            i = i2;
        } else {
            z = false;
        }
        if (this.LJLLL != i || this.LJLLLL != z) {
            this.LJLLL = i;
            this.LJLLLL = z;
            LJJIIZ();
        }
    }

    public final boolean LJIIZILJ(Object obj) {
        boolean z;
        String str;
        String LLLZI;
        String LLLZI2;
        if (LJIL(obj) != null || LJIJ(obj) >= 0) {
            return false;
        }
        if (LJIJJLI() == obj) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            LLLZI = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.LJLIL);
            if (name == null) {
                str = "";
            } else {
                str = name.toString();
            }
            objArr[0] = Integer.valueOf(str.hashCode());
            LLLZI = C16880lQ.LLLZI(locale, "ROUTE_%08x", objArr);
        }
        if (LJIJI(LLLZI) >= 0) {
            int i = 2;
            while (true) {
                LLLZI2 = C16880lQ.LLLZI(Locale.US, "%s_%d", new Object[]{LLLZI, Integer.valueOf(i)});
                if (LJIJI(LLLZI2) < 0) {
                    break;
                }
                i++;
            }
            LLLZI = LLLZI2;
        }
        ZYF zyf = new ZYF(obj, LLLZI);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(this.LJLIL);
        if (name2 != null) {
            str2 = name2.toString();
        }
        C90088ZXg c90088ZXg = new C90088ZXg(LLLZI, str2);
        LJJ(zyf, c90088ZXg);
        zyf.LIZJ = c90088ZXg.LIZIZ();
        this.LJLZ.add(zyf);
        return true;
    }

    public final int LJIJ(Object obj) {
        int size = this.LJLZ.size();
        for (int i = 0; i < size; i++) {
            if (((ZYF) ListProtector.get(this.LJLZ, i)).LIZ == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int LJIJI(String str) {
        int size = this.LJLZ.size();
        for (int i = 0; i < size; i++) {
            if (((ZYF) ListProtector.get(this.LJLZ, i)).LIZIZ.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int LJIJJ(ZY4 zy4) {
        int size = this.LJZ.size();
        for (int i = 0; i < size; i++) {
            if (((ZYG) ListProtector.get(this.LJZ, i)).LIZ == zy4) {
                return i;
            }
        }
        return -1;
    }

    public final void LJJI(ZY4 zy4) {
        if (zy4.LIZJ() != this) {
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.LJLL).createUserRoute((MediaRouter.RouteCategory) this.LJLLJ);
            ZYG zyg = new ZYG(zy4, createUserRoute);
            createUserRoute.setTag(zyg);
            createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) this.LJLLILLLL);
            LJJIIZI(zyg);
            this.LJZ.add(zyg);
            ((MediaRouter) this.LJLL).addUserRoute(createUserRoute);
            return;
        }
        int LJIJ = LJIJ(((MediaRouter) this.LJLL).getSelectedRoute(8388611));
        if (LJIJ < 0 || !((ZYF) ListProtector.get(this.LJLZ, LJIJ)).LIZIZ.equals(zy4.LIZIZ)) {
            return;
        }
        zy4.LJIIJJI();
    }

    public final void LJJIFFI(ZY4 zy4) {
        int LJIJJ;
        if (zy4.LIZJ() != this && (LJIJJ = LJIJJ(zy4)) >= 0) {
            ZYG zyg = (ZYG) ListProtector.remove(this.LJZ, LJIJJ);
            ((MediaRouter.RouteInfo) zyg.LIZIZ).setTag(null);
            ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setVolumeCallback(null);
            ((MediaRouter) this.LJLL).removeUserRoute((MediaRouter.UserRouteInfo) zyg.LIZIZ);
        }
    }

    public final void LJJII(ZY4 zy4) {
        if (!zy4.LJI()) {
            return;
        }
        if (zy4.LIZJ() != this) {
            int LJIJJ = LJIJJ(zy4);
            if (LJIJJ >= 0) {
                LJJIIJ(((ZYG) ListProtector.get(this.LJZ, LJIJJ)).LIZIZ);
                return;
            }
            return;
        }
        int LJIJI = LJIJI(zy4.LIZIZ);
        if (LJIJI < 0) {
            return;
        }
        LJJIIJ(((ZYF) ListProtector.get(this.LJLZ, LJIJI)).LIZ);
    }

    public void LJJIIZI(ZYG zyg) {
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setName(zyg.LIZ.LIZLLL);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setPlaybackType(zyg.LIZ.LJIIJ);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setPlaybackStream(zyg.LIZ.LJIIJJI);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setVolume(zyg.LIZ.LJIILJJIL);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setVolumeMax(zyg.LIZ.LJIILL);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setVolumeHandling(zyg.LIZ.LJIILIIL);
    }

    public C90868ZlQ(Context context, ZYH zyh) {
        super(context);
        this.LJLZ = new ArrayList<>();
        this.LJZ = new ArrayList<>();
        this.LJLJLLL = zyh;
        Object LLILL = C16880lQ.LLILL(context, "media_router");
        this.LJLL = LLILL;
        this.LJLLI = new C90842Zl0((C90915ZmB) this);
        this.LJLLILLLL = new C90531Zfz(this);
        this.LJLLJ = ((MediaRouter) LLILL).createRouteCategory((CharSequence) context.getResources().getString(R.string.b7), false);
        LJJIIZ();
    }

    @Override // X.InterfaceC90530Zfy
    public final void LIZLLL(int i, Object obj) {
        ZYG LJIL = LJIL(obj);
        if (LJIL != null) {
            LJIL.LIZ.LJIIJ(i);
        }
    }

    @Override // X.InterfaceC90530Zfy
    public final void LJIIIIZZ(int i, Object obj) {
        ZYG LJIL = LJIL(obj);
        if (LJIL != null) {
            LJIL.LIZ.LJIIIZ(i);
        }
    }

    public void LJJ(ZYF zyf, C90088ZXg c90088ZXg) {
        int supportedTypes = ((MediaRouter.RouteInfo) zyf.LIZ).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            c90088ZXg.LIZ(LJZI);
        }
        if ((supportedTypes & 2) != 0) {
            c90088ZXg.LIZ(LJZL);
        }
        c90088ZXg.LIZ.putInt("playbackType", ((MediaRouter.RouteInfo) zyf.LIZ).getPlaybackType());
        c90088ZXg.LIZ.putInt("playbackStream", ((MediaRouter.RouteInfo) zyf.LIZ).getPlaybackStream());
        c90088ZXg.LIZ.putInt("volume", ((MediaRouter.RouteInfo) zyf.LIZ).getVolume());
        c90088ZXg.LIZ.putInt("volumeMax", ((MediaRouter.RouteInfo) zyf.LIZ).getVolumeMax());
        c90088ZXg.LIZ.putInt("volumeHandling", ((MediaRouter.RouteInfo) zyf.LIZ).getVolumeHandling());
    }
}
