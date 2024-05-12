package X;

import android.content.Context;
import android.graphics.drawable.Icon;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.MzU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58616MzU implements InterfaceC58338Mv0 {
    @Override // X.InterfaceC58338Mv0
    public final java.util.Set<N2A> LIZ(Context context, boolean z) {
        N2A n2a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        N2A n2a2 = null;
        if (AV1.LJIIJJI() || !((RBX) HG3.LJIILL()).isLogin()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getNotificationShortcut null  isChildrenMode: ");
            LIZ.append(AV1.LJIIJJI());
            LIZ.append(", isLogin: ");
            LIZ.append(true ^ ((RBX) HG3.LJIILL()).isLogin());
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
            n2a = null;
        } else {
            String string = context.getString(R.string.iw4);
            o.LJIIIIZZ(string, "context.getString(R.string.notification)");
            Icon createWithResource = Icon.createWithResource(context, R.drawable.a9j);
            o.LJIIIIZZ(createWithResource, "createWithResource(conte…ic_shortcut_notification)");
            n2a = new N2A(N2B.NOTIFICATION, string, createWithResource, C47261Igj.LJJIJIL("//shortcut/message"), 1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getNotificationShortcut: ");
            LIZ2.append(n2a);
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
        }
        linkedHashSet.add(n2a);
        if (((RBX) HG3.LJIILL()).isLogin()) {
            String string2 = context.getString(R.string.dwp);
            o.LJIIIIZZ(string2, "context.getString(R.string.count_down_record)");
            Icon createWithResource2 = Icon.createWithResource(context, R.drawable.a9k);
            o.LJIIIIZZ(createWithResource2, "createWithResource(conte…ess_ic_shortcut_shooting)");
            n2a2 = new N2A(N2B.SHOOTING, string2, createWithResource2, C47261Igj.LJJIJIL("//shortcut/shooting"), 1);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getShootingShortcut: ");
            LIZ3.append(n2a2);
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ3));
        }
        linkedHashSet.add(n2a2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("InternalShortcutDatasource-> ");
        LIZ4.append(linkedHashSet);
        C58612MzQ.LIZ(X1D.LIZIZ(LIZ4));
        return linkedHashSet;
    }
}
