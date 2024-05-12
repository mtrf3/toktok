package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.5QZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QZ<V> implements Callable {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C5QZ(int i, long j, VideoPublishEditModel videoPublishEditModel) {
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C145995oB LJII = C5QW.LJII(this.LJLIL);
        LJII.LIZIZ(this.LJLILLLLZI - C5QW.LIZJ, "duration");
        LJII.LJ("is_click_cancel", C5QW.LIZLLL);
        LJII.LIZ(this.LJLJI, "text_and_captions_cnt");
        FMX.LJIIL("tool_performance_exit_editorpro_page", LJII.LIZ);
        if (((Boolean) C134605Qa.LIZ.getValue()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            long j = this.LJLILLLLZI;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tool_performance_exit_editorpro_page", j - C5QW.LIZJ);
            jSONObject.put("tool_performance_exit_editorpro_page", jSONObject2);
            C5QW.LJJJJI(jSONObject);
        }
        return C76800UCe.LIZ;
    }
}
