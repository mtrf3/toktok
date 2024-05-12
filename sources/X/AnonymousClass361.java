package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.361, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass361 extends AbstractC785136h {
    public static final /* synthetic */ int LJLLI = 0;
    public final boolean LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;

    @Override // X.AbstractC785136h
    public final void LIZ() {
        int i;
        int i2;
        String str;
        C63088OpQ coreInfo;
        Activity activity = this.LJLIL;
        if (this.LJLJL) {
            i = R.string.em4;
        } else {
            i = R.string.em2;
        }
        String string = activity.getString(i);
        o.LJIIIIZZ(string, "activity.getString(if (i…ring.dm_android_delete_1)");
        Activity activity2 = this.LJLIL;
        if (this.LJLJL) {
            i2 = R.string.em5;
        } else {
            i2 = R.string.em3;
        }
        String string2 = activity2.getString(i2);
        o.LJIIIIZZ(string2, "activity.getString(if (i…ring.dm_android_delete_2)");
        if (this.LJLJL) {
            Object[] objArr = new Object[1];
            C63120Opw c63120Opw = this.LJLJJI;
            if (c63120Opw == null || (coreInfo = c63120Opw.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
                str = "";
            }
            objArr[0] = str;
            o.LJIIIIZZ(C16880lQ.LLLZ(string, Arrays.copyOf(objArr, 1)), "format(format, *args)");
        }
        C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
        c26227ARb.LJFF(string);
        c26227ARb.LIZIZ(string2);
        UC0.LIZJ(c26227ARb, new AqS167S0100000_1(this, 555));
        c26227ARb.LJII = false;
        C26231ARf LJI = c26227ARb.LJI();
        this.LJLJJLL = LJI;
        LJI.LIZLLL();
        C3TV.LIZLLL(C3TV.LIZ, "delete", this.LJLJI.LJIIIIZZ(), this.LJLJI.LJLLLLLL);
    }

    @Override // X.AbstractC785136h
    public final int LIZIZ() {
        return this.LJLL;
    }

    @Override // X.AbstractC785136h
    public final int LIZJ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC785136h
    public final int LIZLLL() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass361(Activity activity, AbstractC90763hI conversationModel, C3L4 session) {
        super(activity, conversationModel, session);
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(session, "session");
        C63120Opw LIZLLL = conversationModel.LIZLLL();
        if (LIZLLL != null) {
            z = LIZLLL.isStranger();
        } else {
            z = false;
        }
        this.LJLJL = z;
        this.LJLJLJ = 1;
        this.LJLJLLL = R.string.h5a;
        this.LJLL = R.raw.icon_trash_bin;
    }
}
