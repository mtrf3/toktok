package X;

import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mi2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C57534Mi2 implements Observer {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.LJLIL) {
            case 0:
                DetailFragment detailFragment = (DetailFragment) this.LJLILLLLZI;
                detailFragment.getClass();
                if ("on_ear_phone_unplug".equals(obj)) {
                    if (IWF.LJJLIIIIJ().isPlaying()) {
                        IWF.LJJLIIIIJ().LJIILJJIL();
                        C46315IFr.LIZIZ("play", detailFragment.LJLL, detailFragment.Kl());
                        return;
                    } else {
                        C46315IFr.LIZIZ("pause", detailFragment.LJLL, detailFragment.Kl());
                        return;
                    }
                }
                return;
            default:
                EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.LJLILLLLZI;
                emptyGuideV2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    TuxTextView tuxTextView = emptyGuideV2.LJLJL;
                    if (tuxTextView == null) {
                        emptyGuideV2.LJLJL = (TuxTextView) C0IF.LIZIZ(emptyGuideV2.LJLILLLLZI, tuxTextView, R.id.mo8, R.id.ng0);
                    }
                    emptyGuideV2.LJLJL.setVisibility(0);
                    emptyGuideV2.LIZIZ();
                    emptyGuideV2.LJLJI.setVisibility(8);
                } else {
                    TuxTextView tuxTextView2 = emptyGuideV2.LJLJL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(8);
                    }
                    emptyGuideV2.LJI(emptyGuideV2.LJLLL);
                    emptyGuideV2.LJLJI.setVisibility(0);
                }
                emptyGuideV2.LJLILLLLZI.setLongClickable(true);
                emptyGuideV2.LJLILLLLZI.setOnLongClickListener(emptyGuideV2.LJLLJ);
                emptyGuideV2.LJIIIZ().LJLJJLL = emptyGuideV2.LJLLJ;
                return;
        }
    }

    public /* synthetic */ C57534Mi2(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
