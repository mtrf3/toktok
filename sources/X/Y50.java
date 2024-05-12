package X;

import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y50 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIILLIIL;
    public final C82632Wbs LIZ;
    public final MutableLiveData<Boolean> LIZIZ;
    public final MutableLiveData LIZJ;
    public final AtomicLong LIZLLL;
    public final AtomicInteger LJ;
    public final AtomicInteger LJFF;
    public final AtomicInteger LJI;
    public final AtomicLong LJII;
    public final AtomicLong LJIIIIZZ;
    public final AtomicBoolean LJIIIZ;
    public final Handler LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final ARunnableS51S0100000_15 LJIILIIL;
    public InterfaceC132665Io LJIILJJIL;
    public final C62822Ol8 LJIILL;

    static {
        TBT tbt = new TBT(Y50.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJIILLIIL = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZ() {
        this.LIZLLL.set(0L);
        this.LJ.set(0);
        this.LJFF.set(0);
        this.LJI.set(0);
        this.LJII.set(0L);
        this.LJIIIIZZ.set(0L);
        this.LJIIIZ.set(false);
        InterfaceC132665Io interfaceC132665Io = this.LJIILJJIL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJIL();
        }
        this.LIZIZ.postValue(Boolean.TRUE);
        this.LJIIJ.removeCallbacks(this.LJIILIIL);
    }

    public Y50(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(null);
        this.LIZIZ = mutableLiveData;
        this.LIZJ = mutableLiveData;
        this.LIZLLL = new AtomicLong();
        this.LJ = new AtomicInteger();
        this.LJFF = new AtomicInteger();
        this.LJI = new AtomicInteger();
        this.LJII = new AtomicLong();
        this.LJIIIIZZ = new AtomicLong();
        this.LJIIIZ = new AtomicBoolean();
        this.LJIIJ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 641));
        this.LJIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
        this.LJIILIIL = new ARunnableS51S0100000_15(this, 44);
        this.LJIILL = C221108m2.LIZIZ(C45182HoI.LJLIL);
    }

    public final void LIZIZ(InterfaceC132665Io interfaceC132665Io) {
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJ((NLEResourceManager) this.LJIILL.getValue());
            interfaceC132665Io.LJJIZ((Y52) this.LJIIL.getValue());
            interfaceC132665Io.LJJJJ((Y51) this.LJIIJJI.getValue());
        }
        this.LJIILJJIL = interfaceC132665Io;
    }

    public final void LIZJ(String str) {
        long j;
        int i;
        if (this.LJIIIZ.get()) {
            return;
        }
        AutoCutModel autoCutModel = ((VideoPublishEditModel) this.LIZ.LIZ(this, LJIILLIIL[0])).creativeModel.autoCutModel;
        java.util.Set<String> set = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set == null || set.isEmpty()) {
            return;
        }
        InterfaceC132665Io interfaceC132665Io = this.LJIILJJIL;
        if (interfaceC132665Io != null) {
            j = interfaceC132665Io.getDuration();
        } else {
            j = 0;
        }
        long j2 = autoCutModel.asyncRenderModel.costDuration;
        long j3 = this.LIZLLL.get();
        long currentTimeMillis = System.currentTimeMillis() - this.LJII.get();
        AutoCutAsyncRenderModel autoCutAsyncRenderModel = autoCutModel.asyncRenderModel;
        int i2 = autoCutAsyncRenderModel.asyncRenderNecessaryDownloadCount;
        int i3 = autoCutAsyncRenderModel.asyncRenderNecessaryTotalCount;
        java.util.Set<String> set2 = autoCutAsyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set2 != null) {
            i = set2.size();
        } else {
            i = 0;
        }
        C45049Hm9.LJII(str, j, j2, j3, currentTimeMillis, i2, i3, i, autoCutModel.asyncRenderModel.asyncRenderUnnecessaryTotalCount, this.LJ.get(), this.LJFF.get(), this.LJI.get(), this.LJI.get() - this.LJ.get(), autoCutModel.mediaList);
    }
}
