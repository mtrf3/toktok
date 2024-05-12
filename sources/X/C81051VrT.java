package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.VrT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81051VrT {
    public final Context LIZ;
    public java.util.Set<Item> LIZIZ;
    public int LIZJ;

    public final Bundle LIZJ() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.LIZIZ));
        bundle.putInt("state_collection_type", this.LIZJ);
        return bundle;
    }

    public final boolean LJ() {
        int i;
        int size = this.LIZIZ.size();
        int i2 = C81055VrX.LIZ.LJI;
        if (i2 <= 0 && ((i = this.LIZJ) == 1 || i == 2)) {
            i2 = 0;
        }
        if (size != i2) {
            return false;
        }
        return true;
    }

    public C81051VrT(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(Item item) {
        if (!LJII(item)) {
            if (this.LIZIZ.add(item)) {
                int i = this.LIZJ;
                if (i == 0) {
                    if (item.LIZIZ()) {
                        this.LIZJ = 1;
                        return;
                    } else {
                        if (!item.LIZLLL()) {
                            return;
                        }
                        this.LIZJ = 2;
                        return;
                    }
                }
                if (i == 1) {
                    if (!item.LIZLLL()) {
                        return;
                    }
                    this.LIZJ = 3;
                    return;
                } else {
                    if (i != 2 || !item.LIZIZ()) {
                        return;
                    }
                    this.LIZJ = 3;
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    public final int LIZIZ(Item item) {
        int indexOf = new ArrayList(this.LIZIZ).indexOf(item);
        if (indexOf == -1) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return indexOf + 1;
    }

    public final C81053VrV LIZLLL(Item item) {
        int i;
        String string;
        if (LJ()) {
            int i2 = C81055VrX.LIZ.LJI;
            if (i2 <= 0 && ((i = this.LIZJ) == 1 || i == 2)) {
                i2 = 0;
            }
            try {
                string = this.LIZ.getResources().getQuantityString(R.plurals.iw, i2, Integer.valueOf(i2));
            } catch (Resources.NotFoundException unused) {
                string = this.LIZ.getString(R.string.i11, Integer.valueOf(i2));
            } catch (NoClassDefFoundError unused2) {
                string = this.LIZ.getString(R.string.i11, Integer.valueOf(i2));
            }
            return new C81053VrV(string);
        }
        if (LJII(item)) {
            return new C81053VrV(this.LIZ.getString(R.string.i16));
        }
        Context context = this.LIZ;
        if (context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<EnumC81057VrZ> it = C81055VrX.LIZ.LIZ.iterator();
            while (it.hasNext()) {
                if (it.next().checkType(context, contentResolver, item.uri)) {
                    List<AbstractC81054VrW> list = C81055VrX.LIZ.LJII;
                    if (list != null) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            C81053VrV LIZ = ((AbstractC81054VrW) it2.next()).LIZ(context, item);
                            if (LIZ != null) {
                                return LIZ;
                            }
                        }
                    }
                    return null;
                }
            }
        }
        return new C81053VrV(context.getString(R.string.i0z));
    }

    public final void LJFF(Bundle bundle) {
        if (bundle == null) {
            this.LIZIZ = new LinkedHashSet();
        } else {
            this.LIZIZ = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
            this.LIZJ = bundle.getInt("state_collection_type", 0);
        }
    }

    public final void LJI(Item item) {
        if (this.LIZIZ.remove(item)) {
            boolean z = false;
            if (this.LIZIZ.size() == 0) {
                this.LIZJ = 0;
                return;
            }
            if (this.LIZJ != 3) {
                return;
            }
            boolean z2 = false;
            for (Item item2 : this.LIZIZ) {
                if (item2.LIZIZ() && !z) {
                    z = true;
                }
                if (item2.LIZLLL() && !z2) {
                    z2 = true;
                }
            }
            if (z) {
                if (z2) {
                    this.LIZJ = 3;
                    return;
                } else {
                    this.LIZJ = 1;
                    return;
                }
            }
            if (!z2) {
                return;
            }
            this.LIZJ = 2;
        }
    }

    public final boolean LJII(Item item) {
        int i;
        int i2;
        if (C81055VrX.LIZ.LIZIZ) {
            if (item.LIZIZ() && ((i2 = this.LIZJ) == 2 || i2 == 3)) {
                return true;
            }
            if (item.LIZLLL() && ((i = this.LIZJ) == 1 || i == 3)) {
                return true;
            }
        }
        return false;
    }
}
