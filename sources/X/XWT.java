package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$loadWithDialog$2", f = "LocalMusicTabFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XWT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LocalMusicTabFragment LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XWT(LocalMusicTabFragment localMusicTabFragment, Context context, InterfaceC67352kd<? super XWT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = localMusicTabFragment;
        this.LJLILLLLZI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XWT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MusicModel[] Ml = this.LJLIL.Ml();
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : Ml) {
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL_SCAN) {
                Context context = this.LJLILLLLZI;
                android.net.Uri parse = UriProtector.parse(musicModel.getLocalPath());
                o.LJIIIIZZ(parse, "parse(model.localPath)");
                if (!C45814HyU.LIZLLL(context, parse)) {
                    AbstractC029409q xl = this.LJLIL.xl();
                    o.LJII(xl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
                    ((HashSet) ((XX7) xl).LLD).add(musicModel.getLocalPath());
                }
            }
            arrayList.add(musicModel);
        }
        this.LJLIL.Vl(arrayList, true);
        LocalMusicTabFragment localMusicTabFragment = this.LJLIL;
        localMusicTabFragment.LJLLL = true;
        HWH hwh = localMusicTabFragment.LJZL;
        if (hwh != null) {
            hwh.dismiss();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
