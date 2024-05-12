package X;

import android.content.IntentFilter;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168586jW {
    public static volatile boolean LIZ = true;
    public static final List<Integer> LIZIZ = new ArrayList();
    public static final List<Integer> LIZJ = new ArrayList();
    public static final C41949GdF LIZLLL = new C41949GdF();

    public static void LIZJ() {
        if (!C168406jE.LIZ()) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        LIZ = false;
        try {
            C16880lQ.LJJLIIIJILLIZJL(LIZLLL, C5L7.LIZ(), intentFilter);
        } catch (Throwable unused) {
        }
    }

    public static void LIZLLL() {
        if (!C168406jE.LIZ()) {
            return;
        }
        LIZ = true;
        try {
            C16880lQ.LJJLIIIJL(C5L7.LIZ(), LIZLLL);
        } catch (Throwable unused) {
        }
        ((ArrayList) LIZIZ).clear();
        ((ArrayList) LIZJ).clear();
    }

    public static void LIZ(InterfaceC126684y8 nleSession, VideoPublishEditModel editModel, boolean z) {
        o.LJIIIZ(nleSession, "nleSession");
        o.LJIIIZ(editModel, "editModel");
        if (!C168406jE.LIZ()) {
            return;
        }
        nleSession.Z8().LJ(z);
        new NLEEditor().LJ().getTracks().size();
    }

    public static void LIZIZ(int i, long j, String creationId, C168396jD c168396jD, C168396jD c168396jD2, CreativeModel creativeModel, int i2, String itemId, String mvId, String stickerId) {
        Object obj;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(creativeModel, "creativeModel");
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(mvId, "mvId");
        o.LJIIIZ(stickerId, "stickerId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "calling_event_index");
        c145995oB.LJI("creation_id", creationId);
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        c145995oB.LJI("device_id", AppLog.getServerDeviceId());
        c145995oB.LJI("item_id", itemId);
        c145995oB.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        c145995oB.LIZIZ(j, "calling_event_ts");
        c145995oB.LIZ(c168396jD.LIZJ, "channels_playback");
        c145995oB.LIZ(c168396jD.LIZIZ, "playback_sample_rate");
        c145995oB.LIZIZ(c168396jD.LIZLLL, "duration_playback");
        c145995oB.LIZ(c168396jD.LIZ, "glitch_cnt_playback");
        long j2 = c168396jD.LIZLLL;
        int i6 = 0;
        Object obj2 = 0;
        if (j2 > 0) {
            obj = Float.valueOf(((c168396jD.LIZ * 1.0f) / ((float) j2)) * 1000.0f);
        } else {
            obj = obj2;
        }
        c145995oB.LIZJ(obj, "glitch_rate_playback");
        c145995oB.LIZ(c168396jD2.LIZJ, "channels_recording");
        c145995oB.LIZ(c168396jD2.LIZIZ, "recording_sample_rate");
        c145995oB.LIZIZ(c168396jD2.LIZLLL, "duration_recording");
        c145995oB.LIZ(c168396jD2.LIZ, "glitch_cnt_recording");
        long j3 = c168396jD2.LIZLLL;
        if (j3 > 0) {
            obj2 = Float.valueOf(((c168396jD2.LIZ * 1.0f) / ((float) j3)) * 1000.0f);
        }
        c145995oB.LIZJ(obj2, "glitch_rate_recording");
        c145995oB.LJI("mv_id", mvId);
        c145995oB.LJI("sticker_id", stickerId);
        c145995oB.LIZ(C47636Imm.LIZJ(), "audio_route_playback");
        c145995oB.LIZ(C47636Imm.LIZ(), "audio_route_recording");
        c145995oB.LIZJ(LIZIZ, "audio_route_change_list_playback");
        c145995oB.LIZJ(LIZJ, "audio_route_change_list_recording");
        c145995oB.LIZ(i2, "track_num");
        if (creativeModel.audioAlgorithmModel.isAECOn) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c145995oB.LIZ(i3, "aec_on");
        if (creativeModel.audioAlgorithmModel.isLoudnessOn) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c145995oB.LIZ(i4, "loudness_on");
        if (creativeModel.audioAlgorithmModel.isLoudnessCheckOn) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c145995oB.LIZ(i5, "loudness_check_on");
        if (creativeModel.audioAlgorithmModel.isDenoiseOn) {
            i6 = 1;
        }
        c145995oB.LIZ(i6, "denoise_on");
        FMX.LJIIL("audio_glitch", c145995oB.LIZ);
    }
}
