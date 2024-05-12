package X;

import Y.ARunnableS6S1300000_9;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AqS62S1100000_9;

/* loaded from: classes10.dex */
public final class L6X extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ L6Y LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC53712L6e LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6X(String str, L6Y l6y, LifecycleOwner lifecycleOwner, String str2, InterfaceC53712L6e interfaceC53712L6e) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = l6y;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = str2;
        this.LJLJJL = interfaceC53712L6e;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str = this.LJLIL;
        if (str != null && C54838Lfe.LJIIJJI(str)) {
            L6Y l6y = this.LJLILLLLZI;
            l6y.LJLJJI.LJFF(this.LJLJI, new AqS62S1100000_9(l6y, this.LJLIL, 16));
        }
        String str2 = this.LJLJJI;
        if (str2 != null) {
            L6Y l6y2 = this.LJLILLLLZI;
            LifecycleOwner lifecycleOwner = this.LJLJI;
            MutableLiveData<C53710L6c> mutableLiveData = l6y2.L().get(str2);
            if (mutableLiveData != null) {
                C1DH.LJJIJIIJI(new ARunnableS6S1300000_9(mutableLiveData, lifecycleOwner, l6y2, str2, 0));
            }
        }
        if (this.LJLIL != null) {
            MutableLiveData<C53710L6c> mutableLiveData2 = this.LJLILLLLZI.L().get(this.LJLIL);
            if (mutableLiveData2 == null) {
                mutableLiveData2 = new MutableLiveData<>();
                L6Y l6y3 = this.LJLILLLLZI;
                l6y3.L().put(this.LJLIL, mutableLiveData2);
            }
            C1DH.LJJIJIIJI(new ARunnableS6S1300000_9(mutableLiveData2, this.LJLJI, this.LJLJJL, this.LJLIL, 1));
        }
        return C76800UCe.LIZ;
    }
}
