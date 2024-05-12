package com.bytedance.ies.sdk.widgets;

import X.C16530kr;
import X.C47261Igj;
import X.ORY;
import X.X1D;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SpacingResolver {
    public final int endId;
    public final List<HorizontalConstraint> horizontalConstraints;
    public final int[] ids;
    public final LayeredElementContext layeredElementContext;
    public final int startId;

    /* loaded from: classes14.dex */
    public static final class HorizontalConstraint {
        public final int endMargin;
        public final int endToStart;
        public final int startMargin;
        public final int startToEnd;

        public static /* synthetic */ HorizontalConstraint copy$default(HorizontalConstraint horizontalConstraint, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = horizontalConstraint.startToEnd;
            }
            if ((i5 & 2) != 0) {
                i2 = horizontalConstraint.endToStart;
            }
            if ((i5 & 4) != 0) {
                i3 = horizontalConstraint.startMargin;
            }
            if ((i5 & 8) != 0) {
                i4 = horizontalConstraint.endMargin;
            }
            return horizontalConstraint.copy(i, i2, i3, i4);
        }

        public final HorizontalConstraint copy(int i, int i2, int i3, int i4) {
            return new HorizontalConstraint(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalConstraint)) {
                return false;
            }
            HorizontalConstraint horizontalConstraint = (HorizontalConstraint) obj;
            return this.startToEnd == horizontalConstraint.startToEnd && this.endToStart == horizontalConstraint.endToStart && this.startMargin == horizontalConstraint.startMargin && this.endMargin == horizontalConstraint.endMargin;
        }

        public int hashCode() {
            return (((((this.startToEnd * 31) + this.endToStart) * 31) + this.startMargin) * 31) + this.endMargin;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HorizontalConstraint(startToEnd=");
            LIZ.append(this.startToEnd);
            LIZ.append(", endToStart=");
            LIZ.append(this.endToStart);
            LIZ.append(", startMargin=");
            LIZ.append(this.startMargin);
            LIZ.append(", endMargin=");
            return b0.LIZJ(LIZ, this.endMargin, ')', LIZ);
        }

        public final int getEndMargin() {
            return this.endMargin;
        }

        public final int getEndToStart() {
            return this.endToStart;
        }

        public final int getStartMargin() {
            return this.startMargin;
        }

        public final int getStartToEnd() {
            return this.startToEnd;
        }

        public HorizontalConstraint(int i, int i2, int i3, int i4) {
            this.startToEnd = i;
            this.endToStart = i2;
            this.startMargin = i3;
            this.endMargin = i4;
        }
    }

    public final int[] getIds() {
        return this.ids;
    }

    public final int getStartId() {
        return this.startId;
    }

    public final void resolveSpacing(List<? extends ConstraintProperty> properties) {
        int endMargin;
        int startMargin;
        o.LJIIIZ(properties, "properties");
        for (ConstraintProperty constraintProperty : properties) {
            constraintProperty.removeConstraints(6);
            constraintProperty.removeConstraints(7);
            constraintProperty.apply();
        }
        int i = 0;
        for (HorizontalConstraint horizontalConstraint : this.horizontalConstraints) {
            int i2 = i + 1;
            if (i >= 0) {
                HorizontalConstraint horizontalConstraint2 = horizontalConstraint;
                ConstraintProperty constraintProperty2 = (ConstraintProperty) ListProtector.get(properties, i);
                if (constraintProperty2.getView().getVisibility() != 8) {
                    if (horizontalConstraint2.getStartToEnd() != -1) {
                        int i3 = this.startId;
                        int i4 = i - 1;
                        while (true) {
                            if (-1 >= i4) {
                                break;
                            }
                            if (((ConstraintProperty) ListProtector.get(properties, i4)).getView().getVisibility() != 8) {
                                i3 = ((ConstraintProperty) ListProtector.get(properties, i4)).id();
                                break;
                            } else if (((HorizontalConstraint) ListProtector.get(this.horizontalConstraints, i4)).getStartToEnd() == -1) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        if (i3 != -1) {
                            if (i3 == this.startId) {
                                startMargin = 0;
                            } else {
                                startMargin = horizontalConstraint2.getStartMargin();
                            }
                            constraintProperty2.connect(6, i3, 7, startMargin);
                            constraintProperty2.apply();
                        }
                    }
                    if (horizontalConstraint2.getEndToStart() != -1) {
                        int i5 = this.endId;
                        int size = this.horizontalConstraints.size();
                        int i6 = i2;
                        while (true) {
                            if (i6 >= size) {
                                break;
                            }
                            if (((ConstraintProperty) ListProtector.get(properties, i6)).getView().getVisibility() != 8) {
                                i5 = ((ConstraintProperty) ListProtector.get(properties, i6)).id();
                                break;
                            } else if (((HorizontalConstraint) ListProtector.get(this.horizontalConstraints, i6)).getEndToStart() == -1) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i5 != -1) {
                            if (i5 == this.endId) {
                                endMargin = 0;
                            } else {
                                endMargin = horizontalConstraint2.getEndMargin();
                            }
                            constraintProperty2.connect(7, i5, 6, endMargin);
                            constraintProperty2.apply();
                        }
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public SpacingResolver(LayeredElementContext layeredElementContext, int i, int i2, int... ids) {
        LayeredConstraintLayout.LayoutParams layoutParams;
        int i3;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(ids, "ids");
        this.layeredElementContext = layeredElementContext;
        this.startId = i;
        this.endId = i2;
        this.ids = ids;
        ArrayList arrayList = new ArrayList(ids.length);
        for (int i4 : ids) {
            ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(i4);
            int i5 = -1;
            if (constraintPropertyById != null && (layoutParams = constraintPropertyById.mParams) != null) {
                if (layoutParams.startToStart == -1 && layoutParams.endToEnd == -1) {
                    int[] iArr = this.ids;
                    if (iArr.length != 0) {
                        if (iArr.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        if (i4 == iArr[0] && layoutParams.startToEnd != this.startId) {
                            throw new IllegalArgumentException("The first item should be constraint to startId.");
                        }
                    }
                    int[] iArr2 = this.ids;
                    if (iArr2.length != 0 && i4 == ORY.LJJJJZ(iArr2) && layoutParams.endToStart != this.endId) {
                        throw new IllegalArgumentException("The last item should be constraint to endId.");
                    }
                } else {
                    throw new IllegalArgumentException("Only startToEnd and endToStart are supported.");
                }
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                i3 = layoutParams.startToEnd;
                i5 = layoutParams.endToStart;
            } else {
                i3 = -1;
            }
            o.LJI(layoutParams);
            arrayList.add(new HorizontalConstraint(i3, i5, C16530kr.LIZJ(layoutParams), C16530kr.LIZIZ(layoutParams)));
        }
        this.horizontalConstraints = arrayList;
    }
}
