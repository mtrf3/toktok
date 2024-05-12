package X;

import android.content.Context;

/* renamed from: X.3et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89273et extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ java.util.Map<String, String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89273et(Context context, String str, String str2, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.LJLIL = map;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = context;
        this.LJLJL = z2;
        this.LJLJLJ = z3;
        this.LJLJLLL = interfaceC65784Pro2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "notification_page") != false) goto L14;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(java.lang.Boolean r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r19
            r3 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = X.C78685UuP.LJJJZ(r3)
            r0 = r18
            if (r1 == 0) goto L1d
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.LJLIL
            if (r2 == 0) goto L1d
            java.lang.String r1 = "enter_method"
            r2.put(r1, r3)
        L1d:
            X.3eK r1 = X.C88903eI.LIZ()
            java.lang.String r2 = r0.LJLILLLLZI
            X.4MW r1 = (X.C4MW) r1
            r1.LJIIIIZZ(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent$Companion r12 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent.Companion
            java.lang.String r13 = "👋👋👋"
            r14 = 0
            r16 = 6
            r11 = 0
            r15 = r14
            r17 = r14
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent r2 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent.Companion.obtain$default(r12, r13, r14, r15, r16, r17)
            r1.LIZLLL(r2)
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.LJLIL
            X.4MX r2 = r1.LIZ
            r2.LJII = r3
            X.3f0 r2 = new X.3f0
            boolean r3 = r0.LJLJJI
            X.Pro<java.lang.Boolean> r4 = r0.LJLJJL
            android.content.Context r6 = r0.LJLJJLL
            boolean r7 = r0.LJLJL
            java.lang.String r8 = r0.LJLJI
            boolean r9 = r0.LJLJLJ
            X.Pro<X.UCe> r10 = r0.LJLJLLL
            r2.<init>()
            r1.LJII(r2)
            com.bytedance.keva.Keva r4 = X.C89263es.LIZ()
            java.lang.String r1 = r0.LJLJI
            if (r1 != 0) goto L70
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.LJLIL
            if (r2 == 0) goto Lc6
            java.lang.String r1 = "enter_from"
            java.lang.Object r2 = r2.get(r1)
        L68:
            java.lang.String r1 = "notification_page"
            boolean r1 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r1 == 0) goto L75
        L70:
            java.lang.String r1 = r0.LJLILLLLZI
            X.C89263es.LJ(r4, r1)
        L75:
            java.lang.String r3 = r0.LJLILLLLZI
            java.lang.String r1 = "userId"
            kotlin.jvm.internal.o.LJIIIZ(r3, r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r2 = "key_has_chat_history"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L96
            r1 = 1
            X.C65429Pm5.LJ(r2, r3, r4, r1)
        L96:
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.LJLIL
            if (r2 == 0) goto Lc4
            java.lang.String r1 = "follow_status"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc4
            int r10 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)
        La8:
            X.UUc r1 = X.C77266UUc.LIZIZ
            X.M4C r1 = r1.getRelationService()
            com.ss.android.ugc.aweme.common.EventLiveData r1 = r1.LJFF()
            com.ss.android.ugc.aweme.relation.follow.model.RelationStatus r8 = new com.ss.android.ugc.aweme.relation.follow.model.RelationStatus
            java.lang.String r9 = r0.LJLILLLLZI
            r14 = 28
            r12 = r11
            r13 = r11
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.postValue(r8)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc4:
            r10 = 2
            goto La8
        Lc6:
            r2 = 0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89273et.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
