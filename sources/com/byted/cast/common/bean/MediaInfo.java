package com.byted.cast.common.bean;

import X.X1D;
import com.byted.cast.common.source.ServiceInfo;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes29.dex */
public class MediaInfo {
    public String currentDramaId;
    public DramaBean[] dramaBeans;
    public HashMap<String, String> extraParam;
    public String local_path;
    public String media_album;
    public String media_albumUrl;
    public String media_artist;
    public String media_title;
    public Integer mime_type;
    public ServiceInfo serviceInfo;
    public String url;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaInfo{mime_type=");
        LIZ.append(this.mime_type);
        LIZ.append(", url='");
        LIZ.append(this.url);
        LIZ.append('\'');
        LIZ.append(", local_path='");
        LIZ.append(this.local_path);
        LIZ.append('\'');
        LIZ.append(", media_title='");
        LIZ.append(this.media_title);
        LIZ.append('\'');
        LIZ.append(", media_artist='");
        LIZ.append(this.media_artist);
        LIZ.append('\'');
        LIZ.append(", media_album='");
        LIZ.append(this.media_album);
        LIZ.append('\'');
        LIZ.append(", media_albumUrl='");
        LIZ.append(this.media_albumUrl);
        LIZ.append('\'');
        LIZ.append(", currentDramaId='");
        LIZ.append(this.currentDramaId);
        LIZ.append('\'');
        LIZ.append(", dramaBeans=");
        LIZ.append(Arrays.toString(this.dramaBeans));
        LIZ.append(", serviceInfo=");
        LIZ.append(this.serviceInfo);
        LIZ.append(", extraParam=");
        LIZ.append(this.extraParam);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
