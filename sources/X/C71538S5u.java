package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel$cancelDisplay$1", f = "ImageListViewModel.kt", l = {491, 497}, m = "invokeSuspend")
/* renamed from: X.S5u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71538S5u extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public S6S LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ImageListViewModel LJLJI;
    public final /* synthetic */ ImageItem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71538S5u(ImageListViewModel imageListViewModel, ImageItem imageItem, InterfaceC67352kd<? super C71538S5u> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = imageListViewModel;
        this.LJLJJI = imageItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71538S5u(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        S6S s6s;
        LiveEffect liveEffect;
        ImageListViewModel imageListViewModel;
        C64797Pbt c64797Pbt;
        List<ITEM> listGetAll;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    c64797Pbt = (C64797Pbt) obj;
                    if (c64797Pbt == null && c64797Pbt.LIZIZ()) {
                        List<ITEM> listGetAll2 = this.LJLJI.listGetAll();
                        if (listGetAll2 != 0) {
                            ImageItem imageItem = this.LJLJJI;
                            Iterator it = listGetAll2.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (o.LJ(((ImageItem) it.next()).imageId, imageItem.imageId)) {
                                    if (i2 >= 0 && (listGetAll = this.LJLJI.listGetAll()) != 0 && i2 < listGetAll.size()) {
                                        this.LJLJI.listSetItemAt(i2, (int) ImageItem.L(this.LJLJJI, false));
                                        this.LJLJI.setState(C71541S5x.LJLIL);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        this.LJLJI.setState(new AqS178S0100000_12(new C3C1(new Throwable("request cancel display failed")), 519));
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6s = this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLJI.setState(C71542S5y.LJLIL);
            S5I s5i = this.LJLJI.LJLJJL;
            if (s5i != null) {
                s6s = s5i.Rj();
                if (s6s != null) {
                    liveEffect = s6s.LJLJJLL;
                    imageListViewModel = this.LJLJI;
                    InterfaceC07990Tb interfaceC07990Tb = imageListViewModel.LJLJI;
                    if (liveEffect != null || interfaceC07990Tb == null) {
                        imageListViewModel.setState(C71539S5v.LJLIL);
                        return C76800UCe.LIZ;
                    }
                    C71562S6s c71562S6s = imageListViewModel.LJLJJI;
                    this.LJLIL = s6s;
                    this.LJLILLLLZI = 1;
                    obj = c71562S6s.LIZ(interfaceC07990Tb, liveEffect, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                s6s = null;
            }
            liveEffect = null;
            imageListViewModel = this.LJLJI;
            InterfaceC07990Tb interfaceC07990Tb2 = imageListViewModel.LJLJI;
            if (liveEffect != null) {
            }
            imageListViewModel.setState(C71539S5v.LJLIL);
            return C76800UCe.LIZ;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.LJLJI.setState(C71540S5w.LJLIL);
            return C76800UCe.LIZ;
        }
        FSJ fsj = C36576EXc.LIZIZ;
        C71537S5t c71537S5t = new C71537S5t(this.LJLJI, s6s, this.LJLJJI, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        obj = XKX.LJI(fsj, c71537S5t, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt == null) {
        }
        this.LJLJI.setState(new AqS178S0100000_12(new C3C1(new Throwable("request cancel display failed")), 519));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
