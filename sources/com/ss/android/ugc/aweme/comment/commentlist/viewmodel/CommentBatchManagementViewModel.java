package com.ss.android.ugc.aweme.comment.commentlist.viewmodel;

import X.C174956tn;
import X.C174966to;
import X.C1796773j;
import X.C221108m2;
import X.C62822Ol8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentBatchManagementViewModel extends ViewModel implements GenericLifecycleObserver {
    public int LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C174966to.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C174956tn.LJLIL);
    public final Map<String, Comment> LJLJJI = new HashMap();
    public final Map<String, Comment> LJLJJL = new HashMap();
    public final Map<String, C1796773j> LJLJJLL = new HashMap();

    public final void gv0() {
        this.LJLJI = 0;
        ((HashMap) this.LJLJJI).clear();
        ((HashMap) this.LJLJJL).clear();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final MutableLiveData<Integer> iv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    public final MutableLiveData<Boolean> jv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public static final CommentBatchManagementViewModel hv0(AbsFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.isAdded()) {
            return (CommentBatchManagementViewModel) ViewModelProviders.of(fragment).get("CommentBatchManagementViewModel", CommentBatchManagementViewModel.class);
        }
        return null;
    }
}
