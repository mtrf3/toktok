package com.ss.android.ugc.aweme.tools.music.avoidonresult;

import X.C7IG;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AvoidOnResultFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final HashMap<Integer, List<C7IG>> LJLIL = new HashMap<>();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Set<Integer> keySet = this.LJLIL.keySet();
        o.LJIIIIZZ(keySet, "mCallbacks.keys");
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            this.LJLIL.remove(it.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<C7IG> list = this.LJLIL.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            this.LJLIL.remove(Integer.valueOf(i));
            return;
        }
        C7IG c7ig = (C7IG) ListProtector.remove(list, list.size() - 1);
        if (list.isEmpty()) {
            this.LJLIL.remove(Integer.valueOf(i));
        }
        if (c7ig == null) {
            return;
        }
        c7ig.LIZ(i2, intent);
    }
}
