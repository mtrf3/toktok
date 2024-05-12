package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoHWEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoSWEncodeSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.AVDraftAwemeCompat;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftOperationInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodePreset;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YNd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87277YNd implements InterfaceC48038ItG, InterfaceC14120gy {
    public static final C87277YNd LJLIL = new C87277YNd();
    public static final C87277YNd LJLILLLLZI = new C87277YNd();

    public static int LJIJJ() {
        return C00F.LIZ(31744, -1, "optimize_endlesslooper", true);
    }

    public static final boolean LIZIZ(String str) {
        Character.UnicodeBlock ARABIC = Character.UnicodeBlock.ARABIC;
        o.LJIIIIZZ(ARABIC, "ARABIC");
        Character.UnicodeBlock HEBREW = Character.UnicodeBlock.HEBREW;
        o.LJIIIIZZ(HEBREW, "HEBREW");
        Character.UnicodeBlock THAANA = Character.UnicodeBlock.THAANA;
        o.LJIIIIZZ(THAANA, "THAANA");
        Character.UnicodeBlock SYRIAC = Character.UnicodeBlock.SYRIAC;
        o.LJIIIIZZ(SYRIAC, "SYRIAC");
        Character.UnicodeBlock MANDAIC = Character.UnicodeBlock.MANDAIC;
        o.LJIIIIZZ(MANDAIC, "MANDAIC");
        Character.UnicodeBlock SAMARITAN = Character.UnicodeBlock.SAMARITAN;
        o.LJIIIIZZ(SAMARITAN, "SAMARITAN");
        Character.UnicodeBlock NKO = Character.UnicodeBlock.NKO;
        o.LJIIIIZZ(NKO, "NKO");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(ARABIC, HEBREW, THAANA, SYRIAC, MANDAIC, SAMARITAN, NKO);
        for (int i = 0; i < str.length(); i++) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(str.charAt(i));
            if (of != null && LJJIJIIJI.contains(of)) {
                return true;
            }
        }
        return false;
    }

    public static final DraftViewInfo LIZJ(AwemeDraft awemeDraft) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        CreativeModel creativeModel;
        CanvasVideoData canvasVideoData;
        boolean z2;
        List<CanvasVideoData> externalTracks;
        ChangeAvatarModel changeAvatarModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        o.LJIIIZ(awemeDraft, "<this>");
        DraftViewInfo draftViewInfo = new DraftViewInfo();
        draftViewInfo.creationId = String.valueOf(awemeDraft.LIZJ());
        AVDraftAwemeCompat aVDraftAwemeCompat = awemeDraft.aweme;
        List<AVTextExtraStruct> list = null;
        if (aVDraftAwemeCompat != null) {
            str = aVDraftAwemeCompat.desc;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str6 = "";
        if (z) {
            str2 = "";
        } else {
            AVDraftAwemeCompat aVDraftAwemeCompat2 = awemeDraft.aweme;
            if (aVDraftAwemeCompat2 == null || (str2 = aVDraftAwemeCompat2.desc) == null) {
                str2 = "";
            }
        }
        if ((!C142975jJ.LIZ() && awemeDraft.LJJJJI.creationMode != 3 && !C142985jK.LIZ()) || !C44687HgJ.LIZIZ(awemeDraft.LJJJJI.videoCoverPath) || (str3 = awemeDraft.LJJJJI.videoCoverPath) == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3) && awemeDraft.LJJJJI.canvasVideoData != null && ((!C150325vA.LIZ() || (imageAlbumData = awemeDraft.LJJJJI.imageAlbumData) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() != 1) && ((creativeModel = awemeDraft.LIZ) == null || (changeAvatarModel = creativeModel.changeAvatarModel) == null || !changeAvatarModel.isFromChangeAvatar))) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
            if (aVDraftExtras != null) {
                canvasVideoData = aVDraftExtras.canvasVideoData;
            } else {
                canvasVideoData = null;
            }
            if (!C79004UzY.LJJIJL(canvasVideoData)) {
                CanvasVideoData canvasVideoData2 = awemeDraft.LJJJJI.canvasVideoData;
                o.LJI(canvasVideoData2);
                List<String> sourceInfo = canvasVideoData2.getSourceInfo();
                o.LJI(sourceInfo);
                CanvasVideoData canvasVideoData3 = awemeDraft.LJJJJI.canvasVideoData;
                if (canvasVideoData3 != null && (externalTracks = canvasVideoData3.getExternalTracks()) != null && (!externalTracks.isEmpty())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((true ^ sourceInfo.isEmpty()) && !z2) {
                    str3 = (String) ListProtector.get(sourceInfo, 0);
                }
            }
        }
        if (TextUtils.isEmpty(str3) && (str5 = awemeDraft.LJJJJI.videoCoverPath) != null && !TextUtils.isEmpty(str5) && (str3 = awemeDraft.LJJJJI.videoCoverPath) == null) {
            str3 = "";
        }
        AVMusic aVMusic = awemeDraft.LIZLLL;
        if (aVMusic == null) {
            str4 = "";
        } else {
            str4 = aVMusic.musicName;
            if (str4 == null) {
                str4 = "";
            }
            String musicId = aVMusic.getMusicId();
            if (musicId != null) {
                str6 = musicId;
            }
        }
        AVDraftAwemeCompat aVDraftAwemeCompat3 = awemeDraft.aweme;
        if (aVDraftAwemeCompat3 != null) {
            list = aVDraftAwemeCompat3.textExtra;
        }
        draftViewInfo.draftShowInfo = new DraftShowInfo(str2, list, str3, str4, str6, awemeDraft.lastEditTime, awemeDraft.saveTime);
        DraftOperationInfo draftOperationInfo = new DraftOperationInfo(0, false, 0L, false, 15, null);
        draftOperationInfo.type = 0;
        draftOperationInfo.isNeedShow = C41802Gas.LJFF(awemeDraft);
        draftOperationInfo.isUpdateSticker = awemeDraft.LJJJJI.isUpdateInfoStickers;
        long j = awemeDraft.LJJ;
        if (j == 0) {
            C68395Qsp c68395Qsp = new C68395Qsp(3);
            c68395Qsp.LJLIL = awemeDraft;
            long LIZIZ = c68395Qsp.LIZIZ();
            awemeDraft.LJJ = LIZIZ;
            draftOperationInfo.freeUpSpace = LIZIZ;
        } else {
            draftOperationInfo.freeUpSpace = j;
        }
        draftViewInfo.draftOperationInfo = draftOperationInfo;
        draftViewInfo.LIZ = awemeDraft.LJJJI;
        return draftViewInfo;
    }

    public static void LIZLLL(String str) {
        C36922EeM.LIZLLL(3, "ProfilePageFragment", str);
    }

    public static final int LJII(int i) {
        if (i <= C53439KyB.LJIIL) {
            return 0;
        }
        if (i <= C53439KyB.LJIIJJI) {
            return C2309994t.LIZJ;
        }
        if (i <= C53439KyB.LJIIIZ) {
            return C2309994t.LIZIZ;
        }
        if (i <= C53439KyB.LJIIIIZZ) {
            return C2309994t.LIZ;
        }
        if (i <= C53439KyB.LJII) {
            return C2309994t.LIZJ;
        }
        if (i <= C53439KyB.LJI) {
            return C2309994t.LIZ;
        }
        if (i <= C53439KyB.LJ) {
            return 0;
        }
        return C2309994t.LIZLLL;
    }

    public static final Integer LJIIIIZZ(Cert cert) {
        Object obj;
        java.util.Map<String, Object> customInfo = cert.customInfo();
        Object obj2 = null;
        if (customInfo != null) {
            obj = customInfo.get("dataflowID");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            obj2 = obj;
        }
        return (Integer) obj2;
    }

    public static final float LJIIIZ(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        if (i <= C53439KyB.LJIIIIZZ) {
            return YNW.LIZ;
        }
        if (i <= C53439KyB.LJII) {
            return YNW.LIZIZ;
        }
        if (i <= C53439KyB.LJFF) {
            return YNW.LIZJ;
        }
        if (i <= C53439KyB.LIZLLL) {
            return YNW.LIZLLL;
        }
        return YNW.LJ;
    }

    public static final float LJIIJ(float f) {
        return (C16880lQ.LLLLL(C15380j0.LIZLLL()).getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public static final int LJIIJJI(int i) {
        return (int) LJIIJ(i);
    }

    public static final float LJIIL(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        if (i <= C53439KyB.LJIIIIZZ) {
            return YNV.LIZ;
        }
        if (i <= C53439KyB.LJFF) {
            return YNV.LIZIZ;
        }
        if (i <= C53439KyB.LIZLLL) {
            return YNV.LIZJ;
        }
        return YNV.LIZLLL;
    }

    public static final InterfaceC30359Bvn LJIILIIL(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (InterfaceC30359Bvn) dataChannel.kv0(C30378Bw6.class);
        }
        return null;
    }

    public static final PreviewHintComponent LJIILJJIL(int i) {
        Context LIZIZ = EF7.LIZIZ();
        String string = LIZIZ.getString(R.string.emf);
        o.LJIIIIZZ(string, "resources.getString(senderHint)");
        TextComponent textComponent = new TextComponent(string);
        String string2 = LIZIZ.getString(R.string.emi);
        o.LJIIIIZZ(string2, "resources.getString(receiverHint)");
        TextComponent textComponent2 = new TextComponent(string2);
        String string3 = LIZIZ.getString(i);
        o.LJIIIIZZ(string3, "resources.getString(preview)");
        return new PreviewHintComponent(textComponent, textComponent2, new TextComponent(string3));
    }

    public static String LJIILLIIL(TEZ tez) {
        String key;
        o.LJIIIZ(tez, "<this>");
        if (tez.LJIIJJI().length() == 0) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ORZ.LJLLLLLL(C78866UxK.LJJIJ(tez), C30581Hy.LJIILJJIL(tez.LJJJJLL().LIZ()));
            if (effectCategoryModel == null || (key = effectCategoryModel.getKey()) == null) {
                return "";
            }
            return key;
        }
        return tez.LJIIJJI();
    }

    public static final int LJIJI(int i) {
        return C04330Ez.LIZIZ(C16880lQ.LLLLL(C15380j0.LIZLLL()), i);
    }

    public static final int LJIJJLI(int i) {
        if (((Boolean) DXQ.LIZIZ.getValue()).booleanValue()) {
            if (i != 3) {
                if (i != 7) {
                    if (i != 26) {
                        if (i != 44) {
                            if (i != 84) {
                                if (i != 534) {
                                    if (i != 36) {
                                        if (i != 37) {
                                            switch (i) {
                                                case 599:
                                                    return EnumC87282YNi.FilterTypeShop.ordinal();
                                                case 600:
                                                    return EnumC87282YNi.FilterTypeAllExceptFollow.ordinal();
                                                case 601:
                                                    return EnumC87282YNi.FilterTypeProfileViewer.ordinal();
                                                case 602:
                                                    return EnumC87282YNi.FilterTypeAllExceptFollowAndShop.ordinal();
                                                default:
                                                    return -1;
                                            }
                                        }
                                        return EnumC87282YNi.FilterFromTiktok.ordinal();
                                    }
                                    return EnumC87282YNi.FilterTimelineAll.ordinal();
                                }
                                return EnumC87282YNi.FilterTypeFollowAndFollowRequest.ordinal();
                            }
                            return EnumC87282YNi.FilterTypeQA.ordinal();
                        }
                        return EnumC87282YNi.FilterComment.ordinal();
                    }
                    return EnumC87282YNi.FilterMention.ordinal();
                }
                return EnumC87282YNi.FilterFollow.ordinal();
            }
            return EnumC87282YNi.FilterLike.ordinal();
        }
        return i;
    }

    public static final HomeTabAbility LJIL(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (HomeTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, HomeTabAbility.class, null);
    }

    public static final boolean LJJ(String input) {
        o.LJIIIZ(input, "input");
        Character.UnicodeBlock of = Character.UnicodeBlock.of(input.charAt(0));
        if (!o.LJ(of, Character.UnicodeBlock.ARABIC) && !o.LJ(of, Character.UnicodeBlock.HEBREW) && !o.LJ(of, Character.UnicodeBlock.THAANA) && !o.LJ(of, Character.UnicodeBlock.SYRIAC) && !o.LJ(of, Character.UnicodeBlock.MANDAIC) && !o.LJ(of, Character.UnicodeBlock.SAMARITAN) && !o.LJ(of, Character.UnicodeBlock.NKO)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(CanvasVideoData canvasVideoData) {
        List<CanvasFilterParam> transformList;
        if (canvasVideoData == null || (transformList = canvasVideoData.getTransformList()) == null || transformList.isEmpty()) {
            return false;
        }
        for (CanvasFilterParam canvasFilterParam : transformList) {
            if (canvasFilterParam.getTransX() != 0.0f || canvasFilterParam.getTransY() != 0.0f || canvasFilterParam.getDegree() != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static final C48462J0g LJJIFFI(InterfaceC88472Yns builder) {
        o.LJIIIZ(builder, "builder");
        return new C48462J0g(builder);
    }

    public static final void LJJIIZ(View view) {
        o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(8, view);
    }

    public static final void LJJIIZI(View view) {
        o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(4, view);
    }

    public static final void LJJIJ(View view) {
        o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(0, view);
    }

    public static final int LJJIJLIJ(int i) {
        if (i == EnumC87282YNi.FilterTimelineAll.ordinal()) {
            return 36;
        }
        if (i == EnumC87282YNi.FilterLike.ordinal()) {
            return 3;
        }
        if (i == EnumC87282YNi.FilterComment.ordinal()) {
            return 44;
        }
        if (i == EnumC87282YNi.FilterMention.ordinal()) {
            return 26;
        }
        if (i == EnumC87282YNi.FilterFollow.ordinal()) {
            return 7;
        }
        if (i == EnumC87282YNi.FilterFromTiktok.ordinal()) {
            return 37;
        }
        if (i == EnumC87282YNi.FilterTypeQA.ordinal()) {
            return 84;
        }
        if (i == EnumC87282YNi.FilterTypeShop.ordinal()) {
            return 599;
        }
        if (i == EnumC87282YNi.FilterTypeAllExceptFollow.ordinal()) {
            return 600;
        }
        if (i == EnumC87282YNi.FilterTypeFollowAndFollowRequest.ordinal()) {
            return 534;
        }
        if (i == EnumC87282YNi.FilterTypeProfileViewer.ordinal()) {
            return 601;
        }
        if (i == EnumC87282YNi.FilterTypeAllExceptFollowAndShop.ordinal()) {
            return 602;
        }
        return 0;
    }

    public static final String LJJIL(LaneParams laneParams) {
        StringBuilder LIZJ = C278817o.LIZJ("{");
        for (Map.Entry<String, Object> entry : laneParams.entrySet()) {
            if (entry.getValue() != null) {
                LIZJ.append("\n\t");
                LIZJ.append(entry.getKey());
                LIZJ.append(":");
                LIZJ.append(String.valueOf(entry.getValue()));
                LIZJ.append(",");
            }
        }
        if (LIZJ.length() > 1) {
            LIZJ.append("\n");
        }
        return C0EH.LIZJ(LIZJ, "}", "builder.toString()");
    }

    public static final EnumC84292X6i LJJIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE toNLEEncodeBitrateMode) {
        o.LJIIIZ(toNLEEncodeBitrateMode, "$this$toNLEEncodeBitrateMode");
        int i = C87279YNf.LJ[toNLEEncodeBitrateMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC84292X6i.ENCODE_BITRATE_ABR;
                    }
                    return EnumC84292X6i.ENCODE_BITRATE_VBR;
                }
                return EnumC84292X6i.ENCODE_BITRATE_QP;
            }
            return EnumC84292X6i.ENCODE_BITRATE_CRF;
        }
        return EnumC84292X6i.ENCODE_BITRATE_ABR;
    }

    public static final float LJJJ(ROTATE_DEGREE rotate_degree) {
        int i = C87279YNf.LJIIJ[rotate_degree.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 0.0f;
                }
                return 90.0f;
            }
            return 180.0f;
        }
        return 270.0f;
    }

    public static final NLEVideoCompileEncodeSettings LJJJI(VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings) {
        EnumC87280YNg enumC87280YNg;
        NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_useHWEncoder_set(nLEVideoCompileEncodeSettings.LIZ, nLEVideoCompileEncodeSettings, vEVideoCompileEncodeSettings.useHWEncoder);
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_enableHwBufferEncode_set(nLEVideoCompileEncodeSettings.LIZ, nLEVideoCompileEncodeSettings, vEVideoCompileEncodeSettings.enableHwBufferEncode);
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_isSupportHWEncoder_set(nLEVideoCompileEncodeSettings.LIZ, nLEVideoCompileEncodeSettings, vEVideoCompileEncodeSettings.isSupportHWEncoder);
        VEVideoHWEncodeSettings mHWEncodeSetting = vEVideoCompileEncodeSettings.mHWEncodeSetting;
        o.LJIIIIZZ(mHWEncodeSetting, "mHWEncodeSetting");
        NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings = new NLEVideoHWEncodeSettings();
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mBitrate_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, mHWEncodeSetting.mBitrate);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mProfile_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, LJJJIL(VEVideoEncodeProfile.values()[mHWEncodeSetting.mProfile]).swigValue());
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mHp_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.mHp_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mFullHd_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.mFullHd_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mSd_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.mSd_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mH_fps_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.mH_fps_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_transition_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.transition_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_m2K_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.m2K_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_m4K_bitrate_ratio_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, (float) mHWEncodeSetting.m4K_bitrate_ratio);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mGop_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, mHWEncodeSetting.mGop);
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mCodecType_set(nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings, mHWEncodeSetting.mCodecType);
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mHWEncodeSetting_set(nLEVideoCompileEncodeSettings.LIZ, nLEVideoCompileEncodeSettings, nLEVideoHWEncodeSettings.LIZ, nLEVideoHWEncodeSettings);
        VEVideoSWEncodeSettings mSWEncodeSetting = vEVideoCompileEncodeSettings.mSWEncodeSetting;
        o.LJIIIIZZ(mSWEncodeSetting, "mSWEncodeSetting");
        NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings = new NLEVideoSWEncodeSettings();
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mCrf_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, mSWEncodeSetting.mCrf);
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mQPOffset_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, mSWEncodeSetting.mQPOffset);
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBps_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, mSWEncodeSetting.mBps);
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBitrateMode_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, LJJIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values()[mSWEncodeSetting.mBitrateMode]).swigValue());
        VEVideoEncodePreset toNLEEncodePreset = VEVideoEncodePreset.values()[mSWEncodeSetting.mPreset];
        o.LJIIIZ(toNLEEncodePreset, "$this$toNLEEncodePreset");
        switch (C87279YNf.LJFF[toNLEEncodePreset.ordinal()]) {
            case 1:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_FAST;
                break;
            case 2:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_FASTER;
                break;
            case 3:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_MEDIUM;
                break;
            case 4:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_PLACEBO;
                break;
            case 5:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_SLOW;
                break;
            case 6:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_SLOWER;
                break;
            case 7:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_SUPERFAST;
                break;
            case 8:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_ULTRAFAST;
                break;
            case 9:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_VERYFAST;
                break;
            case 10:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_VERYSLOW;
                break;
            default:
                enumC87280YNg = EnumC87280YNg.ENCODE_LEVEL_ULTRAFAST;
                break;
        }
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mPreset_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, enumC87280YNg.swigValue());
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mProfile_set(nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings, LJJJIL(VEVideoEncodeProfile.values()[mSWEncodeSetting.mProfile]).swigValue());
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mSWEncodeSetting_set(nLEVideoCompileEncodeSettings.LIZ, nLEVideoCompileEncodeSettings, nLEVideoSWEncodeSettings.LIZ, nLEVideoSWEncodeSettings);
        return nLEVideoCompileEncodeSettings;
    }

    public static final EnumC87281YNh LJJJIL(VEVideoEncodeProfile toNLEVideoEncodeProfile) {
        o.LJIIIZ(toNLEVideoEncodeProfile, "$this$toNLEVideoEncodeProfile");
        int i = C87279YNf.LIZJ[toNLEVideoEncodeProfile.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC87281YNh.ENCODE_PROFILE_UNKNOWN;
                    }
                    return EnumC87281YNh.ENCODE_PROFILE_MAIN;
                }
                return EnumC87281YNh.ENCODE_PROFILE_HIGH;
            }
            return EnumC87281YNh.ENCODE_PROFILE_BASELINE;
        }
        return EnumC87281YNh.ENCODE_PROFILE_UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings LJJJJ(com.ss.android.vesdk.VEVideoEncodeSettings r21) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87277YNd.LJJJJ(com.ss.android.vesdk.VEVideoEncodeSettings):com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings");
    }

    public static final YBS LJJJJI(VEWaterMarkPosition vEWaterMarkPosition) {
        int i = C87279YNf.LJII[vEWaterMarkPosition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return YBS.TL_BR;
                        }
                        return YBS.TR;
                    }
                    return YBS.TL_BR;
                }
                return YBS.TL;
            }
            return YBS.BR;
        }
        return YBS.BL;
    }

    public static final String LJJJJIZL(float f) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }

    public static final void LJJJJJ(String content) {
        o.LJIIIZ(content, "content");
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            C30868C9o.LJI(content);
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        int i;
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        Integer LIZJ = output.LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public static final int LIZ(AbstractC45981rG abstractC45981rG, AbstractC272415c abstractC272415c) {
        AbstractC45981rG LJLILLLLZI2 = abstractC45981rG.LJLILLLLZI();
        if (LJLILLLLZI2 != null) {
            if (abstractC45981rG.LJLJJLL().LJI().containsKey(abstractC272415c)) {
                Integer num = abstractC45981rG.LJLJJLL().LJI().get(abstractC272415c);
                if (num == null) {
                    return LiveLayoutPreloadThreadPriority.DEFAULT;
                }
                return num.intValue();
            }
            int LJJJJ = LJLILLLLZI2.LJJJJ(abstractC272415c);
            if (LJJJJ == Integer.MIN_VALUE) {
                return LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            LJLILLLLZI2.LJLJJL = true;
            abstractC45981rG.LJLJJLL = true;
            abstractC45981rG.LJLL();
            LJLILLLLZI2.LJLJJL = false;
            abstractC45981rG.LJLJJLL = false;
            if (abstractC272415c instanceof C39161gG) {
                return C23450w1.LIZJ(LJLILLLLZI2.LJLJLJ()) + LJJJJ;
            }
            return ((int) (LJLILLLLZI2.LJLJLJ() >> 32)) + LJJJJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Child of ");
        LIZ.append(abstractC45981rG);
        LIZ.append(" cannot be null when calculating alignment line");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public static final float LJFF(Context context, float f) {
        o.LJIIIZ(context, "context");
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final int LJI(int i, Context context) {
        o.LJIIIZ(context, "context");
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final int LJIILL(TEZ tez, String categoryKey) {
        CategoryEffectModel LJI;
        List<Effect> effects;
        o.LJIIIZ(tez, "<this>");
        o.LJIIIZ(categoryKey, "categoryKey");
        if (categoryKey.length() == 0 || (LJI = C30581Hy.LJI(tez.LJJJJLL().LIZ(), categoryKey)) == null || (effects = LJI.getEffects()) == null) {
            return 0;
        }
        return effects.size();
    }

    public static final OSZ LJIIZILJ(TEZ tez, String categoryKey) {
        List<OSZ> LJJLJLI;
        o.LJIIIZ(tez, "<this>");
        o.LJIIIZ(categoryKey, "categoryKey");
        if (categoryKey.length() == 0) {
            LJJLJLI = C61878OQg.INSTANCE;
        } else {
            HashMap hashMap = new HashMap();
            for (TJT tjt : tez.LJJJJLL().LIZ().LIZLLL(categoryKey)) {
                String str = tjt.LJLJI;
                String str2 = tjt.LJLIL;
                if (str2 == null) {
                    str2 = "";
                }
                if (str != null && str.length() > 0) {
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        hashMap.put(str, obj);
                    }
                    ((java.util.Set) obj).add(str2);
                }
            }
            LJJLJLI = C5UN.LJJLJLI(hashMap);
        }
        Gson LIZ = C60903NvH.LJIIJJI().LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJLJLI, 10));
        for (OSZ osz : LJJLJLI) {
            arrayList.add(C51029K0z.LJJIIZI(new OSZ(osz.getFirst(), Integer.valueOf(((java.util.Set) osz.getSecond()).size()))));
        }
        String json = GsonProtectorUtils.toJson(LIZ, arrayList);
        Gson LIZ2 = C60903NvH.LJIIJJI().LIZ();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJLJLI, 10));
        for (OSZ osz2 : LJJLJLI) {
            arrayList2.add(C51029K0z.LJJIIZI(new OSZ(osz2.getFirst(), ORZ.LLD((Iterable) osz2.getSecond(), ",", null, null, null, 62))));
        }
        return new OSZ(json, GsonProtectorUtils.toJson(LIZ2, arrayList2));
    }

    public static final String LJIJ(DraftViewInfo draftViewInfo, Context context) {
        long j;
        String string;
        Resources resources;
        String quantityString;
        if (draftViewInfo.LIZ < System.currentTimeMillis()) {
            long j2 = draftViewInfo.LIZ;
            if (j2 > 0) {
                int i = 3;
                int currentTimeMillis = 3 - ((int) ((System.currentTimeMillis() - j2) / 86400000));
                if (currentTimeMillis <= 3) {
                    i = currentTimeMillis;
                }
                if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(R.plurals.s8, i, Integer.valueOf(i))) == null) {
                    return "";
                }
                return quantityString;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        if (GNP.LIZ()) {
            j = draftViewInfo.draftShowInfo.saveTime;
        } else {
            j = draftViewInfo.draftShowInfo.time;
        }
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            if (context != null && (string = context.getString(R.string.sb6)) != null) {
                return string;
            }
            return "Today";
        }
        long timeInMillis = calendar2.getTimeInMillis();
        BDDateFormat bDDateFormat = new BDDateFormat("L");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        return bDDateFormat.LIZIZ(timeInMillis, locale);
    }

    public static final void LJJIII(int i, View view) {
        o.LJIIIZ(view, "<this>");
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C65502he(i, view, null), 2);
    }

    public static final void LJJIIJ(int i, ImageView imageView) {
        o.LJIIIZ(imageView, "<this>");
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C65512hf(i, imageView, null), 2);
    }

    public static final void LJJIIJZLJL(C47121t6 c47121t6, int i) {
        if (c47121t6 != null) {
            c47121t6.setTextColor(C15380j0.LIZIZ(i));
        }
    }

    public static final void LJJIJIIJI(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        } else {
            if (view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public static final void LJJIJIIJIL(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        } else {
            if (view.getVisibility() == 4) {
                return;
            }
            view.setVisibility(4);
        }
    }

    public static final void LJJIJIL(SharePackage sharePackage, IMContact contact) {
        o.LJIIIZ(contact, "contact");
        sharePackage.extras.putInt("is_create_group_chat", 0);
        if (contact instanceof IMUser) {
            sharePackage.extras.putInt("friends_shared_cnt", 1);
        } else {
            if (!(contact instanceof IMConversation)) {
                return;
            }
            sharePackage.extras.putInt("friends_shared_cnt", ((IMConversation) contact).getConversationMemberCount());
        }
    }

    public static final void LJJIJL(SharePackage sharePackage, List contactList) {
        o.LJIIIZ(sharePackage, "<this>");
        o.LJIIIZ(contactList, "contactList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : contactList) {
            if (obj instanceof IMUser) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((IMUser) it.next()).getUid());
        }
        String LIZIZ = C58314Muc.LIZIZ(arrayList2.toString(), 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : contactList) {
            if (obj2 instanceof IMConversation) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((IMConversation) it2.next()).getConversationId());
        }
        String LIZIZ2 = C58314Muc.LIZIZ(arrayList3.toString(), 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
        int size = arrayList.size();
        int size2 = contactList.size() - size;
        Bundle bundle = sharePackage.extras;
        bundle.putString("shareIdList", LIZIZ);
        bundle.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
        bundle.putString("conversationIdList", LIZIZ2);
        bundle.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", size2);
    }

    public static final void LJJJJJL(LaneParams laneParams, String str) {
        o.LJIIIZ(laneParams, "<this>");
        if (str == null) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "json.keys()");
            while (keys.hasNext()) {
                String it = keys.next();
                o.LJIIIIZZ(it, "it");
                hashMap.put(it, jSONObject.get(it));
            }
            laneParams.withNotCheckParams(hashMap);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void LJJII(V8O v8o, Object obj, Object obj2) {
        ((HashMap) v8o.LIZLLL).put(obj, obj2);
    }

    @Override // X.InterfaceC14120gy
    public void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
    }
}
