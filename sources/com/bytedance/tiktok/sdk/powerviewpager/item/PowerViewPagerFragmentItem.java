package com.bytedance.tiktok.sdk.powerviewpager.item;

import X.C61198O0c;
import X.InterfaceC57784Mm4;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class PowerViewPagerFragmentItem<F extends Fragment> implements InterfaceC57784Mm4, Parcelable {
    public static final C61198O0c Companion = new C61198O0c();

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (hashCode() == interfaceC57784Mm4.hashCode()) {
            return true;
        }
        return false;
    }
}
