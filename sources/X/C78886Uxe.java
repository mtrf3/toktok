package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionBanAuto;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS147S0200000_16;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;
import yq4.a;

/* renamed from: X.Uxe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78886Uxe implements BTW, C0K7, InterfaceC73592SuS, InterfaceC201227v4, RTU, InterfaceC48038ItG {
    public static QGE LJLJI;
    public static Method LJLJJLL;
    public static boolean LJLJL;
    public static Method LJLJLJ;
    public static boolean LJLJLLL;
    public static C30036Bqa LJLL;
    public static final C78886Uxe LJLIL = new C78886Uxe();
    public static final C78886Uxe LJLILLLLZI = new C78886Uxe();
    public static final C78886Uxe LJLJJI = new C78886Uxe();
    public static final C78886Uxe LJLJJL = new C78886Uxe();

    public static void LJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4189784939739225363")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC201227v4
    public boolean LIZ(TextExtraStruct struct) {
        o.LJIIIZ(struct, "struct");
        return false;
    }

    public static C68966R4w LJIILJJIL() {
        C66960QPs.LIZ();
        return new C68966R4w(QWR.LIZ());
    }

    public static HBL LJFF() {
        if (C41013G7t.LIZ()) {
            return new C45439HsR();
        }
        return new C1JD();
    }

    public static final boolean LJJJJL() {
        if (C143245jk.LIZ() || C165146dy.LIZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!C165146dy.LIZ() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.canvasVideoData != null || C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return false;
        }
        return true;
    }

    public static final void LJIIIZ(C98593tv c98593tv) {
        String enterFromForMob;
        String enterFromForMob2;
        IMUser imUser;
        String uid;
        IMUser imUser2;
        String uid2;
        String LJIIIIZZ;
        String enterMethodForMob;
        IMConversation iMConversation;
        o.LJIIIZ(c98593tv, "<this>");
        IMContact imContact = c98593tv.getImContact();
        int i = 0;
        if (imContact != null) {
            if ((imContact instanceof IMConversation) && (iMConversation = (IMConversation) imContact) != null && iMConversation.getConversationType() == AbstractC63505Ow9.LIZIZ) {
                c98593tv.setSessionId(iMConversation.getConversationId());
                c98593tv.setChatType(3);
            } else {
                IMUser LIZ = C81573Ib.LIZ(imContact);
                if (LIZ != null) {
                    c98593tv.setSessionId(C81273Gx.LIZJ(LIZ.getUid()));
                    c98593tv.setImUser(LIZ);
                }
            }
        }
        int i2 = 2;
        if (c98593tv.getEnterFrom() == 6 && ((enterMethodForMob = c98593tv.getEnterMethodForMob()) == null || enterMethodForMob.length() == 0)) {
            c98593tv.setEnterMethodForMob("share_toast");
        } else if (c98593tv.getEnterFrom() == 2 && ((enterFromForMob2 = c98593tv.getEnterFromForMob()) == null || enterFromForMob2.length() == 0)) {
            c98593tv.setEnterMethodForMob("stranger_message_box");
        } else if (c98593tv.getEnterFrom() == 16 && ((enterFromForMob = c98593tv.getEnterFromForMob()) == null || enterFromForMob.length() == 0)) {
            c98593tv.setEnterMethodForMob("link_auto_message");
        }
        if (c98593tv.getChatType() == -1) {
            IMUser imUser3 = c98593tv.getImUser();
            if (c98593tv.getEnterFrom() == 2) {
                i2 = 1;
            } else if (imUser3 == null || imUser3.getCommerceUserLevel() <= 0) {
                i2 = 0;
            }
            c98593tv.setChatType(i2);
        }
        if (c98593tv.getChatType() != 3) {
            if (c98593tv.getImUser() == null) {
                IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(C81273Gx.LIZLLL(c98593tv.getSessionId())), C79004UzY.LJIILIIL(c98593tv.getSessionId()));
                if (LJIIJ == null) {
                    C34B.LIZJ("BaseChatRoomFragment", "ChatRoomActivity.start user = null");
                    return;
                }
                try {
                    String uid3 = LJIIJ.getUid();
                    o.LJIIIIZZ(uid3, "user.uid");
                    CastLongProtector.parseLong(uid3);
                    c98593tv.setImUser(LJIIJ);
                } catch (Exception unused) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ChatRoomActivity.start uid is invalid: ");
                    LIZ2.append(LJIIJ.getUid());
                    C34B.LIZJ("BaseChatRoomFragment", X1D.LIZIZ(LIZ2));
                    return;
                }
            }
            String shareUserId = c98593tv.getShareUserId();
            if ((shareUserId == null || shareUserId.length() == 0) && (imUser = c98593tv.getImUser()) != null && (uid = imUser.getUid()) != null) {
                c98593tv.setShareUserId(uid);
            }
            String sessionId = c98593tv.getSessionId();
            if ((sessionId != null && sessionId.length() != 0) || (imUser2 = c98593tv.getImUser()) == null || (uid2 = imUser2.getUid()) == null || uid2.length() == 0) {
                return;
            }
            if (c98593tv.getInboxType() == null) {
                LJIIIIZZ = C81273Gx.LIZJ(uid2);
            } else {
                Integer inboxType = c98593tv.getInboxType();
                if (inboxType != null) {
                    i = inboxType.intValue();
                }
                LJIIIIZZ = C96413qP.LIZ.LJIIIIZZ(i, uid2);
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = "";
                }
            }
            c98593tv.setSessionId(LJIIIIZZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0066, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00a7, code lost:
    
        if (r5 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List LJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78886Uxe.LJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel):java.util.List");
    }

    public static final String LJIILIIL(Aweme aweme) {
        if (aweme != null) {
            String imItemId = aweme.getImItemId();
            if (imItemId == null || imItemId.length() == 0) {
                String aid = aweme.getAid();
                if (aid == null || aid.length() == 0) {
                    return aweme.getFakeAid();
                }
                return aweme.getAid();
            }
            return aweme.getImItemId();
        }
        return null;
    }

    public static final float LJIIZILJ(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final List LJIJ(Class cls) {
        o.LJIIIZ(cls, "<this>");
        ArrayList arrayList = new ArrayList();
        while (cls != null && !LJJJI(cls)) {
            Field[] declaredFields = cls.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "curClass.declaredFields");
            ORS.LJJLIIIJJIZ(arrayList, declaredFields);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!Modifier.isStatic(((Field) next).getModifiers())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final String LJIJI(User user) {
        String recType;
        if (user == null) {
            return "";
        }
        if (!user.isMatchedFriendAvailable()) {
            return "no_sample";
        }
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (recType = matchedFriendStruct.getRecType()) == null) {
            return "";
        }
        return recType;
    }

    public static final Rect LJIJJ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        C76696U8e LJJIII;
        Rect playerRange;
        InterfaceC75579TlP LJJJIL = LJJJIL(C8E.LJ());
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null && (playerRange = LJJIII.getPlayerRange()) != null) {
            int height = (playerRange.height() * 3) / 2;
            int width = playerRange.width();
            int i = playerRange.left;
            int i2 = playerRange.top;
            return new Rect(i, i2, width + i, height + i2);
        }
        return null;
    }

    public static final int LJIJJLI(User user) {
        if (user == null) {
            return 0;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        if (user.getFollowStatus() != 4) {
            return 0;
        }
        return 4;
    }

    public static String LJJ(Throwable th) {
        String stackTraceString = android.util.Log.getStackTraceString(th);
        if (stackTraceString.length() > 900) {
            return stackTraceString.substring(0, 900);
        }
        return stackTraceString;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5Zw] */
    public static final C137165Zw LJJI(final TextStickerData textStickerData) {
        o.LJIIIZ(textStickerData, "<this>");
        return new InterfaceC138565cC<TTSAudioParam, TextStickerData>() { // from class: X.5Zw
            public final C62822Ol8 LIZ = C221108m2.LIZIZ(C137185Zy.LJLIL);

            @Override // X.InterfaceC138565cC
            public final TTSAudioParam getProxy() {
                TextStickerData textStickerData2 = TextStickerData.this;
                TTSAudioParam dataProxy = (TTSAudioParam) this.LIZ.getValue();
                o.LJIIIZ(textStickerData2, "<this>");
                o.LJIIIZ(dataProxy, "dataProxy");
                dataProxy.startTime = textStickerData2.getStartTime();
                dataProxy.endTime = textStickerData2.getEndTime();
                dataProxy.audioTrackDuration = textStickerData2.getAudioTrackDuration();
                dataProxy.audioTrackIndex = textStickerData2.getAudioTrackIndex();
                dataProxy.audioTrackFilePath = textStickerData2.getAudioTrackFilePath();
                String nleUuid = textStickerData2.getNleUuid();
                o.LJIIIZ(nleUuid, "<set-?>");
                dataProxy.nleUuid = nleUuid;
                dataProxy.hasReadTextAudio = textStickerData2.getHasReadTextAudio();
                List<String> audioPathList = textStickerData2.getAudioPathList();
                o.LJIIIZ(audioPathList, "<set-?>");
                dataProxy.audioPathList = audioPathList;
                dataProxy.audioText = textStickerData2.getAudioText();
                return dataProxy;
            }

            @Override // X.InterfaceC138565cC
            public final /* bridge */ /* synthetic */ TextStickerData LIZ() {
                return TextStickerData.this;
            }

            @Override // X.InterfaceC138565cC
            public final void LIZIZ(TTSAudioParam dataProxy) {
                o.LJIIIZ(dataProxy, "dataProxy");
                TextStickerData textStickerData2 = TextStickerData.this;
                o.LJIIIZ(textStickerData2, "<this>");
                textStickerData2.setStartTime(dataProxy.startTime);
                textStickerData2.setEndTime(dataProxy.endTime);
                textStickerData2.setAudioTrackDuration(dataProxy.audioTrackDuration);
                textStickerData2.setAudioTrackIndex(dataProxy.audioTrackIndex);
                textStickerData2.setAudioTrackFilePath(dataProxy.audioTrackFilePath);
                textStickerData2.setNleUuid(dataProxy.nleUuid);
                textStickerData2.setHasReadTextAudio(dataProxy.hasReadTextAudio);
                textStickerData2.setAudioPathList(dataProxy.audioPathList);
                textStickerData2.setAudioText(dataProxy.audioText);
            }
        };
    }

    public static final void LJJIII(Throwable th) {
        if (!(th instanceof C168816jt)) {
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            C78983UzD.LJIIZILJ(th);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StringFieldAnnotationHandler, --->  ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            H78.LIZJ(X1D.LIZIZ(LIZ));
            return;
        }
        throw th;
    }

    public static final boolean LJJIIJ(Comment comment) {
        List<CommentImageStruct> imageList;
        if (comment == null || (imageList = comment.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZ(LiveCoreSDKData.Quality quality) {
        boolean z;
        String str = quality.sdkKey;
        if (str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(AudienceResolutionBanAuto.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isDefinitionValid , quality = ");
        LIZ.append(quality);
        LIZ.append(", mIsBanAuto= ");
        LIZ.append(z);
        C0NB.LJIIIZ("DefinitionList", X1D.LIZIZ(LIZ));
        if (z) {
            String str2 = quality.sdkKey;
            o.LJIIIIZZ(str2, "quality.sdkKey");
            if (C78939UyV.LJJIIZI(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJJIIZI(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJ(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJI(Effect isFaceFilterEffect) {
        o.LJIIIZ(isFaceFilterEffect, "$this$isFaceFilterEffect");
        return s.LJJJLZIJ(isFaceFilterEffect.getSdkExtra(), "is_facefilter", false);
    }

    public static final boolean LJJIJIIJIL(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            return activity.isInMultiWindowMode();
        }
        return false;
    }

    public static final boolean LJJIJIL(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            return activity.isInPictureInPictureMode();
        }
        return false;
    }

    public static final boolean LJJIJL(Effect isLalalandEffect) {
        o.LJIIIZ(isLalalandEffect, "$this$isLalalandEffect");
        return s.LJJJLZIJ(isLalalandEffect.getSdkExtra(), "is_lalaland", false);
    }

    public static final boolean LJJIJLIJ(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        if (activity.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJJIL(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null) {
                return false;
            }
            if (!LJJLI.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJJIZ(String dialogType) {
        o.LJIIIZ(dialogType, "dialogType");
        return o.LJ(dialogType, "solo");
    }

    public static final boolean LJJJ(Effect isStackableEffect) {
        o.LJIIIZ(isStackableEffect, "$this$isStackableEffect");
        List<String> tags = isStackableEffect.getTags();
        if (tags != null) {
            return tags.contains("canStack");
        }
        return false;
    }

    public static final boolean LJJJI(Class cls) {
        o.LJIIIZ(cls, "<this>");
        return o.LJ(cls.getClassLoader(), String.class.getClassLoader());
    }

    public static final InterfaceC75579TlP LJJJIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        try {
            InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
            if (R6 != null) {
                return R6.LJJZZI();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final String LJJJJIZL(Aweme aweme) {
        Music music;
        if (aweme == null || (music = aweme.getMusic()) == null) {
            return null;
        }
        if (music.isPgc()) {
            return "pgc";
        }
        if (music.getMatchedPGCSoundInfo() != null) {
            return "fold_ugc";
        }
        return "ugc";
    }

    public static final boolean LJJJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeTextLabelModel followerLabel;
        String labelName;
        User author;
        o.LJIIIZ(aweme, "<this>");
        AIGCInfo aIGCInfo = aweme.aigcInfo;
        if (aIGCInfo != null && aIGCInfo.getAIGCLabelType() == 1 && a.LJFF().LJJIJLIJ()) {
            return true;
        }
        AIGCInfo aIGCInfo2 = aweme.aigcInfo;
        if (aIGCInfo2 != null && aIGCInfo2.getAIGCLabelType() == 2 && C00F.LIZ(31744, 0, "studio_auto_aigc_label_show", true) == 1 && C63081OpJ.LJJIJIIJI(aweme).length() == 0 && (((awemeRawAd = aweme.getAwemeRawAd()) == null || (followerLabel = awemeRawAd.getFollowerLabel()) == null || !followerLabel.isEnableShow() || (labelName = followerLabel.getLabelName()) == null || labelName.length() == 0 || (author = aweme.getAuthor()) == null || author.getFollowerCount() < 5000) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getLabel() == null || NQA.LIZIZ.LIZIZ(aweme)))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJL(Comment comment) {
        List<CommentImageStruct> imageList;
        String str = null;
        if (comment != null) {
            str = comment.getText();
        }
        if ((str != null && str.length() != 0) || comment == null || (imageList = comment.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final String LJJJJLI(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        U8H LJJZZI;
        Layout x1;
        try {
            InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
            if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (x1 = LJJZZI.x1()) != null) {
                String layoutId = x1.getLayoutId();
                if (layoutId != null) {
                    return layoutId;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static final String LJJJJLL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        RtcUserInfo LLLLLJIL;
        try {
            InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
            if (R6 != null && (LLLLLJIL = R6.LLLLLJIL()) != null) {
                String linkMicId = LLLLLJIL.getLinkMicId();
                if (linkMicId != null) {
                    return linkMicId;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static final int LJJJJZ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        try {
            InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
            if (R6 != null) {
                return R6.LIZIZ();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static final int LJJJJZI(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        int i;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            i = LJJIIZI.size();
        } else {
            i = 0;
        }
        return i - 1;
    }

    public static final long LJJJLIIL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        String LLLLLLIL;
        Long LJJIZ;
        InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
        if (R6 != null && (LLLLLLIL = R6.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            return LJJIZ.longValue();
        }
        return 0L;
    }

    public static final String LJJJLL(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        String LLLLLLIL;
        InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
        if (R6 == null || (LLLLLLIL = R6.LLLLLLIL()) == null) {
            return "";
        }
        return LLLLLLIL;
    }

    public static final int LJJJLZIJ(IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2) {
        U8H LJJZZI;
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        int i = 0;
        try {
            InterfaceC75441TjB R6 = iMultiGuestV3InternalServiceV2.R6();
            if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (allLayoutWindows = LJJIII.getAllLayoutWindows()) != null) {
                i = allLayoutWindows.size();
            }
            return i - 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C33651Tt LJJJZ(X.InterfaceC24520xk r3) {
        /*
            r0 = -1031410916(0xffffffffc285eb1c, float:-66.9592)
            r3.LJJIIJ(r0)
            X.1o7 r0 = X.C04Q.LJI
            java.lang.Object r2 = r3.LJIILLIIL(r0)
            android.view.View r2 = (android.view.View) r2
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.LJJIIJ(r0)
            boolean r0 = r3.LJIJJ(r2)
            java.lang.Object r1 = r3.LJIILL()
            if (r0 != 0) goto L27
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L2f
        L27:
            X.1Tt r1 = new X.1Tt
            r1.<init>(r2)
            r3.LJJIII(r1)
        L2f:
            r3.LJJIJIIJIL()
            X.1Tt r1 = (X.C33651Tt) r1
            r3.LJJIJIIJIL()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78886Uxe.LJJJZ(X.0xk):X.1Tt");
    }

    public static final void LJJLIIIJILLIZJL(View view) {
        if (view == null) {
            return;
        }
        KL2.LJIILLIIL(8, view);
    }

    public static final void LJJLIIIJJI(View view) {
        if (view == null) {
            return;
        }
        KL2.LJIILLIIL(0, view);
    }

    public static final CommentImageModel LJJLIIIJJIZ(MediaModel mediaModel) {
        Integer num;
        o.LJIIIZ(mediaModel, "<this>");
        CommentImageModel commentImageModel = new CommentImageModel();
        String[] strArr = new String[1];
        String str = mediaModel.fileLocalUriPath;
        int i = 0;
        if (str != null && ujb.o.LJJJLIIL(str, "/", false)) {
            str = android.net.Uri.fromFile(new File(str)).toString();
        }
        strArr[0] = str;
        commentImageModel.setUrlList(C47261Igj.LJII(strArr));
        commentImageModel.setFormat(C44694HgQ.LJIILL(mediaModel.fileLocalUriPath, false));
        commentImageModel.setSize(mediaModel.fileSize);
        String str2 = mediaModel.fileLocalUriPath;
        o.LJIIIIZZ(str2, "media.fileLocalUriPath");
        ExifInterface LJIIIZ = C44694HgQ.LJIIIZ(str2);
        if (LJIIIZ != null) {
            num = Integer.valueOf(LJIIIZ.getAttributeInt("Orientation", 1));
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 6) {
                i = 90;
            } else if (num.intValue() == 3) {
                i = 180;
            } else if (num.intValue() == 8) {
                i = 270;
            }
        }
        if (i % 180 == 90) {
            commentImageModel.setWidth(mediaModel.height);
            commentImageModel.setHeight(mediaModel.width);
        } else {
            commentImageModel.setWidth(mediaModel.width);
            commentImageModel.setHeight(mediaModel.height);
        }
        return commentImageModel;
    }

    public static final OJP LJJLIIIJL(Iterable iterable) {
        ORM orm;
        OJQ build;
        OJP ojp;
        OJP ojp2;
        if (!(iterable instanceof OJP) || (ojp2 = (OJP) iterable) == null) {
            if (!(iterable instanceof OJQ) || (ojp = (OJP) iterable) == null) {
                if (!(iterable instanceof ORM) || (orm = (ORM) iterable) == null || (build = orm.build()) == null) {
                    C61887OQp c61887OQp = C61887OQp.LJLJI;
                    o.LJIIIZ(c61887OQp, "<this>");
                    return c61887OQp.LJII((Collection) iterable);
                }
                return build;
            }
            return ojp;
        }
        return ojp2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r16 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate LJJLIIJ(X.V46 r16) {
        /*
            r2 = r16
            X.V44 r3 = r2.dynamic_info
            if (r3 == 0) goto Lba
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r7 = new com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent
            java.lang.String r8 = r3.card_key
            java.lang.String r9 = r3.schema
            java.lang.String r10 = r3.card_template
            java.lang.String r11 = r3.raw_data
            java.lang.String r12 = r3.business_type
            java.lang.String r13 = r3.business_id
            java.lang.Integer r1 = r3.default_height
            java.lang.String r0 = "default_height"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r14 = r1.intValue()
            java.lang.Integer r1 = r3.default_width
            java.lang.String r0 = "default_width"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r15 = r1.intValue()
            X.V3G r6 = r3.ui_location_type
            if (r6 == 0) goto Lb7
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType[] r5 = com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType.values()
            int r4 = r5.length
            r3 = 0
        L34:
            if (r3 >= r4) goto Lb3
            r16 = r5[r3]
            int r1 = r16.getValue()
            int r0 = r6.getValue()
            if (r1 != r0) goto Lb0
        L42:
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L45:
            X.V4Q r4 = r2.fallback_info
            if (r4 == 0) goto Lae
            X.OzW r0 = r4.link_info
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r3 = X.C62814Ol0.LJJIIZI(r0)
        L51:
            X.RUF r0 = r4.text
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r1 = X.C17N.LJJL(r0)
            if (r1 != 0) goto L64
        L5b:
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r1 = X.C79109V2z.LIZ()
        L64:
            X.V3z r0 = r4.image
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = X.C79081V1x.LJJIZ(r0)
        L6c:
            com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent r8 = new com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent
            r8.<init>(r3, r0, r1)
        L71:
            X.V4L r0 = r2.preview_hint
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r9 = X.V2B.LJIIZILJ(r0)
        L79:
            X.RU2 r0 = r2.req_base
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r11 = X.C62819Ol5.LJJIIJZLJL(r0)
        L81:
            X.RUB r0 = r2.resp_base
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r10 = X.C69648RVc.LIZJ(r0)
        L89:
            com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate r6 = new com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L8f:
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r10 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r10.<init>(r0, r2)
            goto L89
        L99:
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r11 = new com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent
            r0 = 0
            r11.<init>(r0)
            goto L81
        La0:
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r9 = X.C79087V2d.LIZ()
            goto L79
        Laa:
            r0 = 0
            goto L6c
        Lac:
            r3 = 0
            goto L51
        Lae:
            r8 = 0
            goto L71
        Lb0:
            int r3 = r3 + 1
            goto L34
        Lb3:
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType r16 = com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType.MESSAGE_NORMAL
            if (r16 != 0) goto L42
        Lb7:
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType r16 = com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType.MESSAGE_NORMAL
            goto L42
        Lba:
            r7 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78886Uxe.LJJLIIJ(X.V46):com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate");
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        C56769MPt it = (C56769MPt) obj;
        o.LJIIIZ(it, "it");
        return it.LIZIZ;
    }

    @Override // X.BTW
    public boolean canHandle(android.net.Uri uri) {
        return TextUtils.equals("sign", uri.getHost());
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        return !o.LJ(it, NHK.LIZ);
    }

    public static final void LIZIZ(C188727au c188727au, MWH mwh) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (mwh != null) {
            str = mwh.LIZ;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            if (mwh != null) {
                str3 = mwh.LIZ;
            } else {
                str3 = null;
            }
            c188727au.LJI("sort_option_name", str3);
        }
        if (mwh != null) {
            str2 = mwh.LIZIZ;
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2)) {
            if (mwh != null) {
                str4 = mwh.LIZIZ;
            }
            c188727au.LJI("notification_tab_name", str4);
        }
    }

    public static final Object LIZLLL(ReentrantLock reentrantLock, InterfaceC65784Pro block) {
        Object LIZ;
        o.LJIIIZ(reentrantLock, "<this>");
        o.LJIIIZ(block, "block");
        reentrantLock.lock();
        try {
            LIZ = block.invoke();
            C3C5.m7constructorimpl(LIZ);
        } finally {
            try {
                return LIZ;
            } finally {
            }
        }
        return LIZ;
    }

    public static boolean LJIIIIZZ(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static final String LJIIJJI(Context context, Aweme aweme) {
        AIGCInfo aIGCInfo;
        String string;
        String string2;
        if (aweme == null || (aIGCInfo = aweme.aigcInfo) == null) {
            return "";
        }
        if (aIGCInfo.getAIGCLabelType() == 1) {
            if (context == null || (string2 = context.getString(R.string.s04)) == null) {
                return "";
            }
            return string2;
        }
        if (context == null || (string = context.getString(R.string.bd)) == null) {
            return "";
        }
        return string;
    }

    public static final int LJIIL(C13640gC fontWeight, int i) {
        boolean z;
        o.LJIIIZ(fontWeight, "fontWeight");
        if (fontWeight.compareTo(C13640gC.LJLJJI) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            if (z) {
                return 3;
            }
        } else {
            if (z) {
                return 1;
            }
            if (0 == 0) {
                return 0;
            }
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.reflect.Field LJIILL(java.lang.Class r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r3 = 0
            r2 = r4
        Lc:
            r1 = r3
        Ld:
            if (r1 != 0) goto L21
            if (r2 == 0) goto L21
            boolean r0 = LJJJI(r2)
            if (r0 != 0) goto L21
            java.lang.reflect.Field r1 = r2.getDeclaredField(r5)     // Catch: java.lang.Exception -> L1c
            goto Ld
        L1c:
            java.lang.Class r2 = r2.getSuperclass()
            goto Lc
        L21:
            if (r1 == 0) goto L24
            return r1
        L24:
            java.lang.NoSuchFieldException r2 = new java.lang.NoSuchFieldException
            java.lang.String r1 = "fieldName : "
            java.lang.String r0 = " ; for class : "
            java.lang.StringBuilder r1 = X.C25620zW.LIZIZ(r1, r5, r0)
            java.lang.String r0 = X.C16880lQ.LJLLILLLL(r4)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78886Uxe.LJIILL(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    public static final String LJIL(int i, List list) {
        Object obj;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((NoticeSortModel) obj).sortId == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NoticeSortModel noticeSortModel = (NoticeSortModel) obj;
        if (noticeSortModel == null) {
            return null;
        }
        return noticeSortModel.trackingName;
    }

    public static final void LJJIIJZLJL(ChatRoomInputBaseAssem chatRoomInputBaseAssem, InterfaceC88472Yns configuration) {
        o.LJIIIZ(chatRoomInputBaseAssem, "<this>");
        o.LJIIIZ(configuration, "configuration");
        C78888Uxg c78888Uxg = new C78888Uxg();
        configuration.invoke(c78888Uxg);
        AbstractSet set = c78888Uxg.LIZ;
        o.LJIIIZ(set, "set");
        C8VV.LIZJ(chatRoomInputBaseAssem, new AqS147S0200000_16(chatRoomInputBaseAssem, (ChatRoomInputBaseAssem) set, (java.util.Set<C78889Uxh<EnumC113744dG>>) 19));
    }

    public static final void LJJLIIIJ(int i, View view) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void LJJLIL(View view, InterfaceC88472Yns updateBlock) {
        o.LJIIIZ(updateBlock, "updateBlock");
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams params = view.getLayoutParams();
        o.LJIIIIZZ(params, "params");
        updateBlock.invoke(params);
        if (C16330kX.LIZJ(view)) {
            view.setLayoutParams(params);
        }
    }

    public static void LJJLL(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new OSZ(obj, obj2);
    }

    @Override // X.BTW
    public boolean handle(Context context, android.net.Uri uri) {
        new Intent().putExtra("url", UriProtector.getQueryParameter(uri, "url"));
        return true;
    }

    public static C66101Pwv LJI(byte[] bArr, int i, byte b) {
        C66101Pwv c66101Pwv = new C66101Pwv();
        c66101Pwv.LIZ = true;
        c66101Pwv.LJFF = false;
        c66101Pwv.LJ = b;
        c66101Pwv.LJI = i;
        c66101Pwv.LJIIIIZZ = bArr;
        return c66101Pwv;
    }

    public static final int LJJIFFI(int i, int i2, Context context) {
        o.LJIIIZ(context, "<this>");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            return LJI.intValue();
        }
        return C04330Ez.LIZIZ(context, i2);
    }

    public static final CharSequence LJJII(int i, int i2, Context context) {
        Object[] objArr = new Object[1];
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            i2 = LJI.intValue();
        }
        objArr[0] = Long.valueOf(i2 & 4294967295L);
        return Q8U.LIZIZ(objArr, 1, "#%08X", "format(format, *args)");
    }

    public static void LJJLI(String str, String str2, boolean z) {
        String str3;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        if (R41.LJI()) {
            str = "pop_up";
        }
        c35936E8m.LIZLLL("enter_method", str);
        if (R41.LJI()) {
            str3 = "existing";
        } else {
            str3 = "new";
        }
        c35936E8m.LIZLLL("user_type", str3);
        if (!z && str2 != null) {
            c35936E8m.LIZJ("error_desc", str2);
        }
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("create_password_next", c35936E8m.LIZ);
    }

    public static boolean LJJLJ(String str, String str2, String str3) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Security: try verifyPurchase , base64PublicKey is ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            b1.LIZLLL();
            return false;
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Security: try generatePublicKey , encodedPublicKey is ");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Security: try verify , publicKey is ");
            LIZ3.append(generatePublic);
            LIZ3.append(" signedData is ");
            LIZ3.append(str2);
            LIZ3.append(" signature is ");
            LIZ3.append(str3);
            X1D.LIZIZ(LIZ3);
            LJ3.getClass();
            try {
                byte[] decode = Base64.decode(str3, 0);
                try {
                    Signature signature = Signature.getInstance("SHA1withRSA");
                    signature.initVerify(generatePublic);
                    signature.update(str2.getBytes());
                    if (!signature.verify(decode)) {
                        C78273Unl.LJIIIZ().LJ().getClass();
                        return false;
                    }
                    return true;
                } catch (InvalidKeyException unused) {
                    b1.LIZLLL();
                    return false;
                } catch (NoSuchAlgorithmException unused2) {
                    b1.LIZLLL();
                    return false;
                } catch (SignatureException unused3) {
                    b1.LIZLLL();
                    return false;
                }
            } catch (IllegalArgumentException unused4) {
                b1.LIZLLL();
                return false;
            }
        } catch (Throwable th) {
            C78273Unl.LJIIIZ().LJ().getClass();
            throw new RuntimeException(th);
        }
    }

    @Override // X.BTW
    public boolean LIZJ(Context context, android.net.Uri uri, java.util.Map map) {
        handle(context, uri);
        return true;
    }

    public static void LJJL(String str, String str2, boolean z, boolean z2) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        c35936E8m.LIZ(z2 ? 1 : 0, "suggest_flag");
        c35936E8m.LIZLLL("enter_method", str2);
        if (R41.LJI()) {
            str = "pop_up";
        }
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("create_account_next", c35936E8m.LIZ);
    }

    public static void LJJLIIIIJ(boolean z, String str, R40 r40, String str2) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        if (R41.LJI()) {
            str = "pop_up";
        }
        c35936E8m.LIZLLL("enter_method", str);
        if (r40 != null) {
            c35936E8m.LIZJ("request_id", r40.LIZ);
            if (!z) {
                T t = r40.LJIIIZ;
                if (t == 0) {
                    c35936E8m.LIZJ("message", "obj null");
                } else if (((C69023R7b) t).LJFF == null) {
                    c35936E8m.LIZJ("message", "info null");
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            c35936E8m.LIZJ("error_desc", str2);
        }
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("create_password_next", c35936E8m.LIZ);
    }

    public static Object LJJLJLI(Bundle bundle, String str, Class cls, Object obj) {
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII == null) {
            return obj;
        }
        if (cls.isAssignableFrom(LLJJIII.getClass())) {
            return LLJJIII;
        }
        throw new IllegalStateException(C16880lQ.LLLZ("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, C16880lQ.LJLLILLLL(cls), C16880lQ.LJLLILLLL(LLJJIII.getClass())}));
    }

    public static void LJJJJI(long j, long j2, String str, String str2, boolean z, boolean z2) {
        double d;
        if (j == 0) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = j2 / j;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("downloadStrategy", Integer.valueOf(MusicService.LJJLIIIJJI().LJIJJLI()));
        c198517qh.LIZ.put("speed", Double.valueOf(d));
        c198517qh.LIZ.put("size", Long.valueOf(j2));
        c198517qh.LIZ.put("fileUri", "");
        c198517qh.LIZ.put("fileUrlList", str);
        String str3 = null;
        if (!TextUtils.isEmpty("")) {
            try {
                str3 = new java.net.URI("").getHost();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C36922EeM.LJ("music url illegal");
            }
        }
        c198517qh.LIZ.put("hostname", str3);
        c198517qh.LIZ.put("is_private", Boolean.valueOf(z));
        c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c198517qh.LIZ.put("trace", str2);
        c198517qh.LIZ.put("isHitCache", Boolean.valueOf(z2));
        C09900aA.LJIIJJI("aweme_music_download_error_rate", 0, c198517qh.LJ());
    }

    public static /* synthetic */ void LJJLIIIJLLLLLLLZ(User user, Context context, String str, String str2, EnumC57366MfK enumC57366MfK, String str3, int i) {
        String str4;
        String str5;
        EnumC57366MfK enumC57366MfK2 = enumC57366MfK;
        String str6 = str2;
        String str7 = str3;
        String str8 = "";
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            str6 = "";
        }
        if ((i & 32) != 0) {
            enumC57366MfK2 = null;
        }
        if ((i & 1024) != 0) {
            str7 = null;
        }
        if ((i & 2048) == 0) {
            str8 = null;
        }
        LJJLIIIJLJLI(user, context, str, str4, str5, str6, enumC57366MfK2, false, null, null, null, str7, str8);
    }

    public static void LJJJJ(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, int i2, boolean z, boolean z2) {
        boolean z3;
        try {
            z3 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z3 = false;
        }
        if (z3) {
            C198517qh c198517qh = new C198517qh();
            String str7 = null;
            if (!TextUtils.isEmpty(str5)) {
                try {
                    str7 = new java.net.URI(str5).getHost();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C36922EeM.LJ("music url illegal");
                }
            }
            c198517qh.LIZ.put("hostname", str7);
            c198517qh.LIZ.put("trace", str4);
            c198517qh.LIZ.put("music_id", str2);
            c198517qh.LIZ.put("fileUrlList", str3);
            c198517qh.LIZ.put("downloadStrategy", Integer.valueOf(MusicService.LJJLIIIJJI().LJIJJLI()));
            c198517qh.LIZ.put("fileMagic", str6);
            c198517qh.LIZ.put("code", String.valueOf(i2));
            c198517qh.LIZ.put("size", Long.valueOf(j));
            c198517qh.LIZ.put("is_private", Boolean.valueOf(z));
            c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
            c198517qh.LIZ.put("errorDesc", str);
            c198517qh.LIZ.put("isHitCache", Boolean.valueOf(z2));
            C09900aA.LJIIJJI("aweme_music_download_error_rate", i, c198517qh.LJ());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str5);
            jSONObject.put("is_network_available", z3);
            jSONObject.put("isUseTTPlayer", false);
            jSONObject.put("isHitCache", z2);
            FUA.LIZIZ("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJLIIIJLJLI(User user, Context context, String str, String str2, String previousPage, String enterMethod, EnumC57366MfK enumC57366MfK, boolean z, String str3, Integer num, String str4, String str5, String str6) {
        String str7 = str6;
        EnumC57366MfK enumC57366MfK2 = enumC57366MfK;
        o.LJIIIZ(user, "<this>");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(enterMethod, "enterMethod");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("enter_method", enterMethod);
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("extra_from_pre_page", previousPage);
        buildRoute.withParam("extra_previous_page_position", "card_head");
        buildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recommendReason = matchedFriendStruct.getRecommendReason();
            } else {
                recommendReason = null;
            }
        }
        buildRoute.withParam("previous_recommend_reason", recommendReason);
        if (enumC57366MfK2 == null) {
            enumC57366MfK2 = EnumC57366MfK.CARD;
        }
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                recType = matchedFriendStruct2.getRecType();
            } else {
                recType = null;
            }
        }
        C57364MfI.Companion.getClass();
        EnumC199997t5 LIZ = C200007t6.LIZ(user);
        String uid = user.getUid();
        String requestId = user.getRequestId();
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                friendTypeStr = matchedFriendStruct3.getRelationType();
            } else {
                friendTypeStr = null;
            }
        }
        String socialInfo = user.getSocialInfo();
        if (socialInfo == null) {
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null) {
                socialInfo = matchedFriendStruct4.getSocialInfo();
            } else {
                socialInfo = null;
            }
        }
        boolean z2 = false;
        buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(str, previousPage, enumC57366MfK2, recType, LIZ, uid, null, str4, requestId, str2, friendTypeStr, socialInfo, user.getMatchedFriendStruct(), str3, num, 0 == true ? 1 : 0, z2, enterMethod, str5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, 0 == true ? 1 : 0, z2, 16351232, 0 == true ? 1 : 0));
        buildRoute.withParam("is_show_follow_btn_on_bottom", z);
        if (str7 == null) {
            str7 = "";
        }
        buildRoute.withParam("source_page", str7);
        buildRoute.open();
    }
}
