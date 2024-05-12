package X;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkApplyButtonFrequenceControlOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3FloatLayoutPosFixSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tef, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75161Tef extends FrameLayout implements InterfaceC76717U8z {
    public static long LJLJLLL;
    public InterfaceC75179Tex LJLIL;
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public ViewGroup LJLJJI;
    public ViewGroup LJLJJL;
    public C47121t6 LJLJJLL;
    public LiveIconView LJLJL;
    public IThemeAbility LJLJLJ;

    @Override // X.InterfaceC76717U8z
    public Boolean getAudioMute() {
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public String getLinkMicId() {
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public Long getUid() {
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getVideoMute() {
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public final boolean isEmpty() {
        return true;
    }

    private final int getEmptyViewLayoutId() {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            return R.layout.dff;
        }
        return R.layout.dfg;
    }

    private final int getPos() {
        InterfaceC75579TlP LJJJIL;
        Layout y1;
        if (MultiGuestV3FloatLayoutPosFixSetting.INSTANCE.isEnable() && (LJJJIL = C78886Uxe.LJJJIL(C8E.LJ())) != null && (y1 = LJJJIL.y1()) != null && y1.isFloatType()) {
            return -1;
        }
        if (this.LJLIL.LLLZIIL()) {
            return this.LJLIL.LLLFFI();
        }
        return this.LJLIL.LJZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        boolean z;
        Room room;
        User owner;
        FollowInfo followInfo;
        Room room2;
        User owner2;
        FollowInfo followInfo2;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int pos = getPos();
            C74614TQc.LIZ().LIZ("multi_guest_anchor_manage_page", "empty_mask");
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if (dataChannel2 != null) {
                dataChannel2.qv0(AnchorOpenListDialogWithPositionEvent.class, new C75072TdE(pos));
                return;
            }
            return;
        }
        long j = 0;
        if (C74789TWv.LIZIZ()) {
            int pos2 = getPos();
            C75017TcL.LIZ = "plus_button";
            DataChannel dataChannel3 = this.LJLILLLLZI;
            if (dataChannel3 != null && (room2 = (Room) dataChannel3.kv0(RoomChannel.class)) != null && (owner2 = room2.getOwner()) != null && (followInfo2 = owner2.getFollowInfo()) != null) {
                j = followInfo2.getFollowStatus();
            }
            C75457TjR.LJIJJLI(j, "plus_button", C75457TjR.LJ(C74838TYs.LJ().LJJ), ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
            DataChannel dataChannel4 = this.LJLILLLLZI;
            if (dataChannel4 == null) {
                return;
            }
            dataChannel4.qv0(OpenMultiGuestModeratorsManageDialogEvent.class, new IPJ(EnumC46470ILq.EMPTY_MASK, pos2));
            return;
        }
        int pos3 = getPos();
        C74614TQc.LIZ().LIZ("multi_guest_apply_page", "empty_mask");
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if ((num != null && num.intValue() == 2) || C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
            return;
        }
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
        if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
            return;
        }
        C75017TcL.LIZ = "plus_button";
        DataChannel dataChannel5 = this.LJLILLLLZI;
        if (dataChannel5 != null && (room = (Room) dataChannel5.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        }
        C75457TjR.LJIJJLI(j, "plus_button", C75457TjR.LJ(C74838TYs.LJ().LJJ), ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
        if (LinkmicSdkApplyButtonFrequenceControlOptSetting.INSTANCE.isOpt()) {
            if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - LJLJLLL < 1000) {
                    C0NB.LIZIZ("GuestEmptyMask", "fast clicked");
                    return;
                }
                LJLJLLL = uptimeMillis;
            }
            DataChannel dataChannel6 = this.LJLILLLLZI;
            if (dataChannel6 == null) {
                return;
            }
            dataChannel6.qv0(GuestApplyEvent.class, new TWR(Integer.valueOf(pos3), 0, 0, 0, 62));
            return;
        }
        DataChannel dataChannel7 = this.LJLILLLLZI;
        if (dataChannel7 == null) {
            return;
        }
        dataChannel7.qv0(GuestApplyEvent.class, new TWR(Integer.valueOf(pos3), 0, 0, 0, 62));
    }

    public final void LIZLLL() {
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.fi_);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.fia);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
        }
    }

    @Override // X.InterfaceC76717U8z
    public Integer getLogicPos() {
        return Integer.valueOf(this.LJLIL.LLLFFI());
    }

    @Override // X.InterfaceC76717U8z
    public Integer getUiPos() {
        return Integer.valueOf(this.LJLIL.LJZ());
    }

    @Override // X.InterfaceC76717U8z
    public int getH() {
        return getHeight();
    }

    @Override // X.InterfaceC76717U8z
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getX() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getLeft();
        }
        return -1;
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getY() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getTop();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75161Tef.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLJI;
    }

    public final DataChannel getMDataChannel() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC75179Tex getWindow() {
        return this.LJLIL;
    }

    public final void LIZ(boolean z) {
        Drawable LIZIZ;
        MultiGuestThemeViewModel B70;
        C75247Tg3 state;
        Integer num;
        long j;
        Room room;
        User owner;
        FollowInfo followInfo;
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.fi_);
            if (findViewById != null && findViewById.getVisibility() != 0) {
                findViewById.setVisibility(0);
                if (z) {
                    DataChannel dataChannel = this.LJLILLLLZI;
                    if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                        j = followInfo.getFollowStatus();
                    } else {
                        j = 0;
                    }
                    C74824TYe.LJJJJI(j, "plus_button");
                }
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.fia);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            LiveIconView liveIconView = this.LJLJL;
            if (liveIconView != null) {
                liveIconView.setBackgroundResource(0);
                IThemeAbility iThemeAbility = this.LJLJLJ;
                if ((iThemeAbility != null && (B70 = iThemeAbility.B70()) != null && (state = B70.getState()) != null && (num = state.LJLILLLLZI) != null && (LIZIZ = LIZIZ(0.9f, num.intValue())) != null) || (LIZIZ = LIZIZ(1.0f, R.drawable.d4c)) != null) {
                    liveIconView.setImageDrawable(LIZIZ);
                }
            }
            C47121t6 c47121t6 = this.LJLJJLL;
            if (c47121t6 != null) {
                c47121t6.setTextColor(-1);
            }
        }
    }

    public final void setWindow(InterfaceC75179Tex interfaceC75179Tex) {
        o.LJIIIZ(interfaceC75179Tex, "<set-?>");
        this.LJLIL = interfaceC75179Tex;
    }

    public static Drawable LIZIZ(float f, int i) {
        Drawable LJI = C15380j0.LJI(i);
        if (LJI != null) {
            LJI.setAlpha((int) (f * 255));
            return LJI;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75161Tef(InterfaceC75179Tex window, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(window.LJJIJIL().getContext());
        o.LJIIIZ(window, "window");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        new LinkedHashMap();
        this.LJLIL = window;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
    }
}
