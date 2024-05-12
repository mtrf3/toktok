package com.ss.android.ugc.aweme.comment.service.assem;

import X.C16880lQ;
import X.C54204LPc;
import X.C56662Kg;
import X.C56702Kk;
import X.QD3;
import Y.ARunnableS40S0100000_4;
import android.view.View;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class CommentHomeViewPagerAssem extends BaseMainContainerUIAssem {
    public C54204LPc LJLIL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CommentHomeViewPagerAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public CommentHomeViewPagerAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onCommentListPageDialogEvent(C56702Kk c56702Kk) {
        Integer num;
        if (this.LJLIL == null) {
            return;
        }
        if (c56702Kk != null) {
            num = Integer.valueOf(c56702Kk.LJLIL);
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            C54204LPc c54204LPc = this.LJLIL;
            if (c54204LPc != null) {
                c54204LPc.setImportantForAccessibility(4);
                return;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        if (num.intValue() != 0) {
            return;
        }
        C54204LPc c54204LPc2 = this.LJLIL;
        if (c54204LPc2 != null) {
            c54204LPc2.setImportantForAccessibility(1);
            c54204LPc2.postDelayed(new ARunnableS40S0100000_4(c54204LPc2, 22), 750L);
        } else {
            o.LJIJI("viewPager");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (C54204LPc) view;
    }
}
