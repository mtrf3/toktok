package com.ss.android.ugc.aweme.shortvideo.ui;

import X.G93;
import X.OHQ;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TikTokGroupSceneFragment extends Fragment {
    public WeakReference<G93> LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final LifecycleOwner getViewLifecycleOwner() {
        throw new IllegalArgumentException("User Scene instead");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        G93 g93;
        super.onActivityResult(i, i2, intent);
        WeakReference<G93> weakReference = this.LJLIL;
        if (weakReference != null && (g93 = weakReference.get()) != null) {
            g93.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        WeakReference<G93> weakReference = this.LJLIL;
        if (weakReference != null) {
            weakReference.get();
        }
    }
}
