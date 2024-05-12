package com.google.firebase;

import X.AbstractC67210QZi;
import X.C1JX;
import X.C1P1;
import X.C1R5;
import X.C48290IxK;
import X.C61328O5c;
import X.C67183QYh;
import X.C67195QYt;
import X.C72545SdZ;
import X.InterfaceC67212QZk;
import X.QGY;
import X.QYR;
import X.QYS;
import X.QZ4;
import X.QZP;
import X.QZT;
import X.QZU;
import X.QZW;
import X.QZX;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class FirebaseCommonRegistrar implements QZ4 {
    @Override // X.QZ4
    public final List<QZT<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        QZU LIZ = QZT.LIZ(QYS.class);
        LIZ.LIZ(new QZW(2, 0, AbstractC67210QZi.class));
        LIZ.LJ = new C1JX();
        arrayList.add(LIZ.LIZIZ());
        QZU qzu = new QZU(C67183QYh.class, new Class[]{QGY.class, QYR.class});
        qzu.LIZ(QZW.LIZ(Context.class));
        qzu.LIZ(QZW.LIZ(C67195QYt.class));
        qzu.LIZ(new QZW(2, 0, InterfaceC67212QZk.class));
        qzu.LIZ(new QZW(1, 1, QYS.class));
        qzu.LJ = new QZP();
        arrayList.add(qzu.LIZIZ());
        arrayList.add(QZX.LIZ("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(QZX.LIZ("fire-core", "20.1.1"));
        arrayList.add(QZX.LIZ("device-name", LIZ(Build.PRODUCT)));
        arrayList.add(QZX.LIZ("device-model", LIZ(Build.DEVICE)));
        arrayList.add(QZX.LIZ("device-brand", LIZ(Build.BRAND)));
        arrayList.add(QZX.LIZIZ("android-target-sdk", new C61328O5c()));
        arrayList.add(QZX.LIZIZ("android-min-sdk", new C1R5()));
        arrayList.add(QZX.LIZIZ("android-platform", new C1P1()));
        arrayList.add(QZX.LIZIZ("android-installer", new C72545SdZ()));
        try {
            str = C48290IxK.LJLJJL.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(QZX.LIZ("kotlin", str));
        }
        return arrayList;
    }

    public static String LIZ(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
