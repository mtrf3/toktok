package com.ss.android.ugc.aweme.tasks;

import X.C0RN;
import X.C16880lQ;
import X.C1791471i;
import X.C38776FJs;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.M91;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* loaded from: classes10.dex */
public class LogLaunchModeTask implements EE1 {
    public final Uri LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.EEY
    public final String key() {
        return "LogLaunchModeTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String str;
        Uri uri = this.LJLIL;
        String str2 = "";
        if (uri == null) {
            str = "";
        } else {
            str = UriProtector.getQueryParameter(uri, "enter_to");
        }
        long LIZIZ = C38776FJs.LJIIL().LIZIZ(C16880lQ.LLLLJI(C1791471i.LIZ), "red_point_count");
        M91 m91 = new M91();
        m91.LJIILJJIL = this.LJLJI;
        m91.LJIIZILJ = Integer.toString(1);
        if (str != null) {
            str2 = str;
        }
        m91.LJIILL = str2;
        m91.LJIILLIIL = Long.toString(LIZIZ);
        m91.LJIJ = this.LJLILLLLZI;
        m91.LJIILIIL();
    }

    public LogLaunchModeTask(Uri uri, String str, String str2) {
        this.LJLIL = uri;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
