package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MgQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57434MgQ {
    public static final List<Integer> LIZ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC57435MgR.UNFOLLOW.getValue()), Integer.valueOf(EnumC57435MgR.UNFOLLOW_BUT_BE_FOLLOWED.getValue()));
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC57435MgR.FOLLOWED.getValue()), Integer.valueOf(EnumC57435MgR.FOLLOW_MUTUAL.getValue()), Integer.valueOf(EnumC57435MgR.FOLLOW_REQUESTED.getValue()));

    public static final EnumC57435MgR LIZ(int i) {
        switch (i) {
            case -1:
                return EnumC57435MgR.NONE;
            case 0:
                return EnumC57435MgR.UNFOLLOW;
            case 1:
                return EnumC57435MgR.FOLLOWED;
            case 2:
                return EnumC57435MgR.FOLLOW_MUTUAL;
            case 3:
                return EnumC57435MgR.SAME_USER;
            case 4:
                return EnumC57435MgR.FOLLOW_REQUESTED;
            case 5:
                return EnumC57435MgR.UNFOLLOW_BUT_BE_FOLLOWED;
            default:
                return EnumC57435MgR.NONE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LifecycleOwner LIZIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context instanceof Activity) {
            if (!(context instanceof LifecycleOwner)) {
                return null;
            }
            return (LifecycleOwner) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        ComponentCallbacks2 LJIILL = C78949Uyf.LJIILL(((ContextWrapper) context).getBaseContext());
        if (!(LJIILL instanceof LifecycleOwner)) {
            return null;
        }
        return (LifecycleOwner) LJIILL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ViewModelStoreOwner LIZJ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context instanceof Activity) {
            if (!(context instanceof ViewModelStoreOwner)) {
                return null;
            }
            return (ViewModelStoreOwner) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        ComponentCallbacks2 LJIILL = C78949Uyf.LJIILL(((ContextWrapper) context).getBaseContext());
        if (!(LJIILL instanceof ViewModelStoreOwner)) {
            return null;
        }
        return (ViewModelStoreOwner) LJIILL;
    }
}
