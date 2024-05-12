package androidx.recyclerview.widget;

import X.AbstractC03050Ab;
import X.C028609i;
import X.C028709j;
import X.C028809k;
import X.C03110Ah;
import X.C0A0;
import X.C0A1;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C0B7;
import X.C1C0;
import X.C1C9;
import X.KMP;
import Y.IDCreatorS45S0000000;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends C0A2 implements C0B7, C0AA {
    public int LJLZ;
    public C028809k LJZ;
    public AbstractC03050Ab LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public final boolean LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public SavedState LLI;
    public final C028609i LLIFFJFJJ;
    public final C028709j LLII;
    public int LLIIII;
    public final int[] LLIIIILZ;

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // X.C0A2
    public final boolean LJJLIIIJ() {
        return true;
    }

    public void LLJILJIL(C0A7 c0a7, C0AC c0ac, C028609i c028609i, int i) {
    }

    @Override // X.C0A2
    public boolean LJIJJLI() {
        if (this.LJLZ == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public boolean LJIL() {
        if (this.LJLZ == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // X.C0A2
    public final Parcelable LJLJLJ() {
        if (this.LLI != null) {
            return new SavedState(this.LLI);
        }
        SavedState savedState = new SavedState();
        if (LJJJI() > 0) {
            LLIILZL();
            boolean z = this.LJZL ^ this.LLD;
            savedState.LJLJI = z;
            if (z) {
                View LLIZLLLIL = LLIZLLLIL();
                savedState.LJLILLLLZI = this.LJZI.LJI() - this.LJZI.LIZIZ(LLIZLLLIL);
                savedState.LJLIL = C0A2.LJJJLL(LLIZLLLIL);
            } else {
                View LLJ = LLJ();
                savedState.LJLIL = C0A2.LJJJLL(LLJ);
                savedState.LJLILLLLZI = this.LJZI.LJ(LLJ) - this.LJZI.LJIIJ();
            }
        } else {
            savedState.LJLIL = -1;
        }
        return savedState;
    }

    @Override // X.C0A2
    public final boolean LLIFFJFJJ() {
        if (this.LJLLL == 1073741824 || this.LJLLJ == 1073741824) {
            return false;
        }
        int LJJJI = LJJJI();
        for (int i = 0; i < LJJJI; i++) {
            ViewGroup.LayoutParams layoutParams = LJJJ(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0A2
    public boolean LLIIIJ() {
        if (this.LLI == null && this.LJZL == this.LLF) {
            return true;
        }
        return false;
    }

    public final void LLIILZL() {
        if (this.LJZ == null) {
            this.LJZ = new C028809k();
        }
    }

    public final View LLIZLLLIL() {
        int LJJJI;
        if (this.LLD) {
            LJJJI = 0;
        } else {
            LJJJI = LJJJI() - 1;
        }
        return LJJJ(LJJJI);
    }

    public final View LLJ() {
        int i;
        if (this.LLD) {
            i = LJJJI() - 1;
        } else {
            i = 0;
        }
        return LJJJ(i);
    }

    public final void LLJJ() {
        if (this.LJLZ == 1 || !LLJI()) {
            this.LLD = this.LL;
        } else {
            this.LLD = !this.LL;
        }
    }

    public final int LLIL() {
        View LLILZ = LLILZ(0, LJJJI(), true, false);
        if (LLILZ == null) {
            return -1;
        }
        return C0A2.LJJJLL(LLILZ);
    }

    public int LLILL() {
        View LLILZ = LLILZ(0, LJJJI(), false, true);
        if (LLILZ == null) {
            return -1;
        }
        return C0A2.LJJJLL(LLILZ);
    }

    public final int LLILLIZIL() {
        View LLILZ = LLILZ(LJJJI() - 1, -1, true, false);
        if (LLILZ == null) {
            return -1;
        }
        return C0A2.LJJJLL(LLILZ);
    }

    public final int LLILLJJLI() {
        View LLILZ = LLILZ(LJJJI() - 1, -1, false, true);
        if (LLILZ == null) {
            return -1;
        }
        return C0A2.LJJJLL(LLILZ);
    }

    public final boolean LLJI() {
        if (LJJJJZI() == 1) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS45S0000000(30);
        public int LJLIL;
        public int LJLILLLLZI;
        public boolean LJLJI;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readInt();
            this.LJLJI = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.LJLIL = savedState.LJLIL;
            this.LJLILLLLZI = savedState.LJLILLLLZI;
            this.LJLJI = savedState.LJLJI;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LJLIL);
            parcel.writeInt(this.LJLILLLLZI);
            parcel.writeInt(this.LJLJI ? 1 : 0);
        }
    }

    @Override // X.C0AA
    public PointF LJII(int i) {
        if (LJJJI() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < C0A2.LJJJLL(LJJJ(0))) {
            z = true;
        }
        if (z != this.LLD) {
            i2 = -1;
        }
        if (this.LJLZ == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // X.C0A2
    public void LJIJI(String str) {
        if (this.LLI == null) {
            super.LJIJI(str);
        }
    }

    @Override // X.C0A2
    public final int LJJIIJ(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public int LJJIIJZLJL(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // X.C0A2
    public int LJJIIZ(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIZI(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public int LJJIJ(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // X.C0A2
    public int LJJIJIIJI(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // X.C0A2
    public final View LJJIJIL(int i) {
        int LJJJI = LJJJI();
        if (LJJJI == 0) {
            return null;
        }
        int LJJJLL = i - C0A2.LJJJLL(LJJJ(0));
        if (LJJJLL >= 0 && LJJJLL < LJJJI) {
            View LJJJ = LJJJ(LJJJLL);
            if (C0A2.LJJJLL(LJJJ) == i) {
                return LJJJ;
            }
        }
        return super.LJJIJIL(i);
    }

    @Override // X.C0A2
    public final void LJJLL(AccessibilityEvent accessibilityEvent) {
        super.LJJLL(accessibilityEvent);
        if (LJJJI() > 0) {
            accessibilityEvent.setFromIndex(LLILL());
            accessibilityEvent.setToIndex(LLILLJJLI());
        }
    }

    @Override // X.C0A2
    public void LJLJJL(C0AC c0ac) {
        this.LLI = null;
        this.LLFFF = -1;
        this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIFFJFJJ.LIZLLL();
    }

    @Override // X.C0A2
    public final void LJLJL(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.LLI = savedState;
            if (this.LLFFF != -1) {
                savedState.LJLIL = -1;
            }
            LJZ();
        }
    }

    @Override // X.C0A2
    public void LJZL(int i) {
        this.LLFFF = i;
        this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
        SavedState savedState = this.LLI;
        if (savedState != null) {
            savedState.LJLIL = -1;
        }
        LJZ();
    }

    public final int LLIIJI(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        LLIILZL();
        return C03110Ah.LIZ(c0ac, this.LJZI, LLILIL(!this.LLFF), LLILII(!this.LLFF), this, this.LLFF);
    }

    public final int LLIIJLIL(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        LLIILZL();
        return C03110Ah.LIZIZ(c0ac, this.LJZI, LLILIL(!this.LLFF), LLILII(!this.LLFF), this, this.LLFF, this.LLD);
    }

    public final int LLIIL(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        LLIILZL();
        return C03110Ah.LIZJ(c0ac, this.LJZI, LLILIL(!this.LLFF), LLILII(!this.LLFF), this, this.LLFF);
    }

    public final int LLIILII(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return LiveLayoutPreloadThreadPriority.DEFAULT;
                            }
                            if (this.LJLZ == 1) {
                                return 1;
                            }
                            return LiveLayoutPreloadThreadPriority.DEFAULT;
                        }
                        if (this.LJLZ == 0) {
                            return 1;
                        }
                        return LiveLayoutPreloadThreadPriority.DEFAULT;
                    }
                    if (this.LJLZ == 1) {
                        return -1;
                    }
                    return LiveLayoutPreloadThreadPriority.DEFAULT;
                }
                if (this.LJLZ == 0) {
                    return -1;
                }
                return LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            if (this.LJLZ != 1 && LLJI()) {
                return -1;
            }
            return 1;
        }
        if (this.LJLZ == 1 || !LLJI()) {
            return -1;
        }
        return 1;
    }

    public final View LLILII(boolean z) {
        if (this.LLD) {
            return LLILZ(0, LJJJI(), z, true);
        }
        return LLILZ(LJJJI() - 1, -1, z, true);
    }

    public final View LLILIL(boolean z) {
        if (this.LLD) {
            return LLILZ(LJJJI() - 1, -1, z, true);
        }
        return LLILZ(0, LJJJI(), z, true);
    }

    public final void LLJJIII(int i) {
        if (i == 0 || i == 1) {
            LJIJI(null);
            if (i != this.LJLZ || this.LJZI == null) {
                AbstractC03050Ab LIZ = AbstractC03050Ab.LIZ(this, i);
                this.LJZI = LIZ;
                this.LLIFFJFJJ.LIZ = LIZ;
                this.LJLZ = i;
                LJZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(KMP.LJ("invalid orientation:", i));
    }

    public final void LLJJIJI(boolean z) {
        LJIJI(null);
        if (z == this.LL) {
            return;
        }
        this.LL = z;
        LJZ();
    }

    public void LLJJIJIIJIL(boolean z) {
        LJIJI(null);
        if (this.LLF == z) {
            return;
        }
        this.LLF = z;
        LJZ();
    }

    public LinearLayoutManager(int i, boolean z) {
        this.LJLZ = 1;
        this.LLFF = true;
        this.LLFFF = -1;
        this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIFFJFJJ = new C028609i();
        this.LLII = new C028709j();
        this.LLIIII = 2;
        this.LLIIIILZ = new int[2];
        LLJJIII(i);
        LLJJIJI(z);
    }

    @Override // X.C0B7
    public final void LIZJ(View view, View view2) {
        char c;
        LJIJI("Cannot drop a view during a scroll or layout calculation");
        LLIILZL();
        LLJJ();
        int LJJJLL = C0A2.LJJJLL(view);
        int LJJJLL2 = C0A2.LJJJLL(view2);
        if (LJJJLL < LJJJLL2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.LLD) {
            if (c == 1) {
                LJFF(LJJJLL2, this.LJZI.LJI() - (this.LJZI.LIZJ(view) + this.LJZI.LJ(view2)));
                return;
            }
            LJFF(LJJJLL2, this.LJZI.LJI() - this.LJZI.LIZIZ(view2));
            return;
        }
        if (c == 65535) {
            LJFF(LJJJLL2, this.LJZI.LJ(view2));
        } else {
            LJFF(LJJJLL2, this.LJZI.LIZIZ(view2) - this.LJZI.LIZJ(view));
        }
    }

    public void LJFF(int i, int i2) {
        this.LLFFF = i;
        this.LLFII = i2;
        SavedState savedState = this.LLI;
        if (savedState != null) {
            savedState.LJLIL = -1;
        }
        LJZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(int r6, X.C0A0 r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.LLI
            r4 = 1
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L23
            int r2 = r0.LJLIL
            if (r2 < 0) goto L23
            boolean r0 = r0.LJLJI
        Ld:
            if (r0 == 0) goto L10
        Lf:
            r4 = -1
        L10:
            r1 = 0
        L11:
            int r0 = r5.LLIIII
            if (r1 >= r0) goto L33
            if (r2 < 0) goto L33
            if (r2 >= r6) goto L33
            r0 = r7
            X.1C0 r0 = (X.C1C0) r0
            r0.LIZ(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L11
        L23:
            r5.LLJJ()
            boolean r0 = r5.LLD
            int r2 = r5.LLFFF
            if (r2 != r1) goto Ld
            if (r0 == 0) goto L31
            int r2 = r6 + (-1)
            goto Lf
        L31:
            r2 = 0
            goto L10
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.LJJIII(int, X.0A0):void");
    }

    @Override // X.C0A2
    public void LJJLJ(RecyclerView recyclerView, C0A7 c0a7) {
        if (this.LLFZ) {
            LJLLILLLL(c0a7);
            c0a7.LIZJ();
        }
    }

    @Override // X.C0A2
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        View focusedChild;
        View focusedChild2;
        View LLILZIL;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int LJ;
        int i2;
        int i3;
        boolean z5;
        int i4;
        int i5;
        List<RecyclerView.ViewHolder> list;
        boolean z6;
        int i6;
        int i7;
        int LLILZLL;
        int i8;
        View LJJIJIL;
        int LJ2;
        int i9;
        int i10;
        if ((this.LLI != null || this.LLFFF != -1) && c0ac.LIZIZ() == 0) {
            LJLLILLLL(c0a7);
            return;
        }
        SavedState savedState = this.LLI;
        if (savedState != null && (i10 = savedState.LJLIL) >= 0) {
            this.LLFFF = i10;
        }
        LLIILZL();
        this.LJZ.LIZ = false;
        LLJJ();
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.LJLIL.LJIIJ(focusedChild)) {
            focusedChild = null;
        }
        C028609i c028609i = this.LLIFFJFJJ;
        if (!c028609i.LJ || this.LLFFF != -1 || this.LLI != null) {
            c028609i.LIZLLL();
            C028609i c028609i2 = this.LLIFFJFJJ;
            c028609i2.LIZLLL = this.LLD ^ this.LLF;
            if (!c0ac.LJI && (i = this.LLFFF) != -1) {
                if (i < 0 || i >= c0ac.LIZIZ()) {
                    this.LLFFF = -1;
                    this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
                } else {
                    int i11 = this.LLFFF;
                    c028609i2.LIZIZ = i11;
                    SavedState savedState2 = this.LLI;
                    if (savedState2 != null && savedState2.LJLIL >= 0) {
                        boolean z7 = savedState2.LJLJI;
                        c028609i2.LIZLLL = z7;
                        if (z7) {
                            c028609i2.LIZJ = this.LJZI.LJI() - this.LLI.LJLILLLLZI;
                        } else {
                            c028609i2.LIZJ = this.LJZI.LJIIJ() + this.LLI.LJLILLLLZI;
                        }
                    } else if (this.LLFII == Integer.MIN_VALUE) {
                        View LJJIJIL2 = LJJIJIL(i11);
                        if (LJJIJIL2 != null) {
                            if (this.LJZI.LIZJ(LJJIJIL2) > this.LJZI.LJIIJJI()) {
                                c028609i2.LIZ();
                            } else if (this.LJZI.LJ(LJJIJIL2) - this.LJZI.LJIIJ() < 0) {
                                c028609i2.LIZJ = this.LJZI.LJIIJ();
                                c028609i2.LIZLLL = false;
                            } else if (this.LJZI.LJI() - this.LJZI.LIZIZ(LJJIJIL2) < 0) {
                                c028609i2.LIZJ = this.LJZI.LJI();
                                c028609i2.LIZLLL = true;
                            } else {
                                if (c028609i2.LIZLLL) {
                                    LJ = this.LJZI.LJIIL() + this.LJZI.LIZIZ(LJJIJIL2);
                                } else {
                                    LJ = this.LJZI.LJ(LJJIJIL2);
                                }
                                c028609i2.LIZJ = LJ;
                            }
                        } else {
                            if (LJJJI() > 0) {
                                if (this.LLFFF < C0A2.LJJJLL(LJJJ(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 == this.LLD) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c028609i2.LIZLLL = z4;
                            }
                            c028609i2.LIZ();
                        }
                    } else {
                        boolean z8 = this.LLD;
                        c028609i2.LIZLLL = z8;
                        if (z8) {
                            c028609i2.LIZJ = this.LJZI.LJI() - this.LLFII;
                        } else {
                            c028609i2.LIZJ = this.LJZI.LJIIJ() + this.LLFII;
                        }
                    }
                    this.LLIFFJFJJ.LJ = true;
                }
            }
            if (LJJJI() != 0) {
                RecyclerView recyclerView2 = this.LJLILLLLZI;
                if (recyclerView2 != null && (focusedChild2 = recyclerView2.getFocusedChild()) != null && !this.LJLIL.LJIIJ(focusedChild2)) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                    if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < c0ac.LIZIZ()) {
                        c028609i2.LIZJ(C0A2.LJJJLL(focusedChild2), focusedChild2);
                        this.LLIFFJFJJ.LJ = true;
                    }
                }
                boolean z9 = this.LJZL;
                boolean z10 = this.LLF;
                if (z9 == z10 && (LLILZIL = LLILZIL(c0a7, c0ac, c028609i2.LIZLLL, z10)) != null) {
                    c028609i2.LIZIZ(C0A2.LJJJLL(LLILZIL), LLILZIL);
                    if (!c0ac.LJI && LLIIIJ()) {
                        int LJ3 = this.LJZI.LJ(LLILZIL);
                        int LIZIZ = this.LJZI.LIZIZ(LLILZIL);
                        int LJIIJ = this.LJZI.LJIIJ();
                        int LJI = this.LJZI.LJI();
                        if (LIZIZ <= LJIIJ && LJ3 < LJIIJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LJ3 >= LJI && LIZIZ > LJI) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z || z2) {
                            if (c028609i2.LIZLLL) {
                                LJIIJ = LJI;
                            }
                            c028609i2.LIZJ = LJIIJ;
                        }
                    }
                    this.LLIFFJFJJ.LJ = true;
                }
            }
            c028609i2.LIZ();
            c028609i2.LIZIZ = this.LLF ? c0ac.LIZIZ() - 1 : 0;
            this.LLIFFJFJJ.LJ = true;
        } else if (focusedChild != null && (this.LJZI.LJ(focusedChild) >= this.LJZI.LJI() || this.LJZI.LIZIZ(focusedChild) <= this.LJZI.LJIIJ())) {
            this.LLIFFJFJJ.LIZJ(C0A2.LJJJLL(focusedChild), focusedChild);
        }
        C028809k c028809k = this.LJZ;
        if (c028809k.LJIIIZ >= 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        c028809k.LJFF = i2;
        int[] iArr = this.LLIIIILZ;
        iArr[0] = 0;
        iArr[1] = 0;
        LLIIIL(c0ac, iArr);
        int LJIIJ2 = this.LJZI.LJIIJ() + Math.max(0, this.LLIIIILZ[0]);
        int LJII = this.LJZI.LJII() + Math.max(0, this.LLIIIILZ[1]);
        if (c0ac.LJI && (i8 = this.LLFFF) != -1 && this.LLFII != Integer.MIN_VALUE && (LJJIJIL = LJJIJIL(i8)) != null) {
            if (this.LLD) {
                i9 = this.LJZI.LJI() - this.LJZI.LIZIZ(LJJIJIL);
                LJ2 = this.LLFII;
            } else {
                LJ2 = this.LJZI.LJ(LJJIJIL) - this.LJZI.LJIIJ();
                i9 = this.LLFII;
            }
            int i12 = i9 - LJ2;
            if (i12 > 0) {
                LJIIJ2 += i12;
            } else {
                LJII -= i12;
            }
        }
        C028609i c028609i3 = this.LLIFFJFJJ;
        if (!c028609i3.LIZLLL ? !this.LLD : this.LLD) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        LLJILJIL(c0a7, c0ac, c028609i3, i3);
        LJJIJIIJIL(c0a7);
        C028809k c028809k2 = this.LJZ;
        if (this.LJZI.LJIIIIZZ() == 0 && this.LJZI.LJFF() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        c028809k2.LJIIJJI = z5;
        this.LJZ.getClass();
        this.LJZ.LJIIIIZZ = 0;
        C028609i c028609i4 = this.LLIFFJFJJ;
        if (c028609i4.LIZLLL) {
            LLJJJIL(c028609i4.LIZIZ, c028609i4.LIZJ);
            C028809k c028809k3 = this.LJZ;
            c028809k3.LJII = LJIIJ2;
            LLIIZ(c0a7, c028809k3, c0ac, false);
            C028809k c028809k4 = this.LJZ;
            i5 = c028809k4.LIZIZ;
            int i13 = c028809k4.LIZLLL;
            int i14 = c028809k4.LIZJ;
            if (i14 > 0) {
                LJII += i14;
            }
            C028609i c028609i5 = this.LLIFFJFJJ;
            LLJJJ(c028609i5.LIZIZ, c028609i5.LIZJ);
            C028809k c028809k5 = this.LJZ;
            c028809k5.LJII = LJII;
            c028809k5.LIZLLL += c028809k5.LJ;
            LLIIZ(c0a7, c028809k5, c0ac, false);
            C028809k c028809k6 = this.LJZ;
            i4 = c028809k6.LIZIZ;
            int i15 = c028809k6.LIZJ;
            if (i15 > 0) {
                LLJJJIL(i13, i5);
                C028809k c028809k7 = this.LJZ;
                c028809k7.LJII = i15;
                LLIIZ(c0a7, c028809k7, c0ac, false);
                i5 = this.LJZ.LIZIZ;
            }
        } else {
            LLJJJ(c028609i4.LIZIZ, c028609i4.LIZJ);
            C028809k c028809k8 = this.LJZ;
            c028809k8.LJII = LJII;
            LLIIZ(c0a7, c028809k8, c0ac, false);
            C028809k c028809k9 = this.LJZ;
            i4 = c028809k9.LIZIZ;
            int i16 = c028809k9.LIZLLL;
            int i17 = c028809k9.LIZJ;
            if (i17 > 0) {
                LJIIJ2 += i17;
            }
            C028609i c028609i6 = this.LLIFFJFJJ;
            LLJJJIL(c028609i6.LIZIZ, c028609i6.LIZJ);
            C028809k c028809k10 = this.LJZ;
            c028809k10.LJII = LJIIJ2;
            c028809k10.LIZLLL += c028809k10.LJ;
            LLIIZ(c0a7, c028809k10, c0ac, false);
            C028809k c028809k11 = this.LJZ;
            i5 = c028809k11.LIZIZ;
            int i18 = c028809k11.LIZJ;
            if (i18 > 0) {
                LLJJJ(i16, i4);
                C028809k c028809k12 = this.LJZ;
                c028809k12.LJII = i18;
                LLIIZ(c0a7, c028809k12, c0ac, false);
                i4 = this.LJZ.LIZIZ;
            }
        }
        if (LJJJI() > 0) {
            if (this.LLD ^ this.LLF) {
                int LLILZLL2 = LLILZLL(i4, c0a7, c0ac, true);
                i6 = i5 + LLILZLL2;
                i7 = i4 + LLILZLL2;
                LLILZLL = LLIZ(i6, c0a7, c0ac, false);
            } else {
                int LLIZ = LLIZ(i5, c0a7, c0ac, true);
                i6 = i5 + LLIZ;
                i7 = i4 + LLIZ;
                LLILZLL = LLILZLL(i7, c0a7, c0ac, false);
            }
            i5 = i6 + LLILZLL;
            i4 = i7 + LLILZLL;
        }
        if (c0ac.LJIIJ && LJJJI() != 0 && !c0ac.LJI && LLIIIJ()) {
            List<RecyclerView.ViewHolder> list2 = c0a7.LIZLLL;
            int size = list2.size();
            int LJJJLL = C0A2.LJJJLL(LJJJ(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(list2, i21);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < LJJJLL) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6 != this.LLD) {
                        i19 += this.LJZI.LIZJ(viewHolder.itemView);
                    } else {
                        i20 += this.LJZI.LIZJ(viewHolder.itemView);
                    }
                }
            }
            this.LJZ.LJIIJ = list2;
            if (i19 > 0) {
                LLJJJIL(C0A2.LJJJLL(LLJ()), i5);
                C028809k c028809k13 = this.LJZ;
                c028809k13.LJII = i19;
                c028809k13.LIZJ = 0;
                c028809k13.LIZ(null);
                LLIIZ(c0a7, this.LJZ, c0ac, false);
            }
            if (i20 > 0) {
                LLJJJ(C0A2.LJJJLL(LLIZLLLIL()), i4);
                C028809k c028809k14 = this.LJZ;
                c028809k14.LJII = i20;
                c028809k14.LIZJ = 0;
                list = null;
                c028809k14.LIZ(null);
                LLIIZ(c0a7, this.LJZ, c0ac, false);
            } else {
                list = null;
            }
            this.LJZ.LJIIJ = list;
        }
        if (!c0ac.LJI) {
            AbstractC03050Ab abstractC03050Ab = this.LJZI;
            abstractC03050Ab.LIZIZ = abstractC03050Ab.LJIIJJI();
        } else {
            this.LLIFFJFJJ.LIZLLL();
        }
        this.LJZL = this.LLF;
    }

    public void LLIIIL(C0AC c0ac, int[] iArr) {
        int i;
        int i2;
        if (c0ac.LIZ != -1) {
            i = this.LJZI.LJIIJJI();
        } else {
            i = 0;
        }
        if (this.LJZ.LJFF == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final View LLILLL(int i, int i2) {
        int i3;
        int i4;
        LLIILZL();
        if (i2 > i || i2 < i) {
            if (this.LJZI.LJ(LJJJ(i)) < this.LJZI.LJIIJ()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.LJLZ == 0) {
                return this.LJLJI.LIZ(i, i2, i3, i4);
            }
            return this.LJLJJI.LIZ(i, i2, i3, i4);
        }
        return LJJJ(i);
    }

    public final void LLJILJILJ(C0A7 c0a7, C028809k c028809k) {
        if (!c028809k.LIZ || c028809k.LJIIJJI) {
            return;
        }
        int i = c028809k.LJI;
        int i2 = c028809k.LJIIIIZZ;
        if (c028809k.LJFF == -1) {
            int LJJJI = LJJJI();
            if (i < 0) {
                return;
            }
            int LJFF = (this.LJZI.LJFF() - i) + i2;
            if (this.LLD) {
                for (int i3 = 0; i3 < LJJJI; i3++) {
                    View LJJJ = LJJJ(i3);
                    if (this.LJZI.LJ(LJJJ) < LJFF || this.LJZI.LJIILJJIL(LJJJ) < LJFF) {
                        LLJILLL(c0a7, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = LJJJI - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View LJJJ2 = LJJJ(i5);
                if (this.LJZI.LJ(LJJJ2) < LJFF || this.LJZI.LJIILJJIL(LJJJ2) < LJFF) {
                    LLJILLL(c0a7, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int LJJJI2 = LJJJI();
        if (this.LLD) {
            int i7 = LJJJI2 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View LJJJ3 = LJJJ(i8);
                if (this.LJZI.LIZIZ(LJJJ3) > i6 || this.LJZI.LJIILIIL(LJJJ3) > i6) {
                    LLJILLL(c0a7, i7, i8);
                    return;
                }
            }
            return;
        }
        for (int i9 = 0; i9 < LJJJI2; i9++) {
            View LJJJ4 = LJJJ(i9);
            if (this.LJZI.LIZIZ(LJJJ4) > i6 || this.LJZI.LJIILIIL(LJJJ4) > i6) {
                LLJILLL(c0a7, 0, i9);
                return;
            }
        }
    }

    public final void LLJJJ(int i, int i2) {
        int i3;
        this.LJZ.LIZJ = this.LJZI.LJI() - i2;
        C028809k c028809k = this.LJZ;
        if (this.LLD) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c028809k.LJ = i3;
        c028809k.LIZLLL = i;
        c028809k.LJFF = 1;
        c028809k.LIZIZ = i2;
        c028809k.LJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    public final void LLJJJIL(int i, int i2) {
        int i3;
        this.LJZ.LIZJ = i2 - this.LJZI.LJIIJ();
        C028809k c028809k = this.LJZ;
        c028809k.LIZLLL = i;
        if (this.LLD) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c028809k.LJ = i3;
        c028809k.LJFF = -1;
        c028809k.LIZIZ = i2;
        c028809k.LJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    @Override // X.C0A2
    public int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        if (this.LJLZ == 1) {
            return 0;
        }
        return LLJJI(i, c0a7, c0ac);
    }

    @Override // X.C0A2
    public int LL(int i, C0A7 c0a7, C0AC c0ac) {
        if (this.LJLZ == 0) {
            return 0;
        }
        return LLJJI(i, c0a7, c0ac);
    }

    @Override // X.C0A2
    public void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C1C9 c1c9 = new C1C9(recyclerView.getContext());
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }

    public void LLIIIZ(C0AC c0ac, C028809k c028809k, C0A0 c0a0) {
        int i = c028809k.LIZLLL;
        if (i >= 0 && i < c0ac.LIZIZ()) {
            ((C1C0) c0a0).LIZ(i, Math.max(0, c028809k.LJI));
        }
    }

    public final void LLJILLL(C0A7 c0a7, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                LJLLLL(i, c0a7);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 >= i) {
                    LJLLLL(i2, c0a7);
                } else {
                    return;
                }
            }
        }
    }

    public final int LLJJI(int i, C0A7 c0a7, C0AC c0ac) {
        int i2;
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        LLIILZL();
        this.LJZ.LIZ = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        LLJJIJIL(i2, abs, true, c0ac);
        C028809k c028809k = this.LJZ;
        int LLIIZ = LLIIZ(c0a7, c028809k, c0ac, false) + c028809k.LJI;
        if (LLIIZ < 0) {
            return 0;
        }
        if (abs > LLIIZ) {
            i = i2 * LLIIZ;
        }
        this.LJZI.LJIILL(-i);
        this.LJZ.LJIIIZ = i;
        return i;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LJLZ = 1;
        this.LLFF = true;
        this.LLFFF = -1;
        this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIFFJFJJ = new C028609i();
        this.LLII = new C028709j();
        this.LLIIII = 2;
        this.LLIIIILZ = new int[2];
        C0A1 LJJJLZIJ = C0A2.LJJJLZIJ(context, attributeSet, i, i2);
        LLJJIII(LJJJLZIJ.LIZ);
        LLJJIJI(LJJJLZIJ.LIZJ);
        LLJJIJIIJIL(LJJJLZIJ.LIZLLL);
    }

    @Override // X.C0A2
    public final void LJJII(int i, int i2, C0AC c0ac, C0A0 c0a0) {
        int i3;
        if (this.LJLZ != 0) {
            i = i2;
        }
        if (LJJJI() == 0 || i == 0) {
            return;
        }
        LLIILZL();
        if (i > 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        LLJJIJIL(i3, Math.abs(i), true, c0ac);
        LLIIIZ(c0ac, this.LJZ, c0a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View LJJLJLI(android.view.View r7, int r8, X.C0A7 r9, X.C0AC r10) {
        /*
            r6 = this;
            r6.LLJJ()
            int r0 = r6.LJJJI()
            r5 = 0
            if (r0 != 0) goto Lb
            return r5
        Lb:
            int r3 = r6.LLIILII(r8)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L14
            return r5
        L14:
            r6.LLIILZL()
            X.0Ab r0 = r6.LJZI
            int r0 = r0.LJIIJJI()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2 = 0
            r6.LLJJIJIL(r3, r0, r2, r10)
            X.09k r1 = r6.LJZ
            r1.LJI = r4
            r1.LIZ = r2
            r0 = 1
            r6.LLIIZ(r9, r1, r10, r0)
            r1 = -1
            if (r3 != r1) goto L58
            boolean r0 = r6.LLD
            if (r0 == 0) goto L4f
            int r0 = r6.LJJJI()
            int r0 = r0 + (-1)
            android.view.View r2 = r6.LLILLL(r0, r1)
        L42:
            android.view.View r1 = r6.LLJ()
        L46:
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L78
            if (r2 != 0) goto L77
            return r5
        L4f:
            int r0 = r6.LJJJI()
            android.view.View r2 = r6.LLILLL(r2, r0)
            goto L42
        L58:
            boolean r0 = r6.LLD
            if (r0 == 0) goto L67
            int r0 = r6.LJJJI()
            android.view.View r2 = r6.LLILLL(r2, r0)
        L64:
            if (r3 != r1) goto L72
            goto L42
        L67:
            int r0 = r6.LJJJI()
            int r0 = r0 + (-1)
            android.view.View r2 = r6.LLILLL(r0, r1)
            goto L64
        L72:
            android.view.View r1 = r6.LLIZLLLIL()
            goto L46
        L77:
            return r1
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.LJJLJLI(android.view.View, int, X.0A7, X.0AC):android.view.View");
    }

    public final int LLIIZ(C0A7 c0a7, C028809k c028809k, C0AC c0ac, boolean z) {
        int i;
        int i2 = c028809k.LIZJ;
        int i3 = c028809k.LJI;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c028809k.LJI = i3 + i2;
            }
            LLJILJILJ(c0a7, c028809k);
        }
        int i4 = c028809k.LIZJ + c028809k.LJII;
        C028709j c028709j = this.LLII;
        while (true) {
            if ((!c028809k.LJIIJJI && i4 <= 0) || (i = c028809k.LIZLLL) < 0 || i >= c0ac.LIZIZ()) {
                break;
            }
            c028709j.LIZ = 0;
            c028709j.LIZIZ = false;
            c028709j.LIZJ = false;
            c028709j.LIZLLL = false;
            LLJIJIL(c0a7, c0ac, c028809k, c028709j);
            if (!c028709j.LIZIZ) {
                int i5 = c028809k.LIZIZ;
                int i6 = c028709j.LIZ;
                c028809k.LIZIZ = (c028809k.LJFF * i6) + i5;
                if (!c028709j.LIZJ || c028809k.LJIIJ != null || !c0ac.LJI) {
                    c028809k.LIZJ -= i6;
                    i4 -= i6;
                }
                int i7 = c028809k.LJI;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c028809k.LJI = i8;
                    int i9 = c028809k.LIZJ;
                    if (i9 < 0) {
                        c028809k.LJI = i8 + i9;
                    }
                    LLJILJILJ(c0a7, c028809k);
                }
                if (z && c028709j.LIZLLL) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c028809k.LIZJ;
    }

    public final View LLILZ(int i, int i2, boolean z, boolean z2) {
        int i3;
        LLIILZL();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.LJLZ == 0) {
            return this.LJLJI.LIZ(i, i2, i3, i4);
        }
        return this.LJLJJI.LIZ(i, i2, i3, i4);
    }

    public View LLILZIL(C0A7 c0a7, C0AC c0ac, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        boolean z4;
        LLIILZL();
        int LJJJI = LJJJI();
        if (z2) {
            i = LJJJI() - 1;
            LJJJI = -1;
            i2 = -1;
        } else {
            i = 0;
            i2 = 1;
        }
        int LIZIZ = c0ac.LIZIZ();
        int LJIIJ = this.LJZI.LJIIJ();
        int LJI = this.LJZI.LJI();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != LJJJI) {
            View LJJJ = LJJJ(i);
            int LJJJLL = C0A2.LJJJLL(LJJJ);
            int LJ = this.LJZI.LJ(LJJJ);
            int LIZIZ2 = this.LJZI.LIZIZ(LJJJ);
            if (LJJJLL >= 0 && LJJJLL < LIZIZ) {
                if (((RecyclerView.LayoutParams) LJJJ.getLayoutParams()).isItemRemoved()) {
                    if (view3 == null) {
                        view3 = LJJJ;
                    }
                } else {
                    if (LIZIZ2 <= LJIIJ && LJ < LJIIJ) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (LJ >= LJI && LIZIZ2 > LJI) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 || z4) {
                        if (z) {
                            if (!z4) {
                                if (view != null) {
                                }
                                view = LJJJ;
                            }
                            view2 = LJJJ;
                        } else {
                            if (!z3) {
                                if (view != null) {
                                }
                                view = LJJJ;
                            }
                            view2 = LJJJ;
                        }
                    } else {
                        return LJJJ;
                    }
                }
            }
            i += i2;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int LLILZLL(int i, C0A7 c0a7, C0AC c0ac, boolean z) {
        int LJI;
        int LJI2 = this.LJZI.LJI() - i;
        if (LJI2 > 0) {
            int i2 = -LLJJI(-LJI2, c0a7, c0ac);
            int i3 = i + i2;
            if (z && (LJI = this.LJZI.LJI() - i3) > 0) {
                this.LJZI.LJIILL(LJI);
                return LJI + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int LLIZ(int i, C0A7 c0a7, C0AC c0ac, boolean z) {
        int LJIIJ;
        int LJIIJ2 = i - this.LJZI.LJIIJ();
        if (LJIIJ2 > 0) {
            int i2 = -LLJJI(LJIIJ2, c0a7, c0ac);
            int i3 = i + i2;
            if (z && (LJIIJ = i3 - this.LJZI.LJIIJ()) > 0) {
                this.LJZI.LJIILL(-LJIIJ);
                return i2 - LJIIJ;
            }
            return i2;
        }
        return 0;
    }

    public void LLJIJIL(C0A7 c0a7, C0AC c0ac, C028809k c028809k, C028709j c028709j) {
        boolean z;
        int paddingTop;
        int LIZLLL;
        int i;
        int i2;
        boolean z2;
        View LIZIZ = c028809k.LIZIZ(c0a7);
        if (LIZIZ == null) {
            c028709j.LIZIZ = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) LIZIZ.getLayoutParams();
        if (c028809k.LJIIJ == null) {
            boolean z3 = this.LLD;
            if (c028809k.LJFF == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                LJIIZILJ(LIZIZ);
            } else {
                LJIJ(0, LIZIZ, false);
            }
        } else {
            boolean z4 = this.LLD;
            if (c028809k.LJFF == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                LJIJ(-1, LIZIZ, true);
            } else {
                LJIJ(0, LIZIZ, true);
            }
        }
        LJJLIIIJL(0, 0, LIZIZ);
        c028709j.LIZ = this.LJZI.LIZJ(LIZIZ);
        if (this.LJLZ == 1) {
            if (LLJI()) {
                i2 = this.LJLLLL - getPaddingRight();
                i = i2 - this.LJZI.LIZLLL(LIZIZ);
            } else {
                i = getPaddingLeft();
                i2 = this.LJZI.LIZLLL(LIZIZ) + i;
            }
            if (c028809k.LJFF == -1) {
                LIZLLL = c028809k.LIZIZ;
                paddingTop = LIZLLL - c028709j.LIZ;
            } else {
                paddingTop = c028809k.LIZIZ;
                LIZLLL = c028709j.LIZ + paddingTop;
            }
        } else {
            paddingTop = getPaddingTop();
            LIZLLL = this.LJZI.LIZLLL(LIZIZ) + paddingTop;
            if (c028809k.LJFF == -1) {
                i2 = c028809k.LIZIZ;
                i = i2 - c028709j.LIZ;
            } else {
                i = c028809k.LIZIZ;
                i2 = c028709j.LIZ + i;
            }
        }
        LJJLIIIJJIZ(LIZIZ, i, paddingTop, i2, LIZLLL);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            c028709j.LIZJ = true;
        }
        c028709j.LIZLLL = LIZIZ.hasFocusable();
    }

    public final void LLJJIJIL(int i, int i2, boolean z, C0AC c0ac) {
        boolean z2;
        int i3;
        int LJIIJ;
        C028809k c028809k = this.LJZ;
        boolean z3 = false;
        int i4 = 1;
        if (this.LJZI.LJIIIIZZ() == 0 && this.LJZI.LJFF() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c028809k.LJIIJJI = z2;
        this.LJZ.LJFF = i;
        int[] iArr = this.LLIIIILZ;
        iArr[0] = 0;
        iArr[1] = 0;
        LLIIIL(c0ac, iArr);
        int max = Math.max(0, this.LLIIIILZ[0]);
        int max2 = Math.max(0, this.LLIIIILZ[1]);
        if (i == 1) {
            z3 = true;
        }
        C028809k c028809k2 = this.LJZ;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c028809k2.LJII = i3;
        if (!z3) {
            max = max2;
        }
        c028809k2.LJIIIIZZ = max;
        if (z3) {
            c028809k2.LJII = this.LJZI.LJII() + i3;
            View LLIZLLLIL = LLIZLLLIL();
            C028809k c028809k3 = this.LJZ;
            if (this.LLD) {
                i4 = -1;
            }
            c028809k3.LJ = i4;
            int LJJJLL = C0A2.LJJJLL(LLIZLLLIL);
            C028809k c028809k4 = this.LJZ;
            c028809k3.LIZLLL = LJJJLL + c028809k4.LJ;
            c028809k4.LIZIZ = this.LJZI.LIZIZ(LLIZLLLIL);
            LJIIJ = this.LJZI.LIZIZ(LLIZLLLIL) - this.LJZI.LJI();
        } else {
            View LLJ = LLJ();
            C028809k c028809k5 = this.LJZ;
            c028809k5.LJII = this.LJZI.LJIIJ() + c028809k5.LJII;
            C028809k c028809k6 = this.LJZ;
            if (!this.LLD) {
                i4 = -1;
            }
            c028809k6.LJ = i4;
            int LJJJLL2 = C0A2.LJJJLL(LLJ);
            C028809k c028809k7 = this.LJZ;
            c028809k6.LIZLLL = LJJJLL2 + c028809k7.LJ;
            c028809k7.LIZIZ = this.LJZI.LJ(LLJ);
            LJIIJ = (-this.LJZI.LJ(LLJ)) + this.LJZI.LJIIJ();
        }
        C028809k c028809k8 = this.LJZ;
        c028809k8.LIZJ = i2;
        if (z) {
            c028809k8.LIZJ = i2 - LJIIJ;
        }
        c028809k8.LJI = LJIIJ;
    }
}
