package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vm1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80713Vm1 extends LinearLayout implements C0C3, C0C2, InterfaceC80715Vm3 {
    public DIT[] LJLIL;
    public ViewPager LJLILLLLZI;
    public C80766Vms LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public C80714Vm2 LJLJLLL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
    }

    public int getCount() {
        PagerAdapter adapter;
        ViewPager viewPager = this.LJLILLLLZI;
        if (viewPager != null) {
            PagerAdapter adapter2 = viewPager.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof C80772Vmy) {
                return ((C80772Vmy) adapter2).LJLILLLLZI.getCount();
            }
            return adapter2.getCount();
        }
        C80766Vms c80766Vms = this.LJLJI;
        if (c80766Vms == null || (adapter = c80766Vms.getAdapter()) == null) {
            return 0;
        }
        if (adapter instanceof C80772Vmy) {
            return ((C80772Vmy) adapter).LJLILLLLZI.getCount();
        }
        return adapter.getCount();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(i);
        if (i == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(C80766Vms c80766Vms) {
        if (c80766Vms != null) {
            if (this.LJLJI != null) {
                c80766Vms.LJJIIJ(this);
                List<InterfaceC80715Vm3> list = c80766Vms.LLJ;
                if (list != null) {
                    ((ArrayList) list).remove(this);
                }
            }
            this.LJLJI = c80766Vms;
            PagerAdapter adapter = c80766Vms.getAdapter();
            c80766Vms.LJFF(this);
            if (c80766Vms.LLJ == null) {
                c80766Vms.LLJ = new ArrayList();
            }
            ((ArrayList) c80766Vms.LLJ).add(this);
            if (adapter == null) {
                return;
            }
            DataSetObserver dataSetObserver = this.LJLJLLL;
            if (dataSetObserver != null) {
                adapter.LJJII(dataSetObserver);
            }
            C80714Vm2 c80714Vm2 = new C80714Vm2(this, this, adapter);
            this.LJLJLLL = c80714Vm2;
            adapter.LJIJ(c80714Vm2);
            setUpViews(adapter);
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int count;
        if (pagerAdapter instanceof C80772Vmy) {
            count = ((C80772Vmy) pagerAdapter).LJLILLLLZI.getCount();
        } else {
            count = pagerAdapter.getCount();
        }
        removeAllViews();
        this.LJLIL = new DIT[count];
        int i = this.LJLJL / 2;
        for (int i2 = 0; i2 < count; i2++) {
            DIT dit = new DIT(getContext());
            dit.setSolidColor(this.LJLJJL);
            dit.setStrokeColor(this.LJLJJLL);
            int i3 = this.LJLJJI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i, 0, i);
            } else {
                layoutParams.setMargins(i, 0, i, 0);
            }
            addView(dit, layoutParams);
            this.LJLIL[i2] = dit;
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            if (this.LJLILLLLZI != null) {
                viewPager.removeOnPageChangeListener(this);
                viewPager.removeOnAdapterChangeListener(this);
            }
            this.LJLILLLLZI = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.addOnPageChangeListener(this);
            viewPager.addOnAdapterChangeListener(this);
            if (adapter == null) {
                return;
            }
            DataSetObserver dataSetObserver = this.LJLJLLL;
            if (dataSetObserver != null) {
                adapter.LJJII(dataSetObserver);
            }
            C80714Vm2 c80714Vm2 = new C80714Vm2(this, this, adapter);
            this.LJLJLLL = c80714Vm2;
            adapter.LJIJ(c80714Vm2);
            setUpViews(adapter);
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public C80713Vm1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC80715Vm3
    public final void LIZ(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80714Vm2 c80714Vm2;
        if (pagerAdapter != null && (c80714Vm2 = this.LJLJLLL) != null) {
            pagerAdapter.LJJII(c80714Vm2);
        }
        if (pagerAdapter2 != null) {
            C80714Vm2 c80714Vm22 = new C80714Vm2(this, this, pagerAdapter2);
            this.LJLJLLL = c80714Vm22;
            pagerAdapter2.LJIJ(c80714Vm22);
        }
    }

    public C80713Vm1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = new DIT[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahl, R.attr.ahm, R.attr.ahn, R.attr.aho, R.attr.ahp, R.attr.ahr}, 0, 0);
        this.LJLJJL = obtainStyledAttributes.getColor(1, -1);
        this.LJLJJLL = obtainStyledAttributes.getColor(3, -1);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(0, (int) KL2.LIZJ(context, 4.0f));
        obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f = 0.5f;
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 > 0.0f && f2 <= 1.0f) {
            f = f2;
        }
        this.LJLJLJ = (int) (f * 255.0f);
        this.LJLJL = obtainStyledAttributes.getDimensionPixelSize(2, (int) KL2.LIZJ(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80714Vm2 c80714Vm2;
        if (pagerAdapter != null && (c80714Vm2 = this.LJLJLLL) != null) {
            pagerAdapter.LJJII(c80714Vm2);
        }
        if (pagerAdapter2 != null) {
            C80714Vm2 c80714Vm22 = new C80714Vm2(this, this, pagerAdapter2);
            this.LJLJLLL = c80714Vm22;
            pagerAdapter2.LJIJ(c80714Vm22);
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        int count = getCount();
        if (count == 0) {
            return;
        }
        if (count != this.LJLIL.length) {
            ViewPager viewPager = this.LJLILLLLZI;
            if (viewPager != null) {
                setUpViews(viewPager.getAdapter());
            }
            C80766Vms c80766Vms = this.LJLJI;
            if (c80766Vms != null) {
                setUpViews(c80766Vms.getAdapter());
            }
        }
        int i3 = i % count;
        DIT dit = this.LJLIL[i3];
        dit.setStrokeAlpha(0);
        dit.setFillAlpha((int) (((Math.sin(((1.0f - f) * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + this.LJLJLJ));
        int i4 = (i3 + 1) % count;
        DIT dit2 = this.LJLIL[i4];
        dit2.setStrokeAlpha(0);
        dit2.setFillAlpha((int) (((Math.sin((f * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + this.LJLJLJ));
        for (int i5 = 0; i5 < count; i5++) {
            if (i5 != i3 && i5 != i4) {
                DIT dit3 = this.LJLIL[i5];
                dit3.setStrokeAlpha(0);
                dit3.setFillAlpha(this.LJLJLJ);
            }
        }
    }
}
