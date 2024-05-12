package X;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.react.bridge.Callback;
import java.lang.ref.WeakReference;

/* renamed from: X.VUs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79830VUs implements Runnable {
    public final WeakReference<RecyclerView> LJLIL;
    public int LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLL = true;
    public final K2Y LJLLI = new K2Y(this);
    public Callback LJLILLLLZI = null;
    public VRX LJLJLJ = null;
    public boolean LJLJLLL = false;

    public final void LIZ() {
        int LJJJJJ;
        int LJJJJL;
        int i;
        int paddingLeft;
        int paddingRight;
        int i2;
        int i3;
        int min;
        int width;
        char c;
        boolean z;
        boolean z2;
        int paddingLeft2;
        int i4;
        int paddingRight2;
        int i5;
        int i6;
        int width2;
        RecyclerView recyclerView = this.LJLIL.get();
        if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
            LIZIZ();
            return;
        }
        if (!this.LJLJLLL) {
            this.LJLILLLLZI.invoke(0);
            LIZIZ();
            return;
        }
        int min2 = Math.min(this.LJLJI, recyclerView.getLayoutManager().LJJJJZ() - 1);
        this.LJLJI = min2;
        this.LJLJI = Math.max(min2, 0);
        int childCount = recyclerView.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                VRX vrx = (VRX) recyclerView.getChildAt(i7);
                if (vrx.LJLIL != 3 && ((C79831VUt) recyclerView.LJJJJJL(vrx)).LJLIL.LJLILLLLZI != null) {
                    break;
                } else {
                    i7++;
                }
            } else {
                C0A2 layoutManager = recyclerView.getLayoutManager();
                int childCount2 = recyclerView.getChildCount();
                this.LJLJJLL = layoutManager.LJJJJZ();
                this.LJLJL = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    }
                    VRX vrx2 = (VRX) recyclerView.getChildAt(i8);
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) vrx2.getLayoutParams()).getViewLayoutPosition();
                    this.LJLJL = Math.max(viewLayoutPosition, this.LJLJL);
                    this.LJLJJLL = Math.min(viewLayoutPosition, this.LJLJJLL);
                    if (viewLayoutPosition == this.LJLJI) {
                        this.LJLJLJ = vrx2;
                        break;
                    }
                    i8++;
                }
                if (this.LJLJLJ == null) {
                    int i9 = this.LJLJJLL;
                    int i10 = this.LJLJI;
                    if (i9 > i10) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    int i11 = this.LJLJL;
                    int i12 = (i11 - i9) + 1;
                    if (i5 == -1) {
                        i6 = i9 - i10;
                    } else {
                        i6 = i10 - i11;
                    }
                    if (this.LJLL) {
                        width2 = recyclerView.getHeight();
                    } else {
                        width2 = recyclerView.getWidth();
                    }
                    int i13 = (i6 * width2) / i12;
                    if (i6 > 30 && i13 > width2 * 10) {
                        int i14 = this.LJLJJLL;
                        int i15 = this.LJLJI;
                        if (i14 <= i15) {
                            i14 = this.LJLJL;
                        }
                        recyclerView.LJLI(((i14 - i15) / 2) + i15);
                    } else {
                        min = Math.min(width2, C49712JfA.LIZJ * i6) * i5;
                    }
                } else {
                    C0A2 layoutManager2 = recyclerView.getLayoutManager();
                    if (this.LJLL) {
                        LJJJJJ = layoutManager2.LJJJJLL(this.LJLJLJ);
                    } else {
                        LJJJJJ = layoutManager2.LJJJJJ(this.LJLJLJ);
                    }
                    if (this.LJLL) {
                        LJJJJL = layoutManager2.LJJJJJL(this.LJLJLJ);
                    } else {
                        LJJJJL = layoutManager2.LJJJJL(this.LJLJLJ);
                    }
                    if (this.LJLL) {
                        i = layoutManager2.LJLLLLLL;
                        paddingLeft = layoutManager2.getPaddingTop();
                    } else {
                        i = layoutManager2.LJLLLL;
                        paddingLeft = layoutManager2.getPaddingLeft();
                    }
                    if (this.LJLL) {
                        paddingRight = layoutManager2.getPaddingBottom();
                    } else {
                        paddingRight = layoutManager2.getPaddingRight();
                    }
                    int i16 = (i - paddingLeft) - paddingRight;
                    if (TextUtils.equals(this.LJLJJI, "middle")) {
                        i3 = LJJJJJ - (((i16 - LJJJJL) / 2) + (this.LJLJJL + paddingLeft));
                    } else {
                        if (TextUtils.equals(this.LJLJJI, "bottom")) {
                            i2 = ((this.LJLJJL + paddingLeft) + i16) - LJJJJL;
                        } else {
                            i2 = this.LJLJJL + paddingLeft;
                        }
                        i3 = LJJJJJ - i2;
                    }
                    if (i3 == 0) {
                        this.LJLILLLLZI.invoke(0);
                    } else {
                        min = Math.min(Math.max(Math.abs(i3) / 3, 1), C49712JfA.LIZJ);
                        if (i3 <= 0) {
                            min = -min;
                        }
                        if (this.LJLL) {
                            width = this.LJLJLJ.getHeight();
                        } else {
                            width = this.LJLJLJ.getWidth();
                        }
                        if (width == 0 && min == 1) {
                            this.LJLILLLLZI.invoke(0);
                        }
                    }
                    LIZIZ();
                    return;
                }
                boolean z3 = this.LJLL;
                if (min != 0) {
                    if (min > 0) {
                        c = 1;
                    } else {
                        c = 65535;
                    }
                    C0A2 layoutManager3 = recyclerView.getLayoutManager();
                    int childCount3 = recyclerView.getChildCount();
                    if (recyclerView.LJJJ(0, false) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (recyclerView.LJJJ(layoutManager3.LJJJJZ() - 1, false) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z && 65535 == c) || (z2 && 1 == c)) {
                        int i17 = Integer.MAX_VALUE;
                        int i18 = LiveLayoutPreloadThreadPriority.DEFAULT;
                        for (int i19 = 0; i19 < childCount3; i19++) {
                            View childAt = recyclerView.getChildAt(i19);
                            if (z3) {
                                i17 = Math.min(layoutManager3.LJJJJLL(childAt), i17);
                            } else {
                                i17 = Math.min(layoutManager3.LJJJJJ(childAt), i17);
                            }
                            if (z3) {
                                i18 = Math.max(layoutManager3.LJJJJIZL(childAt), i18);
                            } else {
                                i18 = Math.max(layoutManager3.LJJJJLI(childAt), i18);
                            }
                        }
                        if (z3) {
                            paddingLeft2 = layoutManager3.getPaddingTop();
                            i4 = layoutManager3.LJLLLLLL;
                            paddingRight2 = layoutManager3.getPaddingBottom();
                        } else {
                            paddingLeft2 = layoutManager3.getPaddingLeft();
                            i4 = layoutManager3.LJLLLL;
                            paddingRight2 = layoutManager3.getPaddingRight();
                        }
                        int i20 = i4 - paddingRight2;
                        if (z) {
                        }
                    }
                    if (z3) {
                        recyclerView.scrollBy(0, min);
                    } else {
                        recyclerView.scrollBy(min, 0);
                    }
                }
                this.LJLILLLLZI.invoke(4, "can not scroll when come to border");
                LIZIZ();
                return;
            }
        }
        recyclerView.post(this);
    }

    public final void LIZIZ() {
        RecyclerView recyclerView = this.LJLIL.get();
        this.LJLJLLL = false;
        if (recyclerView != null) {
            recyclerView.LJJLJLI(this.LJLLI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79830VUs(C79688VPg c79688VPg) {
        this.LJLIL = new WeakReference<>(c79688VPg);
    }
}
