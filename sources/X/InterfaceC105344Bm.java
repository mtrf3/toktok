package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* renamed from: X.4Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC105344Bm extends LifecycleObserver {
    void Cf(String str);

    void LLLLLZIL();

    void LLLZLZ(C105454Bx c105454Bx);

    void j2(CommentPersonalizedEmoji commentPersonalizedEmoji);

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();
}
