package com.google.android.flexbox;

import X.C28966BYk;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator<FlexboxLayout$LayoutParams> CREATOR = new C28966BYk();
    public int mAlignSelf;
    public float mFlexBasisPercent;
    public float mFlexGrow;
    public float mFlexShrink;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mMinHeight;
    public int mMinWidth;
    public int mOrder;
    public boolean mWrapBefore;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
    public final int getOrder() {
        return this.mOrder;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    public FlexboxLayout$LayoutParams(Parcel parcel) {
        super(0, 0);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        this.mOrder = parcel.readInt();
        this.mFlexGrow = parcel.readFloat();
        this.mFlexShrink = parcel.readFloat();
        this.mAlignSelf = parcel.readInt();
        this.mFlexBasisPercent = parcel.readFloat();
        this.mMinWidth = parcel.readInt();
        this.mMinHeight = parcel.readInt();
        this.mMaxWidth = parcel.readInt();
        this.mMaxHeight = parcel.readInt();
        this.mWrapBefore = parcel.readByte() != 0;
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

    public FlexboxLayout$LayoutParams(FlexboxLayout$LayoutParams flexboxLayout$LayoutParams) {
        super((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        this.mOrder = flexboxLayout$LayoutParams.mOrder;
        this.mFlexGrow = flexboxLayout$LayoutParams.mFlexGrow;
        this.mFlexShrink = flexboxLayout$LayoutParams.mFlexShrink;
        this.mAlignSelf = flexboxLayout$LayoutParams.mAlignSelf;
        this.mFlexBasisPercent = flexboxLayout$LayoutParams.mFlexBasisPercent;
        this.mMinWidth = flexboxLayout$LayoutParams.mMinWidth;
        this.mMinHeight = flexboxLayout$LayoutParams.mMinHeight;
        this.mMaxWidth = flexboxLayout$LayoutParams.mMaxWidth;
        this.mMaxHeight = flexboxLayout$LayoutParams.mMaxHeight;
        this.mWrapBefore = flexboxLayout$LayoutParams.mWrapBefore;
    }

    public FlexboxLayout$LayoutParams(int i) {
        super(new ViewGroup.LayoutParams(i, -2));
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }

    public FlexboxLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }

    public FlexboxLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }

    public FlexboxLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alb, R.attr.amz, R.attr.an0, R.attr.an1, R.attr.anc, R.attr.and, R.attr.ane, R.attr.anf, R.attr.anh, R.attr.anu});
        this.mOrder = obtainStyledAttributes.getInt(8, 1);
        this.mFlexGrow = obtainStyledAttributes.getFloat(2, 0.0f);
        this.mFlexShrink = obtainStyledAttributes.getFloat(3, 1.0f);
        this.mAlignSelf = obtainStyledAttributes.getInt(0, -1);
        this.mFlexBasisPercent = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        this.mWrapBefore = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mOrder);
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
