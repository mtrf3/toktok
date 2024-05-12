package com.ss.android.ugc.aweme.mvtheme;

import X.C78886Uxe;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class MvCreateVideoData implements Serializable {

    @InterfaceC65349Pkn("beat_mv_bit_info")
    public BeatMvInfo beatMvInfo;

    @InterfaceC65349Pkn("birthday_bless_mv_param")
    public BirthdayBlessMvParam birthdayBlessMvParam;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("mv_contact_video_path")
    public String contactVideoPath;

    @InterfaceC65349Pkn("enable_mv_origin_audio")
    public boolean enableOriginAudio;

    @InterfaceC65349Pkn("is_beat_mv")
    public boolean isBeatMv;

    @InterfaceC65349Pkn("is_mv_rs_1080p")
    public boolean isMVRes1080p;

    @InterfaceC65349Pkn("is_media_template")
    public boolean isMediaTemplate;

    @InterfaceC65349Pkn("is_mixed_template")
    public boolean isMixedTemPlate;

    @InterfaceC65349Pkn("is_red_packet_mv")
    public boolean isRedPacketMv;

    @InterfaceC65349Pkn("is_upload_sticker")
    public boolean isUploadSticker;

    @InterfaceC65349Pkn("is_use_rgba_mode")
    public boolean isUseRGBAMode;

    @InterfaceC65349Pkn("ktv_audio_durations")
    public int[] ktvAudioDurations;

    @InterfaceC65349Pkn("ktv_audio_paths")
    public String[] ktvAudioPaths;

    @InterfaceC65349Pkn("ktv_mode")
    public int mode;

    @InterfaceC65349Pkn("mv_video_music_ids")
    public List<String> musicIds;

    @InterfaceC65349Pkn("mv_auto_save_toast")
    public String mvAutoSaveToast;

    @InterfaceC65349Pkn("mv_durations")
    public ArrayList<Integer> mvDurations;

    @InterfaceC65349Pkn("mv_id")
    public String mvId;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("mv_video_res_unzippath")
    public String mvResUnzipPath;

    @InterfaceC65349Pkn("mv_type")
    public int mvType;

    @InterfaceC65349Pkn("origin_mv_id")
    public String originMvId;

    @InterfaceC65349Pkn("rgba_mode_res_ratio")
    public int resRatio;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("mv_video_cover")
    public String videoCoverImgPath;

    @InterfaceC65349Pkn("mv_video_cover_starttime")
    public int videoCoverStartTime;

    @InterfaceC65349Pkn("source_item_list")
    public ArrayList<MvSourceItemInfo> sourceItemList = new ArrayList<>();

    @InterfaceC43620HAa(blockCreative = true)
    @InterfaceC65349Pkn("select_media_list")
    public ArrayList<String> selectMediaList = new ArrayList<>();

    @InterfaceC65349Pkn("select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();

    @InterfaceC65349Pkn("select_src_media_types")
    public ArrayList<String> srcSelectMediaListTypes = new ArrayList<>();

    @InterfaceC65349Pkn("local_algorithm_materials")
    public ArrayList<String> localAlgorithmMaterials = new ArrayList<>();

    @InterfaceC65349Pkn("mask_file_data")
    public ArrayList<Object> maskFileData = new ArrayList<>();

    @InterfaceC65349Pkn("new_mask_file_data")
    public ArrayList<MvNetFileBean> newMaskFileData = new ArrayList<>();

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("photo_to_save")
    public ArrayList<String> photoToSave = new ArrayList<>();

    @InterfaceC65349Pkn("is_slideshow_mode")
    public boolean isSlideshowMode = false;

    @InterfaceC65349Pkn("is_new_year_wish")
    public boolean isNewYearWish = false;

    @InterfaceC65349Pkn("res_fill_mode")
    public int resFillMode = 0;

    @InterfaceC65349Pkn("res_dest_width")
    public int resDestWidth = 0;

    @InterfaceC65349Pkn("res_dest_height")
    public int resDestHeight = 0;

    @InterfaceC65349Pkn("mv_extra_info")
    public String[] mvExtraInfo = null;

    public int getImageCount() {
        if (!C78886Uxe.LJJIJ(this.selectMediaList)) {
            return this.selectMediaList.size();
        }
        if (!C78886Uxe.LJJIJ(this.sourceItemList)) {
            return this.sourceItemList.size();
        }
        return 0;
    }

    public boolean isBeatMvValidate() {
        if (this.isBeatMv && this.beatMvInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isBirthdayBlessMv() {
        if (this.birthdayBlessMvParam != null) {
            return true;
        }
        return false;
    }
}
