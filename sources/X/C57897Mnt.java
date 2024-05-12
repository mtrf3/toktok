package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mnt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57897Mnt implements InterfaceC57861MnJ {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final C57859MnH LIZIZ;
    public final AbstractC57896Mns LIZJ;
    public final IMafUserApi LIZLLL;
    public final C62822Ol8 LJ;

    public C57897Mnt() {
        throw null;
    }

    @Override // X.InterfaceC57861MnJ
    public final List<InterfaceC57927MoN> LIZ(C57850Mn8 c57850Mn8) {
        boolean z;
        MatchedFriendStruct matchedFriendStruct;
        int size;
        List<InterfaceC57927MoN> LLJILJILJ = ORZ.LLJILJILJ(c57850Mn8.LIZ);
        if (!this.LIZJ.LJ.invoke().booleanValue()) {
            return LLJILJILJ;
        }
        ArrayList arrayList = new ArrayList();
        List<C57900Mnw> LIZ = this.LIZJ.LIZ();
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C57900Mnw> it = LIZ.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C57900Mnw next = it.next();
            C57900Mnw c57900Mnw = next;
            if (C78983UzD.LJJJLL(c57900Mnw) && !c57900Mnw.LJLIL.isGrant()) {
                arrayList3.add(next);
            }
        }
        if ((this.LIZJ instanceof C57845Mn3) && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EnumC58046MqI enumC58046MqI = ((C57900Mnw) it2.next()).LJLIL;
                if (enumC58046MqI == EnumC58046MqI.CONTACT && !enumC58046MqI.isGrant()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((C57900Mnw) next2).LJLIL != EnumC58046MqI.FACEBOOK) {
                            arrayList4.add(next2);
                        }
                    }
                    arrayList3 = arrayList4;
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            if (!((C57900Mnw) next3).LJLJI || !isEmpty) {
                arrayList5.add(next3);
            }
        }
        for (C57900Mnw c57900Mnw2 : LIZ) {
            if (!arrayList5.contains(c57900Mnw2)) {
                Collection collection = (Collection) ((ConcurrentHashMap) this.LJ.getValue()).get(c57900Mnw2.LJLIL);
                if (collection != null) {
                    arrayList.addAll(collection);
                }
            } else {
                arrayList.add(c57900Mnw2);
            }
        }
        if (arrayList.isEmpty()) {
            return LLJILJILJ;
        }
        AbstractC57896Mns abstractC57896Mns = this.LIZJ;
        if (!arrayList2.isEmpty()) {
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Object obj = (InterfaceC57927MoN) it5.next();
                if ((obj instanceof RecUser) && (matchedFriendStruct = ((User) obj).getMatchedFriendStruct()) != null && o.LJ(matchedFriendStruct.isAcquaintance(), Boolean.TRUE)) {
                    break;
                }
            }
        }
        z = false;
        int LIZIZ = abstractC57896Mns.LIZIZ(z);
        if (LIZIZ < 0) {
            if (c57850Mn8.LIZIZ) {
                return LLJILJILJ;
            }
            size = arrayList2.size();
        } else {
            size = ((ArrayList) C57964Moy.LIZJ(LLJILJILJ)).size() + LIZIZ;
        }
        arrayList2.addAll(size, arrayList);
        return LLJILJILJ;
    }

    public C57897Mnt(AqS159S0100000_9 aqS159S0100000_9, C57859MnH config) {
        AbstractC57896Mns strategy = config.getListConfig().LJ;
        MafUserApiService service = MafUserApiService.LIZIZ;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(service, "service");
        this.LIZ = aqS159S0100000_9;
        this.LIZIZ = config;
        this.LIZJ = strategy;
        this.LIZLLL = service;
        this.LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1069));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(2:3|(25:5|6|(1:(3:9|10|11)(2:77|78))(4:79|(2:80|(3:82|(2:84|85)(2:116|117)|(1:87)(1:115))(2:118|119))|88|(2:113|114)(10:92|93|94|(1:96)(1:111)|97|(1:99)(1:110)|100|101|102|(1:104)(1:105)))|12|13|14|(1:16)|17|(1:19)|20|(1:71)|22|(4:25|(3:27|28|29)(1:31)|30|23)|32|33|(4:36|(2:38|39)(2:41|42)|40|34)|43|44|(1:46)|47|(3:56|(3:59|(1:68)(3:64|65|66)|57)|70)|49|(1:51)(1:55)|52|53))|120|6|(0)(0)|12|13|14|(0)|17|(0)|20|(0)|22|(1:23)|32|33|(1:34)|43|44|(0)|47|(0)|49|(0)(0)|52|53|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.ss.android.ugc.aweme.relation.model.MaFListResponse, java.lang.Object, X.Ee8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC58046MqI r26, kotlin.jvm.internal.AqS167S0100000_1 r27, X.InterfaceC67352kd r28) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57897Mnt.LIZIZ(X.MqI, kotlin.jvm.internal.AqS167S0100000_1, X.2kd):java.lang.Object");
    }
}
