package X;

import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import kotlin.jvm.internal.AqS160S0200000_13;

/* renamed from: X.Ukf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78081Ukf implements Observer<Integer> {
    public final /* synthetic */ ArrayList<C78069UkT> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C78071UkV LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ Queue<C78072UkW> LJLJL;
    public final /* synthetic */ MutableLiveData<Integer> LJLJLJ;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        boolean z;
        Integer num2 = num;
        int size = this.LJLIL.size();
        if (num2 == null || num2.intValue() != size) {
            return;
        }
        this.LJLILLLLZI.invoke();
        C0NB.LJIIIZ("GiftTrayMultiHost", "onCompleteHideAnim done");
        if (this.LJLJI && LiveMultiHostGiftTrayOptSetting.enableGiftTrayPositionChange()) {
            z = true;
        } else {
            z = false;
        }
        boolean enablePublicScreenHeightChange = LiveMultiHostGiftTrayOptSetting.enablePublicScreenHeightChange();
        this.LJLJJI.LIZLLL(this.LJLJJLL, this.LJLJJL, z, enablePublicScreenHeightChange);
        Iterator<C78069UkT> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C78069UkT next = it.next();
            boolean z2 = this.LJLJI;
            C78078Ukc c78078Ukc = next.LJIIIIZZ;
            if (c78078Ukc != null) {
                c78078Ukc.LJ(next.LJIIIZ, z2);
            }
            C78072UkW poll = this.LJLJL.poll();
            if (poll != null) {
                EnumC78090Uko enumC78090Uko = next.LIZLLL;
                if (enumC78090Uko == EnumC78090Uko.IDLE) {
                    next.LJII(poll);
                } else if (enumC78090Uko == EnumC78090Uko.WAITING) {
                    next.LJIIIIZZ(poll);
                }
            }
        }
        this.LJLJLJ.removeObserver(this);
    }

    public C78081Ukf(ArrayList arrayList, AqS160S0200000_13 aqS160S0200000_13, boolean z, C78071UkV c78071UkV, ViewGroup viewGroup, int i, Queue queue, MutableLiveData mutableLiveData) {
        this.LJLIL = arrayList;
        this.LJLILLLLZI = aqS160S0200000_13;
        this.LJLJI = z;
        this.LJLJJI = c78071UkV;
        this.LJLJJL = viewGroup;
        this.LJLJJLL = i;
        this.LJLJL = queue;
        this.LJLJLJ = mutableLiveData;
    }
}
