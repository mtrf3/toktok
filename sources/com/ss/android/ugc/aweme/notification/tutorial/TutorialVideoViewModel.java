package com.ss.android.ugc.aweme.notification.tutorial;

import X.C221108m2;
import X.C62822Ol8;
import X.EF7;
import X.MR0;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TutorialVideoViewModel extends ViewModel {
    public WeakReference<Context> LJLIL;
    public final MutableLiveData<TutorialVideoResp> LJLILLLLZI = new MutableLiveData<>();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(MR0.LJLIL);

    public final String gv0(int i) {
        Context LIZIZ;
        WeakReference<Context> weakReference = this.LJLIL;
        if (weakReference == null || (LIZIZ = weakReference.get()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        String string = LIZIZ.getString(i);
        o.LJIIIIZZ(string, "requireCtx().getString(id)");
        return string;
    }
}
