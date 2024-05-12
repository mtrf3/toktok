package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji;

import X.C1036745b;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C4BH;
import X.C4FF;
import X.C55749LuL;
import X.C62822Ol8;
import X.C71582rS;
import X.C89333ez;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedEmojiViewModel extends AssemViewModel<C33Q> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C1036745b LJLIL;
    public C4BH LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C71582rS LJLJJL;
    public final C4FF LJLJJLL;
    public final LifecycleEventObserver LJLJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C33Q() { // from class: X.47w
        };
    }

    public SuggestedEmojiViewModel(C1036745b noticeEngine) {
        o.LJIIIZ(noticeEngine, "noticeEngine");
        this.LJLIL = noticeEngine;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 395));
        this.LJLJJL = C71582rS.LIZ;
        this.LJLJJLL = C4FF.LJLIL;
        this.LJLJL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel$callbackCleaner$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    SuggestedEmojiViewModel.this.LJLILLLLZI = null;
                }
            }
        };
    }
}
