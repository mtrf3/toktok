package androidx.recyclerview.widget;

import X.AbstractC029409q;
import X.AbstractC03050Ab;
import X.C03110Ah;
import X.C0A0;
import X.C0A1;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C0AF;
import X.C0AG;
import X.C0BC;
import X.C16300kU;
import X.C1BZ;
import X.C1C0;
import X.C1C9;
import X.X1D;
import Y.IDCreatorS45S0000000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends C0A2 implements C0AA {
    public C0AG[] LJZ;
    public AbstractC03050Ab LJZI;
    public AbstractC03050Ab LJZL;
    public int LL;
    public int LLD;
    public final C0BC LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public BitSet LLFII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public SavedState LLIIIJ;
    public int LLIIIL;
    public int[] LLIILII;
    public int LJLZ = -1;
    public int LLFZ = -1;
    public int LLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final LazySpanLookup LLIFFJFJJ = new LazySpanLookup();
    public int LLII = 2;
    public final Rect LLIIIZ = new Rect();
    public final C0AF LLIIJI = new C0AF(this);
    public boolean LLIIJLIL = false;
    public final boolean LLIIL = true;
    public final IDRunnableS85S0100000 LLIILZL = new IDRunnableS85S0100000(this, 26);

    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        public int[] LIZ;
        public List<FullSpanItem> LIZIZ;

        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new IDCreatorS45S0000000(31);
            public int LJLIL;
            public int LJLILLLLZI;
            public int[] LJLJI;
            public boolean LJLJJI;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("FullSpanItem{mPosition=");
                LIZ.append(this.LJLIL);
                LIZ.append(", mGapDir=");
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(", mHasUnwantedGapAfter=");
                LIZ.append(this.LJLJJI);
                LIZ.append(", mGapPerSpan=");
                LIZ.append(Arrays.toString(this.LJLJI));
                LIZ.append('}');
                return X1D.LIZIZ(LIZ);
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.LJLIL = parcel.readInt();
                this.LJLILLLLZI = parcel.readInt();
                this.LJLJJI = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.LJLJI = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LJLIL);
                parcel.writeInt(this.LJLILLLLZI);
                parcel.writeInt(this.LJLJJI ? 1 : 0);
                int[] iArr = this.LJLJI;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.LJLJI);
                } else {
                    parcel.writeInt(0);
                }
            }
        }

        public final void LIZIZ() {
            int[] iArr = this.LIZ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.LIZIZ = null;
        }

        public final void LIZ(FullSpanItem fullSpanItem) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList();
            }
            int size = this.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) ListProtector.get(this.LIZIZ, i);
                if (fullSpanItem2.LJLIL == fullSpanItem.LJLIL) {
                    ListProtector.remove(this.LIZIZ, i);
                }
                if (fullSpanItem2.LJLIL >= fullSpanItem.LJLIL) {
                    ListProtector.add(this.LIZIZ, i, fullSpanItem);
                    return;
                }
            }
            this.LIZIZ.add(fullSpanItem);
        }

        public final void LIZJ(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.LIZ = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                if (i < iArr.length) {
                    return;
                }
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.LIZ = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.LIZ;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void LIZLLL(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (((FullSpanItem) ListProtector.get(this.LIZIZ, size)).LJLIL >= i) {
                        ListProtector.remove(this.LIZIZ, size);
                    }
                }
            }
            LJI(i);
        }

        public final FullSpanItem LJFF(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                if (fullSpanItem.LJLIL == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final int LJI(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.LIZIZ != null) {
                FullSpanItem LJFF = LJFF(i);
                if (LJFF != null) {
                    this.LIZIZ.remove(LJFF);
                }
                int size = this.LIZIZ.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (((FullSpanItem) ListProtector.get(this.LIZIZ, i2)).LJLIL >= i) {
                        if (i2 != -1) {
                            FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, i2);
                            ListProtector.remove(this.LIZIZ, i2);
                            int i3 = fullSpanItem.LJLIL;
                            if (i3 != -1) {
                                int min = Math.min(i3 + 1, this.LIZ.length);
                                Arrays.fill(this.LIZ, i, min, -1);
                                return min;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            int[] iArr2 = this.LIZ;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return this.LIZ.length;
        }

        public final void LJII(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            LIZJ(i3);
            int[] iArr2 = this.LIZ;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.LIZ, i, i3, -1);
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                int i4 = fullSpanItem.LJLIL;
                if (i4 >= i) {
                    fullSpanItem.LJLIL = i4 + i2;
                }
            }
        }

        public final void LJIIIIZZ(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            LIZJ(i3);
            int[] iArr2 = this.LIZ;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.LIZ;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                int i4 = fullSpanItem.LJLIL;
                if (i4 >= i) {
                    if (i4 < i3) {
                        ListProtector.remove(this.LIZIZ, size);
                    } else {
                        fullSpanItem.LJLIL = i4 - i2;
                    }
                }
            }
        }

        public final FullSpanItem LJ(int i, int i2, int i3) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, i4);
                int i5 = fullSpanItem.LJLIL;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.LJLILLLLZI == i3 || fullSpanItem.LJLJJI)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    @Override // X.C0A2
    public boolean LJIJJLI() {
        if (this.LL == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public boolean LJIL() {
        if (this.LL == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        if (this.LL == 0) {
            return new C1BZ(-2, -1);
        }
        return new C1BZ(-1, -2);
    }

    @Override // X.C0A2
    public final boolean LJJLIIIJ() {
        if (this.LLII != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final void LJLIIIL() {
        this.LLIFFJFJJ.LIZIZ();
        LJZ();
    }

    @Override // X.C0A2
    public final Parcelable LJLJLJ() {
        int LLILLIZIL;
        View LLIIZ;
        int LJIIJJI;
        int LJIIJ;
        int[] iArr;
        if (this.LLIIIJ != null) {
            return new SavedState(this.LLIIIJ);
        }
        SavedState savedState = new SavedState();
        savedState.LJLJLJ = this.LLFF;
        savedState.LJLJLLL = this.LLIIII;
        savedState.LJLL = this.LLIIIILZ;
        LazySpanLookup lazySpanLookup = this.LLIFFJFJJ;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.LIZ) != null) {
            savedState.LJLJJLL = iArr;
            savedState.LJLJJL = iArr.length;
            savedState.LJLJL = lazySpanLookup.LIZIZ;
        } else {
            savedState.LJLJJL = 0;
        }
        int i = -1;
        if (LJJJI() > 0) {
            if (this.LLIIII) {
                LLILLIZIL = LLILLJJLI();
            } else {
                LLILLIZIL = LLILLIZIL();
            }
            savedState.LJLIL = LLILLIZIL;
            if (this.LLFFF) {
                LLIIZ = LLIILZL(true);
            } else {
                LLIIZ = LLIIZ(true);
            }
            if (LLIIZ != null) {
                i = C0A2.LJJJLL(LLIIZ);
            }
            savedState.LJLILLLLZI = i;
            int i2 = this.LJLZ;
            savedState.LJLJI = i2;
            savedState.LJLJJI = new int[i2];
            for (int i3 = 0; i3 < this.LJLZ; i3++) {
                if (this.LLIIII) {
                    LJIIJJI = this.LJZ[i3].LJIIIIZZ(LiveLayoutPreloadThreadPriority.DEFAULT);
                    if (LJIIJJI != Integer.MIN_VALUE) {
                        LJIIJ = this.LJZI.LJI();
                        LJIIJJI -= LJIIJ;
                        savedState.LJLJJI[i3] = LJIIJJI;
                    } else {
                        savedState.LJLJJI[i3] = LJIIJJI;
                    }
                } else {
                    LJIIJJI = this.LJZ[i3].LJIIJJI(LiveLayoutPreloadThreadPriority.DEFAULT);
                    if (LJIIJJI == Integer.MIN_VALUE) {
                        savedState.LJLJJI[i3] = LJIIJJI;
                    } else {
                        LJIIJ = this.LJZI.LJIIJ();
                        LJIIJJI -= LJIIJ;
                        savedState.LJLJJI[i3] = LJIIJJI;
                    }
                }
            }
        } else {
            savedState.LJLIL = -1;
            savedState.LJLILLLLZI = -1;
            savedState.LJLJI = 0;
        }
        return savedState;
    }

    @Override // X.C0A2
    public boolean LLIIIJ() {
        if (this.LLIIIJ == null) {
            return true;
        }
        return false;
    }

    public final void LLJJ() {
        if (this.LL == 1 || !LLIZ()) {
            this.LLFFF = this.LLFF;
        } else {
            this.LLFFF = !this.LLFF;
        }
    }

    public final boolean LLIIIZ() {
        int LLILLIZIL;
        int LLILLJJLI;
        int i;
        if (LJJJI() == 0 || this.LLII == 0 || !this.LJLJL) {
            return false;
        }
        if (this.LLFFF) {
            LLILLIZIL = LLILLJJLI();
            LLILLJJLI = LLILLIZIL();
        } else {
            LLILLIZIL = LLILLIZIL();
            LLILLJJLI = LLILLJJLI();
        }
        if (LLILLIZIL == 0 && LLILZLL() != null) {
            this.LLIFFJFJJ.LIZIZ();
            this.LJLJJLL = true;
            LJZ();
            return true;
        }
        if (!this.LLIIJLIL) {
            return false;
        }
        if (this.LLFFF) {
            i = -1;
        } else {
            i = 1;
        }
        int i2 = LLILLJJLI + 1;
        LazySpanLookup.FullSpanItem LJ = this.LLIFFJFJJ.LJ(LLILLIZIL, i2, i);
        if (LJ == null) {
            this.LLIIJLIL = false;
            this.LLIFFJFJJ.LIZLLL(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem LJ2 = this.LLIFFJFJJ.LJ(LLILLIZIL, LJ.LJLIL, -i);
        if (LJ2 == null) {
            this.LLIFFJFJJ.LIZLLL(LJ.LJLIL);
        } else {
            this.LLIFFJFJJ.LIZLLL(LJ2.LJLIL + 1);
        }
        this.LJLJJLL = true;
        LJZ();
        return true;
    }

    public final int LLILLIZIL() {
        if (LJJJI() == 0) {
            return 0;
        }
        return C0A2.LJJJLL(LJJJ(0));
    }

    public final int LLILLJJLI() {
        int LJJJI = LJJJI();
        if (LJJJI == 0) {
            return 0;
        }
        return C0A2.LJJJLL(LJJJ(LJJJI - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LLILZLL() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LLILZLL():android.view.View");
    }

    public final boolean LLIZ() {
        if (LJJJJZI() == 1) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS45S0000000(32);
        public int LJLIL;
        public int LJLILLLLZI;
        public int LJLJI;
        public int[] LJLJJI;
        public int LJLJJL;
        public int[] LJLJJLL;
        public List<LazySpanLookup.FullSpanItem> LJLJL;
        public boolean LJLJLJ;
        public boolean LJLJLLL;
        public boolean LJLL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readInt();
            int readInt = parcel.readInt();
            this.LJLJI = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.LJLJJI = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.LJLJJL = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.LJLJJLL = iArr2;
                parcel.readIntArray(iArr2);
            }
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJLJ = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJLLL = z2;
            this.LJLL = parcel.readInt() == 1;
            this.LJLJL = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.LJLJI = savedState.LJLJI;
            this.LJLIL = savedState.LJLIL;
            this.LJLILLLLZI = savedState.LJLILLLLZI;
            this.LJLJJI = savedState.LJLJJI;
            this.LJLJJL = savedState.LJLJJL;
            this.LJLJJLL = savedState.LJLJJLL;
            this.LJLJLJ = savedState.LJLJLJ;
            this.LJLJLLL = savedState.LJLJLLL;
            this.LJLL = savedState.LJLL;
            this.LJLJL = savedState.LJLJL;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LJLIL);
            parcel.writeInt(this.LJLILLLLZI);
            parcel.writeInt(this.LJLJI);
            if (this.LJLJI > 0) {
                parcel.writeIntArray(this.LJLJJI);
            }
            parcel.writeInt(this.LJLJJL);
            if (this.LJLJJL > 0) {
                parcel.writeIntArray(this.LJLJJLL);
            }
            parcel.writeInt(this.LJLJLJ ? 1 : 0);
            parcel.writeInt(this.LJLJLLL ? 1 : 0);
            parcel.writeInt(this.LJLL ? 1 : 0);
            parcel.writeList(this.LJLJL);
        }
    }

    @Override // X.C0AA
    public final PointF LJII(int i) {
        int LLIIIL = LLIIIL(i);
        PointF pointF = new PointF();
        if (LLIIIL == 0) {
            return null;
        }
        if (this.LL == 0) {
            pointF.x = LLIIIL;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = LLIIIL;
        }
        return pointF;
    }

    @Override // X.C0A2
    public final void LJIJI(String str) {
        if (this.LLIIIJ == null) {
            super.LJIJI(str);
        }
    }

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C1BZ;
    }

    @Override // X.C0A2
    public final int LJJIIJ(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIJZLJL(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIZ(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIZI(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIJ(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIJIIJI(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1BZ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1BZ(layoutParams);
    }

    @Override // X.C0A2
    public final void LJJLIIIJLJLI(int i) {
        super.LJJLIIIJLJLI(i);
        for (int i2 = 0; i2 < this.LJLZ; i2++) {
            C0AG c0ag = this.LJZ[i2];
            int i3 = c0ag.LIZIZ;
            if (i3 != Integer.MIN_VALUE) {
                c0ag.LIZIZ = i3 + i;
            }
            int i4 = c0ag.LIZJ;
            if (i4 != Integer.MIN_VALUE) {
                c0ag.LIZJ = i4 + i;
            }
        }
    }

    @Override // X.C0A2
    public final void LJJLIIIJLLLLLLLZ(int i) {
        super.LJJLIIIJLLLLLLLZ(i);
        for (int i2 = 0; i2 < this.LJLZ; i2++) {
            C0AG c0ag = this.LJZ[i2];
            int i3 = c0ag.LIZIZ;
            if (i3 != Integer.MIN_VALUE) {
                c0ag.LIZIZ = i3 + i;
            }
            int i4 = c0ag.LIZJ;
            if (i4 != Integer.MIN_VALUE) {
                c0ag.LIZJ = i4 + i;
            }
        }
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        this.LLIFFJFJJ.LIZIZ();
        for (int i = 0; i < this.LJLZ; i++) {
            this.LJZ[i].LIZLLL();
        }
    }

    @Override // X.C0A2
    public final void LJJLL(AccessibilityEvent accessibilityEvent) {
        super.LJJLL(accessibilityEvent);
        if (LJJJI() > 0) {
            View LLIIZ = LLIIZ(false);
            View LLIILZL = LLIILZL(false);
            if (LLIIZ == null || LLIILZL == null) {
                return;
            }
            int LJJJLL = C0A2.LJJJLL(LLIIZ);
            int LJJJLL2 = C0A2.LJJJLL(LLIILZL);
            if (LJJJLL < LJJJLL2) {
                accessibilityEvent.setFromIndex(LJJJLL);
                accessibilityEvent.setToIndex(LJJJLL2);
            } else {
                accessibilityEvent.setFromIndex(LJJJLL2);
                accessibilityEvent.setToIndex(LJJJLL);
            }
        }
    }

    @Override // X.C0A2
    public void LJLJJL(C0AC c0ac) {
        this.LLFZ = -1;
        this.LLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIJ = null;
        this.LLIIJI.LIZ();
    }

    @Override // X.C0A2
    public final void LJLJL(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.LLIIIJ = savedState;
            if (this.LLFZ != -1) {
                savedState.LJLJJI = null;
                savedState.LJLJI = 0;
                savedState.LJLIL = -1;
                savedState.LJLILLLLZI = -1;
                savedState.LJLJJI = null;
                savedState.LJLJI = 0;
                savedState.LJLJJL = 0;
                savedState.LJLJJLL = null;
                savedState.LJLJL = null;
            }
            LJZ();
        }
    }

    @Override // X.C0A2
    public void LJLJLLL(int i) {
        if (i == 0) {
            LLIIIZ();
        }
    }

    @Override // X.C0A2
    public final void LJZL(int i) {
        SavedState savedState = this.LLIIIJ;
        if (savedState != null && savedState.LJLIL != i) {
            savedState.LJLJJI = null;
            savedState.LJLJI = 0;
            savedState.LJLIL = -1;
            savedState.LJLILLLLZI = -1;
        }
        this.LLFZ = i;
        this.LLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        LJZ();
    }

    public final int LLIIIL(int i) {
        boolean z;
        if (LJJJI() == 0) {
            if (!this.LLFFF) {
                return -1;
            }
            return 1;
        }
        if (i < LLILLIZIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLFFF) {
            return -1;
        }
        return 1;
    }

    public final int LLIIJI(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        return C03110Ah.LIZ(c0ac, this.LJZI, LLIIZ(!this.LLIIL), LLIILZL(!this.LLIIL), this, this.LLIIL);
    }

    public final int LLIIJLIL(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        return C03110Ah.LIZIZ(c0ac, this.LJZI, LLIIZ(!this.LLIIL), LLIILZL(!this.LLIIL), this, this.LLIIL, this.LLFFF);
    }

    public final int LLIIL(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        return C03110Ah.LIZJ(c0ac, this.LJZI, LLIIZ(!this.LLIIL), LLIILZL(!this.LLIIL), this, this.LLIIL);
    }

    public final View LLIILZL(boolean z) {
        int LJIIJ = this.LJZI.LJIIJ();
        int LJI = this.LJZI.LJI();
        View view = null;
        for (int LJJJI = LJJJI() - 1; LJJJI >= 0; LJJJI--) {
            View LJJJ = LJJJ(LJJJI);
            int LJ = this.LJZI.LJ(LJJJ);
            int LIZIZ = this.LJZI.LIZIZ(LJJJ);
            if (LIZIZ > LJIIJ && LJ < LJI) {
                if (LIZIZ <= LJI || !z) {
                    return LJJJ;
                }
                if (view == null) {
                    view = LJJJ;
                }
            }
        }
        return view;
    }

    public final View LLIIZ(boolean z) {
        int LJIIJ = this.LJZI.LJIIJ();
        int LJI = this.LJZI.LJI();
        int LJJJI = LJJJI();
        View view = null;
        for (int i = 0; i < LJJJI; i++) {
            View LJJJ = LJJJ(i);
            int LJ = this.LJZI.LJ(LJJJ);
            if (this.LJZI.LIZIZ(LJJJ) > LJIIJ && LJ < LJI) {
                if (LJ >= LJIIJ || !z) {
                    return LJJJ;
                }
                if (view == null) {
                    view = LJJJ;
                }
            }
        }
        return view;
    }

    public final int[] LLIL(int[] iArr) {
        int LJII;
        if (iArr == null) {
            iArr = new int[this.LJLZ];
        } else if (iArr.length < this.LJLZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            LIZ.append(this.LJLZ);
            LIZ.append(", array size:");
            LIZ.append(iArr.length);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        for (int i = 0; i < this.LJLZ; i++) {
            C0AG c0ag = this.LJZ[i];
            if (c0ag.LJFF.LLFF) {
                LJII = c0ag.LJII(c0ag.LIZ.size() - 1, -1, false);
            } else {
                LJII = c0ag.LJII(0, c0ag.LIZ.size(), false);
            }
            iArr[i] = LJII;
        }
        return iArr;
    }

    public final int[] LLILII(int[] iArr) {
        int LJII;
        if (iArr == null) {
            iArr = new int[this.LJLZ];
        } else if (iArr.length < this.LJLZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            LIZ.append(this.LJLZ);
            LIZ.append(", array size:");
            LIZ.append(iArr.length);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        for (int i = 0; i < this.LJLZ; i++) {
            C0AG c0ag = this.LJZ[i];
            if (c0ag.LJFF.LLFF) {
                LJII = c0ag.LJII(0, c0ag.LIZ.size(), false);
            } else {
                LJII = c0ag.LJII(c0ag.LIZ.size() - 1, -1, false);
            }
            iArr[i] = LJII;
        }
        return iArr;
    }

    public final int LLILLL(int i) {
        int LJIIIIZZ = this.LJZ[0].LJIIIIZZ(i);
        for (int i2 = 1; i2 < this.LJLZ; i2++) {
            int LJIIIIZZ2 = this.LJZ[i2].LJIIIIZZ(i);
            if (LJIIIIZZ2 > LJIIIIZZ) {
                LJIIIIZZ = LJIIIIZZ2;
            }
        }
        return LJIIIIZZ;
    }

    public final int LLILZ(int i) {
        int LJIIJJI = this.LJZ[0].LJIIJJI(i);
        for (int i2 = 1; i2 < this.LJLZ; i2++) {
            int LJIIJJI2 = this.LJZ[i2].LJIIJJI(i);
            if (LJIIJJI2 < LJIIJJI) {
                LJIIJJI = LJIIJJI2;
            }
        }
        return LJIIJJI;
    }

    public final boolean LLJI(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.LL == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.LLFFF) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.LLFFF) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == LLIZ()) {
            return true;
        }
        return false;
    }

    public final void LLJJIII(int i) {
        LJIJI(null);
        if (i == this.LLII) {
            return;
        }
        if (i == 0 || i == 2) {
            this.LLII = i;
            LJZ();
            return;
        }
        throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
    }

    public final void LLJJIJI(int i) {
        boolean z;
        C0BC c0bc = this.LLF;
        c0bc.LJ = i;
        boolean z2 = this.LLFFF;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c0bc.LIZLLL = i2;
    }

    public final void LLJJIJIIJIL(int i) {
        if (i == 0 || i == 1) {
            LJIJI(null);
            if (i == this.LL) {
                return;
            }
            this.LL = i;
            AbstractC03050Ab abstractC03050Ab = this.LJZI;
            this.LJZI = this.LJZL;
            this.LJZL = abstractC03050Ab;
            LJZ();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final void LLJJIJIL(int i) {
        LJIJI(null);
        if (i != this.LJLZ) {
            this.LLIFFJFJJ.LIZIZ();
            LJZ();
            this.LJLZ = i;
            this.LLFII = new BitSet(this.LJLZ);
            this.LJZ = new C0AG[this.LJLZ];
            for (int i2 = 0; i2 < this.LJLZ; i2++) {
                this.LJZ[i2] = new C0AG(this, i2);
            }
            LJZ();
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.LL = i2;
        LLJJIJIL(i);
        this.LLF = new C0BC();
        this.LJZI = AbstractC03050Ab.LIZ(this, this.LL);
        this.LJZL = AbstractC03050Ab.LIZ(this, 1 - this.LL);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new C1BZ(context, attributeSet);
    }

    @Override // X.C0A2
    public void LJJLJ(RecyclerView recyclerView, C0A7 c0a7) {
        IDRunnableS85S0100000 iDRunnableS85S0100000 = this.LLIILZL;
        RecyclerView recyclerView2 = this.LJLILLLLZI;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(iDRunnableS85S0100000);
        }
        for (int i = 0; i < this.LJLZ; i++) {
            this.LJZ[i].LIZLLL();
        }
        recyclerView.requestLayout();
    }

    @Override // X.C0A2
    public final void LJLI(int i, int i2) {
        LLILZIL(i, i2, 1);
    }

    @Override // X.C0A2
    public final void LJLIIL(int i, int i2) {
        LLILZIL(i, i2, 8);
    }

    @Override // X.C0A2
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        LLJ(c0a7, c0ac, true);
    }

    public final void LLJIJIL(int i, C0AC c0ac) {
        int LLILLIZIL;
        int i2;
        if (i > 0) {
            LLILLIZIL = LLILLJJLI();
            i2 = 1;
        } else {
            LLILLIZIL = LLILLIZIL();
            i2 = -1;
        }
        this.LLF.LIZ = true;
        LLJJJIL(LLILLIZIL, c0ac);
        LLJJIJI(i2);
        C0BC c0bc = this.LLF;
        c0bc.LIZJ = LLILLIZIL + c0bc.LIZLLL;
        c0bc.LIZIZ = Math.abs(i);
    }

    public final void LLJILJIL(C0A7 c0a7, C0BC c0bc) {
        int min;
        int min2;
        if (!c0bc.LIZ || c0bc.LJIIIIZZ) {
            return;
        }
        if (c0bc.LIZIZ == 0) {
            if (c0bc.LJ == -1) {
                LLJILJILJ(c0bc.LJI, c0a7);
                return;
            } else {
                LLJILLL(c0bc.LJFF, c0a7);
                return;
            }
        }
        int i = 1;
        if (c0bc.LJ == -1) {
            int i2 = c0bc.LJFF;
            int LJIIJJI = this.LJZ[0].LJIIJJI(i2);
            while (i < this.LJLZ) {
                int LJIIJJI2 = this.LJZ[i].LJIIJJI(i2);
                if (LJIIJJI2 > LJIIJJI) {
                    LJIIJJI = LJIIJJI2;
                }
                i++;
            }
            int i3 = i2 - LJIIJJI;
            if (i3 < 0) {
                min2 = c0bc.LJI;
            } else {
                min2 = c0bc.LJI - Math.min(i3, c0bc.LIZIZ);
            }
            LLJILJILJ(min2, c0a7);
            return;
        }
        int i4 = c0bc.LJI;
        int LJIIIIZZ = this.LJZ[0].LJIIIIZZ(i4);
        while (i < this.LJLZ) {
            int LJIIIIZZ2 = this.LJZ[i].LJIIIIZZ(i4);
            if (LJIIIIZZ2 < LJIIIIZZ) {
                LJIIIIZZ = LJIIIIZZ2;
            }
            i++;
        }
        int i5 = LJIIIIZZ - c0bc.LJI;
        if (i5 < 0) {
            min = c0bc.LJFF;
        } else {
            min = Math.min(i5, c0bc.LIZIZ) + c0bc.LJFF;
        }
        LLJILLL(min, c0a7);
    }

    public final void LLJILJILJ(int i, C0A7 c0a7) {
        for (int LJJJI = LJJJI() - 1; LJJJI >= 0; LJJJI--) {
            View LJJJ = LJJJ(LJJJI);
            if (this.LJZI.LJ(LJJJ) >= i && this.LJZI.LJIILJJIL(LJJJ) >= i) {
                C1BZ c1bz = (C1BZ) LJJJ.getLayoutParams();
                if (c1bz.LJLILLLLZI) {
                    for (int i2 = 0; i2 < this.LJLZ; i2++) {
                        if (this.LJZ[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.LJLZ; i3++) {
                        this.LJZ[i3].LJIIL();
                    }
                } else if (c1bz.LJLIL.LIZ.size() == 1) {
                    return;
                } else {
                    c1bz.LJLIL.LJIIL();
                }
                LJLLL(LJJJ, c0a7);
            } else {
                return;
            }
        }
    }

    public final void LLJILLL(int i, C0A7 c0a7) {
        while (LJJJI() > 0) {
            View LJJJ = LJJJ(0);
            if (this.LJZI.LIZIZ(LJJJ) <= i && this.LJZI.LJIILIIL(LJJJ) <= i) {
                C1BZ c1bz = (C1BZ) LJJJ.getLayoutParams();
                if (c1bz.LJLILLLLZI) {
                    for (int i2 = 0; i2 < this.LJLZ; i2++) {
                        if (this.LJZ[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.LJLZ; i3++) {
                        this.LJZ[i3].LJIILIIL();
                    }
                } else if (c1bz.LJLIL.LIZ.size() == 1) {
                    return;
                } else {
                    c1bz.LJLIL.LJIILIIL();
                }
                LJLLL(LJJJ, c0a7);
            } else {
                return;
            }
        }
    }

    public final void LLJJJ(int i, int i2) {
        for (int i3 = 0; i3 < this.LJLZ; i3++) {
            if (!this.LJZ[i3].LIZ.isEmpty()) {
                LLJJJJ(this.LJZ[i3], i, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJIL(int r7, X.C0AC r8) {
        /*
            r6 = this;
            X.0BC r0 = r6.LLF
            r3 = 0
            r0.LIZIZ = r3
            r0.LIZJ = r7
            X.0AB r0 = r6.LJLJJL
            r4 = 1
            if (r0 == 0) goto L74
            boolean r0 = r0.LJ
            if (r0 == 0) goto L74
            int r2 = r8.LIZ
            r0 = -1
            if (r2 == r0) goto L74
            boolean r1 = r6.LLFFF
            if (r2 >= r7) goto L72
            r0 = 1
        L1a:
            if (r1 != r0) goto L6a
            X.0Ab r0 = r6.LJZI
            int r5 = r0.LJIIJJI()
        L22:
            r0 = 0
        L23:
            boolean r1 = r6.LJJJJ()
            if (r1 == 0) goto L59
            X.0BC r2 = r6.LLF
            X.0Ab r1 = r6.LJZI
            int r1 = r1.LJIIJ()
            int r1 = r1 - r0
            r2.LJFF = r1
            X.0BC r1 = r6.LLF
            X.0Ab r0 = r6.LJZI
            int r0 = r0.LJI()
            int r0 = r0 + r5
            r1.LJI = r0
        L3f:
            X.0BC r1 = r6.LLF
            r1.LJII = r3
            r1.LIZ = r4
            X.0Ab r0 = r6.LJZI
            int r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L56
            X.0Ab r0 = r6.LJZI
            int r0 = r0.LJFF()
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            r1.LJIIIIZZ = r3
            return
        L59:
            X.0BC r2 = r6.LLF
            X.0Ab r1 = r6.LJZI
            int r1 = r1.LJFF()
            int r1 = r1 + r5
            r2.LJI = r1
            X.0BC r1 = r6.LLF
            int r0 = -r0
            r1.LJFF = r0
            goto L3f
        L6a:
            X.0Ab r0 = r6.LJZI
            int r0 = r0.LJIIJJI()
            r5 = 0
            goto L23
        L72:
            r0 = 0
            goto L1a
        L74:
            r5 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LLJJJIL(int, X.0AC):void");
    }

    @Override // X.C0A2
    public final void LJLIL(RecyclerView recyclerView, int i, int i2) {
        LLILZIL(i, i2, 2);
    }

    @Override // X.C0A2
    public final void LJLJI(RecyclerView recyclerView, int i, int i2) {
        LLILZIL(i, i2, 4);
    }

    @Override // X.C0A2
    public int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        return LLJJI(i, c0a7, c0ac);
    }

    @Override // X.C0A2
    public int LL(int i, C0A7 c0a7, C0AC c0ac) {
        return LLJJI(i, c0a7, c0ac);
    }

    @Override // X.C0A2
    public final void LLFFF(int i, int i2, Rect rect) {
        int LJJI;
        int LJJI2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.LL == 1) {
            LJJI2 = C0A2.LJJI(i2, rect.height() + paddingBottom, C16300kU.LIZLLL(this.LJLILLLLZI));
            LJJI = C0A2.LJJI(i, (this.LLD * this.LJLZ) + paddingRight, C16300kU.LJ(this.LJLILLLLZI));
        } else {
            LJJI = C0A2.LJJI(i, rect.width() + paddingRight, C16300kU.LJ(this.LJLILLLLZI));
            LJJI2 = C0A2.LJJI(i2, (this.LLD * this.LJLZ) + paddingBottom, C16300kU.LIZLLL(this.LJLILLLLZI));
        }
        this.LJLILLLLZI.setMeasuredDimension(LJJI, LJJI2);
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C1C9 c1c9 = new C1C9(recyclerView.getContext());
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x034d, code lost:
    
        LLJILJIL(r27, r26.LLF);
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLIILII(X.C0A7 r27, X.C0BC r28, X.C0AC r29) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LLIILII(X.0A7, X.0BC, X.0AC):int");
    }

    public final void LLILIL(C0A7 c0a7, C0AC c0ac, boolean z) {
        int LJI;
        int LLILLL = LLILLL(LiveLayoutPreloadThreadPriority.DEFAULT);
        if (LLILLL != Integer.MIN_VALUE && (LJI = this.LJZI.LJI() - LLILLL) > 0) {
            int i = LJI - (-LLJJI(-LJI, c0a7, c0ac));
            if (z && i > 0) {
                this.LJZI.LJIILL(i);
            }
        }
    }

    public final void LLILL(C0A7 c0a7, C0AC c0ac, boolean z) {
        int LJIIJ;
        int LLILZ = LLILZ(Integer.MAX_VALUE);
        if (LLILZ != Integer.MAX_VALUE && (LJIIJ = LLILZ - this.LJZI.LJIIJ()) > 0) {
            int LLJJI = LJIIJ - LLJJI(LJIIJ, c0a7, c0ac);
            if (z && LLJJI > 0) {
                this.LJZI.LJIILL(-LLJJI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILZIL(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.LLFFF
            if (r0 == 0) goto L3f
            int r5 = r6.LLILLJJLI()
        L8:
            r4 = 8
            if (r9 != r4) goto L3c
            if (r7 >= r8) goto L38
            int r3 = r8 + 1
        L10:
            r2 = r7
        L11:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLIFFJFJJ
            r0.LJI(r2)
            r1 = 1
            if (r9 == r1) goto L32
            r0 = 2
            if (r9 == r0) goto L2c
            if (r9 == r4) goto L21
        L1e:
            if (r3 > r5) goto L44
            return
        L21:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLIFFJFJJ
            r0.LJIIIIZZ(r7, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLIFFJFJJ
            r0.LJII(r8, r1)
            goto L1e
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLIFFJFJJ
            r0.LJIIIIZZ(r7, r8)
            goto L1e
        L32:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLIFFJFJJ
            r0.LJII(r7, r8)
            goto L1e
        L38:
            int r3 = r7 + 1
            r2 = r8
            goto L11
        L3c:
            int r3 = r7 + r8
            goto L10
        L3f:
            int r5 = r6.LLILLIZIL()
            goto L8
        L44:
            boolean r0 = r6.LLFFF
            if (r0 == 0) goto L52
            int r0 = r6.LLILLIZIL()
        L4c:
            if (r2 > r0) goto L51
            r6.LJZ()
        L51:
            return
        L52:
            int r0 = r6.LLILLJJLI()
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LLILZIL(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x035b, code lost:
    
        if (LLIIIZ() != false) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJ(X.C0A7 r12, X.C0AC r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LLJ(X.0A7, X.0AC, boolean):void");
    }

    public final int LLJJI(int i, C0A7 c0a7, C0AC c0ac) {
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        LLJIJIL(i, c0ac);
        int LLIILII = LLIILII(c0a7, this.LLF, c0ac);
        if (this.LLF.LIZIZ >= LLIILII) {
            if (i < 0) {
                i = -LLIILII;
            } else {
                i = LLIILII;
            }
        }
        this.LJZI.LJIILL(-i);
        this.LLIIII = this.LLFFF;
        C0BC c0bc = this.LLF;
        c0bc.LIZIZ = 0;
        LLJILJIL(c0a7, c0bc);
        return i;
    }

    public final void LLJJJJ(C0AG c0ag, int i, int i2) {
        int i3 = c0ag.LIZLLL;
        if (i == -1) {
            int i4 = c0ag.LIZIZ;
            if (i4 == Integer.MIN_VALUE) {
                c0ag.LIZJ();
                i4 = c0ag.LIZIZ;
            }
            if (i4 + i3 <= i2) {
                this.LLFII.set(c0ag.LJ, false);
                return;
            }
            return;
        }
        int i5 = c0ag.LIZJ;
        if (i5 == Integer.MIN_VALUE) {
            c0ag.LIZIZ();
            i5 = c0ag.LIZJ;
        }
        if (i5 - i3 < i2) {
            return;
        }
        this.LLFII.set(c0ag.LJ, false);
    }

    public final int LLJJJJJIL(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0A1 LJJJLZIJ = C0A2.LJJJLZIJ(context, attributeSet, i, i2);
        LLJJIJIIJIL(LJJJLZIJ.LIZ);
        LLJJIJIL(LJJJLZIJ.LIZIZ);
        boolean z = LJJJLZIJ.LIZJ;
        LJIJI(null);
        SavedState savedState = this.LLIIIJ;
        if (savedState != null && savedState.LJLJLJ != z) {
            savedState.LJLJLJ = z;
        }
        this.LLFF = z;
        LJZ();
        this.LLF = new C0BC();
        this.LJZI = AbstractC03050Ab.LIZ(this, this.LL);
        this.LJZL = AbstractC03050Ab.LIZ(this, 1 - this.LL);
    }

    @Override // X.C0A2
    public final void LJJII(int i, int i2, C0AC c0ac, C0A0 c0a0) {
        int LJIIIIZZ;
        int i3;
        if (this.LL != 0) {
            i = i2;
        }
        if (LJJJI() == 0 || i == 0) {
            return;
        }
        LLJIJIL(i, c0ac);
        int[] iArr = this.LLIILII;
        if (iArr == null || iArr.length < this.LJLZ) {
            this.LLIILII = new int[this.LJLZ];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.LJLZ; i5++) {
            C0BC c0bc = this.LLF;
            if (c0bc.LIZLLL == -1) {
                LJIIIIZZ = c0bc.LJFF;
                i3 = this.LJZ[i5].LJIIJJI(LJIIIIZZ);
            } else {
                LJIIIIZZ = this.LJZ[i5].LJIIIIZZ(c0bc.LJI);
                i3 = this.LLF.LJI;
            }
            int i6 = LJIIIIZZ - i3;
            if (i6 >= 0) {
                this.LLIILII[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.LLIILII, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.LLF.LIZJ;
            if (i8 < 0 || i8 >= c0ac.LIZIZ()) {
                return;
            }
            ((C1C0) c0a0).LIZ(this.LLF.LIZJ, this.LLIILII[i7]);
            C0BC c0bc2 = this.LLF;
            c0bc2.LIZJ += c0bc2.LIZLLL;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x003f, code lost:
    
        if (r11.LL == 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x005c, code lost:
    
        if (r11.LL == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x004b, code lost:
    
        if (LLIZ() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0057, code lost:
    
        if (LLIZ() == false) goto L47;
     */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJLJLI(android.view.View r12, int r13, X.C0A7 r14, X.C0AC r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LJJLJLI(android.view.View, int, X.0A7, X.0AC):android.view.View");
    }

    public final void LLIZLLLIL(View view, int i, int i2, boolean z) {
        LJIJJ(this.LLIIIZ, view);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.LLIIIZ;
        int LLJJJJJIL = LLJJJJJIL(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.LLIIIZ;
        int LLJJJJJIL2 = LLJJJJJIL(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (LLI(view, LLJJJJJIL, LLJJJJJIL2, layoutParams)) {
            view.measure(LLJJJJJIL, LLJJJJJIL2);
        }
    }
}
