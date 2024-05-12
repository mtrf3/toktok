package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RomaSchemaGroupTiktokLingoModel extends F9E {

    @InterfaceC65349Pkn("roma_schema_page_dictionary_detail")
    public final String dictionaryDetail;

    @InterfaceC65349Pkn("roma_schema_page_dictionary_panel")
    public final String dictionaryPanel;

    /* JADX WARN: Multi-variable type inference failed */
    public RomaSchemaGroupTiktokLingoModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.dictionaryPanel, this.dictionaryDetail};
    }

    public RomaSchemaGroupTiktokLingoModel(String dictionaryPanel, String dictionaryDetail) {
        o.LJIIIZ(dictionaryPanel, "dictionaryPanel");
        o.LJIIIZ(dictionaryDetail, "dictionaryDetail");
        this.dictionaryPanel = dictionaryPanel;
        this.dictionaryDetail = dictionaryDetail;
    }

    public /* synthetic */ RomaSchemaGroupTiktokLingoModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
