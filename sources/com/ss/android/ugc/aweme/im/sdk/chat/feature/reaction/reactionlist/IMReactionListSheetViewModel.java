package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist;

import X.AnonymousClass325;
import X.C109544Rq;
import X.C3DW;
import X.C3EU;
import X.C79853Bl;
import X.C79883Bo;
import X.C80763Ey;
import X.C84643Tw;
import X.XLL;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMReactionListSheetViewModel extends ViewModel implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLLI = 0;
    public C109544Rq LJLIL;
    public String LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final ArrayList<String> LJLJJLL;
    public final HashMap<String, Integer> LJLJL;
    public final C3DW LJLJLJ;
    public final XLL LJLJLLL;
    public final C79883Bo LJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        if (this.LJLJJI) {
            this.LJLJJL.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.3DW] */
    public IMReactionListSheetViewModel() {
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        this.LJLJI = LIZ;
        this.LJLJJL = new MutableLiveData<>(Boolean.FALSE);
        this.LJLJJLL = new ArrayList<>();
        this.LJLJL = new HashMap<>();
        this.LJLJLJ = new C3EU() { // from class: X.3DW
            @Override // X.C3EU
            public final void LIZ(IMUser result) {
                o.LJIIIZ(result, "result");
                Integer num = IMReactionListSheetViewModel.this.LJLJL.get(result.getUid());
                if (num != null) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(IMReactionListSheetViewModel.this), null, null, new C3DV(IMReactionListSheetViewModel.this, num, result, null), 3);
                }
            }

            @Override // X.C3EU
            public final void LIZIZ(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
            }
        };
        XLL LIZ2 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJLLL = LIZ2;
        this.LJLL = new C79883Bo(LIZ2);
    }

    public final void gv0(String uid) {
        o.LJIIIZ(uid, "uid");
        if (uid.length() > 0) {
            C84643Tw.LIZLLL(uid, "chat", "click_reaction", null, 24);
            AnonymousClass325.LIZ.getClass();
            AnonymousClass325.LIZ(uid);
            this.LJLJJI = true;
        }
    }
}
