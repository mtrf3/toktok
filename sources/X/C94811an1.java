package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel$requestPlaylists$resultList$1", f = "MusicDspSheetViewModel.kt", l = {342}, m = "invokeSuspend")
/* renamed from: X.an1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94811an1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends InterfaceC57784Mm4>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ TT2DSPSongInfo LJLJI;
    public final /* synthetic */ C93894aYE LJLJJI;
    public final /* synthetic */ MusicDspSheetViewModel LJLJJL;
    public final /* synthetic */ C68322mC<C93894aYE> LJLJJLL;
    public final /* synthetic */ C34K LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94811an1(TT2DSPSongInfo tT2DSPSongInfo, C93894aYE c93894aYE, MusicDspSheetViewModel musicDspSheetViewModel, C68322mC<C93894aYE> c68322mC, C34K c34k, InterfaceC67352kd<? super C94811an1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = tT2DSPSongInfo;
        this.LJLJJI = c93894aYE;
        this.LJLJJL = musicDspSheetViewModel;
        this.LJLJJLL = c68322mC;
        this.LJLJL = c34k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94811an1(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC65462ha LJIIZILJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.LJLIL;
                C141335gf.LIZJ(obj);
                return obj2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C141335gf.LIZJ(obj);
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        TT2DSPSongInfo curDspSongInfo = this.LJLJI;
        C93894aYE c93894aYE = this.LJLJJI;
        Long l = c93894aYE.LIZ;
        String str = c93894aYE.LIZIZ;
        o.LJIIIZ(curDspSongInfo, "curDspSongInfo");
        Integer dspPlatform = curDspSongInfo.getDspPlatform();
        if (dspPlatform != null) {
            int intValue = dspPlatform.intValue();
            DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(intValue));
            DspAuthToken LJIIIZ = C94302aeo.LJIIIZ(from, curDspSongInfo.getToken());
            if (LJIIIZ != null) {
                String LIZLLL = C94302aeo.LIZLLL(LJIIIZ);
                if (LIZLLL.length() != 0) {
                    if (C94302aeo.LJIILJJIL(from)) {
                        LJIIZILJ = V1M.LJIILLIIL(new C94875ao3(intValue, LIZLLL, l, str, 10, null), c94302aeo.LJJ(from, LJIIIZ, null));
                    } else {
                        LJIIZILJ = V1M.LJIIZILJ(C78613UtF.LIZJ, C94302aeo.LJIIJ().getOperator().LJJIJIL(intValue, l, 10, LIZLLL, str));
                    }
                    if (LJIIZILJ != null) {
                        ArrayList arrayList = new ArrayList();
                        C94138acA c94138acA = new C94138acA(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJJI, arrayList, this.LJLJI);
                        this.LJLIL = arrayList;
                        this.LJLILLLLZI = 1;
                        if (LJIIZILJ.collect(c94138acA, this) != enumC58928NAu) {
                            return arrayList;
                        }
                        return enumC58928NAu;
                    }
                }
            }
        }
        if (!this.LJLJJI.LIZ()) {
            this.LJLJJL.setState(C94574ajC.LJLIL);
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends InterfaceC57784Mm4>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
