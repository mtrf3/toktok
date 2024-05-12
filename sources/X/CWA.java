package X;

import Y.ARunnableS16S0300000_5;
import Y.AfS0S0100400_5;
import Y.AfS17S0001000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorLevelChannel;
import com.bytedance.android.live.publicscreen.api.MsgViewShowingTabChannel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.live.publicscreen.impl.api.HighLightApi;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameBgmChannel;
import com.bytedance.android.livesdk.dataChannel.GameMicChannel;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CWA extends CUC implements InterfaceC31772CdU {
    public static final C73849Syb<Integer> LLILZ = new C73849Syb<>();
    public static final C73849Syb<String> LLILZIL = new C73849Syb<>();
    public final Context LJLJI;
    public final CWN LJLJJI;
    public final DataChannel LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public final List<View> LJLJLLL;
    public final HashMap<View, Boolean> LJLL;
    public final int LJLLI;
    public long LJLLILLLL;
    public final AtomicInteger LJLLJ;
    public long LJLLL;
    public CreateHighLightResult LJLLLL;
    public final C73318Sq2 LJLLLLLL;
    public int LJLZ;
    public final ImageView LJZ;
    public RecyclerView LJZI;
    public final List<CV6> LJZL;
    public final C62822Ol8 LL;
    public long LLD;
    public C73411SrX LLF;
    public boolean LLFF;
    public OnlineRankConfig LLFFF;
    public final CWO LLFII;
    public final CWP LLFZ;
    public CW6 LLI;
    public BQM LLIFFJFJJ;
    public final LifecycleRegistry LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public final C5H3 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C5H3 LLIILII;
    public final C5H3 LLIILZL;
    public final C5H3 LLIIZ;
    public final C5H3 LLIL;
    public final C5H3 LLILII;
    public final C5H3 LLILIL;
    public final C5H3 LLILL;
    public final C5H3 LLILLIZIL;
    public final C5H3 LLILLJJLI;
    public final java.util.Map<Integer, View> LLILLL;

    @Override // X.CUC
    public final boolean LJII() {
        return false;
    }

    @Override // X.CUC
    public final void LJIIL() {
    }

    public final View LJIIZILJ(int i) {
        java.util.Map<Integer, View> map = this.LLILLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.CUC
    public void setMsgBtnActive(boolean z) {
    }

    private final String getAnchorId() {
        return (String) this.LLIIL.getValue();
    }

    private final List<CV6> getCurrentRankProfileItems() {
        return (List) this.LL.getValue();
    }

    private final CWB getGameDragScaleListener() {
        return (CWB) this.LLIIJI.getValue();
    }

    private final LinearLayout getLayoutBottom() {
        return (LinearLayout) this.LLIILII.getValue();
    }

    private final LinearLayout getLayoutTop() {
        return (LinearLayout) this.LLIIII.getValue();
    }

    private final LinearLayout getLayoutTopEnd() {
        return (LinearLayout) this.LLIIIJ.getValue();
    }

    private final LinearLayout getLayoutTopStart() {
        return (LinearLayout) this.LLIIIILZ.getValue();
    }

    private final long getRoomId() {
        return ((Number) this.LLIIJLIL.getValue()).longValue();
    }

    private final View getViewLikeCount() {
        return (View) this.LLILL.getValue();
    }

    private final View getViewLiveStatus() {
        return (View) this.LLILLIZIL.getValue();
    }

    private final View getViewLiveTime() {
        return (View) this.LLILLJJLI.getValue();
    }

    @Override // X.CUC
    public final void LJIIIIZZ() {
        String str;
        CreateHighLightResult createHighLightResult = this.LJLLLL;
        if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
            str = "";
        }
        C46104I7o.LJJIZ(this.LJLLL, str);
        ((IGameService) CN1.LIZ(IGameService.class)).Wg(str);
    }

    @Override // X.CUC
    public final void LJIIIZ() {
        InterfaceC31286CPq interfaceC31286CPq;
        this.LLII.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.LLII.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.LLII.setCurrentState(Lifecycle.State.DESTROYED);
        this.LJLLLLLL.dispose();
        DataChannel dataChannel = this.LJLJJL;
        dataChannel.getClass();
        dataChannel.jv0(this);
        C31443CVr msgView = getMsgView();
        if (msgView != null) {
            DataChannel dataChannel2 = msgView.LJLJJLL;
            if (dataChannel2 != null) {
                dataChannel2.jv0(msgView);
            }
            msgView.LJLJJI.dispose();
            C31450CVy c31450CVy = msgView.LJLILLLLZI;
            if (c31450CVy != null && (interfaceC31286CPq = c31450CVy.LJLJJI) != null) {
                interfaceC31286CPq.LIZJ(c31450CVy.LJLLILLLL);
            }
            msgView.LJLLL.LJIIJ.removeCallbacksAndMessages(null);
            msgView.LJZI = null;
        }
        C29586BjK countDownView = getCountDownView();
        if (countDownView != null) {
            DataChannel dataChannel3 = countDownView.LJLIL;
            if (dataChannel3 != null) {
                dataChannel3.jv0(countDownView);
            }
            countDownView.LJLIL = null;
            countDownView.LJLILLLLZI.dispose();
        }
        C29587BjL pauseView = getPauseView();
        if (pauseView != null) {
            DataChannel dataChannel4 = pauseView.LJLIL;
            if (dataChannel4 != null) {
                dataChannel4.jv0(pauseView);
            }
            pauseView.LJLIL = null;
        }
    }

    public final C29586BjK getCountDownView() {
        return (C29586BjK) this.LLIIZ.getValue();
    }

    @Override // X.CUC
    public int getCurTabMsg() {
        Integer num = (Integer) this.LJLJJL.kv0(MsgViewShowingTabChannel.class);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final String getLiveTimeText() {
        long j = this.LLD;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60;
        long j6 = j4 / j5;
        long j7 = j4 % j5;
        if (j3 <= 99) {
            return C63144OqK.LIZIZ(new Object[]{Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)}, 3, Locale.US, "%02d:%02d:%02d", "format(locale, format, *args)");
        }
        return C63144OqK.LIZIZ(new Object[]{Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)}, 3, Locale.US, "%03d:%02d:%02d", "format(locale, format, *args)");
    }

    public final C31443CVr getMsgView() {
        return (C31443CVr) this.LLIILZL.getValue();
    }

    public final C31773CdV getOpacityView() {
        return (C31773CdV) this.LLILIL.getValue();
    }

    public final C29587BjL getPauseView() {
        return (C29587BjL) this.LLIL.getValue();
    }

    public final C31768CdQ getSoundView() {
        return (C31768CdQ) this.LLILII.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLLLLLL.dispose();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC31772CdU
    public final void LIZIZ() {
        View btn_opacity = LJIIZILJ(R.id.axq);
        o.LJIIIIZZ(btn_opacity, "btn_opacity");
        LJIL(btn_opacity, getOpacityView());
    }

    @Override // X.InterfaceC31772CdU
    public final void LJFF() {
        View btn_sound = LJIIZILJ(R.id.azc);
        o.LJIIIIZZ(btn_sound, "btn_sound");
        LJIL(btn_sound, getSoundView());
    }

    @Override // X.CUC
    public final void LJIILIIL() {
        C31443CVr msgView = getMsgView();
        if (msgView != null) {
            msgView.LJ();
        }
    }

    public final boolean LJIJJLI() {
        Boolean bool;
        C31768CdQ soundView = getSoundView();
        Boolean bool2 = null;
        if (soundView != null) {
            bool = Boolean.valueOf(soundView.isShown());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            C31773CdV opacityView = getOpacityView();
            if (opacityView != null) {
                bool2 = Boolean.valueOf(opacityView.isShown());
            }
            if (!C29306Beo.LJJIFFI(bool2)) {
                return false;
            }
        }
        return true;
    }

    public final Context getActivity() {
        return this.LJLJI;
    }

    public final CWN getCallback() {
        return this.LJLJJI;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLII;
    }

    public final LifecycleRegistry getRegistry() {
        return this.LLII;
    }

    private final void setOtherButtonUnable(View view) {
        Iterator it = ((ArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (!o.LJ(view2, view)) {
                LJJIIJ(view2, false);
            }
        }
    }

    @Override // X.InterfaceC31772CdU
    public final void LIZ(int i) {
        CWP cwp = this.LLFZ;
        cwp.getClass();
        DataChannelGlobal.LJLJJI.tv0(GameBgmChannel.class, Float.valueOf((i * 0.1f) / 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        cwp.LIZIZ = X1D.LIZIZ(LIZ);
        if (o.LJ(cwp.LIZ, "")) {
            cwp.LIZ = cwp.LIZIZ;
        }
        InterfaceC30442Bx8.t2.LIZ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC31772CdU
    public final void LIZJ(int i) {
        int i2;
        CWO cwo = this.LLFII;
        cwo.getClass();
        InterfaceC30442Bx8.r2.LIZ(Integer.valueOf(i));
        if (i <= 25) {
            i2 = 1;
        } else if (i <= 50) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        cwo.LIZ.rv0(GameBackgroundColorLevelChannel.class, Integer.valueOf(i2));
        StringBuilder LIZ = X1D.LIZ();
        int i3 = i + 20;
        LIZ.append(i3);
        LIZ.append('%');
        cwo.LIZJ = X1D.LIZIZ(LIZ);
        if (o.LJ(cwo.LIZIZ, "")) {
            cwo.LIZIZ = cwo.LIZJ;
        }
        int i4 = (i3 * 255) / 100;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('#');
        C17N.LJIIJ(16);
        String num = Integer.toString(i4, 16);
        o.LJIIIIZZ(num, "toString(this, checkRadix(radix))");
        LIZ2.append(num);
        LIZ2.append("000000");
        int parseColor = ColorProtector.parseColor(X1D.LIZIZ(LIZ2));
        cwo.LIZ.rv0(GameBackgroundColorChannel.class, Integer.valueOf(parseColor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C87277YNd.LJIIJJI(8));
        gradientDrawable.setColor(parseColor);
        LJIIZILJ(R.id.gny).setBackground(gradientDrawable);
    }

    @Override // X.InterfaceC31772CdU
    public final void LIZLLL(int i) {
        CWP cwp = this.LLFZ;
        cwp.getClass();
        DataChannelGlobal.LJLJJI.tv0(GameMicChannel.class, Float.valueOf((i * 1.0f) / 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        cwp.LIZLLL = X1D.LIZIZ(LIZ);
        if (o.LJ(cwp.LIZJ, "")) {
            cwp.LIZJ = cwp.LIZLLL;
        }
        InterfaceC30442Bx8.s2.LIZ(Integer.valueOf(i));
    }

    @Override // X.CUC
    public final void LJI(CQP cqp) {
        C31443CVr msgView = getMsgView();
        if (msgView != null) {
            if (msgView.LJLJI) {
                C0NB.LJ("LiveGameMsgView", "bindTextPresenter already binded");
                return;
            }
            C73893SzJ LJIILL = cqp.LJIILL();
            if (LJIILL == null) {
                C0NB.LJ("LiveGameMsgView", "bindTextPresenter observeFloatWindowMsgList return null");
                return;
            }
            msgView.LJLJI = true;
            C73318Sq2 c73318Sq2 = msgView.LJLJJI;
            C73454SsE LJJJ = msgView.LJLLL.LJIIIZ.LJJJ(C73969T1h.LIZIZ());
            AfS57S0100000_5 afS57S0100000_5 = new AfS57S0100000_5(msgView, 354);
            AfS17S0001000_5 afS17S0001000_5 = BTJ.LIZ;
            c73318Sq2.LIZ(LJJJ.LJJJLIIL(afS57S0100000_5, afS17S0001000_5));
            msgView.LJLJJI.LIZ(LJIILL.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C31428CVc(msgView), afS17S0001000_5));
        }
    }

    @Override // X.CUC
    public final void LJIIJ(boolean z) {
        if (z) {
            View btn_pause = LJIIZILJ(R.id.axv);
            o.LJIIIIZZ(btn_pause, "btn_pause");
            LJJIIJ(btn_pause, true);
        } else {
            View btn_pause2 = LJIIZILJ(R.id.axv);
            o.LJIIIIZZ(btn_pause2, "btn_pause");
            LJJIII(btn_pause2, true);
        }
    }

    @Override // X.CUC
    public final void LJIIJJI(boolean z) {
        if (LJIIZILJ(R.id.axv).isSelected() != z) {
            LJIIZILJ(R.id.axv).setSelected(z);
        }
    }

    @Override // X.CUC
    public final void LJIILL(int i) {
        ConstraintLayout constraintLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        CWB gameDragScaleListener = getGameDragScaleListener();
        LiveIconView iv_corner_handle = (LiveIconView) LJIIZILJ(R.id.f11);
        o.LJIIIIZZ(iv_corner_handle, "iv_corner_handle");
        gameDragScaleListener.getClass();
        CWD cwd = CWD.RIGHT_BOTTOM;
        if (i == cwd.getValue()) {
            gameDragScaleListener.LJLJLJ = cwd;
        } else {
            CWD cwd2 = CWD.RIGHT_TOP;
            if (i == cwd2.getValue()) {
                gameDragScaleListener.LJLJLJ = cwd2;
            } else {
                CWD cwd3 = CWD.LEFT_BOTTOM;
                if (i == cwd3.getValue()) {
                    gameDragScaleListener.LJLJLJ = cwd3;
                } else {
                    CWD cwd4 = CWD.LEFT_TOP;
                    if (i == cwd4.getValue()) {
                        gameDragScaleListener.LJLJLJ = cwd4;
                    }
                }
            }
        }
        if (iv_corner_handle.getParent() instanceof ConstraintLayout) {
            ViewParent parent = iv_corner_handle.getParent();
            o.LJII(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            constraintLayout = (ConstraintLayout) parent;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            LIZ.LJI(iv_corner_handle.getId(), 2);
            LIZ.LJI(iv_corner_handle.getId(), 1);
            LIZ.LJI(iv_corner_handle.getId(), 4);
            LIZ.LJI(iv_corner_handle.getId(), 3);
            C56K c56k = new C56K();
            c56k.element = -1.0f;
            C56K c56k2 = new C56K();
            c56k2.element = -1.0f;
            int i2 = CWF.LIZ[gameDragScaleListener.LJLJLJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            LIZ.LJIIIIZZ(iv_corner_handle.getId(), 2, 0, 2);
                            LIZ.LJIIIIZZ(iv_corner_handle.getId(), 4, 0, 4);
                            c56k.element = 0.0f;
                            c56k2.element = 0.0f;
                        }
                    } else {
                        LIZ.LJIIIIZZ(iv_corner_handle.getId(), 2, 0, 2);
                        LIZ.LJIIIIZZ(iv_corner_handle.getId(), 3, 0, 3);
                        c56k.element = 180.0f;
                        c56k2.element = 0.0f;
                    }
                } else {
                    LIZ.LJIIIIZZ(iv_corner_handle.getId(), 1, 0, 1);
                    LIZ.LJIIIIZZ(iv_corner_handle.getId(), 3, 0, 3);
                    c56k.element = 180.0f;
                    c56k2.element = 180.0f;
                }
            } else {
                LIZ.LJIIIIZZ(iv_corner_handle.getId(), 1, 0, 1);
                LIZ.LJIIIIZZ(iv_corner_handle.getId(), 4, 0, 4);
                c56k.element = 0.0f;
                c56k2.element = 180.0f;
            }
            LIZ.LIZIZ(constraintLayout);
            if (c56k.element != -1.0f && c56k2.element != -1.0f) {
                iv_corner_handle.post(new ARunnableS16S0300000_5(iv_corner_handle, c56k, c56k2, 15));
            }
        }
        if (i == cwd.getValue()) {
            LinearLayout layoutBottom = getLayoutBottom();
            if (layoutBottom != null) {
                layoutParams3 = layoutBottom.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof C018905p) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams3.rightMargin = C87277YNd.LJIIJJI(12);
                marginLayoutParams3.leftMargin = 0;
                LinearLayout layoutBottom2 = getLayoutBottom();
                if (layoutBottom2 == null) {
                    return;
                }
                layoutBottom2.setLayoutParams(marginLayoutParams3);
                return;
            }
            return;
        }
        if (i == CWD.LEFT_BOTTOM.getValue()) {
            LinearLayout layoutBottom3 = getLayoutBottom();
            if (layoutBottom3 != null) {
                layoutParams2 = layoutBottom3.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (!(layoutParams2 instanceof C018905p) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.leftMargin = C87277YNd.LJIIJJI(12);
            LinearLayout layoutBottom4 = getLayoutBottom();
            if (layoutBottom4 == null) {
                return;
            }
            layoutBottom4.setLayoutParams(marginLayoutParams2);
            return;
        }
        if (i != CWD.RIGHT_TOP.getValue() && i != CWD.LEFT_TOP.getValue()) {
            return;
        }
        LinearLayout layoutBottom5 = getLayoutBottom();
        if (layoutBottom5 != null) {
            layoutParams = layoutBottom5.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C018905p) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.leftMargin = 0;
        LinearLayout layoutBottom6 = getLayoutBottom();
        if (layoutBottom6 == null) {
            return;
        }
        layoutBottom6.setLayoutParams(marginLayoutParams);
    }

    @Override // X.CUC
    public final void LJIILLIIL(int i) {
        CWB gameDragScaleListener = getGameDragScaleListener();
        int measuredWidth = gameDragScaleListener.LJLIL.getMeasuredWidth();
        int measuredHeight = gameDragScaleListener.LJLIL.getMeasuredHeight();
        boolean LJFF = gameDragScaleListener.LJFF(measuredWidth, measuredHeight, i);
        int i2 = measuredWidth;
        while (!LJFF) {
            CWC LIZIZ = CWB.LIZIZ(gameDragScaleListener.LJZI);
            if (LIZIZ == gameDragScaleListener.LJZI) {
                break;
            }
            gameDragScaleListener.LJZI = LIZIZ;
            i2 = (int) (gameDragScaleListener.LJZI.getRatio() * gameDragScaleListener.LIZLLL());
            measuredHeight = (int) (gameDragScaleListener.LJ() * i2);
            LJFF = gameDragScaleListener.LJFF(i2, measuredHeight, i);
        }
        ViewGroup.LayoutParams layoutParams = gameDragScaleListener.LJLIL.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = measuredHeight;
        gameDragScaleListener.LJLIL.setLayoutParams(layoutParams);
        gameDragScaleListener.LJLL = i2;
        gameDragScaleListener.LJLLI = measuredHeight;
        if (measuredWidth != i2) {
            gameDragScaleListener.LJLJI.invoke(Integer.valueOf((int) ((i2 * 100) / gameDragScaleListener.LIZLLL())), gameDragScaleListener.LIZJ(i2));
            gameDragScaleListener.LJLJJI.invoke(Integer.valueOf(i2), Integer.valueOf(measuredHeight), gameDragScaleListener.LJZI);
        }
    }

    public final void LJIJ(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        View viewLiveStatus = getViewLiveStatus();
        if (viewLiveStatus != null) {
            viewLiveStatus.setAlpha(f);
            if (f <= 0.0f) {
                C87277YNd.LJJIIZ(viewLiveStatus);
            } else {
                C87277YNd.LJJIJ(viewLiveStatus);
            }
        }
        View viewLiveTime = getViewLiveTime();
        if (viewLiveTime != null) {
            ViewGroup.LayoutParams layoutParams = viewLiveTime.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (f <= 0.0f) {
                    f = 1.0f;
                }
                View viewLiveStatus2 = getViewLiveStatus();
                if (viewLiveStatus2 != null) {
                    i = viewLiveStatus2.getMeasuredWidth();
                } else {
                    i = 0;
                }
                marginLayoutParams.setMarginStart(-((int) ((1.0f - f) * (C87277YNd.LJIIJJI(4) + i))));
                viewLiveTime.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void LJJ(List<CV6> list) {
        AbstractC029409q abstractC029409q;
        RecyclerView recyclerView;
        if (!o.LJ(getCurrentRankProfileItems(), list)) {
            RecyclerView recyclerView2 = this.LJZI;
            C31413CUn c31413CUn = null;
            if (recyclerView2 != null) {
                abstractC029409q = recyclerView2.getAdapter();
            } else {
                abstractC029409q = null;
            }
            if (abstractC029409q instanceof C31413CUn) {
                c31413CUn = (C31413CUn) abstractC029409q;
            }
            if (c31413CUn != null && ((recyclerView = this.LJZI) == null || !recyclerView.LJJJLL())) {
                c31413CUn.LJZ(list);
                c31413CUn.notifyDataSetChanged();
            }
            RecyclerView recyclerView3 = this.LJZI;
            if (recyclerView3 != null && recyclerView3.LJJJLL()) {
                return;
            }
            getCurrentRankProfileItems().clear();
            getCurrentRankProfileItems().addAll(list);
        }
    }

    public final void LJJIFFI(int i) {
        View viewLikeCount;
        View viewLikeCount2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3;
        int i4;
        int i5;
        if (i > 80) {
            LinearLayout layoutTopStart = getLayoutTopStart();
            int i6 = 0;
            if (layoutTopStart != null) {
                i2 = layoutTopStart.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            LinearLayout layoutTopEnd = getLayoutTopEnd();
            if (layoutTopEnd != null) {
                i3 = layoutTopEnd.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            View viewLiveStatus = getViewLiveStatus();
            if (viewLiveStatus != null) {
                i4 = viewLiveStatus.getMeasuredWidth();
            } else {
                i4 = 0;
            }
            float LIZLLL = getGameDragScaleListener().LIZLLL();
            CWC cwc = CWC.Scale70;
            float f = i2;
            float f2 = i3;
            if (((cwc.getRatio() * LIZLLL) - f) - f2 < 0.0f) {
                i5 = 1;
            } else if (((CWC.Scale60.getRatio() * getGameDragScaleListener().LIZLLL()) - f) - f2 < 0.0f) {
                i5 = 2;
            } else {
                i5 = 0;
            }
            this.LLIIIZ = i5;
            float f3 = i4;
            if ((((cwc.getRatio() * getGameDragScaleListener().LIZLLL()) - f) - f2) + f3 < 0.0f) {
                i6 = 1;
            } else if ((((CWC.Scale60.getRatio() * getGameDragScaleListener().LIZLLL()) - f) - f2) + f3 < 0.0f) {
                i6 = 2;
            }
            this.LLIIIL = i6;
        }
        float f4 = i;
        float ratio = (f4 - (CWC.Scale70.getRatio() * 100.0f)) / 10.0f;
        float f5 = 1.0f;
        if (ratio > 1.0f) {
            ratio = 1.0f;
        } else if (ratio < 0.0f) {
            ratio = 0.0f;
        }
        LinearLayout layoutBottom = getLayoutBottom();
        ViewGroup.LayoutParams layoutParams = null;
        if (layoutBottom != null) {
            layoutParams = layoutBottom.getLayoutParams();
        }
        if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.height = (int) (this.LJLJJLL * ratio);
            marginLayoutParams.bottomMargin = (int) (this.LJLJL * ratio);
            LinearLayout layoutBottom2 = getLayoutBottom();
            if (layoutBottom2 != null) {
                layoutBottom2.setLayoutParams(marginLayoutParams);
            }
            if (ratio <= 0.0f) {
                LinearLayout layoutBottom3 = getLayoutBottom();
                if (layoutBottom3 != null) {
                    C87277YNd.LJJIIZ(layoutBottom3);
                }
            } else {
                LinearLayout layoutBottom4 = getLayoutBottom();
                if (layoutBottom4 != null) {
                    C87277YNd.LJJIJ(layoutBottom4);
                }
            }
        }
        if (this.LLIIIZ == 1) {
            LJIJ(ratio);
        }
        if (this.LLIIIL == 1 && (viewLikeCount2 = getViewLikeCount()) != null) {
            viewLikeCount2.setAlpha(ratio);
            if (ratio <= 0.0f) {
                C87277YNd.LJJIIZ(viewLikeCount2);
            } else {
                C87277YNd.LJJIJ(viewLikeCount2);
            }
        }
        float ratio2 = (f4 - (CWC.Scale60.getRatio() * 100.0f)) / 10.0f;
        if (ratio2 <= 1.0f) {
            f5 = ratio2;
            if (ratio2 < 0.0f) {
                f5 = 0.0f;
            }
        }
        C31443CVr msgView = getMsgView();
        if (msgView != null) {
            msgView.LJII(f5);
        }
        if (this.LLIIIZ == 2) {
            LJIJ(f5);
        }
        if (this.LLIIIL == 2 && (viewLikeCount = getViewLikeCount()) != null) {
            viewLikeCount.setAlpha(f5);
            if (f5 <= 0.0f) {
                C87277YNd.LJJIIZ(viewLikeCount);
            } else {
                C87277YNd.LJJIJ(viewLikeCount);
            }
        }
    }

    @Override // X.CUC
    public void setTipsView(View view) {
        o.LJIIIZ(view, "view");
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fh_);
        if (viewGroup != null) {
            viewGroup.addView(view, -1, -2);
        }
    }

    public static void LJIJJ(View view, String str) {
        C15490jB.LJFF(view, "tiktok_live_game_demand_1", str, ImageView.ScaleType.FIT_CENTER, null);
    }

    @Override // X.CUC
    public final void LJIILJJIL(ChatMessage chatMessage, ChatMessage chatMessage2) {
        C31443CVr msgView = getMsgView();
        if (msgView != null) {
            msgView.LJLLL.LJIIIZ.onNext(new OSZ<>(chatMessage, chatMessage2));
        }
    }

    public final void LJIL(View view, ConstraintLayout constraintLayout) {
        Boolean bool;
        boolean z;
        int i;
        if (constraintLayout != null) {
            bool = Boolean.valueOf(constraintLayout.isShown());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (constraintLayout != null) {
                C87277YNd.LJJIIZ(constraintLayout);
            }
            Iterator it = ((ArrayList) this.LJLJLLL).iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                View view2 = (View) it.next();
                if (!o.LJ(view2, view) && !o.LJ(this.LJLL.get(view2), Boolean.FALSE)) {
                    LJJIII(view2, false);
                }
            }
            CWI cwi = (CWI) this.LJLJJL.kv0(GameBroadcastStateChannel.class);
            if (cwi == null) {
                i = -1;
            } else {
                i = CWJ.LIZ[cwi.ordinal()];
            }
            if (i != -1 && i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        C31443CVr msgView = getMsgView();
                        if (msgView != null) {
                            C87277YNd.LJJIJ(msgView);
                        }
                        C29587BjL pauseView = getPauseView();
                        if (pauseView != null) {
                            C87277YNd.LJJIJ(pauseView);
                        }
                    }
                } else {
                    C29586BjK countDownView = getCountDownView();
                    if (countDownView != null) {
                        C87277YNd.LJJIJ(countDownView);
                    }
                }
            } else {
                C31443CVr msgView2 = getMsgView();
                if (msgView2 != null) {
                    C87277YNd.LJJIJ(msgView2);
                }
            }
            if (o.LJ(view, LJIIZILJ(R.id.axq))) {
                CWO cwo = this.LLFII;
                String anchorId = getAnchorId();
                long roomId = getRoomId();
                cwo.getClass();
                o.LJIIIZ(anchorId, "anchorId");
                if (o.LJ(cwo.LIZIZ, cwo.LIZJ)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                Gson gson = C09650Zl.LIZIZ;
                hashMap.put("opacity", cwo.LIZJ);
                String json = GsonProtectorUtils.toJson(gson, hashMap);
                cwo.LIZIZ = cwo.LIZJ;
                BZI LIZ = C28787BRn.LIZ("livesdk_floating_ball_click");
                LIZ.LJIJJ(anchorId, "anchor_id");
                LIZ.LJIJ("screen_share");
                C07250Qf.LIZJ(roomId, LIZ, "room_id", "opacity", "click_icon");
                LIZ.LJIJJ(json, "setting_details");
                LIZ.LJJIIJZLJL();
                return;
            }
            if (!o.LJ(view, LJIIZILJ(R.id.azc))) {
                return;
            }
            CWP cwp = this.LLFZ;
            String anchorId2 = getAnchorId();
            long roomId2 = getRoomId();
            cwp.getClass();
            o.LJIIIZ(anchorId2, "anchorId");
            HashMap hashMap2 = new HashMap();
            if (!o.LJ(cwp.LIZ, cwp.LIZIZ)) {
                hashMap2.put("bgm", cwp.LIZIZ);
                cwp.LIZ = cwp.LIZIZ;
                z = true;
            }
            if (!o.LJ(cwp.LIZJ, cwp.LIZLLL)) {
                hashMap2.put("mic", cwp.LIZLLL);
                cwp.LIZJ = cwp.LIZLLL;
            } else if (!z) {
                return;
            }
            String json2 = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, hashMap2);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_click");
            LIZ2.LJIJJ(anchorId2, "anchor_id");
            LIZ2.LJIJ("screen_share");
            C07250Qf.LIZJ(roomId2, LIZ2, "room_id", "volume", "click_icon");
            LIZ2.LJIJJ(json2, "setting_details");
            LIZ2.LJJIIJZLJL();
            return;
        }
        setOtherButtonUnable(view);
        if (constraintLayout != null) {
            C87277YNd.LJJIJ(constraintLayout);
        }
        C29586BjK countDownView2 = getCountDownView();
        if (countDownView2 != null) {
            C87277YNd.LJJIIZ(countDownView2);
        }
        C31443CVr msgView3 = getMsgView();
        if (msgView3 != null) {
            C87277YNd.LJJIIZ(msgView3);
        }
        C29587BjL pauseView2 = getPauseView();
        if (pauseView2 != null) {
            C87277YNd.LJJIIZ(pauseView2);
        }
    }

    public final void LJJII(int i, String str) {
        this.LJLJJL.rv0(TipMessageChannel.class, new CWR(str, true, i, null, null, 24));
    }

    public final void LJJIII(View view, boolean z) {
        if (z) {
            this.LJLL.put(view, Boolean.TRUE);
        }
        if (!LJIJJLI()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        }
    }

    public final void LJJIIJ(View view, boolean z) {
        view.setEnabled(false);
        view.setAlpha(0.34f);
        if (z) {
            this.LJLL.put(view, Boolean.FALSE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x04b5, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CWA(X.ActivityC45651qj r25, X.InterfaceC31286CPq r26, X.C37671dr r27, com.bytedance.ies.sdk.datachannel.DataChannel r28) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CWA.<init>(X.1qj, X.CPq, X.1dr, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public final boolean LJIJI(long j, long j2, long j3, long j4) {
        if (j3 < this.LJLLI) {
            String string = getContext().getString(R.string.l9e);
            o.LJIIIIZZ(string, "context.getString(R.string.pm_flowball_hightoast)");
            LJJII(1, string);
            C46104I7o.LJJIL(0, j4, "", false);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZJ = V10.LIZJ("duration < 1min, curTime=", j, ", liveStartTime=");
                LIZJ.append(j2);
                LIZJ.append(", liveDuration=");
                LIZJ.append(j3);
                C0NB.LJIIIZ("LiveGameMsgView2", X1D.LIZIZ(LIZJ));
            }
            C78555UsJ.LJJIJ(1, 0, j, j2, j3, this.LJLLILLLL, j4, "duration < 1min");
            return false;
        }
        if (j - this.LJLLILLLL < this.LJLJLJ) {
            String string2 = getContext().getString(R.string.l9f);
            o.LJIIIIZZ(string2, "context.getString(R.string.pm_flowball_hightoast2)");
            LJJII(1, string2);
            C46104I7o.LJJIL(1, j4, "", false);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZJ2 = V10.LIZJ("click interval < 5min, curTime=", j, ", liveStartTime=");
                LIZJ2.append(j2);
                LIZJ2.append(", liveDuration=");
                LIZJ2.append(j3);
                C0NB.LJIIIZ("LiveGameMsgView2", X1D.LIZIZ(LIZJ2));
            }
            C78555UsJ.LJJIJ(0, 0, j, j2, j3, this.LJLLILLLL, j4, "click interval < 5min");
            return false;
        }
        return true;
    }

    public final void LJJI(long j, long j2, long j3, long j4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("highlight");
        LIZ.append(this.LJLLJ.get());
        C1EW.LIZ(((HighLightApi) Q7L.LIZIZ(HighLightApi.class)).createHighLightVideo(0L, j4, 0L, System.currentTimeMillis() / 1000, X1D.LIZIZ(LIZ), 1)).LJJJLIIL(new AfS0S0100400_5(j4, j, j2, j3, this, 0), new AfS0S0100400_5(j, j2, j3, j4, this, 1));
    }
}
