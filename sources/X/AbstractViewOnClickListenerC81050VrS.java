package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.VrS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractViewOnClickListenerC81050VrS extends C29S implements View.OnClickListener, C0C3, InterfaceC80644Vku {
    public C81052VrU LJLILLLLZI;
    public ViewPager LJLJI;
    public C80645Vkv LJLJJI;
    public C72974SkU LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public LinearLayout LJLL;
    public C73110Smg LJLLI;
    public boolean LJLLILLLL;
    public FrameLayout LJLLJ;
    public FrameLayout LJLLL;
    public final C81051VrT LJLIL = new C81051VrT(this);
    public int LJLJLLL = -1;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLFII(false);
        super.onBackPressed();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC80644Vku
    public final void LIZIZ() {
        this.LJLILLLLZI.getClass();
    }

    public final void LLFZ() {
        int size = this.LJLIL.LIZIZ.size();
        if (size == 0) {
            this.LJLJL.setText(R.string.i0x);
            this.LJLJL.setEnabled(false);
        } else {
            if (size == 1) {
                C81052VrU c81052VrU = this.LJLILLLLZI;
                if (!c81052VrU.LJFF && c81052VrU.LJI == 1) {
                    this.LJLJL.setText(R.string.i0x);
                    this.LJLJL.setEnabled(true);
                }
            }
            this.LJLJL.setEnabled(true);
            this.LJLJL.setText(getString(R.string.i0w, Integer.valueOf(size)));
        }
        this.LJLILLLLZI.getClass();
        this.LJLL.setVisibility(8);
    }

    public final void LLFII(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.LJLIL.LIZJ());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.LJLLILLLL);
        setResult(-1, intent);
    }

    public final void LLII(Item item) {
        if (item.LIZ()) {
            this.LJLJLJ.setVisibility(0);
            TextView textView = this.LJLJLJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C48301IxV.LIZ(item.size));
            LIZ.append("M");
            textView.setText(X1D.LIZIZ(LIZ));
        } else {
            this.LJLJLJ.setVisibility(8);
        }
        if (item.LIZLLL()) {
            this.LJLL.setVisibility(8);
        } else {
            this.LJLILLLLZI.getClass();
        }
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LIZLLL(LIZ);
        super.attachBaseContext(LIZ);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.b1x) {
            onBackPressed();
        } else {
            if (view.getId() != R.id.b1w) {
                return;
            }
            LLFII(true);
            finish();
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C81052VrU c81052VrU = C81055VrX.LIZ;
        setTheme(c81052VrU.LIZLLL);
        super.onCreate(bundle);
        if (!c81052VrU.LJIIJ) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.em);
        getWindow().addFlags(67108864);
        this.LJLILLLLZI = c81052VrU;
        int i = c81052VrU.LJ;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        if (bundle == null) {
            this.LJLIL.LJFF(C16880lQ.LJJLIIIIJ(getIntent(), "extra_default_bundle"));
            this.LJLLILLLL = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.LJLIL.LJFF(bundle);
            this.LJLLILLLL = bundle.getBoolean("checkState");
        }
        this.LJLJJLL = (TextView) findViewById(R.id.b1x);
        this.LJLJL = (TextView) findViewById(R.id.b1w);
        this.LJLJLJ = (TextView) findViewById(R.id.k19);
        C16880lQ.LJIJI(this.LJLJJLL, this);
        C16880lQ.LJIJI(this.LJLJL, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.hfq);
        this.LJLJI = viewPager;
        viewPager.addOnPageChangeListener(this);
        C80645Vkv c80645Vkv = new C80645Vkv(getSupportFragmentManager());
        this.LJLJJI = c80645Vkv;
        this.LJLJI.setAdapter(c80645Vkv);
        C72974SkU c72974SkU = (C72974SkU) findViewById(R.id.b_n);
        this.LJLJJL = c72974SkU;
        c72974SkU.setCountable(this.LJLILLLLZI.LJFF);
        this.LJLLJ = (FrameLayout) findViewById(R.id.arr);
        this.LJLLL = (FrameLayout) findViewById(R.id.lgl);
        this.LJLJJL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 87)));
        this.LJLL = (LinearLayout) findViewById(R.id.hdo);
        this.LJLLI = (C73110Smg) findViewById(R.id.hdn);
        C16880lQ.LJIIZILJ(this.LJLL, new ACListenerS34S0100000_14(this, 88));
        LLFZ();
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C80645Vkv c80645Vkv = (C80645Vkv) this.LJLJI.getAdapter();
        int i2 = this.LJLJLLL;
        if (i2 != -1 && i2 != i) {
            Fragment fragment = (Fragment) c80645Vkv.LJIILLIIL(i2, this.LJLJI);
            if (fragment.getView() != null) {
                AbstractC80634Vkk abstractC80634Vkk = (AbstractC80634Vkk) fragment.getView().findViewById(R.id.eih);
                abstractC80634Vkk.getClass();
                abstractC80634Vkk.LJLJI = new Matrix();
                float LJ = abstractC80634Vkk.LJ(abstractC80634Vkk.LJLZ);
                abstractC80634Vkk.setImageMatrix(abstractC80634Vkk.getImageViewMatrix());
                if (LJ != abstractC80634Vkk.getScale()) {
                    abstractC80634Vkk.LJIIL(LJ);
                }
                abstractC80634Vkk.postInvalidate();
            }
            Item item = (Item) ListProtector.get(c80645Vkv.LJLJJLL, i);
            if (this.LJLILLLLZI.LJFF) {
                int LIZIZ = this.LJLIL.LIZIZ(item);
                this.LJLJJL.setCheckedNum(LIZIZ);
                if (LIZIZ > 0) {
                    this.LJLJJL.setEnabled(true);
                } else {
                    this.LJLJJL.setEnabled(true ^ this.LJLIL.LJ());
                }
            } else {
                boolean contains = this.LJLIL.LIZIZ.contains(item);
                this.LJLJJL.setChecked(contains);
                if (contains) {
                    this.LJLJJL.setEnabled(true);
                } else {
                    this.LJLJJL.setEnabled(true ^ this.LJLIL.LJ());
                }
            }
            LLII(item);
        }
        this.LJLJLLL = i;
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C81051VrT c81051VrT = this.LJLIL;
        c81051VrT.getClass();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(c81051VrT.LIZIZ));
        bundle.putInt("state_collection_type", c81051VrT.LIZJ);
        bundle.putBoolean("checkState", this.LJLLILLLL);
        super.onSaveInstanceState(bundle);
    }
}
