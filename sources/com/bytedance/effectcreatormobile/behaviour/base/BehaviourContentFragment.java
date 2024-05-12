package com.bytedance.effectcreatormobile.behaviour.base;

import X.C16880lQ;
import X.C93750aVu;
import X.InterfaceC06750Oh;
import X.InterfaceC88472Yns;
import X.InterfaceC93642aUA;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public abstract class BehaviourContentFragment<B extends InterfaceC06750Oh> extends BehaviourBaseFragment<B> implements InterfaceC93642aUA {
    public static final Map<View, String> LJLJI = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93642aUA
    public final TextView f8() {
        Fragment fragment = this;
        while (fragment != 0) {
            fragment = fragment.getParentFragment();
            if (fragment instanceof InterfaceC93642aUA) {
                InterfaceC93642aUA interfaceC93642aUA = (InterfaceC93642aUA) fragment;
                if (interfaceC93642aUA == null) {
                    return null;
                }
                return interfaceC93642aUA.f8();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93642aUA
    public final TextView zg() {
        Fragment fragment = this;
        while (fragment != 0) {
            fragment = fragment.getParentFragment();
            if (fragment instanceof InterfaceC93642aUA) {
                InterfaceC93642aUA interfaceC93642aUA = (InterfaceC93642aUA) fragment;
                if (interfaceC93642aUA == null) {
                    return null;
                }
                return interfaceC93642aUA.zg();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93642aUA
    public final TextView zh() {
        Fragment fragment = this;
        while (fragment != 0) {
            fragment = fragment.getParentFragment();
            if (fragment instanceof InterfaceC93642aUA) {
                InterfaceC93642aUA interfaceC93642aUA = (InterfaceC93642aUA) fragment;
                if (interfaceC93642aUA == null) {
                    return null;
                }
                return interfaceC93642aUA.zh();
            }
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        TextView f8 = f8();
        if (f8 != null) {
            Hl(f8);
        }
        TextView zg = zg();
        if (zg != null) {
            Hl(zg);
        }
        TextView zh = zh();
        if (zh != null) {
            Hl(zh);
        }
        super.onDestroyView();
    }

    public final void Hl(TextView textView) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJLJI;
        if (o.LJ(linkedHashMap.get(textView), getClass().getName())) {
            C16880lQ.LJIJI(textView, null);
            linkedHashMap.clear();
        }
    }

    public static void Gl(BehaviourContentFragment behaviourContentFragment, TextView textView, InterfaceC88472Yns interfaceC88472Yns) {
        behaviourContentFragment.getClass();
        C93750aVu.LIZ(textView, 800L, interfaceC88472Yns);
        LJLJI.put(textView, behaviourContentFragment.getClass().getName());
    }
}
