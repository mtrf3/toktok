package X;

import fjb.a;
import kotlin.jvm.internal.IDqS0S0200100;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader$downloadSongInfo$2$deferredList$1$1", f = "KaraokeDownloader.kt", l = {129, 130}, m = "invokeSuspend")
/* renamed from: X.2G1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ OSZ<String, String> LJLJI;
    public final /* synthetic */ C279917z LJLJJI;
    public final /* synthetic */ C23080vQ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2G1(int i, OSZ<String, String> osz, C279917z c279917z, C23080vQ c23080vQ, InterfaceC67352kd<? super C2G1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = osz;
        this.LJLJJI = c279917z;
        this.LJLJJL = c23080vQ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2G1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            long j = this.LJLILLLLZI * 500;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String first = this.LJLJI.getFirst();
        String second = this.LJLJI.getSecond();
        long j2 = this.LJLJJI.LIZ;
        C23080vQ c23080vQ = this.LJLJJL;
        this.LJLIL = 2;
        c23080vQ.getClass();
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
        C79258V8s.LIZ.LIZIZ(new C31824CeK(second, EnumC31874Cf8.LIVE_KARAOKE, null, null, first, null, false, 0, false, 1004), new IDqS0S0200100(c23080vQ, j2, c84654XKg, 6));
        obj2 = c84654XKg.LIZ();
        if (obj2 != enumC58928NAu) {
            return obj2;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
