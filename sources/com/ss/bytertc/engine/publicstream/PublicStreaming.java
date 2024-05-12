package com.ss.bytertc.engine.publicstream;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class PublicStreaming {
    public String action = "";
    public AudioConfig audio;
    public Layout layout;
    public String roomId;
    public VideoConfig video;

    /* loaded from: classes33.dex */
    public static class Layout {
        public String backgroundColor;
        public String backgroundImage;
        public int interpolationMode;
        public int layoutMode;
        public Region[] regions;

        /* loaded from: classes33.dex */
        public static class Builder {
            public int interpolationMode;
            public ArrayList<Region> regions;
            public int layoutMode = 2;
            public String backgroundImage = "";
            public String backgroundColor = "#000000";

            public Layout build() {
                Layout layout = new Layout();
                ArrayList<Region> arrayList = this.regions;
                if (arrayList != null) {
                    layout.regions = (Region[]) arrayList.toArray(new Region[arrayList.size()]);
                }
                layout.interpolationMode = this.interpolationMode;
                layout.layoutMode = this.layoutMode;
                layout.backgroundImage = this.backgroundImage;
                layout.backgroundColor = this.backgroundColor;
                return layout;
            }

            public Builder addRegoin(Region region) {
                if (this.regions == null) {
                    this.regions = new ArrayList<>();
                }
                this.regions.add(region);
                return this;
            }

            public Builder backgroundColor(String str) {
                this.backgroundColor = str;
                return this;
            }

            public Builder backgroundImage(String str) {
                this.backgroundImage = str;
                return this;
            }

            public Builder interpolationMode(int i) {
                this.interpolationMode = i;
                return this;
            }

            public Builder layoutMode(int i) {
                this.layoutMode = i;
                return this;
            }
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                Region[] regionArr = this.regions;
                if (regionArr != null) {
                    for (Region region : regionArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject3.put("userId", region.userId);
                        jSONObject3.put("roomId", region.roomId);
                        jSONObject3.put("alternateImage", region.alternateImage);
                        jSONObject3.put("x", region.x);
                        jSONObject3.put("y", region.y);
                        jSONObject3.put("w", region.w);
                        jSONObject3.put("h", region.h);
                        jSONObject3.put("zorder", region.zorder);
                        jSONObject3.put("alpha", region.alpha);
                        jSONObject3.put("streamType", region.streamType);
                        jSONObject3.put("mediaType", region.mediaType);
                        jSONObject3.put("renderMode", region.renderMode);
                        jSONObject4.put("x", region.sourceCrop.locationX);
                        jSONObject4.put("y", region.sourceCrop.locationY);
                        jSONObject4.put("w", region.sourceCrop.widthProportion);
                        jSONObject4.put("h", region.sourceCrop.heightProportion);
                        jSONObject3.put("sourceCrop", jSONObject4);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("regions", jSONArray);
                jSONObject2.put("bgColor", this.backgroundColor);
                jSONObject2.put("bgImage", this.backgroundImage);
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("layoutMode", this.layoutMode);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogUtil.w("PublicStreaming", "create layout json message happens exception", e);
                return null;
            }
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        public int getInterpolationMode() {
            return this.interpolationMode;
        }

        public int getLayoutMode() {
            return this.layoutMode;
        }

        public Region[] getRegions() {
            return this.regions;
        }

        /* loaded from: classes33.dex */
        public static class Region {
            public double alpha;
            public String alternateImage;
            public double h;
            public int mediaType;
            public int renderMode;
            public String roomId;
            public SourceCrop sourceCrop = new SourceCrop();
            public int streamType;
            public String userId;
            public double w;
            public double x;
            public double y;
            public int zorder;

            public Region alpha(double d) {
                this.alpha = d;
                return this;
            }

            public Region mediaType(int i) {
                this.mediaType = i;
                return this;
            }

            public Region renderMode(int i) {
                this.renderMode = i;
                return this;
            }

            public Region roomId(String str) {
                this.roomId = str;
                return this;
            }

            public Region streamType(int i) {
                this.streamType = i;
                return this;
            }

            public Region userId(String str) {
                this.userId = str;
                return this;
            }

            public Region zorder(int i) {
                this.zorder = i;
                return this;
            }

            public Region position(double d, double d2) {
                this.x = d;
                this.y = d2;
                return this;
            }

            public Region size(double d, double d2) {
                this.w = d;
                this.h = d2;
                return this;
            }

            public Region sourceCropPosition(double d, double d2) {
                SourceCrop sourceCrop = this.sourceCrop;
                sourceCrop.locationX = d;
                sourceCrop.locationY = d2;
                return this;
            }

            public Region sourceCropSize(double d, double d2) {
                SourceCrop sourceCrop = this.sourceCrop;
                sourceCrop.widthProportion = d;
                sourceCrop.heightProportion = d2;
                return this;
            }
        }

        public void setBackgroundColor(String str) {
            this.backgroundColor = str;
        }

        public void setBackgroundImage(String str) {
            this.backgroundImage = str;
        }

        public void setInterpolationMode(int i) {
            this.interpolationMode = i;
        }

        public void setLayoutMode(int i) {
            this.layoutMode = i;
        }

        public void setRegions(Region[] regionArr) {
            this.regions = regionArr;
        }
    }

    public static PublicStreaming getDefualtPublicStreaming() {
        VideoConfig videoConfig = new VideoConfig();
        videoConfig.setFps(30);
        videoConfig.setKBitRate(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        videoConfig.setHeight(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
        videoConfig.setWidth(360);
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setSampleRate(44100);
        audioConfig.setChannels(1);
        audioConfig.setKBitRate(16);
        Layout.Builder builder = new Layout.Builder();
        builder.backgroundColor("#000000");
        builder.backgroundImage("");
        PublicStreaming publicStreaming = new PublicStreaming();
        publicStreaming.setAudio(audioConfig);
        publicStreaming.setVideo(videoConfig);
        publicStreaming.setLayout(builder.build());
        return publicStreaming;
    }

    public JSONObject getPublicStreamMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject.put("fps", this.video.fps);
            jSONObject.put("bitrate", this.video.bitRate);
            jSONObject.put("width", this.video.width);
            jSONObject.put("height", this.video.height);
            jSONObject2.put("bitrate", this.audio.bitRate);
            jSONObject2.put("sampleRate", this.audio.sampleRate);
            jSONObject2.put("channels", this.audio.channels);
            jSONObject4.put("bgColor", this.layout.backgroundColor);
            jSONObject4.put("bgImage", this.layout.backgroundImage);
            Layout.Region[] regionArr = this.layout.regions;
            if (regionArr != null) {
                for (Layout.Region region : regionArr) {
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject7.put("userId", region.userId);
                    jSONObject7.put("roomId", region.roomId);
                    jSONObject7.put("alternateImage", region.alternateImage);
                    jSONObject7.put("x", region.x);
                    jSONObject7.put("y", region.y);
                    jSONObject7.put("w", region.w);
                    jSONObject7.put("h", region.h);
                    jSONObject7.put("zorder", region.zorder);
                    jSONObject7.put("alpha", region.alpha);
                    jSONObject7.put("streamType", region.streamType);
                    jSONObject7.put("mediaType", region.mediaType);
                    jSONObject7.put("renderMode", region.renderMode);
                    jSONObject8.put("x", region.sourceCrop.locationX);
                    jSONObject8.put("y", region.sourceCrop.locationY);
                    jSONObject8.put("w", region.sourceCrop.widthProportion);
                    jSONObject8.put("h", region.sourceCrop.heightProportion);
                    jSONObject7.put("sourceCrop", jSONObject8);
                    jSONArray.put(jSONObject7);
                }
            }
            jSONObject3.put("canvas", jSONObject4);
            jSONObject3.put("regions", jSONArray);
            jSONObject3.put("layoutMode", this.layout.layoutMode);
            jSONObject3.put("interpolationMode", this.layout.interpolationMode);
            jSONObject5.put("video", jSONObject);
            jSONObject5.put("audio", jSONObject2);
            jSONObject5.put("layout", jSONObject3);
            jSONObject6.put("type", "publicstream");
            jSONObject6.put("roomId", this.roomId);
            jSONObject6.put("action", this.action);
            jSONObject6.put("publicStreamMeta", jSONObject5);
            return jSONObject6;
        } catch (JSONException e) {
            LogUtil.w("PublicStreaming", "get json message happen exception", e);
            return null;
        }
    }

    public AudioConfig getAudio() {
        return this.audio;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public VideoConfig getVideo() {
        return this.video;
    }

    /* loaded from: classes33.dex */
    public static class AudioConfig {
        public int bitRate = 16000;
        public int sampleRate = 44100;
        public int channels = 1;

        public AudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public AudioConfig setKBitRate(int i) {
            this.bitRate = i * 1000;
            return this;
        }

        public AudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class SourceCrop {
        public double heightProportion;
        public double locationX;
        public double locationY;
        public double widthProportion;

        public SourceCrop setHeightProportion(double d) {
            this.heightProportion = d;
            return this;
        }

        public SourceCrop setLocationX(double d) {
            this.locationX = d;
            return this;
        }

        public SourceCrop setLocationY(double d) {
            this.locationY = d;
            return this;
        }

        public SourceCrop setWidthProportion(double d) {
            this.widthProportion = d;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class VideoConfig {
        public int fps = 30;
        public int bitRate = 500000;
        public int width = 360;
        public int height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;

        public VideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public VideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public VideoConfig setKBitRate(int i) {
            this.bitRate = i * 1000;
            return this;
        }

        public VideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setAudio(AudioConfig audioConfig) {
        this.audio = audioConfig;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setVideo(VideoConfig videoConfig) {
        this.video = videoConfig;
    }
}
