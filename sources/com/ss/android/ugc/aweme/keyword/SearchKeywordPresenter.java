package com.ss.android.ugc.aweme.keyword;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C49814Jgo;
import X.C62822Ol8;
import X.InterfaceC49816Jgq;
import android.text.Editable;
import android.widget.EditText;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchKeywordPresenter implements GenericLifecycleObserver, InterfaceC49816Jgq {
    public final ActivityC45651qj LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC49765Jg1
    public final String getEditText() {
        Editable text;
        String obj;
        EditText value = ((SearchEditTextViewModel) this.LJLJI.getValue()).gv0().getValue();
        if (value == null || (text = value.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    @Override // X.InterfaceC49765Jg1
    public final C49814Jgo getKeyword() {
        C49814Jgo value = ((SearchKeywordViewModel) this.LJLILLLLZI.getValue()).gv0().getValue();
        if (value == null) {
            return new C49814Jgo((String) null, 3);
        }
        return value;
    }

    public SearchKeywordPresenter(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 92));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 91));
    }

    @Override // X.InterfaceC49816Jgq
    public final void LIZ(C49814Jgo c49814Jgo) {
        ((SearchKeywordViewModel) this.LJLILLLLZI.getValue()).gv0().setValue(c49814Jgo);
    }
}
