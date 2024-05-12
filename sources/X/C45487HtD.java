package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.HtD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45487HtD implements InterfaceC141565h2 {
    public final /* synthetic */ C45473Hsz LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ ArrayList<MyMediaModel> LIZJ;

    @Override // X.InterfaceC141565h2
    public final void LIZ(boolean z) {
        if (z) {
            if (this.LIZ.LJ.size() > 1 || this.LIZ.LJJII) {
                C5S1 c5s1 = new C5S1(this.LIZIZ.getContext());
                c5s1.LIZJ(R.string.tgq);
                c5s1.LJ();
                return;
            } else {
                if (C52243Ket.LIZ()) {
                    InterfaceC45535Htz interfaceC45535Htz = this.LIZ.LJIIZILJ;
                    if (interfaceC45535Htz == null) {
                        return;
                    }
                    interfaceC45535Htz.LIZJ(true, this.LIZJ);
                    return;
                }
                C5S1 c5s12 = new C5S1(this.LIZIZ.getContext());
                c5s12.LIZJ(R.string.tgs);
                c5s12.LJ();
                return;
            }
        }
        InterfaceC45535Htz interfaceC45535Htz2 = this.LIZ.LJIIZILJ;
        if (interfaceC45535Htz2 == null) {
            return;
        }
        interfaceC45535Htz2.LIZJ(true, this.LIZJ);
    }

    public C45487HtD(C45473Hsz c45473Hsz, View view, ArrayList<MyMediaModel> arrayList) {
        this.LIZ = c45473Hsz;
        this.LIZIZ = view;
        this.LIZJ = arrayList;
    }
}
