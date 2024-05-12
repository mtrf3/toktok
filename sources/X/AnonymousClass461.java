package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.jvm.internal.o;

/* renamed from: X.461, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass461<TemplateType extends BaseTemplate> extends AbstractC1041546x {
    public final C62822Ol8 LLIIIILZ;

    public abstract void m0(C109544Rq c109544Rq, C109544Rq c109544Rq2, TemplateType templatetype, int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass461(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIILZ = C221108m2.LIZIZ(AnonymousClass467.LJLIL);
        C221108m2.LIZIZ(C46C.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    @Override // X.AbstractC1041546x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(X.C109544Rq r7, X.C109544Rq r8, X.C109544Rq r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.P(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r4 = X.C1DJ.LJIILL(r7)
            if (r4 != 0) goto Lf
            return
        Lf:
            X.470 r1 = r6.LJLJJI
            if (r1 == 0) goto L18
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.LIZIZ(r0, r7)
        L18:
            X.470 r1 = r6.LJLJJI
            if (r1 == 0) goto L21
            r0 = 150994944(0x9000000, float:1.540744E-33)
            r1.LIZIZ(r0, r4)
        L21:
            r3 = 0
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent r5 = X.C44K.LIZ(r7, r4)     // Catch: java.lang.Exception -> L32
            if (r5 == 0) goto L3a
            X.472<com.bytedance.tux.input.TuxTextView> r2 = r6.LJLL
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r6.LLFZ
            X.3ud r0 = r6.LJLLL
            X.C101323yK.LIZJ(r7, r5, r2, r1, r0)
            goto L3f
        L32:
            r2 = move-exception
            java.lang.String r1 = "MessageNoticeHelper"
            java.lang.String r0 = "getSystemNotice json error:"
            X.C34B.LIZLLL(r1, r0, r2)
        L3a:
            X.472<com.bytedance.tux.input.TuxTextView> r0 = r6.LJLL
            r0.LIZIZ()
        L3f:
            r6.m0(r7, r8, r4, r10)
            X.3ud r0 = r6.LJLLL
            r2 = 0
            if (r0 == 0) goto L7f
            boolean r1 = r0.isHighRiskConversation()
        L4b:
            r0 = -1
            boolean r0 = X.C109434Rf.LJIIIZ(r7, r0, r1)
            if (r0 == 0) goto L6c
            X.462 r1 = r6.LLF
            if (r1 == 0) goto L6c
            X.3ud r0 = r6.LJLLL
            if (r0 == 0) goto L6a
            boolean r0 = r0.isReportPage()
        L5e:
            r1.LIZLLL = r7
            r1.LJFF = r4
            r1.LJIIIZ = r0
            r1.LJIIIIZZ = r3
            r1.LIZ(r2)
        L69:
            return
        L6a:
            r0 = 0
            goto L5e
        L6c:
            X.462 r1 = r6.LLF
            if (r1 == 0) goto L69
            X.472<com.bytedance.tux.icon.TuxIconView> r0 = r1.LIZ
            if (r0 == 0) goto L77
            r0.LIZIZ()
        L77:
            X.472<android.view.View> r0 = r1.LIZIZ
            if (r0 == 0) goto L69
            r0.LIZIZ()
            goto L69
        L7f:
            r1 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass461.P(X.4Rq, X.4Rq, X.4Rq, int):void");
    }
}
