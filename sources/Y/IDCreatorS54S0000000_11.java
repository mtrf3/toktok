package Y;

import X.C61447O9r;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.ServiceParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.push.PushBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.d;
import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.websocket.internal.proto.Frame;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDCreatorS54S0000000_11 implements Parcelable.Creator {
    public final int $t;

    public static final Object[] newArray$10(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AuthResult[0];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            case 9:
                return createFromParcel$9(this, parcel);
            case 10:
                return createFromParcel$10(this, parcel);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return createFromParcel$11(this, parcel);
            case 12:
                return createFromParcel$12(this, parcel);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return createFromParcel$13(this, parcel);
            case 14:
                return createFromParcel$14(this, parcel);
            case 15:
                return createFromParcel$15(this, parcel);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return createFromParcel$16(this, parcel);
            case 17:
                return createFromParcel$17(this, parcel);
            case 18:
                return createFromParcel$18(this, parcel);
            case 19:
                return createFromParcel$19(this, parcel);
            case 20:
                return createFromParcel$20(this, parcel);
            case 21:
                return createFromParcel$21(this, parcel);
            case 22:
                return createFromParcel$22(this, parcel);
            case 23:
                return createFromParcel$23(this, parcel);
            case 24:
                return createFromParcel$24(this, parcel);
            case 25:
                return createFromParcel$25(this, parcel);
            case 26:
                return createFromParcel$26(this, parcel);
            case 27:
                return createFromParcel$27(this, parcel);
            case 28:
                return createFromParcel$28(this, parcel);
            case 29:
                return createFromParcel$29(this, parcel);
            case 30:
                return createFromParcel$30(this, parcel);
            case 31:
                return createFromParcel$31(this, parcel);
            case 32:
                return createFromParcel$32(this, parcel);
            case 33:
                return createFromParcel$33(this, parcel);
            case 34:
                return createFromParcel$34(this, parcel);
            case 35:
                return createFromParcel$35(this, parcel);
            case 36:
                return createFromParcel$36(this, parcel);
            case 37:
                return createFromParcel$37(this, parcel);
            case 38:
                return createFromParcel$38(this, parcel);
            case 39:
                return createFromParcel$39(this, parcel);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return createFromParcel$40(this, parcel);
            case 41:
                return createFromParcel$41(this, parcel);
            case 42:
                return createFromParcel$42(this, parcel);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return createFromParcel$43(this, parcel);
            case 44:
                return createFromParcel$44(this, parcel);
            case 45:
                return createFromParcel$45(this, parcel);
            case 46:
                return createFromParcel$46(this, parcel);
            case 47:
                return createFromParcel$47(this, parcel);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return createFromParcel$48(this, parcel);
            case C61447O9r.LJIIJ:
                return createFromParcel$49(this, parcel);
            case 50:
                return createFromParcel$50(this, parcel);
            case 51:
                return createFromParcel$51(this, parcel);
            case 52:
                return createFromParcel$52(this, parcel);
            case 53:
                return createFromParcel$53(this, parcel);
            case 54:
                return createFromParcel$54(this, parcel);
            case 55:
                return createFromParcel$55(this, parcel);
            case 56:
                return createFromParcel$56(this, parcel);
            case 57:
                return createFromParcel$57(this, parcel);
            case 58:
                return createFromParcel$58(this, parcel);
            case 59:
                return createFromParcel$59(this, parcel);
            case 60:
                return createFromParcel$60(this, parcel);
            case 61:
                return createFromParcel$61(this, parcel);
            case BaseNotice.CREATOR /* 62 */:
                return createFromParcel$62(this, parcel);
            case 63:
                return createFromParcel$63(this, parcel);
            case 64:
                return createFromParcel$64(this, parcel);
            case 65:
                return createFromParcel$65(this, parcel);
            case 66:
                return createFromParcel$66(this, parcel);
            case 67:
                return createFromParcel$67(this, parcel);
            case 68:
                return createFromParcel$68(this, parcel);
            case 69:
                return createFromParcel$69(this, parcel);
            case 70:
                return createFromParcel$70(this, parcel);
            case 71:
                return createFromParcel$71(this, parcel);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return createFromParcel$72(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            case 9:
                return newArray$9(this, i);
            case 10:
                return newArray$10(this, i);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return newArray$11(this, i);
            case 12:
                return newArray$12(this, i);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return newArray$13(this, i);
            case 14:
                return newArray$14(this, i);
            case 15:
                return newArray$15(this, i);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return newArray$16(this, i);
            case 17:
                return newArray$17(this, i);
            case 18:
                return newArray$18(this, i);
            case 19:
                return newArray$19(this, i);
            case 20:
                return newArray$20(this, i);
            case 21:
                return newArray$21(this, i);
            case 22:
                return newArray$22(this, i);
            case 23:
                return newArray$23(this, i);
            case 24:
                return newArray$24(this, i);
            case 25:
                return newArray$25(this, i);
            case 26:
                return newArray$26(this, i);
            case 27:
                return newArray$27(this, i);
            case 28:
                return newArray$28(this, i);
            case 29:
                return newArray$29(this, i);
            case 30:
                return newArray$30(this, i);
            case 31:
                return newArray$31(this, i);
            case 32:
                return newArray$32(this, i);
            case 33:
                return newArray$33(this, i);
            case 34:
                return newArray$34(this, i);
            case 35:
                return newArray$35(this, i);
            case 36:
                return newArray$36(this, i);
            case 37:
                return newArray$37(this, i);
            case 38:
                return newArray$38(this, i);
            case 39:
                return newArray$39(this, i);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return newArray$40(this, i);
            case 41:
                return newArray$41(this, i);
            case 42:
                return newArray$42(this, i);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return newArray$43(this, i);
            case 44:
                return newArray$44(this, i);
            case 45:
                return newArray$45(this, i);
            case 46:
                return newArray$46(this, i);
            case 47:
                return newArray$47(this, i);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return newArray$48(this, i);
            case C61447O9r.LJIIJ:
                return newArray$49(this, i);
            case 50:
                return newArray$50(this, i);
            case 51:
                return newArray$51(this, i);
            case 52:
                return newArray$52(this, i);
            case 53:
                return newArray$53(this, i);
            case 54:
                return newArray$54(this, i);
            case 55:
                return newArray$55(this, i);
            case 56:
                return newArray$56(this, i);
            case 57:
                return newArray$57(this, i);
            case 58:
                return newArray$58(this, i);
            case 59:
                return newArray$59(this, i);
            case 60:
                return newArray$60(this, i);
            case 61:
                return newArray$61(this, i);
            case BaseNotice.CREATOR /* 62 */:
                return newArray$62(this, i);
            case 63:
                return newArray$63(this, i);
            case 64:
                return newArray$64(this, i);
            case 65:
                return newArray$65(this, i);
            case 66:
                return newArray$66(this, i);
            case 67:
                return newArray$67(this, i);
            case 68:
                return newArray$68(this, i);
            case 69:
                return newArray$69(this, i);
            case 70:
                return newArray$70(this, i);
            case 71:
                return newArray$71(this, i);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return newArray$72(this, i);
            default:
                return new Object[0];
        }
    }

    public IDCreatorS54S0000000_11(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        LiveWsMessage.MsgHeader msgHeader = new LiveWsMessage.MsgHeader();
        msgHeader.key = parcel.readString();
        msgHeader.value = parcel.readString();
        return msgHeader;
    }

    public static final Object createFromParcel$1(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LiveWsMessage(parcel);
    }

    public static final Object createFromParcel$10(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new AuthResult(parcel);
    }

    public static final Object createFromParcel$11(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new PushBody(parcel);
    }

    public static final Object createFromParcel$12(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new AccessToken(source);
    }

    public static final Object createFromParcel$13(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new AuthenticationToken(source);
    }

    public static final Object createFromParcel$14(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new AuthenticationTokenClaims(source);
    }

    public static final Object createFromParcel$15(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new AuthenticationTokenHeader(source);
    }

    public static final Object createFromParcel$16(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public static final Object createFromParcel$17(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new GraphRequest.ParcelableResourceWithMimeType(source);
    }

    public static final Object createFromParcel$18(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new Profile(source);
    }

    public static final Object createFromParcel$19(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new CustomTabLoginMethodHandler(source);
    }

    public static final Object createFromParcel$2(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new IntegerParcelable(parcel);
    }

    public static final Object createFromParcel$20(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DeviceAuthDialog.RequestState(parcel);
    }

    public static final Object createFromParcel$21(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new DeviceAuthMethodHandler(source);
    }

    public static final Object createFromParcel$22(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new GetTokenLoginMethodHandler(source);
    }

    public static final Object createFromParcel$23(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new InstagramAppLoginMethodHandler(source);
    }

    public static final Object createFromParcel$24(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new KatanaProxyLoginMethodHandler(source);
    }

    public static final Object createFromParcel$25(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new LoginClient.Request(source);
    }

    public static final Object createFromParcel$26(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new LoginClient.Result(source);
    }

    public static final Object createFromParcel$27(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new LoginClient(source);
    }

    public static final Object createFromParcel$28(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new WebViewLoginMethodHandler(source);
    }

    public static final Object createFromParcel$29(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShareFeedContent(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new NewMsgTimeHolder(parcel);
    }

    public static final Object createFromParcel$30(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AppGroupCreationContent(parcel);
    }

    public static final Object createFromParcel$31(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CameraEffectArguments(parcel);
    }

    public static final Object createFromParcel$32(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CameraEffectTextures(parcel);
    }

    public static final Object createFromParcel$33(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new GameRequestContent(parcel);
    }

    public static final Object createFromParcel$34(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new ShareCameraEffectContent(parcel);
    }

    public static final Object createFromParcel$35(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new ShareHashtag(source);
    }

    public static final Object createFromParcel$36(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new ShareLinkContent(source);
    }

    public static final Object createFromParcel$37(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new ShareMediaContent(source);
    }

    public static final Object createFromParcel$38(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShareMessengerURLActionButton(parcel);
    }

    public static final Object createFromParcel$39(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new ShareOpenGraphAction(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        boolean z;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ServiceConnectEvent(readInt, readInt2, parcel.readString(), z);
    }

    public static final Object createFromParcel$40(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new ShareOpenGraphContent(parcel);
    }

    public static final Object createFromParcel$41(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShareOpenGraphObject(parcel);
    }

    public static final Object createFromParcel$42(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new SharePhoto(source);
    }

    public static final Object createFromParcel$43(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SharePhotoContent(parcel);
    }

    public static final Object createFromParcel$44(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShareStoryContent(parcel);
    }

    public static final Object createFromParcel$45(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel source) {
        o.LJIIIZ(source, "source");
        return new ShareVideo(source);
    }

    public static final Object createFromParcel$46(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShareVideoContent(parcel);
    }

    public static final Object createFromParcel$47(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineAccessToken(parcel);
    }

    public static final Object createFromParcel$48(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineApiError(parcel);
    }

    public static final Object createFromParcel$49(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineCredential(parcel);
    }

    public static final Object createFromParcel$5(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new ServiceParcelable(parcel.readInt(), parcel.readInt());
    }

    public static final Object createFromParcel$50(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineProfile(parcel);
    }

    public static final Object createFromParcel$51(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineAuthenticationConfig(parcel);
    }

    public static final Object createFromParcel$52(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new LineLoginResult(parcel);
    }

    public static final /* synthetic */ Object createFromParcel$53(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new d(parcel);
    }

    public static final Object createFromParcel$54(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return VEPlatformUtils.VEPlatform.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$55(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new BaseException(parcel);
    }

    public static final Object createFromParcel$56(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new VEFrame.FrameBase(parcel);
    }

    public static final Object createFromParcel$57(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new VEFrame(parcel);
    }

    public static final Object createFromParcel$58(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new TEFrameRateRange(parcel);
    }

    public static final Object createFromParcel$59(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new TEFrameSizei(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new SocketState(parcel);
    }

    public static final Object createFromParcel$60(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new FeedShareElementInfo(parcel);
    }

    public static final Object createFromParcel$61(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new PreloadExtraInfo(parcel);
    }

    public static final Object createFromParcel$62(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return VEAudioEncodeSettings.ENCODE_STANDARD.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$63(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new VEAudioEncodeSettings(parcel);
    }

    public static final Object createFromParcel$64(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return VECameraSettings.CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$65(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new VESize(parcel);
    }

    public static final Object createFromParcel$66(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$67(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_STANDARD.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$68(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        try {
            return Frame.ADAPTER.decode(parcel.createByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Object createFromParcel$69(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new TwitterAuthConfig(parcel);
    }

    public static final Object createFromParcel$7(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new SsWsApp(parcel);
    }

    public static final Object createFromParcel$70(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new TwitterAuthToken(parcel);
    }

    public static final Object createFromParcel$71(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new OAuth2Token(parcel);
    }

    public static final Object createFromParcel$72(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new OAuthResponse(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
        msgHeader.key = parcel.readString();
        msgHeader.value = parcel.readString();
        return msgHeader;
    }

    public static final Object createFromParcel$9(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, Parcel parcel) {
        return new WsChannelMsg(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LiveWsMessage.MsgHeader[i];
    }

    public static final Object[] newArray$1(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LiveWsMessage[i];
    }

    public static final Object[] newArray$11(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new PushBody[i];
    }

    public static final Object[] newArray$12(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AccessToken[i];
    }

    public static final Object[] newArray$13(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AuthenticationToken[i];
    }

    public static final Object[] newArray$14(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AuthenticationTokenClaims[i];
    }

    public static final Object[] newArray$15(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AuthenticationTokenHeader[i];
    }

    public static final Object[] newArray$16(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new FacebookRequestError[i];
    }

    public static final Object[] newArray$17(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new GraphRequest.ParcelableResourceWithMimeType[i];
    }

    public static final Object[] newArray$18(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new Profile[i];
    }

    public static final Object[] newArray$19(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new CustomTabLoginMethodHandler[i];
    }

    public static final Object[] newArray$2(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new IntegerParcelable[i];
    }

    public static final Object[] newArray$20(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new DeviceAuthDialog.RequestState[i];
    }

    public static final Object[] newArray$21(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new DeviceAuthMethodHandler[i];
    }

    public static final Object[] newArray$22(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new GetTokenLoginMethodHandler[i];
    }

    public static final Object[] newArray$23(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new InstagramAppLoginMethodHandler[i];
    }

    public static final Object[] newArray$24(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new KatanaProxyLoginMethodHandler[i];
    }

    public static final Object[] newArray$25(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LoginClient.Request[i];
    }

    public static final Object[] newArray$26(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LoginClient.Result[i];
    }

    public static final Object[] newArray$27(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LoginClient[i];
    }

    public static final Object[] newArray$28(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new WebViewLoginMethodHandler[i];
    }

    public static final Object[] newArray$29(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareFeedContent[i];
    }

    public static final Object[] newArray$3(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new NewMsgTimeHolder[i];
    }

    public static final Object[] newArray$30(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new AppGroupCreationContent[i];
    }

    public static final Object[] newArray$31(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new CameraEffectArguments[i];
    }

    public static final Object[] newArray$32(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new CameraEffectTextures[i];
    }

    public static final Object[] newArray$33(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new GameRequestContent[i];
    }

    public static final Object[] newArray$34(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareCameraEffectContent[i];
    }

    public static final Object[] newArray$35(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareHashtag[i];
    }

    public static final Object[] newArray$36(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareLinkContent[i];
    }

    public static final Object[] newArray$37(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareMediaContent[i];
    }

    public static final Object[] newArray$38(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareMessengerURLActionButton[i];
    }

    public static final Object[] newArray$39(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareOpenGraphAction[i];
    }

    public static final Object[] newArray$4(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ServiceConnectEvent[i];
    }

    public static final Object[] newArray$40(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareOpenGraphContent[i];
    }

    public static final Object[] newArray$41(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareOpenGraphObject[i];
    }

    public static final Object[] newArray$42(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new SharePhoto[i];
    }

    public static final Object[] newArray$43(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new SharePhotoContent[i];
    }

    public static final Object[] newArray$44(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareStoryContent[i];
    }

    public static final Object[] newArray$45(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareVideo[i];
    }

    public static final Object[] newArray$46(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ShareVideoContent[i];
    }

    public static final Object[] newArray$47(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineAccessToken[i];
    }

    public static final Object[] newArray$48(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineApiError[i];
    }

    public static final Object[] newArray$49(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineCredential[i];
    }

    public static final Object[] newArray$5(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new ServiceParcelable[i];
    }

    public static final Object[] newArray$50(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineProfile[i];
    }

    public static final Object[] newArray$51(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineAuthenticationConfig[i];
    }

    public static final Object[] newArray$52(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new LineLoginResult[i];
    }

    public static final /* bridge */ /* synthetic */ Object[] newArray$53(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new d[i];
    }

    public static final Object[] newArray$54(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEPlatformUtils.VEPlatform[i];
    }

    public static final Object[] newArray$55(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new BaseException[i];
    }

    public static final Object[] newArray$56(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEFrame.FrameBase[i];
    }

    public static final Object[] newArray$57(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEFrame[i];
    }

    public static final Object[] newArray$58(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new TEFrameRateRange[i];
    }

    public static final Object[] newArray$59(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new TEFrameSizei[i];
    }

    public static final Object[] newArray$6(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new SocketState[i];
    }

    public static final Object[] newArray$60(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new FeedShareElementInfo[i];
    }

    public static final Object[] newArray$61(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new PreloadExtraInfo[i];
    }

    public static final Object[] newArray$62(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEAudioEncodeSettings.ENCODE_STANDARD[i];
    }

    public static final Object[] newArray$63(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEAudioEncodeSettings[i];
    }

    public static final Object[] newArray$64(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VECameraSettings.CAMERA_OUTPUT_MODE[i];
    }

    public static final Object[] newArray$65(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VESize[i];
    }

    public static final Object[] newArray$66(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEVideoEncodeSettings.ENCODE_BITRATE_MODE[i];
    }

    public static final Object[] newArray$67(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new VEVideoEncodeSettings.ENCODE_STANDARD[i];
    }

    public static final Object[] newArray$68(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new Frame[i];
    }

    public static final Object[] newArray$69(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new TwitterAuthConfig[i];
    }

    public static final Object[] newArray$7(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new SsWsApp[i];
    }

    public static final Object[] newArray$70(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new TwitterAuthToken[i];
    }

    public static final Object[] newArray$71(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new OAuth2Token[i];
    }

    public static final Object[] newArray$72(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new OAuthResponse[i];
    }

    public static final Object[] newArray$8(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new WsChannelMsg.MsgHeader[i];
    }

    public static final Object[] newArray$9(IDCreatorS54S0000000_11 iDCreatorS54S0000000_11, int i) {
        return new WsChannelMsg[i];
    }
}
