package X;

import Y.ACListenerS29S0400000_5;
import Y.AObserverS36S0400000_5;
import Y.AObserverS58S0101000_2;
import Y.AObserverS60S0101000_5;
import Y.AObserverS66S0300000_5;
import Y.AObserverS69S0200000_5;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS8S0201000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CcC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31692CcC implements InterfaceViewOnClickListenerC30227Btf, InterfaceC31718Ccc {
    public static final List<C31696CcG> LJLZ;
    public final LifecycleOwner LJLIL;
    public final Context LJLILLLLZI;
    public InterfaceC31095CIh LJLJI;
    public C29701Eo LJLJJI;
    public InterfaceC30237Btp LJLJJL;
    public LiveIconView LJLJJLL;
    public View LJLJL;
    public TextView LJLJLJ;
    public ImageView LJLJLLL;
    public IIconSlot.SlotViewModel LJLL;
    public C47121t6 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public DataChannel LJLLLL;
    public C72400SbE LJLLLLLL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJJII(EnumC31700CcK enumC31700CcK) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    static {
        ArrayList arrayList = new ArrayList();
        LJLZ = arrayList;
        arrayList.add(new C31696CcG(C15380j0.LIZ(30.0f), C15380j0.LIZ(30.0f), 0, 255));
        arrayList.add(new C31696CcG(C15380j0.LIZ(28.0f), C15380j0.LIZ(28.0f), C15380j0.LIZ(6.0f), 204));
        arrayList.add(new C31696CcG(C15380j0.LIZ(26.0f), C15380j0.LIZ(26.0f), C15380j0.LIZ(12.0f), 102));
    }

    public final void LIZ() {
        this.LJLJLLL.setVisibility(8);
        this.LJLJLJ.setVisibility(8);
        this.LJLJL.setVisibility(8);
    }

    public C31692CcC(Context context, LifecycleOwner lifecycleOwner) {
        this.LJLILLLLZI = context;
        this.LJLIL = lifecycleOwner;
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLL(InterfaceC31710CcU interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        IIconSlot iIconSlot = (IIconSlot) interfaceC31710CcU.LLJJJIL();
        this.LJLL = slotViewModel;
        if (slotViewModel == null || this.LJLJJL == null) {
            return;
        }
        slotViewModel.LJLIL.setValue(Boolean.TRUE);
        slotViewModel.LJLILLLLZI.observe(this.LJLIL, new AObserverS69S0200000_5((Object) interfaceC31710CcU, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 24));
        slotViewModel.LJLL.observe(this.LJLIL, new AObserverS73S0100000_5(this, 36));
        slotViewModel.LJLJJL.observe(this.LJLIL, new AObserverS69S0200000_5((Object) slotViewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 25));
        slotViewModel.LJLJJI.observe(this.LJLIL, new AObserverS69S0200000_5((Object) slotViewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 26));
        slotViewModel.LJLJL.observe(this.LJLIL, new AObserverS69S0200000_5((Object) slotViewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 27));
        slotViewModel.LJLJLJ.observe(this.LJLIL, new AObserverS69S0200000_5((Object) slotViewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 28));
        if (this.LJLLILLLL) {
            slotViewModel.LJLLI.observe(this.LJLIL, new AObserverS60S0101000_5(0, this, 0));
        }
        slotViewModel.LJLLJ.observe(this.LJLIL, new AObserverS69S0200000_5((Object) slotViewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 29));
        slotViewModel.LJLLLL.observe(this.LJLIL, new AObserverS36S0400000_5(slotViewModel, iIconSlot, interfaceC31710CcU, this, 2));
        slotViewModel.LJZL.observe(this.LJLIL, new AObserverS58S0101000_2(0, this, 15));
        slotViewModel.LJLLL.observe(this.LJLIL, new AObserverS66S0300000_5(slotViewModel, this, interfaceC31710CcU, 11));
        this.LJLJJL.setOnClickListener(new ACListenerS29S0400000_5(iIconSlot, slotViewModel, interfaceC31710CcU, this, 1));
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLLL(C31723Cch c31723Cch, IIconSlot.SlotViewModel slotViewModel) {
        LJLLL(c31723Cch.LIZIZ, slotViewModel);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        XKQ xkq;
        B73.LIZJ(this);
        IIconSlot.SlotViewModel slotViewModel = this.LJLL;
        if (slotViewModel != null) {
            slotViewModel.gv0(this.LJLIL);
        }
        if (dataChannel != null) {
            dataChannel.rv0(EcLiveBarrageEnable.class, Boolean.TRUE);
        }
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.onDestroy();
            this.LJLIL.getLifecycle().removeObserver(this.LJLJI);
        }
        C72400SbE c72400SbE = this.LJLLLLLL;
        if (c72400SbE != null && (xkq = c72400SbE.LIZIZ) != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLLL = SystemClock.uptimeMillis();
        this.LJLLILLLL = Boolean.TRUE.equals(dataChannel.kv0(BNK.class));
        this.LJLJJL = interfaceC30237Btp;
        this.LJLJJLL = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ldg);
        this.LJLJLJ = (TextView) interfaceC30237Btp.LIZ(R.id.ld8);
        this.LJLJLLL = (ImageView) interfaceC30237Btp.LIZ(R.id.ld6);
        this.LJLJL = interfaceC30237Btp.LIZ(R.id.ldc);
        this.LJLJJI = (C29701Eo) interfaceC30237Btp.LIZ(R.id.ld9);
        this.LJLLLL = dataChannel;
        this.LJLJJL.setVisibility(8);
        if (this.LJLLILLLL) {
            this.LJLLI = (C47121t6) interfaceC30237Btp.LIZ(R.id.ldm);
        }
        C30326BvG.LIZ.post(new ARunnableS8S0201000_5(1, this, dataChannel, 17), this);
    }
}
