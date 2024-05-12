package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerParser$parse$musicShareStoryAsync$1", f = "CreationComposerParser.kt", l = {125}, m = "invokeSuspend")
/* renamed from: X.H8j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43577H8j extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C43575H8h LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ C68322mC<CanvasVideoData> LJLJJL;
    public final /* synthetic */ C68322mC<MusicShareStoryData> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43577H8j(C43575H8h c43575H8h, Context context, C68322mC<CanvasVideoData> c68322mC, C68322mC<MusicShareStoryData> c68322mC2, InterfaceC67352kd<? super C43577H8j> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c43575H8h;
        this.LJLJJI = context;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = c68322mC2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43577H8j(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C43575H8h c43575H8h = this.LJLJI;
            Context context = this.LJLJJI;
            this.LJLIL = context;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            C43579H8l c43579H8l = new C43579H8l(c43575H8h.LIZ);
            o.LJIIIZ(context, "context");
            MusicShareStoryInputData musicShareStoryData = c43579H8l.LIZ.getMusicShareStoryData();
            C5VH c5vh = new C5VH();
            C68322mC c68322mC = new C68322mC();
            C68322mC c68322mC2 = new C68322mC();
            c68322mC2.element = new MusicShareStoryData(null, null, 0, 0, null, null, null, null, null, 511, null);
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C43581H8n(c68322mC, xks, c5vh, c68322mC2, musicShareStoryData, context, c43579H8l, null), 3);
            obj2 = xks.LJIIJJI();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C68322mC<CanvasVideoData> c68322mC3 = this.LJLJJL;
        C68322mC<MusicShareStoryData> c68322mC4 = this.LJLJJLL;
        OSZ osz = (OSZ) obj2;
        c68322mC3.element = osz.getFirst();
        c68322mC4.element = osz.getSecond();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
