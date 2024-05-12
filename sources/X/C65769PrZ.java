package X;

import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.crash.Npth;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;

/* renamed from: X.PrZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65769PrZ implements J24, InterfaceC39600FgS, C66G, InterfaceC41560GSu {
    public final /* synthetic */ Object LIZ;

    @Override // X.J24
    public Object LIZ() {
        return ((SQLiteOpenHelper) this.LIZ).getWritableDatabase();
    }

    public /* synthetic */ C65769PrZ(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.InterfaceC39600FgS
    public void LIZIZ(String str) {
        this.LIZ.getClass();
        if (!Npth.isInit()) {
            return;
        }
        C64246PJi LJJI = C64246PJi.LJJI(new StackTraceElement("FdLeakDetector", "report", "FdLeakWarning", 0), str, "FdLeakWarning", C16880lQ.LLLLIIIILLL().getName(), "EnsureNotNull");
        LJJI.LJIIJJI("log_type", "fdLeak");
        C64241PJd.LIZIZ(LJJI);
    }

    @Override // X.C66G
    public void LIZJ(C153075zb c153075zb) {
        C66Y c66y = (C66Y) this.LIZ;
        InfoStickerViewModel infoStickerViewModel = c66y.LJZL;
        if (infoStickerViewModel != null) {
            infoStickerViewModel.LJLJI.setValue(Boolean.TRUE);
        }
        if (SceneExtensionsKt.LIZ(c66y.LJLILLLLZI)) {
            return;
        }
        if (c66y.LLIZLLLIL) {
            c66y.LJIILIIL(true, c153075zb);
        } else {
            c66y.LJIIL(true, c153075zb);
        }
    }
}
