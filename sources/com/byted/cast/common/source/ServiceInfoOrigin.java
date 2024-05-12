package com.byted.cast.common.source;

import android.text.TextUtils;
import java.util.BitSet;

/* loaded from: classes29.dex */
public class ServiceInfoOrigin extends BitSet {
    public static int ORIGIN_FROM_BDLINK_BLE;
    public static int ORIGIN_FROM_BDLINK_NSD;
    public static int ORIGIN_FROM_BDLINK_SSDP;
    public static int ORIGIN_FROM_BYTELINK_BLE;
    public static int ORIGIN_FROM_BYTELINK_NSD;
    public static int ORIGIN_FROM_NONE;

    static {
        int i = ORIGIN_FROM_NONE;
        ORIGIN_FROM_BDLINK_NSD = i + 1;
        ORIGIN_FROM_BDLINK_BLE = i + 2;
        ORIGIN_FROM_BDLINK_SSDP = i + 3;
        ORIGIN_FROM_BYTELINK_NSD = i + 1;
        ORIGIN_FROM_BYTELINK_BLE = i + 2;
    }

    public static int convertBrowseCodeToOriginBit(int i, String str) {
        int i2 = ORIGIN_FROM_NONE;
        if (TextUtils.equals(str, "BDLink")) {
            if (i != 1) {
                if (i != 5) {
                    if (i != 8) {
                        return i2;
                    }
                    return ORIGIN_FROM_BDLINK_SSDP;
                }
                return ORIGIN_FROM_BDLINK_BLE;
            }
            return ORIGIN_FROM_BDLINK_NSD;
        }
        if (!TextUtils.equals(str, "ByteLink")) {
            return i2;
        }
        if (i != 1) {
            if (i != 7) {
                return i2;
            }
            return ORIGIN_FROM_BYTELINK_BLE;
        }
        return ORIGIN_FROM_BYTELINK_NSD;
    }

    public BitSet clearOriginBit(int i, String str) {
        if (isEmpty()) {
            return this;
        }
        int convertBrowseCodeToOriginBit = convertBrowseCodeToOriginBit(i, str);
        if (convertBrowseCodeToOriginBit == ORIGIN_FROM_NONE) {
            clear();
            return this;
        }
        clear(convertBrowseCodeToOriginBit);
        return this;
    }

    public BitSet setOriginBit(int i, String str) {
        set(convertBrowseCodeToOriginBit(i, str));
        return this;
    }
}
