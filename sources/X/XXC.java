package X;

import Y.IDrS53S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.StickerMusicWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XXC extends XXZ {
    public XY6 LJLJJI;
    public XZ1 LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public RecyclerView LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public InterfaceC85019XYh<XYN> LJLLJ;

    @Override // X.C8HS, X.C4II
    public final int getBasicItemCount() {
        if (this.LJLLI) {
            return this.LJLJJLL + 1;
        }
        return this.LJLJJLL;
    }

    @Override // X.XXZ
    public final ListItemWidget LJLLLLLL(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        if (itemViewType != 5) {
                            return null;
                        }
                        ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                        challengeMusicWidget.LJLL = this.LJLJJI;
                        challengeMusicWidget.LJLLL = this.LJLLJ;
                        challengeMusicWidget.LJLLLL = this.LJLJJL;
                        challengeMusicWidget.LJLLILLLL = -2;
                        return challengeMusicWidget;
                    }
                    StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                    stickerMusicWidget.LJLJLLL = this.LJLJJI;
                    stickerMusicWidget.LJLLL = this.LJLLJ;
                    stickerMusicWidget.LJLLLL = this.LJLJJL;
                    stickerMusicWidget.LJLLILLLL = -2;
                    return stickerMusicWidget;
                }
                MusicRadioWidget musicRadioWidget = new MusicRadioWidget();
                XY6 ISelectMusic = this.LJLJJI;
                o.LJIIIZ(ISelectMusic, "ISelectMusic");
                musicRadioWidget.LJLLILLLL = ISelectMusic;
                musicRadioWidget.LJLLL = this.LJLLJ;
                XZ1 postSelectMusicListener = this.LJLJJL;
                o.LJIIIZ(postSelectMusicListener, "postSelectMusicListener");
                musicRadioWidget.LJLLLL = postSelectMusicListener;
                if (this.LJLLI) {
                    i--;
                }
                musicRadioWidget.LJLL = i;
                return musicRadioWidget;
            }
            MusicBoardWidget musicBoardWidget = new MusicBoardWidget();
            musicBoardWidget.LJLJLLL = this.LJLJJI;
            musicBoardWidget.LJLZ = this.LJLLJ;
            if (this.LJLLI) {
                i--;
            }
            musicBoardWidget.LJLLILLLL = i;
            musicBoardWidget.LJLLJ = i + 10086;
            return musicBoardWidget;
        }
        MusicClassWidget musicClassWidget = new MusicClassWidget();
        if (this.LJLLI) {
            i--;
        }
        musicClassWidget.LJLJLLL = i;
        musicClassWidget.LJLL = i + 10086;
        return musicClassWidget;
    }

    public final void LJLZ(boolean z) {
        ListItemWidget listItemWidget;
        int i;
        int measuredHeight;
        C0A2 layoutManager = this.LJLJLJ.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        for (int i2 = LLILL; i2 <= LLILLJJLI; i2++) {
            View childAt = this.LJLJLJ.getChildAt(i2 - LLILL);
            if (childAt == null) {
                return;
            }
            if (this.mShowFooter && i2 == getBasicItemCount()) {
                return;
            }
            if (i2 < this.LJLJI.size()) {
                listItemWidget = (ListItemWidget) ListProtector.get(this.LJLJI, i2);
            } else {
                listItemWidget = null;
            }
            if (listItemWidget instanceof MusicBoardWidget) {
                if (z) {
                    MusicBoardWidget musicBoardWidget = (MusicBoardWidget) listItemWidget;
                    int i3 = 0;
                    while (true) {
                        boolean[] zArr = musicBoardWidget.LJZI;
                        if (i3 >= zArr.length) {
                            break;
                        }
                        musicBoardWidget.LJZ[i3] = false;
                        zArr[i3] = false;
                        i3++;
                    }
                }
                if (childAt.getTop() > 0) {
                    i = 0;
                } else {
                    i = -childAt.getTop();
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int bottom = childAt.getBottom();
                int i4 = this.LJLJLLL;
                if (bottom > i4) {
                    measuredHeight = (measuredHeight2 + i4) - childAt.getBottom();
                } else {
                    measuredHeight = childAt.getMeasuredHeight();
                }
                MusicBoardWidget musicBoardWidget2 = (MusicBoardWidget) listItemWidget;
                XYS xys = musicBoardWidget2.LJLJLJ;
                if (xys != null) {
                    XXL xxl = (XXL) xys;
                    boolean[] zArr2 = musicBoardWidget2.LJZ;
                    boolean[] zArr3 = musicBoardWidget2.LJZI;
                    for (int i5 = 0; i5 < zArr3.length; i5++) {
                        if ((xxl.LJLLI * i5) + xxl.LJLJI.getTop() <= measuredHeight) {
                            if (((i5 + 1) * xxl.LJLLI) + xxl.LJLJI.getTop() >= i) {
                                if (!zArr2[i5]) {
                                    zArr2[i5] = true;
                                    zArr3[i5] = true;
                                }
                            }
                        }
                        zArr2[i5] = false;
                        zArr3[i5] = false;
                    }
                    musicBoardWidget2.LJIJ();
                }
            }
        }
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        if (this.LJLLI) {
            if (i == 0) {
                return this.LJLLILLLL;
            }
            if (i == 1) {
                if (this.LJLL) {
                    return 3;
                }
            } else if (i == 2) {
                return 1;
            }
            return 2;
        }
        if (i == 0) {
            if (this.LJLL) {
                return 3;
            }
        } else if (i == 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.XXZ, X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJLJ = recyclerView;
        recyclerView.LJIIJJI(new IDrS53S0100000_15(this, 5));
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return new XXL(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJL);
                    }
                    return new C85018XYg(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJL);
                }
                C85023XYl c85023XYl = new C85023XYl(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJL);
                c85023XYl.LJLL = ((Boolean) this.LJLILLLLZI.get("mvtheme_music_type")).booleanValue();
                c85023XYl.LJLLI = ((Boolean) this.LJLILLLLZI.get("is_photo_mv_type")).booleanValue();
                return c85023XYl;
            }
            return new C84995XXj(C1FL.LIZIZ(viewGroup, R.layout.bgc, viewGroup, false, "inflater.inflate(R.layou…_radio, viewGroup, false)"));
        }
        return new XXV(LJZ(i, C16880lQ.LLZIL(viewGroup.getContext()), viewGroup));
    }

    public final View LJZ(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (i == 1) {
            return C16880lQ.LLLLIILL(layoutInflater, R.layout.bgi, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return C16880lQ.LLLLIILL(layoutInflater, R.layout.bgf, viewGroup, false);
        }
        return C16880lQ.LLLLIILL(layoutInflater, R.layout.bgh, viewGroup, false);
    }

    public XXC(WidgetManager widgetManager, DataCenter dataCenter, XY6 xy6, XZ1 xz1, InterfaceC85019XYh<XYN> interfaceC85019XYh, int i) {
        super(widgetManager, dataCenter);
        this.LJLJJI = xy6;
        this.LJLJJL = xz1;
        this.LJLLJ = interfaceC85019XYh;
        this.LJLJL = i;
    }
}
