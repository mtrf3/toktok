package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.THm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74390THm implements TIK {
    public final C73893SzJ<C74389THl> LIZ = new C73893SzJ<>();
    public TJ0 LIZIZ;

    @Override // X.TIK
    public final C73426Srm LIZJ() {
        C73893SzJ<C74389THl> c73893SzJ = this.LIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.TIK
    public final void LIZ(TJ0 repository) {
        o.LJIIIZ(repository, "repository");
        this.LIZIZ = repository;
    }

    @Override // X.InterfaceC74388THk
    public final void LIZIZ(C74389THl c74389THl) {
        boolean z;
        String id;
        TJ0 tj0 = this.LIZIZ;
        if (tj0 != null) {
            List<Effect> list = c74389THl.LJLIL;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator<Effect> it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Effect next = it.next();
                Effect effect = next;
                String parentId = effect.getParentId();
                if (parentId == null || parentId.length() == 0) {
                    id = effect.getId();
                } else {
                    id = effect.getParentId();
                }
                if (hashSet.add(id)) {
                    arrayList.add(next);
                }
            }
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            C74389THl c74389THl2 = new C74389THl(LLJILJILJ, c74389THl.LJLILLLLZI, c74389THl.LJLJI, c74389THl.LJLJJI, c74389THl.LJLJJL);
            C34K c34k = new C34K();
            c34k.element = true;
            Iterator it2 = ((ArrayList) LLJILJILJ).iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    EffectTemplate effectTemplate = (EffectTemplate) next2;
                    String parentId2 = effectTemplate.getParentId();
                    if (parentId2 != null && parentId2.length() != 0) {
                        c34k.element = z;
                        InterfaceC74394THq LJIJI = tj0.LJIJI();
                        String parentId3 = effectTemplate.getParentId();
                        o.LJI(parentId3);
                        LJIJI.LIZ(C47261Igj.LJJIJ(parentId3), c74389THl.LJLJJI, new C74392THo(i, tj0, LLJILJILJ, c74389THl2, this));
                    }
                    i = i2;
                    z = false;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (c34k.element) {
                this.LIZ.onNext(c74389THl2);
                return;
            }
            return;
        }
        this.LIZ.onNext(c74389THl);
    }
}
