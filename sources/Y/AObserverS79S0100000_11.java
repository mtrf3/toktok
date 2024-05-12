package Y;

import X.AbstractActivityC69131RBf;
import X.AbstractViewOnClickListenerC67619QgJ;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C23930wn;
import X.C65300Pk0;
import X.C94603nU;
import X.DialogC254039y3;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AObserverS79S0100000_11 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS79S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS79S0100000_11 aObserverS79S0100000_11, Object obj) {
        ((AbstractActivityC69131RBf) aObserverS79S0100000_11.l0).LLFZ((Bundle) obj);
    }

    public static final void onChanged$1(AObserverS79S0100000_11 aObserverS79S0100000_11, Object obj) {
        ((AbstractActivityC69131RBf) aObserverS79S0100000_11.l0).LLII((Bundle) obj);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.9y3, android.app.Dialog] */
    public static final void onChanged$2(AObserverS79S0100000_11 aObserverS79S0100000_11, Object obj) {
        View findViewById;
        MutableLiveData<C94603nU> mutableLiveData;
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            DiskManagerPage diskManagerPage = (DiskManagerPage) aObserverS79S0100000_11.l0;
            DialogC254039y3 dialogC254039y3 = diskManagerPage.LJLJI;
            if (dialogC254039y3 == null || !dialogC254039y3.isShowing()) {
                return;
            }
            DialogC254039y3 dialogC254039y32 = diskManagerPage.LJLJI;
            if (dialogC254039y32 != null) {
                dialogC254039y32.dismiss();
            }
            if (!C23930wn.LIZIZ()) {
                return;
            }
            diskManagerPage.Hl();
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        DiskManagerPage diskManagerPage2 = (DiskManagerPage) aObserverS79S0100000_11.l0;
        if (diskManagerPage2.LJLJI == null) {
            final ActivityC45651qj mo49getActivity = diskManagerPage2.mo49getActivity();
            o.LJI(mo49getActivity);
            ?? r1 = new Dialog(mo49getActivity) { // from class: X.9y3
                public C223338pd LJLIL;

                @Override // android.app.Dialog
                public final void show() {
                    Activity ownerActivity;
                    if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
                        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "5257504303795356512")).LIZ) {
                            super.show();
                        }
                        C223338pd c223338pd = this.LJLIL;
                        if (c223338pd != null) {
                            c223338pd.setVisibility(0);
                            C223338pd c223338pd2 = this.LJLIL;
                            if (c223338pd2 != null) {
                                c223338pd2.LIZIZ();
                                return;
                            } else {
                                o.LJIJI("mDualBallView");
                                throw null;
                            }
                        }
                        o.LJIJI("mDualBallView");
                        throw null;
                    }
                }

                @Override // android.app.Dialog, android.content.DialogInterface
                public final void dismiss() {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity != null && !ownerActivity.isFinishing()) {
                        try {
                            super.dismiss();
                        } catch (Exception unused) {
                        }
                        C223338pd c223338pd = this.LJLIL;
                        if (c223338pd != null) {
                            c223338pd.setVisibility(8);
                        } else {
                            o.LJIJI("mDualBallView");
                            throw null;
                        }
                    }
                }

                {
                    super(mo49getActivity, R.style.a77);
                    setOwnerActivity(mo49getActivity);
                }

                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    setContentView(R.layout.ckk);
                    View findViewById2 = findViewById(R.id.ci0);
                    o.LJIIIIZZ(findViewById2, "this.findViewById(R.id.dual_ball_view)");
                    this.LJLIL = (C223338pd) findViewById2;
                }
            };
            r1.setCancelable(false);
            diskManagerPage2.LJLJI = r1;
        }
        DialogC254039y3 dialogC254039y33 = diskManagerPage2.LJLJI;
        if (dialogC254039y33 != null && dialogC254039y33.isShowing()) {
            return;
        }
        DialogC254039y3 dialogC254039y34 = diskManagerPage2.LJLJI;
        if (dialogC254039y34 != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/setting/ui/widget/StorageCleanLoadingDialog", "show", dialogC254039y34, new Object[0], "void", new C65300Pk0(false, "()V", "-5459290063265917882")).LIZ) {
            dialogC254039y34.show();
        }
        if (!C23930wn.LIZIZ()) {
            return;
        }
        DiskViewModel Dl = diskManagerPage2.Dl();
        View view = null;
        if (Dl != null && (mutableLiveData = Dl.LJLJJI) != null) {
            mutableLiveData.setValue(new C94603nU(0));
        }
        View view2 = diskManagerPage2.getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.nbc);
        }
        if (view != null) {
            view.setVisibility(8);
        }
        View view3 = diskManagerPage2.getView();
        if (view3 == null || (findViewById = view3.findViewById(R.id.nbe)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public static final void onChanged$3(AObserverS79S0100000_11 aObserverS79S0100000_11, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            ((AbstractViewOnClickListenerC67619QgJ) aObserverS79S0100000_11.l0).LJIILL();
        }
    }
}
