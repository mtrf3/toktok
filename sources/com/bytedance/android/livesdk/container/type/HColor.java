package com.bytedance.android.livesdk.container.type;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HColor implements Serializable {
    public int color;
    public int colorDark;
    public int colorLight;

    public final int getColor() {
        return this.color;
    }

    public final int getColorDark() {
        return this.colorDark;
    }

    public final int getColorLight() {
        return this.colorLight;
    }

    public final int getColor(Context context) {
        Resources resources;
        Configuration configuration;
        int i;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return this.color;
        }
        if ((configuration.uiMode & 48) == 32) {
            i = this.colorDark;
        } else {
            i = this.colorLight;
        }
        if (i == 0) {
            return this.color;
        }
        return i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setColorDark(int i) {
        this.colorDark = i;
    }

    public final void setColorLight(int i) {
        this.colorLight = i;
    }
}
