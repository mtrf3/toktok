package X;

import Y.ARunnableS32S0200000_13;
import Y.IDcS172S0100000_13;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3RealVideoWidthChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGetGuestCameraStatusFromServerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkApplyButtonFrequenceControlOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tev, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75177Tev {
    public final DataChannel LIZ;
    public final FrameLayout LIZIZ;
    public TextView LIZJ;
    public LiveDialog LJ;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;
    public final int LIZLLL = C15380j0.LIZ(4.0f);
    public int LJFF = 720;
    public int LJI = 720;

    public final Drawable LIZIZ() {
        float f;
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            LIZIZ.setColor(C259910h.LIZIZ(R.attr.d6, frameLayout.getContext()));
        }
        if (LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.isV0(false)) {
            f = C15380j0.LIZ(2.0f);
        } else {
            f = (this.LJI * 8.0f) / this.LJFF;
        }
        LIZIZ.setCornerRadius(f);
        return LIZIZ;
    }

    public final MultiGuestDataHolder LJ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF() {
        long j;
        CharSequence charSequence;
        Integer num;
        Room room;
        User owner;
        FollowInfo followInfo;
        C75017TcL.LIZ = "black_button";
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        } else {
            j = 0;
        }
        C75457TjR.LJIJJLI(j, "black_button", C75457TjR.LJ(C74838TYs.LJ().LJJ), false);
        TextView textView = this.LIZJ;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        if (!o.LJ(charSequence, C15380j0.LJIILJJIL(R.string.jun)) && ((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1)) {
            C74614TQc.LIZ().LIZ("multi_guest_apply_page", "quick_apply_icon");
            Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if ((num2 != null && num2.intValue() == 2) || LIZLLL() == 5) {
                return;
            }
            EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
            if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
                LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
                C30868C9o.LIZJ(R.string.nnu);
                return;
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.pv0(MultiGuestGetGuestCameraStatusFromServerEvent.class);
            }
            DataChannel dataChannel3 = this.LIZ;
            if (dataChannel3 == null) {
                return;
            }
            dataChannel3.qv0(GuestApplyEvent.class, new TWR(-1, 0, 0, 0, 58));
            return;
        }
        LiveDialog liveDialog = this.LJ;
        if (liveDialog != null && liveDialog.isShowing()) {
            liveDialog.dismiss();
        }
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(frameLayout.getContext());
        c47071t1.LJIILLIIL(R.string.oxw);
        c47071t1.LJFF(R.string.oxx);
        c47071t1.LJIIL(R.string.oxv, new IDcS172S0100000_13(this, 29));
        c47071t1.LJIIIZ(R.string.noo, C77857Uh3.LJLIL);
        LiveDialog LIZ = c47071t1.LIZ();
        this.LJ = LIZ;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-3750804623420264316")).LIZ) {
            LIZ.show();
        }
        LJIIIIZZ("show");
        LJ().LJJIJLIJ = -1;
    }

    public final void LJIIJJI() {
        float f;
        TextView textView = this.LIZJ;
        if (textView != null) {
            if (textView.getLineCount() >= 3) {
                f = 10.0f;
            } else {
                f = 12.0f;
            }
            textView.setTextSize(f);
        }
    }

    public static InterfaceC75787Tol LIZJ() {
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            return LJJZZI.LJJIII();
        }
        return null;
    }

    public static int LIZLLL() {
        return C78886Uxe.LJJJJZ(C8E.LJ());
    }

    public static boolean LJII() {
        List<InterfaceC75179Tex> list;
        InterfaceC75787Tol LIZJ = LIZJ();
        if (LIZJ == null || (list = ((AbstractC75858Tpu) LIZJ).getAllLayoutWindows()) == null) {
            list = C61878OQg.INSTANCE;
        }
        String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
        if (list != null && !list.isEmpty()) {
            Iterator<InterfaceC75179Tex> it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().LJJ(), LJJJJLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZ() {
        List<InterfaceC75179Tex> list;
        if (C74776TWi.LJIILJJIL() || LIZLLL() == 5) {
            return false;
        }
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if ((num != null && num.intValue() == 2) || LJII() || C29306Beo.LJIIJ(this.LIZ) || C59994Ngc.LIZJ() != EnumC74778TWk.FLOATING || LIZJ() == null) {
            return false;
        }
        InterfaceC75787Tol LIZJ = LIZJ();
        if (LIZJ == null || (list = ((AbstractC75858Tpu) LIZJ).getAllLayoutWindows()) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (list.size() < 2) {
            return false;
        }
        int size = list.size() - 1;
        C29556Biq.LIZ().getClass();
        if (size >= C74983Tbn.LJ()) {
            return false;
        }
        return true;
    }

    public final int LJI() {
        if (!LJ().LJIILJJIL) {
            return R.string.jun;
        }
        if (LJ().LJIILJJIL) {
            LJ().LJIILJJIL = false;
            return R.string.n8n;
        }
        return R.string.nbm;
    }

    public final void LJIIIIZZ(String str) {
        long j;
        Long l;
        C75017TcL.LIZ = "black_button";
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        long currentTimeMillis = System.currentTimeMillis() - LJ().LIZ;
        MultiGuestDataHolder LJ = LJ();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C75457TjR.LJIJ(LIZJ, str, currentTimeMillis, 0L, "apply", TYJ.LIZIZ(LJ, j), 488);
        LJ().LIZ = System.currentTimeMillis();
    }

    public final void LJIIIZ(boolean z) {
        long j;
        Room room;
        User owner;
        FollowInfo followInfo;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        if (z) {
            TextView textView = this.LIZJ;
            if ((textView != null && textView.getVisibility() == 0) || !LIZ()) {
                return;
            }
            TextView textView2 = this.LIZJ;
            if (textView2 != null) {
                C29306Beo.LJJLIIIJJI(textView2, true);
            }
            TextView textView3 = this.LIZJ;
            if (textView3 != null) {
                textView3.setAlpha(0.0f);
            }
            TextView textView4 = this.LIZJ;
            if (textView4 != null && (animate = textView4.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(800L)) != null) {
                duration.start();
            }
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            } else {
                j = 0;
            }
            C74824TYe.LJJJJI(j, "black_button");
            return;
        }
        TextView textView5 = this.LIZJ;
        if (textView5 != null) {
            C29306Beo.LJJLIIIJJI(textView5, false);
        }
        TextView textView6 = this.LIZJ;
        if (textView6 == null) {
            return;
        }
        TV3.LJIIJJI(textView6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(boolean z) {
        List<InterfaceC75179Tex> list;
        Integer num;
        int stroke_width;
        Object obj;
        Integer num2;
        int LJI;
        TextView textView;
        TextView textView2;
        if (LIZJ() == null) {
            return;
        }
        InterfaceC75787Tol LIZJ = LIZJ();
        if (LIZJ == null || (list = ((AbstractC75858Tpu) LIZJ).getAllLayoutWindows()) == null) {
            list = C61878OQg.INSTANCE;
        }
        DataChannel dataChannel = this.LIZ;
        if (z && ((dataChannel == null || !C29306Beo.LJIIJ(dataChannel)) && LIZLLL() != 5 && !LJII() && (((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 2) && C59994Ngc.LIZJ() == EnumC74778TWk.FLOATING && list.size() >= 2))) {
            int size = list.size() - 1;
            C29556Biq.LIZ().getClass();
            if (size < C74983Tbn.LJ()) {
                FrameLayout.LayoutParams layoutParams = null;
                if (this.LIZJ == null) {
                    FrameLayout frameLayout = this.LIZIZ;
                    if (frameLayout != null) {
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.dkj, frameLayout, false);
                        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.TextView");
                        textView2 = (TextView) LLLLIILL;
                    } else {
                        textView2 = null;
                    }
                    this.LIZJ = textView2;
                    if (textView2 != null) {
                        textView2.setBackground(LIZIZ());
                    }
                }
                TextView textView3 = this.LIZJ;
                if (textView3 != null && textView3.getParent() != null && (textView = this.LIZJ) != null) {
                    TV3.LJIIJJI(textView);
                }
                FrameLayout frameLayout2 = this.LIZIZ;
                if (frameLayout2 == null) {
                    return;
                }
                Rect LJJLIIIJ = ((InterfaceC75179Tex) DIX.LIZJ(list, 1, list)).LJJLIIIJ();
                LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
                if (livesdkLinkmicFloatWindowOptimizeSetting.isV0(false) || livesdkLinkmicFloatWindowOptimizeSetting.isV3(false)) {
                    stroke_width = 0;
                } else {
                    stroke_width = livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH();
                }
                int LIZ = C15380j0.LIZ(4.0f) + (frameLayout2.getHeight() - LJJLIIIJ.top);
                TextView textView4 = this.LIZJ;
                if (textView4 != null) {
                    obj = textView4.getLayoutParams();
                } else {
                    obj = null;
                }
                if ((obj instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) obj) != null) {
                    layoutParams.height = -2;
                    layoutParams.bottomMargin = LIZ;
                    layoutParams.width = (LJJLIIIJ.right - LJJLIIIJ.left) + stroke_width;
                    layoutParams.rightMargin = (frameLayout2.getRight() - LJJLIIIJ.right) - (stroke_width / 2);
                }
                TextView textView5 = this.LIZJ;
                if (textView5 != null) {
                    textView5.setLayoutParams(layoutParams);
                }
                LJIIJJI();
                frameLayout2.addView(this.LIZJ);
                if (LIZ()) {
                    LJIIIZ(true);
                    TextView textView6 = this.LIZJ;
                    if (textView6 != null) {
                        if (LIZLLL() != 0 || LIZLLL() != 1) {
                            if ((LIZLLL() != 2 || LJII()) && ((num2 = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num2.intValue() != 1)) {
                                if (LJII()) {
                                    LJIIIZ(false);
                                    LJI = LJI();
                                }
                            } else {
                                LJI = LJI();
                            }
                            textView6.setText(LJI);
                        }
                        LJI = R.string.n8n;
                        textView6.setText(LJI);
                    }
                    TextView textView7 = this.LIZJ;
                    if (textView7 != null) {
                        textView7.post(new ARunnableS32S0200000_13(this, list, LIZ, 108));
                    }
                } else {
                    LJIIIZ(false);
                }
                if (LinkmicSdkApplyButtonFrequenceControlOptSetting.INSTANCE.isOpt()) {
                    TextView textView8 = this.LIZJ;
                    if (textView8 == null) {
                        return;
                    }
                    C29306Beo.LJJL(textView8, R.layout.dkj, 1000L, new AqS179S0100000_13(this, 523));
                    return;
                }
                TextView textView9 = this.LIZJ;
                if (textView9 == null) {
                    return;
                }
                C29306Beo.LJJJLL(textView9, 1000L, new AqS179S0100000_13(this, 524));
                return;
            }
        }
        LJIIIZ(false);
    }

    public C75177Tev(DataChannel dataChannel, FrameLayout frameLayout) {
        this.LIZ = dataChannel;
        this.LIZIZ = frameLayout;
        C75559Tl5.LIZIZ.LIZLLL(this);
        if (dataChannel != null) {
            dataChannel.nv0(MultiLiveUIChangeEvent.class, this, new C75178Tew(this));
            dataChannel.nv0(RequestSettingSuccessEvent.class, this, new AqS179S0100000_13(this, 520));
            dataChannel.nv0(MultiGuestV3VideoSizeChannel.class, this, new AqS179S0100000_13(this, 521));
            dataChannel.nv0(MultiGuestV3RealVideoWidthChannel.class, this, new AqS179S0100000_13(this, 522));
        }
    }
}
