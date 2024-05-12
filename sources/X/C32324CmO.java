package X;

import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CmO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32324CmO implements InterfaceViewOnClickListenerC30227Btf {
    public final Context LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;
    public DataChannel LJLJI;
    public InterfaceC32326CmQ LJLJJI;
    public C32322CmM LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
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

    public C32324CmO(Context mContext) {
        o.LJIIIZ(mContext, "mContext");
        this.LJLIL = mContext;
    }

    public final void LIZJ(DataChannel dataChannel) {
        int i;
        ViewGroup viewGroup;
        this.LJLJL = false;
        C32322CmM c32322CmM = this.LJLJJL;
        ViewParent viewParent = null;
        if (c32322CmM != null) {
            viewParent = c32322CmM.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(this.LJLJJL, viewGroup);
        }
        if (this.LJLJJL != null) {
            if (dataChannel != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                i = 1;
            } else {
                i = 2;
            }
            C28600BKi.LIZIZ().LIZLLL(i, this.LJLJJL);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        View currentView;
        o.LJIIIZ(v, "v");
        if (!this.LJLJL) {
            return;
        }
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null && o.LJ(dataChannel.kv0(BNK.class), Boolean.FALSE)) {
            return;
        }
        if (this.LJLJJLL) {
            C32322CmM c32322CmM = this.LJLJJL;
            if (c32322CmM != null) {
                c32322CmM.performClick();
                return;
            }
            return;
        }
        InterfaceC32326CmQ interfaceC32326CmQ = this.LJLJJI;
        if (interfaceC32326CmQ == null || (currentView = interfaceC32326CmQ.getCurrentView()) == null) {
            return;
        }
        currentView.performClick();
    }

    public static int LIZ(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        Object obj;
        int i;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BNK.class);
            if (o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                i = 1;
                if (!ToolBarRefactor.enable() && o.LJ(obj, Boolean.TRUE) && interfaceC30237Btp != null) {
                    C78949Uyf.LJIIIIZZ(interfaceC30237Btp);
                }
                return i;
            }
        } else {
            obj = null;
        }
        i = 2;
        if (!ToolBarRefactor.enable()) {
            C78949Uyf.LJIIIIZZ(interfaceC30237Btp);
        }
        return i;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        View currentView;
        int i;
        InterfaceC32326CmQ interfaceC32326CmQ;
        ViewGroup LIZLLL;
        Integer num;
        Integer num2;
        View view;
        View LJFF;
        View LJFF2;
        this.LJLILLLLZI = interfaceC30237Btp;
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyFirst()) {
            InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
            if (interfaceC30237Btp2 != null && (LJFF2 = interfaceC30237Btp2.LJFF()) != null) {
                num = Integer.valueOf(LJFF2.getWidth());
            } else {
                num = null;
            }
            InterfaceC30237Btp interfaceC30237Btp3 = this.LJLILLLLZI;
            if (interfaceC30237Btp3 != null && (LJFF = interfaceC30237Btp3.LJFF()) != null) {
                num2 = Integer.valueOf(LJFF.getHeight());
            } else {
                num2 = null;
            }
            if (((num != null && num.intValue() <= 0) || (num2 != null && num2.intValue() <= 0)) && this.LJLJLJ > 0 && this.LJLJLLL > 0) {
                InterfaceC30237Btp interfaceC30237Btp4 = this.LJLILLLLZI;
                if (interfaceC30237Btp4 != null) {
                    view = interfaceC30237Btp4.LJFF();
                } else {
                    view = null;
                }
                C29306Beo.LJJLIIIJJIZ(this.LJLJLJ, this.LJLJLLL, view);
            }
        }
        this.LJLJI = dataChannel;
        C32282Cli.LJ = null;
        if (this.LJLJJLL) {
            LIZJ(dataChannel);
        } else {
            this.LJLJL = false;
            InterfaceC32326CmQ interfaceC32326CmQ2 = this.LJLJJI;
            if (interfaceC32326CmQ2 != null && (currentView = interfaceC32326CmQ2.getCurrentView()) != null) {
                if (RankOptimizeSetting.INSTANCE.getValue() && (interfaceC32326CmQ = this.LJLJJI) != null && (LIZLLL = interfaceC32326CmQ.LIZLLL()) != null) {
                    C16880lQ.LJLLL(currentView, LIZLLL);
                }
                if (dataChannel != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                    i = 1;
                } else {
                    i = 2;
                }
                C28600BKi.LIZIZ().LIZLLL(i, this.LJLJJI);
            }
        }
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            C32322CmM c32322CmM = this.LJLJJL;
            if (c32322CmM != null) {
                c32322CmM.LJLIL = null;
            }
            InterfaceC32326CmQ interfaceC32326CmQ3 = this.LJLJJI;
            if (interfaceC32326CmQ3 != null) {
                interfaceC32326CmQ3.LIZIZ();
            }
        }
        this.LJLL = false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        Context context;
        View LJFF;
        Room room;
        this.LJLILLLLZI = interfaceC30237Btp;
        this.LJLJI = dataChannel;
        if (C32282Cli.LIZJ()) {
            InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
            if (interfaceC30237Btp2 != null) {
                interfaceC30237Btp2.LJII(false);
            }
            InterfaceC30237Btp interfaceC30237Btp3 = this.LJLILLLLZI;
            if (interfaceC30237Btp3 != null) {
                interfaceC30237Btp3.la();
            }
            C32282Cli.LJ = new C32323CmN(this);
            if (!o.LJ(InterfaceC30442Bx8.O1.LIZ(), Boolean.TRUE)) {
                InterfaceC32301Cm1 interfaceC32301Cm1 = C32282Cli.LJ;
                if (interfaceC32301Cm1 != null) {
                    interfaceC32301Cm1.LIZIZ(false);
                }
            } else {
                InterfaceC32301Cm1 interfaceC32301Cm12 = C32282Cli.LJ;
                if (interfaceC32301Cm12 != null) {
                    interfaceC32301Cm12.LIZIZ(true);
                }
            }
        } else {
            LIZIZ(this.LJLILLLLZI, this.LJLJI, false);
        }
        LifecycleOwner lifecycleOwner = null;
        Object obj = null;
        if (!this.LJLL) {
            this.LJLL = true;
            DataChannel dataChannel2 = this.LJLJI;
            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                B76.LIZJ(room, "quick_gift");
            }
        }
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyFirst()) {
            InterfaceC30237Btp interfaceC30237Btp4 = this.LJLILLLLZI;
            if (interfaceC30237Btp4 != null && (LJFF = interfaceC30237Btp4.LJFF()) != null) {
                LJFF.post(new ARunnableS41S0100000_5(this, 311));
            }
            InterfaceC30237Btp interfaceC30237Btp5 = this.LJLILLLLZI;
            if (interfaceC30237Btp5 != null) {
                context = interfaceC30237Btp5.getContext();
            } else {
                context = null;
            }
            if (context instanceof LifecycleOwner) {
                InterfaceC30237Btp interfaceC30237Btp6 = this.LJLILLLLZI;
                if (interfaceC30237Btp6 != null) {
                    obj = interfaceC30237Btp6.getContext();
                }
                lifecycleOwner = (LifecycleOwner) obj;
            }
            if (dataChannel != null) {
                dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(this, 828));
            }
        }
    }

    public final void LIZIZ(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel, boolean z) {
        InterfaceC32326CmQ interfaceC32326CmQ;
        View currentView;
        ViewGroup LIZLLL;
        boolean z2;
        float f;
        LifecycleOwner lifecycleOwner;
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        this.LJLJJLL = false;
        int LIZ = LIZ(interfaceC30237Btp, dataChannel);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            Object LIZ2 = C28600BKi.LIZIZ().LIZ(LIZ, C32328CmS.class);
            if (LIZ2 instanceof InterfaceC32326CmQ) {
                interfaceC32326CmQ = (InterfaceC32326CmQ) LIZ2;
            }
            interfaceC32326CmQ = null;
        } else {
            Object LIZ3 = C28600BKi.LIZIZ().LIZ(LIZ, InterfaceC32326CmQ.class);
            if (LIZ3 instanceof InterfaceC32326CmQ) {
                interfaceC32326CmQ = (InterfaceC32326CmQ) LIZ3;
            }
            interfaceC32326CmQ = null;
        }
        this.LJLJJI = interfaceC32326CmQ;
        if (interfaceC32326CmQ == null) {
            C32328CmS c32328CmS = new C32328CmS(this.LJLIL);
            c32328CmS.LJLJLLL = dataChannel;
            if (dataChannel != null) {
                dataChannel.mv0(FastGiftCombEvent.class, c32328CmS, c32328CmS.LJLL);
                z2 = o.LJ(dataChannel.kv0(BNK.class), Boolean.TRUE);
            } else {
                z2 = false;
            }
            c32328CmS.LJLJJL = z2;
            if (z2) {
                View LJI = C20910rv.LJI(R.layout.do5, null, false, 12);
                c32328CmS.LJLIL = (LiveIconView) LJI.findViewById(R.id.ld4);
                if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
                    LiveIconView liveIconView = c32328CmS.LJLIL;
                    if (liveIconView != null) {
                        liveIconView.post(new ARunnableS41S0100000_5(c32328CmS, 310));
                    }
                    if (c32328CmS.getContext() instanceof LifecycleOwner) {
                        Object context = c32328CmS.getContext();
                        o.LJII(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        lifecycleOwner = (LifecycleOwner) context;
                    } else {
                        lifecycleOwner = null;
                    }
                    DataChannel dataChannel2 = c32328CmS.LJLJLLL;
                    if (dataChannel2 != null) {
                        dataChannel2.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(c32328CmS, 825));
                    }
                }
                C2A8 c2a8 = (C2A8) LJI.findViewById(R.id.ldm);
                c32328CmS.LJLJJLL = c2a8;
                C29306Beo.LJI(c2a8);
                DataChannel dataChannel3 = c32328CmS.LJLJLLL;
                if (dataChannel3 != null && o.LJ(dataChannel3.kv0(BNK.class), Boolean.TRUE)) {
                    C6H.LIZ(new ACListenerS25S0100000_5(c32328CmS, 414), c32328CmS);
                } else {
                    C6H.LIZ(new ACListenerS25S0100000_5(c32328CmS, 415), LJI);
                }
                c32328CmS.addView(LJI);
            } else {
                c32328CmS.LJLIL = new LiveIconView(c32328CmS.getContext(), null);
                DataChannel dataChannel4 = c32328CmS.LJLJLLL;
                if (dataChannel4 != null && o.LJ(dataChannel4.kv0(BNK.class), Boolean.TRUE)) {
                    C6H.LIZ(new ACListenerS25S0100000_5(c32328CmS, 416), c32328CmS);
                } else {
                    C6H.LIZ(new ACListenerS25S0100000_5(c32328CmS, 417), c32328CmS.LJLIL);
                }
                int LIZJ = (int) KL2.LIZJ(c32328CmS.getContext(), 5.0f);
                DataChannel dataChannel5 = c32328CmS.LJLJLLL;
                if (dataChannel5 != null && o.LJ(dataChannel5.kv0(BCW.class), Boolean.TRUE)) {
                    f = 24.0f;
                } else {
                    f = 26.0f;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(f), C15380j0.LIZ(f));
                layoutParams.topMargin = LIZJ;
                layoutParams.leftMargin = LIZJ;
                layoutParams.setMarginStart(LIZJ);
                LiveIconView liveIconView2 = c32328CmS.LJLIL;
                if (liveIconView2 != null) {
                    liveIconView2.setLayoutParams(layoutParams);
                }
                c32328CmS.addView(c32328CmS.LJLIL);
            }
            if (c32328CmS.getContext() != null) {
                c32328CmS.addView(C20910rv.LJI(R.layout.do4, null, false, 12));
                C77557UcD c77557UcD = (C77557UcD) c32328CmS.findViewById(R.id.d4w);
                c77557UcD.setAnimationType(EnumC77563UcJ.FAST);
                C29306Beo.LJI(c77557UcD);
                c77557UcD.setScaleX(0.5f);
                c77557UcD.setScaleY(0.5f);
                c32328CmS.LJLJI = c77557UcD;
            }
            c32328CmS.LJ(dataChannel, z);
            c32328CmS.setClipChildren(false);
            this.LJLJJI = c32328CmS;
        } else {
            interfaceC32326CmQ.LIZJ(dataChannel, z);
        }
        InterfaceC32326CmQ interfaceC32326CmQ2 = this.LJLJJI;
        if (interfaceC32326CmQ2 != null && (currentView = interfaceC32326CmQ2.getCurrentView()) != null) {
            InterfaceC32326CmQ interfaceC32326CmQ3 = this.LJLJJI;
            if (interfaceC32326CmQ3 != null && (LIZLLL = interfaceC32326CmQ3.LIZLLL()) != null) {
                C16880lQ.LJLLL(currentView, LIZLLL);
            }
            if (interfaceC30237Btp != null) {
                interfaceC30237Btp.LJZI(currentView);
                interfaceC30237Btp.LIZIZ();
            }
        }
    }
}
