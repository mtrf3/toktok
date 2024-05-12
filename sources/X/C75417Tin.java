package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import defpackage.b1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tin, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75417Tin implements InterfaceC75807Tp5 {
    public final /* synthetic */ C75518TkQ LIZ;

    @Override // X.InterfaceC75807Tp5
    public final void b5(int i, String str, AqS58S0400000_13 aqS58S0400000_13) {
    }

    @Override // X.InterfaceC75807Tp5
    public final JSONObject c5(InteractConfig interactConfig, List list, int i, int i2, java.util.Map map, Layout layout, String str, java.util.Map map2, String str2, InterfaceC75807Tp5 interfaceC75807Tp5, java.util.Map map3, List list2, float f, long j, int i3, HashMap businessMixStreamPermanentRegionTaskQueue) {
        o.LJIIIZ(businessMixStreamPermanentRegionTaskQueue, "businessMixStreamPermanentRegionTaskQueue");
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean e5(int i, String str) {
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF g5(Region region) {
        o.LJIIIZ(region, "region");
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final ImageModel j5(String str) {
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
        return ((IInteractService) CN1.LIZ(IInteractService.class)).Qe0() ? 1 : 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final Client.RTCWaterMarkRegion.TranscoderImageRenderMode LIZ() {
        return Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_FIT;
    }

    public C75417Tin(C75518TkQ c75518TkQ) {
        this.LIZ = c75518TkQ;
    }

    @Override // X.InterfaceC75807Tp5
    public final int Z4(String interactId) {
        String str;
        UserState userState;
        int i;
        Player player;
        UserState userState2;
        Integer num;
        Player player2;
        RtcUserInfo LLLLLJIL;
        o.LJIIIZ(interactId, "interactId");
        boolean z = true;
        if (!this.LIZ.LIZIZ) {
            return 1;
        }
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        Long l = null;
        if (LJJIJL != null && (LLLLLJIL = LJJIJL.LLLLLJIL()) != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        if (o.LJ(interactId, str)) {
            if (C29306Beo.LJJIFFI(Boolean.valueOf(this.LIZ.LIZJ))) {
                i = 2;
            } else {
                i = 1;
            }
            C75406Tic c75406Tic = this.LIZ.LJI;
            if (c75406Tic != null) {
                userState2 = c75406Tic.LIZIZ(interactId);
                if (userState2 != null) {
                    num = Integer.valueOf(userState2.onlineUserState);
                    StringBuilder LJI = JBR.LJI("getOnlineUserState: isFindSelf=", z, ", self: userId=");
                    if (userState2 != null && (player2 = userState2.user) != null) {
                        l = Long.valueOf(player2.uid);
                    }
                    LJI.append(l);
                    LJI.append(", interactId=");
                    LJI.append(interactId);
                    LJI.append(", isBackground=");
                    C1FL.LJFF(LJI, this.LIZ.LIZJ, ", selfStateLocal=", i, ", selfStateRemote=");
                    LJI.append(num);
                    C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LJI));
                }
            } else {
                userState2 = null;
            }
            z = false;
            num = null;
            StringBuilder LJI2 = JBR.LJI("getOnlineUserState: isFindSelf=", z, ", self: userId=");
            if (userState2 != null) {
                l = Long.valueOf(player2.uid);
            }
            LJI2.append(l);
            LJI2.append(", interactId=");
            LJI2.append(interactId);
            LJI2.append(", isBackground=");
            C1FL.LJFF(LJI2, this.LIZ.LIZJ, ", selfStateLocal=", i, ", selfStateRemote=");
            LJI2.append(num);
            C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LJI2));
        } else {
            C75406Tic c75406Tic2 = this.LIZ.LJI;
            if (c75406Tic2 != null) {
                userState = c75406Tic2.LIZIZ(interactId);
                if (userState != null) {
                    i = userState.onlineUserState;
                    StringBuilder LJI3 = JBR.LJI("getOnlineUserState: isFindOther=", z, ", other: userId=");
                    if (userState != null && (player = userState.user) != null) {
                        l = Long.valueOf(player.uid);
                    }
                    LJI3.append(l);
                    LJI3.append(", interactId=");
                    LJI3.append(interactId);
                    LJI3.append(", otherStateRemote=");
                    b1.LJ(LJI3, i, LJI3, "MultiHostAnchorStateManager");
                }
            } else {
                userState = null;
            }
            z = false;
            i = 1;
            StringBuilder LJI32 = JBR.LJI("getOnlineUserState: isFindOther=", z, ", other: userId=");
            if (userState != null) {
                l = Long.valueOf(player.uid);
            }
            LJI32.append(l);
            LJI32.append(", interactId=");
            LJI32.append(interactId);
            LJI32.append(", otherStateRemote=");
            b1.LJ(LJI32, i, LJI32, "MultiHostAnchorStateManager");
        }
        return i;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean a5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final int f5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final OSZ<Integer, Integer> h5(Resolution resolution) {
        return C75418Tio.LIZ(resolution);
    }

    @Override // X.InterfaceC75807Tp5
    public final int l5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean o5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean p5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final double d5(Layout layout, String str) {
        o.LJIIIZ(layout, "layout");
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // X.InterfaceC75807Tp5
    public final C73579SuF i5(int i, String str) {
        return AbstractC73638SvC.LJI(C42039Geh.LJLIL);
    }
}
