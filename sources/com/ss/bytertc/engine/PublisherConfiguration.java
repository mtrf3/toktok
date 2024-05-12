package com.ss.bytertc.engine;

import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class PublisherConfiguration {
    public JSONObject mJsonObject;

    /* loaded from: classes33.dex */
    public static class Builder {
        public PublisherParameters params = new PublisherParameters();

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder audioChannels(int i) {
            this.params.audiochannels = i;
            return this;
        }

        public Builder audioKBitrate(int i) {
            this.params.audioKBitrate = i / 1000;
            return this;
        }

        public Builder audioSampleRate(int i) {
            this.params.audiosamplerate = i;
            return this;
        }

        public Builder defaultLayout(int i) {
            this.params.defaultLayout = i;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i) {
            this.params.framerate = i;
            return this;
        }

        public Builder kBitRate(int i) {
            this.params.kBitrate = i;
            return this;
        }

        public Builder liftCycle(int i) {
            this.params.lifecycle = i;
            return this;
        }

        public Builder owner(boolean z) {
            this.params.owner = z;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.mosaicStream = str;
            return this;
        }

        public Builder size(int i, int i2) {
            PublisherParameters publisherParameters = this.params;
            publisherParameters.width = i;
            publisherParameters.height = i2;
            return this;
        }
    }

    public boolean validate() {
        if (this.mJsonObject != null) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        if (validate()) {
            return this.mJsonObject.toString();
        }
        return null;
    }

    public PublisherConfiguration() {
    }

    public PublisherConfiguration(Builder builder) {
        try {
            JSONObject jSONObject = new JSONObject();
            this.mJsonObject = jSONObject;
            jSONObject.put("owner", builder.params.owner);
            this.mJsonObject.put("lifecycle", builder.params.lifecycle);
            this.mJsonObject.put("defaultLayout", builder.params.defaultLayout);
            this.mJsonObject.put("width", builder.params.width);
            this.mJsonObject.put("height", builder.params.height);
            this.mJsonObject.put("framerate", builder.params.framerate);
            this.mJsonObject.put("bitrate", builder.params.kBitrate);
            this.mJsonObject.put("mosaicStream", builder.params.mosaicStream);
            this.mJsonObject.put("extraInfo", builder.params.extraInfo);
            this.mJsonObject.put("audiosamplerate", builder.params.audiosamplerate);
            this.mJsonObject.put("audiobitrate", builder.params.audioKBitrate * 1000);
            this.mJsonObject.put("audiochannels", builder.params.audiochannels);
        } catch (JSONException unused) {
            this.mJsonObject = null;
            LogUtil.w("PublisherConfiguration", "failed to create PublisherConfiguration");
        }
    }
}
