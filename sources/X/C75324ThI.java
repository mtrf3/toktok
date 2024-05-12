package X;

import Y.ACListenerS33S0100000_13;
import Y.AObserverS81S0100000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.VoiceChatShowStatusEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ThI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75324ThI extends ViewOnClickListenerC75325ThJ {
    public final Context LJLLJ;
    public final LifecycleOwner LJLLL;
    public final AObserverS81S0100000_13 LJLLLL;
    public final AObserverS81S0100000_13 LJLLLLLL;
    public final AObserverS81S0100000_13 LJLZ;
    public final AObserverS81S0100000_13 LJZ;

    @Override // X.ViewOnClickListenerC75325ThJ
    public final int LIZIZ() {
        return R.layout.dn7;
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final int LIZJ() {
        return R.id.lsq;
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final String LIZLLL() {
        return "guest";
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final void LJIIIIZZ() {
        DataChannel dataChannel;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH != null && (dataChannel = abstractC75323ThH.LIZ) != null) {
            dataChannel.pv0(VoiceChatShowStatusEvent.class);
        }
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final void LJIIIZ() {
        View findViewById;
        MutableLiveData<Long> LJI;
        LiveData liveData;
        MutableLiveData<String> LJII;
        LiveData liveData2;
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH != null && (liveData2 = (LiveData) abstractC75323ThH.LJIIJ.getValue()) != null) {
            liveData2.removeObserver(this.LJZ);
        }
        AbstractC75323ThH abstractC75323ThH2 = this.LJLLI;
        if (abstractC75323ThH2 != null && (LJII = abstractC75323ThH2.LJII()) != null) {
            LJII.removeObserver(this.LJLZ);
        }
        AbstractC75323ThH abstractC75323ThH3 = this.LJLLI;
        if (abstractC75323ThH3 != null && (liveData = (LiveData) abstractC75323ThH3.LJIIIIZZ.getValue()) != null) {
            liveData.removeObserver(this.LJLLLLLL);
        }
        AbstractC75323ThH abstractC75323ThH4 = this.LJLLI;
        if (abstractC75323ThH4 != null && (LJI = abstractC75323ThH4.LJI()) != null) {
            LJI.removeObserver(this.LJLLLL);
        }
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.gyz)) != null) {
            C87277YNd.LJJIIZ(findViewById);
        }
        super.LJIIIZ();
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final void LJ() {
        ConstraintLayout constraintLayout;
        super.LJ();
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null && (constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.l7_)) != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS33S0100000_13(this, 3));
        }
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final void LJII() {
        String str;
        super.LJII();
        AbstractC75323ThH abstractC75323ThH = this.LJLLI;
        if (abstractC75323ThH != null) {
            str = abstractC75323ThH.LJIIIZ();
        } else {
            str = null;
        }
        if (o.LJ(str, "guest")) {
            TTJ.LIZ(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75324ThI(Context context, LifecycleOwner lifecycleOwner) {
        super(context, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLLJ = context;
        this.LJLLL = lifecycleOwner;
        this.LJLLLL = new AObserverS81S0100000_13(this, 4);
        this.LJLLLLLL = new AObserverS81S0100000_13(this, 7);
        this.LJLZ = new AObserverS81S0100000_13(this, 5);
        this.LJZ = new AObserverS81S0100000_13(this, 6);
    }

    @Override // X.ViewOnClickListenerC75325ThJ
    public final void LIZ(AbstractC75323ThH abstractC75323ThH, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        super.LIZ(abstractC75323ThH, parent);
        MutableLiveData<Long> LJI = abstractC75323ThH.LJI();
        if (LJI != null) {
            LJI.observe(this.LJLLL, this.LJLLLL);
        }
        LiveData liveData = (LiveData) abstractC75323ThH.LJIIIIZZ.getValue();
        if (liveData != null) {
            liveData.observe(this.LJLLL, this.LJLLLLLL);
        }
        MutableLiveData<String> LJII = abstractC75323ThH.LJII();
        if (LJII != null) {
            LJII.observe(this.LJLLL, this.LJLZ);
        }
        LiveData liveData2 = (LiveData) abstractC75323ThH.LJIIJ.getValue();
        if (liveData2 != null) {
            liveData2.observe(this.LJLLL, this.LJZ);
        }
    }
}
