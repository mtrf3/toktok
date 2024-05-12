package com.bytedance.android.livesdkapi.subscribe.emote;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes14.dex */
public final class OpenCameraForSubResultModel implements Serializable {

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("tempFiles")
    public PhotoFile tempFiles;

    /* loaded from: classes14.dex */
    public static final class PhotoFile implements Serializable {

        @InterfaceC65349Pkn("base64Data")
        public String base64;

        @InterfaceC65349Pkn("path")
        public String path;

        @InterfaceC65349Pkn("size")
        public int size;

        @InterfaceC65349Pkn("with_text_sticker")
        public int withTextSticker;

        public final String getBase64() {
            return this.base64;
        }

        public final String getPath() {
            return this.path;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getWithTextSticker() {
            return this.withTextSticker;
        }

        public final void setBase64(String str) {
            this.base64 = str;
        }

        public final void setPath(String str) {
            this.path = str;
        }

        public final void setSize(int i) {
            this.size = i;
        }

        public final void setWithTextSticker(int i) {
            this.withTextSticker = i;
        }
    }

    public final int getStatus() {
        return this.status;
    }

    public final PhotoFile getTempFiles() {
        return this.tempFiles;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTempFiles(PhotoFile photoFile) {
        this.tempFiles = photoFile;
    }
}
