package com.bytedance.android.livesdk.gift.base.platform.business.effect;

import X.C025908h;
import X.C05170If;
import X.C15380j0;
import X.C30868C9o;
import X.C31996Ch6;
import X.C32108Ciu;
import X.C32260ClM;
import X.C32446CoM;
import X.C32447CoN;
import X.C65032gt;
import X.C73318Sq2;
import X.C73943T0h;
import X.C78072UkW;
import X.C78076Uka;
import X.C78110Ul8;
import X.C78160Ulw;
import X.CKB;
import X.InterfaceC32109Civ;
import X.InterfaceC32440CoG;
import X.InterfaceC78213Umn;
import Y.ARunnableS0S1220000_5;
import Y.AfS36S0101000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.gift.render.model.Effect;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class LiveNewVideoGiftWidget extends LiveWidget {
    public GiftWidget LJLIL;
    public C31996Ch6 LJLILLLLZI;
    public AssetsModel LJLJI;
    public Room LJLJJI;
    public boolean LJLJJL;
    public final C73318Sq2 LJLJJLL = new C73318Sq2();
    public int LJLJL = 0;
    public InterfaceC78213Umn LJLJLJ;
    public InterfaceC32440CoG LJLJLLL;
    public C78072UkW LJLL;
    public C78160Ulw LJLLI;

    public final void LLFFF() {
        this.LJLJL = 0;
        if (this.LJLIL != null) {
            C73943T0h.LIZ().LIZIZ(new C32447CoN());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dlp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int LJZ() {
        GiftMessage giftMessage;
        C78072UkW c78072UkW = this.LJLL;
        if (c78072UkW != null && (giftMessage = c78072UkW.LIZ) != null) {
            Gift gift = giftMessage.mGift;
            if (gift != null || (gift = GiftManager.inst().findGiftById(c78072UkW.LIZ.giftId)) != null) {
                if (gift.isBoxGift) {
                    return 13;
                }
                return gift.type;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        boolean z;
        InterfaceC32109Civ interfaceC32109Civ;
        super.onCreate();
        this.LJLJJI = (Room) this.dataChannel.kv0(RoomChannel.class);
        Boolean bool = (Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class);
        this.LJLJJLL.LIZ(C73943T0h.LIZ().LJ(C32446CoM.class).LJJJLIIL(new AfS36S0101000_5(2, this, 54), new AfS36S0101000_5(2, this, 55)));
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        this.LJLJLJ = (InterfaceC78213Umn) view.findViewById(R.id.ivo);
        if (!GiftRenderSparkOptimizeSetting.INSTANCE.isPreCreateWhenEnterLiveRoom() || (interfaceC32109Civ = (InterfaceC32109Civ) C32260ClM.LIZ(InterfaceC32109Civ.class)) == null) {
            return;
        }
        C32108Ciu.LIZ(interfaceC32109Civ, 1, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC32440CoG interfaceC32440CoG = this.LJLJLLL;
        if (interfaceC32440CoG != null) {
            interfaceC32440CoG.stop();
            this.LJLJLLL = null;
        }
        this.LJLJJLL.LIZLLL();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0259 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLZ(X.C32446CoM r51) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveNewVideoGiftWidget.LJLZ(X.CoM):void");
    }

    public final void LLFF(C31996Ch6 c31996Ch6) {
        if (this.LJLIL != null) {
            String LJ = C05170If.LJ(c31996Ch6.LJI);
            if (c31996Ch6.LJIIIZ && !TextUtils.isEmpty(c31996Ch6.LIZ)) {
                Object[] objArr = {c31996Ch6.LIZ, LJ};
                Context LIZLLL = C15380j0.LIZLLL();
                if (LIZLLL != null || (LIZLLL = C15380j0.LIZLLL()) != null) {
                    C30868C9o.LJFF(LIZLLL, LIZLLL.getString(R.string.llt, objArr));
                }
                this.LJLJL = 1;
            }
        }
    }

    public final void LL(C31996Ch6 c31996Ch6, AssetsModel assetsModel) {
        boolean z = c31996Ch6.LJIIIZ;
        C78110Ul8.LIZ.getClass();
        int LIZ = C78076Uka.LIZ();
        if (z) {
            LLF(assetsModel, c31996Ch6, "_self");
        } else if (!z && LIZ == 1) {
            LLF(assetsModel, c31996Ch6, "_anchor");
        }
        C78160Ulw c78160Ulw = this.LJLLI;
        if (c78160Ulw != null && GiftEventTrackSamplingSetting.shouldBlock(c78160Ulw.LJIILJJIL)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (z || LIZ == 1)) {
            return;
        }
        LLF(assetsModel, c31996Ch6, "");
    }

    public final void LLFII(boolean z, boolean z2) {
        User user;
        C31996Ch6 c31996Ch6 = this.LJLILLLLZI;
        if (c31996Ch6 != null && (user = c31996Ch6.LJII) != null && user.getId() == C025908h.LIZ()) {
            CKB.INSTANCE.setBigGiftPlayStateEvent(z, z2, this.LJLILLLLZI);
        }
    }

    public static void LJZI(AssetsModel assetsModel, C31996Ch6 c31996Ch6, String str) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_render_finished", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        C65032gt.LIZ(new ARunnableS0S1220000_5(assetsModel, c31996Ch6, str, 1));
    }

    public final void LLF(final AssetsModel assetsModel, final C31996Ch6 c31996Ch6, final String str) {
        C65032gt.LIZ(new Runnable() { // from class: X.Co8
            public final /* synthetic */ boolean LJLJJL = true;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveNewVideoGiftWidget r8 = com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveNewVideoGiftWidget.this
                    X.Ch6 r3 = r3
                    com.bytedance.android.livesdk.gift.assets.AssetsModel r5 = r4
                    java.lang.String r2 = r5
                    boolean r7 = r10.LJLJJL
                    r8.getClass()
                    long r0 = r3.LIZLLL
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    boolean r9 = X.C32341Cmf.LJ(r0)
                    r4 = 0
                    if (r5 == 0) goto Lfa
                    int r1 = r5.resourceType
                    int r0 = com.bytedance.android.livesdk.gift.assets.AssetsModel.RESOURCE_TYPE_LYNX
                    if (r1 != r0) goto Lfa
                    java.lang.String r1 = r5.lynxUrlSettingsKey
                    java.lang.String r6 = ""
                    if (r1 != 0) goto L27
                    r1 = r6
                L27:
                    com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage r0 = com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage.INSTANCE
                    java.util.Map r0 = r0.getValue()
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 != 0) goto L36
                    r0 = r6
                L36:
                    android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                    java.lang.String r0 = "channel"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
                    if (r0 != 0) goto Lf7
                L42:
                    java.lang.String r0 = "/"
                    java.io.File r0 = X.C15510jD.LJFF(r6, r0)
                    if (r0 == 0) goto Lfa
                    boolean r6 = r0.exists()
                L4e:
                    java.lang.String r0 = "gift_render_msg_receive"
                    java.lang.String r0 = defpackage.i0.LJFF(r0, r2)
                    X.BZI r2 = X.C28787BRn.LIZ(r0)
                    X.Ulw r0 = r8.LJLLI
                    java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJ
                    r2.LJJIFFI(r0)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                    java.lang.String r0 = "use_sdk"
                    r2.LJIJJ(r1, r0)
                    long r0 = r3.LIZLLL
                    java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    java.lang.String r0 = "asset_id"
                    r2.LJIJJ(r1, r0)
                    long r0 = r3.LJIIIIZZ
                    java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    java.lang.String r0 = "gift_id"
                    r2.LJIJJ(r1, r0)
                    long r0 = r3.LIZJ
                    java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    java.lang.String r0 = "msg_id"
                    r2.LJIJJ(r1, r0)
                    java.lang.String r1 = "log_id"
                    java.lang.String r0 = r3.LJIIJ
                    r2.LJIJJ(r0, r1)
                    if (r5 != 0) goto Lf4
                L92:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                    java.lang.String r0 = "res_type"
                    r2.LJIJJ(r1, r0)
                    boolean r0 = r3.LJIIIZ
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.String r0 = "is_local"
                    r2.LJIJJ(r1, r0)
                    boolean r0 = r3.LJIIIZ
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.String r0 = "is_own_send"
                    r2.LJIJJ(r1, r0)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                    java.lang.String r0 = "resource_downloaded"
                    r2.LJIJJ(r1, r0)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.String r0 = "gecko_resource_downloaded"
                    r2.LJIJJ(r1, r0)
                    X.Uka r0 = X.C78110Ul8.LIZ
                    r0.getClass()
                    int r0 = X.C78076Uka.LIZ()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.String r0 = "is_anchor"
                    r2.LJIJJ(r1, r0)
                    com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting.INSTANCE
                    float r0 = r0.getValue()
                    java.lang.Float r1 = java.lang.Float.valueOf(r0)
                    java.lang.String r0 = "device_score"
                    r2.LJIL(r0, r1)
                    java.lang.String r1 = X.C1H.LJ()
                    java.lang.String r0 = "overload_score"
                    r2.LJIJJ(r1, r0)
                    r2.LJIIZILJ()
                    r2.LJJIIJZLJL()
                    return
                Lf4:
                    int r4 = r5.resourceType
                    goto L92
                Lf7:
                    r6 = r0
                    goto L42
                Lfa:
                    r6 = 0
                    goto L4e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC32432Co8.run():void");
            }
        });
    }

    public static void LJZL(Effect effect, C78160Ulw c78160Ulw, String str, boolean z) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_render_finished", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        C65032gt.LIZ(new ARunnableS0S1220000_5(effect, c78160Ulw, str, z, 0));
    }
}
