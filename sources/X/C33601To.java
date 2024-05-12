package X;

import Y.IDrS40S0100000;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1To, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33601To extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC14440hU {
    public final BGMPlaylistViewModel LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final BaseFragment LJLJI;
    public final DataChannel LJLJJI;
    public final List<MusicSong> LJLJJL;
    public boolean LJLJJLL;

    public final void LJLLLLLL() {
        C14320hI c14320hI = this.LJLIL.LJLIL;
        Integer LIZLLL = c14320hI.LIZLLL(c14320hI.LJ);
        if (LIZLLL != null) {
            notifyItemChanged(LIZLLL.intValue() + 1);
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJL).size();
    }

    @Override // X.InterfaceC14440hU
    public final void Ee() {
        LJLLLLLL();
    }

    @Override // X.InterfaceC14440hU
    public final void LJJJLL() {
        LJLLLLLL();
    }

    @Override // X.InterfaceC14440hU
    public final void h9() {
        LJLLLLLL();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == getItemCount() - 1) {
            return 3;
        }
        return 1;
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

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        int i2;
        String LLLZ;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C1TY) {
            MusicSong musicSong = (MusicSong) ListProtector.get(this.LJLJJL, i);
            if (musicSong == null) {
                return;
            }
            MusicSong musicSong2 = this.LJLIL.LJLIL.LJ;
            if (musicSong2 != null && musicSong2.id == musicSong.id) {
                z = true;
            } else {
                z = false;
            }
            View view = holder.itemView;
            C78720Uuy url = C15650jR.LIZ().setUrl(musicSong.coverUrl);
            url.LJIIIIZZ = R.drawable.co7;
            url.LJIIJJI(view.findViewById(R.id.ajw));
            ((TextView) view.findViewById(R.id.akd)).setText(musicSong.title);
            TextView textView = (TextView) view.findViewById(R.id.akd);
            Context context = view.getContext();
            if (z && !this.LJLJJLL) {
                i2 = R.attr.eb;
            } else {
                i2 = R.attr.bns;
            }
            textView.setTextColor(C259910h.LIZIZ(i2, context));
            ((TextView) view.findViewById(R.id.ajt)).setText(musicSong.author);
            TextView textView2 = (TextView) view.findViewById(R.id.ajx);
            int i3 = musicSong.duration;
            int i4 = i3 % 60;
            int i5 = i3 / 60;
            if (C15380j0.LJIIZILJ()) {
                LLLZ = C16880lQ.LLLZ("%02d : %02d · ", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}, 2));
            } else {
                LLLZ = C16880lQ.LLLZ(" · %02d : %02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}, 2));
            }
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            textView2.setText(LLLZ);
            C29306Beo.LJI(view.findViewById(R.id.hsu));
            if (z && C14260hC.LJIIJJI) {
                C15490jB.LJIIL((C29701Eo) view.findViewById(R.id.hsu), "tiktok_live_broadcast_demand_1", "live_play_song_anim.zip", "images", true, null, null, 96);
                C29306Beo.LJJLJLI(view.findViewById(R.id.hsu));
            } else {
                C29306Beo.LJI(view.findViewById(R.id.hsu));
            }
            if (z && this.LJLJJLL) {
                C29306Beo.LJJLJLI(holder.itemView.findViewById(R.id.ak0));
            } else {
                C29306Beo.LJIIIZ(holder.itemView.findViewById(R.id.ak0));
            }
            View delete_view = view.findViewById(R.id.c6n);
            o.LJIIIIZZ(delete_view, "delete_view");
            C29306Beo.LJJJLL(delete_view, 500L, new IDqS172S0200000(this, musicSong, 55));
            C29306Beo.LJJJLL(view, 500L, new IDqS172S0200000(this, musicSong, 56));
            return;
        }
        if (holder instanceof C33571Tl) {
            C33571Tl c33571Tl = (C33571Tl) holder;
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLIL;
            boolean z2 = bGMPlaylistViewModel.LJLJJI;
            boolean z3 = bGMPlaylistViewModel.LJLJJL;
            if (c33571Tl.LJLIL) {
                c33571Tl.L(!z3);
            } else {
                c33571Tl.L(!z2);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c33571Tl;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 2) {
            if (i != 3) {
                final View LJIIIIZZ = C29306Beo.LJIIIIZZ(R.layout.d6r, parent, false);
                c33571Tl = new RecyclerView.ViewHolder(LJIIIIZZ) { // from class: X.1TY
                };
            } else {
                c33571Tl = new C33571Tl(C29306Beo.LJIIIIZZ(R.layout.d6q, parent, false), true);
            }
        } else {
            c33571Tl = new C33571Tl(C29306Beo.LJIIIIZZ(R.layout.d6q, parent, false), false);
        }
        C0AX.LIZ(parent, c33571Tl.itemView, R.id.lj7);
        View view = c33571Tl.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c33571Tl.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c33571Tl.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c33571Tl.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c33571Tl.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c33571Tl.getClass().getName();
        return c33571Tl;
    }

    public C33601To(BGMSongListViewModel bGMSongListViewModel, BGMPlaylistViewModel bGMPlaylistViewModel, RecyclerView recyclerView, BaseFragment lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = bGMPlaylistViewModel;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = dataChannel;
        List<MusicSong> LLJILJILJ = ORZ.LLJILJILJ(bGMPlaylistViewModel.jv0());
        ListProtector.add(LLJILJILJ, 0, null);
        ((ArrayList) LLJILJILJ).add(null);
        this.LJLJJL = LLJILJILJ;
        recyclerView.LJIIJJI(new IDrS40S0100000(this, 3));
        C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new C55252Ev(this, null), 3);
    }
}
