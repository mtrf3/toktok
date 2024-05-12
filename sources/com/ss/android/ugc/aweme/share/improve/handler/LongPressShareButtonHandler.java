package com.ss.android.ugc.aweme.share.improve.handler;

import X.C1DD;
import X.C62358Ode;
import X.C62385Oe5;
import X.C62507Og3;
import X.C65352Pkq;
import X.InterfaceC62225ObV;
import X.InterfaceC62526OgM;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LongPressShareButtonHandler extends TTShareDefaultHandler<AwemeSharePackage> {
    public final C62385Oe5 LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZJ(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage) {
        return C62358Ode.LIZIZ(interfaceC62225ObV, baseSharePackage.itemType, 0);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZLLL(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage) {
        return o.LJ(interfaceC62225ObV.key(), "email");
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJFF(BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        return C62358Ode.LIZ(channel, sharePackage.itemType, sharePackage.description);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJI(BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (o.LJ(channel.key(), "email")) {
            return C1DD.LIZLLL(R.string.psa, "{\n            chaosConte….quick_look_tt)\n        }");
        }
        return sharePackage.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressShareButtonHandler(AwemeSharePackage awemeSharePackage, C62385Oe5 c62385Oe5, Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = c62385Oe5;
        C65352Pkq.LIZ(AwemeSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC62526OgM LJ(Context context, BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        return new C62507Og3(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC62225ObV r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7, X.InterfaceC67352kd<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C62506Og2
            if (r0 == 0) goto L43
            r4 = r8
            X.Og2 r4 = (X.C62506Og2) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L49
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r1 = r7.extras
            java.lang.String r0 = "share_url"
            r1.putString(r0, r3)
            android.os.Bundle r2 = r7.extras
            java.lang.String r1 = "share_form"
            java.lang.String r0 = "url_form"
            r2.putString(r1, r0)
            return r3
        L35:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r7
            r4.LJLJJI = r0
            java.lang.Object r3 = super.LJII(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.Og2 r4 = new X.Og2
            r4.<init>(r5, r8)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler.LJII(X.ObV, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r4
      0x0029: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v0 java.lang.Object) binds: [B:17:0x0066, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(android.content.Context r12, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r13, X.InterfaceC62225ObV r14, android.view.View r15, X.InterfaceC67352kd<? super java.lang.Boolean> r16) {
        /*
            r11 = this;
            r6 = r12
            r7 = r13
            r3 = r16
            r9 = r15
            r8 = r14
            boolean r0 = r3 instanceof X.C62505Og1
            if (r0 == 0) goto L69
            r10 = r3
            X.Og1 r10 = (X.C62505Og1) r10
            int r2 = r10.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r10.LJLJLJ = r2
        L18:
            java.lang.Object r4 = r10.LJLJJLL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJLJ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L2a
            if (r0 != r2) goto L6f
            X.C141335gf.LIZJ(r4)
        L29:
            return r4
        L2a:
            java.lang.Object r9 = r10.LJLJJL
            android.view.View r9 = (android.view.View) r9
            X.ObV r8 = r10.LJLJJI
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7 = r10.LJLJI
            java.lang.Object r6 = r10.LJLILLLLZI
            android.content.Context r6 = (android.content.Context) r6
            com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler r5 = r10.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L55
        L3c:
            X.C141335gf.LIZJ(r4)
            X.Oe5 r0 = r11.LJLILLLLZI
            r10.LJLIL = r11
            r10.LJLILLLLZI = r6
            r10.LJLJI = r7
            r10.LJLJJI = r8
            r10.LJLJJL = r9
            r10.LJLJLJ = r1
            java.lang.Object r0 = r0.LIZIZ(r6, r7, r8, r10)
            if (r0 != r3) goto L54
            return r3
        L54:
            r5 = r11
        L55:
            r0 = 0
            r10.LJLIL = r0
            r10.LJLILLLLZI = r0
            r10.LJLJI = r0
            r10.LJLJJI = r0
            r10.LJLJJL = r0
            r10.LJLJLJ = r2
            java.lang.Object r4 = super.LJIIJ(r6, r7, r8, r9, r10)
            if (r4 != r3) goto L29
            return r3
        L69:
            X.Og1 r10 = new X.Og1
            r10.<init>(r11, r3)
            goto L18
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler.LJIIJ(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.ObV, android.view.View, X.2kd):java.lang.Object");
    }
}
