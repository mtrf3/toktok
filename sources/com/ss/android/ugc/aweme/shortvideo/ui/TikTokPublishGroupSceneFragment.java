package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C141335gf;
import X.C3C5;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TikTokPublishGroupSceneFragment extends Fragment {
    public WeakReference<TikTokPublishGroupScene> LJLIL;
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
        TikTokPublishGroupScene tikTokPublishGroupScene;
        super.onActivityResult(i, i2, intent);
        WeakReference<TikTokPublishGroupScene> weakReference = this.LJLIL;
        if (weakReference != null && (tikTokPublishGroupScene = weakReference.get()) != null) {
            tikTokPublishGroupScene.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View view = new View(requireActivity());
        try {
            getViewLifecycleOwner();
            throw null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        o.LJIIIZ(permissions, "permissions");
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        WeakReference<TikTokPublishGroupScene> weakReference = this.LJLIL;
        if (weakReference != null) {
            weakReference.get();
        }
    }
}
