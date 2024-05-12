package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.jvm.internal.o;

/* renamed from: X.4O6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4O6 {
    public static void LIZ(IMContact contact, java.util.Set set, boolean z) {
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(set, "set");
        if (z) {
            set.add(contact);
        } else {
            set.remove(contact);
        }
    }
}
