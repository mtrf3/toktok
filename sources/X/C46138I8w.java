package X;

import android.content.Intent;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.jvm.internal.o;

/* renamed from: X.I8w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46138I8w extends SimpleServiceLoadCallback {
    public final /* synthetic */ ToolsActivityAssem LIZ;
    public final /* synthetic */ Intent LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LIZ);
        if (LJIIIIZZ != null) {
            Intent intent = this.LIZIZ;
            boolean z = this.LIZJ;
            String nv0 = C116694i1.LIZ(LJIIIIZZ).nv0();
            String str = "";
            if (nv0 == null) {
                nv0 = "";
            }
            com.bytedance.hox.Hox.LJLLI.LIZ(LJIIIIZZ).Ja(nv0);
            IRecordService recordService = service.uiService().recordService();
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "creation_id");
            if (LLJJIJIIJIL2 != null) {
                str = LLJJIJIIJIL2;
            }
            recordService.showCameraWidgetGuide(LJIIIIZZ, LLJJIJIIJIL, str, MainPageFragmentImpl.LJI().LJJLIIIJJI(), z, C56319M8l.LJLIL);
        }
    }

    public C46138I8w(ToolsActivityAssem toolsActivityAssem, Intent intent, boolean z) {
        this.LIZ = toolsActivityAssem;
        this.LIZIZ = intent;
        this.LIZJ = z;
    }
}
