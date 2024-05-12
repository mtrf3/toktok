package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImShareContactListStruct extends F9E implements Serializable {
    public final ArrayList<ImShareContactStruct> data;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImShareContactListStruct copy$default(ImShareContactListStruct imShareContactListStruct, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = imShareContactListStruct.data;
        }
        return imShareContactListStruct.copy(arrayList);
    }

    public final ImShareContactListStruct copy(ArrayList<ImShareContactStruct> data) {
        o.LJIIIZ(data, "data");
        return new ImShareContactListStruct(data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data};
    }

    public final ArrayList<ImShareContactStruct> getData() {
        return this.data;
    }

    public ImShareContactListStruct(ArrayList<ImShareContactStruct> data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }
}
