package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

/* loaded from: classes8.dex */
public final class GYW implements InterfaceC64672gJ<String> {
    public final /* synthetic */ InterfaceC64672gJ LJLIL;
    public final /* synthetic */ CreativeInfo LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ ForwardConfig LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.String r12, X.InterfaceC67352kd r13) {
        /*
            r11 = this;
            r10 = r12
            boolean r0 = r13 instanceof X.GYX
            if (r0 == 0) goto L45
            r4 = r13
            X.GYX r4 = (X.GYX) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L13:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L24
            if (r0 != r2) goto L4b
            X.C141335gf.LIZJ(r1)
        L21:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L24:
            X.C141335gf.LIZJ(r1)
            X.2gJ r1 = r11.LJLIL
            java.lang.String r10 = (java.lang.String) r10
            X.GYf r5 = new X.GYf
            com.ss.android.ugc.aweme.creative.CreativeInfo r6 = r11.LJLILLLLZI
            com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r7 = r11.LJLJI
            com.ss.android.ugc.aweme.services.story.forward.ForwardConfig r8 = r11.LJLJJI
            android.content.Context r0 = r11.LJLJJL
            X.OSZ r9 = X.C161986Xi.LIZ(r0)
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r5, r4)
            if (r0 != r3) goto L21
            return r3
        L45:
            X.GYX r4 = new X.GYX
            r4.<init>(r11, r13)
            goto L13
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GYW.emit(java.lang.Object, X.2kd):java.lang.Object");
    }

    public GYW(InterfaceC64672gJ interfaceC64672gJ, CreativeInfo creativeInfo, ForwardMedia forwardMedia, ForwardConfig forwardConfig, Context context) {
        this.LJLIL = interfaceC64672gJ;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = forwardMedia;
        this.LJLJJI = forwardConfig;
        this.LJLJJL = context;
    }
}
