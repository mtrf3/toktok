package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

/* loaded from: classes8.dex */
public final class GYK implements InterfaceC64672gJ<OSZ<? extends GYE, ? extends C163166am>> {
    public final /* synthetic */ InterfaceC64672gJ LJLIL;
    public final /* synthetic */ CreativeInfo LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ ForwardConfig LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.OSZ<? extends X.GYE, ? extends X.C163166am> r15, X.InterfaceC67352kd r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.GYL
            if (r0 == 0) goto L5a
            r4 = r3
            X.GYL r4 = (X.GYL) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L14:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L60
            X.C141335gf.LIZJ(r1)
        L22:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L25:
            X.C141335gf.LIZJ(r1)
            X.2gJ r1 = r14.LJLIL
            X.OSZ r15 = (X.OSZ) r15
            X.GYg r5 = new X.GYg
            com.ss.android.ugc.aweme.creative.CreativeInfo r6 = r14.LJLILLLLZI
            com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r7 = r14.LJLJI
            com.ss.android.ugc.aweme.services.story.forward.ForwardConfig r8 = r14.LJLJJI
            java.lang.Object r9 = r15.getFirst()
            X.GYE r9 = (X.GYE) r9
            java.lang.Object r10 = r15.getSecond()
            X.6am r10 = (X.C163166am) r10
            android.content.Context r0 = r14.LJLJJL
            X.OSZ r11 = X.C161986Xi.LIZ(r0)
            com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r0 = r14.LJLJI
            int r12 = r0.getOriginVideoAIGCLabelType()
            r13 = 128(0x80, float:1.8E-43)
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r5, r4)
            if (r0 != r3) goto L22
            return r3
        L5a:
            X.GYL r4 = new X.GYL
            r4.<init>(r14, r3)
            goto L14
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GYK.emit(java.lang.Object, X.2kd):java.lang.Object");
    }

    public GYK(InterfaceC64672gJ interfaceC64672gJ, CreativeInfo creativeInfo, ForwardMedia forwardMedia, ForwardConfig forwardConfig, Context context) {
        this.LJLIL = interfaceC64672gJ;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = forwardMedia;
        this.LJLJJI = forwardConfig;
        this.LJLJJL = context;
    }
}
