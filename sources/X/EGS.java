package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel$fetchData$1$1$onDownloadSuccess$2", f = "ReuseAudioViewModel.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EGS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public MutableLiveData LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ReuseAudioViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EGS(ReuseAudioViewModel reuseAudioViewModel, String str, InterfaceC67352kd<? super EGS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = reuseAudioViewModel;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EGS(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                MutableLiveData mutableLiveData2 = this.LJLIL;
                C141335gf.LIZJ(obj);
                mutableLiveData = mutableLiveData2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            MutableLiveData<Integer> mutableLiveData3 = this.LJLJI.LJLJI;
            XIA xia = C78613UtF.LIZJ;
            EGT egt = new EGT(this.LJLJJI, null);
            this.LJLIL = mutableLiveData3;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, egt, this);
            mutableLiveData = mutableLiveData3;
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        mutableLiveData.postValue(obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
