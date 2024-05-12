package com.ss.android.ugc.aweme.sticker.view.internal.main;

import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C62822Ol8;
import X.C74275TDb;
import X.C76800UCe;
import X.C80695Vlj;
import X.C80700Vlo;
import X.InterfaceC88472Yns;
import X.TEJ;
import X.TF1;
import X.TF5;
import X.TG7;
import X.TGD;
import X.TGG;
import X.TGN;
import X.TGS;
import X.TH1;
import X.TH5;
import X.TH7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class StickerViewImpl extends AbstractStickerView {
    public final C62822Ol8 LLIIJLIL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final void LJI(ViewGroup content) {
        o.LJIIIZ(content, "content");
        super.LJI(content);
        ViewGroup viewGroup = (ViewGroup) content.findViewById(R.id.hdy);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(content.getContext()), R.layout.bnr, viewGroup, false);
        if (LLLLIILL != null) {
            viewGroup.addView(LLLLIILL);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final TH5 LJIIJ(ViewGroup content) {
        o.LJIIIZ(content, "content");
        TG7 tg7 = this.LLIIIJ.LJLLI;
        ViewPager viewPager = (ViewPager) content.findViewById(R.id.nd5);
        o.LJIIIIZZ(viewPager, "viewPager");
        viewPager.setOffscreenPageLimit(this.LLIIIJ.LJLLI.LJLLLLLL);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        if (this.LLIIIJ.LJLJJL > 0) {
            Context context = viewPager.getContext();
            o.LJIIIIZZ(context, "viewPager.context");
            layoutParams.height = (int) C74275TDb.LIZIZ(context, this.LLIIIJ.LJLJJL);
            viewPager.setLayoutParams(layoutParams);
        }
        InterfaceC88472Yns<? super ViewPager, C76800UCe> interfaceC88472Yns = tg7.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(viewPager);
        }
        TH1 th1 = new TH1(viewPager, LJ(), this.LJLIL, this.LLII, this.LLIIII, (TH7) this.LLIIJLIL.getValue());
        C80700Vlo c80700Vlo = this.LJLJLLL;
        if (c80700Vlo != null) {
            c80700Vlo.setSupportCustomIndicator(false);
            InterfaceC88472Yns<? super C80695Vlj, C76800UCe> interfaceC88472Yns2 = this.LLIIIJ.LJLLI.LJLJI;
            if (interfaceC88472Yns2 != null) {
                C80700Vlo c80700Vlo2 = this.LJLJLLL;
                if (c80700Vlo2 != null) {
                    interfaceC88472Yns2.invoke(c80700Vlo2);
                } else {
                    o.LJIJI("tabLayout");
                    throw null;
                }
            }
            C80700Vlo c80700Vlo3 = this.LJLJLLL;
            if (c80700Vlo3 != null) {
                return new TH5(c80700Vlo3, this.LLFZ, this.LLIFFJFJJ, this.LLIIIJ, th1, this.LLII, LJ(), (TH7) this.LLIIJLIL.getValue());
            }
            o.LJIJI("tabLayout");
            throw null;
        }
        o.LJIJI("tabLayout");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerViewImpl(C29S activity, ViewGroup root, LifecycleOwner lifecycleOwner, TF5 requiredDependency, TEJ tej, TGG tgg, TGD stickerViewConfigure, FragmentManager fragmentManager, TGS tgs, TH7 th7, TGN tabLayoutProvider, boolean z, TF1 searchStickerViewModel) {
        super(activity, root, lifecycleOwner, requiredDependency, tej, tgg, stickerViewConfigure, tabLayoutProvider, fragmentManager, tgs, z, searchStickerViewModel);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(root, "root");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        o.LJIIIZ(tabLayoutProvider, "tabLayoutProvider");
        o.LJIIIZ(searchStickerViewModel, "searchStickerViewModel");
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(th7, 1128));
    }
}
