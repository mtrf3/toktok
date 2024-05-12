package com.ss.bduploader;

import X.C025908h;
import X.C0EH;
import X.C16880lQ;
import X.C1FJ;
import X.JBR;
import X.X1D;
import X.YE1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes12.dex */
public class AWSV4Auth {
    public static String MAC_ALGORITHM = "HmacSHA256";
    public static final char[] hexArray;
    public static Mac mMacInstance;
    public static MessageDigest mMessageDigest;
    public String accessKeyID;
    public TreeMap<String, String> awsHeaders;
    public boolean awsHeadersHasTimestamp;
    public String canonicalURI;
    public String currentDate;
    public boolean debug;
    public String httpMethodName;
    public String payload;
    public TreeMap<String, ArrayList<String>> queryParameters;
    public String regionName;
    public String secretAccessKey;
    public String serviceName;
    public String strSignedHeader;
    public String xAmzDate;

    /* loaded from: classes12.dex */
    public static class Builder {
        public String accessKeyID;
        public TreeMap<String, String> awsHeaders;
        public String canonicalURI;
        public boolean debug;
        public String httpMethodName;
        public String payload;
        public TreeMap<String, ArrayList<String>> queryParameters;
        public String regionName;
        public String secretAccessKey;
        public String serviceName;

        public Builder debug() {
            this.debug = true;
            return this;
        }

        public AWSV4Auth build() {
            return new AWSV4Auth(this);
        }

        public Builder awsHeaders(TreeMap<String, String> treeMap) {
            this.awsHeaders = treeMap;
            return this;
        }

        public Builder canonicalURI(String str) {
            this.canonicalURI = str;
            return this;
        }

        public Builder httpMethodName(String str) {
            this.httpMethodName = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder queryParameters(TreeMap<String, ArrayList<String>> treeMap) {
            this.queryParameters = treeMap;
            return this;
        }

        public Builder regionName(String str) {
            this.regionName = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.serviceName = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.accessKeyID = str;
            this.secretAccessKey = str2;
        }
    }

    static {
        try {
            mMacInstance = Mac.getInstance("HmacSHA256");
            mMessageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
        }
        hexArray = "0123456789ABCDEF".toCharArray();
    }

    private String findTimestampFromHeaderCaseInsensitive() {
        TreeMap<String, String> treeMap = this.awsHeaders;
        if (treeMap != null && !treeMap.isEmpty()) {
            for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
                if (entry.getKey().toLowerCase().equals("x-amz-date")) {
                    return entry.getValue();
                }
            }
            return null;
        }
        return null;
    }

    private String getTimeStamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String prepareCanonicalRequest() {
        String str;
        String str2 = "";
        StringBuilder sb = new StringBuilder("");
        sb.append(this.httpMethodName);
        sb.append("\n");
        String str3 = this.canonicalURI;
        if (str3 == null || str3.trim().isEmpty()) {
            str = "/";
        } else {
            str = this.canonicalURI;
        }
        this.canonicalURI = str;
        sb.append(str);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder("");
        TreeMap<String, ArrayList<String>> treeMap = this.queryParameters;
        if (treeMap != null && !treeMap.isEmpty()) {
            for (Map.Entry<String, ArrayList<String>> entry : this.queryParameters.entrySet()) {
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                int i = 0;
                while (i < value.size()) {
                    sb2.append(key);
                    sb2.append("=");
                    i = C0EH.LIZIZ(sb2, encodeParameter((String) ListProtector.get(value, i)), "&", i, 1);
                }
            }
            sb2.deleteCharAt(sb2.lastIndexOf("&"));
            sb2.append("\n");
        } else {
            sb2.append("\n");
        }
        sb.append((CharSequence) sb2);
        StringBuilder sb3 = new StringBuilder("");
        TreeMap<String, String> treeMap2 = this.awsHeaders;
        if (treeMap2 != null && !treeMap2.isEmpty()) {
            TreeMap treeMap3 = new TreeMap();
            for (Map.Entry<String, String> entry2 : this.awsHeaders.entrySet()) {
                treeMap3.put(entry2.getKey().toLowerCase(), entry2.getValue().trim());
            }
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                String lowerCase = ((String) entry3.getKey()).toLowerCase();
                String trim = ((String) entry3.getValue()).trim();
                sb3.append(lowerCase);
                sb3.append(";");
                YE1.LIZLLL(sb, lowerCase, ":", trim, "\n");
            }
            sb.append("\n");
        } else {
            sb.append("\n");
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        this.strSignedHeader = substring;
        sb.append(substring);
        sb.append("\n");
        String str4 = this.payload;
        if (str4 != null) {
            str2 = str4;
        }
        this.payload = str2;
        sb.append(generateHex(str2));
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("##Canonical Request:\n");
            LIZ.append(sb.toString());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        return sb.toString();
    }

