package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoUploadMVStage$action$1$4", f = "PhotoUploadMVStage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GiI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42262GiI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ AbstractC42266GiM<Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42262GiI(C34K c34k, AbstractC42266GiM<Object> abstractC42266GiM, InterfaceC67352kd<? super C42262GiI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c34k;
        this.LJLILLLLZI = abstractC42266GiM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42262GiI(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.element) {
            C43617H9x c43617H9x = new C43617H9x(((C42263GiJ) this.LJLILLLLZI).LIZ, false);
            C42263GiJ c42263GiJ = (C42263GiJ) this.LJLILLLLZI;
            ShortVideoContext shortVideoContext = c42263GiJ.LIZIZ;
            ArrayList<MediaModel> arrayList = c42263GiJ.LIZJ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<MediaModel> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().fileLocalUriPath);
            }
            C42265GiL c42265GiL = new C42265GiL(this.LJLILLLLZI);
            Long l = new Long(System.currentTimeMillis());
            C42263GiJ c42263GiJ2 = (C42263GiJ) this.LJLILLLLZI;
            C43617H9x.LJ(c43617H9x, shortVideoContext, arrayList2, c42265GiL, false, l, c42263GiJ2.LIZLLL, c42263GiJ2.LIZJ, null, 512);
        } else {
            ((C42263GiJ) this.LJLILLLLZI).LJFF.invoke();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
