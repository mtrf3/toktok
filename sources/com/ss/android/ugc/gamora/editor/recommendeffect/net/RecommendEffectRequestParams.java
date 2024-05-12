package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class RecommendEffectRequestParams {

    @InterfaceC65349Pkn("algorithm_key")
    public final String algorithmKey;

    @InterfaceC65349Pkn("app_version")
    public final String appVersion;

    @InterfaceC65349Pkn("content_source")
    public final String contentSource;

    @InterfaceC65349Pkn("effect_id_list")
    public final String effectIdList;

    @InterfaceC65349Pkn("is_multi_content")
    public final String isMultiContent;

    @InterfaceC65349Pkn("material_type")
    public final String materialType;

    @InterfaceC65349Pkn("mix_type")
    public final String mixType;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("prop_id_list")
    public final String propIdList;

    @InterfaceC65349Pkn("original_resolution_list")
    public final List<String> resolutionList;

    @InterfaceC65349Pkn("count")
    public final int returnSize;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdkVersion;

    @InterfaceC65349Pkn("shoot_way")
    public final String shootWay;

    @InterfaceC65349Pkn("sticker_id_list")
    public final String stickerIdList;

    @InterfaceC65349Pkn("text_list")
    public final String textList;

    @InterfaceC65349Pkn("tos_url")
    public final String tosUrl;

    @InterfaceC65349Pkn("video_length_list")
    public final List<Float> videoLengthList;

    public RecommendEffectRequestParams() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public RecommendEffectRequestParams(int i, String tosUrl, String appVersion, String sdkVersion, String algorithmKey, List<String> resolutionList, List<Float> videoLengthList, String shootWay, String contentSource, String materialType, String isMultiContent, String mixType, String musicId, String stickerIdList, String effectIdList, String propIdList, String textList) {
        o.LJIIIZ(tosUrl, "tosUrl");
        o.LJIIIZ(appVersion, "appVersion");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        o.LJIIIZ(algorithmKey, "algorithmKey");
        o.LJIIIZ(resolutionList, "resolutionList");
        o.LJIIIZ(videoLengthList, "videoLengthList");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(contentSource, "contentSource");
        o.LJIIIZ(materialType, "materialType");
        o.LJIIIZ(isMultiContent, "isMultiContent");
        o.LJIIIZ(mixType, "mixType");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(stickerIdList, "stickerIdList");
        o.LJIIIZ(effectIdList, "effectIdList");
        o.LJIIIZ(propIdList, "propIdList");
        o.LJIIIZ(textList, "textList");
        this.returnSize = i;
        this.tosUrl = tosUrl;
        this.appVersion = appVersion;
        this.sdkVersion = sdkVersion;
        this.algorithmKey = algorithmKey;
        this.resolutionList = resolutionList;
        this.videoLengthList = videoLengthList;
        this.shootWay = shootWay;
        this.contentSource = contentSource;
        this.materialType = materialType;
        this.isMultiContent = isMultiContent;
        this.mixType = mixType;
        this.musicId = musicId;
        this.stickerIdList = stickerIdList;
        this.effectIdList = effectIdList;
        this.propIdList = propIdList;
        this.textList = textList;
    }

    public RecommendEffectRequestParams(int i, String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "editing_effect_rec_mvp" : str4, (i2 & 32) != 0 ? C61878OQg.INSTANCE : list, (i2 & 64) != 0 ? C61878OQg.INSTANCE : list2, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & FileUtils.BUFFER_SIZE) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (32768 & i2) != 0 ? "" : str13, (i2 & 65536) == 0 ? str14 : "");
    }
}
