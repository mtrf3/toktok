package X;

import android.graphics.RectF;
import com.bytedance.als.LiveEvent;

/* renamed from: X.I2t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC45979I2t extends C0I6 {
    void addBottomTab(int i, WSH wsh, int i2);

    int bottomTabSize();

    void configSwitchDuration(C45964I2e c45964I2e);

    boolean couldShowToolbar();

    String defaultBottomTab();

    boolean getAlbumTabIsDefaultSelected();

    boolean getAlbumTabIsSelected();

    String getAvailableRecordCombineTag();

    C0IB<WS0> getBottomTabIndexChangeEvent();

    RectF getBottomTabRectF();

    C40871j1<Integer> getComplexTabVisibility();

    WSF getCurrentBottomTabItem();

    WSF getCurrentBottomTabItemBeforeOnTabChanged();

    String getCurrentBottomTag();

    LiveEvent<String> getSharedARTabIndexChangeEvent();

    void hidePopupForLiveTab();

    boolean isCurrentTabNeedCamera();

    boolean isLiveJumpChangeSwitchOpen();

    boolean isLiveReuseSwitchOpen();

    boolean isValid();

    boolean isZTLiveSwitch();

    void mvBackToRecordPage();

    void notifyBottomTabIndexChange(WS0 ws0);

    void notifySharedARTabIndexChange(String str);

    void onRetake();

    void onStartRecord();

    C45850Hz4 provideRecordEnv();

    void resetToCurTab(String str);

    void setAlbumTabIsSelected(boolean z, boolean z2);

    void setBottomSelectedTextColor(int i, int i2);

    void setBottomTabEndMargin(int i);

    void setBottomTabStartMargin(int i);

    void setCurrentTab(String str, boolean z, int i);

    void setLiveTagState(int i);

    void setTabSwitchEnabled(boolean z);

    void showAllTabsAndExitDuetMode();

    void showBottomTab(boolean z);

    void showComplexTab(int i, WS0 ws0);

    void showOnlyVideosTab();

    void switchToPreviousTab();

    void tryShowPopupForLiveTab();

    void updateBottomDotRes(int i);

    void updateBottomTab();
}
