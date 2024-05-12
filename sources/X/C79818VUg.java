package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.VUg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79818VUg extends C0A6 {
    public final VNL LJLIL;
    public final RecyclerView LJLILLLLZI;
    public int LJLJI;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public final UIList LJLL;
    public int LJLLILLLL;
    public boolean LJLLL;
    public C0FT LJLLLL;
    public int LJLJJI = 200;
    public int LJLJJL = 50;
    public int LJLJJLL = 50;
    public boolean LJLLI = true;
    public int LJLLJ = 1;

    public final JavaOnlyArray LJIJ() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (DisplayMetricsHolder.LIZIZ() == null) {
            return javaOnlyArray;
        }
        ArrayList arrayList = new ArrayList();
        C0A2 layoutManager = this.LJLILLLLZI.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
            for (int LLILL = r1.LLILL(); LLILL <= LLILLJJLI; LLILL++) {
                arrayList.add(Integer.valueOf(LLILL));
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] LLIL = staggeredGridLayoutManager.LLIL(null);
            int[] LLILII = staggeredGridLayoutManager.LLILII(null);
            int i = LiveLayoutPreloadThreadPriority.DEFAULT;
            for (int i2 : LLIL) {
                arrayList.add(Integer.valueOf(i2));
                i = Math.max(i, i2);
            }
            int i3 = Integer.MAX_VALUE;
            for (int i4 : LLILII) {
                arrayList.add(Integer.valueOf(i4));
                i3 = Math.min(i3, i4);
            }
            while (true) {
                i++;
                if (i >= i3) {
                    break;
                }
                arrayList.add(Integer.valueOf(i));
            }
            Collections.sort(arrayList);
        }
        float f = DisplayMetricsHolder.LIZIZ().density;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            C79831VUt c79831VUt = (C79831VUt) this.LJLILLLLZI.LJJJ(intValue, false);
            if (c79831VUt != null && c79831VUt.LJLIL.LJLILLLLZI != null) {
                View view = c79831VUt.itemView;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("id", c79831VUt.LJLIL.LJLILLLLZI.getIdSelector());
                javaOnlyMap.put("position", Integer.valueOf(intValue));
                javaOnlyMap.put("top", Float.valueOf(view.getTop() / f));
                javaOnlyMap.put("bottom", Float.valueOf(view.getBottom() / f));
                javaOnlyMap.put("left", Float.valueOf(view.getLeft() / f));
                javaOnlyMap.put("right", Float.valueOf(view.getRight() / f));
                javaOnlyArray.add(javaOnlyMap);
            }
        }
        return javaOnlyArray;
    }

    public final void LJIJJLI(int i) {
        JavaOnlyArray javaOnlyArray;
        if ((this.LJLJI & 8) == 0) {
            return;
        }
        VUO vuo = new VUO(this.LJLL.getSign(), "scrollstatechange");
        if (this.LJLLL) {
            javaOnlyArray = LJIJ();
        } else {
            javaOnlyArray = null;
        }
        vuo.LIZJ(Integer.valueOf(i), "state");
        if (javaOnlyArray != null) {
            vuo.LIZLLL(javaOnlyArray);
        }
        this.LJLIL.LIZIZ(vuo);
    }

    public static boolean LJIILLIIL(F5B f5b, boolean z) {
        if (f5b == null) {
            return z;
        }
        ReadableType type = f5b.getType();
        if (type == ReadableType.String) {
            return Boolean.parseBoolean(f5b.asString());
        }
        if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
            if (f5b.asInt() != 0) {
                return true;
            }
            return false;
        }
        if (type != ReadableType.Boolean) {
            return z;
        }
        return f5b.asBoolean();
    }

    public static int LJIIZILJ(F5B f5b, int i) {
        ReadableType type = f5b.getType();
        if (type == ReadableType.String) {
            try {
                i = CastIntegerProtector.parseInt(f5b.asString());
                return i;
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
                return i;
            }
        }
        if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
            return f5b.asInt();
        }
        return i;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        this.LJLL.recognizeGesturere();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LJIJJLI(3);
                UIList uIList = this.LJLL;
                if (uIList.mEnableScrollMonitor) {
                    uIList.mContext.LJLLL.LJIIIIZZ(new C60877Nur(recyclerView, uIList.getTagName(), this.LJLL.mScrollMonitorTag));
                }
                this.LJLL.notifyScrollStateChanged(2);
                return;
            }
            if (this.LJLLLL == null) {
                UIList uIList2 = this.LJLL;
                this.LJLLLL = new C0FT(uIList2.mContext, uIList2.mScrollMonitorTag);
            }
            C0FS.LIZIZ(this.LJLLLL.LIZ);
            this.LJLLI = false;
            LJIJJLI(2);
            UIList uIList3 = this.LJLL;
            if (uIList3.mEnableScrollMonitor) {
                uIList3.mContext.LJLLL.LJJII(new C60877Nur(recyclerView, uIList3.getTagName(), this.LJLL.mScrollMonitorTag));
            }
            this.LJLL.notifyScrollStateChanged(1);
            return;
        }
        C0FT c0ft = this.LJLLLL;
        if (c0ft != null) {
            C0FS.LIZIZ(c0ft.LIZ);
        }
        LJIJJLI(1);
        UIList uIList4 = this.LJLL;
        if (uIList4.mEnableScrollMonitor) {
            uIList4.mContext.LJLLL.LJJIII(new C60877Nur(recyclerView, uIList4.getTagName(), this.LJLL.mScrollMonitorTag));
        }
        this.LJLL.notifyScrollStateChanged(0);
    }

    public final void LJIJI(int i, int i2) {
        if (!this.LJLLI && i2 == 0) {
            if (i > 0) {
                if (this.LJLL.LLII && (this.LJLJLJ != 0 || this.LJLJJLL != 0)) {
                    return;
                }
                LJIJJ(4, "scrolltolower", this.LJLLILLLL, 0, 0);
                this.LJLLI = true;
                return;
            }
            if (i < 0) {
                this.LJLLILLLL = 0;
                if (this.LJLL.LLII && (this.LJLJL != 0 || this.LJLJJL != 0)) {
                    return;
                }
                LJIJJ(2, "scrolltoupper", 0, 0, 0);
                this.LJLLI = true;
            }
        }
    }

    public C79818VUg(VNL vnl, C79688VPg c79688VPg, UIList uIList) {
        this.LJLIL = vnl;
        this.LJLILLLLZI = c79688VPg;
        c79688VPg.LJIIJJI(this);
        this.LJLL = uIList;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int paddingLeft;
        int i4;
        int paddingRight;
        int i5;
        int LJJJJJ;
        int LJJJJLI;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i == 0 && i2 == 0) {
            return;
        }
        if (this.LJLL.LLF) {
            i3 = i2;
        } else {
            i3 = i;
        }
        this.LJLLILLLL += i3;
        if (System.currentTimeMillis() - this.LJLJLLL > this.LJLJJI) {
            LJIJJ(1, "scroll", this.LJLLILLLL, i, i2);
            this.LJLJLLL = System.currentTimeMillis();
        }
        C0A2 layoutManager = this.LJLILLLLZI.getLayoutManager();
        int childCount = this.LJLILLLLZI.getChildCount();
        int LJJJJZ = layoutManager.LJJJJZ();
        boolean z6 = this.LJLL.LLF;
        if (z6) {
            paddingLeft = layoutManager.getPaddingTop();
            i4 = layoutManager.LJLLLLLL;
            paddingRight = layoutManager.getPaddingBottom();
        } else {
            paddingLeft = layoutManager.getPaddingLeft();
            i4 = layoutManager.LJLLLL;
            paddingRight = layoutManager.getPaddingRight();
        }
        int i6 = i4 - paddingRight;
        int i7 = this.LJLJL;
        if (i7 > 0 || this.LJLJLJ > 0) {
            int i8 = (LJJJJZ - this.LJLJLJ) - 1;
            int i9 = Integer.MAX_VALUE;
            int i10 = LiveLayoutPreloadThreadPriority.DEFAULT;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.LJLILLLLZI.getChildAt(i11);
                this.LJLILLLLZI.getClass();
                int LJJJJJ2 = RecyclerView.LJJJJJ(childAt);
                if (z6) {
                    LJJJJJ = layoutManager.LJJJJLL(childAt);
                } else {
                    LJJJJJ = layoutManager.LJJJJJ(childAt);
                }
                if (z6) {
                    LJJJJLI = layoutManager.LJJJJIZL(childAt);
                } else {
                    LJJJJLI = layoutManager.LJJJJLI(childAt);
                }
                if (LJJJJLI > paddingLeft) {
                    i9 = Math.min(LJJJJJ2, i9);
                }
                if (LJJJJJ < i6) {
                    i10 = Math.max(LJJJJJ2, i10);
                }
            }
            if (i9 < i7) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (i10 > i8) {
                i5 |= 8;
            }
        } else {
            i5 = 0;
        }
        boolean z7 = false;
        if (this.LJLILLLLZI.LJJJ(0, false) != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLILLLLZI.LJJJ(LJJJJZ - 1, false) != null) {
            z7 = true;
        }
        if (z || z7) {
            int i12 = Integer.MAX_VALUE;
            int i13 = LiveLayoutPreloadThreadPriority.DEFAULT;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt2 = this.LJLILLLLZI.getChildAt(i14);
                if (z6) {
                    i12 = Math.min(layoutManager.LJJJJLL(childAt2), i12);
                    i13 = Math.max(layoutManager.LJJJJIZL(childAt2), i13);
                } else {
                    i12 = Math.min(layoutManager.LJJJJJ(childAt2), i12);
                    i13 = Math.max(layoutManager.LJJJJLI(childAt2), i13);
                }
            }
            if (z) {
                if (i12 == paddingLeft) {
                    this.LJLLILLLL = 0;
                }
                if (i12 > paddingLeft - this.LJLJJL) {
                    i5 |= 1;
                    if (this.LJLJL > 0) {
                        i5 &= -5;
                    }
                }
            }
            if (z7 && i13 < i6 + this.LJLJJLL) {
                i5 |= 2;
                if (this.LJLJLJ > 0) {
                    i5 &= -9;
                }
            }
        }
        if ((i5 & 1) == 0 || (this.LJLLJ & 1) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i5 & 4) == 0 || (this.LJLLJ & 4) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i5 & 2) == 0 || (this.LJLLJ & 2) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i5 & 8) == 0 || (this.LJLLJ & 8) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i3 < 0) {
            if (z2 || z3) {
                LJIJJ(2, "scrolltoupper", this.LJLLILLLL, 0, 0);
            }
        } else if (i3 > 0 && (z4 || z5)) {
            LJIJJ(4, "scrolltolower", this.LJLLILLLL, 0, 0);
        }
        this.LJLLJ = i5;
    }

    public final void LJIJJ(int i, String str, int i2, int i3, int i4) {
        JavaOnlyArray javaOnlyArray;
        if ((i & this.LJLJI) != 0) {
            VUO vuo = new VUO(this.LJLL.getSign(), str);
            if (this.LJLLL) {
                javaOnlyArray = LJIJ();
            } else {
                javaOnlyArray = null;
            }
            vuo.LJ(i2, i3, i4, javaOnlyArray);
            this.LJLIL.LIZIZ(vuo);
        }
    }
}
