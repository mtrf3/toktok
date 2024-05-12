package X;

import android.view.View;
import com.bytedance.als.LiveEvent;

/* renamed from: X.Hzh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC45889Hzh extends C0I6 {
    void closeAlbum();

    void dismissLivePopupEvent();

    void dismissSuperEntranceEvent();

    void dismissUploadPopEntranceEvent();

    C0IB<Boolean> getAlbumPageVisibilityState();

    int getBottomMargin();

    LiveEvent<C76800UCe> getNoBlockTouchEvent();

    void manualClickUploadButton();

    void openAlbum();

    void setEffectContainerAnimation(String str, float f, boolean z);

    void setEffectContainerVisibility(int i);

    void setNeedNoTouchListener(boolean z);

    void setUploadAnimation(String str, float f, boolean z);

    void setUploadStartAction(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns);

    void setUploadVisibility(int i);

    void showDockBar(boolean z);
}
