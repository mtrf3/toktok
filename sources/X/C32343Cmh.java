package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Cmh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32343Cmh extends AbstractC32397CnZ {
    public C32343Cmh() {
        super(null);
    }

    @Override // X.AbstractC32397CnZ
    public final void LIZ(AbstractC32415Cnr abstractC32415Cnr, C32399Cnb c32399Cnb) {
        File[] listFiles;
        EnumC32342Cmg enumC32342Cmg;
        EnumC32342Cmg enumC32342Cmg2;
        ArrayList arrayList = new ArrayList();
        C32221Ckj.LIZIZ().getClass();
        String LIZ = PU0.LJI().LIZIZ.LIZ.LIZ();
        o.LJIIIIZZ(LIZ, "inst().fileCacheFactory.fileCacheRootPath");
        File file = new File(LIZ);
        long j = 0;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                EnumC32342Cmg enumC32342Cmg3 = null;
                if (c32399Cnb != null) {
                    enumC32342Cmg = c32399Cnb.LIZJ;
                } else {
                    enumC32342Cmg = null;
                }
                if (enumC32342Cmg == EnumC32342Cmg.DELETE_UNUSED) {
                    if (System.currentTimeMillis() - file2.lastModified() > LiveGiftResourceManagerSettings.INSTANCE.getExpireDuration() * 1000) {
                        j += FileUtils.INSTANCE.getFolderSize(file2);
                        String name = file2.getName();
                        o.LJIIIIZZ(name, "file.name");
                        arrayList.add(name);
                        OR7.LLLIIL(file2);
                    }
                } else {
                    if (c32399Cnb != null) {
                        enumC32342Cmg2 = c32399Cnb.LIZJ;
                    } else {
                        enumC32342Cmg2 = null;
                    }
                    if (enumC32342Cmg2 == EnumC32342Cmg.DELETE_ALL) {
                        j += FileUtils.INSTANCE.getFolderSize(file2);
                        String name2 = file2.getName();
                        o.LJIIIIZZ(name2, "file.name");
                        arrayList.add(name2);
                        OR7.LLLIIL(file2);
                    } else {
                        if (c32399Cnb != null) {
                            enumC32342Cmg3 = c32399Cnb.LIZJ;
                        }
                        if (enumC32342Cmg3 == EnumC32342Cmg.ONLY_CHECK) {
                            j += FileUtils.INSTANCE.getFolderSize(file2);
                            String name3 = file2.getName();
                            o.LJIIIIZZ(name3, "file.name");
                            arrayList.add(name3);
                        }
                    }
                }
            }
        }
        if (c32399Cnb != null) {
            c32399Cnb.LJIILJJIL = arrayList;
            c32399Cnb.LJIILIIL = j;
        }
        abstractC32415Cnr.LIZ(c32399Cnb);
    }
}
