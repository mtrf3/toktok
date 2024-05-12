package X;

import Y.IDComparatorS334S0100000_1;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.MUFActivityStatusModel$rebindMUFAS$5", f = "MUFActivityStatusModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.36F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36F extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C79613An LJLIL;
    public final /* synthetic */ List<IMUser> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36F(C79613An c79613An, List<? extends IMUser> list, InterfaceC67352kd<? super C36F> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c79613An;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36F(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        Long l;
        C141335gf.LIZJ(obj);
        C36G c36g = this.LJLIL.LJ;
        List<IMUser> mufUidList = this.LJLILLLLZI;
        c36g.getClass();
        o.LJIIIZ(mufUidList, "mufUidList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryUpdateMUFSorting start hasUpdate ");
        LIZ.append(c36g.LIZ);
        C34B.LJI("MUFActivityStatusSortingManager", X1D.LIZIZ(LIZ));
        synchronized (c36g) {
            if (!c36g.LIZ) {
                c36g.LIZ = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (IMUser iMUser : mufUidList) {
                    String LIZJ = C81273Gx.LIZJ(iMUser.getUid());
                    C3Q9.LIZ.getClass();
                    C75782yE.LIZ();
                    C63120Opw LJII = C4WC.LIZIZ.LJII(LIZJ);
                    String uid = iMUser.getUid();
                    o.LJIIIIZZ(uid, "it.uid");
                    if (LJII != null) {
                        j = LJII.getUpdatedTime();
                    } else {
                        j = 0;
                    }
                    linkedHashMap.put(uid, Long.valueOf(j));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("conversation update time ");
                    if (LJII != null) {
                        l = Long.valueOf(LJII.getUpdatedTime());
                    } else {
                        l = null;
                    }
                    LIZ2.append(l);
                    C34B.LJI("MUFActivityStatusSortingManager", X1D.LIZIZ(LIZ2));
                }
                List LLILII = ORZ.LLILII(new IDComparatorS334S0100000_1(linkedHashMap, 1), mufUidList);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
                Iterator it = LLILII.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IMUser) it.next()).getUid());
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("repo_name_muf_activity_status");
                LIZ3.append((Object) C80763Ey.LIZ(false));
                Keva.getRepo(X1D.LIZIZ(LIZ3)).storeStringArray("key_sorting", (String[]) arrayList.toArray(new String[0]));
                C34B.LJI("MUFActivityStatusSortingManager", "tryUpdateMUFSorting end");
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
