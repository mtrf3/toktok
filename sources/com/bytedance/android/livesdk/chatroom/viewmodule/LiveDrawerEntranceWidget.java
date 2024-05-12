package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B76;
import X.BJM;
import X.BZI;
import X.C05630Jz;
import X.C08680Vs;
import X.C0K2;
import X.C0NB;
import X.C15380j0;
import X.C28594BKc;
import X.C28649BMf;
import X.C28787BRn;
import X.C29048Bae;
import X.C29306Beo;
import X.C31665Cbl;
import X.C32537Cpp;
import X.C47061t0;
import X.C6H;
import X.C73115Sml;
import X.C73969T1h;
import X.C81705W4v;
import X.C87277YNd;
import X.CCJ;
import X.CN1;
import X.InterfaceC78716Uuu;
import X.KL2;
import X.T16;
import X.W4R;
import X.W5I;
import X.W5P;
import Y.ACListenerS24S0101000_5;
import Y.AfS36S0101000_5;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.watch.IDisplayOptService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.bytedance.android.livesdkapi.depend.model.live.SkinDrawerEntrance;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveDrawerEntranceWidget extends RoomRecycleFunctionWidget {
    public C73115Sml LJLILLLLZI;
    public LiveIconView LJLJI;
    public C47061t0 LJLJJI;
    public View LJLJJL;
    public C47061t0 LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cui;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLIL = false;
        C47061t0 c47061t0 = this.LJLJJI;
        if (c47061t0 != null) {
            c47061t0.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        return true;
    }

    public final boolean LJLZ() {
        IDisplayOptService iDisplayOptService = (IDisplayOptService) CN1.LIZ(IDisplayOptService.class);
        if (iDisplayOptService != null && iDisplayOptService.bq(this.dataChannel)) {
            return true;
        }
        return false;
    }

    public final void LJZ() {
        KL2.LJIILLIIL(8, this.LJLJJLL);
        KL2.LJIILLIIL(0, this.LJLJJL);
    }

    public final void LJZI() {
        int LIZ = C15380j0.LIZ(2.0f);
        if (CCJ.LIZ(getContext())) {
            C87277YNd.LJJIII(R.drawable.cab, this.LJLILLLLZI);
            this.LJLJJL.setPadding(0, 0, LIZ, 0);
        } else {
            C87277YNd.LJJIII(R.drawable.caa, this.LJLILLLLZI);
            this.LJLJJL.setPadding(LIZ, 0, 0, 0);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJJJJ() {
        if (LJLZ()) {
            B76.LIZLLL("explore", (Room) this.dataChannel.kv0(RoomChannel.class), Long.valueOf(this.LJLJLJ));
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJLJI() {
        if (LJLZ()) {
            this.LJLJLJ = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJI = (LiveIconView) getView().findViewById(R.id.cxw);
        if (CCJ.LIZ(this.context)) {
            this.LJLJI.setRotation(90.0f);
        } else {
            this.LJLJI.setRotation(-90.0f);
        }
        this.LJLILLLLZI = (C73115Sml) getView().findViewById(R.id.cxl);
        this.LJLJJL = getView().findViewById(R.id.cxs);
        this.LJLJJLL = (C47061t0) getView().findViewById(R.id.cxt);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r1v28, types: [X.BMf, O] */
    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        SkinDrawerEntrance skinDrawerEntrance;
        super.onLoad(objArr);
        show();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C28649BMf c28649BMf = (C28649BMf) dataChannelGlobal.mv0(C29048Bae.class);
        if (c28649BMf == null) {
            ((C32537Cpp) dataChannelGlobal.gv0(C29048Bae.class)).LIZ = new C28649BMf(0);
        } else {
            c28649BMf.LIZ = 0;
        }
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_explore_entrance_show", 0.01d)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_explore_entrance_show");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJI();
                LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
                LIZ.LJJIIZI();
            }
        }
        C47061t0 c47061t0 = (C47061t0) getView().findViewById(R.id.che);
        this.LJLJJI = c47061t0;
        c47061t0.setVisibility(0);
        C47061t0 c47061t02 = this.LJLJJI;
        int i = R.drawable.cqn;
        c47061t02.setImageResource(R.drawable.cqn);
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        String str = c08680Vs.LJIIIIZZ;
        TextView textView = (TextView) getView().findViewById(R.id.cxx);
        str.getClass();
        if (!str.equals("game_drawer_drops")) {
            if (!str.equals("game_drawer")) {
                textView.setText(R.string.l64);
                LJZI();
            } else {
                textView.setText(R.string.l17);
                if (g0.LJIILJJIL(this.context) != null) {
                    if (C29306Beo.LJIIZILJ(g0.LJIILJJIL(this.context).getRequestedOrientation())) {
                        C87277YNd.LJJIII(R.drawable.cqm, this.LJLILLLLZI);
                        this.LJLJJL.setPadding(C15380j0.LIZ(2.0f), 0, 0, 0);
                    } else {
                        LJZI();
                    }
                }
            }
        } else {
            textView.setText(R.string.lap);
            if (this.LJLJJI != null) {
                int LIZ2 = C15380j0.LIZ(4.0f);
                this.LJLJJI.setPadding(LIZ2, LIZ2, LIZ2, LIZ2);
                this.LJLJJI.setImageResource(R.drawable.ct1);
            }
        }
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room == null) {
            LJZ();
        } else {
            Skin skin = room.skin;
            if (skin == null) {
                LJZ();
            } else {
                SkinDrawerEntrance skinDrawerEntrance2 = skin.drawerEntrance;
                if (skinDrawerEntrance2 == null) {
                    LJZ();
                } else if (skinDrawerEntrance2.cover == null) {
                    LJZ();
                } else if (skinDrawerEntrance2.style == 1 && C08680Vs.LJIJI.contains(c08680Vs.LJIIIIZZ)) {
                    Skin skin2 = room.skin;
                    if (skin2 == null || (skinDrawerEntrance = skin2.drawerEntrance) == null) {
                        C0NB.LJIIIZ("LiveDrawerEntranceWidget", "skin is null when this is an esports Drawer");
                    } else {
                        ImageModel imageModel = skinDrawerEntrance.cover;
                        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                            C0NB.LJIIIZ("LiveDrawerEntranceWidget", "urls is empty when this is an esports Drawer");
                        } else if (this.LJLJJI == null) {
                            C0NB.LJIIIZ("LiveDrawerEntranceWidget", "mDrawerAnimIv is null");
                        } else {
                            Uri parse = UriProtector.parse((String) ListProtector.get(imageModel.getUrls(), 0));
                            C81705W4v LIZJ = W5I.LIZJ();
                            LIZJ.LJIIL = this.LJLJJI.getController();
                            LIZJ.LIZLLL = W5P.LIZLLL(parse).LIZ();
                            W4R LIZ3 = LIZJ.LIZ();
                            this.LJLJJI.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                            if (o.LJ(c08680Vs.LJIIIIZZ, "game_drawer_drops")) {
                                i = R.drawable.ct1;
                            }
                            this.LJLJJI.getHierarchy().LJIJI(i, InterfaceC78716Uuu.LJJLIIIIJ);
                            this.LJLJJI.setController(LIZ3);
                        }
                    }
                } else {
                    C31665Cbl.LIZJ(room.skin.drawerEntrance.cover).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(4, this, 3), new AfS36S0101000_5(3, this, 4));
                }
            }
        }
        C6H.LIZ(new ACListenerS24S0101000_5(1, this, 0), getView());
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_room_with_drawer", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(0, "error_code", jSONObject);
            C05630Jz.LJI(jSONObject, "error_msg", "load drawer widget");
            C05630Jz.LJI(jSONObject, "enter_method", C28594BKc.LIZJ().LIZIZ());
            C0K2.LJIILLIIL(0, 0, "ttlive_audience_room_with_drawer", jSONObject);
        }
        if (!LJLZ() && !this.LJLJL) {
            this.LJLJL = true;
            B76.LIZJ((Room) this.dataChannel.kv0(RoomChannel.class), "explore");
        }
    }
}
