package X;

import Y.ARunnableS2S1101000_7;
import android.app.Application;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.HGk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43786HGk implements HC5 {
    public static final int[] LJIL = {360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT};
    public ExtractFramesModel LIZ;
    public volatile boolean LIZIZ;
    public String LIZJ;
    public final HG1 LIZLLL;
    public InterfaceC43792HGq LJ;
    public String LJFF;
    public ScheduledExecutorService LJI;
    public final AtomicBoolean LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public volatile boolean LJIIJ;
    public final HashMap<String, Boolean> LJIIJJI;
    public final Application LJIIL;
    public final String LJIILIIL;
    public final InterfaceC83865Wvl LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final InterfaceC43788HGm LJIJI;
    public final WLT LJIJJ;
    public final HG1 LJIJJLI;

    public final String LIZJ() {
        InterfaceC43792HGq interfaceC43792HGq = this.LJ;
        if (interfaceC43792HGq != null) {
            ((C43789HGn) interfaceC43792HGq).LIZ.h0();
        }
        if (!this.LJIIZILJ) {
            return null;
        }
        this.LIZIZ = true;
        this.LIZLLL.LIZLLL(this.LJIILIIL, this.LIZJ);
        ExtractFramesModel extractFramesModel = this.LIZ;
        String str = this.LIZLLL.LIZIZ;
        o.LJIIIIZZ(str, "photoPathGenerator.currentDir");
        extractFramesModel.setExtractFramesDir(str);
        this.LJFF = UUID.randomUUID().toString();
        this.LIZ.addFrameSegment(new ArrayList<>(), this.LJFF, new ArrayList<>());
        int size = this.LIZ.getAllFrames().size();
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        LIZ(new ARunnableS2S1101000_7(size, this, str2, 1), 0);
        String str3 = this.LJFF;
        if (str3 != null) {
            this.LJIIJJI.put(str3, Boolean.TRUE);
        }
        return this.LJFF;
    }

    public final void LIZ(ARunnableS2S1101000_7 aRunnableS2S1101000_7, int i) {
        ScheduledExecutorService scheduledExecutorService = this.LJI;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.LJI = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("DefaultFrameExtractor"));
        }
        ScheduledExecutorService scheduledExecutorService2 = this.LJI;
        o.LJI(scheduledExecutorService2);
        scheduledExecutorService2.schedule(aRunnableS2S1101000_7, i, TimeUnit.MILLISECONDS);
    }

    public final void LIZIZ(long j, long j2, String str, String str2, int i, int i2, String str3) {
        int i3;
        long currentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
        C10K.LIZIZ(new CallableC43766HFq(this, str3, j, i, str), C10K.LJIIIIZZ, null);
        InterfaceC43792HGq interfaceC43792HGq = this.LJ;
        if (interfaceC43792HGq != null) {
            ((C43789HGn) interfaceC43792HGq).LIZ.e0(System.currentTimeMillis() - j2);
        }
        ARunnableS2S1101000_7 aRunnableS2S1101000_7 = new ARunnableS2S1101000_7(i2 + 1, this, str2, 1);
        long j3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        if (currentTimeMillis > j3) {
            i3 = 0;
        } else {
            i3 = (int) (j3 - currentTimeMillis);
        }
        LIZ(aRunnableS2S1101000_7, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.HG1] */
    public C43786HGk(Application app, String extractType, InterfaceC83865Wvl mediaController, int i, int i2, boolean z, boolean z2, InterfaceC43788HGm stickerConfiguration, WLT cameraApiComponent, C43771HFv c43771HFv) {
        o.LJIIIZ(app, "app");
        o.LJIIIZ(extractType, "extractType");
        o.LJIIIZ(mediaController, "mediaController");
        o.LJIIIZ(stickerConfiguration, "stickerConfiguration");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJIIL = app;
        this.LJIILIIL = extractType;
        this.LJIILJJIL = mediaController;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = z;
        this.LJIJ = z2;
        this.LJIJI = stickerConfiguration;
        this.LJIJJ = cameraApiComponent;
        this.LJIJJLI = c43771HFv;
        this.LIZ = new ExtractFramesModel(extractType);
        this.LIZJ = AnonymousClass629.LIZ("UUID.randomUUID().toString()");
        this.LIZLLL = c43771HFv == null ? new HG1(app) : c43771HFv;
        this.LJII = new AtomicBoolean(false);
        this.LJIIJJI = new HashMap<>();
    }
}
