package com.byted.cast.sdk;

/* loaded from: classes29.dex */
public class RTCMediaKind {
    public int kind;
    public static final RTCMediaKind AUDIO = new RTCMediaKind(0);
    public static final RTCMediaKind VIDEO = new RTCMediaKind(1);
    public static final RTCMediaKind SCREEN = new RTCMediaKind(2);
    public static final RTCMediaKind INVALID = new RTCMediaKind(3);
    public static String[] kinds = {"audio", "video", "screen", "invalid"};

    public String toString() {
        return kinds[this.kind];
    }

    public int value() {
        return this.kind;
    }

    public RTCMediaKind(int i) {
        this.kind = i;
    }

    public static RTCMediaKind valueOf(String str) {
        if (str.equals("audio")) {
            return AUDIO;
        }
        if (str.equals("video")) {
            return VIDEO;
        }
        if (str.equals("screen")) {
            return SCREEN;
        }
        return INVALID;
    }

    public static RTCMediaKind valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return INVALID;
                }
                return SCREEN;
            }
            return VIDEO;
        }
        return AUDIO;
    }
}
