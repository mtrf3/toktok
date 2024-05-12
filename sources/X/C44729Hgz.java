package X;

import Y.AfS55S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.SessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.livesdk.livesetting.other.LoginGuideConfigSetting;
import com.bytedance.android.livesdk.model.LoginGuideConfig;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.framework.base.TrackParams;
import com.ss.android.ugc.aweme.editSticker.text.bean.TempPublishAnchorModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS40S1300000_7;
import kotlin.jvm.internal.AqS45S1000000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Hgz */
/* loaded from: classes8.dex */
public final class C44729Hgz implements InterfaceC44732Hh2 {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LJIL() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null) {
            return null;
        }
        return value.getImageUrlFromFollow();
    }

    public static String LJJ() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value != null && !TextUtils.isEmpty(value.getFromFollow())) {
            return value.getFromFollow();
        }
        return C15380j0.LJIILJJIL(R.string.sou);
    }

    public static final String LJIIIZ(EditMedia editMedia) {
        o.LJIIIZ(editMedia, "<this>");
        if (!editMedia.isVideo() && o.LJ(UriProtector.parse(editMedia.getPath()).getScheme(), "content")) {
            String absolutePath = editMedia.getAbsolutePath();
            if (absolutePath == null) {
                return editMedia.getPath();
            }
            return absolutePath;
        }
        return editMedia.getPath();
    }

    public static final int[] LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        int[] LIZIZ;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int[] LJJJJZI = LJJJJZI(videoPublishEditModel);
        int i = 0;
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        if (LJIIIZ == null || (LIZIZ = C143205jg.LIZIZ(LJIIIZ)) == null || LIZIZ.length < 2 || LJJJJZI.length < 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("UploadOutputVideoSize Duet ; inputInvalid ; outputSize : ");
            LIZ2.append(g0.LJJJJI(LJJJJZI));
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            return LJJJJZI;
        }
        if (C78841Uwv.LJIIIZ(LJJJJZI[0] / LJJJJZI[1], LIZIZ[0] / LIZIZ[1], 0.05f)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UploadOutputVideoSize Duet ; floatsEqual ; outputSize : ");
            LIZ3.append(g0.LJJJJI(LJJJJZI));
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
            return LJJJJZI;
        }
        int min = Math.min(LIZIZ[0], LIZIZ[1]);
        int[] iArr = new int[2];
        float f = LIZIZ[0] * 2;
        float f2 = LIZIZ[1];
        if (f > f2) {
            iArr[1] = min;
            iArr[0] = (int) ((f / LIZIZ[1]) * min);
        } else {
            iArr[0] = min;
            iArr[1] = (int) ((f2 / f) * min);
        }
        do {
            int i2 = iArr[i];
            int i3 = i2 % 16;
            if (i3 < 8) {
                iArr[i] = i2 - i3;
            } else {
                iArr[i] = (i2 + 16) - i3;
            }
            i++;
        } while (i < 2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("UploadOutputVideoSize Duet ; final ; sourceSize : ");
        LIZ4.append(g0.LJJJJI(LJJJJZI));
        LIZ4.append(" recordSize : ");
        LIZ4.append(g0.LJJJJI(LIZIZ));
        LIZ4.append(" outputSize : ");
        LIZ4.append(g0.LJJJJI(iArr));
        LIZ4.append(' ');
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ4));
        return iArr;
    }

    public static final InterfaceC55235Lm3 LJIILL(Object obj) {
        Fragment LJIIIZ;
        if (!(obj instanceof LiveWidget)) {
            return null;
        }
        Widget widget = (Widget) obj;
        InterfaceC31781Cdd interfaceC31781Cdd = widget.widgetCallback;
        if ((interfaceC31781Cdd == null || (LJIIIZ = interfaceC31781Cdd.getFragment()) == null) && (LJIIIZ = C79234V7u.LJIIIZ(widget.getView())) == null) {
            return null;
        }
        return UC0.LJJIJLIJ(LJIIIZ);
    }

    public static final int LJIIZILJ(User user) {
        Integer num;
        Integer num2 = null;
        if (user != null) {
            num = Integer.valueOf(user.getFollowStatus());
            num2 = Integer.valueOf(user.getFollowerStatus());
        } else {
            num = null;
        }
        return LJIJ(num, num2);
    }

    public static final String LJIJI(VideoPublishEditModel videoPublishEditModel) {
        String path;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.getValidVideoCoverPath() != null) {
            String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
            o.LJI(validVideoCoverPath);
            return validVideoCoverPath;
        }
        SingleImageData singleImageData = (SingleImageData) ListProtector.get(videoPublishEditModel.getImageAlbumData().getImageList(), videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex());
        if (singleImageData.getSynthesisData() == null) {
            path = singleImageData.getSrcImageInfo().getPath();
        } else {
            ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
            o.LJI(synthesisData);
            path = synthesisData.getPath();
        }
        if (videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getHasCoverText()) {
            Bitmap LIZLLL = C44694HgQ.LIZLLL(path, new BitmapFactory.Options());
            if (LIZLLL == null) {
                return path;
            }
            videoPublishEditModel.generateVideoCoverPath();
            String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
            o.LJI(videoCoverPath);
            LJJJJLI(LIZLLL, videoCoverPath, null, 6);
            String videoCoverPath2 = videoPublishEditModel.getVideoCoverPath();
            o.LJI(videoCoverPath2);
            return videoCoverPath2;
        }
        return path;
    }

    public static final int LJIJJ(String str) {
        Integer valueOf;
        if (!C44687HgJ.LIZIZ(str)) {
            return 0;
        }
        try {
            ExifInterface LJIIIZ = C44694HgQ.LJIIIZ(str);
            if (LJIIIZ != null && (valueOf = Integer.valueOf(LJIIIZ.getAttributeInt("Orientation", 1))) != null) {
                if (valueOf.intValue() != 6) {
                    if (valueOf.intValue() == 3) {
                        return 180;
                    }
                    if (valueOf.intValue() != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final List LJIJJLI(List list) {
        LiveRoomStruct liveRoomStruct;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (aweme != null) {
                liveRoomStruct = aweme.getNewLiveRoomData();
            } else {
                liveRoomStruct = null;
            }
            arrayList.add(Integer.valueOf(LJJIJL(liveRoomStruct) ? 1 : 0));
        }
        return arrayList;
    }

    public static final int LJJI(EditMedia editMedia) {
        EnumC123874tb enumC123874tb;
        o.LJIIIZ(editMedia, "<this>");
        if (editMedia.isVideo()) {
            enumC123874tb = EnumC123874tb.VIDEO;
        } else {
            enumC123874tb = EnumC123874tb.IMAGE;
        }
        return enumC123874tb.swigValue();
    }

    public static List LJJIFFI(EnumC46469ILp searchCardContainerType) {
        Lifecycle lifecycle;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            lifecycle = LJ.getLifecycle();
        } else {
            lifecycle = null;
        }
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        if (lifecycle == null) {
            return C61878OQg.INSTANCE;
        }
        SearchCardContainerSharedVM LIZ2 = C44734Hh4.LIZ(lifecycle, searchCardContainerType);
        XKX.LJ(MBB.INSTANCE, new C66932jx(LIZ2, null));
        return LIZ2.LJLIL;
    }

    public static final C08440Uu LJJII(C15010iP c15010iP) {
        o.LJIIIZ(c15010iP, "<this>");
        C08440Uu c08440Uu = c15010iP.LIZ;
        long j = c15010iP.LIZIZ;
        c08440Uu.getClass();
        return c08440Uu.subSequence(C08350Ul.LJ(j), C08350Ul.LIZLLL(j));
    }

    public static final List LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return new ArrayList();
        }
        List<TextStickerData> LIZLLL = C137045Zk.LIZLLL(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerData> it = LIZLLL.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().getTextWrapList(), arrayList);
        }
        return arrayList;
    }

    public static final List LJJIIZI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        List<TextStickerData> LIZLLL = C137045Zk.LIZLLL(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        for (TextStickerData textStickerData : LIZLLL) {
            if (o.LJ(textStickerData.getType(), "type_text_sticker")) {
                arrayList.add(textStickerData);
            }
        }
        return arrayList;
    }

    public static final List LJJIJIIJI(List list) {
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AddYoursAvatar) it.next()).getUid());
        }
        if (arrayList.contains(Long.valueOf(CastLongProtector.parseLong(LJ.getUid())))) {
            return list;
        }
        List LJJIJIL = C47261Igj.LJJIJIL(new AddYoursAvatar(Long.valueOf(CastLongProtector.parseLong(LJ.getUid())), LJ.getAvatarThumb(), null, 4, null));
        LJJIJIL.addAll(list);
        return ORZ.LLILLL(LJJIJIL, 3);
    }

    public static final boolean LJJIJIIJIL(BaseShortVideoContext baseShortVideoContext) {
        String str;
        TempPublishAnchorModel tempPublishAnchorModel = null;
        if (baseShortVideoContext != null && (str = baseShortVideoContext.commerceData) != null && str.length() != 0) {
            try {
                tempPublishAnchorModel = (TempPublishAnchorModel) C60903NvH.LJIIJJI().LIZ().LJI(baseShortVideoContext.commerceData, TempPublishAnchorModel.class);
            } catch (Exception unused) {
            }
            if (tempPublishAnchorModel != null && tempPublishAnchorModel.anchorBusinessType == 0 && tempPublishAnchorModel.anchorId != null && tempPublishAnchorModel.anchorContent != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIJL(LiveRoomStruct liveRoomStruct) {
        OSZ osz;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject optJSONObject;
        if (liveRoomStruct == null) {
            osz = new OSZ(0, 0);
        } else {
            osz = new OSZ(0, 0);
            StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
            if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
                try {
                    JSONObject optJSONObject2 = new JSONObject(streamData).optJSONObject("data");
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("origin")) != null) {
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("main");
                        Objects.requireNonNull(optJSONObject3);
                        String resolutionString = new JSONObject(optJSONObject3.optString("sdk_params")).optString("resolution");
                        o.LJIIIIZZ(resolutionString, "resolutionString");
                        String[] strArr = (String[]) s.LJLJJL(resolutionString, new String[]{"x"}, 0, 6).toArray(new String[0]);
                        osz = new OSZ(Integer.valueOf(CastIntegerProtector.parseInt(strArr[0])), Integer.valueOf(CastIntegerProtector.parseInt(strArr[1])));
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (((Number) osz.getFirst()).intValue() == 0 || ((Number) osz.getSecond()).intValue() == 0) {
            if (liveRoomStruct != null && liveRoomStruct.isThirdParty) {
                return false;
            }
            return true;
        }
        if (((Number) osz.getFirst()).intValue() >= ((Number) osz.getSecond()).intValue()) {
            return false;
        }
        return true;
    }

    public static final ILinkStateAbility LJJIL(View view) {
        UC1.LJLJJL.getClass();
        InterfaceC55235Lm3 LIZ2 = C44846His.LIZ(view);
        C2K0 c2k0 = null;
        if (LIZ2 != null) {
            c2k0 = UC0.LJIIL(LIZ2, ILinkStateAbility.class, null);
        }
        return (ILinkStateAbility) c2k0;
    }

    public static final int[] LJJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int[] LJJJJZI = LJJJJZI(videoPublishEditModel);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UploadOutputVideoSize PhotoCanvas; outputSize : ");
        LIZ2.append(g0.LJJJJI(LJJJJZI));
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        return LJJJJZI;
    }

    public static final int[] LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        Size LIZJ;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!C143205jg.LJFF(videoPublishEditModel) || (LIZJ = C143205jg.LIZJ(videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight())) == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("outputSize : [");
            LIZ2.append(videoPublishEditModel.mOutVideoWidth);
            LIZ2.append(" , ");
            LIZ2.append(videoPublishEditModel.mOutVideoHeight);
            LIZ2.append("] ; canvasSize : [");
            LIZ2.append(videoPublishEditModel.mVideoCanvasWidth);
            LIZ2.append(", ");
            LIZ2.append(videoPublishEditModel.mVideoCanvasHeight);
            LIZ2.append("] ;  videoSize : [");
            LIZ2.append(videoPublishEditModel.videoWidth());
            LIZ2.append(", ");
            LIZ2.append(videoPublishEditModel.videoHeight());
            LIZ2.append("] ; sourceSize : [");
            LIZ2.append(videoPublishEditModel.sourceVideoWidth());
            LIZ2.append(", ");
            LIZ2.append(videoPublishEditModel.sourceVideoHeight());
            LIZ2.append("] ; isFastImport : ");
            LIZ2.append(H7R.LJJJJ(videoPublishEditModel));
            LIZ2.append(" isFastImport : ");
            LIZ2.append(videoPublishEditModel.isFastImport);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            if (((Boolean) C43529H6n.LIZ.getValue()).booleanValue()) {
                if (H7R.LJJJJ(videoPublishEditModel)) {
                    int sourceVideoWidth = videoPublishEditModel.sourceVideoWidth();
                    int sourceVideoHeight = videoPublishEditModel.sourceVideoHeight();
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("sourceSize -> sourceVideoSize : [", sourceVideoWidth, ", ", sourceVideoHeight, "] ; isFastImportForLog : ");
                    LIZJ2.append(H7R.LJJJJ(videoPublishEditModel));
                    C5Z5.LIZIZ(X1D.LIZIZ(LIZJ2));
                    if (sourceVideoWidth > 0 && sourceVideoHeight > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = videoPublishEditModel.mOutVideoWidth;
                    if (i5 > 0 && videoPublishEditModel.mOutVideoHeight > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z) {
                        if (z2) {
                            iArr = new int[]{i5, videoPublishEditModel.mOutVideoHeight};
                        } else {
                            iArr = new int[]{720, 1280};
                        }
                    } else {
                        boolean needExpandCompiledSize = videoPublishEditModel.getCoverPublishModel().getNeedExpandCompiledSize();
                        if (z2 && !needExpandCompiledSize && sourceVideoWidth > sourceVideoHeight && Math.abs((sourceVideoWidth / sourceVideoHeight) - (videoPublishEditModel.mOutVideoWidth / videoPublishEditModel.mOutVideoHeight)) >= 0.1f) {
                            needExpandCompiledSize = true;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("sourceSize -> needExpand: ");
                        LIZ3.append(needExpandCompiledSize);
                        C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
                        if (needExpandCompiledSize && z2) {
                            iArr = new int[]{sourceVideoWidth, (int) ((videoPublishEditModel.mOutVideoHeight / videoPublishEditModel.mOutVideoWidth) * sourceVideoWidth)};
                        } else {
                            iArr = new int[]{videoPublishEditModel.sourceVideoWidth(), videoPublishEditModel.sourceVideoHeight()};
                        }
                    }
                } else if (H7R.LIZJ(videoPublishEditModel) && (i3 = videoPublishEditModel.mOutVideoWidth) > 0 && (i4 = videoPublishEditModel.mOutVideoHeight) > 0) {
                    iArr = new int[]{i3, i4};
                } else if (videoPublishEditModel.isFastImport) {
                    iArr = new int[]{-1, -1};
                } else {
                    iArr = new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
                }
            } else if (H7R.LIZJ(videoPublishEditModel) && (i = videoPublishEditModel.mOutVideoWidth) > 0 && (i2 = videoPublishEditModel.mOutVideoHeight) > 0) {
                iArr = new int[]{i, i2};
            } else if (videoPublishEditModel.isFastImport) {
                iArr = new int[]{-1, -1};
            } else {
                iArr = new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("UploadOutputVideoSize; sourceSize : ");
            LIZ4.append(g0.LJJJJI(iArr));
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ4));
            return iArr;
        }
        int[] iArr2 = {LIZJ.getWidth(), LIZJ.getHeight()};
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("UploadOutputVideoSize; fullScreenRecordDraftResolution sourceSize : ");
        LIZ5.append(g0.LJJJJI(iArr2));
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ5));
        return iArr2;
    }

    public static final int[] LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int[] LJJJJZI = LJJJJZI(videoPublishEditModel);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UploadOutputVideoSize Template; outputSize : ");
        LIZ2.append(g0.LJJJJI(LJJJJZI));
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        return LJJJJZI;
    }

    public static final UserInvitee LJJJLZIJ(User user) {
        if (user == null) {
            return null;
        }
        String uid = user.getUid();
        String nickname = user.getNickname();
        UrlModel avatarThumb = user.getAvatarThumb();
        Boolean addYoursInvited = user.getAddYoursInvited();
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        o.LJIIIIZZ(uid, "uid");
        Integer valueOf = Integer.valueOf(followStatus);
        Integer valueOf2 = Integer.valueOf(followerStatus);
        o.LJIIIIZZ(addYoursInvited, "addYoursInvited");
        return new UserInvitee(uid, nickname, null, avatarThumb, valueOf, valueOf2, addYoursInvited.booleanValue(), false, 132, null);
    }

    public static final void LIZ(InterfaceC55235Lm3 interfaceC55235Lm3, boolean z) {
        if (z) {
            UC0.LJII(interfaceC55235Lm3, new SessionAbility(), ISessionAbility.class);
        } else {
            if (UC0.LJIIL(interfaceC55235Lm3, ISessionAbility.class, null) == null) {
                return;
            }
            UC0.LJJLIIIJ(interfaceC55235Lm3, ISessionAbility.class, null);
        }
    }

    public static final Drawable LIZIZ(Context context, boolean z) {
        int i;
        if (C58B.LIZ()) {
            C110614Vt c110614Vt = new C110614Vt();
            if (z) {
                i = R.attr.dj;
            } else {
                i = R.attr.cf;
            }
            c110614Vt.LIZIZ = Integer.valueOf(i);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            return c110614Vt.LIZ(context);
        }
        return C04270Et.LIZIZ(context, R.drawable.pr);
    }

    public static List LIZJ(InterfaceC49871Jhj interfaceC49871Jhj, EnumC46469ILp searchCardContainerType) {
        Lifecycle lifecycle;
        AbstractC49300JWm config;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            lifecycle = LJ.getLifecycle();
        } else {
            lifecycle = null;
        }
        o.LJIIIZ(interfaceC49871Jhj, "<this>");
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        ISearchCardProtocol LJJJJI = LJJJJI(interfaceC49871Jhj, searchCardContainerType, lifecycle);
        if (LJJJJI == null || (config = LJJJJI.getConfig()) == null) {
            return null;
        }
        return config.LIZ(interfaceC49871Jhj, new C49847JhL(0));
    }

    public static final void LIZLLL(W5G coverView, String str) {
        o.LJIIIZ(coverView, "coverView");
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            W6J LIZ2 = W5I.LIZ();
            android.net.Uri fromFile = android.net.Uri.fromFile(new File(str));
            LIZ2.LIZIZ(fromFile);
            C78764Uvg.LJIIIZ(coverView, fromFile.toString(), -1, -1);
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bindImageWithPath failed :");
            LIZ3.append(e.getMessage());
            H78.LIZ(X1D.LIZIZ(LIZ3));
        }
    }

    public static final int[] LJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (videoPublishEditModel.isPhotoMvMode) {
            return LJJJIL(videoPublishEditModel, C44758HhS.LIZ(), LJFF(videoPublishEditModel, z));
        }
        if (H7R.LJJJLL(videoPublishEditModel)) {
            return LJJJI(videoPublishEditModel);
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return LJJJLIIL(videoPublishEditModel);
        }
        if (videoPublishEditModel.isDuet()) {
            return LJIILJJIL(videoPublishEditModel);
        }
        if (videoPublishEditModel.hasText()) {
            return LJJJLL(videoPublishEditModel, LJFF(videoPublishEditModel, z));
        }
        return LJIIJJI(videoPublishEditModel, LJFF(videoPublishEditModel, z));
    }

    public static final int[] LJFF(VideoPublishEditModel videoPublishEditModel, boolean z) {
        int LIZIZ;
        UploadSpeedEncodeSettings uploadSpeedEncodeSettings = videoPublishEditModel.getUploadSpeedEncodeSettings();
        boolean z2 = false;
        if (C78596Usy.LJJJI(videoPublishEditModel) && z) {
            if (uploadSpeedEncodeSettings != null) {
                LIZIZ = uploadSpeedEncodeSettings.highQualityCompileVideoSizeIndex;
            } else {
                LIZIZ = C44747HhH.LIZ();
            }
        } else if (uploadSpeedEncodeSettings != null) {
            LIZIZ = uploadSpeedEncodeSettings.compileVideoSizeIndex;
        } else {
            LIZIZ = C44743HhD.LIZIZ(H7R.LJJJJI(videoPublishEditModel));
        }
        int[] LIZJ = C44739Hh9.LIZJ(LIZIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UploadOutputVideoSize; compileSize : ");
        LIZ2.append(g0.LJJJJI(LIZJ));
        LIZ2.append(" ; index : ");
        LIZ2.append(LIZIZ);
        LIZ2.append(" ; openHD : ");
        LIZ2.append(z);
        LIZ2.append(" ; useSpeed : ");
        if (uploadSpeedEncodeSettings != null) {
            z2 = true;
        }
        LIZ2.append(z2);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        return LIZJ;
    }

    public static int LJII(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int LJIIIIZZ = LJIIIIZZ(i, iOException.getMessage());
            if (LJIIIIZZ != i) {
                return LJIIIIZZ;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return LJIIIIZZ;
                }
                String message = cause.getMessage();
                if (TextUtils.isEmpty(message)) {
                    return LJIIIIZZ;
                }
                return LJIIIIZZ(i, message);
            } catch (Throwable unused) {
                return LJIIIIZZ;
            }
        } catch (Throwable unused2) {
            return i;
        }
    }

    public static int LJIIIIZZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.contains("ECONNRESET") || str.contains("Connection reset") || str.contains("reset by peer")) {
            return -101;
        }
        if (str.contains("ECONNREFUSED")) {
            return -102;
        }
        if (str.contains("CONNECTION_ABORTED") || str.contains("connection abort")) {
            return -103;
        }
        if (str.contains("ENETDOWN") || str.contains("Network is unreachable")) {
            return -106;
        }
        if (str.contains("EHOSTUNREACH") || str.contains("ENETUNREACH")) {
            return -109;
        }
        if (str.contains("EADDRNOTAVAIL")) {
            return -108;
        }
        if (!str.contains("EADDRINUSE")) {
            return i;
        }
        return -147;
    }

    public static final int[] LJIIJJI(VideoPublishEditModel videoPublishEditModel, int[] iArr) {
        boolean z;
        int i;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int[] LJJJJZI = LJJJJZI(videoPublishEditModel);
        if (iArr == null) {
            return LJJJJZI;
        }
        int[] iArr2 = new int[2];
        int i2 = LJJJJZI[0];
        int i3 = LJJJJZI[1];
        if (i2 > i3) {
            z = true;
        } else {
            z = false;
        }
        int max = Math.max(i2, i3);
        int min = Math.min(LJJJJZI[0], LJJJJZI[1]);
        float f = max / min;
        int max2 = Math.max(iArr[0], iArr[1]);
        int min2 = Math.min(iArr[0], iArr[1]);
        if (min2 == 1080) {
            i = 1100;
        } else {
            i = min2;
        }
        if (H7R.LJJLIIIJ(videoPublishEditModel)) {
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIIIZZ(31744, "creative_compile_thin_video_height_factor", 0.0f) > 0.0f && LJJJJZI[0] * 16 < LJJJJZI[1] * 9) {
                StringBuilder LJ = C7MY.LJ("UploadOutputVideoSize , enableThinVideoOpt, targetMax = ", max2, " , factor : ");
                FFL.LJIIIZ().getClass();
                LJ.append(FFL.LJIIIIZZ(31744, "creative_compile_thin_video_height_factor", 0.0f));
                C5Z5.LIZIZ(X1D.LIZIZ(LJ));
                FFL.LJIIIZ().getClass();
                max2 = Math.max(max2, (int) (FFL.LJIIIIZZ(31744, "creative_compile_thin_video_height_factor", 0.0f) * max2));
            }
        }
        if (C143225ji.LIZ() && !videoPublishEditModel.isUploadVideo()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("UploadOutputVideoSize , fullScreenResolutionAdapter, targetMax = ");
            LIZ2.append(max2);
            LIZ2.append(" , sourceMax : ");
            LIZ2.append(max);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            max2 = Math.max(max2, max);
        }
        if (max > max2 || min > i) {
            if (max * min2 >= min * max2) {
                min = (int) (max2 / f);
                max = max2;
            } else {
                max = (int) (min2 * f);
                min = min2;
            }
        }
        if (z) {
            iArr2[0] = max;
            iArr2[1] = min;
        } else {
            iArr2[1] = max;
            iArr2[0] = min;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("UploadOutputVideoSize default; outputSize : ");
        LIZ3.append(g0.LJJJJI(iArr2));
        LIZ3.append(" ;");
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
        return iArr2;
    }

    public static final float LJIIL(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final String LJIILLIIL(String str, TrackParams trackParams) {
        String str2;
        TrackParams trackParams2 = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(TrackParams.class)));
            if (!(fromJson instanceof TrackParams)) {
                fromJson = null;
            }
            trackParams2 = (TrackParams) fromJson;
        } catch (com.google.gson.s unused) {
        }
        if (trackParams2 == null) {
            trackParams2 = new TrackParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
        }
        String str3 = trackParams2.anchor_show_type;
        if (str3 == null) {
            str3 = trackParams.anchor_show_type;
        }
        trackParams2.anchor_show_type = str3;
        String str4 = trackParams2.author_id;
        if (str4 == null) {
            str4 = trackParams.author_id;
        }
        trackParams2.author_id = str4;
        String str5 = trackParams2.request_id;
        if (str5 == null) {
            str5 = trackParams.request_id;
        }
        trackParams2.request_id = str5;
        String str6 = trackParams2.product_id;
        if (str6 == null) {
            str6 = trackParams.product_id;
        }
        trackParams2.product_id = str6;
        String str7 = trackParams2.enter_from_info;
        if (str7 == null) {
            str2 = trackParams.enter_from_merge;
        } else {
            str2 = str7;
        }
        trackParams2.enter_from_merge = str2;
        if (str7 == null) {
            str7 = trackParams.enter_from_info;
        }
        trackParams2.enter_from_info = str7;
        String str8 = trackParams2.product_source;
        if (str8 == null) {
            str8 = trackParams.product_source;
        }
        trackParams2.product_source = str8;
        String str9 = trackParams2.source_from;
        if (str9 == null) {
            str9 = trackParams.source_from;
        }
        trackParams2.source_from = str9;
        String str10 = trackParams2.source;
        if (str10 == null) {
            str10 = trackParams.source;
        }
        trackParams2.source = str10;
        String str11 = trackParams2.source_content_id;
        if (str11 == null) {
            str11 = trackParams.source_content_id;
        }
        trackParams2.source_content_id = str11;
        String str12 = trackParams2.action_type;
        if (str12 == null) {
            str12 = trackParams.action_type;
        }
        trackParams2.action_type = str12;
        String str13 = trackParams2.source_page_type;
        if (str13 == null) {
            str13 = trackParams.source_page_type;
        }
        trackParams2.source_page_type = str13;
        String str14 = trackParams2.source_previous_page;
        if (str14 == null) {
            str14 = trackParams.source_previous_page;
        }
        trackParams2.source_previous_page = str14;
        String str15 = trackParams2.follow_status;
        if (str15 == null) {
            str15 = trackParams.follow_status;
        }
        trackParams2.follow_status = str15;
        String str16 = trackParams2.entrance_form;
        if (str16 == null) {
            str16 = trackParams.entrance_form;
        }
        trackParams2.entrance_form = str16;
        String str17 = trackParams2.is_ad;
        if (str17 == null) {
            str17 = trackParams.is_ad;
        }
        trackParams2.is_ad = str17;
        String str18 = trackParams2.ad_id;
        if (str18 == null) {
            str18 = trackParams.ad_id;
        }
        trackParams2.ad_id = str18;
        String str19 = trackParams2.creative_id;
        if (str19 == null) {
            str19 = trackParams.creative_id;
        }
        trackParams2.creative_id = str19;
        java.util.Map<String, String> map = trackParams2.effect_ad_extra;
        if (map == null) {
            map = trackParams.effect_ad_extra;
        }
        trackParams2.effect_ad_extra = map;
        if (!TextUtils.isEmpty(trackParams.rec_content_id)) {
            trackParams2.rec_content_id = trackParams.rec_content_id;
            trackParams2.rec_content_type = trackParams.rec_content_type;
        }
        String str20 = trackParams2.search_id;
        if (str20 == null) {
            str20 = trackParams.search_id;
        }
        trackParams2.search_id = str20;
        String str21 = trackParams2.search_result_id;
        if (str21 == null) {
            str21 = trackParams.search_result_id;
        }
        trackParams2.search_result_id = str21;
        String str22 = trackParams2.track_id;
        if (str22 == null) {
            str22 = trackParams.track_id;
        }
        trackParams2.track_id = str22;
        String str23 = trackParams2.rec_session_id;
        if (str23 == null) {
            str23 = trackParams.rec_session_id;
        }
        trackParams2.rec_session_id = str23;
        trackParams2.traffic_source_list = trackParams.traffic_source_list;
        trackParams2.list_item_id = trackParams.list_item_id;
        trackParams2.sourceModule = trackParams.sourceModule;
        return C27739Aud.LJI(trackParams2);
    }

    public static final int LJIJ(Integer num, Integer num2) {
        if (num == null) {
            return -1;
        }
        if (num.intValue() == 2) {
            return 2;
        }
        if (num.intValue() == 1) {
            return 1;
        }
        if (num2 == null || num2.intValue() != 1) {
            return 0;
        }
        return 3;
    }

    public static final String LJJIII(int i, InterfaceC24520xk interfaceC24520xk) {
        String str;
        interfaceC24520xk.LJJIIJ(-726638443);
        interfaceC24520xk.LJIILLIIL(C04Q.LIZ);
        Resources resources = ((Context) interfaceC24520xk.LJIILLIIL(C04Q.LIZJ)).getResources();
        if (i == 0) {
            str = resources.getString(R.string.ikv);
            o.LJIIIIZZ(str, "resources.getString(R.string.navigation_menu)");
        } else if (i == 1) {
            str = resources.getString(R.string.dg0);
            o.LJIIIIZZ(str, "resources.getString(R.string.close_drawer)");
        } else if (i == 2) {
            str = resources.getString(R.string.dg2);
            o.LJIIIIZZ(str, "resources.getString(R.string.close_sheet)");
        } else if (i == 3) {
            str = resources.getString(R.string.ef_);
            o.LJIIIIZZ(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (i == 4) {
            str = resources.getString(R.string.ezu);
            o.LJIIIIZZ(str, "resources.getString(R.string.dropdown_menu)");
        } else if (i == 5) {
            str = resources.getString(R.string.psk);
            o.LJIIIIZZ(str, "resources.getString(R.string.range_start)");
        } else if (i == 6) {
            str = resources.getString(R.string.psj);
            o.LJIIIIZZ(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        interfaceC24520xk.LJJIJIIJIL();
        return str;
    }

    public static final C08440Uu LJJIIJ(C15010iP c15010iP, int i) {
        o.LJIIIZ(c15010iP, "<this>");
        return c15010iP.LIZ.subSequence(C08350Ul.LIZLLL(c15010iP.LIZIZ), Math.min(C08350Ul.LIZLLL(c15010iP.LIZIZ) + i, c15010iP.LIZ.LJLIL.length()));
    }

    public static final C08440Uu LJJIIJZLJL(C15010iP c15010iP, int i) {
        o.LJIIIZ(c15010iP, "<this>");
        return c15010iP.LIZ.subSequence(Math.max(0, C08350Ul.LJ(c15010iP.LIZIZ) - i), C08350Ul.LJ(c15010iP.LIZIZ));
    }

    public static void LJJIJ(C26227ARb c26227ARb, SY9 sy9) {
        c26227ARb.LJIIIZ = new C244659iv(0, c26227ARb.LIZ, sy9);
    }

    public static boolean LJJIJIL(SearchMixFeed searchMixFeed, EnumC46469ILp searchCardContainerType) {
        Lifecycle lifecycle;
        AbstractC49300JWm config;
        SearchResultActivity LJ = C50989Jzl.LJ();
        EnumC49272JVk enumC49272JVk = null;
        if (LJ != null) {
            lifecycle = LJ.getLifecycle();
        } else {
            lifecycle = null;
        }
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        ISearchCardProtocol LJJJJI = LJJJJI(searchMixFeed, searchCardContainerType, lifecycle);
        if (LJJJJI != null && (config = LJJJJI.getConfig()) != null) {
            enumC49272JVk = config.LIZIZ();
        }
        if (enumC49272JVk == EnumC49272JVk.ONE_COLUMN) {
            return true;
        }
        return false;
    }

    public static final Drawable LJJJJ(Context context, boolean z) {
        int i;
        int i2;
        if (C58B.LIZ()) {
            C110614Vt c110614Vt = new C110614Vt();
            if (z) {
                i2 = R.attr.eb;
            } else {
                i2 = R.attr.ch;
            }
            c110614Vt.LIZIZ = Integer.valueOf(i2);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            return c110614Vt.LIZ(context);
        }
        if (z) {
            i = R.drawable.rq;
        } else {
            i = R.drawable.rr;
        }
        return C04270Et.LIZIZ(context, i);
    }

    public static /* synthetic */ ISearchCardProtocol LJJJJIZL(SearchMixFeed searchMixFeed, EnumC46469ILp enumC46469ILp) {
        Lifecycle lifecycle;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            lifecycle = LJ.getLifecycle();
        } else {
            lifecycle = null;
        }
        return LJJJJI(searchMixFeed, enumC46469ILp, lifecycle);
    }

    public static final Bitmap LJJJJJ(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static final void LJJJJJL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        if (((Boolean) interfaceC65784Pro.invoke()).booleanValue()) {
            interfaceC65784Pro2.invoke();
        } else {
            KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
        }
    }

    public static final void LJJJJZ(Fragment targetFragment, EnumC46469ILp searchCardContainerType) {
        o.LJIIIZ(targetFragment, "targetFragment");
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        Lifecycle lifecycle = targetFragment.requireActivity().getLifecycle();
        o.LJIIIIZZ(lifecycle, "targetFragment.requireActivity().lifecycle");
        SearchCardContainerSharedVM LIZ2 = C44734Hh4.LIZ(lifecycle, searchCardContainerType);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(targetFragment, null);
        synchronized (LIZ2) {
            if (LIZ2.LJLJI == null) {
                LIZ2.LJLJI = XKX.LIZLLL(ViewModelKt.getViewModelScope(LIZ2), C78613UtF.LIZJ, null, new C66972k1(LIZJ, LIZ2, null), 2);
            }
        }
    }

    public static final int[] LJJJLL(VideoPublishEditModel videoPublishEditModel, int[] iArr) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int[] LJIIJJI = LJIIJJI(videoPublishEditModel, iArr);
        if (LJIIJJI[0] > 0 && LJIIJJI[1] > 0) {
            z = true;
        } else {
            z = false;
        }
        if (C150965wC.LIZ() > 0 && z) {
            int i = LJIIJJI[0];
            int i2 = LJIIJJI[1];
            if (Math.min(i, i2) < C150965wC.LIZ()) {
                int LIZ2 = C150965wC.LIZ();
                if (i > i2) {
                    LJIIJJI[0] = (i * LIZ2) / i2;
                    LJIIJJI[1] = LIZ2;
                } else {
                    LJIIJJI[1] = (i2 * LIZ2) / i;
                    LJIIJJI[0] = LIZ2;
                }
            }
        }
        return LJIIJJI;
    }

    public static final Drawable LJIILIIL(Context context, boolean z, boolean z2) {
        int i;
        int i2;
        float LIZIZ;
        C110614Vt c110614Vt = new C110614Vt();
        if (z || z2) {
            i = R.attr.eb;
        } else {
            i = R.attr.cg;
        }
        c110614Vt.LIZIZ = Integer.valueOf(i);
        if (C58B.LIZ()) {
            LIZIZ = C32151Nz.LJIIZILJ(8);
        } else {
            if (z2) {
                i2 = 6;
            } else {
                i2 = 2;
            }
            LIZIZ = C7MY.LIZIZ(i2);
        }
        c110614Vt.LIZJ = Float.valueOf(LIZIZ);
        return c110614Vt.LIZ(context);
    }

    public static final String LJJIJLIJ(int i, String schema, TrackParams trackParams) {
        o.LJIIIZ(schema, "schema");
        if (i != 5 && i != 6) {
            if (i != 100) {
                return schema;
            }
            try {
                android.net.Uri parse = UriProtector.parse(schema);
                Uri.Builder buildUpon = UriProtector.parse(schema).buildUpon();
                buildUpon.appendQueryParameter("trackParams", LJIILLIIL(UriProtector.getQueryParameter(parse, "trackParams"), trackParams));
                return buildUpon.build().toString();
            } catch (Exception unused) {
                return schema;
            }
        }
        try {
            android.net.Uri parse2 = UriProtector.parse(schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse2.getScheme());
            builder.authority(parse2.getHost());
            builder.path(parse2.getPath());
            for (String str : UriProtector.getQueryParameterNames(parse2)) {
                if (!o.LJ(str, "trackParams")) {
                    builder.appendQueryParameter(str, UriProtector.getQueryParameter(parse2, str));
                }
            }
            builder.appendQueryParameter("trackParams", LJIILLIIL(UriProtector.getQueryParameter(parse2, "trackParams"), trackParams));
            builder.appendQueryParameter("fullScreen", String.valueOf(false));
            return builder.build().toString();
        } catch (Exception unused2) {
            return schema;
        }
    }

    public static final int[] LJJJIL(VideoPublishEditModel videoPublishEditModel, boolean z, int[] iArr) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!z) {
            int[] LJJJJZI = LJJJJZI(videoPublishEditModel);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("UploadOutputVideoSize PhotoMV; outputSize : ");
            LIZ2.append(g0.LJJJJI(LJJJJZI));
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            return LJJJJZI;
        }
        return LJIIJJI(videoPublishEditModel, iArr);
    }

    public static final ISearchCardProtocol LJJJJI(InterfaceC49871Jhj interfaceC49871Jhj, EnumC46469ILp searchCardContainerType, Lifecycle lifecycle) {
        o.LJIIIZ(interfaceC49871Jhj, "<this>");
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        if (lifecycle == null) {
            return null;
        }
        return C44734Hh4.LIZ(lifecycle, searchCardContainerType).hv0(interfaceC49871Jhj);
    }

    public static final Bitmap LJI(String str, int i, int i2, Bitmap.Config config) {
        o.LJIIIZ(config, "config");
        Bitmap bitmap = null;
        if (!C44687HgJ.LIZIZ(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(str, options);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = config;
        options.inSampleSize = 1;
        try {
            Bitmap LIZLLL = C44694HgQ.LIZLLL(str, options);
            if (LIZLLL == null) {
                return null;
            }
            int LJIJJ = LJIJJ(str);
            if (LJIJJ % 180 == 90) {
                i2 = i;
                i = i2;
            }
            int i3 = options.outWidth;
            if (i3 > i || options.outHeight > i2) {
                float f = i;
                float f2 = i3 / f;
                int i4 = options.outHeight;
                float f3 = i2;
                if (f2 > i4 / f3) {
                    i2 = (int) ((f * i4) / i3);
                } else {
                    i = (int) ((f3 * i3) / i4);
                }
                LIZLLL = Bitmap.createScaledBitmap(LIZLLL, i, i2, true);
                o.LJIIIIZZ(LIZLLL, "createScaledBitmap(origi…tWidth, destHeight, true)");
            }
            bitmap = LJJJJJ(LIZLLL, LJIJJ);
            return bitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    public static final Bitmap LJIIJ(String str, int i, int i2, Bitmap.Config config) {
        int i3;
        o.LJIIIZ(config, "config");
        Bitmap bitmap = null;
        if (!C44687HgJ.LIZIZ(str)) {
            return null;
        }
        int i4 = i * i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i5 = 1;
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(str, options);
        int i6 = options.outWidth;
        if (i6 == 0 || (i3 = options.outHeight) == 0) {
            return null;
        }
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = config;
        int i7 = i6 * i3;
        if (i4 > 0 && i7 > 0) {
            while (i7 / (i5 * i5) > i4) {
                i5 <<= 1;
            }
        }
        options.inSampleSize = i5;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        try {
            Bitmap LIZLLL = C44694HgQ.LIZLLL(str, options);
            if (LIZLLL == null) {
                return null;
            }
            bitmap = LJJJJJ(LIZLLL, LJIJJ(str));
            return bitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    public static final void LJJIZ(final ActivityC45651qj activityC45651qj, final W5G coverView, final VideoPublishEditModel videoPublishEditModel, final InterfaceC162316Yp interfaceC162316Yp) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(coverView, "coverView");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(videoPublishEditModel.getEffectList());
        if (videoPublishEditModel.getTimeEffect() != null) {
            EffectPointModel timeEffect = videoPublishEditModel.getTimeEffect();
            o.LJI(timeEffect);
            arrayList.add(timeEffect);
            EffectPointModel timeEffect2 = videoPublishEditModel.getTimeEffect();
            o.LJI(timeEffect2);
            if (o.LJ(timeEffect2.getKey(), "1")) {
                z = true;
                C43679HCh.LIZ(arrayList, H7R.LIZLLL(videoPublishEditModel, C44172HVg.LJJ.LJIILL().LJI()).getFilterFolder(), videoPublishEditModel.mSelectedFilterIntensity, (int) (videoPublishEditModel.mVideoCoverStartTm * 1000), z, videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6Yo
                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverFailed(int i) {
                        KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
                    }

                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                        o.LJIIIZ(bitmap, "bitmap");
                        ActivityC45651qj activityC45651qj2 = ActivityC45651qj.this;
                        if (activityC45651qj2 != null) {
                            VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                            W5G w5g = coverView;
                            InterfaceC162316Yp interfaceC162316Yp2 = interfaceC162316Yp;
                            Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel2, bitmap);
                            C1M5 c1m5 = new C1M5(activityC45651qj2.getResources(), LIZJ);
                            c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                            w5g.setImageDrawable(c1m5);
                            if (interfaceC162316Yp2 != null) {
                                interfaceC162316Yp2.LLILZIL(bitmap);
                            }
                            C43679HCh.LIZIZ(LIZJ, null, videoPublishEditModel2.getVideoCoverPath());
                        }
                    }
                });
            }
        }
        z = false;
        C43679HCh.LIZ(arrayList, H7R.LIZLLL(videoPublishEditModel, C44172HVg.LJJ.LJIILL().LJI()).getFilterFolder(), videoPublishEditModel.mSelectedFilterIntensity, (int) (videoPublishEditModel.mVideoCoverStartTm * 1000), z, videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6Yo
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                o.LJIIIZ(bitmap, "bitmap");
                ActivityC45651qj activityC45651qj2 = ActivityC45651qj.this;
                if (activityC45651qj2 != null) {
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    W5G w5g = coverView;
                    InterfaceC162316Yp interfaceC162316Yp2 = interfaceC162316Yp;
                    Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel2, bitmap);
                    C1M5 c1m5 = new C1M5(activityC45651qj2.getResources(), LIZJ);
                    c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                    w5g.setImageDrawable(c1m5);
                    if (interfaceC162316Yp2 != null) {
                        interfaceC162316Yp2.LLILZIL(bitmap);
                    }
                    C43679HCh.LIZIZ(LIZJ, null, videoPublishEditModel2.getVideoCoverPath());
                }
            }
        });
    }

    public static final void LJJJ(final ActivityC45651qj activityC45651qj, final W5G coverView, final VideoPublishEditModel videoPublishEditModel, InterfaceC162316Yp interfaceC162316Yp) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(coverView, "coverView");
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        if (C44687HgJ.LIZIZ(videoCoverPath)) {
            LIZLLL(coverView, videoCoverPath);
            return;
        }
        if (H7R.LJJJJL(videoPublishEditModel)) {
            C152915zL.LIZIZ(videoPublishEditModel, new AqS133S0200000_2(coverView, videoPublishEditModel, 139));
            return;
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData != null) {
            List<String> sourceInfo = canvasVideoData.getSourceInfo();
            LJJJJJL(new AqS151S0100000_1(sourceInfo, (List<String>) 19), new AqS154S0200000_7((List) sourceInfo, (List<String>) coverView, (W5G) 8));
            return;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            LJJJJJL(new AqS45S1000000_7(str, 2), new AqS40S1300000_7(activityC45651qj, coverView, videoPublishEditModel, str, 1));
            return;
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            if (C39579Fg7.LIZIZ(videoPublishEditModel.multiEditVideoRecordData.coverImagePath)) {
                String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                o.LJIIIIZZ(str2, "multiEditVideoRecordData.coverImagePath");
                LJJJJLL(activityC45651qj, coverView, videoPublishEditModel, str2);
                return;
            }
            if (H7R.LJJJJLI(videoPublishEditModel) || videoPublishEditModel.getOriginal() == 2) {
                if (TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.coverImagePath)) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                    CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "creativeInfo");
                    multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                }
                String str3 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                LJJJJJL(new AqS45S1000000_7(str3, 1), new AqS40S1300000_7(activityC45651qj, coverView, videoPublishEditModel, str3, 0));
                return;
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            o.LJIIIIZZ(curMultiEditVideoRecordData, "curMultiEditVideoRecordData");
            final VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
            o.LJIIIIZZ(playInOutTime, "curMultiEditVideoRecordData.playInOutTime");
            LJIIJJI.setTimeRange(((Number) playInOutTime.first).intValue() * 1000, ((Number) playInOutTime.second).intValue() * 1000);
            final C76732zl c76732zl = new C76732zl();
            c76732zl.element = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
            if (videoPublishEditModel.isUseTimeReverseEffect()) {
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj = playInOutTime.first;
                o.LJIIIIZZ(obj, "playPair.first");
                c76732zl.element = (intValue - ((Number) obj).intValue()) - c76732zl.element;
            }
            AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.6ZA
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9<Drawable> interfaceC73573Su9) {
                    VERecordData vERecordData = VERecordData.this;
                    int i = c76732zl.element;
                    int height = coverView.getHeight();
                    final ActivityC45651qj activityC45651qj2 = activityC45651qj;
                    final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                    int videoThumb = VEUtils.getVideoThumb(vERecordData, i, -1, height, false, new P5A() { // from class: X.6Z9
                        @Override // X.P5A
                        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                            ActivityC45651qj activityC45651qj3 = ActivityC45651qj.this;
                            if (activityC45651qj3 != null) {
                                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                                InterfaceC73573Su9<Drawable> interfaceC73573Su92 = c73433Srt;
                                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                                createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                Bitmap mergeCoverText = videoPublishEditModel3.getCoverPublishModel().getEffectTextModel().mergeCoverText(createBitmap);
                                C1M5 c1m5 = new C1M5(activityC45651qj3.getResources(), mergeCoverText);
                                c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                                if (TextUtils.isEmpty(videoPublishEditModel3.multiEditVideoRecordData.coverImagePath)) {
                                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel3.multiEditVideoRecordData;
                                    CreativeInfo creativeInfo2 = videoPublishEditModel3.creativeInfo;
                                    o.LJIIIIZZ(creativeInfo2, "creativeInfo");
                                    multiEditVideoStatusRecordData2.coverImagePath = C6BI.LIZJ(creativeInfo2);
                                }
                                String str4 = videoPublishEditModel3.multiEditVideoRecordData.coverImagePath;
                                o.LJIIIIZZ(str4, "multiEditVideoRecordData.coverImagePath");
                                C6BI.LIZLLL(mergeCoverText, str4, null);
                                interfaceC73573Su92.onNext(c1m5);
                                interfaceC73573Su92.onComplete();
                            }
                            return false;
                        }
                    });
                    if (videoThumb != 0) {
                        H78.LIZLLL("publish_page_get_cover_error", new Exception(KMP.LJ("VEUtils.getVideoThumb return code=", videoThumb)));
                        interfaceC73573Su9.onComplete();
                    }
                }
            }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(coverView, 0), new InterfaceC64592gB() { // from class: X.6aa
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj2) {
                    KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
                }
            });
            return;
        }
        LJJIZ(activityC45651qj, coverView, videoPublishEditModel, interfaceC162316Yp);
    }

    public static final void LJJJJL(Bitmap bitmap, String imgPath, Bitmap.CompressFormat format, int i) {
        o.LJIIIZ(bitmap, "<this>");
        o.LJIIIZ(imgPath, "imgPath");
        o.LJIIIZ(format, "format");
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(imgPath)));
            try {
                bitmap.compress(format, i, bufferedOutputStream);
                bufferedOutputStream.flush();
                AnonymousClass636.LJFF(bufferedOutputStream, null);
            } finally {
            }
        } catch (Exception e) {
            H78.LJ(e);
        }
    }

    public static /* synthetic */ void LJJJJLI(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i) {
        int i2;
        if ((i & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i & 4) != 0) {
            i2 = 100;
        } else {
            i2 = 0;
        }
        LJJJJL(bitmap, str, compressFormat, i2);
    }

    public static final void LJJJJLL(ActivityC45651qj activityC45651qj, W5G coverView, VideoPublishEditModel videoPublishEditModel, String str) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(coverView, "coverView");
        coverView.post(new H91(activityC45651qj, coverView, videoPublishEditModel, str));
    }
}
