package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui;

import X.AnonymousClass064;
import X.C221108m2;
import X.C32151Nz;
import X.C49013JLl;
import X.C55096Ljo;
import X.C58827N6x;
import X.C62822Ol8;
import X.C8VR;
import X.C8XO;
import X.JJ8;
import X.JMB;
import X.JMC;
import X.O6R;
import Y.ARunnableS27S0200000_8;
import Y.IDCListenerS245S0100000_8;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMixLiveCardContentAssem extends ReusedUISlotAssem<SearchMixLiveCardContentAssem> implements C8XO<C49013JLl> {
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public JMC LLFII;
    public C49013JLl LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf5;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchMixLiveCardContentAssem() {
        new LinkedHashMap();
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 313));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 312));
    }

    @Override // X.C8XO
    public final void F0(C49013JLl c49013JLl) {
        C49013JLl item = c49013JLl;
        o.LJIIIZ(item, "item");
        this.LLFZ = item;
        Aweme aweme = item.LJLILLLLZI;
        if (aweme != null && aweme.isAd()) {
            this.LLFII = C58827N6x.LIZIZ.LIZIZ(new JMB(this, aweme));
        } else {
            this.LLFII = null;
            Object value = this.LLFF.getValue();
            o.LJIIIIZZ(value, "<get-tvSponsoredLabel>(...)");
            ((View) value).setVisibility(8);
        }
        JMC jmc = this.LLFII;
        if (jmc != null) {
            jmc.onBind();
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C49013JLl c49013JLl) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        o.LJIIIZ(view, "view");
        JJ8.LIZ.getClass();
        if (JJ8.LIZ()) {
            View view2 = (View) this.LLFFF.getValue();
            ViewParent viewParent = null;
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if ((viewParent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) viewParent) != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJI(R.id.dek, 6);
                anonymousClass064.LJIIIZ(R.id.dek, 7, 0, 7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                anonymousClass064.LIZIZ(constraintLayout);
            }
        }
        C8VR.LIZ(this, new AqS174S0100000_8(this, 108));
        view.post(new ARunnableS27S0200000_8(this, this, 37));
        view.post(new ARunnableS27S0200000_8(this, this, 38));
        ((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), SearchServiceCenter$CardCommonAbility.class)).Jq0(new IDCListenerS245S0100000_8(this, 9));
        view.post(new ARunnableS27S0200000_8(this, this, 39));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49013JLl c49013JLl) {
    }
}
