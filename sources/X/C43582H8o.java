package X;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.MusicShareStoryParser$prepareMusicShareStoryResource$1$coverTask$1", f = "MusicShareStoryParser.kt", l = {173}, m = "invokeSuspend")
/* renamed from: X.H8o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43582H8o extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MusicShareStoryInputData LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ C68322mC<MusicShareStoryData> LJLJJL;
    public final /* synthetic */ C5VH LJLJJLL;
    public final /* synthetic */ C43579H8l LJLJL;
    public final /* synthetic */ C68322mC<String> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43582H8o(MusicShareStoryInputData musicShareStoryInputData, Context context, C68322mC<MusicShareStoryData> c68322mC, C5VH c5vh, C43579H8l c43579H8l, C68322mC<String> c68322mC2, InterfaceC67352kd<? super C43582H8o> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = musicShareStoryInputData;
        this.LJLJJI = context;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = c5vh;
        this.LJLJL = c43579H8l;
        this.LJLJLJ = c68322mC2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43582H8o(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            MusicShareStoryInputData musicShareStoryInputData = this.LJLJI;
            Context context = this.LJLJJI;
            C68322mC<MusicShareStoryData> c68322mC = this.LJLJJL;
            C5VH c5vh = this.LJLJJLL;
            C43579H8l c43579H8l = this.LJLJL;
            C68322mC<String> c68322mC2 = this.LJLJLJ;
            this.LJLIL = context;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            if (musicShareStoryInputData != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(musicShareStoryInputData.getCoverUrl()));
                LJII.LIZJ = context;
                LJII.LIZIZ("MusicShareStoryParser");
                LJII.LJIIIZ(new C82795WeV(xks, c68322mC, c5vh, c43579H8l, c68322mC2));
                if (xks.LJIIJJI() == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
