package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class GND {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final Activity activity, final String str) {
        String string = activity.getString(R.string.q2_);
        o.LJIIIIZZ(string, "activity.getString(R.string.report)");
        String string2 = activity.getString(R.string.cg_);
        o.LJIIIIZZ(string2, "activity.getString(R.string.cancel)");
        final List LJJIJIIJI = C47261Igj.LJJIJIIJI(string, string2);
        GNF gnf = new GNF(activity);
        CharSequence[] items = (CharSequence[]) LJJIJIIJI.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.8Te
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str2;
                dialogInterface.dismiss();
                if (o.LJ(ListProtector.get(LJJIJIIJI, i), activity.getString(R.string.q2_))) {
                    Activity activity2 = activity;
                    String str3 = str;
                    Uri.Builder builder = new Uri.Builder();
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    Uri.Builder appendQueryParameter = builder.appendQueryParameter("object_id", str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("item_id", str3).appendQueryParameter("report_type", "library").appendQueryParameter("locale", IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
                    Bundle bundle = new Bundle();
                    bundle.putInt("half_screen_height", (int) (KL2.LJIIIZ(activity2) * 0.9f));
                    a.LJIILLIIL().LJFF(activity2, appendQueryParameter2, bundle);
                }
            }
        };
        o.LJIIIZ(items, "items");
        AnonymousClass025 anonymousClass025 = gnf.LIZ;
        GNO gno = new GNO(activity, items);
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LJIILLIIL = gno;
        c008901t.LJIIZILJ = onClickListener;
        gnf.LIZ.LJ();
    }
}
