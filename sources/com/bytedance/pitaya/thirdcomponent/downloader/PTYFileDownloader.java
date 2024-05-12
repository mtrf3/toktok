package com.bytedance.pitaya.thirdcomponent.downloader;

import X.InterfaceC93313aOr;
import android.content.Context;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface PTYFileDownloader extends ReflectionCall {
    void cancelAllDownload(Context context);

    void downloadFile(Context context, String str, String str2, String str3, String str4, InterfaceC93313aOr interfaceC93313aOr);
}
