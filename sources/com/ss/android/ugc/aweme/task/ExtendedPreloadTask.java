package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.C221108m2;
import X.C51735KSd;
import X.C62822Ol8;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public abstract class ExtendedPreloadTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C51735KSd.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 340));

    public abstract String LIZLLL();

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public final String LJ() {
        return (String) this.LJLILLLLZI.getValue();
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }
}
