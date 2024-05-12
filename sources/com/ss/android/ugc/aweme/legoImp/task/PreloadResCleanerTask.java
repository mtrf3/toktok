package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C19N;
import X.C36538EVq;
import X.C79004UzY;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FU3;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.facebook.common.references.SharedReference;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes7.dex */
public class PreloadResCleanerTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "PreloadResCleanerTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        if (FU3.LIZJ()) {
            return 2;
        }
        return 1;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        int i = 0;
        if (!FU3.LIZJ() && !C19N.LJ("enable_preload_opt", false)) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            try {
                Object LIZJ = C36538EVq.LIZJ(C16880lQ.LLLLL(context).getResources(), "mResourcesImpl");
                if (LIZJ != null) {
                    Object LIZJ2 = C36538EVq.LIZJ(LIZJ, "sPreloadedDrawables");
                    if (LIZJ2 instanceof LongSparseArray[]) {
                        LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) LIZJ2;
                        int length = longSparseArrayArr.length;
                        while (i < length) {
                            C79004UzY.LJI(longSparseArrayArr[i]);
                            i++;
                        }
                    } else {
                        C79004UzY.LJI((LongSparseArray) LIZJ2);
                    }
                    C79004UzY.LJI(C36538EVq.LIZJ(LIZJ, "sPreloadedColorDrawables"));
                    C79004UzY.LJI(C36538EVq.LIZJ(LIZJ, "sPreloadedComplexColors"));
                    Object LIZJ3 = C36538EVq.LIZJ(LIZJ, "mDrawableCache");
                    if (LIZJ3 != null) {
                        C79004UzY.LJI(C36538EVq.LIZJ(LIZJ3, "mNullThemedEntries"));
                        C79004UzY.LJI(C36538EVq.LIZJ(LIZJ3, "mThemedEntries"));
                        C79004UzY.LJI(C36538EVq.LIZJ(LIZJ3, "mUnthemedEntries"));
                    }
                    C79004UzY.LJI(C36538EVq.LIZJ(LIZJ, "mDrawableCache"));
                    C79004UzY.LJI(C36538EVq.LIZJ(LIZJ, "mColorDrawableCache"));
                    C79004UzY.LJI(C36538EVq.LIZJ(LIZJ, "mColorStateListCache"));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } else if (i2 >= 23) {
            try {
                Resources resources = C16880lQ.LLLLL(context).getResources();
                Object LIZJ4 = C36538EVq.LIZJ(resources, "sPreloadedDrawables");
                if (LIZJ4 instanceof LongSparseArray[]) {
                    LongSparseArray[] longSparseArrayArr2 = (LongSparseArray[]) LIZJ4;
                    int length2 = longSparseArrayArr2.length;
                    while (i < length2) {
                        C79004UzY.LJI(longSparseArrayArr2[i]);
                        i++;
                    }
                } else {
                    C79004UzY.LJI((LongSparseArray) LIZJ4);
                }
                C79004UzY.LJI(C36538EVq.LIZJ(resources, "sPreloadedColorDrawables"));
                C79004UzY.LJI(C36538EVq.LIZJ(resources, "sPreloadedColorStateLists"));
                C79004UzY.LJI(C36538EVq.LIZJ(resources, "mDrawableCache"));
                C79004UzY.LJI(C36538EVq.LIZJ(resources, "mColorDrawableCache"));
                C79004UzY.LJI(C36538EVq.LIZJ(resources, "mColorStateListCache"));
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } else if (i2 == 21) {
            try {
                Object LIZJ5 = C36538EVq.LIZJ(C16880lQ.LLLLL(context).getResources(), "sPreloadedDrawables");
                if (LIZJ5 instanceof LongSparseArray[]) {
                    LongSparseArray[] longSparseArrayArr3 = (LongSparseArray[]) LIZJ5;
                    int length3 = longSparseArrayArr3.length;
                    while (i < length3) {
                        C79004UzY.LJI(longSparseArrayArr3[i]);
                        i++;
                    }
                } else {
                    C79004UzY.LJI((LongSparseArray) LIZJ5);
                }
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        if (((Boolean) FU3.LIZLLL.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 23) {
            try {
                Class<?> cls = Class.forName("android.text.Hyphenator");
                C79004UzY.LJI(LIZLLL(cls, "sMap").get(cls));
            } catch (Throwable unused) {
            }
        }
        if (((Boolean) FU3.LJ.getValue()).booleanValue()) {
            try {
                C79004UzY.LJI(LIZLLL(SharedReference.class, "sLiveObjects").get(SharedReference.class));
            } catch (Throwable unused2) {
            }
        }
    }

    public static Field LIZLLL(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }
}
