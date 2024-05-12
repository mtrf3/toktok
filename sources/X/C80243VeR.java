package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.VeR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80243VeR extends View {
    public String LJLIL;
    public String LJLILLLLZI;
    public Bundle LJLJI;
    public InterfaceC80245VeT LJLJJI;

    public String getSceneName() {
        if (!TextUtils.isEmpty(this.LJLIL)) {
            return this.LJLIL;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
    }

    public String getSceneTag() {
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            return this.LJLILLLLZI;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
    }

    public Bundle getArguments() {
        return this.LJLJI;
    }

    public InterfaceC80245VeT getSceneComponentFactory() {
        return this.LJLJJI;
    }

    public void setArguments(Bundle bundle) {
        this.LJLJI = bundle;
    }

    public void setSceneComponentFactory(InterfaceC80245VeT interfaceC80245VeT) {
        this.LJLJJI = interfaceC80245VeT;
    }

    public void setSceneName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJLIL = str;
            return;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name can't be empty");
    }

    public void setSceneTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJLILLLLZI = str;
            return;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag can't be empty");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                suggestedMinimumWidth = size;
            }
        } else {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                suggestedMinimumHeight = size2;
            }
        } else {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }
}
