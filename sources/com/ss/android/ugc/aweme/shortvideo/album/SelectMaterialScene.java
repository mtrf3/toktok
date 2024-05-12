package com.ss.android.ugc.aweme.shortvideo.album;

import X.C5HC;
import X.InterfaceC144185lG;
import X.InterfaceC165696er;
import X.InterfaceC45540Hu4;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SelectMaterialScene extends MvChoosePhotoScene implements InterfaceC165696er, InterfaceC45540Hu4 {
    public final ArrayList<InterfaceC144185lG> v = new ArrayList<>();
    public final ArrayList<C5HC> w = new ArrayList<>();

    public SelectMaterialScene() {
        disableSupportRestore();
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.w.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ListProtector.add(this.w, 0, listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.v.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.w.remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.v.remove(listener);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC42651GoZ, X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<C5HC> arrayList = this.w;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C5HC> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractC42651GoZ
    public final boolean LLJJL(int i, int i2, Intent intent) {
        Iterator<InterfaceC144185lG> it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        LLJLLIL(new AqS27S0001000_2(bundle2.getInt("key_choose_scene", -1), 10));
        return super.onCreateView(inflater, container, bundle);
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