    public Map<String, String> getHeaders() {
        String calculateSignature = calculateSignature(prepareStringToSign(prepareCanonicalRequest()));
        if (calculateSignature != null) {
            HashMap hashMap = new HashMap(0);
            for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put("Authorization", buildAuthorizationString(calculateSignature));
            if (this.debug) {
                PrintStream printStream = System.out;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("##Signature:\n");
                LIZ.append(calculateSignature);
                printStream.println(X1D.LIZIZ(LIZ));
                System.out.println("##Header:");
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    PrintStream printStream2 = System.out;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append((String) C1FJ.LIZJ(LIZ2, (String) entry2.getKey(), " = ", entry2));
                    printStream2.println(X1D.LIZIZ(LIZ2));
                }
                System.out.println("================================");
            }
            return hashMap;
        }
        if (this.debug) {
            PrintStream printStream3 = System.out;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("##Signature:\n");
            LIZ3.append(calculateSignature);
            printStream3.println(X1D.LIZIZ(LIZ3));
            return null;
        }
        return null;
    }

    public AWSV4Auth() {
    }

    public AWSV4Auth(Builder builder) {
        this.accessKeyID = builder.accessKeyID;
        this.secretAccessKey = builder.secretAccessKey;
        this.regionName = builder.regionName;
        this.serviceName = builder.serviceName;
        this.httpMethodName = builder.httpMethodName;
        this.canonicalURI = builder.canonicalURI;
        this.queryParameters = builder.queryParameters;
        TreeMap<String, String> treeMap = builder.awsHeaders;
        this.awsHeaders = treeMap;
        this.payload = builder.payload;
        this.debug = builder.debug;
        if (treeMap == null) {
            this.awsHeaders = new TreeMap<>();
        }
        String findTimestampFromHeaderCaseInsensitive = findTimestampFromHeaderCaseInsensitive();
        this.xAmzDate = findTimestampFromHeaderCaseInsensitive;
        if (findTimestampFromHeaderCaseInsensitive == null) {
            String timeStamp = getTimeStamp();
            this.xAmzDate = timeStamp;
            this.awsHeaders.put("x-amz-date", timeStamp);
        } else {
            this.awsHeadersHasTimestamp = true;
        }
        this.currentDate = getDateFromTimeStamp(this.xAmzDate);
    }

    private String buildAuthorizationString(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AWS4-HMAC-SHA256 Credential=");
        LIZ.append(this.accessKeyID);
        LIZ.append("/");
        LIZ.append(this.currentDate);
        LIZ.append("/");
        LIZ.append(this.regionName);
        LIZ.append("/");
        YE1.LIZLLL(LIZ, this.serviceName, "/", "aws4_request", ",SignedHeaders=");
        return C025908h.LIZIZ(LIZ, this.strSignedHeader, ",Signature=", str, LIZ);
    }

    private String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private String calculateSignature(String str) {
        try {
            return bytesToHex(SHA256UseMac(getSignatureKey(this.secretAccessKey, this.currentDate, this.regionName, this.serviceName), str));
        } catch (Exception unused) {
            return null;
        }
    }

    private String encodeParameter(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception unused) {
            return str;
        }
    }

    public static synchronized String generateHex(String str) {
        String LLLZ;
        synchronized (AWSV4Auth.class) {
            try {
                mMessageDigest.update(str.getBytes("UTF-8"));
                LLLZ = C16880lQ.LLLZ("%064x", new Object[]{new BigInteger(1, mMessageDigest.digest())});
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return LLLZ;
    }

    private String getDateFromTimeStamp(String str) {
        if (str == null || str.length() < 8) {
            return null;
        }
        return str.substring(0, 8);
    }

    private String prepareStringToSign(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AWS4-HMAC-SHA256\n");
        String LJFF = JBR.LJFF(LIZ, this.xAmzDate, "\n", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJFF);
        LIZ2.append(this.currentDate);
        LIZ2.append("/");
        LIZ2.append(this.regionName);
        LIZ2.append("/");
        YE1.LIZLLL(LIZ2, this.serviceName, "/", "aws4_request", "\n");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append(generateHex(str));
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("##String to sign:\n");
            LIZ4.append(LIZIZ2);
            printStream.println(X1D.LIZIZ(LIZ4));
        }
        return LIZIZ2;
    }

    public static synchronized byte[] SHA256UseMac(byte[] bArr, String str) {
        byte[] doFinal;
        synchronized (AWSV4Auth.class) {
            mMacInstance.init(new SecretKeySpec(bArr, MAC_ALGORITHM));
            doFinal = mMacInstance.doFinal(str.getBytes("UTF8"));
        }
        return doFinal;
    }

    public static synchronized byte[] getSignatureKey(String str, String str2, String str3, String str4) {
        byte[] SHA256UseMac;
        synchronized (AWSV4Auth.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AWS4");
            LIZ.append(str);
            SHA256UseMac = SHA256UseMac(SHA256UseMac(SHA256UseMac(SHA256UseMac(X1D.LIZIZ(LIZ).getBytes("UTF8"), str2), str3), str4), "aws4_request");
        }
        return SHA256UseMac;
    }
}
