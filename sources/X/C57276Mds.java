package X;

import android.content.Context;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Mds, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57276Mds {
    public static void LIZ(Context context, UgChannelPopup popupInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(popupInfo, "popupInfo");
        if (DialogC57275Mdr.LJLJJL) {
            return;
        }
        DialogC57275Mdr.LJLJJL = true;
        try {
            DialogC57275Mdr.LJLJJI = new DialogC57275Mdr(context, popupInfo);
        } catch (Exception unused) {
        }
        DialogC57275Mdr dialogC57275Mdr = DialogC57275Mdr.LJLJJI;
        if (dialogC57275Mdr != null) {
            if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/money/growth/MoneyGrowthDialog", "show", dialogC57275Mdr, new Object[0], "void", new C65300Pk0(false, "()V", "6356418836981058109")).LIZ) {
                return;
            }
            dialogC57275Mdr.show();
            return;
        }
        o.LJIJI("dialog");
        throw null;
    }
}
