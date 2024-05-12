package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.C69698RXa;
import X.C70699Rot;
import X.C70714Rp8;
import X.C70717RpB;
import X.C70732RpQ;
import X.InterfaceC71003Rtn;
import X.InterfaceC92693kP;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GalleryViewerViewModel extends ViewModel {
    public InterfaceC92693kP LJLIL;
    public C70699Rot LJLILLLLZI;
    public C70714Rp8 LJLJI;
    public String LJLJJI;
    public Integer LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public String LJLLILLLL;
    public String LJLLL;
    public final NextLiveData<CopyOnWriteArrayList<C70717RpB>> LJLLLLLL;
    public final NextLiveData<C69698RXa> LJLZ;
    public Integer LJZ;
    public String LJZI;
    public volatile boolean LJZL;
    public final NextLiveData<Boolean> LJLJLLL = new NextLiveData<>();
    public Integer LJLL = 1;
    public String LJLLI = "";
    public ArrayList<Integer> LJLLJ = new ArrayList<>();
    public final NextLiveData<Integer> LJLLLL = new NextLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C70699Rot c70699Rot = this.LJLILLLLZI;
        if (c70699Rot != null) {
            c70699Rot.LJLJLLL = null;
            if (c70699Rot != null) {
                c70699Rot.LJLLI = false;
                c70699Rot.LJLLILLLL = false;
            }
        }
        super.onCleared();
    }

    public GalleryViewerViewModel() {
        new NextLiveData();
        this.LJLLLLLL = new NextLiveData<>();
        this.LJLZ = new NextLiveData<>();
        this.LJZL = true;
    }

    public final void hv0(InterfaceC71003Rtn node, int i, int i2, String str) {
        C70714Rp8 c70714Rp8;
        o.LJIIIZ(node, "node");
        CopyOnWriteArrayList<C70717RpB> value = this.LJLLLLLL.getValue();
        if (value != null && i < value.size()) {
            C70714Rp8 c70714Rp82 = this.LJLJI;
            if (c70714Rp82 != null) {
                C70717RpB c70717RpB = value.get(i);
                o.LJIIIIZZ(c70717RpB, "list[curIndex]");
                c70714Rp82.LIZIZ(node, i + 1, c70717RpB, value.size(), this.LJZ, str, this.LJZI);
            }
            if (this.LJZL) {
                this.LJZL = false;
                return;
            }
            C70714Rp8 c70714Rp83 = this.LJLJI;
            if (c70714Rp83 != null) {
                c70714Rp83.LIZJ = "next";
            }
            if (i2 >= value.size() || (c70714Rp8 = this.LJLJI) == null) {
                return;
            }
            C70717RpB c70717RpB2 = value.get(i2);
            o.LJIIIIZZ(c70717RpB2, "list[lastIndex]");
            c70714Rp8.LIZJ(node, i2 + 1, c70717RpB2, value.size(), this.LJZ, str, this.LJZI);
        }
    }

    public final void gv0(View view, String str, boolean z, int i, C69698RXa reviewItem, int i2, C70732RpQ reviewBottomIndicator) {
        int max;
        String str2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(reviewItem, "reviewItem");
        o.LJIIIZ(reviewBottomIndicator, "reviewBottomIndicator");
        boolean z2 = !z;
        if (z2) {
            max = i + 1;
        } else {
            max = Math.max(i - 1, 0);
        }
        C70714Rp8 c70714Rp8 = this.LJLJI;
        if (c70714Rp8 != null) {
            c70714Rp8.LIZ(view, z2, max, reviewItem);
        }
        C70699Rot c70699Rot = this.LJLILLLLZI;
        if (c70699Rot != null) {
            c70699Rot.LLLLZ(i2, str, z2);
        }
        this.LJLZ.postValue(C69698RXa.LIZ(reviewItem, Integer.valueOf(max), Boolean.valueOf(z2)));
        CopyOnWriteArrayList<C70717RpB> value = this.LJLLLLLL.getValue();
        if (value != null) {
            Iterator<C70717RpB> it = value.iterator();
            while (it.hasNext()) {
                C70717RpB next = it.next();
                C69698RXa c69698RXa = next.LIZIZ;
                if (c69698RXa != null) {
                    str2 = c69698RXa.LIZ;
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, str)) {
                    next.LIZIZ.LIZLLL = Integer.valueOf(max);
                    next.LIZIZ.LJ = Boolean.valueOf(z2);
                }
            }
        }
        this.LJLLLLLL.postValue(value);
        reviewBottomIndicator.LIZ(C69698RXa.LIZ(reviewItem, Integer.valueOf(max), Boolean.valueOf(z2)));
        EventCenter.LJ().LIZ("ec_review_digg", "{}");
    }
}
