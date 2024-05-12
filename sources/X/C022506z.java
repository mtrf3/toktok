package X;

import android.app.Notification;
import android.app.Person;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.06z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C022506z {
    public final CharSequence LIZ;
    public final long LIZIZ;
    public final C06V LIZJ;
    public final Bundle LIZLLL = new Bundle();

    public final Notification.MessagingStyle.Message LIZIZ() {
        Notification.MessagingStyle.Message message;
        C06V c06v = this.LIZJ;
        CharSequence charSequence = null;
        Person LIZIZ = null;
        if (Build.VERSION.SDK_INT >= 28) {
            CharSequence charSequence2 = this.LIZ;
            long j = this.LIZIZ;
            if (c06v != null) {
                LIZIZ = C06T.LIZIZ(c06v);
            }
            message = new Notification.MessagingStyle.Message(charSequence2, j, LIZIZ);
        } else {
            CharSequence charSequence3 = this.LIZ;
            long j2 = this.LIZIZ;
            if (c06v != null) {
                charSequence = c06v.LIZ;
            }
            message = new Notification.MessagingStyle.Message(charSequence3, j2, charSequence);
        }
        return message;
    }

    public static Bundle[] LIZ(List<C022506z> list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C022506z c022506z = (C022506z) ListProtector.get(list, i);
            c022506z.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = c022506z.LIZ;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c022506z.LIZIZ);
            C06V c06v = c022506z.LIZJ;
            if (c06v != null) {
                bundle.putCharSequence("sender", c06v.LIZ);
                if (Build.VERSION.SDK_INT >= 28) {
                    C06V c06v2 = c022506z.LIZJ;
                    c06v2.getClass();
                    bundle.putParcelable("sender_person", C06T.LIZIZ(c06v2));
                } else {
                    bundle.putBundle("person", c022506z.LIZJ.LIZ());
                }
            }
            Bundle bundle2 = c022506z.LIZLLL;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public C022506z(CharSequence charSequence, long j, C06V c06v) {
        this.LIZ = charSequence;
        this.LIZIZ = j;
        this.LIZJ = c06v;
    }
}
