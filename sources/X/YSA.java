package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public interface YSA {
    java.util.Set<Integer> getActivateEvents();

    View getFirstAddedViewForGroup(ViewGroup viewGroup);

    View getLastAddedViewForGroup(ViewGroup viewGroup);

    YTK getLayerStateInquirer();

    int getLayerType();

    ArrayList<Integer> getSupportEvents();

    boolean handleVideoEvent(YT8 yt8);

    boolean hasUI();

    boolean isActivated();

    boolean isShowing();

    void onActivate(List<Integer> list, InterfaceC48221IwD interfaceC48221IwD);

    void onRegister(YTH yth);

    void onUnregister(YTH yth);

    void setActivated(boolean z);
}
