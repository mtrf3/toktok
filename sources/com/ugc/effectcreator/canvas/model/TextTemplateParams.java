package com.ugc.effectcreator.canvas.model;

import X.F9E;
import X.OSZ;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TextTemplateParams extends F9E {
    public final List<Double> bounding_box;
    public final double duration;
    public final int order_in_layer;
    public final List<Float> position;
    public final double rotation;
    public final List<Double> scale;
    public final float start_time;
    public final List<TextContent> text_list;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextTemplateParams() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            r11 = 255(0xff, float:3.57E-43)
            r0 = r13
            r4 = r1
            r7 = r2
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ugc.effectcreator.canvas.model.TextTemplateParams.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextTemplateParams copy$default(TextTemplateParams textTemplateParams, List list, double d, List list2, int i, float f, double d2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = textTemplateParams.position;
        }
        if ((i2 & 2) != 0) {
            d = textTemplateParams.rotation;
        }
        if ((i2 & 4) != 0) {
            list2 = textTemplateParams.scale;
        }
        if ((i2 & 8) != 0) {
            i = textTemplateParams.order_in_layer;
        }
        if ((i2 & 16) != 0) {
            f = textTemplateParams.start_time;
        }
        if ((i2 & 32) != 0) {
            d2 = textTemplateParams.duration;
        }
        if ((i2 & 64) != 0) {
            list3 = textTemplateParams.bounding_box;
        }
        if ((i2 & 128) != 0) {
            list4 = textTemplateParams.text_list;
        }
        return textTemplateParams.copy(list, d, list2, i, f, d2, list3, list4);
    }

    public final TextTemplateParams copy(List<Float> position, double d, List<Double> scale, int i, float f, double d2, List<Double> bounding_box, List<TextContent> text_list) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(bounding_box, "bounding_box");
        o.LJIIIZ(text_list, "text_list");
        return new TextTemplateParams(position, d, scale, i, f, d2, bounding_box, text_list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.position, Double.valueOf(this.rotation), this.scale, Integer.valueOf(this.order_in_layer), Float.valueOf(this.start_time), Double.valueOf(this.duration), this.bounding_box, this.text_list};
    }

    public final OSZ<Float, Float> boundingBox() {
        if (this.bounding_box.size() != 4) {
            return null;
        }
        return new OSZ<>(Float.valueOf((float) (((Number) ListProtector.get(this.bounding_box, 2)).doubleValue() - ((Number) ListProtector.get(this.bounding_box, 0)).doubleValue())), Float.valueOf((float) (((Number) ListProtector.get(this.bounding_box, 3)).doubleValue() - ((Number) ListProtector.get(this.bounding_box, 1)).doubleValue())));
    }

    public final List<RectF> textsBounds() {
        List<TextContent> list = this.text_list;
        ArrayList arrayList = new ArrayList();
        for (TextContent textContent : list) {
            if (textContent.getBounding_box().size() == 4) {
                arrayList.add(new RectF((((float) ((Number) ListProtector.get(textContent.getBounding_box(), 0)).doubleValue()) / 2.0f) + 0.5f, 0.5f - (((float) ((Number) ListProtector.get(textContent.getBounding_box(), 3)).doubleValue()) / 2.0f), (((float) ((Number) ListProtector.get(textContent.getBounding_box(), 2)).doubleValue()) / 2.0f) + 0.5f, 0.5f - (((float) ((Number) ListProtector.get(textContent.getBounding_box(), 1)).doubleValue()) / 2.0f)));
            }
        }
        return arrayList;
    }

    public final List<Double> getBounding_box() {
        return this.bounding_box;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final int getOrder_in_layer() {
        return this.order_in_layer;
    }

    public final List<Float> getPosition() {
        return this.position;
    }

    public final double getRotation() {
        return this.rotation;
    }

    public final List<Double> getScale() {
        return this.scale;
    }

    public final float getStart_time() {
        return this.start_time;
    }

    public final List<TextContent> getText_list() {
        return this.text_list;
    }

    public final String textContent(int i) {
        if (i >= 0 && i <= this.text_list.size()) {
            for (TextContent textContent : this.text_list) {
                if (textContent.getIndex() == i) {
                    return textContent.getValue();
                }
            }
        }
        return "";
    }

    public TextTemplateParams(List<Float> position, double d, List<Double> scale, int i, float f, double d2, List<Double> bounding_box, List<TextContent> text_list) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(bounding_box, "bounding_box");
        o.LJIIIZ(text_list, "text_list");
        this.position = position;
        this.rotation = d;
        this.scale = scale;
        this.order_in_layer = i;
        this.start_time = f;
        this.duration = d2;
        this.bounding_box = bounding_box;
        this.text_list = text_list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextTemplateParams(java.util.List r35, double r36, java.util.List r38, int r39, float r40, double r41, java.util.List r43, java.util.List r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r34 = this;
            r3 = r45
            r17 = r44
            r9 = r36
            r16 = r43
            r8 = r35
            r11 = r38
            r12 = r39
            r14 = r41
            r0 = r3 & 1
            r13 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r13)
            r18 = 0
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L27
            java.lang.Float[] r0 = new java.lang.Float[r2]
            r0[r18] = r1
            r0[r7] = r1
            java.util.List r8 = X.C47261Igj.LJJIJIIJI(r0)
        L27:
            r0 = r3 & 2
            r5 = 0
            if (r0 == 0) goto L2f
            r9 = 0
        L2f:
            r0 = r3 & 4
            if (r0 == 0) goto L45
            java.lang.Double[] r1 = new java.lang.Double[r2]
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r1[r18] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r1[r7] = r0
            java.util.List r11 = X.C47261Igj.LJJIJIIJI(r1)
        L45:
            r0 = r3 & 8
            if (r0 == 0) goto L4a
            r12 = 0
        L4a:
            r0 = r3 & 16
            if (r0 == 0) goto Lb0
        L4e:
            r0 = r3 & 32
            if (r0 == 0) goto L54
            r14 = 0
        L54:
            r0 = r3 & 64
            if (r0 == 0) goto L78
            r0 = 4
            java.lang.Double[] r4 = new java.lang.Double[r0]
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r4[r18] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r4[r7] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r4[r2] = r0
            r1 = 3
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r4[r1] = r0
            java.util.List r16 = X.C47261Igj.LJJIJIIJI(r4)
        L78:
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Laa
            com.ugc.effectcreator.canvas.model.TextContent[] r0 = new com.ugc.effectcreator.canvas.model.TextContent[r2]
            com.ugc.effectcreator.canvas.model.TextContent r17 = new com.ugc.effectcreator.canvas.model.TextContent
            r19 = 0
            r27 = 0
            r26 = 0
            r20 = 0
            r21 = 0
            r24 = 31
            r23 = r19
            r25 = r19
            r17.<init>(r18, r19, r20, r21, r23, r24, r25)
            r0[r18] = r17
            com.ugc.effectcreator.canvas.model.TextContent r25 = new com.ugc.effectcreator.canvas.model.TextContent
            r28 = r20
            r29 = r21
            r31 = r27
            r32 = r24
            r33 = r27
            r25.<init>(r26, r27, r28, r29, r31, r32, r33)
            r0[r7] = r25
            java.util.List r17 = X.C47261Igj.LJJIJIIJI(r0)
        Laa:
            r7 = r34
            r7.<init>(r8, r9, r11, r12, r13, r14, r16, r17)
            return
        Lb0:
            r13 = r40
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ugc.effectcreator.canvas.model.TextTemplateParams.<init>(java.util.List, double, java.util.List, int, float, double, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
