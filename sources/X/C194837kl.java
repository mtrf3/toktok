package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194837kl extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ List<Object> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Object, User> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C194837kl(List<Object> list, InterfaceC88472Yns<Object, ? extends User> interfaceC88472Yns, boolean z) {
        super(0);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        List LLJI = ORZ.LLJI(this.LJLIL);
        InterfaceC88472Yns<Object, User> interfaceC88472Yns = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            User invoke = interfaceC88472Yns.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((User) next).getUid())) {
                arrayList2.add(next);
            }
        }
        boolean z = this.LJLJI;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            User user = (User) it3.next();
            UserNowPackStruct userNowPackStruct = user.getUserNowPackStruct();
            if (userNowPackStruct != null) {
                int userNowStatus = userNowPackStruct.getUserNowStatus();
                String uid = user.getUid();
                if (uid != null && (!z || C59962Wy.LIZIZ().get(uid) == null)) {
                    C59962Wy.LIZJ(userNowStatus, uid);
                }
            }
        }
        if (C00F.LIZ(31744, 0, "tt_now_avatar_preload_now_exp", true) > 0) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                UserNowPackStruct userNowPackStruct2 = ((User) next2).getUserNowPackStruct();
                if (userNowPackStruct2 != null && userNowPackStruct2.getUserNowStatus() > 0) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(((User) it5.next()).getUid());
            }
            C72085SQv.LJ(new C194747kc(arrayList4));
        }
        return C76800UCe.LIZ;
    }
}
