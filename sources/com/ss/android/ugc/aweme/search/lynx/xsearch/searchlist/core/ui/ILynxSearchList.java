package com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui;

import X.InterfaceC65349Pkn;
import X.JRV;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public interface ILynxSearchList {
    public static final JRV LJJIIJZLJL = JRV.LIZ;

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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList.ActiveArea.<init>():void");
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

        @InterfaceC65349Pkn("rightMargin")
        public float rightMargin;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HorizontalStyle() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList.HorizontalStyle.<init>():void");
        }

        public final float getItemSpace() {
            return this.itemSpace;
        }

        public final float getLeftMargin() {
            return this.leftMargin;
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

        public final void setRightMargin(float f) {
            this.rightMargin = f;
        }

        public HorizontalStyle(float f, float f2, float f3) {
            this.leftMargin = f;
            this.rightMargin = f2;
            this.itemSpace = f3;
        }

        public /* synthetic */ HorizontalStyle(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
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

        /* JADX WARN: Multi-variable type inference failed */
        public ScrollAnchorInfo() {
            this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
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

        public ScrollAnchorInfo(Integer num, String anchorType, int i) {
            o.LJIIIZ(anchorType, "anchorType");
            this.index = num;
            this.anchorType = anchorType;
            this.anchorMargin = i;
        }

        public /* synthetic */ ScrollAnchorInfo(Integer num, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? "left" : str, (i2 & 4) != 0 ? 0 : i);
        }
    }
}
