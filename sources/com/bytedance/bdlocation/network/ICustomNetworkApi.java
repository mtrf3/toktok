package com.bytedance.bdlocation.network;

import X.C64797Pbt;
import X.EJ6;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ICustomNetworkApi {
    C64797Pbt<String> doPost(String str, String str2, Map<String, String> map, Map<String, String> map2, List<EJ6> list, boolean z);

    String doPostJson(String str, String str2, Map<String, String> map, TypedOutput typedOutput, List<EJ6> list, boolean z);
}
