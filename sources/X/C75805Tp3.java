package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.AudioChatWatermarkResolution;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicAudioChatWatermarkResolutionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tp3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75805Tp3 implements InterfaceC75807Tp5 {
    public final /* synthetic */ C74843TYx LIZ;

    @Override // X.InterfaceC75807Tp5
    public final double d5(Layout layout, String str) {
        o.LJIIIZ(layout, "layout");
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean e5(int i, String str) {
        return true;
    }

    @Override // X.InterfaceC75807Tp5
    public final ImageModel j5(String str) {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final int k5() {
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean p5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return true;
    }

    @Override // X.InterfaceC75807Tp5
    public final Drawable m5() {
        Context context;
        Context context2;
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.LIZ.mView;
        Drawable drawable = null;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.av6, context);
        if (LIZLLL == null) {
            return null;
        }
        InterfaceC31336CRo interfaceC31336CRo2 = (InterfaceC31336CRo) this.LIZ.mView;
        if (interfaceC31336CRo2 != null && (context2 = interfaceC31336CRo2.getContext()) != null) {
            drawable = context2.getDrawable(R.drawable.dce);
        }
        LIZLLL.LIZJ(drawable);
        LIZLLL.setTint(C15380j0.LIZIZ(R.color.a97));
        LIZLLL.LIZLLL(0.375f);
        if (LIZLLL.LJZ != 0.375f) {
            LIZLLL.LJZ = 0.375f;
            LIZLLL.LJI();
            LIZLLL.invalidateSelf();
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC75807Tp5
    public final Client.RTCWaterMarkRegion.TranscoderImageRenderMode LIZ() {
        return Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_FIT;
    }

    public C75805Tp3(C74843TYx c74843TYx) {
        this.LIZ = c74843TYx;
    }

    @Override // X.InterfaceC75807Tp5
    public final int Z4(String interactId) {
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        UserState fx;
        o.LJIIIZ(interactId, "interactId");
        if (o.LJ(interactId, C78886Uxe.LJJJJLL(C8E.LJ()))) {
            if (C29306Beo.LJJIFFI(this.LIZ.LJLJJL)) {
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
        TZM tzm;
        o.LJIIIZ(interactId, "interactId");
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            return tzm.k(interactId);
        }
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final int f5(String interactId) {
        TZM tzm;
        o.LJIIIZ(interactId, "interactId");
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            return tzm.LL(interactId);
        }
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF g5(Region region) {
        o.LJIIIZ(region, "region");
        double width = (region.getWidth() - (region.getWidth() * LAV.LIZ(LAV.LIZIZ()))) / 2;
        RectF rectF = new RectF();
        rectF.left = (float) (region.getX() + width);
        rectF.right = (float) ((region.getWidth() + region.getX()) - width);
        rectF.top = (float) region.getY();
        rectF.bottom = (float) (region.getY() + (rectF.right - rectF.left));
        return rectF;
    }

    @Override // X.InterfaceC75807Tp5
    public final OSZ<Integer, Integer> h5(Resolution resolution) {
        AudioChatWatermarkResolution value = LinkmicAudioChatWatermarkResolutionSetting.INSTANCE.getValue();
        return new OSZ<>(Integer.valueOf(value.w), Integer.valueOf(value.h));
    }

    @Override // X.InterfaceC75807Tp5
    public final int l5(String interactId) {
        TZM tzm;
        o.LJIIIZ(interactId, "interactId");
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            return tzm.b(interactId);
        }
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF n5(RectF rectF) {
        float width = (rectF.width() - (LAV.LIZ(LAV.LIZIZ()) * rectF.width())) / 2;
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left + width;
        rectF2.right = rectF.right - width;
        rectF2.top = rectF.top;
        rectF2.bottom = rectF2.width() + rectF.top;
        return rectF2;
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
    public final C73579SuF i5(int i, String str) {
        return AbstractC73638SvC.LJI(new C76528U1s(this.LIZ, str, i));
    }

    @Override // X.InterfaceC75807Tp5
    public final void b5(int i, String str, AqS58S0400000_13 aqS58S0400000_13) {
        ImageModel avatarThumb;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LIZ.LJLILLLLZI;
        if ((interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(str)) != null && (user = linkPlayerInfo.mUser) != null && (avatarThumb = user.getAvatarThumb()) != null) || (i == 0 && (avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()) != null)) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostFrescoHelper.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((IHostFrescoHelper) LIZ2).nn0(avatarThumb, new C78738UvG(), new C1XR(aqS58S0400000_13));
            return;
        }
        aqS58S0400000_13.invoke(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        if (r24.o5(r10.getInteractId()) != false) goto L34;
     */
    @Override // X.InterfaceC75807Tp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject c5(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig r15, java.util.List r16, int r17, int r18, java.util.Map r19, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r20, java.lang.String r21, java.util.Map r22, java.lang.String r23, X.InterfaceC75807Tp5 r24, java.util.Map r25, java.util.List r26, float r27, long r28, int r30, java.util.HashMap r31) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75805Tp3.c5(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig, java.util.List, int, int, java.util.Map, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, java.lang.String, java.util.Map, java.lang.String, X.Tp5, java.util.Map, java.util.List, float, long, int, java.util.HashMap):org.json.JSONObject");
    }
}
