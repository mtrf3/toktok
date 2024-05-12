package com.ss.android.vesdk.model;

import X.C48339Iy7;
import X.C84127Wzz;
import X.Q89;
import X.X1D;

/* loaded from: classes13.dex */
public class BefTextLayout {
    public long backColor;
    public int charSize;
    public String familyName;
    public boolean isPlaceholder;
    public int letterSpacing;
    public int lineCount;
    public float lineHeight;
    public int lineWidth;
    public int split;
    public int textAlign;
    public long textColor;
    public int textIndent;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BefTextLayout{charSize=");
        LIZ.append(this.charSize);
        LIZ.append(", letterSpacing=");
        LIZ.append(this.letterSpacing);
        LIZ.append(", lineWidth=");
        LIZ.append(this.lineWidth);
        LIZ.append(", lineHeight=");
        LIZ.append(this.lineHeight);
        LIZ.append(", textAlign=");
        LIZ.append(this.textAlign);
        LIZ.append(", textIndent=");
        LIZ.append(this.textIndent);
        LIZ.append(", split=");
        LIZ.append(this.split);
        LIZ.append(", lineCount=");
        LIZ.append(this.lineCount);
        LIZ.append(", familyName='");
        Q89.LIZIZ(LIZ, this.familyName, '\'', ", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", backColor=");
        LIZ.append(this.backColor);
        LIZ.append(", isPlaceholder=");
        return C48339Iy7.LIZJ(LIZ, this.isPlaceholder, '}', LIZ);
    }

    public long getBackColor() {
        return this.backColor;
    }

    public int getCharSize() {
        return this.charSize;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getLetterSpacing() {
        return this.letterSpacing;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public float getLineHeight() {
        return this.lineHeight;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public int getSplit() {
        return this.split;
    }

    public int getTextAlign() {
        return this.textAlign;
    }

    public long getTextColor() {
        return this.textColor;
    }

    public int getTextIndent() {
        return this.textIndent;
    }

    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public static BefTextLayout readFromByteArray(byte[][] bArr) {
        C84127Wzz c84127Wzz = new C84127Wzz(bArr[0]);
        BefTextLayout befTextLayout = new BefTextLayout();
        befTextLayout.setBackColor(c84127Wzz.LJ().longValue());
        befTextLayout.setCharSize(c84127Wzz.LIZJ());
        int LIZJ = c84127Wzz.LIZJ();
        befTextLayout.setFamilyName(c84127Wzz.LIZLLL(LIZJ, LIZJ));
        befTextLayout.setLetterSpacing(c84127Wzz.LIZJ());
        befTextLayout.setLineCount(c84127Wzz.LIZJ());
        befTextLayout.setLineHeight(c84127Wzz.LIZJ());
        befTextLayout.setLineWidth(c84127Wzz.LIZJ());
        befTextLayout.setPlaceholder(c84127Wzz.LIZ());
        befTextLayout.setSplit(c84127Wzz.LIZJ());
        befTextLayout.setTextAlign(c84127Wzz.LIZJ());
        befTextLayout.setTextColor(c84127Wzz.LJ().longValue());
        befTextLayout.setTextIndent(c84127Wzz.LIZJ());
        return befTextLayout;
    }

    public void setBackColor(long j) {
        this.backColor = j;
    }

    public void setCharSize(int i) {
        this.charSize = i;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setLetterSpacing(int i) {
        this.letterSpacing = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setLineHeight(float f) {
        this.lineHeight = f;
    }

    public void setLineWidth(int i) {
        this.lineWidth = i;
    }

    public void setPlaceholder(boolean z) {
        this.isPlaceholder = z;
    }

    public void setSplit(int i) {
        this.split = i;
    }

    public void setTextAlign(int i) {
        this.textAlign = i;
    }

    public void setTextColor(long j) {
        this.textColor = j;
    }

    public void setTextIndent(int i) {
        this.textIndent = i;
    }
}
