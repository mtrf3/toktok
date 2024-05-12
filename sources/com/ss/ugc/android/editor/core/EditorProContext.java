package com.ss.ugc.android.editor.core;

import X.ActivityC45651qj;
import X.C122724rk;
import X.C124624uo;
import X.C124774v3;
import X.C124894vF;
import X.C124994vP;
import X.C125454w9;
import X.C126644y4;
import X.C132615Ij;
import X.C133035Jz;
import X.C133785Mw;
import X.C52R;
import X.C5BA;
import X.C5G5;
import X.C60722Zw;
import X.C79057V0z;
import X.C86793Y4n;
import X.EnumC127484zQ;
import X.InterfaceC124684uu;
import X.InterfaceC124914vH;
import X.InterfaceC124924vI;
import X.InterfaceC125004vQ;
import X.InterfaceC125914wt;
import X.InterfaceC126604y0;
import X.InterfaceC126614y1;
import X.InterfaceC126624y2;
import X.InterfaceC126684y8;
import X.InterfaceC127784zu;
import X.InterfaceC132255Gz;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEMediaABConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditorProContext extends ViewModel implements InterfaceC124924vI, InterfaceC132255Gz {
    public static final C124994vP Companion = new C124994vP();
    public InterfaceC124914vH editorClientChannel;
    public boolean enableGlobalEffect;
    public boolean enableVEOperateEvent;
    public boolean hasInitialized;
    public boolean isMV;
    public boolean isPreload;
    public String lastRenderNLEData;
    public long lastSelectSlotStartTime;
    public NLEMediaConfig nleMediaConfig;
    public InterfaceC126684y8 nleSession;
    public boolean reuseVEEngine;
    public SurfaceView surfaceView;
    public InterfaceC126604y0 envVariables = new InterfaceC126604y0() { // from class: X.4x5
        public final java.util.Map<String, MutableLiveData<Object>> LIZ = new LinkedHashMap();

        @Override // X.InterfaceC126604y0
        public final <T> MutableLiveData<T> LIZ(String str) {
            if (!this.LIZ.containsKey(str)) {
                this.LIZ.put(str, new MutableLiveData<>());
            }
            Object obj = ((LinkedHashMap) this.LIZ).get(str);
            if (obj instanceof MutableLiveData) {
                return (MutableLiveData) obj;
            }
            return null;
        }

        @Override // X.InterfaceC126604y0
        public final <T> T LIZJ(String str, T t) {
            T t2;
            System.currentTimeMillis();
            if (this.LIZ.containsKey(str)) {
                try {
                    MutableLiveData mutableLiveData = (MutableLiveData) ((LinkedHashMap) this.LIZ).get(str);
                    T t3 = null;
                    if (mutableLiveData != null) {
                        t2 = mutableLiveData.getValue();
                    } else {
                        t2 = null;
                    }
                    if (t2 != null) {
                        t3 = t2;
                    }
                    if (t3 == null) {
                        return t;
                    }
                    return t3;
                } catch (Exception e) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("getProperty::key=", str, ", error cause = ");
                    LIZIZ.append(e.getMessage());
                    C131935Ft.LIZLLL("LiveDataEnvProperties", X1D.LIZIZ(LIZIZ));
                }
            }
            return t;
        }

        @Override // X.InterfaceC126604y0
        public final void LIZIZ(String str, boolean z, Object obj) {
            System.currentTimeMillis();
            if (!this.LIZ.containsKey(str)) {
                MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
                this.LIZ.put(str, mutableLiveData);
                if (z) {
                    mutableLiveData.postValue(obj);
                    return;
                } else {
                    mutableLiveData.setValue(obj);
                    return;
                }
            }
            LiveData liveData = (LiveData) ((LinkedHashMap) this.LIZ).get(str);
            if (z) {
                if (liveData == null) {
                    return;
                }
                liveData.postValue(obj);
            } else {
                if (liveData == null) {
                    return;
                }
                liveData.setValue(obj);
            }
        }
    };
    public InterfaceC127784zu player = new C132615Ij(this);
    public InterfaceC125004vQ editor = new C125454w9(this);
    public InterfaceC126624y2 exporter = new C86793Y4n(this);
    public C52R undoRedoManager = new C126644y4(this);
    public InterfaceC124684uu keyframeEditor = new C124624uo(this);
    public final MutableLiveData<C60722Zw> mutableKeyframeUpdateEvent = new MutableLiveData<>();
    public ArrayList<NLEEditorListener> nleListenerList = new ArrayList<>();

    @Override // X.InterfaceC132255Gz
    public void onCreate(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC132255Gz
    public void onHide() {
    }

    @Override // X.InterfaceC132255Gz
    public void onShow() {
    }

    @Override // X.InterfaceC124924vI
    public NLEMediaConfig getNleMediaConfig() {
        NLEMediaConfig nLEMediaConfig = this.nleMediaConfig;
        if (nLEMediaConfig != null) {
            return nLEMediaConfig;
        }
        o.LJIJI("nleMediaConfig");
        throw null;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC126684y8 getNleSession() {
        InterfaceC126684y8 interfaceC126684y8 = this.nleSession;
        if (interfaceC126684y8 != null) {
            return interfaceC126684y8;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC124924vI
    public NLETrack getSelectedTrack() {
        C122724rk c122724rk;
        Object LJJIIJ = C79057V0z.LJJIIJ(this, "selected_nle_track");
        if (!(LJJIIJ instanceof C122724rk) || (c122724rk = (C122724rk) LJJIIJ) == null) {
            return null;
        }
        return c122724rk.LIZ;
    }

    @Override // X.InterfaceC124924vI
    public NLETrackSlot getSelectedTrackSlot() {
        C124894vF c124894vF;
        Object LJJIIJ = C79057V0z.LJJIIJ(this, "selected_nle_track_slot");
        if (!(LJJIIJ instanceof C124894vF) || (c124894vF = (C124894vF) LJJIIJ) == null) {
            return null;
        }
        return c124894vF.LIZ;
    }

    @Override // X.InterfaceC132255Gz
    public void onDestroy() {
        this.nleListenerList.clear();
        this.lastRenderNLEData = null;
        setHasInitialized(false);
    }

    public EditorProContext() {
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.4ws] */
    private final void setKeyframeListener() {
        getNleSession().V8().LJ(new InterfaceC125914wt() { // from class: X.4ws
            @Override // X.InterfaceC125914wt
            public final void LIZ(String str, long j, String str2, KeyframeType keyframeType) {
                NLETrack selectedTrack;
                StringBuilder LIZJ = C06490Nh.LIZJ("onKeyFrameProcess parentId = ", str, ", time = ", j);
                LIZJ.append(", json = ");
                LIZJ.append(str2);
                C131935Ft.LIZIZ("EditorProContext", X1D.LIZIZ(LIZJ));
                NLETrackSlot selectedTrackSlot = EditorProContext.this.getSelectedTrackSlot();
                if (selectedTrackSlot == null || (selectedTrack = EditorProContext.this.getSelectedTrack()) == null) {
                    return;
                }
                long LJJJI = C78926UyI.LJJJI(C79057V0z.LJIJJLI(EditorProContext.this));
                if (LJJJI < selectedTrackSlot.getStartTime() || LJJJI > selectedTrackSlot.getEndTime()) {
                    return;
                }
                EditorProContext.this.getKeyframeEditor().LIZLLL(LJJJI);
                EditorProContext.this.getNleSession().V8().LJIILL(str, j, str2, selectedTrack, selectedTrackSlot, keyframeType);
                EditorProContext.this.mutableKeyframeUpdateEvent.postValue(new Object(str, j, str2) { // from class: X.2Zw
                    public final String LIZ;
                    public final long LIZIZ;
                    public final String LIZJ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C60722Zw)) {
                            return false;
                        }
                        C60722Zw c60722Zw = (C60722Zw) obj;
                        return o.LJ(this.LIZ, c60722Zw.LIZ) && this.LIZIZ == c60722Zw.LIZIZ && o.LJ(this.LIZJ, c60722Zw.LIZJ);
                    }

                    public final int hashCode() {
                        int hashCode;
                        String str3 = this.LIZ;
                        int i = 0;
                        if (str3 == null) {
                            hashCode = 0;
                        } else {
                            hashCode = str3.hashCode();
                        }
                        int LIZJ2 = JBR.LIZJ(this.LIZIZ, hashCode * 31, 31);
                        String str4 = this.LIZJ;
                        if (str4 != null) {
                            i = str4.hashCode();
                        }
                        return LIZJ2 + i;
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("KeyframeUpdate(parentId=");
                        LIZ.append(this.LIZ);
                        LIZ.append(", time=");
                        LIZ.append(this.LIZIZ);
                        LIZ.append(", param=");
                        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
                    }

                    {
                        this.LIZ = str;
                        this.LIZIZ = j;
                        this.LIZJ = str2;
                    }
                });
            }
        });
    }

    @Override // X.InterfaceC124924vI
    public NLETrack getMainTrack() {
        if (getEditor().r9().getMainTrack() == null) {
            NLETrack nLETrack = new NLETrack();
            nLETrack.LJJ(true);
            getEditor().r9().addTrack(nLETrack);
            return nLETrack;
        }
        NLETrack mainTrack = getEditor().r9().getMainTrack();
        o.LJIIIIZZ(mainTrack, "{\n            editor.get…del().mainTrack\n        }");
        return mainTrack;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC125004vQ getEditor() {
        return this.editor;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC124914vH getEditorClientChannel() {
        return this.editorClientChannel;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC126604y0 getEnvVariables() {
        return this.envVariables;
    }

    public InterfaceC126624y2 getExporter() {
        return this.exporter;
    }

    @Override // X.InterfaceC124924vI
    public boolean getHasInitialized() {
        return this.hasInitialized;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC124684uu getKeyframeEditor() {
        return this.keyframeEditor;
    }

    public LiveData<C60722Zw> getKeyframeUpdateEvent() {
        return this.mutableKeyframeUpdateEvent;
    }

    public long getLastSelectSlotStartTime() {
        return this.lastSelectSlotStartTime;
    }

    @Override // X.InterfaceC124924vI
    public InterfaceC127784zu getPlayer() {
        return this.player;
    }

    @Override // X.InterfaceC124924vI
    public boolean getReuseVEEngine() {
        return this.reuseVEEngine;
    }

    @Override // X.InterfaceC124924vI
    public SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    @Override // X.InterfaceC124924vI
    public C52R getUndoRedoManager() {
        return this.undoRedoManager;
    }

    @Override // X.InterfaceC124924vI
    public boolean isPreload() {
        return this.isPreload;
    }

    public boolean addNLEListener(NLEEditorListener listener) {
        o.LJIIIZ(listener, "listener");
        if (this.nleListenerList.contains(listener)) {
            return false;
        }
        this.nleListenerList.add(listener);
        C79057V0z.LJJ(this).addConsumer(listener);
        return true;
    }

    @Override // X.InterfaceC124924vI
    public void getSelectedSlotTimeRange(long[] range) {
        NLETrackSlot selectedTrackSlot;
        o.LJIIIZ(range, "range");
        NLETrack selectedTrack = getSelectedTrack();
        if (selectedTrack != null && (selectedTrackSlot = getSelectedTrackSlot()) != null) {
            C124774v3.LIZ(selectedTrack, selectedTrackSlot, range);
        }
    }

    @Override // X.InterfaceC132255Gz
    public void onExitEditPage(boolean z) {
        C79057V0z.LJJJJLI(this, "ve_first_frame_rendered", Boolean.FALSE, true);
    }

    public void recreateNLESession(SurfaceView surfaceView) {
        o.LJIIIZ(surfaceView, "surfaceView");
        NLEMediaConfig nleMediaConfig = getNleMediaConfig();
        C133035Jz c133035Jz = C133785Mw.LJFF;
        NLEEditor LJJ = C79057V0z.LJJ(this);
        c133035Jz.getClass();
        setNleSession(C133035Jz.LIZ(nleMediaConfig, surfaceView, LJJ));
        getNleSession().X8().LJIIL(false);
        getNleSession().X8().LJIILL(30);
        getPlayer().Z9(getNleSession().V8());
        getNleSession().R8(C79057V0z.LJJI(this));
        getPlayer().M9(0L);
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_KEY_FRAME, Boolean.FALSE)).booleanValue()) {
            setKeyframeListener();
        }
    }

    public boolean removeNLEListener(NLEEditorListener listener) {
        o.LJIIIZ(listener, "listener");
        if (this.nleListenerList.contains(listener)) {
            C79057V0z.LJJ(this).removeConsumer(listener);
            this.nleListenerList.remove(listener);
            return true;
        }
        return false;
    }

    public void setEditor(InterfaceC125004vQ interfaceC125004vQ) {
        o.LJIIIZ(interfaceC125004vQ, "<set-?>");
        this.editor = interfaceC125004vQ;
    }

    public void setEditorClientChannel(InterfaceC124914vH interfaceC124914vH) {
        this.editorClientChannel = interfaceC124914vH;
    }

    public void setEnvVariables(InterfaceC126604y0 interfaceC126604y0) {
        o.LJIIIZ(interfaceC126604y0, "<set-?>");
        this.envVariables = interfaceC126604y0;
    }

    public void setExporter(InterfaceC126624y2 interfaceC126624y2) {
        o.LJIIIZ(interfaceC126624y2, "<set-?>");
        this.exporter = interfaceC126624y2;
    }

    public void setHasInitialized(boolean z) {
        this.hasInitialized = z;
    }

    public final void setIsMvMode(boolean z) {
        this.isMV = z;
    }

    public void setKeyframeEditor(InterfaceC124684uu interfaceC124684uu) {
        o.LJIIIZ(interfaceC124684uu, "<set-?>");
        this.keyframeEditor = interfaceC124684uu;
    }

    @Override // X.InterfaceC124924vI
    public void setLastSelectSlotStartTime(long j) {
        this.lastSelectSlotStartTime = j;
    }

    public void setNleMediaConfig(NLEMediaConfig nLEMediaConfig) {
        o.LJIIIZ(nLEMediaConfig, "<set-?>");
        this.nleMediaConfig = nLEMediaConfig;
    }

    public void setNleSession(InterfaceC126684y8 interfaceC126684y8) {
        o.LJIIIZ(interfaceC126684y8, "<set-?>");
        this.nleSession = interfaceC126684y8;
    }

    public void setPlayer(InterfaceC127784zu interfaceC127784zu) {
        o.LJIIIZ(interfaceC127784zu, "<set-?>");
        this.player = interfaceC127784zu;
    }

    public void setPreload(boolean z) {
        this.isPreload = z;
    }

    public void setReuseVEEngine(boolean z) {
        this.reuseVEEngine = z;
    }

    public void setUndoRedoManager(C52R c52r) {
        o.LJIIIZ(c52r, "<set-?>");
        this.undoRedoManager = c52r;
    }

    public final void setEnableConfig(boolean z, boolean z2) {
        this.enableGlobalEffect = z;
        this.enableVEOperateEvent = z2;
    }

    public void init(String workSpace, SurfaceView surfaceView, InterfaceC126684y8 interfaceC126684y8) {
        boolean z;
        o.LJIIIZ(workSpace, "workSpace");
        if (!getHasInitialized()) {
            C5G5.LIZ(this);
            this.surfaceView = surfaceView;
            if (interfaceC126684y8 != null) {
                z = true;
            } else {
                z = false;
            }
            setReuseVEEngine(z);
            if (interfaceC126684y8 == null) {
                NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
                NLEMediaABConfig LIZ = nLEMediaConfig.LIZ();
                NLEMediaJniJNI.NLEMediaABConfig_enableRebuildModelWhenMainTrackChange_set(LIZ.LIZ, LIZ, false);
                NLEMediaJniJNI.NLEMediaConfig_workSpace_set(nLEMediaConfig.LIZ, nLEMediaConfig, workSpace);
                NLEMediaABConfig LIZ2 = nLEMediaConfig.LIZ();
                NLEMediaJniJNI.NLEMediaABConfig_forCanvasMode_set(LIZ2.LIZ, LIZ2, true);
                if (!this.isMV) {
                    NLEMediaJniJNI.NLEMediaConfig_enableCoexistGlobalEffect_set(nLEMediaConfig.LIZ, nLEMediaConfig, this.enableGlobalEffect);
                }
                NLEMediaJniJNI.NLEMediaConfig_enableVEOperationEvent_set(nLEMediaConfig.LIZ, nLEMediaConfig, this.enableVEOperateEvent);
                if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_VE_HOT_UPDATE_EXPERIMENT, Boolean.FALSE)).booleanValue()) {
                    NLEMediaABConfig LIZ3 = nLEMediaConfig.LIZ();
                    NLEMediaJniJNI.NLEMediaABConfig_enableHotUpdate_set(LIZ3.LIZ, LIZ3, true);
                }
                setNleMediaConfig(nLEMediaConfig);
                C133035Jz c133035Jz = C133785Mw.LJFF;
                NLEMediaConfig nleMediaConfig = getNleMediaConfig();
                NLEEditor LJJ = C79057V0z.LJJ(this);
                c133035Jz.getClass();
                interfaceC126684y8 = C133035Jz.LIZ(nleMediaConfig, surfaceView, LJJ);
                interfaceC126684y8.X8().LJIILJJIL();
            }
            setNleSession(interfaceC126684y8);
            if (!isPreload()) {
                getNleSession().X8().LJIIL(false);
            }
            getPlayer().Z9(getNleSession().V8());
            setHasInitialized(true);
            return;
        }
        throw new IllegalStateException("EditorProContext repeated initialization.");
    }

    public void renderNLEData(String nleData, boolean z, InterfaceC126614y1 interfaceC126614y1) {
        o.LJIIIZ(nleData, "nleData");
        if (this.nleSession != null && !z) {
            getNleSession().T8(C79057V0z.LJJ(this));
        }
        if (TextUtils.equals(nleData, this.lastRenderNLEData)) {
            return;
        }
        System.currentTimeMillis();
        NLEError LJI = C79057V0z.LJJ(this).LJI(nleData);
        if (interfaceC126614y1 != null) {
            if (LJI.swigValue() == NLEError.SUCCESS.swigValue()) {
                this.lastRenderNLEData = nleData;
                interfaceC126614y1.onSuccess();
            } else {
                interfaceC126614y1.onError(LJI.swigValue(), LJI.name());
            }
        }
    }
}
