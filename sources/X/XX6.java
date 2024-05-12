package X;

import Y.IDrS53S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XX6 extends XXZ {
    public XY4 LJLJJI;
    public final Fragment LJLJJL;
    public XZ0 LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public RecyclerView LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public int LJLLL;
    public final int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public C72H<XYM> LJZ;

    @Override // X.C8HS, X.C4II
    public final int getBasicItemCount() {
        if (this.LJLLI) {
            return this.LJLJL + 1;
        }
        return this.LJLJL;
    }

    @Override // X.XXZ
    public final ListItemWidget LJLLLLLL(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        return null;
                    }
                    ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                    challengeMusicWidget.LJLLI = this.LJLJJI;
                    challengeMusicWidget.LJLJLLL = this.LJLJJL;
                    challengeMusicWidget.LJLZ = this.LJZ;
                    challengeMusicWidget.LJZ = this.LJLJJLL;
                    challengeMusicWidget.LJLLJ = -2;
                    challengeMusicWidget.LJLLLL = this.LJLLILLLL;
                    challengeMusicWidget.LJLLLLLL = this.LJLLJ;
                    return challengeMusicWidget;
                }
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.LJLL = this.LJLJJI;
                stickerMusicWidget.LJLLLL = this.LJZ;
                stickerMusicWidget.LJLJLLL = this.LJLJJL;
                stickerMusicWidget.LJLLLLLL = this.LJLJJLL;
                stickerMusicWidget.LJLLJ = -2;
                stickerMusicWidget.LJLZ = this.LJLLILLLL;
                stickerMusicWidget.LJZ = this.LJLLJ;
                return stickerMusicWidget;
            }
            ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = new ViewPager2MusicBoardWidget(this.LJLLLL, this.LJLJJL);
            viewPager2MusicBoardWidget.LJLL = this.LJLJJI;
            viewPager2MusicBoardWidget.LJZI = this.LJZ;
            if (this.LJLLI) {
                i--;
            }
            viewPager2MusicBoardWidget.LJLLJ = i;
            viewPager2MusicBoardWidget.LJLLL = i + 10086;
            viewPager2MusicBoardWidget.LLF = this.LJLLILLLL;
            viewPager2MusicBoardWidget.LLFF = this.LJLLJ;
            viewPager2MusicBoardWidget.LLFFF = this.LJLZ;
            return viewPager2MusicBoardWidget;
        }
        MusicClassWidget musicClassWidget = new MusicClassWidget(this.LJLLLL);
        if (this.LJLLI) {
            i--;
        }
        musicClassWidget.LJLJLLL = i;
        musicClassWidget.LJLL = i + 10086;
        musicClassWidget.LJLLJ = this.LJLLILLLL;
        musicClassWidget.LJLLL = this.LJLLJ;
        return musicClassWidget;
    }

    public final void LJLZ(boolean z) {
        Object obj;
        int i;
        int measuredHeight;
        C0A2 layoutManager = this.LJLJLLL.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL < 0 || LLILLJJLI < 0) {
            return;
        }
        for (int i2 = LLILL; i2 <= LLILLJJLI; i2++) {
            View childAt = this.LJLJLLL.getChildAt(i2 - LLILL);
            if (childAt == null) {
                return;
            }
            if (this.mShowFooter && i2 == getBasicItemCount()) {
                return;
            }
            if (i2 < this.LJLJI.size()) {
                obj = (ListItemWidget) ListProtector.get(this.LJLJI, i2);
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC85027XYp) {
                if (z) {
                    ((InterfaceC85027XYp) obj).LJIIIIZZ();
                }
                if (childAt.getTop() > 0) {
                    i = 0;
                } else {
                    i = -childAt.getTop();
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int bottom = childAt.getBottom();
                int i3 = this.LJLL;
                if (bottom > i3) {
                    measuredHeight = (measuredHeight2 + i3) - childAt.getBottom();
                } else {
                    measuredHeight = childAt.getMeasuredHeight();
                }
                ((InterfaceC85027XYp) obj).LJI(i, measuredHeight);
            }
        }
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        if (C59859NeR.LIZ()) {
            if (i == 0 && this.LJLLLLLL) {
                return 1;
            }
            return 2;
        }
        if (this.LJLLI) {
            if (i == 0) {
                return this.LJLLL;
            }
            if (i == 2 && this.LJLLLLLL) {
                return 1;
            }
            return 2;
        }
        if (i == 1 && this.LJLLLLLL) {
            return 1;
        }
        return 2;
    }

    @Override // X.XXZ, X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJLLL = recyclerView;
        recyclerView.LJIIJJI(new IDrS53S0100000_15(this, 4));
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    return new XXJ(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJLJ);
                }
                return new C85017XYf(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJLJ);
            }
            C85020XYi c85020XYi = new C85020XYi(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJLJ);
            c85020XYi.LJLL = ((Boolean) this.LJLILLLLZI.get("mvtheme_music_type")).booleanValue();
            c85020XYi.LJLLI = ((Boolean) this.LJLILLLLZI.get("is_photo_mv_type")).booleanValue();
            return c85020XYi;
        }
        return new XXU(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup));
    }

    public final View LJZ(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (i == 1) {
            return C16880lQ.LLLLIILL(layoutInflater, R.layout.bl5, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return C16880lQ.LLLLIILL(layoutInflater, R.layout.bib, viewGroup, false);
        }
        return C16880lQ.LLLLIILL(layoutInflater, R.layout.bl4, viewGroup, false);
    }

    public XX6(Fragment fragment, WidgetManager widgetManager, DataCenter dataCenter, XY4 xy4, XZ0 xz0, C72H<XYM> c72h, int i, int i2) {
        super(widgetManager, dataCenter);
        this.LJLJJL = fragment;
        this.LJLJJI = xy4;
        this.LJLJJLL = xz0;
        this.LJZ = c72h;
        this.LJLJLJ = i;
        this.LJLLLL = i2;
    }
}
