package X;

import Y.IDcS172S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.dataChannel.AudienceInteractionDialogLinkHostClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TaI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74890TaI implements InterfaceViewOnClickListenerC30227Btf {
    public final TVM LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC30237Btp LJLJJI;
    public Context LJLJJL;
    public C2A4 LJLJJLL;
    public C2A8 LJLJL;
    public DataChannel LJLJLJ;
    public final C74891TaJ LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void F() {
        this.LJLJI = false;
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        LIZJ(LIZ());
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void ei() {
        this.LJLJI = true;
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        Drawable LJI = C15380j0.LJI(LIZ());
        if (LJI != null) {
            LJI.setAlpha(102);
            this.LJLILLLLZI = false;
            if (this.LJLL) {
                C2A4 c2a42 = this.LJLJJLL;
                if (c2a42 != null) {
                    c2a42.clearAnimation();
                }
                C2A4 c2a43 = this.LJLJJLL;
                if (c2a43 != null) {
                    c2a43.setBackgroundResource(0);
                }
                C2A4 c2a44 = this.LJLJJLL;
                if (c2a44 != null) {
                    c2a44.setImageDrawable(null);
                }
                if (this.LJLL) {
                    C2A4 c2a45 = this.LJLJJLL;
                    if (c2a45 != null) {
                        C29306Beo.LJJLIIIJJI(c2a45, true);
                    }
                    C2A8 c2a8 = this.LJLJL;
                    if (c2a8 != null) {
                        C29306Beo.LJJLIIIJJI(c2a8, true);
                    }
                }
                C2A4 c2a46 = this.LJLJJLL;
                if (c2a46 != null) {
                    c2a46.setImageDrawable(new C1Q4(LJI));
                }
            } else {
                C2A4 c2a47 = this.LJLJJLL;
                if (c2a47 != null) {
                    c2a47.clearAnimation();
                }
                C2A4 c2a48 = this.LJLJJLL;
                if (c2a48 != null) {
                    c2a48.setBackgroundResource(0);
                }
                C2A4 c2a49 = this.LJLJJLL;
                if (c2a49 != null) {
                    c2a49.setImageDrawable(new C1Q4(LJI));
                }
            }
        }
        C2A8 c2a82 = this.LJLJL;
        if (c2a82 == null) {
            return;
        }
        c2a82.setAlpha(0.4f);
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

    public final int LIZ() {
        boolean z;
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            z = o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z || this.LJLL) {
            return R.drawable.cx3;
        }
        return R.drawable.cwr;
    }

    public final void LIZIZ() {
        Activity LJIJJ;
        Room room;
        if (C29232Bdc.LJFF(this.LJLJLJ)) {
            C30868C9o.LIZJ(R.string.ofb);
            return;
        }
        Context context = this.LJLJJL;
        int i = 1;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && C29306Beo.LJIIZILJ(LJIJJ.getRequestedOrientation())) {
            C47071t1 c47071t1 = new C47071t1(this.LJLJJL);
            c47071t1.LJIILLIIL(R.string.n9j);
            c47071t1.LJFF(R.string.n9g);
            c47071t1.LJIIIIZZ(R.string.n9h);
            c47071t1.LJIIL(R.string.n9i, new IDcS172S0100000_13(this, 38));
            c47071t1.LJIILJJIL = false;
            LiveDialog LIZ = c47071t1.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-2208544811199719800")).LIZ) {
                LIZ.show();
            }
            C78983UzD.LJLLILLLL = "connection_button";
            DataChannel dataChannel = this.LJLJLJ;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                TWL.LJIJ(room.getOwner().getFollowInfo().getFollowStatus(), C74838TYs.LJ().LJIIIZ, false, "connection_button");
                return;
            }
            return;
        }
        GameLinkControlWidget gameLinkControlWidget = (GameLinkControlWidget) this.LJLIL;
        gameLinkControlWidget.getClass();
        C0NB.LJIIIZ("GameLinkControlWidget", "onGameLinkClick");
        Room room2 = gameLinkControlWidget.LJLJJI;
        C41561k8 c41561k8 = new C41561k8(i, gameLinkControlWidget);
        TVS LIZ2 = TVK.LIZ();
        AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(room2, c41561k8, 92);
        LIZ2.getClass();
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
        if (LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            aqS160S0200000_13.invoke();
        } else {
            LIZ2.LIZ = Integer.MAX_VALUE;
            LiveAppBundleUtils.ensurePluginAvailable(enumC38440F6u, new TVW(LIZ2, System.currentTimeMillis(), aqS160S0200000_13), false);
        }
    }

    public C74890TaI(TVM onGameLinkClickListener) {
        o.LJIIIZ(onGameLinkClickListener, "onGameLinkClickListener");
        this.LJLIL = onGameLinkClickListener;
        this.LJLJLLL = new C74891TaJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(int i) {
        if (this.LJLL) {
            Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num == null || num.intValue() != 1) {
                this.LJLILLLLZI = false;
                C2A4 c2a4 = this.LJLJJLL;
                if (c2a4 != null) {
                    c2a4.clearAnimation();
                }
                C2A4 c2a42 = this.LJLJJLL;
                if (c2a42 != null) {
                    c2a42.setBackgroundResource(0);
                }
                C2A4 c2a43 = this.LJLJJLL;
                if (c2a43 != null) {
                    c2a43.setImageDrawable(null);
                }
                if (this.LJLL) {
                    C2A4 c2a44 = this.LJLJJLL;
                    if (c2a44 != null) {
                        C29306Beo.LJJLIIIJJI(c2a44, true);
                    }
                    C2A8 c2a8 = this.LJLJL;
                    if (c2a8 != null) {
                        C29306Beo.LJJLIIIJJI(c2a8, true);
                    }
                }
                C2A4 c2a45 = this.LJLJJLL;
                if (c2a45 != null) {
                    c2a45.setImageResource(i);
                    return;
                }
                return;
            }
            if (this.LJLILLLLZI) {
                return;
            }
            C2A4 c2a46 = this.LJLJJLL;
            if (c2a46 != null) {
                C15490jB.LJFF(c2a46, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER, null);
            }
            this.LJLILLLLZI = true;
            return;
        }
        this.LJLILLLLZI = false;
        C2A4 c2a47 = this.LJLJJLL;
        if (c2a47 != null) {
            c2a47.clearAnimation();
        }
        C2A4 c2a48 = this.LJLJJLL;
        if (c2a48 != null) {
            c2a48.setBackgroundResource(0);
        }
        C2A4 c2a49 = this.LJLJJLL;
        if (c2a49 == null) {
            return;
        }
        c2a49.setImageResource(i);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final boolean LLLILZJ(View view) {
        if (C30922CBq.LIZIZ) {
            C30868C9o.LJI("【LocalTest】 Ready to upload ALog!");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHostMonitorAndLog.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            ((IHostMonitorAndLog) LIZ).j20();
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.jv0(this);
        C74740TUy.LIZLLL().LIZJ(this.LJLJLLL);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJLJ = dataChannel;
        this.LJLJJI = interfaceC30237Btp;
        this.LJLJJL = interfaceC30237Btp.getContext();
        this.LJLJJLL = (C2A4) interfaceC30237Btp.LIZ(R.id.ext);
        interfaceC30237Btp.LIZ(R.id.f9u);
        interfaceC30237Btp.LIZ(R.id.eyn);
        interfaceC30237Btp.LIZ(R.id.eyl);
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLL = z;
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            c2a4.setImageResource(LIZ());
        }
        if (this.LJLL) {
            C2A8 c2a8 = (C2A8) interfaceC30237Btp.LIZ(R.id.ldm);
            if (c2a8 != null) {
                c2a8.setText(C15380j0.LJIILJJIL(R.string.mri));
            } else {
                c2a8 = null;
            }
            this.LJLJL = c2a8;
        }
        C74740TUy.LIZLLL().LIZ(this.LJLJLLL);
        dataChannel.mv0(AudienceInteractionDialogLinkHostClickEvent.class, this, new AqS179S0100000_13(this, 683));
    }
}
