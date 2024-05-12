package X;

import Y.IDBReceiverS4S0100000;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;

/* renamed from: X.0MS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MS {
    public static boolean LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (C04330Ez.LIZ(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Context context, C0MR c0mr, IntentSender intentSender) {
        Bitmap bitmap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(c0mr.LIZ, c0mr.LIZIZ).setShortLabel(c0mr.LJ).setIntents(c0mr.LIZJ);
            IconCompat iconCompat = c0mr.LJII;
            if (iconCompat != null) {
                intents.setIcon(iconCompat.LJIIIIZZ(c0mr.LIZ));
            }
            if (!TextUtils.isEmpty(c0mr.LJFF)) {
                intents.setLongLabel(c0mr.LJFF);
            }
            if (!TextUtils.isEmpty(c0mr.LJI)) {
                intents.setDisabledMessage(c0mr.LJI);
            }
            ComponentName componentName = c0mr.LIZLLL;
            if (componentName != null) {
                intents.setActivity(componentName);
            }
            java.util.Set<String> set = c0mr.LJIIIZ;
            if (set != null) {
                intents.setCategories(set);
            }
            intents.setRank(c0mr.LJIIJJI);
            PersistableBundle persistableBundle = c0mr.LJIIL;
            if (persistableBundle != null) {
                intents.setExtras(persistableBundle);
            }
            if (i >= 29) {
                C06V[] c06vArr = c0mr.LJIIIIZZ;
                if (c06vArr != null && c06vArr.length > 0) {
                    int length = c06vArr.length;
                    Person[] personArr = new Person[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        C06V c06v = c0mr.LJIIIIZZ[i2];
                        c06v.getClass();
                        personArr[i2] = C06T.LIZIZ(c06v);
                    }
                    intents.setPersons(personArr);
                }
                C0F2 c0f2 = c0mr.LJIIJ;
                if (c0f2 != null) {
                    intents.setLocusId(c0f2.LIZIZ);
                }
                intents.setLongLived(false);
            } else {
                if (c0mr.LJIIL == null) {
                    c0mr.LJIIL = new PersistableBundle();
                }
                C06V[] c06vArr2 = c0mr.LJIIIIZZ;
                if (c06vArr2 != null && c06vArr2.length > 0) {
                    c0mr.LJIIL.putInt("extraPersonCount", c06vArr2.length);
                    int i3 = 0;
                    while (i3 < c0mr.LJIIIIZZ.length) {
                        PersistableBundle persistableBundle2 = c0mr.LJIIL;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("extraPerson_");
                        int i4 = i3 + 1;
                        LIZ.append(i4);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        C06V c06v2 = c0mr.LJIIIIZZ[i3];
                        c06v2.getClass();
                        persistableBundle2.putPersistableBundle(LIZIZ, C06S.LIZIZ(c06v2));
                        i3 = i4;
                    }
                }
                C0F2 c0f22 = c0mr.LJIIJ;
                if (c0f22 != null) {
                    c0mr.LJIIL.putString("extraLocusId", c0f22.LIZ);
                }
                c0mr.LJIIL.putBoolean("extraLongLived", false);
                intents.setExtras(c0mr.LJIIL);
            }
            shortcutManager.requestPinShortcut(intents.build(), intentSender);
            return;
        }
        if (!LIZ(context)) {
            return;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = c0mr.LIZJ;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c0mr.LJ.toString());
        IconCompat iconCompat2 = c0mr.LJII;
        if (iconCompat2 != null) {
            Context context2 = c0mr.LIZ;
            iconCompat2.LIZ(context2);
            int i5 = iconCompat2.LIZ;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 5) {
                        bitmap = IconCompat.LIZIZ((Bitmap) iconCompat2.LIZIZ, true);
                    } else {
                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                    }
                } else {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat2.LJ(), 0), iconCompat2.LJ));
                    } catch (PackageManager.NameNotFoundException e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Can't find package ");
                        LIZ2.append(iconCompat2.LIZIZ);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2), e);
                    }
                }
            } else {
                bitmap = (Bitmap) iconCompat2.LIZIZ;
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        if (intentSender == null) {
            context.sendBroadcast(intent);
        } else {
            context.sendOrderedBroadcast(intent, null, new IDBReceiverS4S0100000(intentSender, 1), null, -1, null, null);
        }
    }
}
