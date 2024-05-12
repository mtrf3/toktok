package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.K1g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51036K1g<T, K> extends C8BS<K> {
    public int mCount;
    public boolean mIsNewDataEmpty;
    public int mListQueryType = 1;
    public int mSmartType;

    public int getCurrentIndex() {
        return -1;
    }

    public abstract List<T> getItems();

    public int getListCount() {
        return -1;
    }

    public boolean hasLocateItem() {
        return false;
    }

    public abstract boolean isHasMore();

    public void loadCache(Object... objArr) {
    }

    public void loadLatestList(Object... objArr) {
    }

    public abstract void loadMoreList(Object... objArr);

    public boolean needCheckEmptyForQueryType() {
        return true;
    }

    public void onModelBound() {
    }

    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isDataEmpty() {
        return C79004UzY.LJJIFFI(getItems());
    }

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    public boolean deleteItem(T t) {
        List<T> items = getItems();
        if (C79004UzY.LJJIFFI(items)) {
            return false;
        }
        int indexOf = items.indexOf(t);
        boolean remove = items.remove(t);
        if (indexOf >= 0) {
            for (C8BT c8bt : this.mNotifyListeners) {
                if (c8bt != null && (c8bt instanceof InterfaceC51034K1e)) {
                    ((InterfaceC51034K1e) c8bt).onItemDeleted(indexOf);
                }
            }
        }
        return remove;
    }

    public boolean insertItem(T t) {
        int size;
        List<T> items = getItems();
        if (items == null) {
            size = 0;
        } else {
            size = items.size();
        }
        return insertItem(t, size);
    }

    @Override // X.C8BS
    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (needCheckEmptyForQueryType() && isDataEmpty()) {
            this.mListQueryType = 1;
        } else {
            this.mListQueryType = ((Integer) objArr[0]).intValue();
            if (objArr.length >= 4) {
                try {
                    if (((Boolean) C35197Drd.LIZ.getValue()).booleanValue()) {
                        Object obj = objArr[3];
                        if (obj instanceof Integer) {
                            this.mSmartType = ((Integer) obj).intValue();
                        }
                    } else {
                        this.mSmartType = ((Integer) objArr[3]).intValue();
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 19) {
                                if (i == 20) {
                                    loadMoreList(objArr);
                                }
                            } else {
                                refreshList(objArr);
                            }
                        } else {
                            loadCache(objArr);
                        }
                    } else {
                        loadMoreList(objArr);
                    }
                } else {
                    loadMoreList(objArr);
                }
            } else {
                loadLatestList(objArr);
            }
        } else {
            refreshList(objArr);
        }
        return true;
    }

    public boolean insertItem(T t, int i) {
        List<T> items = getItems();
        if (C79004UzY.LJJIFFI(items)) {
            items = new ArrayList<>();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        ListProtector.add(items, i, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C8BT c8bt : this.mNotifyListeners) {
            if (c8bt != null && (c8bt instanceof InterfaceC51034K1e)) {
                ((InterfaceC51034K1e) c8bt).onItemInserted(items, i);
            }
        }
        return true;
    }

    public boolean insertItemList(List<T> list, int i) {
        List<T> items = getItems();
        if (C79004UzY.LJJIFFI(items)) {
            items = new ArrayList<>();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.addAll(i, list);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C8BT c8bt : this.mNotifyListeners) {
            if (c8bt != null && (c8bt instanceof InterfaceC51034K1e)) {
                ((InterfaceC51034K1e) c8bt).onItemInserted(items, i);
            }
        }
        return true;
    }
}
