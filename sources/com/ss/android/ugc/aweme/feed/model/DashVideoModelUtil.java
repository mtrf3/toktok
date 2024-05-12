package com.ss.android.ugc.aweme.feed.model;

import X.C61878OQg;
import X.ORZ;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class DashVideoModelUtil {
    public static final Companion Companion = new Companion();

    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final String getDashJsonStrFromVideo(Video video) {
            Object obj;
            Long l;
            String str;
            Long l2;
            Long l3;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            BitrateUrlStruct urlList;
            BitrateUrlStruct urlList2;
            BitrateUrlStruct urlList3;
            JSONObject jSONObject;
            int bitRate;
            String optString;
            String str8;
            Integer num;
            Integer num2;
            String str9;
            String optString2;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15 = null;
            if (video != null && video.hasDashBitrate()) {
                List<BitRate> rawBitRate = video.getRawBitRate();
                if (rawBitRate == null) {
                    rawBitRate = C61878OQg.INSTANCE;
                }
                List<BitrateAudioStruct> list = video.bitRateAudio;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                String str16 = video.meta;
                VideoUrlModel videoUrlModel = video.playAddr;
                if (videoUrlModel != null) {
                    obj = videoUrlModel.getOriginUri();
                } else {
                    obj = null;
                }
                int duration = video.getDuration();
                if ((!rawBitRate.isEmpty()) || (!list.isEmpty())) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str16);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("enable_video_dash_reconstruct", 1);
                        jSONObject3.put("video_meta", jSONObject2.optString("video_meta"));
                        jSONObject3.put("video_id", obj);
                        jSONObject3.put("video_duration", duration);
                        jSONObject3.put("media_type", "video");
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("dynamic_type", "segment_base");
                        JSONArray jSONArray = new JSONArray();
                        for (BitRate bitRate2 : rawBitRate) {
                            try {
                                if (!TextUtils.isEmpty(bitRate2.videoExtra)) {
                                    jSONObject = new JSONObject(bitRate2.videoExtra);
                                } else {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    bitRate = jSONObject.optInt("real_bitrate", bitRate2.getBitRate());
                                } else {
                                    bitRate = bitRate2.getBitRate();
                                }
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("real_bitrate", bitRate);
                                jSONObject5.put("fps", bitRate2.fps);
                                if (jSONObject == null) {
                                    optString = null;
                                } else {
                                    optString = jSONObject.optString("definition");
                                }
                                jSONObject5.put("definition", optString);
                                if (jSONObject == null) {
                                    str8 = null;
                                } else {
                                    str8 = jSONObject.optString("quality");
                                }
                                jSONObject5.put("quality", str8);
                                jSONObject5.put("vtype", "dash");
                                UrlModel playAddr = bitRate2.getPlayAddr();
                                if (playAddr != null) {
                                    num = Integer.valueOf(playAddr.getWidth());
                                } else {
                                    num = null;
                                }
                                jSONObject5.put("vwidth", num);
                                UrlModel playAddr2 = bitRate2.getPlayAddr();
                                if (playAddr2 != null) {
                                    num2 = Integer.valueOf(playAddr2.getHeight());
                                } else {
                                    num2 = null;
                                }
                                jSONObject5.put("vheight", num2);
                                jSONObject5.put("bitrate", bitRate2.getBitRate());
                                jSONObject5.put("size", bitRate2.getSize());
                                int isBytevc1 = bitRate2.isBytevc1();
                                String str17 = "h264";
                                if (isBytevc1 != 0) {
                                    if (isBytevc1 != 1) {
                                        if (isBytevc1 == 2) {
                                            str17 = "bytevc2";
                                        }
                                    } else {
                                        str17 = "bytevc1";
                                    }
                                }
                                jSONObject5.put("codec_type", str17);
                                UrlModel playAddr3 = bitRate2.getPlayAddr();
                                if (playAddr3 != null) {
                                    str9 = playAddr3.getFileHash();
                                } else {
                                    str9 = null;
                                }
                                jSONObject5.put("file_hash", str9);
                                if (jSONObject == null) {
                                    optString2 = null;
                                } else {
                                    optString2 = jSONObject.optString("file_id");
                                }
                                jSONObject5.put("file_id", optString2);
                                List<String> urlList4 = bitRate2.urlList();
                                if (urlList4 != null && (str14 = (String) ORZ.LJLLLLLL(0, urlList4)) != null) {
                                    jSONObject5.put("main_url", str14);
                                }
                                List<String> urlList5 = bitRate2.urlList();
                                if (urlList5 != null && (str13 = (String) ORZ.LJLLLLLL(1, urlList5)) != null) {
                                    jSONObject5.put("backup_url_1", str13);
                                }
                                List<String> urlList6 = bitRate2.urlList();
                                if (urlList6 != null && (str12 = (String) ORZ.LJLLLLLL(2, urlList6)) != null) {
                                    jSONObject5.put("backup_url_2", str12);
                                }
                                List<String> urlList7 = bitRate2.urlList();
                                if (urlList7 != null && (str11 = (String) ORZ.LJLLLLLL(3, urlList7)) != null) {
                                    jSONObject5.put("backup_url_3", str11);
                                }
                                if (jSONObject == null) {
                                    str10 = null;
                                } else {
                                    str10 = jSONObject.optString("sub_info");
                                }
                                jSONObject5.put("sub_info", str10);
                                jSONArray.put(jSONObject5);
                                str15 = null;
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                        jSONObject4.put("dynamic_video_list", jSONArray);
                        JSONArray jSONArray2 = new JSONArray();
                        for (BitrateAudioStruct bitrateAudioStruct : list) {
                            JSONObject jSONObject6 = new JSONObject();
                            BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta != null) {
                                l = Long.valueOf(audioMeta.getBitrate());
                            } else {
                                l = null;
                            }
                            jSONObject6.put("real_bitrate", l);
                            BitrateMetaStruct audioMeta2 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta2 != null) {
                                str = audioMeta2.getQuality();
                            } else {
                                str = null;
                            }
                            jSONObject6.put("quality", str);
                            jSONObject6.put("vtype", "dash");
                            BitrateMetaStruct audioMeta3 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta3 != null) {
                                l2 = Long.valueOf(audioMeta3.getBitrate());
                            } else {
                                l2 = null;
                            }
                            jSONObject6.put("bitrate", l2);
                            BitrateMetaStruct audioMeta4 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta4 != null) {
                                l3 = Long.valueOf(audioMeta4.getSize());
                            } else {
                                l3 = null;
                            }
                            jSONObject6.put("size", l3);
                            BitrateMetaStruct audioMeta5 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta5 != null) {
                                str2 = audioMeta5.getCodecType();
                            } else {
                                str2 = null;
                            }
                            jSONObject6.put("codec_type", str2);
                            BitrateMetaStruct audioMeta6 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta6 != null) {
                                str3 = audioMeta6.getFileHash();
                            } else {
                                str3 = null;
                            }
                            jSONObject6.put("file_hash", str3);
                            BitrateMetaStruct audioMeta7 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta7 != null && (urlList3 = audioMeta7.getUrlList()) != null) {
                                str4 = urlList3.getMainUrl();
                            } else {
                                str4 = null;
                            }
                            jSONObject6.put("main_url", str4);
                            BitrateMetaStruct audioMeta8 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta8 != null && (urlList2 = audioMeta8.getUrlList()) != null) {
                                str5 = urlList2.getBackupUrl();
                            } else {
                                str5 = null;
                            }
                            jSONObject6.put("backup_url_1", str5);
                            BitrateMetaStruct audioMeta9 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta9 != null && (urlList = audioMeta9.getUrlList()) != null) {
                                str6 = urlList.getFallbackUrl();
                            } else {
                                str6 = null;
                            }
                            jSONObject6.put("backup_url_2", str6);
                            BitrateMetaStruct audioMeta10 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta10 != null) {
                                str7 = audioMeta10.getSubInfo();
                            } else {
                                str7 = null;
                            }
                            jSONObject6.put("sub_info", str7);
                            jSONArray2.put(jSONObject6);
                        }
                        jSONObject4.put("dynamic_audio_list", jSONArray2);
                        jSONObject3.put("dynamic_video", jSONObject4);
                        return jSONObject3.toString();
                    } catch (Throwable unused2) {
                        return str15;
                    }
                }
            }
            return null;
        }
    }
}
