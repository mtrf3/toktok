package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.CommentFeatureChannel;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSPreInitSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceLiveCoreAsyncSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCaptionAnchorSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.rank.api.ECRankSwitchChannel;
import com.bytedance.android.livesdk.rank.api.GameRankSwitchChannel;
import com.bytedance.android.livesdk.rank.api.GiftRankSwitchChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.BcT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29161BcT implements InterfaceC28916BWm {
    public final LiveMode LIZ = LiveMode.LIVE_VOICE;
    public final String LIZIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
    public final InterfaceC28918BWo[] LIZJ = {new C28914BWk(), new C29353BfZ(), new C28562BIw(), new C29120Bbo(), new C29118Bbm(), new C29207BdD(), new C28525BHl(), new C30546Byo(), new C29183Bcp()};

    @Override // X.InterfaceC28916BWm
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC28916BWm
    public final void LJI(String str, String str2) {
    }

    @Override // X.InterfaceC28916BWm
    public final InterfaceC28918BWo[] LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZJ(Fragment fragment) {
        DataChannel LJIILIIL;
        Context context;
        String str;
        if (fragment == null || (LJIILIIL = C51029K0z.LJIILIIL(fragment)) == null || (context = fragment.getContext()) == null) {
            return;
        }
        Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(C29306Beo.LIZIZ(context), C29152BcK.LIZ(this.LIZ));
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null) {
            str = roomCreateInfo.mAdditionalPrompt;
        } else {
            str = null;
        }
        createStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
        createStartBroadcastIntent.putExtra("request_page", (String) LJIILIIL.kv0(C28990BZi.class));
        C16880lQ.LIZJ(context, createStartBroadcastIntent);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return false;
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZLLL(int i, DataChannel dataChannel) {
        C29697Bl7.LJFF(i, this.LIZ);
        ((C29165BcX) C7N.LJ().startLiveManager()).fg(i, dataChannel);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJ(C29180Bcm c29180Bcm, BUT but) {
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

    @Override // X.InterfaceC28916BWm
    public final C29164BcW LIZ(Context context, DataChannel dataChannel, HandlerC28345BAn handlerC28345BAn) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        int i8;
        Long l;
        LiveEventInfo liveEventInfo;
        String LIZJ;
        if (dataChannel == null) {
            return null;
        }
        C28514BHa.LIZJ((Hashtag) dataChannel.kv0(HashtagChangedChannel.class));
        C29164BcW c29164BcW = new C29164BcW(handlerC28345BAn, LiveMode.LIVE_VOICE);
        String str = (String) dataChannel.kv0(PreviewTitleChannel.class);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c29164BcW.LIZJ = str;
        ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn = (ViewOnClickListenerC28501BGn) dataChannel.kv0(LiveCoverControllerChannel.class);
        if (viewOnClickListenerC28501BGn != null && (LIZJ = viewOnClickListenerC28501BGn.LIZJ()) != null) {
            str2 = LIZJ;
        }
        c29164BcW.LIZLLL = str2;
        c29164BcW.LJ = C0N7.LIZJ(c29164BcW.LIZIZ);
        boolean z6 = true;
        c29164BcW.LJFF = 1;
        Integer num = (Integer) dataChannel.kv0(GiftFeatureChannel.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        c29164BcW.LJI = i;
        Object kv0 = dataChannel.kv0(CommentFeatureChannel.class);
        o.LJI(kv0);
        if (((Boolean) kv0).booleanValue()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c29164BcW.LJII = i2;
        Integer num2 = (Integer) dataChannel.kv0(GiftRankSwitchChannel.class);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 1;
        }
        c29164BcW.LJIIIZ = i3;
        Integer num3 = (Integer) dataChannel.kv0(ECRankSwitchChannel.class);
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            i4 = 0;
        }
        c29164BcW.LJIIJ = i4;
        Integer num4 = (Integer) dataChannel.kv0(GameRankSwitchChannel.class);
        if (num4 != null) {
            num4.intValue();
        }
        c29164BcW.LJIIJJI = C0NA.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class));
        c29164BcW.LJIIL = (RoomDecoration) dataChannel.kv0(SelectedDonationStickerChannel.class);
        Boolean bool = (Boolean) dataChannel.kv0(C29155BcN.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        c29164BcW.LJIILIIL = z;
        if (User.sSubPermission && C29232Bdc.LJIJI()) {
            j = 1;
        } else {
            j = 2;
        }
        c29164BcW.LJIIIIZZ = j;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        long j4 = 0;
        if (roomCreateInfo != null && (liveEventInfo = roomCreateInfo.mLiveEventInfo) != null) {
            j2 = liveEventInfo.id;
        } else {
            j2 = 0;
        }
        c29164BcW.LJIILLIIL = j2;
        Hashtag hashtag = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class);
        if (hashtag == null || (j3 = hashtag.id) == null) {
            j3 = 0L;
        }
        c29164BcW.LJIILL = j3;
        IGameTopicService iGameTopicService = (IGameTopicService) CN1.LIZ(IGameTopicService.class);
        LiveMode liveMode = c29164BcW.LIZIZ;
        o.LJIIIIZZ(liveMode, "liveMode");
        GameTag re = iGameTopicService.re(liveMode);
        if (re != null && (l = re.id) != null) {
            j4 = l.longValue();
        }
        c29164BcW.LJIJ = j4;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Boolean bool2 = (Boolean) dataChannelGlobal.mv0(C29029BaL.class);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        c29164BcW.LJIJI = z2;
        Boolean bool3 = (Boolean) dataChannel.kv0(C29139Bc7.class);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        c29164BcW.LJIJJ = z3;
        if (TTLSPreInitSettings.INSTANCE.enablePreLoad()) {
            c29164BcW.LJIL = C46104I7o.LJLIL;
        } else if (LiveBroadcastPoorDeviceLiveCoreAsyncSetting.INSTANCE.preloadAtPreview()) {
            c29164BcW.LJIL = OAC.LJLJJI;
        }
        c29164BcW.LJJ = C29184Bcq.LIZ(dataChannel);
        if (dataChannel.kv0(SelectedStreamResolutionChannel.class) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        c29164BcW.LJJI = C29306Beo.LJJIFFI(Boolean.valueOf(z4)) ? 1 : 0;
        Integer num5 = (Integer) dataChannel.kv0(C29169Bcb.class);
        if (num5 != null) {
            i5 = num5.intValue();
        } else {
            i5 = 0;
        }
        c29164BcW.LJJIIZI = i5;
        c29164BcW.LJJIJ = (String) dataChannel.kv0(C29172Bce.class);
        Integer num6 = (Integer) dataChannel.kv0(AgeRestrictedChannel.class);
        if (num6 != null) {
            i6 = num6.intValue();
        } else {
            i6 = 0;
        }
        c29164BcW.LJJIFFI = i6;
        C28527BHn c28527BHn = (C28527BHn) dataChannelGlobal.mv0(ECBcToggleChannel.class);
        if (c28527BHn != null) {
            i7 = c28527BHn.LIZIZ();
        } else {
            i7 = 3;
        }
        c29164BcW.LJJII = i7;
        c29164BcW.LJJIIJ = C29232Bdc.LIZIZ() ? 1 : 0;
        c29164BcW.LJJIIJZLJL = !C29232Bdc.LIZJ() ? 1 : 0;
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(c29164BcW, 354));
        } else {
            String inputTitle = c29164BcW.LIZJ;
            o.LJIIIIZZ(inputTitle, "inputTitle");
            String coverUri = c29164BcW.LIZLLL;
            o.LJIIIIZZ(coverUri, "coverUri");
            LiveMode liveMode2 = c29164BcW.LIZIZ;
            Integer LIZJ2 = InterfaceC30442Bx8.LJIIIZ.LIZJ();
            if (LIZJ2 == null || LIZJ2.intValue() != 1) {
                z5 = false;
            } else {
                z5 = true;
            }
            C0N7.LJIILLIIL(inputTitle, coverUri, liveMode2, z5);
        }
        if (LiveCaptionAnchorSetting.getValue().length != 0) {
            String[] value = LiveCaptionAnchorSetting.getValue();
            int length = value.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (o.LJ(value[i9], this.LIZIZ)) {
                    Boolean LIZJ3 = InterfaceC30442Bx8.k1.LIZJ();
                    o.LJIIIIZZ(LIZJ3, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
                    if (LIZJ3.booleanValue()) {
                        i8 = 1;
                    }
                } else {
                    i9++;
                }
            }
        }
        i8 = 0;
        c29164BcW.LJJIIZ = i8;
        c29164BcW.LJJIJIIJIL = C1XY.LJJIII(C29306Beo.LIZIZ(context));
        if (o.LJ(InterfaceC30442Bx8.U2.LIZ(), Boolean.FALSE) || !LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
            z6 = false;
        }
        c29164BcW.LJJIJIL = z6;
        StarCommentConfig starCommentConfig = (StarCommentConfig) dataChannel.kv0(C2E0.class);
        if (starCommentConfig == null) {
            starCommentConfig = new StarCommentConfig();
        }
        c29164BcW.LJJIJL = starCommentConfig;
        c29164BcW.LJJIJLIJ = C29232Bdc.LIZ() ? 1 : 0;
        return c29164BcW;
    }
}
