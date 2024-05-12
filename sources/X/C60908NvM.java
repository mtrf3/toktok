package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.NvM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60908NvM implements Serializable {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C60908NvM() {
        this(0, 1, null);
    }

    public final int getColor() {
        return this.LJLJI;
    }

    public final int getColorDark() {
        return this.LJLILLLLZI;
    }

    public final int getColorLight() {
        return this.LJLIL;
    }

    public C60908NvM(int i) {
        this.LJLJI = i;
        this.LJLIL = i;
        this.LJLILLLLZI = i;
    }

    public final void setColor(int i) {
        this.LJLJI = i;
    }

    public final void setColorDark(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setColorLight(int i) {
        this.LJLIL = i;
    }

    public final int getColor(Context context, String str) {
        int i;
        Integer valueOf;
        Resources resources;
        Configuration configuration = null;
        if (context != null && (resources = context.getResources()) != null) {
            configuration = resources.getConfiguration();
        }
        if (((!o.LJ(str, "light")) && configuration != null && (valueOf = Integer.valueOf(configuration.uiMode & 48)) != null && valueOf.intValue() == 32) || o.LJ(str, "dark")) {
            i = this.LJLILLLLZI;
        } else {
            i = this.LJLIL;
        }
        if (i == 0) {
            return this.LJLJI;
        }
        return i;
    }

    public /* synthetic */ C60908NvM(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ int getColor$default(C60908NvM c60908NvM, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c60908NvM.getColor(context, str);
    }
}
