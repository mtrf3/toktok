package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32241Oi implements InterfaceC08160Ts {
    public final DataChannel LIZ;
    public final View LIZIZ;
    public final InterfaceC08140Tq LIZJ;
    public final InterfaceC31981Ni LIZLLL = ((IEffectService) CN1.LIZ(IEffectService.class)).composerManagerB();
    public boolean LJ = true;
    public String LJFF = "";

    public final void LIZ() {
        InterfaceC31981Ni interfaceC31981Ni = this.LIZLLL;
        String STICKER = C0TY.LIZIZ;
        List<LiveEffect> LIZ = interfaceC31981Ni.LIZ(STICKER);
        o.LJIIIIZZ(LIZ, "composerManager.getCurre…cker(EffectPanel.STICKER)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        if (liveEffect != null && liveEffect.forbidInLink) {
            C30868C9o.LIZJ(R.string.l6p);
            InterfaceC31981Ni interfaceC31981Ni2 = this.LIZLLL;
            o.LJIIIIZZ(STICKER, "STICKER");
            interfaceC31981Ni2.LJIILL(liveEffect, STICKER);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.qv0(StickerCancelChannel.class, liveEffect);
            }
        }
    }

    public final void LIZIZ() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int LIZ;
        InterfaceC08140Tq interfaceC08140Tq = this.LIZJ;
        if (interfaceC08140Tq != null) {
            i = interfaceC08140Tq.LJIILJJIL();
        } else {
            i = 720;
        }
        InterfaceC08140Tq interfaceC08140Tq2 = this.LIZJ;
        if (interfaceC08140Tq2 != null) {
            i2 = interfaceC08140Tq2.LJI();
        } else {
            i2 = 1280;
        }
        View view = this.LIZIZ;
        if (view != null) {
            i3 = view.getWidth();
        } else {
            i3 = 0;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            i4 = view2.getHeight();
        } else {
            i4 = 0;
        }
        if (i3 == 0 || i4 == 0 || i2 == 0 || i == 0) {
            return;
        }
        float f2 = i3;
        float f3 = i4;
        float f4 = i;
        float f5 = i2;
        float f6 = f4 / f5;
        if (f2 / f3 > f6) {
            i6 = (int) (f2 / f6);
            f = f4 / f2;
            i5 = i3;
        } else {
            i5 = (int) (f6 * f3);
            f = f5 / f3;
            i6 = i4;
        }
        Rect rect = new Rect();
        View view3 = this.LIZIZ;
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        int i7 = rect.left - ((i5 - i3) / 2);
        int i8 = rect.top - (i6 - i4);
        if (C29306Beo.LJIILJJIL()) {
            LIZ = C15380j0.LIZ(167.0f);
        } else {
            LIZ = C15380j0.LIZ(167.0f);
        }
        float f7 = (LIZ - i8) * f;
        float f8 = (0 - i7) * f;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("top", Float.valueOf(f7));
        jSONObject2.put("left", Float.valueOf(f8));
        jSONObject2.put("right", Float.valueOf(f8));
        jSONObject2.put("bottom", Float.valueOf(C15380j0.LIZ(302.0f) * f));
        jSONObject.put("safe_area", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", i);
        jSONObject3.put("height", i2);
        jSONObject.put("canvas", jSONObject3);
        this.LIZLLL.setRenderCacheString("default_safe_area", jSONObject.toString());
    }

    public C32241Oi(DataChannel dataChannel, View view, InterfaceC08140Tq interfaceC08140Tq) {
        this.LIZ = dataChannel;
        this.LIZIZ = view;
        this.LIZJ = interfaceC08140Tq;
        DataChannelGlobal.LJLJJI.ov0(BroadcastSceneGlobalChannel.class, this, new IDqS416S0100000(this, 181));
        if (dataChannel != null) {
            dataChannel.mv0(StickerSelectedEvent.class, this, new IDqS416S0100000(this, 182));
            dataChannel.mv0(MultiLiveRTCLayoutChannel.class, this, new IDqS416S0100000(this, 183));
            dataChannel.mv0(StickerCancelChannel.class, this, new IDqS416S0100000(this, 184));
            dataChannel.mv0(PauseLiveChannel.class, this, new IDqS416S0100000(this, 185));
        }
    }
}
