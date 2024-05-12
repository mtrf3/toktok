package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CSv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31369CSv extends C0A6 {
    public int LJLIL = -1;
    public final /* synthetic */ PublicScreenWidget LJLILLLLZI;

    public C31369CSv(PublicScreenWidget publicScreenWidget) {
        this.LJLILLLLZI = publicScreenWidget;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        this.LJLILLLLZI.LLIIJLIL(i, recyclerView);
        if (i == 1) {
            this.LJLILLLLZI.LJLLLL = false;
        } else if (i == 0) {
            if (!CUE.LIZ) {
                this.LJLILLLLZI.LLIIIJ(true);
                PublicScreenWidget publicScreenWidget = this.LJLILLLLZI;
                if (publicScreenWidget.LJLLILLLL == CT0.NORMAL) {
                    publicScreenWidget.LLIIZ();
                }
            }
            if (!recyclerView.canScrollVertically(1)) {
                PublicScreenWidget publicScreenWidget2 = this.LJLILLLLZI;
                publicScreenWidget2.LJLLILLLL = CT0.NORMAL;
                publicScreenWidget2.LLILII(0);
            }
        }
        PublicScreenWidget publicScreenWidget3 = this.LJLILLLLZI;
        C30030BqU c30030BqU = publicScreenWidget3.LL;
        if (c30030BqU != null) {
            String LIZIZ = C29841BnR.LIZIZ(publicScreenWidget3.LLD, publicScreenWidget3.dataChannel);
            c30030BqU.getClass();
            if (i == 1) {
                c30030BqU.LIZ(LIZIZ, true);
            } else {
                c30030BqU.LIZ(LIZIZ, false);
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        RecyclerView.ViewHolder viewHolder;
        PublicScreenWidget publicScreenWidget = this.LJLILLLLZI;
        if (publicScreenWidget.LJLLILLLL == CT0.NORMAL && (!CUE.LIZ) && !publicScreenWidget.LLF()) {
            PublicScreenWidget publicScreenWidget2 = this.LJLILLLLZI;
            if (publicScreenWidget2.LJZ) {
                return;
            }
            if (!publicScreenWidget2.LJLLI.LLFZ.isEmpty() && i2 >= 0) {
                SmoothLinearLayoutManager smoothLinearLayoutManager = this.LJLILLLLZI.LLIIII.LIZLLL;
                if (smoothLinearLayoutManager != null) {
                    i4 = smoothLinearLayoutManager.LLILLIZIL();
                } else {
                    i4 = 0;
                }
                if (i4 == this.LJLIL) {
                    return;
                }
                this.LJLIL = i4;
                for (int LIZLLL = this.LJLILLLLZI.LLIIII.LIZLLL(); LIZLLL <= i4; LIZLLL++) {
                    C31255COl c31255COl = this.LJLILLLLZI.LLIIII.LIZ;
                    if (c31255COl != null) {
                        viewHolder = c31255COl.LJJIZ(LIZLLL);
                    } else {
                        viewHolder = null;
                    }
                    if (viewHolder instanceof CSD) {
                        CSD csd = (CSD) viewHolder;
                        InterfaceC31337CRp interfaceC31337CRp = csd.LJLJI;
                        if ((interfaceC31337CRp instanceof InterfaceC31337CRp) && !interfaceC31337CRp.LJJLJLI().LIZ) {
                            csd.T(false);
                        }
                    }
                }
            }
        }
        if (recyclerView.canScrollVertically(1)) {
            PublicScreenWidget publicScreenWidget3 = this.LJLILLLLZI;
            if (publicScreenWidget3.LJLLLL) {
                return;
            }
            SmoothLinearLayoutManager smoothLinearLayoutManager2 = publicScreenWidget3.LLIIII.LIZLLL;
            if (smoothLinearLayoutManager2 != null) {
                i3 = smoothLinearLayoutManager2.LLILLJJLI();
            } else {
                i3 = 0;
            }
            PublicScreenWidget publicScreenWidget4 = this.LJLILLLLZI;
            int i5 = publicScreenWidget4.LJLLL;
            if (i3 > i5) {
                publicScreenWidget4.LLILII(publicScreenWidget4.LJLLJ - (i3 - i5));
                this.LJLILLLLZI.LJLLL = i3;
            }
            View view = this.LJLILLLLZI.LJLJI;
            if (view != null && view.getVisibility() == 0) {
                int LIZLLL2 = this.LJLILLLLZI.LLIIII.LIZLLL();
                int LJJLIIIIJ = this.LJLILLLLZI.LJLLI.LJJLIIIIJ();
                if (LJJLIIIIJ != -1) {
                    if (LJJLIIIIJ < LIZLLL2) {
                        this.LJLILLLLZI.findViewById(R.id.lqj).setVisibility(0);
                    } else {
                        this.LJLILLLLZI.findViewById(R.id.lqj).setVisibility(8);
                    }
                }
            }
            this.LJLILLLLZI.LLILL(CT0.FOCUS, true);
        } else {
            this.LJLILLLLZI.LLILL(CT0.NORMAL, false);
        }
        C30030BqU c30030BqU = this.LJLILLLLZI.LL;
        if (c30030BqU != null && c30030BqU.LIZIZ) {
            c30030BqU.LIZ += i2;
        }
    }
}
