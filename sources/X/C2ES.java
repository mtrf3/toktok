package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$onInit$1", f = "BGMPlaylistViewModel.kt", l = {94, 95, 96, 99}, m = "invokeSuspend")
/* renamed from: X.2ES, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ES extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMPlaylistViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2ES(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd<? super C2ES> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMPlaylistViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2ES(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[SYNTHETIC] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLIL
            r8 = 0
            r6 = 0
            r5 = 4
            r11 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1a
            if (r0 == r1) goto L28
            if (r0 == r2) goto L36
            if (r0 == r11) goto L72
            if (r0 != r5) goto L8c
            X.C141335gf.LIZJ(r14)
        L17:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1a:
            X.C141335gf.LIZJ(r14)
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r13.LJLILLLLZI
            r13.LJLIL = r1
            java.lang.Object r0 = r0.iv0(r13)
            if (r0 != r7) goto L2b
            return r7
        L28:
            X.C141335gf.LIZJ(r14)
        L2b:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r13.LJLILLLLZI
            r13.LJLIL = r2
            java.lang.Object r0 = r0.hv0(r13)
            if (r0 != r7) goto L39
            return r7
        L36:
            X.C141335gf.LIZJ(r14)
        L39:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r10 = r13.LJLILLLLZI
            java.util.List r0 = r10.jv0()
            java.util.Iterator r12 = r0.iterator()
        L43:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r9 = r12.next()
            r0 = r9
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0
            long r3 = r0.id
            X.J0d<java.lang.Long> r0 = X.InterfaceC30442Bx8.S
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L5d
            goto L43
        L5d:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L43
            goto L67
        L66:
            r9 = r6
        L67:
            webcast.data.MusicSong r9 = (webcast.data.MusicSong) r9
            r13.LJLIL = r11
            java.lang.Object r0 = r10.qv0(r9, r13)
            if (r0 != r7) goto L75
            return r7
        L72:
            X.C141335gf.LIZJ(r14)
        L75:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r13.LJLILLLLZI
            X.XLL r3 = r0.LJLJI
            X.1Ve r2 = new X.1Ve
            java.util.List r1 = r0.jv0()
            r0 = 6
            r2.<init>(r1, r6, r8, r0)
            r13.LJLIL = r5
            java.lang.Object r0 = r3.emit(r2, r13)
            if (r0 != r7) goto L17
            return r7
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ES.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
