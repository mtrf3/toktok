package com.ss.android.ugc.aweme.discover.model;

import X.C16880lQ;
import X.C76800UCe;
import X.FCI;
import Y.ARunnableS0S0111000_3;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import java.util.HashSet;

/* loaded from: classes9.dex */
public class SearchStateViewModel extends ViewModel {
    public MutableLiveData<Integer> searchState = new MutableLiveData<>();
    public MutableLiveData<Boolean> isSearchPageVisible = new MutableLiveData<>();
    public MutableLiveData<Boolean> isLeavingSearchPage = new MutableLiveData<>();
    public MutableLiveData<Boolean> isRefreshingData = new MutableLiveData<>();
    public MutableLiveData<Boolean> isStopAutoPlayByTns = new MutableLiveData<>();
    public MutableLiveData<Boolean> isTnsShowingMaskLayer = new MutableLiveData<>();
    public MutableLiveData<Boolean> isShowingFilters = new MutableLiveData<>();
    public MutableLiveData<Boolean> backToMiddle = new MutableLiveData<>();
    public MutableLiveData<Boolean> isHavingFocus = new MutableLiveData<>();
    public MutableLiveData<Boolean> shouldBlockMediaPlay = new MutableLiveData<>();
    public MutableLiveData<Boolean> isScrollingInternal = new MutableLiveData<>();
    public MutableLiveData<Boolean> isResultRVScrolling = new MutableLiveData<>();
    public MutableLiveData<String> latestSearchKeyWord = new MutableLiveData<>();
    public MutableLiveData<C76800UCe> tacoClearPlayData = new MutableLiveData<>();
    public HashSet<Integer> queryWordChangeInProcess = new HashSet<>();
    public boolean isBackFromDetailPage = false;
    public boolean isShowSearchRelationCard = false;

    public static boolean isSearchIntermediate(int i) {
        return i == 3;
    }

    public static boolean isSearchResult(int i) {
        return i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBackToMiddle$5(boolean z) {
        this.backToMiddle.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsHavingFocus$8(boolean z) {
        this.isHavingFocus.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsLeavingSearch$1(boolean z) {
        this.isLeavingSearchPage.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsRefreshingData$3(boolean z) {
        this.isRefreshingData.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsResultRVScrolling$9(boolean z) {
        this.isResultRVScrolling.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsStopAutoPlayByTns$6(boolean z) {
        this.isStopAutoPlayByTns.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSearchPageVisible$2(boolean z) {
        this.isSearchPageVisible.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSearchState$0(int i) {
        this.searchState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShouldBlockMediaPlay$7(boolean z) {
        this.shouldBlockMediaPlay.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShowingFilters$4(boolean z) {
        this.isShowingFilters.setValue(Boolean.valueOf(z));
    }

    private void runOnUiThread(Runnable runnable) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(runnable);
        }
    }

    public void setBackToMiddle(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzd
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setBackToMiddle$5(z);
            }
        });
    }

    public void setIsHavingFocus(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzg
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setIsHavingFocus$8(z);
            }
        });
    }

    public void setIsLeavingSearch(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzi
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setIsLeavingSearch$1(z);
            }
        });
    }

    public void setIsRefreshingData(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzh
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setIsRefreshingData$3(z);
            }
        });
    }

    public void setIsResultRVScrolling(boolean z) {
        runOnUiThread(new FCI(this, 1, z));
    }

    public void setIsScrollingInternal(boolean z) {
        this.isScrollingInternal.setValue(Boolean.valueOf(z));
    }

    public void setIsStopAutoPlayByTns(boolean z) {
        runOnUiThread(new ARunnableS0S0111000_3(this, z, 1, 0));
    }

    public void setSearchPageVisible(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzf
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setSearchPageVisible$2(z);
            }
        });
    }

    public void setSearchState(final int i) {
        runOnUiThread(new Runnable() { // from class: X.Jze
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setSearchState$0(i);
            }
        });
    }

    public void setShouldBlockMediaPlay(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzj
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setShouldBlockMediaPlay$7(z);
            }
        });
    }

    public void setShowingFilters(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.Jzc
            @Override // java.lang.Runnable
            public final void run() {
                SearchStateViewModel.this.lambda$setShowingFilters$4(z);
            }
        });
    }
}
