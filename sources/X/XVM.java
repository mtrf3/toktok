package X;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import kotlin.jvm.internal.AqS124S0300000_7;

/* loaded from: classes16.dex */
public final class XVM extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LiveData<C79409VEn> LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, Intent, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ ChooseMusicWithSceneViewModel LJLJI;
    public final /* synthetic */ LiveData<XWC> LJLJJI;
    public final /* synthetic */ ActivityC45651qj LJLJJL;
    public final /* synthetic */ LiveData<XWC> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XVM(MutableLiveData mutableLiveData, AqS124S0300000_7 aqS124S0300000_7, ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel, MutableLiveData mutableLiveData2, ActivityC45651qj activityC45651qj, MutableLiveData mutableLiveData3) {
        super(0);
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = aqS124S0300000_7;
        this.LJLJI = chooseMusicWithSceneViewModel;
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = mutableLiveData3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        C79409VEn value = this.LJLIL.getValue();
        if (value != null && value.LIZ == Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJLILLLLZI.invoke(0, null);
        }
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = this.LJLJI;
        chooseMusicWithSceneViewModel.LJLIL = false;
        chooseMusicWithSceneViewModel.LJLILLLLZI = false;
        chooseMusicWithSceneViewModel.LJLJJI = null;
        chooseMusicWithSceneViewModel.LJLJI = null;
        ((LiveData) chooseMusicWithSceneViewModel.LJLJJL.getValue()).setValue(null);
        chooseMusicWithSceneViewModel.gv0().setValue(new C79409VEn(0));
        MutableLiveData<XWC> hv0 = chooseMusicWithSceneViewModel.hv0();
        XWE xwe = XWE.LIZ;
        hv0.setValue(xwe);
        chooseMusicWithSceneViewModel.iv0().setValue(xwe);
        ((LiveData) chooseMusicWithSceneViewModel.LJLJLLL.getValue()).setValue(Boolean.FALSE);
        this.LJLJJI.removeObservers(this.LJLJJL);
        this.LJLJJLL.removeObservers(this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
