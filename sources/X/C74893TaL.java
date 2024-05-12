package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RefreshRedDotOfInteractionIconEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TaL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74893TaL implements InterfaceViewOnClickListenerC30227Btf {
    public final boolean LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC30237Btp LJLJJI;
    public C2A4 LJLJJL;
    public C2A8 LJLJJLL;
    public boolean LJLJL;
    public Context LJLJLJ;
    public View.OnClickListener LJLJLLL;
    public DataChannel LJLL;
    public C47121t6 LJLLI;
    public int LJLLILLLL;
    public View LJLLJ;
    public C2A4 LJLLL;
    public C47061t0 LJLLLL;
    public C47061t0 LJLLLLLL;
    public C73411SrX LJLZ;
    public final long LJZ;
    public boolean LJZI;
    public final C74894TaM LJZL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onHide() {
        this.LJZI = false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void F() {
        C2A4 c2a4 = this.LJLJJL;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        LIZIZ(R.drawable.cx3);
    }

    public final void LIZJ() {
        if (this.LJLJI) {
            return;
        }
        C2A4 c2a4 = this.LJLJJL;
        if (c2a4 != null) {
            C15490jB.LJFF(c2a4, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER, null);
        }
        this.LJLJI = true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onShow() {
        InterfaceC30237Btp interfaceC30237Btp;
        if (!this.LJZI && (interfaceC30237Btp = this.LJLJJI) != null) {
            interfaceC30237Btp.LJ(new ARunnableS49S0100000_13(this, 263));
        }
        this.LJZI = true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final long LLJZ() {
        return this.LJZ;
    }

    public final void LIZ(boolean z) {
        if (z) {
            C47121t6 c47121t6 = this.LJLLI;
            if (c47121t6 != null) {
                c47121t6.setVisibility(this.LJLLILLLL);
            }
            C2A4 c2a4 = this.LJLJJL;
            if (c2a4 != null) {
                C87277YNd.LJJIJ(c2a4);
                return;
            }
            return;
        }
        C47121t6 c47121t62 = this.LJLLI;
        if (c47121t62 != null) {
            C87277YNd.LJJIIZ(c47121t62);
        }
        C2A4 c2a42 = this.LJLJJL;
        if (c2a42 == null) {
            return;
        }
        C87277YNd.LJJIIZ(c2a42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(int i) {
        if (this.LJLJL) {
            Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num == null || num.intValue() != 1 || !MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.enableApplyAnimation()) {
                this.LJLJI = false;
                C2A4 c2a4 = this.LJLJJL;
                if (c2a4 != null) {
                    c2a4.clearAnimation();
                }
                C2A4 c2a42 = this.LJLJJL;
                if (c2a42 != null) {
                    c2a42.setBackgroundResource(0);
                }
                C2A4 c2a43 = this.LJLJJL;
                if (c2a43 != null) {
                    c2a43.setImageDrawable(null);
                }
                if (this.LJLJL) {
                    C2A4 c2a44 = this.LJLJJL;
                    if (c2a44 != null) {
                        C29306Beo.LJJLIIIJJI(c2a44, true);
                    }
                    C2A8 c2a8 = this.LJLJJLL;
                    if (c2a8 != null) {
                        C29306Beo.LJJLIIIJJI(c2a8, true);
                    }
                }
                C2A4 c2a45 = this.LJLJJL;
                if (c2a45 != null) {
                    c2a45.setImageResource(R.drawable.cx3);
                    return;
                }
                return;
            }
            LIZJ();
            return;
        }
        if (LiveSdkMultiGuestIconOptSetting.INSTANCE.isEnable()) {
            Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num2 == null || num2.intValue() != 1 || !MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.enableApplyAnimation()) {
                this.LJLJI = false;
                C2A4 c2a46 = this.LJLJJL;
                if (c2a46 != null) {
                    c2a46.clearAnimation();
                }
                C2A4 c2a47 = this.LJLJJL;
                if (c2a47 != null) {
                    c2a47.setBackgroundResource(0);
                }
                C2A4 c2a48 = this.LJLJJL;
                if (c2a48 == null) {
                    return;
                }
                c2a48.setImageResource(R.drawable.cx3);
                return;
            }
            LIZJ();
            return;
        }
        this.LJLJI = false;
        C2A4 c2a49 = this.LJLJJL;
        if (c2a49 != null) {
            c2a49.clearAnimation();
        }
        C2A4 c2a410 = this.LJLJJL;
        if (c2a410 != null) {
            c2a410.setBackgroundResource(0);
        }
        C2A4 c2a411 = this.LJLJJL;
        if (c2a411 == null) {
            return;
        }
        c2a411.setImageResource(R.drawable.cx3);
    }

    public final void LIZLLL(int i) {
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        if (!this.LJLIL || i <= 0) {
            this.LJLLILLLL = 8;
            C2A4 c2a4 = this.LJLLL;
            if ((c2a4 != null && c2a4.getVisibility() == 0) || (c47121t6 = this.LJLLI) == null) {
                return;
            }
            c47121t6.setVisibility(8);
            return;
        }
        C47121t6 c47121t63 = this.LJLLI;
        if (c47121t63 != null) {
            c47121t63.setText(String.valueOf(i));
        }
        this.LJLLILLLL = 0;
        C2A4 c2a42 = this.LJLLL;
        if ((c2a42 != null && c2a42.getVisibility() == 0) || (c47121t62 = this.LJLLI) == null) {
            return;
        }
        c47121t62.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.LJLJLLL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public C74893TaL(TYZ lifeCycleOwner, boolean z) {
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LJLIL = z;
        this.LJLILLLLZI = lifeCycleOwner;
        this.LJLLILLLL = 8;
        this.LJZ = 1000L;
        this.LJZL = new C74894TaM(this);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C74740TUy.LIZLLL().LIZJ(this.LJZL);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        int i;
        boolean z;
        int i2;
        Boolean bool;
        this.LJLJJI = interfaceC30237Btp;
        this.LJLL = dataChannel;
        this.LJLJLJ = interfaceC30237Btp.getContext();
        this.LJLJJL = (C2A4) interfaceC30237Btp.LIZ(R.id.ext);
        this.LJLLL = (C2A4) interfaceC30237Btp.LIZ(R.id.f9u);
        this.LJLLLL = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyn);
        this.LJLLLLLL = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyl);
        this.LJLLJ = interfaceC30237Btp.LIZ(R.id.isy);
        C47121t6 c47121t6 = (C47121t6) interfaceC30237Btp.LIZ(R.id.nbp);
        this.LJLLI = c47121t6;
        if (c47121t6 != null) {
            i = c47121t6.getVisibility();
        } else {
            i = 8;
        }
        this.LJLLILLLL = i;
        View view = this.LJLLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJL = z;
        C2A4 c2a4 = this.LJLJJL;
        if (c2a4 != null) {
            c2a4.setImageResource(R.drawable.cx3);
        }
        if (this.LJLJL) {
            C2A8 c2a8 = (C2A8) interfaceC30237Btp.LIZ(R.id.ldm);
            if (c2a8 != null) {
                if (this.LJLIL) {
                    i2 = R.string.n8k;
                } else {
                    i2 = R.string.mri;
                }
                c2a8.setText(C15380j0.LJIILJJIL(i2));
            } else {
                c2a8 = null;
            }
            this.LJLJJLL = c2a8;
        }
        C74740TUy.LIZLLL().LIZ(this.LJZL);
        if (dataChannel != null) {
            dataChannel.mv0(RefreshRedDotOfInteractionIconEvent.class, this, new AqS179S0100000_13(this, 664));
            dataChannel.lv0(this.LJLILLLLZI, MultiGuestAudienceNumChangedEvent.class, new AqS179S0100000_13(this, 665));
        }
    }
}
