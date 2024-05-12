package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8DL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DL extends C0A6 implements C0A3 {
    public static boolean LJLJLLL;
    public final RecyclerView LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public C8DJ LJLJJLL;
    public int LJLJL = -1;
    public final C8DM LJLJLJ = new InterfaceC86348Xui() { // from class: X.8DM
        @Override // X.InterfaceC86348Xui
        public final void LIZ() {
            C8DL.this.LJIIZILJ(0);
        }

        @Override // X.InterfaceC86348Xui
        public final void LJJLJ() {
            C8DL.this.LJLJJI = false;
        }
    };

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.8DM] */
    public C8DL(SYL syl) {
        this.LJLIL = syl;
    }

    public final void LJIILLIIL(C8DJ c8dj) {
        int i;
        C8DJ c8dj2 = this.LJLJJLL;
        if (c8dj2 != null) {
            c8dj2.LLLLLL();
        }
        this.LJLJJI = true;
        if (c8dj != null) {
            c8dj.LLLZI(this.LJLJLJ);
        }
        this.LJLJJLL = c8dj;
        if (c8dj != null) {
            i = c8dj.getPosition();
        } else {
            i = -1;
        }
        this.LJLJL = i;
    }

    public final void LJIIZILJ(int i) {
        LinearLayoutManager linearLayoutManager;
        int i2;
        int i3;
        int i4;
        int indexOf;
        LiveDualFeedCell liveDualFeedCell;
        C59992Xb item;
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        int i5;
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            i2 = linearLayoutManager.LLILL();
            i3 = linearLayoutManager.LLILLJJLI();
        } else {
            i2 = -1;
            i3 = -1;
        }
        Rect rect = new Rect();
        this.LJLIL.getGlobalVisibleRect(rect);
        ArrayList arrayList = new ArrayList();
        if (i2 <= i3) {
            int i6 = i2;
            while (true) {
                RecyclerView.ViewHolder LJJIZ = this.LJLIL.LJJIZ(i6);
                if ((LJJIZ instanceof LiveDualFeedCell) && (liveDualFeedCell = (LiveDualFeedCell) LJJIZ) != null && (item = liveDualFeedCell.getItem()) != null && (aweme = item.LJLIL) != null && (newLiveRoomData = aweme.getNewLiveRoomData()) != null && ((newLiveRoomData.liveSubOnly != 1 || newLiveRoomData.maxPreviewTime <= 0) && !C51029K0z.LJJIJL(newLiveRoomData.maskLayer, false) && !newLiveRoomData.isFinish() && !liveDualFeedCell.LJLJI)) {
                    Rect rect2 = new Rect();
                    liveDualFeedCell._$_findCachedViewById(R.id.ddf).getGlobalVisibleRect(rect2);
                    int height = liveDualFeedCell._$_findCachedViewById(R.id.ddf).getHeight();
                    int i7 = rect2.top;
                    int i8 = rect.top;
                    if (i7 < i8) {
                        i5 = rect2.bottom - i8;
                    } else {
                        int i9 = rect2.bottom;
                        int i10 = rect.bottom;
                        if (i9 > i10) {
                            i5 = i10 - i7;
                        } else {
                            i5 = i9 - i7;
                        }
                    }
                    if (height != 0 && (i5 * 1.0f) / height >= 0.95f) {
                        arrayList.add(liveDualFeedCell);
                    }
                }
                if (i6 == i3) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (ORZ.LJLJJI(this.LJLJJLL, arrayList) && i2 <= (i4 = this.LJLJL) && i4 <= i3) {
            if (i != -1) {
                if (i != 1 || (indexOf = arrayList.indexOf(this.LJLJJLL)) >= arrayList.size() - 1 || this.LJLJJI) {
                    return;
                }
                LJIILLIIL((C8DJ) ListProtector.get(arrayList, indexOf + 1));
                return;
            }
            int indexOf2 = arrayList.indexOf(this.LJLJJLL);
            if (indexOf2 <= 0 || this.LJLJJI) {
                return;
            }
            LJIILLIIL((C8DJ) ListProtector.get(arrayList, indexOf2 - 1));
            return;
        }
        if (i != -1) {
            if (i != 0 && i != 1) {
                return;
            }
            LJIILLIIL((C8DJ) ORZ.LJLLLL(arrayList));
            return;
        }
        LJIILLIIL((C8DJ) ORZ.LLFII(arrayList));
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLJJL == 0) {
            LJIIZILJ(0);
        }
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJL = i;
        if (i == 0) {
            if (this.LJLJI >= 0) {
                LJIIZILJ(1);
            } else {
                LJIIZILJ(-1);
            }
            this.LJLJI = 0;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI += i2;
    }
}
