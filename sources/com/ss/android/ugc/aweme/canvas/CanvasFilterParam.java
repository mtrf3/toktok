package com.ss.android.ugc.aweme.canvas;

import X.C163556bP;
import X.C16880lQ;
import X.OSZ;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CanvasFilterParam implements Serializable {
    public static final C163556bP Companion = new Object() { // from class: X.6bP
    };
    public int animEndTime;
    public String animJsonParam;
    public String animPath;
    public int animStartTime;
    public float degree;
    public String effectId;
    public OSZ<Float, Float> leftTopPoint;
    public int nickNameStyle;
    public OSZ<Float, Float> rightBottomPoint;
    public float transX;
    public float transY;
    public int transformType;
    public float volume;
    public int clipIndex = -2;
    public float scaleFactor = 1.0f;
    public int borderColor = -1;
    public int borderWidthPx = -2;

    public static /* synthetic */ void getTransformType$annotations() {
    }

    public final boolean isValid() {
        if (this.clipIndex != -2) {
            return true;
        }
        return false;
    }

    public CanvasFilterParam() {
        Float valueOf = Float.valueOf(-2.0f);
        this.leftTopPoint = new OSZ<>(valueOf, valueOf);
        this.rightBottomPoint = new OSZ<>(valueOf, valueOf);
        this.volume = -2.0f;
        this.transformType = 2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(CanvasFilterParam.class));
        LIZ.append('#');
        LIZ.append(hashCode());
        LIZ.append(",degree:");
        LIZ.append(this.degree);
        LIZ.append(",transX:");
        LIZ.append(this.transX);
        LIZ.append(",transY:");
        LIZ.append(this.transY);
        LIZ.append(",scale:");
        LIZ.append(this.scaleFactor);
        LIZ.append(",effectId:");
        LIZ.append(this.effectId);
        LIZ.append(",animatePath:");
        LIZ.append(this.animPath);
        LIZ.append(",animJson:");
        LIZ.append(this.animJsonParam);
        return X1D.LIZIZ(LIZ);
    }

    public final int getAnimEndTime() {
        return this.animEndTime;
    }

    public final String getAnimJsonParam() {
        return this.animJsonParam;
    }

    public final String getAnimPath() {
        return this.animPath;
    }

    public final int getAnimStartTime() {
        return this.animStartTime;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidthPx() {
        return this.borderWidthPx;
    }

    public final int getClipIndex() {
        return this.clipIndex;
    }

    public final float getDegree() {
        return this.degree;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final OSZ<Float, Float> getLeftTopPoint() {
        return this.leftTopPoint;
    }

    public final int getNickNameStyle() {
        return this.nickNameStyle;
    }

    public final OSZ<Float, Float> getRightBottomPoint() {
        return this.rightBottomPoint;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public final int getTransformType() {
        return this.transformType;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final void setAnimEndTime(int i) {
        this.animEndTime = i;
    }

    public final void setAnimJsonParam(String str) {
        this.animJsonParam = str;
    }

    public final void setAnimPath(String str) {
        this.animPath = str;
    }

    public final void setAnimStartTime(int i) {
        this.animStartTime = i;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderWidthPx(int i) {
        this.borderWidthPx = i;
    }

    public final void setClipIndex(int i) {
        this.clipIndex = i;
    }

    public final void setDegree(float f) {
        this.degree = f;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setLeftTopPoint(OSZ<Float, Float> osz) {
        o.LJIIIZ(osz, "<set-?>");
        this.leftTopPoint = osz;
    }

    public final void setNickNameStyle(int i) {
        this.nickNameStyle = i;
    }

    public final void setRightBottomPoint(OSZ<Float, Float> osz) {
        o.LJIIIZ(osz, "<set-?>");
        this.rightBottomPoint = osz;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    public final void setTransX(float f) {
        this.transX = f;
    }

    public final void setTransY(float f) {
        this.transY = f;
    }

    public final void setTransformType(int i) {
        this.transformType = i;
    }

    public final void setVolume(float f) {
        this.volume = f;
    }
}
