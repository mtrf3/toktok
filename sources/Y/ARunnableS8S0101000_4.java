package Y;

import X.AV3;
import X.AV9;
import X.AVB;
import X.AX9;
import X.AbstractC27419ApT;
import X.ActivityC45651qj;
import X.C26240ARo;
import X.C26334AVe;
import X.C27355AoR;
import X.C38855FMt;
import X.C3C5;
import X.C44172HVg;
import X.C54305LSz;
import X.C5S1;
import X.C76800UCe;
import X.C92J;
import X.C96K;
import X.C96L;
import X.HG3;
import X.ORZ;
import X.RBX;
import X.V2B;
import X.XJL;
import android.graphics.Rect;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarNicknameAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS8S0101000_4 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = ((C27355AoR) this.l0).LJII;
        if (popupWindow2 != null && popupWindow2.isShowing()) {
            Rect rect = new Rect();
            ((C27355AoR) this.l0).LIZIZ.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            ((C27355AoR) this.l0).LIZIZ.getGlobalVisibleRect(rect2);
            int LJI = (rect.bottom - rect2.bottom) - ((int) V2B.LJI(((C27355AoR) this.l0).LIZ, 40.0f));
            C27355AoR c27355AoR = (C27355AoR) this.l0;
            RecyclerView recyclerView = c27355AoR.LJI;
            if (recyclerView != null) {
                int i = this.i1;
                int height = c27355AoR.LJFF.findViewById(R.id.jh4).getHeight() + recyclerView.computeVerticalScrollRange();
                if (LJI > height) {
                    LJI = height;
                }
                PopupWindow popupWindow3 = c27355AoR.LJII;
                if ((popupWindow3 != null && LJI == popupWindow3.getHeight()) || LJI <= 0 || (popupWindow = c27355AoR.LJII) == null) {
                    return;
                }
                popupWindow.update(i, LJI);
            }
        }
    }

    public final void LIZ$1() {
        int size = ((RBX) HG3.LJIILL()).allUidList().size();
        int i = this.i1;
        if (size < i) {
            AVB avb = (AVB) this.l0;
            ActivityC45651qj activityC45651qj = avb.LJLJJI;
            AV9 av9 = avb.LJLJJL;
            C26334AVe.LIZ(activityC45651qj, av9.LIZ, av9.LIZIZ, avb.LJLJJLL, null);
            return;
        }
        String string = ((AVB) this.l0).LJLJI.getString(R.string.bf2, Integer.valueOf(i));
        o.LJIIIIZZ(string, "context.getString(R.stri…count_toast, maxAccounts)");
        C5S1 c5s1 = new C5S1(((AVB) this.l0).LJLJI);
        c5s1.LIZLLL(string);
        c5s1.LJ();
    }

    public static final void run$0(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            ((LinearLayoutManager) aRunnableS8S0101000_4.l0).LJFF(aRunnableS8S0101000_4.i1, 0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            ((LinearLayoutManager) aRunnableS8S0101000_4.l0).LJFF(aRunnableS8S0101000_4.i1, 0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            District district = (District) ORZ.LJLLLLLL(aRunnableS8S0101000_4.i1, ((DistrictPage) aRunnableS8S0101000_4.l0).xl().LJLILLLLZI);
            if (district != null) {
                XJL<? super C76800UCe> xjl = district.continuation;
                if (xjl != null) {
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(c76800UCe);
                    xjl.resumeWith(c76800UCe);
                }
                district.continuation = null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            AX9.LIZJ((C26240ARo) aRunnableS8S0101000_4.l0);
            AX9.LIZIZ.put(Integer.valueOf(aRunnableS8S0101000_4.i1), (C26240ARo) aRunnableS8S0101000_4.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            if (!C54305LSz.LIZJ()) {
                AV3 av3 = ((MineNavBarNicknameAssem) aRunnableS8S0101000_4.l0).LJLJJL;
                if (av3 != null) {
                    av3.LIZJ(true);
                }
            } else if (aRunnableS8S0101000_4.i1 > 0) {
                ProfileNavActionAssem.showAlertBadge$default((MineNavBarNicknameAssem) aRunnableS8S0101000_4.l0, true, 0, 2, null);
            } else {
                ProfileNavActionAssem.showAlertBadge$default((MineNavBarNicknameAssem) aRunnableS8S0101000_4.l0, false, 0, 2, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            C38855FMt c38855FMt = C92J.LIZ;
            int i = c38855FMt.LIZJ;
            if (i == 1) {
                c38855FMt.LIZIZ(aRunnableS8S0101000_4.i1, C96K.LIZ, (int[]) aRunnableS8S0101000_4.l0);
            } else if (i == 2) {
                c38855FMt.LIZIZ(aRunnableS8S0101000_4.i1, C96L.LIZ, (int[]) aRunnableS8S0101000_4.l0);
            } else if (i == 3) {
                c38855FMt.LIZIZ(aRunnableS8S0101000_4.i1, 0, (int[]) aRunnableS8S0101000_4.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0101000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            AbstractC27419ApT abstractC27419ApT = (AbstractC27419ApT) aRunnableS8S0101000_4.l0;
            if (abstractC27419ApT.LJLILLLLZI) {
                RecyclerView recyclerView = abstractC27419ApT.LJLJJL;
                if (recyclerView != null) {
                    recyclerView.LJLI(aRunnableS8S0101000_4.i1);
                }
            } else {
                RecyclerView recyclerView2 = abstractC27419ApT.LJLJJL;
                if (recyclerView2 != null) {
                    recyclerView2.LJLIL(aRunnableS8S0101000_4.i1);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0101000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS8S0101000_4 aRunnableS8S0101000_4) {
        boolean LIZ;
        try {
            C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
            c5s1.LIZLLL(((ActivityC45651qj) aRunnableS8S0101000_4.l0).getString(aRunnableS8S0101000_4.i1));
            c5s1.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S0101000_4(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
