package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.ies.sdk.widgets.PropertyResolver;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.TDw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74296TDw extends C74295TDv {
    public static boolean hasInit;
    public static Field renderNode;
    public static Method setOverlapMethod;
    public static boolean useAlphaOpt;
    public float mAlpha;
    public ConstraintLayout mContainer;
    public int mFlags;
    public boolean mForceHasOverlappingRenderingCompat;
    public PropertyResolver mPropertyResolver;
    public float mTranslationX;
    public float mTranslationY;
    public int mVisibility;

    private void clearFlags() {
        this.mFlags = 0;
    }

    public static Object com_bytedance_ies_sdk_widgets_MultiPropertyGroup_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6544128095290212432"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static boolean canOptAlpha() {
        if (useAlphaOpt) {
            return true;
        }
        return false;
    }

    private void transform() {
        if (this.mContainer == null || this.mFlags == 0) {
            return;
        }
        for (int i = 0; i < this.mCount; i++) {
            View view = getViews(this.mContainer)[i];
            if (view != null) {
                if (hasFlag(2)) {
                    transformTranslationX(view);
                }
                if (hasFlag(4)) {
                    transformTranslationY(view);
                }
                if (hasFlag(1)) {
                    transformAlpha(view);
                }
                if (hasFlag(8)) {
                    resolveVisibility(view);
                }
            }
        }
        clearFlags();
    }

    public static void initAlphaOpt() {
        if (canOptAlpha()) {
            try {
                Field declaredField = View.class.getDeclaredField("mRenderNode");
                renderNode = declaredField;
                declaredField.setAccessible(true);
                Method declaredMethod = renderNode.getType().getDeclaredMethod("setHasOverlappingRendering", Boolean.TYPE);
                setOverlapMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.AbstractC019505v, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
    }

    public C74296TDw(Context context) {
        super(context);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }

    private boolean hasFlag(int i) {
        if ((this.mFlags & i) == i) {
            return true;
        }
        return false;
    }

    private void resolveVisibility(View view) {
        int i;
        boolean z;
        int visibility = view.getVisibility();
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            i = propertyResolver.getResolvedVisibility(view.getId());
        } else {
            i = this.mVisibility;
        }
        view.setVisibility(i);
        if (i != visibility) {
            PropertyResolver propertyResolver2 = this.mPropertyResolver;
            int id = view.getId();
            if (i == 8) {
                z = true;
            } else {
                z = false;
            }
            propertyResolver2.onHiddenChanged(id, z);
        }
    }

    private void transformAlpha(View view) {
        float f;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedAlpha(view.getId());
        } else {
            f = this.mAlpha;
        }
        view.setAlpha(f);
    }

    private void transformTranslationX(View view) {
        float transformedTranslationX;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            transformedTranslationX = propertyResolver.getResolvedTranslationX(view.getId());
        } else {
            transformedTranslationX = getTransformedTranslationX(view);
        }
        view.setTranslationX(transformedTranslationX);
    }

    private void transformTranslationY(View view) {
        float transformedTranslationY;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            transformedTranslationY = propertyResolver.getResolvedTranslationY(view.getId());
        } else {
            transformedTranslationY = getTransformedTranslationY(view);
        }
        view.setTranslationY(transformedTranslationY);
    }

    public void forceHasOverlappingRenderingCompat(boolean z) {
        boolean hasOverlappingRendering;
        int i;
        int i2;
        if (!hasInit) {
            useAlphaOpt = LayeredElementConfiguration.INSTANCE.getUseAlphaOpt().invoke().booleanValue();
            initAlphaOpt();
            hasInit = true;
        }
        if (this.mContainer == null || !canOptAlpha() || this.mForceHasOverlappingRenderingCompat == z) {
            return;
        }
        this.mForceHasOverlappingRenderingCompat = z;
        if (setOverlapMethod == null || renderNode == null) {
            return;
        }
        for (int i3 = 0; i3 < this.mCount; i3++) {
            View view = getViews(this.mContainer)[i3];
            if (view != null) {
                Object tag = view.getTag(R.id.g0c);
                if (!(tag instanceof Boolean) || ((Boolean) tag).booleanValue()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        hasOverlappingRendering = view.getHasOverlappingRendering();
                    } else {
                        hasOverlappingRendering = view.hasOverlappingRendering();
                    }
                    try {
                        Object obj = renderNode.get(view);
                        Object tag2 = view.getTag(R.id.g0b);
                        if (tag2 instanceof Integer) {
                            i = ((Integer) tag2).intValue();
                        } else {
                            i = 0;
                        }
                        if (z) {
                            int i4 = i - 1;
                            if (obj != null && i4 == 0) {
                                com_bytedance_ies_sdk_widgets_MultiPropertyGroup_java_lang_reflect_Method_invoke(setOverlapMethod, obj, new Object[]{Boolean.valueOf(hasOverlappingRendering)});
                            }
                            i2 = Math.max(i4, 0);
                        } else {
                            i2 = i + 1;
                            if (obj != null) {
                                com_bytedance_ies_sdk_widgets_MultiPropertyGroup_java_lang_reflect_Method_invoke(setOverlapMethod, obj, new Object[]{Boolean.FALSE});
                            }
                        }
                        view.setTag(R.id.g0b, Integer.valueOf(i2));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }

    public float getTransformedTranslationX(View view) {
        return this.mTranslationX;
    }

    public float getTransformedTranslationY(View view) {
        return this.mTranslationY;
    }

    @Override // X.AbstractC019505v
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // X.C74295TDv
    public void onViewAdded(View view) {
        if (isReferenced(view.getId())) {
            invalidateHelper();
            if (this.mTranslationX != 0.0f) {
                transformTranslationX(view);
            }
            if (this.mTranslationY != 0.0f) {
                transformTranslationY(view);
            }
            if (this.mAlpha < 1.0f) {
                transformAlpha(view);
            }
            if (this.mVisibility == 8) {
                resolveVisibility(view);
            }
        }
    }

    @Override // X.C74295TDv
    public void onViewRemoved(View view) {
        if (isReferenced(view.getId())) {
            invalidateHelper();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (this.mAlpha != f) {
            super.setAlpha(f);
            this.mAlpha = f;
            this.mFlags |= 1;
            transform();
        }
    }

    public void setPropertyResolver(PropertyResolver propertyResolver) {
        this.mPropertyResolver = propertyResolver;
    }

    @Override // X.C74295TDv, X.AbstractC019505v
    public void setReferencedIds(int[] iArr) {
        super.setReferencedIds(iArr);
        if (this.mTranslationX != 0.0f) {
            this.mFlags |= 2;
        }
        if (this.mTranslationY != 0.0f) {
            this.mFlags |= 4;
        }
        if (this.mAlpha < 1.0f) {
            this.mFlags |= 1;
        }
        if (this.mVisibility == 8) {
            this.mFlags |= 8;
        }
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (this.mTranslationX != f) {
            super.setTranslationX(f);
            this.mTranslationX = f;
            this.mFlags |= 2;
            transform();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (this.mTranslationY != f) {
            super.setTranslationY(f);
            this.mTranslationY = f;
            this.mFlags |= 4;
            transform();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.mVisibility != i) {
            super.setVisibility(i);
            this.mVisibility = i;
            this.mFlags |= 8;
            transform();
        }
    }

    @Override // X.AbstractC019505v
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        transform();
    }

    @Override // X.C74295TDv, X.AbstractC019505v
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
    }

    public C74296TDw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }

    public C74296TDw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }
}
