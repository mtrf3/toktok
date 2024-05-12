package com.ss.android.ugc.aweme.comment.commentpage.viewmodel;

import X.C221108m2;
import X.C62822Ol8;
import X.C75A;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes4.dex */
public final class CommentOrientationVM extends ViewModel {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C75A.LJLIL);

    public final boolean gv0() {
        Integer num = (Integer) ((LiveData) this.LJLIL.getValue()).getValue();
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }
}
