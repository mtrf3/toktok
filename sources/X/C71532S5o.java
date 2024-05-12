package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DeleteImageResponseData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel$deleteImage$1", f = "ImageListViewModel.kt", l = {168, 181}, m = "invokeSuspend")
/* renamed from: X.S5o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71532S5o extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageListViewModel LJLILLLLZI;
    public final /* synthetic */ RootData LJLJI;
    public final /* synthetic */ ImageItem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71532S5o(ImageListViewModel imageListViewModel, RootData rootData, ImageItem imageItem, InterfaceC67352kd<? super C71532S5o> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageListViewModel;
        this.LJLJI = rootData;
        this.LJLJJI = imageItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71532S5o(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        DeleteImageResponseData deleteImageResponseData;
        ImageListViewModel imageListViewModel;
        InterfaceC07990Tb interfaceC07990Tb;
        S5I s5i;
        S6S Rj;
        LiveEffect liveEffect;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    this.LJLILLLLZI.setState(C71530S5m.LJLIL);
                    RootData rootData = this.LJLJI;
                    S5F.LJI(rootData.roomId, rootData.authorId, rootData.isNewUser, true, "photo_delete", null, rootData.L(), this.LJLJI.templateEntryType);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C71534S5q c71534S5q = this.LJLILLLLZI.LJLIL.LIZIZ;
            String str2 = this.LJLJI.authorId;
            String str3 = this.LJLJJI.imageId;
            this.LJLIL = 1;
            obj = c71534S5q.LJLIL.LIZ.deleteImage(str2, str3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        th = null;
        if (c64797Pbt != null) {
            Response response = (Response) c64797Pbt.LIZIZ;
            if (response != null) {
                deleteImageResponseData = (DeleteImageResponseData) response.data;
            } else {
                deleteImageResponseData = null;
            }
            int i2 = 0;
            if (c64797Pbt != null && c64797Pbt.LIZIZ() && deleteImageResponseData != null) {
                List<ITEM> listGetAll = this.LJLILLLLZI.listGetAll();
                if (listGetAll != 0) {
                    i2 = listGetAll.size();
                }
                this.LJLILLLLZI.listRemoveItem((ImageListViewModel) this.LJLJJI);
                if (this.LJLJJI.isUsing && (interfaceC07990Tb = (imageListViewModel = this.LJLILLLLZI).LJLJI) != null && (s5i = imageListViewModel.LJLJJL) != null && (Rj = s5i.Rj()) != null && (liveEffect = Rj.LJLJJLL) != null) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModel), null, null, new C71535S5r(imageListViewModel, interfaceC07990Tb, liveEffect, null), 3);
                }
                if (i2 - 1 <= 0) {
                    this.LJLIL = 2;
                    if (C1JD.LIZJ(50L, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                    this.LJLILLLLZI.setState(C71530S5m.LJLIL);
                    RootData rootData2 = this.LJLJI;
                    S5F.LJI(rootData2.roomId, rootData2.authorId, rootData2.isNewUser, true, "photo_delete", null, rootData2.L(), this.LJLJI.templateEntryType);
                    return C76800UCe.LIZ;
                }
                this.LJLILLLLZI.setState(new AqS178S0100000_12(deleteImageResponseData, 520));
                RootData rootData22 = this.LJLJI;
                S5F.LJI(rootData22.roomId, rootData22.authorId, rootData22.isNewUser, true, "photo_delete", null, rootData22.L(), this.LJLJI.templateEntryType);
                return C76800UCe.LIZ;
            }
        }
        RootData rootData3 = this.LJLJI;
        String str4 = rootData3.roomId;
        String str5 = rootData3.authorId;
        boolean z = rootData3.isNewUser;
        if (th != null) {
            str = th.getMessage();
        }
        S5F.LJI(str4, str5, z, false, "photo_delete", str, this.LJLJI.L(), this.LJLJI.templateEntryType);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
