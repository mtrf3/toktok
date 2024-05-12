package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0MR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MR {
    public Context LIZ;
    public String LIZIZ;
    public Intent[] LIZJ;
    public ComponentName LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public CharSequence LJI;
    public IconCompat LJII;
    public C06V[] LJIIIIZZ;
    public java.util.Set<String> LJIIIZ;
    public C0F2 LJIIJ;
    public int LJIIJJI;
    public PersistableBundle LJIIL;

    public static List<C0MR> LIZ(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0MQ(context, it.next()).LIZ());
        }
        return arrayList;
    }
}
