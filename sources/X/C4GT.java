package X;

import X.C0AC;
import X.C3UP;
import X.C4GT;
import X.C84393Sx;
import Y.AObserverS69S0100000_1;
import Y.IDrS41S0100000_1;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.list.GiphyCell;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4GT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GT {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final View LIZ;
    public final GiphyViewModel LIZIZ;
    public final LifecycleOwner LIZJ;
    public SYL LIZLLL;
    public ProgressBar LJ;
    public TuxTextView LJFF;
    public C223338pd LJI;
    public C73305Spp LJII;
    public boolean LJIIIIZZ;

    public C4GT(View view, GiphyViewModel giphyViewModel, LifecycleOwner lifecycleOwner, C4BA c4ba) {
        this.LIZ = view;
        this.LIZIZ = giphyViewModel;
        this.LIZJ = lifecycleOwner;
        View findViewById = view.findViewById(R.id.isf);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.recyclerView)");
        this.LIZLLL = (SYL) findViewById;
        View findViewById2 = view.findViewById(R.id.ia_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.progressBar)");
        this.LJ = (ProgressBar) findViewById2;
        View findViewById3 = view.findViewById(R.id.keg);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.statusTextView)");
        this.LJFF = (TuxTextView) findViewById3;
        this.LJI = (C223338pd) view.findViewById(R.id.chw);
        this.LJII = (C73305Spp) view.findViewById(R.id.keh);
        SYL syl = this.LIZLLL;
        if (syl != null) {
            syl.LLLF.LJZL(GiphyCell.class);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.embedded.GifChooseEmbeddedPanel$setupViews$2$1
                {
                    super(3, 1);
                }

                @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
                public final void LJLJJL(C0AC state) {
                    o.LJIIIZ(state, "state");
                    super.LJLJJL(state);
                    if (state.LIZIZ() > 0) {
                        C4GT c4gt = C4GT.this;
                        if (c4gt.LJIIIIZZ) {
                            c4gt.LJIIIIZZ = false;
                            IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZJ().LIZ(new C3UP((Integer) 8, 2), new C84393Sx("giphy", null));
                        }
                    }
                }
            };
            staggeredGridLayoutManager.LLJJIII(0);
            syl.setLayoutManager(staggeredGridLayoutManager);
            syl.setItemAnimator(null);
            syl.LJII(new C4GU(C7MY.LIZIZ(8)), -1);
            syl.LJIIJJI(new IDrS41S0100000_1(syl, 10));
            SYL syl2 = this.LIZLLL;
            if (syl2 != null) {
                syl2.setTag(R.id.ef5, giphyViewModel);
                giphyViewModel.LJLLL = c4ba;
                giphyViewModel.LJLJJL.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 124));
                giphyViewModel.LJLJLJ.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 125));
                SYL syl3 = this.LIZLLL;
                if (syl3 != null) {
                    syl3.LJLJLLL((AbstractC72278SYg) giphyViewModel.LJLLLL.getValue());
                    this.LJIIIIZZ = true;
                    return;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }
}
