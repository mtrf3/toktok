package com.ss.android.ugc.aweme.notification.module.cell;

import X.C65352Pkq;
import X.C72513Sd3;
import X.C72518Sd8;
import X.C72520SdA;
import X.InterfaceC74236TBo;
import X.TBT;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class NotificationCell<T extends C72520SdA> extends BaseChunkCell<T> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C72518Sd8 LJLJJL = new C72518Sd8(this);

    static {
        TBT tbt = new TBT(NotificationCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        C72513Sd3 c72513Sd3;
        super.onViewAttachedToWindow();
        C72520SdA c72520SdA = (C72520SdA) getItem();
        if (c72520SdA != null && (c72513Sd3 = (C72513Sd3) this.LJLJJL.LIZ(this, LJLJJLL[0])) != null) {
            String str = c72520SdA.LJLILLLLZI.nid;
            o.LJIIIIZZ(str, "it.notice.nid");
            c72513Sd3.LIZIZ(str, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        C72513Sd3 c72513Sd3;
        super.onViewDetachedFromWindow();
        C72520SdA c72520SdA = (C72520SdA) getItem();
        if (c72520SdA != null && (c72513Sd3 = (C72513Sd3) this.LJLJJL.LIZ(this, LJLJJLL[0])) != null) {
            String str = c72520SdA.LJLILLLLZI.nid;
            o.LJIIIIZZ(str, "it.notice.nid");
            c72513Sd3.LIZIZ(str, false);
        }
    }
}
