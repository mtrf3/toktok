package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.abtest.IMInboxUnreadCountDiffCheckSettings;
import fjb.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.helper.SessionListUnreadHelper$tryCheckDifference$1", f = "SessionListUnreadHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C3L4> LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<C3L4, Boolean, Integer> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39J(List list, InterfaceC67352kd interfaceC67352kd, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39J(this.LJLIL, interfaceC67352kd, this.LJLILLLLZI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        int i2;
        int i3;
        C81413Hl c81413Hl;
        int i4;
        long j2;
        boolean z;
        long j3;
        boolean z2;
        C141335gf.LIZJ(obj);
        List<C3L4> list = this.LJLIL;
        InterfaceC88471Ynr<C3L4, Boolean, Integer> interfaceC88471Ynr = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(list);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        List<C63120Opw> LJIILIIL = C4WC.LJIILIIL();
        java.util.Map<String, Long> LIZLLL = C82213Kn.LIZ().LIZLLL();
        HashMap hashMap = new HashMap();
        int size = list.size();
        int size2 = ((ArrayList) LJIILIIL).size();
        int LIZJ = C82213Kn.LIZ().LIZJ();
        int size3 = LIZLLL.size();
        Iterator it = arrayList.iterator();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            C3L4 session = (C3L4) it.next();
            o.LJIIIIZZ(session, "session");
            int intValue = interfaceC88471Ynr.invoke(session, Boolean.TRUE).intValue();
            String LJFF = session.LJFF();
            o.LJIIIIZZ(LJFF, "session.sessionID");
            hashMap.put(LJFF, Integer.valueOf(intValue));
            if (intValue < 0) {
                i7++;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unread count for session < 0: ");
                LIZ.append(intValue);
                C34B.LJI("SessionListUnreadHelper", X1D.LIZIZ(LIZ));
            } else if (intValue > 0) {
                i6++;
                i5 += intValue;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (i5 != LIZJ || i6 != size3) {
            C3L4 c3l4 = (C3L4) ORZ.LLFII(arrayList);
            if (c3l4 != null) {
                j = c3l4.LJLJL;
            } else {
                j = 0;
            }
            Iterator<Map.Entry<String, Long>> it2 = LIZLLL.entrySet().iterator();
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                boolean hasNext = it2.hasNext();
                c81413Hl = C81413Hl.LIZ;
                if (!hasNext) {
                    break;
                }
                Map.Entry<String, Long> next = it2.next();
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(next.getKey());
                Integer num = (Integer) hashMap.get(next.getKey());
                if (num != null) {
                    j2 = num.intValue();
                } else {
                    j2 = 0;
                }
                if (hashMap.remove(next.getKey()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (j2 == next.getValue().longValue()) {
                    i++;
                } else if (!z) {
                    i3++;
                    c81413Hl.LIZLLL(LIZ2, jSONObject3);
                    if (LIZ2 != null) {
                        AnonymousClass325.LIZ.getClass();
                        long LIZLLL2 = AnonymousClass325.LIZLLL(AnonymousClass325.LJ(LIZ2));
                        C109544Rq lastShowMessage = LIZ2.getLastShowMessage();
                        if (lastShowMessage != null) {
                            j3 = lastShowMessage.getCreatedAt();
                        } else {
                            j3 = 0;
                        }
                        if (LIZLLL2 < j3) {
                            LIZLLL2 = j3;
                        }
                        if (LIZ2.isStickTop()) {
                            long updatedTime = LIZ2.getUpdatedTime();
                            if (LIZLLL2 < updatedTime) {
                                LIZLLL2 = updatedTime;
                            }
                        }
                        jSONObject3.putOpt("conv_update_at", Long.valueOf(LIZLLL2));
                        jSONObject3.putOpt("inbox_min_update_at", Long.valueOf(j));
                    }
                } else {
                    i2++;
                    c81413Hl.LIZLLL(LIZ2, jSONObject);
                }
            }
            i4 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                i4++;
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                c81413Hl.LIZLLL(C4WC.LIZIZ.LIZ((String) entry.getKey()), jSONObject2);
            }
        } else {
            i = 0;
            i4 = 0;
            i2 = 0;
            i3 = 0;
        }
        C34B.LJI("SessionListUnreadHelper", "unreadCountFromModel: " + LIZJ + ", unreadCntFromInbox: " + i5);
        java.util.Map<String, String> LJJL = C113554cx.LJJL(new OSZ("unread_count_from_inbox", String.valueOf(i5)), new OSZ("unread_count_from_model", String.valueOf(LIZJ)), new OSZ("loaded_conv_count", String.valueOf(size)), new OSZ("total_conv_count", String.valueOf(size2)), new OSZ("invalid_conv_count", String.valueOf(i7)), new OSZ("unread_conv_count_from_inbox", String.valueOf(i6)), new OSZ("unread_conv_count_from_model", String.valueOf(size3)), new OSZ("conv_count_with_same_unread", String.valueOf(i)), new OSZ("conv_count_with_different_unread", String.valueOf(i2)), new OSZ("conv_count_only_in_inbox", String.valueOf(i4)), new OSZ("conv_count_only_in_model", String.valueOf(i3)), new OSZ("conv_info_with_different_unread", jSONObject.toString()), new OSZ("conv_info_only_in_inbox", jSONObject2.toString()), new OSZ("conv_info_only_in_model", jSONObject3.toString()));
        StringBuilder sb = new StringBuilder("difference: ");
        sb.append(LJJL);
        C34B.LJI("SessionListUnreadHelper", sb.toString());
        C62822Ol8 c62822Ol8 = IMInboxUnreadCountDiffCheckSettings.LIZIZ;
        if (((IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig) c62822Ol8.getValue()).eventTrackingConfig != 0) {
            C85323Wm LIZ3 = C772831o.LIZ();
            if (((IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig) c62822Ol8.getValue()).eventTrackingConfig == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LIZ3.LIZIZ("session_unread_count_check", LJJL);
            } else if (i6 != size3) {
                LIZ3.LIZIZ("session_unread_count_check", LJJL);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
