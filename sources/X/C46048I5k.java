package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.utils.Au2S13S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.I5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46048I5k extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC43983HNz {
    public InterfaceC46060I5w LJLJI;
    public final VideoEditViewModel LJLJJL;
    public final CutMultiVideoViewModel LJLJJLL;
    public C162396Yx LJLJL;
    public List<C46059I5v> LJLIL = new ArrayList();
    public int LJLILLLLZI = 0;
    public boolean LJLJJI = true;
    public boolean LJLJLJ = true;

    public final long LL() {
        long j = 0;
        if (C77413UZt.LJIILL(this.LJLIL)) {
            return 0L;
        }
        for (C46059I5v c46059I5v : this.LJLIL) {
            if (c46059I5v != null) {
                VideoSegment videoSegment = c46059I5v.LIZIZ;
                if (!videoSegment.isDeleted) {
                    j += videoSegment.duration;
                }
            }
        }
        return j;
    }

    public final ArrayList<String> LLD() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (C77413UZt.LJIILL(this.LJLIL)) {
            return arrayList;
        }
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            C46059I5v c46059I5v = (C46059I5v) it.next();
            if (c46059I5v != null) {
                VideoSegment videoSegment = c46059I5v.LIZIZ;
                if (!videoSegment.isDeleted) {
                    if (C44694HgQ.LJIJI(videoSegment.LJII(false), false)) {
                        arrayList.add(c46059I5v.LIZIZ.thumbnail);
                    } else {
                        arrayList.add(c46059I5v.LIZIZ.LJII(false));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC029409q
    public int getItemCount() {
        List<C46059I5v> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        boolean z = this.LJLJLJ;
        int size = list.size();
        if (!z) {
            return size;
        }
        return size + 1;
    }

    @Override // X.InterfaceC43983HNz
    public final ViewPropertyAnimator LJJLJ(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    @Override // X.InterfaceC43983HNz
    public final void LJJLL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C46050I5m) {
            C46050I5m c46050I5m = (C46050I5m) viewHolder;
            RelativeLayout relativeLayout = c46050I5m.LJLJI;
            if (relativeLayout != null) {
                relativeLayout.setScaleX(1.25f);
                c46050I5m.LJLJI.setScaleY(1.25f);
            }
            C46025I4n c46025I4n = new C46025I4n(0, c46050I5m.LJLILLLLZI.videoIndex, -1);
            c46025I4n.LJLILLLLZI = viewHolder.getAdapterPosition();
            this.LJLJJLL.LJLLI.setValue(c46025I4n);
        }
    }

    public final void LJLLLLLL(List<VideoSegment> list) {
        if (C77413UZt.LJIILL(list)) {
            return;
        }
        if (this.LJLIL == null) {
            this.LJLIL = new ArrayList();
        }
        for (VideoSegment videoSegment : list) {
            this.LJLIL.add(new C46059I5v(videoSegment.videoIndex, videoSegment));
        }
        notifyDataSetChanged();
    }

    public void LJLZ(View view) {
        InterfaceC46060I5w interfaceC46060I5w = this.LJLJI;
        if (interfaceC46060I5w != null) {
            interfaceC46060I5w.LIZ(10003, null);
        }
    }

    public final void LJZ(VideoSegment videoSegment) {
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) this.LJLIL).size()) {
                break;
            }
            if (((C46059I5v) ListProtector.get(this.LJLIL, i)).LIZIZ.LJII(true).equals(videoSegment.LJII(true))) {
                ListProtector.remove(this.LJLIL, i);
                break;
            }
            i++;
        }
        notifyDataSetChanged();
    }

    public C46059I5v LJZL(int i) {
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C46059I5v) ListProtector.get(this.LJLIL, i);
    }

    public final void LLFF(VideoSegment videoSegment) {
        for (int i = 0; i < ((ArrayList) this.LJLIL).size(); i++) {
            if (((C46059I5v) ListProtector.get(this.LJLIL, i)).LIZIZ.LJII(true).equals(videoSegment.LJII(true))) {
                ((C46059I5v) ListProtector.get(this.LJLIL, i)).LIZIZ = videoSegment;
                notifyItemChanged(i);
                return;
            }
        }
    }

    @Override // X.AbstractC029409q
    public long getItemId(int i) {
        if (getItemViewType(i) == 10003) {
            return 10003L;
        }
        return ((C46059I5v) ListProtector.get(this.LJLIL, i)).LIZ;
    }

    @Override // X.AbstractC029409q
    public int getItemViewType(int i) {
        if (i < this.LJLIL.size()) {
            return 10002;
        }
        return 10003;
    }

    public final void setData(List<VideoSegment> list) {
        this.LJLIL.clear();
        for (VideoSegment videoSegment : list) {
            this.LJLIL.add(new C46059I5v(videoSegment.videoIndex, videoSegment));
        }
    }

    @Override // X.InterfaceC43983HNz
    public final void LJJJJJ(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder instanceof C46050I5m) {
            C46050I5m c46050I5m = (C46050I5m) viewHolder;
            RelativeLayout relativeLayout = c46050I5m.LJLJI;
            if (relativeLayout != null) {
                relativeLayout.setScaleY(1.0f);
                c46050I5m.LJLJI.setScaleX(1.0f);
            }
            C46025I4n c46025I4n = new C46025I4n(2, -1, c46050I5m.LJLILLLLZI.videoIndex);
            c46025I4n.LJLIL = z;
            c46025I4n.LJLJI = viewHolder.getAdapterPosition();
            this.LJLJJLL.LJLLI.setValue(c46025I4n);
        }
    }

    @Override // X.InterfaceC43983HNz
    public void LJL(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < ((ArrayList) this.LJLIL).size() && adapterPosition2 < ((ArrayList) this.LJLIL).size()) {
            int i = ((C46050I5m) viewHolder).LJLILLLLZI.videoIndex;
            int i2 = ((C46050I5m) viewHolder2).LJLILLLLZI.videoIndex;
            LLF(i, i2);
            ListProtector.add(this.LJLIL, adapterPosition2, ListProtector.remove(this.LJLIL, adapterPosition));
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                ((C46059I5v) it.next()).LIZIZ.videoIndex = i3;
                i3++;
            }
            notifyItemMoved(adapterPosition, adapterPosition2);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLJJLL;
            cutMultiVideoViewModel.LJLLI.setValue(new C46025I4n(1, i, i2));
        }
    }

    public int LJZI(int i, RecyclerView recyclerView) {
        RecyclerView.ViewHolder LJJIZ;
        C15070iV<Integer, Integer> LIZ = C8DQ.LIZ(recyclerView);
        if (i < LIZ.LIZ.intValue() || i > LIZ.LIZIZ.intValue() || i >= getItemCount() || i < 0 || (LJJIZ = recyclerView.LJJIZ(i)) == null) {
            return -1;
        }
        int[] iArr = new int[2];
        LJJIZ.itemView.getLocationOnScreen(iArr);
        return SFS.LJI(23.5d) + iArr[0];
    }

    public final void LLF(int i, int i2) {
        ListProtector.add(this.LJLJJL.kv0(), i2, ListProtector.remove(this.LJLJJL.kv0(), i));
        Iterator<VideoSegment> it = this.LJLJJL.kv0().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            it.next().videoIndex = i3;
            i3++;
        }
    }

    @Override // X.AbstractC029409q
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C46050I5m) {
            C46050I5m c46050I5m = (C46050I5m) viewHolder;
            c46050I5m.L(LJZL(i), c46050I5m);
        } else {
            if (!(viewHolder instanceof C141305gc)) {
                return;
            }
            C141305gc c141305gc = (C141305gc) viewHolder;
            C16880lQ.LJIIJ(new Au2S13S0100000_2(c141305gc, 6, 42), c141305gc.itemView);
        }
    }

    @Override // X.AbstractC029409q
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c46050I5m;
        if (i == 10003) {
            c46050I5m = new C141305gc(this, viewGroup);
        } else {
            c46050I5m = new C46050I5m(this, viewGroup);
        }
        C0AX.LIZ(viewGroup, c46050I5m.itemView, R.id.lj7);
        View view = c46050I5m.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c46050I5m.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c46050I5m.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c46050I5m.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c46050I5m.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c46050I5m.getClass().getName();
        return c46050I5m;
    }

    public C46048I5k(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.LJLJJL = videoEditViewModel;
        this.LJLJJLL = cutMultiVideoViewModel;
        setData(list);
        setHasStableIds(true);
    }
}
