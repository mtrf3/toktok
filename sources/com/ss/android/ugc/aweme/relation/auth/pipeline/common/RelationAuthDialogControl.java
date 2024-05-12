package com.ss.android.ugc.aweme.relation.auth.pipeline.common;

import X.ActivityC45651qj;
import X.C1DD;
import X.C221108m2;
import X.C26227ARb;
import X.C35384Due;
import X.C3T4;
import X.C40328FsC;
import X.C40883G2t;
import X.C45804HyK;
import X.C48841JEv;
import X.C58741N3p;
import X.C62822Ol8;
import X.C77133UOz;
import X.C77137UPd;
import X.C77142UPi;
import X.C77144UPk;
import X.C77148UPo;
import X.C77211URz;
import X.C77214USc;
import X.C77266UUc;
import X.C77280UUq;
import X.C78555UsJ;
import X.C78685UuP;
import X.EnumC77147UPn;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.OT3;
import X.QBA;
import X.QBH;
import X.QBJ;
import X.QD3;
import X.UC0;
import X.UP3;
import X.UPA;
import X.UQ2;
import X.XKM;
import X.XKS;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS54S1200000_13;
import kotlin.jvm.internal.AqS66S1100000_13;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes14.dex */
public final class RelationAuthDialogControl implements LifecycleEventObserver {
    public final Context LJLIL;
    public final InterfaceC70422pa LJLILLLLZI;
    public C77211URz LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public final C77211URz LIZ() {
        C77211URz c77211URz = this.LJLJI;
        if (c77211URz != null) {
            return c77211URz;
        }
        o.LJIJI("authContext");
        throw null;
    }

    public final void LJ() {
        Bundle bundle = LIZ().LJLIL.LJFF;
        if (bundle != null && bundle.getBoolean("is_passive_pop_up")) {
            UQ2.LIZ().LIZ.storeLong("last_click_cancel_time", System.currentTimeMillis());
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onEvent$auth_release(OT3 event) {
        o.LJIIIZ(event, "event");
        if (C78685UuP.LJJJZ(event.LJLIL)) {
            this.LJLJJLL = true;
        }
    }

    public RelationAuthDialogControl(Context context, InterfaceC70422pa scope) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scope, "scope");
        this.LJLIL = context;
        this.LJLILLLLZI = scope;
        this.LJLJL = C221108m2.LIZIZ(C77148UPo.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 251));
        this.LJLJLLL = C221108m2.LIZIZ(C77137UPd.LJLIL);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (this.LJLJJI && event == Lifecycle.Event.ON_RESUME) {
            this.LJLJJI = false;
            if (C77266UUc.LIZIZ.LJIILLIIL().LJ()) {
                ((C3T4) this.LJLJL.getValue()).LJIILLIIL(Boolean.TRUE);
                ((UPA) C58741N3p.LIZ(this.LJLIL, UPA.class)).LIZ();
            } else {
                ((C3T4) this.LJLJL.getValue()).LJIILLIIL(Boolean.FALSE);
            }
        }
        if (this.LJLJJL && event == Lifecycle.Event.ON_RESUME) {
            this.LJLJJL = false;
            if (this.LJLJJLL) {
                this.LJLJJLL = false;
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
                if (LJJIFFI != null) {
                    C40328FsC.LIZLLL(LJJIFFI, R.string.i77);
                }
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            source.getLifecycle().removeObserver(this);
            C48841JEv.LIZJ(this.LJLILLLLZI, null);
            ((XKM) this.LJLJL.getValue()).LIZIZ(null);
            if (EventBus.LIZJ().LJI(this)) {
                EventBus.LIZJ().LJIJ(this);
            }
        }
    }

    public final Object LIZIZ(ActivityC45651qj activityC45651qj, C77211URz c77211URz, C77214USc c77214USc) {
        String str;
        XKS xks = new XKS(1, C78555UsJ.LJJII(c77214USc));
        xks.LJIIL();
        C77144UPk c77144UPk = new C77144UPk(xks, c77211URz, this);
        QBA LIZIZ = QBA.LIZIZ();
        QBJ qbj = new QBJ(activityC45651qj);
        qbj.LIZ = "facebook";
        C40883G2t c40883G2t = new C40883G2t();
        if (C35384Due.LIZ()) {
            str = "email, user_friends";
        } else {
            str = "user_friends";
        }
        c40883G2t.LIZLLL("fb_read_permissions", str);
        Bundle bundle = (Bundle) c40883G2t.LIZ;
        Bundle bundle2 = qbj.LIZLLL;
        if (bundle2 == null) {
            qbj.LIZLLL = bundle;
        } else {
            bundle2.putAll(bundle);
        }
        qbj.LIZJ = c77144UPk;
        QBH qbh = new QBH(qbj);
        LIZIZ.getClass();
        QBA.LIZJ(qbh);
        return xks.LJIIJJI();
    }

    public final Object LIZJ(Context context, EnumC77147UPn enumC77147UPn, String str, Bundle bundle, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        String LIZ;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C26227ARb c26227ARb = new C26227ARb(context);
        o.LJIIIZ(enumC77147UPn, "<this>");
        int i = C77142UPi.LIZ[enumC77147UPn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ = context.getString(R.string.i6x);
                    o.LJIIIIZZ(LIZ, "context.getString(R.stri…tings_pop_up_description)");
                } else {
                    throw new Exception("no such relationAuthPlatform");
                }
            } else if (bundle != null && bundle.getBoolean("is_login")) {
                LIZ = C1DD.LIZLLL(R.string.a9l, "AppContextManager.getApp…s_request_FB_description)");
            } else {
                LIZ = C77280UUq.LIZ(context).toString();
            }
        } else {
            LIZ = UP3.LIZ();
        }
        c26227ARb.LIZIZ(LIZ);
        UC0.LIZJ(c26227ARb, C77133UOz.LJLIL);
        c26227ARb.LJII = false;
        c26227ARb.LIZJ(new AqS54S1200000_13(this, str, xks, 2));
        c26227ARb.LIZLLL(new AqS66S1100000_13(this, str, 0));
        c26227ARb.LJI().LIZLLL();
        return xks.LJIIJJI();
    }
}
