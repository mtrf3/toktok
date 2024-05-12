package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tey, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75180Tey implements InterfaceC75807Tp5 {
    public final /* synthetic */ C74842TYw LIZ;

    @Override // X.InterfaceC75807Tp5
    public final void b5(int i, String str, AqS58S0400000_13 aqS58S0400000_13) {
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean e5(int i, String str) {
        return i != 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF g5(Region region) {
        o.LJIIIZ(region, "region");
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final Drawable m5() {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF n5(RectF rectF) {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final int k5() {
        Boolean bool;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return 2;
        }
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final Client.RTCWaterMarkRegion.TranscoderImageRenderMode LIZ() {
        return Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_HIDDEN;
    }

    public C75180Tey(C74842TYw c74842TYw) {
        this.LIZ = c74842TYw;
    }

    @Override // X.InterfaceC75807Tp5
    public final int Z4(String interactId) {
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        UserState fx;
        o.LJIIIZ(interactId, "interactId");
        this.LIZ.getClass();
        if (o.LJ(interactId, C74842TYw.LJJJJZI())) {
            if (C29306Beo.LJJIFFI(this.LIZ.LJLJLLL)) {
                return 2;
            }
            return 1;
        }
        TZC tzc = (TZC) this.LIZ.mView;
        if (tzc != null && (linkScope = tzc.linkScope()) != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(linkScope, ILinkStateAbility.class, null)) != null && (fx = iLinkStateAbility.fx(interactId)) != null) {
            return fx.onlineUserState;
        }
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean a5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        boolean gt = ((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(this.LIZ.LJLJI.getId()));
        C74842TYw c74842TYw = this.LIZ;
        if (gt) {
            return true;
        }
        Boolean LIZJ = c74842TYw.getMultiGuestDataHolder().LIZJ(interactId);
        if (LIZJ != null) {
            return LIZJ.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final int f5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return this.LIZ.getMultiGuestDataHolder().LIZIZ(interactId);
    }

    @Override // X.InterfaceC75807Tp5
    public final OSZ<Integer, Integer> h5(Resolution resolution) {
        return C75418Tio.LIZ(resolution);
    }

    @Override // X.InterfaceC75807Tp5
    public final ImageModel j5(String str) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        InterfaceC31805Ce1 LJJJJJ = this.LIZ.LJJJJJ();
        if (LJJJJJ != null && (LIZ = LJJJJJ.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(str)) != null && (user = linkPlayerInfo.mUser) != null) {
            return user.getAvatarThumb();
        }
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final int l5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return this.LIZ.getMultiGuestDataHolder().LJIIIZ(interactId);
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean o5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        if (l5(interactId) >= LiveSeiTalkSetting.INSTANCE.volumeThreshold()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean p5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        Boolean LJIIJ = this.LIZ.getMultiGuestDataHolder().LJIIJ(interactId);
        if (LJIIJ != null) {
            return LJIIJ.booleanValue();
        }
        return true;
    }

    @Override // X.InterfaceC75807Tp5
    public final double d5(Layout layout, String str) {
        o.LJIIIZ(layout, "layout");
        LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
        if (!livesdkLinkmicFloatWindowOptimizeSetting.enableAnchorMixStream() || layout.getScene() != 4 || !o.LJ(layout.getBusinessType(), EnumC74991Tbv.FLOAT.getBusinessType()) || o.LJ(str, C78886Uxe.LJJJJLL(C8E.LJ()))) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return livesdkLinkmicFloatWindowOptimizeSetting.getCORNER_RADIUS_PX();
    }

    @Override // X.InterfaceC75807Tp5
    public final C73579SuF i5(int i, String str) {
        return AbstractC73638SvC.LJI(new C76529U1t(this.LIZ, str));
    }

    @Override // X.InterfaceC75807Tp5
    public final JSONObject c5(InteractConfig interactConfig, List list, int i, int i2, java.util.Map map, Layout layout, String str, java.util.Map map2, String str2, InterfaceC75807Tp5 interfaceC75807Tp5, java.util.Map map3, List list2, float f, long j, int i3, HashMap businessMixStreamPermanentRegionTaskQueue) {
        o.LJIIIZ(businessMixStreamPermanentRegionTaskQueue, "businessMixStreamPermanentRegionTaskQueue");
        return C75806Tp4.LIZIZ(interactConfig, list, i, i2, map, layout, str, map2, str2, interfaceC75807Tp5, map3, list2, f, j, i3, businessMixStreamPermanentRegionTaskQueue);
    }
}
