package X;

import Y.AObserverS80S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.TDd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74277TDd implements InterfaceC74281TDh {
    public final TEZ LIZ;
    public final ViewGroup LIZIZ;
    public final LiveData<List<ComposerNode>> LIZJ;
    public final TKR LIZLLL;
    public final InterfaceC88472Yns<ComposerNode, C76800UCe> LJ;
    public final RecyclerView LJFF;
    public final C173626re LJI;
    public final C74276TDc LJII;

    @Override // X.InterfaceC83331Wn9
    public final void LIZ() {
        this.LJFF.setVisibility(0);
    }

    @Override // X.InterfaceC83331Wn9
    public final void LIZLLL() {
        AbstractC029409q adapter = this.LJFF.getAdapter();
        o.LJI(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override // X.InterfaceC83331Wn9
    public final void hideStickerView() {
        this.LJI.setVisibility(8);
        this.LJFF.setVisibility(8);
    }

    @Override // X.InterfaceC74281TDh
    public final void LIZJ(ComposerNode composerNode) {
        List<? extends ComposerNode> list;
        C74276TDc c74276TDc = this.LJII;
        c74276TDc.LJLIL = composerNode;
        if (composerNode != null) {
            list = C74276TDc.LJLLLLLL(composerNode);
        } else {
            list = null;
        }
        c74276TDc.LJLILLLLZI = list;
        this.LJII.notifyDataSetChanged();
    }

    @Override // X.InterfaceC74281TDh
    public final void LIZIZ(ComposerNode node, AqS145S0200000_14 aqS145S0200000_14) {
        o.LJIIIZ(node, "node");
        this.LJI.setVisibility(0);
        this.LJI.setOnSeekBarChangeListener(new C74279TDf(aqS145S0200000_14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.GoZ] */
    public C74277TDd(C29S activity, TEZ stickerDataManager, ViewGroup viewGroup, MutableLiveData selectedComposerNodesLiveData, TKR configure, C83329Wn7 c83329Wn7) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(selectedComposerNodesLiveData, "selectedComposerNodesLiveData");
        o.LJIIIZ(configure, "configure");
        this.LIZ = stickerDataManager;
        this.LIZIZ = viewGroup;
        this.LIZJ = selectedComposerNodesLiveData;
        this.LIZLLL = configure;
        this.LJ = c83329Wn7;
        C74276TDc c74276TDc = new C74276TDc(this);
        this.LJII = c74276TDc;
        View LJIIZILJ = h0.LJIIZILJ(R.id.km7, viewGroup);
        o.LJII(LJIIZILJ, "null cannot be cast to non-null type androidx.appcompat.widget.ViewStubCompat");
        View LIZ = ((ViewStubCompat) LJIIZILJ).LIZ();
        View LJIIZILJ2 = h0.LJIIZILJ(R.id.fl9, LIZ);
        o.LJIIIIZZ(LJIIZILJ2, "requireViewById(viewGrou…d.layout_rv_face_matting)");
        RecyclerView recyclerView = (RecyclerView) LJIIZILJ2;
        this.LJFF = recyclerView;
        recyclerView.setAdapter(c74276TDc);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        View LJIIZILJ3 = h0.LJIIZILJ(R.id.bqv, LIZ);
        o.LJIIIIZZ(LJIIZILJ3, "requireViewById(viewGrou…poser_intensity_seek_bar)");
        this.LJI = (C173626re) LJIIZILJ3;
        ?? LJIIL = C78840Uwu.LJIIL(viewGroup);
        selectedComposerNodesLiveData.observe(LJIIL != 0 ? LJIIL : activity, new AObserverS80S0100000_12(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }
}
