package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.perf.FullUpdateMonitor$trace$1", f = "FullUpdateMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.381, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass381 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AnonymousClass385 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass381(AnonymousClass385 anonymousClass385, long j, long j2, long j3, InterfaceC67352kd<? super AnonymousClass381> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = anonymousClass385;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass381(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C789537z c789537z;
        C789537z c789537z2;
        C789337x c789337x;
        C789337x c789337x2;
        C789437y c789437y;
        C789437y c789437y2;
        C141335gf.LIZJ(obj);
        this.LJLIL.LJFF.put("sum_cost", this.LJLILLLLZI);
        this.LJLIL.LJFF.put("sum_db_cost", this.LJLJI);
        this.LJLIL.LJFF.put("full_update_interval", this.LJLJJI);
        AnonymousClass311.LIZJ("relation_user_full_update_monitor", this.LJLIL.LJFF);
        AnonymousClass382 anonymousClass382 = (AnonymousClass382) this.LJLIL.LIZJ.getValue();
        if (anonymousClass382 != null) {
            int size = ((ArrayList) anonymousClass382.LIZJ).size();
            int size2 = ((ArrayList) anonymousClass382.LIZLLL).size();
            JSONObject put = anonymousClass382.LJ.put("origin_size", size).put("new_size", size2);
            int i = size - size2;
            if (i < 0) {
                i = 0;
            }
            JSONObject put2 = put.put("new_missing_count", i);
            int i2 = size2 - size;
            if (i2 < 0) {
                i2 = 0;
            }
            put2.put("origin_missing_count", i2);
            if (size2 != size) {
                anonymousClass382.LJ.put("is_same", CardStruct.IStatusCode.DEFAULT);
            } else {
                List<C787637g> list = anonymousClass382.LIZJ;
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(AnonymousClass382.LIZJ((C787637g) next), next);
                }
                Iterator it2 = ((ArrayList) anonymousClass382.LIZLLL).iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    C787637g c787637g = (C787637g) it2.next();
                    C787637g c787637g2 = (C787637g) linkedHashMap.get(AnonymousClass382.LIZJ(c787637g));
                    if (c787637g2 == null || (c789537z = c787637g2.LIZJ) == null || (c789537z2 = c787637g.LIZJ) == null || !o.LJ(c789537z.LIZ, c789537z2.LIZ) || !o.LJ(c789537z.LIZIZ, c789537z2.LIZIZ) || !o.LJ(c789537z.LIZJ, c789537z2.LIZJ) || !o.LJ(c789537z.LIZLLL, c789537z2.LIZLLL) || !o.LJ(c789537z.LJ, c789537z2.LJ) || !o.LJ(c789537z.LJFF, c789537z2.LJFF) || !o.LJ(c789537z.LJI, c789537z2.LJI) || (c789337x = c787637g2.LIZIZ) == null || (c789337x2 = c787637g.LIZIZ) == null || !o.LJ(c789337x2.LIZ, c789337x.LIZ) || !o.LJ(c789337x2.LIZJ, c789337x.LIZJ) || !o.LJ(c789337x2.LIZLLL, c789337x.LIZLLL) || !o.LJ(c789337x2.LJ, c789337x.LJ) || !o.LJ(c789337x2.LJFF, c789337x.LJFF) || (c789437y = c787637g2.LIZLLL) == null || (c789437y2 = c787637g.LIZLLL) == null || !o.LJ(c789437y.LIZ, c789437y2.LIZ) || !o.LJ(c789437y.LIZIZ, c789437y2.LIZIZ) || !o.LJ(c789437y.LIZJ, c789437y2.LIZJ) || !o.LJ(c789437y.LIZLLL, c789437y2.LIZLLL)) {
                        i3++;
                    }
                }
                anonymousClass382.LJ.put("inconsistent_count", i3);
                if (i3 == 0) {
                    anonymousClass382.LJ.put("is_same", "1");
                }
            }
            AnonymousClass311.LIZJ("relation_user_entire_diff_result", anonymousClass382.LJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
