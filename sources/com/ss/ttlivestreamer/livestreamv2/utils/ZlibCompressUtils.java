package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C16880lQ;
import X.C42398GkU;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.FindContourInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ZlibCompressUtils {
    public static String SEI_HEAD_APP_DATA = "APDT";
    public static String SEI_HEAD_MATTING_DATA = "MATN";
    public static String TAG = "ZlibCompressUtils";
    public static int seiUncompressSceneCDN = 2;
    public static int seiUncompressSceneLiveCore = 0;
    public static int seiUncompressSceneMediaSdk = 1;

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static byte[] compress(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static FindContourInfo getContourInfoFromByteBuffer(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        if (remaining < 4) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        int i3 = 0;
        do {
            bArr2[i3] = bArr[i3];
            i3++;
        } while (i3 < 4);
        String str = new String(bArr2);
        if (!str.equals(SEI_HEAD_APP_DATA) && !str.equals(SEI_HEAD_MATTING_DATA)) {
            return null;
        }
        int i4 = remaining - 4;
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = bArr[i5 + 4];
        }
        byte[] bArr4 = new byte[4096];
        try {
            bArr4 = unCompress(bArr3);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        } catch (DataFormatException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bArr4.length).order(ByteOrder.nativeOrder());
        order.put(bArr4);
        order.flip();
        FindContourInfo findContourInfo = new FindContourInfo();
        int int8bits = getInt8bits(order);
        if (int8bits != 1) {
            return null;
        }
        int int16bits = getInt16bits(order);
        int int16bits2 = getInt16bits(order);
        int int16bits3 = getInt16bits(order);
        String str2 = "";
        for (int i6 = 0; i6 < int16bits3; i6++) {
            str2 = C42398GkU.LIZIZ(str2, (char) order.get());
        }
        int int8bits2 = getInt8bits(order);
        int int16bits4 = getInt16bits(order);
        if (int16bits4 == 4 && (int8bits2 == seiUncompressSceneLiveCore || int8bits2 == seiUncompressSceneMediaSdk)) {
            int int16bits5 = getInt16bits(order);
            int int16bits6 = getInt16bits(order);
            findContourInfo.mAdaptedVideoWidth = int16bits5;
            findContourInfo.mAdaptedVideoHeight = int16bits6;
        } else {
            for (int i7 = 0; i7 < int16bits4; i7++) {
                getInt8bits(order);
            }
        }
        int int8bits3 = getInt8bits(order);
        findContourInfo.mVersion = int8bits;
        findContourInfo.mWidth = int16bits;
        findContourInfo.mHeight = int16bits2;
        findContourInfo.mInteractId = str2;
        findContourInfo.mScene = int8bits2;
        findContourInfo.mExtraSize = int16bits4;
        findContourInfo.mContourItemSize = int8bits3;
        for (int i8 = 0; i8 < int8bits3; i8++) {
            int int16bits7 = getInt16bits(order);
            FindContourInfo.ContourItem contourItem = new FindContourInfo.ContourItem();
            contourItem.counts = int16bits7;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < int16bits7; i11++) {
                if (i11 == 0) {
                    i = getInt16bits(order);
                    i2 = getInt16bits(order);
                } else {
                    i = order.getShort();
                    i2 = order.getShort();
                }
                FindContourInfo.ContourPoint contourPoint = new FindContourInfo.ContourPoint();
                if (i11 == 0) {
                    i9 = i;
                    i10 = i2;
                } else {
                    i9 += i;
                    i10 += i2;
                }
                contourPoint.x = i9;
                contourPoint.y = i10;
                contourItem.pointsList.add(contourPoint);
            }
            findContourInfo.contourItemsList.add(contourItem);
        }
        return findContourInfo;
    }

    public static FindContourInfo getContourInfoFromString(String str) {
        String string;
        String str2;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("data")) {
                string = "";
            } else {
                string = JSONObjectProtectorUtils.getString(jSONObject, "data");
            }
            if (!jSONObject.has("interact_id")) {
                str2 = "";
            } else {
                str2 = JSONObjectProtectorUtils.getString(jSONObject, "interact_id");
            }
            if (string == "") {
                return null;
            }
            byte[] hexStringToBytes = hexStringToBytes(string);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(hexStringToBytes.length);
            allocateDirect.put(hexStringToBytes);
            allocateDirect.position(0);
            FindContourInfo contourInfoFromByteBuffer = getContourInfoFromByteBuffer(allocateDirect);
            if (contourInfoFromByteBuffer != null) {
                contourInfoFromByteBuffer.mInteractId = str2;
            }
            return contourInfoFromByteBuffer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getInt16bits(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    public static int getInt8bits(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static boolean isContourInfo(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        if (byteBuffer.capacity() < 4) {
            return false;
        }
        byteBuffer.get(bArr, 0, 4);
        byteBuffer.position(0);
        if (!SEI_HEAD_MATTING_DATA.equals(new String(bArr))) {
            return false;
        }
        return true;
    }

    public static byte[] unCompress(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        byte[] bArr2 = new byte[4096];
        while (!inflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
