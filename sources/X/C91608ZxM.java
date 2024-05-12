package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUgcButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;
import kotlin.jvm.internal.IDqS1S0010000_29;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUgcButtonVM$doCollect$2", f = "MusicDspUGCVM.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.ZxM, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91608ZxM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicDspUgcButtonVM LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91608ZxM(MusicDspUgcButtonVM musicDspUgcButtonVM, String str, String str2, InterfaceC67352kd<? super C91608ZxM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicDspUgcButtonVM;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91608ZxM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        boolean z;
        Aweme aweme;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        com.ss.android.ugc.aweme.music.model.Dsp dsp = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                XIA xia = C78613UtF.LIZJ;
                C91607ZxL c91607ZxL = new C91607ZxL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
                this.LJLIL = 1;
                obj = XKX.LJI(xia, c91607ZxL, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            baseResponse = (BaseResponse) obj;
        } catch (Exception unused) {
            baseResponse = null;
        }
        if (baseResponse != null && baseResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C91211Zqx.LIZ++;
            VideoItemParams gv0 = this.LJLILLLLZI.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                dsp = aweme.getDsp();
            }
            if (dsp != null) {
                dsp.setCollectStatus(1);
            }
            String str = this.LJLJI;
            C2U8.LIZ(new C57292Mr(str, str, 1, true));
        } else {
            MusicDspUgcButtonVM musicDspUgcButtonVM = this.LJLILLLLZI;
            musicDspUgcButtonVM.getClass();
            musicDspUgcButtonVM.setState(new IDqS1S0010000_29(false, 1));
            String str2 = this.LJLJI;
            C2U8.LIZ(new C57292Mr(str2, str2, 1, false));
        }
        this.LJLILLLLZI.LJLJLLL = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
