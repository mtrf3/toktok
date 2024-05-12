package X;

import com.bytedance.scalpel.bigjank.IBigJankApi;
import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.PerfData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.YYr, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87577YYr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FY3 fy3, String str, long j) {
        C87581YYv c87581YYv = new C87581YYv();
        c87581YYv.LIZLLL = str;
        ArrayList arrayList = new ArrayList();
        for (FY7 fy7 : fy3.LIZIZ) {
            C87578YYs c87578YYs = new C87578YYs();
            FY6 LIZIZ = FY6.LIZIZ();
            o.LJIIIIZZ(LIZIZ, "ScalpelBigJankCollector.getInstance()");
            if (LIZIZ.LIZ != null) {
                FY6 LIZIZ2 = FY6.LIZIZ();
                o.LJIIIIZZ(LIZIZ2, "ScalpelBigJankCollector.getInstance()");
                FY4 fy4 = (FY4) LIZIZ2.LIZ;
                o.LJI(fy4);
                c87578YYs.LJ = Long.valueOf(fy4.LJLILLLLZI);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<long[]> it = fy7.LIZ.iterator();
            while (it.hasNext()) {
                long[] stack = it.next();
                C87572YYm c87572YYm = new C87572YYm();
                c87572YYm.LIZLLL = Long.valueOf(fy7.LJFF);
                o.LJIIIIZZ(stack, "stack");
                ArrayList arrayList3 = new ArrayList(stack.length);
                for (long j2 : stack) {
                    arrayList3.add(Long.valueOf(j2));
                }
                c87572YYm.LJ = arrayList3;
                arrayList2.add(c87572YYm.build());
            }
            c87578YYs.LIZLLL = arrayList2;
            c87578YYs.LJFF = fy7.LJIIIIZZ;
            c87578YYs.LJIIIIZZ = fy7.LJII;
            C87584YYy c87584YYy = new C87584YYy();
            c87584YYy.LJ = fy7.LIZIZ;
            c87584YYy.LJIIIIZZ = fy7.LJ;
            c87584YYy.LIZLLL = fy7.LIZJ;
            c87584YYy.LJFF = fy7.LIZLLL;
            c87578YYs.LJI = c87584YYy.build();
            YYM yym = new YYM();
            yym.LIZLLL = Long.valueOf(fy7.LJFF);
            yym.LJ = Long.valueOf(fy7.LJI);
            c87578YYs.LJIIIZ = yym.build();
            C87582YYw c87582YYw = new C87582YYw();
            c87582YYw.LJFF = Long.valueOf(fy7.LJFF);
            c87582YYw.LJI = Long.valueOf(fy7.LJI);
            c87582YYw.LIZLLL = Long.valueOf(fy7.LJFF);
            c87582YYw.LJ = Long.valueOf(fy7.LJI);
            c87578YYs.LJII = c87582YYw.build();
            arrayList.add(c87578YYs.build());
        }
        c87581YYv.LJ = arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        BigJankMsg build = c87581YYv.build();
        C87574YYo c87574YYo = new C87574YYo();
        c87574YYo.LJ = Long.valueOf(j);
        List<PerfData> list = c87574YYo.LIZLLL;
        C87576YYq c87576YYq = new C87576YYq();
        c87576YYq.LIZLLL = Long.valueOf(currentTimeMillis);
        c87576YYq.LJ = Integer.valueOf(EnumC124184u6.TypeBigJank.getValue());
        C64528PUe c64528PUe = C64537PUn.Companion;
        byte[] encode = build.encode();
        o.LJIIIIZZ(encode, "bigJankMsg.encode()");
        byte[] copyOf = Arrays.copyOf(encode, encode.length);
        c64528PUe.getClass();
        c87576YYq.LJFF = C64528PUe.LIZIZ(copyOf);
        list.add(c87576YYq.build());
        R2S r2s = IBigJankApi.LIZ;
        R2V r2v = new R2V(c87574YYo.build());
        r2s.getClass();
        AqS158S0200000_11 aqS158S0200000_11 = new AqS158S0200000_11(r2s, r2v, 6);
        if (FYL.LIZIZ.invoke().booleanValue()) {
            aqS158S0200000_11.invoke();
        }
    }
}
