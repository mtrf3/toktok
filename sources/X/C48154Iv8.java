package X;

import android.text.TextUtils;
import com.ss.android.videoshop.controller.RefactorVideoController;
import java.util.HashMap;

/* renamed from: X.Iv8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48154Iv8 implements InterfaceC46853Ia9 {
    public final /* synthetic */ C48157IvB LJLIL;

    public C48154Iv8(C48157IvB c48157IvB) {
        this.LJLIL = c48157IvB;
    }

    @Override // X.InterfaceC46853Ia9
    public final void onVideoEngineInfos(C47620ImW c47620ImW) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null && refactorVideoController.getVideoInfoBean() != null) {
            C48155Iv9 videoInfoBean = this.LJLIL.LJI.getVideoInfoBean();
            C47620ImW c47620ImW2 = new C47620ImW();
            HashMap hashMap = new HashMap();
            c47620ImW2.LIZ = c47620ImW.LIZ;
            c47620ImW2.LIZIZ = c47620ImW.LIZIZ;
            c47620ImW2.LIZJ = c47620ImW.LIZJ;
            long j = c47620ImW.LJ;
            if (j >= 0) {
                c47620ImW2.LJ = j;
            }
            String str = c47620ImW.LIZLLL;
            if (!TextUtils.isEmpty(str) && !str.isEmpty()) {
                c47620ImW2.LIZLLL = str;
            }
            hashMap.put(c47620ImW2.LIZ, c47620ImW2);
            videoInfoBean.LIZJ = new C46967Ibz(hashMap);
        }
        RefactorVideoController refactorVideoController2 = this.LJLIL.LJI;
        if (refactorVideoController2 != null) {
            refactorVideoController2.responseVideoEngineInfos(c47620ImW);
        }
    }
}
