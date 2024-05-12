package com.bytedance.ugc.effectcreator.main;

import X.AbstractC93769aWD;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C5H3;
import X.C79853Bl;
import X.C93520aSC;
import X.C93726aVW;
import X.C94548aim;
import X.C94787amd;
import X.EnumC93724aVU;
import X.EnumC93725aVV;
import X.InterfaceC65462ha;
import X.InterfaceC70422pa;
import X.T2R;
import X.XKX;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class MainImpl implements IMain {
    public static final C93520aSC Companion = new C93520aSC();
    public final InterfaceC70422pa coroutineScope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
    public final C3BJ<AbstractC93769aWD> mainEventFlow = C79853Bl.LIZ(0, 0, null, 7);
    public final MainLiveData<EnumC93724aVU> mainOperation = new MainLiveData<>();
    public final C5H3 mainStatus$delegate = C221108m2.LIZIZ(C94548aim.LJLIL);
    public final MainLiveData<Boolean> loadingShow = new MainLiveData<>();
    public final MainLiveData<Boolean> effectHintSelectionShow = new MainLiveData<>();
    public MainLiveData<Rect> previewLocation = new MainLiveData<>();
    public MainLiveData<Rect> topToolPanelLocation = new MainLiveData<>();

    private final MainLiveData<EnumC93725aVV> getMainStatus() {
        return (MainLiveData) this.mainStatus$delegate.getValue();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public int getFragmentContainer() {
        return R.id.bs8;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void onRecycle() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public boolean isLoading() {
        return o.LJ(this.loadingShow.getValue(), Boolean.TRUE);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public LiveData<EnumC93725aVV> getMainPageStatus() {
        return getMainStatus();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public String getTag() {
        return getClass().getName();
    }

    public final boolean isMainNarrow() {
        if (getMainStatus().getValue() == EnumC93725aVV.NARROW) {
            return true;
        }
        return false;
    }

    public final MainLiveData<Boolean> getEffectHintSelectionShow() {
        return this.effectHintSelectionShow;
    }

    public final MainLiveData<Boolean> getLoadingShow() {
        return this.loadingShow;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public InterfaceC65462ha<AbstractC93769aWD> getMainEvent() {
        return this.mainEventFlow;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public LiveData<EnumC93724aVU> getMainOperation() {
        return this.mainOperation;
    }

    public final MainLiveData<Rect> getPreviewLocation() {
        return this.previewLocation;
    }

    public final MainLiveData<Rect> getTopToolPanelLocation() {
        return this.topToolPanelLocation;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public LiveData<Rect> getTopToolPanelLocationInWindow() {
        return this.topToolPanelLocation;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public MainLiveData<Rect> getPreviewLocationInWindow() {
        return this.previewLocation;
    }

    public Fragment getFragment(String str) {
        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString("EFFECT_DRAFT_PATH", str);
        mainFragment.setArguments(bundle);
        return mainFragment;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void mainLoading(boolean z) {
        this.loadingShow.postValue(Boolean.valueOf(z));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void onFireEvent(AbstractC93769aWD event) {
        o.LJIIIZ(event, "event");
        XKX.LIZLLL(this.coroutineScope, null, null, new C94787amd(this, event, null), 3);
    }

    public final void setPreviewLocation(MainLiveData<Rect> mainLiveData) {
        o.LJIIIZ(mainLiveData, "<set-?>");
        this.previewLocation = mainLiveData;
    }

    public final void setTopToolPanelLocation(MainLiveData<Rect> mainLiveData) {
        o.LJIIIZ(mainLiveData, "<set-?>");
        this.topToolPanelLocation = mainLiveData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void updateEffectHintSelectionShow(boolean z) {
        this.effectHintSelectionShow.setValue(Boolean.valueOf(z));
    }

    public final void updateOperation(EnumC93724aVU operate) {
        o.LJIIIZ(operate, "operate");
        this.mainOperation.setValue(operate);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void onNewIntent(FragmentManager fragmentManager, String str) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
        if (LJJJIL != null) {
            Intent intent = new Intent();
            intent.putExtra("EFFECT_DRAFT_PATH", str);
            MainFragment mainFragment = (MainFragment) LJJJIL;
            String str2 = mainFragment.LJLZ;
            if (str2 != null || (str2 = C16880lQ.LLJJIJIIJIL(intent, "EFFECT_DRAFT_PATH")) != null) {
                mainFragment.Ol().iv0(str2);
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        open(fragmentManager, i, "");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void open(FragmentManager fragmentManager, int i, String draftPath) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(draftPath, "draftPath");
        Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
        if (LJJJIL != null) {
            Bundle bundle = new Bundle(LJJJIL.getArguments());
            bundle.putString("EFFECT_DRAFT_PATH", draftPath);
            LJJJIL.setArguments(bundle);
        } else {
            Fragment fragment = getFragment(draftPath);
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIIZZ(R.id.bs8, 1, fragment, getTag());
            c1b3.LJII();
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IMain
    public void openPrefabPanel(FragmentManager fragmentManager, PrefabData prefabData, Long l) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
        if (LJJJIL != null) {
            MainFragment mainFragment = (MainFragment) LJJJIL;
            mainFragment.Rl();
            if (prefabData != null) {
                PrefabPanel LIZIZ = C93726aVW.LIZIZ();
                FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                LIZIZ.addPrefab(prefabData, childFragmentManager, R.id.nod);
                return;
            }
            if (l == null) {
                return;
            }
            PrefabPanel LIZIZ2 = C93726aVW.LIZIZ();
            long longValue = l.longValue();
            FragmentManager childFragmentManager2 = mainFragment.getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager2, "childFragmentManager");
            LIZIZ2.editPrefab(longValue, childFragmentManager2, R.id.nod);
        }
    }
}
