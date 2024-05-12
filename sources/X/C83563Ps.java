package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.contact.model.Avatars;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine$fullUpdate$overallCost$1$2", f = "UserSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83563Ps extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends C3QL>>, Object> {
    public final /* synthetic */ List<IMUserBaseInfo> LJLIL;
    public final /* synthetic */ C83483Pk LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83563Ps(List<IMUserBaseInfo> list, C83483Pk c83483Pk, InterfaceC67352kd<? super C83563Ps> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c83483Pk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83563Ps(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends C3QL>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UrlModel urlModel;
        int i;
        C141335gf.LIZJ(obj);
        List<IMUserBaseInfo> list = this.LJLIL;
        C83483Pk c83483Pk = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (IMUserBaseInfo iMUserBaseInfo : list) {
            IMUserBaseInfo iMUserBaseInfo2 = iMUserBaseInfo;
            String uniqueId = iMUserBaseInfo2.getUniqueId();
            if (uniqueId != null && uniqueId.length() != 0 && !c83483Pk.LJFF.invoke(new Long(iMUserBaseInfo2.getUserId())).booleanValue() && c83483Pk.LJI.invoke(iMUserBaseInfo2).booleanValue()) {
                arrayList.add(iMUserBaseInfo);
            }
        }
        C83483Pk c83483Pk2 = this.LJLILLLLZI;
        c83483Pk2.LIZ.LIZIZ(arrayList, c83483Pk2.LJIIIZ);
        C83483Pk c83483Pk3 = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IMUserBaseInfo iMUserBaseInfo3 = (IMUserBaseInfo) it.next();
            InterfaceC88472Yns<IMUser, List<C3QL>> interfaceC88472Yns = c83483Pk3.LJII;
            o.LJIIIZ(iMUserBaseInfo3, "<this>");
            IMUser iMUser = new IMUser();
            iMUser.setUid(String.valueOf(iMUserBaseInfo3.getUserId()));
            iMUser.setNickName(iMUserBaseInfo3.getContactNickName());
            iMUser.setUniqueId(iMUserBaseInfo3.getUniqueId());
            Avatars avatars = iMUserBaseInfo3.getAvatars();
            UrlModel urlModel2 = null;
            if (avatars != null) {
                urlModel = avatars.avatarThumb;
            } else {
                urlModel = null;
            }
            iMUser.setAvatarThumb(urlModel);
            Avatars avatars2 = iMUserBaseInfo3.getAvatars();
            if (avatars2 != null) {
                urlModel2 = avatars2.avatarMedium;
            }
            iMUser.setAvatarMedium(urlModel2);
            Integer followStatus = iMUserBaseInfo3.getFollowStatus();
            if (followStatus != null) {
                i = followStatus.intValue();
            } else {
                i = 0;
            }
            iMUser.setFollowStatus(i);
            iMUser.setRecType(iMUserBaseInfo3.getRecType());
            iMUser.setSortWeight(iMUserBaseInfo3.getSortWeight());
            iMUser.setInitialLetter(iMUserBaseInfo3.getInitialLetter());
            arrayList2.add(interfaceC88472Yns.invoke(iMUser));
        }
        return C32I.LJJLI(arrayList2);
    }
}
