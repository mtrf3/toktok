package com.bytedance.ies.sdk.widgets;

import X.C018205i;
import X.C018905p;
import X.C16310kV;
import X.C16330kX;
import X.C16880lQ;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayeredPlaceholderElement extends XmlViewHolderConstraintElement {
    public ConstraintProperty constraintProperty;
    public final LayeredConstraintLayout container;
    public View contentView;
    public final View placeholderView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayeredPlaceholderElement(View view, LayeredConstraintLayout container, PropertyResolver propertyResolver) {
        this(view, container, propertyResolver, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(propertyResolver, "propertyResolver");
    }

    public final void onDetachView() {
        transferProperties(this.contentView, this.placeholderView);
        int indexOfChild = this.container.indexOfChild(this.contentView);
        C16880lQ.LLD(this.container, this.contentView);
        this.container.addView(this.placeholderView, indexOfChild);
        View view = this.placeholderView;
        this.contentView = view;
        ConstraintProperty constraintProperty = new ConstraintProperty(view, this.constraintProperty);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        return this.constraintProperty;
    }

    public final LayeredConstraintLayout getContainer() {
        return this.container;
    }

    public final void onAttachView(View view) {
        Integer num;
        Integer num2;
        o.LJIIIZ(view, "view");
        this.contentView = view;
        Object tag = view.getTag(R.id.g0e);
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != -2 && intValue != -1) {
                this.placeholderView.getLayoutParams().width = intValue;
            }
        } else {
            ViewGroup.LayoutParams layoutParams = this.contentView.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                if (i != -2 && i != -1) {
                    this.placeholderView.getLayoutParams().width = layoutParams.width;
                }
                view.setTag(R.id.g0e, Integer.valueOf(layoutParams.width));
            }
        }
        Object tag2 = view.getTag(R.id.g0d);
        if ((tag2 instanceof Integer) && (num2 = (Integer) tag2) != null) {
            int intValue2 = num2.intValue();
            if (intValue2 != -2 && intValue2 != -1) {
                this.placeholderView.getLayoutParams().height = intValue2;
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.contentView.getLayoutParams();
            if (layoutParams2 != null) {
                int i2 = layoutParams2.height;
                if (i2 != -2 && i2 != -1) {
                    this.placeholderView.getLayoutParams().height = layoutParams2.height;
                }
                view.setTag(R.id.g0d, Integer.valueOf(layoutParams2.height));
            }
        }
        transferProperties(this.placeholderView, this.contentView);
        int indexOfChild = this.container.indexOfChild(this.placeholderView);
        C16880lQ.LLD(this.container, this.placeholderView);
        this.container.addView(this.contentView, indexOfChild);
        ConstraintProperty constraintProperty = new ConstraintProperty(this.contentView, this.constraintProperty);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    private final void transferProperties(View view, View view2) {
        view2.setVisibility(view.getVisibility());
        view2.setId(view.getId());
        view2.setAlpha(view.getAlpha());
        view2.setTranslationX(view.getTranslationX());
        view2.setTranslationY(view.getTranslationY());
        view2.setRotation(view.getRotation());
        view2.setRotationX(view.getRotationX());
        view2.setRotationY(view.getRotationY());
        view2.setScaleX(view.getScaleX());
        view2.setScaleY(view.getScaleY());
        view2.setPivotX(view.getPivotX());
        view2.setPivotY(view.getPivotY());
        if (C16330kX.LIZLLL(view)) {
            C16310kV.LJIIIZ(view2, C16310kV.LIZLLL(view));
        }
        view2.setLayoutParams(view.getLayoutParams());
        view2.setTag(view.getTag());
        Object tag = view.getTag(R.id.g0c);
        if (tag != null) {
            view2.setTag(R.id.g0c, tag);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayeredPlaceholderElement(View view, LayeredConstraintLayout container, PropertyResolver propertyResolver, C018205i c018205i) {
        super(view, propertyResolver);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(propertyResolver, "propertyResolver");
        this.container = container;
        if (LayeredElementConfiguration.INSTANCE.getDebug() && c018205i != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C018905p) && layoutParams != null) {
                Field declaredField = C018905p.class.getDeclaredField("widget");
                declaredField.setAccessible(true);
                declaredField.set(layoutParams, c018205i);
            }
        }
        this.placeholderView = view;
        this.contentView = view;
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = propertyResolver;
        this.constraintProperty = constraintProperty;
    }

    public /* synthetic */ LayeredPlaceholderElement(View view, LayeredConstraintLayout layeredConstraintLayout, PropertyResolver propertyResolver, C018205i c018205i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, layeredConstraintLayout, propertyResolver, (i & 8) != 0 ? null : c018205i);
    }
}
