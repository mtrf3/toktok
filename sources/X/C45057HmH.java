package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HmH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45057HmH implements InterfaceC45080Hme<Object> {
    public final List<InterfaceC45080Hme<? extends Object>> LIZ;
    public final C45058HmI LIZIZ;
    public final C45062HmM LIZJ;

    @Override // X.InterfaceC45080Hme
    public final void LIZ() {
        Iterator<InterfaceC45080Hme<? extends Object>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.InterfaceC45080Hme
    public final void LIZIZ() {
        Iterator<InterfaceC45080Hme<? extends Object>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC45080Hme
    public final void cancel() {
        Iterator<InterfaceC45080Hme<? extends Object>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public C45057HmH(VideoPublishEditModel model, List<AutoCutMediaModel> mediaModelList, boolean z) {
        C45058HmI c45058HmI;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        C45062HmM c45062HmM = null;
        if (C35567Dxb.LIZ().enable) {
            c45058HmI = new C45058HmI(model, mediaModelList, z);
            arrayList.add(c45058HmI);
        } else {
            c45058HmI = null;
        }
        this.LIZIZ = c45058HmI;
        if (e1.LIZ(31744, "autocut_selection_preload_cover", true, false)) {
            c45062HmM = new C45062HmM(model);
            arrayList.add(c45062HmM);
        }
        this.LIZJ = c45062HmM;
    }
}
