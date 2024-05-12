package X;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.0MQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0MQ {
    public final C0MR LIZ;

    public final C0MR LIZ() {
        if (!TextUtils.isEmpty(this.LIZ.LJ)) {
            C0MR c0mr = this.LIZ;
            Intent[] intentArr = c0mr.LIZJ;
            if (intentArr != null && intentArr.length != 0) {
                return c0mr;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public C0MQ(Context context) {
        C0MR c0mr = new C0MR();
        this.LIZ = c0mr;
        c0mr.LIZ = context;
        c0mr.LIZIZ = "now_shortcut";
    }

    public C0MQ(Context context, ShortcutInfo shortcutInfo) {
        C06V[] c06vArr;
        String string;
        C0MR c0mr = new C0MR();
        this.LIZ = c0mr;
        c0mr.LIZ = context;
        c0mr.LIZIZ = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c0mr.LIZJ = (Intent[]) Arrays.copyOf(intents, intents.length);
        c0mr.LIZLLL = shortcutInfo.getActivity();
        c0mr.LJ = shortcutInfo.getShortLabel();
        c0mr.LJFF = shortcutInfo.getLongLabel();
        c0mr.LJI = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c0mr.LJIIIZ = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C0F2 c0f2 = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c06vArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c06vArr = new C06V[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("extraPerson_");
                int i3 = i2 + 1;
                LIZ.append(i3);
                c06vArr[i2] = C06S.LIZ(extras.getPersistableBundle(X1D.LIZIZ(LIZ)));
                i2 = i3;
            }
        }
        c0mr.LJIIIIZZ = c06vArr;
        C0MR c0mr2 = this.LIZ;
        shortcutInfo.getUserHandle();
        c0mr2.getClass();
        C0MR c0mr3 = this.LIZ;
        shortcutInfo.getLastChangedTimestamp();
        c0mr3.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C0MR c0mr4 = this.LIZ;
            shortcutInfo.isCached();
            c0mr4.getClass();
        }
        C0MR c0mr5 = this.LIZ;
        shortcutInfo.isDynamic();
        c0mr5.getClass();
        C0MR c0mr6 = this.LIZ;
        shortcutInfo.isPinned();
        c0mr6.getClass();
        C0MR c0mr7 = this.LIZ;
        shortcutInfo.isDeclaredInManifest();
        c0mr7.getClass();
        C0MR c0mr8 = this.LIZ;
        shortcutInfo.isImmutable();
        c0mr8.getClass();
        C0MR c0mr9 = this.LIZ;
        shortcutInfo.isEnabled();
        c0mr9.getClass();
        C0MR c0mr10 = this.LIZ;
        shortcutInfo.hasKeyFieldsOnly();
        c0mr10.getClass();
        C0MR c0mr11 = this.LIZ;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                TMC.LJIIIZ(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (!TextUtils.isEmpty(id)) {
                    c0f2 = new C0F2(id);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c0f2 = new C0F2(string);
            }
        }
        c0mr11.LJIIJ = c0f2;
        this.LIZ.LJIIJJI = shortcutInfo.getRank();
        this.LIZ.LJIIL = shortcutInfo.getExtras();
    }
}
