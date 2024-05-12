package com.ss.android.ugc.aweme.profile.widgets.navbar.base;

import X.AbstractC234519Ih;
import X.C221108m2;
import X.C235889No;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C8VC;
import X.C8W0;
import X.C9HI;
import X.C9ID;
import X.C9PE;
import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileNavActionAssem<AREA extends C9HI, ACTION extends AbstractC234519Ih> extends C8W0 {
    public C9PE service;
    public final C55749LuL navActionData$delegate = new C55749LuL(C47704Ins.LJ(this, C235889No.class, null), checkSupervisorPrepared());
    public final C55749LuL mineProfileInitData$delegate = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
    public final C5H3 actionView$delegate = C221108m2.LIZIZ(new AqS154S0100000_4((ProfileNavActionAssem) this, 740));

    public abstract AREA getActionType();

    public abstract void initNavAction(ACTION action);

    private final C9ID getMineProfileInitData() {
        return (C9ID) this.mineProfileInitData$delegate.getValue();
    }

    public final View getActionView() {
        return (View) this.actionView$delegate.getValue();
    }

    public final C235889No getNavActionData() {
        return (C235889No) this.navActionData$delegate.getValue();
    }

    public final C9PE getService() {
        C9PE c9pe = this.service;
        if (c9pe != null) {
            return c9pe;
        }
        o.LJIJI("service");
        throw null;
    }

    public final boolean isFromMain() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            return myProfileAbility.isFromMain();
        }
        return false;
    }

    public final boolean isVisible() {
        return getService().G7(getActionType());
    }

    @Override // X.C8W0
    public void onCreate() {
        super.onCreate();
        setService((C9PE) C8VC.LIZIZ(this, C65352Pkq.LIZ(C9PE.class), null));
    }

    public final void setService(C9PE c9pe) {
        o.LJIIIZ(c9pe, "<set-?>");
        this.service = c9pe;
    }

    public final void showAlertBadge(boolean z, int i) {
        getService().w9(getActionType(), z, i);
    }

    public final void updateContentDescription(C9HI area, String value) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(value, "value");
        getService().updateContentDescription(area, value);
    }

    public static /* synthetic */ void showAlertBadge$default(ProfileNavActionAssem profileNavActionAssem, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            profileNavActionAssem.showAlertBadge(z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlertBadge");
    }
}
