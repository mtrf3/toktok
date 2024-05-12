package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.GoZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42651GoZ extends AbstractC147255qD {
    public static final /* synthetic */ int LJLJJI = 0;
    public final GBS LJLIL = new GBS();
    public final List<Fragment> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;

    public void LLJJ(MotionEvent motionEvent) {
    }

    public int LLJJIII() {
        return 1;
    }

    public int LLJJIJI() {
        return 1;
    }

    public boolean LLJJIJIIJIL() {
        return this instanceof ImageEditRootScene;
    }

    public void LLJJJ() {
    }

    public void LLJJJIL(Configuration configuration) {
    }

    public void LLJJJJ() {
    }

    public boolean LLJJL(int i, int i2, Intent intent) {
        return false;
    }

    public void LLJJLIIIJLLLLLLLZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
    }

    public boolean LLJLIL(Bundle bundle) {
        return !(this instanceof VideoEditContainerScene);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final ActivityC45651qj LLII() {
        Activity activity = this.mActivity;
        if (activity instanceof ActivityC45651qj) {
            return (ActivityC45651qj) activity;
        }
        return null;
    }

    public final Window getWindow() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity.getWindow();
        }
        return null;
    }

    public final C29S requireAppCompatActivity() {
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (C29S) activity;
    }

    public void LLJJI() {
        Integer num;
        Integer enterResId;
        Integer exitResId;
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
        if (LJIIJJI != null && ((ArrayList) LJIIJJI.getSceneList()).size() == 1) {
            Activity activity = this.mActivity;
            if (activity instanceof SAAActivity) {
                ((SAAActivity) activity).LLIIJLIL(new AqS157S0100000_7(activity, 682));
                return;
            } else {
                if (activity == null) {
                    return;
                }
                activity.finish();
                return;
            }
        }
        if (this.mActivity == null) {
            return;
        }
        OSZ LIZLLL = U1F.LIZLLL(LLJJIII());
        C42653Gob c42653Gob = new C42653Gob();
        Integer num2 = (Integer) LIZLLL.getFirst();
        if (num2 == null || num2.intValue() != 0 || (num = (Integer) LIZLLL.getSecond()) == null || num.intValue() != 0) {
            Integer num3 = (Integer) LIZLLL.getFirst();
            if (num3 == null || num3.intValue() != 0) {
                enterResId = (Integer) LIZLLL.getFirst();
            } else {
                enterResId = Integer.valueOf(R.anim.bd);
            }
            Integer num4 = (Integer) LIZLLL.getSecond();
            if (num4 == null || num4.intValue() != 0) {
                exitResId = (Integer) LIZLLL.getSecond();
            } else {
                exitResId = Integer.valueOf(R.anim.bd);
            }
            Activity activity2 = this.mActivity;
            o.LJIIIIZZ(enterResId, "enterResId");
            int intValue = enterResId.intValue();
            o.LJIIIIZZ(exitResId, "exitResId");
            new WN4(intValue, exitResId.intValue(), activity2);
        } else {
            c42653Gob.LIZ = new C82161WMj();
        }
        WM7 wm7 = null;
        if ((this.mActivity instanceof SAAActivity) && !this.LJLJI) {
            this.LJLJI = true;
            NavigationScene LJIIJJI2 = C78923UyF.LJIIJJI(this);
            if (LJIIJJI2 != null) {
                LJIIJJI2.LLJJLIIIJLLLLLLLZ(this, new C42655God(0, null));
            }
        }
        NavigationScene LJIIJJI3 = C78923UyF.LJIIJJI(this);
        if (LJIIJJI3 != null) {
            wm7 = LJIIJJI3.LLJJIII();
        }
        if (o.LJ(wm7, this)) {
            NavigationScene LJIIJJI4 = C78923UyF.LJIIJJI(this);
            if (LJIIJJI4 == null) {
                return;
            }
            LJIIJJI4.LLJJJ(new C42654Goc(c42653Gob.LIZ));
            return;
        }
        NavigationScene LJIIJJI5 = C78923UyF.LJIIJJI(this);
        if (LJIIJJI5 == null) {
            return;
        }
        LJIIJJI5.remove(this);
    }

    public final Context LLJLILLLLZIIL() {
        ActivityC45651qj LLII = LLII();
        if (LLII != null) {
            return LLII;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Scene ");
        LIZ.append(this);
        LIZ.append(" not attached to a context.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final ActivityC45651qj LLJLL() {
        Activity requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC45651qj) requireActivity;
    }

    @Override // X.AbstractC147255qD, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onDestroyView");
        H78.LJI(X1D.LIZIZ(LIZ));
        EventBus LIZJ = EventBus.LIZJ();
        if (LLJJIJIIJIL() && LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
        if (!(this.mActivity instanceof SAAActivity) || ((ArrayList) this.LJLILLLLZI).isEmpty()) {
            return;
        }
        FragmentManager supportFragmentManager = LLJLL().getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireFragmentActivity().supportFragmentManager");
        if (supportFragmentManager.mDestroyed) {
            return;
        }
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            c1b3.LJJI((Fragment) it.next());
        }
        c1b3.LJI();
    }

    @Override // X.WM7
    public void onPause() {
        super.onPause();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onPause");
        H78.LJI(X1D.LIZIZ(LIZ));
        LLJJIJIL(Lifecycle.State.STARTED);
    }

    @Override // X.WM7
    public void onResume() {
        super.onResume();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onResume");
        H78.LJI(X1D.LIZIZ(LIZ));
        LLJJIJIL(Lifecycle.State.RESUMED);
        if ((this.mActivity instanceof SAAActivity) && this.LJLIL.LIZLLL && C78923UyF.LJIILLIIL(this).LLJJIJIIJIL(this)) {
            C78923UyF.LJIILLIIL(this).LLJJ(this, EnumC146655pF.FROM_TRANSLUCENT);
        }
    }

    @Override // X.WM7
    public void onStart() {
        super.onStart();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onStart");
        H78.LJI(X1D.LIZIZ(LIZ));
        LLJJIJIL(Lifecycle.State.STARTED);
    }

    @Override // X.WM7
    public void onStop() {
        super.onStop();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onStop");
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public final void LLJJIJIL(Lifecycle.State state) {
        if (!(this.mActivity instanceof SAAActivity) || ((ArrayList) this.LJLILLLLZI).isEmpty()) {
            return;
        }
        FragmentManager supportFragmentManager = LLJLL().getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            c1b3.LJJIFFI((Fragment) it.next(), state);
        }
        try {
            c1b3.LJII();
        } catch (IllegalArgumentException e) {
            H78.LJ(e);
        }
    }

    public final void LLJLLIL(InterfaceC88472Yns<? super GBS, C76800UCe> config) {
        o.LJIIIZ(config, "config");
        if (this.mView == null) {
            config.invoke(this.LJLIL);
            setTheme(this.LJLIL.LIZJ);
            return;
        }
        throw new IllegalStateException("please invoke saaConfig before view created");
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        NavigationScene LJIIJJI;
        View view;
        super.onActivityCreated(bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokSAARootGroupScene LifecycleLog: ");
        LIZ.append(this);
        LIZ.append(" onActivityCreated");
        H78.LJI(X1D.LIZIZ(LIZ));
        if (!this.LJLIL.LIZIZ && (view = this.mView) != null) {
            view.setLayerType(1, null);
        }
        if (this.mActivity instanceof SAAActivity) {
            U1F.LJFF(requireAppCompatActivity(), LLJJIJI());
        }
        EventBus LIZJ = EventBus.LIZJ();
        if (LLJJIJIIJIL() && !LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        LLJLL().getSupportFragmentManager().LJJLIL(new C42658Gog(this), false);
        if ((this.mActivity instanceof SAAActivity) && (LJIIJJI = C78923UyF.LJIIJJI(this)) != null) {
            LJIIJJI.LLJILJILJ(this, new C42652Goa(this));
        }
    }

    @Override // X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerChildSceneLifecycleCallbacks(new GF8(this), true);
    }

    public final void LLJLLL(int i, Intent intent) {
        this.LJLJI = true;
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
        if (LJIIJJI != null && ((ArrayList) LJIIJJI.getSceneList()).size() == 1) {
            Activity activity = this.mActivity;
            if (activity != null) {
                activity.setResult(i, intent);
                return;
            }
            return;
        }
        NavigationScene LJIIJJI2 = C78923UyF.LJIIJJI(this);
        if (LJIIJJI2 == null) {
            return;
        }
        LJIIJJI2.LLJJLIIIJLLLLLLLZ(this, new C42655God(i, intent));
    }
}
