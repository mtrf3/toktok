package X;

import com.bytedance.im.core.proto.Request;
import kotlin.jvm.internal.o;

/* renamed from: X.OyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63650OyU {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC117594jT LIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZIZ;
    public final InterfaceC65784Pro<C114444eO> LIZJ;

    public C63650OyU(C63589OxV c63589OxV) {
        C63649OyT getClientBridge = C63649OyT.LJLIL;
        C63676Oyu getClientIMOptions = C63676Oyu.LJLIL;
        o.LJIIIZ(getClientBridge, "getClientBridge");
        o.LJIIIZ(getClientIMOptions, "getClientIMOptions");
        this.LIZ = c63589OxV;
        this.LIZIZ = getClientBridge;
        this.LIZJ = getClientIMOptions;
    }

    public final Request LIZ(int i, int i2) {
        C63671Oyp c63671Oyp = new C63671Oyp();
        if (i2 > 0) {
            c63671Oyp.LIZLLL = Integer.valueOf(i2);
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJII = c63671Oyp.build();
        return C32151Nz.LJ(i, EnumC63625Oy5.GET_CONVERSATIONS_CHECK_INFO_V2.getValue(), c89453Z8v.build(), this.LIZIZ.invoke(), this.LIZJ.invoke());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:13)(2:10|11))(3:35|36|(1:38))|14|(3:16|17|(2:19|20)(8:21|(1:23)|24|(1:26)(1:32)|27|(1:31)|29|30))|34|17|(0)(0)))|41|6|7|(0)(0)|14|(0)|34|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0054, code lost:
    
        X.C63322OtC.LJI("ConversationCompletenessUseCase", "fetch error", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: Oxf -> 0x0053, TRY_LEAVE, TryCatch #0 {Oxf -> 0x0053, blocks: (B:13:0x0045, B:14:0x0048, B:16:0x0050, B:36:0x002f), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r7, int r8, X.InterfaceC67352kd<? super X.C63412Oue> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C63666Oyk
            if (r0 == 0) goto L1e
            r5 = r9
            X.Oyk r5 = (X.C63666Oyk) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L24
            goto L45
        L1e:
            X.Oyk r5 = new X.Oyk
            r5.<init>(r6, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            X.OxU r2 = new X.OxU     // Catch: X.C63599Oxf -> L53
            com.bytedance.im.core.proto.Request r1 = r6.LIZ(r7, r8)     // Catch: X.C63599Oxf -> L53
            r0 = 510(0x1fe, float:7.15E-43)
            r2.<init>(r1, r0)     // Catch: X.C63599Oxf -> L53
            X.4jT r0 = r6.LIZ     // Catch: X.C63599Oxf -> L53
            r5.LJLJI = r3     // Catch: X.C63599Oxf -> L53
            java.lang.Object r1 = r0.LIZIZ(r2, r3, r5)     // Catch: X.C63599Oxf -> L53
            if (r1 != r4) goto L48
            return r4
        L45:
            X.C141335gf.LIZJ(r1)     // Catch: X.C63599Oxf -> L53
        L48:
            X.Oyt r1 = (X.C63675Oyt) r1     // Catch: X.C63599Oxf -> L53
            com.bytedance.im.core.proto.Response r0 = r1.LJLIL     // Catch: X.C63599Oxf -> L53
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C63599Oxf -> L53
            if (r0 == 0) goto L5b
            com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody r5 = r0.get_conversations_check_info_v2_body     // Catch: X.C63599Oxf -> L53
            goto L5c
        L53:
            r2 = move-exception
            java.lang.String r1 = "ConversationCompletenessUseCase"
            java.lang.String r0 = "fetch error"
            X.C63322OtC.LJI(r1, r0, r2)
        L5b:
            r5 = 0
        L5c:
            r4 = 0
            if (r5 != 0) goto L67
            X.Oue r1 = new X.Oue
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.<init>(r0, r4, r3)
            return r1
        L67:
            X.Oue r3 = new X.Oue
            java.util.List<com.bytedance.im.core.proto.ConversationCheckInfoV2> r2 = r5.conv_list
            if (r2 != 0) goto L6f
            X.OQg r2 = X.C61878OQg.INSTANCE
        L6f:
            java.lang.Boolean r0 = r5.is_pinned_included
            if (r0 != 0) goto L81
            r1 = 0
        L74:
            java.lang.Boolean r0 = r5.is_demoted
            if (r0 != 0) goto L7c
        L78:
            r3.<init>(r2, r1, r4)
            return r3
        L7c:
            boolean r4 = r0.booleanValue()
            goto L78
        L81:
            boolean r1 = r0.booleanValue()
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63650OyU.LIZIZ(int, int, X.2kd):java.lang.Object");
    }
}
