package X;

import Y.IDrS40S0100000;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33491Td extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC14440hU {
    public final BGMSongListViewModel LJLIL;
    public final BGMPlaylistViewModel LJLILLLLZI;
    public final DataChannel LJLJI;
    public final LifecycleOwner LJLJJI;
    public final String LJLJJL;
    public final long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final java.util.Map<Long, Integer> LJLJLLL;
    public final List<MusicSong> LJLL;
    public boolean LJLLI;

    public final int LJLLLLLL() {
        MusicSong musicSong;
        Iterator it = ((ArrayList) this.LJLL).iterator();
        int i = 0;
        while (it.hasNext()) {
            MusicSong musicSong2 = (MusicSong) it.next();
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLILLLLZI;
            if (bGMPlaylistViewModel != null && (musicSong = bGMPlaylistViewModel.LJLIL.LJ) != null && musicSong2.id == musicSong.id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLL).size() + 1;
    }

    @Override // X.InterfaceC14440hU
    public final void Ee() {
        notifyItemChanged(LJLLLLLL());
    }

    @Override // X.InterfaceC14440hU
    public final void LJJJLL() {
        notifyItemChanged(LJLLLLLL());
    }

    @Override // X.InterfaceC14440hU
    public final void h9() {
        notifyItemChanged(LJLLLLLL());
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i != getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C14260hC.LIZ(this);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        C14260hC.LJFF(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        if (r9 != false) goto L29;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33491Td.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c33561Tk;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 2) {
            c33561Tk = new C33571Tl(C29306Beo.LJIIIIZZ(R.layout.d6q, parent, false), true);
        } else {
            c33561Tk = new C33561Tk(C29306Beo.LJIIIIZZ(R.layout.d6s, parent, false));
        }
        C0AX.LIZ(parent, c33561Tk.itemView, R.id.lj7);
        View view = c33561Tk.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c33561Tk.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c33561Tk.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c33561Tk.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c33561Tk.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c33561Tk.getClass().getName();
        return c33561Tk;
    }

    public C33491Td(BGMSongListViewModel bGMSongListViewModel, BGMPlaylistViewModel bGMPlaylistViewModel, RunnableC31065CHd runnableC31065CHd, DataChannel dataChannel, LifecycleOwner lifecycleOwner, String albumName, long j) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(albumName, "albumName");
        this.LJLIL = bGMSongListViewModel;
        this.LJLILLLLZI = bGMPlaylistViewModel;
        this.LJLJI = dataChannel;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = albumName;
        this.LJLJJLL = j;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = new HashMap();
        this.LJLL = new ArrayList();
        runnableC31065CHd.LJIIJJI(new IDrS40S0100000(this, 2));
        C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new C2EY(this, null), 3);
        C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new C2EZ(this, null), 3);
        C14260hC.LIZ(this);
        notifyDataSetChanged();
    }
}
