package com.bytedance.lynx.spark.schema.model;

import X.C141335gf;
import X.C3C5;
import X.C60936Nvo;
import X.C76800UCe;
import X.EnumC39924Flg;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkPopupSchemaParam extends AbsSparkPopupSchemaParam {
    public long resizeDurationInMillSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkPopupSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bytedance.lynx.spark.schema.model.SparkSchemaParam
    public void adjustValues() {
        if (getSelfAdaptiveHeight()) {
            setHeight(-1);
        }
        if (getHeight() == -1) {
            String gravity = getGravity();
            int hashCode = gravity.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode == -1364013995 && gravity.equals("center")) {
                    setHeight(C60936Nvo.LIZ(LiveChatShowDelayForHotLiveSetting.DEFAULT));
                }
            } else if (gravity.equals("bottom")) {
                setHeight(C60936Nvo.LIZJ(null));
            }
        }
        if (getWidth() == -1) {
            String gravity2 = getGravity();
            int hashCode2 = gravity2.hashCode();
            if (hashCode2 != -1383228885) {
                if (hashCode2 == -1364013995 && gravity2.equals("center")) {
                    setWidth(C60936Nvo.LIZ(300));
                }
            } else if (gravity2.equals("bottom")) {
                setWidth(C60936Nvo.LIZLLL(null));
            }
        }
        if (!getSelfAdaptiveHeight() && getVariableHeight() > getHeight()) {
            setDragHeight(getVariableHeight());
            setDragBack(true);
            setDragByGesture(true);
            setEnablePullDownClose(true);
            setTransitionAnimation("bottom");
            setGravity("bottom");
        }
        if (getMinMarginTop() > 0) {
            setKeyboardAdjust(2);
        }
        if (getForbiddenAnim()) {
            setHideLoading(true);
        }
        if (getTransStatusBar()) {
            setKeyboardCompat(true);
        }
        try {
            long parseFloat = CastFloatProtector.parseFloat(getResizeDuration()) * 1000;
            this.resizeDurationInMillSeconds = parseFloat;
            if (parseFloat < 0) {
                this.resizeDurationInMillSeconds = 300L;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final long getResizeDurationInMillSeconds() {
        return this.resizeDurationInMillSeconds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkPopupSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        o.LJIIJ(engineType, "engineType");
        this.resizeDurationInMillSeconds = 300L;
    }

    public static boolean LIZ(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            return true;
        }
        return false;
    }

    public final String getRealGravity(Context context) {
        String gravity = getGravity();
        if (LIZ(context) && getLandscapeGravity().length() > 0) {
            return getLandscapeGravity();
        }
        return gravity;
    }

    public final String getRealGravityWithoutDefault(Context context) {
        String gravityWithoutDefault = getGravityWithoutDefault();
        if (LIZ(context) && getLandscapeGravity().length() > 0) {
            return getLandscapeGravity();
        }
        return gravityWithoutDefault;
    }

    public final int getRealHeight(Context context) {
        int height = getHeight();
        if (LIZ(context) && getLandscapeHeight() > 0) {
            return getLandscapeHeight();
        }
        return height;
    }

    public final String getRealTransitionAnimation(Context context) {
        String transitionAnimation = getTransitionAnimation();
        if (LIZ(context) && getLandscapeTransitionAnimation().length() > 0) {
            return getLandscapeTransitionAnimation();
        }
        return transitionAnimation;
    }

    public final int getRealWidth(Context context) {
        int width = getWidth();
        if (LIZ(context) && getLandscapeWidth() > 0) {
            return getLandscapeWidth();
        }
        return width;
    }

    public final void setResizeDurationInMillSeconds(long j) {
        this.resizeDurationInMillSeconds = j;
    }

    public /* synthetic */ SparkPopupSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}
