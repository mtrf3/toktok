package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WkJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83155WkJ implements InterfaceC83314Wms<C83160WkO, Void> {
    public final /* synthetic */ C83146WkA LIZ;

    public C83155WkJ(C83146WkA c83146WkA) {
        this.LIZ = c83146WkA;
    }

    @Override // X.InterfaceC83314Wms
    public final void LIZ(Object obj) {
        C83160WkO param = (C83160WkO) obj;
        o.LJIIIZ(param, "param");
        this.LIZ.LJIJI(param.LIZ);
    }

    @Override // X.InterfaceC83314Wms
    public final void LIZIZ(C83160WkO c83160WkO) {
        C83160WkO param = c83160WkO;
        o.LJIIIZ(param, "param");
        this.LIZ.LJIJI(param.LIZ);
    }

    @Override // X.InterfaceC83314Wms
    public final void onSuccess(Object obj) {
        C83160WkO beautyDownload = (C83160WkO) obj;
        o.LJIIIZ(beautyDownload, "beautyDownload");
        this.LIZ.LJIJI(beautyDownload.LIZ);
        ArrayList arrayList = new ArrayList();
        Iterator<BeautyCategory> it = this.LIZ.LIZJ.iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty : it.next().getBeautyList()) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        for (ComposerBeauty composerBeauty2 : childList) {
                            arrayList.addAll(this.LIZ.LJIJJLI(composerBeauty2, beautyDownload));
                            if (o.LJ(composerBeauty2.getEffect().getUnzipPath(), beautyDownload.LIZ.getEffect().getUnzipPath())) {
                                C78966Uyw.LJJJJL(this.LIZ.LJIIJ, composerBeauty2);
                            }
                        }
                    }
                } else {
                    arrayList.addAll(this.LIZ.LJIJJLI(composerBeauty, beautyDownload));
                    if (o.LJ(composerBeauty.getEffect().getUnzipPath(), beautyDownload.LIZ.getEffect().getUnzipPath())) {
                        C78966Uyw.LJJJJL(this.LIZ.LJIIJ, composerBeauty);
                    }
                }
            }
        }
        C78966Uyw.LJJJJL(this.LIZ.LJJIIJ, arrayList);
    }
}
