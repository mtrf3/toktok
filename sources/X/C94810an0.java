package X;

import Y.IDeS363S0100000_42;
import Y.IDfS28S0200000_42;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel$loadPlatformList$resultList$1", f = "MusicDspSheetViewModel.kt", l = {342}, m = "invokeSuspend")
/* renamed from: X.an0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94810an0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<InterfaceC57784Mm4>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MusicDspSheetViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94810an0(MusicDspSheetViewModel musicDspSheetViewModel, InterfaceC67352kd<? super C94810an0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = musicDspSheetViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94810an0(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
        ArrayList arrayList = new ArrayList();
        InterfaceC65462ha<List<TT2DSPPlatformInfo>> LJI = C94302aeo.LJLIL.LJI();
        IDfS28S0200000_42 iDfS28S0200000_42 = new IDfS28S0200000_42(this.LJLJI, arrayList, 5);
        this.LJLIL = arrayList;
        this.LJLILLLLZI = 1;
        if (((IDeS363S0100000_42) LJI).collect(iDfS28S0200000_42, this) != enumC58928NAu) {
            return arrayList;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<InterfaceC57784Mm4>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
