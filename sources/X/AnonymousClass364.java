package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.364, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass364 extends AbstractC65781Prl implements InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h> {
    public static final AnonymousClass364 LJLIL = new AnonymousClass364();

    public AnonymousClass364() {
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
        return new AbstractC785136h(activity2, cm, session) { // from class: X.363
            public final int LJLJL;
            public final int LJLJLJ;
            public final boolean LJLJLLL;
            public final C62822Ol8 LJLL;

            @Override // X.AbstractC785136h
            public final void LIZ() {
                String str;
                LiveData liveData;
                if (this.LJLJLLL) {
                    this.LJLILLLLZI.LJII();
                }
                if (((Boolean) this.LJLL.getValue()).booleanValue()) {
                    AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
                    C63120Opw c63120Opw = this.LJLJJI;
                    ViewModel viewModel = null;
                    if (c63120Opw != null) {
                        str = c63120Opw.getConversationId();
                    } else {
                        str = null;
                    }
                    anonymousClass325.getClass();
                    AnonymousClass325.LJII(str);
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ instanceof ActivityC45651qj) {
                        viewModel = ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(DmViewModel.class);
                    }
                    DmViewModel dmViewModel = (DmViewModel) viewModel;
                    if (dmViewModel != null && (liveData = (LiveData) dmViewModel.LJLIL.getValue()) != null) {
                        liveData.setValue(this.LJLJJL);
                    }
                }
                C3TV.LIZLLL(C3TV.LIZ, "read", this.LJLJI.LJIIIIZZ(), this.LJLJI.LJLLLLLL);
            }

            @Override // X.AbstractC785136h
            public final boolean LJ() {
                if (!this.LJLJLLL && !((Boolean) this.LJLL.getValue()).booleanValue()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC785136h
            public final int LIZIZ() {
                return this.LJLJLJ;
            }

            @Override // X.AbstractC785136h
            public final int LIZJ() {
                return this.LJLJL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity2, cm, session);
                boolean z;
                o.LJIIIZ(activity2, "activity");
                o.LJIIIZ(cm, "conversationModel");
                o.LJIIIZ(session, "session");
                this.LJLJL = R.string.eo5;
                this.LJLJLJ = R.raw.icon_tick_circle;
                C63120Opw c63120Opw = this.LJLJJI;
                if (c63120Opw != null && c63120Opw.getUnreadCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLJLLL = z;
                this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1072));
            }
        };
    }
}
