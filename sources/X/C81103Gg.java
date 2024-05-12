package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.member.GroupMemberLoader$fetchUserInfo$2", f = "GroupMemberLoader.kt", l = {361, 363}, m = "invokeSuspend")
/* renamed from: X.3Gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81103Gg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<C81243Gu> LJLILLLLZI;
    public final /* synthetic */ InterfaceC80883Fk LJLJI;
    public final /* synthetic */ XKW LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81103Gg(List<C81243Gu> list, InterfaceC80883Fk interfaceC80883Fk, XKW xkw, String str, InterfaceC67352kd<? super C81103Gg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = interfaceC80883Fk;
        this.LJLJJI = xkw;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81103Gg(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            List<C81243Gu> list = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            for (C81243Gu c81243Gu : list) {
                if (C44384HbQ.LJLIIIL(c81243Gu) == null) {
                    arrayList.add(c81243Gu);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C81243Gu c81243Gu2 = (C81243Gu) it.next();
                C63089OpR member = c81243Gu2.getMember();
                if (member != null) {
                    l = new Long(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                C63089OpR member2 = c81243Gu2.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                } else {
                    str = null;
                }
                arrayList2.add(new OSZ(valueOf, str));
            }
            if (arrayList2.isEmpty()) {
                return C76800UCe.LIZ;
            }
            C80533Eb c80533Eb = C80533Eb.LIZ;
            InterfaceC80883Fk interfaceC80883Fk = this.LJLJI;
            this.LJLIL = 1;
            if (C80533Eb.LJIILJJIL(c80533Eb, arrayList2, interfaceC80883Fk, false, this, 12) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XKW xkw = this.LJLJJI;
        C81113Gh c81113Gh = new C81113Gh(this.LJLJJL, this.LJLILLLLZI, null);
        this.LJLIL = 2;
        if (XKX.LJI(xkw, c81113Gh, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
