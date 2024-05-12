package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS135S0200000_1;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95773pN implements C4WV {
    public static final C95773pN LJLIL = new C95773pN();
    public static final ConcurrentHashMap<Long, Integer> LJLILLLLZI = new ConcurrentHashMap<>();
    public static final MutableLiveData<List<Long>> LJLJI = new MutableLiveData<>();
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<MutableLiveData<Integer>>> LJLJJI = new ConcurrentHashMap<>();
    public static boolean LJLJJL;

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String str, List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
    }

    static {
        ((CopyOnWriteArraySet) C63378Ou6.LIZIZ().LIZ).add(new InterfaceC63379Ou7() { // from class: X.30G
            @Override // X.InterfaceC63379Ou7
            public final void LIZ(ConversationApplyInfo conversationApplyInfo) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onNewConversationApply notifyInfo=");
                LIZ.append(conversationApplyInfo);
                C34B.LIZIZ("GroupRequestManager", X1D.LIZIZ(LIZ));
                C95773pN.LJLIL.getClass();
                if (!C95773pN.LJLJJL && conversationApplyInfo.apply_status == EnumC115774gX.APPLYING) {
                    String str = null;
                    if (1 != 0) {
                        ArrayList arrayList = new ArrayList();
                        java.util.Map<String, String> map = conversationApplyInfo.ext;
                        if (map != null) {
                            str = map.get("a:disable_inner_push");
                        }
                        if (!o.LJ("1", str)) {
                            Long l = conversationApplyInfo.conv_short_id;
                            o.LJIIIIZZ(l, "it.conv_short_id");
                            arrayList.add(l);
                        }
                        C95773pN.LIZJ(C47261Igj.LJJIJ(conversationApplyInfo.conv_short_id), arrayList, new AqS167S0100000_1(conversationApplyInfo, 300));
                    }
                }
            }

            @Override // X.InterfaceC63379Ou7
            public final void LIZIZ(ConversationApplyInfo conversationApplyInfo) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onNewApplyAck notifyInfo=");
                LIZ.append(conversationApplyInfo);
                C34B.LIZIZ("GroupRequestManager", X1D.LIZIZ(LIZ));
            }
        });
    }

    public static void LIZ(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            CopyOnWriteArrayList<MutableLiveData<Integer>> copyOnWriteArrayList = LJLJJI.get(Long.valueOf(longValue));
            if (copyOnWriteArrayList != null) {
                Iterator<MutableLiveData<Integer>> it2 = copyOnWriteArrayList.iterator();
                o.LJIIIIZZ(it2, "list.iterator()");
                while (it2.hasNext()) {
                    MutableLiveData<Integer> next = it2.next();
                    Integer num = LJLILLLLZI.get(Long.valueOf(longValue));
                    if (num == null) {
                        num = 0;
                    }
                    next.postValue(num);
                }
            }
        }
        LJLJI.postValue(list);
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLeaveConversation:");
            LIZ.append(c63120Opw.getConversationShortId());
            C34B.LIZIZ("GroupRequestManager", X1D.LIZIZ(LIZ));
            LJLILLLLZI.remove(Long.valueOf(c63120Opw.getConversationShortId()));
        }
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDissolveConversation:");
            LIZ.append(c63120Opw.getConversationShortId());
            C34B.LIZIZ("GroupRequestManager", X1D.LIZIZ(LIZ));
            LJLILLLLZI.remove(Long.valueOf(c63120Opw.getConversationShortId()));
        }
    }

    @Override // X.C4WP
    public final void dU(java.util.Map<String, C63120Opw> map) {
        Collection values;
        String str;
        if (map != null && (values = ((ConcurrentHashMap) map).values()) != null) {
            C95773pN c95773pN = LJLIL;
            List list = ORZ.LLJI(values);
            c95773pN.getClass();
            o.LJIIIZ(list, "list");
            int i = 0;
            String LIZ = C80763Ey.LIZ(false);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C63120Opw c63120Opw = (C63120Opw) obj;
                if (c63120Opw.isGroupChat()) {
                    C63088OpQ coreInfo = c63120Opw.getCoreInfo();
                    if (coreInfo == null || (str = Long.valueOf(coreInfo.getOwner()).toString()) == null) {
                        str = "";
                    }
                    if (o.LJ(str, LIZ)) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((C63120Opw) it.next()).getConversationShortId()));
            }
            int size = arrayList2.size() / 100;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = i * 100;
                int size2 = arrayList2.size();
                int i3 = i2 + 100;
                if (size2 > i3) {
                    size2 = i3;
                }
                LIZJ(arrayList2.subList(i2, size2), C61878OQg.INSTANCE, C30F.LJLIL);
                if (i != size) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void LIZIZ(long j, MutableLiveData liveData) {
        o.LJIIIZ(liveData, "liveData");
        ConcurrentHashMap<Long, CopyOnWriteArrayList<MutableLiveData<Integer>>> concurrentHashMap = LJLJJI;
        if (concurrentHashMap.get(Long.valueOf(j)) == null) {
            concurrentHashMap.put(Long.valueOf(j), new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<MutableLiveData<Integer>> copyOnWriteArrayList = concurrentHashMap.get(Long.valueOf(j));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(liveData);
        }
        Integer num = LJLILLLLZI.get(Long.valueOf(j));
        if (num == null) {
            num = 0;
        }
        liveData.postValue(num);
    }

    public static void LIZJ(List list, List list2, InterfaceC88472Yns interfaceC88472Yns) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C63378Ou6 LIZIZ = C63378Ou6.LIZIZ();
        final IDcS135S0200000_1 iDcS135S0200000_1 = new IDcS135S0200000_1(list2, interfaceC88472Yns, 7);
        LIZIZ.getClass();
        C63322OtC.LIZ("getUnReadAuditByConShortIds");
        AbstractC63515OwJ<C30E> abstractC63515OwJ = new AbstractC63515OwJ<C30E>(iDcS135S0200000_1) { // from class: X.4nr
            static {
                BatchGetConversationAuditUnreadRequestBody.registerAdapter();
                BatchGetConversationAuditUnreadResponseBody.registerAdapter();
            }

            {
                int value = EnumC63625Oy5.BATCH_GET_CONVERSATION_AUDIT_UNREAD.getValue();
            }

            @Override // X.AbstractC63515OwJ
            public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
                ResponseBody responseBody;
                Response response = c63622Oy2.LJLJL;
                if (response != null && (responseBody = response.body) != null && responseBody.getExtension(2042) != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC63515OwJ
            public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
                if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
                    LIZLLL(new C30E(((BatchGetConversationAuditUnreadResponseBody) c63622Oy2.LJLJL.body.getExtension(2042)).unread_count));
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GetConversationAuditUnReadHandler Failed, code = ");
                LIZ.append(c63622Oy2.LJLL);
                LIZ.append(" &status = ");
                LIZ.append(c63622Oy2.LJIIIZ());
                LIZ.append(" &checkCode = ");
                LIZ.append(c63622Oy2.LIZLLL());
                LIZ.append(" &checkMsg = ");
                LIZ.append(c63622Oy2.LJ());
                LIZ.append(" &logId = ");
                LIZ.append(c63622Oy2.LJIIIIZZ());
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
                C63337OtR.LJII(c63622Oy2, false).LIZ();
                LIZIZ(c63622Oy2);
            }
        };
        C120494o9 c120494o9 = new C120494o9();
        C63685Oz3.LIZ(list);
        c120494o9.LIZLLL = list;
        BatchGetConversationAuditUnreadRequestBody build = c120494o9.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LIZIZ(2042, BatchGetConversationAuditUnreadRequestBody.ADAPTER, build);
        abstractC63515OwJ.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
    }
}
