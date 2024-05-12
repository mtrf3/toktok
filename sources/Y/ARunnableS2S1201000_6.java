package Y;

import X.ActivityC45651qj;
import X.C109434Rf;
import X.C141335gf;
import X.C16880lQ;
import X.C38612FDk;
import X.C38614FDm;
import X.C38619FDr;
import X.C38620FDs;
import X.C38805FKv;
import X.C3C5;
import X.C76800UCe;
import X.FE8;
import X.FL5;
import X.FL6;
import X.FL7;
import X.InterfaceC38613FDl;
import X.InterfaceC38616FDo;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.view.ContextThemeWrapper;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS61S1200000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ARunnableS2S1201000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1201000_6.LIZ$0():void");
    }

    public final void LIZ$1() {
        Object LIZ;
        System.currentTimeMillis();
        try {
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ2 = C38619FDr.LIZ();
            if (LIZ2 != null) {
                LIZ2.LJIILLIIL(this.s0);
            }
            ((InterfaceC38616FDo) this.l1).LIZJ((Context) this.l2);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            System.currentTimeMillis();
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ3 = C38619FDr.LIZ();
            if (LIZ3 != null) {
                LIZ3.LIZLLL(this.s0);
            }
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            FE8.LJII(this.i3, (InterfaceC38616FDo) this.l1);
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ4 = C38619FDr.LIZ();
            if (LIZ4 != null) {
                LIZ4.LJIILJJIL(this.s0, m10exceptionOrNullimpl);
            }
        }
    }

    public final void LIZ$2() {
        Object LIZ;
        System.currentTimeMillis();
        try {
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ2 = C38619FDr.LIZ();
            if (LIZ2 != null) {
                LIZ2.LJIILIIL(this.s0);
            }
            C38620FDs c38620FDs = (C38620FDs) this.l1;
            Context context = (Context) this.l2;
            o.LJIIJ(context, "context");
            if (C109434Rf.LIZJ(context) == null && !(context instanceof ContextThemeWrapper)) {
                C38612FDk c38612FDk = C38619FDr.LIZIZ;
                if (c38612FDk != null) {
                    int i = c38612FDk.LIZIZ;
                    if (i == 0) {
                        i = R.style.ul;
                    }
                    context = new C38614FDm(context, i);
                } else {
                    o.LJIJI("config");
                    throw null;
                }
            }
            c38620FDs.LIZJ(context);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            System.currentTimeMillis();
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ3 = C38619FDr.LIZ();
            if (LIZ3 != null) {
                LIZ3.LJIIJ(this.s0);
            }
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            FE8.LJII(this.i3, (C38620FDs) this.l1);
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ4 = C38619FDr.LIZ();
            if (LIZ4 != null) {
                LIZ4.LJIIL(this.s0, m10exceptionOrNullimpl);
            }
        }
    }

    public static final void run$0(ARunnableS2S1201000_6 aRunnableS2S1201000_6) {
        int i = aRunnableS2S1201000_6.i3;
        String url = aRunnableS2S1201000_6.s0;
        FL6 this$0 = (FL6) aRunnableS2S1201000_6.l1;
        AbsDownloadService this$1 = (AbsDownloadService) aRunnableS2S1201000_6.l2;
        o.LJIIIZ(url, "$url");
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(this$1, "this$1");
        Iterator<Integer> it = this$0.LIZJ.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            List list = (List) ((LinkedHashMap) this$1.LJLILLLLZI).get(Integer.valueOf(intValue));
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        ((FL7) it2.next()).onError(i, url);
                    } catch (RemoteException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        this$0.LIZJ.clear();
        this$1.LJLJI.remove(this$0.LIZ);
    }

    public static final void run$1(ARunnableS2S1201000_6 aRunnableS2S1201000_6) {
        boolean LIZ;
        try {
            aRunnableS2S1201000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1201000_6 aRunnableS2S1201000_6) {
        Object LIZ;
        switch (aRunnableS2S1201000_6.i3) {
            case 0:
                String str = aRunnableS2S1201000_6.s0;
                AqS61S1200000_6 aqS61S1200000_6 = new AqS61S1200000_6(str, (InterfaceC65784Pro) aRunnableS2S1201000_6.l1, (InterfaceC65784Pro) aRunnableS2S1201000_6.l2, 2);
                C38805FKv.LIZ.getClass();
                FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
                if (fl5 != null) {
                    try {
                        LIZ = (C76800UCe) aqS61S1200000_6.invoke();
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                        o.LJI(str);
                        fl5.LIZ();
                        return;
                    }
                    return;
                }
                aqS61S1200000_6.invoke();
                return;
            default:
                AbsDownloadService this$0 = (AbsDownloadService) aRunnableS2S1201000_6.l1;
                String str2 = aRunnableS2S1201000_6.s0;
                String str3 = (String) aRunnableS2S1201000_6.l2;
                o.LJIIIZ(this$0, "this$0");
                FL6 fl6 = (FL6) ((LinkedHashMap) this$0.LJLJI).get(str2);
                if (fl6 != null) {
                    fl6.LIZJ.add(Integer.valueOf(Binder.getCallingPid()));
                    String str4 = fl6.LIZIZ;
                    if (str4 == null) {
                        return;
                    }
                    fl6.LIZ(fl6.LIZ, str4);
                    return;
                }
                FL6 fl62 = new FL6(this$0, str2);
                this$0.LJLJI.put(str2, fl62);
                fl62.LIZJ.add(Integer.valueOf(Binder.getCallingPid()));
                String str5 = fl62.LIZIZ;
                if (str5 != null) {
                    fl62.LIZ(fl62.LIZ, str5);
                }
                this$0.LIZ(str2, str3, fl62);
                return;
        }
    }

    public static final void run$3(ARunnableS2S1201000_6 aRunnableS2S1201000_6) {
        boolean LIZ;
        try {
            aRunnableS2S1201000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS2S1201000_6 aRunnableS2S1201000_6) {
        boolean LIZ;
        try {
            aRunnableS2S1201000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1201000_6(InterfaceC38616FDo interfaceC38616FDo, ActivityC45651qj activityC45651qj, int i, int i2) {
        this.$t = i2;
        this.l1 = interfaceC38616FDo;
        this.l2 = activityC45651qj;
        this.i3 = i;
        this.s0 = "common_feed_item_feed";
    }

    public ARunnableS2S1201000_6(AbsDownloadService absDownloadService, String str, String str2, int i) {
        this.$t = i;
        this.i3 = 1;
        this.l1 = absDownloadService;
        this.s0 = str;
        this.l2 = str2;
    }

    public ARunnableS2S1201000_6(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        this.$t = i;
        this.i3 = 0;
        this.s0 = str;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
    }

    public ARunnableS2S1201000_6(int i, String str, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
