package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.C0RN;
import X.C35183DrP;
import X.C38995FSd;
import X.DOI;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FEW;
import Y.ARunnableS11S0201000_8;
import android.content.Context;
import com.ss.android.legoimpl.AndInflaterPreloadBootTask;
import com.ss.android.legoimpl.InitAndInflaterTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.task.UltimateInflaterTask;
import java.util.List;

/* loaded from: classes7.dex */
public final class UIInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "UIInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        System.currentTimeMillis();
        if (context == null) {
            return;
        }
        if (DOI.LIZIZ()) {
            InitLegoInflate.LJLIL.LIZ(context);
        }
        new TuxInitTask();
        if (((Boolean) C35183DrP.LIZ.getValue()).booleanValue()) {
            try {
                C38995FSd.LIZJ().execute(new ARunnableS11S0201000_8(1, new FEW(), context, 10));
            } catch (Throwable unused) {
            }
        }
        new InitAndInflaterTask().run(context);
        new AndInflaterPreloadBootTask().run(context);
        new UltimateInflaterTask().run(context);
    }
}
