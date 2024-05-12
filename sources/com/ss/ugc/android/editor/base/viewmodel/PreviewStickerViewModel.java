package com.ss.ugc.android.editor.base.viewmodel;

import X.C125704wY;
import X.C125724wa;
import X.C125744wc;
import X.C125754wd;
import X.C221108m2;
import X.C5H3;
import X.C79057V0z;
import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;

/* loaded from: classes3.dex */
public final class PreviewStickerViewModel extends ViewModel {
    public static final C125754wd Companion = new Object() { // from class: X.4wd
    };
    public boolean hasInit;
    public final C5H3 gestureViewModel$delegate = C221108m2.LIZIZ(C125704wY.LJLIL);
    public final C5H3 editorContext$delegate = C221108m2.LIZIZ(C125724wa.LJLIL);
    public final C5H3 lifecycleOwner$delegate = C221108m2.LIZIZ(C125744wc.LJLIL);

    private final EditorProContext getEditorContext() {
        return (EditorProContext) this.editorContext$delegate.getValue();
    }

    private final LifecycleOwner getLifecycleOwner() {
        return (LifecycleOwner) this.lifecycleOwner$delegate.getValue();
    }

    public final StickerGestureViewModel getGestureViewModel() {
        return (StickerGestureViewModel) this.gestureViewModel$delegate.getValue();
    }

    public final void init() {
        if (this.hasInit) {
            return;
        }
        getGestureViewModel().init();
        MutableLiveData LJII = C79057V0z.LJII(getEditorContext(), "clip_sticker_slot_event");
        if (LJII != null) {
            LJII.observe(getLifecycleOwner(), new AObserverS70S0100000_2(this, 186));
        }
        MutableLiveData LJII2 = C79057V0z.LJII(getEditorContext(), "update_clip_range_event");
        if (LJII2 != null) {
            LJII2.observe(getLifecycleOwner(), new AObserverS70S0100000_2(this, 187));
        }
        MutableLiveData LJII3 = C79057V0z.LJII(getEditorContext(), "slot_select_change_event");
        if (LJII3 != null) {
            LJII3.observe(getLifecycleOwner(), new AObserverS70S0100000_2(this, 188));
        }
        this.hasInit = true;
    }

    public final void restoreInfoSticker() {
        getGestureViewModel().restoreInfoSticker();
    }

    public void onVideoPositionChange(long j) {
        getGestureViewModel().onVideoPositionChange(j);
    }
}
