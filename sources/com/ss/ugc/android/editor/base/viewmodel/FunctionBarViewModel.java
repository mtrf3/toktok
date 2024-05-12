package com.ss.ugc.android.editor.base.viewmodel;

import X.AnonymousClass523;
import X.AnonymousClass530;
import X.AnonymousClass535;
import X.AnonymousClass536;
import X.AnonymousClass537;
import X.AnonymousClass539;
import X.C53A;
import X.C53C;
import X.C53F;
import X.OSJ;
import X.OSZ;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FunctionBarViewModel extends ViewModel {
    public static final C53F Companion = new Object() { // from class: X.53F
    };
    public String lastFuncTypeState;
    public final MutableLiveData<List<AnonymousClass523>> _rootFuncListState = new MutableLiveData<>();
    public final MutableLiveData<C53A> _insertItemState = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass523> _removeItemState = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass523> _updateItemState = new MutableLiveData<>();
    public final MutableLiveData<List<AnonymousClass523>> _updateListState = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass539> _replaceItemState = new MutableLiveData<>();
    public final MutableLiveData<String> _currentFuncTypeState = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass523> _currentFuncItemState = new MutableLiveData<>();
    public final MutableLiveData<OSJ<Integer, AnonymousClass523, View>> _funcItemClickState = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass523> _backIconClickState = new MutableLiveData<>();
    public final MutableLiveData<Boolean> _onBackToRootState = new MutableLiveData<>();
    public final MutableLiveData<OSZ<Integer, AnonymousClass523>> _expendChildListState = new MutableLiveData<>();

    public final String getCurrentFuncType() {
        return this._currentFuncTypeState.getValue();
    }

    public final AnonymousClass523 getCurrentItem() {
        return this._currentFuncItemState.getValue();
    }

    public final boolean isRootState() {
        return o.LJ(getCurrentFuncType(), "root_item");
    }

    public final LiveData<AnonymousClass523> getBackIconClickState() {
        return this._backIconClickState;
    }

    public final LiveData<Boolean> getBackToRootStateChanged() {
        return this._onBackToRootState;
    }

    public final LiveData<OSZ<Integer, AnonymousClass523>> getExpendChildListState() {
        return this._expendChildListState;
    }

    public final LiveData<OSJ<Integer, AnonymousClass523, View>> getFuncItemClickState() {
        return this._funcItemClickState;
    }

    public final LiveData<C53A> getInsertItemState() {
        return this._insertItemState;
    }

    public final String getLastFuncTypeState() {
        return this.lastFuncTypeState;
    }

    public final LiveData<AnonymousClass523> getRemoveItemState() {
        return this._removeItemState;
    }

    public final LiveData<AnonymousClass539> getReplaceItemState() {
        return this._replaceItemState;
    }

    public final LiveData<List<AnonymousClass523>> getRootFuncListState() {
        return this._rootFuncListState;
    }

    public final LiveData<AnonymousClass523> getUpdateItemState() {
        return this._updateItemState;
    }

    public final LiveData<List<AnonymousClass523>> getUpdateListState() {
        return this._updateListState;
    }

    public final void dispatch(C53C action) {
        o.LJIIIZ(action, "action");
        if (action instanceof AnonymousClass537) {
            this.lastFuncTypeState = this._currentFuncTypeState.getValue();
            this._currentFuncTypeState.setValue(((AnonymousClass537) action).LIZ);
            return;
        }
        if (action instanceof AnonymousClass536) {
            this._backIconClickState.setValue(((AnonymousClass536) action).LIZ);
            return;
        }
        if (action instanceof AnonymousClass535) {
            AnonymousClass535 anonymousClass535 = (AnonymousClass535) action;
            this._funcItemClickState.setValue(new OSJ<>(Integer.valueOf(anonymousClass535.LIZIZ), anonymousClass535.LIZ, anonymousClass535.LIZJ));
        } else {
            if (!(action instanceof AnonymousClass530)) {
                return;
            }
            this._currentFuncItemState.setValue(null);
            this.lastFuncTypeState = this._currentFuncTypeState.getValue();
            this._currentFuncTypeState.setValue("root_item");
            this._onBackToRootState.setValue(Boolean.valueOf(((AnonymousClass530) action).LIZ));
        }
    }

    public final void removeItem(AnonymousClass523 functionItem) {
        o.LJIIIZ(functionItem, "functionItem");
        this._removeItemState.setValue(functionItem);
    }

    public final void setRootFunctionList(List<AnonymousClass523> functionList) {
        o.LJIIIZ(functionList, "functionList");
        this._rootFuncListState.setValue(functionList);
    }

    public final void updateItem(AnonymousClass523 functionItem) {
        o.LJIIIZ(functionItem, "functionItem");
        this._updateItemState.setValue(functionItem);
    }

    public final void updateList(List<AnonymousClass523> functionList) {
        o.LJIIIZ(functionList, "functionList");
        this._updateListState.setValue(functionList);
    }

    public final void insertItem(int i, AnonymousClass523 functionItem) {
        o.LJIIIZ(functionItem, "functionItem");
        this._insertItemState.setValue(new C53A(i, functionItem));
    }

    public final void showChildList(AnonymousClass523 functionItem, int i) {
        o.LJIIIZ(functionItem, "functionItem");
        this._currentFuncItemState.setValue(functionItem);
        this._expendChildListState.setValue(new OSZ<>(Integer.valueOf(i), functionItem));
    }

    public final void replaceItem(String oldFuncType, AnonymousClass523 newFunctionItem, boolean z) {
        o.LJIIIZ(oldFuncType, "oldFuncType");
        o.LJIIIZ(newFunctionItem, "newFunctionItem");
        this._replaceItemState.setValue(new AnonymousClass539(oldFuncType, newFunctionItem, z));
    }

    public static /* synthetic */ void replaceItem$default(FunctionBarViewModel functionBarViewModel, String str, AnonymousClass523 anonymousClass523, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        functionBarViewModel.replaceItem(str, anonymousClass523, z);
    }
}
