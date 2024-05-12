package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.31Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31Z {
    public static final C31Z ASSEMBLE;
    public static final /* synthetic */ C31Z[] LJLIL;
    public static final C31Z NORMAL;

    public C31Z() {
        throw null;
    }

    public static C31Z valueOf(String str) {
        return (C31Z) V0N.LJJJ(C31Z.class, str);
    }

    public static C31Z[] values() {
        return (C31Z[]) LJLIL.clone();
    }

    public abstract void enqueueConversations(List<? extends C63120Opw> list, int i);

    public abstract void enqueueMsg(List<? extends C109544Rq> list, int i);

    static {
        C31Z c31z = new C31Z() { // from class: X.31c
            @Override // X.C31Z
            public final void enqueueConversations(List<? extends C63120Opw> conversationList, int i) {
                o.LJIIIZ(conversationList, "conversationList");
                for (C63120Opw conversation : conversationList) {
                    Queue<C771931f> queue = C3GW.LIZIZ;
                    C771931f.LJI.getClass();
                    o.LJIIIZ(conversation, "conversation");
                    ((LinkedBlockingDeque) queue).offer(new C771931f(EnumC772331j.CONVERSATION, i, null, conversation, null, null, 52));
                }
            }

            @Override // X.C31Z
            public final void enqueueMsg(List<? extends C109544Rq> msgList, int i) {
                o.LJIIIZ(msgList, "msgList");
                for (C109544Rq message : msgList) {
                    Queue<C771931f> queue = C3GW.LIZIZ;
                    C771931f.LJI.getClass();
                    o.LJIIIZ(message, "message");
                    ((LinkedBlockingDeque) queue).offer(new C771931f(EnumC772331j.MESSAGE, i, message, null, null, null, 56));
                }
            }
        };
        NORMAL = c31z;
        C31Z c31z2 = new C31Z() { // from class: X.31d
            @Override // X.C31Z
            public final void enqueueConversations(List<? extends C63120Opw> conversationList, int i) {
                o.LJIIIZ(conversationList, "conversationList");
                List<C771931f> list = C3GW.LIZJ;
                ArrayList arrayList = new ArrayList(C32I.LJJL(conversationList, 10));
                for (C63120Opw conversation : conversationList) {
                    C771931f.LJI.getClass();
                    o.LJIIIZ(conversation, "conversation");
                    arrayList.add(new C771931f(EnumC772331j.CONVERSATION, i, null, conversation, null, null, 52));
                }
                list.addAll(arrayList);
            }

            @Override // X.C31Z
            public final void enqueueMsg(List<? extends C109544Rq> msgList, int i) {
                o.LJIIIZ(msgList, "msgList");
                List<C771931f> list = C3GW.LIZJ;
                ArrayList arrayList = new ArrayList(C32I.LJJL(msgList, 10));
                for (C109544Rq message : msgList) {
                    C771931f.LJI.getClass();
                    o.LJIIIZ(message, "message");
                    arrayList.add(new C771931f(EnumC772331j.MESSAGE, i, message, null, null, null, 56));
                }
                list.addAll(arrayList);
            }
        };
        ASSEMBLE = c31z2;
        LJLIL = new C31Z[]{c31z, c31z2};
    }

    public C31Z(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
