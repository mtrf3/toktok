package X;

import Y.AfS44S0300000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDcS93S0200000_5;
import Y.IDeS402S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingApi;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.BlockStatus;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.room.OneTapGoLiveEvent;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BbU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC29100BbU extends Handler {
    public final Context LIZ;
    public DialogC31813Ce9 LIZIZ;
    public final LiveMode LIZJ;
    public final boolean LIZLLL;
    public String LJ;
    public int LJFF;
    public int LJI;
    public RoomCreateInfo LJII;
    public LivePermissionApplyResponse LJIIIIZZ;
    public boolean LJIIIZ;
    public Hashtag LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public final C29354Bfa LJIILLIIL;
    public final C5H3 LJIIZILJ;
    public final C62822Ol8 LJIJ;

    public static void LIZLLL(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-8200677160114792418")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final void LIZIZ() {
        try {
            for (InterfaceC29110Bbe interfaceC29110Bbe : (InterfaceC29110Bbe[]) this.LJIIZILJ.getValue()) {
                if (interfaceC29110Bbe.LJIIIZ()) {
                    if (!(interfaceC29110Bbe instanceof C29354Bfa)) {
                        LJII();
                        return;
                    } else {
                        LJ();
                        return;
                    }
                }
            }
            C29020BaC c29020BaC = new C29020BaC(this);
            Object value = C7N.LJII.getValue();
            o.LJIIIIZZ(value, "<get-hostUser>(...)");
            ((IHostUser) value).requestLivePermission(c29020BaC, "one_tap");
        } catch (Throwable unused) {
            LJII();
        }
    }

    public final void LJ() {
        DialogC31813Ce9 dialogC31813Ce9 = this.LIZIZ;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        ((C73318Sq2) this.LJIJ.getValue()).LIZLLL();
    }

    public final void LJII() {
        ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29129Bbx.class);
        LJ();
        Activity topActivity = C7N.LJIIJJI().getTopActivity();
        if (topActivity == null) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(topActivity);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILLIIL(R.string.osg);
        c47071t1.LJFF(R.string.osh);
        c47071t1.LJIIL(R.string.k4g, C78886Uxe.LJLIL);
        LIZLLL(c47071t1.LIZ());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    public final void LJIILLIIL() {
        String str;
        long j;
        boolean z;
        String str2;
        long j2;
        long j3;
        int i;
        int i2;
        boolean z2;
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        ImageModel imageModel;
        try {
            C29697Bl7.LJIIJ(this.LIZJ);
            Hashtag hashtag = this.LJIIJ;
            boolean z3 = false;
            if (hashtag != null && C78977Uz7.LJJJLL(hashtag)) {
                InterfaceC30442Bx8.LLJLL.LIZ(Boolean.TRUE);
            }
            Hashtag hashtag2 = this.LJIIJ;
            if (hashtag2 != null && (imageModel = hashtag2.image) != null) {
                str = imageModel.mUri;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            RoomCreateInfo roomCreateInfo = this.LJII;
            if (roomCreateInfo != null && (liveEventInfo2 = roomCreateInfo.mLiveEventInfo) != null) {
                j = liveEventInfo2.id;
            } else {
                j = 0;
            }
            ((C32535Cpn) dataChannelGlobal.gv0(C29026BaI.class)).LIZ = Long.valueOf(j);
            RoomCreateInfo roomCreateInfo2 = this.LJII;
            if (roomCreateInfo2 != null) {
                z = roomCreateInfo2.isNewAnchor;
            } else {
                z = false;
            }
            ((C32535Cpn) dataChannelGlobal.gv0(C29030BaM.class)).LIZ = Boolean.valueOf(z);
            C29689Bkz c29689Bkz = C29689Bkz.LIZ;
            c29689Bkz.LJIIJJI(this.LIZJ);
            c29689Bkz.LJIIL(C29106Bba.LJLIL);
            C29162BcU c29162BcU = C29162BcU.LIZJ;
            C29164BcW c29164BcW = new C29164BcW(this, this.LIZJ);
            Hashtag hashtag3 = this.LJIIJ;
            if (hashtag3 != null) {
                str2 = hashtag3.title;
            } else {
                str2 = null;
            }
            c29164BcW.LIZJ = str2;
            c29164BcW.LIZLLL = str;
            c29164BcW.LJ = C0N7.LIZJ(this.LIZJ);
            c29164BcW.LJFF = 1;
            c29164BcW.LJI = this.LJIIJJI;
            c29164BcW.LJII = 1;
            c29164BcW.LJIIIZ = this.LJIIL;
            c29164BcW.LJIIJ = this.LJIILIIL;
            c29164BcW.LJIIJJI = false;
            c29164BcW.LJIIL = null;
            c29164BcW.LJIILIIL = this.LIZLLL;
            c29164BcW.LJIILJJIL = 0L;
            if (User.sSubPermission && C29232Bdc.LJIJI()) {
                j2 = 1;
            } else {
                j2 = 2;
            }
            c29164BcW.LJIIIIZZ = j2;
            RoomCreateInfo roomCreateInfo3 = this.LJII;
            if (roomCreateInfo3 != null && (liveEventInfo = roomCreateInfo3.mLiveEventInfo) != null) {
                j3 = liveEventInfo.id;
            } else {
                j3 = 0;
            }
            c29164BcW.LJIILLIIL = j3;
            c29164BcW.LJIILL = 0L;
            c29164BcW.LJIIZILJ = "";
            c29164BcW.LJIJ = 0L;
            if (C29232Bdc.LIZIZ()) {
                i = 1;
            } else {
                i = 0;
            }
            c29164BcW.LJJIIJ = i;
            if (C29232Bdc.LIZJ()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c29164BcW.LJJIIJZLJL = i2;
            if (c29164BcW.LJI == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C29105BbZ.LIZ(z2);
            InterfaceC30442Bx8.LLF.LIZ(Boolean.TRUE);
            c29164BcW.LJJIJIIJI = true;
            if (!o.LJ(InterfaceC30442Bx8.U2.LIZ(), Boolean.FALSE) && LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
                z3 = true;
            }
            c29164BcW.LJJIJIL = z3;
            StarCommentConfig starCommentConfig = new StarCommentConfig();
            starCommentConfig.starCommentSwitch = true;
            starCommentConfig.grantGroup = 1;
            starCommentConfig.starCommentQualification = this.LJIILJJIL;
            c29164BcW.LJJIJL = starCommentConfig;
            c29162BcU.LIZ(c29164BcW);
        } catch (Throwable unused) {
            LJII();
        }
    }

    public final void LJFF() {
        LJ();
        C7N.LJFF().Yd0().LIZ();
        if (C7N.LJIIJJI().getTopActivity() instanceof InterfaceC29111Bbf) {
            C7N.LJIIJJI().getTopActivity().finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ() {
        Boolean bool = (Boolean) C74838TYs.LJ().LIZIZ;
        o.LJIIIIZZ(bool, "isMultiGuestOn()");
        if (bool.booleanValue()) {
            C30868C9o.LIZJ(R.string.k_2);
            DataChannelGlobal.LJLJJI.sv0(OneTapGoLiveEvent.class, new C31978Cgo(this.LJ, Integer.valueOf(this.LJFF)));
            LJFF();
            return;
        }
        boolean z = true;
        if (((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecret() != 1) {
            z = false;
        }
        if (z) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.otm));
            LJFF();
            return;
        }
        if (!C74838TYs.LJ().LJJIFFI) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.otm));
            LJFF();
        } else if (C74838TYs.LJ().LJJIFFI) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
                LIZJ(room, new C29101BbV(this), new C29102BbW(this));
            } else {
                LJ();
            }
        }
    }

    public final void LJIIZILJ() {
        try {
            Activity topActivity = C7N.LJIIJJI().getTopActivity();
            if (topActivity == null) {
                LJII();
            } else {
                C61099NyR.LIZIZ.LIZIZ(topActivity, C78857UxB.LJJIIJ(1476788233, "bpea-audio_video_permission_onetapgolive")).LIZ("android.permission.RECORD_AUDIO", "android.permission.CAMERA").LIZJ(new IDeS402S0100000_5(this, 1));
            }
        } catch (Throwable unused) {
            LJII();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC29100BbU(Context context) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZJ = LiveMode.VIDEO;
        this.LIZLLL = true;
        this.LJFF = 1;
        this.LJI = 1;
        this.LJIIJJI = 1;
        this.LJIILLIIL = new C29354Bfa();
        this.LJIIZILJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 281));
        this.LJIJ = C221108m2.LIZIZ(C29107Bbb.LJLIL);
    }

    public final void LJIIJJI(Room room) {
        try {
            C30355Bvj.LJII().LIZ(room.getId());
            C29697Bl7.LJ(this.LIZJ, null, false, Long.valueOf(room.getId()));
            C29689Bkz c29689Bkz = C29689Bkz.LIZ;
            c29689Bkz.LJIIJJI(this.LIZJ);
            c29689Bkz.LJIIL(C29104BbY.LJLIL);
            LJIILL(room);
        } catch (Throwable unused) {
            LJII();
            C29162BcU.LIZIZ(0, this);
        }
    }

    public final boolean LJIILJJIL(RoomCreateInfo roomCreateInfo) {
        boolean z;
        boolean z2;
        if (roomCreateInfo != null) {
            this.LJIILJJIL = roomCreateInfo.anchorStarCommentPermission;
            String str = roomCreateInfo.mLiveEventInfo.title;
            o.LJIIIIZZ(str, "it.mLiveEventInfo.title");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && roomCreateInfo.mLiveEventInfo.id > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJIIIZ = z2;
            Hashtag hashtag = roomCreateInfo.hashtag;
            if (hashtag == null) {
                hashtag = new Hashtag(0L, "", null, 0, 12, null);
            }
            this.LJIIJ = hashtag;
            C28514BHa.LIZJ(hashtag);
            BlockStatus blockStatus = roomCreateInfo.blockStatus;
            if (blockStatus != null && blockStatus.isBlock) {
                LJII();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Long, O] */
    public final void LJIILL(Room room) {
        long j;
        String str;
        try {
            int i = 2;
            if (this.LJIILL == 2) {
                C73943T0h.LIZ().LIZIZ(new C28268B7o(6, 1));
            }
            InterfaceC08070Tj<FilterModel> liveFilterManager = C7N.LJII().getLiveFilterManager();
            if (liveFilterManager != null) {
                liveFilterManager.release();
            }
            C88207Yjb.LJFF();
            int i2 = BM3.LIZ[this.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                }
            } else {
                i = 1;
            }
            LJ();
            Activity topActivity = C7N.LJIIJJI().getTopActivity();
            if (topActivity == null) {
                LJII();
                return;
            }
            topActivity.finish();
            topActivity.overridePendingTransition(0, 0);
            Intent createStartBroadcastIntent = ((IHostAction) CN1.LIZ(IHostAction.class)).createStartBroadcastIntent((ActivityC45651qj) topActivity, i);
            if (C28509BGv.LJFF(this.LIZJ) || C28509BGv.LJ(this.LIZJ)) {
                InterfaceC30442Bx8.LJJIJ.LIZ(Boolean.FALSE);
            }
            if (this.LJIIIZ) {
                j = SystemClock.elapsedRealtime();
            } else {
                j = -1;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32535Cpn) dataChannelGlobal.gv0(C29042BaY.class)).LIZ = Long.valueOf(j);
            RoomCreateInfo roomCreateInfo = this.LJII;
            if (roomCreateInfo != null) {
                str = roomCreateInfo.mAdditionalPrompt;
            } else {
                str = null;
            }
            createStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
            createStartBroadcastIntent.putExtra("anchor_layout_type", this.LJ);
            createStartBroadcastIntent.putExtra("multi_guest_enable", this.LJFF);
            createStartBroadcastIntent.putExtra("is_one_tap_go_live", true);
            ((C32535Cpn) dataChannelGlobal.gv0(C29044Baa.class)).LIZ = room;
            ((C32535Cpn) dataChannelGlobal.gv0(C29108Bbc.class)).LIZ = room;
            createStartBroadcastIntent.addFlags(268435456);
            Context context = C7N.LJIIL().context();
            if (context != null) {
                C16880lQ.LIZJ(context, createStartBroadcastIntent);
            }
            Object value = C7N.LIZLLL.getValue();
            o.LJIIIIZZ(value, "<get-hostConfig>(...)");
            ((IHostConfig) value).qS().getClass();
            InterfaceC29151BcJ.LIZ.LIZ(Boolean.TRUE);
        } catch (Throwable unused) {
            C29162BcU.LIZIZ(0, this);
            LJII();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Room room;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            LJII();
            return;
        }
        int i = msg.what;
        if (i != 1) {
            if (i == 32) {
                return;
            }
            LJII();
            return;
        }
        try {
            LiveMode liveMode = null;
            if (obj instanceof Room) {
                room = (Room) obj;
            } else {
                room = null;
            }
            if (Room.isValid(room)) {
                LiveMode liveMode2 = this.LIZJ;
                if (room != null) {
                    liveMode = room.getStreamType();
                }
                if (liveMode2 == liveMode) {
                    if (this.LJI == 1) {
                        LIZJ(room, new BXA(this), new C29019BaB(this));
                        return;
                    } else {
                        LJIIJJI(room);
                        return;
                    }
                }
            }
            LJII();
        } catch (Throwable unused) {
            LJII();
            C29162BcU.LIZIZ(0, this);
        }
    }

    public static boolean LJIIJ(C29180Bcm c29180Bcm, BUT but) {
        Boolean bool;
        Boolean bool2 = null;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLIL);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            if (but != null) {
                bool2 = Boolean.valueOf(but.LJLIL);
            }
            if (!C29306Beo.LJJIFFI(bool2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIL(C29180Bcm c29180Bcm, BUT but) {
        Boolean bool;
        Boolean bool2 = null;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            if (but != null) {
                bool2 = Boolean.valueOf(but.LJLIL);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse] */
    public final void LJI(C29180Bcm c29180Bcm, BUT but) {
        AbstractC73672Svk<C28467BFf<LivePermissionApplyResponse>> LJJIJIL;
        AbstractC73672Svk<C28467BFf<RoomCreateInfo>> previewRoomCreateInfo = C28718BOw.LIZ().LIZ().getPreviewRoomCreateInfo(0L);
        o.LJIIIIZZ(previewRoomCreateInfo, "LiveBroadcastClient.inst…RoomCreateInfo(hashtagId)");
        if (LJIIL(c29180Bcm, but)) {
            StringBuffer stringBuffer = new StringBuffer("");
            if (but != null) {
                LIZ(but.LJLIL, stringBuffer, "live");
                LIZ(but.LJLILLLLZI, stringBuffer, "live_by_record");
                LIZ(but.LJLJI, stringBuffer, "computer");
            }
            LJJIJIL = C28718BOw.LIZ().LIZ().getLivePermissionApply(stringBuffer.toString());
            o.LJIIIIZZ(LJJIJIL, "{\n            val applyP…pe.toString())\n\n        }");
        } else {
            C28467BFf c28467BFf = new C28467BFf();
            c28467BFf.data = new LivePermissionApplyResponse();
            LJJIJIL = AbstractC73672Svk.LJJIJIL(c28467BFf);
        }
        AbstractC73672Svk<C28467BFf<BroadcastSettingResponse>> fetchUserPermission = ((BroadcastSettingApi) Q7L.LIZIZ(BroadcastSettingApi.class)).fetchUserPermission();
        o.LJIIIIZZ(fetchUserPermission, "get().getService(Broadca…   .fetchUserPermission()");
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(AbstractC73672Svk.LJJLJLI(previewRoomCreateInfo, LJJIJIL, fetchUserPermission, C29103BbX.LJLIL)).LJJJLIIL(new AfS44S0300000_5(but, this, c29180Bcm, 4), new AfS57S0100000_5(this, 183));
        C73318Sq2 cb = (C73318Sq2) this.LJIJ.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.Cgo, O] */
    public final void LJIIIIZZ(android.net.Uri uri, int i) {
        int i2;
        int i3;
        try {
            if (this.LIZIZ == null) {
                Activity topActivity = C7N.LJIIJJI().getTopActivity();
                if (topActivity == null) {
                    return;
                }
                C31767CdP c31767CdP = new C31767CdP(topActivity);
                c31767CdP.LIZIZ = C15380j0.LJIILJJIL(R.string.sur);
                this.LIZIZ = c31767CdP.LIZ();
            }
            DialogC31813Ce9 dialogC31813Ce9 = this.LIZIZ;
            if (dialogC31813Ce9 != null) {
                C29306Beo.LJJJJIZL(dialogC31813Ce9);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uri.getScheme());
            LIZ.append("://");
            String LIZIZ = X1D.LIZIZ(LIZ);
            String host = uri.getHost();
            this.LJ = UriProtector.getQueryParameter(uri, "anchor_layout_type");
            String queryParameter = UriProtector.getQueryParameter(uri, "multi_guest_enable");
            if (queryParameter != null) {
                i2 = CastIntegerProtector.parseInt(queryParameter);
            } else {
                i2 = 1;
            }
            this.LJFF = i2;
            UriProtector.getQueryParameter(uri, "enter_from");
            UriProtector.getQueryParameter(uri, "enter_method");
            String queryParameter2 = UriProtector.getQueryParameter(uri, "check_linkmic_permission");
            if (queryParameter2 != null) {
                i3 = CastIntegerProtector.parseInt(queryParameter2);
            } else {
                i3 = 1;
            }
            this.LJI = i3;
            if (!TextUtils.isEmpty(LIZIZ) && !TextUtils.isEmpty(host) && TextUtils.equals(LIZIZ, "sslocal://") && TextUtils.equals(host, "one_tap_go_live")) {
                ((C32535Cpn) DataChannelGlobal.LJLJJI.gv0(C29129Bbx.class)).LIZ = new C31978Cgo(this.LJ, Integer.valueOf(this.LJFF));
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        LJIIZILJ();
                        return;
                    }
                    LJIIIZ();
                    return;
                }
                LJIIZILJ();
                return;
            }
            LJ();
            C30868C9o.LJI("schema is not available");
        } catch (Throwable unused) {
            LJII();
        }
    }

    public static void LIZ(boolean z, StringBuffer stringBuffer, String str) {
        if (!z) {
            return;
        }
        if (ujb.o.LJJJJJL(stringBuffer)) {
            stringBuffer.append(str);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(',');
        LIZ.append(str);
        stringBuffer.append(X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(Room room, InterfaceC88472Yns<? super Room, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        InterfaceC92693kP LJJII = T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAnchorSelfPermission(room.getId(), iHostAppContext.appId(), iHostAppContext.liveId())).LJJII(new AfS54S0200000_5(interfaceC88472Yns, room, 27), new AfS57S0100000_5(interfaceC88472Yns2, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 182));
        C73318Sq2 cb = (C73318Sq2) this.LJIJ.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJII);
    }

    public final boolean LJIILIIL(LivePermissionApplyResponse livePermissionApplyResponse, C29180Bcm c29180Bcm, BUT but) {
        Boolean bool;
        if (!LJIIL(c29180Bcm, but)) {
            return true;
        }
        if (livePermissionApplyResponse == null) {
            return false;
        }
        o.LJIIIIZZ(livePermissionApplyResponse.permissionInfo, "it.permissionInfo");
        Boolean bool2 = null;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            if (but != null) {
                bool2 = Boolean.valueOf(but.LJLIL);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                LJ();
                Activity topActivity = C7N.LJIIJJI().getTopActivity();
                if (topActivity != null) {
                    C47071t1 c47071t1 = new C47071t1(topActivity);
                    c47071t1.LJIILL = false;
                    c47071t1.LJIILJJIL = false;
                    c47071t1.LJIILLIIL(R.string.k1q);
                    c47071t1.LJFF(R.string.kae);
                    c47071t1.LJIIL(R.string.k1r, new IDcS93S0200000_5(this, topActivity, 4));
                    c47071t1.LJIIIZ(R.string.nhw, C78894Uxm.LJLJJL);
                    LIZLLL(c47071t1.LIZ());
                }
                return false;
            }
        }
        return true;
    }
}
