package com.ss.android.ugc.aweme.storage.clean;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class RecordStorageOptLimitInfo extends F9E {

    @InterfaceC65349Pkn("enter_record_storage_auto_clean_limit")
    public final int storageAutoCleanLimit;

    @InterfaceC65349Pkn("enter_record_storage_lower_limit")
    public final int storageLowerLimit;

    public static /* synthetic */ RecordStorageOptLimitInfo copy$default(RecordStorageOptLimitInfo recordStorageOptLimitInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recordStorageOptLimitInfo.storageLowerLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = recordStorageOptLimitInfo.storageAutoCleanLimit;
        }
        return recordStorageOptLimitInfo.copy(i, i2);
    }

    public final RecordStorageOptLimitInfo copy(int i, int i2) {
        return new RecordStorageOptLimitInfo(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.storageLowerLimit), Integer.valueOf(this.storageAutoCleanLimit)};
    }

    public final int getStorageAutoCleanLimit() {
        return this.storageAutoCleanLimit;
    }

    public final int getStorageLowerLimit() {
        return this.storageLowerLimit;
    }

    public RecordStorageOptLimitInfo(int i, int i2) {
        this.storageLowerLimit = i;
        this.storageAutoCleanLimit = i2;
    }
}
