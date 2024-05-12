package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReportWarnBottomBarAssem extends BaseCellSlotComponent<ReportWarnBottomBarAssem> {
    public ConstraintLayout LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aed;
    }

    public ReportWarnBottomBarAssem() {
        new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (X.C78996UzQ.LJJIJIL(r1) != false) goto L8;
     */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r6 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r6
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = X.C78897Uxp.LJJIJIIJI(r6)
            r4 = 0
            java.lang.String r3 = "item.aweme"
            if (r0 != 0) goto L42
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.getAweme()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            boolean r0 = r1.isAd()
            r2 = 1
            if (r0 != 0) goto L42
            boolean r0 = X.C78996UzQ.LJJIJIL(r1)
            if (r0 == 0) goto L42
        L24:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.LLFII
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L3c
            r1.setVisibility(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.getAweme()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r3)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.LLFII
            java.lang.String r0 = r6.mEventType
            X.C8MZ.LIZIZ(r2, r1, r0)
        L3b:
            return
        L3c:
            r0 = 8
            r1.setVisibility(r0)
            goto L3b
        L42:
            r2 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReportWarnBottomBarAssem.q4(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ConstraintLayout) view.findViewById(R.id.d8f);
    }
}
