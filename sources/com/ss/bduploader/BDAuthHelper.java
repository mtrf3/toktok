package com.ss.bduploader;

import X.C16880lQ;
import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bduploader.AWSV4Auth;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public class BDAuthHelper {
    public String accessKeyID;
    public String authorization;
    public TreeMap<String, String> awsHeaders;
    public String canonicalURI;
    public boolean debug;
    public String host;
    public String httpMethodName;
    public String payload;
    public TreeMap<String, ArrayList<String>> queryParameters;
    public String queryStr;
    public String regionName;
    public String secretAccessKey;
    public String serviceName;
    public String xAmzDate;
    public String xAmzSecurityToken;

    public Map<String, String> getSignature() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("x-amz-date", this.xAmzDate);
        treeMap.put("X-Amz-Security-Token", this.xAmzSecurityToken);
        parseAPIString(this.queryStr);
        AWSV4Auth.Builder builder = new AWSV4Auth.Builder(this.accessKeyID, this.secretAccessKey);
        builder.regionName(this.regionName);
        builder.serviceName(this.serviceName);
        builder.httpMethodName(this.httpMethodName);
        builder.canonicalURI("/top/v1");
        builder.queryParameters(this.queryParameters);
        builder.awsHeaders(treeMap);
        builder.payload(this.payload);
        Map<String, String> headers = builder.build().getHeaders();
        this.authorization = headers.get("Authorization");
        return headers;
    }

    private String parseAPIString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "parseAPIString:query string is empty";
        }
        try {
            String[] split = str.split("[?]");
            if (split.length < 2) {
                return "parseAPIString:query string param is empty";
            }
            String[] split2 = split[1].split("&");
            TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();
            for (String str2 : split2) {
                String[] split3 = str2.split("=");
                if (split3.length >= 2) {
                    if (!treeMap.containsKey(split3[0])) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add(split3[1]);
                        treeMap.put(split3[0], arrayList);
                    } else {
                        treeMap.get(split3[0]).add(split3[1]);
                    }
                }
            }
            this.queryParameters = treeMap;
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getStringValue(int i) {
        getSignature();
        if (i != 10) {
            return null;
        }
        return this.authorization;
    }

    public void setAwsHeaders(TreeMap<String, String> treeMap) {
        this.awsHeaders = treeMap;
    }

    public void setQueryParameters(TreeMap<String, ArrayList<String>> treeMap) {
        this.queryParameters = treeMap;
    }

    public void setStringValue(int i, String str) {
        switch (i) {
            case 0:
                this.accessKeyID = str;
                return;
            case 1:
                this.secretAccessKey = str;
                return;
            case 2:
                this.regionName = str;
                return;
            case 3:
                this.serviceName = str;
                return;
            case 4:
                this.httpMethodName = str;
                return;
            case 5:
                this.canonicalURI = str;
                return;
            case 6:
                this.payload = str;
                return;
            case 7:
                this.host = str;
                return;
            case 8:
                this.xAmzDate = str;
                return;
            case 9:
                this.xAmzSecurityToken = str;
                return;
            case 10:
            default:
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                this.queryStr = str;
                return;
        }
    }
}
