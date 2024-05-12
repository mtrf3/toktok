package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141515gx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, ActivityC45651qj activityC45651qj, StringBuilder sb) {
        if (sb.length() == 0) {
            sb.append(activityC45651qj.getString(i));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(", ");
        LIZ2.append(activityC45651qj.getString(i));
        sb.append(X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(VideoPublishEditModel model, NLEModel nLEModel, ActivityC45651qj context, InterfaceC65784Pro interfaceC65784Pro) {
        String str;
        boolean z;
        boolean z2;
        AudioRecorderParam audioRecorderParam;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(context, "context");
        boolean isCurrentAutoCutMode = model.isCurrentAutoCutMode();
        if (nLEModel != null) {
            str = nLEModel.getExtra("stick_point_on_off_key");
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, "true");
        boolean z3 = model.autoEnhanceOn;
        if (model.veAudioEffectParam != null || ((audioRecorderParam = model.veAudioRecorderParam) != null && audioRecorderParam.hasRecord())) {
            z = true;
        } else {
            z = false;
        }
        boolean LJJJZ = C78685UuP.LJJJZ(model.creativeModel.musicBuzModel.stsTemplateId);
        AudioEnhanceParam audioEnhanceParam = model.audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "model.audioEnhanceParam");
        boolean LJJIFFI = C78685UuP.LJJIFFI(audioEnhanceParam);
        boolean isPipUsed = model.getEditorProModel().isPipUsed();
        boolean z4 = !model.creativeModel.soundEffectInfoModel.soundEffectList.isEmpty();
        if (model.creativeModel.inlineCaptionModel != null || model.captionStruct != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = !model.getEditorProModel().getTransitionResourcePaths().isEmpty();
        if (isCurrentAutoCutMode) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getString(R.string.bgc));
            LIZ2.append("  ");
            LIZJ(model, X1D.LIZIZ(LIZ2), context, interfaceC65784Pro);
            return;
        }
        if (LJ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(context.getString(R.string.bgd));
            LIZ3.append("  ");
            LIZJ(model, X1D.LIZIZ(LIZ3), context, interfaceC65784Pro);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (z3) {
            LIZ(R.string.fiz, context, sb);
        }
        if (z || LJJJZ) {
            C62A.LIZ.getClass();
            LIZ(C62A.LIZ(), context, sb);
        }
        if (LJJIFFI) {
            LIZ(R.string.ita, context, sb);
        }
        if (z5) {
            LIZ(R.string.bga, context, sb);
        }
        if (isPipUsed) {
            LIZ(R.string.fmu, context, sb);
        }
        if (z4) {
            LIZ(R.string.fmh, context, sb);
        }
        if (z2) {
            LIZ(R.string.bwy, context, sb);
        }
        if (z3 || LJJIFFI || isPipUsed || z4 || z || LJJJZ || z5 || z2) {
            String string = context.getString(R.string.bge, sb.toString());
            o.LJIIIIZZ(string, "context.getString(R.stri…stringBuilder.toString())");
            LIZJ(model, string, context, interfaceC65784Pro);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, String str, ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        C34K c34k = new C34K();
        C60903NvH.LJIIJJI().LJIIJJI().LIZ(videoPublishEditModel);
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LJII = true;
        c26227ARb.LJ(R.string.q6i);
        c26227ARb.LIZIZ(str);
        c26227ARb.LIZJ(new AqS133S0200000_2(videoPublishEditModel, c34k, 6));
        UC0.LIZJ(c26227ARb, new AqS106S0300000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) videoPublishEditModel, (VideoPublishEditModel) c34k, (C34K) 1));
        c26227ARb.LJI().LIZLLL();
    }
}
