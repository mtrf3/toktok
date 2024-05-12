package X;

import Y.ARunnableS1S0001000_6;
import Y.ARunnableS9S0101000_5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.R5z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractDialogC68995R5z extends DialogC26391AXj implements InterfaceC85998Xp4, InterfaceC69103RAd, InterfaceC68974R5e {
    public final Activity LJLIL;
    public final Bundle LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public View LJLLI;

    public abstract void create(Context context);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.LJLL = true;
        super.dismiss();
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).remove(this);
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
            return;
        }
        R41.LJIIJJI(1, 4);
        if (this.LJLJLLL) {
            return;
        }
        new Handler().postDelayed(new ARunnableS1S0001000_6(0, 22), 200L);
    }

    @Override // android.app.Dialog
    public final void show() {
        this.LJLL = false;
        try {
            if (getOwnerActivity() != null && getOwnerActivity().isFinishing()) {
                return;
            }
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "7907308275291316243")).LIZ) {
                super.show();
            }
            R41.LJIIJJI(1, 1);
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC68974R5e
    public final String channel() {
        String str = this.LJLJL;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.DialogC26391AXj, android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(KL2.LJIIJJI(getContext()), -2);
    }

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC68974R5e
    public final String LLZZ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC68974R5e
    public final String Xg() {
        return this.LJLJJL;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
    }

    @Override // X.InterfaceC68974R5e
    public final Bundle getExtras() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC85998Xp4
    public final String LIZIZ(C17900n4 c17900n4) {
        Object obj;
        String str = c17900n4.LIZIZ;
        str.getClass();
        if (!str.equals("login")) {
            if (str.equals("dismiss")) {
                super.cancel();
            }
        } else {
            Object[] objArr = (Object[]) c17900n4.LIZJ;
            if (objArr == null || objArr.length == 0) {
                return null;
            }
            getContext();
            if (C2NU.LIZ.LIZIZ()) {
                this.LJLJLJ = true;
                if (isShowing()) {
                    dismiss();
                }
                Object[] objArr2 = (Object[]) c17900n4.LIZJ;
                if (objArr2 != null && objArr2.length != 0) {
                    obj = objArr2[0];
                } else {
                    obj = null;
                }
                LJ((String) obj);
            } else {
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
                return null;
            }
        }
        return null;
    }

    public final void LJ(String name) {
        if (this.LJLILLLLZI != null) {
            R61 r61 = new R61();
            r61.LIZLLL = this.LJLILLLLZI.getString("enter_from");
            o.LJIIIZ(name, "name");
            r61.LJ = name;
            r61.LIZIZ();
            ((HashMap) r61.LIZIZ).putAll(r61.LIZJ);
            C38816FLg.LJ(new ARunnableS9S0101000_5(4, r61, 13));
        }
        C68972R5c.LJII(Boolean.FALSE, name, this, false, null);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C58725N2z.LIZIZ(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Mob.Event.LOGIN_SUBMIT_");
            LIZ.append(name);
            iFeed0VVManagerService.log(X1D.LIZIZ(LIZ));
            iFeed0VVManagerService.LIZ("LOGIN");
        }
        Intent intent = new Intent(this.LJLIL, (Class<?>) AuthorizeActivity.class);
        Bundle bundle = this.LJLILLLLZI;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("platform", name);
        intent.putExtra("enter_from", this.LJLJI);
        intent.putExtra("enter_method", this.LJLJJI);
        intent.putExtra("enter_type", this.LJLJJL);
        intent.putExtra("login_panel_type", this.LJLJJLL);
        Activity activity = this.LJLIL;
        if (activity != null) {
            C16880lQ.LJFF(activity, 1001, intent);
        }
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("platform", name);
        c35936E8m.LIZ(1, "_perf_monitor");
        FMX.LJIIL("login_choose_platform", c35936E8m.LIZ);
    }

    @Override // X.InterfaceC69103RAd
    public final void LJIIL(int i) {
        if (i == 11 && !this.LJLL) {
            try {
                dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public AbstractDialogC68995R5z(Activity activity, Bundle bundle) {
        super((Context) activity, R.style.a4v, false, true);
        this.LJLIL = activity;
        this.LJLILLLLZI = bundle;
        create(activity);
        this.LJLJI = bundle.getString("enter_from");
        this.LJLJJI = bundle.getString("enter_method");
        this.LJLJJL = bundle.getString("enter_type");
        this.LJLJJLL = bundle.getString("login_panel_type");
        this.LJLJL = bundle.getString("channel");
    }
}
