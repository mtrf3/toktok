package com.google.android.flexbox;

import X.AbstractC029409q;
import X.AbstractC03050Ab;
import X.C0A1;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C1C9;
import X.C28851Bh;
import X.C28861Bi;
import X.C80127VcZ;
import X.C80128Vca;
import X.C80130Vcc;
import X.C80134Vcg;
import X.C80135Vch;
import X.C80140Vcm;
import X.C80141Vcn;
import X.InterfaceC80136Vci;
import X.X1D;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class FlexboxLayoutManager extends C0A2 implements InterfaceC80136Vci, C0AA {
    public static final Rect LLIL = new Rect();
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public final int LL;
    public boolean LLD;
    public boolean LLF;
    public List<C80134Vcg> LLFF;
    public final C80135Vch LLFFF;
    public C0A7 LLFII;
    public C0AC LLFZ;
    public C80128Vca LLI;
    public final C80127VcZ LLIFFJFJJ;
    public AbstractC03050Ab LLII;
    public AbstractC03050Ab LLIIII;
    public SavedState LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public final SparseArray<View> LLIIJLIL;
    public final Context LLIIL;
    public View LLIILII;
    public int LLIILZL;
    public final C80130Vcc LLIIZ;

    @Override // X.InterfaceC80136Vci
    public final void LJI(C80134Vcg c80134Vcg) {
    }

    @Override // X.C0A2
    public final void LJJLJ(RecyclerView recyclerView, C0A7 c0a7) {
    }

    @Override // X.InterfaceC80136Vci
    public final int getAlignContent() {
        return 5;
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80141Vcn();
        public int mAnchorOffset;
        public int mAnchorPosition;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SavedState{mAnchorPosition=");
            LIZ.append(this.mAnchorPosition);
            LIZ.append(", mAnchorOffset=");
            return b0.LIZJ(LIZ, this.mAnchorOffset, '}', LIZ);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }
    }

    @Override // X.InterfaceC80136Vci
    public final boolean LJIILLIIL() {
        int i = this.LJLZ;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        int i;
        if (this.LJZ == 0) {
            return LJIILLIIL();
        }
        if (LJIILLIIL()) {
            int i2 = this.LJLLLL;
            View view = this.LLIILII;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C0A2
    public final boolean LJIL() {
        int i;
        if (this.LJZ == 0) {
            return !LJIILLIIL();
        }
        if (LJIILLIIL()) {
            return true;
        }
        int i2 = this.LJLLLLLL;
        View view = this.LLIILII;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (i2 > i) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new LayoutParams();
    }

    @Override // X.C0A2
    public final Parcelable LJLJLJ() {
        if (this.LLIIIILZ != null) {
            return new SavedState(this.LLIIIILZ);
        }
        SavedState savedState = new SavedState();
        if (LJJJI() > 0) {
            View LJJJ = LJJJ(0);
            savedState.mAnchorPosition = C0A2.LJJJLL(LJJJ);
            savedState.mAnchorOffset = this.LLII.LJ(LJJJ) - this.LLII.LJIIJ();
        } else {
            savedState.mAnchorPosition = -1;
        }
        return savedState;
    }

    public final void LLIIJLIL() {
        if (this.LLII != null) {
            return;
        }
        if (LJIILLIIL()) {
            if (this.LJZ == 0) {
                this.LLII = new C28851Bh(this);
                this.LLIIII = new C28861Bi(this);
                return;
            } else {
                this.LLII = new C28861Bi(this);
                this.LLIIII = new C28851Bh(this);
                return;
            }
        }
        if (this.LJZ == 0) {
            this.LLII = new C28861Bi(this);
            this.LLIIII = new C28851Bh(this);
        } else {
            this.LLII = new C28851Bh(this);
            this.LLIIII = new C28861Bi(this);
        }
    }

    @Override // X.InterfaceC80136Vci
    public final int getFlexItemCount() {
        return this.LLFZ.LIZIZ();
    }

    @Override // X.InterfaceC80136Vci
    public final int getLargestMainSize() {
        if (this.LLFF.size() == 0) {
            return 0;
        }
        int size = this.LLFF.size();
        int i = LiveLayoutPreloadThreadPriority.DEFAULT;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C80134Vcg) ListProtector.get(this.LLFF, i2)).LJ);
        }
        return i;
    }

    @Override // X.InterfaceC80136Vci
    public final int getSumOfCrossSize() {
        int size = this.LLFF.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C80134Vcg) ListProtector.get(this.LLFF, i2)).LJI;
        }
        return i;
    }

    public final int LLILII() {
        View LLILIL = LLILIL(LJJJI() - 1, -1, false);
        if (LLILIL == null) {
            return -1;
        }
        return C0A2.LJJJLL(LLILIL);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C80140Vcm();
        public int mAlignSelf;
        public float mFlexBasisPercent;
        public float mFlexGrow;
        public float mFlexShrink;
        public int mMaxHeight;
        public int mMaxWidth;
        public int mMinHeight;
        public int mMinWidth;
        public boolean mWrapBefore;

        public LayoutParams() {
            super(-2, -2);
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float LLFII() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float LLIIL() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int LLLZZ() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float LLZZ() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean LLZZLLIL() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            boolean z;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mWrapBefore = z;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void LLIIJLIL(int i) {
            this.mMinHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void LLJJ(int i) {
            this.mMinWidth = i;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    @Override // X.InterfaceC80136Vci
    public final int getAlignItems() {
        return this.LJZL;
    }

    @Override // X.InterfaceC80136Vci
    public final int getFlexDirection() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC80136Vci
    public final List<C80134Vcg> getFlexLinesInternal() {
        return this.LLFF;
    }

    @Override // X.InterfaceC80136Vci
    public final int getFlexWrap() {
        return this.LJZ;
    }

    @Override // X.InterfaceC80136Vci
    public final int getMaxLine() {
        return this.LL;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0);
    }

    @Override // X.InterfaceC80136Vci
    public final int LJ(View view) {
        int LJJJLIIL;
        int LJJJZ;
        if (LJIILLIIL()) {
            LJJJLIIL = C0A2.LJJLI(view);
            LJJJZ = C0A2.LJJIZ(view);
        } else {
            LJJJLIIL = C0A2.LJJJLIIL(view);
            LJJJZ = C0A2.LJJJZ(view);
        }
        return LJJJZ + LJJJLIIL;
    }

    @Override // X.C0AA
    public final PointF LJII(int i) {
        int i2;
        if (LJJJI() == 0) {
            return null;
        }
        if (i < C0A2.LJJJLL(LJJJ(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (LJIILLIIL()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // X.InterfaceC80136Vci
    public final View LJIIIZ(int i) {
        View view = this.LLIIJLIL.get(i);
        if (view != null) {
            return view;
        }
        return this.LLFII.LJFF(i);
    }

    @Override // X.InterfaceC80136Vci
    public final View LJIIJJI(int i) {
        return LJIIIZ(i);
    }

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // X.C0A2
    public final int LJJIIJ(C0AC c0ac) {
        return LLIIIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIJZLJL(C0AC c0ac) {
        return LLIIIZ(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIZ(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIIZI(C0AC c0ac) {
        return LLIIIL(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIJ(C0AC c0ac) {
        return LLIIIZ(c0ac);
    }

    @Override // X.C0A2
    public final int LJJIJIIJI(C0AC c0ac) {
        return LLIIJI(c0ac);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        LJLLI();
    }

    @Override // X.C0A2
    public final void LJJLIL(RecyclerView recyclerView) {
        this.LLIILII = (View) recyclerView.getParent();
    }

    @Override // X.C0A2
    public final void LJLILLLLZI(int i) {
        LLJIJIL(i);
    }

    @Override // X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        this.LLIIIILZ = null;
        this.LLIIIJ = -1;
        this.LLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIILZL = -1;
        this.LLIFFJFJJ.LIZIZ();
        this.LLIIJLIL.clear();
    }

    @Override // X.C0A2
    public final void LJLJL(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.LLIIIILZ = (SavedState) parcelable;
            LJZ();
        }
    }

    @Override // X.C0A2
    public final void LJZL(int i) {
        this.LLIIIJ = i;
        this.LLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        SavedState savedState = this.LLIIIILZ;
        if (savedState != null) {
            savedState.mAnchorPosition = -1;
        }
        LJZ();
    }

    public final int LLIIIL(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        int LIZIZ = c0ac.LIZIZ();
        LLIIJLIL();
        View LLIILII = LLIILII(LIZIZ);
        View LLIIZ = LLIIZ(LIZIZ);
        if (c0ac.LIZIZ() == 0 || LLIILII == null || LLIIZ == null) {
            return 0;
        }
        return Math.min(this.LLII.LJIIJJI(), this.LLII.LIZIZ(LLIIZ) - this.LLII.LJ(LLIILII));
    }

    public final int LLIIIZ(C0AC c0ac) {
        if (LJJJI() == 0) {
            return 0;
        }
        int LIZIZ = c0ac.LIZIZ();
        View LLIILII = LLIILII(LIZIZ);
        View LLIIZ = LLIIZ(LIZIZ);
        if (c0ac.LIZIZ() != 0 && LLIILII != null && LLIIZ != null) {
            int LJJJLL = C0A2.LJJJLL(LLIILII);
            int LJJJLL2 = C0A2.LJJJLL(LLIIZ);
            int abs = Math.abs(this.LLII.LIZIZ(LLIIZ) - this.LLII.LJ(LLIILII));
            int[] iArr = this.LLFFF.LIZJ;
            int i = iArr[LJJJLL];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[LJJJLL2] - i) + 1))) + (this.LLII.LJIIJ() - this.LLII.LJ(LLIILII)));
            }
        }
        return 0;
    }

    public final int LLIIJI(C0AC c0ac) {
        int LJJJLL;
        if (LJJJI() == 0) {
            return 0;
        }
        int LIZIZ = c0ac.LIZIZ();
        View LLIILII = LLIILII(LIZIZ);
        View LLIIZ = LLIIZ(LIZIZ);
        if (c0ac.LIZIZ() == 0 || LLIILII == null || LLIIZ == null) {
            return 0;
        }
        View LLILIL = LLILIL(0, LJJJI(), false);
        if (LLILIL == null) {
            LJJJLL = -1;
        } else {
            LJJJLL = C0A2.LJJJLL(LLILIL);
        }
        int LLILII = LLILII();
        return (int) ((Math.abs(this.LLII.LIZIZ(LLIIZ) - this.LLII.LJ(LLIILII)) / ((LLILII - LJJJLL) + 1)) * c0ac.LIZIZ());
    }

    public final View LLIILII(int i) {
        View LLILL = LLILL(0, LJJJI(), i);
        if (LLILL == null) {
            return null;
        }
        int i2 = this.LLFFF.LIZJ[C0A2.LJJJLL(LLILL)];
        if (i2 == -1) {
            return null;
        }
        return LLIILZL(LLILL, (C80134Vcg) ListProtector.get(this.LLFF, i2));
    }

    public final View LLIIZ(int i) {
        View LLILL = LLILL(LJJJI() - 1, -1, i);
        if (LLILL == null) {
            return null;
        }
        return LLIL(LLILL, (C80134Vcg) ListProtector.get(this.LLFF, this.LLFFF.LIZJ[C0A2.LJJJLL(LLILL)]));
    }

    public final int LLILZ(int i) {
        int height;
        int i2;
        int i3;
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        LLIIJLIL();
        boolean LJIILLIIL = LJIILLIIL();
        View view = this.LLIILII;
        if (LJIILLIIL) {
            height = view.getWidth();
            i2 = this.LJLLLL;
        } else {
            height = view.getHeight();
            i2 = this.LJLLLLLL;
        }
        if (LJJJJZI() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + this.LLIFFJFJJ.LIZLLL) - height, abs);
            }
            i3 = this.LLIFFJFJJ.LIZLLL;
            if (i3 + i <= 0) {
                return i;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - this.LLIFFJFJJ.LIZLLL) - height, i);
            }
            i3 = this.LLIFFJFJJ.LIZLLL;
            if (i3 + i >= 0) {
                return i;
            }
        }
        return -i3;
    }

    public final void LLILZLL(int i) {
        int i2 = this.LJZL;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                LJLLI();
                this.LLFF.clear();
                this.LLIFFJFJJ.LIZIZ();
                this.LLIFFJFJJ.LIZLLL = 0;
            }
            this.LJZL = i;
            LJZ();
        }
    }

    public final void LLIZ(int i) {
        if (this.LJLZ != i) {
            LJLLI();
            this.LJLZ = i;
            this.LLII = null;
            this.LLIIII = null;
            this.LLFF.clear();
            this.LLIFFJFJJ.LIZIZ();
            this.LLIFFJFJJ.LIZLLL = 0;
            LJZ();
        }
    }

    public final void LLIZLLLIL(int i) {
        int i2 = this.LJZ;
        if (i2 != 1) {
            if (i2 == 0) {
                LJLLI();
                this.LLFF.clear();
                this.LLIFFJFJJ.LIZIZ();
                this.LLIFFJFJJ.LIZLLL = 0;
            }
            this.LJZ = 1;
            this.LLII = null;
            this.LLIIII = null;
            LJZ();
        }
    }

    public final void LLJ(int i) {
        if (this.LJZI != i) {
            this.LJZI = i;
            LJZ();
        }
    }

    public final void LLJIJIL(int i) {
        if (i >= LLILII()) {
            return;
        }
        int LJJJI = LJJJI();
        this.LLFFF.LJIIIZ(LJJJI);
        this.LLFFF.LJIIJ(LJJJI);
        this.LLFFF.LJIIIIZZ(LJJJI);
        if (i >= this.LLFFF.LIZJ.length) {
            return;
        }
        this.LLIILZL = i;
        View LJJJ = LJJJ(0);
        if (LJJJ == null) {
            return;
        }
        this.LLIIIJ = C0A2.LJJJLL(LJJJ);
        if (!LJIILLIIL() && this.LLD) {
            this.LLIIIL = this.LLII.LJII() + this.LLII.LIZIZ(LJJJ);
        } else {
            this.LLIIIL = this.LLII.LJ(LJJJ) - this.LLII.LJIIJ();
        }
    }

    @Override // X.InterfaceC80136Vci
    public final void setFlexLines(List<C80134Vcg> list) {
        this.LLFF = list;
    }

    public FlexboxLayoutManager(Context context, int i) {
        this.LL = -1;
        this.LLFF = new ArrayList();
        this.LLFFF = new C80135Vch(this);
        this.LLIFFJFJJ = new C80127VcZ(this);
        this.LLIIIJ = -1;
        this.LLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJLIL = new SparseArray<>();
        this.LLIILZL = -1;
        this.LLIIZ = new C80130Vcc();
        LLIZ(0);
        LLIZLLLIL(1);
        LLILZLL(4);
        this.LJLJLJ = true;
        this.LLIIL = context;
    }

    @Override // X.InterfaceC80136Vci
    public final void LJIILL(int i, View view) {
        this.LLIIJLIL.put(i, view);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // X.C0A2
    public final void LJLI(int i, int i2) {
        LLJIJIL(i);
    }

    @Override // X.C0A2
    public final void LJLIIL(int i, int i2) {
        LLJIJIL(Math.min(i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C0A7 r24, X.C0AC r25) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJLJJI(X.0A7, X.0AC):void");
    }

    public final View LLIILZL(View view, C80134Vcg c80134Vcg) {
        boolean LJIILLIIL = LJIILLIIL();
        int i = c80134Vcg.LJII;
        for (int i2 = 1; i2 < i; i2++) {
            View LJJJ = LJJJ(i2);
            if (LJJJ != null && LJJJ.getVisibility() != 8) {
                if (this.LLD && !LJIILLIIL) {
                    if (this.LLII.LIZIZ(view) >= this.LLII.LIZIZ(LJJJ)) {
                    }
                    view = LJJJ;
                } else {
                    if (this.LLII.LJ(view) <= this.LLII.LJ(LJJJ)) {
                    }
                    view = LJJJ;
                }
            }
        }
        return view;
    }

    public final View LLIL(View view, C80134Vcg c80134Vcg) {
        boolean LJIILLIIL = LJIILLIIL();
        int LJJJI = (LJJJI() - c80134Vcg.LJII) - 1;
        for (int LJJJI2 = LJJJI() - 2; LJJJI2 > LJJJI; LJJJI2--) {
            View LJJJ = LJJJ(LJJJI2);
            if (LJJJ != null && LJJJ.getVisibility() != 8) {
                if (this.LLD && !LJIILLIIL) {
                    if (this.LLII.LJ(view) <= this.LLII.LJ(LJJJ)) {
                    }
                    view = LJJJ;
                } else {
                    if (this.LLII.LIZIZ(view) >= this.LLII.LIZIZ(LJJJ)) {
                    }
                    view = LJJJ;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILZIL(X.C0A7 r11, X.C80128Vca r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LLILZIL(X.0A7, X.Vca):void");
    }

    public static boolean LJJLIIIJILLIZJL(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC80136Vci
    public final int LIZ(int i, int i2, View view) {
        int LJJLI;
        int LJJIZ;
        if (LJIILLIIL()) {
            LJJLI = C0A2.LJJJLIIL(view);
            LJJIZ = C0A2.LJJJZ(view);
        } else {
            LJJLI = C0A2.LJJLI(view);
            LJJIZ = C0A2.LJJIZ(view);
        }
        return LJJIZ + LJJLI;
    }

    @Override // X.InterfaceC80136Vci
    public final int LJIIJ(int i, int i2, int i3) {
        return C0A2.LJJJIL(this.LJLLLLLL, this.LJLLL, i2, i3, LJIL());
    }

    @Override // X.InterfaceC80136Vci
    public final int LJIILJJIL(int i, int i2, int i3) {
        return C0A2.LJJJIL(this.LJLLLL, this.LJLLJ, i2, i3, LJIJJLI());
    }

    @Override // X.C0A2
    public final void LJLIL(RecyclerView recyclerView, int i, int i2) {
        LLJIJIL(i);
    }

    @Override // X.C0A2
    public final void LJLJI(RecyclerView recyclerView, int i, int i2) {
        LLJIJIL(i);
        LLJIJIL(i);
    }

    @Override // X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        if (!LJIILLIIL() || (this.LJZ == 0 && LJIILLIIL())) {
            int LLILLL = LLILLL(i, c0a7, c0ac);
            this.LLIIJLIL.clear();
            return LLILLL;
        }
        int LLILZ = LLILZ(i);
        this.LLIFFJFJJ.LIZLLL += LLILZ;
        this.LLIIII.LJIILL(-LLILZ);
        return LLILZ;
    }

    @Override // X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        if (LJIILLIIL() || (this.LJZ == 0 && !LJIILLIIL())) {
            int LLILLL = LLILLL(i, c0a7, c0ac);
            this.LLIIJLIL.clear();
            return LLILLL;
        }
        int LLILZ = LLILZ(i);
        this.LLIFFJFJJ.LIZLLL += LLILZ;
        this.LLIIII.LJIILL(-LLILZ);
        return LLILZ;
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C1C9 c1c9 = new C1C9(recyclerView.getContext());
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x03ca, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03cc, code lost:
    
        r3 = r3 + r19;
        r34.LJFF = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03d0, code lost:
    
        if (r4 >= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03d2, code lost:
    
        r34.LJFF = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03d5, code lost:
    
        LLILZIL(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03dd, code lost:
    
        return r15 - r34.LIZ;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLIIL(X.C0A7 r32, X.C0AC r33, X.C80128Vca r34) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LLIIL(X.0A7, X.0AC, X.Vca):int");
    }

    public final View LLILIL(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View LJJJ = LJJJ(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.LJLLLL - getPaddingRight();
            int paddingBottom = this.LJLLLLLL - getPaddingBottom();
            int left = (LJJJ.getLeft() - C0A2.LJJJLIIL(LJJJ)) - ((ViewGroup.MarginLayoutParams) LJJJ.getLayoutParams()).leftMargin;
            int top = (LJJJ.getTop() - C0A2.LJJLI(LJJJ)) - ((ViewGroup.MarginLayoutParams) LJJJ.getLayoutParams()).topMargin;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJJJ.getLayoutParams();
            int LJJJZ = C0A2.LJJJZ(LJJJ) + LJJJ.getRight() + marginLayoutParams.rightMargin;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) LJJJ.getLayoutParams();
            int LJJIZ = C0A2.LJJIZ(LJJJ) + LJJJ.getBottom() + marginLayoutParams2.bottomMargin;
            if (paddingLeft <= left && paddingRight >= LJJJZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (left >= paddingRight || LJJJZ >= paddingLeft) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (paddingTop <= top && paddingBottom >= LJJIZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (top >= paddingBottom || LJJIZ >= paddingTop) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z) {
                if (z2 && z4) {
                    return LJJJ;
                }
                i += i3;
            } else {
                if (z3 && z5) {
                    return LJJJ;
                }
                i += i3;
            }
        }
        return null;
    }

    public final View LLILL(int i, int i2, int i3) {
        int i4;
        LLIIJLIL();
        if (this.LLI == null) {
            this.LLI = new C80128Vca();
        }
        int LJIIJ = this.LLII.LJIIJ();
        int LJI = this.LLII.LJI();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View LJJJ = LJJJ(i);
            int LJJJLL = C0A2.LJJJLL(LJJJ);
            if (LJJJLL >= 0 && LJJJLL < i3) {
                if (((RecyclerView.LayoutParams) LJJJ.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = LJJJ;
                    }
                } else if (this.LLII.LJ(LJJJ) < LJIIJ || this.LLII.LIZIZ(LJJJ) > LJI) {
                    if (view == null) {
                        view = LJJJ;
                    }
                } else {
                    return LJJJ;
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLILLL(int r25, X.C0A7 r26, X.C0AC r27) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LLILLL(int, X.0A7, X.0AC):int");
    }

    public final void LLJILJIL(C80127VcZ c80127VcZ, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3 = false;
        if (z2) {
            if (LJIILLIIL()) {
                i2 = this.LJLLL;
            } else {
                i2 = this.LJLLJ;
            }
            C80128Vca c80128Vca = this.LLI;
            if (i2 == 0 || i2 == Integer.MIN_VALUE) {
                z3 = true;
            }
            c80128Vca.LIZIZ = z3;
        } else {
            this.LLI.LIZIZ = false;
        }
        if (!LJIILLIIL() && this.LLD) {
            this.LLI.LIZ = c80127VcZ.LIZJ - getPaddingRight();
        } else {
            this.LLI.LIZ = this.LLII.LJI() - c80127VcZ.LIZJ;
        }
        C80128Vca c80128Vca2 = this.LLI;
        c80128Vca2.LIZLLL = c80127VcZ.LIZ;
        c80128Vca2.LJII = 1;
        c80128Vca2.LJIIIIZZ = 1;
        c80128Vca2.LJ = c80127VcZ.LIZJ;
        c80128Vca2.LJFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        c80128Vca2.LIZJ = c80127VcZ.LIZIZ;
        if (z && this.LLFF.size() > 1 && (i = c80127VcZ.LIZIZ) >= 0 && i < this.LLFF.size() - 1) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LLFF, c80127VcZ.LIZIZ);
            C80128Vca c80128Vca3 = this.LLI;
            c80128Vca3.LIZJ++;
            c80128Vca3.LIZLLL += c80134Vcg.LJII;
        }
    }

    public final void LLJILJILJ(C80127VcZ c80127VcZ, boolean z, boolean z2) {
        int i;
        boolean z3 = false;
        if (z2) {
            if (LJIILLIIL()) {
                i = this.LJLLL;
            } else {
                i = this.LJLLJ;
            }
            C80128Vca c80128Vca = this.LLI;
            if (i == 0 || i == Integer.MIN_VALUE) {
                z3 = true;
            }
            c80128Vca.LIZIZ = z3;
        } else {
            this.LLI.LIZIZ = false;
        }
        if (!LJIILLIIL() && this.LLD) {
            this.LLI.LIZ = (this.LLIILII.getWidth() - c80127VcZ.LIZJ) - this.LLII.LJIIJ();
        } else {
            this.LLI.LIZ = c80127VcZ.LIZJ - this.LLII.LJIIJ();
        }
        C80128Vca c80128Vca2 = this.LLI;
        c80128Vca2.LIZLLL = c80127VcZ.LIZ;
        c80128Vca2.LJII = 1;
        c80128Vca2.LJIIIIZZ = -1;
        c80128Vca2.LJ = c80127VcZ.LIZJ;
        c80128Vca2.LJFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        int i2 = c80127VcZ.LIZIZ;
        c80128Vca2.LIZJ = i2;
        if (z && i2 > 0) {
            int size = this.LLFF.size();
            int i3 = c80127VcZ.LIZIZ;
            if (size > i3) {
                C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LLFF, i3);
                C80128Vca c80128Vca3 = this.LLI;
                c80128Vca3.LIZJ--;
                c80128Vca3.LIZLLL -= c80134Vcg.LJII;
            }
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LL = -1;
        this.LLFF = new ArrayList();
        this.LLFFF = new C80135Vch(this);
        this.LLIFFJFJJ = new C80127VcZ(this);
        this.LLIIIJ = -1;
        this.LLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJLIL = new SparseArray<>();
        this.LLIILZL = -1;
        this.LLIIZ = new C80130Vcc();
        C0A1 LJJJLZIJ = C0A2.LJJJLZIJ(context, attributeSet, i, i2);
        int i3 = LJJJLZIJ.LIZ;
        if (i3 != 0) {
            if (i3 == 1) {
                if (LJJJLZIJ.LIZJ) {
                    LLIZ(3);
                } else {
                    LLIZ(2);
                }
            }
        } else if (LJJJLZIJ.LIZJ) {
            LLIZ(1);
        } else {
            LLIZ(0);
        }
        LLIZLLLIL(1);
        LLILZLL(4);
        this.LJLJLJ = true;
        this.LLIIL = context;
    }

    private boolean LLJI(View view, int i, int i2, LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !this.LJLJLLL || !LJJLIIIJILLIZJL(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !LJJLIIIJILLIZJL(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80136Vci
    public final void LJIIIIZZ(View view, int i, int i2, C80134Vcg c80134Vcg) {
        LJIJJ(LLIL, view);
        if (LJIILLIIL()) {
            int LJJJZ = C0A2.LJJJZ(view) + C0A2.LJJJLIIL(view);
            c80134Vcg.LJ += LJJJZ;
            c80134Vcg.LJFF += LJJJZ;
            return;
        }
        int LJJIZ = C0A2.LJJIZ(view) + C0A2.LJJLI(view);
        c80134Vcg.LJ += LJJIZ;
        c80134Vcg.LJFF += LJJIZ;
    }

    public final int LLILLIZIL(int i, C0A7 c0a7, C0AC c0ac, boolean z) {
        int i2;
        int LJI;
        if (!LJIILLIIL() && this.LLD) {
            int LJIIJ = i - this.LLII.LJIIJ();
            if (LJIIJ <= 0) {
                return 0;
            }
            i2 = LLILLL(LJIIJ, c0a7, c0ac);
        } else {
            int LJI2 = this.LLII.LJI() - i;
            if (LJI2 <= 0) {
                return 0;
            }
            i2 = -LLILLL(-LJI2, c0a7, c0ac);
        }
        int i3 = i + i2;
        if (z && (LJI = this.LLII.LJI() - i3) > 0) {
            this.LLII.LJIILL(LJI);
            return LJI + i2;
        }
        return i2;
    }

    public final int LLILLJJLI(int i, C0A7 c0a7, C0AC c0ac, boolean z) {
        int i2;
        int LJIIJ;
        if (!LJIILLIIL() && this.LLD) {
            int LJI = this.LLII.LJI() - i;
            if (LJI <= 0) {
                return 0;
            }
            i2 = LLILLL(-LJI, c0a7, c0ac);
        } else {
            int LJIIJ2 = i - this.LLII.LJIIJ();
            if (LJIIJ2 <= 0) {
                return 0;
            }
            i2 = -LLILLL(LJIIJ2, c0a7, c0ac);
        }
        int i3 = i + i2;
        if (z && (LJIIJ = i3 - this.LLII.LJIIJ()) > 0) {
            this.LLII.LJIILL(-LJIIJ);
            return i2 - LJIIJ;
        }
        return i2;
    }
}
