package com.ss.android.ugc.gamora.editorpro;

import X.C09G;
import X.C50Q;
import X.C53H;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditorProScene$onResume$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ EditorProScene LJLIL;

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

    public EditorProScene$onResume$1(EditorProScene editorProScene) {
        this.LJLIL = editorProScene;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        C53H LJIILIIL;
        RecyclerView LIZIZ;
        C53H LJIILIIL2;
        o.LJIIIZ(owner, "owner");
        C50Q funcBarController = this.LJLIL.getFuncBarController();
        if (funcBarController != null && (LJIILIIL = funcBarController.LJIILIIL()) != null && (LIZIZ = LJIILIIL.LIZIZ()) != null) {
            EditorProScene editorProScene = this.LJLIL;
            editorProScene.scrollToMagicIndexIfNeed(LIZIZ);
            editorProScene.mobFuncBarShowEvent();
            C50Q funcBarController2 = editorProScene.getFuncBarController();
            if (funcBarController2 != null && (LJIILIIL2 = funcBarController2.LJIILIIL()) != null) {
                LJIILIIL2.LIZLLL(this);
            }
        }
    }
}
