package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum DownloadLyricType {
    KRC(0),
    LRC(1);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.DownloadLyricType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType;

        static {
            int[] iArr = new int[DownloadLyricType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType = iArr;
            try {
                iArr[DownloadLyricType.KRC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType[DownloadLyricType.LRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "DOWNLOAD_LYRIC_TYPE_LRC";
        }
        return "DOWNLOAD_LYRIC_TYPE_KRC";
    }

    public int value() {
        return this.value;
    }

    public static DownloadLyricType fromId(int i) {
        for (DownloadLyricType downloadLyricType : values()) {
            if (downloadLyricType.value() == i) {
                return downloadLyricType;
            }
        }
        return null;
    }

    public static DownloadLyricType valueOf(String str) {
        return (DownloadLyricType) V0N.LJJJ(DownloadLyricType.class, str);
    }

    DownloadLyricType(int i) {
        this.value = i;
    }
}
