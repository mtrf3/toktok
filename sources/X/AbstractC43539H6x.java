package X;

import X.AbstractC43539H6x;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.H6x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43539H6x {
    public final LifecycleOwner LIZ;
    public final Context LIZIZ;

    public AbstractC43539H6x(Context context, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(context, "context");
        this.LIZ = lifecycleOwner;
        this.LIZIZ = context;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.watermark.resourceloader.AbstractResourceLoader$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                AbstractC43539H6x.this.LIZ.getLifecycle().removeObserver(this);
                AbstractC43539H6x.this.getClass();
            }
        });
    }
}
