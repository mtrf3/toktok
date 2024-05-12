package X;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import org.json.JSONObject;

/* renamed from: X.WDq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81934WDq extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ PreviewImageScene LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C81934WDq(PreviewImageScene previewImageScene, long j) {
        this.LIZIZ = previewImageScene;
        this.LIZJ = j;
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        this.LIZIZ.LLJJ(false);
        this.LIZIZ.getClass();
        C43882HKc.LIZLLL(0, "tool_performance_preview_image_render_time", new JSONObject(), true);
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        this.LIZIZ.LLJJ(true);
        PreviewImageScene previewImageScene = this.LIZIZ;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZJ;
        previewImageScene.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_elapse", elapsedRealtime);
        C43882HKc.LIZLLL(1, "tool_performance_preview_image_render_time", jSONObject, true);
    }
}
