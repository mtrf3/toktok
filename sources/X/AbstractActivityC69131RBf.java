package X;

import Y.AObserverS79S0100000_11;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RBf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC69131RBf extends ActivityC86117Xqz {
    public BaseAccountFlowFragment LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public abstract void LLFZ(Bundle bundle);

    public abstract void LLII(Bundle bundle);

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String LJJLIIIJJI() {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            return "";
        }
        return LLJJIJIIJIL;
    }

    public final String LJJLIIIJLLLLLLLZ() {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
        if (LLJJIJIIJIL == null) {
            return "";
        }
        return LLJJIJIIJIL;
    }

    public final BaseAccountFlowFragment LLFII() {
        return (BaseAccountFlowFragment) getSupportFragmentManager().LJJJI(R.id.dm7);
    }

    public void LLIIIILZ() {
        setContentView(R.layout.ne);
    }

    public void LLIIIJ() {
        getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, this)));
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BaseAccountFlowFragment LLFII = LLFII();
        if (LLFII != null && LLFII.onBackPressed()) {
            return;
        }
        if (getSupportFragmentManager().LJJJJIZL() == 1) {
            finish();
        } else {
            if (!isActive()) {
                return;
            }
            getSupportFragmentManager().LJJLIIIJJI();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = (ArrayList) C66569QAr.LJII;
        if (!arrayList.isEmpty()) {
            ORS.LJJLL(arrayList);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LLIIIJ();
        LLIIIILZ();
        ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL.observe(this, new AObserverS79S0100000_11(this, 0));
        ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLILLLLZI.observe(this, new AObserverS79S0100000_11(this, 1));
        boolean booleanExtra = getIntent().getBooleanExtra("use_last_ttp_context", false);
        C66569QAr.LJFF(booleanExtra);
        if (booleanExtra) {
            getIntent().removeExtra("use_last_ttp_context");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLIIIZ(AbstractActivityC69131RBf abstractActivityC69131RBf, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle) {
        Boolean bool = Boolean.TRUE;
        abstractActivityC69131RBf.getClass();
        int LJJJJIZL = abstractActivityC69131RBf.getSupportFragmentManager().LJJJJIZL();
        if (bundle.getBoolean("finish_before_jump", false)) {
            LJJJJIZL--;
            bundle.putBoolean("finish_before_jump", false);
            if (abstractActivityC69131RBf.isActive()) {
                abstractActivityC69131RBf.getSupportFragmentManager().LJJLIIIJJI();
            }
        }
        abstractActivityC69131RBf.LJLIL = baseAccountFlowFragment;
        baseAccountFlowFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = abstractActivityC69131RBf.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        if (LJJJJIZL > 0 && bundle.getBoolean("open_page_without_animation", false)) {
            c1b3.LJIIJJI(R.anim.fv, R.anim.a9, R.anim.ft, R.anim.a_);
        }
        String Gl = baseAccountFlowFragment.Gl();
        if (TextUtils.isEmpty(Gl)) {
            int i = bundle.getInt("current_page", -10);
            if (i == -10) {
                Gl = "";
            } else {
                Gl = String.valueOf(i);
            }
        }
        c1b3.LJIIJ(baseAccountFlowFragment, Gl, R.id.dm7);
        if (o.LJ(bool, bool)) {
            c1b3.LJ(null);
        }
        c1b3.LJI();
        if (baseAccountFlowFragment instanceof BaseI18nLoginFragment) {
            C12460eI.LJIIIIZZ((InterfaceC18010nF) baseAccountFlowFragment, abstractActivityC69131RBf);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLIL;
        if (baseAccountFlowFragment != null) {
            baseAccountFlowFragment.onActivityResult(i, i2, intent);
        }
    }
}
