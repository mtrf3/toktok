package X;

import Y.ACListenerS27S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I5l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46049I5l extends C46048I5k {
    public C46062I5y LJLJLLL;
    public boolean LJLL;

    public final boolean LLFII() {
        if (e1.LIZ(31744, "enable_music_smart_stick_point", true, false) && !C1DG.LJIIIIZZ() && this.LJLL) {
            return true;
        }
        return false;
    }

    @Override // X.C46048I5k, X.AbstractC029409q
    public final int getItemCount() {
        if (LLFII()) {
            return super.getItemCount() + 1;
        }
        return super.getItemCount();
    }

    @Override // X.C46048I5k
    public final void LJLZ(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        C46062I5y c46062I5y = this.LJLJLLL;
        if (c46062I5y != null) {
            c46062I5y.LLJJI();
        }
    }

    @Override // X.C46048I5k
    public final C46059I5v LJZL(int i) {
        if (!LLFII()) {
            return super.LJZL(i);
        }
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C46059I5v) ListProtector.get(this.LJLIL, LLFFF(i));
    }

    public final int LLFFF(int i) {
        if (LLFII()) {
            return i - 1;
        }
        return i;
    }

    @Override // X.C46048I5k, X.AbstractC029409q
    public final long getItemId(int i) {
        if (!LLFII()) {
            return super.getItemId(i);
        }
        if (getItemViewType(i) == 10001) {
            return 10001L;
        }
        if (getItemViewType(i) == 10003) {
            return 10003L;
        }
        return ((C46059I5v) ListProtector.get(this.LJLIL, LLFFF(i))).LIZ;
    }

    @Override // X.C46048I5k, X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (!LLFII()) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return 10001;
        }
        if (LLFFF(i) < ((ArrayList) this.LJLIL).size()) {
            return 10002;
        }
        return 10003;
    }

    @Override // X.C46048I5k, X.InterfaceC43983HNz
    public final void LJL(RecyclerView.ViewHolder sourceHolder, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(sourceHolder, "sourceHolder");
        if (!LLFII()) {
            super.LJL(sourceHolder, viewHolder);
            return;
        }
        int LLFFF = LLFFF(sourceHolder.getAdapterPosition());
        int LLFFF2 = LLFFF(viewHolder.getAdapterPosition());
        if (LLFFF < ((ArrayList) this.LJLIL).size() && LLFFF2 < ((ArrayList) this.LJLIL).size()) {
            int i = ((C46050I5m) sourceHolder).LJLILLLLZI.videoIndex;
            int i2 = ((C46050I5m) viewHolder).LJLILLLLZI.videoIndex;
            LLF(i, i2);
            ListProtector.add(this.LJLIL, LLFFF2, ListProtector.remove(this.LJLIL, LLFFF));
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                ((C46059I5v) it.next()).LIZIZ.videoIndex = i3;
                i3++;
            }
            notifyItemMoved(sourceHolder.getAdapterPosition(), viewHolder.getAdapterPosition());
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLJJLL;
            cutMultiVideoViewModel.LJLLI.setValue(new C46025I4n(1, i, i2));
        }
    }

    @Override // X.C46048I5k
    public final int LJZI(int i, RecyclerView recyclerView) {
        if (LLFII()) {
            i++;
        }
        return super.LJZI(i, recyclerView);
    }

    @Override // X.C46048I5k, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C46056I5s) {
            C46056I5s c46056I5s = (C46056I5s) holder;
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(c46056I5s.LJLIL, 124), c46056I5s.itemView);
        } else if (holder instanceof C46054I5q) {
            ((C46050I5m) holder).L(LJZL(i), (C46050I5m) holder);
        }
        super.onBindViewHolder(holder, i);
    }

    @Override // X.C46048I5k, X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c46056I5s;
        o.LJIIIZ(parent, "parent");
        if (i != 10001) {
            if (i != 10002) {
                c46056I5s = super.onCreateViewHolder(parent, i);
            } else {
                c46056I5s = new C46054I5q(this, parent);
            }
        } else {
            c46056I5s = new C46056I5s(this, parent);
        }
        C0AX.LIZ(parent, c46056I5s.itemView, R.id.lj7);
        View view = c46056I5s.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c46056I5s.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c46056I5s.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c46056I5s.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c46056I5s.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c46056I5s.getClass().getName();
        return c46056I5s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46049I5l(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
        o.LJIIIZ(videoEditViewModel, "videoEditViewModel");
        o.LJIIIZ(cutMultiVideoViewModel, "cutMultiVideoViewModel");
    }
}
