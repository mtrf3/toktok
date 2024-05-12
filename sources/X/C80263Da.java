package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet$onViewCreated$3", f = "IMReactionListSheet.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.3Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80263Da extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IMReactionListSheet LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80263Da(IMReactionListSheet iMReactionListSheet, InterfaceC67352kd<? super C80263Da> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMReactionListSheet;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80263Da(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC67352kd interfaceC67352kd;
        long longValue;
        long longValue2;
        long longValue3;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            IMReactionListSheetViewModel vl = this.LJLILLLLZI.vl();
            C109544Rq c109544Rq = this.LJLILLLLZI.LJLIL;
            if (c109544Rq != null) {
                C80533Eb c80533Eb = C80533Eb.LIZ;
                C80283Dc c80283Dc = new C80283Dc(c80533Eb);
                C80293Dd c80293Dd = new C80293Dd(c80533Eb);
                vl.getClass();
                vl.LJLIL = c109544Rq;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, List<C32H>> entry : c109544Rq.getPropertyItemListMap().entrySet()) {
                    String key = entry.getKey();
                    o.LJIIIIZZ(key, "entry.key");
                    if (ujb.o.LJJJLIIL(key, "e:", false)) {
                        String key2 = entry.getKey();
                        o.LJIIIIZZ(key2, "entry.key");
                        String substring = key2.substring(2);
                        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                        if (!o.LJ(substring, "love")) {
                            List<C32H> value = entry.getValue();
                            o.LJIIIIZZ(value, "entry.value");
                            for (C32H c32h : value) {
                                IMUser iMUser = (IMUser) c80283Dc.invoke(c32h.idempotent_id, c32h.sec_uid);
                                if (iMUser != null) {
                                    boolean LJ = o.LJ(iMUser.getUid(), vl.LJLJI);
                                    if (LJ) {
                                        vl.LJLILLLLZI = substring;
                                    }
                                    String displayName = iMUser.getDisplayName();
                                    o.LJIIIIZZ(displayName, "user.displayName");
                                    String str = c32h.idempotent_id;
                                    o.LJIIIIZZ(str, "propertyItem.idempotent_id");
                                    UrlModel avatarThumb = iMUser.getAvatarThumb();
                                    Long l = c32h.create_time;
                                    o.LJIIIIZZ(l, "propertyItem.create_time");
                                    arrayList.add(new C80353Dj(displayName, str, avatarThumb, substring, l.longValue(), LJ));
                                } else {
                                    String str2 = c32h.idempotent_id;
                                    o.LJIIIIZZ(str2, "propertyItem.idempotent_id");
                                    Long l2 = c32h.create_time;
                                    if (l2 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l2.longValue();
                                    }
                                    arrayList.add(new C80353Dj("", str2, null, "❤️", longValue3, false));
                                    vl.LJLJJLL.add(c32h.idempotent_id);
                                }
                                HashMap<String, Integer> hashMap = vl.LJLJL;
                                String str3 = c32h.idempotent_id;
                                o.LJIIIIZZ(str3, "propertyItem.idempotent_id");
                                hashMap.put(str3, 0);
                            }
                        }
                    }
                }
                List<C32H> list = c109544Rq.getPropertyItemListMap().get("e:love");
                if (list != null) {
                    for (C32H c32h2 : list) {
                        if (!vl.LJLJL.containsKey(c32h2.idempotent_id)) {
                            IMUser iMUser2 = (IMUser) c80283Dc.invoke(c32h2.idempotent_id, null);
                            if (iMUser2 != null) {
                                boolean LJ2 = o.LJ(iMUser2.getUid(), vl.LJLJI);
                                if (LJ2) {
                                    vl.LJLILLLLZI = "love";
                                }
                                String displayName2 = iMUser2.getDisplayName();
                                o.LJIIIIZZ(displayName2, "user.displayName");
                                String uid = iMUser2.getUid();
                                o.LJIIIIZZ(uid, "user.uid");
                                UrlModel avatarThumb2 = iMUser2.getAvatarThumb();
                                Long l3 = c32h2.create_time;
                                if (l3 == null) {
                                    longValue2 = 0;
                                } else {
                                    longValue2 = l3.longValue();
                                }
                                arrayList.add(new C80353Dj(displayName2, uid, avatarThumb2, "❤️", longValue2, LJ2));
                            } else {
                                String str4 = c32h2.idempotent_id;
                                o.LJIIIIZZ(str4, "item.idempotent_id");
                                Long l4 = c32h2.create_time;
                                if (l4 == null) {
                                    longValue = 0;
                                } else {
                                    longValue = l4.longValue();
                                }
                                arrayList.add(new C80353Dj("", str4, null, "❤️", longValue, false));
                                vl.LJLJJLL.add(c32h2.idempotent_id);
                            }
                            HashMap<String, Integer> hashMap2 = vl.LJLJL;
                            String str5 = c32h2.idempotent_id;
                            o.LJIIIIZZ(str5, "item.idempotent_id");
                            hashMap2.put(str5, 0);
                        }
                    }
                }
                C40675Fxn.LJJLIIIIJ(arrayList);
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    vl.LJLJL.put(((C80353Dj) it.next()).LJLILLLLZI, Integer.valueOf(i2));
                    i2++;
                }
                if (!vl.LJLJJLL.isEmpty()) {
                    interfaceC67352kd = null;
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(vl), C78613UtF.LIZJ, null, new C3DX(vl.LJLJJLL, c80293Dd, vl, null), 2);
                } else {
                    interfaceC67352kd = null;
                }
                XIF xif = EXV.LIZ;
                C80273Db c80273Db = new C80273Db(this.LJLILLLLZI, arrayList, interfaceC67352kd);
                this.LJLIL = 1;
                if (XKX.LJI(xif, c80273Db, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("message");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
