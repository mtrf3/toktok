package com.bytedance.pitaya.network;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C62848OlY;
import X.InterfaceC93313aOr;
import X.X1D;
import android.content.Context;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class DefaultFileDownloader implements PTYFileDownloader {
    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void cancelAllDownload(Context context) {
        o.LJIIJ(context, "context");
    }

    private final void download(String str, String str2) {
        File file = new File(str2);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        file.createNewFile();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str).openStream());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                C62848OlY.LIZIZ(bufferedInputStream, fileOutputStream, FileUtils.BUFFER_SIZE);
                AnonymousClass636.LJFF(fileOutputStream, null);
                AnonymousClass636.LJFF(bufferedInputStream, null);
            } finally {
            }
        } finally {
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void downloadFile(Context context, String url, String fileName, String str, String savePath, InterfaceC93313aOr listener) {
        o.LJIIJ(context, "context");
        o.LJIIJ(url, "url");
        o.LJIIJ(fileName, "fileName");
        o.LJIIJ(savePath, "savePath");
        o.LJIIJ(listener, "listener");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(savePath);
            LIZ.append('/');
            LIZ.append(fileName);
            download(url, X1D.LIZIZ(LIZ));
            listener.onSuccess(url);
        } catch (Throwable th) {
            PitayaLogger.LJ(th, null, 6);
            listener.onFail(url, th.getLocalizedMessage());
        }
    }
}
