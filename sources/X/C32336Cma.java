package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectOldResourceCleanMaxSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32336Cma extends RunnableC39007FSp {
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public final void LIZJ() {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Long> it = C32366Cn4.LJFF.iterator();
            long j = 0;
            while (it.hasNext()) {
                Long id = it.next();
                if (arrayList.size() >= LiveGiftEffectOldResourceCleanMaxSetting.INSTANCE.getValue()) {
                    break;
                }
                InterfaceC32340Cme LJFF = C32366Cn4.LJFF();
                o.LJIIIIZZ(id, "id");
                C32420Cnw LIZIZ = LJFF.LIZIZ(C32366Cn4.LIZJ(id.longValue()), 0);
                if (LIZIZ != null) {
                    str = LIZIZ.LJ;
                } else {
                    str = null;
                }
                String LJI = C32366Cn4.LJI(LIZIZ);
                j += C32366Cn4.LJ(LIZIZ);
                PU0.LJI().LIZLLL(LIZIZ);
                if (this.LJLJJL) {
                    C32366Cn4.LIZIZ(id.longValue(), new C32339Cmd(), 6, new LinkedHashMap(), null);
                }
                arrayList3.add(LJI);
                arrayList.add(String.valueOf(id));
                if (str == null) {
                    str = "";
                }
                arrayList2.add(str);
                C32366Cn4.LJFF.remove(id);
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (arrayList.size() > 0) {
                Long valueOf = Long.valueOf(j);
                String str2 = this.LJLJJLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("replacement_to_");
                LIZ.append(this.LJLJJLL);
                BNG.LIZ(arrayList, valueOf, arrayList2, arrayList3, str2, elapsedRealtime2, X1D.LIZIZ(LIZ), 0, "");
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("replacement_to_");
            LIZ2.append(this.LJLJJLL);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            String message = th.getMessage();
            BNG.LIZ(null, 0L, null, null, null, 0L, LIZIZ2, 1, message != null ? message : "");
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32336Cma(boolean z, String str) {
        super((Object) null);
        this.LJLJJL = z;
        this.LJLJJLL = str;
    }
}
