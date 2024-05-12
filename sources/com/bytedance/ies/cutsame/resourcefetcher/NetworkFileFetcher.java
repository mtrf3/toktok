package com.bytedance.ies.cutsame.resourcefetcher;

import X.C172936qX;
import X.C172946qY;
import X.InterfaceC172956qZ;
import X.InterfaceC82877Wfp;
import X.JBR;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcherCallBack;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class NetworkFileFetcher implements ResourceFetcher {
    public abstract void LJLJI(String str, String str2, C172936qX c172936qX);

    /* loaded from: classes3.dex */
    public static class DownloadItem {
        public String url = "";
        public String md5 = "";

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[");
            LIZ.append(this.url);
            LIZ.append(", ");
            return JBR.LJFF(LIZ, this.md5, "]", LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.6qX] */
    @Override // com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher
    public final void fetch(String str, ResourceFetcherCallBack resourceFetcherCallBack) {
        DownloadItem downloadItem = (DownloadItem) GsonProtectorUtils.fromJson(new Gson(), str, DownloadItem.class);
        if (downloadItem != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch ");
            LIZ.append(downloadItem);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            InterfaceC172956qZ interfaceC172956qZ = C172946qY.LIZ;
            if (interfaceC172956qZ != null) {
                interfaceC172956qZ.LIZIZ(msg);
            }
            String str2 = downloadItem.url;
            String str3 = downloadItem.md5;
            LJLJI(str2, str3, new InterfaceC82877Wfp(str3, resourceFetcherCallBack) { // from class: X.6qX
                public final String LIZ;
                public final ResourceFetcherCallBack LIZIZ;

                @Override // X.InterfaceC82877Wfp
                public final void notifySuccess(String str4) {
                    if (!C1B6.LIZIZ(str4)) {
                        C172946qY.LIZIZ("cut.NetworkFileFetcher", "notifySuccess but file not exist");
                        notifyError(-18, "file doesn't exist");
                        return;
                    }
                    if (!TextUtils.isEmpty(this.LIZ)) {
                        String LJ = C76857UEj.LJ(str4);
                        if (!TextUtils.equals(this.LIZ, LJ)) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("notifySuccess but md5 verify failed. md5=");
                            LIZ2.append(this.LIZ);
                            LIZ2.append(", fileMd5=");
                            LIZ2.append(LJ);
                            C172946qY.LIZIZ("cut.NetworkFileFetcher", X1D.LIZIZ(LIZ2));
                            notifyError(-18, "md5 verify failed");
                            return;
                        }
                    }
                    this.LIZIZ.notifySuccess(str4);
                }

                {
                    this.LIZ = str3;
                    this.LIZIZ = resourceFetcherCallBack;
                }

                @Override // X.InterfaceC82877Wfp
                public final void notifyError(int i, String str4) {
                    this.LIZIZ.notifyError(i, str4);
                }
            });
        }
    }
}
