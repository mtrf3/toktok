package com.bytedance.android.livesdk.comp.impl.game;

import X.BXN;
import X.BXO;
import X.BXP;
import X.BXQ;
import X.BXR;
import X.BXS;
import X.BY3;
import X.BZI;
import X.C01;
import X.C02;
import X.C03;
import X.C04;
import X.C06;
import X.C0H1;
import X.C0NB;
import X.C0TL;
import X.C141335gf;
import X.C15380j0;
import X.C17J;
import X.C1DJ;
import X.C1E2;
import X.C1EW;
import X.C221108m2;
import X.C28787BRn;
import X.C29239Bdj;
import X.C29306Beo;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29701Eo;
import X.C30451BxH;
import X.C30579BzL;
import X.C30604Bzk;
import X.C30605Bzl;
import X.C30606Bzm;
import X.C30607Bzn;
import X.C30616Bzw;
import X.C30617Bzx;
import X.C30618Bzy;
import X.C30619Bzz;
import X.C31043CGh;
import X.C35641aa;
import X.C3C5;
import X.C47071t1;
import X.C56K;
import X.C62822Ol8;
import X.C65814PsI;
import X.C72818Shy;
import X.C73030SlO;
import X.C73969T1h;
import X.C76800UCe;
import X.C78897Uxp;
import X.CN1;
import X.EnumC30241Btt;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.Q7L;
import X.T16;
import X.UZK;
import X.X1D;
import X.XKQ;
import Y.AfS0S0300100_5;
import Y.AfS1S0200100_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudienceEntranceWidget;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public class GamePartnershipService implements IGamePartnershipService {
    public static long LJLJLLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C30616Bzw.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C01.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C30617Bzx.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C30618Bzy.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C02.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C03.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C30619Bzz.LJLIL);
    public OSZ<Long, ? extends InterfaceC92693kP> LJLJLJ;

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final Class<? extends LiveRecyclableWidget> hS() {
        return GamePartnershipAudiencePromoteGameCardWidget.class;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final Class<? extends LiveRecyclableWidget> mw() {
        return GamePartnershipAudienceEntranceWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new C06();
    }

    public final C30605Bzl LIZ() {
        return (C30605Bzl) this.LJLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C30579BzL S00() {
        return (C30579BzL) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C30607Bzn aT() {
        return (C30607Bzn) this.LJLJL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C31043CGh eD() {
        return (C31043CGh) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final UZK oK() {
        return (UZK) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C30451BxH zi0() {
        return (C30451BxH) this.LJLJI.getValue();
    }

    public final void LJI() {
        C30605Bzl LIZ = LIZ();
        LIZ.LIZ = 0L;
        LIZ.LIZIZ = new ArrayList();
        LIZ.LIZJ = new LinkedHashMap();
        LIZ.LIZLLL = null;
        LIZ.LJ = 0L;
        LIZ.LJFF = "";
        LIZ.LJI = null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final BriefGameTask OL() {
        BriefGameTask briefGameTask;
        Iterator<BriefGameTask> it = LIZ().LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                briefGameTask = it.next();
                if (briefGameTask.task.anchorShowStatus == 0) {
                    break;
                }
            } else {
                briefGameTask = null;
                break;
            }
        }
        return briefGameTask;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Ka0() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void QC() {
    }

    public static boolean LIZLLL(C30605Bzl c30605Bzl) {
        List<BriefGameTask> list = c30605Bzl.LIZIZ;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<BriefGameTask> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().task.anchorShowStatus == 0) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final Boolean Ac(long j) {
        if (LIZ().LIZ != j) {
            return null;
        }
        return Boolean.valueOf(LIZLLL(LIZ()));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Ei0(Room room) {
        if (room == null || !C78897Uxp.LJJIJLIJ(room)) {
            return;
        }
        String str = room.partnershipInfo.promotingGameId;
        BZI LIZ = C28787BRn.LIZ("livesdk_game_partnership_enter_room");
        LIZ.LJIJJ("user", "user_type");
        LIZ.LJIJJ(room.partnershipInfo.partnershipRoom, "partnership_room");
        LIZ.LJIJJ(room.partnershipInfo.partnershipRoom, "promoting_room");
        LIZ.LJIJJ(Long.valueOf(room.getId()), "room_id");
        LIZ.LJIJJ(str, "game_id");
        LIZ.LJJIIJZLJL();
    }

    public final void LJ(Throwable th) {
        if (th instanceof C0TL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" code = ");
            LIZ.append(((C0TL) th).statusCode);
            C0NB.LJ("GamePartnershipService", X1D.LIZIZ(LIZ));
        }
        C0NB.LJI("GamePartnershipService", th);
        LJI();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void QB(Room room) {
        long j;
        boolean z;
        InterfaceC92693kP second;
        OSZ<Long, ? extends InterfaceC92693kP> osz;
        InterfaceC92693kP second2;
        Long first;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        if (LIZ().LIZ == j) {
            LJI();
        }
        OSZ<Long, ? extends InterfaceC92693kP> osz2 = this.LJLJLJ;
        if (osz2 == null || (first = osz2.getFirst()) == null || first.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            OSZ<Long, ? extends InterfaceC92693kP> osz3 = this.LJLJLJ;
            if (osz3 != null && (second = osz3.getSecond()) != null && !second.isDisposed() && (osz = this.LJLJLJ) != null && (second2 = osz.getSecond()) != null) {
                second2.dispose();
            }
            this.LJLJLJ = null;
        }
        C30451BxH c30451BxH = (C30451BxH) this.LJLJI.getValue();
        c30451BxH.LIZJ = "";
        c30451BxH.LIZLLL = false;
        c30451BxH.LJ = null;
        C72818Shy.LJII("gameAudienceRewardDrops", c30451BxH.LJII);
        c30451BxH.LJFF = "";
        XKQ xkq = c30451BxH.LIZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c30451BxH.LIZ = null;
        C29701Eo c29701Eo = c30451BxH.LIZIZ;
        if (c29701Eo != null) {
            c29701Eo.updateBitmap("image_4", null);
        }
        c30451BxH.LIZIZ = null;
        ((ArrayList) ((C30607Bzn) this.LJLJL.getValue()).LIZ).clear();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void AA(Context context, InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        C65814PsI.LIZ().getClass();
        ((GameLivePartnershipRetrofitApi) C65814PsI.LIZJ(GameLivePartnershipRetrofitApi.class)).requestGetAnchorTasks(1L).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIL(2L).LJJII(new AfS57S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 98), new AfS54S0200000_5(this, interfaceC88472Yns, 14));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean Rj0(long j, List<PartnershipGameOfflineMessage.OfflineGameInfo> list) {
        if (LIZ().LIZ == j) {
            for (PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo : list) {
                C29306Beo.LJJIJIIJI(new AqS171S0100000_5(offlineGameInfo, 374), LIZ().LIZIZ);
            }
            return LIZ().LIZIZ.isEmpty();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void nh(long j, InterfaceC88472Yns<? super AnchorRoomInfoResponse.ResponseData, C76800UCe> interfaceC88472Yns) {
        AnchorRoomInfoResponse.ResponseData responseData = ((C04) this.LJLILLLLZI.getValue()).LIZIZ;
        if (j == ((C04) this.LJLILLLLZI.getValue()).LIZ && responseData != null) {
            interfaceC88472Yns.invoke(responseData);
        } else {
            C1EW.LIZ(((GameLivePartnershipRetrofitApi) Q7L.LIZIZ(GameLivePartnershipRetrofitApi.class)).requestAnchorRoomInfo(String.valueOf(j))).LJJJLIIL(new AfS1S0200100_5(j, this, interfaceC88472Yns, 1), C30606Bzm.LJLIL);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void qn(long j, DataChannel dataChannel) {
        ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).nh(j, new AqS171S0100000_5(dataChannel, 759));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean GB(long j, String str, boolean z) {
        BriefGameTask briefGameTask;
        PartnershipTask partnershipTask;
        if (LIZ().LIZ != j) {
            return true;
        }
        Iterator<BriefGameTask> it = LIZ().LIZIZ.iterator();
        do {
            briefGameTask = null;
            if (!it.hasNext()) {
                break;
            }
            briefGameTask = it.next();
        } while (!o.LJ(String.valueOf(briefGameTask.task.id), str));
        BriefGameTask briefGameTask2 = briefGameTask;
        if (briefGameTask2 != null && (partnershipTask = briefGameTask2.task) != null) {
            partnershipTask.anchorShowStatus = z ? 1 : 0;
        }
        if (!z) {
            List<BriefGameTask> list = LIZ().LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (BriefGameTask briefGameTask3 : list) {
                if (!o.LJ(String.valueOf(briefGameTask3.task.id), str)) {
                    arrayList.add(briefGameTask3);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                PartnershipTask partnershipTask2 = ((BriefGameTask) it2.next()).task;
                if (partnershipTask2 != null) {
                    partnershipTask2.anchorShowStatus = 1;
                }
            }
        }
        return LIZLLL(LIZ());
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Np(Context context, String str, String str2) {
        if (!BXP.LIZIZ) {
            BXP.LIZIZ = true;
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJFF(R.string.lh7);
            c47071t1.LJIIL(R.string.lh8, C1DJ.LJLIL);
            c47071t1.LJIIZILJ = BXQ.LJLIL;
            BXP.LIZ(c47071t1.LIZ());
            BZI LIZ = C28787BRn.LIZ("livesdk_add_not_meet_popup_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(str, "user_type");
            LIZ.LJIJJ(str2, "request_page");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Uy(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataChannel, "dataChannel");
        EnumC30241Btt.load$default(EnumC30241Btt.AUDIENCE_PARTNERSHIP, dataChannel, new C35641aa(), null, 4, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void ri0(Context context, String schema, Map<String, String> map) {
        o.LJIIIZ(schema, "schema");
        if (schema.length() == 0) {
            return;
        }
        C29682Bks LIZ = C29683Bkt.LIZ(schema);
        Uri parse = UriProtector.parse(schema);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        C56K c56k = new C56K();
        float f = 1.0f;
        c56k.element = 1.0f;
        if (UriProtector.getQueryParameterNames(parse).contains("game_drag_handle")) {
            String queryParameter = UriProtector.getQueryParameter(parse, "game_drag_handle");
            if (queryParameter != null) {
                try {
                    f = CastFloatProtector.parseFloat(queryParameter);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            c56k.element = f;
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        }
        LIZ.LJIJJ("bottom");
        LIZ.LJIL((int) C15380j0.LJIJ(C15380j0.LJIIL()), BY3.DP);
        LIZ.LJJIFFI(map);
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        String uri = LIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        iHybridContainerService.Vs0(context, uri, new AqS171S0100000_5(c56k, 373));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void y40(FragmentManager manager, String str, Map<String, String> map) {
        o.LJIIIZ(manager, "manager");
        GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = new GameShortVideoAdDetailPageDialogFragment();
        Bundle LIZ = C0H1.LIZ("lynx_schema", str);
        LIZ.putString("initial_data", C17J.LJJJJJL(map));
        gameShortVideoAdDetailPageDialogFragment.setArguments(LIZ);
        gameShortVideoAdDetailPageDialogFragment.show(manager, "");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Bc0(Context context, Room room, DataChannel dataChannel, InterfaceC88472Yns<? super C30605Bzl, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        long id = room.getId();
        if (id <= 0) {
            interfaceC88472Yns.invoke(C30605Bzl.LJII);
            return;
        }
        if (LIZ().LIZ == id) {
            interfaceC88472Yns.invoke(LIZ());
            return;
        }
        GameLivePartnershipApiOptSetting gameLivePartnershipApiOptSetting = GameLivePartnershipApiOptSetting.INSTANCE;
        if (gameLivePartnershipApiOptSetting.getAudienceRoomNewApi()) {
            GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) Q7L.LIZIZ(GameLivePartnershipRetrofitApi.class);
            long currentTimeMillis = System.currentTimeMillis();
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            String idStr2 = room.getOwner().getIdStr();
            o.LJIIIIZZ(idStr2, "room.owner.idStr");
            this.LJLJJL.getValue();
            this.LJLJLJ = new OSZ<>(Long.valueOf(room.getId()), gameLivePartnershipRetrofitApi.requestAudienceRoomInfo(idStr, idStr2, UZK.LIZ(context), "").LJJL(T16.LIZ()).LJJIJL(C1E2.LJLILLLLZI).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C30604Bzk(currentTimeMillis, this, context, room, dataChannel, interfaceC88472Yns), new AfS0S0300100_5(currentTimeMillis, (long) this, (GamePartnershipService) interfaceC88472Yns, (InterfaceC88472Yns<? super C30605Bzl, C76800UCe>) dataChannel, (DataChannel) 3)));
            return;
        }
        if (gameLivePartnershipApiOptSetting.getAudienceRoom().partnershipEntrance) {
            return;
        }
        ((GameLivePartnershipRetrofitApi) Q7L.LIZIZ(GameLivePartnershipRetrofitApi.class)).requestGetAudienceTasks(id).LJJIIJ(T16.LIZ()).LJIJI(C73030SlO.LJLJI).LJIJJ(C73969T1h.LIZIZ()).LJIL(2L).LJJII(new AfS1S0200100_5(id, this, interfaceC88472Yns, 7), new AfS54S0200000_5(this, interfaceC88472Yns, 63));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void dk(Activity activity, String str, String str2, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        int i;
        C29239Bdj c29239Bdj = new C29239Bdj(new AqS168S0200000_5(this, interfaceC88472Yns, 0));
        if (BXP.LIZ) {
            return;
        }
        if (o.LJ("user", str)) {
            i = R.string.lha;
        } else {
            i = R.string.lh_;
        }
        C47071t1 c47071t1 = new C47071t1(activity);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILLIIL(R.string.lhb);
        c47071t1.LJFF(i);
        c47071t1.LJIIL(R.string.lh9, new BXN(activity, str, str2, c29239Bdj));
        c47071t1.LJIIIZ(R.string.k99, new BXO(c29239Bdj, str, str2));
        c47071t1.LJIIZILJ = BXR.LJLIL;
        c47071t1.LJIILLIIL = BXS.LJLIL;
        BXP.LIZ(c47071t1.LIZ());
        BZI LIZ = C28787BRn.LIZ("livesdk_add_birth_popup_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str2, "request_page");
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService r8, long r9, X.C28467BFf r11, com.bytedance.android.livesdk.game.model.AudienceRoomTasksResponse r12, webcast.api.partnership.AudienceRoomInfoResponse.ResponseData r13, int r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService.LJFF(com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService, long, X.BFf, com.bytedance.android.livesdk.game.model.AudienceRoomTasksResponse, webcast.api.partnership.AudienceRoomInfoResponse$ResponseData, int):void");
    }
}
