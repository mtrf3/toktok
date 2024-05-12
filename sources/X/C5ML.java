package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMediaABConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLEVEGlobalConfig;
import com.ss.android.vesdk.VEEditor;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5ML, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ML implements InterfaceC17160ls, C0K7 {
    public static final C5ML LJLIL = new C5ML();

    public static final NLEMediaConfig LIZIZ(String str) {
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        NLEMediaJniJNI.NLEMediaConfig_workSpace_set(nLEMediaConfig.LIZ, nLEMediaConfig, str);
        NLEMediaJniJNI.NLEMediaConfig_mediaLogLevel_set(nLEMediaConfig.LIZ, nLEMediaConfig, LogLevel.LEVEL_DEBUG.swigValue());
        NLEMediaJniJNI.NLEMediaConfig_enableLogExecutor_set(nLEMediaConfig.LIZ, nLEMediaConfig, true);
        NLEMediaABConfig LIZ = nLEMediaConfig.LIZ();
        o.LJIIIIZZ(LIZ, "nleMediaConfig.nleMediaAbConfig");
        NLEMediaJniJNI.NLEMediaABConfig_enableSyncModelInAudio_set(LIZ.LIZ, LIZ, C5MK.LIZ);
        NLEMediaABConfig LIZ2 = nLEMediaConfig.LIZ();
        o.LJIIIIZZ(LIZ2, "nleMediaConfig.nleMediaAbConfig");
        NLEMediaJniJNI.NLEMediaABConfig_enableSyncModelInMainTrack_set(LIZ2.LIZ, LIZ2, false);
        NLEMediaABConfig LIZ3 = nLEMediaConfig.LIZ();
        o.LJIIIIZZ(LIZ3, "nleMediaConfig.nleMediaAbConfig");
        NLEMediaJniJNI.NLEMediaABConfig_enableResourceAsyncRender_set(LIZ3.LIZ, LIZ3, C5MK.LJIIIIZZ);
        NLEMediaJniJNI.NLEMediaConfig_enableCoexistGlobalEffect_set(nLEMediaConfig.LIZ, nLEMediaConfig, C5MK.LIZIZ);
        NLEMediaJniJNI.NLEMediaConfig_enableVEOperationEvent_set(nLEMediaConfig.LIZ, nLEMediaConfig, C5MK.LIZJ);
        NLEMediaJniJNI.NLEMediaConfig_enableDestroyingCheck_set(nLEMediaConfig.LIZ, nLEMediaConfig, true);
        NLEMediaJniJNI.NLEMediaConfig_usingDefaultFpsToMinus1_set(nLEMediaConfig.LIZ, nLEMediaConfig, C5MK.LJII);
        NLEMediaJniJNI.NLEMediaConfig_lockSetDataSourceAndDestroy_set(nLEMediaConfig.LIZ, nLEMediaConfig, C5MK.LJIIJ);
        for (Map.Entry<String, Object> entry : C5MK.LIZLLL.entrySet()) {
            if (entry.getValue() instanceof Boolean) {
                long NLEMediaConfig_nleVEGlobalConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleVEGlobalConfig_get(nLEMediaConfig.LIZ, nLEMediaConfig);
                if (NLEMediaConfig_nleVEGlobalConfig_get == 0) {
                    continue;
                } else {
                    NLEVEGlobalConfig nLEVEGlobalConfig = new NLEVEGlobalConfig(NLEMediaConfig_nleVEGlobalConfig_get);
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_1(nLEVEGlobalConfig.LIZ, nLEVEGlobalConfig, key, ((Boolean) value).booleanValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                }
            } else if (entry.getValue() instanceof Integer) {
                long NLEMediaConfig_nleVEGlobalConfig_get2 = NLEMediaJniJNI.NLEMediaConfig_nleVEGlobalConfig_get(nLEMediaConfig.LIZ, nLEMediaConfig);
                if (NLEMediaConfig_nleVEGlobalConfig_get2 == 0) {
                    continue;
                } else {
                    NLEVEGlobalConfig nLEVEGlobalConfig2 = new NLEVEGlobalConfig(NLEMediaConfig_nleVEGlobalConfig_get2);
                    String key2 = entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_0(nLEVEGlobalConfig2.LIZ, nLEVEGlobalConfig2, key2, ((Integer) value2).intValue());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
            } else {
                continue;
            }
        }
        return nLEMediaConfig;
    }

    public static final EnumC133595Md LIZJ(VEEditor.SEEK_MODE seekMode) {
        o.LJIIIZ(seekMode, "seekMode");
        int i = C133605Me.LIZ[seekMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek;
                        }
                        return EnumC133595Md.EDITOR_SEEK_FLAG_LAST_UpdateInOut;
                    }
                    return EnumC133595Md.EDITOR_SEEK_FLAG_LAST_UpdateOut;
                }
                return EnumC133595Md.EDITOR_SEEK_FLAG_LAST_UpdateIn;
            }
            return EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek;
        }
        return EnumC133595Md.EDITOR_SEEK_FLAG_OnGoing;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final NLEFilter LIZ(long j, long j2, long j3) {
        NLEFilter nLEFilter = new NLEFilter();
        nLEFilter.setStartTime(j * 1000);
        nLEFilter.setEndTime(j2 * 1000);
        NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter = new NLESegmentAudioFadeFilter();
        nLESegmentAudioFadeFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIILIIL(EnumC123874tb.FILTER);
        nLESegmentAudioFadeFilter.LJI(nLEResourceNode);
        NLEEditorJniJNI.NLESegmentAudioFadeFilter_setFadeInLength(nLESegmentAudioFadeFilter.LJ, nLESegmentAudioFadeFilter, 0L);
        NLEEditorJniJNI.NLESegmentAudioFadeFilter_setFadeOutLength(nLESegmentAudioFadeFilter.LJ, nLESegmentAudioFadeFilter, j3 * 1000);
        nLEFilter.LIZJ(nLESegmentAudioFadeFilter);
        return nLEFilter;
    }

    public static final int LIZLLL(NLEEditor nleEditor, InterfaceC126684y8 nleSession, int i, int i2, VEEditor.SET_RANGE_MODE mode) {
        C5JT c5jt;
        o.LJIIIZ(nleEditor, "nleEditor");
        o.LJIIIZ(nleSession, "nleSession");
        o.LJIIIZ(mode, "mode");
        int i3 = C133605Me.LIZIZ[mode.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                c5jt = C5JT.EDITOR_TIMERANGE_FLAG_AFTER_SPEED;
            } else {
                throw new C162476Zf();
            }
        } else {
            c5jt = C5JT.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED;
        }
        return nleSession.V8().LJJ(i * 1000, i2 * 1000, c5jt);
    }
}
