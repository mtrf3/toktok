package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;

/* renamed from: X.GoL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42637GoL implements GVH {
    public final /* synthetic */ ToolsActivityAssem LIZ;
    public final /* synthetic */ IAVPublishService LIZIZ;

    @Override // X.GVH
    public final void LIZIZ() {
    }

    @Override // X.GVH
    public final void LIZJ() {
    }

    public C42637GoL(ToolsActivityAssem toolsActivityAssem, IAVPublishService iAVPublishService) {
        this.LIZ = toolsActivityAssem;
        this.LIZIZ = iAVPublishService;
    }

    @Override // X.GVH
    public final void LIZ(Boolean bool, String publishId) {
        Intent intent;
        ActivityC45651qj LJIIIIZZ;
        Intent intent2;
        o.LJIIIZ(publishId, "publishId");
        ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ(this.LIZ);
        boolean z = false;
        if (LJIIIIZZ2 != null && (intent = LJIIIIZZ2.getIntent()) != null && (z = intent.getBooleanExtra("insert_now_post_without_landing", false)) && (LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LIZ)) != null && (intent2 = LJIIIIZZ.getIntent()) != null) {
            intent2.removeExtra("insert_now_post_without_landing");
        }
        if (!this.LIZ.LJLJJLL.contains(publishId)) {
            this.LIZ.LJLJJLL.add(publishId);
            this.LIZIZ.processMainActivityCallback(C55096Ljo.LJIIIIZZ(this.LIZ), publishId, false, z, bool);
        }
    }
}
