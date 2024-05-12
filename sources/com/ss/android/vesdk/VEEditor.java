package com.ss.android.vesdk;

import X.C01R;
import X.C06460Ne;
import X.C16880lQ;
import X.C1B6;
import X.C36539EVr;
import X.C45014Hla;
import X.C45015Hlb;
import X.C55457Lpd;
import X.C5NI;
import X.C5SJ;
import X.C63845P3x;
import X.C63867P4t;
import X.C63868P4u;
import X.C63870P4w;
import X.C65429Pm5;
import X.C78866UxK;
import X.C84049Wyj;
import X.C87278YNe;
import X.C87283YNj;
import X.C87284YNk;
import X.C87301YOb;
import X.HandlerC169726lM;
import X.InterfaceC133845Nc;
import X.InterfaceC133865Ne;
import X.InterfaceC133905Ni;
import X.InterfaceC134015Nt;
import X.InterfaceC134025Nu;
import X.InterfaceC134045Nw;
import X.P4Q;
import X.P5P;
import X.P5Q;
import X.P5R;
import X.Q4K;
import X.Q7K;
import X.RunnableC87291YNr;
import X.V0N;
import X.VE8;
import X.VKP;
import X.X1D;
import X.YO8;
import X.YO9;
import X.YOA;
import X.YOB;
import X.YOC;
import X.YOD;
import X.YOE;
import X.YOF;
import X.YOI;
import X.YOM;
import X.YOO;
import X.YOQ;
import X.YOU;
import X.YOW;
import X.YOX;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.jni.TEAudioEffectInterface;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class VEEditor implements SurfaceTexture.OnFrameAvailableListener {
    public static final Object LLJLILLLLZIIL;
    public static volatile boolean LLJLL;
    public static int LLJLLIL;
    public YOO LJLIL;
    public YOC LJLILLLLZI;
    public YOD LJLJI;
    public YO9 LJLJJI;
    public YOU LJLJJL;
    public VEEditorResManager LJLJJLL;
    public final VESize LJLJL;
    public String LJLJLJ;
    public HandlerC169726lM LJLJLLL;
    public volatile InterfaceC133865Ne LJLL;
    public volatile InterfaceC134045Nw LJLLI;
    public volatile InterfaceC134025Nu LJLLILLLL;
    public volatile InterfaceC133845Nc LJLLJ;
    public volatile YOI LJLLL;
    public InterfaceC133905Ni LJLLLL;
    public InterfaceC133905Ni LJLLLLLL;
    public final YOB LJLZ;
    public final C55457Lpd LJZ;
    public boolean LJZI;
    public final String LJZL;
    public VERecordData LL;
    public final Map<Integer, String> LLD;
    public final AtomicBoolean LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public Boolean LLIFFJFJJ;
    public int LLII;
    public final TEInterface LLIIII;
    public SurfaceTexture LLIIIILZ;
    public Surface LLIIIJ;
    public SurfaceView LLIIIL;
    public TextureView LLIIIZ;
    public int LLIIJI;
    public long LLIIJLIL;
    public long LLIIL;
    public long LLIILII;
    public long LLIILZL;
    public long LLIIZ;
    public long LLIL;
    public long LLILII;
    public boolean LLILIL;
    public final int LLILL;
    public C5NI LLILLIZIL;
    public final VIDEO_GRAVITY LLILLJJLI;
    public final VIDEO_SCALETYPE LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public RunnableC87291YNr LLJ;
    public C5SJ LLJI;
    public InterfaceC134015Nt LLJIJIL;
    public InterfaceC134015Nt LLJILJIL;
    public final VE8 LLJILJILJ;
    public boolean LLJILLL;
    public Bitmap LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public long LLJJJIL;
    public final long LLJJJJ;
    public float LLJJJJJIL;
    public final P5R LLJJJJLIIL;
    public final P5Q LLJJL;
    public final YOX LLJJLIIIJLLLLLLLZ;
    public final YOF LLJL;
    public final YOQ LLJLIL;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EDITOR_SEEK_FLAG_LAST_UpdateIn' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class SEEK_MODE {
        public static final /* synthetic */ SEEK_MODE[] $VALUES;
        public static final SEEK_MODE EDITOR_REFRESH_MODE;
        public static final SEEK_MODE EDITOR_REFRESH_MODE_FOECE;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_Forward;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Accurate;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Accurate_Clear;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Clear;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Forward;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateIn;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateInOut;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateOut;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LastSeek;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_OnGoing;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_ToIframe;
        public int mValue;

        static {
            SEEK_MODE seek_mode = new SEEK_MODE("EDITOR_SEEK_FLAG_OnGoing", 0, 0);
            EDITOR_SEEK_FLAG_OnGoing = seek_mode;
            SEEK_MODE seek_mode2 = new SEEK_MODE("EDITOR_SEEK_FLAG_LastSeek", 1, 1);
            EDITOR_SEEK_FLAG_LastSeek = seek_mode2;
            SEEK_MODE seek_mode3 = new SEEK_MODE("EDITOR_SEEK_FLAG_ToIframe", 2, 2);
            EDITOR_SEEK_FLAG_ToIframe = seek_mode3;
            SEEK_MODE seek_mode4 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateIn", 3, seek_mode2.getValue() | 4);
            EDITOR_SEEK_FLAG_LAST_UpdateIn = seek_mode4;
            SEEK_MODE seek_mode5 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateOut", 4, seek_mode2.getValue() | 8);
            EDITOR_SEEK_FLAG_LAST_UpdateOut = seek_mode5;
            SEEK_MODE seek_mode6 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateInOut", 5, seek_mode2.getValue() | 16);
            EDITOR_SEEK_FLAG_LAST_UpdateInOut = seek_mode6;
            SEEK_MODE seek_mode7 = new SEEK_MODE("EDITOR_SEEK_FLAG_Forward", 6, 128);
            EDITOR_SEEK_FLAG_Forward = seek_mode7;
            SEEK_MODE seek_mode8 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Forward", 7, seek_mode7.getValue() | seek_mode2.getValue());
            EDITOR_SEEK_FLAG_LAST_Forward = seek_mode8;
            SEEK_MODE seek_mode9 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Clear", 8, seek_mode2.getValue() | 256);
            EDITOR_SEEK_FLAG_LAST_Clear = seek_mode9;
            SEEK_MODE seek_mode10 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Accurate", 9, seek_mode2.getValue() | LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
            EDITOR_SEEK_FLAG_LAST_Accurate = seek_mode10;
            SEEK_MODE seek_mode11 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Accurate_Clear", 10, seek_mode2.getValue() | 896);
            EDITOR_SEEK_FLAG_LAST_Accurate_Clear = seek_mode11;
            SEEK_MODE seek_mode12 = new SEEK_MODE("EDITOR_REFRESH_MODE", 11, 1024);
            EDITOR_REFRESH_MODE = seek_mode12;
            SEEK_MODE seek_mode13 = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker", 12, 24577);
            EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker = seek_mode13;
            SEEK_MODE seek_mode14 = new SEEK_MODE("EDITOR_REFRESH_MODE_FOECE", 13, 536870912);
            EDITOR_REFRESH_MODE_FOECE = seek_mode14;
            $VALUES = new SEEK_MODE[]{seek_mode, seek_mode2, seek_mode3, seek_mode4, seek_mode5, seek_mode6, seek_mode7, seek_mode8, seek_mode9, seek_mode10, seek_mode11, seek_mode12, seek_mode13, seek_mode14};
        }

        public static SEEK_MODE[] values() {
            return (SEEK_MODE[]) $VALUES.clone();
        }

        public int getValue() {
            return this.mValue;
        }

        public static SEEK_MODE valueOf(String str) {
            return (SEEK_MODE) V0N.LJJJ(SEEK_MODE.class, str);
        }

        public SEEK_MODE(String str, int i, int i2) {
            this.mValue = i2;
        }
    }

    public VEEditor() {
        throw null;
    }

    public final void LJIIL() {
        this.LJLIL = (YOO) C36539EVr.LJ("com.ss.android.vesdk.VEMVInvoker", new Class[]{VEEditor.class}, this);
        this.LJLJI = (YOD) C36539EVr.LJ("com.ss.android.vesdk.VEBingoInvoker", new Class[]{VEEditor.class}, this);
        this.LJLILLLLZI = (YOC) C36539EVr.LJ("com.ss.android.vesdk.VEStickerInvoker", new Class[]{VEEditor.class}, this);
        this.LJLJJI = new YO9(this);
        this.LJLJJL = new YOU(this);
        new C87301YOb(this);
        if (this.LJLILLLLZI == null) {
            P4Q.LIZJ("VEEditor", "VEStickerInvoker is NULL");
        }
    }

    public final int LJIL() {
        int duration;
        synchronized (this) {
            duration = this.LLIIII.getDuration();
        }
        return duration;
    }

    public final VEState LJJ() {
        synchronized (this) {
            TEInterface tEInterface = this.LLIIII;
            if (tEInterface == null) {
                P4Q.LJII("VEEditor", "video editor is created yet");
                return VEState.IDLE;
            }
            int curState = tEInterface.getCurState();
            if (curState < 0) {
                P4Q.LJII("VEEditor", "native video editor is not inited, already released or releasing");
                return VEState.IDLE;
            }
            return VEState.valueOf(curState);
        }
    }

    public final int LJJIIZI() {
        int pause;
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause... refreshFrame:");
            LIZ.append(false);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
            pause = this.LLIIII.pause(0);
        }
        return pause;
    }

    public final int LJJIJIIJI() {
        int refreshCurrentFrame;
        synchronized (this) {
            P4Q.LIZ("VEEditor", "refreshCurrentFrame...");
            refreshCurrentFrame = this.LLIIII.refreshCurrentFrame(0);
        }
        return refreshCurrentFrame;
    }

    public final void LJJJJIZL() {
        synchronized (this) {
            if (this.LLIIII != null) {
                P4Q.LJII("VEEditor", "stop... ");
                this.LLIIII.stop();
            }
        }
    }

    static {
        new HashMap();
        LLJLILLLLZIIL = new Object();
        LLJLL = false;
        LLJLLIL = 0;
    }

    public final void LJII() {
        P4Q.LJII("VEEditor", "clearNativeFromInvokers... ");
        YOO yoo = this.LJLIL;
        if (yoo != null) {
            yoo.clearNativeFromMV();
        }
        YOD yod = this.LJLJI;
        if (yod != null) {
            yod.clearNativeFromBingo();
        }
        YOC yoc = this.LJLILLLLZI;
        if (yoc != null) {
            yoc.clearNativeFromSticker();
        }
        YO9 yo9 = this.LJLJJI;
        if (yo9 != null) {
            yo9.LIZJ.clearNative();
        }
    }

    public final void LJIILIIL() {
        this.LLF.set(true);
        P4Q.LJII("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            this.LLILZ = false;
            P4Q.LJII("VEEditor", "onDestroy... ");
            TEVideoUtils.nativeCancelCompileProbe();
            if (this.LLIIII.getNativeHandler() == 0) {
                return;
            }
            this.LLIIII.stop();
            if (this.LLJJIJIIJIL == 1) {
                TEMonitorInvoker.nativeMonitorPerfWithType(3);
            }
            SurfaceView surfaceView = this.LLIIIL;
            if (surfaceView != null) {
                surfaceView.getHolder().removeCallback(this.LLJJL);
            } else {
                TextureView textureView = this.LLIIIZ;
                if (textureView != null && textureView.getSurfaceTextureListener() == this.LLJJJJLIIL) {
                    this.LLIIIZ.setSurfaceTextureListener(null);
                }
            }
            this.LLIIIL = null;
            this.LLIIIZ = null;
            this.LLIIIILZ = null;
            TEInterface tEInterface = this.LLIIII;
            if (tEInterface != null) {
                tEInterface.setOpenGLListeners(null);
                this.LLIIII.setInfoListener(null);
                this.LLIIII.setErrorListener(null);
                this.LLIIII.destroyEngine();
                LJII();
            }
            this.LJLJJLL = null;
            Bitmap bitmap = this.LLJJ;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.LLJJ.recycle();
                this.LLJJ = null;
            }
            this.LLF.set(false);
        }
    }

    public final int LJIJJ() {
        return this.LLIIII.getCurPosition();
    }

    public final VESize LJJI() {
        VESize vESize = this.LJLJL;
        VESize vESize2 = new VESize(vESize.width, vESize.height);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoResolution... width:");
        LIZ.append(vESize2.width);
        LIZ.append(", height:");
        C01R.LIZJ(LIZ, vESize2.height, LIZ, "VEEditor");
        return vESize2;
    }

    public final void LJJIIJ() {
        boolean isEmpty;
        long j;
        VE8 ve8 = this.LLJILJILJ;
        synchronized (ve8) {
            isEmpty = ((HashMap) ve8.LIZ).isEmpty();
        }
        long j2 = 0;
        if (isEmpty) {
            j = 0;
        } else {
            j = 1;
        }
        C63868P4u.LJ(1, j, "te_composition_effect_add");
        if (!isEmpty) {
            C63868P4u.LJFF(1, "te_composition_effect_json", this.LLJILJILJ.LJ(0));
        }
        boolean LIZIZ = this.LLJILJILJ.LIZIZ();
        if (!LIZIZ) {
            j2 = 1;
        }
        C63868P4u.LJ(1, j2, "te_composition_info_sticker_add");
        if (!LIZIZ) {
            C63868P4u.LJFF(1, "te_composition_info_sticker_json", this.LLJILJILJ.LJ(1));
        }
        this.LLJILJILJ.LIZLLL();
        C63868P4u.LJFF(1, "iesve_veeditor_composition_finish_file", this.LJLJLJ);
        C63868P4u.LJFF(1, "iesve_veeditor_composition_finish_result", "fail");
        C63868P4u.LJFF(1, "iesve_veeditor_composition_finish_reason", "");
        TEMonitorInvoker.nativeMonitorPerfWithType(1);
    }

    public final void LJJIIZ() {
        if (this.LLF.get()) {
            P4Q.LJII("VEEditor", "no need to releasePreviewSurface, is destroying, just return");
            return;
        }
        synchronized (this) {
            if (this.LLF.get()) {
                P4Q.LJII("VEEditor", "no need to releasePreviewSurface, just lock return");
            } else {
                P4Q.LJII("VEEditor", "surfaceDestroyed...");
                this.LLIIII.releasePreviewSurface();
            }
        }
    }

    public final int LJJIJ() {
        if (!this.LJZI) {
            return 0;
        }
        LJJJIL(this.LLJJJ);
        if (this.LJLLLL != null) {
            VEState vEState = VEState.ERROR;
            try {
                vEState = LJJ();
                int LJIJJ = LJIJJ();
                this.LLIIII.setEnableRemuxVideo(false);
                this.LLIIII.setUsrRotate(0);
                int prepareEngine = this.LLIIII.prepareEngine(0);
                if (prepareEngine != 0) {
                    Q7K.LJ("prepareEngine error: ", prepareEngine, "VEEditor");
                    this.LJLLLL.LIZ(4120, vEState.ordinal(), LJIJJ, null);
                    return prepareEngine;
                }
                int[] initResolution = this.LLIIII.getInitResolution();
                VESize vESize = this.LJLJL;
                vESize.width = initResolution[0];
                vESize.height = initResolution[1];
                if (this.LLFFF > 0 && this.LLFII > 0) {
                    LJJJJJL();
                }
                this.LJLLLL.LIZ(4120, vEState.ordinal(), LJIJJ, null);
                return 0;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("prepareWithCallback error: ");
                LIZ.append(e);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ));
                this.LJLLLL.LIZ(4120, vEState.ordinal(), 0, null);
                return -1;
            }
        }
        this.LLIIII.setEnableRemuxVideo(false);
        this.LLIIII.setUsrRotate(0);
        return this.LLIIII.prepareEngine(0);
    }

    public final void LJJJJJ() {
        YO9 yo9 = this.LJLJJI;
        yo9.getClass();
        P4Q.LIZJ("VEEditor_VEFilterInvoker", "updateFilters");
        int duration = yo9.LIZIZ.getDuration();
        int i = yo9.LIZLLL;
        if (i > -1) {
            yo9.LIZIZ.adjustFilterInOut(i, 0, duration);
        }
        int i2 = yo9.LJ;
        if (i2 > -1) {
            yo9.LIZIZ.adjustFilterInOut(i2, 0, duration);
        }
        int i3 = yo9.LJFF;
        if (i3 > -1) {
            yo9.LIZIZ.adjustFilterInOut(i3, 0, duration);
        }
    }

    public final void LJJJJJL() {
        VESize vESize = this.LJLJL;
        int i = vESize.width;
        int i2 = vESize.height;
        float f = i / i2;
        int i3 = this.LLFFF;
        int i4 = this.LLFII;
        if (f > i3 / i4) {
            this.LLFZ = i3;
            this.LLI = (int) (i3 / (i / i2));
        } else {
            this.LLI = i4;
            this.LLFZ = (int) (i4 / (i2 / i));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateInitDisplaySize... mInitDisplayWidth:");
        LIZ.append(this.LLFZ);
        LIZ.append(", mInitDisplayHeight:");
        C01R.LIZJ(LIZ, this.LLI, LIZ, "VEEditor");
    }

    /* loaded from: classes3.dex */
    public enum SET_RANGE_MODE {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static SET_RANGE_MODE valueOf(String str) {
            return (SET_RANGE_MODE) V0N.LJJJ(SET_RANGE_MODE.class, str);
        }

        SET_RANGE_MODE(int i) {
            this.mValue = i;
        }
    }

    /* loaded from: classes3.dex */
    public enum VEState {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(128);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static VEState valueOf(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 8) {
                                if (i != 16) {
                                    if (i != 32) {
                                        if (i != 64) {
                                            if (i != 128) {
                                                if (i != 65535) {
                                                    if (i != 1048576) {
                                                        return null;
                                                    }
                                                    return NOTHING;
                                                }
                                                return ANY;
                                            }
                                            return COMPLETED;
                                        }
                                        return STOPPED;
                                    }
                                    return SEEKING;
                                }
                                return PAUSED;
                            }
                            return STARTED;
                        }
                        return PREPARED;
                    }
                    return INITIALIZED;
                }
                return IDLE;
            }
            return ERROR;
        }

        public static VEState valueOf(String str) {
            return (VEState) V0N.LJJJ(VEState.class, str);
        }

        VEState(int i) {
            this.mValue = i;
        }
    }

    /* loaded from: classes8.dex */
    public enum GET_FRAMES_FLAGS {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static GET_FRAMES_FLAGS valueOf(String str) {
            return (GET_FRAMES_FLAGS) V0N.LJJJ(GET_FRAMES_FLAGS.class, str);
        }

        GET_FRAMES_FLAGS(int i) {
            this.mValue = i;
        }
    }

    /* loaded from: classes15.dex */
    public enum SCALE_MODE {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS;

        public static SCALE_MODE valueOf(String str) {
            return (SCALE_MODE) V0N.LJJJ(SCALE_MODE.class, str);
        }
    }

    /* loaded from: classes2.dex */
    public enum TIME_MODE {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE;

        public static TIME_MODE valueOf(String str) {
            return (TIME_MODE) V0N.LJJJ(TIME_MODE.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum VIDEO_GRAVITY {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL;

        public static VIDEO_GRAVITY valueOf(String str) {
            return (VIDEO_GRAVITY) V0N.LJJJ(VIDEO_GRAVITY.class, str);
        }
    }

    /* loaded from: classes13.dex */
    public enum VIDEO_SCALETYPE {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        public static VIDEO_SCALETYPE valueOf(String str) {
            return (VIDEO_SCALETYPE) V0N.LJJJ(VIDEO_SCALETYPE.class, str);
        }
    }

    public VEEditor(String str) {
        this.LJLJL = new VESize(-1, -1);
        this.LJLJLJ = "mp4";
        this.LJLJLLL = new HandlerC169726lM(this, C16880lQ.LLJJJJ());
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLZ = new YOB();
        this.LJZ = new C55457Lpd();
        this.LJZI = true;
        this.LJZL = "unknown";
        this.LL = null;
        this.LLD = new HashMap();
        this.LLF = new AtomicBoolean(false);
        this.LLFF = -1;
        YO8 yo8 = new YO8(this);
        YOE yoe = new YOE(this);
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = Boolean.FALSE;
        this.LLII = 0;
        this.LLIIJI = 0;
        this.LLIIJLIL = 0L;
        this.LLIIL = 0L;
        this.LLIILII = 0L;
        this.LLIILZL = 0L;
        this.LLIIZ = 0L;
        this.LLIL = 0L;
        this.LLILII = 0L;
        this.LLILIL = false;
        this.LLILL = -1;
        this.LLILLJJLI = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLILLL = VIDEO_SCALETYPE.CENTER;
        this.LLILZ = false;
        this.LLILZIL = -1;
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = new VE8();
        this.LLJILLL = false;
        this.LLJJ = null;
        this.LLJJI = 0.0f;
        this.LLJJIII = 1.0f;
        this.LLJJIJI = 1.0f;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -16777216;
        this.LLJJJ = -16777216;
        this.LLJJJIL = 0L;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0.0f;
        this.LLJJJJLIIL = new P5R(this);
        this.LLJJL = new P5Q(this);
        P5P p5p = new P5P(this);
        this.LLJJLIIIJLLLLLLLZ = new YOX(this);
        this.LLJL = new YOF(this);
        this.LLJLIL = new YOQ(this);
        C78866UxK.LJIJ("VEEditor-offscreen");
        if (!TextUtils.isEmpty(str)) {
            P4Q.LJFF("VEEditor", "VEEditor offscreen");
            TEInterface createEngine = TEInterface.createEngine();
            this.LLIIII = createEngine;
            this.LJLJJLL = new VEEditorResManager(str);
            createEngine.setOpenGLListeners(p5p);
            createEngine.setInfoListener(yo8);
            createEngine.setErrorListener(yoe);
            C63867P4t.LIZLLL("iesve_veeditor_offscreen", null);
            synchronized (this) {
                createEngine.enableEffectAmazing(false);
            }
            LJIIL();
            C78866UxK.LJJIIJ();
            return;
        }
        throw new VEException(-100, i0.LJFF("workspace is: ", str));
    }

    public static void LJJJ(int i) {
        boolean z;
        boolean z2;
        Q4K.LJ("setOptConfig... ", i, "VEEditor");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i);
            c.LIZ("vesdk_event_editor_opt_config", "performance", jSONObject);
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report optConfig json err ");
            LIZ.append(e);
            P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ));
        }
        boolean z3 = false;
        if (C65429Pm5.LJFF("crossplat_glbase_fbo", false)) {
            i |= 2097152;
        }
        if (C65429Pm5.LJFF("use_byte264", false)) {
            i |= 33554432;
        }
        if (C65429Pm5.LJFF("color_space", false)) {
            i |= 536870912;
        }
        if (C65429Pm5.LJFF("ve_enable_render_encode_resolution_align4", false) && Build.VERSION.SDK_INT >= 24) {
            P4Q.LJFF("VEEditor", "enableRenderEncodeAlign4: true");
            i |= 16777216;
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        C63845P3x.LIZ = z;
        if ((i & FileUtils.BUFFER_SIZE) == 8192) {
            z2 = true;
        } else {
            z2 = false;
        }
        C63845P3x.LIZIZ = z2;
        if ((i & 16777216) == 16777216) {
            z3 = true;
        }
        C63845P3x.LIZJ = z3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setConfig, sUseSingleGLThread = ");
        LIZ2.append(C63845P3x.LIZ);
        LIZ2.append(", sSeekTimeCostOpt = ");
        LIZ2.append(C63845P3x.LIZIZ);
        LIZ2.append(", sOutResolutionBase4 = ");
        LIZ2.append(C63845P3x.LIZJ);
        P4Q.LJFF("VERuntimeConfig", X1D.LIZIZ(LIZ2));
        TEInterface.nativeSetOptVersion(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2 A[LOOP:1: B:26:0x00ae->B:53:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(com.ss.android.vesdk.VEVideoEncodeSettings r16) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJIIJJI(com.ss.android.vesdk.VEVideoEncodeSettings):boolean");
    }

    public final synchronized void LJIILL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSimpleProcessor: ");
        LIZ.append(String.valueOf(z));
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        this.LLIIII.enableSimpleProcessor(z);
    }

    public final Bitmap LJIJJLI(int i) {
        int i2;
        Q4K.LJ("getCurrDisplayImage... width:", i, "VEEditor");
        synchronized (this) {
            VESize LJJI = LJJI();
            int i3 = LJJI.width;
            if (i3 == 0 || (i2 = LJJI.height) == 0) {
                return null;
            }
            if (i <= 0 || i >= i3) {
                i = i3;
            } else {
                i2 = (i2 * i) / i3;
            }
            if (i % 2 == 1) {
                i++;
            }
            if (i2 % 2 == 1) {
                i2++;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                int displayImage = this.LLIIII.getDisplayImage(createBitmap);
                if (displayImage != 0) {
                    Q7K.LJ("getDisplayImage failed ", displayImage, "VEEditor");
                    if (createBitmap == null || createBitmap.isRecycled()) {
                        return null;
                    }
                    createBitmap.recycle();
                    return null;
                }
                return createBitmap;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getDisplayImage createBitmap failed ");
                LIZ.append(e.getMessage());
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ));
                return null;
            }
        }
    }

    public final boolean LJJIII(VEVideoEncodeSettings vEVideoEncodeSettings) {
        synchronized (this) {
            if (this.LLILZ) {
                if (this.LLIIII.getNativeHandler() == 0) {
                    return false;
                }
                this.LLIIII.genEditorStatus();
                long nativeContext = VERuntime.getInstance().getNativeContext();
                VKP vkp = VKP.LJLILLLLZI;
                vkp.LJLIL.LIZLLL(vEVideoEncodeSettings, nativeContext);
                return vkp.LJLIL.LIZIZ();
            }
            throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
        }
    }

    public final void LJJIIJZLJL(Surface surface) {
        Rect rect;
        C78866UxK.LJIJ("VEEditor-onSurfaceCreated.");
        P4Q.LJII("VEEditor", "surfaceCreated...");
        if (this.LLJILLL && this.LLJJ != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.LLJJ.getWidth();
            int height2 = this.LLJJ.getHeight();
            StringBuilder LIZJ = C06460Ne.LIZJ("width ", width, " height ", height, " image width ");
            LIZJ.append(width2);
            LIZJ.append(" image height ");
            LIZJ.append(height2);
            P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZJ));
            float f = width;
            float f2 = height;
            float f3 = width2 / height2;
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            lockCanvas.drawBitmap(this.LLJJ, (Rect) null, rect, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
        }
        this.LLIIII.setPreviewSurface(surface);
        if (this.LJLLL != null) {
            this.LJLLL.LIZ(surface);
        }
        C78866UxK.LJJIIJ();
    }

    public final void LJJIJIL(int i) {
        Q4K.LJ("setBackgroundColor... color:", i, "VEEditor");
        this.LLJJIJIL = i;
        this.LLIIII.setBackGroundColor(i);
    }

    public final void LJJIJL(String str) {
        YO9 yo9 = this.LJLJJI;
        synchronized (yo9.LIZ) {
            P4Q.LJFF("VEEditor_VEFilterInvoker", "setColorFilter normal...");
            int i = yo9.LIZLLL;
            if (i < 0) {
                P4Q.LIZJ("VEEditor_VEFilterInvoker", "setColorFilter... mColorFilterIndex error.");
                return;
            }
            if (str == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setColorFilter... param error. intensity = ");
                LIZ.append(1.0f);
                LIZ.append(", filterPath = ");
                LIZ.append(str);
                P4Q.LIZJ("VEEditor_VEFilterInvoker", X1D.LIZIZ(LIZ));
                return;
            }
            if (yo9.LJII == null) {
                yo9.LJII = new C84049Wyj();
            }
            C84049Wyj c84049Wyj = yo9.LJII;
            c84049Wyj.LIZ = str;
            c84049Wyj.getClass();
            c84049Wyj.getClass();
            c84049Wyj.getClass();
            c84049Wyj.getClass();
            yo9.LIZIZ.setFilterParam(i, "left filter", str);
            yo9.LIZIZ.setFilterParam(yo9.LIZLLL, "use filter res intensity", String.valueOf(false));
            TEInterface tEInterface = yo9.LIZIZ;
            int i2 = yo9.LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(1.0f);
            tEInterface.setFilterParam(i2, "left filter intensity", X1D.LIZIZ(LIZ2));
            yo9.LIZIZ.setFilterParam(yo9.LIZLLL, "right filter", "");
            yo9.LIZIZ.setFilterParam(yo9.LIZLLL, "filter position", "1.0");
            C63870P4w c63870P4w = new C63870P4w();
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(File.separator);
                if (split.length > 0) {
                    str2 = split[split.length - 1];
                }
            }
            c63870P4w.LIZJ("iesve_veeditor_set_filter_click_filter_id", str2);
            C63867P4t.LIZLLL("iesve_veeditor_set_filter_click", c63870P4w);
            C63868P4u.LJFF(1, "te_composition_filter_id", str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("filterPath", str);
                jSONObject.put("intensity", String.valueOf(1.0f));
                jSONObject.put("tag", "setColorFilter");
                c.LIZ("vesdk_event_editor_color_filter", "business", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJIJLIJ(Looper looper) {
        this.LJLLI = null;
        if (looper != null) {
            this.LJLJLLL = new HandlerC169726lM(this, looper);
        } else {
            this.LJLJLLL = null;
        }
    }

    public final synchronized void LJJJI(int i) {
        this.LLJJIJIIJIL = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPageMode: ");
        LIZ.append(i);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        this.LLIIII.setPageMode(i);
    }

    public final void LJJJIL(int i) {
        Q4K.LJ("setVideoBackgroudColor... color:", i, "VEEditor");
        this.LLJJJ = i;
        this.LLIIII.setVideoBackGroundColor(i);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        P4Q.LJI("VEEditor", "onFrameAvailable...");
    }

    public VEEditor(String str, TextureView textureView) {
        this.LJLJL = new VESize(-1, -1);
        this.LJLJLJ = "mp4";
        this.LJLJLLL = new HandlerC169726lM(this, C16880lQ.LLJJJJ());
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLZ = new YOB();
        this.LJZ = new C55457Lpd();
        this.LJZI = true;
        this.LJZL = "unknown";
        this.LL = null;
        this.LLD = new HashMap();
        this.LLF = new AtomicBoolean(false);
        this.LLFF = -1;
        YO8 yo8 = new YO8(this);
        YOE yoe = new YOE(this);
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = Boolean.FALSE;
        this.LLII = 0;
        this.LLIIJI = 0;
        this.LLIIJLIL = 0L;
        this.LLIIL = 0L;
        this.LLIILII = 0L;
        this.LLIILZL = 0L;
        this.LLIIZ = 0L;
        this.LLIL = 0L;
        this.LLILII = 0L;
        this.LLILIL = false;
        this.LLILL = -1;
        this.LLILLJJLI = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLILLL = VIDEO_SCALETYPE.CENTER;
        this.LLILZ = false;
        this.LLILZIL = -1;
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = new VE8();
        this.LLJILLL = false;
        this.LLJJ = null;
        this.LLJJI = 0.0f;
        this.LLJJIII = 1.0f;
        this.LLJJIJI = 1.0f;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -16777216;
        this.LLJJJ = -16777216;
        this.LLJJJIL = 0L;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0.0f;
        P5R p5r = new P5R(this);
        this.LLJJJJLIIL = p5r;
        this.LLJJL = new P5Q(this);
        P5P p5p = new P5P(this);
        this.LLJJLIIIJLLLLLLLZ = new YOX(this);
        this.LLJL = new YOF(this);
        this.LLJLIL = new YOQ(this);
        C78866UxK.LJIJ("VEEditor-textureView");
        if (!TextUtils.isEmpty(str)) {
            P4Q.LJFF("VEEditor", "VEEditor textureView");
            TEInterface createEngine = TEInterface.createEngine((VEUserConfig) null);
            this.LLIIII = createEngine;
            this.LJLJJLL = new VEEditorResManager(str);
            this.LLIIIZ = textureView;
            textureView.setSurfaceTextureListener(p5r);
            createEngine.setOpenGLListeners(p5p);
            createEngine.setInfoListener(yo8);
            createEngine.setErrorListener(yoe);
            synchronized (this) {
                createEngine.enableEffectAmazing(false);
            }
            LJIIL();
            C78866UxK.LJJIIJ();
            return;
        }
        throw new VEException(-100, i0.LJFF("workspace is: ", str));
    }

    public final int LJJIJIIJIL(int i, SEEK_MODE seek_mode) {
        int seek;
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seek... ");
            LIZ.append(i);
            LIZ.append(" flags ");
            LIZ.append(seek_mode);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
            if ((seek_mode.getValue() & SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                this.LJLL = null;
                long currentTimeMillis = System.currentTimeMillis();
                this.LLIL = currentTimeMillis;
                if (this.LLIILZL == 0) {
                    this.LLIILZL = currentTimeMillis;
                }
            }
            seek = this.LLIIII.seek(i, this.LLFFF, this.LLFII, seek_mode.getValue());
        }
        return seek;
    }

    public final void LJJJJI(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setWidthHeight... width:");
        LIZ.append(i);
        LIZ.append(", height:");
        LIZ.append(i2);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        this.LLIIII.setWidthHeight(i, i2);
    }

    public final int LJJJJLI(int i, VEBaseFilterParam vEBaseFilterParam) {
        int i2;
        int updateFilterParam;
        YO9 yo9 = this.LJLJJI;
        synchronized (yo9.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateTrackFilterParam, filterIndex: ");
            LIZ.append(i);
            LIZ.append(", param = ");
            LIZ.append(vEBaseFilterParam.toString());
            P4Q.LJFF("VEEditor_VEFilterInvoker", X1D.LIZIZ(LIZ));
            i2 = -1;
            if (vEBaseFilterParam.filterType == 1) {
                TEAudioEffectInterface tEAudioEffectInterface = yo9.LIZJ;
                if (tEAudioEffectInterface == null) {
                    P4Q.LIZJ("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                } else {
                    updateFilterParam = tEAudioEffectInterface.updateAudioFilterParam(-1, i, vEBaseFilterParam);
                }
            } else {
                updateFilterParam = yo9.LIZIZ.updateFilterParam(-1, i, vEBaseFilterParam);
            }
            if (updateFilterParam >= 0) {
                i2 = 0;
            }
        }
        return i2;
    }

    public VEEditor(String str, SurfaceView surfaceView, VEUserConfig vEUserConfig) {
        this.LJLJL = new VESize(-1, -1);
        this.LJLJLJ = "mp4";
        this.LJLJLLL = new HandlerC169726lM(this, C16880lQ.LLJJJJ());
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLZ = new YOB();
        this.LJZ = new C55457Lpd();
        this.LJZI = true;
        this.LJZL = "unknown";
        this.LL = null;
        this.LLD = new HashMap();
        this.LLF = new AtomicBoolean(false);
        this.LLFF = -1;
        YO8 yo8 = new YO8(this);
        YOE yoe = new YOE(this);
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = Boolean.FALSE;
        this.LLII = 0;
        this.LLIIJI = 0;
        this.LLIIJLIL = 0L;
        this.LLIIL = 0L;
        this.LLIILII = 0L;
        this.LLIILZL = 0L;
        this.LLIIZ = 0L;
        this.LLIL = 0L;
        this.LLILII = 0L;
        this.LLILIL = false;
        this.LLILL = -1;
        this.LLILLJJLI = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLILLL = VIDEO_SCALETYPE.CENTER;
        this.LLILZ = false;
        this.LLILZIL = -1;
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = new VE8();
        this.LLJILLL = false;
        this.LLJJ = null;
        this.LLJJI = 0.0f;
        this.LLJJIII = 1.0f;
        this.LLJJIJI = 1.0f;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -16777216;
        this.LLJJJ = -16777216;
        this.LLJJJIL = 0L;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0.0f;
        this.LLJJJJLIIL = new P5R(this);
        P5Q p5q = new P5Q(this);
        this.LLJJL = p5q;
        P5P p5p = new P5P(this);
        this.LLJJLIIIJLLLLLLLZ = new YOX(this);
        this.LLJL = new YOF(this);
        this.LLJLIL = new YOQ(this);
        long currentTimeMillis = System.currentTimeMillis();
        C78866UxK.LJIJ("VEEditor-surfaceView");
        if (!TextUtils.isEmpty(str)) {
            P4Q.LJFF("VEEditor", "VEEditor surfaceView");
            TEInterface createEngine = TEInterface.createEngine(vEUserConfig);
            this.LLIIII = createEngine;
            this.LJLJJLL = new VEEditorResManager(str);
            this.LLIIIL = surfaceView;
            surfaceView.getHolder().addCallback(p5q);
            createEngine.setOpenGLListeners(p5p);
            createEngine.setInfoListener(yo8);
            createEngine.setErrorListener(yoe);
            synchronized (this) {
                createEngine.enableEffectAmazing(false);
            }
            LJIIL();
            C78866UxK.LJJIIJ();
            this.LLJJJJ = (System.currentTimeMillis() - currentTimeMillis) + 0;
            return;
        }
        throw new VEException(-100, i0.LJFF("workspace is: ", str));
    }

    public static LoudnessDetectResult[] LJIILJJIL(String[] strArr, int[] iArr, int[] iArr2) {
        int length;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int length2 = iArr.length;
        int length3 = iArr2.length;
        if (length <= 0 || length2 != length3 || (length2 > 0 && length2 != length)) {
            StringBuilder LIZJ = C06460Ne.LIZJ("detectAudioLoudness invalid param, audioPathLength:", length, " trimInLength: ", length2, ", trimOutLength: ");
            LIZJ.append(length3);
            P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZJ));
            return null;
        }
        return TEInterface.nativeDetectAudioLoudness(strArr, iArr, iArr2);
    }

    public final boolean LJIIIIZZ(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LJLLI = null;
        boolean LIZ = LIZ(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.DEFAULT);
        if (!LIZ) {
            P4Q.LIZJ("VEEditor", "_compile failed");
        }
        return LIZ;
    }

    public final void LJJIZ(int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("setImageResizeInfo... width:", i, ", height:", i2, ", resfillmode:");
        LIZJ.append(i3);
        LIZJ.append(", resizeAlgro");
        LIZJ.append(0);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZJ));
        this.LLIIII.setImageResizeinfo(i, i2, i3, 0);
    }

    public final boolean LJJJJ(float f, int i, int i2) {
        boolean trackVolume;
        YOU you = this.LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume... index:");
            LIZ.append(i);
            LIZ.append(" type:");
            LIZ.append(i2);
            LIZ.append(" volume:");
            LIZ.append(f);
            P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            trackVolume = you.LIZIZ.setTrackVolume(i2, you.LIZ.LJLZ.LIZIZ(1, i), f);
        }
        return trackVolume;
    }

    public final int LJJJJL(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        int i3;
        int updateFilterParam;
        YO9 yo9 = this.LJLJJI;
        synchronized (yo9.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateClipFilterParam, clipIndex:");
            LIZ.append(i);
            LIZ.append(",filterIndex:");
            LIZ.append(i2);
            P4Q.LIZ("VEEditor_VEFilterInvoker", X1D.LIZIZ(LIZ));
            i3 = -1;
            if (vEBaseFilterParam.filterType == 1) {
                TEAudioEffectInterface tEAudioEffectInterface = yo9.LIZJ;
                if (tEAudioEffectInterface == null) {
                    P4Q.LIZJ("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                } else {
                    updateFilterParam = tEAudioEffectInterface.updateAudioFilterParam(i, i2, vEBaseFilterParam);
                }
            } else {
                updateFilterParam = yo9.LIZIZ.updateFilterParam(i, i2, vEBaseFilterParam);
            }
            if (updateFilterParam >= 0) {
                i3 = 0;
            }
        }
        return i3;
    }

    public static void LJIJI(VEEditor vEEditor, VEEditorResManager vEEditorResManager, VEVideoEncodeSettings vEVideoEncodeSettings, YOW yow) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        System.currentTimeMillis();
        TEVideoUtils.nativeCancelCompileProbe();
        TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(yow);
        vEEditorResManager.mReverseDone = false;
        if (vEVideoEncodeSettings == null) {
            P4Q.LJII("VEEditor", "using default video setting for genReverseVideo2");
            C87278YNe c87278YNe = new C87278YNe(2);
            c87278YNe.LJIIJ(-1, -1);
            c87278YNe.LIZIZ.resizeMode = 1;
            c87278YNe.LJII(30);
            c87278YNe.LIZIZ.isSupportHWEncoder = false;
            c87278YNe.LJIIIIZZ(13);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
            vEVideoEncodeSettings2.gopSize = 1;
            vEVideoEncodeSettings2.mWatermarkParam = null;
            c87278YNe.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c87278YNe.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
            vEVideoEncodeSettings = c87278YNe.LIZ();
        }
        LLJLLIL++;
        vEEditorResManager.clearReverseCacheFiles();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LLJLLIL);
        LIZ.append("-");
        LIZ.append(0);
        String genReverseVideoPath = vEEditorResManager.genReverseVideoPath(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LLJLLIL);
        LIZ2.append("-");
        LIZ2.append(1);
        String genReverseVideoPath2 = vEEditorResManager.genReverseVideoPath(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LLJLLIL);
        LIZ3.append("-");
        LIZ3.append(0);
        String genSeqAudioPath = vEEditorResManager.genSeqAudioPath(X1D.LIZIZ(LIZ3));
        YOA yoa = new YOA(vEEditor, genReverseVideoPath, genReverseVideoPath2, tEReverseCallback, genSeqAudioPath, vEEditorResManager, yow);
        P4Q.LJFF("VEEditor", "setOnInfoListener...");
        vEEditor.LJLLLL = yoa;
        vEEditor.LJLLLLLL = new YOM(vEEditor, yow);
        P4Q.LJFF("VEEditor", "setOnErrorListener...");
        vEEditor.LJIIIIZZ(genReverseVideoPath, genSeqAudioPath, vEVideoEncodeSettings);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mWorkSpace", vEEditorResManager.getWorkspace());
            String[] strArr = vEEditorResManager.mVideoPaths;
            if (strArr != null) {
                str = Arrays.toString(strArr);
            } else {
                str = null;
            }
            jSONObject.put("mVideoPaths", str);
            String[] strArr2 = vEEditorResManager.mAudioPaths;
            if (strArr2 != null) {
                str2 = Arrays.toString(strArr2);
            } else {
                str2 = null;
            }
            jSONObject.put("mAudioPaths", str2);
            String[] strArr3 = vEEditorResManager.mTransitions;
            if (strArr3 != null) {
                str3 = Arrays.toString(strArr3);
            } else {
                str3 = null;
            }
            jSONObject.put("mTransitions", str3);
            String[] strArr4 = vEEditorResManager.mReverseVideoPath;
            if (strArr4 != null) {
                str4 = Arrays.toString(strArr4);
            } else {
                str4 = null;
            }
            jSONObject.put("mReverseVideoPath", str4);
            String[] strArr5 = vEEditorResManager.mReverseAudioPaths;
            if (strArr5 != null) {
                str5 = Arrays.toString(strArr5);
            } else {
                str5 = null;
            }
            jSONObject.put("mReverseAudioPaths", str5);
            jSONObject.put("resultCode", 0);
            c.LIZ("vesdk_event_editor_reverse_video", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0465 A[Catch: all -> 0x04c8, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0018, B:10:0x0020, B:12:0x0055, B:14:0x0061, B:16:0x0067, B:18:0x006f, B:19:0x00f9, B:20:0x0091, B:22:0x0097, B:24:0x009d, B:25:0x00a0, B:27:0x00d9, B:31:0x0102, B:32:0x010a, B:34:0x0113, B:36:0x0122, B:37:0x014f, B:43:0x0175, B:44:0x0272, B:46:0x0324, B:48:0x032a, B:50:0x0332, B:51:0x0341, B:53:0x034d, B:55:0x0353, B:57:0x035b, B:58:0x0368, B:60:0x037d, B:61:0x0389, B:63:0x03b8, B:65:0x03c0, B:67:0x0404, B:69:0x040c, B:70:0x03d9, B:72:0x03df, B:73:0x03e8, B:75:0x03ee, B:77:0x03f2, B:79:0x03ff, B:80:0x0402, B:84:0x045f, B:86:0x0465, B:87:0x048a, B:89:0x04a6, B:90:0x04bc, B:94:0x04b9, B:95:0x0478, B:96:0x043d, B:98:0x0444, B:99:0x0450, B:101:0x0458, B:102:0x045b, B:105:0x0485, B:106:0x041e, B:107:0x03c8, B:108:0x0430, B:109:0x0180, B:111:0x0184, B:113:0x0188, B:114:0x0190, B:116:0x0223, B:118:0x0230, B:119:0x0237, B:120:0x0192, B:122:0x0196, B:124:0x019a, B:125:0x01a2, B:127:0x01a4, B:129:0x01af, B:130:0x01b6, B:131:0x020f, B:132:0x0219, B:133:0x001e, B:135:0x04be, B:136:0x04c7), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0478 A[Catch: all -> 0x04c8, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0018, B:10:0x0020, B:12:0x0055, B:14:0x0061, B:16:0x0067, B:18:0x006f, B:19:0x00f9, B:20:0x0091, B:22:0x0097, B:24:0x009d, B:25:0x00a0, B:27:0x00d9, B:31:0x0102, B:32:0x010a, B:34:0x0113, B:36:0x0122, B:37:0x014f, B:43:0x0175, B:44:0x0272, B:46:0x0324, B:48:0x032a, B:50:0x0332, B:51:0x0341, B:53:0x034d, B:55:0x0353, B:57:0x035b, B:58:0x0368, B:60:0x037d, B:61:0x0389, B:63:0x03b8, B:65:0x03c0, B:67:0x0404, B:69:0x040c, B:70:0x03d9, B:72:0x03df, B:73:0x03e8, B:75:0x03ee, B:77:0x03f2, B:79:0x03ff, B:80:0x0402, B:84:0x045f, B:86:0x0465, B:87:0x048a, B:89:0x04a6, B:90:0x04bc, B:94:0x04b9, B:95:0x0478, B:96:0x043d, B:98:0x0444, B:99:0x0450, B:101:0x0458, B:102:0x045b, B:105:0x0485, B:106:0x041e, B:107:0x03c8, B:108:0x0430, B:109:0x0180, B:111:0x0184, B:113:0x0188, B:114:0x0190, B:116:0x0223, B:118:0x0230, B:119:0x0237, B:120:0x0192, B:122:0x0196, B:124:0x019a, B:125:0x01a2, B:127:0x01a4, B:129:0x01af, B:130:0x01b6, B:131:0x020f, B:132:0x0219, B:133:0x001e, B:135:0x04be, B:136:0x04c7), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r24, java.lang.String r25, com.ss.android.vesdk.VEVideoEncodeSettings r26, com.ss.android.vesdk.VEAudioEncodeSettings r27) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LIZ(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    public final boolean LJIIJ(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, InterfaceC134045Nw interfaceC134045Nw) {
        this.LJLLI = interfaceC134045Nw;
        boolean LIZ = LIZ(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.DEFAULT);
        if (!LIZ) {
            this.LJLLI = null;
        }
        return LIZ;
    }

    public final int LJJIFFI(String[] strArr, String[] strArr2, String[] strArr3, C5NI c5ni) {
        String arrays;
        boolean z;
        String str;
        synchronized (this) {
            TEMonitorInvoker.nativeReset(1);
            C63868P4u.LIZIZ(1);
            this.LLIIL = System.currentTimeMillis();
            this.LLIILII = System.currentTimeMillis();
            P4Q.LJFF("VEEditor", "init...");
            if (this.LJLJJLL == null) {
                P4Q.LIZJ("VEEditor", "init mResManager is null");
                return -112;
            }
            P4Q.LJFF("VEEditor", "disable file info cache");
            int initVideoEditor = this.LLIIII.initVideoEditor(this.LJLJJLL.getWorkspace(), strArr, strArr3, strArr2, null, c5ni.ordinal());
            JSONObject jSONObject = new JSONObject();
            if (strArr != null) {
                try {
                    arrays = Arrays.toString(strArr);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else {
                arrays = "";
            }
            jSONObject.put("videoFilePaths", arrays);
            if (strArr3 != null) {
                str = Arrays.toString(strArr3);
            } else {
                str = "";
            }
            jSONObject.put("audioFilePaths", str);
            jSONObject.put("vTrimIn", "");
            jSONObject.put("vTrimOut", "");
            jSONObject.put("aTrimIn", "");
            jSONObject.put("aTrimOut", "");
            jSONObject.put("videoSpeed", "");
            jSONObject.put("audioSpeed", "");
            jSONObject.put("rotate", "");
            jSONObject.put("videoOutRes", c5ni.name());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(0L);
            jSONObject.put("cacheCheckTime", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(System.currentTimeMillis() - this.LLIILII);
            jSONObject.put("createSceneTime", X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            double d = 0;
            LIZ3.append(d / d);
            jSONObject.put("hitRate", X1D.LIZIZ(LIZ3));
            jSONObject.put("resultCode", initVideoEditor);
            c.LIZ("vesdk_event_editor_init_video", "business", jSONObject);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("file info cache json: ");
            LIZ4.append(jSONObject.toString());
            P4Q.LIZ("VEEditor", X1D.LIZIZ(LIZ4));
            if (initVideoEditor != 0) {
                P4Q.LIZJ("VEEditor", "initVideoEditor failed, ret = " + initVideoEditor);
                LJJIIJ();
                this.LLILZ = false;
                return initVideoEditor;
            }
            this.LLILZ = true;
            VEEditorResManager vEEditorResManager = this.LJLJJLL;
            vEEditorResManager.mReverseDone = false;
            this.LLILLIZIL = c5ni;
            vEEditorResManager.mAudioPaths = strArr3;
            vEEditorResManager.mVideoPaths = strArr;
            vEEditorResManager.mTransitions = strArr2;
            this.LJLJJI.getClass();
            if (strArr3 != null && strArr3.length != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.LLIFFJFJJ = valueOf;
            if (valueOf.booleanValue()) {
                this.LJLJJLL.mOriginalSoundTrackType = 1;
            } else {
                this.LJLJJLL.mOriginalSoundTrackType = 0;
            }
            this.LJLJJLL.mOriginalSoundTrackIndex = 0;
            this.LLII = 0;
            this.LJLJJI.LIZ();
            return 0;
        }
    }

    public static VEEditor LJIIZILJ(VEEditorResManager vEEditorResManager, VERecordData vERecordData, int i, int i2, YOW yow) {
        VEVideoEncodeSettings LIZ;
        int LJJII;
        P4Q.LJII("VEEditor", "genReverseVideo2 with recordData.");
        if (vERecordData.getSegmentData() != null && vERecordData.getSegmentData().size() > 1) {
            C87278YNe c87278YNe = new C87278YNe(2);
            c87278YNe.LJIIJ(i, i2);
            c87278YNe.LIZIZ.resizeMode = 1;
            c87278YNe.LJII(30);
            c87278YNe.LIZIZ.isSupportHWEncoder = false;
            c87278YNe.LJIIIIZZ(13);
            VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
            vEVideoEncodeSettings.gopSize = 1;
            vEVideoEncodeSettings.mWatermarkParam = null;
            c87278YNe.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c87278YNe.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
            c87278YNe.LJ(false, false);
            LIZ = c87278YNe.LIZ();
        } else {
            C87278YNe c87278YNe2 = new C87278YNe(2);
            c87278YNe2.LJIIJ(i, i2);
            c87278YNe2.LJII(30);
            c87278YNe2.LIZIZ.isSupportHWEncoder = false;
            c87278YNe2.LJIIIIZZ(13);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe2.LIZIZ;
            vEVideoEncodeSettings2.gopSize = 1;
            vEVideoEncodeSettings2.mWatermarkParam = null;
            c87278YNe2.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c87278YNe2.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
            c87278YNe2.LJ(false, false);
            LIZ = c87278YNe2.LIZ();
        }
        VEEditor vEEditor = new VEEditor(vEEditorResManager.getWorkspace());
        long currentTimeMillis = System.currentTimeMillis();
        vEEditor.LL = vERecordData;
        int size = vERecordData.getSegmentData().size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        int i3 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
            if (vERecordSegmentData.mEnable) {
                strArr[i3] = vERecordSegmentData.mVideo;
                strArr2[i3] = vERecordSegmentData.mAudio;
                iArr[i3] = (int) (vERecordSegmentData.getCutTrimIn() / 1000);
                iArr2[i3] = (int) (vERecordSegmentData.getCutTrimOut() / 1000);
                float f = vERecordSegmentData.mSpeed;
                if (f == 0.0f) {
                    f = 1.0f;
                }
                fArr[i3] = f;
                float f2 = vERecordSegmentData.mVideoSpeed;
                if (f2 == 0.0f) {
                    f2 = 1.0f;
                }
                fArr2[i3] = f2;
                rotate_degreeArr[i3] = vERecordSegmentData.mRotate;
                if (vERecordSegmentData.mWithNoSpeedBoth) {
                    iArr3[i3] = (int) (iArr[i3] * 1.0f);
                    iArr4[i3] = (int) (iArr2[i3] * 1.0f);
                } else {
                    float f3 = iArr[i3];
                    float f4 = fArr[i3];
                    iArr3[i3] = (int) (f3 * f4);
                    iArr4[i3] = (int) (iArr2[i3] * f4);
                }
                i3++;
            }
        }
        if (i3 == 0) {
            P4Q.LIZJ("VEEditor", "There are no valid clips!");
            LJJII = -100;
        } else {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i3);
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i3);
            int[] copyOf = Arrays.copyOf(iArr, i3);
            int[] copyOf2 = Arrays.copyOf(iArr2, i3);
            int[] copyOf3 = Arrays.copyOf(iArr3, i3);
            int[] copyOf4 = Arrays.copyOf(iArr4, i3);
            float[] copyOf5 = Arrays.copyOf(fArr, i3);
            float[] copyOf6 = Arrays.copyOf(fArr2, i3);
            ROTATE_DEGREE[] rotate_degreeArr2 = (ROTATE_DEGREE[]) Arrays.copyOf(rotate_degreeArr, i3);
            vEEditor.LJLJJI.LJII = null;
            vEEditor.LLIIII.clearFilter();
            YOB yob = vEEditor.LJLZ;
            yob.LIZ = -1;
            yob.LIZIZ = -1;
            ((ArrayList) yob.LIZJ).clear();
            ((ArrayList) yob.LIZLLL).clear();
            if (vERecordData.isUseMusic()) {
                strArr4 = null;
                copyOf3 = null;
                copyOf4 = null;
                copyOf5 = null;
            }
            LJJII = vEEditor.LJJII(strArr3, copyOf, copyOf2, null, strArr4, copyOf3, copyOf4, copyOf6, copyOf5, rotate_degreeArr2, C5NI.VIDEO_OUT_RATIO_ORIGINAL);
            vEEditor.LLJJJIL = (System.currentTimeMillis() - currentTimeMillis) + vEEditor.LLJJJIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init with VERecordData: ");
            LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
            P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ2));
            if (LJJII == 0) {
                LJIJI(vEEditor, vEEditorResManager, LIZ, yow);
                return vEEditor;
            }
        }
        Q7K.LJ("genReverseVideo2 init error:", LJJII, "VEEditor");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r9 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(int r22, int r23, com.ss.android.vesdk.filterparam.VEBaseFilterParam r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJFF(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam, int, int):int");
    }

    public final void LJJIL(float f, float f2, float f3, int i, int i2) {
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZ(f, "iesve_veeditor_video_scale_width");
        c63870P4w.LIZ(f2, "iesve_veeditor_video_scale_heigh");
        C63867P4t.LIZLLL("iesve_veeditor_video_scale", c63870P4w);
        this.LLJJI = f3;
        this.LLJJIII = f2;
        this.LLJJIJI = f2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDisplayState... ");
        LIZ.append(f);
        LIZ.append(" ");
        LIZ.append(f2);
        LIZ.append(" ");
        LIZ.append(f3);
        LIZ.append(" ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(i2);
        LIZ.append(" ");
        LIZ.append(0);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scaleW", String.valueOf(f));
            jSONObject.put("scaleH", String.valueOf(f2));
            jSONObject.put("degree", String.valueOf(f3));
            jSONObject.put("transX", String.valueOf(i));
            jSONObject.put("transY", String.valueOf(i2));
            c.LIZ("vesdk_event_editor_scale_rotate_trans", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LLIIII.setDisplayState(f, f2, f3, 0.0f, i, i2, 0);
    }

    public static VEEditor LJIJ(VEEditorResManager vEEditorResManager, VETimelineParams vETimelineParams, VEVideoEncodeSettings vEVideoEncodeSettings, int i, int i2, YOW yow) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("genReverseVideo2 with param:startTime:");
        LIZ.append(i);
        LIZ.append("endTime:");
        LIZ.append(i2);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        float[] fArr = new float[vETimelineParams.speed.length];
        int i3 = 0;
        while (true) {
            double[] dArr = vETimelineParams.speed;
            if (i3 >= dArr.length) {
                break;
            }
            fArr[i3] = (float) dArr[i3];
            i3++;
        }
        VEEditor vEEditor = new VEEditor(vEEditorResManager.getWorkspace());
        int LJJII = vEEditor.LJJII(vETimelineParams.videoFilePaths, vETimelineParams.vTrimIn, vETimelineParams.vTrimOut, null, vETimelineParams.audioFilePaths, vETimelineParams.aTrimIn, vETimelineParams.aTrimOut, fArr, fArr, vETimelineParams.rotate, C5NI.VIDEO_OUT_RATIO_ORIGINAL);
        if (LJJII != 0) {
            Q7K.LJ("genReverseVideo2 init2 error:", LJJII, "VEEditor");
            return null;
        }
        SET_RANGE_MODE set_range_mode = SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED;
        YOU you = vEEditor.LJLJJL;
        synchronized (you.LIZ) {
            you.LIZIZ.setTimeRange(i, i2, set_range_mode.getValue());
        }
        LJIJI(vEEditor, vEEditorResManager, vEVideoEncodeSettings, yow);
        return vEEditor;
    }

    public static VEEditor LJIILLIIL(VEEditorResManager vEEditorResManager, VETimelineParams vETimelineParams, int i, int i2, int i3, int i4, YOW yow) {
        VEVideoEncodeSettings LIZ;
        String[] strArr = vETimelineParams.videoFilePaths;
        if (strArr != null && strArr.length > 1) {
            C87278YNe c87278YNe = new C87278YNe(2);
            c87278YNe.LJIIJ(i, i2);
            c87278YNe.LIZIZ.resizeMode = 1;
            c87278YNe.LJII(30);
            c87278YNe.LIZIZ.isSupportHWEncoder = false;
            c87278YNe.LJIIIIZZ(13);
            VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
            vEVideoEncodeSettings.gopSize = 1;
            vEVideoEncodeSettings.mWatermarkParam = null;
            c87278YNe.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c87278YNe.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
            c87278YNe.LJ(false, false);
            LIZ = c87278YNe.LIZ();
        } else {
            C87278YNe c87278YNe2 = new C87278YNe(2);
            c87278YNe2.LJIIJ(-1, -1);
            c87278YNe2.LJII(30);
            c87278YNe2.LIZIZ.isSupportHWEncoder = false;
            c87278YNe2.LJIIIIZZ(13);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe2.LIZIZ;
            vEVideoEncodeSettings2.gopSize = 1;
            vEVideoEncodeSettings2.mWatermarkParam = null;
            c87278YNe2.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c87278YNe2.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
            c87278YNe2.LJ(false, false);
            LIZ = c87278YNe2.LIZ();
        }
        return LJIJ(vEEditorResManager, vETimelineParams, LIZ, i3, i4, yow);
    }

    public static int LIZJ(String str, String str2, int i, int i2, long j, long j2, String str3, int i3, C45015Hlb c45015Hlb, C45014Hla c45014Hla) {
        int i4;
        C87284YNk c87284YNk;
        C87283YNj c87283YNj;
        int intValue;
        C87278YNe c87278YNe = new C87278YNe(2);
        c87278YNe.LIZIZ.externalSettingsJsonStr = str3;
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("use_byte264");
        VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("compile_probe_use_byte264");
        VEConfigCenter.ValuePkt value3 = VEConfigCenter.getInstance().getValue("compile_probe_crf");
        if (value3 != null && value3.getValue() != null && (value3.getValue() instanceof Integer) && (intValue = ((Integer) value3.getValue()).intValue()) > 0) {
            LIZ.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf = intValue;
        }
        if (value != null && value.getValue() != null && ((Boolean) value.getValue()).booleanValue()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (value2 != null && value2.getValue() != null && !((Boolean) value2.getValue()).booleanValue()) {
            i4 = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("KEY_USE_BYTE264= ");
        LIZ2.append(((Boolean) value.getValue()).booleanValue());
        LIZ2.append("KEY_COMPILE_PROBE_USE_BYTE264= ");
        LIZ2.append(((Boolean) value2.getValue()).booleanValue());
        LIZ2.append("tempValue= ");
        LIZ2.append(i4);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ2));
        if (c45014Hla != null) {
            c87283YNj = new C87283YNj(c45014Hla, LIZ, i4);
            c87284YNk = null;
        } else {
            if (c45015Hlb != null) {
                c87284YNk = new C87284YNk(c45015Hlb, i4, LIZ);
                c87283YNj = null;
            }
            return -100;
        }
        VEVideoCompileEncodeSettings videoCompileEncodeSetting = LIZ.getVideoCompileEncodeSetting();
        if (videoCompileEncodeSetting.useHWEncoder && i3 == 1) {
            P4Q.LJII("VEEditor", "compile use hard encode, not soft encode");
            return -100;
        }
        if (str2 == null || str2.isEmpty()) {
            P4Q.LJII("VEEditor", "savepath is null or savepath is empty");
            return -100;
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("savepath is not exist, savepath: ");
            LIZ3.append(str2);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ3));
            return -1;
        }
        String LJFF = i0.LJFF(str2, "/probe/");
        if (!C1B6.LIZIZ(LJFF) && !VEFileUtils.mkdir(LJFF)) {
            P4Q.LJII("VEEditor", "create probeDir failed");
            return -1;
        }
        String LJFF2 = i0.LJFF(LJFF, "compile_probe");
        VEVideoSWEncodeSettings vEVideoSWEncodeSettings = videoCompileEncodeSetting.mSWEncodeSetting;
        TEVideoUtils.nativeCompileProbe(str, LJFF2, i, i2, j, j2, vEVideoSWEncodeSettings.mPreset, vEVideoSWEncodeSettings.mCrf, vEVideoSWEncodeSettings.mGop, vEVideoSWEncodeSettings.mMaxRate, vEVideoSWEncodeSettings.mQPOffset, c87284YNk, c87283YNj, i3);
        File file2 = new File(LJFF2);
        if (file2.exists()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("delete file: ");
            LIZ4.append(LJFF2);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ4));
            C16880lQ.LLLZZIL(file2);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x015d A[Catch: all -> 0x01b4, TryCatch #2 {, blocks: (B:5:0x0006, B:68:0x005a, B:9:0x0061, B:64:0x0068, B:12:0x006f, B:14:0x0076, B:15:0x007a, B:17:0x0081, B:18:0x0085, B:20:0x008c, B:21:0x0090, B:23:0x0097, B:24:0x009b, B:26:0x00a2, B:27:0x00a6, B:29:0x00ad, B:30:0x00b1, B:32:0x00b8, B:33:0x00bc, B:35:0x015d, B:36:0x0173, B:39:0x0175, B:41:0x018b, B:44:0x0191, B:46:0x019d, B:47:0x01a1, B:48:0x01ac, B:51:0x01ae, B:55:0x0158), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0175 A[Catch: all -> 0x01b4, TryCatch #2 {, blocks: (B:5:0x0006, B:68:0x005a, B:9:0x0061, B:64:0x0068, B:12:0x006f, B:14:0x0076, B:15:0x007a, B:17:0x0081, B:18:0x0085, B:20:0x008c, B:21:0x0090, B:23:0x0097, B:24:0x009b, B:26:0x00a2, B:27:0x00a6, B:29:0x00ad, B:30:0x00b1, B:32:0x00b8, B:33:0x00bc, B:35:0x015d, B:36:0x0173, B:39:0x0175, B:41:0x018b, B:44:0x0191, B:46:0x019d, B:47:0x01a1, B:48:0x01ac, B:51:0x01ae, B:55:0x0158), top: B:4:0x0006 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJII(java.lang.String[] r28, int[] r29, int[] r30, java.lang.String[] r31, java.lang.String[] r32, int[] r33, int[] r34, float[] r35, float[] r36, com.ss.android.vesdk.ROTATE_DEGREE[] r37, X.C5NI r38) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJJII(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], float[], com.ss.android.vesdk.ROTATE_DEGREE[], X.5NI):int");
    }

    public final int LJI(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        float f;
        boolean z;
        P4Q.LJFF("VEEditor", "changeResWithEffect in...");
        if (strArr.length == 0 || zArr.length != strArr.length) {
            return -100;
        }
        int stop = this.LLIIII.stop();
        if (stop != 0) {
            Q4K.LJ("stop in changeResWithEffect failed, ret = ", stop, "VEEditor");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeResWithEffect clear reverse before, mOriginalSoundTrackType = ");
        C01R.LIZJ(LIZ, this.LJLJJLL.mOriginalSoundTrackType, LIZ, "VEEditor");
        VEEditorResManager vEEditorResManager = this.LJLJJLL;
        if (vEEditorResManager.mReverseDone && vEEditorResManager.mReverseAudioDone && vEEditorResManager.mReverseAudioPaths != null && vEEditorResManager.mOriginalSoundTrackType == 1) {
            int i = vEEditorResManager.mOriginalSoundTrackIndex;
            YOU you = this.LJLJJL;
            you.getClass();
            P4Q.LJII("VEEditor_VESequenceInvoker", "getVolume...");
            if (you.LIZIZ.getDuration() < 0) {
                f = -100.0f;
            } else {
                f = you.LIZIZ.getTrackVolume(1, you.LIZ.LJLZ.LIZIZ(1, i), 0);
            }
            int i2 = this.LJLJJLL.mOriginalSoundTrackIndex;
            YOU you2 = this.LJLJJL;
            synchronized (you2.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("deleteAudioTrack... trackIndex:");
                LIZ2.append(i2);
                LIZ2.append(" needPrepare:");
                LIZ2.append(false);
                P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
                if (i2 >= 0) {
                    int LIZIZ = you2.LIZ.LJLZ.LIZIZ(1, i2);
                    ((ArrayList) you2.LIZ.LJLZ.LIZJ).remove(Integer.valueOf(i2));
                    you2.LIZIZ.deleteAudioTrack(LIZIZ, false);
                }
            }
            this.LJLJJLL.mOriginalSoundTrackIndex = 0;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("changeResWithEffect remove org audio track index ");
            LIZ3.append(this.LJLJJLL.mOriginalSoundTrackIndex);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ3));
        } else {
            f = -1.0f;
        }
        VEEditorResManager vEEditorResManager2 = this.LJLJJLL;
        vEEditorResManager2.mReverseAudioPaths = null;
        vEEditorResManager2.mReverseVideoPath = null;
        vEEditorResManager2.mReverseDone = false;
        vEEditorResManager2.mReverseAudioDone = false;
        if (strArr3 != null && strArr3.length != 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.LLIFFJFJJ = valueOf;
        if (valueOf.booleanValue()) {
            this.LJLJJLL.mOriginalSoundTrackType = 1;
        } else {
            this.LJLJJLL.mOriginalSoundTrackType = 0;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("changeResWithEffect clear reverse after, mOriginalSoundTrackType = ");
        C01R.LIZJ(LIZ4, this.LJLJJLL.mOriginalSoundTrackType, LIZ4, "VEEditor");
        VEEditorResManager vEEditorResManager3 = this.LJLJJLL;
        vEEditorResManager3.mVideoPaths = strArr;
        vEEditorResManager3.mAudioPaths = strArr3;
        int changeResWithEffect = this.LLIIII.changeResWithEffect(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, ROTATE_DEGREE.toIntArray(rotate_degreeArr));
        if (changeResWithEffect != 0) {
            Q7K.LJ("updateRes in changeResWithEffect failed, ret = ", changeResWithEffect, "VEEditor");
            return changeResWithEffect;
        }
        this.LLIIII.createTimeline();
        int prepareEngine = this.LLIIII.prepareEngine(0);
        if (f >= 0.0f) {
            VEEditorResManager vEEditorResManager4 = this.LJLJJLL;
            LJJJJ(f, vEEditorResManager4.mOriginalSoundTrackIndex, vEEditorResManager4.mOriginalSoundTrackType);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("changeResWithEffect done，mInitSize.width = ");
        LIZ5.append(this.LJLJL.width);
        LIZ5.append(", mInitSize.height = ");
        LIZ5.append(this.LJLJL.height);
        LIZ5.append(", ret = ");
        LIZ5.append(prepareEngine);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ5));
        return prepareEngine;
    }
}
