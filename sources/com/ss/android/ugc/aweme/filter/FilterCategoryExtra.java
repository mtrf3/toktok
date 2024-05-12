package com.ss.android.ugc.aweme.filter;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FilterCategoryExtra extends F9E implements Serializable {

    @InterfaceC65349Pkn("ab_group")
    public final String abGroup;

    @InterfaceC65349Pkn("panel_camera_type")
    public final String cameraFacing;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterCategoryExtra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FilterCategoryExtra copy$default(FilterCategoryExtra filterCategoryExtra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterCategoryExtra.abGroup;
        }
        if ((i & 2) != 0) {
            str2 = filterCategoryExtra.cameraFacing;
        }
        return filterCategoryExtra.copy(str, str2);
    }

    public final FilterCategoryExtra copy(String abGroup, String cameraFacing) {
        o.LJIIIZ(abGroup, "abGroup");
        o.LJIIIZ(cameraFacing, "cameraFacing");
        return new FilterCategoryExtra(abGroup, cameraFacing);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.abGroup, this.cameraFacing};
    }

    public final String getAbGroup() {
        return this.abGroup;
    }

    public final String getCameraFacing() {
        return this.cameraFacing;
    }

    public FilterCategoryExtra(String abGroup, String cameraFacing) {
        o.LJIIIZ(abGroup, "abGroup");
        o.LJIIIZ(cameraFacing, "cameraFacing");
        this.abGroup = abGroup;
        this.cameraFacing = cameraFacing;
    }

    public /* synthetic */ FilterCategoryExtra(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 2) != 0 ? "" : str2);
    }
}
