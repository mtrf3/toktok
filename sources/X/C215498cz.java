package X;

import Y.AfS52S0200000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215498cz {
    public boolean LIZIZ;
    public long LIZJ;
    public final String LJIIIZ;
    public final long LJIIJ;
    public final C215518d1 LJIIJJI;
    public final C215518d1 LJIIL;
    public final C73318Sq2 LJIILIIL;
    public final DanmakuApi LIZ = DanmakuApi.LIZ;
    public final java.util.Map<InterfaceC215558d5, C215038cF> LIZLLL = new LinkedHashMap();
    public final List<InterfaceC215558d5> LJ = new ArrayList();
    public final List<C214998cB> LJFF = new ArrayList();
    public final C215698dJ LJI = C215698dJ.LJLIL;
    public final List<C215528d2> LJII = new ArrayList();
    public long LJIIIIZZ = -1;

    public C215498cz(Aweme aweme) {
        long j;
        Video video;
        String aid;
        this.LJIIIZ = (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            j = video.getDuration();
        } else {
            j = 0;
        }
        this.LJIIJ = Math.max(j, 0L);
        ArrayList arrayList = new ArrayList();
        EnumC215768dQ enumC215768dQ = EnumC215768dQ.RESET;
        this.LJIIJJI = new C215518d1(arrayList, enumC215768dQ);
        this.LJIIL = new C215518d1(new ArrayList(), enumC215768dQ);
        this.LJIILIIL = new C73318Sq2();
    }

    public final void LIZIZ(InterfaceC215558d5 interfaceC215558d5) {
        C214998cB c214998cB;
        List<InterfaceC215558d5> list;
        List<InterfaceC215558d5> list2;
        Iterator<C214998cB> it = this.LJFF.iterator();
        while (true) {
            if (it.hasNext()) {
                c214998cB = it.next();
                C214998cB c214998cB2 = c214998cB;
                long j = c214998cB2.LIZ;
                long j2 = c214998cB2.LIZIZ;
                long LIZLLL = interfaceC215558d5.LIZLLL();
                if (j <= LIZLLL && LIZLLL < j2) {
                    break;
                }
            } else {
                c214998cB = null;
                break;
            }
        }
        C214998cB c214998cB3 = c214998cB;
        if (c214998cB3 != null && (list = c214998cB3.LIZJ) != null) {
            int i = 0;
            for (InterfaceC215558d5 interfaceC215558d52 : list) {
                if (o.LJ(interfaceC215558d5, interfaceC215558d52) || o.LJ(interfaceC215558d52.LIZJ(), interfaceC215558d5.LIZJ())) {
                    if (i >= 0) {
                        if (c214998cB3 != null && (list2 = c214998cB3.LIZJ) != null) {
                            ListProtector.remove(list2, i);
                        }
                        this.LIZIZ = true;
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public final C73422Sri LIZJ(C214928c4 c214928c4, InterfaceC215558d5 interfaceC215558d5) {
        DanmakuApi.RetrofitApi retrofitApi = DanmakuApi.LIZIZ;
        String aid = c214928c4.LJLIL.getAid();
        o.LJIIIIZZ(aid, "data.aweme.aid");
        return retrofitApi.createDanmaku(aid, c214928c4.LJLILLLLZI, c214928c4.LJLJI.toString(), c214928c4.LJLJJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIL(new AfS52S0200000_3(interfaceC215558d5, this, 18)).LJIJJ(new AfS52S0200000_3(interfaceC215558d5, this, 19)).LJIJJLI(new AfS52S0200000_3(interfaceC215558d5, this, 20));
    }

    public final void LIZ(long j, final boolean z, final boolean z2) {
        long j2;
        final long j3 = j;
        long j4 = this.LIZJ;
        if (j4 > 0) {
            j3 -= j3 % j4;
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            C215528d2 c215528d2 = (C215528d2) it.next();
            long j5 = c215528d2.LIZ;
            if (j3 < c215528d2.LIZIZ && j5 <= j3) {
                return;
            }
        }
        long j6 = this.LIZJ;
        if (j6 > 0) {
            j2 = j6 + j3;
        } else {
            j2 = Long.MAX_VALUE;
        }
        final C215528d2 c215528d22 = new C215528d2(j3, j2);
        ((ArrayList) this.LJII).add(c215528d22);
        DanmakuApi danmakuApi = this.LIZ;
        String aid = this.LJIIIZ;
        danmakuApi.getClass();
        o.LJIIIZ(aid, "aid");
        this.LJIILIIL.LIZ(DanmakuApi.LIZIZ.getDanmaku(aid, j3).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJ(new AfS52S0200000_3(c215528d22, this, 17)).LJJJJZI(new InterfaceC64592gB() { // from class: X.8de
            /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
            
                if (((X.C214998cB) X.U26.LIZIZ((java.util.ArrayList) r1, 1, r1)).LIZIZ <= r9.LIZ) goto L49;
             */
            @Override // X.InterfaceC64592gB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r16) {
                /*
                    Method dump skipped, instructions count: 347
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C215908de.accept(java.lang.Object):void");
            }
        }));
    }
}
