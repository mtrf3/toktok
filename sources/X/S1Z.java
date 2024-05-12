package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.anchor.videoanchor.PoiAnchorView$mobAnchorShow$1", f = "PoiAnchorView.kt", l = {610}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S1Z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71417S1d LJLILLLLZI;
    public final /* synthetic */ InterfaceC44105HSr LJLJI;
    public final /* synthetic */ C188727au LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1Z(C71417S1d c71417S1d, InterfaceC44105HSr interfaceC44105HSr, C188727au c188727au, InterfaceC67352kd<? super S1Z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71417S1d;
        this.LJLJI = interfaceC44105HSr;
        this.LJLJJI = c188727au;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S1Z(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        PoiAnchorInfo videoAnchor;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XKQ xkq = this.LJLILLLLZI.LLFII;
            if (xkq != null) {
                this.LJLIL = 1;
                if (xkq.LJJJJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C71417S1d c71417S1d = this.LJLILLLLZI;
        Aweme LJJLL = this.LJLJI.LJJLL();
        String LJJLIIIJLLLLLLLZ = this.LJLJI.LJJLIIIJLLLLLLLZ();
        if (!C78857UxB.LJJJIL(LJJLIIIJLLLLLLLZ) || LJJLIIIJLLLLLLLZ == null) {
            LJJLIIIJLLLLLLLZ = "video_anchor";
        }
        String LJJLJLI = this.LJLJI.LJJLJLI();
        PoiDataStruct poiDataStruct = this.LJLJI.LJJLL().getPoiDataStruct();
        if (poiDataStruct == null || (videoAnchor = poiDataStruct.getVideoAnchor()) == null || (str = videoAnchor.getTrackInfo()) == null) {
            str = "";
        }
        c71417S1d.LJJIJ(LJJLL, LJJLIIIJLLLLLLLZ, LJJLJLI, false, str, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
