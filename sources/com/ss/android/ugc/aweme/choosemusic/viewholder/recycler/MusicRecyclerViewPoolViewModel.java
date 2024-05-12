package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import X.ActivityC45651qj;
import X.C165706es;
import X.C221108m2;
import X.C41324GJs;
import X.C45804HyK;
import X.C62822Ol8;
import X.WM7;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicRecyclerViewPoolViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C41324GJs.LJLIL);

    public static final RecyclerView.RecycledViewPool gv0(Context context) {
        ActivityC45651qj LJJIFFI;
        ViewModelProvider of;
        WM7 currentScene;
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return null;
        }
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null && (currentScene = LIZ.getCurrentScene(LJJIFFI)) != null) {
            of = C165706es.LJIIIIZZ(currentScene, null, null, 6);
        } else {
            of = ViewModelProviders.of(LJJIFFI);
            o.LJIIIIZZ(of, "of(\n                    …tivity,\n                )");
        }
        return (RecyclerView.RecycledViewPool) ((MusicRecyclerViewPoolViewModel) of.get(MusicRecyclerViewPoolViewModel.class)).LJLIL.getValue();
    }
}
