package com.google.android.play.core.appupdate;

/* loaded from: classes7.dex */
public abstract class d {

    /* loaded from: classes7.dex */
    public static abstract class a {
    }

    public abstract boolean LIZ();

    public abstract int LIZIZ();

    public static t LIZJ() {
        String str;
        s sVar = new s();
        sVar.LIZ = 0;
        sVar.LIZIZ = Boolean.FALSE;
        String str2 = "";
        if (0 == null) {
            str2 = "".concat(" appUpdateType");
        }
        if (sVar.LIZIZ == null) {
            str2 = String.valueOf(str2).concat(" allowAssetPackDeletion");
        }
        if (!str2.isEmpty()) {
            if (str2.length() != 0) {
                str = "Missing required properties:".concat(str2);
            } else {
                str = new String("Missing required properties:");
            }
            throw new IllegalStateException(str);
        }
        return new t(sVar.LIZ.intValue(), sVar.LIZIZ.booleanValue());
    }
}
