package X;

import X.C0RN;
import X.C84023Rm;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMFamiliarService$fetchFamiliarRelationsTask$1;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84023Rm implements InterfaceC84043Ro {
    public final java.util.Map<String, Integer> LIZ = new LinkedHashMap();
    public final C3RW LIZIZ = C3RW.LIZ;

    @Override // X.InterfaceC84043Ro
    public final void LIZJ(C67852lR c67852lR) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.im.sdk.common.data.service.IMFamiliarService$fetchFamiliarRelationsTask$1] */
    @Override // X.InterfaceC84043Ro
    public final IMFamiliarService$fetchFamiliarRelationsTask$1 LIZIZ() {
        return new EE1() { // from class: com.ss.android.ugc.aweme.im.sdk.common.data.service.IMFamiliarService$fetchFamiliarRelationsTask$1
            @Override // X.EEY
            public final String key() {
                return "IMFamiliarService$fetchFamiliarRelationsTask$1";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BOOT_FINISH;
            }

            @Override // X.EEY
            public final void run(Context context) {
                C84023Rm.this.LIZLLL();
            }
        };
    }

    @Override // X.InterfaceC84043Ro
    public final void LIZLLL() {
        if (C80763Ey.LIZLLL()) {
            C3YT.LJLIL.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C770430q(null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    @Override // X.InterfaceC84043Ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.lang.String r8, com.ss.android.ugc.aweme.im.service.model.IMUser r9, X.InterfaceC67352kd<? super java.lang.String> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C84033Rn
            if (r0 == 0) goto L98
            r4 = r10
            X.3Rn r4 = (X.C84033Rn) r4
            int r2 = r4.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r4.LJLJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJJL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJL
            r1 = 1
            if (r0 == 0) goto L70
            if (r0 != r1) goto L9f
            com.ss.android.ugc.aweme.im.service.model.IMUser r9 = r4.LJLJJI
            java.lang.Object r8 = r4.LJLJI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.LJLILLLLZI
            java.lang.String r7 = (java.lang.String) r7
            X.3Rm r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L2c:
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.LIZ
            r0.putAll(r3)
        L33:
            if (r9 != 0) goto L39
            com.ss.android.ugc.aweme.im.service.model.IMUser r9 = X.C80533Eb.LJFF(r7, r8)
        L39:
            X.2mC r4 = new X.2mC
            r4.<init>()
            java.lang.String r0 = ""
            r4.element = r0
            if (r9 == 0) goto L5d
            X.3RW r0 = r5.LIZIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.sdk.relations.data.model.RelationTypeParameters r3 = X.C3RW.LIZIZ
            int r2 = r3.type
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r5.LIZ
            java.lang.String r0 = r9.getSecUid()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L60
        L5d:
            T r0 = r4.element
            return r0
        L60:
            int r0 = r0.intValue()
            if (r2 != r0) goto L5d
            X.3RW r0 = r5.LIZIZ
            r0.getClass()
            java.lang.String r0 = r3.event
            r4.element = r0
            goto L5d
        L70:
            X.C141335gf.LIZJ(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r6.LIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L96
            X.Ol8 r0 = X.C3S6.LIZ
            java.lang.Object r0 = r0.getValue()
            X.3aM r0 = (X.C86463aM) r0
            r4.LJLIL = r6
            r4.LJLILLLLZI = r7
            r4.LJLJI = r8
            r4.LJLJJI = r9
            r4.LJLJL = r1
            java.lang.Object r3 = r0.LJFF(r4)
            if (r3 != r2) goto L94
            return r2
        L94:
            r5 = r6
            goto L2c
        L96:
            r5 = r6
            goto L33
        L98:
            X.3Rn r4 = new X.3Rn
            r4.<init>(r6, r10)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84023Rm.LIZ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMUser, X.2kd):java.lang.Object");
    }
}
