package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.WEb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81945WEb extends AbstractC81958WEo {
    public final C81947WEd LJLJJI;
    public final int LJLJJL;
    public final SparseArray<FrameLayout> LJLJJLL = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        C81949WEf transConfig = this.LJLJJI.getTransConfig();
        if (transConfig == null || transConfig.LJIJI == null) {
            return this.LJLILLLLZI;
        }
        return this.LJLILLLLZI + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        View view;
        C81960WEq c81960WEq;
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = this.LJLJJLL.get(i);
        if (frameLayout == null) {
            C81949WEf transConfig = this.LJLJJI.getTransConfig();
            if (transConfig != null) {
                view = transConfig.LJIJI;
            } else {
                view = null;
            }
            if (view != null && i == this.LJLILLLLZI) {
                Context context = container.getContext();
                C81949WEf transConfig2 = this.LJLJJI.getTransConfig();
                frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(transConfig2.LJIJI);
                this.LJLJJLL.put(i, frameLayout);
            } else {
                Context context2 = container.getContext();
                C81949WEf transConfig3 = this.LJLJJI.getTransConfig();
                WET wet = new WET(context2, 0);
                wet.setDuration(transConfig3.LIZLLL);
                wet.setScaleType(ImageView.ScaleType.FIT_CENTER);
                wet.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                wet.setOnScaleListener(this.LJLJJI.getOnScaleListener());
                frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(wet);
                if (transConfig3.LJ) {
                    C81947WEd c81947WEd = this.LJLJJI;
                    c81947WEd.getClass();
                    WEN wen = new WEN(c81947WEd);
                    C81949WEf transConfig4 = c81947WEd.getTransConfig();
                    if (transConfig4 != null) {
                        WER LIZ = transConfig4.LIZ();
                        String str = (String) ListProtector.get(transConfig4.LJIIJ, i);
                        C62875Olz c62875Olz = (C62875Olz) LIZ;
                        c62875Olz.getClass();
                        if (C78765Uvh.LJIILIIL(UriProtector.parse(str))) {
                            Drawable LIZ2 = c62875Olz.LIZ(str);
                            if (LIZ2 == null) {
                                wet.setImageDrawable(transConfig4.LIZIZ(wen.LIZIZ));
                            } else {
                                wet.setImageDrawable(LIZ2);
                            }
                        } else {
                            wet.setImageDrawable(transConfig4.LIZIZ(wen.LIZIZ));
                        }
                    }
                }
                this.LJLJJLL.put(i, frameLayout);
                if (i == this.LJLJJL && (c81960WEq = this.LJLJI) != null) {
                    C81947WEd c81947WEd2 = c81960WEq.LIZ;
                    C80841Vo5 c80841Vo5 = c81947WEd2.LJLILLLLZI;
                    if (c80841Vo5 != null) {
                        c80841Vo5.LJFF(c81947WEd2.LJLLILLLL);
                    }
                    C81947WEd c81947WEd3 = c81960WEq.LIZ;
                    C81949WEf c81949WEf = c81947WEd3.LJLJJI;
                    int i2 = c81949WEf.LIZ;
                    if (c81949WEf.LJ) {
                        c81947WEd3.LJFF(i2, 0);
                    } else {
                        c81947WEd3.LJFF(i2, 1);
                    }
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
        if (viewGroup != null) {
            C16880lQ.LJLLL(frameLayout, viewGroup);
        }
        try {
            container.addView(frameLayout);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return frameLayout;
    }

    public C81945WEb(C81947WEd c81947WEd, int i, int i2) {
        this.LJLJJI = c81947WEd;
        this.LJLILLLLZI = i;
        int i3 = i2 + 1;
        i3 = i3 == i ? i2 - 1 : i3;
        this.LJLJJL = i3;
        if (i3 < 0) {
            this.LJLJJL = 0;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }
}
