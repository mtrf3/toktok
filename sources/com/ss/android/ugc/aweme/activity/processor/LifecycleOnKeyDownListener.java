package com.ss.android.ugc.aweme.activity.processor;

import X.G4M;
import X.G4Q;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LifecycleOnKeyDownListener implements G4M, LifecycleEventObserver {
    public boolean LJLIL;

    @Override // X.G4M
    public final void onActivityReenter(int i, Intent intent) {
    }

    @Override // X.G4M
    public final boolean Ag() {
        if (!this.LJLIL) {
            return false;
        }
        throw null;
    }

    @Override // X.G4M
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        int i = G4Q.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    throw null;
                }
            } else {
                this.LJLIL = false;
                return;
            }
        }
        this.LJLIL = true;
    }
}
