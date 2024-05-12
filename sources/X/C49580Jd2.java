package X;

import Y.AObserverS76S0100000_8;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49580Jd2 extends AbstractC49223JTn {
    public final SearchStateViewModel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C65422hW.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 690));

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJLJJI.getValue();
    }

    public final String toString() {
        Boolean bool;
        Boolean bool2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isShowingFilters:");
        MutableLiveData<Boolean> mutableLiveData = this.LJLILLLLZI.isShowingFilters;
        Boolean bool3 = null;
        if (mutableLiveData != null) {
            bool = mutableLiveData.getValue();
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(" \nshouldBlockMediaPlay:");
        MutableLiveData<Boolean> mutableLiveData2 = this.LJLILLLLZI.shouldBlockMediaPlay;
        if (mutableLiveData2 != null) {
            bool2 = mutableLiveData2.getValue();
        } else {
            bool2 = null;
        }
        LIZ.append(bool2);
        LIZ.append(" \nisStopAutoPlayByTns:");
        MutableLiveData<Boolean> mutableLiveData3 = this.LJLILLLLZI.isStopAutoPlayByTns;
        if (mutableLiveData3 != null) {
            bool3 = mutableLiveData3.getValue();
        }
        LIZ.append(bool3);
        return X1D.LIZIZ(LIZ);
    }

    public C49580Jd2(SearchStateViewModel searchStateViewModel, SearchFragment searchFragment) {
        this.LJLILLLLZI = searchStateViewModel;
        this.LJLJI = searchFragment;
        MutableLiveData<Boolean> mutableLiveData = searchStateViewModel.isShowingFilters;
        if (mutableLiveData != null) {
            final String str = "isShowingFilters";
            mutableLiveData.observe(searchFragment, new Observer() { // from class: X.2hV
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean isNotReady = (Boolean) obj;
                    C49580Jd2 c49580Jd2 = C49580Jd2.this;
                    o.LJIIIIZZ(isNotReady, "isNotReady");
                    boolean booleanValue = isNotReady.booleanValue();
                    String str2 = str;
                    if (booleanValue) {
                        c49580Jd2.getClass();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append((Object) str2);
                        LIZ.append(" is not ready");
                        X1D.LIZIZ(LIZ);
                        ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                        return;
                    }
                    Iterator it = ((List) c49580Jd2.LJLJJL.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((LiveData) next).getValue(), Boolean.TRUE)) {
                            if (next != null) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(next);
                                LIZ2.append(" is not ready in all status");
                                X1D.LIZIZ(LIZ2);
                                ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                                return;
                            }
                        }
                    }
                    ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(1);
                }
            });
        }
        MutableLiveData<Boolean> mutableLiveData2 = searchStateViewModel.shouldBlockMediaPlay;
        if (mutableLiveData2 != null) {
            final String str2 = "shouldBlockMediaPlay";
            mutableLiveData2.observe(searchFragment, new Observer() { // from class: X.2hV
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean isNotReady = (Boolean) obj;
                    C49580Jd2 c49580Jd2 = C49580Jd2.this;
                    o.LJIIIIZZ(isNotReady, "isNotReady");
                    boolean booleanValue = isNotReady.booleanValue();
                    String str22 = str2;
                    if (booleanValue) {
                        c49580Jd2.getClass();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append((Object) str22);
                        LIZ.append(" is not ready");
                        X1D.LIZIZ(LIZ);
                        ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                        return;
                    }
                    Iterator it = ((List) c49580Jd2.LJLJJL.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((LiveData) next).getValue(), Boolean.TRUE)) {
                            if (next != null) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(next);
                                LIZ2.append(" is not ready in all status");
                                X1D.LIZIZ(LIZ2);
                                ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                                return;
                            }
                        }
                    }
                    ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(1);
                }
            });
        }
        MutableLiveData<Boolean> mutableLiveData3 = searchStateViewModel.isStopAutoPlayByTns;
        if (mutableLiveData3 != null) {
            final String str3 = "isStopAutoPlayByTns";
            mutableLiveData3.observe(searchFragment, new Observer() { // from class: X.2hV
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean isNotReady = (Boolean) obj;
                    C49580Jd2 c49580Jd2 = C49580Jd2.this;
                    o.LJIIIIZZ(isNotReady, "isNotReady");
                    boolean booleanValue = isNotReady.booleanValue();
                    String str22 = str3;
                    if (booleanValue) {
                        c49580Jd2.getClass();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append((Object) str22);
                        LIZ.append(" is not ready");
                        X1D.LIZIZ(LIZ);
                        ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                        return;
                    }
                    Iterator it = ((List) c49580Jd2.LJLJJL.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((LiveData) next).getValue(), Boolean.TRUE)) {
                            if (next != null) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(next);
                                LIZ2.append(" is not ready in all status");
                                X1D.LIZIZ(LIZ2);
                                ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(0);
                                return;
                            }
                        }
                    }
                    ((LiveData) c49580Jd2.LJLJJI.getValue()).setValue(1);
                }
            });
        }
        MutableLiveData<Boolean> mutableLiveData4 = searchStateViewModel.backToMiddle;
        if (mutableLiveData4 != null) {
            mutableLiveData4.observe(searchFragment, new AObserverS76S0100000_8(this, 143));
        }
        MutableLiveData<Boolean> mutableLiveData5 = searchStateViewModel.isRefreshingData;
        if (mutableLiveData5 != null) {
            mutableLiveData5.observe(searchFragment, new AObserverS76S0100000_8(this, 144));
        }
    }
}
