package androidx.emoji2.text;

import X.AnonymousClass082;
import X.AnonymousClass087;
import X.C09G;
import X.C16880lQ;
import X.C270814m;
import X.InterfaceC270914n;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import androidx.emoji2.text.f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC270914n<Boolean> {
    @Override // X.InterfaceC270914n
    public final List<Class<? extends InterfaceC270914n<?>>> LIZ() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
        public final /* synthetic */ Lifecycle LJLIL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C09G.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C09G.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C09G.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C09G.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C09G.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            Handler handler;
            EmojiCompatInitializer.this.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                handler = AnonymousClass082.LIZ(C16880lQ.LLJJJJ());
            } else {
                handler = new Handler(C16880lQ.LLJJJJ());
            }
            handler.postDelayed(new Runnable() { // from class: X.080
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        try {
                            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                            if (f.LIZJ()) {
                                f.LIZ().LIZLLL();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, 500L);
            this.LJLIL.removeObserver(this);
        }

        public AnonymousClass1(Lifecycle lifecycle) {
            this.LJLIL = lifecycle;
        }
    }

    @Override // X.InterfaceC270914n
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Boolean create(final Context context) {
        AnonymousClass087 anonymousClass087 = new AnonymousClass087(context) { // from class: X.1Am
            {
                super(new C28651An(context));
                this.LIZIZ = 1;
            }
        };
        if (f.LJIIIZ == null) {
            synchronized (f.LJIIIIZZ) {
                if (f.LJIIIZ == null) {
                    f.LJIIIZ = new f(anonymousClass087);
                }
            }
        }
        LIZJ(context);
        return Boolean.TRUE;
    }

    public final void LIZJ(Context context) {
        if (C270814m.LIZLLL == null) {
            synchronized (C270814m.LJ) {
                if (C270814m.LIZLLL == null) {
                    C270814m.LIZLLL = new C270814m(context);
                }
            }
        }
        C270814m c270814m = C270814m.LIZLLL;
        c270814m.getClass();
        Lifecycle lifecycle = ((LifecycleOwner) c270814m.LIZ(ProcessLifecycleInitializer.class, new HashSet())).getLifecycle();
        lifecycle.addObserver(new AnonymousClass1(lifecycle));
    }
}
