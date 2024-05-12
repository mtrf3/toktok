package androidx.drawerlayout.widget;

import android.view.View;

/* loaded from: classes.dex */
public interface DrawerLayout$DrawerListener {
    void onDrawerClosed(View view);

    void onDrawerOpened(View view);

    void onDrawerSlide(View view, float f);

    void onDrawerStateChanged(int i);
}
