package X;

import Y.ACListenerS31S0300000_5;
import Y.AObserverS69S0200000_5;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS8S0201000_5;
import Y.IDObserverS9S0101000;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cc9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31689Cc9 implements InterfaceViewOnClickListenerC30227Btf, InterfaceC31718Ccc {
    public final LifecycleOwner LJLIL;
    public final Context LJLILLLLZI;
    public InterfaceC31095CIh LJLJI;
    public InterfaceC30237Btp LJLJJI;
    public LiveIconView LJLJJL;
    public View LJLJJLL;
    public TextView LJLJL;
    public ImageView LJLJLJ;
    public IIconSlot.SlotViewModel LJLJLLL;
    public C47121t6 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public DataChannel LJLLL;

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

    public final void LIZ() {
        this.LJLJLJ.setVisibility(8);
        this.LJLJL.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
    }

    public C31689Cc9(Context context, BaseFragment baseFragment) {
        this.LJLILLLLZI = context;
        this.LJLIL = baseFragment;
    }

    public final void LIZIZ(Drawable drawable, Drawable drawable2) {
        if (this.LJLLI && drawable2 != null) {
            this.LJLJJL.setIcon(drawable2);
            if (drawable2 instanceof C1Q4) {
                drawable2.setTint(C04330Ez.LIZIZ(this.LJLJJL.getContext(), R.color.aat));
                return;
            }
            return;
        }
        this.LJLJJL.setIcon(drawable);
        if (!(drawable instanceof C1Q4)) {
            return;
        }
        C1Q4 c1q4 = (C1Q4) drawable;
        c1q4.setTint(C04330Ez.LIZIZ(this.LJLJJL.getContext(), R.color.aat));
        int LIZIZ = C04330Ez.LIZIZ(this.LJLJJL.getContext(), R.color.a5h);
        if (LIZIZ == 0) {
            c1q4.LIZJ(null);
        } else {
            c1q4.LIZJ(new ColorDrawable(LIZIZ));
        }
        C532327b c532327b = c1q4.LJLLLLLL.LJLIL;
        if (!c532327b.LJLIL) {
            c532327b.LJLIL = true;
            c532327b.LLLLZLLLI();
            c532327b.LL.invalidate();
        }
        c1q4.LIZLLL(0.6666667f);
        if (c1q4.LJZ == 0.6666667f) {
            return;
        }
        c1q4.LJZ = 0.6666667f;
        c1q4.LJI();
        c1q4.invalidateSelf();
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLL(InterfaceC31710CcU interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        this.LJLJLLL = slotViewModel;
        if (slotViewModel == null || this.LJLJJI == null) {
            return;
        }
        slotViewModel.LJLIL.setValue(Boolean.TRUE);
        slotViewModel.LJLILLLLZI.observe(this.LJLIL, new AObserverS69S0200000_5((Object) interfaceC31710CcU, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 32));
        slotViewModel.LJLL.observe(this.LJLIL, new AObserverS73S0100000_5(this, 50));
        slotViewModel.LJLJJL.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 33));
        slotViewModel.LJLJJI.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 34));
        slotViewModel.LJLJL.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 35));
        slotViewModel.LJLJLJ.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 36));
        if (this.LJLLI) {
            slotViewModel.LJLLI.observe(this.LJLIL, new IDObserverS9S0101000(1, this, 7));
        }
        slotViewModel.LJLLJ.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 37));
        slotViewModel.LJZ.observe(this.LJLIL, new AObserverS69S0200000_5(this, slotViewModel, 31));
        slotViewModel.LJZL.observe(this.LJLIL, new IDObserverS9S0101000(1, this, 8));
        this.LJLJJI.setOnClickListener(new ACListenerS31S0300000_5(interfaceC31710CcU, slotViewModel, this, 28));
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLLL(C31723Cch c31723Cch, IIconSlot.SlotViewModel slotViewModel) {
        LJLLL(c31723Cch.LIZIZ, slotViewModel);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.LJLJLLL;
        if (slotViewModel != null) {
            slotViewModel.gv0(this.LJLIL);
        }
        this.LJLLL = null;
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.onDestroy();
            this.LJLIL.getLifecycle().removeObserver(this.LJLJI);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLLJ = SystemClock.uptimeMillis();
        this.LJLLI = Boolean.TRUE.equals(dataChannel.kv0(BNK.class));
        this.LJLJJI = interfaceC30237Btp;
        this.LJLJJL = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ldg);
        this.LJLJL = (TextView) interfaceC30237Btp.LIZ(R.id.ld8);
        this.LJLJLJ = (ImageView) interfaceC30237Btp.LIZ(R.id.ld6);
        this.LJLJJLL = interfaceC30237Btp.LIZ(R.id.ldc);
        this.LJLJJI.setVisibility(8);
        this.LJLLL = dataChannel;
        if (this.LJLLI) {
            this.LJLL = (C47121t6) interfaceC30237Btp.LIZ(R.id.ldm);
        }
        C30326BvG.LIZ.post(new ARunnableS8S0201000_5(0, this, dataChannel, 19), dataChannel);
    }
}
