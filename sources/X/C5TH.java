package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5TH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TH {
    public static final boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!C44384HbQ.LJJIJL(model) || ((!C44384HbQ.LJLJJI(model) || (!model.getEditorProModel().isAdvancedEditDraft() ? model.voiceVolume <= 0.0f : !model.getEditorProModel().getHasAudioInAdvanceEdit())) && !model.hasRecord() && !C138615cH.LIZ(null, model))) {
            return false;
        }
        return true;
    }
}
