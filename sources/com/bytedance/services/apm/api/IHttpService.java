package com.bytedance.services.apm.api;

import X.C36633EZh;
import X.InterfaceC36632EZg;
import com.bytedance.news.common.service.manager.IService;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface IHttpService extends IService {
    InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z);

    InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map);

    C36633EZh doGet(String str, Map<String, String> map);

    C36633EZh doPost(String str, byte[] bArr, Map<String, String> map);

    C36633EZh uploadFiles(String str, List<File> list, Map<String, String> map);
}
