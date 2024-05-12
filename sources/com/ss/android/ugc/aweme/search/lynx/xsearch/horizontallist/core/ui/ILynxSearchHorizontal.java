package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import X.C49158JRa;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public interface ILynxSearchHorizontal {
    public static final C49158JRa LJJIIJ = C49158JRa.LIZ;

    /* loaded from: classes9.dex */
    public static final class ActiveArea implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("height")
        public float height;

        @InterfaceC65349Pkn("width")
        public float width;

        @InterfaceC65349Pkn("x")
        public float x;

        @InterfaceC65349Pkn("y")
        public float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ActiveArea() {
            /*
                r7 = this;
                r1 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r2 = r1
                r3 = r1
                r4 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal.ActiveArea.<init>():void");
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setHeight(float f) {
            this.height = f;
        }

        public final void setWidth(float f) {
            this.width = f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        public ActiveArea(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.width = f3;
            this.height = f4;
        }

        public /* synthetic */ ActiveArea(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
        }
    }

    /* loaded from: classes9.dex */
    public static final class HorizontalStyle implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("itemSpace")
        public float itemSpace;

        @InterfaceC65349Pkn("leftMargin")
        public float leftMargin;

        @InterfaceC65349Pkn("preferitemwidth")
        public float preferItemWidth;

        @InterfaceC65349Pkn("rightMargin")
        public float rightMargin;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HorizontalStyle() {
            /*
                r7 = this;
                r1 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r2 = r1
                r3 = r1
                r4 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal.HorizontalStyle.<init>():void");
        }

        public final float getItemSpace() {
            return this.itemSpace;
        }

        public final float getLeftMargin() {
            return this.leftMargin;
        }

        public final float getPreferItemWidth() {
            return this.preferItemWidth;
        }

        public final float getRightMargin() {
            return this.rightMargin;
        }

        public final void setItemSpace(float f) {
            this.itemSpace = f;
        }

        public final void setLeftMargin(float f) {
            this.leftMargin = f;
        }

        public final void setPreferItemWidth(float f) {
            this.preferItemWidth = f;
        }

        public final void setRightMargin(float f) {
            this.rightMargin = f;
        }

        public HorizontalStyle(float f, float f2, float f3, float f4) {
            this.leftMargin = f;
            this.rightMargin = f2;
            this.itemSpace = f3;
            this.preferItemWidth = f4;
        }

        public /* synthetic */ HorizontalStyle(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
        }
    }

    /* loaded from: classes9.dex */
    public static final class ScrollAnchorInfo implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("anchormargin")
        public int anchorMargin;

        @InterfaceC65349Pkn("anchortype")
        public String anchorType;

        @InterfaceC65349Pkn("index")
        public Integer index;

        @InterfaceC65349Pkn("offset")
        public int scrollOffset;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ScrollAnchorInfo() {
            /*
                r7 = this;
                r1 = 0
                r3 = 0
                r5 = 15
                r0 = r7
                r2 = r1
                r4 = r3
                r6 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal.ScrollAnchorInfo.<init>():void");
        }

        public final int getAnchorMargin() {
            return this.anchorMargin;
        }

        public final String getAnchorType() {
            return this.anchorType;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        public final void setAnchorMargin(int i) {
            this.anchorMargin = i;
        }

        public final void setAnchorType(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.anchorType = str;
        }

        public final void setIndex(Integer num) {
            this.index = num;
        }

        public final void setScrollOffset(int i) {
            this.scrollOffset = i;
        }

        public ScrollAnchorInfo(Integer num, String anchorType, int i, int i2) {
            o.LJIIIZ(anchorType, "anchorType");
            this.index = num;
            this.anchorType = anchorType;
            this.anchorMargin = i;
            this.scrollOffset = i2;
        }

        public /* synthetic */ ScrollAnchorInfo(Integer num, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? "left" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
        }
    }
}
