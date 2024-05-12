package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCellNew;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55959Lxj implements InterfaceC82689Wcn {
    public final /* synthetic */ Notice LIZ;
    public final /* synthetic */ ToolEntryCellNew LIZIZ;
    public final /* synthetic */ View LIZJ;

    @Override // X.InterfaceC82689Wcn
    public final void onShow() {
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String templateId = this.LIZ.getTemplateId();
        String str = "";
        if (templateId == null) {
            templateId = "";
        }
        ToolEntryCellNew toolEntryCellNew = this.LIZIZ;
        String createTime = this.LIZ.getCreateTime();
        toolEntryCellNew.getClass();
        long L = ToolEntryCellNew.L(createTime);
        String id = this.LIZ.getId();
        if (id != null) {
            str = id;
        }
        Context context = this.LIZJ.getContext();
        ToolEntryCellNew toolEntryCellNew2 = this.LIZIZ;
        String createTime2 = this.LIZ.getCreateTime();
        toolEntryCellNew2.getClass();
        String LJ = C57105Mb7.LJ(ToolEntryCellNew.L(createTime2) * 1000, context);
        o.LJIIIIZZ(LJ, "formatCreateTimeDescForN…                        )");
        c56045Lz7.getClass();
        C56045Lz7.LJIILL(L, "show", templateId, str, LJ);
    }

    public C55959Lxj(Notice notice, ToolEntryCellNew toolEntryCellNew, View view) {
        this.LIZ = notice;
        this.LIZIZ = toolEntryCellNew;
        this.LIZJ = view;
    }
}
