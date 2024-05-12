package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GPo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41476GPo extends GUX {
    public final /* synthetic */ GUQ LJLIL;

    public C41476GPo(GUQ guq) {
        this.LJLIL = guq;
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        C41759GaB c41759GaB;
        o.LJIIIZ(result, "result");
        if (publishModel != null) {
            GOV.LJII.remove(publishModel.creationId);
        }
        if (!(result instanceof C41505GQr) && !(result instanceof GUZ)) {
            if (result instanceof C41478GPq) {
                C41606GUo c41606GUo = ((C41478GPq) result).LIZ;
                c41759GaB = new C41759GaB(c41606GUo.LIZLLL, c41606GUo.LIZJ);
            } else if (result instanceof C41477GPp) {
                c41759GaB = ((C41477GPp) result).LIZ;
            } else {
                c41759GaB = new C41759GaB(new Throwable("cancel"));
            }
            Object obj2 = ((LinkedHashMap) GOV.LJ).get(this.LJLIL.LJLJJL.LIZIZ);
            if (obj2 == null) {
                return;
            }
            try {
                InterfaceC79150V4o remove = GOV.LJI.remove(obj2);
                C76800UCe c76800UCe = null;
                if (remove != null && remove.isActive()) {
                    remove.LIZIZ(null);
                }
                List list = (List) ((LinkedHashMap) GOV.LIZJ).get(obj2);
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((GUQ) it.next()).LJLJJL.LIZ.creationId);
                    }
                    if (!arrayList.isEmpty()) {
                        GOV.LJII.removeAll(arrayList);
                    }
                }
                List<GUQ> list2 = (List) ((LinkedHashMap) GOV.LIZJ).get(obj2);
                if (list2 != null) {
                    for (GUQ guq : list2) {
                        if (!(guq.LJLJJL.LIZLLL instanceof GOS)) {
                            GUH.LJFF(new C41359GLb("cancel_by_group", false, c41759GaB, 2), guq.LJLJJL.LIZIZ);
                        }
                    }
                    c76800UCe = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
