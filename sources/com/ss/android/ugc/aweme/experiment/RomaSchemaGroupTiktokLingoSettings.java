package com.ss.android.ugc.aweme.experiment;

import X.FFL;

/* loaded from: classes2.dex */
public final class RomaSchemaGroupTiktokLingoSettings {
    public static final RomaSchemaGroupTiktokLingoSettings INSTANCE = new RomaSchemaGroupTiktokLingoSettings();
    public static final RomaSchemaGroupTiktokLingoModel DEFAULT_GROUP = new RomaSchemaGroupTiktokLingoModel(null, null, 3, null);

    public static final RomaSchemaGroupTiktokLingoModel getValue() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RomaSchemaGroupTiktokLingoModel romaSchemaGroupTiktokLingoModel = DEFAULT_GROUP;
        LJIIIZ.getClass();
        RomaSchemaGroupTiktokLingoModel romaSchemaGroupTiktokLingoModel2 = (RomaSchemaGroupTiktokLingoModel) FFL.LJIJ(true, "roma_schema_group_tiktok_lingo", 31744, RomaSchemaGroupTiktokLingoModel.class, romaSchemaGroupTiktokLingoModel);
        if (romaSchemaGroupTiktokLingoModel2 == null) {
            return romaSchemaGroupTiktokLingoModel;
        }
        return romaSchemaGroupTiktokLingoModel2;
    }
}
