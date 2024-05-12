package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$onCollect$1", f = "LocalMusicTabFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XWU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LocalMusicTabFragment LJLIL;
    public final /* synthetic */ ArrayList<MusicModel> LJLILLLLZI;
    public final /* synthetic */ HWH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XWU(LocalMusicTabFragment localMusicTabFragment, ArrayList<MusicModel> arrayList, HWH hwh, InterfaceC67352kd<? super XWU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = localMusicTabFragment;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = hwh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XWU(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJZ.clear();
        ArrayList arrayList = new ArrayList(this.LJLILLLLZI);
        ORS.LJJLIIIJJIZ(arrayList, this.LJLIL.Ml());
        this.LJLIL.Tl(arrayList);
        this.LJLJI.dismiss();
        this.LJLIL.LJZ.addAll(arrayList);
        LocalMusicTabFragment localMusicTabFragment = this.LJLIL;
        localMusicTabFragment.Ol(localMusicTabFragment.LJLLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
