package Y;

import X.C221128m4;
import X.C55783Lut;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS16S1300000_9 implements View.OnClickListener {
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

    public static final void onClick$0(ACListenerS16S1300000_9 aCListenerS16S1300000_9, View view) {
        C221128m4 LJFF = ((C55783Lut) aCListenerS16S1300000_9.l1).LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ("click_avatar");
        }
        C55783Lut c55783Lut = (C55783Lut) aCListenerS16S1300000_9.l1;
        User user = (User) aCListenerS16S1300000_9.l2;
        Context context = ((SmartAvatarImageView) aCListenerS16S1300000_9.l3).getContext();
        o.LJIIIIZZ(context, "context");
        c55783Lut.LJIIIIZZ(context, user, aCListenerS16S1300000_9.s0);
    }

    public static final void onClick$1(ACListenerS16S1300000_9 aCListenerS16S1300000_9, View view) {
        C221128m4 LJFF = ((C55783Lut) aCListenerS16S1300000_9.l1).LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ("click_avatar");
        }
        C55783Lut c55783Lut = (C55783Lut) aCListenerS16S1300000_9.l1;
        User user = (User) aCListenerS16S1300000_9.l2;
        Context context = ((SmartAvatarImageView) aCListenerS16S1300000_9.l3).getContext();
        o.LJIIIIZZ(context, "context");
        c55783Lut.LJIIIIZZ(context, user, aCListenerS16S1300000_9.s0);
    }

    public ACListenerS16S1300000_9(C55783Lut c55783Lut, User user, SmartAvatarImageView smartAvatarImageView, String str, int i) {
        this.$t = i;
        this.l1 = c55783Lut;
        this.l2 = user;
        this.l3 = smartAvatarImageView;
        this.s0 = str;
    }
}
