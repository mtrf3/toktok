package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.MusicShareStoryParser$prepareMusicShareStoryResource$1", f = "MusicShareStoryParser.kt", l = {143}, m = "invokeSuspend")
/* renamed from: X.H8n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43581H8n extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C68322mC<Effect> LJLJI;
    public final /* synthetic */ InterfaceC67352kd<OSZ<CanvasVideoData, MusicShareStoryData>> LJLJJI;
    public final /* synthetic */ C5VH LJLJJL;
    public final /* synthetic */ C68322mC<MusicShareStoryData> LJLJJLL;
    public final /* synthetic */ MusicShareStoryInputData LJLJL;
    public final /* synthetic */ Context LJLJLJ;
    public final /* synthetic */ C43579H8l LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43581H8n(C68322mC<Effect> c68322mC, InterfaceC67352kd<? super OSZ<CanvasVideoData, MusicShareStoryData>> interfaceC67352kd, C5VH c5vh, C68322mC<MusicShareStoryData> c68322mC2, MusicShareStoryInputData musicShareStoryInputData, Context context, C43579H8l c43579H8l, InterfaceC67352kd<? super C43581H8n> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLJI = c68322mC;
        this.LJLJJI = interfaceC67352kd;
        this.LJLJJL = c5vh;
        this.LJLJJLL = c68322mC2;
        this.LJLJL = musicShareStoryInputData;
        this.LJLJLJ = context;
        this.LJLJLLL = c43579H8l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C43581H8n c43581H8n = new C43581H8n(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c43581H8n.LJLILLLLZI = obj;
        return c43581H8n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC c68322mC;
        String str;
        MusicModel music;
        MusicModel music2;
        MusicModel music3;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                c68322mC = (C68322mC) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            c68322mC = new C68322mC();
            c68322mC.element = "";
            InterfaceC68342mE[] interfaceC68342mEArr = {XKX.LIZIZ(interfaceC70422pa, null, null, new C43582H8o(this.LJLJL, this.LJLJLJ, this.LJLJJLL, this.LJLJJL, this.LJLJLLL, c68322mC, null), 3), XKX.LIZIZ(interfaceC70422pa, null, null, new C5ZJ(this.LJLJI, null), 3)};
            this.LJLILLLLZI = c68322mC;
            this.LJLIL = 1;
            if (T1W.LIZIZ(interfaceC68342mEArr, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (this.LJLJI.element == null || ((CharSequence) c68322mC.element).length() == 0) {
            InterfaceC67352kd<OSZ<CanvasVideoData, MusicShareStoryData>> interfaceC67352kd = this.LJLJJI;
            OSZ osz = new OSZ(null, new MusicShareStoryData(null, null, 0, 0, null, null, null, null, null, 511, null));
            C3C5.m7constructorimpl(osz);
            interfaceC67352kd.resumeWith(osz);
            return C76800UCe.LIZ;
        }
        InterfaceC67352kd<OSZ<CanvasVideoData, MusicShareStoryData>> interfaceC67352kd2 = this.LJLJJI;
        CanvasVideoData LJJJIL = C79234V7u.LJJJIL(this.LJLJJL, null, true);
        LJJJIL.setExtra(new CanvasExtra(0, 0, 0, 0, 0.0f, 0.0f, false, null, new ForwardCanvasExtra(3, null, 0, false, null, null, 0.0f, null, false, 510, null), null, 0.0f, 0L, 0, 7935, null));
        MusicShareStoryData musicShareStoryData = this.LJLJJLL.element;
        String str3 = (String) c68322mC.element;
        Effect effect = this.LJLJI.element;
        MusicShareStoryInputData musicShareStoryInputData = this.LJLJL;
        if (musicShareStoryInputData == null || (str = musicShareStoryInputData.getSongName()) == null) {
            MusicShareStoryInputData musicShareStoryInputData2 = this.LJLJL;
            if (musicShareStoryInputData2 != null && (music2 = musicShareStoryInputData2.getMusic()) != null && !music2.isPgc()) {
                str = this.LJLJLJ.getString(R.string.ii_);
            } else {
                MusicShareStoryInputData musicShareStoryInputData3 = this.LJLJL;
                if (musicShareStoryInputData3 != null && (music = musicShareStoryInputData3.getMusic()) != null) {
                    str = music.getName();
                } else {
                    str = null;
                }
            }
        }
        MusicShareStoryInputData musicShareStoryInputData4 = this.LJLJL;
        if (musicShareStoryInputData4 != null && (music3 = musicShareStoryInputData4.getMusic()) != null) {
            str2 = music3.getSinger();
        }
        OSZ osz2 = new OSZ(LJJJIL, MusicShareStoryData.copy$default(musicShareStoryData, str3, effect, 0, 0, null, null, null, str, str2, 124, null));
        C3C5.m7constructorimpl(osz2);
        interfaceC67352kd2.resumeWith(osz2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
