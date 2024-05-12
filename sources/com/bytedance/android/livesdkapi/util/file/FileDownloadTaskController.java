package com.bytedance.android.livesdkapi.util.file;

import X.C31824CeK;
import X.C79259V8t;
import X.InterfaceC68282m8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FileDownloadTaskController implements InterfaceC68282m8 {
    public final Downloader LJLIL;
    public final C31824CeK LJLILLLLZI;
    public final C79259V8t LJLJI;
    public final DownloadTask LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC68282m8
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        int status = this.LJLJJI.getDownloadInfo().getStatus();
        if (status != -3 && status != -4 && status != -1) {
            this.LJLIL.pause(this.LJLJJI.getDownloadId());
            this.LJLJI.LJ();
        }
    }

    @Override // X.InterfaceC68282m8
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        if (this.LJLIL.canResume(this.LJLJJI.getDownloadId())) {
            this.LJLIL.resume(this.LJLJJI.getDownloadId());
            C79259V8t c79259V8t = this.LJLJI;
            c79259V8t.getClass();
            c79259V8t.LJLJJLL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC68282m8
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void cancel(boolean z) {
        if (this.LJLJJI.getDownloadInfo().getStatus() != -3) {
            this.LJLIL.cancel(this.LJLJJI.getDownloadId(), z);
        }
    }

    public FileDownloadTaskController(Downloader downloader, C31824CeK liveFileConfig, C79259V8t c79259V8t, DownloadTask downloadTask) {
        o.LJIIIZ(liveFileConfig, "liveFileConfig");
        this.LJLIL = downloader;
        this.LJLILLLLZI = liveFileConfig;
        this.LJLJI = c79259V8t;
        this.LJLJJI = downloadTask;
    }
}
