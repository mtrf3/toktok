package Y;

import X.C0A2;
import X.C0A6;
import X.C29031Bz;
import X.C29306Beo;
import X.C2EW;
import X.C2EX;
import X.C33491Td;
import X.C33601To;
import X.C55192Ep;
import X.C55202Eq;
import X.OSZ;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDrS40S0100000 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$3(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS40S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS40S0100000 iDrS40S0100000, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                KaraokeLibrarySongListFragment karaokeLibrarySongListFragment = (KaraokeLibrarySongListFragment) iDrS40S0100000.l0;
                int LLILL = linearLayoutManager.LLILL();
                int i2 = 0;
                View LJJJ = linearLayoutManager.LJJJ(0);
                if (LJJJ != null) {
                    i2 = LJJJ.getTop();
                }
                KaraokeViewModel karaokeViewModel = karaokeLibrarySongListFragment.LJLJJL;
                if (karaokeViewModel != null) {
                    karaokeViewModel.LJLL.put(Long.valueOf(karaokeLibrarySongListFragment.LJLJJLL), new OSZ<>(Integer.valueOf(LLILL), Integer.valueOf(i2)));
                }
            }
        }
    }

    public static final void LJIILL$0(IDrS40S0100000 iDrS40S0100000, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        C29031Bz c29031Bz = (C29031Bz) iDrS40S0100000.l0;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = c29031Bz.LJZI.computeVerticalScrollRange();
        int i3 = c29031Bz.LJZ;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= c29031Bz.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        c29031Bz.LJZL = z;
        int computeHorizontalScrollRange = c29031Bz.LJZI.computeHorizontalScrollRange();
        int i4 = c29031Bz.LJLZ;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= c29031Bz.LJLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        c29031Bz.LL = z2;
        boolean z3 = c29031Bz.LJZL;
        if (!z3 && !z2) {
            if (c29031Bz.LLD != 0) {
                c29031Bz.LJIIIZ(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            c29031Bz.LJLLILLLL = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            c29031Bz.LJLLI = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c29031Bz.LL) {
            float f2 = i4;
            c29031Bz.LJLLLL = (int) ((((f2 / 2.0f) + computeHorizontalScrollOffset) * f2) / computeHorizontalScrollRange);
            c29031Bz.LJLLL = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = c29031Bz.LLD;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        c29031Bz.LJIIIZ(1);
    }

    public static final void LJIILL$1(IDrS40S0100000 iDrS40S0100000, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        Boolean bool;
        int i4;
        Boolean bool2;
        boolean z2;
        LinearLayoutManager linearLayoutManager;
        int i5;
        LinearLayoutManager linearLayoutManager2;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((C33491Td) iDrS40S0100000.l0).getItemCount() <= 1) {
            return;
        }
        C33491Td c33491Td = (C33491Td) iDrS40S0100000.l0;
        BGMSongListViewModel bGMSongListViewModel = c33491Td.LJLIL;
        int i6 = 0;
        if (bGMSongListViewModel != null && c33491Td.LJLJJLL == bGMSongListViewModel.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Map<Long, Integer> map = bGMSongListViewModel.LJLLI;
            Long valueOf = Long.valueOf(c33491Td.LJLJJLL);
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                i5 = linearLayoutManager2.LLILL();
            } else {
                i5 = 0;
            }
            ((HashMap) map).put(valueOf, Integer.valueOf(i5));
        }
        C33491Td c33491Td2 = (C33491Td) iDrS40S0100000.l0;
        Map<Long, Integer> map2 = c33491Td2.LJLJLLL;
        Long valueOf2 = Long.valueOf(c33491Td2.LJLJJLL);
        C0A2 layoutManager2 = recyclerView.getLayoutManager();
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
            i3 = linearLayoutManager.LLILLJJLI();
        } else {
            i3 = 0;
        }
        ((HashMap) map2).put(valueOf2, Integer.valueOf(i3));
        C33491Td c33491Td3 = (C33491Td) iDrS40S0100000.l0;
        if (c33491Td3.LJLJJLL != -1) {
            int itemCount = c33491Td3.getItemCount();
            C33491Td c33491Td4 = (C33491Td) iDrS40S0100000.l0;
            Integer num = (Integer) ((HashMap) c33491Td4.LJLJLLL).get(Long.valueOf(c33491Td4.LJLJJLL));
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            if (itemCount - i4 <= 1) {
                C33491Td c33491Td5 = (C33491Td) iDrS40S0100000.l0;
                BGMSongListViewModel bGMSongListViewModel2 = c33491Td5.LJLIL;
                if (bGMSongListViewModel2 != null) {
                    long j = c33491Td5.LJLJJLL;
                    if (!bGMSongListViewModel2.LJLJJLL) {
                        if (C29306Beo.LJIILLIIL((Boolean) ((HashMap) bGMSongListViewModel2.LJLJJL).get(Long.valueOf(j)))) {
                            z2 = true;
                            bool2 = Boolean.valueOf(z2);
                        }
                    }
                    z2 = false;
                    bool2 = Boolean.valueOf(z2);
                } else {
                    bool2 = null;
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    C33491Td c33491Td6 = (C33491Td) iDrS40S0100000.l0;
                    C29306Beo.LJJIIJZLJL(c33491Td6.LJLJJI, null, new C2EW(c33491Td6, null), 3);
                }
            }
        }
        C33491Td c33491Td7 = (C33491Td) iDrS40S0100000.l0;
        if (c33491Td7.LJLJJLL == -1) {
            int itemCount2 = c33491Td7.getItemCount();
            Integer num2 = (Integer) ((HashMap) ((C33491Td) iDrS40S0100000.l0).LJLJLLL).get(-1L);
            if (num2 != null) {
                i6 = num2.intValue();
            }
            if (itemCount2 - i6 <= 1) {
                if (((C33491Td) iDrS40S0100000.l0).LJLIL != null) {
                    bool = Boolean.valueOf(!r0.LJLJL);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    C33491Td c33491Td8 = (C33491Td) iDrS40S0100000.l0;
                    C29306Beo.LJJIIJZLJL(c33491Td8.LJLJJI, null, new C2EX(c33491Td8, null), 3);
                }
            }
        }
    }

    public static final void LJIILL$2(IDrS40S0100000 iDrS40S0100000, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((C33601To) iDrS40S0100000.l0).getItemCount() <= 2) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            i3 = linearLayoutManager.LLILLJJLI();
        } else {
            i3 = 0;
        }
        if (((C33601To) iDrS40S0100000.l0).getItemCount() - i3 < 10) {
            C33601To c33601To = (C33601To) iDrS40S0100000.l0;
            BGMPlaylistViewModel bGMPlaylistViewModel = c33601To.LJLIL;
            if (!bGMPlaylistViewModel.LJLJJLL && !bGMPlaylistViewModel.LJLJJL) {
                C29306Beo.LJJIIJZLJL(c33601To.LJLJI, null, new C55192Ep(c33601To, null), 3);
            }
        }
        if (i3 < 10) {
            C33601To c33601To2 = (C33601To) iDrS40S0100000.l0;
            BGMPlaylistViewModel bGMPlaylistViewModel2 = c33601To2.LJLIL;
            if (!bGMPlaylistViewModel2.LJLJL && !bGMPlaylistViewModel2.LJLJJI) {
                C29306Beo.LJJIIJZLJL(c33601To2.LJLJI, null, new C55202Eq(c33601To2, null), 3);
            }
        }
    }

    public static final void LJIILL$3(IDrS40S0100000 iDrS40S0100000, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int i3;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        Boolean bool = null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        boolean z = false;
        if (linearLayoutManager != null) {
            i3 = linearLayoutManager.LLILLJJLI();
        } else {
            i3 = 0;
        }
        if (((KaraokeSongListFragment) iDrS40S0100000.l0).Al().getItemCount() - i3 < 10) {
            KaraokeSongListFragment karaokeSongListFragment = (KaraokeSongListFragment) iDrS40S0100000.l0;
            KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LJLJJL;
            if (karaokeViewModel != null) {
                long j = karaokeSongListFragment.LJLJJLL;
                if (j != -997 ? !(!karaokeViewModel.LJLIL.LJIIJJI(j) || karaokeViewModel.LJLLL.contains(Long.valueOf(j))) : !((str = karaokeViewModel.LJLLILLLL) == null || !karaokeViewModel.LJLIL.LJIIL(str) || karaokeViewModel.LJLLLL.contains(karaokeViewModel.LJLLILLLL))) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (C29306Beo.LJJIFFI(bool)) {
                ((KaraokeSongListFragment) iDrS40S0100000.l0).wl();
            }
        }
    }
}
