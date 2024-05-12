package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC37594EpC;
import X.EE1;
import X.InterfaceC56180M3c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes16.dex */
public interface ILocationService extends InterfaceC56180M3c {
    boolean LIZ();

    List<Class<? extends AbstractC37594EpC<?, ?>>> LIZIZ();

    void LIZJ();

    boolean LIZLLL();

    boolean LJ();

    boolean LJFF();

    void LJI(Fragment fragment, String str, boolean z);

    void LJII();

    EE1 LJIIIZ();

    View LJIIJ(Context context, ViewGroup viewGroup);

    void LJIIJJI(View view);

    void LJIIL(Context context, View view, AqS158S0100000_8 aqS158S0100000_8);

    void LJIILL();

    void LJIIZILJ();

    boolean LJIJ(String... strArr);

    Map<String, String> getLocationCommonParamsIfHave();
}
