package com.bytedance.ies.nle.editor_jni;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class NLEModelDownloader {
    public List<NLEResourceDownloadCallback> nleResourceDownloadCallback;
    public List<NLEResourceListDownloadCallback> nleResourceListDownloadCallbackList;
    public List<NLESingleResourceDownloadCallback> nleSingleResourceDownloadCallback;
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLEModelDownloader(j);
                this.nleResourceDownloadCallback.clear();
                this.nleResourceDownloadCallback = null;
                this.nleSingleResourceDownloadCallback.clear();
                this.nleSingleResourceDownloadCallback = null;
                this.nleResourceListDownloadCallbackList.clear();
                this.nleResourceListDownloadCallbackList = null;
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearEpCache() {
        NLEResourcesDAVJNI.NLEModelDownloader_clearEpCache(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NLEModelDownloader(com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Ld
            r0 = 0
        L4:
            long r1 = com.bytedance.ies.nle.editor_jni.NLEResourcesDAVJNI.new_NLEModelDownloader(r0, r4)
            r0 = 1
            r3.<init>(r1, r0)
            return
        Ld:
            long r0 = r4.LIZ
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.nle.editor_jni.NLEModelDownloader.<init>(com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams):void");
    }

    public static long getCPtr(NLEModelDownloader nLEModelDownloader) {
        if (nLEModelDownloader == null) {
            return 0L;
        }
        return nLEModelDownloader.swigCPtr;
    }

    public boolean cancelFetch(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_cancelFetch(this.swigCPtr, this, str);
    }

    public boolean hasCache(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_hasCache(this.swigCPtr, this, str);
    }

    public boolean hasDavinciResourceCache(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_hasDavinciResourceCache(this.swigCPtr, this, str);
    }

    public boolean isNeedFetch(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_isNeedFetch(this.swigCPtr, this, str);
    }

    public void removeNLEResourceDownloadCallback(NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        List<NLEResourceDownloadCallback> list = this.nleResourceDownloadCallback;
        if (list != null && nLEResourceDownloadCallback != null) {
            list.remove(nLEResourceDownloadCallback);
        }
    }

    public void removeNLEResourceListDownloadCallback(NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.remove(nLEResourceListDownloadCallback);
        }
    }

    public void removeNLESingleResourceDownloadCallback(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback) {
        List<NLESingleResourceDownloadCallback> list = this.nleSingleResourceDownloadCallback;
        if (list != null && nLESingleResourceDownloadCallback != null) {
            list.remove(nLESingleResourceDownloadCallback);
        }
    }

    public NLEModelDownloader(long j, boolean z) {
        this.nleResourceDownloadCallback = new CopyOnWriteArrayList();
        this.nleSingleResourceDownloadCallback = new CopyOnWriteArrayList();
        this.nleResourceListDownloadCallbackList = new CopyOnWriteArrayList();
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void fetch(String str, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback) {
        List<NLESingleResourceDownloadCallback> list = this.nleSingleResourceDownloadCallback;
        if (list != null && nLESingleResourceDownloadCallback != null) {
            list.add(nLESingleResourceDownloadCallback);
        }
        NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_1(this.swigCPtr, this, str, NLESingleResourceDownloadCallback.getCPtr(nLESingleResourceDownloadCallback), nLESingleResourceDownloadCallback);
    }

    public String fetch(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.add(nLEResourceListDownloadCallback);
        }
        return NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_2(this.swigCPtr, this, VecString.LIZJ(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetchEffectList(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.add(nLEResourceListDownloadCallback);
        }
        return NLEResourcesDAVJNI.NLEModelDownloader_fetchEffectList(this.swigCPtr, this, VecString.LIZJ(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetchResourceList(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        return NLEResourcesDAVJNI.NLEModelDownloader_fetchResourceList(this.swigCPtr, this, VecString.LIZJ(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetch(NLEModel nLEModel, int i, boolean z, boolean z2, NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        return NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, i, z, z2, NLEResourceDownloadCallback.getCPtr(nLEResourceDownloadCallback), nLEResourceDownloadCallback);
    }
}
