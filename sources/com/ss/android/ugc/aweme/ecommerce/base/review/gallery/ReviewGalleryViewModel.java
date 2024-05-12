package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AbstractC73672Svk;
import X.C69698RXa;
import X.C70699Rot;
import X.C70714Rp8;
import X.C70717RpB;
import X.C70718RpC;
import X.C70722RpG;
import X.C70839Rr9;
import X.InterfaceC61312at;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.TBT;
import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS1S0011000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewGalleryViewModel extends ListViewModel<C70717RpB, C70839Rr9, ReviewGalleryState> {
    public InterfaceC92693kP LJLJLLL;
    public InterfaceC92693kP LJLL;
    public C70699Rot LJLLI;
    public C70714Rp8 LJLLJ;
    public final C70718RpC LJLLILLLL = new C70718RpC();
    public final AqS178S0100000_12 LJLLL = new AqS178S0100000_12(this, 164);
    public final AqS178S0100000_12 LJLLLL = new AqS178S0100000_12(this, 163);
    public volatile boolean LJLLLLLL = true;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        JediViewModel.wv0(this, new TBT() { // from class: X.Rpa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ReviewGalleryState) obj).getProductId();
            }
        }, null, new AqS178S0100000_12(this, 165), 2, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ReviewGalleryState("", null, "", "", new ArrayList(), "", 1, null, false, 1, 0, 0, null, null, true, null, new ListState(new C70839Rr9(3), null, null, null, null, 30, null));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C70699Rot c70699Rot = this.LJLLI;
        if (c70699Rot != null) {
            c70699Rot.LJLJLLL = null;
            if (c70699Rot != null) {
                c70699Rot.LJLLI = false;
                c70699Rot.LJLLILLLL = false;
            }
        }
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<ReviewGalleryState, AbstractC73672Svk<OSZ<List<C70717RpB>, C70839Rr9>>> Iv0() {
        return this.LJLLLL;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<ReviewGalleryState, AbstractC73672Svk<OSZ<List<C70717RpB>, C70839Rr9>>> Jv0() {
        return this.LJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ov0(ReviewGalleryFragment reviewGalleryFragment, int i, int i2) {
        C70714Rp8 c70714Rp8;
        List<Object> list = ((ReviewGalleryState) lv0()).getSubstate().getList();
        if (i < list.size()) {
            C70714Rp8 c70714Rp82 = this.LJLLJ;
            if (c70714Rp82 != null) {
                c70714Rp82.LIZIZ(reviewGalleryFragment, i + 1, (C70717RpB) ListProtector.get(list, i), list.size(), null, null, null);
            }
            if (this.LJLLLLLL) {
                this.LJLLLLLL = false;
                return;
            }
            C70714Rp8 c70714Rp83 = this.LJLLJ;
            if (c70714Rp83 != null) {
                c70714Rp83.LIZJ = "next";
            }
            if (i2 >= list.size() || (c70714Rp8 = this.LJLLJ) == null) {
                return;
            }
            c70714Rp8.LIZJ(reviewGalleryFragment, i2 + 1, (C70717RpB) ListProtector.get(list, i2), list.size(), null, null, null);
        }
    }

    public final void Nv0(View view, String str, boolean z, int i, C69698RXa reviewItem, int i2) {
        int max;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(reviewItem, "reviewItem");
        boolean z2 = !z;
        if (z2) {
            max = i + 1;
        } else {
            max = Math.max(i - 1, 0);
        }
        C70714Rp8 c70714Rp8 = this.LJLLJ;
        if (c70714Rp8 != null) {
            c70714Rp8.LIZ(view, z2, max, reviewItem);
        }
        C70699Rot c70699Rot = this.LJLLI;
        if (c70699Rot != null) {
            c70699Rot.LLLLZ(i2, str, z2);
        }
        setState(new AqS143S0200000_12(this, new C70722RpG(str, max, z2), 77));
        setState(new AqS1S0011000_12(max, z2, 1));
        EventCenter.LJ().LIZ("ec_review_digg", "{}");
    }
}
