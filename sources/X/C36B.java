package X;

import Y.IDcS364S0100000_1;
import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.36B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36B extends AbstractC65781Prl implements InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h> {
    public static final C36B LJLIL = new C36B();

    public C36B() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC785136h invoke(Activity activity, AbstractC90763hI abstractC90763hI, C3L4 c3l4) {
        final Activity activity2 = activity;
        final AbstractC90763hI cm = abstractC90763hI;
        final C3L4 session = c3l4;
        o.LJIIIZ(activity2, "activity");
        o.LJIIIZ(cm, "cm");
        o.LJIIIZ(session, "session");
        return new AbstractC785136h(activity2, cm, session) { // from class: X.36l
            public final boolean LJLJL;
            public final int LJLJLJ;
            public final int LJLJLLL;

            @Override // X.AbstractC785136h
            public final void LIZ() {
                String str;
                this.LJLILLLLZI.LJIIIIZZ(new IDcS364S0100000_1(this, 33), !this.LJLJL);
                C3TV c3tv = C3TV.LIZ;
                if (this.LJLJL) {
                    str = "unmute";
                } else {
                    str = "mute";
                }
                C3TV.LIZLLL(c3tv, str, this.LJLJI.LJIIIIZZ(), this.LJLJI.LJLLLLLL);
            }

            @Override // X.AbstractC785136h
            public final boolean LJ() {
                if (C55888Lwa.LIZIZ.LJJI(true)) {
                    C3L4 c3l42 = this.LJLJI;
                    if ((c3l42 instanceof C3L5) && ((C3L5) c3l42).LLIIII == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.AbstractC785136h
            public final int LIZIZ() {
                return this.LJLJLLL;
            }

            @Override // X.AbstractC785136h
            public final int LIZJ() {
                return this.LJLJLJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity2, cm, session);
                boolean z;
                int i;
                o.LJIIIZ(activity2, "activity");
                o.LJIIIZ(cm, "conversationModel");
                o.LJIIIZ(session, "session");
                C63120Opw LIZLLL = cm.LIZLLL();
                if (LIZLLL != null) {
                    z = LIZLLL.isMute();
                } else {
                    z = false;
                }
                this.LJLJL = z;
                if (z) {
                    i = R.string.eo6;
                } else {
                    i = R.string.eo4;
                }
                this.LJLJLJ = i;
                this.LJLJLLL = R.raw.icon_bell_slash;
            }
        };
    }
}
