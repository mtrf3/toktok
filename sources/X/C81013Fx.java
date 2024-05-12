package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.3Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C81013Fx extends TBS implements InterfaceC88471Ynr<List<IMContact>, InterfaceC67352kd<? super List<IMContact>>, Object> {
    public C81013Fx(Object obj) {
        super(2, obj, C3R2.class, "interceptFinish", "interceptFinish(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<IMContact> list, InterfaceC67352kd<? super List<IMContact>> interfaceC67352kd) {
        boolean z;
        List<IMContact> list2 = list;
        InterfaceC67352kd<? super List<IMContact>> interfaceC67352kd2 = interfaceC67352kd;
        C3R2 c3r2 = (C3R2) this.receiver;
        c3r2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("interceptFinish, before list size: ");
        LIZ.append(list2.size());
        C34B.LJI("SortWeightRelationModel", X1D.LIZIZ(LIZ));
        List<IMContact> list3 = list2;
        if (c3r2.LJIIL()) {
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list2) {
                if (true ^ (iMContact instanceof MAFIMUser)) {
                    arrayList.add(iMContact);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (IMContact iMContact2 : list2) {
                if (iMContact2 instanceof MAFIMUser) {
                    arrayList2.add(iMContact2);
                }
            }
            if (!arrayList2.isEmpty()) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    IMContact iMContact3 = (IMContact) listIterator.previous();
                    if (iMContact3.getType() == 6 || iMContact3.getType() == 5 || iMContact3.getType() == 1 || iMContact3.getType() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((iMContact3 instanceof IMUser) && z) {
                        int nextIndex = listIterator.nextIndex();
                        if (nextIndex != -1) {
                            int size = arrayList.size();
                            int i = nextIndex + 1;
                            if (i >= 0 && i < size) {
                                list2 = ORZ.LLJILJILJ(arrayList);
                                ((ArrayList) list2).addAll(i, arrayList2);
                            }
                        }
                    }
                }
            }
            Object obj = null;
            if (C3UE.LIZ() && C3UE.LIZJ()) {
                ArrayList arrayList3 = new ArrayList();
                C3FK.LIZ.getClass();
                List LIZJ = C3FK.LIZJ(arrayList3, list2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    IMContact iMContact4 = (IMContact) it.next();
                    if (iMContact4 instanceof IMUser) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                IMUser iMUser = (IMUser) it2.next();
                                if (o.LJ(iMUser.getUid(), ((IMUser) iMContact4).getUid()) && !(iMContact4 instanceof MAFIMUser)) {
                                    iMUser.setType(1);
                                    iMContact4 = iMUser;
                                    break;
                                }
                            }
                        }
                    }
                    arrayList4.add(iMContact4);
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    IMContact iMContact5 = (IMContact) next;
                    if (iMContact5.getType() == 17 || iMContact5.getType() == 16) {
                        obj = next;
                        break;
                    }
                }
                IMContact iMContact6 = (IMContact) obj;
                list3 = arrayList4;
                if (iMContact6 != null) {
                    iMContact6.setType(17);
                    list3 = arrayList4;
                }
            } else {
                C3FK.LIZ.getClass();
                list3 = C3FK.LIZJ(null, list2);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("interceptFinish, after list size: ");
        LIZ2.append(list3.size());
        C34B.LJI("SortWeightRelationModel", X1D.LIZIZ(LIZ2));
        return c3r2.LJIIIZ(list3, interfaceC67352kd2);
    }
}
