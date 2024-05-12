package X;

import androidx.fragment.app.Fragment;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment$addGifSticker$1", f = "GifsFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.all, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94733all extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ GifsFragment LJLIL;
    public final /* synthetic */ ProviderEffect LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94733all(GifsFragment gifsFragment, ProviderEffect providerEffect, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = gifsFragment;
        this.LJLILLLLZI = providerEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94733all(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String url;
        C141335gf.LIZJ(obj);
        String path = this.LJLILLLLZI.getPath();
        if (path != null) {
            Fragment parentFragment = this.LJLIL.getParentFragment();
            if (!(parentFragment instanceof AssetsFragment)) {
                parentFragment = null;
            }
            AssetsFragment assetsFragment = (AssetsFragment) parentFragment;
            if (assetsFragment != null) {
                String title = this.LJLILLLLZI.getTitle();
                String str = "";
                if (title == null) {
                    title = "";
                }
                String id = this.LJLILLLLZI.getId();
                ProviderEffect.StickerBean sticker_info = this.LJLILLLLZI.getSticker_info();
                if (sticker_info != null && (url = sticker_info.getUrl()) != null) {
                    str = url;
                }
                assetsFragment.U0(new C94400agO(title, path, id, str));
            }
        }
        return C76800UCe.LIZ;
    }
}
