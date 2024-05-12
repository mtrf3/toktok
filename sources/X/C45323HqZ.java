package X;

import android.content.Context;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HqZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45323HqZ implements InterfaceC83472WpQ {
    public final Context LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "apply_music";
    }

    public C45323HqZ(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = context;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = C221108m2.LIZIZ(C45326Hqc.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 573));
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 574));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00cc, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.ss.android.ugc.aweme.shortvideo.model.MusicModel, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C45241HpF r22, X.InterfaceC67352kd r23) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45323HqZ.LIZLLL(X.HpF, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r11, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r12, X.InterfaceC67352kd<? super X.C3C5<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C242859g1
            if (r0 == 0) goto L51
            r4 = r13
            X.9g1 r4 = (X.C242859g1) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L57
            X.C141335gf.LIZJ(r3)
        L20:
            X.3C5 r3 = (X.C3C5) r3
            java.lang.Object r0 = r3.m15unboximpl()
            return r0
        L27:
            X.C141335gf.LIZJ(r3)
            r5 = r11
            r4.LJLIL = r5
            r4.getClass()
            r4.LJLJJI = r0
            X.XKg r1 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r4)
            r1.<init>(r0)
            com.ss.android.ugc.aweme.music.service.IMusicService r4 = com.ss.android.ugc.aweme.component.music.MusicService.LJJLIIIJJI()
            r7 = 0
            r8 = 6
            X.Hqb r9 = new X.Hqb
            r6 = r12
            r9.<init>(r1, r6)
            r4.LJJJ(r5, r6, r7, r8, r9)
            java.lang.Object r3 = r1.LIZ()
            if (r3 != r2) goto L20
            return r2
        L51:
            X.9g1 r4 = new X.9g1
            r4.<init>(r10, r13)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45323HqZ.LIZJ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC83472WpQ
    public final /* bridge */ /* synthetic */ Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        return LIZLLL((C45241HpF) obj, interfaceC67352kd);
    }
}
