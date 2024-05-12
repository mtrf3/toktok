package X;

import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS432S0100000_7;

/* renamed from: X.GrS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42830GrS extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final InterfaceC88473Ynt<Integer, Integer, RecommendHashtag, C76800UCe> LJLIL;
    public final ViewModelStoreOwner LJLILLLLZI;
    public HashTagMobHelper LJLJI;
    public final KeyboardStateViewModel LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;

    public final void L(boolean z) {
        if (((Number) C42887GsN.LIZ.getValue()).intValue() == 1) {
            if (z) {
                this.itemView.findViewById(R.id.b8l).setAlpha(0.2f);
                return;
            } else {
                this.itemView.findViewById(R.id.b8l).setAlpha(1.0f);
                return;
            }
        }
        if (z) {
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dr);
            if (LIZIZ == null) {
                return;
            }
            this.itemView.findViewById(R.id.bsy).setBackgroundColor(LIZIZ.intValue());
            return;
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
        if (LIZIZ2 == null) {
            return;
        }
        this.itemView.findViewById(R.id.bsy).setBackgroundColor(LIZIZ2.intValue());
    }

    public C42830GrS(View view, IDqS432S0100000_7 iDqS432S0100000_7, ViewModelStoreOwner viewModelStoreOwner) {
        super(view);
        this.LJLIL = iDqS432S0100000_7;
        this.LJLILLLLZI = viewModelStoreOwner;
        this.LJLJJI = (KeyboardStateViewModel) new ViewModelProvider(viewModelStoreOwner).get(KeyboardStateViewModel.class);
    }
}
