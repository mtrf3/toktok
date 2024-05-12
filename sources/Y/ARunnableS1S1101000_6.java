package Y;

import X.C141335gf;
import X.C36849EdB;
import X.C37054EgU;
import X.C37056EgW;
import X.C37057EgX;
import X.C37059EgZ;
import X.C37060Ega;
import X.C37062Egc;
import X.C38612FDk;
import X.C38619FDr;
import X.C3C5;
import X.C71079Rv1;
import X.C73040SlY;
import X.C76800UCe;
import X.C79600VLw;
import X.FE8;
import X.InterfaceC38613FDl;
import X.InterfaceC38616FDo;
import X.RunnableC36847Ed9;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ARunnableS1S1101000_6 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        ((C79600VLw) this.l1).LJIIJ = new HashMap();
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(this.s0)) {
            str = "";
        } else {
            str = this.s0;
        }
        hashMap.put("url", str);
        hashMap.put("data_size", Integer.valueOf(this.i2));
        ((C79600VLw) this.l1).LJIIJ.put("ssr_extra_info", hashMap);
        ((C79600VLw) this.l1).LJIIJ.put("ssr_render_page_timing", new HashMap());
    }

    public final void LIZ$1() {
        String str = this.s0;
        if (str != null) {
            C37057EgX c37057EgX = (C37057EgX) this.l1;
            if (c37057EgX.LIZ != null && str.equals(c37057EgX.LJ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("checkUrlSafely : send seclink request :");
                LIZ.append(this.s0);
                X1D.LIZIZ(LIZ);
                String str2 = this.s0;
                C37057EgX c37057EgX2 = (C37057EgX) this.l1;
                String str3 = c37057EgX2.LIZIZ;
                int i = this.i2;
                C37062Egc c37062Egc = c37057EgX2.LJIIIIZZ;
                C37059EgZ c37059EgZ = new C37059EgZ();
                c37059EgZ.LIZ = C73040SlY.LJLJJI.LIZ;
                c37059EgZ.LIZJ = str2;
                c37059EgZ.LIZIZ = str3;
                c37059EgZ.LJ = c37062Egc;
                c37059EgZ.LJFF = i;
                C37060Ega LIZ2 = c37059EgZ.LIZ();
                C36849EdB.LIZ().getClass();
                String str4 = LIZ2.LIZJ;
                if (TextUtils.isEmpty(str4) || C37054EgU.LJ(str4) || C37056EgW.LIZ().LIZJ(LIZ2.LIZJ)) {
                    return;
                }
                if (C36849EdB.LIZIZ == null) {
                    C36849EdB.LIZIZ = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("CheckUrlSecManager"));
                }
                C36849EdB.LIZIZ.execute(new RunnableC36847Ed9(LIZ2));
                return;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("checkUrlSafely url is not same with current task: ");
        LIZ3.append(this.s0);
        LIZ3.append("  urlFromOverride : ");
        LIZ3.append(((C37057EgX) this.l1).LJ);
        X1D.LIZIZ(LIZ3);
    }

    public final void LIZ$3() {
        List list;
        int i;
        try {
            if (o.LJ("homepage_hot", this.s0) && (list = (List) this.l1) != null && !list.isEmpty() && (i = this.i2) >= 0 && i < ((List) this.l1).size() - 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) this.l1);
                int size = arrayList.size();
                for (int i2 = this.i2 + 1; i2 < size; i2++) {
                    Aweme aweme = (Aweme) ListProtector.get(arrayList, i2);
                    if (aweme != null) {
                        C71079Rv1.LIZIZ(aweme);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$2() {
        Object LIZ;
        InterfaceC38616FDo interfaceC38616FDo;
        C38612FDk c38612FDk;
        System.currentTimeMillis();
        try {
            C38619FDr.LIZLLL.getClass();
            InterfaceC38613FDl LIZ2 = C38619FDr.LIZ();
            if (LIZ2 != null) {
                LIZ2.LIZ(this.s0);
            }
            interfaceC38616FDo = (InterfaceC38616FDo) this.l1;
            c38612FDk = C38619FDr.LIZIZ;
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (c38612FDk != null) {
            interfaceC38616FDo.LIZJ(c38612FDk.LIZ);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            if (C3C5.m13isSuccessimpl(LIZ)) {
                System.currentTimeMillis();
                C38619FDr.LIZLLL.getClass();
                InterfaceC38613FDl LIZ3 = C38619FDr.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LJFF(this.s0);
                }
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                FE8.LJII(this.i2, (InterfaceC38616FDo) this.l1);
                C38619FDr.LIZLLL.getClass();
                InterfaceC38613FDl LIZ4 = C38619FDr.LIZ();
                if (LIZ4 != null) {
                    LIZ4.LJIIIZ(this.s0, m10exceptionOrNullimpl);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    public static final void run$0(ARunnableS1S1101000_6 aRunnableS1S1101000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1101000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1101000_6 aRunnableS1S1101000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1101000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S1101000_6 aRunnableS1S1101000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1101000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S1101000_6 aRunnableS1S1101000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1101000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1101000_6(InterfaceC38616FDo interfaceC38616FDo, int i, int i2) {
        this.$t = i2;
        this.l1 = interfaceC38616FDo;
        this.i2 = i;
        this.s0 = "common_feed_item_feed";
    }

    public ARunnableS1S1101000_6(Object obj, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
