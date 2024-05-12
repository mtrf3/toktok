package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum DownloadFileType {
    MUSIC(1),
    KRC(2),
    LRC(3),
    MIDI(4);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.DownloadFileType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType;

        static {
            int[] iArr = new int[DownloadFileType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType = iArr;
            try {
                iArr[DownloadFileType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.KRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.LRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.MIDI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "DOWNLOAD_FILE_TYPE_MIDI";
                }
                return "DOWNLOAD_FILE_TYPE_LRC";
            }
            return "DOWNLOAD_FILE_TYPE_KRC";
        }
        return "DOWNLOAD_FILE_TYPE_MUSIC";
    }

    public int value() {
        return this.value;
    }

    public static DownloadFileType fromId(int i) {
        for (DownloadFileType downloadFileType : values()) {
            if (downloadFileType.value() == i) {
                return downloadFileType;
            }
        }
        return null;
    }

    public static DownloadFileType valueOf(String str) {
        return (DownloadFileType) V0N.LJJJ(DownloadFileType.class, str);
    }

    DownloadFileType(int i) {
        this.value = i;
    }
}
