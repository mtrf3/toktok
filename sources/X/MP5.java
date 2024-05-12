package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class MP5<V> implements Callable {
    public final /* synthetic */ MLW LJLIL;
    public final /* synthetic */ MP2 LJLILLLLZI;
    public final /* synthetic */ List<MusNotice> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ Boolean LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public MP5(MLW mlw, MP2 mp2, List<? extends MusNotice> list, boolean z, boolean z2, Boolean bool) {
        this.LJLIL = mlw;
        this.LJLILLLLZI = mp2;
        this.LJLJI = list;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MQ0 mq0;
        MLW mlw = this.LJLIL;
        MLW mlw2 = MLW.LOAD_MORE;
        if (mlw == mlw2) {
            this.LJLILLLLZI.LIZ(this.LJLJI);
        }
        this.LJLILLLLZI.LJFF().setValue(Boolean.valueOf(this.LJLJJI));
        this.LJLILLLLZI.LJI().setValue(this.LJLJI);
        MLW mlw3 = this.LJLIL;
        if (this.LJLILLLLZI.LJIILL().contains(mlw3)) {
            NextLiveData<MQ0> LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ();
            if (this.LJLJI.isEmpty() && this.LJLJJL) {
                mq0 = MQ0.ERROR;
            } else {
                mq0 = MQ0.SUCCESS;
            }
            LJIIIIZZ.setValue(mq0);
            this.LJLILLLLZI.LJIILL = null;
        } else if (mlw3 == mlw2) {
            this.LJLILLLLZI.LJII().setValue(MQ0.SUCCESS);
        }
        ((LiveData) this.LJLILLLLZI.LJIIIZ.getValue()).setValue(this.LJLJJLL);
        this.LJLILLLLZI.LJIJI(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
