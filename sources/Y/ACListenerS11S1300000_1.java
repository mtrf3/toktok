package Y;

import X.ActivityC45651qj;
import X.C101543yg;
import X.C101573yj;
import X.C101773z3;
import X.C3L4;
import X.C3TD;
import X.C3TG;
import X.C3U2;
import X.C76800UCe;
import X.EnumC101483ya;
import X.EnumC101583yk;
import X.EnumC101803z6;
import X.InterfaceC101673yt;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS11S1300000_1 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS11S1300000_1 aCListenerS11S1300000_1, View view) {
        Context context;
        boolean z;
        C3TG.LIZ.LIZ((C3L4) aCListenerS11S1300000_1.l1, "say_hi");
        C3U2 LIZ = C3TD.LIZ();
        String str = aCListenerS11S1300000_1.s0;
        IMUser iMUser = (IMUser) aCListenerS11S1300000_1.l2;
        TuxTextView tuxTextView = ((SessionListViewHolder) aCListenerS11S1300000_1.l3).LJZI;
        if (tuxTextView != null) {
            context = tuxTextView.getContext();
        } else {
            context = null;
        }
        if (((C3L4) aCListenerS11S1300000_1.l1).LJLLI != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.getClass();
        C3U2.LIZJ(str, iMUser, context, z);
    }

    public static final void onClick$1(ACListenerS11S1300000_1 aCListenerS11S1300000_1, View view) {
        C101543yg.LJFF = false;
        final InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS11S1300000_1.l3;
        InterfaceC101673yt interfaceC101673yt = new InterfaceC101673yt() { // from class: X.3yo
            @Override // X.InterfaceC101673yt
            public final void LIZ(AbstractC101843zA reason) {
                o.LJIIIZ(reason, "reason");
                interfaceC88472Yns.invoke(Boolean.valueOf(!(reason instanceof C97903so)));
            }
        };
        C101773z3 c101773z3 = new C101773z3((Context) aCListenerS11S1300000_1.l1);
        FragmentManager supportFragmentManager = ((ActivityC45651qj) aCListenerS11S1300000_1.l2).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        c101773z3.LIZ(supportFragmentManager, EnumC101803z6.SENDER, interfaceC101673yt, EnumC101483ya.FRIENDS);
        C101573yj.LJ(C101573yj.LIZ, aCListenerS11S1300000_1.s0, "greeting_button", EnumC101583yk.DM_SETTINGS_POPUP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS11S1300000_1(Object obj, Context context, ActivityC45651qj activityC45651qj, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l1 = obj;
        this.l2 = context;
        this.s0 = activityC45651qj;
        this.l3 = str;
    }
}
