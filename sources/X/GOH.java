package X;

import Y.ACListenerS27S0100000_7;
import Y.IDCListenerS299S0100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOH extends AbstractC41429GNt<C41413GNd> {
    public final C13I LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final W5G LJLJJI;
    public final TextView LJLJJL;
    public final View LJLJJLL;
    public final Context LJLJL;

    @Override // X.AbstractC41429GNt
    public final void L(C41426GNq c41426GNq) {
        C41413GNd baseDetails = (C41413GNd) c41426GNq;
        o.LJIIIZ(baseDetails, "baseDetails");
        File file = new File(baseDetails.LJFF);
        if (file.exists()) {
            C78764Uvg.LJIIIZ(this.LJLJJI, android.net.Uri.fromFile(file).toString(), -1, -1);
        } else {
            AwemeDraft LIZ = this.LJLIL.LIZ(baseDetails.LJ);
            if (LIZ == null) {
                H7B.LIZJ("PostedDraftEntranceViewHolder: bindDraftCover -> draft is null");
                C78983UzD.LJIILL("queryNull -> PostedDraftEntranceViewHolder : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.LJLJL.getResources().getDimensionPixelOffset(R.dimen.oc);
                C41802Gas.LJIIIIZZ(LIZ, new VideoCoverConfig(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888), new GOI(baseDetails, this));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((Object) this.itemView.getContext().getText(R.string.q95));
        LIZ2.append(": ");
        LIZ2.append(baseDetails.LJI);
        this.LJLJJL.setText(X1D.LIZIZ(LIZ2));
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 177), this.itemView);
        this.itemView.setOnLongClickListener(new IDCListenerS299S0100000_7(this, 2));
        if (baseDetails.LIZIZ) {
            this.LJLJJL.setVisibility(8);
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJL.setVisibility(0);
            this.LJLJJLL.setVisibility(0);
        }
    }

    public GOH(View view, C13I c13i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(view);
        this.LJLIL = c13i;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = (W5G) view.findViewById(R.id.cover);
        this.LJLJJL = (TextView) view.findViewById(R.id.i01);
        this.LJLJJLL = view.findViewById(R.id.cxv);
        this.LJLJL = view.getContext();
    }
}
