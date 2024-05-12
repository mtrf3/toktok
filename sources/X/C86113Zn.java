package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86113Zn extends AbstractC65781Prl implements InterfaceC65784Pro<C86463aM> {
    public static final C86113Zn LJLIL = new C86113Zn();

    public C86113Zn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Zm] */
    @Override // X.InterfaceC65784Pro
    public final C86463aM invoke() {
        final InterfaceC86133Zp LJIJ = C86443aK.LIZIZ(EF7.LIZIZ()).LJIJ();
        return new C86463aM(new C86563aW(new InterfaceC86173Zt(LJIJ) { // from class: X.3Zm
            public final InterfaceC86133Zp LIZ;

            {
                o.LJIIIZ(LJIJ, "roomDao");
                this.LIZ = LJIJ;
            }

            @Override // X.InterfaceC86173Zt
            public final Object LIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                this.LIZ.clear();
                return C76800UCe.LIZ;
            }

            @Override // X.InterfaceC86173Zt
            public final Object LIZLLL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
                return new Integer(this.LIZ.LIZ());
            }

            @Override // X.InterfaceC86173Zt
            public final Object LJFF(InterfaceC67352kd<? super java.util.Map<String, Integer>> interfaceC67352kd) {
                List<C86123Zo> LIZIZ = this.LIZ.LIZIZ();
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(LIZIZ, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (C86123Zo c86123Zo : LIZIZ) {
                    OSZ osz = new OSZ(c86123Zo.LJLIL, new Integer(c86123Zo.LJLILLLLZI));
                    linkedHashMap.put(osz.getFirst(), osz.getSecond());
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC86173Zt
            public final Object LJ(C85873Yp c85873Yp, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                InterfaceC86133Zp interfaceC86133Zp = this.LIZ;
                List<String> secUids = c85873Yp.getSecUserIds();
                int relationType = c85873Yp.getRelationType();
                List<Long> createdTime = c85873Yp.getCreatedTimes();
                o.LJIIIZ(secUids, "secUids");
                o.LJIIIZ(createdTime, "createdTime");
                if (secUids.size() == createdTime.size()) {
                    ArrayList arrayList = new ArrayList();
                    int size = secUids.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new C86123Zo((String) ListProtector.get(secUids, i), relationType, ((Number) ListProtector.get(createdTime, i)).longValue()));
                    }
                    interfaceC86133Zp.LIZJ(arrayList);
                    return C76800UCe.LIZ;
                }
                throw new IllegalArgumentException("secUid size and createdTime size not matched!");
            }
        }));
    }
}
