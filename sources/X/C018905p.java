package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.05p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C018905p extends ViewGroup.MarginLayoutParams {
    public int baselineToBaseline;
    public int bottomToBottom;
    public int bottomToTop;
    public float circleAngle;
    public int circleConstraint;
    public int circleRadius;
    public boolean constrainedHeight;
    public boolean constrainedWidth;
    public String constraintTag;
    public String dimensionRatio;
    public int dimensionRatioSide;
    public float dimensionRatioValue;
    public int editorAbsoluteX;
    public int editorAbsoluteY;
    public int endToEnd;
    public int endToStart;
    public int goneBottomMargin;
    public int goneEndMargin;
    public int goneLeftMargin;
    public int goneRightMargin;
    public int goneStartMargin;
    public int goneTopMargin;
    public int guideBegin;
    public int guideEnd;
    public float guidePercent;
    public boolean helped;
    public float horizontalBias;
    public int horizontalChainStyle;
    public boolean horizontalDimensionFixed;
    public float horizontalWeight;
    public boolean isGuideline;
    public boolean isHelper;
    public boolean isInPlaceholder;
    public boolean isVirtualGroup;
    public int leftToLeft;
    public int leftToRight;
    public int matchConstraintDefaultHeight;
    public int matchConstraintDefaultWidth;
    public int matchConstraintMaxHeight;
    public int matchConstraintMaxWidth;
    public int matchConstraintMinHeight;
    public int matchConstraintMinWidth;
    public float matchConstraintPercentHeight;
    public float matchConstraintPercentWidth;
    public boolean needsBaseline;
    public int orientation;
    public int resolveGoneLeftMargin;
    public int resolveGoneRightMargin;
    public int resolvedGuideBegin;
    public int resolvedGuideEnd;
    public float resolvedGuidePercent;
    public float resolvedHorizontalBias;
    public int resolvedLeftToLeft;
    public int resolvedLeftToRight;
    public int resolvedRightToLeft;
    public int resolvedRightToRight;
    public int rightToLeft;
    public int rightToRight;
    public int startToEnd;
    public int startToStart;
    public int topToBottom;
    public int topToTop;
    public float verticalBias;
    public int verticalChainStyle;
    public boolean verticalDimensionFixed;
    public float verticalWeight;
    public C018205i widget;

    public void validate() {
        this.isGuideline = false;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.constrainedWidth) {
            this.horizontalDimensionFixed = false;
            if (this.matchConstraintDefaultWidth == 0) {
                this.matchConstraintDefaultWidth = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.constrainedHeight) {
            this.verticalDimensionFixed = false;
            if (this.matchConstraintDefaultHeight == 0) {
                this.matchConstraintDefaultHeight = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.horizontalDimensionFixed = false;
            if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.constrainedWidth = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.verticalDimensionFixed = false;
            if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.constrainedHeight = true;
            }
        }
        if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
            this.isGuideline = true;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (!(this.widget instanceof C1AC)) {
                this.widget = new C1AC();
            }
            ((C1AC) this.widget).LJ(this.orientation);
        }
    }

    public void reset() {
        C018205i c018205i = this.widget;
        if (c018205i != null) {
            c018205i.reset();
        }
    }

    public C018905p(C018905p c018905p) {
        super((ViewGroup.MarginLayoutParams) c018905p);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C018205i();
        this.helped = false;
        this.guideBegin = c018905p.guideBegin;
        this.guideEnd = c018905p.guideEnd;
        this.guidePercent = c018905p.guidePercent;
        this.leftToLeft = c018905p.leftToLeft;
        this.leftToRight = c018905p.leftToRight;
        this.rightToLeft = c018905p.rightToLeft;
        this.rightToRight = c018905p.rightToRight;
        this.topToTop = c018905p.topToTop;
        this.topToBottom = c018905p.topToBottom;
        this.bottomToTop = c018905p.bottomToTop;
        this.bottomToBottom = c018905p.bottomToBottom;
        this.baselineToBaseline = c018905p.baselineToBaseline;
        this.circleConstraint = c018905p.circleConstraint;
        this.circleRadius = c018905p.circleRadius;
        this.circleAngle = c018905p.circleAngle;
        this.startToEnd = c018905p.startToEnd;
        this.startToStart = c018905p.startToStart;
        this.endToStart = c018905p.endToStart;
        this.endToEnd = c018905p.endToEnd;
        this.goneLeftMargin = c018905p.goneLeftMargin;
        this.goneTopMargin = c018905p.goneTopMargin;
        this.goneRightMargin = c018905p.goneRightMargin;
        this.goneBottomMargin = c018905p.goneBottomMargin;
        this.goneStartMargin = c018905p.goneStartMargin;
        this.goneEndMargin = c018905p.goneEndMargin;
        this.horizontalBias = c018905p.horizontalBias;
        this.verticalBias = c018905p.verticalBias;
        this.dimensionRatio = c018905p.dimensionRatio;
        this.dimensionRatioValue = c018905p.dimensionRatioValue;
        this.dimensionRatioSide = c018905p.dimensionRatioSide;
        this.horizontalWeight = c018905p.horizontalWeight;
        this.verticalWeight = c018905p.verticalWeight;
        this.horizontalChainStyle = c018905p.horizontalChainStyle;
        this.verticalChainStyle = c018905p.verticalChainStyle;
        this.constrainedWidth = c018905p.constrainedWidth;
        this.constrainedHeight = c018905p.constrainedHeight;
        this.matchConstraintDefaultWidth = c018905p.matchConstraintDefaultWidth;
        this.matchConstraintDefaultHeight = c018905p.matchConstraintDefaultHeight;
        this.matchConstraintMinWidth = c018905p.matchConstraintMinWidth;
        this.matchConstraintMaxWidth = c018905p.matchConstraintMaxWidth;
        this.matchConstraintMinHeight = c018905p.matchConstraintMinHeight;
        this.matchConstraintMaxHeight = c018905p.matchConstraintMaxHeight;
        this.matchConstraintPercentWidth = c018905p.matchConstraintPercentWidth;
        this.matchConstraintPercentHeight = c018905p.matchConstraintPercentHeight;
        this.editorAbsoluteX = c018905p.editorAbsoluteX;
        this.editorAbsoluteY = c018905p.editorAbsoluteY;
        this.orientation = c018905p.orientation;
        this.horizontalDimensionFixed = c018905p.horizontalDimensionFixed;
        this.verticalDimensionFixed = c018905p.verticalDimensionFixed;
        this.needsBaseline = c018905p.needsBaseline;
        this.isGuideline = c018905p.isGuideline;
        this.resolvedLeftToLeft = c018905p.resolvedLeftToLeft;
        this.resolvedLeftToRight = c018905p.resolvedLeftToRight;
        this.resolvedRightToLeft = c018905p.resolvedRightToLeft;
        this.resolvedRightToRight = c018905p.resolvedRightToRight;
        this.resolveGoneLeftMargin = c018905p.resolveGoneLeftMargin;
        this.resolveGoneRightMargin = c018905p.resolveGoneRightMargin;
        this.resolvedHorizontalBias = c018905p.resolvedHorizontalBias;
        this.constraintTag = c018905p.constraintTag;
        this.widget = c018905p.widget;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveLayoutDirection(int r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018905p.resolveLayoutDirection(int):void");
    }

    public void setWidgetDebugName(String str) {
        this.widget.mDebugName = str;
    }

    public C018905p(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C018205i();
        this.helped = false;
    }

    public C018905p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C018205i();
        this.helped = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6s, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.akw, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.ang});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = C018805o.LIZ.get(index);
            switch (i3) {
                case 1:
                    this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                    this.circleConstraint = resourceId;
                    if (resourceId == -1) {
                        this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                    this.circleAngle = f;
                    if (f < 0.0f) {
                        this.circleAngle = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                    break;
                case 6:
                    this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                    break;
                case 7:
                    this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                    this.leftToLeft = resourceId2;
                    if (resourceId2 == -1) {
                        this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                    this.leftToRight = resourceId3;
                    if (resourceId3 == -1) {
                        this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                    this.rightToLeft = resourceId4;
                    if (resourceId4 == -1) {
                        this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                    this.rightToRight = resourceId5;
                    if (resourceId5 == -1) {
                        this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                    this.topToTop = resourceId6;
                    if (resourceId6 == -1) {
                        this.topToTop = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                    this.topToBottom = resourceId7;
                    if (resourceId7 == -1) {
                        this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                    this.bottomToTop = resourceId8;
                    if (resourceId8 == -1) {
                        this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                    this.bottomToBottom = resourceId9;
                    if (resourceId9 == -1) {
                        this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                    this.baselineToBaseline = resourceId10;
                    if (resourceId10 == -1) {
                        this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                    this.startToEnd = resourceId11;
                    if (resourceId11 == -1) {
                        this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                    this.startToStart = resourceId12;
                    if (resourceId12 == -1) {
                        this.startToStart = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                    this.endToStart = resourceId13;
                    if (resourceId13 == -1) {
                        this.endToStart = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                    this.endToEnd = resourceId14;
                    if (resourceId14 == -1) {
                        this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                    break;
                case 22:
                    this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                    break;
                case 23:
                    this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                    break;
                case 24:
                    this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                    break;
                case 25:
                    this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                    break;
                case 26:
                    this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                    break;
                case 27:
                    this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                    break;
                case 28:
                    this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                    break;
                case 29:
                    this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                    break;
                case 30:
                    this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                    break;
                case 31:
                    this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                            this.matchConstraintMinWidth = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                            this.matchConstraintMaxWidth = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                    this.matchConstraintDefaultWidth = 2;
                    break;
                case 36:
                    try {
                        this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                            this.matchConstraintMinHeight = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                            this.matchConstraintMaxHeight = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                    this.matchConstraintDefaultHeight = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                            this.dimensionRatio = LLLZLZ;
                            this.dimensionRatioValue = Float.NaN;
                            this.dimensionRatioSide = -1;
                            if (LLLZLZ != null) {
                                int length = LLLZLZ.length();
                                int indexOf = this.dimensionRatio.indexOf(44);
                                if (indexOf > 0 && indexOf < length - 1) {
                                    String substring = this.dimensionRatio.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.dimensionRatioSide = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.dimensionRatioSide = 1;
                                    }
                                    i = indexOf + 1;
                                } else {
                                    i = 0;
                                }
                                int indexOf2 = this.dimensionRatio.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = this.dimensionRatio.substring(i, indexOf2);
                                    String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = CastFloatProtector.parseFloat(substring2);
                                            float parseFloat2 = CastFloatProtector.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (this.dimensionRatioSide == 1) {
                                                    this.dimensionRatioValue = Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    this.dimensionRatioValue = Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = this.dimensionRatio.substring(i);
                                    if (substring4.length() > 0) {
                                        this.dimensionRatioValue = CastFloatProtector.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                            break;
                        case 46:
                            this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                            break;
                        case 47:
                            this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                            this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case C61447O9r.LJIIJ /* 49 */:
                            this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                            break;
                        case 50:
                            this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                            break;
                        case 51:
                            this.constraintTag = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        validate();
    }

    public C018905p(int i, int i2) {
        super(i, i2);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C018205i();
        this.helped = false;
    }
}
