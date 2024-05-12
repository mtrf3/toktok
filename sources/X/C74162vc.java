package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.storage.model.LocalPushBatchEvent;
import com.ss.android.ugc.aweme.relation.storage.model.LocalPushRawEvent;
import com.ss.android.ugc.aweme.relation.storage.model.UserData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74162vc implements InterfaceC67072QUa {
    public final InterfaceC88473Ynt<String, List<? extends AbstractC74232vj>, InterfaceC67352kd<? super C76800UCe>, Object> LJLIL;

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        byte[] bArr;
        final long j;
        Object c74202vg;
        if (c67074QUc == null || (bArr = c67074QUc.LIZ) == null) {
            return;
        }
        String str = c67074QUc.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDataUpdate, uid: ");
        LIZ.append(str);
        LIZ.append(' ');
        C69542oA.LIZIZ("SyncReceiver", X1D.LIZIZ(LIZ));
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        if (curSecUserId == null) {
            curSecUserId = "";
        }
        final String LIZ2 = C69582oE.LIZ();
        if (str == null || str.length() == 0 || o.LJ(str, CardStruct.IStatusCode.DEFAULT) || !o.LJ(curSecUserId, str)) {
            C69542oA.LIZ("SyncReceiver", "update uid is not current login user!", null);
            return;
        }
        try {
            String str2 = new String(bArr, PVC.LIZ);
            LocalPushBatchEvent localPushBatchEvent = (LocalPushBatchEvent) C75792yF.LIZ(str2, LocalPushBatchEvent.class);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("update raw json: ");
            LIZ3.append(str2);
            C69542oA.LIZIZ("SyncReceiver", X1D.LIZIZ(LIZ3));
            if (localPushBatchEvent != null) {
                List<LocalPushRawEvent> list = localPushBatchEvent.events;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    for (LocalPushRawEvent localPushRawEvent : list) {
                        o.LJIIIZ(localPushRawEvent, "<this>");
                        Long l = localPushRawEvent.createTime;
                        if (l != null || (l = Long.valueOf(NetworkService.LJI().LIZ())) != null) {
                            j = l.longValue();
                        } else {
                            j = -1;
                        }
                        Integer num = localPushRawEvent.eventType;
                        if (num != null) {
                            if (num.intValue() == 1) {
                                Integer num2 = localPushRawEvent.signalType;
                                if (num2 != null) {
                                    if (num2.intValue() == 1) {
                                        c74202vg = new AbstractC74182ve(LIZ2, j) { // from class: X.2vi
                                            public final String toString() {
                                                return "FullPullEvent";
                                            }
                                        };
                                    } else if (num2.intValue() == 2) {
                                        c74202vg = new AbstractC74182ve(LIZ2, j) { // from class: X.2vd
                                            public final String toString() {
                                                return "FullDeleteEvent";
                                            }
                                        };
                                    }
                                }
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("unknown signal type: ");
                                LIZ4.append(localPushRawEvent.signalType);
                                throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
                            }
                            if (num.intValue() == 2) {
                                Integer num3 = localPushRawEvent.syncType;
                                if (num3 != null) {
                                    if (num3.intValue() == 1) {
                                        UserData userData = localPushRawEvent.afterUser;
                                        if (userData != null) {
                                            c74202vg = new C74212vh(userData, LIZ2, j);
                                        } else {
                                            throw new IllegalArgumentException("afterUser is null");
                                        }
                                    } else if (num3.intValue() == 2) {
                                        UserData userData2 = localPushRawEvent.beforeUser;
                                        if (userData2 != null) {
                                            c74202vg = new C74202vg(userData2, LIZ2, j);
                                        } else {
                                            throw new IllegalArgumentException("beforeUser is null");
                                        }
                                    }
                                }
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("unknown sync type: ");
                                LIZ5.append(localPushRawEvent.syncType);
                                throw new IllegalArgumentException(X1D.LIZIZ(LIZ5));
                            }
                            arrayList.add(c74202vg);
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("unknown event type: ");
                        LIZ6.append(localPushRawEvent.eventType);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ6));
                    }
                    XKX.LJ(MBB.INSTANCE, new C66562jM(this, LIZ2, arrayList, null));
                    return;
                }
                return;
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("rawEvent not should be null! raw: ");
            LIZ7.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ7);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        } catch (Throwable th) {
            C69542oA.LIZ("SyncReceiver", "onDataUpdate error", th);
        }
    }

    public C74162vc(C3GR type, C69672oN c69672oN) {
        o.LJIIIZ(type, "type");
        this.LJLIL = c69672oN;
        LHU.LIZIZ.LIZ(type, this);
    }
}
