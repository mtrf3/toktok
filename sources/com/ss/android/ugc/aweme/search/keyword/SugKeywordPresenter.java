package com.ss.android.ugc.aweme.search.keyword;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC51122K4o;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.keyword.SugKeywordViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SugKeywordPresenter implements GenericLifecycleObserver {
    public final ActivityC45651qj LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 173));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final String LIZ() {
        return String.valueOf(((LiveData) ((SugKeywordViewModel) this.LJLILLLLZI.getValue()).LJLIL.getValue()).getValue());
    }

    public SugKeywordPresenter(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    public final void LIZIZ(InterfaceC51122K4o interfaceC51122K4o) {
        ((LiveData) ((SugKeywordViewModel) this.LJLILLLLZI.getValue()).LJLIL.getValue()).observe(this.LJLIL, interfaceC51122K4o);
    }

    public final void LIZJ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        ((LiveData) ((SugKeywordViewModel) this.LJLILLLLZI.getValue()).LJLIL.getValue()).setValue(keyword);
    }
}
